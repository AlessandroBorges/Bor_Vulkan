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
 * Class to wrap Vulkan enumeration VkCommandBufferUsageFlagBits
 *
 * <h3>Prototype</h3> <pre>
 * typedef enum VkCommandBufferUsageFlagBits {
 *     VK_COMMAND_BUFFER_USAGE_ONE_TIME_SUBMIT_BIT = 0x00000001,
 *     VK_COMMAND_BUFFER_USAGE_RENDER_PASS_CONTINUE_BIT = 0x00000002,
 *     VK_COMMAND_BUFFER_USAGE_SIMULTANEOUS_USE_BIT = 0x00000004,
 *     VK_COMMAND_BUFFER_USAGE_FLAG_BITS_MAX_ENUM = 0x7FFFFFFF
 * } VkCommandBufferUsageFlagBits;
 * </pre>
 * @author Alessandro Borges
 */
public class VkCommandBufferUsageFlagBits extends IntEnum<VkCommandBufferUsageFlagBits> {


   /** class */
   private static final Class<VkCommandBufferUsageFlagBits> myClass = VkCommandBufferUsageFlagBits.class;

   /** values */
   private static VkCommandBufferUsageFlagBits[] values = new VkCommandBufferUsageFlagBits[3];

   public static final VkCommandBufferUsageFlagBits VK_COMMAND_BUFFER_USAGE_ONE_TIME_SUBMIT_BIT = new VkCommandBufferUsageFlagBits("VK_COMMAND_BUFFER_USAGE_ONE_TIME_SUBMIT_BIT", 0, 0x00000001);
   public static final VkCommandBufferUsageFlagBits VK_COMMAND_BUFFER_USAGE_RENDER_PASS_CONTINUE_BIT = new VkCommandBufferUsageFlagBits("VK_COMMAND_BUFFER_USAGE_RENDER_PASS_CONTINUE_BIT", 1, 0x00000002);
   public static final VkCommandBufferUsageFlagBits VK_COMMAND_BUFFER_USAGE_SIMULTANEOUS_USE_BIT = new VkCommandBufferUsageFlagBits("VK_COMMAND_BUFFER_USAGE_SIMULTANEOUS_USE_BIT", 2, 0x00000004);
   
   /**
    * Return all values available in this enumeration
    * @return Array of avail. VkAccessFlagBits
    */
    @SuppressWarnings("unchecked")
    public static VkCommandBufferUsageFlagBits[] values(){
            return values;
    }

	/**
	 * Get class of this enumeration
	 */
    protected static Class<VkCommandBufferUsageFlagBits> myGetClass(){
        return myClass;
    }

    /**
     * Creates a bitwise ORed enumeration
     * @param bits - list of enumerations to bitwise OR 
     * @return an enumeration of ORed bits 
     */
    public static VkCommandBufferUsageFlagBits or(VkCommandBufferUsageFlagBits...bits){
        int value = bits[0].getValue();        
        for (int i=1; i<bits.length; i++) {
            VkCommandBufferUsageFlagBits item = bits[i];
            value |= item.getValue();
        } 
        String name = myGetClass().getSimpleName() + " from bitwise Operation.[" + value +"]";
        VkCommandBufferUsageFlagBits ored = new VkCommandBufferUsageFlagBits(name, -1, value);        
        return ored;
    }
    
    /**
     * Creates a enumeration of this class, if valid. 
     * If you try to create a invalid enumeration it will raise a exception.
     * @param value - a valid enumeration value or ar ORed value.
     * @return a instance of VkCommandBufferUsageFlagBits from value. NULL if it is invalid value.
     */
    public static VkCommandBufferUsageFlagBits fromValue(int value){
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
        VkCommandBufferUsageFlagBits flag = new VkCommandBufferUsageFlagBits(name, -1, value); 
        return flag;
    }
	
	/**
     * Creates/populates a array of VkCommandBufferUsageFlagBits from a set of values.
     * @param dst - destination array. Can be null.
     * @param values - int[] with valid values of this enumeration.
     * @return VkCommandBufferUsageFlagBits array with matching values
     */
    public static VkCommandBufferUsageFlagBits[] fromValues(VkCommandBufferUsageFlagBits[] dst, int[] values){
        if(values == null) 
               return null;
        if(dst == null || dst.length != values.length){
            dst = new VkCommandBufferUsageFlagBits[values.length];
        }        
        for (int i = 0; i < values.length; i++) {
            int val = values[i];
            dst[i] = VkCommandBufferUsageFlagBits.fromValue(val);
        }        
        return dst;
    }
    
    /**
     * Check is a given flagA is bitwise ORed with flagB
     * @param flagA - flag to test
     * @param flagB - flag to test
     * @return true if flagA bit
     */
    public static boolean isORed(VkCommandBufferUsageFlagBits flagA, VkCommandBufferUsageFlagBits flagB){
        int valA = flagA.getValue();
        int valB = flagB.getValue();
        return (valA & valB) == valB;
    }


    /** private ctor */
    private VkCommandBufferUsageFlagBits(String name, int ordinal, int v) {
       super(name, ordinal, v);
       values[ordinal] = this;
    }

 } // end of class VkCommandBufferUsageFlagBits
