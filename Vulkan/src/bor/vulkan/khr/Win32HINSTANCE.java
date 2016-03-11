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
public class Win32HINSTANCE extends VkHandle implements VkHandleInterface {

    private Win32HINSTANCE(){
        super();
    }
    
    /**
     * @param nativePtr
     */
    public Win32HINSTANCE(ByteBuffer nativePtr) {
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
    public static P<Win32HINSTANCE> createNullPointer() {
        P<Win32HINSTANCE> p = new P<Win32HINSTANCE>(new Win32HINSTANCE());
        return p;
    }

}
