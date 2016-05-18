package bor.vulkan;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.*;

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
    private Constructor<T> ctor;
    
    ByteBuffer nativeBufferArray;
    ByteBuffer nativeHeadArray;
    int elementCount;  
    Class<T> clazz;
    List<T> list;
    T owner;
    boolean skipHead;
   
    
    /**
     * Constructor
     * @param nativeBufferArray - Direct ByteBuffer with pointer to a list of VkObjects  
     * @param elementCount - number of elements contained in list. Must be >= 1.    
     * @param clazzT - Class of T. Must be an VkObject class type.
     * @param skipHead - if true, the first pointer in nativeBufferArray is reserved for VkObject holder 
     * 
     * @throws IllegalArgumentException - if class is invalid, or if nativeBufferArray is null or zero capacity
     */
    public BigBuffer(ByteBuffer nativeBufferArray, int elementCount, Class<T> clazzT, boolean skipHead) {
        super();
        this.nativeBufferArray = nativeBufferArray;
        this.elementCount = elementCount;       
        this.clazz = clazzT;
        this.skipHead = skipHead;
       
        if(nativeBufferArray==null || nativeBufferArray.capacity()==0){
            throw new IllegalArgumentException("nativeBufferArray is null or has zero capacity. ");
        }
        if(elementCount < 1){
            throw new IllegalArgumentException("elementCount must be greater than 1");
        }
        nativeBufferArray.order(ByteOrder.nativeOrder());       
        nativeBufferArray.rewind();        
        
        try {
            ctor = clazzT.getConstructor(bbClazz);
        } catch (Exception e) {            
            throw new IllegalArgumentException("argument clazz is not supported: " + clazzT,e);
        }
    }
    
    /**
     * Set the owner of this.
     *  Ignored if skipHead is false.
     * @param owner - VkObject owner of this;
     */
    public void setOwner(VkObject owner){
        this.owner = (T) owner;
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
     * Get an unmodifiable List of internal elements of BigBuffer
     * @return the list
     */
    public List<T> getList() {
        if(list==null){
            List<T> alist = new ArrayList<T>(elementCount);
            int sizeBytes = nativeBufferArray.capacity() / elementCount;
            for(int i=0; i<elementCount; i++){                
                nativeBufferArray.position(i*sizeBytes);
                ByteBuffer bb = nativeBufferArray.slice();
                bb.limit(sizeBytes);
                if(skipHead && i==0){
                    // owner contains HEAD
                    nativeBufferArray = bb;
                    alist.add(owner);
                }else
                    alist.add((T)wrap(bb));
            }            
            list = Collections.unmodifiableList(alist);
        }
        return list;
    }
    
    
    /**
     * Wrap bb ins instance of T
     * @param bb - bytebuffer to wrap
     * @return instance of T
     */
    private T wrap(ByteBuffer bb){
        T tt;
        try {
            tt = ctor.newInstance(bb);
        } catch (Exception e) {
            throw new UnsupportedOperationException("Failed to create instance of " + clazz, e);
        }
        return tt;
    }

 
    /**
     * Get the i-th T element in list 
     * @param i - index of element
     * @return the i-th instance of T
     */
    public T get(int i){
        if(i<0 || i>elementCount)
            return null;
        return getList().get(i);
    }

    

}
