package bor.vulkan.enumerations;

import bor.enumerable.*;

/**
 * Class to wrap Vulkan enumeration VkStencilFaceFlagBits
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