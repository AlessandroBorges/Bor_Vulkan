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
 * Class to wrap Vulkan enumeration VkSparseImageFormatFlagBits
 *
 * <h3>Prototype</h3> <pre>
 * typedef enum VkSparseImageFormatFlagBits {
 *     VK_SPARSE_IMAGE_FORMAT_SINGLE_MIPTAIL_BIT = 0x00000001,
 *     VK_SPARSE_IMAGE_FORMAT_ALIGNED_MIP_SIZE_BIT = 0x00000002,
 *     VK_SPARSE_IMAGE_FORMAT_NONSTANDARD_BLOCK_SIZE_BIT = 0x00000004,
 *     VK_SPARSE_IMAGE_FORMAT_FLAG_BITS_MAX_ENUM = 0x7FFFFFFF
 * } VkSparseImageFormatFlagBits;
 * </pre>
 * @author Alessandro Borges
 */
public class VkSparseImageFormatFlagBits extends IntEnum<VkSparseImageFormatFlagBits> {


   /** class */
   private static final Class<VkSparseImageFormatFlagBits> myClass = VkSparseImageFormatFlagBits.class;

   /** values */
   private static VkSparseImageFormatFlagBits[] values = new VkSparseImageFormatFlagBits[3];

   public static final VkSparseImageFormatFlagBits VK_SPARSE_IMAGE_FORMAT_SINGLE_MIPTAIL_BIT = new VkSparseImageFormatFlagBits("VK_SPARSE_IMAGE_FORMAT_SINGLE_MIPTAIL_BIT", 0, 0x00000001);
   public static final VkSparseImageFormatFlagBits VK_SPARSE_IMAGE_FORMAT_ALIGNED_MIP_SIZE_BIT = new VkSparseImageFormatFlagBits("VK_SPARSE_IMAGE_FORMAT_ALIGNED_MIP_SIZE_BIT", 1, 0x00000002);
   public static final VkSparseImageFormatFlagBits VK_SPARSE_IMAGE_FORMAT_NONSTANDARD_BLOCK_SIZE_BIT = new VkSparseImageFormatFlagBits("VK_SPARSE_IMAGE_FORMAT_NONSTANDARD_BLOCK_SIZE_BIT", 2, 0x00000004);
   
   /**
    * Return all values available in this enumeration
    * @return Array of avail. VkAccessFlagBits
    */
    @SuppressWarnings("unchecked")
    public static VkSparseImageFormatFlagBits[] values(){
            return values;
    }

	/**
	 * Get class of this enumeration
	 */
    protected static Class<VkSparseImageFormatFlagBits> myGetClass(){
        return myClass;
    }

    /**
     * Creates a bitwise ORed enumeration
     * @param bits - list of enumerations to bitwise OR 
     * @return an enumeration of ORed bits 
     */
    public static VkSparseImageFormatFlagBits or(VkSparseImageFormatFlagBits...bits){
        int value = bits[0].getValue();        
        for (int i=1; i<bits.length; i++) {
            VkSparseImageFormatFlagBits item = bits[i];
            value |= item.getValue();
        } 
        String name = myGetClass().getSimpleName() + " from bitwise Operation.[" + value +"]";
        VkSparseImageFormatFlagBits ored = new VkSparseImageFormatFlagBits(name, -1, value);        
        return ored;
    }
    
    /**
     * Creates a enumeration of this class, if valid. 
     * If you try to create a invalid enumeration it will raise a exception.
     * @param value - a valid enumeration value or ar ORed value.
     * @return a instance of VkSparseImageFormatFlagBits from value. NULL if it is invalid value.
     */
    public static VkSparseImageFormatFlagBits fromValue(int value){
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
        VkSparseImageFormatFlagBits flag = new VkSparseImageFormatFlagBits(name, -1, value); 
        return flag;
    }
    
    /**
     * Check is a given flagA is bitwise ORed with flagB
     * @param flagA - flag to test
     * @param flagB - flag to test
     * @return true if flagA bit
     */
    public static boolean isORed(VkSparseImageFormatFlagBits flagA, VkSparseImageFormatFlagBits flagB){
        int valA = flagA.getValue();
        int valB = flagB.getValue();
        return (valA & valB) == valB;
    }


    /** private ctor */
    private VkSparseImageFormatFlagBits(String name, int ordinal, int v) {
       super(name, ordinal, v);
       values[ordinal] = this;
    }

 } // end of class VkSparseImageFormatFlagBits
