/**
 * 
 */
package bor.vulkan.structs;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import bor.vulkan.P;
import bor.vulkan.VkObject;

/**
 * @author Alessandro Borges
 *
 */
public class VkClearValue extends VkStruct {
    
    private static final int TAG_ID = VkStruct.VKCLEARVALUE_ID;
    private static final String TAG = "VkClearValue";
    
    /**
     * Fields color and depthStencil are union at definition in native side.
     * It means both share same space, and raw values, in memory. 
     * <pre> 
     * typedef union VkClearValue { 
     *     VkClearColorValue           color;
     *     VkClearDepthStencilValue    depthStencil;
     *  } VkClearValue;
     * </pre
     */
    final VkClearColorValue           color;
    
    /**
     * Fields color and depthStencil are union at definition in native side.
     * It means both share same space, and raw values, in memory. 
     * <pre> 
     * typedef union VkClearValue { 
     *     VkClearColorValue           color;
     *     VkClearDepthStencilValue    depthStencil;
     *  } VkClearValue;
     * </pre
     */
    final VkClearDepthStencilValue    depthStencil;

    /**
     * Default constructor.
     * It allocates direct buffer with correct size.
     * @param structID
     */
    public VkClearValue() {
        super(TAG_ID);  
        
        color = new VkClearColorValue(this.ptr);
        depthStencil = new VkClearDepthStencilValue(this.ptr);
    }

    /**
     * Ctor for a existing buffer
     * @param buff     
     */
    public VkClearValue(ByteBuffer buff) {
        super(buff);  
        // initialize internal storage       
        buff.order(ByteOrder.nativeOrder());
        buff.rewind();
        color = new VkClearColorValue(this.ptr);
        depthStencil = new VkClearDepthStencilValue(this.ptr);
    }
    
    /**
     * Ctor for already created struct
     * @param address - native address
     */
    public VkClearValue(long address){
        super(address);
        // initialize internal storage
        ByteBuffer buff = getPointer();
        buff.order(ByteOrder.nativeOrder());
        buff.rewind();        
        color = new VkClearColorValue(buff);
        depthStencil = new VkClearDepthStencilValue(buff);
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
     * Get the ID of this Structute
     * @return
     */
    public static int getID(){
        return TAG_ID;
    }

    /**
     * Set color value as float values.
     * 
     * @param float32 - RGBA color array as float array. Length must >= 4.
     * @return this {@link VkClearColorValue} instance.
     */
    public VkClearValue color(float[] float32){
        color.float32(float32);
        return this;
    }
    
    /**
     * Set color value as int values.
     * @param int32 - RGBA color as int array. Length must be >= 4.
     * 
     * @return this {@link VkClearColorValue} instance
     */
    public VkClearValue color(int[] int32){
        color.int32(int32);
        return this;
    }
    
    /**
     * Get method for VkClearColorValue color
     * @return the color
     */
    public VkClearColorValue color() {
        return color;
    }

    /**
     * Set method for depth and stencil values, wrapped internaly
     *  by a {@link VkClearDepthStencilValue} instance.
     *   
     * @param depth - depth as float value
     * @param stencil - stencil as unsigned int value.
     * 
     * @return this {@link VkClearValue} instance.
     */
    public VkClearValue setdepthStencil(float depth, int stencil){
        depthStencil.depth(depth);
        depthStencil.stencil(stencil);
        return this;
    }
    
    /**
     * Get method for <pre>VkClearDepthStencilValue depthStencil</pre> field.
     * 
     * @return the depthStencil, as instance of VkClearDepthStencilValue
     */
    public VkClearDepthStencilValue depthStencil() {
        return depthStencil;
    }

   
    
    
}
