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
public class XCBconnection extends VkHandlerConcrete implements VkHandle {

    /**
     * @param nativePtr
     */
    public XCBconnection(ByteBuffer nativePtr) {
        super(nativePtr);        
    }

}
