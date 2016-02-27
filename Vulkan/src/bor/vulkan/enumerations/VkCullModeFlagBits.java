package bor.vulkan.enumerations;

import bor.enumerable.*;

/**
 * Class to wrap Vulkan enumeration VkCullModeFlagBits
 * @author Alessandro Borges

 */
public class VkCullModeFlagBits extends IntEnum<VkCullModeFlagBits> {
	public static final VkCullModeFlagBits VK_CULL_MODE_NONE = new VkCullModeFlagBits("VK_CULL_MODE_NONE", 0, 0);
	public static final VkCullModeFlagBits VK_CULL_MODE_FRONT_BIT = new VkCullModeFlagBits("VK_CULL_MODE_FRONT_BIT", 1, 0x00000001);
	public static final VkCullModeFlagBits VK_CULL_MODE_BACK_BIT = new VkCullModeFlagBits("VK_CULL_MODE_BACK_BIT", 2, 0x00000002);
	public static final VkCullModeFlagBits VK_CULL_MODE_FRONT_AND_BACK = new VkCullModeFlagBits("VK_CULL_MODE_FRONT_AND_BACK", 3, 0x3);


	/** private ctor */
	private VkCullModeFlagBits(String name, int ordinal, int v) {
		 super(name, ordinal, v);
	}

 } // end of class VkCullModeFlagBits