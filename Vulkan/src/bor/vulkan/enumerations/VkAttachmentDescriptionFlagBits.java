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
 * Class to wrap Vulkan enumeration VkAttachmentDescriptionFlagBits
 *
 * <h3>Prototype</h3> <pre>
 * typedef enum VkAttachmentDescriptionFlagBits {
 *     VK_ATTACHMENT_DESCRIPTION_MAY_ALIAS_BIT = 0x00000001,
 *     VK_ATTACHMENT_DESCRIPTION_FLAG_BITS_MAX_ENUM = 0x7FFFFFFF
 * } VkAttachmentDescriptionFlagBits;
 * </pre>
 * @author Alessandro Borges
 */
public class VkAttachmentDescriptionFlagBits extends IntEnum<VkAttachmentDescriptionFlagBits> {


   /** class */
   private static final Class<VkAttachmentDescriptionFlagBits> myClass = VkAttachmentDescriptionFlagBits.class;

   /** values */
   private static VkAttachmentDescriptionFlagBits[] values = new VkAttachmentDescriptionFlagBits[1];

   public static final VkAttachmentDescriptionFlagBits VK_ATTACHMENT_DESCRIPTION_MAY_ALIAS_BIT = new VkAttachmentDescriptionFlagBits("VK_ATTACHMENT_DESCRIPTION_MAY_ALIAS_BIT", 0, 0x00000001);
   
   /**
    * Return all values available in this enumeration
    * @return Array of avail. VkAccessFlagBits
    */
    @SuppressWarnings("unchecked")
    public static VkAttachmentDescriptionFlagBits[] values(){
            return values;
    }

	/**
	 * Get class of this enumeration
	 */
    protected static Class<VkAttachmentDescriptionFlagBits> myGetClass(){
        return myClass;
    }

    /**
     * Creates a bitwise ORed enumeration
     * @param bits - list of enumerations to bitwise OR 
     * @return an enumeration of ORed bits 
     */
    public static VkAttachmentDescriptionFlagBits or(VkAttachmentDescriptionFlagBits...bits){
        int value = bits[0].getValue();        
        for (int i=1; i<bits.length; i++) {
            VkAttachmentDescriptionFlagBits item = bits[i];
            value |= item.getValue();
        } 
        String name = myGetClass().getSimpleName() + " from bitwise Operation.[" + value +"]";
        VkAttachmentDescriptionFlagBits ored = new VkAttachmentDescriptionFlagBits(name, -1, value);        
        return ored;
    }
    
    /**
     * Creates a enumeration of this class, if valid. 
     * If you try to create a invalid enumeration it will raise a exception.
     * @param value - a valid enumeration value or ar ORed value.
     * @return a instance of VkAttachmentDescriptionFlagBits from value. NULL if it is invalid value.
     */
    public static VkAttachmentDescriptionFlagBits fromValue(int value){
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
        VkAttachmentDescriptionFlagBits flag = new VkAttachmentDescriptionFlagBits(name, -1, value); 
        return flag;
    }
    
    /**
     * Check is a given flagA is bitwise ORed with flagB
     * @param flagA - flag to test
     * @param flagB - flag to test
     * @return true if flagA bit
     */
    public static boolean isORed(VkAttachmentDescriptionFlagBits flagA, VkAttachmentDescriptionFlagBits flagB){
        int valA = flagA.getValue();
        int valB = flagB.getValue();
        return (valA & valB) == valB;
    }


    /** private ctor */
    private VkAttachmentDescriptionFlagBits(String name, int ordinal, int v) {
       super(name, ordinal, v);
       values[ordinal] = this;
    }

 } // end of class VkAttachmentDescriptionFlagBits
