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
 * Class to wrap Vulkan enumeration VkFormatFeatureFlagBits
 *
 * <h3>Prototype</h3> <pre>
 * typedef enum VkFormatFeatureFlagBits {
 *     VK_FORMAT_FEATURE_SAMPLED_IMAGE_BIT = 0x00000001,
 *     VK_FORMAT_FEATURE_STORAGE_IMAGE_BIT = 0x00000002,
 *     VK_FORMAT_FEATURE_STORAGE_IMAGE_ATOMIC_BIT = 0x00000004,
 *     VK_FORMAT_FEATURE_UNIFORM_TEXEL_BUFFER_BIT = 0x00000008,
 *     VK_FORMAT_FEATURE_STORAGE_TEXEL_BUFFER_BIT = 0x00000010,
 *     VK_FORMAT_FEATURE_STORAGE_TEXEL_BUFFER_ATOMIC_BIT = 0x00000020,
 *     VK_FORMAT_FEATURE_VERTEX_BUFFER_BIT = 0x00000040,
 *     VK_FORMAT_FEATURE_COLOR_ATTACHMENT_BIT = 0x00000080,
 *     VK_FORMAT_FEATURE_COLOR_ATTACHMENT_BLEND_BIT = 0x00000100,
 *     VK_FORMAT_FEATURE_DEPTH_STENCIL_ATTACHMENT_BIT = 0x00000200,
 *     VK_FORMAT_FEATURE_BLIT_SRC_BIT = 0x00000400,
 *     VK_FORMAT_FEATURE_BLIT_DST_BIT = 0x00000800,
 *     VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT = 0x00001000,
 * } VkFormatFeatureFlagBits;
 * </pre>
 * @author Alessandro Borges
 */
public class VkFormatFeatureFlagBits extends IntEnum<VkFormatFeatureFlagBits> {
	public static final VkFormatFeatureFlagBits VK_FORMAT_FEATURE_SAMPLED_IMAGE_BIT = new VkFormatFeatureFlagBits("VK_FORMAT_FEATURE_SAMPLED_IMAGE_BIT", 0, 0x00000001);
	public static final VkFormatFeatureFlagBits VK_FORMAT_FEATURE_STORAGE_IMAGE_BIT = new VkFormatFeatureFlagBits("VK_FORMAT_FEATURE_STORAGE_IMAGE_BIT", 1, 0x00000002);
	public static final VkFormatFeatureFlagBits VK_FORMAT_FEATURE_STORAGE_IMAGE_ATOMIC_BIT = new VkFormatFeatureFlagBits("VK_FORMAT_FEATURE_STORAGE_IMAGE_ATOMIC_BIT", 2, 0x00000004);
	public static final VkFormatFeatureFlagBits VK_FORMAT_FEATURE_UNIFORM_TEXEL_BUFFER_BIT = new VkFormatFeatureFlagBits("VK_FORMAT_FEATURE_UNIFORM_TEXEL_BUFFER_BIT", 3, 0x00000008);
	public static final VkFormatFeatureFlagBits VK_FORMAT_FEATURE_STORAGE_TEXEL_BUFFER_BIT = new VkFormatFeatureFlagBits("VK_FORMAT_FEATURE_STORAGE_TEXEL_BUFFER_BIT", 4, 0x00000010);
	public static final VkFormatFeatureFlagBits VK_FORMAT_FEATURE_STORAGE_TEXEL_BUFFER_ATOMIC_BIT = new VkFormatFeatureFlagBits("VK_FORMAT_FEATURE_STORAGE_TEXEL_BUFFER_ATOMIC_BIT", 5, 0x00000020);
	public static final VkFormatFeatureFlagBits VK_FORMAT_FEATURE_VERTEX_BUFFER_BIT = new VkFormatFeatureFlagBits("VK_FORMAT_FEATURE_VERTEX_BUFFER_BIT", 6, 0x00000040);
	public static final VkFormatFeatureFlagBits VK_FORMAT_FEATURE_COLOR_ATTACHMENT_BIT = new VkFormatFeatureFlagBits("VK_FORMAT_FEATURE_COLOR_ATTACHMENT_BIT", 7, 0x00000080);
	public static final VkFormatFeatureFlagBits VK_FORMAT_FEATURE_COLOR_ATTACHMENT_BLEND_BIT = new VkFormatFeatureFlagBits("VK_FORMAT_FEATURE_COLOR_ATTACHMENT_BLEND_BIT", 8, 0x00000100);
	public static final VkFormatFeatureFlagBits VK_FORMAT_FEATURE_DEPTH_STENCIL_ATTACHMENT_BIT = new VkFormatFeatureFlagBits("VK_FORMAT_FEATURE_DEPTH_STENCIL_ATTACHMENT_BIT", 9, 0x00000200);
	public static final VkFormatFeatureFlagBits VK_FORMAT_FEATURE_BLIT_SRC_BIT = new VkFormatFeatureFlagBits("VK_FORMAT_FEATURE_BLIT_SRC_BIT", 10, 0x00000400);
	public static final VkFormatFeatureFlagBits VK_FORMAT_FEATURE_BLIT_DST_BIT = new VkFormatFeatureFlagBits("VK_FORMAT_FEATURE_BLIT_DST_BIT", 11, 0x00000800);
	public static final VkFormatFeatureFlagBits VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT = new VkFormatFeatureFlagBits("VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT", 12, 0x00001000);


	/** private ctor */
	private VkFormatFeatureFlagBits(String name, int ordinal, int v) {
		 super(name, ordinal, v);
	}

 } // end of class VkFormatFeatureFlagBits
