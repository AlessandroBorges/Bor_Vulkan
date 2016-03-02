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
 * Class to wrap Vulkan enumeration VkPolygonMode
 *
 * <h3>Prototype</h3> <pre>
 * typedef enum VkPolygonMode {
 *     VK_POLYGON_MODE_FILL = 0,
 *     VK_POLYGON_MODE_LINE = 1,
 *     VK_POLYGON_MODE_POINT = 2,
 *     VK_POLYGON_MODE_BEGIN_RANGE = VK_POLYGON_MODE_FILL,
 *     VK_POLYGON_MODE_END_RANGE = VK_POLYGON_MODE_POINT,
 *     VK_POLYGON_MODE_RANGE_SIZE = (VK_POLYGON_MODE_POINT - VK_POLYGON_MODE_FILL + 1),
 *     VK_POLYGON_MODE_MAX_ENUM = 0x7FFFFFFF
 * } VkPolygonMode;
 * </pre>
 * @author Alessandro Borges
 */
public class VkPolygonMode extends IntEnum<VkPolygonMode> {
	public static final VkPolygonMode VK_POLYGON_MODE_FILL = new VkPolygonMode("VK_POLYGON_MODE_FILL", 0, 0);
	public static final VkPolygonMode VK_POLYGON_MODE_LINE = new VkPolygonMode("VK_POLYGON_MODE_LINE", 1, 1);
	public static final VkPolygonMode VK_POLYGON_MODE_POINT = new VkPolygonMode("VK_POLYGON_MODE_POINT", 2, 2);


	/** private ctor */
	private VkPolygonMode(String name, int ordinal, int v) {
		 super(name, ordinal, v);
	}

 } // end of class VkPolygonMode
