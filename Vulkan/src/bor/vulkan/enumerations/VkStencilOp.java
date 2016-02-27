package bor.vulkan.enumerations;

import bor.enumerable.*;

/**
 * Class to wrap Vulkan enumeration VkStencilOp
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
	public static final VkStencilOp VK_STENCIL_OP_BEGIN_RANGE = new VkStencilOp("VK_STENCIL_OP_BEGIN_RANGE", 8, VK_STENCIL_OP_KEEP.getValue() );
	public static final VkStencilOp VK_STENCIL_OP_END_RANGE = new VkStencilOp("VK_STENCIL_OP_END_RANGE", 9, VK_STENCIL_OP_DECREMENT_AND_WRAP.getValue() );
	public static final VkStencilOp VK_STENCIL_OP_RANGE_SIZE = new VkStencilOp("VK_STENCIL_OP_RANGE_SIZE", 10, (VK_STENCIL_OP_END_RANGE.getValue() - VK_STENCIL_OP_BEGIN_RANGE.getValue() + 1));
	public static final VkStencilOp VK_STENCIL_OP_MAX_ENUM = new VkStencilOp("VK_STENCIL_OP_MAX_ENUM", 11,  0x7FFFFFFF);


	/** private ctor */
	private VkStencilOp(String name, int ordinal, int v) {
		 super(name, ordinal, v);
	}

 } // end of class VkStencilOp