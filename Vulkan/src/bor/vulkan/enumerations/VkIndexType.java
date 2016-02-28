/**
 * Licence terms: 
 * The MIT License (MIT)
 * Copyright (c) 2016 Alessandro Borges
 * See https://opensource.org/licenses/MIT 
 */
package bor.vulkan.enumerations;

import bor.enumerable.*;

/**
 * Class to wrap Vulkan enumeration VkIndexType
 *
 * <h3>Prototype</h3> <pre>
 * typedef enum VkIndexType {
 *     VK_INDEX_TYPE_UINT16 = 0,
 *     VK_INDEX_TYPE_UINT32 = 1,
 *     VK_INDEX_TYPE_BEGIN_RANGE = VK_INDEX_TYPE_UINT16,
 *     VK_INDEX_TYPE_END_RANGE = VK_INDEX_TYPE_UINT32,
 *     VK_INDEX_TYPE_RANGE_SIZE = (VK_INDEX_TYPE_UINT32 - VK_INDEX_TYPE_UINT16 + 1),
 *     VK_INDEX_TYPE_MAX_ENUM = 0x7FFFFFFF
 * } VkIndexType;
 * </pre>
 * @author Alessandro Borges
 */
public class VkIndexType extends IntEnum<VkIndexType> {
	public static final VkIndexType VK_INDEX_TYPE_UINT16 = new VkIndexType("VK_INDEX_TYPE_UINT16", 0, 0);
	public static final VkIndexType VK_INDEX_TYPE_UINT32 = new VkIndexType("VK_INDEX_TYPE_UINT32", 1, 1);
	public static final VkIndexType VK_INDEX_TYPE_BEGIN_RANGE = new VkIndexType("VK_INDEX_TYPE_BEGIN_RANGE", 2, VK_INDEX_TYPE_UINT16.getValue() );
	public static final VkIndexType VK_INDEX_TYPE_END_RANGE = new VkIndexType("VK_INDEX_TYPE_END_RANGE", 3, VK_INDEX_TYPE_UINT32.getValue() );
	public static final VkIndexType VK_INDEX_TYPE_RANGE_SIZE = new VkIndexType("VK_INDEX_TYPE_RANGE_SIZE", 4, (VK_INDEX_TYPE_END_RANGE.getValue() - VK_INDEX_TYPE_BEGIN_RANGE.getValue() + 1));
	public static final VkIndexType VK_INDEX_TYPE_MAX_ENUM = new VkIndexType("VK_INDEX_TYPE_MAX_ENUM", 5,  0x7FFFFFFF);


	/** private ctor */
	private VkIndexType(String name, int ordinal, int v) {
		 super(name, ordinal, v);
	}

 } // end of class VkIndexType
