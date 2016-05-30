/**
 * 
 */
package bor.vulkan.structs;

import java.nio.ByteBuffer;

import bor.vulkan.P;
import bor.vulkan.VkObject;

/**
 * Hand version of union  VkClearColorValue
 * 
 * @author Alessandro Borges
 *
 */
public class VkClearColorValue extends VkStruct {

    private static final int TAG_ID = VkStruct.VKCLEARCOLORVALUE_ID;
    private static final String TAG = "VkClearColorValue";
    
    private P<VkClearColorValue> p;
    
    float[] float32 = new float[4];
    int[]   int32 = new int [4];
    int[]   uint32 = new int[4];                     //uint32_t    uint32[4];
    
    /**
     * @param structID
     */
    public VkClearColorValue(int structID) {
        super(structID);       
    }

    /**
     * @param memSize
     * @param obj
     */
    public VkClearColorValue(int memSize, int obj) {
        super(memSize, obj);        
    }

    /**
     * @param address
     * @param size
     */
    public VkClearColorValue(long address) {
        super(address);       
    }

    /**
     * @param buff
     * @param size
     */
    public VkClearColorValue(ByteBuffer buff) {
        super(buff);     
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
