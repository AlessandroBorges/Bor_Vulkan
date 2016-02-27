package bor.vulkan.enumerations;

import bor.enumerable.*;

/**
 * Class to wrap Vulkan enumeration VkSubpassContents
 * @author Alessandro Borges

 */
public class VkSubpassContents extends IntEnum<VkSubpassContents> {
	public static final VkSubpassContents VK_SUBPASS_CONTENTS_INLINE = new VkSubpassContents("VK_SUBPASS_CONTENTS_INLINE", 0, 0);
	public static final VkSubpassContents VK_SUBPASS_CONTENTS_SECONDARY_COMMAND_BUFFERS = new VkSubpassContents("VK_SUBPASS_CONTENTS_SECONDARY_COMMAND_BUFFERS", 1, 1);
	public static final VkSubpassContents VK_SUBPASS_CONTENTS_BEGIN_RANGE = new VkSubpassContents("VK_SUBPASS_CONTENTS_BEGIN_RANGE", 2, VK_SUBPASS_CONTENTS_INLINE.getValue() );
	public static final VkSubpassContents VK_SUBPASS_CONTENTS_END_RANGE = new VkSubpassContents("VK_SUBPASS_CONTENTS_END_RANGE", 3, VK_SUBPASS_CONTENTS_SECONDARY_COMMAND_BUFFERS.getValue() );
	public static final VkSubpassContents VK_SUBPASS_CONTENTS_RANGE_SIZE = new VkSubpassContents("VK_SUBPASS_CONTENTS_RANGE_SIZE", 4, (VK_SUBPASS_CONTENTS_END_RANGE.getValue() - VK_SUBPASS_CONTENTS_BEGIN_RANGE.getValue() + 1));
	public static final VkSubpassContents VK_SUBPASS_CONTENTS_MAX_ENUM = new VkSubpassContents("VK_SUBPASS_CONTENTS_MAX_ENUM", 5,  0x7FFFFFFF);


	/** private ctor */
	private VkSubpassContents(String name, int ordinal, int v) {
		 super(name, ordinal, v);
	}

 } // end of class VkSubpassContents