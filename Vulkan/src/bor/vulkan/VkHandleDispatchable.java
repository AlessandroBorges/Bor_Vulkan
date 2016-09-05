/**
 * 
 */
package bor.vulkan;

import java.nio.ByteBuffer;

import bor.util.BigBuffer;

/**
 * Concrete class for Vulkan Dispatchable Handle.<br>
 * In contrast with NON-Dispatchable handles, which are <b>always</b> 8 bytes long,
 * the VkHandleDispatchable has same size in bytes as native C <code><b> (void*)</b> type</code>.<br>
 * In 32bit JVM it is 4 bytes long and on 64bit JVM it is 8 bytes long.<br>
 *    
 * Current Dispatchable Handlers are the following: 
 * <li> {@link VkInstance}
 * <li> {@link VkPhysicalDevice} 
 * <li> {@link VkDevice }
 * <li> {@link VkQueue }
 * <li> {@link VkCommandBuffer} 
 * 
 * @author Alessandro Borges
 *
 */
public class VkHandleDispatchable
 implements VkHandleDispatchableInterface,
            VkInstance, VkPhysicalDevice, 
            VkDevice, VkCommandBuffer, VkQueue 
             
 {
    /**
     * Dispatchable class names.
     */
    public static final String[] DISPACHABLE_HANDLE_NAMES = { "VkInstance", 
                                                              "VkPhysicalDevice", 
                                                              "VkDevice", 
                                                              "VkCommandBuffer", 
                                                              "VkQueue"} ;
    /**
     * Native handle value.
     */
    private long nativeHandle = 0;

    /**
     * Ctor for Null value.
     */
    public VkHandleDispatchable() {
    }

   
    /**
     * @param nativeHandle
     */
    public VkHandleDispatchable(long nativeHandle) {
       this.nativeHandle = nativeHandle;      
    }
    
    /**
     * Return size in byte of this VkHandle
     */
    public int sizeof(){
        return Vk10.SIZE_OF_DISPATCHABLE_HANDLE;
    }
    
    /**
     * Implements {@link VkObject#getType()}
     * Always return {@link VkObject#TYPE_HANDLER}
     */
    @Override
    public int getType(){
        return VkObject.TYPE_DISPATCHABLE_HANDLER;
    }


   /**
    * Creates a VkArray 
    * @param size
    * @return
    */
    public VkArrayHandleDispatchable<VkHandleDispatchable> createVkArrayDispatchable(int size) {
        VkHandleDispatchable[] array = new VkHandleDispatchable[size];        
        VkArrayHandleDispatchable<VkHandleDispatchable> 
              vkArray = new VkArrayHandleDispatchable<VkHandleDispatchable>(array);
        return vkArray;
    }
        
   
    /**
     * Create a immutable VkArray list for <em>VkInstance</em> dispatchable handle.<br>
     * @param size - - size of list
     * @return immutable list of VkInstance handles, with initial zero value.
     */
    public static VkArrayHandleDispatchable<VkInstance> createArrayVkInstance(int size) {
        VkInstance[] array = new VkInstance[size];        
        VkArrayHandleDispatchable<VkInstance> 
            vkArray = new VkArrayHandleDispatchable<VkInstance>(array);
        return vkArray;
    }
    
    /**
     * Create a immutable VkArray list for <em>VkPhysicalDevice</em> dispatchable handle.<br>
     * @param size - - size of list
     * @return immutable list of VkPhysicalDevice handles, with initial zero value.
     */
    public static VkArrayHandleDispatchable<VkPhysicalDevice> createArrayVkPhysicalDevice(int size) {
        VkPhysicalDevice[] array = new VkPhysicalDevice[size];        
        VkArrayHandleDispatchable<VkPhysicalDevice> 
            vkArray = new VkArrayHandleDispatchable<VkPhysicalDevice>(array);
        return vkArray;
    }
    
    
    /**
     * Create a immutable VkArray list for <em>VkDevice</em> dispatchable handle.<br>
     * @param size - - size of list
     * @return immutable list of VkDevice handles, with initial zero value.
     */
    public static VkArrayHandleDispatchable<VkDevice> createArrayVkDevice(int size) {
        VkDevice[] array = new VkDevice[size];        
        VkArrayHandleDispatchable<VkDevice> 
            vkArray = new VkArrayHandleDispatchable<VkDevice>(array);
        return vkArray;
    }
    
    /**
     * Create a immutable VkArray list for <em>VkQueue</em> dispatchable handle.<br>
     * @param size - size of list
     * @return immutable list of VkQueue handles, with initial zero value.
     */
    public static VkArrayHandleDispatchable<VkQueue> createArrayVkQueue(int size) {
        VkQueue[] array = new VkQueue[size];        
        VkArrayHandleDispatchable<VkQueue> 
            vkArray = new VkArrayHandleDispatchable<VkQueue>(array);
        return vkArray;
    }
    
    /**
     * Create a immutable VkArray list for <em>VkCommandBuffer</em> dispatchable handle.<br>
     * @param size - size of list
     * @return immutable list of VkCommandBuffer handles, with initial zero value.
     */
    public static VkArrayHandleDispatchable<VkCommandBuffer> createArrayVkCommandBuffer(int size) {
        VkCommandBuffer[] array = new VkCommandBuffer[size];        
        VkArrayHandleDispatchable<VkCommandBuffer> 
            vkArray = new VkArrayHandleDispatchable<VkCommandBuffer>(array);
        return vkArray;
    }


    @Override
    public ByteBuffer getPointer() {
        // TODO Auto-generated method stub
        return null;
    }


    @Override
    public long getNativeHandle() {        
        return nativeHandle;
    }

    /**
     * Set new native pointer
     */
    @Override
    public void setPointer(long nativeHandler) {
        this.nativeHandle = nativeHandler;
    }


    @Override
    public boolean free() {
        nativeHandle = 0;
        return false;
    }

    /**
     * Return true is this objects points to a null native pointer.
     */
    @Override
    public boolean isNull() {        
        return nativeHandle == 0L;
    }


    /**
     *  UnsupportedOperationException
     */
    @Override
    public void setPointer(ByteBuffer nativePtr) throws UnsupportedOperationException {
        throw new UnsupportedOperationException("");
    }


    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("VkHandleDispatchable [nativeHandle=").append(nativeHandle).append("]");
        return builder.toString();
    }

}
