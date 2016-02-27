package bor.vulkan.enumerations;

import bor.enumerable.*;

/**
 * Class to wrap Vulkan enumeration VkBufferUsageFlagBits
 * @author Alessandro Borges

 */
public class VkBufferUsageFlagBits extends IntEnum<VkBufferUsageFlagBits> {
	public static final VkBufferUsageFlagBits VK_BUFFER_USAGE_TRANSFER_SRC_BIT = new VkBufferUsageFlagBits("VK_BUFFER_USAGE_TRANSFER_SRC_BIT", 0, 0x00000001);
	public static final VkBufferUsageFlagBits VK_BUFFER_USAGE_TRANSFER_DST_BIT = new VkBufferUsageFlagBits("VK_BUFFER_USAGE_TRANSFER_DST_BIT", 1, 0x00000002);
	public static final VkBufferUsageFlagBits VK_BUFFER_USAGE_UNIFORM_TEXEL_BUFFER_BIT = new VkBufferUsageFlagBits("VK_BUFFER_USAGE_UNIFORM_TEXEL_BUFFER_BIT", 2, 0x00000004);
	public static final VkBufferUsageFlagBits VK_BUFFER_USAGE_STORAGE_TEXEL_BUFFER_BIT = new VkBufferUsageFlagBits("VK_BUFFER_USAGE_STORAGE_TEXEL_BUFFER_BIT", 3, 0x00000008);
	public static final VkBufferUsageFlagBits VK_BUFFER_USAGE_UNIFORM_BUFFER_BIT = new VkBufferUsageFlagBits("VK_BUFFER_USAGE_UNIFORM_BUFFER_BIT", 4, 0x00000010);
	public static final VkBufferUsageFlagBits VK_BUFFER_USAGE_STORAGE_BUFFER_BIT = new VkBufferUsageFlagBits("VK_BUFFER_USAGE_STORAGE_BUFFER_BIT", 5, 0x00000020);
	public static final VkBufferUsageFlagBits VK_BUFFER_USAGE_INDEX_BUFFER_BIT = new VkBufferUsageFlagBits("VK_BUFFER_USAGE_INDEX_BUFFER_BIT", 6, 0x00000040);
	public static final VkBufferUsageFlagBits VK_BUFFER_USAGE_VERTEX_BUFFER_BIT = new VkBufferUsageFlagBits("VK_BUFFER_USAGE_VERTEX_BUFFER_BIT", 7, 0x00000080);
	public static final VkBufferUsageFlagBits VK_BUFFER_USAGE_INDIRECT_BUFFER_BIT = new VkBufferUsageFlagBits("VK_BUFFER_USAGE_INDIRECT_BUFFER_BIT", 8, 0x00000100);


	/** private ctor */
	private VkBufferUsageFlagBits(String name, int ordinal, int v) {
		 super(name, ordinal, v);
	}

 } // end of class VkBufferUsageFlagBits