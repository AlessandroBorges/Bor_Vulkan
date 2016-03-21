/**
 * 
 */
package bor.vulkan;

import java.nio.ByteBuffer;

/**
 * @author Alessandro Borges
 *
 */
public class PFNvkVoidFunction extends VkHandle implements PFN_Function, VkHandleInterface {

    /**
     * 
     */
    public PFNvkVoidFunction() {
    }

    /**
     * @param nativePtr
     */
    public PFNvkVoidFunction(ByteBuffer nativePtr) {
        super(nativePtr);      
    }

}
