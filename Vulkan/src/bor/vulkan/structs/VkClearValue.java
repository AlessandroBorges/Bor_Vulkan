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
        // TODO Auto-generated constructor stub
    }

    /**
     * @param memSize
     * @param obj
     */
    public VkClearValue(int memSize, Object obj) {
        super(memSize, obj);
        // TODO Auto-generated constructor stub
    }

    /**
     * @param address
     * @param size
     */
    public VkClearValue(long address, int size) {
        super(address, size);
        // TODO Auto-generated constructor stub
    }

    /**
     * @param buff
     * @param size
     */
    public VkClearValue(ByteBuffer buff, int size) {
        super(buff, size);
        // TODO Auto-generated constructor stub
    }

}
