package bor.vulkan.enumerations;

import bor.enumerable.*;

/**
 * Class to wrap Vulkan enumeration VkComponentSwizzle
 * @author Alessandro Borges

 */
public class VkComponentSwizzle extends IntEnum<VkComponentSwizzle> {
	public static final VkComponentSwizzle VK_COMPONENT_SWIZZLE_IDENTITY = new VkComponentSwizzle("VK_COMPONENT_SWIZZLE_IDENTITY", 0, 0);
	public static final VkComponentSwizzle VK_COMPONENT_SWIZZLE_ZERO = new VkComponentSwizzle("VK_COMPONENT_SWIZZLE_ZERO", 1, 1);
	public static final VkComponentSwizzle VK_COMPONENT_SWIZZLE_ONE = new VkComponentSwizzle("VK_COMPONENT_SWIZZLE_ONE", 2, 2);
	public static final VkComponentSwizzle VK_COMPONENT_SWIZZLE_R = new VkComponentSwizzle("VK_COMPONENT_SWIZZLE_R", 3, 3);
	public static final VkComponentSwizzle VK_COMPONENT_SWIZZLE_G = new VkComponentSwizzle("VK_COMPONENT_SWIZZLE_G", 4, 4);
	public static final VkComponentSwizzle VK_COMPONENT_SWIZZLE_B = new VkComponentSwizzle("VK_COMPONENT_SWIZZLE_B", 5, 5);
	public static final VkComponentSwizzle VK_COMPONENT_SWIZZLE_A = new VkComponentSwizzle("VK_COMPONENT_SWIZZLE_A", 6, 6);
	public static final VkComponentSwizzle VK_COMPONENT_SWIZZLE_BEGIN_RANGE = new VkComponentSwizzle("VK_COMPONENT_SWIZZLE_BEGIN_RANGE", 7, VK_COMPONENT_SWIZZLE_IDENTITY.getValue() );
	public static final VkComponentSwizzle VK_COMPONENT_SWIZZLE_END_RANGE = new VkComponentSwizzle("VK_COMPONENT_SWIZZLE_END_RANGE", 8, VK_COMPONENT_SWIZZLE_A.getValue() );
	public static final VkComponentSwizzle VK_COMPONENT_SWIZZLE_RANGE_SIZE = new VkComponentSwizzle("VK_COMPONENT_SWIZZLE_RANGE_SIZE", 9, (VK_COMPONENT_SWIZZLE_END_RANGE.getValue() - VK_COMPONENT_SWIZZLE_BEGIN_RANGE.getValue() + 1));
	public static final VkComponentSwizzle VK_COMPONENT_SWIZZLE_MAX_ENUM = new VkComponentSwizzle("VK_COMPONENT_SWIZZLE_MAX_ENUM", 10,  0x7FFFFFFF);


	/** private ctor */
	private VkComponentSwizzle(String name, int ordinal, int v) {
		 super(name, ordinal, v);
	}

 } // end of class VkComponentSwizzle