package bor.vulkan.enumerations;

import bor.enumerable.*;

/**
 * Class to wrap Vulkan enumeration VkBlendFactor
 * @author Alessandro Borges

 */
public class VkBlendFactor extends IntEnum<VkBlendFactor> {
	public static final VkBlendFactor VK_BLEND_FACTOR_ZERO = new VkBlendFactor("VK_BLEND_FACTOR_ZERO", 0, 0);
	public static final VkBlendFactor VK_BLEND_FACTOR_ONE = new VkBlendFactor("VK_BLEND_FACTOR_ONE", 1, 1);
	public static final VkBlendFactor VK_BLEND_FACTOR_SRC_COLOR = new VkBlendFactor("VK_BLEND_FACTOR_SRC_COLOR", 2, 2);
	public static final VkBlendFactor VK_BLEND_FACTOR_ONE_MINUS_SRC_COLOR = new VkBlendFactor("VK_BLEND_FACTOR_ONE_MINUS_SRC_COLOR", 3, 3);
	public static final VkBlendFactor VK_BLEND_FACTOR_DST_COLOR = new VkBlendFactor("VK_BLEND_FACTOR_DST_COLOR", 4, 4);
	public static final VkBlendFactor VK_BLEND_FACTOR_ONE_MINUS_DST_COLOR = new VkBlendFactor("VK_BLEND_FACTOR_ONE_MINUS_DST_COLOR", 5, 5);
	public static final VkBlendFactor VK_BLEND_FACTOR_SRC_ALPHA = new VkBlendFactor("VK_BLEND_FACTOR_SRC_ALPHA", 6, 6);
	public static final VkBlendFactor VK_BLEND_FACTOR_ONE_MINUS_SRC_ALPHA = new VkBlendFactor("VK_BLEND_FACTOR_ONE_MINUS_SRC_ALPHA", 7, 7);
	public static final VkBlendFactor VK_BLEND_FACTOR_DST_ALPHA = new VkBlendFactor("VK_BLEND_FACTOR_DST_ALPHA", 8, 8);
	public static final VkBlendFactor VK_BLEND_FACTOR_ONE_MINUS_DST_ALPHA = new VkBlendFactor("VK_BLEND_FACTOR_ONE_MINUS_DST_ALPHA", 9, 9);
	public static final VkBlendFactor VK_BLEND_FACTOR_CONSTANT_COLOR = new VkBlendFactor("VK_BLEND_FACTOR_CONSTANT_COLOR", 10, 10);
	public static final VkBlendFactor VK_BLEND_FACTOR_ONE_MINUS_CONSTANT_COLOR = new VkBlendFactor("VK_BLEND_FACTOR_ONE_MINUS_CONSTANT_COLOR", 11, 11);
	public static final VkBlendFactor VK_BLEND_FACTOR_CONSTANT_ALPHA = new VkBlendFactor("VK_BLEND_FACTOR_CONSTANT_ALPHA", 12, 12);
	public static final VkBlendFactor VK_BLEND_FACTOR_ONE_MINUS_CONSTANT_ALPHA = new VkBlendFactor("VK_BLEND_FACTOR_ONE_MINUS_CONSTANT_ALPHA", 13, 13);
	public static final VkBlendFactor VK_BLEND_FACTOR_SRC_ALPHA_SATURATE = new VkBlendFactor("VK_BLEND_FACTOR_SRC_ALPHA_SATURATE", 14, 14);
	public static final VkBlendFactor VK_BLEND_FACTOR_SRC1_COLOR = new VkBlendFactor("VK_BLEND_FACTOR_SRC1_COLOR", 15, 15);
	public static final VkBlendFactor VK_BLEND_FACTOR_ONE_MINUS_SRC1_COLOR = new VkBlendFactor("VK_BLEND_FACTOR_ONE_MINUS_SRC1_COLOR", 16, 16);
	public static final VkBlendFactor VK_BLEND_FACTOR_SRC1_ALPHA = new VkBlendFactor("VK_BLEND_FACTOR_SRC1_ALPHA", 17, 17);
	public static final VkBlendFactor VK_BLEND_FACTOR_ONE_MINUS_SRC1_ALPHA = new VkBlendFactor("VK_BLEND_FACTOR_ONE_MINUS_SRC1_ALPHA", 18, 18);
	public static final VkBlendFactor VK_BLEND_FACTOR_BEGIN_RANGE = new VkBlendFactor("VK_BLEND_FACTOR_BEGIN_RANGE", 19, VK_BLEND_FACTOR_ZERO.getValue() );
	public static final VkBlendFactor VK_BLEND_FACTOR_END_RANGE = new VkBlendFactor("VK_BLEND_FACTOR_END_RANGE", 20, VK_BLEND_FACTOR_ONE_MINUS_SRC1_ALPHA.getValue() );
	public static final VkBlendFactor VK_BLEND_FACTOR_RANGE_SIZE = new VkBlendFactor("VK_BLEND_FACTOR_RANGE_SIZE", 21, (VK_BLEND_FACTOR_END_RANGE.getValue() - VK_BLEND_FACTOR_BEGIN_RANGE.getValue() + 1));
	public static final VkBlendFactor VK_BLEND_FACTOR_MAX_ENUM = new VkBlendFactor("VK_BLEND_FACTOR_MAX_ENUM", 22,  0x7FFFFFFF);


	/** private ctor */
	private VkBlendFactor(String name, int ordinal, int v) {
		 super(name, ordinal, v);
	}

 } // end of class VkBlendFactor