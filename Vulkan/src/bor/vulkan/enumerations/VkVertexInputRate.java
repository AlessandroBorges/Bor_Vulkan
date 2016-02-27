package bor.vulkan.enumerations;

import bor.enumerable.*;

/**
 * Class to wrap Vulkan enumeration VkVertexInputRate
 * @author Alessandro Borges

 */
public class VkVertexInputRate extends IntEnum<VkVertexInputRate> {
	public static final VkVertexInputRate VK_VERTEX_INPUT_RATE_VERTEX = new VkVertexInputRate("VK_VERTEX_INPUT_RATE_VERTEX", 0, 0);
	public static final VkVertexInputRate VK_VERTEX_INPUT_RATE_INSTANCE = new VkVertexInputRate("VK_VERTEX_INPUT_RATE_INSTANCE", 1, 1);
	public static final VkVertexInputRate VK_VERTEX_INPUT_RATE_BEGIN_RANGE = new VkVertexInputRate("VK_VERTEX_INPUT_RATE_BEGIN_RANGE", 2, VK_VERTEX_INPUT_RATE_VERTEX.getValue() );
	public static final VkVertexInputRate VK_VERTEX_INPUT_RATE_END_RANGE = new VkVertexInputRate("VK_VERTEX_INPUT_RATE_END_RANGE", 3, VK_VERTEX_INPUT_RATE_INSTANCE.getValue() );
	public static final VkVertexInputRate VK_VERTEX_INPUT_RATE_RANGE_SIZE = new VkVertexInputRate("VK_VERTEX_INPUT_RATE_RANGE_SIZE", 4, (VK_VERTEX_INPUT_RATE_END_RANGE.getValue() - VK_VERTEX_INPUT_RATE_BEGIN_RANGE.getValue() + 1));
	public static final VkVertexInputRate VK_VERTEX_INPUT_RATE_MAX_ENUM = new VkVertexInputRate("VK_VERTEX_INPUT_RATE_MAX_ENUM", 5,  0x7FFFFFFF);


	/** private ctor */
	private VkVertexInputRate(String name, int ordinal, int v) {
		 super(name, ordinal, v);
	}

 } // end of class VkVertexInputRate