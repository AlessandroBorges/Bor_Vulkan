/**
 * 
 */
package bor.vulkan.khr;

import java.nio.ByteBuffer;

import bor.vulkan.VkHandle;
import bor.vulkan.VkHandlerConcrete;

/**
 * @author Alessandro Borges
 *
 */
public class MirSurface extends VkHandlerConcrete implements VkHandle {

    /**
     * @param nativePtr
     */
    public MirSurface(ByteBuffer nativePtr) {
        super(nativePtr);       
    }
    

}
