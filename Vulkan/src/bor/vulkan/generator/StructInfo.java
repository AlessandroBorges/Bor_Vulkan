package bor.vulkan.generator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

import com.sun.org.apache.bcel.internal.generic.ReturnaddressType;

public class StructInfo {     
    public int id;
    public String name;
    public String[] fields;
    public String[] types;
    
    /**
     * cpp Source code
     */
    public String[] cppSource;
    
    private static String MARK = "#MARK#";
    private static String PROTO = "#PROTO#";
    private static final String DISCLAIMER = "\n"
                                          + "/**\n"
                                           + " *  Class for Java-Vulkan integration \n"
                                           + " *  " + MARK +" \n" 
                                           + " *  <h2>ProtoType</h2>"
                                           + "#PROTO#"
                                           + " * @Author Alessandro Borges \n"
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
        String cmt = asComments ? "\n\t* " : "\n\t";
        
        String prototype = asComments ? cmt  : cmt + "<pre>";
        for (int i = 0; i < cppSource.length; i++) {
            prototype += cmt + cppSource[i];
        }
        prototype += asComments ? cmt  : cmt + "</pre>\n";
         return prototype;
    }
    
    /**
     * Generate Java Source code
     * @param packge
     * @return
     */
    public String toJavaSrc(String packge){
 
        
        String proto = prototype(true);
        String extra = "This class is a Java front end for struct " + name;
        String disclaimer = DISCLAIMER.replace(MARK, extra);
        disclaimer = disclaimer.replace(PROTO, proto);
        String output = new String();
       
        
        if(packge==null)
            packge="bor.vulkan.structs";
        output += "// class wrapping Vulkan's " + this.name + " struct.\n";
        output += "package " + packge + ";\n\n";
        
        output += "import bor.vulkan.*;\n";
        output += "import bor.vulkan.enumerations.*;\n";
        output += "import java.nio.ByteBuffer;\n\n";
        
        output += disclaimer;
        output += "public class " + this.name + " extends VkStruct {\n";
        
        
        output += "\t/** ID of this structure [" + this.id + "]  */\n";
        output += "\t public static final int TAG = " + name.toUpperCase() + "_ID;\n\n";
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
            String jType = getJavaType(cType, field);
            // Comment 
           output += tab + "/**\n\t *  " + cType + " \t" + field + " \n\t */ \n";
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

        //////////////////////////////////////////////
        //// SizeOf
        /////////////////////////////////////////////
        output += "\t/** \n\t * Method to get native size of this structure \n\t */\n";
        output += "\t public static int sizeOf(){ \n\t\t return sizeOf(TAG); \n\t}\n\n"; 

        
        
        ////////////////////////////////////////////////
        /// SET/GET java side
        ////////////////////////////////////////////////
        output += "\n\t // /////////////////////\n";
        output += "\t //  SETTERS & GETTERS //\n";
        output += "\t // /////////////////////\n\n";
        
        for(int i=0; i<this.fields.length; i++){
            String field = fields[i];
            String cType = types[i];
            String jType = getJavaType(cType, field);
            // Comment 
           output += "\t/**\n\t * Set method for field " + field +
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
           output += "\t/**\n\t * get method for field " + field +
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
        output += "\n\t // ////////////////////////////////\n";
        output += "\t // native SETTERS & GETTERS //\n";
        output += "\t // ////////////////////////////////\n";
        
        for(int i=0; i<this.fields.length; i++){
            String field = fields[i];
            String cType = types[i];
            String jType = getJavaType(cType, field);
            String jniType = toJNItype(jType, field);
            // Comment 
           output += "\t/**\n\t * native Set method for field " + field +
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
           output += "\t/**\n\t * get method for field " + field +
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
            if(line.contains(" struct ")){
                name = line.replace("struct","").replace("typedef", "").replace("{", "").trim();
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
                   fieldName += " /* length="+len + " */"; 
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
    
    public static String getArrayLength(String field){
        int pos = field.indexOf('[');
        int end = field.indexOf(']');
        String len = field.substring(pos+1, end);
        return len;
        //int val = Integer.parseInt(len);
        //return val;
    }
    
    /**
     * Get 
     * @param jType
     * @return
     */
    public static String toJNItype(String jType, String fieldName){        
        switch (jType) {
            case "int": return "jint";
            case "long": return "jlong";
            case "boolean": return "jboolean";
            case "float": return "jfloat";
            case "double": return "jdouble";
            case "byte" : return "jbyte";
            case "char" : return "jchar";  
            case "String" : return "jstring"; 
         }
        if(!jType.contains("Vk")){
            System.out.println("# Failed to get JNI type for : " + jType + " , field:" + fieldName);
        }
        return jType;
    }
    
    public static String getJavaType(String cType, String field){
        cType = cType.trim();                
        field = field.trim();
        
        boolean isPointer = cType.contains("*") ;
        boolean isConst = cType.contains("const");
        boolean isArray = cType.contains("[") || field.contains("[");
        boolean isVk = cType.contains("Vk");
        
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
                String ptr = "P<"+base+">";
                value =value.replace(base, ptr).trim(); 
            }
            return value;
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
            value = "final P<"+base+"> ";
            }else if(isVk && isPointer){
                value = "P<"+base+">";
                }else{
                    value = cType;
                }
        
        
        
        if(value==null){
          //  System.out.println("JTtype not found for cType : " + cType);
        }
        return value==null? cType : value;
    }
    
    /**
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
            c2JavaTypes.put("const char*", "String");
            c2JavaTypes.put("void*", "ByteBuffer");
            c2JavaTypes.put("const void* ", "");
            c2JavaTypes.put("size_t", "long");
            c2JavaTypes.put("VkBool32", "boolean");
            c2JavaTypes.put("VkFlags", "int");
            c2JavaTypes.put("VkSampleMask", "int");
            c2JavaTypes.put("VkDeviceSize", "long");
            c2JavaTypes.put("float", "float");
            c2JavaTypes.put("double", "double");
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
