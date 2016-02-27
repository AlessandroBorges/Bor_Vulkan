package bor.vulkan.enumerations;

import bor.enumerable.*;

/**
 * Class to wrap Vulkan enumeration VkDebugReportObjectTypeEXT
 * @author Alessandro Borges

 */
public class VkDebugReportObjectTypeEXT extends IntEnum<VkDebugReportObjectTypeEXT> {
	public static final VkDebugReportObjectTypeEXT VK_DEBUG_REPORT_OBJECT_TYPE_UNKNOWN_EXT = new VkDebugReportObjectTypeEXT("VK_DEBUG_REPORT_OBJECT_TYPE_UNKNOWN_EXT", 0, 0);
	public static final VkDebugReportObjectTypeEXT VK_DEBUG_REPORT_OBJECT_TYPE_INSTANCE_EXT = new VkDebugReportObjectTypeEXT("VK_DEBUG_REPORT_OBJECT_TYPE_INSTANCE_EXT", 1, 1);
	public static final VkDebugReportObjectTypeEXT VK_DEBUG_REPORT_OBJECT_TYPE_PHYSICAL_DEVICE_EXT = new VkDebugReportObjectTypeEXT("VK_DEBUG_REPORT_OBJECT_TYPE_PHYSICAL_DEVICE_EXT", 2, 2);
	public static final VkDebugReportObjectTypeEXT VK_DEBUG_REPORT_OBJECT_TYPE_DEVICE_EXT = new VkDebugReportObjectTypeEXT("VK_DEBUG_REPORT_OBJECT_TYPE_DEVICE_EXT", 3, 3);
	public static final VkDebugReportObjectTypeEXT VK_DEBUG_REPORT_OBJECT_TYPE_QUEUE_EXT = new VkDebugReportObjectTypeEXT("VK_DEBUG_REPORT_OBJECT_TYPE_QUEUE_EXT", 4, 4);
	public static final VkDebugReportObjectTypeEXT VK_DEBUG_REPORT_OBJECT_TYPE_SEMAPHORE_EXT = new VkDebugReportObjectTypeEXT("VK_DEBUG_REPORT_OBJECT_TYPE_SEMAPHORE_EXT", 5, 5);
	public static final VkDebugReportObjectTypeEXT VK_DEBUG_REPORT_OBJECT_TYPE_COMMAND_BUFFER_EXT = new VkDebugReportObjectTypeEXT("VK_DEBUG_REPORT_OBJECT_TYPE_COMMAND_BUFFER_EXT", 6, 6);
	public static final VkDebugReportObjectTypeEXT VK_DEBUG_REPORT_OBJECT_TYPE_FENCE_EXT = new VkDebugReportObjectTypeEXT("VK_DEBUG_REPORT_OBJECT_TYPE_FENCE_EXT", 7, 7);
	public static final VkDebugReportObjectTypeEXT VK_DEBUG_REPORT_OBJECT_TYPE_DEVICE_MEMORY_EXT = new VkDebugReportObjectTypeEXT("VK_DEBUG_REPORT_OBJECT_TYPE_DEVICE_MEMORY_EXT", 8, 8);
	public static final VkDebugReportObjectTypeEXT VK_DEBUG_REPORT_OBJECT_TYPE_BUFFER_EXT = new VkDebugReportObjectTypeEXT("VK_DEBUG_REPORT_OBJECT_TYPE_BUFFER_EXT", 9, 9);
	public static final VkDebugReportObjectTypeEXT VK_DEBUG_REPORT_OBJECT_TYPE_IMAGE_EXT = new VkDebugReportObjectTypeEXT("VK_DEBUG_REPORT_OBJECT_TYPE_IMAGE_EXT", 10, 10);
	public static final VkDebugReportObjectTypeEXT VK_DEBUG_REPORT_OBJECT_TYPE_EVENT_EXT = new VkDebugReportObjectTypeEXT("VK_DEBUG_REPORT_OBJECT_TYPE_EVENT_EXT", 11, 11);
	public static final VkDebugReportObjectTypeEXT VK_DEBUG_REPORT_OBJECT_TYPE_QUERY_POOL_EXT = new VkDebugReportObjectTypeEXT("VK_DEBUG_REPORT_OBJECT_TYPE_QUERY_POOL_EXT", 12, 12);
	public static final VkDebugReportObjectTypeEXT VK_DEBUG_REPORT_OBJECT_TYPE_BUFFER_VIEW_EXT = new VkDebugReportObjectTypeEXT("VK_DEBUG_REPORT_OBJECT_TYPE_BUFFER_VIEW_EXT", 13, 13);
	public static final VkDebugReportObjectTypeEXT VK_DEBUG_REPORT_OBJECT_TYPE_IMAGE_VIEW_EXT = new VkDebugReportObjectTypeEXT("VK_DEBUG_REPORT_OBJECT_TYPE_IMAGE_VIEW_EXT", 14, 14);
	public static final VkDebugReportObjectTypeEXT VK_DEBUG_REPORT_OBJECT_TYPE_SHADER_MODULE_EXT = new VkDebugReportObjectTypeEXT("VK_DEBUG_REPORT_OBJECT_TYPE_SHADER_MODULE_EXT", 15, 15);
	public static final VkDebugReportObjectTypeEXT VK_DEBUG_REPORT_OBJECT_TYPE_PIPELINE_CACHE_EXT = new VkDebugReportObjectTypeEXT("VK_DEBUG_REPORT_OBJECT_TYPE_PIPELINE_CACHE_EXT", 16, 16);
	public static final VkDebugReportObjectTypeEXT VK_DEBUG_REPORT_OBJECT_TYPE_PIPELINE_LAYOUT_EXT = new VkDebugReportObjectTypeEXT("VK_DEBUG_REPORT_OBJECT_TYPE_PIPELINE_LAYOUT_EXT", 17, 17);
	public static final VkDebugReportObjectTypeEXT VK_DEBUG_REPORT_OBJECT_TYPE_RENDER_PASS_EXT = new VkDebugReportObjectTypeEXT("VK_DEBUG_REPORT_OBJECT_TYPE_RENDER_PASS_EXT", 18, 18);
	public static final VkDebugReportObjectTypeEXT VK_DEBUG_REPORT_OBJECT_TYPE_PIPELINE_EXT = new VkDebugReportObjectTypeEXT("VK_DEBUG_REPORT_OBJECT_TYPE_PIPELINE_EXT", 19, 19);
	public static final VkDebugReportObjectTypeEXT VK_DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_SET_LAYOUT_EXT = new VkDebugReportObjectTypeEXT("VK_DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_SET_LAYOUT_EXT", 20, 20);
	public static final VkDebugReportObjectTypeEXT VK_DEBUG_REPORT_OBJECT_TYPE_SAMPLER_EXT = new VkDebugReportObjectTypeEXT("VK_DEBUG_REPORT_OBJECT_TYPE_SAMPLER_EXT", 21, 21);
	public static final VkDebugReportObjectTypeEXT VK_DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_POOL_EXT = new VkDebugReportObjectTypeEXT("VK_DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_POOL_EXT", 22, 22);
	public static final VkDebugReportObjectTypeEXT VK_DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_SET_EXT = new VkDebugReportObjectTypeEXT("VK_DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_SET_EXT", 23, 23);
	public static final VkDebugReportObjectTypeEXT VK_DEBUG_REPORT_OBJECT_TYPE_FRAMEBUFFER_EXT = new VkDebugReportObjectTypeEXT("VK_DEBUG_REPORT_OBJECT_TYPE_FRAMEBUFFER_EXT", 24, 24);
	public static final VkDebugReportObjectTypeEXT VK_DEBUG_REPORT_OBJECT_TYPE_COMMAND_POOL_EXT = new VkDebugReportObjectTypeEXT("VK_DEBUG_REPORT_OBJECT_TYPE_COMMAND_POOL_EXT", 25, 25);
	public static final VkDebugReportObjectTypeEXT VK_DEBUG_REPORT_OBJECT_TYPE_SURFACE_KHR_EXT = new VkDebugReportObjectTypeEXT("VK_DEBUG_REPORT_OBJECT_TYPE_SURFACE_KHR_EXT", 26, 26);
	public static final VkDebugReportObjectTypeEXT VK_DEBUG_REPORT_OBJECT_TYPE_SWAPCHAIN_KHR_EXT = new VkDebugReportObjectTypeEXT("VK_DEBUG_REPORT_OBJECT_TYPE_SWAPCHAIN_KHR_EXT", 27, 27);
	public static final VkDebugReportObjectTypeEXT VK_DEBUG_REPORT_OBJECT_TYPE_DEBUG_REPORT_EXT = new VkDebugReportObjectTypeEXT("VK_DEBUG_REPORT_OBJECT_TYPE_DEBUG_REPORT_EXT", 28, 28);


	/** private ctor */
	private VkDebugReportObjectTypeEXT(String name, int ordinal, int v) {
		 super(name, ordinal, v);
	}

 } // end of class VkDebugReportObjectTypeEXT