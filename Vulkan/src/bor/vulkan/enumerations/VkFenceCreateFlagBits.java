/**
 * Licence terms: 
 * The MIT License (MIT)
 * Copyright (c) 2016 Alessandro Borges
 * See https://opensource.org/licenses/MIT 
 */
package bor.vulkan.enumerations;

import bor.enumerable.*;

/**
 * Class to wrap Vulkan enumeration VkFenceCreateFlagBits
 *
 * <h3>Prototype</h3> <pre>
 * typedef enum VkFenceCreateFlagBits {
 *     VK_FENCE_CREATE_SIGNALED_BIT = 0x00000001,
 * } VkFenceCreateFlagBits;
 * </pre>
 * @author Alessandro Borges
 */
public class VkFenceCreateFlagBits extends IntEnum<VkFenceCreateFlagBits> {
	public static final VkFenceCreateFlagBits VK_FENCE_CREATE_SIGNALED_BIT = new VkFenceCreateFlagBits("VK_FENCE_CREATE_SIGNALED_BIT", 0, 0x00000001);


	/** private ctor */
	private VkFenceCreateFlagBits(String name, int ordinal, int v) {
		 super(name, ordinal, v);
	}

 } // end of class VkFenceCreateFlagBits
