/**
 * 
 */
package bor.vulkan.khr;

import java.nio.ByteBuffer;

import bor.vulkan.P;
import bor.vulkan.VkHandleInterface;
import bor.vulkan.VkHandler;

/**
 * Handler for Xlib's Window
 * 
 * @author Alessandro Borges
 *
 */
public class XlibWindow extends VkHandler implements VkHandleInterface {

    private XlibWindow() {
    }

    /**
     * @param nativePtr
     */
    public XlibWindow(ByteBuffer nativePtr) {
        super(nativePtr);
    }

    /**
     * Create a pointer P to contains a instance of this,
     * with unset native pointer.
     * Use {@link VkStruct#setPointer(ByteBuffer)} to set
     * valid native pointer.
     * 
     * @return An instance of P for this VkStruct with null pointer
     */
    public static P<XlibWindow> createNullPointer() {
        P<XlibWindow> p = new P<XlibWindow>(new XlibWindow());
        return p;
    }

}
