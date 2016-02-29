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
public class Win32HINSTANCE extends VkHandlerConcrete implements VkHandle {

    /**
     * @param nativePtr
     */
    public Win32HINSTANCE(ByteBuffer nativePtr) {
        super(nativePtr);       
    }

}
