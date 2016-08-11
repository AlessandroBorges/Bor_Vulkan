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
 * Class to wrap Vulkan enumeration VkImageType
 *
 * <h3>Prototype</h3> <pre>
 * typedef enum VkImageType {
 *     VK_IMAGE_TYPE_1D = 0,
 *     VK_IMAGE_TYPE_2D = 1,
 *     VK_IMAGE_TYPE_3D = 2,
 *     VK_IMAGE_TYPE_BEGIN_RANGE = VK_IMAGE_TYPE_1D,
 *     VK_IMAGE_TYPE_END_RANGE = VK_IMAGE_TYPE_3D,
 *     VK_IMAGE_TYPE_RANGE_SIZE = (VK_IMAGE_TYPE_3D - VK_IMAGE_TYPE_1D + 1),
 *     VK_IMAGE_TYPE_MAX_ENUM = 0x7FFFFFFF
 * } VkImageType;
 * </pre>
 * @author Alessandro Borges
 */
public class VkImageType extends IntEnum<VkImageType> {


   /** class */
   private static final Class<VkImageType> myClass = VkImageType.class;

   /** values */
   private static VkImageType[] values = new VkImageType[3];

   public static final VkImageType VK_IMAGE_TYPE_1D = new VkImageType("VK_IMAGE_TYPE_1D", 0, 0);
   public static final VkImageType VK_IMAGE_TYPE_2D = new VkImageType("VK_IMAGE_TYPE_2D", 1, 1);
   public static final VkImageType VK_IMAGE_TYPE_3D = new VkImageType("VK_IMAGE_TYPE_3D", 2, 2);
   
   /**
    * Return all values available in this enumeration
    * @return Array of avail. VkAccessFlagBits
    */
    @SuppressWarnings("unchecked")
    public static VkImageType[] values(){
            return values;
    }

	/**
	 * Get class of this enumeration
	 */
    protected static Class<VkImageType> myGetClass(){
        return myClass;
    }

    /**
     * Creates a bitwise ORed enumeration
     * @param bits - list of enumerations to bitwise OR 
     * @return an enumeration of ORed bits 
     */
    public static VkImageType or(VkImageType...bits){
        int value = bits[0].getValue();        
        for (int i=1; i<bits.length; i++) {
            VkImageType item = bits[i];
            value |= item.getValue();
        } 
        String name = myGetClass().getSimpleName() + " from bitwise Operation.[" + value +"]";
        VkImageType ored = new VkImageType(name, -1, value);        
        return ored;
    }
    
    /**
     * Creates a enumeration of this class, if valid. 
     * If you try to create a invalid enumeration it will raise a exception.
     * @param value - a valid enumeration value or ar ORed value.
     * @return a instance of VkImageType from value. NULL if it is invalid value.
     */
    public static VkImageType fromValue(int value){
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
        VkImageType flag = new VkImageType(name, -1, value); 
        return flag;
    }
	
	/**
     * Creates/populates a array of VkImageType from a set of values.
     * @param dst - destination array. Can be null.
     * @param values - int[] with valid values of this enumeration.
     * @return VkImageType array with matching values
     */
    public static VkImageType[] fromValues(VkImageType[] dst, int[] values){
        if(values == null) 
               return null;
        if(dst == null || dst.length != values.length){
            dst = new VkImageType[values.length];
        }        
        for (int i = 0; i < values.length; i++) {
            int val = values[i];
            dst[i] = VkImageType.fromValue(val);
        }        
        return dst;
    }
    
    /**
     * Check is a given flagA is bitwise ORed with flagB
     * @param flagA - flag to test
     * @param flagB - flag to test
     * @return true if flagA bit
     */
    public static boolean isORed(VkImageType flagA, VkImageType flagB){
        int valA = flagA.getValue();
        int valB = flagB.getValue();
        return (valA & valB) == valB;
    }


    /** private ctor */
    private VkImageType(String name, int ordinal, int v) {
       super(name, ordinal, v);
       values[ordinal] = this;
    }

 } // end of class VkImageType
