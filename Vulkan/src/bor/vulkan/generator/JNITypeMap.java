/**
 * 
 */
package bor.vulkan.generator;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

import bor.vulkan.generator.Util.CLASS_TYPE;

/**
 * <pre>
 * Class to help mapping JNI Types.
 * 
 * 
 * </pre>
 * @author Alessandro Borges
 *
 */
public class JNITypeMap {
    
    static Collection<Class<?>> structClasses, enumClasses, vkHandlerClasses, vkObjectClasses;
    
    static Collection<String> structNames, enumNames, vkHandlerNames, vkObjectNames;

    public static boolean saveEnum = true,
            saveStructs= true,
            saveHandlers = true,
            saveVk = true;
    
    static{
         loadNames();
    }
    
    public static void init(){        
        if(structNames == null){
            try {
                updateNames();
            } catch (Exception e) {                
                e.printStackTrace();
            }
        }        
    }
    
    /**
     * Get names from txt files
     */
    public static void loadNames(){
        String path = basePath();
        path += "\\src\\bor\\vulkan\\generator";
        
        if(structNames != null){
            return;
        }
        
        structNames = Util.readFile(path, "Structs.txt");
        enumNames = Util.readFile(path, "Enumerations.txt");
        vkHandlerNames = Util.readFile(path, "VkHandlers.txt");
        vkObjectNames = Util.readFile(path, "VkObjects.txt");        
    }
    
    /**
     * Uses reflection to query class names of Enumerations,
     *  Structs, VkHandlers and vkobjects.<br>
     *  All data is stored in following static String arrays: <br>
     *   {@link #enumClasses}, {@link #enumNames}, <br>
     *   {@link #structClasses}, {@link #strucNames}, <br>
     *   {@link #vkHandlerClasses}, {@link #vkHandlerNames}<br>
     *   {@link #vkObjectClasses}, {@link #vkObjectNames}<br>
     *   
     *   
     * @throws ClassNotFoundException
     * @throws IOException
     */
    public static void updateNames() throws ClassNotFoundException, IOException{        
        if(structNames != null){
            return;
        }
        
        String path = basePath();
        path += "\\src\\bor\\vulkan\\generator";
        
        if (saveEnum) {
            List<Class<?>> classes = Util.getEnumerationClasses();
            Collection<String> names = Util.getClassSimpleNames(classes);
            enumClasses = classes;
            enumNames = names;
            String text2Save = Util.toText(names);
            Util.save(path, "Enumerations.txt", text2Save);
        }

        if (saveStructs) {
            List<Class<?>> classes = Util.getStructClasses();
            Collection<String> names = Util.getClassSimpleNames(classes);
            structClasses = classes;
            structNames = names;
            String text2Save = Util.toText(names);
            Util.save(path, "Structs.txt", text2Save);
        }
        
        if (saveHandlers) {
            List<Class<?>> classes = Util.getVkHandleClasses();
            Collection<String> names = Util.getClassSimpleNames(classes);
            vkHandlerClasses = classes;
            vkHandlerNames = names;
            String text2Save = Util.toText(names);
            Util.save(path, "VkHandlers.txt", text2Save);
        }
        
        if (saveVk) {
            List<Class<?>> classes = Util.getVkObjectClasses();
            Collection<String> names = Util.getClassSimpleNames(classes);
            vkObjectClasses = classes;
            vkObjectNames = names;
            String text2Save = Util.toText(names);
            Util.save(path, "VkObjects.txt", text2Save);
        }
        System.out.println("Done update");
    }
    
    private static String basePath(){
        Path currentRelativePath = Paths.get("");
        String s = currentRelativePath.toAbsolutePath().toString();
        System.out.println("Current relative path is: " + s);
        return s;
    }
    
    /**
     * minor fix
     * @param s
     * @return
     */
    private static String check(String s){
        s = s.trim();
        s = s.replace("[]","").replace("final","");
        s = s.replace("const","").trim();
        s = s.replace("*","").trim();
       // s = s.replace("void","").trim();
        s = s.replace("struct","").trim();
        
        if(s.contains(" "))
            System.err.println("invalid object name: " + s);
        return s;
    }
    
    /**
     * Check if name is a Struct
     * @param name - object name
     * @return true if name is a struct type
     */
    public static boolean isVkStruct(String name){       
        name = check(name);
        return structNames.contains(name);
    }
    
    
    /**
     * Check if name is an Enumeration
     * @param name - object name
     * @return true if name is a Enum type
     */
    public static boolean isVkEnum(String name){
        name = check(name);
        return enumNames.contains(name);
    }
    
    
    /**
     * Check if name is an VkObject
     * @param name - object name
     * @return true if name is a VkObject
     */
    public static boolean isVkObject(String name){
        name = check(name);
        return vkObjectNames.contains(name);
    }
    
