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
 * Class to wrap Vulkan enumeration VkStencilOp
 *
 * <h3>Prototype</h3> <pre>
 * typedef enum VkStencilOp {
 *     VK_STENCIL_OP_KEEP = 0,
 *     VK_STENCIL_OP_ZERO = 1,
 *     VK_STENCIL_OP_REPLACE = 2,
 *     VK_STENCIL_OP_INCREMENT_AND_CLAMP = 3,
 *     VK_STENCIL_OP_DECREMENT_AND_CLAMP = 4,
 *     VK_STENCIL_OP_INVERT = 5,
 *     VK_STENCIL_OP_INCREMENT_AND_WRAP = 6,
 *     VK_STENCIL_OP_DECREMENT_AND_WRAP = 7,
 *     VK_STENCIL_OP_BEGIN_RANGE = VK_STENCIL_OP_KEEP,
 *     VK_STENCIL_OP_END_RANGE = VK_STENCIL_OP_DECREMENT_AND_WRAP,
 *     VK_STENCIL_OP_RANGE_SIZE = (VK_STENCIL_OP_DECREMENT_AND_WRAP - VK_STENCIL_OP_KEEP + 1),
 *     VK_STENCIL_OP_MAX_ENUM = 0x7FFFFFFF
 * } VkStencilOp;
 * </pre>
 * @author Alessandro Borges
 */
public class VkStencilOp extends IntEnum<VkStencilOp> {
	public static final VkStencilOp VK_STENCIL_OP_KEEP = new VkStencilOp("VK_STENCIL_OP_KEEP", 0, 0);
	public static final VkStencilOp VK_STENCIL_OP_ZERO = new VkStencilOp("VK_STENCIL_OP_ZERO", 1, 1);
	public static final VkStencilOp VK_STENCIL_OP_REPLACE = new VkStencilOp("VK_STENCIL_OP_REPLACE", 2, 2);
	public static final VkStencilOp VK_STENCIL_OP_INCREMENT_AND_CLAMP = new VkStencilOp("VK_STENCIL_OP_INCREMENT_AND_CLAMP", 3, 3);
	public static final VkStencilOp VK_STENCIL_OP_DECREMENT_AND_CLAMP = new VkStencilOp("VK_STENCIL_OP_DECREMENT_AND_CLAMP", 4, 4);
	public static final VkStencilOp VK_STENCIL_OP_INVERT = new VkStencilOp("VK_STENCIL_OP_INVERT", 5, 5);
	public static final VkStencilOp VK_STENCIL_OP_INCREMENT_AND_WRAP = new VkStencilOp("VK_STENCIL_OP_INCREMENT_AND_WRAP", 6, 6);
	public static final VkStencilOp VK_STENCIL_OP_DECREMENT_AND_WRAP = new VkStencilOp("VK_STENCIL_OP_DECREMENT_AND_WRAP", 7, 7);


	/** private ctor */
	private VkStencilOp(String name, int ordinal, int v) {
		 super(name, ordinal, v);
	}

 } // end of class VkStencilOp
