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
 * Class to wrap Vulkan enumeration VkCommandBufferResetFlagBits
 *
 * <h3>Prototype</h3> <pre>
 * typedef enum VkCommandBufferResetFlagBits {
 *     VK_COMMAND_BUFFER_RESET_RELEASE_RESOURCES_BIT = 0x00000001,
 * } VkCommandBufferResetFlagBits;
 * </pre>
 * @author Alessandro Borges
 */
public class VkCommandBufferResetFlagBits extends IntEnum<VkCommandBufferResetFlagBits> {


   /** class */
   private static final Class<VkCommandBufferResetFlagBits> myClass = VkCommandBufferResetFlagBits.class;

   /** values */
   private static VkCommandBufferResetFlagBits[] values = new VkCommandBufferResetFlagBits[1];

   public static final VkCommandBufferResetFlagBits VK_COMMAND_BUFFER_RESET_RELEASE_RESOURCES_BIT = new VkCommandBufferResetFlagBits("VK_COMMAND_BUFFER_RESET_RELEASE_RESOURCES_BIT", 0, 0x00000001);
   
   /**
    * Return all values available in this enumeration
    * @return Array of avail. VkAccessFlagBits
    */
    @SuppressWarnings("unchecked")
    public static VkCommandBufferResetFlagBits[] values(){
            return values;
    }

	/**
	 * Get class of this enumeration
	 */
    protected static Class<VkCommandBufferResetFlagBits> myGetClass(){
        return myClass;
    }

    /**
     * Creates a bitwise ORed enumeration
     * @param bits - list of enumerations to bitwise OR 
     * @return an enumeration of ORed bits 
     */
    public static VkCommandBufferResetFlagBits or(VkCommandBufferResetFlagBits...bits){
        int value = bits[0].getValue();        
        for (int i=1; i<bits.length; i++) {
            VkCommandBufferResetFlagBits item = bits[i];
            value |= item.getValue();
        } 
        String name = myGetClass().getSimpleName() + " from bitwise Operation.[" + value +"]";
        VkCommandBufferResetFlagBits ored = new VkCommandBufferResetFlagBits(name, -1, value);        
        return ored;
    }
    
    /**
     * Creates a enumeration of this class, if valid. 
     * If you try to create a invalid enumeration it will raise a exception.
     * @param value - a valid enumeration value or ar ORed value.
     * @return a instance of VkCommandBufferResetFlagBits from value. NULL if it is invalid value.
     */
    public static VkCommandBufferResetFlagBits fromValue(int value){
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
        VkCommandBufferResetFlagBits flag = new VkCommandBufferResetFlagBits(name, -1, value); 
        return flag;
    }
    
    /**
     * Check is a given flagA is bitwise ORed with flagB
     * @param flagA - flag to test
     * @param flagB - flag to test
     * @return true if flagA bit
     */
    public static boolean isORed(VkCommandBufferResetFlagBits flagA, VkCommandBufferResetFlagBits flagB){
        int valA = flagA.getValue();
        int valB = flagB.getValue();
        return (valA & valB) == valB;
    }


    /** private ctor */
    private VkCommandBufferResetFlagBits(String name, int ordinal, int v) {
       super(name, ordinal, v);
       values[ordinal] = this;
    }

 } // end of class VkCommandBufferResetFlagBits
