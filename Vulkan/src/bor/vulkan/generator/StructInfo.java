package bor.vulkan.generator;

import static bor.vulkan.generator.JNITypeMap.getType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

import bor.vulkan.VkHandleDispatchable;
import bor.vulkan.generator.Util.CLASS_TYPE;
import bor.vulkan.structs.CStructInfo;



/**
 * Class to generate source codes for structs, 
 * including native binding in C/C++.
 * <h2>Note h2</h2>
 * Notes
 * <h3>Note h3</h3>
 * Notes
 * @author Alessandro Borges
 * @version 0.8.05
 */
public class StructInfo {  
   
    
    public int id;
    public String name;
    public String[] fields;
    public String[] types;
    public String[] fixedArraySize;
    public static String LICENSE = Util.LICENSE;
    public static final String[] DISPACHABLE_HANDLE_NAMES = { "VkInstance", "VkPhysicalDevice", 
            "VkDevice", "VkCommandBuffer", "VkQueue"} ;
    
    /**
     * cpp Source code
     */
    public String[] cppSource;
    
    private static String BIG_BUFFER_SUFIX = "BUFFER";
    private static String MARK = "#MARK#";
    private static String PROTO = "#PROTO#";
    private static String DISCLAIMER = "\n"
                                           + "/**\n"
                                           + " *  Project Bor-Vulkan \n"
                                           + " *  Class for Java-Vulkan integration \n"
                                           + " *  " + MARK +" \n" 
                                           + " *  <h3>Prototype:</h3>"
                                           + "#PROTO#"
                                           + " * \n"
                                           + " * @author Alessandro Borges \n"
                                           + " * @version " + Util.VERSION+ " \n"
                                           + " */\n";

    public StructInfo() {        
    }
    
    public String getID_NAME(){
        return name.toUpperCase() + "_ID = "+this.id;
    }
    
    /**
     * Create a cStructInfo from this 
     * @return 
     */
    public CStructInfo cStructInfo(){
        CStructInfo info = new CStructInfo();
        info.structID = this.id;
        info.structName = this.name;
        info.fieldName = this.fields;
        info.ctype = this.types;
        
        return info;
    }
    
    /**
     * CStruct info as XML
     * @return
     */
    public String CStructInfo2XML(){
        CStructInfo info = cStructInfo();
         return info.toXML();
    }
    
    /**
     * Generates codes for introspection in C structs
     *  uses offsetof(struct, member) and sizeof
     *  #define offsetof(TYPE, MEMBER) ((size_t) &((TYPE *)0)->MEMBER) 
     * @return
     */
    public String instrospectionC(){        
        String code = "";
        String struct = name;
        code += " public static final int MEMBERS_OF_"+struct+" = "+fields.length+";\n\n" ;
        
        code += " public CStructInfo introspect"+struct+"(){ \n"
              + "   CStructInfo cInfo = new CtructInfo(); \n"
              + "   cInfo.structID = " + this.id +"; \n"
              + "   cInfo.structName = " + this.name+"; \n";
                
        code += " private static native int introspect"+struct+"0(int[] offset, int[] size);/* \n";
        for (int i = 0; i < fields.length; i++) {
            String member = fields[i];
            code += "\t offset["+i+"] = offsetof("+struct+", "+member+"); \n";
            code += "\t size  ["+i+"] = sizeof  ("+struct+"::"+member+"); \n\n";
        }
        code +="\t return sizeof("+struct+")\n"
             + "  */ \n\n" ;
       return code; 
    }
    
    /**
     * Fences for C++ code
     */
    private String[] fence = new String[2]; 
    /**
     * define fence for CPP code
     * @param className
     * @param isGet
     * @return
     */
    private String[] cppFence(String className, boolean isGet) {
        fence[0] = "";
        fence[1] = "";      
        if (className.contains("Android")) fence[0] = "\t #ifdef VK_USE_PLATFORM_ANDROID_KHR \n";        
        if (className.contains("Xlib"))    fence[0] = "\t #ifdef VK_USE_PLATFORM_XLIB_KHR \n";        
        if (className.contains("Xcb"))     fence[0] = "\t #ifdef VK_USE_PLATFORM_XCB_KHR \n";
        if (className.contains("Wayland")) fence[0] = "\t #ifdef VK_USE_PLATFORM_WAYLAND_KHR \n";
        if (className.contains("Mir"))     fence[0] = "\t #ifdef VK_USE_PLATFORM_MIR_KHR \n";
        if (className.contains("Win32"))   fence[0] = "\t #ifdef VK_USE_PLATFORM_WIN32_KHR \n";        
        
        /// fence2
        if (fence[0].length() > 1){
            if (isGet) {
                fence[1] = "\t #else \n" + "\t   return 0; \n" + "\t #endif \n";
            } else {
                fence[1] = "\t #endif \n";
            }
        }// apply
        return fence;
    }
    
    /**
     * fix native name by replacing "_" by "J"
     * @param oldName
     * @return
     */
    private String fixNativeMethodName(String oldName){
        return oldName.replace("_", "J");
    }
    
    /**
     * Dump Cpp prototype
     * @param asComments
     * @return
     */
    public String prototype(boolean asComments){
        if(cppSource == null || cppSource.length==0) return "";
        String cmt = asComments ? "\n * " : "\n\t";
        
        String prototype = asComments ?  cmt + "<pre>" : cmt;
        for (int i = 0; i < cppSource.length; i++) {
            prototype += cmt + cppSource[i];
        }
        prototype += asComments ? cmt + "</pre>\n" : cmt;
         return prototype;
    }
    
