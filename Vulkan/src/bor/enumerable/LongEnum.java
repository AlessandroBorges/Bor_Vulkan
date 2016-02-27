/**
 * 
 */
package bor.enumerable;

/**
 * 
 * @author Alessandro Borges
 *
 */
public class LongEnum<T> implements LongEnumInterface<T> {

    private String name;
    private int ordinal=-1;
    private long value;
    private static LongEnum[] values = {};
    
    /**
     * Default constructor
     */
    protected LongEnum(){}
    
    /**
     * 
     * @param value
     */
    public LongEnum(int value){
        this.value = value;
    }
    
    public LongEnum(String name, int ordinal, int value){
        this.name = name;
        this.ordinal = ordinal;
        this.value = value;
        addEnum(this);
    }

    /* (non-Javadoc)
     * @see bor.bitmask.BitmaskEnumInterface#or(int[])
     */
    @Override
    public final T or(LongEnumInterface<T>... values) {        
        long res = values[0].getValue();        
        for (int i=1; i<values.length; i++) {
            LongEnumInterface item = values[i];
            res |= item.getValue();
        }        
        return createNew(res);
    }

    /* (non-Javadoc)
     * @see bor.bitmask.BitmaskEnumInterface#and(int[])
     */
    @Override
    public final T and(LongEnumInterface... values) {
        long res = values[0].getValue();        
        for (int i=1; i<values.length; i++) {
            LongEnumInterface item = values[i];
            res &= item.getValue();
        }        
        return createNew(res);
    }

    /* (non-Javadoc)
     * @see bor.bitmask.BitmaskEnumInterface#xor(int[])
     */
    @SuppressWarnings("rawtypes")
    @Override
    public final T xor(LongEnumInterface<T>... values) {        
        long res = values[0].getValue();        
        for (int i=1; i<values.length; i++) {
            LongEnumInterface item = values[i];
            res ^= item.getValue();
        }        
        return createNew(res);
    }

    @Override
    public final long getValue() {       
        return value;
    }
    
    public final int getOrdinal(){
        return this.ordinal;
    }
    
    /**
     * Return all itens in this enumeration in an Array
     * @return
     */
    public static final LongEnum[] values(){
        LongEnum[] r = new LongEnum[values.length];
        System.arraycopy(values, 0, r, 0, values.length);        
        return r;
    }
    
     
    
    /**
     * Get simple name of this class
     * @return
     */
    public final String toString(){
        return name !=null? name : this.getClass().getSimpleName()+"[generic]";
    }
    
    /**
     * Create new instance on this with value val
     * @param param - value to set
     * @return new instance of this class
     */
    @SuppressWarnings("unchecked")
    protected final T createNew(long param){
        try {
            T item = (T) this.getClass().newInstance();
            LongEnum<T> obj = (LongEnum<T>) item;
            obj.value = param;
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
    private void addEnum(LongEnum<T> newItem){
        LongEnum<T>[] newArr = new LongEnum[values.length + 1];
        int i;
        for ( i=0; i<values.length; i++) {
            newArr[i] = values[i];            
        } 
        newArr[i] = (LongEnum<T>)newItem;
        values = newArr;
    }

  
   
}
