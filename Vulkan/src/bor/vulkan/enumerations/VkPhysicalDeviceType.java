/**
 * Licence terms: 
 * The MIT License (MIT)
 * Copyright (c) 2016 Alessandro Borges
 * See https://opensource.org/licenses/MIT 
 */
package bor.vulkan.enumerations;

import bor.enumerable.*;

/**
 * Class to wrap Vulkan enumeration VkPhysicalDeviceType
 *
 * <h3>Prototype</h3> <pre>
 * typedef enum VkPhysicalDeviceType {
 *     VK_PHYSICAL_DEVICE_TYPE_OTHER = 0,
 *     VK_PHYSICAL_DEVICE_TYPE_INTEGRATED_GPU = 1,
 *     VK_PHYSICAL_DEVICE_TYPE_DISCRETE_GPU = 2,
 *     VK_PHYSICAL_DEVICE_TYPE_VIRTUAL_GPU = 3,
 *     VK_PHYSICAL_DEVICE_TYPE_CPU = 4,
 *     VK_PHYSICAL_DEVICE_TYPE_BEGIN_RANGE = VK_PHYSICAL_DEVICE_TYPE_OTHER,
 *     VK_PHYSICAL_DEVICE_TYPE_END_RANGE = VK_PHYSICAL_DEVICE_TYPE_CPU,
 *     VK_PHYSICAL_DEVICE_TYPE_RANGE_SIZE = (VK_PHYSICAL_DEVICE_TYPE_CPU - VK_PHYSICAL_DEVICE_TYPE_OTHER + 1),
 *     VK_PHYSICAL_DEVICE_TYPE_MAX_ENUM = 0x7FFFFFFF
 * } VkPhysicalDeviceType;
 * </pre>
 * @author Alessandro Borges
 */
public class VkPhysicalDeviceType extends IntEnum<VkPhysicalDeviceType> {
	public static final VkPhysicalDeviceType VK_PHYSICAL_DEVICE_TYPE_OTHER = new VkPhysicalDeviceType("VK_PHYSICAL_DEVICE_TYPE_OTHER", 0, 0);
	public static final VkPhysicalDeviceType VK_PHYSICAL_DEVICE_TYPE_INTEGRATED_GPU = new VkPhysicalDeviceType("VK_PHYSICAL_DEVICE_TYPE_INTEGRATED_GPU", 1, 1);
	public static final VkPhysicalDeviceType VK_PHYSICAL_DEVICE_TYPE_DISCRETE_GPU = new VkPhysicalDeviceType("VK_PHYSICAL_DEVICE_TYPE_DISCRETE_GPU", 2, 2);
	public static final VkPhysicalDeviceType VK_PHYSICAL_DEVICE_TYPE_VIRTUAL_GPU = new VkPhysicalDeviceType("VK_PHYSICAL_DEVICE_TYPE_VIRTUAL_GPU", 3, 3);
	public static final VkPhysicalDeviceType VK_PHYSICAL_DEVICE_TYPE_CPU = new VkPhysicalDeviceType("VK_PHYSICAL_DEVICE_TYPE_CPU", 4, 4);
	public static final VkPhysicalDeviceType VK_PHYSICAL_DEVICE_TYPE_BEGIN_RANGE = new VkPhysicalDeviceType("VK_PHYSICAL_DEVICE_TYPE_BEGIN_RANGE", 5, VK_PHYSICAL_DEVICE_TYPE_OTHER.getValue() );
	public static final VkPhysicalDeviceType VK_PHYSICAL_DEVICE_TYPE_END_RANGE = new VkPhysicalDeviceType("VK_PHYSICAL_DEVICE_TYPE_END_RANGE", 6, VK_PHYSICAL_DEVICE_TYPE_CPU.getValue() );
	public static final VkPhysicalDeviceType VK_PHYSICAL_DEVICE_TYPE_RANGE_SIZE = new VkPhysicalDeviceType("VK_PHYSICAL_DEVICE_TYPE_RANGE_SIZE", 7, (VK_PHYSICAL_DEVICE_TYPE_END_RANGE.getValue() - VK_PHYSICAL_DEVICE_TYPE_BEGIN_RANGE.getValue() + 1));
	public static final VkPhysicalDeviceType VK_PHYSICAL_DEVICE_TYPE_MAX_ENUM = new VkPhysicalDeviceType("VK_PHYSICAL_DEVICE_TYPE_MAX_ENUM", 8,  0x7FFFFFFF);


	/** private ctor */
	private VkPhysicalDeviceType(String name, int ordinal, int v) {
		 super(name, ordinal, v);
	}

 } // end of class VkPhysicalDeviceType
