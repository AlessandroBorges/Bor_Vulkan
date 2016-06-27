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
 * Class to wrap Vulkan enumeration VkImageUsageFlagBits
 *
 * <h3>Prototype</h3> <pre>
 * typedef enum VkImageUsageFlagBits {
 *     VK_IMAGE_USAGE_TRANSFER_SRC_BIT = 0x00000001,
 *     VK_IMAGE_USAGE_TRANSFER_DST_BIT = 0x00000002,
 *     VK_IMAGE_USAGE_SAMPLED_BIT = 0x00000004,
 *     VK_IMAGE_USAGE_STORAGE_BIT = 0x00000008,
 *     VK_IMAGE_USAGE_COLOR_ATTACHMENT_BIT = 0x00000010,
 *     VK_IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT = 0x00000020,
 *     VK_IMAGE_USAGE_TRANSIENT_ATTACHMENT_BIT = 0x00000040,
 *     VK_IMAGE_USAGE_INPUT_ATTACHMENT_BIT = 0x00000080,
 *     VK_IMAGE_USAGE_FLAG_BITS_MAX_ENUM = 0x7FFFFFFF
 * } VkImageUsageFlagBits;
 * </pre>
 * @author Alessandro Borges
 */
public class VkImageUsageFlagBits extends IntEnum<VkImageUsageFlagBits> {


   /** class */
   private static final Class<VkImageUsageFlagBits> myClass = VkImageUsageFlagBits.class;

   /** values */
   private static VkImageUsageFlagBits[] values = new VkImageUsageFlagBits[8];

   public static final VkImageUsageFlagBits VK_IMAGE_USAGE_TRANSFER_SRC_BIT = new VkImageUsageFlagBits("VK_IMAGE_USAGE_TRANSFER_SRC_BIT", 0, 0x00000001);
   public static final VkImageUsageFlagBits VK_IMAGE_USAGE_TRANSFER_DST_BIT = new VkImageUsageFlagBits("VK_IMAGE_USAGE_TRANSFER_DST_BIT", 1, 0x00000002);
   public static final VkImageUsageFlagBits VK_IMAGE_USAGE_SAMPLED_BIT = new VkImageUsageFlagBits("VK_IMAGE_USAGE_SAMPLED_BIT", 2, 0x00000004);
   public static final VkImageUsageFlagBits VK_IMAGE_USAGE_STORAGE_BIT = new VkImageUsageFlagBits("VK_IMAGE_USAGE_STORAGE_BIT", 3, 0x00000008);
   public static final VkImageUsageFlagBits VK_IMAGE_USAGE_COLOR_ATTACHMENT_BIT = new VkImageUsageFlagBits("VK_IMAGE_USAGE_COLOR_ATTACHMENT_BIT", 4, 0x00000010);
   public static final VkImageUsageFlagBits VK_IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT = new VkImageUsageFlagBits("VK_IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT", 5, 0x00000020);
   public static final VkImageUsageFlagBits VK_IMAGE_USAGE_TRANSIENT_ATTACHMENT_BIT = new VkImageUsageFlagBits("VK_IMAGE_USAGE_TRANSIENT_ATTACHMENT_BIT", 6, 0x00000040);
   public static final VkImageUsageFlagBits VK_IMAGE_USAGE_INPUT_ATTACHMENT_BIT = new VkImageUsageFlagBits("VK_IMAGE_USAGE_INPUT_ATTACHMENT_BIT", 7, 0x00000080);
   
   /**
    * Return all values available in this enumeration
    * @return Array of avail. VkAccessFlagBits
    */
    @SuppressWarnings("unchecked")
    public static VkImageUsageFlagBits[] values(){
            return values;
    }

	/**
	 * Get class of this enumeration
	 */
    protected static Class<VkImageUsageFlagBits> myGetClass(){
        return myClass;
    }

    /**
     * Creates a bitwise ORed enumeration
     * @param bits - list of enumerations to bitwise OR 
     * @return an enumeration of ORed bits 
     */
    public static VkImageUsageFlagBits or(VkImageUsageFlagBits...bits){
        int value = bits[0].getValue();        
        for (int i=1; i<bits.length; i++) {
            VkImageUsageFlagBits item = bits[i];
            value |= item.getValue();
        } 
        String name = myGetClass().getSimpleName() + " from bitwise Operation.[" + value +"]";
        VkImageUsageFlagBits ored = new VkImageUsageFlagBits(name, -1, value);        
        return ored;
    }
    
    /**
     * Creates a enumeration of this class, if valid. 
     * If you try to create a invalid enumeration it will raise a exception.
     * @param value - a valid enumeration value or ar ORed value.
     * @return a instance of VkImageUsageFlagBits from value. NULL if it is invalid value.
     */
    public static VkImageUsageFlagBits fromValue(int value){
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
        VkImageUsageFlagBits flag = new VkImageUsageFlagBits(name, -1, value); 
        return flag;
    }
    
    /**
     * Check is a given flagA is bitwise ORed with flagB
     * @param flagA - flag to test
     * @param flagB - flag to test
     * @return true if flagA bit
     */
    public static boolean isORed(VkImageUsageFlagBits flagA, VkImageUsageFlagBits flagB){
        int valA = flagA.getValue();
        int valB = flagB.getValue();
        return (valA & valB) == valB;
    }


    /** private ctor */
    private VkImageUsageFlagBits(String name, int ordinal, int v) {
       super(name, ordinal, v);
       values[ordinal] = this;
    }

 } // end of class VkImageUsageFlagBits
