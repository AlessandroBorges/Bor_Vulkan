package bor.vulkan.enumerations;

import bor.enumerable.*;

/**
 * Class to wrap Vulkan enumeration VkDescriptorPoolCreateFlagBits
 * @author Alessandro Borges

 */
public class VkDescriptorPoolCreateFlagBits extends IntEnum<VkDescriptorPoolCreateFlagBits> {
	public static final VkDescriptorPoolCreateFlagBits VK_DESCRIPTOR_POOL_CREATE_FREE_DESCRIPTOR_SET_BIT = new VkDescriptorPoolCreateFlagBits("VK_DESCRIPTOR_POOL_CREATE_FREE_DESCRIPTOR_SET_BIT", 0, 0x00000001);


	/** private ctor */
	private VkDescriptorPoolCreateFlagBits(String name, int ordinal, int v) {
		 super(name, ordinal, v);
	}

 } // end of class VkDescriptorPoolCreateFlagBits