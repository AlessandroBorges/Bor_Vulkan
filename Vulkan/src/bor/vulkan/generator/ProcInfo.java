/**
 * 
 */
package bor.vulkan.generator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

import static bor.vulkan.generator.Util.*;

/**
 * Info about methods
 * @author Alessandro Borges
 *
 */
public class ProcInfo {
    
    int id = 0;
    /**
     * return type
     */
    String returnType;
    /** procedure name */    
    String procName;
    /** parameter types */ 
    String[] paramTypes;
    /** parameter names */
    String[] pnames;
    
    String[] cppSource;
    
    /**
     * Converts Proc info in a Java src
     * @param unused - not used
     * @return String with java source code
     */
    public String toJavaSrc(String unused){
         String src = "";
         String tab = "\n\t\t";
         // add comment
         src += "public " + this.returnType + " " + this.procName+"(";
         int len = pnames.length;
         for (int i = 0; i < len; i++) {
            src += tab + paramTypes[i] + "  " + pnames[i] + (i+1<len?",":");") ;
        }
         
         src +="\n\n";
        // native
         src += "private static " + this.returnType + " " + this.procName+"0(";         
         for (int i = 0; i < len; i++) {
            src += tab + paramTypes[i] + "  " + pnames[i] + (i+1<len?",":");") ;
        }
         
        return src;
    }

    /**
     * Parse the lines extracted from vulkan.h header to 
     * ProcInfo
     * @param source - lines extracted from Vulkan Header
     * @param structID - Id of this procedure
     * @return a ProcInfo instance
     */
    public static ProcInfo parse(List<String> source, int structID) {
        List<String> fieldNames = new ArrayList<String>();
        List<String> fieldTypes = new ArrayList<String>();
        int lineCount = source.size();
        String[] cppSource = new String[lineCount];
        // get struct name
        String name = null;
        String retType = null;
        // get source
        for (int i = 0; i < cppSource.length; i++) {
            cppSource[i] = source.get(i);
        }
        // get name
        for (String line : source) {
            line = line.trim();
            String headLine;
            if(line.startsWith("VKAPI_ATTR")){
                headLine = line.replace("VKAPI_ATTR","").replace("VKAPI_CALL", "").replace("(", "").trim();
                while(headLine.contains("  ")){
                    headLine = headLine.replaceAll("  ", " ");
                }
                
                String[] split = headLine.split(" ");
                retType = split[0];
                name = split[1];
                break;
            }
        }
        if(name==null)
            throw new IllegalArgumentException("Invalid parameters. It isn't a parsable struct");
        
        for (String line : source) {
            line = line.trim();
            // skip first line
            if(line.startsWith("VKAPI_ATTR") ){
                continue; // skip !
            }
            
            if(line.contains(",") || line.contains(")")){ // not blank line
               line =  line.replace(",", "").replace(")","").replace(";", "").trim();
               while(line.contains("  ")){
                   line = line.replaceAll("  ", " ");
               }
               StringTokenizer st = new StringTokenizer(line, "\b\t ");
               int count = st.countTokens();
               String type = "", 
                      fieldName = "";
               
               for(int i=1; st.hasMoreTokens(); i++){
                   if(i==count) {
                       fieldName = st.nextToken();
                   }else{
                       type += st.nextToken() + " ";
                   }                   
               }// for tokens
               
               //check array
               if(isArray(fieldName)){
                   String len = getArrayLength(fieldName);
                   int pos = fieldName.indexOf('[');                   
                   fieldName = fieldName.substring(0, pos);
                   //fieldName += " /* length="+len + " */"; 
                   type =type.trim() +"[]";
               }
               fieldNames.add(fieldName.trim());
               fieldTypes.add(type.trim());
            }
        }
        
        ProcInfo info = new ProcInfo();
        info.cppSource = cppSource;
        info.id = structID;
        info.procName = name;
        info.returnType = retType;
        int size = fieldNames.size();
        String[] names = new String[size];
        String[] types = new String[size];
        names = fieldNames.toArray(names);
        types = fieldTypes.toArray(types);
        info.pnames = names;
        info.paramTypes = types;
        
        return info;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        final int maxLen = 20;
        return "ProcInfo [id="
                + id
                + ", "
                + (returnType != null ? "returnType=" + returnType + ", " : "")
                + (procName != null ? "procName=" + procName + ", " : "")
                + (paramTypes != null ? "paramTypes="
                        + Arrays.asList(paramTypes).subList(0, Math.min(paramTypes.length, maxLen)) + ", " : "")
                + (pnames != null ? "pnames=" + Arrays.asList(pnames).subList(0, Math.min(pnames.length, maxLen))
                        + ", " : "")
                + (cppSource != null ? "cppSource="
                        + Arrays.asList(cppSource).subList(0, Math.min(cppSource.length, maxLen)) : "") + "]";
    }
    
   
    
   

}
