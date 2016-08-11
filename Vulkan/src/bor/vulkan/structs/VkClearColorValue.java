/**
 * 
 */
package bor.vulkan.structs;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;

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
   
    // clear color values
    final float[] float32 = new float[4];
    final int[]   int32 = new int [4];
    final int[]   uint32 = new int[4];       
    
    /**
     * FloatBuffer view of this VkStruct.ptr buffer
     */
    FloatBuffer floatBufferView; 
    /**
     * IntBuffer view of this VkStruct.ptr buffer
     */
    IntBuffer   intBufferView;
    
    /**
     * @param structID
     */
    public VkClearColorValue() {
        super(TAG_ID);  
        init();
    }
    
    /**
     * Ctor for ByteBuffer
     * @param buffer - direct buffer
     */
    public VkClearColorValue(ByteBuffer buffer) {
        super(buffer); 
        init();
    }
    
    /**
     * Ctor for native address
     * @param address - native address
     */
    public VkClearColorValue(long address) {
        super(address); 
        init();
    }
    
    /**
     * Initialize views
     */
    private void init(){
     // initialize internal storage
        ByteBuffer buff = getPointer();        
        buff.rewind();
        floatBufferView = buff.asFloatBuffer();
        intBufferView = buff.asIntBuffer();  
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


    /**
     * @return the float32
     */
    public float[] float32() {
        floatBufferView.rewind();
        floatBufferView.get(float32);
        return float32;
    }

    /**
     * set clearColor
     * @param float32 the float32 to set
     */
    public void float32(float[] float32) {
        System.arraycopy(float32, 0, this.float32, 0, 4);        
        floatBufferView.rewind();
        floatBufferView.put(float32);
    }




    /**
     * @return the int32
     */
    public int[] int32() {
        intBufferView.rewind();
        intBufferView.get(int32);
        return int32;
    }


    /**
     * @param int32 the int32 to set
     */
    public void int32(int[] int32) {
       System.arraycopy(int32, 0, this.int32, 0, 4);
       intBufferView.rewind();
       intBufferView.put(int32);
    }

    /**
     * @return the uint32
     */
    public int[] uint32() {
        intBufferView.rewind();
        intBufferView.get(uint32);
        return uint32;
    }




    /**
     * @param uint32 the uint32 to set
     */
    public void uint32(int[] uint32) {
        System.arraycopy(int32, 0, this.int32, 0, 4);
        intBufferView.rewind();
        intBufferView.put(int32);
    }
  
}
