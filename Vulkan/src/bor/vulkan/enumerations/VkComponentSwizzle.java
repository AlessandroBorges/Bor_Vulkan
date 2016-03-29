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
 * Class to wrap Vulkan enumeration VkComponentSwizzle
 *
 * <h3>Prototype</h3> <pre>
 * typedef enum VkComponentSwizzle {
 *     VK_COMPONENT_SWIZZLE_IDENTITY = 0,
 *     VK_COMPONENT_SWIZZLE_ZERO = 1,
 *     VK_COMPONENT_SWIZZLE_ONE = 2,
 *     VK_COMPONENT_SWIZZLE_R = 3,
 *     VK_COMPONENT_SWIZZLE_G = 4,
 *     VK_COMPONENT_SWIZZLE_B = 5,
 *     VK_COMPONENT_SWIZZLE_A = 6,
 *     VK_COMPONENT_SWIZZLE_BEGIN_RANGE = VK_COMPONENT_SWIZZLE_IDENTITY,
 *     VK_COMPONENT_SWIZZLE_END_RANGE = VK_COMPONENT_SWIZZLE_A,
 *     VK_COMPONENT_SWIZZLE_RANGE_SIZE = (VK_COMPONENT_SWIZZLE_A - VK_COMPONENT_SWIZZLE_IDENTITY + 1),
 *     VK_COMPONENT_SWIZZLE_MAX_ENUM = 0x7FFFFFFF
 * } VkComponentSwizzle;
 * </pre>
 * @author Alessandro Borges
 */
public class VkComponentSwizzle extends IntEnum<VkComponentSwizzle> {


   /** class */
   private static final Class<VkComponentSwizzle> myClass = VkComponentSwizzle.class;

   /** values */
   private static VkComponentSwizzle[] values = new VkComponentSwizzle[7];

   public static final VkComponentSwizzle VK_COMPONENT_SWIZZLE_IDENTITY = new VkComponentSwizzle("VK_COMPONENT_SWIZZLE_IDENTITY", 0, 0);
   public static final VkComponentSwizzle VK_COMPONENT_SWIZZLE_ZERO = new VkComponentSwizzle("VK_COMPONENT_SWIZZLE_ZERO", 1, 1);
   public static final VkComponentSwizzle VK_COMPONENT_SWIZZLE_ONE = new VkComponentSwizzle("VK_COMPONENT_SWIZZLE_ONE", 2, 2);
   public static final VkComponentSwizzle VK_COMPONENT_SWIZZLE_R = new VkComponentSwizzle("VK_COMPONENT_SWIZZLE_R", 3, 3);
   public static final VkComponentSwizzle VK_COMPONENT_SWIZZLE_G = new VkComponentSwizzle("VK_COMPONENT_SWIZZLE_G", 4, 4);
   public static final VkComponentSwizzle VK_COMPONENT_SWIZZLE_B = new VkComponentSwizzle("VK_COMPONENT_SWIZZLE_B", 5, 5);
   public static final VkComponentSwizzle VK_COMPONENT_SWIZZLE_A = new VkComponentSwizzle("VK_COMPONENT_SWIZZLE_A", 6, 6);
   
   /**
    * Return all values available in this enumeration
    * @return Array of avail. VkAccessFlagBits
    */
    @SuppressWarnings("unchecked")
    public static VkComponentSwizzle[] values(){
            return values;
    }

	/**
	 * Get class of this enumeration
	 */
    protected static Class<VkComponentSwizzle> myGetClass(){
        return myClass;
    }

    /**
     * Creates a bitwise ORed enumeration
     * @param bits - list of enumerations to bitwise OR 
     * @return an enumeration of ORed bits 
     */
    public static VkComponentSwizzle or(VkComponentSwizzle...bits){
        int value = bits[0].getValue();        
        for (int i=1; i<bits.length; i++) {
            VkComponentSwizzle item = bits[i];
            value |= item.getValue();
        } 
        String name = myGetClass().getSimpleName() + " from bitwise Operation.[" + value +"]";
        VkComponentSwizzle ored = new VkComponentSwizzle(name, -1, value);        
        return ored;
    }
    
    /**
     * Creates a enumeration of this class, if valid. 
     * If you try to create a invalid enumeration it will raise a exception.
     * @param value - a valid enumeration value or ar ORed value.
     * @return a instance of VkComponentSwizzle from value. NULL if it is invalid value.
     */
    public static VkComponentSwizzle fromValue(int value){
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
        VkComponentSwizzle flag = new VkComponentSwizzle(name, -1, value); 
        return flag;
    }
    
    /**
     * Check is a given flagA is bitwise ORed with flagB
     * @param flagA - flag to test
     * @param flagB - flag to test
     * @return true if flagA bit
     */
    public static boolean isORed(VkComponentSwizzle flagA, VkComponentSwizzle flagB){
        int valA = flagA.getValue();
        int valB = flagB.getValue();
        return (valA & valB) == valB;
    }


    /** private ctor */
    private VkComponentSwizzle(String name, int ordinal, int v) {
       super(name, ordinal, v);
       values[ordinal] = this;
    }

 } // end of class VkComponentSwizzle
