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
 * Class to wrap Vulkan enumeration VkInternalAllocationType
 *
 * <h3>Prototype</h3> <pre>
 * typedef enum VkInternalAllocationType {
 *     VK_INTERNAL_ALLOCATION_TYPE_EXECUTABLE = 0,
 *     VK_INTERNAL_ALLOCATION_TYPE_BEGIN_RANGE = VK_INTERNAL_ALLOCATION_TYPE_EXECUTABLE,
 *     VK_INTERNAL_ALLOCATION_TYPE_END_RANGE = VK_INTERNAL_ALLOCATION_TYPE_EXECUTABLE,
 *     VK_INTERNAL_ALLOCATION_TYPE_RANGE_SIZE = (VK_INTERNAL_ALLOCATION_TYPE_EXECUTABLE - VK_INTERNAL_ALLOCATION_TYPE_EXECUTABLE + 1),
 *     VK_INTERNAL_ALLOCATION_TYPE_MAX_ENUM = 0x7FFFFFFF
 * } VkInternalAllocationType;
 * </pre>
 * @author Alessandro Borges
 */
public class VkInternalAllocationType extends IntEnum<VkInternalAllocationType> {
	public static final VkInternalAllocationType VK_INTERNAL_ALLOCATION_TYPE_EXECUTABLE = new VkInternalAllocationType("VK_INTERNAL_ALLOCATION_TYPE_EXECUTABLE", 0, 0);


	/** private ctor */
	private VkInternalAllocationType(String name, int ordinal, int v) {
		 super(name, ordinal, v);
	}

 } // end of class VkInternalAllocationType
