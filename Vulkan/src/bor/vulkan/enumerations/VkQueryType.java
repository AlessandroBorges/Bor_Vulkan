package bor.vulkan.enumerations;

import bor.enumerable.*;

/**
 * Class to wrap Vulkan enumeration VkQueryType
 * @author Alessandro Borges

 */
public class VkQueryType extends IntEnum<VkQueryType> {
	public static final VkQueryType VK_QUERY_TYPE_OCCLUSION = new VkQueryType("VK_QUERY_TYPE_OCCLUSION", 0, 0);
	public static final VkQueryType VK_QUERY_TYPE_PIPELINE_STATISTICS = new VkQueryType("VK_QUERY_TYPE_PIPELINE_STATISTICS", 1, 1);
	public static final VkQueryType VK_QUERY_TYPE_TIMESTAMP = new VkQueryType("VK_QUERY_TYPE_TIMESTAMP", 2, 2);
	public static final VkQueryType VK_QUERY_TYPE_BEGIN_RANGE = new VkQueryType("VK_QUERY_TYPE_BEGIN_RANGE", 3, VK_QUERY_TYPE_OCCLUSION.getValue() );
	public static final VkQueryType VK_QUERY_TYPE_END_RANGE = new VkQueryType("VK_QUERY_TYPE_END_RANGE", 4, VK_QUERY_TYPE_TIMESTAMP.getValue() );
	public static final VkQueryType VK_QUERY_TYPE_RANGE_SIZE = new VkQueryType("VK_QUERY_TYPE_RANGE_SIZE", 5, (VK_QUERY_TYPE_END_RANGE.getValue() - VK_QUERY_TYPE_BEGIN_RANGE.getValue() + 1));
	public static final VkQueryType VK_QUERY_TYPE_MAX_ENUM = new VkQueryType("VK_QUERY_TYPE_MAX_ENUM", 6,  0x7FFFFFFF);


	/** private ctor */
	private VkQueryType(String name, int ordinal, int v) {
		 super(name, ordinal, v);
	}

 } // end of class VkQueryType