/**
 * Bor_Vulkan Project Ver. 0.8.01 (beta)
 * Licence terms: 
 * The MIT License (MIT)
 * Copyright (c) 2016 Alessandro Borges
 * See https://opensource.org/licenses/MIT 
 */
package bor.vulkan.enumerations;

import bor.enumerable.*;

/**
 * Class to wrap Vulkan enumeration VkImageViewType
 *
 * <h3>Prototype</h3> <pre>
 * typedef enum VkImageViewType {
 *     VK_IMAGE_VIEW_TYPE_1D = 0,
 *     VK_IMAGE_VIEW_TYPE_2D = 1,
 *     VK_IMAGE_VIEW_TYPE_3D = 2,
 *     VK_IMAGE_VIEW_TYPE_CUBE = 3,
 *     VK_IMAGE_VIEW_TYPE_1D_ARRAY = 4,
 *     VK_IMAGE_VIEW_TYPE_2D_ARRAY = 5,
 *     VK_IMAGE_VIEW_TYPE_CUBE_ARRAY = 6,
 *     VK_IMAGE_VIEW_TYPE_BEGIN_RANGE = VK_IMAGE_VIEW_TYPE_1D,
 *     VK_IMAGE_VIEW_TYPE_END_RANGE = VK_IMAGE_VIEW_TYPE_CUBE_ARRAY,
 *     VK_IMAGE_VIEW_TYPE_RANGE_SIZE = (VK_IMAGE_VIEW_TYPE_CUBE_ARRAY - VK_IMAGE_VIEW_TYPE_1D + 1),
 *     VK_IMAGE_VIEW_TYPE_MAX_ENUM = 0x7FFFFFFF
 * } VkImageViewType;
 * </pre>
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


	/** private ctor */
	private VkImageViewType(String name, int ordinal, int v) {
		 super(name, ordinal, v);
	}

 } // end of class VkImageViewType
