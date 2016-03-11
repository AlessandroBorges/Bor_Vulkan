/**
 * 
 */
package bor.vulkan;

import java.nio.ByteBuffer;

/**
 * @author Alessandro Borges
 *
 */
public class PFNvkDebugReportCallbackEXT extends VkHandle implements PFN_Function, VkHandleInterface {

    
    private PFNvkDebugReportCallbackEXT(){
        
    }
    
    /**
     * @param nativePtr
     */
    public PFNvkDebugReportCallbackEXT(ByteBuffer nativePtr) {
        super(nativePtr);
    }

    /**
     * Implements {@link VkObject#getType()}. <br>
     * Always return {@link VkObject#TYPE_PFN_FUNCTION}
     * 
     * @return VkObject.TYPE_PFN_FUNCTION
     */
    @Override
    public int getType() {
        return VkObject.TYPE_PFN_FUNCTION;
    }

    /**
     * Create a pointer P to contains a instance of this,
     * with unset native pointer.
     * Use {@link VkStruct#setPointer(ByteBuffer)} to set
     * valid native pointer.
     * 
     * @return An instance of P for this VkStruct with null pointer
     */
    public static P<PFNvkDebugReportCallbackEXT> createNullPointer() {
        P<PFNvkDebugReportCallbackEXT> p = new P<PFNvkDebugReportCallbackEXT>(new PFNvkDebugReportCallbackEXT());
        return p;
    }

}
