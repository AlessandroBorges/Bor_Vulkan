/**
 * 
 */
package bor.vulkan;

import java.nio.ByteBuffer;

/**
 * Class to wrap PFN_vkInternalAllocationNotification pointers.<br>
 * 
 * As stated in VkHandle interface, 
 * it uses a Direct ByteBuffer to store native pointers.
 * 
 * @author Alessandro Borges
 *
 */
public class PFN_vkInternalAllocationNotification extends VkHandlerConcrete implements PFN_Function, VkHandle {

    /**
     * Package protected Ctor.
     * 
     * @param nativePtr -  pointer to native PFN_vkInternalAllocationNotification
     */
    PFN_vkInternalAllocationNotification(ByteBuffer nativePtr) {
        super(nativePtr);        
    }

}
