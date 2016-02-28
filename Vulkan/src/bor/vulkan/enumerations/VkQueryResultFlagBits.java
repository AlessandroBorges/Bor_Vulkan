/**
 * Licence terms: 
 * The MIT License (MIT)
 * Copyright (c) 2016 Alessandro Borges
 * See https://opensource.org/licenses/MIT 
 */
package bor.vulkan.enumerations;

import bor.enumerable.*;

/**
 * Class to wrap Vulkan enumeration VkQueryResultFlagBits
 *
 * <h3>Prototype</h3> <pre>
 * typedef enum VkQueryResultFlagBits {
 *     VK_QUERY_RESULT_64_BIT = 0x00000001,
 *     VK_QUERY_RESULT_WAIT_BIT = 0x00000002,
 *     VK_QUERY_RESULT_WITH_AVAILABILITY_BIT = 0x00000004,
 *     VK_QUERY_RESULT_PARTIAL_BIT = 0x00000008,
 * } VkQueryResultFlagBits;
 * </pre>
 * @author Alessandro Borges
 */
public class VkQueryResultFlagBits extends IntEnum<VkQueryResultFlagBits> {
	public static final VkQueryResultFlagBits VK_QUERY_RESULT_64_BIT = new VkQueryResultFlagBits("VK_QUERY_RESULT_64_BIT", 0, 0x00000001);
	public static final VkQueryResultFlagBits VK_QUERY_RESULT_WAIT_BIT = new VkQueryResultFlagBits("VK_QUERY_RESULT_WAIT_BIT", 1, 0x00000002);
	public static final VkQueryResultFlagBits VK_QUERY_RESULT_WITH_AVAILABILITY_BIT = new VkQueryResultFlagBits("VK_QUERY_RESULT_WITH_AVAILABILITY_BIT", 2, 0x00000004);
	public static final VkQueryResultFlagBits VK_QUERY_RESULT_PARTIAL_BIT = new VkQueryResultFlagBits("VK_QUERY_RESULT_PARTIAL_BIT", 3, 0x00000008);


	/** private ctor */
	private VkQueryResultFlagBits(String name, int ordinal, int v) {
		 super(name, ordinal, v);
	}

 } // end of class VkQueryResultFlagBits
