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
 * Class to wrap Vulkan enumeration VkImageAspectFlagBits
 *
 * <h3>Prototype</h3> <pre>
 * typedef enum VkImageAspectFlagBits {
 *     VK_IMAGE_ASPECT_COLOR_BIT = 0x00000001,
 *     VK_IMAGE_ASPECT_DEPTH_BIT = 0x00000002,
 *     VK_IMAGE_ASPECT_STENCIL_BIT = 0x00000004,
 *     VK_IMAGE_ASPECT_METADATA_BIT = 0x00000008,
 *     VK_IMAGE_ASPECT_FLAG_BITS_MAX_ENUM = 0x7FFFFFFF
 * } VkImageAspectFlagBits;
 * </pre>
 * @author Alessandro Borges
 */
public class VkImageAspectFlagBits extends IntEnum<VkImageAspectFlagBits> {


   /** class */
   private static final Class<VkImageAspectFlagBits> myClass = VkImageAspectFlagBits.class;

   /** values */
   private static VkImageAspectFlagBits[] values = new VkImageAspectFlagBits[4];

   public static final VkImageAspectFlagBits VK_IMAGE_ASPECT_COLOR_BIT = new VkImageAspectFlagBits("VK_IMAGE_ASPECT_COLOR_BIT", 0, 0x00000001);
   public static final VkImageAspectFlagBits VK_IMAGE_ASPECT_DEPTH_BIT = new VkImageAspectFlagBits("VK_IMAGE_ASPECT_DEPTH_BIT", 1, 0x00000002);
   public static final VkImageAspectFlagBits VK_IMAGE_ASPECT_STENCIL_BIT = new VkImageAspectFlagBits("VK_IMAGE_ASPECT_STENCIL_BIT", 2, 0x00000004);
   public static final VkImageAspectFlagBits VK_IMAGE_ASPECT_METADATA_BIT = new VkImageAspectFlagBits("VK_IMAGE_ASPECT_METADATA_BIT", 3, 0x00000008);
   
   /**
    * Return all values available in this enumeration
    * @return Array of avail. VkAccessFlagBits
    */
    @SuppressWarnings("unchecked")
    public static VkImageAspectFlagBits[] values(){
            return values;
    }

	/**
	 * Get class of this enumeration
	 */
    protected static Class<VkImageAspectFlagBits> myGetClass(){
        return myClass;
    }

    /**
     * Creates a bitwise ORed enumeration
     * @param bits - list of enumerations to bitwise OR 
     * @return an enumeration of ORed bits 
     */
    public static VkImageAspectFlagBits or(VkImageAspectFlagBits...bits){
        int value = bits[0].getValue();        
        for (int i=1; i<bits.length; i++) {
            VkImageAspectFlagBits item = bits[i];
            value |= item.getValue();
        } 
        String name = myGetClass().getSimpleName() + " from bitwise Operation.[" + value +"]";
        VkImageAspectFlagBits ored = new VkImageAspectFlagBits(name, -1, value);        
        return ored;
    }
    
    /**
     * Creates a enumeration of this class, if valid. 
     * If you try to create a invalid enumeration it will raise a exception.
     * @param value - a valid enumeration value or ar ORed value.
     * @return a instance of VkImageAspectFlagBits from value. NULL if it is invalid value.
     */
    public static VkImageAspectFlagBits fromValue(int value){
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
        VkImageAspectFlagBits flag = new VkImageAspectFlagBits(name, -1, value); 
        return flag;
    }
    
    /**
     * Check is a given flagA is bitwise ORed with flagB
     * @param flagA - flag to test
     * @param flagB - flag to test
     * @return true if flagA bit
     */
    public static boolean isORed(VkImageAspectFlagBits flagA, VkImageAspectFlagBits flagB){
        int valA = flagA.getValue();
        int valB = flagB.getValue();
        return (valA & valB) == valB;
    }


    /** private ctor */
    private VkImageAspectFlagBits(String name, int ordinal, int v) {
       super(name, ordinal, v);
       values[ordinal] = this;
    }

 } // end of class VkImageAspectFlagBits
