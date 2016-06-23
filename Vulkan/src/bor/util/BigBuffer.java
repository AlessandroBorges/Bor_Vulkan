package bor.util;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.*;

import bor.vulkan.VkObject;
import bor.vulkan.structs.VkStruct;

/**
 * Class to store a native array of VkObjects.<br>
 * 
 * @author Alessandro Borges
 *
 * @param <T>
 */
public class BigBuffer<T> {
    
    private static Class<ByteBuffer> bbClazz = (Class<ByteBuffer>) ByteBuffer.class;
    
    private Constructor<VkStruct> ctor;    
    private ByteBuffer nativeBufferArray;    
    private int elementCount;
    private int singleSize;    
    Class<VkStruct> clazz;
    VkStruct[] array;
  
    
    /**
     * Constructor
     * @param array - array of VkStruct
     * @param clazzT - Class of T. Must be an VkObject class type.
     * @param structID - VkStruct ID
     * 
     * @throws IllegalArgumentException - if class is invalid, or if nativeBufferArray is null or zero capacity
     */
    public BigBuffer(VkStruct[] array, Class<VkStruct> clazzT, int structID) {
        this.elementCount = array == null ? 0 : array.length;       
        this.clazz = clazzT;       
        singleSize = VkStruct.sizeOf(structID) ;        
        this.nativeBufferArray = (array == null) ? null : ByteBuffer.allocateDirect(singleSize * elementCount);
        nativeBufferArray.order(ByteOrder.nativeOrder());       
        nativeBufferArray.rewind(); 
        splitBufferToArray();
    }
      
    
    /**
     * @return the nativeBufferArray
     */
    public ByteBuffer getBuffer() {
        return nativeBufferArray;
    }

    /**
     * @return the elementCount
     */
    public int getElementCount() {
        return elementCount;
    }
    
    
    /**
     * Get array 
     * @return the list
     */
    private VkStruct[] splitBufferToArray(){
        if(array != null){           
            int sizeBytes = singleSize;
            nativeBufferArray.rewind();
            for(int i=0; i<elementCount; i++){ 
                int pos = i * sizeBytes;                
                nativeBufferArray.limit(pos + sizeBytes);
                nativeBufferArray.position(pos);
                
                ByteBuffer bb = nativeBufferArray.slice();
                bb.order(ByteOrder.nativeOrder());
                if( array[i] == null){
                    array[i] = (VkStruct) wrap(bb);
                }else{
                   // clone buffer before set
                   ByteBuffer src = array[i].getPointer();
                   copyBuffers(src, 0, bb, 0, sizeBytes);                   
                   array[i].setPointer(bb);
                }
            }   
        }
        return array;
    }
    
    /**
     * Copy length bytes from buffers dst to src
     * @param src
     * @param srcPos
     * @param dst
     * @param destPos
     * @param length
     */
    private void copyBuffers(ByteBuffer src, int srcPos, ByteBuffer dst, int destPos, int length){
        src.position(srcPos);
        dst.position(destPos);
        for(int i=0; i<length; i++){
            dst.put(src.get());
        }
    }
    
    
    /**
     * Wrap bb ins instance of T
     * @param bb - bytebuffer to wrap
     * @return instance of T
     */
    private VkStruct wrap(ByteBuffer bb){
        VkStruct tt;
        Constructor<VkStruct> ctor = getCtor();
        try {
            tt = ctor.newInstance(bb);
        } catch (Exception e) {
            throw new UnsupportedOperationException("Failed to create instance of " + clazz, e);
        }
        return tt;
    }

    /**
     * Get Constructor
     * @return
     */
    private Constructor<VkStruct> getCtor() {
        if (ctor == null) {
            try {
                ctor = clazz.getConstructor(bbClazz);
            } catch (Exception e) {
                throw new IllegalArgumentException("argument clazz is not supported: " + clazz, e);
            }
        }
        return ctor;
    }
    
}
