/**
 * 
 */
package bor.vulkan.khr;

import java.nio.ByteBuffer;
import bor.vulkan.VkHandlerConcrete;
import bor.vulkan.VkHandle;

/**
 * @TODO - check possible use of P<NativeWindow> instead
 * @author Alessandro Borges
 * 
 */
public class ANativeWindow extends VkHandlerConcrete implements VkHandle {

    /**
     * To be called from native side 
     * 
     * @param nativePtr - ANativeWindow pointer
     */
    protected ANativeWindow(ByteBuffer nativePtr){
        super(nativePtr);
    }    
    
}