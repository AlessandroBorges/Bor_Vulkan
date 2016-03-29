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
 * Class to wrap Vulkan enumeration VkBlendFactor
 *
 * <h3>Prototype</h3> <pre>
 * typedef enum VkBlendFactor {
 *     VK_BLEND_FACTOR_ZERO = 0,
 *     VK_BLEND_FACTOR_ONE = 1,
 *     VK_BLEND_FACTOR_SRC_COLOR = 2,
 *     VK_BLEND_FACTOR_ONE_MINUS_SRC_COLOR = 3,
 *     VK_BLEND_FACTOR_DST_COLOR = 4,
 *     VK_BLEND_FACTOR_ONE_MINUS_DST_COLOR = 5,
 *     VK_BLEND_FACTOR_SRC_ALPHA = 6,
 *     VK_BLEND_FACTOR_ONE_MINUS_SRC_ALPHA = 7,
 *     VK_BLEND_FACTOR_DST_ALPHA = 8,
 *     VK_BLEND_FACTOR_ONE_MINUS_DST_ALPHA = 9,
 *     VK_BLEND_FACTOR_CONSTANT_COLOR = 10,
 *     VK_BLEND_FACTOR_ONE_MINUS_CONSTANT_COLOR = 11,
 *     VK_BLEND_FACTOR_CONSTANT_ALPHA = 12,
 *     VK_BLEND_FACTOR_ONE_MINUS_CONSTANT_ALPHA = 13,
 *     VK_BLEND_FACTOR_SRC_ALPHA_SATURATE = 14,
 *     VK_BLEND_FACTOR_SRC1_COLOR = 15,
 *     VK_BLEND_FACTOR_ONE_MINUS_SRC1_COLOR = 16,
 *     VK_BLEND_FACTOR_SRC1_ALPHA = 17,
 *     VK_BLEND_FACTOR_ONE_MINUS_SRC1_ALPHA = 18,
 *     VK_BLEND_FACTOR_BEGIN_RANGE = VK_BLEND_FACTOR_ZERO,
 *     VK_BLEND_FACTOR_END_RANGE = VK_BLEND_FACTOR_ONE_MINUS_SRC1_ALPHA,
 *     VK_BLEND_FACTOR_RANGE_SIZE = (VK_BLEND_FACTOR_ONE_MINUS_SRC1_ALPHA - VK_BLEND_FACTOR_ZERO + 1),
 *     VK_BLEND_FACTOR_MAX_ENUM = 0x7FFFFFFF
 * } VkBlendFactor;
 * </pre>
 * @author Alessandro Borges
 */
public class VkBlendFactor extends IntEnum<VkBlendFactor> {


   /** class */
   private static final Class<VkBlendFactor> myClass = VkBlendFactor.class;

   /** values */
   private static VkBlendFactor[] values = new VkBlendFactor[19];

