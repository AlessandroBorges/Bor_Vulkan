/**
 * 
 */
package bor.vulkan.khr;

import java.nio.ByteBuffer;

import bor.vulkan.P;
import bor.vulkan.VkHandleInterface;
import bor.vulkan.VkHandle;

/**
 * @author Alessandro Borges
 *
 */
public class WlSurface extends VkHandle implements VkHandleInterface {

    private WlSurface() {
        super();
    }

    /**
     * @param nativePtr
     */
    public WlSurface(ByteBuffer nativePtr) {
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
    public static P<WlSurface> createNullPointer() {
        P<WlSurface> p = new P<WlSurface>(new WlSurface());
        return p;
    }
}
