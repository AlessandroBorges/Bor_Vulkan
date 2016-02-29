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
public class XlibVisualID extends VkHandlerConcrete implements VkHandle {

    /**
     * @param nativePtr
     */
    public XlibVisualID(ByteBuffer nativePtr) {
        super(nativePtr);       
    }

}
