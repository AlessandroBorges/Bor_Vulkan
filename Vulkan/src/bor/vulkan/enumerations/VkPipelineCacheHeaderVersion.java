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
 * Class to wrap Vulkan enumeration VkPipelineCacheHeaderVersion
 *
 * <h3>Prototype</h3> <pre>
 * typedef enum VkPipelineCacheHeaderVersion {
 *     VK_PIPELINE_CACHE_HEADER_VERSION_ONE = 1,
 *     VK_PIPELINE_CACHE_HEADER_VERSION_BEGIN_RANGE = VK_PIPELINE_CACHE_HEADER_VERSION_ONE,
 *     VK_PIPELINE_CACHE_HEADER_VERSION_END_RANGE = VK_PIPELINE_CACHE_HEADER_VERSION_ONE,
 *     VK_PIPELINE_CACHE_HEADER_VERSION_RANGE_SIZE = (VK_PIPELINE_CACHE_HEADER_VERSION_ONE - VK_PIPELINE_CACHE_HEADER_VERSION_ONE + 1),
 *     VK_PIPELINE_CACHE_HEADER_VERSION_MAX_ENUM = 0x7FFFFFFF
 * } VkPipelineCacheHeaderVersion;
 * </pre>
 * @author Alessandro Borges
 */
public class VkPipelineCacheHeaderVersion extends IntEnum<VkPipelineCacheHeaderVersion> {
	public static final VkPipelineCacheHeaderVersion VK_PIPELINE_CACHE_HEADER_VERSION_ONE = new VkPipelineCacheHeaderVersion("VK_PIPELINE_CACHE_HEADER_VERSION_ONE", 0, 1);


	/** private ctor */
	private VkPipelineCacheHeaderVersion(String name, int ordinal, int v) {
		 super(name, ordinal, v);
	}

 } // end of class VkPipelineCacheHeaderVersion
