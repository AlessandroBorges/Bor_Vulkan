/**
 * 
 */
package bor.vulkan;

import java.nio.ByteBuffer;
import java.util.Hashtable;
import java.util.Map;

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
 *     VkHandlerConcrete handler = new VkHandlerConcrete(ptr);
 *     return (VkInstance) handler;
 *  }  
 * </pre>
 * 
 * After proper usage, you can dispose this handler 
 * by calling {@link #free()} method.<br>
 * Keep in mind that, after calling free(), 
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
public class VkHandlerConcrete implements VkHandle, VkBuffer, VkBufferView, VkCommandBuffer, VkCommandPool,
        VkDebugReportCallbackEXT, VkDescriptorPool, VkDescriptorSet, VkDescriptorSetLayout, VkDevice, VkDeviceMemory,
        VkDisplayKHR, VkDisplayModeKHR, VkEvent, VkFence, VkFramebuffer, VkImage, VkImageView, VkInstance,
        VkPhysicalDevice, VkPipeline, VkPipelineCache, VkPipelineLayout, VkQueryPool, VkQueue, VkRenderPass, VkSampler,
        VkSemaphore, VkShaderModule, VkSurfaceKHR, VkSwapchainKHR {

    /**
     * This static map holds handlers and avoid GC on handlers and pointers.
     */
    private static Map<VkHandle,ByteBuffer> mapHandlers = new Hashtable<VkHandle, ByteBuffer>(); 
    
    /**
     * The handler
     */
    private ByteBuffer handle;

    /**
     * 
     * To be called by native side or from a package level class.
     * 
     * @param nativePtr - ByteBuffer wrapping a native Vulkan handler 
     * 
     * @throws IllegalArgumentException if nativePtr is null or non direct.
     */
     protected VkHandlerConcrete(ByteBuffer nativePtr) {  
        if(null==nativePtr || !nativePtr.isDirect()){
            throw 
            new IllegalArgumentException("ByteBuffer nativePtr must "
                    + "be not null and direct.");
        }
        this.handle = nativePtr.isReadOnly() ? 
                         nativePtr : 
                         nativePtr.asReadOnlyBuffer();        
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
     * @see bor.vulkan.VkHandle#getHandle()
     */
    @Override
    public ByteBuffer getPointerHandle() {
        return this.handle;
    }
    
    /**
     * Implementation of {@link VkObject#getPointer()}
     * Same think as {@link #getPointerHandle()}
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
     * @see bor.vulkan.VkHandle#free()
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
        if (!(obj instanceof VkHandlerConcrete)) {
            return false;
        }
        VkHandlerConcrete other = (VkHandlerConcrete) obj;
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
        return "VkHandlerConcrete [" + (handle != null ? "handle=" + handle : "") + "]";
    }
    
    /**
     * Release all handlers.
     * Call it when you are about to close your application.
     */
    public static void releaseAllHandlers(){
        
    }
}
