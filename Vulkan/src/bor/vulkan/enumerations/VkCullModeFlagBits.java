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
 * Class to wrap Vulkan enumeration VkCullModeFlagBits
 *
 * <h3>Prototype</h3> <pre>
 * typedef enum VkCullModeFlagBits {
 *     VK_CULL_MODE_NONE = 0,
 *     VK_CULL_MODE_FRONT_BIT = 0x00000001,
 *     VK_CULL_MODE_BACK_BIT = 0x00000002,
 *     VK_CULL_MODE_FRONT_AND_BACK = 0x00000003,
 *     VK_CULL_MODE_FLAG_BITS_MAX_ENUM = 0x7FFFFFFF
 * } VkCullModeFlagBits;
 * </pre>
 * @author Alessandro Borges
 */
public class VkCullModeFlagBits extends IntEnum<VkCullModeFlagBits> {


   /** class */
   private static final Class<VkCullModeFlagBits> myClass = VkCullModeFlagBits.class;

   /** values */
   private static VkCullModeFlagBits[] values = new VkCullModeFlagBits[4];

   public static final VkCullModeFlagBits VK_CULL_MODE_NONE = new VkCullModeFlagBits("VK_CULL_MODE_NONE", 0, 0);
   public static final VkCullModeFlagBits VK_CULL_MODE_FRONT_BIT = new VkCullModeFlagBits("VK_CULL_MODE_FRONT_BIT", 1, 0x00000001);
   public static final VkCullModeFlagBits VK_CULL_MODE_BACK_BIT = new VkCullModeFlagBits("VK_CULL_MODE_BACK_BIT", 2, 0x00000002);
   public static final VkCullModeFlagBits VK_CULL_MODE_FRONT_AND_BACK = new VkCullModeFlagBits("VK_CULL_MODE_FRONT_AND_BACK", 3, 0x00000003);
   
   /**
    * Return all values available in this enumeration
    * @return Array of avail. VkAccessFlagBits
    */
    @SuppressWarnings("unchecked")
    public static VkCullModeFlagBits[] values(){
            return values;
    }

	/**
	 * Get class of this enumeration
	 */
    protected static Class<VkCullModeFlagBits> myGetClass(){
        return myClass;
    }

    /**
     * Creates a bitwise ORed enumeration
     * @param bits - list of enumerations to bitwise OR 
     * @return an enumeration of ORed bits 
     */
    public static VkCullModeFlagBits or(VkCullModeFlagBits...bits){
        int value = bits[0].getValue();        
        for (int i=1; i<bits.length; i++) {
            VkCullModeFlagBits item = bits[i];
            value |= item.getValue();
        } 
        String name = myGetClass().getSimpleName() + " from bitwise Operation.[" + value +"]";
        VkCullModeFlagBits ored = new VkCullModeFlagBits(name, -1, value);        
        return ored;
    }
    
    /**
     * Creates a enumeration of this class, if valid. 
     * If you try to create a invalid enumeration it will raise a exception.
     * @param value - a valid enumeration value or ar ORed value.
     * @return a instance of VkCullModeFlagBits from value. NULL if it is invalid value.
     */
    public static VkCullModeFlagBits fromValue(int value){
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
        VkCullModeFlagBits flag = new VkCullModeFlagBits(name, -1, value); 
        return flag;
    }
    
    /**
     * Check is a given flagA is bitwise ORed with flagB
     * @param flagA - flag to test
     * @param flagB - flag to test
     * @return true if flagA bit
     */
    public static boolean isORed(VkCullModeFlagBits flagA, VkCullModeFlagBits flagB){
        int valA = flagA.getValue();
        int valB = flagB.getValue();
        return (valA & valB) == valB;
    }


    /** private ctor */
    private VkCullModeFlagBits(String name, int ordinal, int v) {
       super(name, ordinal, v);
       values[ordinal] = this;
    }

 } // end of class VkCullModeFlagBits
