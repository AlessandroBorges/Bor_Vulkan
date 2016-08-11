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
 * Class to wrap Vulkan enumeration VkPresentModeKHR
 *
 * <h3>Prototype</h3> <pre>
 * typedef enum VkPresentModeKHR {
 *     VK_PRESENT_MODE_IMMEDIATE_KHR = 0,
 *     VK_PRESENT_MODE_MAILBOX_KHR = 1,
 *     VK_PRESENT_MODE_FIFO_KHR = 2,
 *     VK_PRESENT_MODE_FIFO_RELAXED_KHR = 3,
 *     VK_PRESENT_MODE_BEGIN_RANGE_KHR = VK_PRESENT_MODE_IMMEDIATE_KHR,
 *     VK_PRESENT_MODE_END_RANGE_KHR = VK_PRESENT_MODE_FIFO_RELAXED_KHR,
 *     VK_PRESENT_MODE_RANGE_SIZE_KHR = (VK_PRESENT_MODE_FIFO_RELAXED_KHR - VK_PRESENT_MODE_IMMEDIATE_KHR + 1),
 *     VK_PRESENT_MODE_MAX_ENUM_KHR = 0x7FFFFFFF
 * } VkPresentModeKHR;
 * </pre>
 * @author Alessandro Borges
 */
public class VkPresentModeKHR extends IntEnum<VkPresentModeKHR> {


   /** class */
   private static final Class<VkPresentModeKHR> myClass = VkPresentModeKHR.class;

   /** values */
   private static VkPresentModeKHR[] values = new VkPresentModeKHR[4];

   public static final VkPresentModeKHR VK_PRESENT_MODE_IMMEDIATE_KHR = new VkPresentModeKHR("VK_PRESENT_MODE_IMMEDIATE_KHR", 0, 0);
   public static final VkPresentModeKHR VK_PRESENT_MODE_MAILBOX_KHR = new VkPresentModeKHR("VK_PRESENT_MODE_MAILBOX_KHR", 1, 1);
   public static final VkPresentModeKHR VK_PRESENT_MODE_FIFO_KHR = new VkPresentModeKHR("VK_PRESENT_MODE_FIFO_KHR", 2, 2);
   public static final VkPresentModeKHR VK_PRESENT_MODE_FIFO_RELAXED_KHR = new VkPresentModeKHR("VK_PRESENT_MODE_FIFO_RELAXED_KHR", 3, 3);
   
   /**
    * Return all values available in this enumeration
    * @return Array of avail. VkAccessFlagBits
    */
    @SuppressWarnings("unchecked")
    public static VkPresentModeKHR[] values(){
            return values;
    }

	/**
	 * Get class of this enumeration
	 */
    protected static Class<VkPresentModeKHR> myGetClass(){
        return myClass;
    }

    /**
     * Creates a bitwise ORed enumeration
     * @param bits - list of enumerations to bitwise OR 
     * @return an enumeration of ORed bits 
     */
    public static VkPresentModeKHR or(VkPresentModeKHR...bits){
        int value = bits[0].getValue();        
        for (int i=1; i<bits.length; i++) {
            VkPresentModeKHR item = bits[i];
            value |= item.getValue();
        } 
        String name = myGetClass().getSimpleName() + " from bitwise Operation.[" + value +"]";
        VkPresentModeKHR ored = new VkPresentModeKHR(name, -1, value);        
        return ored;
    }
    
    /**
     * Creates a enumeration of this class, if valid. 
     * If you try to create a invalid enumeration it will raise a exception.
     * @param value - a valid enumeration value or ar ORed value.
     * @return a instance of VkPresentModeKHR from value. NULL if it is invalid value.
     */
    public static VkPresentModeKHR fromValue(int value){
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
        VkPresentModeKHR flag = new VkPresentModeKHR(name, -1, value); 
        return flag;
    }
	
	/**
     * Creates/populates a array of VkPresentModeKHR from a set of values.
     * @param dst - destination array. Can be null.
     * @param values - int[] with valid values of this enumeration.
     * @return VkPresentModeKHR array with matching values
     */
    public static VkPresentModeKHR[] fromValues(VkPresentModeKHR[] dst, int[] values){
        if(values == null) 
               return null;
        if(dst == null || dst.length != values.length){
            dst = new VkPresentModeKHR[values.length];
        }        
        for (int i = 0; i < values.length; i++) {
            int val = values[i];
            dst[i] = VkPresentModeKHR.fromValue(val);
        }        
        return dst;
    }
    
    /**
     * Check is a given flagA is bitwise ORed with flagB
     * @param flagA - flag to test
     * @param flagB - flag to test
     * @return true if flagA bit
     */
    public static boolean isORed(VkPresentModeKHR flagA, VkPresentModeKHR flagB){
        int valA = flagA.getValue();
        int valB = flagB.getValue();
        return (valA & valB) == valB;
    }


    /** private ctor */
    private VkPresentModeKHR(String name, int ordinal, int v) {
       super(name, ordinal, v);
       values[ordinal] = this;
    }

 } // end of class VkPresentModeKHR
