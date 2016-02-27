package bor.enumerable;

/**
 * Interface for bitmaskable enumeration of long integer. 
 * @author Alessandro Borges
 *
 */
public interface LongEnumInterface<T> {
    
    /**
     * Get value of this enumeration item
     * @return
     */
    public long getValue();
    
    /**
     * Perform logic OR operations on enumeration set 
     * @param values - values to be ORed
     * @return
     */
    public T or(LongEnumInterface<T>... values);
    /**
     * Perform logic AND operations on enumeration set 
     * @param values - values to be ANDed
     * @return value
     */
    public T and(LongEnumInterface<T>... values);
    /**
     * Perform logic OR operations on enumeration set 
     * @param values - values to be ORed
     * @return
     */
    public T xor(LongEnumInterface<T>... values);
    
    /**
     * Return all values of this Enumeration
     * @return
     */
   // public T[] values();

}
