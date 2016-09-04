package bor.vulkan;

/**
 * Super interface for Vulkan handlers.<br>
 * An handler wraps pointers created in native side.<br>
 * 
 * <h3>Note: This super interface is not part of Khronos' Vulkan API 1.0</h3>
 *  But the interfaces listed below are.<br> 
 *   
 * @author Alessandro Borges
 * 
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
 */
public interface VkHandleInterface extends VkObject{
    
    /**
     * Internal ID of Vulkan handlers
     */
    public static final int   TYPE_HANDLER_VKINSTANCE = 1;
    public static final int   TYPE_HANDLER_VKPHYSICALDEVICE = 2;
    public static final int   TYPE_HANDLER_VKDEVICE = 3;
    public static final int   TYPE_HANDLER_VKQUEUE = 4;
    public static final int   TYPE_HANDLER_VKCOMMANDBUFFER = 5;

    /**
     * Non-Dispatchable handles
     */
    public static final int   TYPE_HANDLER_VKSEMAPHORE = 107;
    public static final int   TYPE_HANDLER_VKFENCE = 108;
    public static final int   TYPE_HANDLER_VKDEVICEMEMORY = 109;
    public static final int   TYPE_HANDLER_VKBUFFER = 110;
    public static final int   TYPE_HANDLER_VKIMAGE = 111;
    public static final int   TYPE_HANDLER_VKEVENT = 112;
    public static final int   TYPE_HANDLER_VKQUERYPOOL = 113;
    public static final int   TYPE_HANDLER_VKBUFFERVIEW = 114;
    public static final int   TYPE_HANDLER_VKIMAGEVIEW = 115;
    public static final int   TYPE_HANDLER_VKSHADERMODULE = 116;
    public static final int   TYPE_HANDLER_VKPIPELINECACHE = 117;
    public static final int   TYPE_HANDLER_VKPIPELINELAYOUT = 118;
    public static final int   TYPE_HANDLER_VKRENDERPASS = 119;
    public static final int   TYPE_HANDLER_VKPIPELINE = 120;
    public static final int   TYPE_HANDLER_VKDESCRIPTORSETLAYOUT = 121;
    public static final int   TYPE_HANDLER_VKSAMPLER = 122;
    public static final int   TYPE_HANDLER_VKDESCRIPTORPOOL = 123;
    public static final int   TYPE_HANDLER_VKDESCRIPTORSET = 124;
    public static final int   TYPE_HANDLER_VKFRAMEBUFFER = 125;
    public static final int   TYPE_HANDLER_VKCOMMANDPOOL = 126;
    
    /**
     * KHR Non-Dispatchable handles
     */
    public static final int   TYPE_HANDLER_VKSURFACEKHR = 200;
    public static final int   TYPE_HANDLER_VKSWAPCHAINKHR = 201;
    public static final int   TYPE_HANDLER_VKDISPLAYKHR = 202;
    public static final int   TYPE_HANDLER_VKDISPLAYMODEKHR = 203;
    public static final int   TYPE_HANDLER_VKDEBUGREPORTCALLBACKEXT = 204;

            
  
   
     
     /**
     * Size of this VkObject, in bytes
     * @return
     */
    public int sizeof();
   
     
     /**
      * 
      * @return
      */
     public boolean isNull();

}
