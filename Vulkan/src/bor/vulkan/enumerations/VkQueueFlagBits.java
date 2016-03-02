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
 * Class to wrap Vulkan enumeration VkQueueFlagBits
 *
 * <h3>Prototype</h3> <pre>
 * typedef enum VkQueueFlagBits {
 *     VK_QUEUE_GRAPHICS_BIT = 0x00000001,
 *     VK_QUEUE_COMPUTE_BIT = 0x00000002,
 *     VK_QUEUE_TRANSFER_BIT = 0x00000004,
 *     VK_QUEUE_SPARSE_BINDING_BIT = 0x00000008,
 * } VkQueueFlagBits;
 * </pre>
 * @author Alessandro Borges
 */
public class VkQueueFlagBits extends IntEnum<VkQueueFlagBits> {
	public static final VkQueueFlagBits VK_QUEUE_GRAPHICS_BIT = new VkQueueFlagBits("VK_QUEUE_GRAPHICS_BIT", 0, 0x00000001);
	public static final VkQueueFlagBits VK_QUEUE_COMPUTE_BIT = new VkQueueFlagBits("VK_QUEUE_COMPUTE_BIT", 1, 0x00000002);
	public static final VkQueueFlagBits VK_QUEUE_TRANSFER_BIT = new VkQueueFlagBits("VK_QUEUE_TRANSFER_BIT", 2, 0x00000004);
	public static final VkQueueFlagBits VK_QUEUE_SPARSE_BINDING_BIT = new VkQueueFlagBits("VK_QUEUE_SPARSE_BINDING_BIT", 3, 0x00000008);


	/** private ctor */
	private VkQueueFlagBits(String name, int ordinal, int v) {
		 super(name, ordinal, v);
	}

 } // end of class VkQueueFlagBits
