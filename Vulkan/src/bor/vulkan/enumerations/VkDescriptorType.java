/**
 * Licence terms: 
 * The MIT License (MIT)
 * Copyright (c) 2016 Alessandro Borges
 * See https://opensource.org/licenses/MIT 
 */
package bor.vulkan.enumerations;

import bor.enumerable.*;

/**
 * Class to wrap Vulkan enumeration VkDescriptorType
 *
 * <h3>Prototype</h3> <pre>
 * typedef enum VkDescriptorType {
 *     VK_DESCRIPTOR_TYPE_SAMPLER = 0,
 *     VK_DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER = 1,
 *     VK_DESCRIPTOR_TYPE_SAMPLED_IMAGE = 2,
 *     VK_DESCRIPTOR_TYPE_STORAGE_IMAGE = 3,
 *     VK_DESCRIPTOR_TYPE_UNIFORM_TEXEL_BUFFER = 4,
 *     VK_DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER = 5,
 *     VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER = 6,
 *     VK_DESCRIPTOR_TYPE_STORAGE_BUFFER = 7,
 *     VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC = 8,
 *     VK_DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC = 9,
 *     VK_DESCRIPTOR_TYPE_INPUT_ATTACHMENT = 10,
 *     VK_DESCRIPTOR_TYPE_BEGIN_RANGE = VK_DESCRIPTOR_TYPE_SAMPLER,
 *     VK_DESCRIPTOR_TYPE_END_RANGE = VK_DESCRIPTOR_TYPE_INPUT_ATTACHMENT,
 *     VK_DESCRIPTOR_TYPE_RANGE_SIZE = (VK_DESCRIPTOR_TYPE_INPUT_ATTACHMENT - VK_DESCRIPTOR_TYPE_SAMPLER + 1),
 *     VK_DESCRIPTOR_TYPE_MAX_ENUM = 0x7FFFFFFF
 * } VkDescriptorType;
 * </pre>
 * @author Alessandro Borges
 */
public class VkDescriptorType extends IntEnum<VkDescriptorType> {
	public static final VkDescriptorType VK_DESCRIPTOR_TYPE_SAMPLER = new VkDescriptorType("VK_DESCRIPTOR_TYPE_SAMPLER", 0, 0);
	public static final VkDescriptorType VK_DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER = new VkDescriptorType("VK_DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER", 1, 1);
	public static final VkDescriptorType VK_DESCRIPTOR_TYPE_SAMPLED_IMAGE = new VkDescriptorType("VK_DESCRIPTOR_TYPE_SAMPLED_IMAGE", 2, 2);
	public static final VkDescriptorType VK_DESCRIPTOR_TYPE_STORAGE_IMAGE = new VkDescriptorType("VK_DESCRIPTOR_TYPE_STORAGE_IMAGE", 3, 3);
	public static final VkDescriptorType VK_DESCRIPTOR_TYPE_UNIFORM_TEXEL_BUFFER = new VkDescriptorType("VK_DESCRIPTOR_TYPE_UNIFORM_TEXEL_BUFFER", 4, 4);
	public static final VkDescriptorType VK_DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER = new VkDescriptorType("VK_DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER", 5, 5);
	public static final VkDescriptorType VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER = new VkDescriptorType("VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER", 6, 6);
	public static final VkDescriptorType VK_DESCRIPTOR_TYPE_STORAGE_BUFFER = new VkDescriptorType("VK_DESCRIPTOR_TYPE_STORAGE_BUFFER", 7, 7);
	public static final VkDescriptorType VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC = new VkDescriptorType("VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC", 8, 8);
	public static final VkDescriptorType VK_DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC = new VkDescriptorType("VK_DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC", 9, 9);
	public static final VkDescriptorType VK_DESCRIPTOR_TYPE_INPUT_ATTACHMENT = new VkDescriptorType("VK_DESCRIPTOR_TYPE_INPUT_ATTACHMENT", 10, 10);
	public static final VkDescriptorType VK_DESCRIPTOR_TYPE_BEGIN_RANGE = new VkDescriptorType("VK_DESCRIPTOR_TYPE_BEGIN_RANGE", 11, VK_DESCRIPTOR_TYPE_SAMPLER.getValue() );
	public static final VkDescriptorType VK_DESCRIPTOR_TYPE_END_RANGE = new VkDescriptorType("VK_DESCRIPTOR_TYPE_END_RANGE", 12, VK_DESCRIPTOR_TYPE_INPUT_ATTACHMENT.getValue() );
	public static final VkDescriptorType VK_DESCRIPTOR_TYPE_RANGE_SIZE = new VkDescriptorType("VK_DESCRIPTOR_TYPE_RANGE_SIZE", 13, (VK_DESCRIPTOR_TYPE_END_RANGE.getValue() - VK_DESCRIPTOR_TYPE_BEGIN_RANGE.getValue() + 1));
	public static final VkDescriptorType VK_DESCRIPTOR_TYPE_MAX_ENUM = new VkDescriptorType("VK_DESCRIPTOR_TYPE_MAX_ENUM", 14,  0x7FFFFFFF);


	/** private ctor */
	private VkDescriptorType(String name, int ordinal, int v) {
		 super(name, ordinal, v);
	}

 } // end of class VkDescriptorType
