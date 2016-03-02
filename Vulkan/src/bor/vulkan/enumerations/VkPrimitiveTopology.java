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
 * Class to wrap Vulkan enumeration VkPrimitiveTopology
 *
 * <h3>Prototype</h3> <pre>
 * typedef enum VkPrimitiveTopology {
 *     VK_PRIMITIVE_TOPOLOGY_POINT_LIST = 0,
 *     VK_PRIMITIVE_TOPOLOGY_LINE_LIST = 1,
 *     VK_PRIMITIVE_TOPOLOGY_LINE_STRIP = 2,
 *     VK_PRIMITIVE_TOPOLOGY_TRIANGLE_LIST = 3,
 *     VK_PRIMITIVE_TOPOLOGY_TRIANGLE_STRIP = 4,
 *     VK_PRIMITIVE_TOPOLOGY_TRIANGLE_FAN = 5,
 *     VK_PRIMITIVE_TOPOLOGY_LINE_LIST_WITH_ADJACENCY = 6,
 *     VK_PRIMITIVE_TOPOLOGY_LINE_STRIP_WITH_ADJACENCY = 7,
 *     VK_PRIMITIVE_TOPOLOGY_TRIANGLE_LIST_WITH_ADJACENCY = 8,
 *     VK_PRIMITIVE_TOPOLOGY_TRIANGLE_STRIP_WITH_ADJACENCY = 9,
 *     VK_PRIMITIVE_TOPOLOGY_PATCH_LIST = 10,
 *     VK_PRIMITIVE_TOPOLOGY_BEGIN_RANGE = VK_PRIMITIVE_TOPOLOGY_POINT_LIST,
 *     VK_PRIMITIVE_TOPOLOGY_END_RANGE = VK_PRIMITIVE_TOPOLOGY_PATCH_LIST,
 *     VK_PRIMITIVE_TOPOLOGY_RANGE_SIZE = (VK_PRIMITIVE_TOPOLOGY_PATCH_LIST - VK_PRIMITIVE_TOPOLOGY_POINT_LIST + 1),
 *     VK_PRIMITIVE_TOPOLOGY_MAX_ENUM = 0x7FFFFFFF
 * } VkPrimitiveTopology;
 * </pre>
 * @author Alessandro Borges
 */
public class VkPrimitiveTopology extends IntEnum<VkPrimitiveTopology> {
	public static final VkPrimitiveTopology VK_PRIMITIVE_TOPOLOGY_POINT_LIST = new VkPrimitiveTopology("VK_PRIMITIVE_TOPOLOGY_POINT_LIST", 0, 0);
	public static final VkPrimitiveTopology VK_PRIMITIVE_TOPOLOGY_LINE_LIST = new VkPrimitiveTopology("VK_PRIMITIVE_TOPOLOGY_LINE_LIST", 1, 1);
	public static final VkPrimitiveTopology VK_PRIMITIVE_TOPOLOGY_LINE_STRIP = new VkPrimitiveTopology("VK_PRIMITIVE_TOPOLOGY_LINE_STRIP", 2, 2);
	public static final VkPrimitiveTopology VK_PRIMITIVE_TOPOLOGY_TRIANGLE_LIST = new VkPrimitiveTopology("VK_PRIMITIVE_TOPOLOGY_TRIANGLE_LIST", 3, 3);
	public static final VkPrimitiveTopology VK_PRIMITIVE_TOPOLOGY_TRIANGLE_STRIP = new VkPrimitiveTopology("VK_PRIMITIVE_TOPOLOGY_TRIANGLE_STRIP", 4, 4);
	public static final VkPrimitiveTopology VK_PRIMITIVE_TOPOLOGY_TRIANGLE_FAN = new VkPrimitiveTopology("VK_PRIMITIVE_TOPOLOGY_TRIANGLE_FAN", 5, 5);
	public static final VkPrimitiveTopology VK_PRIMITIVE_TOPOLOGY_LINE_LIST_WITH_ADJACENCY = new VkPrimitiveTopology("VK_PRIMITIVE_TOPOLOGY_LINE_LIST_WITH_ADJACENCY", 6, 6);
	public static final VkPrimitiveTopology VK_PRIMITIVE_TOPOLOGY_LINE_STRIP_WITH_ADJACENCY = new VkPrimitiveTopology("VK_PRIMITIVE_TOPOLOGY_LINE_STRIP_WITH_ADJACENCY", 7, 7);
	public static final VkPrimitiveTopology VK_PRIMITIVE_TOPOLOGY_TRIANGLE_LIST_WITH_ADJACENCY = new VkPrimitiveTopology("VK_PRIMITIVE_TOPOLOGY_TRIANGLE_LIST_WITH_ADJACENCY", 8, 8);
	public static final VkPrimitiveTopology VK_PRIMITIVE_TOPOLOGY_TRIANGLE_STRIP_WITH_ADJACENCY = new VkPrimitiveTopology("VK_PRIMITIVE_TOPOLOGY_TRIANGLE_STRIP_WITH_ADJACENCY", 9, 9);
	public static final VkPrimitiveTopology VK_PRIMITIVE_TOPOLOGY_PATCH_LIST = new VkPrimitiveTopology("VK_PRIMITIVE_TOPOLOGY_PATCH_LIST", 10, 10);


	/** private ctor */
	private VkPrimitiveTopology(String name, int ordinal, int v) {
		 super(name, ordinal, v);
	}

 } // end of class VkPrimitiveTopology
