package bor.vulkan.generator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

import bor.vulkan.generator.Util.CLASS_TYPE;
import static bor.vulkan.generator.JNITypeMap.*;



/**
 * Class to generate source codes for structs, 
 * including native binding in C/C++.
 * <h2>Note h2</h2>
 * Notes
 * <h3>Note h3</h3>
 * Notes
 * @author Alessandro Borges
 * @version 0.8.01
 */
public class StructInfo {  
   
    
    public int id;
    public String name;
    public String[] fields;
    public String[] types;
    
    public static String LICENSE = Util.LICENSE;
    
    /**
     * cpp Source code
     */
    public String[] cppSource;
    
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
     * Generate Java Source code
     *   
     * @param pkg
     * @return
     */
    public String toJavaSrc(String pkg){
 
        
        String proto = prototype(true);
        String extra = "This class is a Java front end for struct " + name +".";
        String disclaimer = DISCLAIMER.replace(MARK, extra);
        disclaimer = disclaimer.replace(PROTO, proto);
        String output = new String();
       
        boolean isKHR = name.contains("KHR");
        
        if(pkg==null)
            pkg="bor.vulkan.structs";
        
        output +="/**\n";
        output += " * Class wrapping Vulkan's " + this.name + " struct.\n";
        output += " * \n";
        output += LICENSE;
        output += " */\n"; 
        output += "package " + pkg + ";\n\n";
        
        output += "import bor.vulkan.*;\n";
        output += "import bor.vulkan.enumerations.*;\n";
        output += "import bor.vulkan.structs.*;\n";
        
        if(isKHR){
            output += "import bor.vulkan.khr.*;\n";
        }
            
        
        output += "import java.nio.ByteBuffer;\n\n";
        
        output += disclaimer;
        output += "public class " + this.name + " extends VkStruct {\n";
        
        output += "\t/** TAG of this structure [" + this.id + "]  */\n";
        output += "\t private static final String TAG = \"" + name + "\";\n\n";
        
        output += "\t/** ID of this structure [" + this.id + "]  */\n";
        output += "\t public static final int TAG_ID = " + name.toUpperCase() + "_ID;\n\n";
        //output += "\t public static final int " + name.toUpperCase() + "_ID = " + this.id + ";\n\n";        
        
        //////////////////////////////////////////////
        ///   FIELDS
        /////////////////////////////////////////////
        output += "\t // fields //\n";
        boolean commentOut = false;
        String tab="\t";
        for(int i=0; i<this.fields.length; i++){
            String field = fields[i];
            String cType = types[i];
            String jType = getJavaType(cType, field, name);
            
            CLASS_TYPE type = getType(jType);
            String typeOut = type==CLASS_TYPE.OTHER ? "" : "[" + type.name().toLowerCase() + "]";
            // Comment 
           output += tab + "/**\n"
                         + "\t *  " + cType + " \t" + field + "\t"+ typeOut
                         + "\n\t */ \n";
           
           if(commentOut)
               output += "   // ";
           else
              output += tab;
           
           output += jType + " \t" + field + ";\n\n";      
           }
         //////////////////////////////////////////////
        //// Ctor
        /////////////////////////////////////////////
        output += "\t/**\n\t * Ctor\n\t */\n";
        output += "\tpublic " + name + "(){ \n\t\t super(sizeOf()); \n\t }\n\n";
        
        output += "\t/**\n\t * Ctor with ByteBuffer\n"
                + "\t * @param nativeBuffer - Direct bytebuffer for this struct \n"
                + "\t */\n";
        output += "\tpublic " + name + "(ByteBuffer nativeBuffer){ \n"
                + "\t\t super(nativeBuffer); \n\t }\n\n";
        
        output += "\t/**\n\t * Ctor with Address and memSize\n"
                + "\t * @param address - native address \n"
                + "\t * @param memSize - buffer size \n"
                + "\t */\n";
        output += "\t public " + name + "(long address, int memSize){ \n"
                + "\t\t super(address, memSize); \n"
                + "\t }\n\n";

        //////////////////////////////////////////////
        //// SizeOf
        /////////////////////////////////////////////
        output += "\t/** \n\t * Method to get native size of this structure \n\t */\n";
        output += "\t public static int sizeOf(){ \n\t\t return sizeOf(TAG_ID); \n\t}\n\n"; 

        //////////////////////////////////////////////
        //// static create createNullPointer 
        /////////////////////////////////////////////
      
        output += "\n\t/**"
                + "\n\t * Create a pointer P to contain a instance of this,"
                + "\n\t * with clean native pointer.<br>"
                + "\n\t * You can use {@link VkStruct#setPointer(ByteBuffer)} to set a new "
                + "\n\t * native pointer."                
                + "\n\t * @return An instance of P for this VkStruct with null pointer"
                + "\n\t */"
                + "\n\t public static P<"+name+"> createNullPointer(){"                
                + "\n\t        P<"+name+"> p = new  P<"+name+">(new "+name+"());"
                + "\n\t        return p;"
                + "\n\t    }\n";
        
        
        ////////////////////////////////////////////////
        /// SET/GET java side
        ////////////////////////////////////////////////
        output += "\n\t ////////////////////////\n";
        output +=   "\t //  SETTERS & GETTERS //\n";
        output +=   "\t ////////////////////////\n\n";
        
        for(int i=0; i<this.fields.length; i++){
            String field = fields[i];
            String cType = types[i];
            String jType = getJavaType(cType, field, name);            
            CLASS_TYPE type = getType(jType);
            String typeOut = type==CLASS_TYPE.OTHER ? "" : "[" + type.name().toLowerCase() + "]";
            
            
            // Comment 
           output += "\t/**\n\t * Set method for field " + field + "\t" + typeOut + "<br>" +
                          "\n\t * Prototype: " + cType + "  " + field + 
                          "\n\t */ \n";
           
           // SET
           String setName = field;//"set" + upperCaseField(field);
           output += "\t public void " + setName + "("
                     +jType + " " + field + "){\n"
               + "\t\t this." + field + " = " + field + ";\n"
            // native setting
               + "\t\t" + setName + "0(super.ptr, " + field + ");\n"
               + "\t }\n\n";
           
           // GET
           String getName = field;//"get" + upperCaseField(field);
           //comment
           output += "\t/**\n\t * get method for field " + field + "\t" + typeOut +  "<br>" +
                      "\n\t * Prototype: " + cType + "  " + field + 
                      "\n\t */ \n";
           
           output += "\t public " + jType + " " + getName + "(){\n"              
              +"\t\t // return  this." + field + ";\n"
            // native writing
              +"\t\t return " + getName + "0(super.ptr);\n"
              +"\t }\n\n";
              
           }
        
        /////////////////////////////////////////////////
        
        
        ////////////////////////////////////////////////
        /// SET/GET native side
        ////////////////////////////////////////////////
        output += "\n\t //////////////////////////////////\n";
        output +=   "\t // native SETTERS & GETTERS    //\n";
        output +=   "\t /////////////////////////////////\n";
        
        for(int i=0; i<this.fields.length; i++){
            String field = fields[i];
            String cType = types[i];
            String jType = getJavaType(cType, field, name);
            String jniType = toJNItype(jType, field);
            CLASS_TYPE type = getType(jType);
            String typeOut = type==CLASS_TYPE.OTHER ? "" : "[" + type.name().toLowerCase() + "]";
            
            // Comment 
           output += "\t/**\n\t * native SET method for field " + field +  "\t" + typeOut +  "<br>" +
                          "\n\t * Prototype: " + cType + "  " + field + 
                          "\n\t */ \n";
           
           // native SET
           String setName = field;//"set" + upperCaseField(field);
           output += "\t private static native void " + setName 
                   + "0(ByteBuffer ptr, "+jType + " _" + field + ");/*\n"
                   + "\t\t  " + this.name + " _obj = ("+ this.name+")(*ptr);\n"
                   + "\t\t  _obj." + field + " = ("+ cType +") (_" + field + ");\n"            
                   + "\t  */\n\n";
           
           // GET
           String getName = field;//"get" + upperCaseField(field);
           //comment
           output += "\t/**\n\t * native GET method for field " + field +  "\t" + typeOut +  "<br>" +
                      "\n\t * Prototype: " + cType + "  " + field + 
                      "\n\t */ \n";
           
           String nativeRes = "\t\t  return (" + jniType + ") (_obj."+ cType + ");\n";
           if(jType.equalsIgnoreCase("string")){
               // Strings must be converted
               nativeRes = "\t\t  return (jstring)(env->NewStringUTF(_obj."+cType +");";
           }
           
           output += "\t private static native " + jType + " " + getName + "0(ByteBuffer ptr);/*\n" 
                   + "\t\t  " + this.name + " _obj = ("+ this.name+")(ptr);\n"                   
                   + nativeRes
                   +"\t */\n\n";
              
           }
        
        output += "\n\n} // end of class " + name + "\n";
        
        return output;
        
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
                   int pos = fieldName.indexOf('[');                   
                   fieldName = fieldName.substring(0, pos);
                   //fieldName += " /* length="+len + " */"; 
                   type =type.trim() +"[]";
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
        names = fieldNames.toArray(names);
        types = fieldTypes.toArray(types);
        info.fields = names;
        info.types = types;
        
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
        switch (jType) {
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
             return "P<VkObject>";
         }         
                  
         // pUserData -> User data must be a buffer to support Int/Float/Double etc
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
                value = value.replace("const", "final");
            }
            if(isPointer && isVk){
                boolean isSpecialEnum = Util.containsString(Util.SPECIAL_ENUMS, base);
                if(isSpecialEnum){
                    // fix
//                    if(!value.contains("Penum")){
//                        String ptr = "Penum<"+base+">";
//                        value =value.replace(base, ptr).trim();
//                    }
                    
                }else{
                    String ptr = "P<"+base+">";
                    value =value.replace(base, ptr).trim();
                }
            }
            return value;
        }else{
            /*
            System.err.println("Failed to get JavaType for \t\""+ cType+ 
                    "\"\t in field:\t\"" + field +
                    "\"\t at class:\""+ source+"\"");
                    */
        }
        
        // complex types
       
        
               
        if(base.contains("[")){
            int bg = base.indexOf('[');
            base = base.substring(0,  bg);
        }
        
        // context analysis...
        if(cType.equals("const void*") && field.equals("pNext")){
            value = "P<VkObject>";
        }else if(isVk && isPointer && isConst){
            value = "P<"+base+"> ";
            }else if(isVk && isPointer){
                value = "P<"+base+">";
                }else{
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
            c2JavaTypes.put("VkResult*", "PInteger");
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
            c2JavaTypes.put("const char* const*", "String[]");
            
            c2JavaTypes.put("float", "float");
            c2JavaTypes.put("double", "double");
            
            
            c2JavaTypes.put("VkBool32", "boolean");
            
            c2JavaTypes.put("VkFlags", "int");            
            c2JavaTypes.put("VkSampleMask", "int");
            c2JavaTypes.put("VkDeviceSize", "long");
            
            c2JavaTypes.put("const VkDynamicState*", "Penum<VkDynamicState>");
            c2JavaTypes.put("const VkSampleMask*",    "PInteger");
            c2JavaTypes.put("const VkPipelineStageFlags*", "PInteger");
            
           
            
           
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
