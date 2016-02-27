package bor.vulkan.enumerations;

import bor.enumerable.*;

/**
 * Class to wrap Vulkan enumeration VkCommandPoolResetFlagBits
 * @author Alessandro Borges

 */
public class VkCommandPoolResetFlagBits extends IntEnum<VkCommandPoolResetFlagBits> {
	public static final VkCommandPoolResetFlagBits VK_COMMAND_POOL_RESET_RELEASE_RESOURCES_BIT = new VkCommandPoolResetFlagBits("VK_COMMAND_POOL_RESET_RELEASE_RESOURCES_BIT", 0, 0x00000001);


	/** private ctor */
	private VkCommandPoolResetFlagBits(String name, int ordinal, int v) {
		 super(name, ordinal, v);
	}

 } // end of class VkCommandPoolResetFlagBits