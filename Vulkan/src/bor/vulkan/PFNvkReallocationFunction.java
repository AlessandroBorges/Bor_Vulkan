/**
 * 
 */
package bor.vulkan;

import java.nio.ByteBuffer;

/**
 * Class to wrap PFNvkReallocationFunction pointers.<br>
 * 
 * As stated in VkHandleInterface interface,
 * it uses a Direct ByteBuffer to store native pointers.
 * 
 * @author Alessandro Borges
 *
 */
public class PFNvkReallocationFunction extends VkHandle implements PFNFunction, VkHandleInterface {

    private PFNvkReallocationFunction() {
    }

    /**
     * Package protected Ctor.<br>
     * 
     * @param nativePtr - pointer to native PFNvkReallocationFunction pointer
     */
    public PFNvkReallocationFunction(ByteBuffer nativePtr) {
        super(nativePtr);
    }

    public PFNvkReallocationFunction(long nativePtr) {
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
    public static P<PFNvkReallocationFunction> createNullPointer() {
        P<PFNvkReallocationFunction> p = new P<PFNvkReallocationFunction>(new PFNvkReallocationFunction());
        return p;
    }

}
