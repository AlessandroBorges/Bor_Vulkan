/**
 * 
 */
package bor.vulkan.generator;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

/**
 * Util classes for Generating code
 * 
 * This class contains code from several authors:
 *  
 *  Victor Tatai - https://dzone.com/articles/get-all-classes-within-package
 *  
 * @author Alessandro Borges
 *
 */
public class Util {
    /**
     * This enumerations uses Penum<Enum> instead of P<Enum>, for pointer operations
     */
    public static final String[] SPECIAL_ENUMS  = {"VkDynamicState","VkSampleMask","VkPipelineStageFlags"};
    
    public static final String VERSION = "Ver. 0.8.01 (beta)";
    
    public static String LICENSE = 
            " * Bor_Vulkan Project "+ VERSION + "\n" + 
            " * Licence terms: \n"+
            " * The MIT License (MIT)\n" +
            " * Copyright (c) 2016 Alessandro Borges\n"+
            " * See https://opensource.org/licenses/MIT \n";
    
    /**
     * To be used to classifie variables
     * @author Alessandro Borges
     *
     */
    public enum CLASS_TYPE{
        VKOBJECT,
        VKHANDLE,
        VKSTRUCT,
        VKENUM,
        BYTE, BYTE_ARRAY,
        INT, INT_ARRAY,
        LONG, LONG_ARRAY,
        FLOAT, FLOAT_ARRAY,
        
        BOOLEAN,
        STRING, STRING_ARR,
        BUFFER, BYTEBUFFER,
        P,
        OTHER, PINTEGER, PENUM  
    }
    
    /**
     * We have 3 different types for each VkObject: <br>
     * <li> CType - C/C++ type defined in header
     * <li> JType - Java type, as primitives, arrays, wrappers, etc   
     * <li> Bridge Type - sweet types used on native calls, to reduce casting overhead
     * <pre>
     * Example 1 - Enumeration: 
     *  C/C++ native type: VkBlendOp (enumeration)
     *  Java Type : class VkBlendOp (enumeration type)
     *  bridge type: int
     *  
     *  Example 2 - Object Pointer
     *  C/C++ native type: const VkDeviceSize*    (pointer to obj)
     *  Java Type :  P < VkDeviceSize > (wrapper to java class)
     *  bridge type: ByteBuffer wrapping a native pointer to 
     *  
     * </pre>
     * 
     * @param jType
     * @return
     */
    public String getBridgeType(String cType, String jType, String fname){
       
        return null;
    }
    
    
   
    
    /**
     * 
     * @param src
     * @return
     */
    public static String genDocLines(List<String> src){        
        String prefix = "\n *";
        String out = prefix;
        for (String line : src) {
            out += prefix + line;
        }
        return out + "\n";
    }
    
    
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
     * Get Collection of names from a List 
     * @param classes - collection of classes
     * @return Collection of class names
     */
    public static Collection<String> getClassFullNames(Collection<Class<?>> classes){
        Set<String> set = new TreeSet<String>();        
        for (Class<?> cc : classes) {
            String name = cc.getName();
            set.add(name);
        }        
        return set;
    }
    
    /**
     * Get Collection of names from a List 
     * @param classes - collection of classes
     * @return Collection of class names
     */
    public static Collection<String> getClassSimpleNames(Collection<Class<?>> classes){
        Set<String> set = new TreeSet<String>();        
        for (Class<?> cc : classes) {
            String name = cc.getSimpleName();
            set.add(name);
        }        
        return set;
    }
    
    /**
     * Get all enumeration from this application
     * @return
     * @throws ClassNotFoundException
     * @throws IOException
     */
    public static List<Class<?>> getEnumerationClasses() throws ClassNotFoundException, IOException{
        List<Class<?>> classes = new ArrayList<Class<?>>(128);
        
        String baseInterface = "bor.enumerable.EnumInterface";
        List<Class<?>> resultSet = getClasses("bor.vulkan");
        
        Class<?> clazz = Class.forName(baseInterface);
        classes.addAll(filter(resultSet, clazz));
        
        return classes;        
    }
    
    /**
     * Get a collection of lines and convert into string
     * @param lines - collection of lines
     * @return a single string with all lines in lines.
     */
    public static String toText(Collection<String> lines){
        int len = 0;
        
        for (String string2 : lines) {
            len += string2.length() + 2;
        }
        
        StringBuffer sb = new StringBuffer(len + 64);
        for (String string2 : lines) {
            sb.append(string2).append('\n');
        }
        sb.append('\n');
        
        return sb.toString();
    }
    
    /**
     * Get all enumeration from this application
     * @return
     * @throws ClassNotFoundException
     * @throws IOException
     */
    public static List<Class<?>> getStructClasses() throws ClassNotFoundException, IOException{
        return getFilteredClasses("bor.vulkan.structs.VkStruct");
    }
    
    /**
     * Get all VkHandleInterface class from this application
     * @return
     * @throws ClassNotFoundException
     * @throws IOException
     */
    public static List<Class<?>> getVkHandleClasses() throws ClassNotFoundException, IOException{
        return getFilteredClasses("bor.vulkan.VkHandleInterface");
    }
    
