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
 * Class to wrap Vulkan enumeration VkSparseMemoryBindFlagBits
 *
 * <h3>Prototype</h3> <pre>
 * typedef enum VkSparseMemoryBindFlagBits {
 *     VK_SPARSE_MEMORY_BIND_METADATA_BIT = 0x00000001,
 * } VkSparseMemoryBindFlagBits;
 * </pre>
 * @author Alessandro Borges
 */
public class VkSparseMemoryBindFlagBits extends IntEnum<VkSparseMemoryBindFlagBits> {
	public static final VkSparseMemoryBindFlagBits VK_SPARSE_MEMORY_BIND_METADATA_BIT = new VkSparseMemoryBindFlagBits("VK_SPARSE_MEMORY_BIND_METADATA_BIT", 0, 0x00000001);


	/** private ctor */
	private VkSparseMemoryBindFlagBits(String name, int ordinal, int v) {
		 super(name, ordinal, v);
	}

 } // end of class VkSparseMemoryBindFlagBits
