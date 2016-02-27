/**
 * 
 */
package bor.enumerable;

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

    @Override
    public final int getValue() {       
        return value;
    }
    
    public final int getOrdinal(){
        return this.ordinal;
    }
    
    /**
     * Return all itens in this enumeration in an Array
     * @return
     */
    @SuppressWarnings("unchecked")
    public static final IntEnum[] values(){
        IntEnum[] r = new IntEnum[values.length];
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
    protected final T createNew(int param){
        try {
            T item = (T) this.getClass().newInstance();
            IntEnum<T> obj = (IntEnum<T>) item;
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
    private void addEnum(IntEnum newItem){
        IntEnum[] newArr = new IntEnum[values.length + 1];
        int i;
        for ( i=0; i<values.length; i++) {
            newArr[i] = values[i];            
        } 
        newArr[i] = (IntEnum)newItem;
        values = newArr;
    }

  
   
    
}
