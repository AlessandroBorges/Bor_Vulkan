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
 * Class to wrap Vulkan enumeration VkFenceCreateFlagBits
 *
 * <h3>Prototype</h3> <pre>
 * typedef enum VkFenceCreateFlagBits {
 *     VK_FENCE_CREATE_SIGNALED_BIT = 0x00000001,
 *     VK_FENCE_CREATE_FLAG_BITS_MAX_ENUM = 0x7FFFFFFF
 * } VkFenceCreateFlagBits;
 * </pre>
 * @author Alessandro Borges
 */
public class VkFenceCreateFlagBits extends IntEnum<VkFenceCreateFlagBits> {


   /** class */
   private static final Class<VkFenceCreateFlagBits> myClass = VkFenceCreateFlagBits.class;

   /** values */
   private static VkFenceCreateFlagBits[] values = new VkFenceCreateFlagBits[1];

   public static final VkFenceCreateFlagBits VK_FENCE_CREATE_SIGNALED_BIT = new VkFenceCreateFlagBits("VK_FENCE_CREATE_SIGNALED_BIT", 0, 0x00000001);
   
   /**
    * Return all values available in this enumeration
    * @return Array of avail. VkAccessFlagBits
    */
    @SuppressWarnings("unchecked")
    public static VkFenceCreateFlagBits[] values(){
            return values;
    }

	/**
	 * Get class of this enumeration
	 */
    protected static Class<VkFenceCreateFlagBits> myGetClass(){
        return myClass;
    }

    /**
     * Creates a bitwise ORed enumeration
     * @param bits - list of enumerations to bitwise OR 
     * @return an enumeration of ORed bits 
     */
    public static VkFenceCreateFlagBits or(VkFenceCreateFlagBits...bits){
        int value = bits[0].getValue();        
        for (int i=1; i<bits.length; i++) {
            VkFenceCreateFlagBits item = bits[i];
            value |= item.getValue();
        } 
        String name = myGetClass().getSimpleName() + " from bitwise Operation.[" + value +"]";
        VkFenceCreateFlagBits ored = new VkFenceCreateFlagBits(name, -1, value);        
        return ored;
    }
    
    /**
     * Creates a enumeration of this class, if valid. 
     * If you try to create a invalid enumeration it will raise a exception.
     * @param value - a valid enumeration value or ar ORed value.
     * @return a instance of VkFenceCreateFlagBits from value. NULL if it is invalid value.
     */
    public static VkFenceCreateFlagBits fromValue(int value){
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
        VkFenceCreateFlagBits flag = new VkFenceCreateFlagBits(name, -1, value); 
        return flag;
    }
	
	/**
     * Creates/populates a array of VkFenceCreateFlagBits from a set of values.
     * @param dst - destination array. Can be null.
     * @param values - int[] with valid values of this enumeration.
     * @return VkFenceCreateFlagBits array with matching values
     */
    public static VkFenceCreateFlagBits[] fromValues(VkFenceCreateFlagBits[] dst, int[] values){
        if(values == null) 
               return null;
        if(dst == null || dst.length != values.length){
            dst = new VkFenceCreateFlagBits[values.length];
        }        
        for (int i = 0; i < values.length; i++) {
            int val = values[i];
            dst[i] = VkFenceCreateFlagBits.fromValue(val);
        }        
        return dst;
    }
    
    /**
     * Check is a given flagA is bitwise ORed with flagB
     * @param flagA - flag to test
     * @param flagB - flag to test
     * @return true if flagA bit
     */
    public static boolean isORed(VkFenceCreateFlagBits flagA, VkFenceCreateFlagBits flagB){
        int valA = flagA.getValue();
        int valB = flagB.getValue();
        return (valA & valB) == valB;
    }


    /** private ctor */
    private VkFenceCreateFlagBits(String name, int ordinal, int v) {
       super(name, ordinal, v);
       values[ordinal] = this;
    }

 } // end of class VkFenceCreateFlagBits
