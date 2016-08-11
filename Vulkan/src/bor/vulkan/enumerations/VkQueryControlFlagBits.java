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
 * Class to wrap Vulkan enumeration VkQueryControlFlagBits
 *
 * <h3>Prototype</h3> <pre>
 * typedef enum VkQueryControlFlagBits {
 *     VK_QUERY_CONTROL_PRECISE_BIT = 0x00000001,
 *     VK_QUERY_CONTROL_FLAG_BITS_MAX_ENUM = 0x7FFFFFFF
 * } VkQueryControlFlagBits;
 * </pre>
 * @author Alessandro Borges
 */
public class VkQueryControlFlagBits extends IntEnum<VkQueryControlFlagBits> {


   /** class */
   private static final Class<VkQueryControlFlagBits> myClass = VkQueryControlFlagBits.class;

   /** values */
   private static VkQueryControlFlagBits[] values = new VkQueryControlFlagBits[1];

   public static final VkQueryControlFlagBits VK_QUERY_CONTROL_PRECISE_BIT = new VkQueryControlFlagBits("VK_QUERY_CONTROL_PRECISE_BIT", 0, 0x00000001);
   
   /**
    * Return all values available in this enumeration
    * @return Array of avail. VkAccessFlagBits
    */
    @SuppressWarnings("unchecked")
    public static VkQueryControlFlagBits[] values(){
            return values;
    }

	/**
	 * Get class of this enumeration
	 */
    protected static Class<VkQueryControlFlagBits> myGetClass(){
        return myClass;
    }

    /**
     * Creates a bitwise ORed enumeration
     * @param bits - list of enumerations to bitwise OR 
     * @return an enumeration of ORed bits 
     */
    public static VkQueryControlFlagBits or(VkQueryControlFlagBits...bits){
        int value = bits[0].getValue();        
        for (int i=1; i<bits.length; i++) {
            VkQueryControlFlagBits item = bits[i];
            value |= item.getValue();
        } 
        String name = myGetClass().getSimpleName() + " from bitwise Operation.[" + value +"]";
        VkQueryControlFlagBits ored = new VkQueryControlFlagBits(name, -1, value);        
        return ored;
    }
    
    /**
     * Creates a enumeration of this class, if valid. 
     * If you try to create a invalid enumeration it will raise a exception.
     * @param value - a valid enumeration value or ar ORed value.
     * @return a instance of VkQueryControlFlagBits from value. NULL if it is invalid value.
     */
    public static VkQueryControlFlagBits fromValue(int value){
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
        VkQueryControlFlagBits flag = new VkQueryControlFlagBits(name, -1, value); 
        return flag;
    }
	
	/**
     * Creates/populates a array of VkQueryControlFlagBits from a set of values.
     * @param dst - destination array. Can be null.
     * @param values - int[] with valid values of this enumeration.
     * @return VkQueryControlFlagBits array with matching values
     */
    public static VkQueryControlFlagBits[] fromValues(VkQueryControlFlagBits[] dst, int[] values){
        if(values == null) 
               return null;
        if(dst == null || dst.length != values.length){
            dst = new VkQueryControlFlagBits[values.length];
        }        
        for (int i = 0; i < values.length; i++) {
            int val = values[i];
            dst[i] = VkQueryControlFlagBits.fromValue(val);
        }        
        return dst;
    }
    
    /**
     * Check is a given flagA is bitwise ORed with flagB
     * @param flagA - flag to test
     * @param flagB - flag to test
     * @return true if flagA bit
     */
    public static boolean isORed(VkQueryControlFlagBits flagA, VkQueryControlFlagBits flagB){
        int valA = flagA.getValue();
        int valB = flagB.getValue();
        return (valA & valB) == valB;
    }


    /** private ctor */
    private VkQueryControlFlagBits(String name, int ordinal, int v) {
       super(name, ordinal, v);
       values[ordinal] = this;
    }

 } // end of class VkQueryControlFlagBits
