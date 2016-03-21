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
 * Class to wrap Vulkan enumeration VkResult
 *
 * <h3>Prototype</h3> <pre>
 * typedef enum VkResult {
 *     VK_SUCCESS = 0,
 *     VK_NOT_READY = 1,
 *     VK_TIMEOUT = 2,
 *     VK_EVENT_SET = 3,
 *     VK_EVENT_RESET = 4,
 *     VK_INCOMPLETE = 5,
 *     VK_ERROR_OUT_OF_HOST_MEMORY = -1,
 *     VK_ERROR_OUT_OF_DEVICE_MEMORY = -2,
 *     VK_ERROR_INITIALIZATION_FAILED = -3,
 *     VK_ERROR_DEVICE_LOST = -4,
 *     VK_ERROR_MEMORY_MAP_FAILED = -5,
 *     VK_ERROR_LAYER_NOT_PRESENT = -6,
 *     VK_ERROR_EXTENSION_NOT_PRESENT = -7,
 *     VK_ERROR_FEATURE_NOT_PRESENT = -8,
 *     VK_ERROR_INCOMPATIBLE_DRIVER = -9,
 *     VK_ERROR_TOO_MANY_OBJECTS = -10,
 *     VK_ERROR_FORMAT_NOT_SUPPORTED = -11,
 *     VK_ERROR_SURFACE_LOST_KHR = -1000000000,
 *     VK_ERROR_NATIVE_WINDOW_IN_USE_KHR = -1000000001,
 *     VK_SUBOPTIMAL_KHR = 1000001003,
 *     VK_ERROR_OUT_OF_DATE_KHR = -1000001004,
 *     VK_ERROR_INCOMPATIBLE_DISPLAY_KHR = -1000003001,
 *     VK_ERROR_VALIDATION_FAILED_EXT = -1000011001,
 *     VK_RESULT_BEGIN_RANGE = VK_ERROR_FORMAT_NOT_SUPPORTED,
 *     VK_RESULT_END_RANGE = VK_INCOMPLETE,
 *     VK_RESULT_RANGE_SIZE = (VK_INCOMPLETE - VK_ERROR_FORMAT_NOT_SUPPORTED + 1),
 *     VK_RESULT_MAX_ENUM = 0x7FFFFFFF
 * } VkResult;
 * </pre>
 * @author Alessandro Borges
 */
public class VkResult extends IntEnum<VkResult> {
	public static final VkResult VK_SUCCESS = new VkResult("VK_SUCCESS", 0, 0);
	public static final VkResult VK_NOT_READY = new VkResult("VK_NOT_READY", 1, 1);
	public static final VkResult VK_TIMEOUT = new VkResult("VK_TIMEOUT", 2, 2);
	public static final VkResult VK_EVENT_SET = new VkResult("VK_EVENT_SET", 3, 3);
	public static final VkResult VK_EVENT_RESET = new VkResult("VK_EVENT_RESET", 4, 4);
	public static final VkResult VK_INCOMPLETE = new VkResult("VK_INCOMPLETE", 5, 5);
	public static final VkResult VK_ERROR_OUT_OF_HOST_MEMORY = new VkResult("VK_ERROR_OUT_OF_HOST_MEMORY", 6, -1);
	public static final VkResult VK_ERROR_OUT_OF_DEVICE_MEMORY = new VkResult("VK_ERROR_OUT_OF_DEVICE_MEMORY", 7, -2);
	public static final VkResult VK_ERROR_INITIALIZATION_FAILED = new VkResult("VK_ERROR_INITIALIZATION_FAILED", 8, -3);
	public static final VkResult VK_ERROR_DEVICE_LOST = new VkResult("VK_ERROR_DEVICE_LOST", 9, -4);
	public static final VkResult VK_ERROR_MEMORY_MAP_FAILED = new VkResult("VK_ERROR_MEMORY_MAP_FAILED", 10, -5);
	public static final VkResult VK_ERROR_LAYER_NOT_PRESENT = new VkResult("VK_ERROR_LAYER_NOT_PRESENT", 11, -6);
	public static final VkResult VK_ERROR_EXTENSION_NOT_PRESENT = new VkResult("VK_ERROR_EXTENSION_NOT_PRESENT", 12, -7);
	public static final VkResult VK_ERROR_FEATURE_NOT_PRESENT = new VkResult("VK_ERROR_FEATURE_NOT_PRESENT", 13, -8);
	public static final VkResult VK_ERROR_INCOMPATIBLE_DRIVER = new VkResult("VK_ERROR_INCOMPATIBLE_DRIVER", 14, -9);
	public static final VkResult VK_ERROR_TOO_MANY_OBJECTS = new VkResult("VK_ERROR_TOO_MANY_OBJECTS", 15, -10);
	public static final VkResult VK_ERROR_FORMAT_NOT_SUPPORTED = new VkResult("VK_ERROR_FORMAT_NOT_SUPPORTED", 16, -11);
	public static final VkResult VK_ERROR_SURFACE_LOST_KHR = new VkResult("VK_ERROR_SURFACE_LOST_KHR", 17, -1000000000);
	public static final VkResult VK_ERROR_NATIVE_WINDOW_IN_USE_KHR = new VkResult("VK_ERROR_NATIVE_WINDOW_IN_USE_KHR", 18, -1000000001);
	public static final VkResult VK_SUBOPTIMAL_KHR = new VkResult("VK_SUBOPTIMAL_KHR", 19, 1000001003);
	public static final VkResult VK_ERROR_OUT_OF_DATE_KHR = new VkResult("VK_ERROR_OUT_OF_DATE_KHR", 20, -1000001004);
	public static final VkResult VK_ERROR_INCOMPATIBLE_DISPLAY_KHR = new VkResult("VK_ERROR_INCOMPATIBLE_DISPLAY_KHR", 21, -1000003001);
	public static final VkResult VK_ERROR_VALIDATION_FAILED_EXT = new VkResult("VK_ERROR_VALIDATION_FAILED_EXT", 22, -1000011001);


	/** private ctor */
	private VkResult(String name, int ordinal, int v) {
		 super(name, ordinal, v);
	}
	
	public static VkResult getByValue(int value){
	    return VK_SUCCESS.getEnumByValue(value);
	}
	
	
	

 } // end of class VkResult
