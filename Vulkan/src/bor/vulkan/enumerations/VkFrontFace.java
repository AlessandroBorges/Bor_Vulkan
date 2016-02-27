package bor.vulkan.enumerations;

import bor.enumerable.*;

/**
 * Class to wrap Vulkan enumeration VkFrontFace
 * @author Alessandro Borges

 */
public class VkFrontFace extends IntEnum<VkFrontFace> {
	public static final VkFrontFace VK_FRONT_FACE_COUNTER_CLOCKWISE = new VkFrontFace("VK_FRONT_FACE_COUNTER_CLOCKWISE", 0, 0);
	public static final VkFrontFace VK_FRONT_FACE_CLOCKWISE = new VkFrontFace("VK_FRONT_FACE_CLOCKWISE", 1, 1);
	public static final VkFrontFace VK_FRONT_FACE_BEGIN_RANGE = new VkFrontFace("VK_FRONT_FACE_BEGIN_RANGE", 2, VK_FRONT_FACE_COUNTER_CLOCKWISE.getValue() );
	public static final VkFrontFace VK_FRONT_FACE_END_RANGE = new VkFrontFace("VK_FRONT_FACE_END_RANGE", 3, VK_FRONT_FACE_CLOCKWISE.getValue() );
	public static final VkFrontFace VK_FRONT_FACE_RANGE_SIZE = new VkFrontFace("VK_FRONT_FACE_RANGE_SIZE", 4, (VK_FRONT_FACE_END_RANGE.getValue() - VK_FRONT_FACE_BEGIN_RANGE.getValue() + 1));
	public static final VkFrontFace VK_FRONT_FACE_MAX_ENUM = new VkFrontFace("VK_FRONT_FACE_MAX_ENUM", 5,  0x7FFFFFFF);


	/** private ctor */
	private VkFrontFace(String name, int ordinal, int v) {
		 super(name, ordinal, v);
	}

 } // end of class VkFrontFace