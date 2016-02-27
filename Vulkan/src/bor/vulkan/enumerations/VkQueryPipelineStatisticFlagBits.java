package bor.vulkan.enumerations;

import bor.enumerable.*;

/**
 * Class to wrap Vulkan enumeration VkQueryPipelineStatisticFlagBits
 * @author Alessandro Borges

 */
public class VkQueryPipelineStatisticFlagBits extends IntEnum<VkQueryPipelineStatisticFlagBits> {
	public static final VkQueryPipelineStatisticFlagBits VK_QUERY_PIPELINE_STATISTIC_INPUT_ASSEMBLY_VERTICES_BIT = new VkQueryPipelineStatisticFlagBits("VK_QUERY_PIPELINE_STATISTIC_INPUT_ASSEMBLY_VERTICES_BIT", 0, 0x00000001);
	public static final VkQueryPipelineStatisticFlagBits VK_QUERY_PIPELINE_STATISTIC_INPUT_ASSEMBLY_PRIMITIVES_BIT = new VkQueryPipelineStatisticFlagBits("VK_QUERY_PIPELINE_STATISTIC_INPUT_ASSEMBLY_PRIMITIVES_BIT", 1, 0x00000002);
	public static final VkQueryPipelineStatisticFlagBits VK_QUERY_PIPELINE_STATISTIC_VERTEX_SHADER_INVOCATIONS_BIT = new VkQueryPipelineStatisticFlagBits("VK_QUERY_PIPELINE_STATISTIC_VERTEX_SHADER_INVOCATIONS_BIT", 2, 0x00000004);
	public static final VkQueryPipelineStatisticFlagBits VK_QUERY_PIPELINE_STATISTIC_GEOMETRY_SHADER_INVOCATIONS_BIT = new VkQueryPipelineStatisticFlagBits("VK_QUERY_PIPELINE_STATISTIC_GEOMETRY_SHADER_INVOCATIONS_BIT", 3, 0x00000008);
	public static final VkQueryPipelineStatisticFlagBits VK_QUERY_PIPELINE_STATISTIC_GEOMETRY_SHADER_PRIMITIVES_BIT = new VkQueryPipelineStatisticFlagBits("VK_QUERY_PIPELINE_STATISTIC_GEOMETRY_SHADER_PRIMITIVES_BIT", 4, 0x00000010);
	public static final VkQueryPipelineStatisticFlagBits VK_QUERY_PIPELINE_STATISTIC_CLIPPING_INVOCATIONS_BIT = new VkQueryPipelineStatisticFlagBits("VK_QUERY_PIPELINE_STATISTIC_CLIPPING_INVOCATIONS_BIT", 5, 0x00000020);
	public static final VkQueryPipelineStatisticFlagBits VK_QUERY_PIPELINE_STATISTIC_CLIPPING_PRIMITIVES_BIT = new VkQueryPipelineStatisticFlagBits("VK_QUERY_PIPELINE_STATISTIC_CLIPPING_PRIMITIVES_BIT", 6, 0x00000040);
	public static final VkQueryPipelineStatisticFlagBits VK_QUERY_PIPELINE_STATISTIC_FRAGMENT_SHADER_INVOCATIONS_BIT = new VkQueryPipelineStatisticFlagBits("VK_QUERY_PIPELINE_STATISTIC_FRAGMENT_SHADER_INVOCATIONS_BIT", 7, 0x00000080);
	public static final VkQueryPipelineStatisticFlagBits VK_QUERY_PIPELINE_STATISTIC_TESSELLATION_CONTROL_SHADER_PATCHES_BIT = new VkQueryPipelineStatisticFlagBits("VK_QUERY_PIPELINE_STATISTIC_TESSELLATION_CONTROL_SHADER_PATCHES_BIT", 8, 0x00000100);
	public static final VkQueryPipelineStatisticFlagBits VK_QUERY_PIPELINE_STATISTIC_TESSELLATION_EVALUATION_SHADER_INVOCATIONS_BIT = new VkQueryPipelineStatisticFlagBits("VK_QUERY_PIPELINE_STATISTIC_TESSELLATION_EVALUATION_SHADER_INVOCATIONS_BIT", 9, 0x00000200);
	public static final VkQueryPipelineStatisticFlagBits VK_QUERY_PIPELINE_STATISTIC_COMPUTE_SHADER_INVOCATIONS_BIT = new VkQueryPipelineStatisticFlagBits("VK_QUERY_PIPELINE_STATISTIC_COMPUTE_SHADER_INVOCATIONS_BIT", 10, 0x00000400);


	/** private ctor */
	private VkQueryPipelineStatisticFlagBits(String name, int ordinal, int v) {
		 super(name, ordinal, v);
	}

 } // end of class VkQueryPipelineStatisticFlagBits