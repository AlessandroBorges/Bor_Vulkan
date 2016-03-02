/**
 * Bor_Vulkan Project Ver. 0.8.01 (beta)
 * Licence terms: 
 * The MIT License (MIT)
 * Copyright (c) 2016 Alessandro Borges
 * See https://opensource.org/licenses/MIT 
 */
package bor.vulkan.enumerations;

import bor.enumerable.*;

/**
 * Class to wrap Vulkan enumeration VkSparseImageFormatFlagBits
 *
 * <h3>Prototype</h3> <pre>
 * typedef enum VkSparseImageFormatFlagBits {
 *     VK_SPARSE_IMAGE_FORMAT_SINGLE_MIPTAIL_BIT = 0x00000001,
 *     VK_SPARSE_IMAGE_FORMAT_ALIGNED_MIP_SIZE_BIT = 0x00000002,
 *     VK_SPARSE_IMAGE_FORMAT_NONSTANDARD_BLOCK_SIZE_BIT = 0x00000004,
 * } VkSparseImageFormatFlagBits;
 * </pre>
 * @author Alessandro Borges
 */
public class VkSparseImageFormatFlagBits extends IntEnum<VkSparseImageFormatFlagBits> {
	public static final VkSparseImageFormatFlagBits VK_SPARSE_IMAGE_FORMAT_SINGLE_MIPTAIL_BIT = new VkSparseImageFormatFlagBits("VK_SPARSE_IMAGE_FORMAT_SINGLE_MIPTAIL_BIT", 0, 0x00000001);
	public static final VkSparseImageFormatFlagBits VK_SPARSE_IMAGE_FORMAT_ALIGNED_MIP_SIZE_BIT = new VkSparseImageFormatFlagBits("VK_SPARSE_IMAGE_FORMAT_ALIGNED_MIP_SIZE_BIT", 1, 0x00000002);
	public static final VkSparseImageFormatFlagBits VK_SPARSE_IMAGE_FORMAT_NONSTANDARD_BLOCK_SIZE_BIT = new VkSparseImageFormatFlagBits("VK_SPARSE_IMAGE_FORMAT_NONSTANDARD_BLOCK_SIZE_BIT", 2, 0x00000004);


	/** private ctor */
	private VkSparseImageFormatFlagBits(String name, int ordinal, int v) {
		 super(name, ordinal, v);
	}

 } // end of class VkSparseImageFormatFlagBits
