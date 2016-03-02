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
 * Class to wrap Vulkan enumeration VkPipelineCreateFlagBits
 *
 * <h3>Prototype</h3> <pre>
 * typedef enum VkPipelineCreateFlagBits {
 *     VK_PIPELINE_CREATE_DISABLE_OPTIMIZATION_BIT = 0x00000001,
 *     VK_PIPELINE_CREATE_ALLOW_DERIVATIVES_BIT = 0x00000002,
 *     VK_PIPELINE_CREATE_DERIVATIVE_BIT = 0x00000004,
 * } VkPipelineCreateFlagBits;
 * </pre>
 * @author Alessandro Borges
 */
public class VkPipelineCreateFlagBits extends IntEnum<VkPipelineCreateFlagBits> {
	public static final VkPipelineCreateFlagBits VK_PIPELINE_CREATE_DISABLE_OPTIMIZATION_BIT = new VkPipelineCreateFlagBits("VK_PIPELINE_CREATE_DISABLE_OPTIMIZATION_BIT", 0, 0x00000001);
	public static final VkPipelineCreateFlagBits VK_PIPELINE_CREATE_ALLOW_DERIVATIVES_BIT = new VkPipelineCreateFlagBits("VK_PIPELINE_CREATE_ALLOW_DERIVATIVES_BIT", 1, 0x00000002);
	public static final VkPipelineCreateFlagBits VK_PIPELINE_CREATE_DERIVATIVE_BIT = new VkPipelineCreateFlagBits("VK_PIPELINE_CREATE_DERIVATIVE_BIT", 2, 0x00000004);


	/** private ctor */
	private VkPipelineCreateFlagBits(String name, int ordinal, int v) {
		 super(name, ordinal, v);
	}

 } // end of class VkPipelineCreateFlagBits
