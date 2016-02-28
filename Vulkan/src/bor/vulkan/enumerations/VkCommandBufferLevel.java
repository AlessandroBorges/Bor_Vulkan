/**
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
	public static final VkCommandBufferLevel VK_COMMAND_BUFFER_LEVEL_BEGIN_RANGE = new VkCommandBufferLevel("VK_COMMAND_BUFFER_LEVEL_BEGIN_RANGE", 2, VK_COMMAND_BUFFER_LEVEL_PRIMARY.getValue() );
	public static final VkCommandBufferLevel VK_COMMAND_BUFFER_LEVEL_END_RANGE = new VkCommandBufferLevel("VK_COMMAND_BUFFER_LEVEL_END_RANGE", 3, VK_COMMAND_BUFFER_LEVEL_SECONDARY.getValue() );
	public static final VkCommandBufferLevel VK_COMMAND_BUFFER_LEVEL_RANGE_SIZE = new VkCommandBufferLevel("VK_COMMAND_BUFFER_LEVEL_RANGE_SIZE", 4, (VK_COMMAND_BUFFER_LEVEL_END_RANGE.getValue() - VK_COMMAND_BUFFER_LEVEL_BEGIN_RANGE.getValue() + 1));
	public static final VkCommandBufferLevel VK_COMMAND_BUFFER_LEVEL_MAX_ENUM = new VkCommandBufferLevel("VK_COMMAND_BUFFER_LEVEL_MAX_ENUM", 5,  0x7FFFFFFF);


	/** private ctor */
	private VkCommandBufferLevel(String name, int ordinal, int v) {
		 super(name, ordinal, v);
	}

 } // end of class VkCommandBufferLevel
