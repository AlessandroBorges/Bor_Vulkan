package bor.vulkan.generator;

import java.util.*;
import bor.util.Utils;

/**
 * <pre>
 * Class to load methods from  include files.
 * Include files must follow these guidelines:
 *  <li> Before each method there is a tag with //#_method_name_, 
 *  <li> After each methos there is a tag with #END
 *  
 *  Note: _method_name_ is the plain method name.
 * 
 * </pre>
 * 
 * @author Alessandro Borges
 *
 */
public class Include {

    private static final String EXTENSION = ".include";

    String                      name;
    String[]                    methodNames;
    String[]                    methods;
    
    Map<String,String>  mapNameCodes;

    /**
     * Creates a include object
     * 
     * @param lines - list of lines
     * @param name name of include file
     */
    private Include(List<String> lines, String name) {
        this.name = name;
        // count methods
        int count = 0;
        for (String curLine : lines) {
            if (curLine.contains("//#END")) count++;
        }

        methodNames = new String[count];
        methods = new String[count];
        final String TAG = "//#";
        int curMethod = 0;
        String actualMethod = "";
        String codes = "";

        for (String curLine : lines) {
            if (curLine.contains("//#END")) {
                methodNames[curMethod] = actualMethod;
                methods[curMethod] = codes + "\n";
                actualMethod = "";
                codes = "";
                curMethod++;
                continue;
            }
            if (curLine.contains(TAG) && !curLine.contains("//#END")) {
                actualMethod = curLine.replace(TAG, "").trim();
                continue;
            }
            if (actualMethod.length() > 1) {
                codes += curLine + "\n";
            }
        }// for
    }// Ctor

    /**
     * 
     * @param methodName
     * @return
     */
    public String getMethod(String methodName) {
        methodName = methodName.trim();
        for (int i = 0; i < methodNames.length; i++) {
            String name = methodNames[i];
            if (name.equals(methodName)) { 
                return methods[i]; 
                }
        }
        return methodName + " not found !";

    }
    
    /**
     * Verify is this include contains a given method
     * @param methodName - method name to look up
     * @return true if this Include contains methodName
     */
    public boolean contains(String methodName) {
        for (int i = 0; i < methodNames.length; i++) {
            String name = methodNames[i];
            if (name.equals(methodName)) { return true; }
        }
        return false;
    }

    /**
     * Get Method Names
     * 
     * @return
     */
    public String[] getMethodNames() {
        return methodNames;
    }
    
    /**
     * Return a map with method names as key and values as codes
     * @return
     */
    public Map<String, String> getMap(){
        if(mapNameCodes==null){
            mapNameCodes  = new HashMap<String, String>();
            for (int i = 0; i < methodNames.length; i++) {
                mapNameCodes.put(methodNames[i], methods[i]);
            }
        }
        return mapNameCodes;
    }
   
    /**
     * Pop a method from name
     * @param methodName - name of method to pop
     * @return codes from method
     */
    public String popMethod(String methodName){
        Map<String, String> map = getMap();
        String codes = map.get(methodName);
        map.remove(methodName);
        return codes;
    }
    
    /**
     * Pop all remaining methods
     * @return string with remaining methods
     */
    public String popAllMethods(){
        Map<String, String> map = getMap();
        String codes = "";        
        Set<String> keys= map.keySet();
        for (String key : keys) {
            codes += map.get(key) + "\n\n"; 
        }
        map.clear();
        return codes;
    }
    

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Include [name=")
                .append(name)
                .append(",\n methodNames=")
                .append(Arrays.toString(methodNames))
                .append("\n, methods=\n")
                .append(Arrays.toString(methods))
                .append("\n]");
        return builder.toString();
    }

    /**
     * Load a Include file from disk.
     * 
     * @param path - path to include
     * @param name - name of include file
     * 
     * @return null if there is file in disk, or the include object
     */
    public static Include load(String path, String name) {
        name = name.replace(".java", "").trim();
        if (!name.endsWith(EXTENSION)) {
            name += EXTENSION;
        }

        if (path.startsWith("file:/")) {
            path = path.replace("file:/", "");
        }

        String fileName = name;
        if (path.endsWith(name)) {
            path = path.replace(name, "");
        }
        List<String> lines = Util.readFile(path, fileName);
        if (lines == null) return null;

        Include inc = new Include(lines, name);
        return inc;
    }

    /**
     * 
     * @param args
     */
    public static void main(String[] args) {
        java.net.URL url = Include.class.getResource("VkInstanceCreateInfo.include");
        System.out.println("URL: " + url);
        if (url != null) {
            String path = url.toString();
            Include incl = Include.load(path, "VkInstanceCreateInfo");
            
            String[] names = incl.getMethodNames();
            for (int i = 0; i < names.length; i++) {
                String mtd = names[i];
                boolean contains = incl.contains(mtd);
                System.out.println("Include contains " + mtd + " ? " + contains);
                if(contains){
                    String code = incl.getMethod(mtd);
                    System.out.println("Method:\n" + code);
                }
            }
        }
    }
}
