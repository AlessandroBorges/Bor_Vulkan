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
public class XCBwindow extends VkHandlerConcrete implements VkHandle {

    /**
     * @param nativePtr
     */
    public XCBwindow(ByteBuffer nativePtr) {
        super(nativePtr);       
    }

}
