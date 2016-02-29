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
public class XlibDisplay extends VkHandlerConcrete implements VkHandle {

    /**
     * @param nativePtr
     */
    public XlibDisplay(ByteBuffer nativePtr) {
        super(nativePtr);       
    }

}
