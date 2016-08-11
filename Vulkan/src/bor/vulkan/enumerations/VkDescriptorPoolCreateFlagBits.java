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
 * Class to wrap Vulkan enumeration VkDescriptorPoolCreateFlagBits
 *
 * <h3>Prototype</h3> <pre>
 * typedef enum VkDescriptorPoolCreateFlagBits {
 *     VK_DESCRIPTOR_POOL_CREATE_FREE_DESCRIPTOR_SET_BIT = 0x00000001,
 *     VK_DESCRIPTOR_POOL_CREATE_FLAG_BITS_MAX_ENUM = 0x7FFFFFFF
 * } VkDescriptorPoolCreateFlagBits;
 * </pre>
 * @author Alessandro Borges
 */
public class VkDescriptorPoolCreateFlagBits extends IntEnum<VkDescriptorPoolCreateFlagBits> {


   /** class */
   private static final Class<VkDescriptorPoolCreateFlagBits> myClass = VkDescriptorPoolCreateFlagBits.class;

   /** values */
   private static VkDescriptorPoolCreateFlagBits[] values = new VkDescriptorPoolCreateFlagBits[1];

   public static final VkDescriptorPoolCreateFlagBits VK_DESCRIPTOR_POOL_CREATE_FREE_DESCRIPTOR_SET_BIT = new VkDescriptorPoolCreateFlagBits("VK_DESCRIPTOR_POOL_CREATE_FREE_DESCRIPTOR_SET_BIT", 0, 0x00000001);
   
   /**
    * Return all values available in this enumeration
    * @return Array of avail. VkAccessFlagBits
    */
    @SuppressWarnings("unchecked")
    public static VkDescriptorPoolCreateFlagBits[] values(){
            return values;
    }

	/**
	 * Get class of this enumeration
	 */
    protected static Class<VkDescriptorPoolCreateFlagBits> myGetClass(){
        return myClass;
    }

    /**
     * Creates a bitwise ORed enumeration
     * @param bits - list of enumerations to bitwise OR 
     * @return an enumeration of ORed bits 
     */
    public static VkDescriptorPoolCreateFlagBits or(VkDescriptorPoolCreateFlagBits...bits){
        int value = bits[0].getValue();        
        for (int i=1; i<bits.length; i++) {
            VkDescriptorPoolCreateFlagBits item = bits[i];
            value |= item.getValue();
        } 
        String name = myGetClass().getSimpleName() + " from bitwise Operation.[" + value +"]";
        VkDescriptorPoolCreateFlagBits ored = new VkDescriptorPoolCreateFlagBits(name, -1, value);        
        return ored;
    }
    
    /**
     * Creates a enumeration of this class, if valid. 
     * If you try to create a invalid enumeration it will raise a exception.
     * @param value - a valid enumeration value or ar ORed value.
     * @return a instance of VkDescriptorPoolCreateFlagBits from value. NULL if it is invalid value.
     */
    public static VkDescriptorPoolCreateFlagBits fromValue(int value){
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
        VkDescriptorPoolCreateFlagBits flag = new VkDescriptorPoolCreateFlagBits(name, -1, value); 
        return flag;
    }
	
	/**
     * Creates/populates a array of VkDescriptorPoolCreateFlagBits from a set of values.
     * @param dst - destination array. Can be null.
     * @param values - int[] with valid values of this enumeration.
     * @return VkDescriptorPoolCreateFlagBits array with matching values
     */
    public static VkDescriptorPoolCreateFlagBits[] fromValues(VkDescriptorPoolCreateFlagBits[] dst, int[] values){
        if(values == null) 
               return null;
        if(dst == null || dst.length != values.length){
            dst = new VkDescriptorPoolCreateFlagBits[values.length];
        }        
        for (int i = 0; i < values.length; i++) {
            int val = values[i];
            dst[i] = VkDescriptorPoolCreateFlagBits.fromValue(val);
        }        
        return dst;
    }
    
    /**
     * Check is a given flagA is bitwise ORed with flagB
     * @param flagA - flag to test
     * @param flagB - flag to test
     * @return true if flagA bit
     */
    public static boolean isORed(VkDescriptorPoolCreateFlagBits flagA, VkDescriptorPoolCreateFlagBits flagB){
        int valA = flagA.getValue();
        int valB = flagB.getValue();
        return (valA & valB) == valB;
    }


    /** private ctor */
    private VkDescriptorPoolCreateFlagBits(String name, int ordinal, int v) {
       super(name, ordinal, v);
       values[ordinal] = this;
    }

 } // end of class VkDescriptorPoolCreateFlagBits
