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
 * Class to wrap Vulkan enumeration VkQueryType
 *
 * <h3>Prototype</h3> <pre>
 * typedef enum VkQueryType {
 *     VK_QUERY_TYPE_OCCLUSION = 0,
 *     VK_QUERY_TYPE_PIPELINE_STATISTICS = 1,
 *     VK_QUERY_TYPE_TIMESTAMP = 2,
 *     VK_QUERY_TYPE_BEGIN_RANGE = VK_QUERY_TYPE_OCCLUSION,
 *     VK_QUERY_TYPE_END_RANGE = VK_QUERY_TYPE_TIMESTAMP,
 *     VK_QUERY_TYPE_RANGE_SIZE = (VK_QUERY_TYPE_TIMESTAMP - VK_QUERY_TYPE_OCCLUSION + 1),
 *     VK_QUERY_TYPE_MAX_ENUM = 0x7FFFFFFF
 * } VkQueryType;
 * </pre>
 * @author Alessandro Borges
 */
public class VkQueryType extends IntEnum<VkQueryType> {
	public static final VkQueryType VK_QUERY_TYPE_OCCLUSION = new VkQueryType("VK_QUERY_TYPE_OCCLUSION", 0, 0);
	public static final VkQueryType VK_QUERY_TYPE_PIPELINE_STATISTICS = new VkQueryType("VK_QUERY_TYPE_PIPELINE_STATISTICS", 1, 1);
	public static final VkQueryType VK_QUERY_TYPE_TIMESTAMP = new VkQueryType("VK_QUERY_TYPE_TIMESTAMP", 2, 2);


	/** private ctor */
	private VkQueryType(String name, int ordinal, int v) {
		 super(name, ordinal, v);
	}

 } // end of class VkQueryType
