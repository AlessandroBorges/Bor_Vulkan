/**
 * Licence terms: 
 * The MIT License (MIT)
 * Copyright (c) 2016 Alessandro Borges
 * See https://opensource.org/licenses/MIT 
 */
package bor.vulkan.enumerations;

import bor.enumerable.*;

/**
 * Class to wrap Vulkan enumeration VkDependencyFlagBits
 *
 * <h3>Prototype</h3> <pre>
 * typedef enum VkDependencyFlagBits {
 *     VK_DEPENDENCY_BY_REGION_BIT = 0x00000001,
 * } VkDependencyFlagBits;
 * </pre>
 * @author Alessandro Borges
 */
public class VkDependencyFlagBits extends IntEnum<VkDependencyFlagBits> {
	public static final VkDependencyFlagBits VK_DEPENDENCY_BY_REGION_BIT = new VkDependencyFlagBits("VK_DEPENDENCY_BY_REGION_BIT", 0, 0x00000001);


	/** private ctor */
	private VkDependencyFlagBits(String name, int ordinal, int v) {
		 super(name, ordinal, v);
	}

 } // end of class VkDependencyFlagBits
