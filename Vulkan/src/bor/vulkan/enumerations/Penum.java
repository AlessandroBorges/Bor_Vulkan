/**
 * 
 */
package bor.vulkan.enumerations;

import bor.enumerable.IntEnum;
import bor.enumerable.IntEnumInterface;

/**
 * Container for Enumerations.
 * 
 * @author Alessandro Borges
 *
 */
public class Penum<E extends IntEnum<?>> extends PInteger {

    private IntEnum<?> type = null;
    /**
     * @param val
     */
    public Penum(E intEnum) {
        super(intEnum.getValue());
        type = intEnum;
    }

    /**
     * Get current value as a enumeration of type E.<br>
     * It may, or may not, represent multiple enumerations, so use {@link IntEnum#getEnumsByValue(Object)}
     * to get all OR'ed flags.<br>
     * 
     * You can also evaluate using {@link IntEnum#isOred(IntEnum, IntEnum)}
     * 
     * @return current Enumeration stored. It may represent a single or multiple OR'ed values. 
     */
    @SuppressWarnings({ "static-access", "unchecked" })
    public  E getEnum(){
        int val = value[0];
        // we don't know if value[0] was changed on native ops.
        // so 1st the easy way - look for exact matches
        E[] stdValues = type.values();
        for(int i=0; i<stdValues.length; i++){            
            IntEnum<E> item = (IntEnum<E>)stdValues[i];
            if(item.getValue()==val){
                return (E) item;
            }
        }
        // Exact match NOT found       
        // the hard way - check OR'ed values
        E[] enums = (E[]) type.getEnumsByValue(val);
        if(null == enums)
            return null;        
        Object obj =  type.or((IntEnumInterface<?>[])enums);        
        return (E) obj;
    }
    
}
