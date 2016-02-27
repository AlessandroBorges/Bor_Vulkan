package bor.vulkan.enumerations;

import bor.enumerable.*;

/**
 * Class to wrap Vulkan enumeration VkSparseMemoryBindFlagBits
 * @author Alessandro Borges

 */
public class VkSparseMemoryBindFlagBits extends IntEnum<VkSparseMemoryBindFlagBits> {
	public static final VkSparseMemoryBindFlagBits VK_SPARSE_MEMORY_BIND_METADATA_BIT = new VkSparseMemoryBindFlagBits("VK_SPARSE_MEMORY_BIND_METADATA_BIT", 0, 0x00000001);


	/** private ctor */
	private VkSparseMemoryBindFlagBits(String name, int ordinal, int v) {
		 super(name, ordinal, v);
	}

 } // end of class VkSparseMemoryBindFlagBits