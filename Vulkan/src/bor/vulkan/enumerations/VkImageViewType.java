package bor.vulkan.enumerations;

import bor.enumerable.*;

/**
 * Class to wrap Vulkan enumeration VkImageViewType
 * @author Alessandro Borges

 */
public class VkImageViewType extends IntEnum<VkImageViewType> {
	public static final VkImageViewType VK_IMAGE_VIEW_TYPE_1D = new VkImageViewType("VK_IMAGE_VIEW_TYPE_1D", 0, 0);
	public static final VkImageViewType VK_IMAGE_VIEW_TYPE_2D = new VkImageViewType("VK_IMAGE_VIEW_TYPE_2D", 1, 1);
	public static final VkImageViewType VK_IMAGE_VIEW_TYPE_3D = new VkImageViewType("VK_IMAGE_VIEW_TYPE_3D", 2, 2);
	public static final VkImageViewType VK_IMAGE_VIEW_TYPE_CUBE = new VkImageViewType("VK_IMAGE_VIEW_TYPE_CUBE", 3, 3);
	public static final VkImageViewType VK_IMAGE_VIEW_TYPE_1D_ARRAY = new VkImageViewType("VK_IMAGE_VIEW_TYPE_1D_ARRAY", 4, 4);
	public static final VkImageViewType VK_IMAGE_VIEW_TYPE_2D_ARRAY = new VkImageViewType("VK_IMAGE_VIEW_TYPE_2D_ARRAY", 5, 5);
	public static final VkImageViewType VK_IMAGE_VIEW_TYPE_CUBE_ARRAY = new VkImageViewType("VK_IMAGE_VIEW_TYPE_CUBE_ARRAY", 6, 6);
	public static final VkImageViewType VK_IMAGE_VIEW_TYPE_BEGIN_RANGE = new VkImageViewType("VK_IMAGE_VIEW_TYPE_BEGIN_RANGE", 7, VK_IMAGE_VIEW_TYPE_1D.getValue() );
	public static final VkImageViewType VK_IMAGE_VIEW_TYPE_END_RANGE = new VkImageViewType("VK_IMAGE_VIEW_TYPE_END_RANGE", 8, VK_IMAGE_VIEW_TYPE_CUBE_ARRAY.getValue() );
	public static final VkImageViewType VK_IMAGE_VIEW_TYPE_RANGE_SIZE = new VkImageViewType("VK_IMAGE_VIEW_TYPE_RANGE_SIZE", 9, (VK_IMAGE_VIEW_TYPE_END_RANGE.getValue() - VK_IMAGE_VIEW_TYPE_BEGIN_RANGE.getValue() + 1));
	public static final VkImageViewType VK_IMAGE_VIEW_TYPE_MAX_ENUM = new VkImageViewType("VK_IMAGE_VIEW_TYPE_MAX_ENUM", 10,  0x7FFFFFFF);


	/** private ctor */
	private VkImageViewType(String name, int ordinal, int v) {
		 super(name, ordinal, v);
	}

 } // end of class VkImageViewType