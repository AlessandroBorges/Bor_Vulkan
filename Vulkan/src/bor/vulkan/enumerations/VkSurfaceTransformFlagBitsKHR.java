package bor.vulkan.enumerations;

import bor.enumerable.*;

/**
 * Class to wrap Vulkan enumeration VkSurfaceTransformFlagBitsKHR
 * @author Alessandro Borges

 */
public class VkSurfaceTransformFlagBitsKHR extends IntEnum<VkSurfaceTransformFlagBitsKHR> {
	public static final VkSurfaceTransformFlagBitsKHR VK_SURFACE_TRANSFORM_IDENTITY_BIT_KHR = new VkSurfaceTransformFlagBitsKHR("VK_SURFACE_TRANSFORM_IDENTITY_BIT_KHR", 0, 0x00000001);
	public static final VkSurfaceTransformFlagBitsKHR VK_SURFACE_TRANSFORM_ROTATE_90_BIT_KHR = new VkSurfaceTransformFlagBitsKHR("VK_SURFACE_TRANSFORM_ROTATE_90_BIT_KHR", 1, 0x00000002);
	public static final VkSurfaceTransformFlagBitsKHR VK_SURFACE_TRANSFORM_ROTATE_180_BIT_KHR = new VkSurfaceTransformFlagBitsKHR("VK_SURFACE_TRANSFORM_ROTATE_180_BIT_KHR", 2, 0x00000004);
	public static final VkSurfaceTransformFlagBitsKHR VK_SURFACE_TRANSFORM_ROTATE_270_BIT_KHR = new VkSurfaceTransformFlagBitsKHR("VK_SURFACE_TRANSFORM_ROTATE_270_BIT_KHR", 3, 0x00000008);
	public static final VkSurfaceTransformFlagBitsKHR VK_SURFACE_TRANSFORM_HORIZONTAL_MIRROR_BIT_KHR = new VkSurfaceTransformFlagBitsKHR("VK_SURFACE_TRANSFORM_HORIZONTAL_MIRROR_BIT_KHR", 4, 0x00000010);
	public static final VkSurfaceTransformFlagBitsKHR VK_SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_90_BIT_KHR = new VkSurfaceTransformFlagBitsKHR("VK_SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_90_BIT_KHR", 5, 0x00000020);
	public static final VkSurfaceTransformFlagBitsKHR VK_SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_180_BIT_KHR = new VkSurfaceTransformFlagBitsKHR("VK_SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_180_BIT_KHR", 6, 0x00000040);
	public static final VkSurfaceTransformFlagBitsKHR VK_SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_270_BIT_KHR = new VkSurfaceTransformFlagBitsKHR("VK_SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_270_BIT_KHR", 7, 0x00000080);
	public static final VkSurfaceTransformFlagBitsKHR VK_SURFACE_TRANSFORM_INHERIT_BIT_KHR = new VkSurfaceTransformFlagBitsKHR("VK_SURFACE_TRANSFORM_INHERIT_BIT_KHR", 8, 0x00000100);


	/** private ctor */
	private VkSurfaceTransformFlagBitsKHR(String name, int ordinal, int v) {
		 super(name, ordinal, v);
	}

 } // end of class VkSurfaceTransformFlagBitsKHR