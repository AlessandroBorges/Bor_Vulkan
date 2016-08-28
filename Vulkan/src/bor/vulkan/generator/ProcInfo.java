/**
 * 
 */
package bor.vulkan.generator;

import java.util.*;

import bor.vulkan.generator.Util.CLASS_TYPE;
import jdk.nashorn.internal.ir.CallNode.EvalArgs;

import static bor.vulkan.generator.JNITypeMap.getType;
import static bor.vulkan.generator.Util.*;

/**
 * Info about methods
 * @author Alessandro Borges
 *
 */
public class ProcInfo {
    
    public static Set<String> allTypes = new TreeSet<String>();
    
    int id = 0;
    /**
     * return type
     */
    String returnType;
    CLASS_TYPE returnTypeType;
    boolean isPointerReturnType;
    
    /** procedure name */    
    String procName;
    /** parameter types */ 
    String[] paramTypes;
    
    /**
     * Full parameter, including type casting and dereferencing.
     */
    private String[] fullParameter;
    
   
    /** parameter names */
    String[] pnames;
    
    /** check if a parameter is a pointer */
    boolean[] isPointer;
    
    /**
     * get type of parameter. 
     * @see #eval()
     */
    CLASS_TYPE[] type;
    
    /**
     * The source code
     */    
    String[] cppSource;
    
    /**
     * initialize isPointer[] and type[]
     */
    public void eval() {
        int len = paramTypes.length;
        isPointer = new boolean[len];
        type = new CLASS_TYPE[len];

        for (int i = 0; i < paramTypes.length; i++) {
            String pType = paramTypes[i];
            isPointer[i] = pType.contains("*");
            String jtype = StructInfo.getJavaType(pType, pnames[i], "");
            type[i] = getType(jtype);//getType(pType);
        }
        if(returnType.contains("PFN_")){
                returnType = returnType.replace("PFN_", "PFN");
        }
        if(returnType.equals("VkBool32")){
            returnType = "boolean";
            returnTypeType = CLASS_TYPE.BOOLEAN;
        }else{
            returnTypeType = getType(returnType);
        }
        isPointerReturnType = returnType.contains("*");
     }
    
    /**
     * For non pointer parameters, cast then for pointer type.
     * One cast per String.  
     * @return
     */
    private String[] getParamPointerCast(){       
        List<String> list = new ArrayList<String>();
      
        fullParameter = paramTypes.clone();
        
        for (int i=0; i<isPointer.length; i++){
            CLASS_TYPE ty = type[i];
            boolean isVkType = (ty == CLASS_TYPE.VKHANDLE || ty == CLASS_TYPE.VKSTRUCT || ty == CLASS_TYPE.VKOBJECT);
            if(!isPointer[i] && isVkType){
                String alternateName = "ptr_" + this.pnames[i];
               // pnamesAlt[i] = alternateName;
                fullParameter[i] = "(" + paramTypes[i]+") (*" + alternateName +")"; 
                String cast = paramTypes[i] + "* " + alternateName+ " = (" + paramTypes[i] + "*) " + this.pnames[i];
                list.add(cast);
            } else{
                fullParameter[i] = "(" + paramTypes[i]+") " + pnames[i]; 
            }
        }
        
        String[] res = new String[list.size()];
        return list.toArray(res);
    }
    
