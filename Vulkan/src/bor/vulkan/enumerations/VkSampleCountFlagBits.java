package bor.vulkan.enumerations;

import bor.enumerable.*;

/**
 * Class to wrap Vulkan enumeration VkSampleCountFlagBits
 * @author Alessandro Borges

 */
public class VkSampleCountFlagBits extends IntEnum<VkSampleCountFlagBits> {
	public static final VkSampleCountFlagBits VK_SAMPLE_COUNT_1_BIT = new VkSampleCountFlagBits("VK_SAMPLE_COUNT_1_BIT", 0, 0x00000001);
	public static final VkSampleCountFlagBits VK_SAMPLE_COUNT_2_BIT = new VkSampleCountFlagBits("VK_SAMPLE_COUNT_2_BIT", 1, 0x00000002);
	public static final VkSampleCountFlagBits VK_SAMPLE_COUNT_4_BIT = new VkSampleCountFlagBits("VK_SAMPLE_COUNT_4_BIT", 2, 0x00000004);
	public static final VkSampleCountFlagBits VK_SAMPLE_COUNT_8_BIT = new VkSampleCountFlagBits("VK_SAMPLE_COUNT_8_BIT", 3, 0x00000008);
	public static final VkSampleCountFlagBits VK_SAMPLE_COUNT_16_BIT = new VkSampleCountFlagBits("VK_SAMPLE_COUNT_16_BIT", 4, 0x00000010);
	public static final VkSampleCountFlagBits VK_SAMPLE_COUNT_32_BIT = new VkSampleCountFlagBits("VK_SAMPLE_COUNT_32_BIT", 5, 0x00000020);
	public static final VkSampleCountFlagBits VK_SAMPLE_COUNT_64_BIT = new VkSampleCountFlagBits("VK_SAMPLE_COUNT_64_BIT", 6, 0x00000040);


	/** private ctor */
	private VkSampleCountFlagBits(String name, int ordinal, int v) {
		 super(name, ordinal, v);
	}

 } // end of class VkSampleCountFlagBits