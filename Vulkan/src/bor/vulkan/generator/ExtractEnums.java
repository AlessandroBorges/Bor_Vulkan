/**
 * The MIT License (MIT)
 * Copyright (c) 2016 Alessandro Borges.
 * @see https://opensource.org/licenses/MIT
 */
package bor.vulkan.generator;

import static bor.vulkan.generator.Util.*;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Load vk.h and extract all enumerations
 * @author Alessandro Borges
 *
 */
public class ExtractEnums {
   static String vkh;
   public static String[] VKObject_ENUMS = {"VkDynamicState", "VkSampleMask","VkPipelineStageFlags"};
   public static String DISCLAIMER = " * ";
   
   /**
    * 
    * @param allLines
    * @return
    */
   public static String toString(List<String> allLines){      
       int size = 0;
       for(String s : allLines){
           size += s.length() + 2; // extra room for /n
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
     * @param args
     * @throws IOException 
     */
    public static void main(String[] args) throws IOException {
        List<String> vkh = readVKH();
        // String vk = toString(vkh);
        boolean printEnum = true;
             
        if(printEnum){
            processEnumerations(vkh);
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
                info.source = nextEnum;
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
        return toJavaSource(info.pkg, info.name, info.names, info.values, info.source);
    }
    
    /**
     * 
     * @param src
     * @return
     */
    public static String genDocLines(List<String> src){        
        String prefix = "\n * ";
        String out = "";
        for (String line : src) {
            out += prefix + line;
        }
        return out;
    }
    
    /**
     * Given a roll of names and values, generate source code 
     * for concrete class implementing  EnumInterface interface.
     * 
     * @param enumName - name of class
     * @param names - array of item names
     * @param values - array of item values. It can be numbers or other item values
     * @param src - c/c++ source code
     *  
     * @return source code for enumerations class
     */
    public static String toJavaSource(String pkg, String enumName, String[] names, String[] values, List<String> src){
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
        String prototype = src ==null? " * no prototype" : genDocLines(src);
        StringBuffer sb = new StringBuffer(1024*3);
        // header
        // The License
        sb.append("/**\n").append(LICENSE).append(" */\n");
        // the class header
        sb.append("package ").append(pkg).append(";\n\n");
        sb.append("import bor.enumerable.*;\n\n")
         .append("/**\n * Class to wrap Vulkan enumeration ").append(enumName)
         .append("\n *")
         .append("\n * <h3>Prototype</h3> <pre>")
         .append(prototype) // ends with \n
         .append("\n * </pre>") 
         .append("\n * @author Alessandro Borges")
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
        // The constructor
        sb.append("\n\n");
        sb.append("\t/** private ctor */\n");
        sb.append("\tprivate ").append(enumName).append("(String name, int ordinal, ")
          .append(type).append(" v) {\n")
          .append("\t\t super(name, ordinal, v);\n")
          .append("\t}\n\n")
          .append(" } // end of class ").append(enumName)
          .append("\n");
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
    
   
}

