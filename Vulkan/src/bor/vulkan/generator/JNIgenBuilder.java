package bor.vulkan.generator;

import com.badlogic.gdx.jnigen.*;
import com.badlogic.gdx.jnigen.BuildTarget.TargetOs;
import com.badlogic.gdx.jnigen.parsing.*;

public class JNIgenBuilder {

    private JNIgenBuilder() {}

    public static void main(String[] args) throws Exception {
        
        NativeCodeGenerator jnigen = new NativeCodeGenerator();
        jnigen.generate("src", "bin", "jni", new String[] {"**/bor/vulkan/Vk10.java"}, null);

        BuildTarget win32 = BuildTarget.newDefaultTarget(TargetOs.Windows, false);
        win32.compilerPrefix = "mingw32-";
        win32.cppFlags += " -std=gnu++11 -I/D/VulkanSDK/1.0.5.0/Include -L/D/VulkanSDK/1.0.5.0/Bin";
        
        String[] includes = {"-I/D/VulkanSDK/1.0.5.0/Include"};
        
        BuildTarget win64 = BuildTarget.newDefaultTarget(TargetOs.Windows, true);
       // win64.cFlags += " -std=gnu++11";
        win64.cppFlags += " -std=gnu++11";
        win64.cppIncludes = includes;    
        win64.libraries += "-LD:/VulkanSDK/1.0.5.0/Bin -lvulkan-1 ";
        
        //BuildTarget linux32 = BuildTarget.newDefaultTarget(TargetOs.Linux, false);
        //BuildTarget linux64 = BuildTarget.newDefaultTarget(TargetOs.Linux, true);
        //BuildTarget mac = BuildTarget.newDefaultTarget(TargetOs.MacOsX, true);

        new AntScriptGenerator().generate(new BuildConfig("BorVulkan"), win32, win64);
       // BuildExecutor.executeAnt("jni/build-windows32.xml", "-v -Dhas-compiler=true clean postcompile");
        BuildExecutor.executeAnt("jni/build-windows64.xml", "-v -Dhas-compiler=true clean postcompile");
        // BuildExecutor.executeAnt("jni/build-linux32.xml", "-v -Dhas-compiler=true clean postcompile");
        // BuildExecutor.executeAnt("jni/build-linux64.xml", "-v -Dhas-compiler=true clean postcompile");
        // BuildExecutor.executeAnt("jni/build-macosx32.xml", "-v -Dhas-compiler=true  clean postcompile");
       // BuildExecutor.executeAnt("jni/build.xml", "-v pack-natives");

    }

}
