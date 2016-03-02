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
 * Class to wrap Vulkan enumeration VkCommandBufferResetFlagBits
 *
 * <h3>Prototype</h3> <pre>
 * typedef enum VkCommandBufferResetFlagBits {
 *     VK_COMMAND_BUFFER_RESET_RELEASE_RESOURCES_BIT = 0x00000001,
 * } VkCommandBufferResetFlagBits;
 * </pre>
 * @author Alessandro Borges
 */
public class VkCommandBufferResetFlagBits extends IntEnum<VkCommandBufferResetFlagBits> {
	public static final VkCommandBufferResetFlagBits VK_COMMAND_BUFFER_RESET_RELEASE_RESOURCES_BIT = new VkCommandBufferResetFlagBits("VK_COMMAND_BUFFER_RESET_RELEASE_RESOURCES_BIT", 0, 0x00000001);


	/** private ctor */
	private VkCommandBufferResetFlagBits(String name, int ordinal, int v) {
		 super(name, ordinal, v);
	}

 } // end of class VkCommandBufferResetFlagBits
