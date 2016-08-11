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
 * Class to wrap Vulkan enumeration VkBufferCreateFlagBits
 *
 * <h3>Prototype</h3> <pre>
 * typedef enum VkBufferCreateFlagBits {
 *     VK_BUFFER_CREATE_SPARSE_BINDING_BIT = 0x00000001,
 *     VK_BUFFER_CREATE_SPARSE_RESIDENCY_BIT = 0x00000002,
 *     VK_BUFFER_CREATE_SPARSE_ALIASED_BIT = 0x00000004,
 *     VK_BUFFER_CREATE_FLAG_BITS_MAX_ENUM = 0x7FFFFFFF
 * } VkBufferCreateFlagBits;
 * </pre>
 * @author Alessandro Borges
 */
public class VkBufferCreateFlagBits extends IntEnum<VkBufferCreateFlagBits> {


   /** class */
   private static final Class<VkBufferCreateFlagBits> myClass = VkBufferCreateFlagBits.class;

   /** values */
   private static VkBufferCreateFlagBits[] values = new VkBufferCreateFlagBits[3];

   public static final VkBufferCreateFlagBits VK_BUFFER_CREATE_SPARSE_BINDING_BIT = new VkBufferCreateFlagBits("VK_BUFFER_CREATE_SPARSE_BINDING_BIT", 0, 0x00000001);
   public static final VkBufferCreateFlagBits VK_BUFFER_CREATE_SPARSE_RESIDENCY_BIT = new VkBufferCreateFlagBits("VK_BUFFER_CREATE_SPARSE_RESIDENCY_BIT", 1, 0x00000002);
   public static final VkBufferCreateFlagBits VK_BUFFER_CREATE_SPARSE_ALIASED_BIT = new VkBufferCreateFlagBits("VK_BUFFER_CREATE_SPARSE_ALIASED_BIT", 2, 0x00000004);
   
   /**
    * Return all values available in this enumeration
    * @return Array of avail. VkAccessFlagBits
    */
    @SuppressWarnings("unchecked")
    public static VkBufferCreateFlagBits[] values(){
            return values;
    }

	/**
	 * Get class of this enumeration
	 */
    protected static Class<VkBufferCreateFlagBits> myGetClass(){
        return myClass;
    }

    /**
     * Creates a bitwise ORed enumeration
     * @param bits - list of enumerations to bitwise OR 
     * @return an enumeration of ORed bits 
     */
    public static VkBufferCreateFlagBits or(VkBufferCreateFlagBits...bits){
        int value = bits[0].getValue();        
        for (int i=1; i<bits.length; i++) {
            VkBufferCreateFlagBits item = bits[i];
            value |= item.getValue();
        } 
        String name = myGetClass().getSimpleName() + " from bitwise Operation.[" + value +"]";
        VkBufferCreateFlagBits ored = new VkBufferCreateFlagBits(name, -1, value);        
        return ored;
    }
    
    /**
     * Creates a enumeration of this class, if valid. 
     * If you try to create a invalid enumeration it will raise a exception.
     * @param value - a valid enumeration value or ar ORed value.
     * @return a instance of VkBufferCreateFlagBits from value. NULL if it is invalid value.
     */
    public static VkBufferCreateFlagBits fromValue(int value){
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
        VkBufferCreateFlagBits flag = new VkBufferCreateFlagBits(name, -1, value); 
        return flag;
    }
	
	/**
     * Creates/populates a array of VkBufferCreateFlagBits from a set of values.
     * @param dst - destination array. Can be null.
     * @param values - int[] with valid values of this enumeration.
     * @return VkBufferCreateFlagBits array with matching values
     */
    public static VkBufferCreateFlagBits[] fromValues(VkBufferCreateFlagBits[] dst, int[] values){
        if(values == null) 
               return null;
        if(dst == null || dst.length != values.length){
            dst = new VkBufferCreateFlagBits[values.length];
        }        
        for (int i = 0; i < values.length; i++) {
            int val = values[i];
            dst[i] = VkBufferCreateFlagBits.fromValue(val);
        }        
        return dst;
    }
    
    /**
     * Check is a given flagA is bitwise ORed with flagB
     * @param flagA - flag to test
     * @param flagB - flag to test
     * @return true if flagA bit
     */
    public static boolean isORed(VkBufferCreateFlagBits flagA, VkBufferCreateFlagBits flagB){
        int valA = flagA.getValue();
        int valB = flagB.getValue();
        return (valA & valB) == valB;
    }


    /** private ctor */
    private VkBufferCreateFlagBits(String name, int ordinal, int v) {
       super(name, ordinal, v);
       values[ordinal] = this;
    }

 } // end of class VkBufferCreateFlagBits
