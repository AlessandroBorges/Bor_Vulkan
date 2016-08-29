/**
 * 
 */
package bor.vulkan.structs;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import bor.util.BigBuffer;
import bor.vulkan.VkArray;

/**
 * Immutable List of VkStructs.
 * 
 * @author Alessandro Borges
 *
 */
class VkArrayStruct<E extends VkStruct> extends VkArray<E> {

    /**
     * Creates a VkArray for Vulkan Structs
     * 
     * @param array - VkStruct array
     * @param structID - ID, or TAG_ID of Struct.
     */
    protected VkArrayStruct(E[] array, int structID) {
        this.array = array;
        this.bigBuffer = new BigBuffer<E>(array, structID);
        this.bigBuffer.update();
    }

}
