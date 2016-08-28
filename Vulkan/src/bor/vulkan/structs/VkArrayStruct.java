/**
 * 
 */
package bor.vulkan.structs;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import bor.util.BigBuffer;
import bor.vulkan.VkArray;

/**
 * Immutable List of VkStructs.
 * @author Alessandro Borges
 *
 */
class  VkArrayStruct<E extends VkStruct> 
    extends VkArray<E> {

    /**
     * Array to store Structs
     */
    private E[] array;
    
    
    /**
     * Creates a ArrayStruct
     * @param array
     * @param structID
     */
    protected VkArrayStruct(E[] array, int structID) {
       this.array = array; 
       this.bigBuffer = new BigBuffer<E>(array, structID);
       this.bigBuffer.update();
    }
    
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
        return array.length;
    }

    /* (non-Javadoc)
     * @see java.util.List#isEmpty()
     */
    @Override
    public boolean isEmpty() {       
        return false;
    }

    /* (non-Javadoc)
     * @see java.util.List#contains(java.lang.Object)
     */
    @Override
    public boolean contains(Object o) {
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
       return Arrays.asList(array).iterator();
    }

    /* (non-Javadoc)
     * @see java.util.List#toArray()
     */
    @Override
    public Object[] toArray() {  
        int size = size();
        return this.toArray(new VkStruct[size]);
    }

    /* (non-Javadoc)
     * @see java.util.List#toArray(java.lang.Object[])
     */
    @Override
    public <T> T[] toArray(T[] a) {
        int size = size();
        if (a.length < size)
            return Arrays.copyOf(this.array, size,
                                 (Class<? extends T[]>) a.getClass());
        System.arraycopy(this.array, 0, a, 0, size);
        if (a.length > size)
            a[size] = null;
        return a;
    }

    /**
     * 
     *  Unsupported Operation.<br>
     * @see java.util.List#add(java.lang.Object)
     */
    @Override
    public boolean add(E e) {
        throw new UnsupportedOperationException();
    }

    /**
     * Unsupported Operation.<br>
     * @see java.util.List#remove(java.lang.Object)
     */
    @Override
    public boolean remove(Object o) {
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
     */
    @Override
    public boolean addAll(Collection<? extends E> c) {
        throw new UnsupportedOperationException();
    }

    /**
     * Unsupported Operation.<br>
     *  (non-Javadoc)
     * @see java.util.List#addAll(int, java.util.Collection)
     */
    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        throw new UnsupportedOperationException();
    }

    /**
     * Unsupported Operation.<br>
     *  (non-Javadoc)
     * @see java.util.List#removeAll(java.util.Collection)
     */
    @Override
    public boolean removeAll(Collection<?> c) {
        throw new UnsupportedOperationException();
    }

    /**
     * Unsupported Operation.<br>
     *  (non-Javadoc)
     * @see java.util.List#retainAll(java.util.Collection)
     */
    @Override
    public boolean retainAll(Collection<?> c) {
        throw new UnsupportedOperationException();
    }

    /**
     * Unsupported operation.<br>
     * Use free() to release memory 
     *  (non-Javadoc)
     * @see java.util.List#clear()
     */
    @Override
    public void clear() {
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
     */
    @Override
    public E set(int index, E element) {
        throw new UnsupportedOperationException();
    }

    /**
     * Unsupported Operation.
     *  (non-Javadoc)
     * @see java.util.List#add(int, java.lang.Object)
     */
    @Override
    public void add(int index, E element) {
        throw new UnsupportedOperationException();
    }

    /**
     * Unsupported Operation.
     *  (non-Javadoc)
     * @see java.util.List#remove(int)
     */
    @Override
    public E remove(int index) {
        throw new UnsupportedOperationException();
    }

    /* (non-Javadoc)
     * @see java.util.List#indexOf(java.lang.Object)
     */
    @Override
    public int indexOf(Object o) {
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
     */
    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException();
    }
}
