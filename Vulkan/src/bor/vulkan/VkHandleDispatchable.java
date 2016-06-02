/**
 * 
 */
package bor.vulkan;

import java.nio.ByteBuffer;

/**
 * Dispatchable are Vulkan handle objects.<br>
 * In contrast with NON-Dispatchable, which are always 8 bytes long,
 * the VkHandleDispatchable has same size in bytes as (void*).<br>
 * In 32bit JVM it is 4bytes long and on 64bit JVM it is 8 bytes long.<br>
 *    
 * Current Dispatchable Handlers are the following:  
 * <li>VkInstance 
 * <li>VkInstance
 * <li>VkPhysicalDevice 
 * <li>VkDevice 
 * <li>VkQueue 
 * <li>VkCommandBuffer 
 * 
 * @author Alessandro Borges
 *
 */
//public interface VkHandleDispatchable {
//
//}

public class VkHandleDispatchable 
 extends VkHandle
 implements  VkInstance, VkPhysicalDevice, VkDevice, VkCommandBuffer, VkQueue
 {

    /**
     * 
     */
    public VkHandleDispatchable() {
        super();       
    }

    /**
     * @param nativePtr
     */
    public VkHandleDispatchable(ByteBuffer nativePtr) {
        super(nativePtr);      
    }

    /**
     * @param nativeHandle
     */
    public VkHandleDispatchable(long nativeHandle) {
        super(nativeHandle);       
    }
    
    /**
     * Return size in byte of this VkHandle
     */
    public int sizeof(){
        return Vk10.SIZE_OF_HANDLE;
    }

}
