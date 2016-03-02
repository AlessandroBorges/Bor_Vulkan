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
 * Class to wrap Vulkan enumeration VkCommandBufferUsageFlagBits
 *
 * <h3>Prototype</h3> <pre>
 * typedef enum VkCommandBufferUsageFlagBits {
 *     VK_COMMAND_BUFFER_USAGE_ONE_TIME_SUBMIT_BIT = 0x00000001,
 *     VK_COMMAND_BUFFER_USAGE_RENDER_PASS_CONTINUE_BIT = 0x00000002,
 *     VK_COMMAND_BUFFER_USAGE_SIMULTANEOUS_USE_BIT = 0x00000004,
 * } VkCommandBufferUsageFlagBits;
 * </pre>
 * @author Alessandro Borges
 */
public class VkCommandBufferUsageFlagBits extends IntEnum<VkCommandBufferUsageFlagBits> {
	public static final VkCommandBufferUsageFlagBits VK_COMMAND_BUFFER_USAGE_ONE_TIME_SUBMIT_BIT = new VkCommandBufferUsageFlagBits("VK_COMMAND_BUFFER_USAGE_ONE_TIME_SUBMIT_BIT", 0, 0x00000001);
	public static final VkCommandBufferUsageFlagBits VK_COMMAND_BUFFER_USAGE_RENDER_PASS_CONTINUE_BIT = new VkCommandBufferUsageFlagBits("VK_COMMAND_BUFFER_USAGE_RENDER_PASS_CONTINUE_BIT", 1, 0x00000002);
	public static final VkCommandBufferUsageFlagBits VK_COMMAND_BUFFER_USAGE_SIMULTANEOUS_USE_BIT = new VkCommandBufferUsageFlagBits("VK_COMMAND_BUFFER_USAGE_SIMULTANEOUS_USE_BIT", 2, 0x00000004);


	/** private ctor */
	private VkCommandBufferUsageFlagBits(String name, int ordinal, int v) {
		 super(name, ordinal, v);
	}

 } // end of class VkCommandBufferUsageFlagBits
