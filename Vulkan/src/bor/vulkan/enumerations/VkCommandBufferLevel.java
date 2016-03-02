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
 * Class to wrap Vulkan enumeration VkCommandBufferLevel
 *
 * <h3>Prototype</h3> <pre>
 * typedef enum VkCommandBufferLevel {
 *     VK_COMMAND_BUFFER_LEVEL_PRIMARY = 0,
 *     VK_COMMAND_BUFFER_LEVEL_SECONDARY = 1,
 *     VK_COMMAND_BUFFER_LEVEL_BEGIN_RANGE = VK_COMMAND_BUFFER_LEVEL_PRIMARY,
 *     VK_COMMAND_BUFFER_LEVEL_END_RANGE = VK_COMMAND_BUFFER_LEVEL_SECONDARY,
 *     VK_COMMAND_BUFFER_LEVEL_RANGE_SIZE = (VK_COMMAND_BUFFER_LEVEL_SECONDARY - VK_COMMAND_BUFFER_LEVEL_PRIMARY + 1),
 *     VK_COMMAND_BUFFER_LEVEL_MAX_ENUM = 0x7FFFFFFF
 * } VkCommandBufferLevel;
 * </pre>
 * @author Alessandro Borges
 */
public class VkCommandBufferLevel extends IntEnum<VkCommandBufferLevel> {
	public static final VkCommandBufferLevel VK_COMMAND_BUFFER_LEVEL_PRIMARY = new VkCommandBufferLevel("VK_COMMAND_BUFFER_LEVEL_PRIMARY", 0, 0);
	public static final VkCommandBufferLevel VK_COMMAND_BUFFER_LEVEL_SECONDARY = new VkCommandBufferLevel("VK_COMMAND_BUFFER_LEVEL_SECONDARY", 1, 1);


	/** private ctor */
	private VkCommandBufferLevel(String name, int ordinal, int v) {
		 super(name, ordinal, v);
	}

 } // end of class VkCommandBufferLevel
