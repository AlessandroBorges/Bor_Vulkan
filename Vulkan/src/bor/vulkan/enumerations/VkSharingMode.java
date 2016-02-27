package bor.vulkan.enumerations;

import bor.enumerable.*;

/**
 * Class to wrap Vulkan enumeration VkSharingMode
 * @author Alessandro Borges

 */
public class VkSharingMode extends IntEnum<VkSharingMode> {
	public static final VkSharingMode VK_SHARING_MODE_EXCLUSIVE = new VkSharingMode("VK_SHARING_MODE_EXCLUSIVE", 0, 0);
	public static final VkSharingMode VK_SHARING_MODE_CONCURRENT = new VkSharingMode("VK_SHARING_MODE_CONCURRENT", 1, 1);
	public static final VkSharingMode VK_SHARING_MODE_BEGIN_RANGE = new VkSharingMode("VK_SHARING_MODE_BEGIN_RANGE", 2, VK_SHARING_MODE_EXCLUSIVE.getValue() );
	public static final VkSharingMode VK_SHARING_MODE_END_RANGE = new VkSharingMode("VK_SHARING_MODE_END_RANGE", 3, VK_SHARING_MODE_CONCURRENT.getValue() );
	public static final VkSharingMode VK_SHARING_MODE_RANGE_SIZE = new VkSharingMode("VK_SHARING_MODE_RANGE_SIZE", 4, (VK_SHARING_MODE_END_RANGE.getValue() - VK_SHARING_MODE_BEGIN_RANGE.getValue() + 1));
	public static final VkSharingMode VK_SHARING_MODE_MAX_ENUM = new VkSharingMode("VK_SHARING_MODE_MAX_ENUM", 5,  0x7FFFFFFF);


	/** private ctor */
	private VkSharingMode(String name, int ordinal, int v) {
		 super(name, ordinal, v);
	}

 } // end of class VkSharingMode