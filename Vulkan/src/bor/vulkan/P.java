package bor.vulkan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.nio.*;

import bor.util.AbstractPointer;
import bor.util.Pinterface;

/**
 * Container for 
 * Used to pass a Vulkan VkObjects, as Struct or Handlers, by reference to methods. <br>
 * It intends to work like a C/C++ pointer to something, with ability to pass 
 *  objects capable of [in][out] operations.<br>
 *  
 * It replaces use of arrays when you want to get back a value returning by reference.
 * Example:
 * <pre>
 *  // C/C++ typical use
 *  int result = VkCreate(VkBuffer* pBuffer);
 *  // do dereferencing
 *  VkBuffer buffer = *pBuffer; 
 *  ...
 * 
 *  //Java
 *  // P &lt; VkBuffer &gt;  pBuffer = new P&lt; VkBuffer &gt;(); // html syntax  
 *  P<VkBuffer> pBuffer = new P<VkBuffer>(); // plain code syntax
 *  int result = VkCreate(pBuffer);
 *  VkBuffer buffer = pBuffer.get();  
 *  // or play with direct access
 *  pBuffer.objs[0]."member_of_vkBuffer" ;
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
public class P<T extends VkObject> 
 //extends AbstractPointer<T> 
 implements Pinterface<T>

{

    /**
     * Contained Object place holder
     */
    private VkObject[] objs = new VkObject[1];
    
    /**
     * Holds the class of T 
     */
     private Class<T> classofT;
    
    /**
     * Creates Container with a blank instance of type T.
     * 
     * 
     * 
     * @throws RunTimeException if wasnt possible to get 
     *  class of generic type E 
     */
    private P(){
        try {
            VkObject vkObj = getVKInstance(null);
            objs[0] = vkObj;
        } catch (Exception e) {            
            e.printStackTrace();
        }
    }
   
    /**
     * Creates a container wrapping a VkObject
     * @param vkObject - Vulkan Struct or Handler to be wrapped 
     */
    @SuppressWarnings("unchecked")
    public P(T vkObj){ 
       if (vkObj==null){
          // findClassTypeOfT();
           throw new IllegalArgumentException("vkObj must be not null.");
       }else{
           classofT = (Class<T>) vkObj.getClass();
       }
       objs[0] = vkObj;
    }
    
    /**
     * return the class of contained type T
     * @return class of contained T
     */
    public Class getClassofT(){
        return this.classofT;
    }
    
   
    
    /* (non-Javadoc)
     * @see bor.vulkan.Pinterface#set(E)
     */
    @Override
    public void set(T vkObj){
        check();
        synchronized (objs) {
            objs[0] = vkObj;  
        }        
    }
    
    /**
     * Get Bytebuffer array of enclosed VkObjects.
     *   
     * @return array of pointers from internal objects 
     */
    protected ByteBuffer[] getPointers(){
        if(objs==null) 
            return null;
        int len =  objs.length;
        ByteBuffer[] buffers = new ByteBuffer[len];
        for (int i = 0; i < len; i++) {
            buffers[i] = objs[i] == null ? null : objs[i].getPointer();
        }
        return buffers;
    }
    
    /**
     * Used for native Input/Output .<br>
     * 
     * <pre>
     *  // by using P<>, vkCommand becomes a [in][out] parameter 
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
      return this.objs;    
    }
    
    /* (non-Javadoc)
     * @see bor.vulkan.Pinterface#append(E)
     */
    @Override
    public P<T> append(T vkObj){
       check();
       // do not allow simultaneous change in arr
       synchronized (objs) {
           // special case after recycle.
           if(objs.length==1 && null==objs[0]){
               objs[0] = vkObj;
               return this;
           }
           
           int curLen = objs.length;
           VkObject[] novo = new VkObject[curLen+1];       
           System.arraycopy(objs, 0, novo, 0, curLen);
           objs = novo;
           objs[curLen] = vkObj;
        }       
       return this;
    }
   
    /* (non-Javadoc)
     * @see bor.vulkan.Pinterface#get()
     */
    @Override
    @SuppressWarnings("unchecked")
    public T get(){
        check();
        synchronized (objs) {
            return (T)this.objs[0];
        }
    }
    
    
    /**
     * 
     * @param buff
     * @param index
     * @throws Exception 
     */
    public void update(ByteBuffer buff, int index) throws Exception{
        if(0 < index || index > this.objs.length){
            throw new IllegalArgumentException("index is out of bounds:" + index);
        }
        
        if(null==objs[index]){
            objs[index] = getVKInstance(buff);
        } else{
          // unnecessary, as native will not destroy
          // pointer
        }
    }
    
    /**
     * create a instance of enclosed E VkObject 
     * @param buff - ByteBuffer to be wrapped  
     * @return new instance of E VkObbject
     * 
     * @throws Exception - if it fails to create E object
     */
    @SuppressWarnings("unchecked")
    private T getVKInstance(ByteBuffer buff) 
            throws Exception{   
        //easy way
        if(buff==null){
           VkObject obj = classofT.newInstance();
           return (T)obj;
        }
        // hard way
        Constructor<T> ctor = classofT.getDeclaredConstructor(ByteBuffer.class);
        ctor.setAccessible(true);        
        return  ctor.newInstance(buff);        
    }
    
    /* (non-Javadoc)
     * @see bor.vulkan.Pinterface#get(int)
     */
    @Override
    @SuppressWarnings("unchecked")
    public T get(int index){
        check();
        synchronized (objs) {
            return (T)this.objs[index];
        }        
    }
    
    /**
     * Sanity check
     */
    private final void check(){
        if(null==objs){
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
        return objs==null ? 0 : objs.length;
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
    protected <T> T[] asArray(){   // package private      
        return (T[])this.objs;
    }
    
    /* (non-Javadoc)
     * @see bor.vulkan.Pinterface#toArray(T[])
     */
    @Override
    @SuppressWarnings("unchecked")
    public <T> T[] toArray(T[] dst) {
        check();
        int size = objs.length;
        if (dst.length < size )
            // Make a new array of a's runtime type, but my contents:
            return (T[]) Arrays.copyOf(objs, size, dst.getClass());
        // clean dst
        for (int i = 0; i < dst.length; i++) {
            dst[i] = null;
        }        
        System.arraycopy(objs, 0, dst, 0, size);        
        return dst;
    }
    
    /* (non-Javadoc)
     * @see bor.vulkan.Pinterface#iterator()
     */
    @Override
    @SuppressWarnings("unchecked")
    public Iterator<T> iterator(){
        check();
        VkObject[] brr = null;
        synchronized (objs) {
            brr = new VkObject[objs.length];
            System.arraycopy(objs, 0, brr, 0, objs.length);
        }
        List<T> list = Arrays.asList((T[])brr);
        return list.iterator();
    }
   
    /* (non-Javadoc)
     * @see bor.vulkan.Pinterface#release()
     */
    @Override
    public final void release(){
        synchronized (objs) {
            for (int i = 0; i < objs.length; i++) {
                objs[i] = null;
            }
            objs = null;  
        }        
    }
    
    /* (non-Javadoc)
     * @see bor.vulkan.Pinterface#recycle()
     */
    @Override
    public final void recycle(){
        release();
        this.objs = new VkObject[1];
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        String className = classofT.getSimpleName();
        return "P<"+className+"> [" + 
                (objs != null ? "objs=" + Arrays.toString(objs) + ", " : "")
                +"]";
    }
    
    
    
   
}