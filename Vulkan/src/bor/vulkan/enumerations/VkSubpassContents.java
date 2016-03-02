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
 * Class to wrap Vulkan enumeration VkSubpassContents
 *
 * <h3>Prototype</h3> <pre>
 * typedef enum VkSubpassContents {
 *     VK_SUBPASS_CONTENTS_INLINE = 0,
 *     VK_SUBPASS_CONTENTS_SECONDARY_COMMAND_BUFFERS = 1,
 *     VK_SUBPASS_CONTENTS_BEGIN_RANGE = VK_SUBPASS_CONTENTS_INLINE,
 *     VK_SUBPASS_CONTENTS_END_RANGE = VK_SUBPASS_CONTENTS_SECONDARY_COMMAND_BUFFERS,
 *     VK_SUBPASS_CONTENTS_RANGE_SIZE = (VK_SUBPASS_CONTENTS_SECONDARY_COMMAND_BUFFERS - VK_SUBPASS_CONTENTS_INLINE + 1),
 *     VK_SUBPASS_CONTENTS_MAX_ENUM = 0x7FFFFFFF
 * } VkSubpassContents;
 * </pre>
 * @author Alessandro Borges
 */
public class VkSubpassContents extends IntEnum<VkSubpassContents> {
	public static final VkSubpassContents VK_SUBPASS_CONTENTS_INLINE = new VkSubpassContents("VK_SUBPASS_CONTENTS_INLINE", 0, 0);
	public static final VkSubpassContents VK_SUBPASS_CONTENTS_SECONDARY_COMMAND_BUFFERS = new VkSubpassContents("VK_SUBPASS_CONTENTS_SECONDARY_COMMAND_BUFFERS", 1, 1);


	/** private ctor */
	private VkSubpassContents(String name, int ordinal, int v) {
		 super(name, ordinal, v);
	}

 } // end of class VkSubpassContents
