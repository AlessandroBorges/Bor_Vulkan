/**
 * Licence terms: 
 * The MIT License (MIT)
 * Copyright (c) 2016 Alessandro Borges
 * See https://opensource.org/licenses/MIT 
 */
package bor.vulkan.enumerations;

import bor.enumerable.*;

/**
 * Class to wrap Vulkan enumeration VkCompositeAlphaFlagBitsKHR
 *
 * <h3>Prototype</h3> <pre>
 * typedef enum VkCompositeAlphaFlagBitsKHR {
 *     VK_COMPOSITE_ALPHA_OPAQUE_BIT_KHR = 0x00000001,
 *     VK_COMPOSITE_ALPHA_PRE_MULTIPLIED_BIT_KHR = 0x00000002,
 *     VK_COMPOSITE_ALPHA_POST_MULTIPLIED_BIT_KHR = 0x00000004,
 *     VK_COMPOSITE_ALPHA_INHERIT_BIT_KHR = 0x00000008,
 * } VkCompositeAlphaFlagBitsKHR;
 * </pre>
 * @author Alessandro Borges
 */
public class VkCompositeAlphaFlagBitsKHR extends IntEnum<VkCompositeAlphaFlagBitsKHR> {
	public static final VkCompositeAlphaFlagBitsKHR VK_COMPOSITE_ALPHA_OPAQUE_BIT_KHR = new VkCompositeAlphaFlagBitsKHR("VK_COMPOSITE_ALPHA_OPAQUE_BIT_KHR", 0, 0x00000001);
	public static final VkCompositeAlphaFlagBitsKHR VK_COMPOSITE_ALPHA_PRE_MULTIPLIED_BIT_KHR = new VkCompositeAlphaFlagBitsKHR("VK_COMPOSITE_ALPHA_PRE_MULTIPLIED_BIT_KHR", 1, 0x00000002);
	public static final VkCompositeAlphaFlagBitsKHR VK_COMPOSITE_ALPHA_POST_MULTIPLIED_BIT_KHR = new VkCompositeAlphaFlagBitsKHR("VK_COMPOSITE_ALPHA_POST_MULTIPLIED_BIT_KHR", 2, 0x00000004);
	public static final VkCompositeAlphaFlagBitsKHR VK_COMPOSITE_ALPHA_INHERIT_BIT_KHR = new VkCompositeAlphaFlagBitsKHR("VK_COMPOSITE_ALPHA_INHERIT_BIT_KHR", 3, 0x00000008);


	/** private ctor */
	private VkCompositeAlphaFlagBitsKHR(String name, int ordinal, int v) {
		 super(name, ordinal, v);
	}

 } // end of class VkCompositeAlphaFlagBitsKHR
