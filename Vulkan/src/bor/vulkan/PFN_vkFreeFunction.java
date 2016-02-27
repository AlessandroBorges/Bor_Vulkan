/**
 * 
 */
package bor.vulkan;

import java.nio.ByteBuffer;

/**
 * Class to wrap PFN_vkFreeFunction pointers.<br>
 * 
 * As stated in VkHandle interface, 
 * it uses a Direct ByteBuffer to store native pointers.
 * 
 * @author Alessandro Borges
 *
 */
public class PFN_vkFreeFunction extends VkHandlerConcrete implements PFN_Function, VkHandle {

    /**
     * Package protected Ctor <br>
     * 
     * @param nativePtr - pointer to native PFN_vkFreeFunction
     */
    PFN_vkFreeFunction(ByteBuffer nativePtr) {
        super(nativePtr);        
    }

}
