package bor.vulkan.enumerations;

import bor.enumerable.*;

/**
 * Class to wrap Vulkan enumeration VkCommandBufferResetFlagBits
 * @author Alessandro Borges

 */
public class VkCommandBufferResetFlagBits extends IntEnum<VkCommandBufferResetFlagBits> {
	public static final VkCommandBufferResetFlagBits VK_COMMAND_BUFFER_RESET_RELEASE_RESOURCES_BIT = new VkCommandBufferResetFlagBits("VK_COMMAND_BUFFER_RESET_RELEASE_RESOURCES_BIT", 0, 0x00000001);


	/** private ctor */
	private VkCommandBufferResetFlagBits(String name, int ordinal, int v) {
		 super(name, ordinal, v);
	}

 } // end of class VkCommandBufferResetFlagBits