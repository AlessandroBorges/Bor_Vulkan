/**
 * 
 */
package bor.vulkan.generator;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.charset.Charset;
import java.nio.file.*;
import java.util.*;

import com.sun.xml.internal.bind.v2.runtime.RuntimeUtil.ToStringAdapter;

/**
 * Load vk.h and extract all enumerations
 * @author Alessandro Borges
 *
 */
public class ExtractEnums {
   static String vkh;
   
   /**
    * Read vulkan header as a List of string lines.
    * @return 
    * @throws IOException
    */
   public static List<String> readVKH() throws IOException{
       Path path = FileSystems.getDefault().getPath("vk.h", "");
       List<String> lines = Files.readAllLines(path, Charset.defaultCharset());
       return lines;
   }
   
   /**
    * 
    * @param allLines
    * @return
    */
   public static String toString(List<String> allLines){      
       int size = 0;
       for(String s : allLines){
           size += s.length() + 1; // extra room for /n
       }
        size += 64; // just in case
       
       StringBuffer sb = new StringBuffer(size);
       
       for(String s : allLines){
           sb.append(s).append('\n');
       }       
       return sb.toString();
   }
   
   /**
    * Extract Next struct definition, from position pos.
    * also return position for next search  
    * @param src - string source
    * @param pos - start position
    * @param positions - in not null, return the position to next search.
    * 
    * @return string definition of enumeration
    */
   public static List<String> extractNextEnum(List<String> src, int pos, int[] positions){
       int start = findNextLine(src, "typedef enum", pos);
       if(start<0) 
           return null;
       
       int end = findNextLine(src, "}", start);       
       if(end<0) 
           throw new IllegalAccessError("Malformed enumeration");
       
       end += 1; // inclusive       
       if(positions != null){
           positions[0] = start;
           positions[1] = end;
       }       
       return src.subList(start, end);
   }
   
   
  
   
   /**
    * Finds next line with a give expressions
    * @param lines - lines to query
    * @param exp - expression to search
    * @param curLine - current line
    * @return line number where exp was found
    * 
    */
   public static int findNextLine(List<String> lines, String exp, int curLine){
       int pos = curLine;
       String line = lines.get(pos);
       while(pos < lines.size() && !line.contains(exp)) {           
           line = lines.get(pos);
           if(line.contains(exp))
               return pos;
           pos++;
       }
       //EOF or maybe last line with exp
       if(line.contains(exp))
           return pos;
       else
           return -1;
   }
   
   public static int findNextLineStartingWith(List<String> lines, String exp, int curLine){
       int pos = curLine;
       String line= null;
       while(pos < lines.size()) {           
           line = lines.get(pos);
           if(line.startsWith(exp)){
               return pos;
           }
           pos++;
       }
       //EOF
       return -1;
   }
   
    /**
     * @param args
     * @throws IOException 
     */
    public static void main(String[] args) throws IOException {
        List<String> vkh = readVKH();
        // String vk = toString(vkh);
        boolean printEnum = true;
        boolean processStructs = false;
       
        if(printEnum){
            processEnumerations(vkh);
        }
      
        if(processStructs){
         //   processStructs(vkh);
        }

    }
    
    public static void processEnumerations(List<String> vkh){        
            int[] positions = { 0, 0 };
            int count = 0;
            List<String> nextEnum = null;
            String pkg = "bor.vulkan.enumerations";
            while ((nextEnum = extractNextEnum(vkh, positions[1], positions)) != null) {
                System.out.println("// Enumeration #" + (++count));
                EnumInfo info =  parseToEnumInfo(nextEnum, count);
                info.pkg = pkg;
                String enumSource = generateEnumSource(info);
               // String foundEnum = toString(nextEnum);
                System.out.println("\n Saving..."+info.name);
                String basePath = "D:/Users/Livia/workspace/Vulkan/src/bor/vulkan/enumerations";
                save(basePath,info.name+".java", enumSource);
                System.out.println(enumSource);
                System.out.println("\n//************************");
            }// while
    }
    
    
    public static EnumInfo parseToEnumInfo(List<String> src, int id){
        
        List<String> enumNames = new ArrayList<String>();
        List<String> enumValues = new ArrayList<String>();
        
        EnumInfo ei = new EnumInfo();
        ei.id = id;
        for(String line : src){
            // process name
            if(line.contains("enum")){                
                String name = line.replace("typedef", "").replace(" enum ", "").replace("{","").trim();
                ei.name = name.trim();
            }
            // process enumerations 
            if(line.contains("=")){
                int pos = line.indexOf("=");
                String name = line.substring(0,pos).trim();
                String value = line.substring(pos+1);
                if(value.endsWith(",")) value = value.replace(",","").trim();
                if(value.endsWith(";")) value = value.replace(";","").trim();
                enumNames.add(name);
                enumValues.add(value);
            }
            
        }
        
        int size = enumNames.size();
        ei.names = enumNames.toArray(new String[size]);
        ei.values = enumValues.toArray(new String[size]);
        
        return ei;
    }
    
