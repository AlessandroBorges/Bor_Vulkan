/**
 * 
 */
package bor.vulkan.khr;

import java.nio.ByteBuffer;

import bor.vulkan.P;
import bor.vulkan.VkHandleInterface;
import bor.vulkan.VkHandler;

/**
 * @author Alessandro Borges
 *
 */
public class XlibVisualID extends VkHandler implements VkHandleInterface {

    private XlibVisualID() {
    }

    /**
     * @param nativePtr
     */
    public XlibVisualID(ByteBuffer nativePtr) {
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
    public static P<XlibVisualID> createNullPointer() {
        P<XlibVisualID> p = new P<XlibVisualID>(new XlibVisualID());
        return p;
    }

}
