/**
 * 
 */
package bor.vulkan;

import java.nio.ByteBuffer;

import bor.util.BigBuffer;

/**
 * Dispatchable are Vulkan handle objects.<br>
 * In contrast with NON-Dispatchable handles, which are <b>always</b> 8 bytes long,
 * the VkHandleDispatchable has same size in bytes as native C <code><b> (void*)</b> type</code>.<br>
 * In 32bit JVM it is 4 bytes long and on 64bit JVM it is 8 bytes long.<br>
 *    
 * Current Dispatchable Handlers are the following: 
 * <li>VkInstance
 * <li>VkPhysicalDevice 
 * <li>VkDevice 
 * <li>VkQueue 
 * <li>VkCommandBuffer 
 * 
 * @author Alessandro Borges
 *
 */
public class VkHandleDispatchable 
 //extends VkHandle
 implements  VkInstance, VkPhysicalDevice, VkDevice, VkCommandBuffer, VkQueue, VkHandleInterface
 {
    /**
     * Dispatchable class names.
     */
    public static final String[] DISPACHABLE_HANDLE_NAMES = { "VkInstance", "VkPhysicalDevice", 
                                                              "VkDevice", "VkCommandBuffer", "VkQueue"} ;
    
    private long nativeHandle = 0;

    /**
     * 
     */
    public VkHandleDispatchable() {
        this(0L);       
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
        
        VkArrayHandleDispatchable<VkHandleDispatchable> vkArray = new VkArrayHandleDispatchable(array);
        return vkArray;
    }
    
    
    /**
     * Creates a immutable list of VkArrayHandle.
     * 
     * @param size - size of list
     * @return immutable list of VkArray handles
     */
    public static VkArrayHandleDispatchable createVkArrayDispatchableStatic(int size){
        VkHandleDispatchable[] array = new VkHandleDispatchable[size];        
        VkArrayHandleDispatchable<VkHandleDispatchable> vkArray = new VkArrayHandleDispatchable<VkHandleDispatchable>(array);
        return vkArray;
    }

    @Override
    public VkArrayHandleDispatchable<VkInstance> createArray(int size) {
        // TODO Auto-generated method stub
        return null;
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

}
