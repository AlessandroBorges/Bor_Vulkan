package bor.util;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.*;

import bor.vulkan.Vk10;
import bor.vulkan.VkHandle;
import bor.vulkan.VkHandleDispatchable;
import bor.vulkan.VkHandleInterface;
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
   
  
    private static final int MASK_32BIT_PTR = 0xFFffFFff;

    private int structID;
    
    private ByteBuffer nativeBufferArray;    
    private int elementCount;
    private int singleSize;    
    private VkObject[] array;
    
    private boolean isHandle = false;
    private boolean isDispatchHandle = false;
  
    private boolean dirty = true;
    
    /**
     * Constructor
     * @param array - array of VkStruct
     * @param clazzT - Class of T. Must be an VkObject class type.
     * @param structID - VkStruct ID
     * 
     * @throws IllegalArgumentException - if class is invalid, or if nativeBufferArray is null or zero capacity
     */
    public BigBuffer(VkStruct[] array, int structID) {
        this.array = array;            
        this.structID = structID;        
        singleSize = VkStruct.sizeOf(structID);
        this.elementCount = array == null ? 0 : array.length;
        this.nativeBufferArray = (array == null) ? null : ByteBuffer.allocateDirect(singleSize * elementCount);        
        if(nativeBufferArray != null){
          nativeBufferArray.order(ByteOrder.nativeOrder());
        }
        initStruct();
    }
    
    /**
     * Ctor for a native allocated buffer
     * @param nativeBuffer - Buffer allocated in native side
     * @param array - Java array to hold on VkStruct
     * @param structID - ID of Structs
     */
    public BigBuffer(ByteBuffer nativeBuffer, VkStruct[] array, int structID) {
        this.array = array;            
        this.structID = structID;        
        singleSize = VkStruct.sizeOf(structID) ;
        this.elementCount = array == null ? 0 : array.length;
        this.nativeBufferArray = nativeBuffer;        
        nativeBufferArray.order(ByteOrder.nativeOrder());       
        nativeBufferArray.rewind(); 
        initStruct();
    }
    
    /**
     * Ctor of BigBuffer for native allocated VkHandles
     * @param handleArray - array of VkHandles 
     * @param isDispatchableHandle - true if handleArray is a array of dispatchable handles.     
     */
    public BigBuffer(ByteBuffer nativeBuffer, VkHandleInterface[] handleArray, boolean isDispatchableHandle) {
        this.isHandle = true;
        this.array = handleArray;
        this.isDispatchHandle = isDispatchableHandle;
        this.elementCount = (handleArray == null) ? 0 : handleArray.length;
        singleSize = isDispatchableHandle ?  Vk10.sizeOfDispatchableHandle() 
                                           : Vk10.sizeOfNonDispatchableHandle();                               
        this.nativeBufferArray = nativeBuffer;
        nativeBufferArray.order(ByteOrder.nativeOrder());
        initHandlers();
    }
    
    /**
     * Ctor of BigBuffer for VkHandles
     * @param handleArray - array of VkHandles 
     * @param isDispatchableHandle - true if handleArray is a array of dispatchable handles.     
     */
    public BigBuffer(VkHandleInterface[] handleArray, boolean isDispatchableHandle) {
        this.isHandle = true;
        this.array = handleArray;
        this.isDispatchHandle = isDispatchableHandle;
        this.elementCount = (handleArray == null) ? 0 : handleArray.length;
        singleSize = isDispatchableHandle ?  Vk10.sizeOfDispatchableHandle() 
                                           : Vk10.sizeOfNonDispatchableHandle();                               
        this.nativeBufferArray = (handleArray == null) ? null : ByteBuffer.allocateDirect(singleSize * elementCount);
        if(nativeBufferArray != null){
            nativeBufferArray.order(ByteOrder.nativeOrder());
        }
        initHandlers();
    }
    
    
    
    /**
     * Get the address of array.
     * @return
     */
    public long getBufferAddress(){
        return Utils.getNativeAddress(nativeBufferArray);
    }
    
    /**
     * @return the nativeBufferArray
     */
    public ByteBuffer getBuffer() {
        dirty = true;
        return nativeBufferArray;
    }
    
    /**
     * @return the nativeBufferArray
     */
    public ByteBuffer getPointer() {
        dirty = true;
        return nativeBufferArray;
    }

    /**
     * @return the elementCount
     */
    public int getElementCount() {
        return elementCount;
    }
    
    /**
     * Get the i-th element in this Buffer
     * @param index - index of VkStruct or VkHandle element
     * @return a instance of type T
     * 
     * @exception ArrayIndexOutOfBoundsException - if index is out of bounds
     */
    @SuppressWarnings("unchecked")
    public T get(int index){
        if(dirty)
            update();
        return (T) array[index];
    }
    
    /**
     * Synchronizes Java side with native side.
     */
    public void update(){
        splitBufferToArray();
        dirty = false;
    }
    
    /**
     * Initialize handlers at native side, by copying already available handlers.
     */
    private void initHandlers() {
        if (!isHandle || array == null) return;
        // for handlers - only
        long[] handleAddress = VkHandle.getNativeHandlers(null, array);
        int sizeBytes = singleSize;
        nativeBufferArray.rewind();
        for (int i = 0; i < elementCount; i++) {
            if (array[i] != null) {
                int pos = i * sizeBytes;
                nativeBufferArray.limit(pos + sizeBytes);
                nativeBufferArray.position(pos);
                long addr = (array[i] == null) ? 0L : handleAddress[i];
                if (sizeBytes == 4) 
                    nativeBufferArray.putInt((int)(addr & MASK_32BIT_PTR));
                else 
                    nativeBufferArray.putLong(addr);
            }
        }// for
    }
    
    
    /**
     * Initialize Structs at native side, by copying already available structs .
     */
    private void initStruct() {
        if (isHandle || array == null) return;       
        int sizeBytes = singleSize;
        nativeBufferArray.rewind();
        for (int i = 0; i < elementCount; i++) {  
            //DO split buffer
            int pos = i * sizeBytes;
            nativeBufferArray.limit(pos + sizeBytes);
            nativeBufferArray.position(pos);
            // 
            ByteBuffer structBuffer = nativeBufferArray.slice();
            structBuffer.order(nativeBufferArray.order());            
            if (array[i] != null) {
                VkStruct struct = (VkStruct) array[i];
                ByteBuffer src = struct.getPointer();
                // copy content of src to dst
                copyBuffers(src, 0, structBuffer, 0, sizeBytes);
                // replace old buffer
                struct.setPointer(structBuffer);
                dirty = true;
            }else{
                array[i] = VkStruct.createInstance(structID, structBuffer);
            }
        }// for
    }
    
    /**
     * Split nativeBufferArray data across VkObjectArray.<br>
     * Works with both VkStruct and VkHandle. <br>
     *  Call it after a update
     *   
     * @return the list of updated objects
     * @throws UnsupportedOperationException - if StructId is unknow or invalid.  
     */
    private VkObject[] splitBufferToArray() 
    throws UnsupportedOperationException
    {
        if (array == null) 
            return array;
        int sizeBytes = singleSize;
        nativeBufferArray.rewind();
        for (int i = 0; i < elementCount; i++) {
            int pos = i * sizeBytes;
            nativeBufferArray.limit(pos + sizeBytes);
            nativeBufferArray.position(pos);
            
            if (isHandle) { // As VkHandle ////////////////////////////////////////////
                long addr = readCurrentPtrAddressAt(nativeBufferArray, sizeBytes);
                if (array[i] == null) {
                    array[i] = isDispatchHandle ? new VkHandleDispatchable(addr) : new VkHandle(addr);
                } else {
                   ((VkHandleInterface)array[i]).setPointer(addr);
                }
            } else { // as VkStruct ////////////////////////////////////////////                
                if (array[i] == null) {
                    ByteBuffer bb = nativeBufferArray.slice();
                    bb.order(ByteOrder.nativeOrder());
                    array[i] = wrapStruct(bb);
                } else {
                    // copy iff it is != buffers
                    ByteBuffer dst = array[i].getPointer();
                    // use flags[] to map remote buffer.
                    long dstAddr = bor.util.Utils.getNativeAddressAndOffset(dst);
                    long srcAddr = bor.util.Utils.getNativeAddressAndOffset(nativeBufferArray);
                    if(dstAddr != srcAddr){
                        copyBuffers(nativeBufferArray,pos, dst, 0, sizeBytes);    
                    }
                }
            }
        }
        return array;
    }
    
    /**
     * Read current C/C++ address in current position of buff.  
     * Used to build HandleArrays
     * @param buff - ByteBuffer containing adresses at current position
     * @param length - address lenght. It can be 4 or 8 bytes long.
     * @return current Address as 64 bits value.
     */
    private static long readCurrentPtrAddressAt(ByteBuffer buff, int length){
        long addr = 0;
        if(length==4){            
            int i = buff.getInt(); 
            addr = 0xFFffFFffL & i;
        }else{
            addr = buff.getLong();
        }
        return addr;
    }
    
    /**
     * Copy length bytes from buffers dst to src
     * @param src - source buffer of bytes
     * @param srcPos - initial position of source 
     * @param dst - destination buffer
     * @param destPos - position at destination
     * @param length - number of bytes to copy
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
    private VkStruct wrapStruct(ByteBuffer bb){
        VkStruct tt;    
        tt = VkStruct.createInstance(this.structID, bb);        
        if(tt == null)
            throw new UnsupportedOperationException("Failed to create instance of VkStruct with ID: " + structID);
        return tt;
    }

    /**
     * Release this structure for garbage collection.<br>
     * This bigBuffer is useless after calling this method.
     */
    public void free() {
        for (int i = 0; i < array.length; i++) {
            array[i] = null;
        }
        nativeBufferArray = null;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        final int maxLen = 20;
        return "BigBuffer [structID=" + structID + ", "
                + (nativeBufferArray != null ? "nativeBufferArray=" + nativeBufferArray + ", " : "") + "elementCount="
                + elementCount + ", singleSize=" + singleSize + ", "
                + (array != null ? "array=" + Arrays.asList(array).subList(0, Math.min(array.length, maxLen)) + ", "
                        : "")
                + "isHandle=" + isHandle + ", isDispatchHandle=" + isDispatchHandle + ", dirty=" + dirty + "]";
    }
    
    
    
}
