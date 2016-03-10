/**
 * 
 */
package bor.enumerable;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @author Alessandro Borges
 *
 */
@SuppressWarnings("rawtypes")
public class IntEnum<T> implements IntEnumInterface<T> {
    
    private String name;
    private int ordinal=-1;
    private int value;
    private static IntEnum[] values = {};
    
    /**
     * Default constructor
     */
    protected IntEnum(){}
    
    /**
     * 
     * @param value
     */
    public IntEnum(int value){
        this.value = value;
    }
    
    public IntEnum(String name, int ordinal, int value){
        this.name = name;
        this.ordinal = ordinal;
        this.value = value;
        addEnum(this);
    }

    /* (non-Javadoc)
     * @see bor.bitmask.BitmaskEnumInterface#or(int[])
     */
    @Override
    public final T or(IntEnumInterface... values) {        
        int res = values[0].getValue();        
        for (int i=1; i<values.length; i++) {
            IntEnumInterface item = values[i];
            res |= item.getValue();
        }        
        return createNew(res);
    }

    /* (non-Javadoc)
     * @see bor.bitmask.BitmaskEnumInterface#and(int[])
     */
    @Override
    public final T and(IntEnumInterface... values) {
        int res = values[0].getValue();        
        for (int i=1; i<values.length; i++) {
            IntEnumInterface item = values[i];
            res &= item.getValue();
        }        
        return createNew(res);
    }

    /* (non-Javadoc)
     * @see bor.bitmask.BitmaskEnumInterface#xor(int[])
     */
    @SuppressWarnings("rawtypes")
    @Override
    public final T xor(IntEnumInterface... values) {        
        int res = values[0].getValue();        
        for (int i=1; i<values.length; i++) {
            IntEnumInterface item = values[i];
            res ^= item.getValue();
        }        
        return createNew(res);
    }

    /**
     * Get value of this enumeration
     */
    @Override
    public final int getValue() {       
        return value;
    }
    
    /**
     * Get ordinal order of this enumeration
     * @return
     */
    public final int getOrdinal(){
        return this.ordinal;
    }
    
    /**
     * Return all itens in this enumeration in an Array
     * @return
     */
    @SuppressWarnings("unchecked")
    public static final <E> E[] values(){
        int length = values.length;
        IntEnum one = values[0];
        Class myType = one.getClass();
        
        E[] r = ((Object)myType == (Object)Object[].class)
                ? (E[]) new Object[length]
                : (E[]) Array.newInstance(myType.getComponentType(), length);
       
        System.arraycopy(values, 0, r, 0, values.length);        
        return r;
    }
    
    /**
     * <pre>
     *  Get unique enumeration by value.
     * </pre>
     * @param val - internal value of enumeration
     * @return return exact the enumeration with the value val, or 
     *  null if there is no matching  enumeration. 
     */
    public <E> E getEnumByValue(int val){
        int len = values.length;
        for(int i = 0; i<len; i++){
            IntEnum ie = values[i];
            int ieVal = ie.value;
            if(ieVal==val){
                return (E) ie;
            }
        }
        return null;
    }
    
    /**
     * <pre>
     * Get a valid enumeration itens flagged in flag parameter.
     * Notes:
     *  <b>return null if flag is not a valid OR'ed value of this enumeration.</b>
     * </pre>
     * 
     * @param flag - value matching one or several Or'ed enum belonging this enumeration.
     *  
     * @return array of Enum flagged in flags. return null if flag do not 
     * contains valid values of this enumeration  
     */
    @SuppressWarnings("unchecked")
    public <E> E[] getEnumsByValue(int flag){
        List<IntEnum> list = new java.util.ArrayList<IntEnum>();
        int len = values.length;
        
        for(int i = 0; i<len; i++){
            IntEnum ie = values[i];
            int ieVal = ie.value;
            if(ieVal==flag || isOred(flag,ieVal)){
                list.add(ie);
            }else{
                String name = this.getClass().getSimpleName();
                Exception exc = 
                        new IllegalArgumentException("Argument value "
                        + "is not a valid OR'ed value for this enum "
                        + name);
                exc.printStackTrace();
                return null;
            }
        }
        
        int length = values.length;        
        Class myType = this.getClass();
        
        E[] array = ((Object)myType == (Object)Object[].class)
                   ? (E[]) new Object[length]
                   : (E[]) Array.newInstance(myType.getComponentType(), length);
       
        return list.toArray(array);
    }
    
    /**
     * Get Ored 
     * @param oredEnumeration
     * @return
     */
    public <E> E[] getEnumsByValue(E oredEnumeration){
        
        return null;    
       }
    
    /**
     * <pre>
     * Return true IFF a contains bits flagged by b.
     * Same as: 
     *  <b> (a & b) == b</b>
     *  
     *  </pre>
     * @param a - ORed value 
     * @param b - mask to test
     * @return true if 
     */
    protected static final boolean isOred(int a, int b){
        return (a==b) || ((a & b)==b);
    }
    
    
    /**
     * Evaluate if enumeration enumA is flagged with enumB.   
     * @param enumA - OR'ed enumeration
     * @param enumB - mask to test if enumA is OR'ed with enumB
     * @return true if enumA and enumB are not null, 
     * the same type and enumA is bit flagged by enumB. 
     */
    public static final boolean isOred(IntEnum<?> enumA, IntEnum<?> enumB){
        if(enumA==enumB) return true;
        if(enumA==null || enumB==null || enumA.getClass() != enumB.getClass())
            return false;
        
        return isOred(enumA.value, enumB.value);
    }
     
    
    /**
     * Get simple name of this class
     * @return
     */
    public final String toString(){
        return name !=null? name : this.getClass().getSimpleName()+"[generic]";
    }
    
    /**
     * Create new instance on this with value val.
     * This new Enumeration is not added to values.
     * 
     * @param param - value to set
     * @return new instance of this class
     */
    @SuppressWarnings("unchecked")
    protected final T createNew(int param){
        try {
            T item = (T) this.getClass().newInstance();
            IntEnum<T> obj = (IntEnum<T>) item;
            obj.value = param;
            obj.ordinal = -1;
            obj.name = this.getClass().getSimpleName() + " from bitwise Operation.[" + param +"]";
            return item;
            
        } catch (Exception e){           
            e.printStackTrace();
            return null;
        }
    }
    
    /**
     * Add a new item to this ordinal enumeration
     * @param newItem
     */
    private void addEnum(IntEnum newItem){
        IntEnum[] newArr = new IntEnum[values.length + 1];
        int i;
        for ( i=0; i<values.length; i++) {
            newArr[i] = values[i];            
        } 
        newArr[i] = (IntEnum)newItem;
        values = newArr;
    }

    /**
     * Returns an iterator over a set of elements of this enumeration.
     * @return Iterator for this enumeration.
     */
    public Iterator<T> iterator(){
        Class cl = this.getClass();
        T[] array = (T[])Array.newInstance(cl, values.length);        
        List<T> list = Arrays.asList(array);
        return list.iterator();
    }
   
    
}
