package bor.vulkan.enumerations;

import bor.enumerable.*;

/**
 * Class to wrap Vulkan enumeration VkSystemAllocationScope
 * @author Alessandro Borges

 */
public class VkSystemAllocationScope extends IntEnum<VkSystemAllocationScope> {
	public static final VkSystemAllocationScope VK_SYSTEM_ALLOCATION_SCOPE_COMMAND = new VkSystemAllocationScope("VK_SYSTEM_ALLOCATION_SCOPE_COMMAND", 0, 0);
	public static final VkSystemAllocationScope VK_SYSTEM_ALLOCATION_SCOPE_OBJECT = new VkSystemAllocationScope("VK_SYSTEM_ALLOCATION_SCOPE_OBJECT", 1, 1);
	public static final VkSystemAllocationScope VK_SYSTEM_ALLOCATION_SCOPE_CACHE = new VkSystemAllocationScope("VK_SYSTEM_ALLOCATION_SCOPE_CACHE", 2, 2);
	public static final VkSystemAllocationScope VK_SYSTEM_ALLOCATION_SCOPE_DEVICE = new VkSystemAllocationScope("VK_SYSTEM_ALLOCATION_SCOPE_DEVICE", 3, 3);
	public static final VkSystemAllocationScope VK_SYSTEM_ALLOCATION_SCOPE_INSTANCE = new VkSystemAllocationScope("VK_SYSTEM_ALLOCATION_SCOPE_INSTANCE", 4, 4);
	public static final VkSystemAllocationScope VK_SYSTEM_ALLOCATION_SCOPE_BEGIN_RANGE = new VkSystemAllocationScope("VK_SYSTEM_ALLOCATION_SCOPE_BEGIN_RANGE", 5, VK_SYSTEM_ALLOCATION_SCOPE_COMMAND.getValue() );
	public static final VkSystemAllocationScope VK_SYSTEM_ALLOCATION_SCOPE_END_RANGE = new VkSystemAllocationScope("VK_SYSTEM_ALLOCATION_SCOPE_END_RANGE", 6, VK_SYSTEM_ALLOCATION_SCOPE_INSTANCE.getValue() );
	public static final VkSystemAllocationScope VK_SYSTEM_ALLOCATION_SCOPE_RANGE_SIZE = new VkSystemAllocationScope("VK_SYSTEM_ALLOCATION_SCOPE_RANGE_SIZE", 7, (VK_SYSTEM_ALLOCATION_SCOPE_END_RANGE.getValue() - VK_SYSTEM_ALLOCATION_SCOPE_BEGIN_RANGE.getValue() + 1));
	public static final VkSystemAllocationScope VK_SYSTEM_ALLOCATION_SCOPE_MAX_ENUM = new VkSystemAllocationScope("VK_SYSTEM_ALLOCATION_SCOPE_MAX_ENUM", 8,  0x7FFFFFFF);


	/** private ctor */
	private VkSystemAllocationScope(String name, int ordinal, int v) {
		 super(name, ordinal, v);
	}

 } // end of class VkSystemAllocationScope