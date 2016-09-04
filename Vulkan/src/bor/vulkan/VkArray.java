/**
 * 
 */
package bor.vulkan;

import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

import bor.util.BigBuffer;
import bor.vulkan.structs.VkAllocationCallbacks;
import bor.vulkan.structs.VkAndroidSurfaceCreateInfoKHR;
import bor.vulkan.structs.VkApplicationInfo;
import bor.vulkan.structs.VkAttachmentDescription;
import bor.vulkan.structs.VkAttachmentReference;
import bor.vulkan.structs.VkBindSparseInfo;
import bor.vulkan.structs.VkBufferCopy;
import bor.vulkan.structs.VkBufferCreateInfo;
import bor.vulkan.structs.VkBufferImageCopy;
import bor.vulkan.structs.VkBufferMemoryBarrier;
import bor.vulkan.structs.VkBufferViewCreateInfo;
import bor.vulkan.structs.VkClearAttachment;
import bor.vulkan.structs.VkClearDepthStencilValue;
import bor.vulkan.structs.VkClearRect;
import bor.vulkan.structs.VkCommandBufferAllocateInfo;
import bor.vulkan.structs.VkStruct;

/**
 * Immutable List to hold VkStructs and VkHandles.<br>
 * To create a VkArray list, look for <b>createVkArray(int)</b> 
 *  static methods of VkStructs subclasses.<br>
 * 
 *  @see VkAllocationCallbacks#createVkArray(int) 
 *  @see VkAndroidSurfaceCreateInfoKHR#createVkArray(int)
 *  @see VkApplicationInfo#createVkArray(int)
 *  @see VkAttachmentDescription#createVkArray(int)
 *  @see VkAttachmentReference#createVkArray(int)
 *  @see VkBindSparseInfo#createVkArray(int)
 *  @see VkBufferCopy#createVkArray(int)
 *  @see VkBufferCreateInfo#createVkArray(int)
 *  @see VkBufferImageCopy#createVkArray(int)
 *  @see VkBufferMemoryBarrier#createVkArray(int)
 *  @see VkBufferViewCreateInfo#createVkArray(int)
 *  @see VkClearAttachment#createVkArray(int)
 *  @see VkClearDepthStencilValue#createVkArray(int)
 *  @see VkClearRect#createVkArray(int)
 *  @see VkCommandBufferAllocateInfo#createVkArray(int)
 *  
 *  @todo complete Javadoc list 
 *  
 * @author Alessandro Borges
 *
 */
public abstract class VkArray<E extends VkObject> implements List<E>, RandomAccess {

    /**
     * Array to store VkObject elements
     */
    protected E[] array;
    
    /**
     * BigBuffer to bridge to native side
     */
    protected BigBuffer<E> bigBuffer;
    
    /**
     * Ctor
     */
    public VkArray() {
    }

    /**
     * Updates java side with values read from native side.<br>
     * Necessary with VkHandle.
     */
    public void update(){
        bigBuffer.update();
    }
    
    /**
     * Get pointer to native data, wrapped with ByteBuffer.
     * @return ByteBuffer wrapping native pointer
     */
    public ByteBuffer getPointer(){
        return bigBuffer.getBuffer();
    }
    
    /**
     * 
     * Unsupported Operation.<br>
     * @see java.util.List#add(java.lang.Object)
     * @exception UnsupportedOperationException - this operation is not 
     * supported in this immutable List.
     */
    @Override
    public boolean add(E e) throws  UnsupportedOperationException {
        throw new UnsupportedOperationException();
    }

    /**
     * Unsupported Operation.<br>
     * @see java.util.List#remove(java.lang.Object)
     * @exception UnsupportedOperationException - this operation is not 
     * supported in this immutable List.
     */
    @Override
    public boolean remove(Object o) throws  UnsupportedOperationException {
        throw new UnsupportedOperationException();
    }

    /* (non-Javadoc)
     * @see java.util.List#containsAll(java.util.Collection)
     */
    @Override
    public boolean containsAll(Collection<?> c) {
        return Arrays.asList(array).containsAll(c);
    }

    /**
     * Unsupported Operation.<br>
     *  (non-Javadoc)
     * @see java.util.List#addAll(java.util.Collection)
     * @exception UnsupportedOperationException - this operation is not 
     * supported in this immutable List.
     */
    @Override
    public boolean addAll(Collection<? extends E> c) throws UnsupportedOperationException {
        throw new UnsupportedOperationException();
    }

    /**
     * Unsupported Operation.<br>
     *  (non-Javadoc)
     * @see java.util.List#addAll(int, java.util.Collection)
     * @exception UnsupportedOperationException - this operation is not 
     * supported in this immutable List.
     */
    @Override
    public boolean addAll(int index, Collection<? extends E> c)  throws  UnsupportedOperationException{
        throw new UnsupportedOperationException();
    }

    /**
     * Unsupported Operation.<br>
     *  (non-Javadoc)
     * @see java.util.List#removeAll(java.util.Collection)
     * @exception UnsupportedOperationException - this operation is not 
     * supported in this immutable List.
     */
    @Override
    public boolean removeAll(Collection<?> c) throws UnsupportedOperationException {
        throw new UnsupportedOperationException();
    }

