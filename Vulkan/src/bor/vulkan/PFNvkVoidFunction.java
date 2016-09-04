/**
 * 
 */
package bor.vulkan;

import java.nio.ByteBuffer;

/**
 * @author Alessandro Borges
 *
 */
public class PFNvkVoidFunction extends VkHandle implements PFNFunction, VkHandleInterface {

    /**
     * 
     */
    public PFNvkVoidFunction() {
    }

    /**
     * @param nativePtr
     */
    public PFNvkVoidFunction(long nativePtr) {
        super(nativePtr);      
    }
    /**
     * @param nativePtr
     */
    public PFNvkVoidFunction(ByteBuffer nativePtr) {
        super(nativePtr);      
    }

}
