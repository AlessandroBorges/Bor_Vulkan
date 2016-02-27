package bor.vulkan.enumerations;

import bor.enumerable.*;

/**
 * Class to wrap Vulkan enumeration VkImageAspectFlagBits
 * @author Alessandro Borges

 */
public class VkImageAspectFlagBits extends IntEnum<VkImageAspectFlagBits> {
	public static final VkImageAspectFlagBits VK_IMAGE_ASPECT_COLOR_BIT = new VkImageAspectFlagBits("VK_IMAGE_ASPECT_COLOR_BIT", 0, 0x00000001);
	public static final VkImageAspectFlagBits VK_IMAGE_ASPECT_DEPTH_BIT = new VkImageAspectFlagBits("VK_IMAGE_ASPECT_DEPTH_BIT", 1, 0x00000002);
	public static final VkImageAspectFlagBits VK_IMAGE_ASPECT_STENCIL_BIT = new VkImageAspectFlagBits("VK_IMAGE_ASPECT_STENCIL_BIT", 2, 0x00000004);
	public static final VkImageAspectFlagBits VK_IMAGE_ASPECT_METADATA_BIT = new VkImageAspectFlagBits("VK_IMAGE_ASPECT_METADATA_BIT", 3, 0x00000008);


	/** private ctor */
	private VkImageAspectFlagBits(String name, int ordinal, int v) {
		 super(name, ordinal, v);
	}

 } // end of class VkImageAspectFlagBits