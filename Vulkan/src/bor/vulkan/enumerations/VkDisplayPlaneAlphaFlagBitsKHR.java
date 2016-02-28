/**
 * Licence terms: 
 * The MIT License (MIT)
 * Copyright (c) 2016 Alessandro Borges
 * See https://opensource.org/licenses/MIT 
 */
package bor.vulkan.enumerations;

import bor.enumerable.*;

/**
 * Class to wrap Vulkan enumeration VkDisplayPlaneAlphaFlagBitsKHR
 *
 * <h3>Prototype</h3> <pre>
 * typedef enum VkDisplayPlaneAlphaFlagBitsKHR {
 *     VK_DISPLAY_PLANE_ALPHA_OPAQUE_BIT_KHR = 0x00000001,
 *     VK_DISPLAY_PLANE_ALPHA_GLOBAL_BIT_KHR = 0x00000002,
 *     VK_DISPLAY_PLANE_ALPHA_PER_PIXEL_BIT_KHR = 0x00000004,
 *     VK_DISPLAY_PLANE_ALPHA_PER_PIXEL_PREMULTIPLIED_BIT_KHR = 0x00000008,
 * } VkDisplayPlaneAlphaFlagBitsKHR;
 * </pre>
 * @author Alessandro Borges
 */
public class VkDisplayPlaneAlphaFlagBitsKHR extends IntEnum<VkDisplayPlaneAlphaFlagBitsKHR> {
	public static final VkDisplayPlaneAlphaFlagBitsKHR VK_DISPLAY_PLANE_ALPHA_OPAQUE_BIT_KHR = new VkDisplayPlaneAlphaFlagBitsKHR("VK_DISPLAY_PLANE_ALPHA_OPAQUE_BIT_KHR", 0, 0x00000001);
	public static final VkDisplayPlaneAlphaFlagBitsKHR VK_DISPLAY_PLANE_ALPHA_GLOBAL_BIT_KHR = new VkDisplayPlaneAlphaFlagBitsKHR("VK_DISPLAY_PLANE_ALPHA_GLOBAL_BIT_KHR", 1, 0x00000002);
	public static final VkDisplayPlaneAlphaFlagBitsKHR VK_DISPLAY_PLANE_ALPHA_PER_PIXEL_BIT_KHR = new VkDisplayPlaneAlphaFlagBitsKHR("VK_DISPLAY_PLANE_ALPHA_PER_PIXEL_BIT_KHR", 2, 0x00000004);
	public static final VkDisplayPlaneAlphaFlagBitsKHR VK_DISPLAY_PLANE_ALPHA_PER_PIXEL_PREMULTIPLIED_BIT_KHR = new VkDisplayPlaneAlphaFlagBitsKHR("VK_DISPLAY_PLANE_ALPHA_PER_PIXEL_PREMULTIPLIED_BIT_KHR", 3, 0x00000008);


	/** private ctor */
	private VkDisplayPlaneAlphaFlagBitsKHR(String name, int ordinal, int v) {
		 super(name, ordinal, v);
	}

 } // end of class VkDisplayPlaneAlphaFlagBitsKHR
