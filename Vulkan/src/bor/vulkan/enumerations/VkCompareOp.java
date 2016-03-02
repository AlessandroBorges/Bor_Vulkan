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
 * Class to wrap Vulkan enumeration VkCompareOp
 *
 * <h3>Prototype</h3> <pre>
 * typedef enum VkCompareOp {
 *     VK_COMPARE_OP_NEVER = 0,
 *     VK_COMPARE_OP_LESS = 1,
 *     VK_COMPARE_OP_EQUAL = 2,
 *     VK_COMPARE_OP_LESS_OR_EQUAL = 3,
 *     VK_COMPARE_OP_GREATER = 4,
 *     VK_COMPARE_OP_NOT_EQUAL = 5,
 *     VK_COMPARE_OP_GREATER_OR_EQUAL = 6,
 *     VK_COMPARE_OP_ALWAYS = 7,
 *     VK_COMPARE_OP_BEGIN_RANGE = VK_COMPARE_OP_NEVER,
 *     VK_COMPARE_OP_END_RANGE = VK_COMPARE_OP_ALWAYS,
 *     VK_COMPARE_OP_RANGE_SIZE = (VK_COMPARE_OP_ALWAYS - VK_COMPARE_OP_NEVER + 1),
 *     VK_COMPARE_OP_MAX_ENUM = 0x7FFFFFFF
 * } VkCompareOp;
 * </pre>
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


	/** private ctor */
	private VkCompareOp(String name, int ordinal, int v) {
		 super(name, ordinal, v);
	}

 } // end of class VkCompareOp
