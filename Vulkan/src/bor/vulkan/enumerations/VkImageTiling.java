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
 * Class to wrap Vulkan enumeration VkImageTiling
 *
 * <h3>Prototype</h3> <pre>
 * typedef enum VkImageTiling {
 *     VK_IMAGE_TILING_OPTIMAL = 0,
 *     VK_IMAGE_TILING_LINEAR = 1,
 *     VK_IMAGE_TILING_BEGIN_RANGE = VK_IMAGE_TILING_OPTIMAL,
 *     VK_IMAGE_TILING_END_RANGE = VK_IMAGE_TILING_LINEAR,
 *     VK_IMAGE_TILING_RANGE_SIZE = (VK_IMAGE_TILING_LINEAR - VK_IMAGE_TILING_OPTIMAL + 1),
 *     VK_IMAGE_TILING_MAX_ENUM = 0x7FFFFFFF
 * } VkImageTiling;
 * </pre>
 * @author Alessandro Borges
 */
public class VkImageTiling extends IntEnum<VkImageTiling> {


   /** class */
   private static final Class<VkImageTiling> myClass = VkImageTiling.class;

   /** values */
   private static VkImageTiling[] values = new VkImageTiling[2];

   public static final VkImageTiling VK_IMAGE_TILING_OPTIMAL = new VkImageTiling("VK_IMAGE_TILING_OPTIMAL", 0, 0);
   public static final VkImageTiling VK_IMAGE_TILING_LINEAR = new VkImageTiling("VK_IMAGE_TILING_LINEAR", 1, 1);
   
   /**
    * Return all values available in this enumeration
    * @return Array of avail. VkAccessFlagBits
    */
    @SuppressWarnings("unchecked")
    public static VkImageTiling[] values(){
            return values;
    }

	/**
	 * Get class of this enumeration
	 */
    protected static Class<VkImageTiling> myGetClass(){
        return myClass;
    }

    /**
     * Creates a bitwise ORed enumeration
     * @param bits - list of enumerations to bitwise OR 
     * @return an enumeration of ORed bits 
     */
    public static VkImageTiling or(VkImageTiling...bits){
        int value = bits[0].getValue();        
        for (int i=1; i<bits.length; i++) {
            VkImageTiling item = bits[i];
            value |= item.getValue();
        } 
        String name = myGetClass().getSimpleName() + " from bitwise Operation.[" + value +"]";
        VkImageTiling ored = new VkImageTiling(name, -1, value);        
        return ored;
    }
    
    /**
     * Creates a enumeration of this class, if valid. 
     * If you try to create a invalid enumeration it will raise a exception.
     * @param value - a valid enumeration value or ar ORed value.
     * @return a instance of VkImageTiling from value. NULL if it is invalid value.
     */
    public static VkImageTiling fromValue(int value){
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
        VkImageTiling flag = new VkImageTiling(name, -1, value); 
        return flag;
    }
	
	/**
     * Creates/populates a array of VkImageTiling from a set of values.
     * @param dst - destination array. Can be null.
     * @param values - int[] with valid values of this enumeration.
     * @return VkImageTiling array with matching values
     */
    public static VkImageTiling[] fromValues(VkImageTiling[] dst, int[] values){
        if(values == null) 
               return null;
        if(dst == null || dst.length != values.length){
            dst = new VkImageTiling[values.length];
        }        
        for (int i = 0; i < values.length; i++) {
            int val = values[i];
            dst[i] = VkImageTiling.fromValue(val);
        }        
        return dst;
    }
    
    /**
     * Check is a given flagA is bitwise ORed with flagB
     * @param flagA - flag to test
     * @param flagB - flag to test
     * @return true if flagA bit
     */
    public static boolean isORed(VkImageTiling flagA, VkImageTiling flagB){
        int valA = flagA.getValue();
        int valB = flagB.getValue();
        return (valA & valB) == valB;
    }


    /** private ctor */
    private VkImageTiling(String name, int ordinal, int v) {
       super(name, ordinal, v);
       values[ordinal] = this;
    }

 } // end of class VkImageTiling
