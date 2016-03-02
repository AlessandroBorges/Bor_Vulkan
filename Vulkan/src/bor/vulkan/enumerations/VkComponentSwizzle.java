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
 * Class to wrap Vulkan enumeration VkComponentSwizzle
 *
 * <h3>Prototype</h3> <pre>
 * typedef enum VkComponentSwizzle {
 *     VK_COMPONENT_SWIZZLE_IDENTITY = 0,
 *     VK_COMPONENT_SWIZZLE_ZERO = 1,
 *     VK_COMPONENT_SWIZZLE_ONE = 2,
 *     VK_COMPONENT_SWIZZLE_R = 3,
 *     VK_COMPONENT_SWIZZLE_G = 4,
 *     VK_COMPONENT_SWIZZLE_B = 5,
 *     VK_COMPONENT_SWIZZLE_A = 6,
 *     VK_COMPONENT_SWIZZLE_BEGIN_RANGE = VK_COMPONENT_SWIZZLE_IDENTITY,
 *     VK_COMPONENT_SWIZZLE_END_RANGE = VK_COMPONENT_SWIZZLE_A,
 *     VK_COMPONENT_SWIZZLE_RANGE_SIZE = (VK_COMPONENT_SWIZZLE_A - VK_COMPONENT_SWIZZLE_IDENTITY + 1),
 *     VK_COMPONENT_SWIZZLE_MAX_ENUM = 0x7FFFFFFF
 * } VkComponentSwizzle;
 * </pre>
 * @author Alessandro Borges
 */
public class VkComponentSwizzle extends IntEnum<VkComponentSwizzle> {
	public static final VkComponentSwizzle VK_COMPONENT_SWIZZLE_IDENTITY = new VkComponentSwizzle("VK_COMPONENT_SWIZZLE_IDENTITY", 0, 0);
	public static final VkComponentSwizzle VK_COMPONENT_SWIZZLE_ZERO = new VkComponentSwizzle("VK_COMPONENT_SWIZZLE_ZERO", 1, 1);
	public static final VkComponentSwizzle VK_COMPONENT_SWIZZLE_ONE = new VkComponentSwizzle("VK_COMPONENT_SWIZZLE_ONE", 2, 2);
	public static final VkComponentSwizzle VK_COMPONENT_SWIZZLE_R = new VkComponentSwizzle("VK_COMPONENT_SWIZZLE_R", 3, 3);
	public static final VkComponentSwizzle VK_COMPONENT_SWIZZLE_G = new VkComponentSwizzle("VK_COMPONENT_SWIZZLE_G", 4, 4);
	public static final VkComponentSwizzle VK_COMPONENT_SWIZZLE_B = new VkComponentSwizzle("VK_COMPONENT_SWIZZLE_B", 5, 5);
	public static final VkComponentSwizzle VK_COMPONENT_SWIZZLE_A = new VkComponentSwizzle("VK_COMPONENT_SWIZZLE_A", 6, 6);


	/** private ctor */
	private VkComponentSwizzle(String name, int ordinal, int v) {
		 super(name, ordinal, v);
	}

 } // end of class VkComponentSwizzle
