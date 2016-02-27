package bor.vulkan.enumerations;

import bor.enumerable.*;

/**
 * Class to wrap Vulkan enumeration VkImageLayout
 * @author Alessandro Borges

 */
public class VkImageLayout extends IntEnum<VkImageLayout> {
	public static final VkImageLayout VK_IMAGE_LAYOUT_UNDEFINED = new VkImageLayout("VK_IMAGE_LAYOUT_UNDEFINED", 0, 0);
	public static final VkImageLayout VK_IMAGE_LAYOUT_GENERAL = new VkImageLayout("VK_IMAGE_LAYOUT_GENERAL", 1, 1);
	public static final VkImageLayout VK_IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL = new VkImageLayout("VK_IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL", 2, 2);
	public static final VkImageLayout VK_IMAGE_LAYOUT_DEPTH_STENCIL_ATTACHMENT_OPTIMAL = new VkImageLayout("VK_IMAGE_LAYOUT_DEPTH_STENCIL_ATTACHMENT_OPTIMAL", 3, 3);
	public static final VkImageLayout VK_IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL = new VkImageLayout("VK_IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL", 4, 4);
	public static final VkImageLayout VK_IMAGE_LAYOUT_SHADER_READ_ONLY_OPTIMAL = new VkImageLayout("VK_IMAGE_LAYOUT_SHADER_READ_ONLY_OPTIMAL", 5, 5);
	public static final VkImageLayout VK_IMAGE_LAYOUT_TRANSFER_SRC_OPTIMAL = new VkImageLayout("VK_IMAGE_LAYOUT_TRANSFER_SRC_OPTIMAL", 6, 6);
	public static final VkImageLayout VK_IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL = new VkImageLayout("VK_IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL", 7, 7);
	public static final VkImageLayout VK_IMAGE_LAYOUT_PREINITIALIZED = new VkImageLayout("VK_IMAGE_LAYOUT_PREINITIALIZED", 8, 8);
	public static final VkImageLayout VK_IMAGE_LAYOUT_PRESENT_SRC_KHR = new VkImageLayout("VK_IMAGE_LAYOUT_PRESENT_SRC_KHR", 9, 1000001002);
	public static final VkImageLayout VK_IMAGE_LAYOUT_BEGIN_RANGE = new VkImageLayout("VK_IMAGE_LAYOUT_BEGIN_RANGE", 10, VK_IMAGE_LAYOUT_UNDEFINED.getValue() );
	public static final VkImageLayout VK_IMAGE_LAYOUT_END_RANGE = new VkImageLayout("VK_IMAGE_LAYOUT_END_RANGE", 11, VK_IMAGE_LAYOUT_PREINITIALIZED.getValue() );
	public static final VkImageLayout VK_IMAGE_LAYOUT_RANGE_SIZE = new VkImageLayout("VK_IMAGE_LAYOUT_RANGE_SIZE", 12, (VK_IMAGE_LAYOUT_END_RANGE.getValue() - VK_IMAGE_LAYOUT_BEGIN_RANGE.getValue() + 1));
	public static final VkImageLayout VK_IMAGE_LAYOUT_MAX_ENUM = new VkImageLayout("VK_IMAGE_LAYOUT_MAX_ENUM", 13,  0x7FFFFFFF);


	/** private ctor */
	private VkImageLayout(String name, int ordinal, int v) {
		 super(name, ordinal, v);
	}

 } // end of class VkImageLayout