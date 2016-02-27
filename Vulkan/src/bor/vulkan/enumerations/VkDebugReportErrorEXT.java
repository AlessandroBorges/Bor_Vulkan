package bor.vulkan.enumerations;

import bor.enumerable.*;

/**
 * Class to wrap Vulkan enumeration VkDebugReportErrorEXT
 * @author Alessandro Borges

 */
public class VkDebugReportErrorEXT extends IntEnum<VkDebugReportErrorEXT> {
	public static final VkDebugReportErrorEXT VK_DEBUG_REPORT_ERROR_NONE_EXT = new VkDebugReportErrorEXT("VK_DEBUG_REPORT_ERROR_NONE_EXT", 0, 0);
	public static final VkDebugReportErrorEXT VK_DEBUG_REPORT_ERROR_CALLBACK_REF_EXT = new VkDebugReportErrorEXT("VK_DEBUG_REPORT_ERROR_CALLBACK_REF_EXT", 1, 1);


	/** private ctor */
	private VkDebugReportErrorEXT(String name, int ordinal, int v) {
		 super(name, ordinal, v);
	}

 } // end of class VkDebugReportErrorEXT