    /**
     * Get method for bridge
     * @param type type of parameter
     * @return string with method name to get bridge type
     */
    public static String getMethodTypeBridge(CLASS_TYPE type, String defaultType){
        switch (type) {
            case VKHANDLE: return ".getNativeHandle()";
            case VKPFN:    return ".getNativeHandle()";
            case VKSTRUCT: return ".getPointer()";
            case VKOBJECT: return ".getPointer()";
            case VKENUM :  return ".getValue()";
            default: return defaultType;
        }
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
            case VKOBJECT: return "java.nio.ByteBuffer "; 
            case VKSTRUCT_ARRAY:             
            case VKOBJECT_ARRAY: return "java.nio.ByteBuffer ";
            case VKENUM : return "int ";
            case VKENUM_ARRAY : return "int[] ";
            case BOOLEAN: return "boolean ";
            case BOOLEAN_ARRAY: return "boolean[] ";
            
            default: return defaultParam;
        }
    }
    
    /**
     * Get method codes from include 
     * @param inc
     * @param methodName
     * @return
     */
    private String getMethod(Include inc, String methodName){
        if(inc == null){
            return null;
        }
        return inc.popMethod(methodName);
    }
    
    
    private String getRemainMethods(Include inc){
        if(inc == null){
            return null;
        }
        return inc.popAllMethods();
    }
    
    /**
     * Generate Java Source code
     *   
     * @param pkg - package to use
     * @param includeFolder - path to include folder
     * @return
     */
    public String toJavaSrc(String pkg, String includeFolder){ 
        Include include = Include.load(includeFolder, name);
        String proto = prototype(true);
        String extra = "This class is a Java front end for struct " + name +".";
        String disclaimer = DISCLAIMER.replace(MARK, extra);
        disclaimer = disclaimer.replace(PROTO, proto);
        
        String output = new String();
        int sz = this.fields.length;
        boolean[] isTypeArray  = new boolean[sz];
        boolean[] isFixedArray = new boolean[sz];
        boolean[] hasBigBuffer = new boolean[sz];
        //int[] fixedArraySize_ = new int[sz];
        
   //     boolean isKHR = name.contains("KHR");
        
        if(pkg==null)
            pkg="bor.vulkan.structs";
        
        output +="/**\n";
        output += " * Class wrapping Vulkan's " + this.name + " struct.\n";
        output += " * \n";
        output += LICENSE;
        output += " */\n"; 
        output += " package " + pkg + ";\n\n";
        
        output += " import bor.util.*;\n";
        output += " import bor.vulkan.*;\n";
        output += " import static bor.vulkan.Vulkan.*; \n";
        output += " import bor.vulkan.enumerations.*;\n\n";
      //  output += " import bor.vulkan.structs.*;\n";
        
//        if(isKHR){
//            output += " import bor.vulkan.khr.*;\n";
//        }
            
        output += " import java.util.*;\n";
        output += " import java.nio.*;\n\n";
                
        output += disclaimer;
        output += " public class " + this.name + " extends VkStruct {\n";
        
        output += "\n"
                + "    //@formatter:off\n"
                + "    /*JNI\n"
                + "    #include <BorVulkan.hpp>\n"
                + "    */  \n\n" ;
        
        output += "\t/** TAG of this structure [" + this.id + "]  */\n";
        output += "\t private static final String TAG = \"" + name + "\";\n\n";
        
        output += "\t/** ID of this structure [" + this.id + "]  */\n";
        output += "\t public static final int TAG_ID = " + name.toUpperCase() + "_ID;\n\n";
        //output += "\t public static final int " + name.toUpperCase() + "_ID = " + this.id + ";\n\n";        
        
//        output += "\t/** P wrapper for THIS object */\n";
//        output += "\t private  P<"+name+"> p;\n\n";
        
        //////////////////////////////////////////////
        ///   FIELDS
        /////////////////////////////////////////////
        output += "\t ///////////////////\n";
        output += "\t // Struct fields //\n";
        output += "\t ///////////////////\n";
        
        boolean commentOut = false;
        String tab="\t";
   for(int i=0; i<this.fields.length; i++){
            String field = fields[i];
            String cType = types[i];
            String arraySize = this.fixedArraySize[i];
            String jType = getJavaType(cType, field, name);           
            isTypeArray[i] = jType.contains("[]") && !cType.contains("char"); 
            
            if(arraySize.length()>0){
                isFixedArray[i] = true;
            }
            
            boolean regularArray = isFixedArray[i] && isTypeArray[i];
            
            CLASS_TYPE type = getType(jType);
            if(isTypeArray[i] && !type.name().contains("_array") ){
               // System.err.println("Error! " + name + " - " + type.name() + "  ");
            }
            String arrayCmt = isTypeArray[i] && !type.name().contains("_array") ? "_array" : "";
            arrayCmt += regularArray ? " ["+arraySize+"] " : "";
            String typeOut = type==CLASS_TYPE.OTHER ? "" : "[" + type.name().toLowerCase() + arrayCmt+ "]";
            // Comment 
           output += tab + "\n\t/**"
                         + "\n\t *  " + cType + " \t" + field + "\t"+ typeOut
                         + "\n\t */ \n";
           
           if(commentOut)
               output += "   // ";
           else
              output += tab;// + ""; // " protected "
           String initCode = regularArray ? " = new " + jType.replace("[]","")+"["+arraySize+"]":"";
           output += jType.replace(" final ", "") + " \t" + field + initCode + ";\n"; 
           
                   
           
           if(type == CLASS_TYPE.VKSTRUCT_ARRAY || type == CLASS_TYPE.VKHANDLE_ARRAY ){
               //System.err.println("\n VK Struct Class: " + name + " has VkStruct[] : " + jType + " \t" + field + ";");
               hasBigBuffer[i] = true;
               output += tab +" private BigBuffer \t "  + field + BIG_BUFFER_SUFIX +";\n";                
           }
           
           }
         //////////////////////////////////////////////
        //// Ctor
        /////////////////////////////////////////////
        output += "\t/**\n\t * Ctor\n\t */\n";
        output += "\tpublic " + name + "(){ \n\t\t super(TAG_ID);\n\t }\n\n";
        
        output += "\t/**\n\t * Ctor with ByteBuffer\n"
                + "\t * @param nativeBuffer - Direct bytebuffer for this struct \n"
                + "\t */\n";
        output += "\tpublic " + name + "(ByteBuffer nativeBuffer){ \n"
                + "\t\t super(nativeBuffer); \n\t }\n\n";
        
//        output += "\t/**\n\t * Ctor with Address and memSize\n"
//                + "\t * @param address - native address \n"
//                + "\t * @param memSize - buffer size \n"
//                + "\t */\n";
//        output += "\t public " + name + "(long address , int memSize){ \n"
//                + "\t\t super(address, memSize); \n"
//                + "\t }\n\n";
        
        output += "\t/**\n\t * Ctor with Address only. Size guessed by #sizeof()\n"
                + "\t * @param address - native address \n"                
                + "\t */\n";
        output += "\t public " + name + "(long address){ \n"
                + "\t\t super(address); \n"
                + "\t }\n\n";


        //////////////////////////////////////////////
        //// SizeOf
        /////////////////////////////////////////////
        output += "\t/** \n\t * Static Method to get native size of this structure \n\t */\n";
        output += "\t public static int sizeOf(){ \n\t\t return sizeOf(TAG_ID); \n\t}\n\n";
        
        output += "\t/** \n\t * Method to get native size of this structure \n\t */\n";
        output += "\t @Override\n"
                + "\t public int getSizeBytes(){ \n\t\t return sizeOf(); \n\t}\n\n"; 

        output += "\t/** \n\t * Get ID of this structure \n\t */\n";
        output += "\t public static int getID(){ \n\t\t return TAG_ID; \n\t}\n";
        
        ////////////////////////////////////////////////
        /// SET/GET java side
        ////////////////////////////////////////////////
        output += "\n\t ////////////////////////\n";
        output +=   "\t //  SETTERS & GETTERS //\n";
        output +=   "\t ////////////////////////\n\n";
                      
        String outputSG = "";
        
   for(int i=0; i<this.fields.length; i++){
            String field = fields[i];
            String cType = types[i];
            String jType = getJavaType(cType, field, name); 
            jType = jType.replace("final","").trim();
            CLASS_TYPE type = getType(jType);
            String typeOut = type==CLASS_TYPE.OTHER ? "" : "[" + type.name().toLowerCase() + "]";
            String method = getMethodTypeBridge(type, "");
            //boolean isFixedArr = isFixedArray[i];
            boolean regularArray = isFixedArray[i] && isTypeArray[i];
            
            
           ///////////////////////////////////////////////////////////////
           // SET  ///////////////////////////////////////////////////////
           /////////////////////////////////////////////////////////////// 
           String setName = field;//"set" + upperCaseField(field);
           if(field.contains("pQueueFamilyIndices")){
               System.err.println("aqui");
           }
           String setName0 = "set" + upperCaseField(field);
           String vkType = jType.replace("[]","");
           outputSG = "";
           
           // from include file
           String includeSetMethod = getMethod(include, setName0);
           setName0 = fixNativeMethodName(setName0);
           if(includeSetMethod != null){
               outputSG += "// #Included "+ setName0 +"\n" 
                            + includeSetMethod + "//#END Set Included\n\n";
            }else{               
                   // default bridge for VkStruct / VkHandle
                   String bridge = "";
                  // Comment 
                   outputSG += "\t/**\n\t * Set method for field " + field + "\t" + typeOut + "<br>" +
                                 "\n\t * Prototype: " + cType + "  " + field + 
                                 "\n\t * "+ 
                                 "\n\t * @param " + field + " - a instance of " + jType +"."+
                                 "\n\t * @return this VkStruct instance." +
                                 "\n\t */ \n";
                   
                   if(type == CLASS_TYPE.VKSTRUCT ||type==CLASS_TYPE.VKOBJECT ){
                       bridge =  "\t\t ByteBuffer buff = ("+field+"==null) ? null : " +field+method +";\n"
                               + "\t\t " + setName0 + "0(this.ptr, buff);\n";
                   } else if(type == CLASS_TYPE.VKHANDLE || type==CLASS_TYPE.VKPFN){
                       bridge =  "\t\t long handle = ("+field+"==null) ? 0L : " +field+method +";\n"
                               + "\t\t " + setName0 + "0(this.ptr, handle);\n";
                   } else if(type == CLASS_TYPE.VKENUM ){
                       bridge = "\t\t int enumVal = "+field+method+";\n" 
                              + "\t\t " + setName0 + "0(this.ptr, enumVal );\n";
                   }else if(type == CLASS_TYPE.VKENUM_ARRAY){
                       bridge = "\t\t int[] enumArray = readEnumArray("+field+method+");\n" 
                               + "\t\t " + setName0 + "0(this.ptr, enumArray);\n";
                   }else                     
                       if (type == CLASS_TYPE.VKSTRUCT_ARRAY){
                       String fieldBBuffer = field+BIG_BUFFER_SUFIX;
                       bridge =  "\t\t this."+ fieldBBuffer +" = new BigBuffer("+field +", "+ vkType +".getID());\n"                               
                               + "\t\t " + setName0 + "0(this.ptr, "+fieldBBuffer+ ".getBuffer());\n";
                   }else if (type == CLASS_TYPE.VKHANDLE_ARRAY){
                       String fieldBBuffer = field+BIG_BUFFER_SUFIX;
                       boolean isDispachable = isDispatchable(vkType);
                       bridge =  "\t\t this."+ fieldBBuffer +" = new BigBuffer("+field +", "+ isDispachable +");\n"                    
                               + "\t\t " + setName0 + "0(this.ptr, "+fieldBBuffer+ ".getBuffer());\n";
                   }
                   else  { // primitive types
                       if(regularArray){ 
                           bridge =  "\t\t if("+field + " == null)\n"
                                   + "\t\t     java.util.Arrays.fill(this."+field+" , ("+jType.replace("[]","")+") 0);\n" 
                                   + "\t\t  else\n"
                                   + "\t\t     System.arraycopy("+field+", 0, " +
                                                            "this."+ field+", 0, this."+field +".length); \n\n";
                           bridge += "\t\t " + setName0 + "0(this.ptr,  this."+ field+");\n";
                       }else{                  
                             
                           if(jType.contains("String") && this.fixedArraySize[i].length()>0 ){
                               bridge = "\t\t  this."+field + " = ("+field+" == null) ? null \n"
                                       +"\t\t                     : ("+field+".length() + 1) < " + fixedArraySize[i] +" ? "+ field + "\n"
                                       +"\t\t                         : "+field+".substring(0, "+fixedArraySize[i]+" - 1).trim();\n";                      
                           }
                           bridge += "\t\t " + setName0 + "0(this.ptr,  "+ field+");\n";    
                           
                       }
                   }
                   outputSG += "\t public " + name + " " + setName + "(" +jType + " " + field + "){\n"
                          +  (regularArray ? "" : "\t\t this." + field + " = " + field + ";\n")
                          +  bridge              
                          +  "\t\t return this;\n"
                          +  "\t }\n\n";
            }//else
           
           /////////////////////////////////////////////////////
           // GET /////////////////////////////////////////////
           ////////////////////////////////////////////////////
           String getName = field;// "get" + upperCaseField(field);
           String getName0 = "get" + upperCaseField(field);
           
        // from include file
           String includeGetMethod = getMethod(include, getName0); 
           
           getName0 = getName0 + "0";
           getName0 = fixNativeMethodName(getName0);
           
           if(includeGetMethod != null){
               outputSG += "// #Included " + getName0+"\n" 
                           + includeGetMethod + "//#END get\n\n";
           }else{
                   //comment
                   outputSG += "\t/**\n\t * Get method for field " + field + "\t" + typeOut +  "<br>" +
                              "\n\t * Prototype: " + cType + "  " + field + 
                              "\n\t */ \n";
                   // special get cases
                   String stmt = "";
                   if(type==CLASS_TYPE.VKENUM){
                       stmt += "\t\t int nativeVal = "+ getName0 + "(super.ptr);\n"
                             + "\t\t this."+field+" = " +jType+".fromValue(nativeVal); \n";       
                   }else if(type==CLASS_TYPE.VKENUM_ARRAY){
                       String countField = lookUpCount(i);
                       stmt +="\t\t int size = "+ countField +"();\n"
                            + "\t\t int[] values = (size==0) ? null : new int[size];\n"                       
                            + "\t\t values = "+ getName0 + "(super.ptr, values);\n"
                            + "\t\t "+ jType+" var = "+jType.replace("[]","")+".fromValues(this."+field+", values);\n"
                            + "\t\t this."+field+" = var;\n" ;
                     }else 
                       
                       
                       if(type==CLASS_TYPE.VKHANDLE){
                       stmt +="\n\t\t long handle = "+ getName0 + "(super.ptr);\n"
                            + "\t\t if(handle == 0){\n"
                            + "\t\t    this."+field+" = null;\n"
                            + "\t\t    return null;\n"
                            + "\t\t  }  \n\n"   
                            + "\t\t if(this."+field+" == null){\n"
                            + "\t\t    this."+field+" = new VkHandle(handle);\n"
                            + "\t\t }else{\n"
                            + "\t\t    ((VkHandle)this."+field+").setNativeHandle(handle);\n"
                            + "\t\t  }\n"
                           ;
                   }else if(type==CLASS_TYPE.VKPFN){
                       stmt +="\n\t\t  long handle = "+ getName0 + "(super.ptr);\n"
                               + "\t\t if(handle == 0){\n"
                               + "\t\t    this."+field+" = null;\n"
                               + "\t\t    return null;\n"
                               + "\t\t  }  \n\n"
                               + "\t\t if(this."+field+" == null){\n"
                               + "\t\t    this."+field+" = new "+jType+"(handle);\n"
                               + "\t\t }else{\n"
                               + "\t\t    this."+field+".setNativeHandle(handle);\n"
                               + "\t\t  }\n"
                              ;
                       
                   }else  if(type==CLASS_TYPE.VKSTRUCT ){
                           stmt +="\t\t long pointer = "+ getName0 + "(super.ptr);\n"
                                   + "\t\t if(pointer == 0){\n"
                                   + "\t\t    this."+field+" = null;\n"
                                   + "\t\t    return null;\n"
                                   + "\t\t  } \n\n"
                                   + "\t\t if(this."+field+" == null){\n"
                                   + "\t\t    this."+field+" = new "+ jType+"(pointer);\n"
                                   + "\t\t }else{\n"
                                  + "\t\t    this."+field+".setPointer(pointer);\n"
                                   + "\t\t  }\n"
                                  ;
                     }else if(type == CLASS_TYPE.VKOBJECT){
                         stmt +="\t\t long pointer = "+ getName0 + "(super.ptr);\n"
                                 + "\t\t if(pointer == 0){\n"
                                 + "\t\t    this."+field+" = null;\n"
                                 + "\t\t    return null;\n"
                                 + "\t\t  } else \n"
                                 + "\t\t if(this."+field+" == null){\n"
                                 + "\t\t    this."+field+" = (VkObject)(new VkHandle(pointer));\n"
                                 + "\t\t }else{\n"
                                + "\t\t    this."+field+".setPointer(pointer);\n"
                                 + "\t\t  }\n"
                                ;
                     }else if (type == CLASS_TYPE.VKSTRUCT_ARRAY){
                         String fieldBBuffer = field+BIG_BUFFER_SUFIX;                 
                         stmt =  "\t\t long ptr = " + getName0 + "(this.ptr);\n" +                         
                                 "\t\t if(ptr == 0L){\n"+
                                 "\t\t    return null;\n"+
                                 "\t\t }\n"+
                                 "\t\t if("+fieldBBuffer+" != null && ptr == "+ fieldBBuffer +".getBufferAddress()){ //same buffer \n"
                               + "\t\t    "+fieldBBuffer+".update();\n"+
                                 "\t\t    return "+ field +";\n"
                               + "\t\t  }else{\n"
                               + "\t\t     (new UnsupportedOperationException(\"There is no VKStruct[] for backup.\")).printStackTrace();\n"                       
                               + "\t\t   }\n"
                                ;
                         
                     }else if (type == CLASS_TYPE.VKHANDLE_ARRAY){
                         String fieldBBuffer = field+BIG_BUFFER_SUFIX;
                         boolean isDispachable = isDispatchable(vkType);
                         stmt =  "\t\t long ptr = " + getName0 + "(this.ptr);\n" +                         
                                 "\t\t if(ptr == 0L){\n"+
                                 "\t\t    return null;\n"+
                                 "\t\t }\n"+
                                 "\t\t if("+fieldBBuffer+" != null && ptr == "+ fieldBBuffer +".getBufferAddress()){ //same buffer \n"
                               + "\t\t    "+fieldBBuffer+".update();\n"+
                                 "\t\t    return "+ field +";\n"
                               + "\t\t  }else{\n"
                               + "\t\t     (new UnsupportedOperationException(\"There is no VKHandle[] for backup.\")).printStackTrace();\n"                       
                               + "\t\t   }\n"
                                ;
                     }else{ // primitive types & buffer
                           if(jType.contains("Buffer")){
                               stmt +="\t\t long address = "+ getName0 + "(super.ptr);\n"
                                       + "\t\t if(this."+field+" == null && address != 0L){\n"
                                       + "\t\t\t  ByteBuffer bb = wrapPointer(address, 8);\n"
                                       + "\t\t\t  this."+field + " = bb;\n"
                                       + "\t\t }\n"                                                    
                                       ;
                           }else if(jType.contains("[]")){ // array of primitive                       
                               stmt +="\t\t "+ jType+" var = "+ getName0 + "(super.ptr, "+ field +");\n"
                                    + "\t\t this."+field+" = var;\n" ;
                            }else{
                           stmt +="\t\t "+ jType+" var = "+ getName0 + "(super.ptr);\n"                        
                                + "\t\t this."+field+" = var;\n"                        
                                ;
                           }
                       }                   
                       outputSG += "\t public " + jType + " " + getName + "(){\n" 
                               // + "\t\t this."+field + " = " + getName + "(super.ptr);\n"
                               + stmt
                               + "\t\t return this."+ field +";\n"
                               + "\t }\n\n";
           }//else include        
        output += outputSG;
    }// for set/get Java Side
    /////////////////////////////////////////////////
    // toString()
    ////////////////////////////////////////////////
        output += "\n"
                + "   /* (non-Javadoc)\n"
                + "    * @see java.lang.Object#toString()\n"
                + "    */\n"
                + "    @Override\n"
                + "    public String toString() {\n"
                + "         StringBuilder builder = new StringBuilder();\n"
                + "         builder.append(\""+ name+" [ \")\n";
        output +="\t\t\t\t.append(\"" + fields[0] +": \").append("+fields[0]+"() )\n" ;
        
        for(int i=1; i<this.fields.length; i++){
             String field = fields[i]; 
             if(isTypeArray[i] || types[i].contains("const char* const*") ){
                 output +="\t\t\t\t.append(\",\\n " + field +": \")\n"
                        + "\t\t\t\t.append(Arrays.toString("+field+"()) )\n" ;
             }else{
                 output +="\t\t\t\t.append(\",\\n " + field +": \")\n"
                        + "\t\t\t\t.append("+field+"() )\n" ; 
             }
        }
        
        output +="\t\t\t\t.append(\"]\");\n";
        output +="\t\t return builder.toString();\n";
        output += "    }\n\n";
        
        ////////////////////////////////////////////////
        /// SET/GET native side
        ////////////////////////////////////////////////
        output += "\n\t //////////////////////////////////\n";
        output +=   "\t // Native SETTERS & GETTERS    //\n";
        output +=   "\t /////////////////////////////////\n";
        String outputNat = "";
        
        for(int i=0; i<this.fields.length; i++){
            String field = fields[i];
            String cType = types[i];
            boolean isArray = false;
            boolean isCpointer = false;
            if(cType.contains("*")){
                isCpointer = true;
            }
            if(cType.endsWith("*") && field.endsWith("s")){
                isArray = true;
            }
            String jType = getJavaType(cType, field, name);
            String jniType = toJNItype(jType, field);
           
            CLASS_TYPE type = getType(jType);
            String typeOut = type==CLASS_TYPE.OTHER ? "" : "[" + type.name().toLowerCase() + "]";
            String typeMod = getParamBridge(type, jType);
            String size = fixedArraySize[i];
            boolean regularArray = isFixedArray[i] && isTypeArray[i];

           // native SET
            String setName = "set" + upperCaseField(field);  
            String setName0 = setName+"0";
            String includeSet0Method = getMethod(include, setName0);
            
            
            setName0 = fixNativeMethodName(setName0);
            if(includeSet0Method != null){
                outputNat += includeSet0Method;
            }else{            
                // Comment 
                outputNat += "\t/**\n\t * Native SET method for field " + field +  "\t" + typeOut +  "<br>" +
                              "\n\t * Prototype: " + cType + "  " + field + 
                              "\n\t */ \n";   
               String stmt = "";
               
               if(typeMod.contains("Buffer")){
                   if(isCpointer){
                       stmt +=   "\t\t // code for Buffer - ptr to ptr \n";
                       stmt += "\t\t "+cType+" p_"+field +" = ("+cType.replace("const", "")+") _"+field+"; \n" 
                             + "\t\t vkObj->" + field + " = p_"+field+"; \n";
                   }else{
                       stmt +=   "\t\t // code for Buffer - ptr to struct \n";
                       stmt += "\t\t "+cType+"* p_"+field +" = ("+cType.replace("const", "")+"*) _"+field+"; \n" 
                             + "\t\t vkObj->" + field + " = (*p_"+field+"); \n";
                   }                          
               }else 
                 if(jType.contains("String")){
                       if(isFixedArray[i]){ // just copy
                           stmt +="\t\t  strncpy(vkObj->"+field+", _" + field +", strlen(_"+field+")+1);\n";               
                       }else{// must allocate string
                           stmt +="\t\t  vkObj->"+field+" = cloneStr(_"+field+");\n";
                       }
                }else
                  if(isFixedArray[i]){// fixed size array                  
                   stmt +=   "\t\t // code for fixed size array \n"
                           + "\t\t  memcpy(vkObj->" + field + ", _" + field + 
                             ", " + size +" * sizeof("+cType.replace("[]", "")+"));\n";                      
                 }else 
                 if(isTypeArray[i]){ // generic C style array
                   String countField = lookUpCount(i);
                   String cTypePure = cType.replace("[]", "").replace("const ", " ").replaceFirst("\\*", "").trim();
                   String cTypeNoConst = cType.replace("const","").trim();
                   stmt += "\t\t // code for generic array assignment \n"
                         + "\t\t "+ cTypeNoConst +" temp = const_cast<"+cTypeNoConst+">(vkObj->" + field+");\n"
                         + "\t\t if(temp) { free(temp); } \n"
                         + "\t\t vkObj->"+field+" = NULL; \n"                         
                         + "\t\t if( _" + field+" == NULL){ \n"
                         + "\t\t    vkObj->"+countField+" = 0; \n"
                         + "\t\t     return;\n"
                         + "\t\t  }\n"
                         + "\t\t  uint32_t count = (uint32_t)env->GetArrayLength( obj__"+field+"); \n"                         
                         + "\t\t  temp = CALLOC(count, "+cTypePure+"); \n"
                         + "\t\t  memcpy( temp, _" + field +", count * sizeof("+cTypePure+")); \n"
                         + "\t\t  vkObj->" + field + " = temp; \n"
                         + "\t\t  vkObj->"+countField+" = count;\n";
               }else{// simple past value
                   stmt = "\t\t // code for simple past value \n"
                           + "\t\t  vkObj->" + field + " = ("+ cType +") (_" + field + ");\n";
               }
                 
               cppFence(name,false);
               outputNat += "\t private static native void " + setName0 
                       + "(Buffer ptr, "+typeMod + " _" + field + ");/*\n"
                       + fence[0]
                       + "\t\t  " + this.name + "* vkObj = ("+ this.name+"*)(ptr);\n"
                       + stmt
                       + fence[1]
                       + "\t  */\n\n";               
           
            }
           ////////////////////////////////////
           // native GET
           ///////////////////////////////////
           String getName = "get" + upperCaseField(field);
           
           String getName0 = getName + "0";
           String includeGet0Method = getMethod(include, getName0);
           getName0 = fixNativeMethodName(getName0);
           
           if(includeGet0Method != null){
               outputNat += includeGet0Method;
           }else{
           //comment
           outputNat += "\t/**\n\t * Native GET method for field " + field +  "\t" + typeOut +  "<br>" +
                        "\n\t * Prototype: " + cType + "  " + field + 
                        "\n\t */ \n";
           String xtraParams = "";
           String cTypePure = cType.replace("[]", "").replace("const ", " ").replaceFirst("\\*", "").trim();
           String nativeRes = "\t\t  return (" + jniType + ") (vkObj->"+ field + ");\n";
           
           if(type == CLASS_TYPE.VKENUM){
               typeMod = "int";
               nativeRes = "\t\t  // generic get for Vk enums\n" +
                           "\t\t  return (jint) (vkObj->"+field +");\n";
           }else
//           if(type == CLASS_TYPE.VKENUM_ARRAY){
//                   typeMod = "int";
//                   nativeRes = "\t\t  // generic get for Vk enums\n" +
//                               "\t\t  return (jint) (vkObj->"+field +");\n";
//           }
//           else
           if(type == CLASS_TYPE.VKHANDLE || type == CLASS_TYPE.VKPFN){
               typeMod = "long";
               nativeRes = "\t\t  // generic get for struct field of type  VkHandle or VkStruct \n" +
                           "\t\t  return (jlong) reinterpret_cast<jlong>(&vkObj->"+field +");\n";
           }else ///////////////////////////
               if (type == CLASS_TYPE.VKHANDLE_ARRAY || type == CLASS_TYPE.VKSTRUCT_ARRAY){
                   typeMod = "long";
                   nativeRes = "\t\t  // generic get for array of VkHandle and VkStruct \n" +
                               "\t\t  return (jlong) reinterpret_cast<jlong>( &vkObj->"+field +" );\n";                   
           }else ////////////
             if(isTypeArray[i] & !isFixedArray[i]){
               xtraParams += ", " + typeMod + " _" + field;
               String countField =  lookUpCount(i);//this.fields[i-1];               
               nativeRes = "\t\t  // generic get for C type array, with content copy \n" +
                            "\t\t  if( 0 == vkObj->" + countField+"){ \n"
                          + "\t\t     return NULL;\n"
                          + "\t\t   }\n"
                          + "\t\t  uint32_t count = (uint32_t)env->GetArrayLength( obj__"+field+");\n"
                          + "\t\t  if(vkObj->" + field+" == NULL){\n"
                          + "\t\t    return NULL;\n"
                          + "\t\t   }\n "
                          + "\t\t  memcpy(_" + field + ", vkObj->" + field +", count * sizeof("+cTypePure+"));\n"+
                            "\t\t  return obj__"+field+";\n";               
           }else /////////////////////
               if (isFixedArray[i]){
               xtraParams += ", " + typeMod + " _" + field;
               nativeRes =  "\t\t  // fixed length array  \n" +
                            "\t\t  memcpy(&_" + field + ", &(vkObj->" + field +"), "+ size +" * sizeof("+cTypePure+"));\n"+
                            "\t\t  return obj__"+field+";\n";
           } else if(typeMod.contains("Buffer")){
               typeMod = "long";
               nativeRes = "\t\t  // generic get for Buffer \n"
                         + "\t\t  return (jlong) reinterpret_cast<jlong>(&vkObj->"+field +");\n";
           }
         
           if(jType.equalsIgnoreCase("string")){
               // Strings must be converted
               xtraParams = ""; // no need of extra params on String getBlahBlah()
               nativeRes = "\t\t  return (jstring)(env->NewStringUTF(vkObj->"+field +"));\n";
           } 
           
           // assemble the Native GET
           cppFence(name,true);
           outputNat += "\t private static native " + typeMod + " " + getName0 + "(Buffer ptr" + xtraParams +");/*\n"
                   + fence[0]
                   + "\t\t  " + this.name + "* vkObj = ("+ this.name+"*)(ptr);\n"                   
                   + nativeRes
                   + fence[1]
                   +"\t */\n\n";
              
           }//  else include
        }// loop
        output += outputNat;
        
        String xtra = getRemainMethods(include);
        if(xtra != null){
            output += "\n" + xtra + "\n";
        }
        
        output += "\n\n} // end of class " + name + "\n";
        
        return output;        
    } 
    
    /**
     * Look up for array counter field.
     * @param index - current position of array
     * @return string with possible name of counter. Null if to available.
     */
    private String lookUpCount(int index) {
        if(this.name.contains("VkPipelineMultisampleStateCreateInfo") 
           && fields[index].contains("pSampleMask")){
            return "rasterizationSamples";
        }
        
        String cur = null;
        try {
            do{
                cur = fields[index];
                index--;
            }while(!cur.contains("Count") && !cur.contains("codeSize"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cur;
    }
    
    /**
     * return a String with first letter in uppercase
     * @param field
     * @return
     */
    public static String upperCaseField(String field){
        field = field.trim();
        String firstChar = field.substring(0, 1);        
        return field.replaceFirst(firstChar, firstChar.toUpperCase());
    }
    
    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("StructInfo [id=");
        builder.append(id);
        builder.append(", ");
        if (name != null) {
            builder.append("\nname=");
            builder.append(name);
            builder.append(", ");
        }
        if (fields != null) {
            builder.append("\nfields=");
            builder.append(Arrays.toString(fields));
            builder.append(", ");
        }
        if (types != null) {
            builder.append("\ntypes=");
            builder.append(Arrays.toString(types));
        }
        builder.append("\n]");
        return builder.toString();
    }



    /**
     * 
     * @param source
     * @return
     */
    public static StructInfo parse(List<String> source, int structID){
        List<String> fieldNames = new ArrayList<String>();
        List<String> fieldTypes = new ArrayList<String>();
        List<String> arraySize = new ArrayList<String>();
        
        int lineCount = source.size();
        String[] cppSource = new String[lineCount];
        // get struct name
        String name = null;
        
        // get source
        for (int i = 0; i < cppSource.length; i++) {
            cppSource[i] = source.get(i);
        }
        
        
        for (String line : source) {
            if(line.contains(" struct ") || line.contains(" union ")){
                name = line.replace("struct","")
                       .replace("union", "")
                       .replace("typedef", "")
                       .replace("{", "")
                       .trim();
                break;
            }
        }
        if(name==null)
            throw new IllegalArgumentException("Invalid parameters. It isn't a parsable struct");
        
        for (String line : source) {
            line = line.trim();
            // skip first and last lines
            if(line.startsWith("typedef") || line.startsWith("}")){
                continue; // skip !
            }
            
            if(line.contains(";")){ // not blank line
               line =  line.replace(";", "").trim();
               StringTokenizer st = new StringTokenizer(line, "\b\t ");
               int count = st.countTokens();
               String type = "", fieldName = "";
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
                    try {
                       int size = Integer.parseInt(len.trim());
                    } catch (Exception e) {
                        System.err.println("Struct "+ name +" - Array size is constant: " + len);                        
                    }
                    arraySize.add(len);
                   int pos = fieldName.indexOf('[');                   
                   fieldName = fieldName.substring(0, pos);
                   //fieldName += " /* length="+len + " */"; 
                   type =type.trim() +"[]";
               }else{
                   arraySize.add("");
               }
               fieldNames.add(fieldName.trim());
               fieldTypes.add(type.trim());
            }
        }
        
        StructInfo info = new StructInfo();
        info.cppSource = cppSource;
        info.id = structID;
        info.name = name;
        int size = fieldNames.size();
        String[] names = new String[size];
        String[] types = new String[size];
        String[] varArraySize = new String[size];
        
        names = fieldNames.toArray(names);
        types = fieldTypes.toArray(types);
        
        for (int i = 0; i < varArraySize.length; i++) {
            varArraySize[i] = arraySize.get(i);
        }
        
        info.fields = names;
        info.types = types;
        info.fixedArraySize = varArraySize;
        return info;
    }
    
    /**
     * Check if field is an array
     * @param field
     * @return
     */
    public static boolean isArray(String field){
        return field.contains("]");         
    }
    
    /**
     * 
     * @param field
     * @return
     */
    public static String getArrayLength(String field){
        int pos = field.indexOf('[');
        int end = field.indexOf(']');
        String len = field.substring(pos+1, end);
        return len;
        //int val = Integer.parseInt(len);
        //return val;
    }
    
    /**
     * Get JNI type from a java Type.
     * All 8 primitives plus String
     * 
     * @param jType - java type as key
     * @param fieldName - name of the field, to help debug
     * 
     * @return JNI type compatible with Java Type
     */
    public static String toJNItype(String jType, String fieldName){        
        switch (jType.trim()) {
            case "boolean": return "jboolean";
            case "byte" : return "jbyte";
            case "char" : return "jchar";
            case "short": return "jshort";
            case "int": return "jint";
            case "long": return "jlong";           
            case "float": return "jfloat";
            case "double": return "jdouble";  
            case "String" : return "jstring";
         }
        if(jType.contains("Buffer")){
            return "jobject";            
        }
        
        
        if(!jType.contains("Vk")){
            System.out.println("# Failed to get JNI type for : " + jType + " , field:" + fieldName);
        }
        return jType;
    }
    
    
    /**
     * How to deal with void type
     * @param cVoidType
     * @param fieldName
     * @return
     */
    public static String getJavaType2Void(String cVoidType, String fieldName){
        if(null==cVoidType || !cVoidType.contains("void") || null==fieldName)
            return null;
        
         boolean isConst = cVoidType.contains("const");
         boolean isPP = cVoidType.contains("**");
         boolean isP = cVoidType.contains("*");
         
         cVoidType = cVoidType.replace("const", "").trim();
         
         
         // simple case pNext
         if(isConst && !isPP && isP && fieldName.contains("pNext")){
             //return "P<VkObject>";
             return "VkObject";
         }         
                  
         // pUserData -> User data must be a Buffer to support Int/Float/Double etc
         if(isConst && isP && !isPP && fieldName.contains("pUserData")){
             return "java.nio.Buffer";
         }
         
         // pValues -> User data must be a buffer to support Int/Float/Double etc
         if(isConst && isP && !isPP && fieldName.contains("pValues")){
             return "java.nio.Buffer";
         }
         
         // ppData -> Maps memory address to other memory Address
         // that could be a read only Buffer, a ByteBuffer, or even a VkObject
         if(isPP){
             return "ByteBuffer";
         }
         
         // void* is a Buffer
         if(isP){
             return "java.nio.Buffer";
         }
         
         // plain void
         if(!isP) return "void";
         
        
        return  null;
    }
    
    /**
     * Check if a given name is name of a Dispachable Handler
     * @param typeName - name of Handler Class
     * @return true if class is one of VkHandleDispatchable.DISPACHABLE_HANDLE_NAMES
     * 
     * 
     */
    public static boolean isDispatchable(String typeName){
        typeName = typeName.trim();
        for(String test : DISPACHABLE_HANDLE_NAMES){
            if(typeName.equalsIgnoreCase(test)){
                return true;
            }
        }        
        return false;
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
    public static String getJavaType(String cType, String field, String source){
        cType = cType.trim();                
        field = field.trim();
        
        if(cType.contains("PFN_")){
            cType = cType.replace("PFN_", "PFN");
        }
        
        boolean isVoid = cType.contains("void");
        
        // short circuit evaluation of void types
        if(isVoid){
            String value = getJavaType2Void(cType, field);
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
       
       
        /*
        if(isFlag){
            if(isPointer || isConst || isArray){
                throw new IllegalArgumentException("Weird FLAG! Check it out !");
            }
            if(!isVk){
                throw new IllegalArgumentException("Weird FLAG! Not a Vk type !!");
            }
            // ok
            
            System.err.println("getJavaType: " + cType + " -> int");
            return "int";
        }
        */
        String base = cType.trim()
                .replace("*","")
                .replace("const","")               
                .replace("","")
                .trim();
        
        Map<String, String> map = getC2JavaTypes();
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
        }else if (isVk && isPointer && isConst && isMulti) {
            value = "  " + base + "[] ";
            
        }else if (isVk && isPointer && isConst) {
            value = " final " + base + " ";
        } else if (isVk && isPointer) {
            value = " " + base + " ";
        } else {
            value = cType;
        }
        
        
        if(value==null){
           System.err.println("JTtype not found for cType : " + cType + ", field: " + field);
        }
        return value==null? cType : value;
    }
    
    /**
     * @TODO move to 
     * Maps CType to Java types
     * @return
     */
    private static Map<String, String> getC2JavaTypes(){
        if(c2JavaTypes==null){
            c2JavaTypes = new HashMap<String, String>();
            c2JavaTypes.put("int32_t", "int");
            c2JavaTypes.put("uint32_t", "int");
            c2JavaTypes.put("int64_t", "long");
            c2JavaTypes.put("uint64_t", "long");
            c2JavaTypes.put("uint32_t*", "int[]");// uint32_t*
            c2JavaTypes.put("uint32_t[]", "int[]");//uint32_t[]
            c2JavaTypes.put("uint8_t[]","byte[]");//uint8_t[]
            c2JavaTypes.put("const uint32_t*", "int[]");//const uint32_t*
            c2JavaTypes.put("const float*", "float[]");//const float*
            c2JavaTypes.put("char[]", "String");
            c2JavaTypes.put("const char*", "String");
            
            
            // some KHR Handlers & results
            c2JavaTypes.put("VkResult*", "VkResult[]");
          //KHR Android stuff
            c2JavaTypes.put("ANativeWindow*", "ANativeWindow");
            
            //KHR MIR stuff
            c2JavaTypes.put("MirConnection*", "MirConnection");
            c2JavaTypes.put("MirSurface*", "MirSurface");
            
            //KHR Wayland Stuff
            c2JavaTypes.put("struct wl_display*", "WlDisplay");
            c2JavaTypes.put("struct wl_surface*", "WlSurface");
            
            //KHR Win32 stuff
            c2JavaTypes.put("HINSTANCE", "Win32HINSTANCE");
            c2JavaTypes.put("HWND", "Win32HWND");
            
            //KHR XCB stuff
            c2JavaTypes.put("xcb_connection_t*", "XCBconnection");
            c2JavaTypes.put("xcb_window_t", "XCBwindow");
            c2JavaTypes.put("xcb_visualid_t", "XCBVisualID");
            //xcb_visualid_t
            
            // KHR Xlib stuf
            c2JavaTypes.put("Display*", "XlibDisplay");
            c2JavaTypes.put("VisualID", "XlibVisualID");
            c2JavaTypes.put("Window", "XlibWindow");
            
            
            /*
            special cases - must be done at higher level 
            c2JavaTypes.put("const void*",  "ByteBuffer");
            c2JavaTypes.put("void*",  "ByteBuffer");
            c2JavaTypes.put("void *", "ByteBuffer");            
            c2JavaTypes.put("const void* ", "ByteBuffer");
            */
            c2JavaTypes.put("size_t", "long");
            c2JavaTypes.put("size_t*", "long[]");
            c2JavaTypes.put("const char* const*", "String[]");
            
            c2JavaTypes.put("float", "float");
            c2JavaTypes.put("const float[]", "float[]");
            //const float[]
            c2JavaTypes.put("double", "double");
            
            
            c2JavaTypes.put("VkBool32", "boolean");
            c2JavaTypes.put("VkBool32*", "boolean[]");
            //VkBool32*
            
            c2JavaTypes.put("VkFlags", "int");
            c2JavaTypes.put("VkFlags*", "int[]");
            
            c2JavaTypes.put("VkSampleMask", "int");
            c2JavaTypes.put("VkSampleMask*", "int[]");
            
            c2JavaTypes.put("VkDeviceSize", "long");
            c2JavaTypes.put("VkDeviceSize*", "long[]");
            c2JavaTypes.put("const VkDeviceSize*", "long[]");
            //VkDeviceSize*
            //const VkDeviceSize*
            
            c2JavaTypes.put("const VkDynamicState*", "VkDynamicState[]");
            c2JavaTypes.put("const VkSampleMask*",    "int[]");
            c2JavaTypes.put("const VkPipelineStageFlags*", "int[]");
            
           
            
           
            // VkFlags
            
            c2JavaTypes.put("VkInstanceCreateFlags","int"); 
            c2JavaTypes.put("VkFormatFeatureFlags","int"); 
            c2JavaTypes.put("VkImageUsageFlags","int"); 
            c2JavaTypes.put("VkImageCreateFlags","int"); 
            c2JavaTypes.put("VkSampleCountFlags","int"); 
            c2JavaTypes.put("VkQueueFlags","int"); 
            c2JavaTypes.put("VkMemoryPropertyFlags","int"); 
            c2JavaTypes.put("VkMemoryHeapFlags","int"); 
            c2JavaTypes.put("VkDeviceCreateFlags","int"); 
            c2JavaTypes.put("VkDeviceQueueCreateFlags","int"); 
            c2JavaTypes.put("VkPipelineStageFlags","int"); 
            c2JavaTypes.put("VkMemoryMapFlags","int"); 
            c2JavaTypes.put("VkImageAspectFlags","int"); 
            c2JavaTypes.put("VkSparseImageFormatFlags","int"); 
            c2JavaTypes.put("VkSparseMemoryBindFlags","int"); 
            c2JavaTypes.put("VkFenceCreateFlags","int"); 
            c2JavaTypes.put("VkSemaphoreCreateFlags","int"); 
            c2JavaTypes.put("VkEventCreateFlags","int"); 
            c2JavaTypes.put("VkQueryPoolCreateFlags","int"); 
            c2JavaTypes.put("VkQueryPipelineStatisticFlags","int"); 
            c2JavaTypes.put("VkQueryResultFlags","int"); 
            c2JavaTypes.put("VkBufferCreateFlags","int"); 
            c2JavaTypes.put("VkBufferUsageFlags","int"); 
            c2JavaTypes.put("VkBufferViewCreateFlags","int"); 
            c2JavaTypes.put("VkImageViewCreateFlags","int"); 
            c2JavaTypes.put("VkShaderModuleCreateFlags","int"); 
            c2JavaTypes.put("VkPipelineCacheCreateFlags","int"); 
            c2JavaTypes.put("VkPipelineCreateFlags","int"); 
            c2JavaTypes.put("VkPipelineShaderStageCreateFlags","int"); 
            c2JavaTypes.put("VkPipelineVertexInputStateCreateFlags","int"); 
            c2JavaTypes.put("VkPipelineInputAssemblyStateCreateFlags","int"); 
            c2JavaTypes.put("VkPipelineTessellationStateCreateFlags","int"); 
            c2JavaTypes.put("VkPipelineViewportStateCreateFlags","int"); 
            c2JavaTypes.put("VkPipelineRasterizationStateCreateFlags","int"); 
            c2JavaTypes.put("VkCullModeFlags","int"); 
            c2JavaTypes.put("VkPipelineMultisampleStateCreateFlags","int"); 
            c2JavaTypes.put("VkPipelineDepthStencilStateCreateFlags","int"); 
            c2JavaTypes.put("VkPipelineColorBlendStateCreateFlags","int"); 
            c2JavaTypes.put("VkColorComponentFlags","int"); 
            c2JavaTypes.put("VkPipelineDynamicStateCreateFlags","int"); 
            c2JavaTypes.put("VkPipelineLayoutCreateFlags","int"); 
            c2JavaTypes.put("VkShaderStageFlags","int"); 
            c2JavaTypes.put("VkSamplerCreateFlags","int"); 
            c2JavaTypes.put("VkDescriptorSetLayoutCreateFlags","int"); 
            c2JavaTypes.put("VkDescriptorPoolCreateFlags","int"); 
            c2JavaTypes.put("VkDescriptorPoolResetFlags","int"); 
            c2JavaTypes.put("VkFramebufferCreateFlags","int"); 
            c2JavaTypes.put("VkRenderPassCreateFlags","int"); 
            c2JavaTypes.put("VkAttachmentDescriptionFlags","int"); 
            c2JavaTypes.put("VkSubpassDescriptionFlags","int"); 
            c2JavaTypes.put("VkAccessFlags","int"); 
            c2JavaTypes.put("VkDependencyFlags","int"); 
            c2JavaTypes.put("VkCommandPoolCreateFlags","int"); 
            c2JavaTypes.put("VkCommandPoolResetFlags","int"); 
            c2JavaTypes.put("VkCommandBufferUsageFlags","int"); 
            c2JavaTypes.put("VkQueryControlFlags","int"); 
            c2JavaTypes.put("VkCommandBufferResetFlags","int"); 
            c2JavaTypes.put("VkStencilFaceFlags","int"); 
            c2JavaTypes.put("VkSurfaceTransformFlagsKHR","int"); 
            c2JavaTypes.put("VkCompositeAlphaFlagsKHR","int"); 
            c2JavaTypes.put("VkSwapchainCreateFlagsKHR","int"); 
            c2JavaTypes.put("VkDisplayModeCreateFlagsKHR","int"); 
            c2JavaTypes.put("VkDisplayPlaneAlphaFlagsKHR","int"); 
            c2JavaTypes.put("VkDisplaySurfaceCreateFlagsKHR","int"); 
            c2JavaTypes.put("VkXlibSurfaceCreateFlagsKHR","int"); 
            c2JavaTypes.put("VkXcbSurfaceCreateFlagsKHR","int"); 
            c2JavaTypes.put("VkWaylandSurfaceCreateFlagsKHR","int"); 
            c2JavaTypes.put("VkMirSurfaceCreateFlagsKHR","int"); 
            c2JavaTypes.put("VkAndroidSurfaceCreateFlagsKHR","int"); 
            c2JavaTypes.put("VkWin32SurfaceCreateFlagsKHR","int"); 
            c2JavaTypes.put("VkDebugReportFlagsEXT","int");
            
            ////////////////////////
            
            //c2JavaTypes.put("const VkSampleMask*", "long[]");
            //c2JavaTypes.put("const char* const*", "String[]");  
        }
        
        return c2JavaTypes;
    }
    
    private static Map<String, String> c2JavaTypes = null;

}
