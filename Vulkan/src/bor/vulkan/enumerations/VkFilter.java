/**
 * Bor_Vulkan Project Ver. 0.8.65 (beta)
 * Licence terms: 
 * The MIT License (MIT)
 * Copyright (c) 2016 Alessandro Borges
 * See https://opensource.org/licenses/MIT 
 */
package bor.vulkan.enumerations;

import bor.enumerable.*;

/**
 * Class to wrap Vulkan enumeration VkFilter
 *
 * <h3>Prototype</h3> <pre>
 * typedef enum VkFilter {
 *     VK_FILTER_NEAREST = 0,
 *     VK_FILTER_LINEAR = 1,
 *     VK_FILTER_CUBIC_IMG = 1000015000,
 *     VK_FILTER_BEGIN_RANGE = VK_FILTER_NEAREST,
 *     VK_FILTER_END_RANGE = VK_FILTER_LINEAR,
 *     VK_FILTER_RANGE_SIZE = (VK_FILTER_LINEAR - VK_FILTER_NEAREST + 1),
 *     VK_FILTER_MAX_ENUM = 0x7FFFFFFF
 * } VkFilter;
 * </pre>
 * @author Alessandro Borges
 */
public class VkFilter extends IntEnum<VkFilter> {


   /** class */
   private static final Class<VkFilter> myClass = VkFilter.class;

   /** values */
   private static VkFilter[] values = new VkFilter[3];

   public static final VkFilter VK_FILTER_NEAREST = new VkFilter("VK_FILTER_NEAREST", 0, 0);
   public static final VkFilter VK_FILTER_LINEAR = new VkFilter("VK_FILTER_LINEAR", 1, 1);
   public static final VkFilter VK_FILTER_CUBIC_IMG = new VkFilter("VK_FILTER_CUBIC_IMG", 2, 1000015000);
   
   /**
    * Return all values available in this enumeration
    * @return Array of avail. VkAccessFlagBits
    */
    @SuppressWarnings("unchecked")
    public static VkFilter[] values(){
            return values;
    }

	/**
	 * Get class of this enumeration
	 */
    protected static Class<VkFilter> myGetClass(){
        return myClass;
    }

    /**
     * Creates a bitwise ORed enumeration
     * @param bits - list of enumerations to bitwise OR 
     * @return an enumeration of ORed bits 
     */
    public static VkFilter or(VkFilter...bits){
        int value = bits[0].getValue();        
        for (int i=1; i<bits.length; i++) {
            VkFilter item = bits[i];
            value |= item.getValue();
        } 
        String name = myGetClass().getSimpleName() + " from bitwise Operation.[" + value +"]";
        VkFilter ored = new VkFilter(name, -1, value);        
        return ored;
    }
    
    /**
     * Creates a enumeration of this class, if valid. 
     * If you try to create a invalid enumeration it will raise a exception.
     * @param value - a valid enumeration value or ar ORed value.
     * @return a instance of VkFilter from value. NULL if it is invalid value.
     */
    public static VkFilter fromValue(int value){
        //simple case
        for (int i = 0; i < values.length; i++) {
            if(value==values[i].getValue()){
                return values[i];
            }
        }
        //ORed values        
        int test = value;
        for (int i = 0; i < values.length; i++) {
            int v = values[i].getValue();
            if((test & v) != v){
                return null;
            }
        }
        String name = myGetClass().getSimpleName() + " from value [" + value +"]";
        VkFilter flag = new VkFilter(name, -1, value); 
        return flag;
    }
	
	/**
     * Creates/populates a array of VkFilter from a set of values.
     * @param dst - destination array. Can be null.
     * @param values - int[] with valid values of this enumeration.
     * @return VkFilter array with matching values
     */
    public static VkFilter[] fromValues(VkFilter[] dst, int[] values){
        if(values == null) 
               return null;
        if(dst == null || dst.length != values.length){
            dst = new VkFilter[values.length];
        }        
        for (int i = 0; i < values.length; i++) {
            int val = values[i];
            dst[i] = VkFilter.fromValue(val);
        }        
        return dst;
    }
    
    /**
     * Check is a given flagA is bitwise ORed with flagB
     * @param flagA - flag to test
     * @param flagB - flag to test
     * @return true if flagA bit
     */
    public static boolean isORed(VkFilter flagA, VkFilter flagB){
        int valA = flagA.getValue();
        int valB = flagB.getValue();
        return (valA & valB) == valB;
    }


    /** private ctor */
    private VkFilter(String name, int ordinal, int v) {
       super(name, ordinal, v);
       values[ordinal] = this;
    }

 } // end of class VkFilter
