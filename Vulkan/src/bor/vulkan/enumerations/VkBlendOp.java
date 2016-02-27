package bor.vulkan.enumerations;

import bor.enumerable.*;

/**
 * Class to wrap Vulkan enumeration VkBlendOp
 * @author Alessandro Borges

 */
public class VkBlendOp extends IntEnum<VkBlendOp> {
	public static final VkBlendOp VK_BLEND_OP_ADD = new VkBlendOp("VK_BLEND_OP_ADD", 0, 0);
	public static final VkBlendOp VK_BLEND_OP_SUBTRACT = new VkBlendOp("VK_BLEND_OP_SUBTRACT", 1, 1);
	public static final VkBlendOp VK_BLEND_OP_REVERSE_SUBTRACT = new VkBlendOp("VK_BLEND_OP_REVERSE_SUBTRACT", 2, 2);
	public static final VkBlendOp VK_BLEND_OP_MIN = new VkBlendOp("VK_BLEND_OP_MIN", 3, 3);
	public static final VkBlendOp VK_BLEND_OP_MAX = new VkBlendOp("VK_BLEND_OP_MAX", 4, 4);
	public static final VkBlendOp VK_BLEND_OP_BEGIN_RANGE = new VkBlendOp("VK_BLEND_OP_BEGIN_RANGE", 5, VK_BLEND_OP_ADD.getValue() );
	public static final VkBlendOp VK_BLEND_OP_END_RANGE = new VkBlendOp("VK_BLEND_OP_END_RANGE", 6, VK_BLEND_OP_MAX.getValue() );
	public static final VkBlendOp VK_BLEND_OP_RANGE_SIZE = new VkBlendOp("VK_BLEND_OP_RANGE_SIZE", 7, (VK_BLEND_OP_END_RANGE.getValue() - VK_BLEND_OP_BEGIN_RANGE.getValue() + 1));
	public static final VkBlendOp VK_BLEND_OP_MAX_ENUM = new VkBlendOp("VK_BLEND_OP_MAX_ENUM", 8,  0x7FFFFFFF);


	/** private ctor */
	private VkBlendOp(String name, int ordinal, int v) {
		 super(name, ordinal, v);
	}

 } // end of class VkBlendOp