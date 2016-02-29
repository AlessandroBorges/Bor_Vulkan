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
public class WlSurface extends VkHandlerConcrete implements VkHandle {

    /**
     * @param nativePtr
     */
    public WlSurface(ByteBuffer nativePtr) {
        super(nativePtr);       
    }

}
