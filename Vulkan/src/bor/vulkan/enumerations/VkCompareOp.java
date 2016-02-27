package bor.vulkan.enumerations;

import bor.enumerable.*;

/**
 * Class to wrap Vulkan enumeration VkCompareOp
 * @author Alessandro Borges

 */
public class VkCompareOp extends IntEnum<VkCompareOp> {
	public static final VkCompareOp VK_COMPARE_OP_NEVER = new VkCompareOp("VK_COMPARE_OP_NEVER", 0, 0);
	public static final VkCompareOp VK_COMPARE_OP_LESS = new VkCompareOp("VK_COMPARE_OP_LESS", 1, 1);
	public static final VkCompareOp VK_COMPARE_OP_EQUAL = new VkCompareOp("VK_COMPARE_OP_EQUAL", 2, 2);
	public static final VkCompareOp VK_COMPARE_OP_LESS_OR_EQUAL = new VkCompareOp("VK_COMPARE_OP_LESS_OR_EQUAL", 3, 3);
	public static final VkCompareOp VK_COMPARE_OP_GREATER = new VkCompareOp("VK_COMPARE_OP_GREATER", 4, 4);
	public static final VkCompareOp VK_COMPARE_OP_NOT_EQUAL = new VkCompareOp("VK_COMPARE_OP_NOT_EQUAL", 5, 5);
	public static final VkCompareOp VK_COMPARE_OP_GREATER_OR_EQUAL = new VkCompareOp("VK_COMPARE_OP_GREATER_OR_EQUAL", 6, 6);
	public static final VkCompareOp VK_COMPARE_OP_ALWAYS = new VkCompareOp("VK_COMPARE_OP_ALWAYS", 7, 7);
	public static final VkCompareOp VK_COMPARE_OP_BEGIN_RANGE = new VkCompareOp("VK_COMPARE_OP_BEGIN_RANGE", 8, VK_COMPARE_OP_NEVER.getValue() );
	public static final VkCompareOp VK_COMPARE_OP_END_RANGE = new VkCompareOp("VK_COMPARE_OP_END_RANGE", 9, VK_COMPARE_OP_ALWAYS.getValue() );
	public static final VkCompareOp VK_COMPARE_OP_RANGE_SIZE = new VkCompareOp("VK_COMPARE_OP_RANGE_SIZE", 10, (VK_COMPARE_OP_END_RANGE.getValue() - VK_COMPARE_OP_BEGIN_RANGE.getValue() + 1));
	public static final VkCompareOp VK_COMPARE_OP_MAX_ENUM = new VkCompareOp("VK_COMPARE_OP_MAX_ENUM", 11,  0x7FFFFFFF);


	/** private ctor */
	private VkCompareOp(String name, int ordinal, int v) {
		 super(name, ordinal, v);
	}

 } // end of class VkCompareOp