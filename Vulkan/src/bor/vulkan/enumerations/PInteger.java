/**
 * 
 */
package bor.vulkan.enumerations;

import java.util.Arrays;
import java.util.Iterator;

import bor.util.Pinterface;

/**
 * Wrap a int array to be read back and forth from native side.
 * @author Alessandro Borges
 *
 */
public class PInteger implements Pinterface<Integer> {

    /**
     * Values
     */
    protected int[] value = new int[1];
    
    /**
     * Creates a container with zero value 
     */
    public PInteger() {        
    }
    
    /**
     * construct a container for value val.
     * @param val
     */
    public PInteger(int val){
        value[0] = val;
    }
    
    /**
     * Construct a caontainer for int[] values.
     * Note: it uses values by reference, NOT by copy.<br>
     * Changes in values[] will affect contained values.<br>
     * call to {@link #append(Integer)} also will break the reference binding.
     *  
     * @param values - array to be contained.
     */
    public PInteger(int[] values){
        value = values;
    }

    /**
     * Set single value to be contained.
     * On multiple containement, it is the first value. 
     */
    @Override
    public void set(Integer vkObj) {
       value[0] = vkObj.intValue();        
    }

   /**
    * Append value val to this.
    */
    public PInteger append(Integer val) {
       // check();
        // do not allow simultaneous change in arr
        synchronized (value) {
            // special case after recycle.
            if(value.length==1){
                value[0] = val;
                return this;
            }            
            int curLen = value.length;
            int[] novo = new int[curLen+1];       
            System.arraycopy(value, 0, novo, 0, curLen);
            value = novo;
            value[curLen] = val;
         }        
        return this;
    }

    /**
     * get value as Integer
     */
    @Override
    public Integer get() { 
        int val = value[0];
        return Integer.valueOf(val);
    }

    /**
     * get nth contained element.
     * @throws IndexOutOfBoundsException if index < 0 or index > {@link #length()}  
     */
    @Override
    public Integer get(int index) {
        int val = value[index];
        return Integer.valueOf(val);
    }
	
	/**
	 * Used to perform brigding to JNI calls.
	 * Use with caution.
	 * @return internal backup array with stored values
	 * @see #length()
	 */
	public int[] getValues(){
	    return value;
	}

    /**
     * Length of content
     */
    @Override
    public int length() {       
        return value.length;
    }

    /**
     * Copy content to dest.<br>
     * Note: dest MUST be a Integer[], otherwise it raises a
     * IllegalArgumentException.
     * 
     * @param dest - destination
     * @return Integer[] with data.
     * 
     * @throws IllegalArgumentException - if dest is not an Integer[]
     */
    @SuppressWarnings("unchecked")
    @Override
    public <T> T[] toArray(T[] dest) {
        int size = value.length;
        if (dest.length < size ){
            // case dst as Integer[]
            if(dest instanceof Integer[]){
                Integer[] res = new Integer[size];
                for (int i = 0; i < size; i++) {
                    res[i] = value[i];
                }
                return (T[])res;
            }else{
                throw new IllegalArgumentException("argument dest ["+dest
                        +"] is not valid type for toArray(T[] dest). Use Integer[]");
            }          
        }        
        // clean dst
        for (int i = 0; i < dest.length; i++) {
            dest[i] = null;
        }        
        System.arraycopy(value, 0, dest, 0, size);        
        return dest;       
    }
    
    /**
     * Copy content to dest array.<br>
     * Note: if dest length is less than {@link #length()} 
     * then a new array with length == length() is returned.
     * 
     * @param dest - array to get a copy of internal value
     * @return
     */
    public int[] toArray(int[] dest) {
        int size = value.length;
        if(dest==null || dest.length<size){
            int[] res = new int[size];
            System.arraycopy(value, 0, res, 0, size);
            return res;
        }
        
        System.arraycopy(value, 0, dest, 0, size);
        return dest;
    }
    

    /**
     * Get Iterator
     * @return iterator
     */
    @Override
    public Iterator<Integer> iterator() {
        Integer[] array = new Integer[value.length];
        array = toArray(array);
        java.util.List<Integer> list = Arrays.asList(array);
        return list.iterator();
    }

    /**
     * release internal reference to contents, to be Garbage Collected.
     * Once you called release() you must call #recycle() to reuse this object instance.
     */
    @Override
    public void release() {
        this.value = null;
    }

    /*
     * (non-Javadoc)
     * @see bor.util.Pinterface#recycle()
     */
    @Override
    public void recycle() {
       value = new int[1];
    }
    
    /*
     * (non-Javadoc)
     * @see bor.util.Pinterface#getContent()
     */
    public int[] getContent(){
        return this.value;
    }

}