   public static final VkBlendFactor VK_BLEND_FACTOR_ZERO = new VkBlendFactor("VK_BLEND_FACTOR_ZERO", 0, 0);
   public static final VkBlendFactor VK_BLEND_FACTOR_ONE = new VkBlendFactor("VK_BLEND_FACTOR_ONE", 1, 1);
   public static final VkBlendFactor VK_BLEND_FACTOR_SRC_COLOR = new VkBlendFactor("VK_BLEND_FACTOR_SRC_COLOR", 2, 2);
   public static final VkBlendFactor VK_BLEND_FACTOR_ONE_MINUS_SRC_COLOR = new VkBlendFactor("VK_BLEND_FACTOR_ONE_MINUS_SRC_COLOR", 3, 3);
   public static final VkBlendFactor VK_BLEND_FACTOR_DST_COLOR = new VkBlendFactor("VK_BLEND_FACTOR_DST_COLOR", 4, 4);
   public static final VkBlendFactor VK_BLEND_FACTOR_ONE_MINUS_DST_COLOR = new VkBlendFactor("VK_BLEND_FACTOR_ONE_MINUS_DST_COLOR", 5, 5);
   public static final VkBlendFactor VK_BLEND_FACTOR_SRC_ALPHA = new VkBlendFactor("VK_BLEND_FACTOR_SRC_ALPHA", 6, 6);
   public static final VkBlendFactor VK_BLEND_FACTOR_ONE_MINUS_SRC_ALPHA = new VkBlendFactor("VK_BLEND_FACTOR_ONE_MINUS_SRC_ALPHA", 7, 7);
   public static final VkBlendFactor VK_BLEND_FACTOR_DST_ALPHA = new VkBlendFactor("VK_BLEND_FACTOR_DST_ALPHA", 8, 8);
   public static final VkBlendFactor VK_BLEND_FACTOR_ONE_MINUS_DST_ALPHA = new VkBlendFactor("VK_BLEND_FACTOR_ONE_MINUS_DST_ALPHA", 9, 9);
   public static final VkBlendFactor VK_BLEND_FACTOR_CONSTANT_COLOR = new VkBlendFactor("VK_BLEND_FACTOR_CONSTANT_COLOR", 10, 10);
   public static final VkBlendFactor VK_BLEND_FACTOR_ONE_MINUS_CONSTANT_COLOR = new VkBlendFactor("VK_BLEND_FACTOR_ONE_MINUS_CONSTANT_COLOR", 11, 11);
   public static final VkBlendFactor VK_BLEND_FACTOR_CONSTANT_ALPHA = new VkBlendFactor("VK_BLEND_FACTOR_CONSTANT_ALPHA", 12, 12);
   public static final VkBlendFactor VK_BLEND_FACTOR_ONE_MINUS_CONSTANT_ALPHA = new VkBlendFactor("VK_BLEND_FACTOR_ONE_MINUS_CONSTANT_ALPHA", 13, 13);
   public static final VkBlendFactor VK_BLEND_FACTOR_SRC_ALPHA_SATURATE = new VkBlendFactor("VK_BLEND_FACTOR_SRC_ALPHA_SATURATE", 14, 14);
   public static final VkBlendFactor VK_BLEND_FACTOR_SRC1_COLOR = new VkBlendFactor("VK_BLEND_FACTOR_SRC1_COLOR", 15, 15);
   public static final VkBlendFactor VK_BLEND_FACTOR_ONE_MINUS_SRC1_COLOR = new VkBlendFactor("VK_BLEND_FACTOR_ONE_MINUS_SRC1_COLOR", 16, 16);
   public static final VkBlendFactor VK_BLEND_FACTOR_SRC1_ALPHA = new VkBlendFactor("VK_BLEND_FACTOR_SRC1_ALPHA", 17, 17);
   public static final VkBlendFactor VK_BLEND_FACTOR_ONE_MINUS_SRC1_ALPHA = new VkBlendFactor("VK_BLEND_FACTOR_ONE_MINUS_SRC1_ALPHA", 18, 18);
   
   /**
    * Return all values available in this enumeration
    * @return Array of avail. VkAccessFlagBits
    */
    @SuppressWarnings("unchecked")
    public static VkBlendFactor[] values(){
            return values;
    }

	/**
	 * Get class of this enumeration
	 */
    protected static Class<VkBlendFactor> myGetClass(){
        return myClass;
    }

    /**
     * Creates a bitwise ORed enumeration
     * @param bits - list of enumerations to bitwise OR 
     * @return an enumeration of ORed bits 
     */
    public static VkBlendFactor or(VkBlendFactor...bits){
        int value = bits[0].getValue();        
        for (int i=1; i<bits.length; i++) {
            VkBlendFactor item = bits[i];
            value |= item.getValue();
        } 
        String name = myGetClass().getSimpleName() + " from bitwise Operation.[" + value +"]";
        VkBlendFactor ored = new VkBlendFactor(name, -1, value);        
        return ored;
    }
    
    /**
     * Creates a enumeration of this class, if valid. 
     * If you try to create a invalid enumeration it will raise a exception.
     * @param value - a valid enumeration value or ar ORed value.
     * @return a instance of VkBlendFactor from value. NULL if it is invalid value.
     */
    public static VkBlendFactor fromValue(int value){
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
        VkBlendFactor flag = new VkBlendFactor(name, -1, value); 
        return flag;
    }
    
    /**
     * Check is a given flagA is bitwise ORed with flagB
     * @param flagA - flag to test
     * @param flagB - flag to test
     * @return true if flagA bit
     */
    public static boolean isORed(VkBlendFactor flagA, VkBlendFactor flagB){
        int valA = flagA.getValue();
        int valB = flagB.getValue();
        return (valA & valB) == valB;
    }


    /** private ctor */
    private VkBlendFactor(String name, int ordinal, int v) {
       super(name, ordinal, v);
       values[ordinal] = this;
    }

 } // end of class VkBlendFactor
