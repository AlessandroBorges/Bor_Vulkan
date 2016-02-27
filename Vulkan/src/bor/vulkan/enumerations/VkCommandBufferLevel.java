package bor.vulkan.enumerations;

import bor.enumerable.*;

/**
 * Class to wrap Vulkan enumeration VkCommandBufferLevel
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