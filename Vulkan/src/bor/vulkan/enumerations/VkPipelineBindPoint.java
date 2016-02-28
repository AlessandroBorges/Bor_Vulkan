/**
 * Licence terms: 
 * The MIT License (MIT)
 * Copyright (c) 2016 Alessandro Borges
 * See https://opensource.org/licenses/MIT 
 */
package bor.vulkan.enumerations;

import bor.enumerable.*;

/**
 * Class to wrap Vulkan enumeration VkPipelineBindPoint
 *
 * <h3>Prototype</h3> <pre>
 * typedef enum VkPipelineBindPoint {
 *     VK_PIPELINE_BIND_POINT_GRAPHICS = 0,
 *     VK_PIPELINE_BIND_POINT_COMPUTE = 1,
 *     VK_PIPELINE_BIND_POINT_BEGIN_RANGE = VK_PIPELINE_BIND_POINT_GRAPHICS,
 *     VK_PIPELINE_BIND_POINT_END_RANGE = VK_PIPELINE_BIND_POINT_COMPUTE,
 *     VK_PIPELINE_BIND_POINT_RANGE_SIZE = (VK_PIPELINE_BIND_POINT_COMPUTE - VK_PIPELINE_BIND_POINT_GRAPHICS + 1),
 *     VK_PIPELINE_BIND_POINT_MAX_ENUM = 0x7FFFFFFF
 * } VkPipelineBindPoint;
 * </pre>
 * @author Alessandro Borges
 */
public class VkPipelineBindPoint extends IntEnum<VkPipelineBindPoint> {
	public static final VkPipelineBindPoint VK_PIPELINE_BIND_POINT_GRAPHICS = new VkPipelineBindPoint("VK_PIPELINE_BIND_POINT_GRAPHICS", 0, 0);
	public static final VkPipelineBindPoint VK_PIPELINE_BIND_POINT_COMPUTE = new VkPipelineBindPoint("VK_PIPELINE_BIND_POINT_COMPUTE", 1, 1);
	public static final VkPipelineBindPoint VK_PIPELINE_BIND_POINT_BEGIN_RANGE = new VkPipelineBindPoint("VK_PIPELINE_BIND_POINT_BEGIN_RANGE", 2, VK_PIPELINE_BIND_POINT_GRAPHICS.getValue() );
	public static final VkPipelineBindPoint VK_PIPELINE_BIND_POINT_END_RANGE = new VkPipelineBindPoint("VK_PIPELINE_BIND_POINT_END_RANGE", 3, VK_PIPELINE_BIND_POINT_COMPUTE.getValue() );
	public static final VkPipelineBindPoint VK_PIPELINE_BIND_POINT_RANGE_SIZE = new VkPipelineBindPoint("VK_PIPELINE_BIND_POINT_RANGE_SIZE", 4, (VK_PIPELINE_BIND_POINT_END_RANGE.getValue() - VK_PIPELINE_BIND_POINT_BEGIN_RANGE.getValue() + 1));
	public static final VkPipelineBindPoint VK_PIPELINE_BIND_POINT_MAX_ENUM = new VkPipelineBindPoint("VK_PIPELINE_BIND_POINT_MAX_ENUM", 5,  0x7FFFFFFF);


	/** private ctor */
	private VkPipelineBindPoint(String name, int ordinal, int v) {
		 super(name, ordinal, v);
	}

 } // end of class VkPipelineBindPoint
