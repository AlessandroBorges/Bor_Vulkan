package bor.vulkan.enumerations;

import bor.enumerable.*;

/**
 * Class to wrap Vulkan enumeration VkPrimitiveTopology
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
	public static final VkPrimitiveTopology VK_PRIMITIVE_TOPOLOGY_BEGIN_RANGE = new VkPrimitiveTopology("VK_PRIMITIVE_TOPOLOGY_BEGIN_RANGE", 11, VK_PRIMITIVE_TOPOLOGY_POINT_LIST.getValue() );
	public static final VkPrimitiveTopology VK_PRIMITIVE_TOPOLOGY_END_RANGE = new VkPrimitiveTopology("VK_PRIMITIVE_TOPOLOGY_END_RANGE", 12, VK_PRIMITIVE_TOPOLOGY_PATCH_LIST.getValue() );
	public static final VkPrimitiveTopology VK_PRIMITIVE_TOPOLOGY_RANGE_SIZE = new VkPrimitiveTopology("VK_PRIMITIVE_TOPOLOGY_RANGE_SIZE", 13, (VK_PRIMITIVE_TOPOLOGY_END_RANGE.getValue() - VK_PRIMITIVE_TOPOLOGY_BEGIN_RANGE.getValue() + 1));
	public static final VkPrimitiveTopology VK_PRIMITIVE_TOPOLOGY_MAX_ENUM = new VkPrimitiveTopology("VK_PRIMITIVE_TOPOLOGY_MAX_ENUM", 14,  0x7FFFFFFF);


	/** private ctor */
	private VkPrimitiveTopology(String name, int ordinal, int v) {
		 super(name, ordinal, v);
	}

 } // end of class VkPrimitiveTopology