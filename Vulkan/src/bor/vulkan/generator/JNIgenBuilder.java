package bor.vulkan.generator;

import com.badlogic.gdx.jnigen.*;
import com.badlogic.gdx.jnigen.BuildTarget.TargetOs;
import com.badlogic.gdx.jnigen.parsing.*;

public class JNIgenBuilder {

    private JNIgenBuilder() {}

    public static void main(String[] args) throws Exception {
        NativeCodeGenerator jnigen = new NativeCodeGenerator();
        jnigen.generate("src", "bin", "jni", new String[] {"**/bor/vulkan/VkObject.java"}, null);

        BuildTarget win32 = BuildTarget.newDefaultTarget(TargetOs.Windows, false);
        win32.compilerPrefix = "mingw32-";
        BuildTarget win64 = BuildTarget.newDefaultTarget(TargetOs.Windows, true);
        //BuildTarget linux32 = BuildTarget.newDefaultTarget(TargetOs.Linux, false);
        //BuildTarget linux64 = BuildTarget.newDefaultTarget(TargetOs.Linux, true);
        //BuildTarget mac = BuildTarget.newDefaultTarget(TargetOs.MacOsX, true);

        new AntScriptGenerator().generate(new BuildConfig("my-native-lib"), win32, win64);
       // BuildExecutor.executeAnt("jni/build-windows32.xml", "-v -Dhas-compiler=true clean postcompile");
        BuildExecutor.executeAnt("jni/build-windows64.xml", "-v -Dhas-compiler=true clean postcompile");
        // BuildExecutor.executeAnt("jni/build-linux32.xml", "-v -Dhas-compiler=true clean postcompile");
        // BuildExecutor.executeAnt("jni/build-linux64.xml", "-v -Dhas-compiler=true clean postcompile");
        // BuildExecutor.executeAnt("jni/build-macosx32.xml", "-v -Dhas-compiler=true  clean postcompile");
       // BuildExecutor.executeAnt("jni/build.xml", "-v pack-natives");

    }

}
