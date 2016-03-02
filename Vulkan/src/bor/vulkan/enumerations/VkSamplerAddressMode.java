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
 * Class to wrap Vulkan enumeration VkSamplerAddressMode
 *
 * <h3>Prototype</h3> <pre>
 * typedef enum VkSamplerAddressMode {
 *     VK_SAMPLER_ADDRESS_MODE_REPEAT = 0,
 *     VK_SAMPLER_ADDRESS_MODE_MIRRORED_REPEAT = 1,
 *     VK_SAMPLER_ADDRESS_MODE_CLAMP_TO_EDGE = 2,
 *     VK_SAMPLER_ADDRESS_MODE_CLAMP_TO_BORDER = 3,
 *     VK_SAMPLER_ADDRESS_MODE_MIRROR_CLAMP_TO_EDGE = 4,
 *     VK_SAMPLER_ADDRESS_MODE_BEGIN_RANGE = VK_SAMPLER_ADDRESS_MODE_REPEAT,
 *     VK_SAMPLER_ADDRESS_MODE_END_RANGE = VK_SAMPLER_ADDRESS_MODE_MIRROR_CLAMP_TO_EDGE,
 *     VK_SAMPLER_ADDRESS_MODE_RANGE_SIZE = (VK_SAMPLER_ADDRESS_MODE_MIRROR_CLAMP_TO_EDGE - VK_SAMPLER_ADDRESS_MODE_REPEAT + 1),
 *     VK_SAMPLER_ADDRESS_MODE_MAX_ENUM = 0x7FFFFFFF
 * } VkSamplerAddressMode;
 * </pre>
 * @author Alessandro Borges
 */
public class VkSamplerAddressMode extends IntEnum<VkSamplerAddressMode> {
	public static final VkSamplerAddressMode VK_SAMPLER_ADDRESS_MODE_REPEAT = new VkSamplerAddressMode("VK_SAMPLER_ADDRESS_MODE_REPEAT", 0, 0);
	public static final VkSamplerAddressMode VK_SAMPLER_ADDRESS_MODE_MIRRORED_REPEAT = new VkSamplerAddressMode("VK_SAMPLER_ADDRESS_MODE_MIRRORED_REPEAT", 1, 1);
	public static final VkSamplerAddressMode VK_SAMPLER_ADDRESS_MODE_CLAMP_TO_EDGE = new VkSamplerAddressMode("VK_SAMPLER_ADDRESS_MODE_CLAMP_TO_EDGE", 2, 2);
	public static final VkSamplerAddressMode VK_SAMPLER_ADDRESS_MODE_CLAMP_TO_BORDER = new VkSamplerAddressMode("VK_SAMPLER_ADDRESS_MODE_CLAMP_TO_BORDER", 3, 3);
	public static final VkSamplerAddressMode VK_SAMPLER_ADDRESS_MODE_MIRROR_CLAMP_TO_EDGE = new VkSamplerAddressMode("VK_SAMPLER_ADDRESS_MODE_MIRROR_CLAMP_TO_EDGE", 4, 4);


	/** private ctor */
	private VkSamplerAddressMode(String name, int ordinal, int v) {
		 super(name, ordinal, v);
	}

 } // end of class VkSamplerAddressMode
