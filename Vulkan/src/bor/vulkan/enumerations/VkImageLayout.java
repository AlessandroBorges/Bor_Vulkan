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
 * Class to wrap Vulkan enumeration VkImageLayout
 *
 * <h3>Prototype</h3> <pre>
 * typedef enum VkImageLayout {
 *     VK_IMAGE_LAYOUT_UNDEFINED = 0,
 *     VK_IMAGE_LAYOUT_GENERAL = 1,
 *     VK_IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL = 2,
 *     VK_IMAGE_LAYOUT_DEPTH_STENCIL_ATTACHMENT_OPTIMAL = 3,
 *     VK_IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL = 4,
 *     VK_IMAGE_LAYOUT_SHADER_READ_ONLY_OPTIMAL = 5,
 *     VK_IMAGE_LAYOUT_TRANSFER_SRC_OPTIMAL = 6,
 *     VK_IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL = 7,
 *     VK_IMAGE_LAYOUT_PREINITIALIZED = 8,
 *     VK_IMAGE_LAYOUT_PRESENT_SRC_KHR = 1000001002,
 *     VK_IMAGE_LAYOUT_BEGIN_RANGE = VK_IMAGE_LAYOUT_UNDEFINED,
 *     VK_IMAGE_LAYOUT_END_RANGE = VK_IMAGE_LAYOUT_PREINITIALIZED,
 *     VK_IMAGE_LAYOUT_RANGE_SIZE = (VK_IMAGE_LAYOUT_PREINITIALIZED - VK_IMAGE_LAYOUT_UNDEFINED + 1),
 *     VK_IMAGE_LAYOUT_MAX_ENUM = 0x7FFFFFFF
 * } VkImageLayout;
 * </pre>
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


	/** private ctor */
	private VkImageLayout(String name, int ordinal, int v) {
		 super(name, ordinal, v);
	}

 } // end of class VkImageLayout
