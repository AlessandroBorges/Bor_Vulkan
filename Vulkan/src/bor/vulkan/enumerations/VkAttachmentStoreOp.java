package bor.vulkan.enumerations;

import bor.enumerable.*;

/**
 * Class to wrap Vulkan enumeration VkAttachmentStoreOp
 * @author Alessandro Borges

 */
public class VkAttachmentStoreOp extends IntEnum<VkAttachmentStoreOp> {
	public static final VkAttachmentStoreOp VK_ATTACHMENT_STORE_OP_STORE = new VkAttachmentStoreOp("VK_ATTACHMENT_STORE_OP_STORE", 0, 0);
	public static final VkAttachmentStoreOp VK_ATTACHMENT_STORE_OP_DONT_CARE = new VkAttachmentStoreOp("VK_ATTACHMENT_STORE_OP_DONT_CARE", 1, 1);
	public static final VkAttachmentStoreOp VK_ATTACHMENT_STORE_OP_BEGIN_RANGE = new VkAttachmentStoreOp("VK_ATTACHMENT_STORE_OP_BEGIN_RANGE", 2, VK_ATTACHMENT_STORE_OP_STORE.getValue() );
	public static final VkAttachmentStoreOp VK_ATTACHMENT_STORE_OP_END_RANGE = new VkAttachmentStoreOp("VK_ATTACHMENT_STORE_OP_END_RANGE", 3, VK_ATTACHMENT_STORE_OP_DONT_CARE.getValue() );
	public static final VkAttachmentStoreOp VK_ATTACHMENT_STORE_OP_RANGE_SIZE = new VkAttachmentStoreOp("VK_ATTACHMENT_STORE_OP_RANGE_SIZE", 4, (VK_ATTACHMENT_STORE_OP_END_RANGE.getValue() - VK_ATTACHMENT_STORE_OP_BEGIN_RANGE.getValue() + 1));
	public static final VkAttachmentStoreOp VK_ATTACHMENT_STORE_OP_MAX_ENUM = new VkAttachmentStoreOp("VK_ATTACHMENT_STORE_OP_MAX_ENUM", 5,  0x7FFFFFFF);


	/** private ctor */
	private VkAttachmentStoreOp(String name, int ordinal, int v) {
		 super(name, ordinal, v);
	}

 } // end of class VkAttachmentStoreOp