/**
 * 
 */
package bor.vulkan.generator;

import java.util.*;

import bor.vulkan.VkHandleDispatchable;
import bor.vulkan.generator.Util.CLASS_TYPE;


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
            boolean isVkType = (ty == CLASS_TYPE.VKSTRUCT || ty == CLASS_TYPE.VKOBJECT);
            boolean isHandle = (ty == CLASS_TYPE.VKHANDLE) || ty == CLASS_TYPE.VKHANDLE_ARRAY;
            boolean isPtr = isPointer[i];
            
            if(isHandle){
                if(isPtr){
                    fullParameter[i] = "(" + paramTypes[i]+") " + pnames[i]; 
                }else{
                    fullParameter[i] = "(" + paramTypes[i]+") reinterpret_cast<"+paramTypes[i]+">(" + pnames[i]+")";
                }
                
            }else if(!isPtr && isVkType){
                String alternateName = "ptr_" + this.pnames[i];
               // pnamesAlt[i] = alternateName;
                fullParameter[i] = "(" + paramTypes[i]+") (*" + alternateName +")"; 
                String cast = paramTypes[i] + "* " + alternateName+ " = (" + paramTypes[i] + "*) " + this.pnames[i];
                list.add(cast);
            } else{
                fullParameter[i] = "(" + paramTypes[i]+") " + pnames[i]; 
            }
        }//for
        
        String[] res = new String[list.size()];
        return list.toArray(res);
    }
    
    /**
     * Checj if a type is a VkHandleDispatchable
     * @param type
     * @return
     */
    private static boolean isHandleDispatchable(String type){
        String[] dnames = VkHandleDispatchable.DISPACHABLE_HANDLE_NAMES;
        for (int i = 0; i < dnames.length; i++) {
            String name = dnames[i];
            if(type.contains(name)) 
                return true;
        }
        return false;
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
         boolean hasCounter = false;
         // @param
         int len = pnames.length;
         for (int i = 0; i < len; i++) {
             String field = pnames[i];
             String cType = paramTypes[i];
             String jType = getJavaType(cType, field, procName, hasCounter);
             String info = jType;
             hasCounter = pnames[i].contains("Count");
             if(hasCounter){
                 if(pnames.length > (i+1)){
                     info = "- The length of array "+ pnames[i+1]+".";
                 }else{
                     info = "- Length of "+ field.replace("Count", "")+".";    
                 }                 
             }else if(info.contains("[]")){
                 info = "- An array of " + info.replace("[]", "") +".";
             } else{
                 CLASS_TYPE type =  getType(jType);
                 if(type == CLASS_TYPE.VKENUM){
                     info = "- Vulkan enumeration of type " + info;
                 }
                 if(type == CLASS_TYPE.VKSTRUCT || type == CLASS_TYPE.VKSTRUCT_ARRAY ){
                     info = "- Vulkan Struct of type " + info;
                 }
                 if(type == CLASS_TYPE.VKHANDLE || type == CLASS_TYPE.VKHANDLE_ARRAY ){
                     info = "- Vulkan handle of type " + info;
                 }
             }
             src +="    * @param "+ field +" "+ info +" \n";
         }
         if(!isVoid){
             src +="    * \n";
             src +="    * @return "+ returnType  +"\n";
         }
         src += "    */\n";
         ////////////////////////////////////
         // public Java Method
         /////////////////////////////////////        
         src += "   public static " + returnType + " " + this.procName+"(";
         hasCounter = false;
         for (int i = 0; i < len; i++) {
             String field = pnames[i];
             String cType = paramTypes[i];
             String jType = getJavaType(cType, field, procName, hasCounter);              
             src += tab + jType.trim() + " " + field + ((i+1<len)? "," : ")") ;             
             hasCounter = pnames[i].contains("Count");
             allTypes.add(paramTypes[i]);
        }
         // Java code calling native method
         src +=" {\n";
         String paramTab = "\n\t\t";
         String callNative = "";
         if(isVoid){
             callNative +=  "\t " + this.procName+"0(";            
         }else{
             callNative +=  "\t " + returnJava + " _val = " +this.procName+"0(";
             paramTab = "\n\t\t\t";
         }
         String prepare = "";
         String params = "";
         String postCall = "";
         hasCounter = false;
         //parameters for native call
         for (int i = 0; i < len; i++) {
             CLASS_TYPE type = this.type[i]; 
             String field = pnames[i];
             String cType = paramTypes[i];
             String jType =  getJavaType(cType, field, procName, hasCounter).trim(); 
             type = getType(jType);
             String method = StructInfo.getMethodTypeBridge(type, "");
             String bridge = "";
             boolean isPtr = cType.contains("*");
             boolean isConst = cType.contains("const");
             boolean isHandleDispatchable = isHandleDispatchable(cType);
             hasCounter = pnames[i].contains("Count");
             this.type[i] = type;
             if(type==CLASS_TYPE.VKHANDLE || type==CLASS_TYPE.VKPFN){
                 bridge =  field+method +" /* VkHandle */ "; 
             }else             
             if( type==CLASS_TYPE.VKHANDLE_ARRAY )
             {                
                 if(isPtr){
                   String bool = isHandleDispatchable ? "true" :"false" ;  
                   String jTypePlain = jType.replace("[]", "").replace("final", "").trim();
                   String preBridge = field+"Buffer"; 
                   prepare  += "\t // Wrap VkHandle array in a BigBuffer \n"+ 
                              "\t BigBuffer<" + jTypePlain +"> "+ preBridge + 
                              " =\n\t\t\t new BigBuffer<"+jTypePlain+">("+ field +", "+ bool+");\n";
                   postCall += "\t "+preBridge+ ".update();\n"; 
                   bridge = preBridge+".getPointer() /*BigBuffer of VkHandle*/";
                 }else
                   bridge =  field+method +" /* VkHandle */ ";                        
             } else
             if(type == CLASS_TYPE.VKSTRUCT)
             {
                 if(cType.contains("VkAllocationCallbacks"))
                     bridge =  "("+field+"==null ? null : " +field+method +") /* Optional Struct */ ";
                 else
                     bridge =  field+method +" /* Struct */" ;   
             }else if(type == CLASS_TYPE.VKSTRUCT_ARRAY)
             {
                 String preBridge = field+"Buff"; 
                 String jTypePlain = jType.replace("[]", "").replace("final", "").trim();
                 String id = jTypePlain+".getID()";
                 prepare  += "\t // Wrap VkStruct array in a BigBuffer \n"+
                            "\t BigBuffer<" + jTypePlain +"> "+ preBridge + 
                            " =\n\t\t\t new BigBuffer<"+jTypePlain+">("+ field +", "+ id +");\n";
              // postCall += "\n\t "+preBridge+ ".update();\n"; 
                 bridge = preBridge+".getPointer() /*Buffer for Struct[]*/";
                 
             }else if(type == CLASS_TYPE.VKENUM ){
                 bridge = field+method+" /* VkEnum */"; 
             }else if(type == CLASS_TYPE.VKENUM_ARRAY ){
                 String preBridge = field+"EnumArr";
                 String jTypePlain = jType.replace("[]", "").replace("final", "").trim();
                 prepare  += "\t // Wrap VkEnum array in a int[] \n"+
                            "\t int[] "+ preBridge + 
                            " =  prepare("+ field +");\n";
              postCall += "\n\t for(int i=0; i < "+field+".length; i++){"+
                         "\n\t    "+field+"[i] = "+jTypePlain+".fromValue("+preBridge+"[i]);"
                       + "\n\t  }\n"; 
                 bridge = preBridge+" /* VkEnum[] as int[] */"; 
             }else {
                 bridge = field+" ";
             }
            
             params += paramTab + bridge + (i+1<len ? "," : "") ;
         }// for
         src += prepare +"\n";
         src +=callNative;
         src += params;        
         src += " );\n";
         src += postCall;
         
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
         hasCounter = false;
         for (int i = 0; i < len; i++) {
             String field = pnames[i];
             String cType = paramTypes[i];
             String jType = getJavaType(cType, field, procName, hasCounter); 
             CLASS_TYPE type = this.type[i];//getType(jType);         
             String typeMod = getParamBridge(type, jType);   
             hasCounter = field.contains("Counter");
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
     * Get parameter type for bridging VkHandle, VkStruct, VjObject, 
     * and VkEnum
     * 
     * @param type
     * @param defaultParam - default type to use
     * @return text with paramenter type.
     */
    public static String getParamBridge(CLASS_TYPE type, String defaultParam){
        switch (type) {
            case VKHANDLE: return "long ";
            case VKHANDLE_ARRAY: return "ByteBuffer ";
            case VKPFN:   return "long ";
            case VKSTRUCT:             
            case VKOBJECT: return "ByteBuffer "; 
            case VKSTRUCT_ARRAY:             
            case VKOBJECT_ARRAY: return "ByteBuffer ";
            case VKENUM : return "int ";
            case VKENUM_ARRAY : return "int[] ";
            case BOOLEAN: return "boolean ";
            case BOOLEAN_ARRAY: return "boolean[] ";
            
            default: return defaultParam;
        }
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
    
    
    /**
     * <pre>
     * get a matching type for a Vulkan cType.<br>
     * Note:
     *  It converts all VkFlags sub types into Java's int
     * </pre> 
     * @param cType
     * @param field
     * @return
     */
    public static String getJavaType(String cType, String field, String source, boolean hasCounter){
        cType = cType.trim();                
        field = field.trim();
        
        if(cType.contains("PFN_")){
            cType = cType.replace("PFN_", "PFN");
        }
        
        boolean isVoid = cType.contains("void");
        
        // short circuit evaluation of void types
        if(isVoid){
            String value = StructInfo.getJavaType2Void(cType, field);
            if(value!=null){
                return value;
            }
        }
        
        boolean isFlag = cType.endsWith("Flags") || cType.endsWith("FlagsEXT") || cType.endsWith("FlagsKHR");
        boolean isPointer = cType.contains("*") ;
        
        boolean isConst = cType.startsWith("const");
        boolean isArray = cType.contains("[") || field.contains("[");
        boolean isMulti = field.endsWith("s");
        boolean isVk = cType.contains("Vk");
        
        String base = cType.trim()
                .replace("*","")
                .replace("const","")               
                .replace("","")
                .trim();
        
        boolean isStruct = JNITypeMap.isVkStruct(base);
        
        Map<String, String> map = StructInfo.getC2JavaTypes();
        String value = map.get(cType);
      
        if(value != null){
            if(isConst){
                value = value.replace("const", "");
            }     
            return value;
        }
        
        if(base.contains("[")){
            int bg = base.indexOf('[');
            base = base.substring(0,  bg);
        }
       
        if (cType.equals("const void*") && field.equals("pNext")) {
            value = "VkObject";
        }else if (isVk && isPointer && isStruct && isConst && !hasCounter){
            // Structs
            value = " final " + base;
        }else if (isVk && (isPointer && ((isMulti && hasCounter) || isArray))) {
            String prefix = isConst ? " final ": " "; 
            value = prefix + base + "[] ";
        }else if (isVk && isPointer) {
            boolean isHandleD = isHandleDispatchable(cType);
            boolean isCreate = source.contains("Create");
            
            String prefix = isConst ? " final ": " "; 
            String sufix = (isHandleD && isCreate)|| isCreate || hasCounter ? "[] " : " ";
            value = prefix + base + sufix;
            
        }  else {
            value = cType;
        }
        return value;
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
