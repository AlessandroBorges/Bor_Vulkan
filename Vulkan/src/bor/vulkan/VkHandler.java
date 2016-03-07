/**
 * 
 */
package bor.vulkan;

import java.nio.ByteBuffer;
import java.util.Hashtable;
import java.util.Map;

import bor.vulkan.khr.VkDisplayKHR;
import bor.vulkan.khr.VkDisplayModeKHR;
import bor.vulkan.khr.VkSurfaceKHR;
import bor.vulkan.khr.VkSwapchainKHR;

/**
 * Non public class implementing Vulkan handlers.<br>
 * It implements VkHandler super interface and all sub interfaces listed below.<br>
 * In a typical use of this class, it will be created from a native pointer and then <B>(cast)</B>
 * to proper type.<br>
 * 
 * Example use case:
 * <pre>  
 *  private VkInstance vkCreateInstance(...){
 *     ByteBuffer ptr = nativeCreateInstance(...);
 *     VkHandler handler = new VkHandler(ptr);
 *     return (VkInstance) handler;
 *  }  
 * </pre>
 * 
 * After proper usage, you can dispose this handler 
 * by calling {@link #free()} method.<br>
 * Keep in mind that after calling free() 
 * it will release native pointer and be ready to be garbage collected any time. 
 * 
 *
 * @author Alessandro Borges
 * 
 * @see VkHandler
 * @see VkInstance
 * @see VkPhysicalDevice
 * @see VkDevice
 * @see VkQueue
 * @see VkCommandBuffer
 * @see VkSemaphore
 * @see VkFence
 * @see VkDeviceMemory
 * @see VkBuffer
 * @see VkImage
 * @see VkEvent
 * @see VkQueryPool
 * @see VkBufferView
 * @see VkImageView
 * @see VkShaderModule
 * @see VkPipelineCache
 * @see VkPipelineLayout
 * @see VkRenderPass
 * @see VkPipeline
 * @see VkDescriptorSetLayout
 * @see VkSampler
 * @see VkDescriptorPool
 * @see VkDescriptorSet
 * @see VkFramebuffer
 * @see VkCommandPool
 * @see VkSurfaceKHR
 * @see VkSwapchainKHR
 * @see VkDisplayKHR
 * @see VkDisplayModeKHR
 * @see VkDebugReportCallbackEXT
 * 
 * 
 *
 */
public class VkHandler implements VkHandleInterface, VkBuffer, VkBufferView, VkCommandBuffer, VkCommandPool,
        VkDebugReportCallbackEXT, VkDescriptorPool, VkDescriptorSet, VkDescriptorSetLayout, VkDevice, VkDeviceMemory,
        VkDisplayKHR, VkDisplayModeKHR, VkEvent, VkFence, VkFramebuffer, VkImage, VkImageView, VkInstance,
        VkPhysicalDevice, VkPipeline, VkPipelineCache, VkPipelineLayout, VkQueryPool, VkQueue, VkRenderPass, VkSampler,
        VkSemaphore, VkShaderModule, VkSurfaceKHR, VkSwapchainKHR {

    /**
     * This static map holds handlers and avoid GC on handlers and pointers.
     * It is a synchornized Hashtable
     */
    private static 
    Map<VkHandleInterface,ByteBuffer> mapHandlers =  
                                  new Hashtable<VkHandleInterface, ByteBuffer>(); 
    
    /**
     * The handler itself
     */
    private ByteBuffer handle;
    
    /**
     * Wrapping P instance, for this object
     */
    private P<VkHandler> p;
    
    /**
     * Creates a empty VkHandler.
     * The pointer to native side will be created later.
     * @see VkHandler#createNullPointer()
     */
    protected VkHandler(){        
    }

    /**
     * 
     * To be called by native side or from a package level class.
     * 
     * @param nativePtr - ByteBuffer wrapping a native Vulkan handler 
     * 
     * @throws IllegalArgumentException if nativePtr is null or non direct.
     */
     protected VkHandler(ByteBuffer nativePtr) {  
        if(null==nativePtr || !nativePtr.isDirect()){
            throw 
            new IllegalArgumentException("ByteBuffer nativePtr must "
                    + "be Direct and not null.");
        }
       prepareHandler(nativePtr);
    }
     
     /**
      * Prepare handler to be used 
      * @param nativePtr
      */
    private void prepareHandler(ByteBuffer nativePtr) {
        this.handle = nativePtr.isReadOnly() ? nativePtr : nativePtr.asReadOnlyBuffer();
        this.handle.rewind();
        mapHandlers.put(this, handle);
    }
     
     /**
      * Implements {@link VkObject#getType()}
      * Always return {@link VkObject#TYPE_HANDLER}
      */
     @Override
     public int getType(){
         return TYPE_HANDLER;
     }

    /*
     * (non-Javadoc)
     * 
     * @see bor.vulkan.VkHandleInterface#getHandle()
     */
    @Override
    public ByteBuffer getHandle() {
        return this.handle;
    }
    
    /**
     * Implementation of {@link VkObject#getPointer()}
     * Same think as {@link #getHandle()}
     * 
     * @see VkObject#getPointer()
     * 
     * @return native pointer wrapped by a ByteBuffer. 
     */
    @Override
    public ByteBuffer getPointer(){              
        return this.handle;
    }
    
    /**
     * Release internal handler wrapper to be GC'ed <br>
     * <b>Note :</b><br> 
     * Instead of forcing freeing  native resources,<br>
     * let Vulkan API free theirs resources by itself, at vkDestroyXXXX() methods.<br>
     * 
     * <b><i>This method just break references Java reference native pointers</i></b><br> 
     * Otherwise it would crash application.<br>
     * 
     * Lets evaluate this and may change if necessary.
     * 
     * @Todo - Move this method to VkObject <or it would mess with VkHandlers ?>
     * 
     * @see bor.vulkan.VkHandleInterface#free()
     * 
     * @return true if handler was released, false it was already released. 
     */
     @Override
    public boolean free(){
        if(null==handle) 
            return false;
        
        handle = null;
        mapHandlers.remove(this);
        return true;
    }
     
     /**
      * Check if handler is null.
      * 
      * @return true is handler is null.
      */
     @Override
    public boolean isNull(){
        if(null==this.handle)
            return false;
        
        return true;         
    }

    
    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof VkHandler)) {
            return false;
        }
        VkHandler other = (VkHandler) obj;
        if (handle == null) {
            if (other.handle != null) {
                return false;
            }
        } else if (!handle.equals(other.handle)) {
            return false;
        }
        return true;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {        
        return "VkHandler [" + (handle != null ? "handle=" + handle : "") + "]";
    }
    
    /**
     * Release all handlers.
     * Call it when you are about to close your application.
     * 
     */
    public static void releaseAllHandlers(){
        throw new RuntimeException("Not implemented yet");
    }

    /**
     * Create a pointer P to contain a instance of this,
     * with unset native pointer.
     * The 
     *    
     * @return A instance of P with null pointer 
     */
    public static P<? extends VkHandler> createNullPointer(){        
        P<VkHandler> p = new P<VkHandler>(new VkHandler());        
        return p;
    }
    
    /*
     * (non-Javadoc)
     * @see bor.vulkan.VkObject#setPointer(java.nio.ByteBuffer)
     */
     public void setPointer(ByteBuffer nativePtr){       
        prepareHandler(nativePtr);
    }

     /*
      * (non-Javadoc)
      * @see bor.vulkan.VkObject#getP()
      */
    @Override
    public P<VkHandler> getP() {
       if(p == null ){
           p = new P<VkHandler>(this);
       }
        return p;
    }
}
