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
 * Class to wrap Vulkan enumeration VkBorderColor
 *
 * <h3>Prototype</h3> <pre>
 * typedef enum VkBorderColor {
 *     VK_BORDER_COLOR_FLOAT_TRANSPARENT_BLACK = 0,
 *     VK_BORDER_COLOR_INT_TRANSPARENT_BLACK = 1,
 *     VK_BORDER_COLOR_FLOAT_OPAQUE_BLACK = 2,
 *     VK_BORDER_COLOR_INT_OPAQUE_BLACK = 3,
 *     VK_BORDER_COLOR_FLOAT_OPAQUE_WHITE = 4,
 *     VK_BORDER_COLOR_INT_OPAQUE_WHITE = 5,
 *     VK_BORDER_COLOR_BEGIN_RANGE = VK_BORDER_COLOR_FLOAT_TRANSPARENT_BLACK,
 *     VK_BORDER_COLOR_END_RANGE = VK_BORDER_COLOR_INT_OPAQUE_WHITE,
 *     VK_BORDER_COLOR_RANGE_SIZE = (VK_BORDER_COLOR_INT_OPAQUE_WHITE - VK_BORDER_COLOR_FLOAT_TRANSPARENT_BLACK + 1),
 *     VK_BORDER_COLOR_MAX_ENUM = 0x7FFFFFFF
 * } VkBorderColor;
 * </pre>
 * @author Alessandro Borges
 */
public class VkBorderColor extends IntEnum<VkBorderColor> {


   /** class */
   private static final Class<VkBorderColor> myClass = VkBorderColor.class;

   /** values */
   private static VkBorderColor[] values = new VkBorderColor[6];

   public static final VkBorderColor VK_BORDER_COLOR_FLOAT_TRANSPARENT_BLACK = new VkBorderColor("VK_BORDER_COLOR_FLOAT_TRANSPARENT_BLACK", 0, 0);
   public static final VkBorderColor VK_BORDER_COLOR_INT_TRANSPARENT_BLACK = new VkBorderColor("VK_BORDER_COLOR_INT_TRANSPARENT_BLACK", 1, 1);
   public static final VkBorderColor VK_BORDER_COLOR_FLOAT_OPAQUE_BLACK = new VkBorderColor("VK_BORDER_COLOR_FLOAT_OPAQUE_BLACK", 2, 2);
   public static final VkBorderColor VK_BORDER_COLOR_INT_OPAQUE_BLACK = new VkBorderColor("VK_BORDER_COLOR_INT_OPAQUE_BLACK", 3, 3);
   public static final VkBorderColor VK_BORDER_COLOR_FLOAT_OPAQUE_WHITE = new VkBorderColor("VK_BORDER_COLOR_FLOAT_OPAQUE_WHITE", 4, 4);
   public static final VkBorderColor VK_BORDER_COLOR_INT_OPAQUE_WHITE = new VkBorderColor("VK_BORDER_COLOR_INT_OPAQUE_WHITE", 5, 5);
   
   /**
    * Return all values available in this enumeration
    * @return Array of avail. VkAccessFlagBits
    */
    @SuppressWarnings("unchecked")
    public static VkBorderColor[] values(){
            return values;
    }

	/**
	 * Get class of this enumeration
	 */
    protected static Class<VkBorderColor> myGetClass(){
        return myClass;
    }

    /**
     * Creates a bitwise ORed enumeration
     * @param bits - list of enumerations to bitwise OR 
     * @return an enumeration of ORed bits 
     */
    public static VkBorderColor or(VkBorderColor...bits){
        int value = bits[0].getValue();        
        for (int i=1; i<bits.length; i++) {
            VkBorderColor item = bits[i];
            value |= item.getValue();
        } 
        String name = myGetClass().getSimpleName() + " from bitwise Operation.[" + value +"]";
        VkBorderColor ored = new VkBorderColor(name, -1, value);        
        return ored;
    }
    
    /**
     * Creates a enumeration of this class, if valid. 
     * If you try to create a invalid enumeration it will raise a exception.
     * @param value - a valid enumeration value or ar ORed value.
     * @return a instance of VkBorderColor from value. NULL if it is invalid value.
     */
    public static VkBorderColor fromValue(int value){
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
        VkBorderColor flag = new VkBorderColor(name, -1, value); 
        return flag;
    }
	
	/**
     * Creates/populates a array of VkBorderColor from a set of values.
     * @param dst - destination array. Can be null.
     * @param values - int[] with valid values of this enumeration.
     * @return VkBorderColor array with matching values
     */
    public static VkBorderColor[] fromValues(VkBorderColor[] dst, int[] values){
        if(values == null) 
               return null;
        if(dst == null || dst.length != values.length){
            dst = new VkBorderColor[values.length];
        }        
        for (int i = 0; i < values.length; i++) {
            int val = values[i];
            dst[i] = VkBorderColor.fromValue(val);
        }        
        return dst;
    }
    
    /**
     * Check is a given flagA is bitwise ORed with flagB
     * @param flagA - flag to test
     * @param flagB - flag to test
     * @return true if flagA bit
     */
    public static boolean isORed(VkBorderColor flagA, VkBorderColor flagB){
        int valA = flagA.getValue();
        int valB = flagB.getValue();
        return (valA & valB) == valB;
    }


    /** private ctor */
    private VkBorderColor(String name, int ordinal, int v) {
       super(name, ordinal, v);
       values[ordinal] = this;
    }

 } // end of class VkBorderColor
