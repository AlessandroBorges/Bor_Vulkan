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
 * Class to wrap Vulkan enumeration VkImageCreateFlagBits
 *
 * <h3>Prototype</h3> <pre>
 * typedef enum VkImageCreateFlagBits {
 *     VK_IMAGE_CREATE_SPARSE_BINDING_BIT = 0x00000001,
 *     VK_IMAGE_CREATE_SPARSE_RESIDENCY_BIT = 0x00000002,
 *     VK_IMAGE_CREATE_SPARSE_ALIASED_BIT = 0x00000004,
 *     VK_IMAGE_CREATE_MUTABLE_FORMAT_BIT = 0x00000008,
 *     VK_IMAGE_CREATE_CUBE_COMPATIBLE_BIT = 0x00000010,
 *     VK_IMAGE_CREATE_FLAG_BITS_MAX_ENUM = 0x7FFFFFFF
 * } VkImageCreateFlagBits;
 * </pre>
 * @author Alessandro Borges
 */
public class VkImageCreateFlagBits extends IntEnum<VkImageCreateFlagBits> {


   /** class */
   private static final Class<VkImageCreateFlagBits> myClass = VkImageCreateFlagBits.class;

   /** values */
   private static VkImageCreateFlagBits[] values = new VkImageCreateFlagBits[5];

   public static final VkImageCreateFlagBits VK_IMAGE_CREATE_SPARSE_BINDING_BIT = new VkImageCreateFlagBits("VK_IMAGE_CREATE_SPARSE_BINDING_BIT", 0, 0x00000001);
   public static final VkImageCreateFlagBits VK_IMAGE_CREATE_SPARSE_RESIDENCY_BIT = new VkImageCreateFlagBits("VK_IMAGE_CREATE_SPARSE_RESIDENCY_BIT", 1, 0x00000002);
   public static final VkImageCreateFlagBits VK_IMAGE_CREATE_SPARSE_ALIASED_BIT = new VkImageCreateFlagBits("VK_IMAGE_CREATE_SPARSE_ALIASED_BIT", 2, 0x00000004);
   public static final VkImageCreateFlagBits VK_IMAGE_CREATE_MUTABLE_FORMAT_BIT = new VkImageCreateFlagBits("VK_IMAGE_CREATE_MUTABLE_FORMAT_BIT", 3, 0x00000008);
   public static final VkImageCreateFlagBits VK_IMAGE_CREATE_CUBE_COMPATIBLE_BIT = new VkImageCreateFlagBits("VK_IMAGE_CREATE_CUBE_COMPATIBLE_BIT", 4, 0x00000010);
   
   /**
    * Return all values available in this enumeration
    * @return Array of avail. VkAccessFlagBits
    */
    @SuppressWarnings("unchecked")
    public static VkImageCreateFlagBits[] values(){
            return values;
    }

	/**
	 * Get class of this enumeration
	 */
    protected static Class<VkImageCreateFlagBits> myGetClass(){
        return myClass;
    }

    /**
     * Creates a bitwise ORed enumeration
     * @param bits - list of enumerations to bitwise OR 
     * @return an enumeration of ORed bits 
     */
    public static VkImageCreateFlagBits or(VkImageCreateFlagBits...bits){
        int value = bits[0].getValue();        
        for (int i=1; i<bits.length; i++) {
            VkImageCreateFlagBits item = bits[i];
            value |= item.getValue();
        } 
        String name = myGetClass().getSimpleName() + " from bitwise Operation.[" + value +"]";
        VkImageCreateFlagBits ored = new VkImageCreateFlagBits(name, -1, value);        
        return ored;
    }
    
    /**
     * Creates a enumeration of this class, if valid. 
     * If you try to create a invalid enumeration it will raise a exception.
     * @param value - a valid enumeration value or ar ORed value.
     * @return a instance of VkImageCreateFlagBits from value. NULL if it is invalid value.
     */
    public static VkImageCreateFlagBits fromValue(int value){
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
        VkImageCreateFlagBits flag = new VkImageCreateFlagBits(name, -1, value); 
        return flag;
    }
	
	/**
     * Creates/populates a array of VkImageCreateFlagBits from a set of values.
     * @param dst - destination array. Can be null.
     * @param values - int[] with valid values of this enumeration.
     * @return VkImageCreateFlagBits array with matching values
     */
    public static VkImageCreateFlagBits[] fromValues(VkImageCreateFlagBits[] dst, int[] values){
        if(values == null) 
               return null;
        if(dst == null || dst.length != values.length){
            dst = new VkImageCreateFlagBits[values.length];
        }        
        for (int i = 0; i < values.length; i++) {
            int val = values[i];
            dst[i] = VkImageCreateFlagBits.fromValue(val);
        }        
        return dst;
    }
    
    /**
     * Check is a given flagA is bitwise ORed with flagB
     * @param flagA - flag to test
     * @param flagB - flag to test
     * @return true if flagA bit
     */
    public static boolean isORed(VkImageCreateFlagBits flagA, VkImageCreateFlagBits flagB){
        int valA = flagA.getValue();
        int valB = flagB.getValue();
        return (valA & valB) == valB;
    }


    /** private ctor */
    private VkImageCreateFlagBits(String name, int ordinal, int v) {
       super(name, ordinal, v);
       values[ordinal] = this;
    }

 } // end of class VkImageCreateFlagBits
