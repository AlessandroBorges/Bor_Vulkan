package bor.vulkan.enumerations;

import bor.enumerable.*;

/**
 * Class to wrap Vulkan enumeration VkDebugReportFlagBitsEXT
 * @author Alessandro Borges

 */
public class VkDebugReportFlagBitsEXT extends IntEnum<VkDebugReportFlagBitsEXT> {
	public static final VkDebugReportFlagBitsEXT VK_DEBUG_REPORT_INFORMATION_BIT_EXT = new VkDebugReportFlagBitsEXT("VK_DEBUG_REPORT_INFORMATION_BIT_EXT", 0, 0x00000001);
	public static final VkDebugReportFlagBitsEXT VK_DEBUG_REPORT_WARNING_BIT_EXT = new VkDebugReportFlagBitsEXT("VK_DEBUG_REPORT_WARNING_BIT_EXT", 1, 0x00000002);
	public static final VkDebugReportFlagBitsEXT VK_DEBUG_REPORT_PERFORMANCE_WARNING_BIT_EXT = new VkDebugReportFlagBitsEXT("VK_DEBUG_REPORT_PERFORMANCE_WARNING_BIT_EXT", 2, 0x00000004);
	public static final VkDebugReportFlagBitsEXT VK_DEBUG_REPORT_ERROR_BIT_EXT = new VkDebugReportFlagBitsEXT("VK_DEBUG_REPORT_ERROR_BIT_EXT", 3, 0x00000008);
	public static final VkDebugReportFlagBitsEXT VK_DEBUG_REPORT_DEBUG_BIT_EXT = new VkDebugReportFlagBitsEXT("VK_DEBUG_REPORT_DEBUG_BIT_EXT", 4, 0x00000010);


	/** private ctor */
	private VkDebugReportFlagBitsEXT(String name, int ordinal, int v) {
		 super(name, ordinal, v);
	}

 } // end of class VkDebugReportFlagBitsEXT