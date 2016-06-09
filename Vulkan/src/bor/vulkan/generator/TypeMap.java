/**
 * 
 */
package bor.vulkan.generator;

import static bor.vulkan.generator.Util.*;
import static bor.vulkan.generator.JNITypeMap.*;

/**
 * <pre>
 * Class to store mapping types.
 * It contains:
 *      1. C/C++ type
 *      2. Java type [primitive, array, or wrapping class]
 *      2.1 Java method to call Bridge type [*.getPointer(), *.getValue(), etc] 
 *      3. Bridge type - a Java type to reduce JNI overload
 *          it can be: [ByteBuffer, primitive array, primitive type, String]
 *      4.  JNI cast type. Possibly the C/C++ type.
 * </pre>
 * 
 * @author Alessandro Borges
 *
 */
public class TypeMap {

    public String cppType;
    public String jType;
    public String methType;
    public String bridgeType;
    public String jniCastType;
    
    
    /**
     * For wrapped types, get the method returning the 
     *  type for JNI call  
     * the wraped type
     * 
     * @param jType
     * @return
     */
    public static String findMethod2Bridging(String jType){
        
        if(isVkHandler(jType)){
            return ".getNativeHandle()";
        }
        
        if(isVkStruct(jType)){
            return ".getPointer()";
        }
        
        Util.CLASS_TYPE classType = getType(jType);
        
        switch (classType) {
            case VKHANDLE: return ".getNativeHandle()";
            case VKSTRUCT: return ".getPointer()";    
            case VKOBJECT: return ".getPointer()";
            case VKENUM:   return ".getValue()";
            default:
                break;
        }
        
        
        return "";
    }
    
    
    
    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "cppType=" + cppType + 
                ", jType=" + jType + 
                ", methType=" + methType + 
                ", bridgeType=" + bridgeType + 
                ", jniCastType=" + jniCastType;
    }
    
    

   

}
