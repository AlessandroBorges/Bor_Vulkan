/**
 * Licence terms: 
 * The MIT License (MIT)
 * Copyright (c) 2016 Alessandro Borges
 * See https://opensource.org/licenses/MIT 
 */
package bor.vulkan.enumerations;

import bor.enumerable.*;

/**
 * Class to wrap Vulkan enumeration VkQueryControlFlagBits
 *
 * <h3>Prototype</h3> <pre>
 * typedef enum VkQueryControlFlagBits {
 *     VK_QUERY_CONTROL_PRECISE_BIT = 0x00000001,
 * } VkQueryControlFlagBits;
 * </pre>
 * @author Alessandro Borges
 */
public class VkQueryControlFlagBits extends IntEnum<VkQueryControlFlagBits> {
	public static final VkQueryControlFlagBits VK_QUERY_CONTROL_PRECISE_BIT = new VkQueryControlFlagBits("VK_QUERY_CONTROL_PRECISE_BIT", 0, 0x00000001);


	/** private ctor */
	private VkQueryControlFlagBits(String name, int ordinal, int v) {
		 super(name, ordinal, v);
	}

 } // end of class VkQueryControlFlagBits
