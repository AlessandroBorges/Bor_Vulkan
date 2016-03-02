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
 * Class to wrap Vulkan enumeration VkCommandPoolResetFlagBits
 *
 * <h3>Prototype</h3> <pre>
 * typedef enum VkCommandPoolResetFlagBits {
 *     VK_COMMAND_POOL_RESET_RELEASE_RESOURCES_BIT = 0x00000001,
 * } VkCommandPoolResetFlagBits;
 * </pre>
 * @author Alessandro Borges
 */
public class VkCommandPoolResetFlagBits extends IntEnum<VkCommandPoolResetFlagBits> {
	public static final VkCommandPoolResetFlagBits VK_COMMAND_POOL_RESET_RELEASE_RESOURCES_BIT = new VkCommandPoolResetFlagBits("VK_COMMAND_POOL_RESET_RELEASE_RESOURCES_BIT", 0, 0x00000001);


	/** private ctor */
	private VkCommandPoolResetFlagBits(String name, int ordinal, int v) {
		 super(name, ordinal, v);
	}

 } // end of class VkCommandPoolResetFlagBits
