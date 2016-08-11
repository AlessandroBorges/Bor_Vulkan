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
 * Class to wrap Vulkan enumeration VkQueueFlagBits
 *
 * <h3>Prototype</h3> <pre>
 * typedef enum VkQueueFlagBits {
 *     VK_QUEUE_GRAPHICS_BIT = 0x00000001,
 *     VK_QUEUE_COMPUTE_BIT = 0x00000002,
 *     VK_QUEUE_TRANSFER_BIT = 0x00000004,
 *     VK_QUEUE_SPARSE_BINDING_BIT = 0x00000008,
 *     VK_QUEUE_FLAG_BITS_MAX_ENUM = 0x7FFFFFFF
 * } VkQueueFlagBits;
 * </pre>
 * @author Alessandro Borges
 */
public class VkQueueFlagBits extends IntEnum<VkQueueFlagBits> {


   /** class */
   private static final Class<VkQueueFlagBits> myClass = VkQueueFlagBits.class;

   /** values */
   private static VkQueueFlagBits[] values = new VkQueueFlagBits[4];

   public static final VkQueueFlagBits VK_QUEUE_GRAPHICS_BIT = new VkQueueFlagBits("VK_QUEUE_GRAPHICS_BIT", 0, 0x00000001);
   public static final VkQueueFlagBits VK_QUEUE_COMPUTE_BIT = new VkQueueFlagBits("VK_QUEUE_COMPUTE_BIT", 1, 0x00000002);
   public static final VkQueueFlagBits VK_QUEUE_TRANSFER_BIT = new VkQueueFlagBits("VK_QUEUE_TRANSFER_BIT", 2, 0x00000004);
   public static final VkQueueFlagBits VK_QUEUE_SPARSE_BINDING_BIT = new VkQueueFlagBits("VK_QUEUE_SPARSE_BINDING_BIT", 3, 0x00000008);
   
   /**
    * Return all values available in this enumeration
    * @return Array of avail. VkAccessFlagBits
    */
    @SuppressWarnings("unchecked")
    public static VkQueueFlagBits[] values(){
            return values;
    }

	/**
	 * Get class of this enumeration
	 */
    protected static Class<VkQueueFlagBits> myGetClass(){
        return myClass;
    }

    /**
     * Creates a bitwise ORed enumeration
     * @param bits - list of enumerations to bitwise OR 
     * @return an enumeration of ORed bits 
     */
    public static VkQueueFlagBits or(VkQueueFlagBits...bits){
        int value = bits[0].getValue();        
        for (int i=1; i<bits.length; i++) {
            VkQueueFlagBits item = bits[i];
            value |= item.getValue();
        } 
        String name = myGetClass().getSimpleName() + " from bitwise Operation.[" + value +"]";
        VkQueueFlagBits ored = new VkQueueFlagBits(name, -1, value);        
        return ored;
    }
    
    /**
     * Creates a enumeration of this class, if valid. 
     * If you try to create a invalid enumeration it will raise a exception.
     * @param value - a valid enumeration value or ar ORed value.
     * @return a instance of VkQueueFlagBits from value. NULL if it is invalid value.
     */
    public static VkQueueFlagBits fromValue(int value){
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
        VkQueueFlagBits flag = new VkQueueFlagBits(name, -1, value); 
        return flag;
    }
	
	/**
     * Creates/populates a array of VkQueueFlagBits from a set of values.
     * @param dst - destination array. Can be null.
     * @param values - int[] with valid values of this enumeration.
     * @return VkQueueFlagBits array with matching values
     */
    public static VkQueueFlagBits[] fromValues(VkQueueFlagBits[] dst, int[] values){
        if(values == null) 
               return null;
        if(dst == null || dst.length != values.length){
            dst = new VkQueueFlagBits[values.length];
        }        
        for (int i = 0; i < values.length; i++) {
            int val = values[i];
            dst[i] = VkQueueFlagBits.fromValue(val);
        }        
        return dst;
    }
    
    /**
     * Check is a given flagA is bitwise ORed with flagB
     * @param flagA - flag to test
     * @param flagB - flag to test
     * @return true if flagA bit
     */
    public static boolean isORed(VkQueueFlagBits flagA, VkQueueFlagBits flagB){
        int valA = flagA.getValue();
        int valB = flagB.getValue();
        return (valA & valB) == valB;
    }


    /** private ctor */
    private VkQueueFlagBits(String name, int ordinal, int v) {
       super(name, ordinal, v);
       values[ordinal] = this;
    }

 } // end of class VkQueueFlagBits
