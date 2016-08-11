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
    public static final int   TYPE_HANDLER_VKINSTANCE = 100;
    public static final int   TYPE_HANDLER_VKPHYSICALDEVICE = 101;
    public static final int   TYPE_HANDLER_VKDEVICE = 102;
    public static final int   TYPE_HANDLER_VKQUEUE = 103;
    public static final int   TYPE_HANDLER_VKCOMMANDBUFFER = 104;
    public static final int   TYPE_HANDLER_VKSEMAPHORE = 107;
    /**
     * Non-Dispatchable handlers
     */
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
    public static final int   TYPE_HANDLER_VKSURFACEKHR = 127;
    public static final int   TYPE_HANDLER_VKSWAPCHAINKHR = 128;
    public static final int   TYPE_HANDLER_VKDISPLAYKHR = 129;
    public static final int   TYPE_HANDLER_VKDISPLAYMODEKHR = 130;
    public static final int   TYPE_HANDLER_VKDEBUGREPORTCALLBACKEXT = 131;

            
  
   
     
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
