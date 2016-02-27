package bor.vulkan.enumerations;

import bor.enumerable.*;

/**
 * Class to wrap Vulkan enumeration VkMemoryPropertyFlagBits
 * @author Alessandro Borges

 */
public class VkMemoryPropertyFlagBits extends IntEnum<VkMemoryPropertyFlagBits> {
	public static final VkMemoryPropertyFlagBits VK_MEMORY_PROPERTY_DEVICE_LOCAL_BIT = new VkMemoryPropertyFlagBits("VK_MEMORY_PROPERTY_DEVICE_LOCAL_BIT", 0, 0x00000001);
	public static final VkMemoryPropertyFlagBits VK_MEMORY_PROPERTY_HOST_VISIBLE_BIT = new VkMemoryPropertyFlagBits("VK_MEMORY_PROPERTY_HOST_VISIBLE_BIT", 1, 0x00000002);
	public static final VkMemoryPropertyFlagBits VK_MEMORY_PROPERTY_HOST_COHERENT_BIT = new VkMemoryPropertyFlagBits("VK_MEMORY_PROPERTY_HOST_COHERENT_BIT", 2, 0x00000004);
	public static final VkMemoryPropertyFlagBits VK_MEMORY_PROPERTY_HOST_CACHED_BIT = new VkMemoryPropertyFlagBits("VK_MEMORY_PROPERTY_HOST_CACHED_BIT", 3, 0x00000008);
	public static final VkMemoryPropertyFlagBits VK_MEMORY_PROPERTY_LAZILY_ALLOCATED_BIT = new VkMemoryPropertyFlagBits("VK_MEMORY_PROPERTY_LAZILY_ALLOCATED_BIT", 4, 0x00000010);


	/** private ctor */
	private VkMemoryPropertyFlagBits(String name, int ordinal, int v) {
		 super(name, ordinal, v);
	}

 } // end of class VkMemoryPropertyFlagBits