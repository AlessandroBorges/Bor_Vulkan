/**
 * 
 */
package bor.vulkan.structs;

import java.nio.ByteBuffer;

import bor.vulkan.P;
import bor.vulkan.VkObject;

/**
 * @author Alessandro Borges
 *
 */
public class VkClearValue extends VkStruct {
    
    private P<VkClearValue> p;
    
    private static final int TAG_ID = VkStruct.VKCLEARVALUE_ID;
    private static final String TAG = "VkClearValue";
    
    // Fields
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
     * @param address
     * @param size
     */
    public VkClearValue(long address) {
        super(address);       
    }

    /**
     * @param buff
     * @param size
     */
    public VkClearValue(ByteBuffer buff) {
        super(buff);       
    }
    
    @Override
    public P<VkClearValue> getP() {
       if(p==null){
           p = new P<VkClearValue>(this);
       }
        return p;
    }

    /**
     * 
     */
    @Override
    public int getSizeBytes() {
        return sizeof();
    }

    /**
     * Size of this 
     * @return
     */
    public static int sizeof(){
        return sizeOf(TAG_ID);
    }
}