    /**
     * Converts Proc info in a Java src
     * @param unused - not used
     * @return String with java source code
     */
    public String toJavaSrc(String unused){
        if(id==157){
            System.out.println(157);
        }
         eval();
         String src = "";
         String tab = "\n\t\t";
         boolean isVoid = returnTypeType == CLASS_TYPE.VOID;
         
         
         
         String returnJava = StructInfo.getParamBridge(returnTypeType, "void");
         String jniType = StructInfo.toJNItype(returnJava, "");
         
        
         // add comment         
         src +=   "   /**\n"
                + "    *  Vulkan procedure ID: " + this.id +"\n"
                + "    * <h2>Prototype</h2><pre>\n";
                
         if(cppSource!= null){
             for (String line : cppSource) {
                 line = line.replace("VKAPI_ATTR", "").replace("VKAPI_CALL","");
                 src +="    * " + line+"\n"; 
            }             
         }
         src +="    * </pre>\n";
         src +="    * \n";
         // @param
         int len = pnames.length;
         for (int i = 0; i < len; i++) {
             String field = pnames[i];
             src +="    * @param "+ field +" - \n";
         }
         if(!isVoid){
             src +="    * \n";
             src +="    * @return "+ returnType  +"\n";
         }
         src += "    */\n";
         ////////////////////////////////////
         // public Java Method
         /////////////////////////////////////        
         src += "   public " + returnType + " " + this.procName+"(";
         for (int i = 0; i < len; i++) {
             String field = pnames[i];
             String cType = paramTypes[i];
             String jType = StructInfo.getJavaType(cType, field, procName);         
             src += tab + jType + " " + field + (i+1<len?",":")") ;
            allTypes.add(paramTypes[i]);
        }
         // Java code calling native method
         src +="{\n";
         String paramTab = "\n\t\t";
         String callNative = "";
         if(isVoid){
             callNative +=  "\t" + this.procName+"0(";            
         }else{
             callNative +=  "\t" + returnJava + " _val = " +this.procName+"0(";
             paramTab = "\n\t\t\t";
         }
         String prepare = "";
         String params = "";
         //parameters for native call
         for (int i = 0; i < len; i++) {
             CLASS_TYPE type = this.type[i]; 
             String field = pnames[i];
             String cType = paramTypes[i];
             String jType = StructInfo.getJavaType(cType, field, procName); 
             String method = StructInfo.getMethodTypeBridge(type, "");
             String bridge = "";
             boolean isPtr = cType.contains("*");
             boolean isConst = cType.contains("const");
             
             if(type==CLASS_TYPE.VKHANDLE || type==CLASS_TYPE.VKPFN)
             {                
                 if(isPtr){
                   prepare = "\tlong[] " + field+"Array = prepare("+ field +");";
                   bridge = field+"Array "; 
                 }else
                   bridge =  field+method +" /* VkHandle */ ";                        
             } else
             if(type == CLASS_TYPE.VKSTRUCT)
             {
                 if(cType.contains("VkAllocationCallbacks"))
                     bridge =  "("+field+"==null ? null : " +field+method +") /* VkStruct */ ";
                 else
                     bridge =  field+method +"" ;   
             } else if(type == CLASS_TYPE.VKENUM ){
                 bridge = field+method+" /* enum */"; 
             }else {
                 bridge = field+" ";
             }
            
             params += paramTab + bridge + (i+1<len ? "," : "") ;
         }// for
         src += prepare +"\n";
         src +=callNative;
         src += params;
         src += " );\n";
         
         if(!isVoid){
             String bridge = "";
             if(returnTypeType == CLASS_TYPE.VKSTRUCT 
                     || returnTypeType==CLASS_TYPE.VKHANDLE 
                     || returnTypeType==CLASS_TYPE.VKOBJECT 
                     || returnTypeType==CLASS_TYPE.VKPFN)
             {
                 bridge =  "new " + returnType +"(_val)";                        
             } else 
                 if(returnTypeType == CLASS_TYPE.VKENUM ){
                     bridge = returnType+".fromValue(_val)"; 
             }else {
                 bridge = "_val";
             }             
             src += "\t return " + bridge +";"; 
         }
         
         src +="\n   } \n\n";
         
         /////////////////////////////////////////////////////
         // native method
         //////////////////////////////////////////////////////
         src +=    "   /**\n"
                 + "    *  Native interface for Vulkan method #" + this.id +"\n"
                 + "    *  " + procName +" \n"
                 + "    * \n";        
         // @param        
         for (int i = 0; i < len; i++) {
             String field = pnames[i];
             src +="    * @param "+ field +" - \n";
         }
         if(!isVoid){
             src +="    * \n";
             src +="    * @return "+ returnType + " as " +returnJava  +" \n";
         }
         src += "    */\n";
         src += "    private static native " + returnJava + " " + this.procName+"0(";         
         for (int i = 0; i < len; i++) {
             String field = pnames[i];
             String cType = paramTypes[i];
             String jType = StructInfo.getJavaType(cType, field, procName); 
             CLASS_TYPE type = getType(jType);         
             String typeMod = StructInfo.getParamBridge(type, jType);         
             src += tab + typeMod + "  " + field + (i+1<len?",":");") ;
        }
         /////////////////
         // jnigen code
         /////////////////
         src +="/* \n";
         String[] list = getParamPointerCast();
         for (String casting : list) {
            src += "\t" + casting + ";\n";
        }
         
         if(!isVoid){
             src += "\t"+this.returnType + " res = "+ this.procName +"(";
         }else{
             src += "\t" + this.procName +"(";
         }
         for (int i = 0; i < len; i++) {
             src += tab + "\t"+ fullParameter[i]+ (i+1<len?",":"");
         }
         src += ");\n";
         
         if(!isVoid){
             src += "\t return ("+jniType+") res;";
         }
         
         src +="\n  */ \n";
         ////////////////////////////
         
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
        String params = "";
        for (int i = 0; i < pnames.length; i++) {
            String s = (i==0 ? "" : ",  " ) + paramTypes[i] + " " + pnames[i];
            //s = s.replace("const", "").replace("*","");
            params +=s;            
        }
        
        
        return //"ProcInfo [id="
                + id
                + ",  "
                + (returnType != null ? " " + returnType + "\t" : "")
                +  (procName != null ? " " + procName + "\t( " : "")
                + params
                + ");"
               // + 
                //(cppSource != null ? "\ncppSource="+ Arrays.asList(cppSource).subList(0, Math.min(cppSource.length, maxLen)) : "") + "]"
                ;
    }
    
   
    
   

}
