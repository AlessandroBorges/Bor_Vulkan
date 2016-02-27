package bor.vulkan.enumerations;

import bor.enumerable.*;

/**
 * Class to wrap Vulkan enumeration VkShaderStageFlagBits
 * @author Alessandro Borges

 */
public class VkShaderStageFlagBits extends IntEnum<VkShaderStageFlagBits> {
	public static final VkShaderStageFlagBits VK_SHADER_STAGE_VERTEX_BIT = new VkShaderStageFlagBits("VK_SHADER_STAGE_VERTEX_BIT", 0, 0x00000001);
	public static final VkShaderStageFlagBits VK_SHADER_STAGE_TESSELLATION_CONTROL_BIT = new VkShaderStageFlagBits("VK_SHADER_STAGE_TESSELLATION_CONTROL_BIT", 1, 0x00000002);
	public static final VkShaderStageFlagBits VK_SHADER_STAGE_TESSELLATION_EVALUATION_BIT = new VkShaderStageFlagBits("VK_SHADER_STAGE_TESSELLATION_EVALUATION_BIT", 2, 0x00000004);
	public static final VkShaderStageFlagBits VK_SHADER_STAGE_GEOMETRY_BIT = new VkShaderStageFlagBits("VK_SHADER_STAGE_GEOMETRY_BIT", 3, 0x00000008);
	public static final VkShaderStageFlagBits VK_SHADER_STAGE_FRAGMENT_BIT = new VkShaderStageFlagBits("VK_SHADER_STAGE_FRAGMENT_BIT", 4, 0x00000010);
	public static final VkShaderStageFlagBits VK_SHADER_STAGE_COMPUTE_BIT = new VkShaderStageFlagBits("VK_SHADER_STAGE_COMPUTE_BIT", 5, 0x00000020);
	public static final VkShaderStageFlagBits VK_SHADER_STAGE_ALL_GRAPHICS = new VkShaderStageFlagBits("VK_SHADER_STAGE_ALL_GRAPHICS", 6, 0x1F);
	public static final VkShaderStageFlagBits VK_SHADER_STAGE_ALL = new VkShaderStageFlagBits("VK_SHADER_STAGE_ALL", 7, 0x7FFFFFFF);


	/** private ctor */
	private VkShaderStageFlagBits(String name, int ordinal, int v) {
		 super(name, ordinal, v);
	}

 } // end of class VkShaderStageFlagBits