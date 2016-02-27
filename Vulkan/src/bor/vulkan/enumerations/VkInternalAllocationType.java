package bor.vulkan.enumerations;

import bor.enumerable.*;

/**
 * Class to wrap Vulkan enumeration VkInternalAllocationType
 * @author Alessandro Borges

 */
public class VkInternalAllocationType extends IntEnum<VkInternalAllocationType> {
	public static final VkInternalAllocationType VK_INTERNAL_ALLOCATION_TYPE_EXECUTABLE = new VkInternalAllocationType("VK_INTERNAL_ALLOCATION_TYPE_EXECUTABLE", 0, 0);
	public static final VkInternalAllocationType VK_INTERNAL_ALLOCATION_TYPE_BEGIN_RANGE = new VkInternalAllocationType("VK_INTERNAL_ALLOCATION_TYPE_BEGIN_RANGE", 1, VK_INTERNAL_ALLOCATION_TYPE_EXECUTABLE.getValue() );
	public static final VkInternalAllocationType VK_INTERNAL_ALLOCATION_TYPE_END_RANGE = new VkInternalAllocationType("VK_INTERNAL_ALLOCATION_TYPE_END_RANGE", 2, VK_INTERNAL_ALLOCATION_TYPE_EXECUTABLE.getValue() );
	public static final VkInternalAllocationType VK_INTERNAL_ALLOCATION_TYPE_RANGE_SIZE = new VkInternalAllocationType("VK_INTERNAL_ALLOCATION_TYPE_RANGE_SIZE", 3, (VK_INTERNAL_ALLOCATION_TYPE_END_RANGE.getValue() - VK_INTERNAL_ALLOCATION_TYPE_BEGIN_RANGE.getValue() + 1));
	public static final VkInternalAllocationType VK_INTERNAL_ALLOCATION_TYPE_MAX_ENUM = new VkInternalAllocationType("VK_INTERNAL_ALLOCATION_TYPE_MAX_ENUM", 4,  0x7FFFFFFF);


	/** private ctor */
	private VkInternalAllocationType(String name, int ordinal, int v) {
		 super(name, ordinal, v);
	}

 } // end of class VkInternalAllocationType