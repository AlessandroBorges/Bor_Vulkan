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
 * Class to wrap Vulkan enumeration VkDescriptorPoolCreateFlagBits
 *
 * <h3>Prototype</h3> <pre>
 * typedef enum VkDescriptorPoolCreateFlagBits {
 *     VK_DESCRIPTOR_POOL_CREATE_FREE_DESCRIPTOR_SET_BIT = 0x00000001,
 * } VkDescriptorPoolCreateFlagBits;
 * </pre>
 * @author Alessandro Borges
 */
public class VkDescriptorPoolCreateFlagBits extends IntEnum<VkDescriptorPoolCreateFlagBits> {
	public static final VkDescriptorPoolCreateFlagBits VK_DESCRIPTOR_POOL_CREATE_FREE_DESCRIPTOR_SET_BIT = new VkDescriptorPoolCreateFlagBits("VK_DESCRIPTOR_POOL_CREATE_FREE_DESCRIPTOR_SET_BIT", 0, 0x00000001);


	/** private ctor */
	private VkDescriptorPoolCreateFlagBits(String name, int ordinal, int v) {
		 super(name, ordinal, v);
	}

 } // end of class VkDescriptorPoolCreateFlagBits
