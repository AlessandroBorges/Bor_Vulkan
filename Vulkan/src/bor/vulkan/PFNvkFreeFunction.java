/**
 * 
 */
package bor.vulkan;

import java.nio.ByteBuffer;

/**
 * Class to wrap PFNvkFreeFunction pointers.<br>
 * 
 * As stated in VkHandleInterface interface,
 * it uses a Direct ByteBuffer to store native pointers.
 * 
 * @author Alessandro Borges
 *
 */
public class PFNvkFreeFunction extends VkHandle implements PFNFunction, VkHandleInterface {

    private PFNvkFreeFunction() {
    }

    /**
     * Package protected Ctor <br>
     * 
     * @param nativePtr - pointer to native PFNvkFreeFunction
     */
    public PFNvkFreeFunction(ByteBuffer nativePtr) {
        super(nativePtr);
    }
    
    public PFNvkFreeFunction(long nativePtr) {
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
    public static P<PFNvkFreeFunction> createNullPointer() {
        P<PFNvkFreeFunction> p = new P<PFNvkFreeFunction>(new PFNvkFreeFunction());
        return p;
    }

}
