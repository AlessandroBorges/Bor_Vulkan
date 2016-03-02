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
 * Class to wrap Vulkan enumeration VkStencilFaceFlagBits
 *
 * <h3>Prototype</h3> <pre>
 * typedef enum VkStencilFaceFlagBits {
 *     VK_STENCIL_FACE_FRONT_BIT = 0x00000001,
 *     VK_STENCIL_FACE_BACK_BIT = 0x00000002,
 *     VK_STENCIL_FRONT_AND_BACK = 0x3,
 * } VkStencilFaceFlagBits;
 * </pre>
 * @author Alessandro Borges
 */
public class VkStencilFaceFlagBits extends IntEnum<VkStencilFaceFlagBits> {
	public static final VkStencilFaceFlagBits VK_STENCIL_FACE_FRONT_BIT = new VkStencilFaceFlagBits("VK_STENCIL_FACE_FRONT_BIT", 0, 0x00000001);
	public static final VkStencilFaceFlagBits VK_STENCIL_FACE_BACK_BIT = new VkStencilFaceFlagBits("VK_STENCIL_FACE_BACK_BIT", 1, 0x00000002);
	public static final VkStencilFaceFlagBits VK_STENCIL_FRONT_AND_BACK = new VkStencilFaceFlagBits("VK_STENCIL_FRONT_AND_BACK", 2, 0x3);


	/** private ctor */
	private VkStencilFaceFlagBits(String name, int ordinal, int v) {
		 super(name, ordinal, v);
	}

 } // end of class VkStencilFaceFlagBits
