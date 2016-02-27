package bor.vulkan.enumerations;

import bor.enumerable.*;

/**
 * Class to wrap Vulkan enumeration VkMemoryHeapFlagBits
 * @author Alessandro Borges

 */
public class VkMemoryHeapFlagBits extends IntEnum<VkMemoryHeapFlagBits> {
	public static final VkMemoryHeapFlagBits VK_MEMORY_HEAP_DEVICE_LOCAL_BIT = new VkMemoryHeapFlagBits("VK_MEMORY_HEAP_DEVICE_LOCAL_BIT", 0, 0x00000001);


	/** private ctor */
	private VkMemoryHeapFlagBits(String name, int ordinal, int v) {
		 super(name, ordinal, v);
	}

 } // end of class VkMemoryHeapFlagBits