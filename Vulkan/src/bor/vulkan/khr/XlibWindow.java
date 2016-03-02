/**
 * 
 */
package bor.vulkan.khr;

import java.nio.ByteBuffer;

import bor.vulkan.VkHandle;
import bor.vulkan.VkHandlerConcrete;

/**
 * Handler for Xlib's Window
 * @author Alessandro Borges
 *
 */
public class XlibWindow extends VkHandlerConcrete implements VkHandle {

    /**
     * @param nativePtr
     */
    public XlibWindow(ByteBuffer nativePtr) {
        super(nativePtr);
        // TODO Auto-generated constructor stub
    }

}
