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
public class Win32HWND extends VkHandler implements VkHandleInterface {

    private Win32HWND() {
    }

    /**
     * @param nativePtr
     */
    public Win32HWND(ByteBuffer nativePtr) {
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
    public static P<Win32HWND> createNullPointer() {
        P<Win32HWND> p = new P<Win32HWND>(new Win32HWND());
        return p;
    }

}
