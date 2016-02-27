/**
 * 
 */
package bor.vulkan;

import java.nio.ByteBuffer;

/**
 * Class to wrap PFN_vkReallocationFunction pointers.<br>
 * 
 * As stated in VkHandle interface, 
 * it uses a Direct ByteBuffer to store native pointers.
 * 
 * @author Alessandro Borges
 *
 */
public class PFN_vkReallocationFunction extends VkHandlerConcrete implements PFN_Function, VkHandle {

    /**
     * Package protected Ctor.<br>
     * 
     * @param nativePtr - pointer to native PFN_vkReallocationFunction pointer
     */
     PFN_vkReallocationFunction(ByteBuffer nativePtr) {
        super(nativePtr);       
    }

}
