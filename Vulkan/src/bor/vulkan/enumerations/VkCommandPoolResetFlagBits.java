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
 * Class to wrap Vulkan enumeration VkCommandPoolResetFlagBits
 *
 * <h3>Prototype</h3> <pre>
 * typedef enum VkCommandPoolResetFlagBits {
 *     VK_COMMAND_POOL_RESET_RELEASE_RESOURCES_BIT = 0x00000001,
 *     VK_COMMAND_POOL_RESET_FLAG_BITS_MAX_ENUM = 0x7FFFFFFF
 * } VkCommandPoolResetFlagBits;
 * </pre>
 * @author Alessandro Borges
 */
public class VkCommandPoolResetFlagBits extends IntEnum<VkCommandPoolResetFlagBits> {


   /** class */
   private static final Class<VkCommandPoolResetFlagBits> myClass = VkCommandPoolResetFlagBits.class;

   /** values */
   private static VkCommandPoolResetFlagBits[] values = new VkCommandPoolResetFlagBits[1];

   public static final VkCommandPoolResetFlagBits VK_COMMAND_POOL_RESET_RELEASE_RESOURCES_BIT = new VkCommandPoolResetFlagBits("VK_COMMAND_POOL_RESET_RELEASE_RESOURCES_BIT", 0, 0x00000001);
   
   /**
    * Return all values available in this enumeration
    * @return Array of avail. VkAccessFlagBits
    */
    @SuppressWarnings("unchecked")
    public static VkCommandPoolResetFlagBits[] values(){
            return values;
    }

	/**
	 * Get class of this enumeration
	 */
    protected static Class<VkCommandPoolResetFlagBits> myGetClass(){
        return myClass;
    }

    /**
     * Creates a bitwise ORed enumeration
     * @param bits - list of enumerations to bitwise OR 
     * @return an enumeration of ORed bits 
     */
    public static VkCommandPoolResetFlagBits or(VkCommandPoolResetFlagBits...bits){
        int value = bits[0].getValue();        
        for (int i=1; i<bits.length; i++) {
            VkCommandPoolResetFlagBits item = bits[i];
            value |= item.getValue();
        } 
        String name = myGetClass().getSimpleName() + " from bitwise Operation.[" + value +"]";
        VkCommandPoolResetFlagBits ored = new VkCommandPoolResetFlagBits(name, -1, value);        
        return ored;
    }
    
    /**
     * Creates a enumeration of this class, if valid. 
     * If you try to create a invalid enumeration it will raise a exception.
     * @param value - a valid enumeration value or ar ORed value.
     * @return a instance of VkCommandPoolResetFlagBits from value. NULL if it is invalid value.
     */
    public static VkCommandPoolResetFlagBits fromValue(int value){
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
        VkCommandPoolResetFlagBits flag = new VkCommandPoolResetFlagBits(name, -1, value); 
        return flag;
    }
    
    /**
     * Check is a given flagA is bitwise ORed with flagB
     * @param flagA - flag to test
     * @param flagB - flag to test
     * @return true if flagA bit
     */
    public static boolean isORed(VkCommandPoolResetFlagBits flagA, VkCommandPoolResetFlagBits flagB){
        int valA = flagA.getValue();
        int valB = flagB.getValue();
        return (valA & valB) == valB;
    }


    /** private ctor */
    private VkCommandPoolResetFlagBits(String name, int ordinal, int v) {
       super(name, ordinal, v);
       values[ordinal] = this;
    }

 } // end of class VkCommandPoolResetFlagBits
