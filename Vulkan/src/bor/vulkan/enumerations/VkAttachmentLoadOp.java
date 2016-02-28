/**
 * Licence terms: 
 * The MIT License (MIT)
 * Copyright (c) 2016 Alessandro Borges
 * See https://opensource.org/licenses/MIT 
 */
package bor.vulkan.enumerations;

import bor.enumerable.*;

/**
 * Class to wrap Vulkan enumeration VkAttachmentLoadOp
 *
 * <h3>Prototype</h3> <pre>
 * typedef enum VkAttachmentLoadOp {
 *     VK_ATTACHMENT_LOAD_OP_LOAD = 0,
 *     VK_ATTACHMENT_LOAD_OP_CLEAR = 1,
 *     VK_ATTACHMENT_LOAD_OP_DONT_CARE = 2,
 *     VK_ATTACHMENT_LOAD_OP_BEGIN_RANGE = VK_ATTACHMENT_LOAD_OP_LOAD,
 *     VK_ATTACHMENT_LOAD_OP_END_RANGE = VK_ATTACHMENT_LOAD_OP_DONT_CARE,
 *     VK_ATTACHMENT_LOAD_OP_RANGE_SIZE = (VK_ATTACHMENT_LOAD_OP_DONT_CARE - VK_ATTACHMENT_LOAD_OP_LOAD + 1),
 *     VK_ATTACHMENT_LOAD_OP_MAX_ENUM = 0x7FFFFFFF
 * } VkAttachmentLoadOp;
 * </pre>
 * @author Alessandro Borges
 */
public class VkAttachmentLoadOp extends IntEnum<VkAttachmentLoadOp> {
	public static final VkAttachmentLoadOp VK_ATTACHMENT_LOAD_OP_LOAD = new VkAttachmentLoadOp("VK_ATTACHMENT_LOAD_OP_LOAD", 0, 0);
	public static final VkAttachmentLoadOp VK_ATTACHMENT_LOAD_OP_CLEAR = new VkAttachmentLoadOp("VK_ATTACHMENT_LOAD_OP_CLEAR", 1, 1);
	public static final VkAttachmentLoadOp VK_ATTACHMENT_LOAD_OP_DONT_CARE = new VkAttachmentLoadOp("VK_ATTACHMENT_LOAD_OP_DONT_CARE", 2, 2);
	public static final VkAttachmentLoadOp VK_ATTACHMENT_LOAD_OP_BEGIN_RANGE = new VkAttachmentLoadOp("VK_ATTACHMENT_LOAD_OP_BEGIN_RANGE", 3, VK_ATTACHMENT_LOAD_OP_LOAD.getValue() );
	public static final VkAttachmentLoadOp VK_ATTACHMENT_LOAD_OP_END_RANGE = new VkAttachmentLoadOp("VK_ATTACHMENT_LOAD_OP_END_RANGE", 4, VK_ATTACHMENT_LOAD_OP_DONT_CARE.getValue() );
	public static final VkAttachmentLoadOp VK_ATTACHMENT_LOAD_OP_RANGE_SIZE = new VkAttachmentLoadOp("VK_ATTACHMENT_LOAD_OP_RANGE_SIZE", 5, (VK_ATTACHMENT_LOAD_OP_END_RANGE.getValue() - VK_ATTACHMENT_LOAD_OP_BEGIN_RANGE.getValue() + 1));
	public static final VkAttachmentLoadOp VK_ATTACHMENT_LOAD_OP_MAX_ENUM = new VkAttachmentLoadOp("VK_ATTACHMENT_LOAD_OP_MAX_ENUM", 6,  0x7FFFFFFF);


	/** private ctor */
	private VkAttachmentLoadOp(String name, int ordinal, int v) {
		 super(name, ordinal, v);
	}

 } // end of class VkAttachmentLoadOp
