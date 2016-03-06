package bor.util;

import java.util.Iterator;

import bor.vulkan.VkObject;

public interface Pinterface<T> extends Iterable<T> {

    /**
     * Set the unique or first VkObject instance to be contained.<br>
     * To retrieve this object use {@link #get()}.
     * If this container has multiple object, use {@link #append(VkObject)} 
     * and {@link #get(int)} to add and recover stored objects.  
     * 
     * @see #get()
     * @see #append(VkObject)
     * 
     * @param vkObj - unique/first object to set.
     */
    void set(T vkObj);

    /**
     * Appends another object of same type in this container.
     * 
     * @param vkObj - object to add in the end of this.
     * 
     * @return this object.
     */
   // P<E> append(E vkObj);
      Pinterface<T> append(T vkObj);
    
    /**
     * Get the unique/first element contained in this pointer.<br>
     * If it has more than a single object contained, use {@link #get(int)}
     * 
     * @see #get(int)
     * @see #length()
     * @see #append()
     * @return first/unique object contained in this.
     */
    public T get();

    /**
     * get the n-th element contained in this pointer.
     * 
     * @see #length()
     * 
     * @param index - zero based index
     * 
     * @return n-th contained elementelement 
     */
    public T get(int index);

    /**
     * Number of elements contained in this pointer.
     * 
     * @return number counting of VkObjects contained in this pointer.
     */
    public int length();

    /**
     * Copy contained elements to array dst.
     * @param dst - array to copy to.
     * @return shallow copy of contained objects
     */
    <T> T[] toArray(T[] dst);

    /**
     * Iterator.
     * This iterator is synchronized.
     * @return Iterator for contained objects
     */
    public Iterator<T> iterator();

    /**
     * Free this pointer, and make it ready to GC.
     * You plan to reuse it, please call {@link #recycle()}
     */
    void release();

    /**
     * Recycle this pointer for reuse. 
     * Currently object(s) pointed by this container will be freed for GC. 
     * 
     * @see #release()
     */
    void recycle();

   /**
    * Get the contained content. 
    * Usually it is an array of Type E
    * 
    * @return the contained objects.
    */
    public Object getContent();

}