    /**
     * Same as {@link #generateEnumSource(String, String[], String[])} but with 
     * EnumInfo
     * @param info sorce for generating code
     * @return java source code.
     */
    public static String generateEnumSource(EnumInfo info){
        return generateEnumSource(info.pkg, info.name, info.names, info.values);
    }
    
    /**
     * Given a roll of names and values, generate source code 
     * for concrete class implementing  EnumInterface interface.
     * 
     * @param enumName - name of class
     * @param names - array of item names
     * @param values - array of item values. It can be numbers or other item values
     *  
     * @return source code for enumerations class
     */
    public static String generateEnumSource(String pkg, String enumName, String[] names, String[] values){
        // basic
        if(names==null || values==null || names.length != values.length){
            throw new IllegalArgumentException("names or values are null or with wrong size");
        }
            // check type: Int or Long ?
        boolean isLong = false;
        boolean isInt = false;
        for (String value : values) {
            // skip expressions
            if(contains(value, names)){
                continue;
            }
            boolean asInt = parseAsInt(value);
            boolean asLong = parseAsLong(value);
            if(asLong && !asInt){
                isLong = true;
            }
            if(asInt){
                isInt = true;
            }
        }// foreach
        
        String superclassName = isLong ? "LongEnum" : "IntEnum";
        String type = isLong ? "long" : "int";
        StringBuffer sb = new StringBuffer(1024*3);
        // header
        sb.append("package ").append(pkg).append(";\n\n");
        sb.append("import bor.enumerable.*;\n\n")
         .append("/**\n * Class to wrap Vulkan enumeration ").append(enumName)
         .append("\n * @author Alessandro Borges\n")
         .append("\n */\n")        
         .append("public class ").append(enumName)
          .append(" extends ").append(superclassName).append('<').append(enumName).append("> {\n");
        
        // enumTypes
        String itemPre = "\tpublic static final " + enumName + " ";        
        for(int i=0; i<names.length; i++){
            
            sb.append(itemPre);
            // intem and name
            sb.append(names[i]).append(" = new ").append(enumName).append("(");
            sb.append("\"").append(names[i]).append("\", ");
            
            // ordinal
            sb.append(i).append(", ");
            // value
            sb.append(fixExpressions(names[i], values[i], names)).append(");\n");            
        }
        
        sb.append("\n\n");
        sb.append("\t/** private ctor */\n");
        sb.append("\tprivate ").append(enumName).append("(String name, int ordinal, ")
          .append(type).append(" v) {\n")
          .append("\t\t super(name, ordinal, v);\n")
          .append("\t}\n\n")
          .append(" } // end of class ").append(enumName);
       return sb.toString();
    }
    
    /**
     * Fix expressions by replacing enumeration item by item.getValue()
     * @param exp - expression
     * @param names - list of enumeration itens
     * @return fixed expression
     */
    public static String fixExpressions(String name, String expression, String[] names){
        String exp = expression;
        String replaced = "";
        for (int i = 0; i < names.length; i++) {
            int pos = (names.length - 1) - i;
            String test = names[pos].trim();
            if(name.endsWith("_RANGE_SIZE")){
                String prefix = name.replace("_RANGE_SIZE", "");
                exp = "(" + prefix+"_END_RANGE.getValue() - " + prefix+"_BEGIN_RANGE.getValue() + 1)";
                return exp;
            }else 
                if(exp.contains(test) & !replaced.contains(test)){
                String save = exp.replace(test,test+".getValue() "); 
                // replaced is a memory to check if a big name 
                //was replaced and should not be replaced again by
                // a substring
                replaced = replaced + " " + test;
                exp = save;
            }                
        }
        return exp;
    }
    
    /**
     * Check is a value is parseable as int
     * @param value
     * @return
     */
    public static boolean parseAsInt(String value){
        try {        
            value = value.trim().replace(";", "").replace(",","");
            Integer v = Integer.decode(value);
            return true;
        } catch (Exception e) {
           return false;
        }       
    }
    
    /**
     * Check is a value is parseable as long
     * @param value string to test;
     * @return
     */
    public static boolean parseAsLong(String value){
        try {        
            value = value.trim().replace(";", "").replace(",","");
            Long v = Long.decode(value);
            return true;
        } catch (Exception e) {
           return false;
        }       
    }
    
    /**
     * Check if a given string base contains at least a substring from valuesToTest
     * 
     * @param base string which may or may not contain a substring
     * @param valuesToTest array of substrings to test
     * 
     * @return true if at least one valuesToTest is substring of base
     */
    public static boolean contains(String base, String[] valuesToTest){
        for (int i = 0; i < valuesToTest.length; i++) {
            String test = valuesToTest[i].trim();
            if(base.contains(test))
                return true;
        }
        
        return false;
    }

    
    
    public static void save(String folder, String name, String text){
        BufferedWriter output = null;
        try {
            File file = new File(folder + "//" +name);
            output = new BufferedWriter(new FileWriter(file));
            output.write(text);
        } catch ( IOException e ) {
            e.printStackTrace();
        } finally {
            if ( output != null ) {
                try {            
                output.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            }
        }
    }
}

