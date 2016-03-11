/**
 * 
 */
package bor.vulkan;

import java.nio.ByteBuffer;

/**
 * Class to wrap PFNvkInternalFreeNotification pointers.<br>
 * 
 * As stated in VkHandleInterface interface,
 * it uses a Direct ByteBuffer to store native pointers.
 * 
 * @author Alessandro Borges
 *
 */
public class PFNvkInternalFreeNotification extends VkHandle implements PFN_Function, VkHandleInterface {

    private PFNvkInternalFreeNotification() {
    }

    /**
     * Package protected Ctor.<br>
     * 
     * @param nativePtr - pointer to native PFNvkInternalFreeNotification
     */
    PFNvkInternalFreeNotification(ByteBuffer nativePtr) {
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
    public static P<PFNvkInternalFreeNotification> createNullPointer() {
        P<PFNvkInternalFreeNotification> p = 
                new P<PFNvkInternalFreeNotification>(new PFNvkInternalFreeNotification());
        return p;
    }

}