    public static boolean isString(String name){
        name = check(name);
        return name.equals("String");
    }
    
    public static boolean isStringArray(String name){
        name = check(name);
        return name.equals("String[]");
    }
    
    public static boolean isInt(String name){
        name = check(name);
        return name.equals("int") || name.contains("int32") ;
    }
    
    public static boolean isFloat(String name){
        name = check(name);
        return name.equals("float");
    }
    
    public static boolean isFloatArray(String name){
        name = check(name);
        return name.equals("float[]");
    }
    
    public static boolean isIntArray(String name){
        name = check(name);
        return name.equals("int[]");
    }
    
    public static boolean isLong(String name){
        name = check(name);
        return name.equals("long");
    }
    
    public static boolean isBuffer(String name){
        name = check(name);
        return name.equals("java.nio.Buffer");
    }
    
    public static boolean isByteBuffer(String name){
        name = check(name);
        return name.equals("java.nio.ByteBuffer") || name.equals("ByteBuffer") ;
    }
    
    public static boolean isBoolean(String name){
        name = check(name);
        return name.contains("boolean") || name.contains("VkBoolean");
    }
    
    public static boolean isByteArray(String name){
        name = check(name);
        return name.equals("byte[]");
    }
    
    public static boolean isByte(String name){
        name = check(name);
        return name.equals("byte");
    }
    
    public static boolean isPointer(String name){
        name = check(name);
        return name.startsWith("P<");
    }
    
    public static boolean isPInteger(String name){
        name = check(name);
        return name.startsWith("PInteger");
    }
    
    
    
    /**
     * Check if name is an VkObject
     * @param name - object name
     * @return true if name is a VkObject
     */
    public static boolean isVkHandler(String name){
        name = check(name);
        return vkHandlerNames.contains(name);
    }
    
    /**
     * Get Type of Vulkan type
     * @param name
     * @return
     */
    public static Util.CLASS_TYPE getType(String name){
        name = name.trim();
        boolean isArray = name.contains("[]");
        if(name.contains("Xlib")){
           // System.err.println("erro");
        }
               
        if(isVkEnum(name)){
            return isArray ? CLASS_TYPE.VKENUM_ARRAY : CLASS_TYPE.VKENUM;
        }
        
        if(isVkStruct(name)){
            return isArray ? CLASS_TYPE.VKSTRUCT_ARRAY :CLASS_TYPE.VKSTRUCT;
        }
        
        if(isVkHandler(name)){
            if(name.contains("PFN"))
                return CLASS_TYPE.VKPFN;
            else
                return isArray ? CLASS_TYPE.VKHANDLE_ARRAY : CLASS_TYPE.VKHANDLE;
        }
        
        if(isVkObject(name)){
            return isArray ? CLASS_TYPE.VKOBJECT_ARRAY : CLASS_TYPE.VKOBJECT;
        }
        
        if(name.contains("void") && !name.contains("*")){
            return CLASS_TYPE.VOID;
        }
        
        if(isBoolean(name) && name.contains("[]")){
            return CLASS_TYPE.BOOLEAN_ARRAY; 
        }
        
        if(isBoolean(name)){
            return CLASS_TYPE.BOOLEAN;
        }
        
        if(isByte(name)){
            return CLASS_TYPE.BYTE;
        }
        
        if(isByteArray(name)){
            return CLASS_TYPE.BYTE_ARRAY;
        }
        
        if(isInt(name)){
            return CLASS_TYPE.INT;
        }
        
        if(isIntArray(name)){
            return CLASS_TYPE.INT_ARRAY;
        }
        
        if(isLong(name)){
            return CLASS_TYPE.LONG;
        }
        if(isFloat(name)){
            return CLASS_TYPE.FLOAT;
        }     
        
        
        if(isFloatArray(name)){
            return CLASS_TYPE.FLOAT_ARRAY;
        }
        
        if(isBuffer(name)){
            return CLASS_TYPE.BUFFER;
        }
        
        if(isByteBuffer(name)){
            return CLASS_TYPE.BYTEBUFFER;
        }
        
        
        if(isString(name)){
            return CLASS_TYPE.STRING;
        }
        
        if(isStringArray(name)){
            return CLASS_TYPE.STRING_ARR;
        }
        
        if(isPointer(name)){
            return CLASS_TYPE.P;
        }
        
       
        System.err.println("\t\t GetType OTHER " + name);
        return CLASS_TYPE.OTHER;
        
    }
    
   
    /**
     * @param args
     */
    public static void main(String[] args) {
        boolean doUpdate = true;
        
        try {
            if(doUpdate)
                updateNames();
            loadNames();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}


