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
 * Class to wrap Vulkan enumeration VkSystemAllocationScope
 *
 * <h3>Prototype</h3> <pre>
 * typedef enum VkSystemAllocationScope {
 *     VK_SYSTEM_ALLOCATION_SCOPE_COMMAND = 0,
 *     VK_SYSTEM_ALLOCATION_SCOPE_OBJECT = 1,
 *     VK_SYSTEM_ALLOCATION_SCOPE_CACHE = 2,
 *     VK_SYSTEM_ALLOCATION_SCOPE_DEVICE = 3,
 *     VK_SYSTEM_ALLOCATION_SCOPE_INSTANCE = 4,
 *     VK_SYSTEM_ALLOCATION_SCOPE_BEGIN_RANGE = VK_SYSTEM_ALLOCATION_SCOPE_COMMAND,
 *     VK_SYSTEM_ALLOCATION_SCOPE_END_RANGE = VK_SYSTEM_ALLOCATION_SCOPE_INSTANCE,
 *     VK_SYSTEM_ALLOCATION_SCOPE_RANGE_SIZE = (VK_SYSTEM_ALLOCATION_SCOPE_INSTANCE - VK_SYSTEM_ALLOCATION_SCOPE_COMMAND + 1),
 *     VK_SYSTEM_ALLOCATION_SCOPE_MAX_ENUM = 0x7FFFFFFF
 * } VkSystemAllocationScope;
 * </pre>
 * @author Alessandro Borges
 */
public class VkSystemAllocationScope extends IntEnum<VkSystemAllocationScope> {
	public static final VkSystemAllocationScope VK_SYSTEM_ALLOCATION_SCOPE_COMMAND = new VkSystemAllocationScope("VK_SYSTEM_ALLOCATION_SCOPE_COMMAND", 0, 0);
	public static final VkSystemAllocationScope VK_SYSTEM_ALLOCATION_SCOPE_OBJECT = new VkSystemAllocationScope("VK_SYSTEM_ALLOCATION_SCOPE_OBJECT", 1, 1);
	public static final VkSystemAllocationScope VK_SYSTEM_ALLOCATION_SCOPE_CACHE = new VkSystemAllocationScope("VK_SYSTEM_ALLOCATION_SCOPE_CACHE", 2, 2);
	public static final VkSystemAllocationScope VK_SYSTEM_ALLOCATION_SCOPE_DEVICE = new VkSystemAllocationScope("VK_SYSTEM_ALLOCATION_SCOPE_DEVICE", 3, 3);
	public static final VkSystemAllocationScope VK_SYSTEM_ALLOCATION_SCOPE_INSTANCE = new VkSystemAllocationScope("VK_SYSTEM_ALLOCATION_SCOPE_INSTANCE", 4, 4);


	/** private ctor */
	private VkSystemAllocationScope(String name, int ordinal, int v) {
		 super(name, ordinal, v);
	}

 } // end of class VkSystemAllocationScope
