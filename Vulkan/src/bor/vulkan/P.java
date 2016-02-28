package bor.vulkan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import bor.util.Pinterface;

/**
 * Container to a pass Vulkan objects by reference to methods. <br>
 * It intends to work like a C/C++ pointer to something, with ability to pass .<br>
 * It replaces use of arrays when you want to get back a value returning by reference.
 * Example:
 * <pre>
 *  // C/C++ typical use
 *  int result = VkCreate(VkBuffer* pBuffer);
 *  VkBuffer buffer = *pBuffer; // dereferencing
 *  ...
 * 
 *  //Java
 *  // P<VkBuffer> pBuffer = new P<VkBuffer>(); // plain code syntax
 *  P &lt; VkBuffer &gt;  pBuffer = new P&lt; VkBuffer &gt;(); // html syntax
 *  int result = VkCreate(pBuffer);
 *  VkBuffer buffer = pBuffer.get();
 *  // or play with direct access
 *  pBuffer.obj."member_of_vkBuffer" ;
 *  </code>
 * </pre>
 *
 *  <h2>Native support</h2>
 *  Native support is intent, but using internal backup array.<br>
 *  <h2>Methods are internally synchronized.</h2>
 *  
 * @author Alessandro Borges
 *
 */
public class P<E extends VkObject> implements Iterable<E>, Pinterface<E>{

    /**
     * Contained Object place holder
     */
    private VkObject[] arr = new VkObject[1];
   
    /**
     * Creates a empty Container
     */
    public P(){     
    }
   
    /**
     * Creates a container wrapping a VkObject
     * @param obj
     */
    public P(E vkObj){
       arr[0] = vkObj;
    }
      
    /* (non-Javadoc)
     * @see bor.vulkan.Pinterface#set(E)
     */
    @Override
    public void set(E vkObj){
        check();
        synchronized (arr) {
            arr[0] = vkObj;  
        }        
    }
    
    /**
     * Used for native Input/Output .<br>
     * 
     * <pre>
     *  // by using P<>, vkCommand is a [in][out] parameter 
     *  public void invoke(P<VkStruct> vkCommand, ...){
     *      //get content
     *      VkObject[] vk = vkCommand.getContent();
     *   
     *      // do the native call
     *      nativeInvoke(vk,...);
     *      
     *      // at return, vk[] is updated, so P<VkStruct> vkCommand.  
     *  }     
     * @return the contained values.
     */
    @Override
    public VkObject[] getContent(){
      return this.arr;    
    }
    
    /* (non-Javadoc)
     * @see bor.vulkan.Pinterface#append(E)
     */
    @Override
    public P<E> append(E vkObj){
       check();
       // do not allow simultaneous change in arr
       synchronized (arr) {
           // special case after recycle.
           if(arr.length==1 && null==arr[0]){
               arr[0] = vkObj;
               return this;
           }
           
           int curLen = arr.length;
           VkObject[] novo = new VkObject[curLen+1];       
           System.arraycopy(arr, 0, novo, 0, curLen);
           arr = novo;
           arr[curLen] = vkObj;
        }
       
       return this;
    }
   
    /* (non-Javadoc)
     * @see bor.vulkan.Pinterface#get()
     */
    @Override
    @SuppressWarnings("unchecked")
    public E get(){
        check();
        synchronized (arr) {
            return (E)this.arr[0];
        }
    }
    
    /* (non-Javadoc)
     * @see bor.vulkan.Pinterface#get(int)
     */
    @Override
    @SuppressWarnings("unchecked")
    public E get(int index){
        check();
        synchronized (arr) {
            return (E)this.arr[index];
        }        
    }
    
    /**
     * Sanity check
     */
    private final void check(){
        if(null==arr){
            throw 
            new UnsupportedOperationException("This pointer is already freed. "
                         + "If you want to reuse it, please call recycle().");
        }
    }
    
    /* (non-Javadoc)
     * @see bor.vulkan.Pinterface#length()
     */
    @Override
    public int length(){
        return arr==null ? 0 : arr.length;
    }
    
   /**
    * Expose internal array.<br>
    * This is critical, because expose internal 
    * data with thread synchonization.
    * 
    * Get a shallow copy on internal data, use {@link #toArray(Object[])} <br>
    * To iterate over contents, use {@link #iterator()}
    * 
    *  @see #toArray(Object[])
    *  @see #iterator()
    *   
    * @return
    */
    @SuppressWarnings("unchecked")
    protected <E> E[] asArray(){   // package private      
        return (E[])this.arr;
    }
    
    /* (non-Javadoc)
     * @see bor.vulkan.Pinterface#toArray(T[])
     */
    @Override
    @SuppressWarnings("unchecked")
    public <T> T[] toArray(T[] dst) {
        check();
        int size = arr.length;
        if (dst.length < size )
            // Make a new array of a's runtime type, but my contents:
            return (T[]) Arrays.copyOf(arr, size, dst.getClass());
        // clean dst
        for (int i = 0; i < dst.length; i++) {
            dst[i] = null;
        }        
        System.arraycopy(arr, 0, dst, 0, size);        
        return dst;
    }
    
    /* (non-Javadoc)
     * @see bor.vulkan.Pinterface#iterator()
     */
    @Override
    @SuppressWarnings("unchecked")
    public Iterator<E> iterator(){
        check();
        VkObject[] brr = null;
        synchronized (arr) {
            brr = new VkObject[arr.length];
            System.arraycopy(arr, 0, brr, 0, arr.length);
        }
        List<E> list = Arrays.asList((E[])brr);
        return list.iterator();
    }
   
    /* (non-Javadoc)
     * @see bor.vulkan.Pinterface#release()
     */
    @Override
    public final void release(){
        synchronized (arr) {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = null;
            }
            arr = null;  
        }        
    }
    
    /* (non-Javadoc)
     * @see bor.vulkan.Pinterface#recycle()
     */
    @Override
    public final void recycle(){
        release();
        this.arr = new VkObject[1];
    }
    
   
}