    /**
     * Unsupported Operation.<br>
     *  (non-Javadoc)
     * @see java.util.List#retainAll(java.util.Collection)
     * @exception UnsupportedOperationException - this operation is not 
     * supported in this immutable List.
     */
    @Override
    public boolean retainAll(Collection<?> c) throws UnsupportedOperationException {
        throw new UnsupportedOperationException();
    }

    /**
     * Unsupported operation.<br>
     * Use free() to release memory.
     * @exception UnsupportedOperationException - this operation is not 
     * supported in this immutable List.
     * @see java.util.List#clear()
     */
    @Override
    public void clear() throws  UnsupportedOperationException {
        throw new UnsupportedOperationException();
    }

    /**
     * Get the VkStruct at index position.
     * @param index - index  of VkStruct.
     * @see java.util.List#get(int)
     */
    @Override
    public E get(int index) {
       return array[index];
    }

    /**
     * Unsupported Operation.<br>
     *  (non-Javadoc)
     * @see java.util.List#set(int, java.lang.Object)
     * @exception UnsupportedOperationException - this operation is not 
     * supported in this immutable List.
     */
    @Override
    public E set(int index, E element) throws UnsupportedOperationException {
        throw new UnsupportedOperationException();
    }

    /**
     * Unsupported Operation.
     *  (non-Javadoc)
     * @see java.util.List#add(int, java.lang.Object)
     * @exception UnsupportedOperationException - this operation is not 
     * supported in this immutable List.
     */
    @Override
    public void add(int index, E element) throws UnsupportedOperationException  {
        throw new UnsupportedOperationException();
    }

    /**
     * Unsupported Operation.
     *  (non-Javadoc)
     * @see java.util.List#remove(int)
     * @exception UnsupportedOperationException - this operation is not 
     * supported in this immutable List.
     */
    @Override
    public E remove(int index) throws UnsupportedOperationException {
        throw new UnsupportedOperationException();
    }

    /* (non-Javadoc)
     * @see java.util.List#indexOf(java.lang.Object)
     */
    @Override
    public int indexOf(Object o) {
        if(array==null)
            return -1;
        for (int i = 0; i < array.length; i++) {
            E e = array[i];
            if(e!=null && e.equals(o))
                return i;
        }
        return -1;
    }

    /* (non-Javadoc)
     * @see java.util.List#lastIndexOf(java.lang.Object)
     */
    @Override
    public int lastIndexOf(Object o) {
        if(array==null)
            return -1;
        for (int i =  array.length - 1; i >= 0; i--) {
            E e = array[i];
            if(e!=null && e.equals(o))
                return i;
        }
        return -1;
    }

    /* (non-Javadoc)
     * @see java.util.List#listIterator()
     */
    @Override
    public ListIterator<E> listIterator() {
        Arrays.asList(array).listIterator();
        return null;
    }

    /* (non-Javadoc)
     * @see java.util.List#listIterator(int)
     */
    @Override
    public ListIterator<E> listIterator(int index) {
        Arrays.asList(array).listIterator(index);
        return null;
    }

    /**
     * Unsupported Operation.<br>
     * 
     * @see java.util.List#subList(int, int)
     * @exception UnsupportedOperationException - this operation is not 
     * supported in this immutable List.
     */
    @Override
    public List<E> subList(int fromIndex, int toIndex) throws UnsupportedOperationException {
        throw new UnsupportedOperationException();
    }
    
    /**
     * Free this array, for Gargage Collection.<br>
     * This Array becomes useless after calling this method.
     * 
     */
    public void free(){
        for (int i = 0; i < array.length; i++) {
            array[i] = null;
        }
        array = null;
        bigBuffer.free();
    }

    /* (non-Javadoc)
     * @see java.util.List#size()
     */
    @Override
    public int size() {
        if(array==null)
            return 0;
        return  array.length;
    }

    /* (non-Javadoc)
     * @see java.util.List#isEmpty()
     */
    @Override
    public boolean isEmpty() {
        if(array==null || array.length == 0)
            return true;
        return false;
    }

    /* (non-Javadoc)
     * @see java.util.List#contains(java.lang.Object)
     */
    @Override
    public boolean contains(Object o) {
        if(array==null) 
            return false;
        for (int i = 0; i < array.length; i++) {
            if(array[i] != null && array[i].equals(o)){
                return true;
            }
        }
        return false;
    }

    /* (non-Javadoc)
     * @see java.util.List#iterator()
     */
    @Override
    public Iterator<E> iterator() {   
       if(array==null)
           return null;
       return Arrays.asList(array).iterator();
    }

    /* (non-Javadoc)
     * @see java.util.List#toArray()
     */
    @Override
    public Object[] toArray() { 
        if(array==null)
            return null;
        int size = size();
        return this.toArray(new VkStruct[size]);
    }

    /* (non-Javadoc)
     * @see java.util.List#toArray(java.lang.Object[])
     */
    @SuppressWarnings("unchecked")
    @Override
    public <T> T[] toArray(T[] a) {
        if(array==null)
            return null;
        int size = size();
        if (a.length < size)
            return Arrays.copyOf(this.array, size,
                                 (Class<? extends T[]>) a.getClass());
        System.arraycopy(this.array, 0, a, 0, size);
        if (a.length > size)
            a[size] = null;
        return a;
    }

}// end class

