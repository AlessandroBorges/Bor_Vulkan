/**
 * Licence terms: 
 * The MIT License (MIT)
 * Copyright (c) 2016 Alessandro Borges
 * See https://opensource.org/licenses/MIT 
 */
package bor.vulkan.enumerations;

import bor.enumerable.*;

/**
 * Class to wrap Vulkan enumeration VkDynamicState
 *
 * <h3>Prototype</h3> <pre>
 * typedef enum VkDynamicState {
 *     VK_DYNAMIC_STATE_VIEWPORT = 0,
 *     VK_DYNAMIC_STATE_SCISSOR = 1,
 *     VK_DYNAMIC_STATE_LINE_WIDTH = 2,
 *     VK_DYNAMIC_STATE_DEPTH_BIAS = 3,
 *     VK_DYNAMIC_STATE_BLEND_CONSTANTS = 4,
 *     VK_DYNAMIC_STATE_DEPTH_BOUNDS = 5,
 *     VK_DYNAMIC_STATE_STENCIL_COMPARE_MASK = 6,
 *     VK_DYNAMIC_STATE_STENCIL_WRITE_MASK = 7,
 *     VK_DYNAMIC_STATE_STENCIL_REFERENCE = 8,
 *     VK_DYNAMIC_STATE_BEGIN_RANGE = VK_DYNAMIC_STATE_VIEWPORT,
 *     VK_DYNAMIC_STATE_END_RANGE = VK_DYNAMIC_STATE_STENCIL_REFERENCE,
 *     VK_DYNAMIC_STATE_RANGE_SIZE = (VK_DYNAMIC_STATE_STENCIL_REFERENCE - VK_DYNAMIC_STATE_VIEWPORT + 1),
 *     VK_DYNAMIC_STATE_MAX_ENUM = 0x7FFFFFFF
 * } VkDynamicState;
 * </pre>
 * @author Alessandro Borges
 */
public class VkDynamicState extends IntEnum<VkDynamicState> {
	public static final VkDynamicState VK_DYNAMIC_STATE_VIEWPORT = new VkDynamicState("VK_DYNAMIC_STATE_VIEWPORT", 0, 0);
	public static final VkDynamicState VK_DYNAMIC_STATE_SCISSOR = new VkDynamicState("VK_DYNAMIC_STATE_SCISSOR", 1, 1);
	public static final VkDynamicState VK_DYNAMIC_STATE_LINE_WIDTH = new VkDynamicState("VK_DYNAMIC_STATE_LINE_WIDTH", 2, 2);
	public static final VkDynamicState VK_DYNAMIC_STATE_DEPTH_BIAS = new VkDynamicState("VK_DYNAMIC_STATE_DEPTH_BIAS", 3, 3);
	public static final VkDynamicState VK_DYNAMIC_STATE_BLEND_CONSTANTS = new VkDynamicState("VK_DYNAMIC_STATE_BLEND_CONSTANTS", 4, 4);
	public static final VkDynamicState VK_DYNAMIC_STATE_DEPTH_BOUNDS = new VkDynamicState("VK_DYNAMIC_STATE_DEPTH_BOUNDS", 5, 5);
	public static final VkDynamicState VK_DYNAMIC_STATE_STENCIL_COMPARE_MASK = new VkDynamicState("VK_DYNAMIC_STATE_STENCIL_COMPARE_MASK", 6, 6);
	public static final VkDynamicState VK_DYNAMIC_STATE_STENCIL_WRITE_MASK = new VkDynamicState("VK_DYNAMIC_STATE_STENCIL_WRITE_MASK", 7, 7);
	public static final VkDynamicState VK_DYNAMIC_STATE_STENCIL_REFERENCE = new VkDynamicState("VK_DYNAMIC_STATE_STENCIL_REFERENCE", 8, 8);
	public static final VkDynamicState VK_DYNAMIC_STATE_BEGIN_RANGE = new VkDynamicState("VK_DYNAMIC_STATE_BEGIN_RANGE", 9, VK_DYNAMIC_STATE_VIEWPORT.getValue() );
	public static final VkDynamicState VK_DYNAMIC_STATE_END_RANGE = new VkDynamicState("VK_DYNAMIC_STATE_END_RANGE", 10, VK_DYNAMIC_STATE_STENCIL_REFERENCE.getValue() );
	public static final VkDynamicState VK_DYNAMIC_STATE_RANGE_SIZE = new VkDynamicState("VK_DYNAMIC_STATE_RANGE_SIZE", 11, (VK_DYNAMIC_STATE_END_RANGE.getValue() - VK_DYNAMIC_STATE_BEGIN_RANGE.getValue() + 1));
	public static final VkDynamicState VK_DYNAMIC_STATE_MAX_ENUM = new VkDynamicState("VK_DYNAMIC_STATE_MAX_ENUM", 12,  0x7FFFFFFF);


	/** private ctor */
	private VkDynamicState(String name, int ordinal, int v) {
		 super(name, ordinal, v);
	}

 } // end of class VkDynamicState
