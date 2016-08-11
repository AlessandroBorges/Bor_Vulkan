package bor.vulkan.generator;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

import com.badlogic.gdx.jnigen.*;
import com.badlogic.gdx.jnigen.BuildTarget.TargetOs;
import com.badlogic.gdx.jnigen.parsing.*;

public class JNIgenBuilder {

    private static final String PREFIX_STRUCT = "**/bor/vulkan/structs/";
    private static final String SUFIX_JAVA = ".java";
    
    /**
     * Append values in String array
     **/
    public static String[] append(String[] base, List<String> newValues){
        int size = base.length + newValues.size();
        String[] res = new String[size];
        System.arraycopy(base, 0, res, 0, base.length);
        
        String[] list = new String[newValues.size()];
        list = newValues.toArray(list);
        System.arraycopy(list, 0, res, base.length, newValues.size());
        
        return res;
    }
    
    /**
     * 
     */
    private static String[] fixPrefixSufix(String[] names, String prefix, String sufix) {
        
        for (int i = 0; i < names.length; i++) {
            String name = names[i].trim();
            
            if (!name.startsWith(prefix)) {
                String nm = prefix + name;
                names[i] = nm;
            }

            if (!name.endsWith(sufix)) {
                String nm = names[i] + sufix;
                names[i] = nm.trim();
            }
        }
        return names;
    }
    
    private JNIgenBuilder() {}

    public static void main(String[] args) throws Exception {
        //java.net.URL url = JNIgenBuilder.class.getResource("Struct.txt");
        //System.out.println("URL " +url);
        List<String> structNames = Util.readFile("D:/Users/Livia/workspace/Vulkan/src/bor/vulkan/generator/", "Structs.txt");
        
        structNames.remove("VkClearColor");
        structNames.remove("VkClearColorValue");
        structNames.remove("VkClearDepthStencilValue");
        String[] src = {
                "**/bor/util/Utils.java",
              //  "**/bor/vulkan/khr/WSI.java",
                "**/bor/vulkan/Vk10.java",
                "**/bor/vulkan/structs/VkStruct.java",
        };
        
        src = append(src, structNames);
        src = fixPrefixSufix(src, PREFIX_STRUCT, SUFIX_JAVA);
        for (int i = 0; i < src.length; i++) {
            String string = src[i];
            System.out.println(string);
        }
        
        
        //System.exit(0);
        long t1 = System.currentTimeMillis();
        
        NativeCodeGenerator jnigen = new NativeCodeGenerator();
        jnigen.setUsePrimitiveArrayCritical(false);
        jnigen.generate("src", "bin", "jni", 
                        src, 
                        null);
        long t2 = System.currentTimeMillis();
        
        BuildTarget win32 = BuildTarget.newDefaultTarget(TargetOs.Windows, false);
        win32.compilerPrefix = "mingw32-";
        win32.cppFlags += " -std=gnu++11 -I/D/VulkanSDK/1.0.11.1/Include -L/D/VulkanSDK/1.0.11.1/Bin";
        
        String[] includes = {"-I/D/VulkanSDK/1.0.11.1/Include"};
        
        BuildTarget win64 = BuildTarget.newDefaultTarget(TargetOs.Windows, true);
       // win64.cFlags += " -std=gnu++11";
       // System.err.println("cppFlags : " + win64.cppFlags ); -c -Wall -O2 -mfpmath=sse -msse2 -fmessage-length=0 -m64
        win64.cppFlags = " -c -Wall -mfpmath=sse -msse2 -fmessage-length=80 -m64 -std=gnu++11 -O0 -pipe ";
       // win64.cppFlags += "-MMD -MP -MF \"jni/target\" ";
        System.err.println(win64.cppIncludes);
       // win64.cppIncludes = includes;    
        //win64.libraries += "-LD:/VulkanSDK/1.0.11.1/Bin -lvulkan-1 ";
        win64.linkerFlags +=" ";
        
        //BuildTarget linux32 = BuildTarget.newDefaultTarget(TargetOs.Linux, false);
        //BuildTarget linux64 = BuildTarget.newDefaultTarget(TargetOs.Linux, true);
        //BuildTarget mac = BuildTarget.newDefaultTarget(TargetOs.MacOsX, true);

        new AntScriptGenerator().generate(new BuildConfig("BorVulkan"), win64);
       // BuildExecutor.executeAnt("jni/build-windows32.xml", "-v -Dhas-compiler=true clean postcompile");
        BuildExecutor.executeAnt("jni/build-windows64.xml", "-v -Dhas-compiler=true clean postcompile");
        // BuildExecutor.executeAnt("jni/build-linux32.xml", "-v -Dhas-compiler=true clean postcompile");
        // BuildExecutor.executeAnt("jni/build-linux64.xml", "-v -Dhas-compiler=true clean postcompile");
        // BuildExecutor.executeAnt("jni/build-macosx32.xml", "-v -Dhas-compiler=true  clean postcompile");
        BuildExecutor.executeAnt("jni/build.xml", "-v pack-natives");
        long t3 = System.currentTimeMillis();
        
        Date dateCodeGen = new Date(t2-t1);
        Date dateCompile = new Date(t3-t2);
        Date dateOverall = new Date(t3-t1);
        
        SimpleDateFormat fmt = new SimpleDateFormat(" mm:ss.SSS");
       System.out.println("Time to Generate Code: " +  fmt.format(dateCodeGen));
       System.out.println("Time to Compile  Code: " +  fmt.format(dateCompile));
       System.out.println("Total Time           : " +    fmt.format(dateOverall));
        
        
    }

}
