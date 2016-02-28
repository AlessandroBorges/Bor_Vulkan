/**
 * 
 */
package bor.vulkan;

import java.nio.ByteBuffer;

/**
 * @author Alessandro Borges
 *
 */
public class PFN_vkDebugReportCallbackEXT extends VkHandlerConcrete implements PFN_Function, VkHandle {

    /**
     * @param nativePtr
     */
    public PFN_vkDebugReportCallbackEXT(ByteBuffer nativePtr) {
        super(nativePtr);        
    }
    
    
    /**
     *  Implements {@link VkObject#getType()}. <br>
     *  Always return {@link VkObject#TYPE_PFN_FUNCTION}
     *  
     *  @return VkObject.TYPE_PFN_FUNCTION
     */
     @Override
    public int getType(){
        return VkObject.TYPE_PFN_FUNCTION;
    }

}
