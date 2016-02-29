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
public class WlDisplay extends VkHandlerConcrete implements VkHandle {

    /**
     * @param nativePtr
     */
    public WlDisplay(ByteBuffer nativePtr) {
        super(nativePtr);
    }

}
