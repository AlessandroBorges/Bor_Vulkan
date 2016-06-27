/**
 * Bor_Vulkan Project Ver. 0.8.01 (beta)
 * Licence terms: 
 * The MIT License (MIT)
 * Copyright (c) 2016 Alessandro Borges
 * See https://opensource.org/licenses/MIT 
 */
package bor.vulkan.enumerations;

import bor.enumerable.*;

/**
 * Class to wrap Vulkan enumeration VkSampleCountFlagBits
 *
 * <h3>Prototype</h3> <pre>
 * typedef enum VkSampleCountFlagBits {
 *     VK_SAMPLE_COUNT_1_BIT = 0x00000001,
 *     VK_SAMPLE_COUNT_2_BIT = 0x00000002,
 *     VK_SAMPLE_COUNT_4_BIT = 0x00000004,
 *     VK_SAMPLE_COUNT_8_BIT = 0x00000008,
 *     VK_SAMPLE_COUNT_16_BIT = 0x00000010,
 *     VK_SAMPLE_COUNT_32_BIT = 0x00000020,
 *     VK_SAMPLE_COUNT_64_BIT = 0x00000040,
 *     VK_SAMPLE_COUNT_FLAG_BITS_MAX_ENUM = 0x7FFFFFFF
 * } VkSampleCountFlagBits;
 * </pre>
 * @author Alessandro Borges
 */
public class VkSampleCountFlagBits extends IntEnum<VkSampleCountFlagBits> {


   /** class */
   private static final Class<VkSampleCountFlagBits> myClass = VkSampleCountFlagBits.class;

   /** values */
   private static VkSampleCountFlagBits[] values = new VkSampleCountFlagBits[7];

   public static final VkSampleCountFlagBits VK_SAMPLE_COUNT_1_BIT = new VkSampleCountFlagBits("VK_SAMPLE_COUNT_1_BIT", 0, 0x00000001);
   public static final VkSampleCountFlagBits VK_SAMPLE_COUNT_2_BIT = new VkSampleCountFlagBits("VK_SAMPLE_COUNT_2_BIT", 1, 0x00000002);
   public static final VkSampleCountFlagBits VK_SAMPLE_COUNT_4_BIT = new VkSampleCountFlagBits("VK_SAMPLE_COUNT_4_BIT", 2, 0x00000004);
   public static final VkSampleCountFlagBits VK_SAMPLE_COUNT_8_BIT = new VkSampleCountFlagBits("VK_SAMPLE_COUNT_8_BIT", 3, 0x00000008);
   public static final VkSampleCountFlagBits VK_SAMPLE_COUNT_16_BIT = new VkSampleCountFlagBits("VK_SAMPLE_COUNT_16_BIT", 4, 0x00000010);
   public static final VkSampleCountFlagBits VK_SAMPLE_COUNT_32_BIT = new VkSampleCountFlagBits("VK_SAMPLE_COUNT_32_BIT", 5, 0x00000020);
   public static final VkSampleCountFlagBits VK_SAMPLE_COUNT_64_BIT = new VkSampleCountFlagBits("VK_SAMPLE_COUNT_64_BIT", 6, 0x00000040);
   
   /**
    * Return all values available in this enumeration
    * @return Array of avail. VkAccessFlagBits
    */
    @SuppressWarnings("unchecked")
    public static VkSampleCountFlagBits[] values(){
            return values;
    }

	/**
	 * Get class of this enumeration
	 */
    protected static Class<VkSampleCountFlagBits> myGetClass(){
        return myClass;
    }

    /**
     * Creates a bitwise ORed enumeration
     * @param bits - list of enumerations to bitwise OR 
     * @return an enumeration of ORed bits 
     */
    public static VkSampleCountFlagBits or(VkSampleCountFlagBits...bits){
        int value = bits[0].getValue();        
        for (int i=1; i<bits.length; i++) {
            VkSampleCountFlagBits item = bits[i];
            value |= item.getValue();
        } 
        String name = myGetClass().getSimpleName() + " from bitwise Operation.[" + value +"]";
        VkSampleCountFlagBits ored = new VkSampleCountFlagBits(name, -1, value);        
        return ored;
    }
    
    /**
     * Creates a enumeration of this class, if valid. 
     * If you try to create a invalid enumeration it will raise a exception.
     * @param value - a valid enumeration value or ar ORed value.
     * @return a instance of VkSampleCountFlagBits from value. NULL if it is invalid value.
     */
    public static VkSampleCountFlagBits fromValue(int value){
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
        VkSampleCountFlagBits flag = new VkSampleCountFlagBits(name, -1, value); 
        return flag;
    }
    
    /**
     * Check is a given flagA is bitwise ORed with flagB
     * @param flagA - flag to test
     * @param flagB - flag to test
     * @return true if flagA bit
     */
    public static boolean isORed(VkSampleCountFlagBits flagA, VkSampleCountFlagBits flagB){
        int valA = flagA.getValue();
        int valB = flagB.getValue();
        return (valA & valB) == valB;
    }


    /** private ctor */
    private VkSampleCountFlagBits(String name, int ordinal, int v) {
       super(name, ordinal, v);
       values[ordinal] = this;
    }

 } // end of class VkSampleCountFlagBits
