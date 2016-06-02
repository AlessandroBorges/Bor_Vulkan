/**
 * 
 */
package bor.vulkan;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/**
 * A class to hold on a array of native Vulkan handlers.<br>
 * This is equivalent to BigBuffer concept, but specialized for VkHandles.<br>
 * 
 *  
 * @author Alessandro Borges
 *
 */
public class NativeArray<T extends VkHandleInterface>{
    private ByteBuffer array;
    private int count;
    private final int sizeof;
    private int capacity; 
           
    /**
     * Creates a native array for one or more vkHandles instances         
     * @param type - Class of the contained VkHandle
     * @param handles - one or more vkHandles.
     */
    @SafeVarargs
    public NativeArray(Class<T> type, T...handles){
        sizeof = sizeof(type);
        this.count = handles.length;
        capacity = count * sizeof;
        prepare(handles);
    }
    
    /**
     * get the number of handles contained in this NativeArray
     * @return
     */
    public int getCount(){
        return count;
    }
    
    /**
     * Get the native array, referenced by a ByteBuffer
     * @return a ByteBuffer wrapping the native array pointer.
     */
    public ByteBuffer getArray(){
        return array;
    }
    
    /**
     * Update native handles
     * @param handles - handles to update
     */
    public void update(T[] handles){
        int upCount = handles.length;
        int newCapacity = upCount * sizeof;
        count = upCount;
        if(newCapacity < capacity){                
            populate(handles);
        }else{
            capacity = newCapacity;
            prepare(handles);
        }            
    }
    
    /**
     * Prepare array to receive handles to copy to array.
     * @param handles - handles to update.
     */
    private void prepare(T[] handles) {            
        array = ByteBuffer.allocateDirect(capacity);
        array.order(ByteOrder.nativeOrder());
        populate(handles);
    }
    
    /**
     * Copy Handles to 
     * @param handles
     */
    private void populate(T[] handles){
        array.position(0);
        if (sizeof == 8) {
            for (VkHandleInterface item : handles) {
                long address = item.getNativeHandle();
                array.putLong(address);
            }
        } else {
            for (VkHandleInterface item : handles) {
                long address = item.getNativeHandle();
                int address32 = (int) (address & 0xFFffFFff);
                array.putInt(address32);
            }
        }
    }

    /**
     * return the size of a VkHandler object
     * @param type - class type
     * @return
     */
    private  int sizeof(Class<T> type){
        if(isDispatchableHandler(type)){
            return Vk10.SIZE_OF_HANDLE;
        }
        return Vk10.SIZE_OF_NON__DISPATCHABLE_HANDLE;
    }
    
    /**
     * Check if class cc is a Dispatchable Handler
     * @param cc
     * @return
     */
    private boolean isDispatchableHandler(Class<T> cc){
        return VkHandleDispatchable.class.isAssignableFrom(cc);
    }
    
    
}//class

