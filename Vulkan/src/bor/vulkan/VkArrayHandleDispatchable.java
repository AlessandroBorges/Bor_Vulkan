/**
 * 
 */
package bor.vulkan;

import bor.util.BigBuffer;

/**
 * Immutable list of <b>Dispatchable Handlers</b>.<br>
 * Dispatchable handles are the following:
 * <li> {@link VkInstance}
 * <li> {@link VkDevice}
 * <li> {@link VkPhysicalDevice}
 * <li> {@link VkCommandBuffer}
 * <li> {@link VkQueue}
 * 
 * @param <E> -  VkHandleDispatchable subclass, i.e., VkInstance, VkPhysicalDevice, 
 *           VkDevice, VkCommandBuffer, VkQueue.
 *           
 * @author Alessandro Borges          
 */
public class VkArrayHandleDispatchable<E extends VkHandleDispatchableInterface> 
  extends VkArray<VkHandleDispatchableInterface>{
    
    /**
    * Ctor.<br>
    * Creates a VkArrayHandleDispatchable for a Dispatchable handle.
    * @param array - array of Dispatchable handle.
    */
   protected VkArrayHandleDispatchable(VkHandleDispatchableInterface[] array){
       this.array = array;
       this.bigBuffer = new BigBuffer<VkHandleDispatchableInterface>(array, true);
       this.bigBuffer.update();
   }
}
