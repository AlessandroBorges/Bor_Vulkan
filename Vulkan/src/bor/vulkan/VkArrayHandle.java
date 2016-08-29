/**
 * 
 */
package bor.vulkan;

import bor.util.BigBuffer;

/**
 * 
 * @author Alessandro Borges
 *
 */
class VkArrayHandle<E> extends VkArray<VkHandle> {

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

/**
 * Immutable list of <b>Dispatchable Handlers</b>
 * @author Alessandro Borges
 *
 * @param <E>
 */
class VkArrayHandleDispatchable<E> extends VkArray<VkHandleDispatchable>{
    /**
    * 
    * @param array
    */
   protected VkArrayHandleDispatchable(VkHandleDispatchable[] array){
       this.array = array;
       this.bigBuffer = new BigBuffer<VkHandleDispatchable>(array, true);
       this.bigBuffer.update();
   }
}
