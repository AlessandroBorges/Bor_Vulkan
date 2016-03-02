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
 * Class to wrap Vulkan enumeration VkBufferCreateFlagBits
 *
 * <h3>Prototype</h3> <pre>
 * typedef enum VkBufferCreateFlagBits {
 *     VK_BUFFER_CREATE_SPARSE_BINDING_BIT = 0x00000001,
 *     VK_BUFFER_CREATE_SPARSE_RESIDENCY_BIT = 0x00000002,
 *     VK_BUFFER_CREATE_SPARSE_ALIASED_BIT = 0x00000004,
 * } VkBufferCreateFlagBits;
 * </pre>
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
