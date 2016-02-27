package bor.vulkan.enumerations;

import bor.enumerable.*;

/**
 * Class to wrap Vulkan enumeration VkPresentModeKHR
 * @author Alessandro Borges

 */
public class VkPresentModeKHR extends IntEnum<VkPresentModeKHR> {
	public static final VkPresentModeKHR VK_PRESENT_MODE_IMMEDIATE_KHR = new VkPresentModeKHR("VK_PRESENT_MODE_IMMEDIATE_KHR", 0, 0);
	public static final VkPresentModeKHR VK_PRESENT_MODE_MAILBOX_KHR = new VkPresentModeKHR("VK_PRESENT_MODE_MAILBOX_KHR", 1, 1);
	public static final VkPresentModeKHR VK_PRESENT_MODE_FIFO_KHR = new VkPresentModeKHR("VK_PRESENT_MODE_FIFO_KHR", 2, 2);
	public static final VkPresentModeKHR VK_PRESENT_MODE_FIFO_RELAXED_KHR = new VkPresentModeKHR("VK_PRESENT_MODE_FIFO_RELAXED_KHR", 3, 3);
	public static final VkPresentModeKHR VK_PRESENT_MODE_BEGIN_RANGE = new VkPresentModeKHR("VK_PRESENT_MODE_BEGIN_RANGE", 4, VK_PRESENT_MODE_IMMEDIATE_KHR.getValue() );
	public static final VkPresentModeKHR VK_PRESENT_MODE_END_RANGE = new VkPresentModeKHR("VK_PRESENT_MODE_END_RANGE", 5, VK_PRESENT_MODE_FIFO_RELAXED_KHR.getValue() );
	public static final VkPresentModeKHR VK_PRESENT_MODE_RANGE_SIZE = new VkPresentModeKHR("VK_PRESENT_MODE_RANGE_SIZE", 6, (VK_PRESENT_MODE_END_RANGE.getValue() - VK_PRESENT_MODE_BEGIN_RANGE.getValue() + 1));
	public static final VkPresentModeKHR VK_PRESENT_MODE_MAX_ENUM = new VkPresentModeKHR("VK_PRESENT_MODE_MAX_ENUM", 7,  0x7FFFFFFF);


	/** private ctor */
	private VkPresentModeKHR(String name, int ordinal, int v) {
		 super(name, ordinal, v);
	}

 } // end of class VkPresentModeKHR