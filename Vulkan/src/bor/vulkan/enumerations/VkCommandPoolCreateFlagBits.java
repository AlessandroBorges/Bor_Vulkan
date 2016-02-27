package bor.vulkan.enumerations;

import bor.enumerable.*;

/**
 * Class to wrap Vulkan enumeration VkCommandPoolCreateFlagBits
 * @author Alessandro Borges

 */
public class VkCommandPoolCreateFlagBits extends IntEnum<VkCommandPoolCreateFlagBits> {
	public static final VkCommandPoolCreateFlagBits VK_COMMAND_POOL_CREATE_TRANSIENT_BIT = new VkCommandPoolCreateFlagBits("VK_COMMAND_POOL_CREATE_TRANSIENT_BIT", 0, 0x00000001);
	public static final VkCommandPoolCreateFlagBits VK_COMMAND_POOL_CREATE_RESET_COMMAND_BUFFER_BIT = new VkCommandPoolCreateFlagBits("VK_COMMAND_POOL_CREATE_RESET_COMMAND_BUFFER_BIT", 1, 0x00000002);


	/** private ctor */
	private VkCommandPoolCreateFlagBits(String name, int ordinal, int v) {
		 super(name, ordinal, v);
	}

 } // end of class VkCommandPoolCreateFlagBits