package bor.vulkan.enumerations;

import bor.enumerable.*;

/**
 * Class to wrap Vulkan enumeration VkPipelineCacheHeaderVersion
 * @author Alessandro Borges

 */
public class VkPipelineCacheHeaderVersion extends IntEnum<VkPipelineCacheHeaderVersion> {
	public static final VkPipelineCacheHeaderVersion VK_PIPELINE_CACHE_HEADER_VERSION_ONE = new VkPipelineCacheHeaderVersion("VK_PIPELINE_CACHE_HEADER_VERSION_ONE", 0, 1);
	public static final VkPipelineCacheHeaderVersion VK_PIPELINE_CACHE_HEADER_VERSION_BEGIN_RANGE = new VkPipelineCacheHeaderVersion("VK_PIPELINE_CACHE_HEADER_VERSION_BEGIN_RANGE", 1, VK_PIPELINE_CACHE_HEADER_VERSION_ONE.getValue() );
	public static final VkPipelineCacheHeaderVersion VK_PIPELINE_CACHE_HEADER_VERSION_END_RANGE = new VkPipelineCacheHeaderVersion("VK_PIPELINE_CACHE_HEADER_VERSION_END_RANGE", 2, VK_PIPELINE_CACHE_HEADER_VERSION_ONE.getValue() );
	public static final VkPipelineCacheHeaderVersion VK_PIPELINE_CACHE_HEADER_VERSION_RANGE_SIZE = new VkPipelineCacheHeaderVersion("VK_PIPELINE_CACHE_HEADER_VERSION_RANGE_SIZE", 3, (VK_PIPELINE_CACHE_HEADER_VERSION_END_RANGE.getValue() - VK_PIPELINE_CACHE_HEADER_VERSION_BEGIN_RANGE.getValue() + 1));
	public static final VkPipelineCacheHeaderVersion VK_PIPELINE_CACHE_HEADER_VERSION_MAX_ENUM = new VkPipelineCacheHeaderVersion("VK_PIPELINE_CACHE_HEADER_VERSION_MAX_ENUM", 4,  0x7FFFFFFF);


	/** private ctor */
	private VkPipelineCacheHeaderVersion(String name, int ordinal, int v) {
		 super(name, ordinal, v);
	}

 } // end of class VkPipelineCacheHeaderVersion