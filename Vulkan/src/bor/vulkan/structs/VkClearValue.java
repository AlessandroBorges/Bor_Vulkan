/**
 * 
 */
package bor.vulkan.structs;

import java.nio.ByteBuffer;

/**
 * @author Alessandro Borges
 *
 */
public class VkClearValue extends VkStruct {
    
    VkClearColorValue           color;
    VkClearDepthStencilValue    depthStencil;

    /**
     * @param structID
     */
    public VkClearValue(int structID) {
        super(structID);       
    }

    /**
     * @param memSize
     * @param obj
     */
    public VkClearValue(int memSize, int obj) {
        super(memSize, obj);       
    }

    /**
     * @param address
     * @param size
     */
    public VkClearValue(long address, int size) {
        super(address, size);       
    }

    /**
     * @param buff
     * @param size
     */
    public VkClearValue(ByteBuffer buff, int size) {
        super(buff, size);       
    }

}
