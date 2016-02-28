/**
 * Licence terms: 
 * The MIT License (MIT)
 * Copyright (c) 2016 Alessandro Borges
 * See https://opensource.org/licenses/MIT 
 */
package bor.vulkan.enumerations;

import bor.enumerable.*;

/**
 * Class to wrap Vulkan enumeration VkLogicOp
 *
 * <h3>Prototype</h3> <pre>
 * typedef enum VkLogicOp {
 *     VK_LOGIC_OP_CLEAR = 0,
 *     VK_LOGIC_OP_AND = 1,
 *     VK_LOGIC_OP_AND_REVERSE = 2,
 *     VK_LOGIC_OP_COPY = 3,
 *     VK_LOGIC_OP_AND_INVERTED = 4,
 *     VK_LOGIC_OP_NO_OP = 5,
 *     VK_LOGIC_OP_XOR = 6,
 *     VK_LOGIC_OP_OR = 7,
 *     VK_LOGIC_OP_NOR = 8,
 *     VK_LOGIC_OP_EQUIVALENT = 9,
 *     VK_LOGIC_OP_INVERT = 10,
 *     VK_LOGIC_OP_OR_REVERSE = 11,
 *     VK_LOGIC_OP_COPY_INVERTED = 12,
 *     VK_LOGIC_OP_OR_INVERTED = 13,
 *     VK_LOGIC_OP_NAND = 14,
 *     VK_LOGIC_OP_SET = 15,
 *     VK_LOGIC_OP_BEGIN_RANGE = VK_LOGIC_OP_CLEAR,
 *     VK_LOGIC_OP_END_RANGE = VK_LOGIC_OP_SET,
 *     VK_LOGIC_OP_RANGE_SIZE = (VK_LOGIC_OP_SET - VK_LOGIC_OP_CLEAR + 1),
 *     VK_LOGIC_OP_MAX_ENUM = 0x7FFFFFFF
 * } VkLogicOp;
 * </pre>
 * @author Alessandro Borges
 */
public class VkLogicOp extends IntEnum<VkLogicOp> {
	public static final VkLogicOp VK_LOGIC_OP_CLEAR = new VkLogicOp("VK_LOGIC_OP_CLEAR", 0, 0);
	public static final VkLogicOp VK_LOGIC_OP_AND = new VkLogicOp("VK_LOGIC_OP_AND", 1, 1);
	public static final VkLogicOp VK_LOGIC_OP_AND_REVERSE = new VkLogicOp("VK_LOGIC_OP_AND_REVERSE", 2, 2);
	public static final VkLogicOp VK_LOGIC_OP_COPY = new VkLogicOp("VK_LOGIC_OP_COPY", 3, 3);
	public static final VkLogicOp VK_LOGIC_OP_AND_INVERTED = new VkLogicOp("VK_LOGIC_OP_AND_INVERTED", 4, 4);
	public static final VkLogicOp VK_LOGIC_OP_NO_OP = new VkLogicOp("VK_LOGIC_OP_NO_OP", 5, 5);
	public static final VkLogicOp VK_LOGIC_OP_XOR = new VkLogicOp("VK_LOGIC_OP_XOR", 6, 6);
	public static final VkLogicOp VK_LOGIC_OP_OR = new VkLogicOp("VK_LOGIC_OP_OR", 7, 7);
	public static final VkLogicOp VK_LOGIC_OP_NOR = new VkLogicOp("VK_LOGIC_OP_NOR", 8, 8);
	public static final VkLogicOp VK_LOGIC_OP_EQUIVALENT = new VkLogicOp("VK_LOGIC_OP_EQUIVALENT", 9, 9);
	public static final VkLogicOp VK_LOGIC_OP_INVERT = new VkLogicOp("VK_LOGIC_OP_INVERT", 10, 10);
	public static final VkLogicOp VK_LOGIC_OP_OR_REVERSE = new VkLogicOp("VK_LOGIC_OP_OR_REVERSE", 11, 11);
	public static final VkLogicOp VK_LOGIC_OP_COPY_INVERTED = new VkLogicOp("VK_LOGIC_OP_COPY_INVERTED", 12, 12);
	public static final VkLogicOp VK_LOGIC_OP_OR_INVERTED = new VkLogicOp("VK_LOGIC_OP_OR_INVERTED", 13, 13);
	public static final VkLogicOp VK_LOGIC_OP_NAND = new VkLogicOp("VK_LOGIC_OP_NAND", 14, 14);
	public static final VkLogicOp VK_LOGIC_OP_SET = new VkLogicOp("VK_LOGIC_OP_SET", 15, 15);
	public static final VkLogicOp VK_LOGIC_OP_BEGIN_RANGE = new VkLogicOp("VK_LOGIC_OP_BEGIN_RANGE", 16, VK_LOGIC_OP_CLEAR.getValue() );
	public static final VkLogicOp VK_LOGIC_OP_END_RANGE = new VkLogicOp("VK_LOGIC_OP_END_RANGE", 17, VK_LOGIC_OP_SET.getValue() );
	public static final VkLogicOp VK_LOGIC_OP_RANGE_SIZE = new VkLogicOp("VK_LOGIC_OP_RANGE_SIZE", 18, (VK_LOGIC_OP_END_RANGE.getValue() - VK_LOGIC_OP_BEGIN_RANGE.getValue() + 1));
	public static final VkLogicOp VK_LOGIC_OP_MAX_ENUM = new VkLogicOp("VK_LOGIC_OP_MAX_ENUM", 19,  0x7FFFFFFF);


	/** private ctor */
	private VkLogicOp(String name, int ordinal, int v) {
		 super(name, ordinal, v);
	}

 } // end of class VkLogicOp
