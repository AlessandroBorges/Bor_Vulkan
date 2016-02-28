/**
 * Licence terms: 
 * The MIT License (MIT)
 * Copyright (c) 2016 Alessandro Borges
 * See https://opensource.org/licenses/MIT 
 */
package bor.vulkan.enumerations;

import bor.enumerable.*;

/**
 * Class to wrap Vulkan enumeration VkImageTiling
 *
 * <h3>Prototype</h3> <pre>
 * typedef enum VkImageTiling {
 *     VK_IMAGE_TILING_OPTIMAL = 0,
 *     VK_IMAGE_TILING_LINEAR = 1,
 *     VK_IMAGE_TILING_BEGIN_RANGE = VK_IMAGE_TILING_OPTIMAL,
 *     VK_IMAGE_TILING_END_RANGE = VK_IMAGE_TILING_LINEAR,
 *     VK_IMAGE_TILING_RANGE_SIZE = (VK_IMAGE_TILING_LINEAR - VK_IMAGE_TILING_OPTIMAL + 1),
 *     VK_IMAGE_TILING_MAX_ENUM = 0x7FFFFFFF
 * } VkImageTiling;
 * </pre>
 * @author Alessandro Borges
 */
public class VkImageTiling extends IntEnum<VkImageTiling> {
	public static final VkImageTiling VK_IMAGE_TILING_OPTIMAL = new VkImageTiling("VK_IMAGE_TILING_OPTIMAL", 0, 0);
	public static final VkImageTiling VK_IMAGE_TILING_LINEAR = new VkImageTiling("VK_IMAGE_TILING_LINEAR", 1, 1);
	public static final VkImageTiling VK_IMAGE_TILING_BEGIN_RANGE = new VkImageTiling("VK_IMAGE_TILING_BEGIN_RANGE", 2, VK_IMAGE_TILING_OPTIMAL.getValue() );
	public static final VkImageTiling VK_IMAGE_TILING_END_RANGE = new VkImageTiling("VK_IMAGE_TILING_END_RANGE", 3, VK_IMAGE_TILING_LINEAR.getValue() );
	public static final VkImageTiling VK_IMAGE_TILING_RANGE_SIZE = new VkImageTiling("VK_IMAGE_TILING_RANGE_SIZE", 4, (VK_IMAGE_TILING_END_RANGE.getValue() - VK_IMAGE_TILING_BEGIN_RANGE.getValue() + 1));
	public static final VkImageTiling VK_IMAGE_TILING_MAX_ENUM = new VkImageTiling("VK_IMAGE_TILING_MAX_ENUM", 5,  0x7FFFFFFF);


	/** private ctor */
	private VkImageTiling(String name, int ordinal, int v) {
		 super(name, ordinal, v);
	}

 } // end of class VkImageTiling
