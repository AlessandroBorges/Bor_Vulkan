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
public class Win32HWND extends VkHandlerConcrete implements VkHandle {

    /**
     * @param nativePtr
     */
    public Win32HWND(ByteBuffer nativePtr) {
        super(nativePtr);       
    }

}
