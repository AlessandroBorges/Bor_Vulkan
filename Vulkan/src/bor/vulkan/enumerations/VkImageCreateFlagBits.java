package bor.vulkan.enumerations;

import bor.enumerable.*;

/**
 * Class to wrap Vulkan enumeration VkImageCreateFlagBits
 * @author Alessandro Borges

 */
public class VkImageCreateFlagBits extends IntEnum<VkImageCreateFlagBits> {
	public static final VkImageCreateFlagBits VK_IMAGE_CREATE_SPARSE_BINDING_BIT = new VkImageCreateFlagBits("VK_IMAGE_CREATE_SPARSE_BINDING_BIT", 0, 0x00000001);
	public static final VkImageCreateFlagBits VK_IMAGE_CREATE_SPARSE_RESIDENCY_BIT = new VkImageCreateFlagBits("VK_IMAGE_CREATE_SPARSE_RESIDENCY_BIT", 1, 0x00000002);
	public static final VkImageCreateFlagBits VK_IMAGE_CREATE_SPARSE_ALIASED_BIT = new VkImageCreateFlagBits("VK_IMAGE_CREATE_SPARSE_ALIASED_BIT", 2, 0x00000004);
	public static final VkImageCreateFlagBits VK_IMAGE_CREATE_MUTABLE_FORMAT_BIT = new VkImageCreateFlagBits("VK_IMAGE_CREATE_MUTABLE_FORMAT_BIT", 3, 0x00000008);
	public static final VkImageCreateFlagBits VK_IMAGE_CREATE_CUBE_COMPATIBLE_BIT = new VkImageCreateFlagBits("VK_IMAGE_CREATE_CUBE_COMPATIBLE_BIT", 4, 0x00000010);


	/** private ctor */
	private VkImageCreateFlagBits(String name, int ordinal, int v) {
		 super(name, ordinal, v);
	}

 } // end of class VkImageCreateFlagBits