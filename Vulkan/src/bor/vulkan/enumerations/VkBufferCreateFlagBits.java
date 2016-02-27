package bor.vulkan.enumerations;

import bor.enumerable.*;

/**
 * Class to wrap Vulkan enumeration VkBufferCreateFlagBits
 * @author Alessandro Borges

 */
public class VkBufferCreateFlagBits extends IntEnum<VkBufferCreateFlagBits> {
	public static final VkBufferCreateFlagBits VK_BUFFER_CREATE_SPARSE_BINDING_BIT = new VkBufferCreateFlagBits("VK_BUFFER_CREATE_SPARSE_BINDING_BIT", 0, 0x00000001);
	public static final VkBufferCreateFlagBits VK_BUFFER_CREATE_SPARSE_RESIDENCY_BIT = new VkBufferCreateFlagBits("VK_BUFFER_CREATE_SPARSE_RESIDENCY_BIT", 1, 0x00000002);
	public static final VkBufferCreateFlagBits VK_BUFFER_CREATE_SPARSE_ALIASED_BIT = new VkBufferCreateFlagBits("VK_BUFFER_CREATE_SPARSE_ALIASED_BIT", 2, 0x00000004);


	/** private ctor */
	private VkBufferCreateFlagBits(String name, int ordinal, int v) {
		 super(name, ordinal, v);
	}

 } // end of class VkBufferCreateFlagBits