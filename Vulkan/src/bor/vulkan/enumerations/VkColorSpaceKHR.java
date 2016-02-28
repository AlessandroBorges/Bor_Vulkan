/**
 * Licence terms: 
 * The MIT License (MIT)
 * Copyright (c) 2016 Alessandro Borges
 * See https://opensource.org/licenses/MIT 
 */
package bor.vulkan.enumerations;

import bor.enumerable.*;

/**
 * Class to wrap Vulkan enumeration VkColorSpaceKHR
 *
 * <h3>Prototype</h3> <pre>
 * typedef enum VkColorSpaceKHR {
 *     VK_COLORSPACE_SRGB_NONLINEAR_KHR = 0,
 *     VK_COLORSPACE_BEGIN_RANGE = VK_COLORSPACE_SRGB_NONLINEAR_KHR,
 *     VK_COLORSPACE_END_RANGE = VK_COLORSPACE_SRGB_NONLINEAR_KHR,
 *     VK_COLORSPACE_RANGE_SIZE = (VK_COLORSPACE_SRGB_NONLINEAR_KHR - VK_COLORSPACE_SRGB_NONLINEAR_KHR + 1),
 *     VK_COLORSPACE_MAX_ENUM = 0x7FFFFFFF
 * } VkColorSpaceKHR;
 * </pre>
 * @author Alessandro Borges
 */
public class VkColorSpaceKHR extends IntEnum<VkColorSpaceKHR> {
	public static final VkColorSpaceKHR VK_COLORSPACE_SRGB_NONLINEAR_KHR = new VkColorSpaceKHR("VK_COLORSPACE_SRGB_NONLINEAR_KHR", 0, 0);
	public static final VkColorSpaceKHR VK_COLORSPACE_BEGIN_RANGE = new VkColorSpaceKHR("VK_COLORSPACE_BEGIN_RANGE", 1, VK_COLORSPACE_SRGB_NONLINEAR_KHR.getValue() );
	public static final VkColorSpaceKHR VK_COLORSPACE_END_RANGE = new VkColorSpaceKHR("VK_COLORSPACE_END_RANGE", 2, VK_COLORSPACE_SRGB_NONLINEAR_KHR.getValue() );
	public static final VkColorSpaceKHR VK_COLORSPACE_RANGE_SIZE = new VkColorSpaceKHR("VK_COLORSPACE_RANGE_SIZE", 3, (VK_COLORSPACE_END_RANGE.getValue() - VK_COLORSPACE_BEGIN_RANGE.getValue() + 1));
	public static final VkColorSpaceKHR VK_COLORSPACE_MAX_ENUM = new VkColorSpaceKHR("VK_COLORSPACE_MAX_ENUM", 4,  0x7FFFFFFF);


	/** private ctor */
	private VkColorSpaceKHR(String name, int ordinal, int v) {
		 super(name, ordinal, v);
	}

 } // end of class VkColorSpaceKHR
