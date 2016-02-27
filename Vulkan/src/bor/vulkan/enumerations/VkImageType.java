package bor.vulkan.enumerations;

import bor.enumerable.*;

/**
 * Class to wrap Vulkan enumeration VkImageType
 * @author Alessandro Borges

 */
public class VkImageType extends IntEnum<VkImageType> {
	public static final VkImageType VK_IMAGE_TYPE_1D = new VkImageType("VK_IMAGE_TYPE_1D", 0, 0);
	public static final VkImageType VK_IMAGE_TYPE_2D = new VkImageType("VK_IMAGE_TYPE_2D", 1, 1);
	public static final VkImageType VK_IMAGE_TYPE_3D = new VkImageType("VK_IMAGE_TYPE_3D", 2, 2);
	public static final VkImageType VK_IMAGE_TYPE_BEGIN_RANGE = new VkImageType("VK_IMAGE_TYPE_BEGIN_RANGE", 3, VK_IMAGE_TYPE_1D.getValue() );
	public static final VkImageType VK_IMAGE_TYPE_END_RANGE = new VkImageType("VK_IMAGE_TYPE_END_RANGE", 4, VK_IMAGE_TYPE_3D.getValue() );
	public static final VkImageType VK_IMAGE_TYPE_RANGE_SIZE = new VkImageType("VK_IMAGE_TYPE_RANGE_SIZE", 5, (VK_IMAGE_TYPE_END_RANGE.getValue() - VK_IMAGE_TYPE_BEGIN_RANGE.getValue() + 1));
	public static final VkImageType VK_IMAGE_TYPE_MAX_ENUM = new VkImageType("VK_IMAGE_TYPE_MAX_ENUM", 6,  0x7FFFFFFF);


	/** private ctor */
	private VkImageType(String name, int ordinal, int v) {
		 super(name, ordinal, v);
	}

 } // end of class VkImageType