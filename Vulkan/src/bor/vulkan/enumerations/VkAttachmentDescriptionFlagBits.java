/**
 * Licence terms: 
 * The MIT License (MIT)
 * Copyright (c) 2016 Alessandro Borges
 * See https://opensource.org/licenses/MIT 
 */
package bor.vulkan.enumerations;

import bor.enumerable.*;

/**
 * Class to wrap Vulkan enumeration VkAttachmentDescriptionFlagBits
 *
 * <h3>Prototype</h3> <pre>
 * typedef enum VkAttachmentDescriptionFlagBits {
 *     VK_ATTACHMENT_DESCRIPTION_MAY_ALIAS_BIT = 0x00000001,
 * } VkAttachmentDescriptionFlagBits;
 * </pre>
 * @author Alessandro Borges
 */
public class VkAttachmentDescriptionFlagBits extends IntEnum<VkAttachmentDescriptionFlagBits> {
	public static final VkAttachmentDescriptionFlagBits VK_ATTACHMENT_DESCRIPTION_MAY_ALIAS_BIT = new VkAttachmentDescriptionFlagBits("VK_ATTACHMENT_DESCRIPTION_MAY_ALIAS_BIT", 0, 0x00000001);


	/** private ctor */
	private VkAttachmentDescriptionFlagBits(String name, int ordinal, int v) {
		 super(name, ordinal, v);
	}

 } // end of class VkAttachmentDescriptionFlagBits
