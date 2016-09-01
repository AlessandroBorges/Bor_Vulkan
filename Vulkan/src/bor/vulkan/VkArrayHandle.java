/**
 * 
 */
package bor.vulkan;

import bor.util.BigBuffer;

/**
 * Immutable list of <b>Non Dispatchable Handles</b>.<br>
 * @author Alessandro Borges
 *
 */
public class VkArrayHandle<E extends VkHandle> extends VkArray<VkHandle> {

    /**
     * Private constructor    
     * @param array
     */
    protected VkArrayHandle(VkHandle[] array){
        this.array = array;
        this.bigBuffer = new BigBuffer<VkHandle>(array, false);
        this.bigBuffer.update();
    }
    
   
}

