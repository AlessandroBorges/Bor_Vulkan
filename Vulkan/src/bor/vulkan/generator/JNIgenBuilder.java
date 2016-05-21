package bor.vulkan.generator;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.badlogic.gdx.jnigen.*;
import com.badlogic.gdx.jnigen.BuildTarget.TargetOs;
import com.badlogic.gdx.jnigen.parsing.*;

public class JNIgenBuilder {

    private JNIgenBuilder() {}

    public static void main(String[] args) throws Exception {
        
        String[] src = {
                "**/bor/util/Utils.java",
                "**/bor/vulkan/khr/WSI.java",
                "**/bor/vulkan/Vk10.java",
                "**/bor/vulkan/structs/VkStruct.java",
                "**/bor/vulkan/structs/VkApplicationInfo.java",
                "**/bor/vulkan/structs/VkDeviceQueueCreateInfo.java",               
                "**/bor/vulkan/structs/VkPhysicalDeviceProperties.java",
                "**/bor/vulkan/structs/VkPhysicalDeviceType.java",
                "**/bor/vulkan/structs/VkPhysicalDeviceLimits.java",
                "**/bor/vulkan/structs/VkPhysicalDeviceSparseProperties.java",
                "**/bor/vulkan/structs/VkPhysicalDeviceFeatures.java",
                "**/bor/vulkan/structs/VkPhysicalDeviceMemoryProperties.java",
                "**/bor/vulkan/structs/VkLayerProperties.java",
                "**/bor/vulkan/structs/VkWin32SurfaceCreateInfoKHR",
                "**/bor/vulkan/structs/VkExtent2D.java",
                "**/bor/vulkan/structs/VkExtent3D.java",
                "**/bor/vulkan/structs/VkQueueFamilyProperties.java",
                "**/bor/vulkan/structs/VkMemoryType.java",
                
                "**/bor/vulkan/structs/VkDisplaySurfaceCreateInfoKHR.java",
                "**/bor/vulkan/structs/VkXcbSurfaceCreateInfoKHR.java",
                "**/bor/vulkan/structs/VkAndroidSurfaceCreateInfoKHR.java",
                "**/bor/vulkan/structs/VkMirSurfaceCreateInfoKHR.java",
                "**/bor/vulkan/structs/VkWaylandSurfaceCreateInfoKHR.java",
                "**/bor/vulkan/structs/VkExtensionProperties.java",
                
                
                "**/bor/vulkan/structs/VkMemoryHeap.java",
               // "**/bor/vulkan/structs/VkMemoryHeap.java",
                //VkMemoryHeap
                
                "**/bor/vulkan/structs/VkDeviceCreateInfo.java",
                "**/bor/vulkan/structs/vkGetPhysicalDeviceFeatures.java",
                //vkGetPhysicalDeviceFeatures(
                "**/bor/vulkan/structs/VkInstanceCreateInfo.java",
                "**/bor/vulkan/structs/VkInstanceCreateInfo.java",//VkAllocationCallbacks
                //VkPhysicalDeviceProperties
          
        };
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