    public static List<Class<?>> getVkObjectClasses() throws ClassNotFoundException, IOException{
        return getFilteredClasses("bor.vulkan.VkObject");
    }
    
    /**
     * Get fintered class
     * @param superClassName - full name of super class used as filter 
     * @return list of subclasses of superClass
     * 
     * @throws ClassNotFoundException
     * @throws IOException
     */
    public static List<Class<?>> getFilteredClasses(String superClassName) throws ClassNotFoundException, IOException{
        List<Class<?>> classes = new ArrayList<Class<?>>(128);
        
        String baseInterface = superClassName;
        List<Class<?>> resultSet = getClasses("bor.vulkan");
        
        Class<?> clazz = Class.forName(baseInterface);
        classes.addAll(filter(resultSet, clazz));
        
        return classes;        
    }
    
    /**
     * Filter classes.
     * 
     * @see Class#isAssignableFrom(Class)
     * @param classes list of classes to filter
     * @param superClass - super class filter
     * @return list of subclasses of superclass found 
     */
    public static List<Class<?>> filter(List<Class<?>> classes, Class<?> superClass){
        List<Class<?>> filt = new ArrayList<Class<?>>(128);
        for (Class<?> cc : classes) {
            if(superClass.isAssignableFrom(cc)){
                filt.add(cc);
            }
        }
        
        return filt;
    }
    
    //The code below gets all classes within a given package. 
    //Notice that it should only work for classes found locally, 
    //getting really ALL classes is impossible.
    /**
     * Scans all classes accessible from the context class loader which belong to the given package and subpackages.
     *
     * @param packageName The base package
     * @return The classes
     * @throws ClassNotFoundException
     * @throws IOException
     */
    @SuppressWarnings("unused")
    public static List<Class<?>> /*Class[]*/ getClasses(String packageName)
            throws ClassNotFoundException, IOException {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        assert classLoader != null;
        String path = packageName.replace('.', '/');
        Enumeration<URL> resources = classLoader.getResources(path);
        List<File> dirs = new ArrayList<File>();
        while (resources.hasMoreElements()) {
            URL resource = resources.nextElement();
            dirs.add(new File(resource.getFile()));
        }
        ArrayList<Class<?>> classes = new ArrayList<Class<?>>();
        for (File directory : dirs) {
            classes.addAll(findClasses(directory, packageName));
        }
//        return (Class[]) classes.toArray(new Class[classes.size()]);
        return classes;
    }
    /**
     * Recursive method used to find all classes in a given directory and subdirs.
     *
     * @param directory   The base directory
     * @param packageName The package name for classes found inside the base directory
     * @return The classes
     * @throws ClassNotFoundException
     */
    public static List<Class<?>> findClasses(File directory, String packageName) throws ClassNotFoundException {
        List<Class<?>> classes = new ArrayList<Class<?>>();
        if (!directory.exists()) {
            return classes;
        }
        File[] files = directory.listFiles();
        for (File file : files) {
            if (file.isDirectory()) {
                assert !file.getName().contains(".");
                classes.addAll(findClasses(file, packageName + "." + file.getName()));
            } else if (file.getName().endsWith(".class")) {
                classes.add(Class.forName(packageName + '.' + file.getName().substring(0, file.getName().length() - 6)));
            }
        }
        return classes;
    }
    
    /**
     * Check if a given string base contains at least a substring from valuesToTest
     * 
     * @param base string which may or may not contain a substring
     * @param subStrings array of substrings to test
     * 
     * @return true if at least one valuesToTest is substring of base
     */
    public static boolean contains(String base, String[] subStrings){
        for (int i = 0; i < subStrings.length; i++) {
            String sub = subStrings[i].trim();
            if(base.contains(sub))
                return true;
        }        
        return false;
    }
    
    /**
     * Check is a certain string look is contained in a array of strings.
     * @param array - array os strings
     * @param exactString - the searched string
     * 
     * @return true if searched exactString is contained in array
     */
    public static boolean containsString(String[] array, String exactString){ 
        exactString = exactString.trim();
        for (String s : array) {
            if(exactString.equalsIgnoreCase(s.trim())){
                return true;
            }
        }
        return false;
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
    
    /**
     * find next line index
     * @param lines -  list of lines
     * @param exp - expression
     * @param curLine - current line
     * @return line index where it found exp
     */
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
     * Save file
     * @param folder - folder to write to
     * @param name - filename
     * @param text2Save - text to save
     */
    public static void save(String folder, String name, String text2Save) {
        BufferedWriter output = null;
        try {
            File file = new File(folder + "//" + name);
            output = new BufferedWriter(new FileWriter(file));
            output.write(text2Save);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (output != null) {
                try {
                    output.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
    }//save
    
    /**
     * Read a file
     * @param basePath
     * @param fileName
     * @return
     */
    public static List<String> readFile(String basePath, String fileName){
        Path path = FileSystems.getDefault().getPath(basePath, fileName);
        List<String> lines = null;
        try {
            lines = Files.readAllLines(path, Charset.defaultCharset());
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return lines;
    }

}
