package bor.vulkan.enumerations;

import bor.enumerable.*;

/**
 * Class to wrap Vulkan enumeration VkImageUsageFlagBits
 * @author Alessandro Borges

 */
public class VkImageUsageFlagBits extends IntEnum<VkImageUsageFlagBits> {
	public static final VkImageUsageFlagBits VK_IMAGE_USAGE_TRANSFER_SRC_BIT = new VkImageUsageFlagBits("VK_IMAGE_USAGE_TRANSFER_SRC_BIT", 0, 0x00000001);
	public static final VkImageUsageFlagBits VK_IMAGE_USAGE_TRANSFER_DST_BIT = new VkImageUsageFlagBits("VK_IMAGE_USAGE_TRANSFER_DST_BIT", 1, 0x00000002);
	public static final VkImageUsageFlagBits VK_IMAGE_USAGE_SAMPLED_BIT = new VkImageUsageFlagBits("VK_IMAGE_USAGE_SAMPLED_BIT", 2, 0x00000004);
	public static final VkImageUsageFlagBits VK_IMAGE_USAGE_STORAGE_BIT = new VkImageUsageFlagBits("VK_IMAGE_USAGE_STORAGE_BIT", 3, 0x00000008);
	public static final VkImageUsageFlagBits VK_IMAGE_USAGE_COLOR_ATTACHMENT_BIT = new VkImageUsageFlagBits("VK_IMAGE_USAGE_COLOR_ATTACHMENT_BIT", 4, 0x00000010);
	public static final VkImageUsageFlagBits VK_IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT = new VkImageUsageFlagBits("VK_IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT", 5, 0x00000020);
	public static final VkImageUsageFlagBits VK_IMAGE_USAGE_TRANSIENT_ATTACHMENT_BIT = new VkImageUsageFlagBits("VK_IMAGE_USAGE_TRANSIENT_ATTACHMENT_BIT", 6, 0x00000040);
	public static final VkImageUsageFlagBits VK_IMAGE_USAGE_INPUT_ATTACHMENT_BIT = new VkImageUsageFlagBits("VK_IMAGE_USAGE_INPUT_ATTACHMENT_BIT", 7, 0x00000080);


	/** private ctor */
	private VkImageUsageFlagBits(String name, int ordinal, int v) {
		 super(name, ordinal, v);
	}

 } // end of class VkImageUsageFlagBits