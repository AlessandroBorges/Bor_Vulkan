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
            } catch (ClassNotFoundException | IOException e) {                
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
        vkHandlerNames = Util.readFile(path, "VkHandler.txt");
        vkObjectNames = Util.readFile(path, "VkObjects.txt");        
    }
    
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
        if(s.contains(" ")){
            throw new IllegalArgumentException("invalid object name");
        }
        return s;
    }
    
    /**
     * Check if name is a Struct
     * @param name - object name
     * @return true if name is a struct type
     */
    public static boolean isStruct(String name){
        name = check(name);
        return structNames.contains(name);
    }
    
    
    /**
     * Check if name is an Enumeration
     * @param name - object name
     * @return true if name is a Enum type
     */
    public static boolean isEnum(String name){
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
    
    /**
     * Check if name is an VkObject
     * @param name - object name
     * @return true if name is a VkObject
     */
    public static boolean isVkHandler(String name){
        name = check(name);
        return vkHandlerNames.contains(name);
    }
    
    
    public static Util.CLASS_TYPE getType(String name){
        if(isEnum(name)){
            return CLASS_TYPE.VKENUM;
        }
        
        if(isStruct(name)){
            return CLASS_TYPE.VKSTRUCT;
        }
        
        if(isVkHandler(name)){
            return CLASS_TYPE.VKHANDLE;
        }
        
        if(isVkObject(name)){
            return CLASS_TYPE.VKOBJECT;
        }
        
        return CLASS_TYPE.OTHER;
        
    }
    
    /**
     * 
     */
    public JNITypeMap() {
        // TODO Auto-generated constructor stub
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        try {
           // updateNames();
            loadNames();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}


