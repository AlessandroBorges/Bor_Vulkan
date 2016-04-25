package bor.enumerable;

/**
 * Interface for bitmaskable enumerations of integer values.
 * @author Alessandro Borges
 *
 */
public interface IntEnumInterface<T> extends EnumInterface<T> {
    
    /**
     * Get value of this enumeration item
     * @return
     */
    public int getValue();
    
    /**
     * Perform logic OR operations on enumeration set 
     * @param values - values to be ORed
     * @return
     */    
    public T or(IntEnumInterface<T>... values);
    /**
     * Perform logic AND operations on enumeration set 
     * @param values - values to be ANDed
     * @return value
     */   
    public T and(IntEnumInterface<T>... values);
    
    /**
     * Perform logic OR operations on enumeration set 
     * @param values - values to be ORed
     * @return
     */   
    public T xor(IntEnumInterface... values);
    
    /**
     * Return all values of this Enumeration
     * @return
     */
   // public T[] values();
}

