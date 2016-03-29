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
 * Class to wrap Vulkan enumeration VkImageLayout
 *
 * <h3>Prototype</h3> <pre>
 * typedef enum VkImageLayout {
 *     VK_IMAGE_LAYOUT_UNDEFINED = 0,
 *     VK_IMAGE_LAYOUT_GENERAL = 1,
 *     VK_IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL = 2,
 *     VK_IMAGE_LAYOUT_DEPTH_STENCIL_ATTACHMENT_OPTIMAL = 3,
 *     VK_IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL = 4,
 *     VK_IMAGE_LAYOUT_SHADER_READ_ONLY_OPTIMAL = 5,
 *     VK_IMAGE_LAYOUT_TRANSFER_SRC_OPTIMAL = 6,
 *     VK_IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL = 7,
 *     VK_IMAGE_LAYOUT_PREINITIALIZED = 8,
 *     VK_IMAGE_LAYOUT_PRESENT_SRC_KHR = 1000001002,
 *     VK_IMAGE_LAYOUT_BEGIN_RANGE = VK_IMAGE_LAYOUT_UNDEFINED,
 *     VK_IMAGE_LAYOUT_END_RANGE = VK_IMAGE_LAYOUT_PREINITIALIZED,
 *     VK_IMAGE_LAYOUT_RANGE_SIZE = (VK_IMAGE_LAYOUT_PREINITIALIZED - VK_IMAGE_LAYOUT_UNDEFINED + 1),
 *     VK_IMAGE_LAYOUT_MAX_ENUM = 0x7FFFFFFF
 * } VkImageLayout;
 * </pre>
 * @author Alessandro Borges
 */
public class VkImageLayout extends IntEnum<VkImageLayout> {


   /** class */
   private static final Class<VkImageLayout> myClass = VkImageLayout.class;

   /** values */
   private static VkImageLayout[] values = new VkImageLayout[10];

   public static final VkImageLayout VK_IMAGE_LAYOUT_UNDEFINED = new VkImageLayout("VK_IMAGE_LAYOUT_UNDEFINED", 0, 0);
   public static final VkImageLayout VK_IMAGE_LAYOUT_GENERAL = new VkImageLayout("VK_IMAGE_LAYOUT_GENERAL", 1, 1);
   public static final VkImageLayout VK_IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL = new VkImageLayout("VK_IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL", 2, 2);
   public static final VkImageLayout VK_IMAGE_LAYOUT_DEPTH_STENCIL_ATTACHMENT_OPTIMAL = new VkImageLayout("VK_IMAGE_LAYOUT_DEPTH_STENCIL_ATTACHMENT_OPTIMAL", 3, 3);
   public static final VkImageLayout VK_IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL = new VkImageLayout("VK_IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL", 4, 4);
   public static final VkImageLayout VK_IMAGE_LAYOUT_SHADER_READ_ONLY_OPTIMAL = new VkImageLayout("VK_IMAGE_LAYOUT_SHADER_READ_ONLY_OPTIMAL", 5, 5);
   public static final VkImageLayout VK_IMAGE_LAYOUT_TRANSFER_SRC_OPTIMAL = new VkImageLayout("VK_IMAGE_LAYOUT_TRANSFER_SRC_OPTIMAL", 6, 6);
   public static final VkImageLayout VK_IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL = new VkImageLayout("VK_IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL", 7, 7);
   public static final VkImageLayout VK_IMAGE_LAYOUT_PREINITIALIZED = new VkImageLayout("VK_IMAGE_LAYOUT_PREINITIALIZED", 8, 8);
   public static final VkImageLayout VK_IMAGE_LAYOUT_PRESENT_SRC_KHR = new VkImageLayout("VK_IMAGE_LAYOUT_PRESENT_SRC_KHR", 9, 1000001002);
   
   /**
    * Return all values available in this enumeration
    * @return Array of avail. VkAccessFlagBits
    */
    @SuppressWarnings("unchecked")
    public static VkImageLayout[] values(){
            return values;
    }

	/**
	 * Get class of this enumeration
	 */
    protected static Class<VkImageLayout> myGetClass(){
        return myClass;
    }

    /**
     * Creates a bitwise ORed enumeration
     * @param bits - list of enumerations to bitwise OR 
     * @return an enumeration of ORed bits 
     */
    public static VkImageLayout or(VkImageLayout...bits){
        int value = bits[0].getValue();        
        for (int i=1; i<bits.length; i++) {
            VkImageLayout item = bits[i];
            value |= item.getValue();
        } 
        String name = myGetClass().getSimpleName() + " from bitwise Operation.[" + value +"]";
        VkImageLayout ored = new VkImageLayout(name, -1, value);        
        return ored;
    }
    
    /**
     * Creates a enumeration of this class, if valid. 
     * If you try to create a invalid enumeration it will raise a exception.
     * @param value - a valid enumeration value or ar ORed value.
     * @return a instance of VkImageLayout from value. NULL if it is invalid value.
     */
    public static VkImageLayout fromValue(int value){
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
        VkImageLayout flag = new VkImageLayout(name, -1, value); 
        return flag;
    }
    
    /**
     * Check is a given flagA is bitwise ORed with flagB
     * @param flagA - flag to test
     * @param flagB - flag to test
     * @return true if flagA bit
     */
    public static boolean isORed(VkImageLayout flagA, VkImageLayout flagB){
        int valA = flagA.getValue();
        int valB = flagB.getValue();
        return (valA & valB) == valB;
    }


    /** private ctor */
    private VkImageLayout(String name, int ordinal, int v) {
       super(name, ordinal, v);
       values[ordinal] = this;
    }

 } // end of class VkImageLayout
