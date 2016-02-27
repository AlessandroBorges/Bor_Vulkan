package bor.vulkan.enumerations;

import bor.enumerable.*;

/**
 * Class to wrap Vulkan enumeration VkDependencyFlagBits
 * @author Alessandro Borges

 */
public class VkDependencyFlagBits extends IntEnum<VkDependencyFlagBits> {
	public static final VkDependencyFlagBits VK_DEPENDENCY_BY_REGION_BIT = new VkDependencyFlagBits("VK_DEPENDENCY_BY_REGION_BIT", 0, 0x00000001);


	/** private ctor */
	private VkDependencyFlagBits(String name, int ordinal, int v) {
		 super(name, ordinal, v);
	}

 } // end of class VkDependencyFlagBits