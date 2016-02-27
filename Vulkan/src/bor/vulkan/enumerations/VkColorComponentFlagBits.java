package bor.vulkan.enumerations;

import bor.enumerable.*;

/**
 * Class to wrap Vulkan enumeration VkColorComponentFlagBits
 * @author Alessandro Borges

 */
public class VkColorComponentFlagBits extends IntEnum<VkColorComponentFlagBits> {
	public static final VkColorComponentFlagBits VK_COLOR_COMPONENT_R_BIT = new VkColorComponentFlagBits("VK_COLOR_COMPONENT_R_BIT", 0, 0x00000001);
	public static final VkColorComponentFlagBits VK_COLOR_COMPONENT_G_BIT = new VkColorComponentFlagBits("VK_COLOR_COMPONENT_G_BIT", 1, 0x00000002);
	public static final VkColorComponentFlagBits VK_COLOR_COMPONENT_B_BIT = new VkColorComponentFlagBits("VK_COLOR_COMPONENT_B_BIT", 2, 0x00000004);
	public static final VkColorComponentFlagBits VK_COLOR_COMPONENT_A_BIT = new VkColorComponentFlagBits("VK_COLOR_COMPONENT_A_BIT", 3, 0x00000008);


	/** private ctor */
	private VkColorComponentFlagBits(String name, int ordinal, int v) {
		 super(name, ordinal, v);
	}

 } // end of class VkColorComponentFlagBits