package bor.vulkan.enumerations;

import bor.enumerable.*;

/**
 * Class to wrap Vulkan enumeration VkPipelineCreateFlagBits
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