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
 * Class to wrap Vulkan enumeration VkFrontFace
 *
 * <h3>Prototype</h3> <pre>
 * typedef enum VkFrontFace {
 *     VK_FRONT_FACE_COUNTER_CLOCKWISE = 0,
 *     VK_FRONT_FACE_CLOCKWISE = 1,
 *     VK_FRONT_FACE_BEGIN_RANGE = VK_FRONT_FACE_COUNTER_CLOCKWISE,
 *     VK_FRONT_FACE_END_RANGE = VK_FRONT_FACE_CLOCKWISE,
 *     VK_FRONT_FACE_RANGE_SIZE = (VK_FRONT_FACE_CLOCKWISE - VK_FRONT_FACE_COUNTER_CLOCKWISE + 1),
 *     VK_FRONT_FACE_MAX_ENUM = 0x7FFFFFFF
 * } VkFrontFace;
 * </pre>
 * @author Alessandro Borges
 */
public class VkFrontFace extends IntEnum<VkFrontFace> {
	public static final VkFrontFace VK_FRONT_FACE_COUNTER_CLOCKWISE = new VkFrontFace("VK_FRONT_FACE_COUNTER_CLOCKWISE", 0, 0);
	public static final VkFrontFace VK_FRONT_FACE_CLOCKWISE = new VkFrontFace("VK_FRONT_FACE_CLOCKWISE", 1, 1);


	/** private ctor */
	private VkFrontFace(String name, int ordinal, int v) {
		 super(name, ordinal, v);
	}

 } // end of class VkFrontFace
