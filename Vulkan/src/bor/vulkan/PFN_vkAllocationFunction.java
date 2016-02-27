/**
 * 
 */
package bor.vulkan;

import java.nio.ByteBuffer;

/**
 * Class to wrap PFN_vkAllocationFunction pointers.<br>
 * 
 * As stated in VkHandle interface, 
 * it uses a Direct ByteBuffer to store native pointers.
 * 
 * @author Alessandro Borges
 *
 */
public class PFN_vkAllocationFunction extends VkHandlerConcrete implements PFN_Function, VkHandle {

    /**
     * Package protected Ctor.<br>
     * @param nativePtr - pointer to native PFN_vkAllocationFunction
     */
     PFN_vkAllocationFunction(ByteBuffer nativePtr) {
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
