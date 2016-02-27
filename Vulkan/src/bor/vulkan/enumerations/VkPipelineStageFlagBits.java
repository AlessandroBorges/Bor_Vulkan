package bor.vulkan.enumerations;

import bor.enumerable.*;

/**
 * Class to wrap Vulkan enumeration VkPipelineStageFlagBits
 * @author Alessandro Borges

 */
public class VkPipelineStageFlagBits extends IntEnum<VkPipelineStageFlagBits> {
	public static final VkPipelineStageFlagBits VK_PIPELINE_STAGE_TOP_OF_PIPE_BIT = new VkPipelineStageFlagBits("VK_PIPELINE_STAGE_TOP_OF_PIPE_BIT", 0, 0x00000001);
	public static final VkPipelineStageFlagBits VK_PIPELINE_STAGE_DRAW_INDIRECT_BIT = new VkPipelineStageFlagBits("VK_PIPELINE_STAGE_DRAW_INDIRECT_BIT", 1, 0x00000002);
	public static final VkPipelineStageFlagBits VK_PIPELINE_STAGE_VERTEX_INPUT_BIT = new VkPipelineStageFlagBits("VK_PIPELINE_STAGE_VERTEX_INPUT_BIT", 2, 0x00000004);
	public static final VkPipelineStageFlagBits VK_PIPELINE_STAGE_VERTEX_SHADER_BIT = new VkPipelineStageFlagBits("VK_PIPELINE_STAGE_VERTEX_SHADER_BIT", 3, 0x00000008);
	public static final VkPipelineStageFlagBits VK_PIPELINE_STAGE_TESSELLATION_CONTROL_SHADER_BIT = new VkPipelineStageFlagBits("VK_PIPELINE_STAGE_TESSELLATION_CONTROL_SHADER_BIT", 4, 0x00000010);
	public static final VkPipelineStageFlagBits VK_PIPELINE_STAGE_TESSELLATION_EVALUATION_SHADER_BIT = new VkPipelineStageFlagBits("VK_PIPELINE_STAGE_TESSELLATION_EVALUATION_SHADER_BIT", 5, 0x00000020);
	public static final VkPipelineStageFlagBits VK_PIPELINE_STAGE_GEOMETRY_SHADER_BIT = new VkPipelineStageFlagBits("VK_PIPELINE_STAGE_GEOMETRY_SHADER_BIT", 6, 0x00000040);
	public static final VkPipelineStageFlagBits VK_PIPELINE_STAGE_FRAGMENT_SHADER_BIT = new VkPipelineStageFlagBits("VK_PIPELINE_STAGE_FRAGMENT_SHADER_BIT", 7, 0x00000080);
	public static final VkPipelineStageFlagBits VK_PIPELINE_STAGE_EARLY_FRAGMENT_TESTS_BIT = new VkPipelineStageFlagBits("VK_PIPELINE_STAGE_EARLY_FRAGMENT_TESTS_BIT", 8, 0x00000100);
	public static final VkPipelineStageFlagBits VK_PIPELINE_STAGE_LATE_FRAGMENT_TESTS_BIT = new VkPipelineStageFlagBits("VK_PIPELINE_STAGE_LATE_FRAGMENT_TESTS_BIT", 9, 0x00000200);
	public static final VkPipelineStageFlagBits VK_PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT = new VkPipelineStageFlagBits("VK_PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT", 10, 0x00000400);
	public static final VkPipelineStageFlagBits VK_PIPELINE_STAGE_COMPUTE_SHADER_BIT = new VkPipelineStageFlagBits("VK_PIPELINE_STAGE_COMPUTE_SHADER_BIT", 11, 0x00000800);
	public static final VkPipelineStageFlagBits VK_PIPELINE_STAGE_TRANSFER_BIT = new VkPipelineStageFlagBits("VK_PIPELINE_STAGE_TRANSFER_BIT", 12, 0x00001000);
	public static final VkPipelineStageFlagBits VK_PIPELINE_STAGE_BOTTOM_OF_PIPE_BIT = new VkPipelineStageFlagBits("VK_PIPELINE_STAGE_BOTTOM_OF_PIPE_BIT", 13, 0x00002000);
	public static final VkPipelineStageFlagBits VK_PIPELINE_STAGE_HOST_BIT = new VkPipelineStageFlagBits("VK_PIPELINE_STAGE_HOST_BIT", 14, 0x00004000);
	public static final VkPipelineStageFlagBits VK_PIPELINE_STAGE_ALL_GRAPHICS_BIT = new VkPipelineStageFlagBits("VK_PIPELINE_STAGE_ALL_GRAPHICS_BIT", 15, 0x00008000);
	public static final VkPipelineStageFlagBits VK_PIPELINE_STAGE_ALL_COMMANDS_BIT = new VkPipelineStageFlagBits("VK_PIPELINE_STAGE_ALL_COMMANDS_BIT", 16, 0x00010000);


	/** private ctor */
	private VkPipelineStageFlagBits(String name, int ordinal, int v) {
		 super(name, ordinal, v);
	}

 } // end of class VkPipelineStageFlagBits