package bor.vulkan.enumerations;

import bor.enumerable.*;

/**
 * Class to wrap Vulkan enumeration VkBorderColor
 * @author Alessandro Borges

 */
public class VkBorderColor extends IntEnum<VkBorderColor> {
	public static final VkBorderColor VK_BORDER_COLOR_FLOAT_TRANSPARENT_BLACK = new VkBorderColor("VK_BORDER_COLOR_FLOAT_TRANSPARENT_BLACK", 0, 0);
	public static final VkBorderColor VK_BORDER_COLOR_INT_TRANSPARENT_BLACK = new VkBorderColor("VK_BORDER_COLOR_INT_TRANSPARENT_BLACK", 1, 1);
	public static final VkBorderColor VK_BORDER_COLOR_FLOAT_OPAQUE_BLACK = new VkBorderColor("VK_BORDER_COLOR_FLOAT_OPAQUE_BLACK", 2, 2);
	public static final VkBorderColor VK_BORDER_COLOR_INT_OPAQUE_BLACK = new VkBorderColor("VK_BORDER_COLOR_INT_OPAQUE_BLACK", 3, 3);
	public static final VkBorderColor VK_BORDER_COLOR_FLOAT_OPAQUE_WHITE = new VkBorderColor("VK_BORDER_COLOR_FLOAT_OPAQUE_WHITE", 4, 4);
	public static final VkBorderColor VK_BORDER_COLOR_INT_OPAQUE_WHITE = new VkBorderColor("VK_BORDER_COLOR_INT_OPAQUE_WHITE", 5, 5);
	public static final VkBorderColor VK_BORDER_COLOR_BEGIN_RANGE = new VkBorderColor("VK_BORDER_COLOR_BEGIN_RANGE", 6, VK_BORDER_COLOR_FLOAT_TRANSPARENT_BLACK.getValue() );
	public static final VkBorderColor VK_BORDER_COLOR_END_RANGE = new VkBorderColor("VK_BORDER_COLOR_END_RANGE", 7, VK_BORDER_COLOR_INT_OPAQUE_WHITE.getValue() );
	public static final VkBorderColor VK_BORDER_COLOR_RANGE_SIZE = new VkBorderColor("VK_BORDER_COLOR_RANGE_SIZE", 8, (VK_BORDER_COLOR_END_RANGE.getValue() - VK_BORDER_COLOR_BEGIN_RANGE.getValue() + 1));
	public static final VkBorderColor VK_BORDER_COLOR_MAX_ENUM = new VkBorderColor("VK_BORDER_COLOR_MAX_ENUM", 9,  0x7FFFFFFF);


	/** private ctor */
	private VkBorderColor(String name, int ordinal, int v) {
		 super(name, ordinal, v);
	}

 } // end of class VkBorderColor