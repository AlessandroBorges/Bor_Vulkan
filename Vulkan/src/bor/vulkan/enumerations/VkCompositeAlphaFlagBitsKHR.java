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
 * Class to wrap Vulkan enumeration VkCompositeAlphaFlagBitsKHR
 *
 * <h3>Prototype</h3> <pre>
 * typedef enum VkCompositeAlphaFlagBitsKHR {
 *     VK_COMPOSITE_ALPHA_OPAQUE_BIT_KHR = 0x00000001,
 *     VK_COMPOSITE_ALPHA_PRE_MULTIPLIED_BIT_KHR = 0x00000002,
 *     VK_COMPOSITE_ALPHA_POST_MULTIPLIED_BIT_KHR = 0x00000004,
 *     VK_COMPOSITE_ALPHA_INHERIT_BIT_KHR = 0x00000008,
 *     VK_COMPOSITE_ALPHA_FLAG_BITS_MAX_ENUM_KHR = 0x7FFFFFFF
 * } VkCompositeAlphaFlagBitsKHR;
 * </pre>
 * @author Alessandro Borges
 */
public class VkCompositeAlphaFlagBitsKHR extends IntEnum<VkCompositeAlphaFlagBitsKHR> {


   /** class */
   private static final Class<VkCompositeAlphaFlagBitsKHR> myClass = VkCompositeAlphaFlagBitsKHR.class;

   /** values */
   private static VkCompositeAlphaFlagBitsKHR[] values = new VkCompositeAlphaFlagBitsKHR[4];

   public static final VkCompositeAlphaFlagBitsKHR VK_COMPOSITE_ALPHA_OPAQUE_BIT_KHR = new VkCompositeAlphaFlagBitsKHR("VK_COMPOSITE_ALPHA_OPAQUE_BIT_KHR", 0, 0x00000001);
   public static final VkCompositeAlphaFlagBitsKHR VK_COMPOSITE_ALPHA_PRE_MULTIPLIED_BIT_KHR = new VkCompositeAlphaFlagBitsKHR("VK_COMPOSITE_ALPHA_PRE_MULTIPLIED_BIT_KHR", 1, 0x00000002);
   public static final VkCompositeAlphaFlagBitsKHR VK_COMPOSITE_ALPHA_POST_MULTIPLIED_BIT_KHR = new VkCompositeAlphaFlagBitsKHR("VK_COMPOSITE_ALPHA_POST_MULTIPLIED_BIT_KHR", 2, 0x00000004);
   public static final VkCompositeAlphaFlagBitsKHR VK_COMPOSITE_ALPHA_INHERIT_BIT_KHR = new VkCompositeAlphaFlagBitsKHR("VK_COMPOSITE_ALPHA_INHERIT_BIT_KHR", 3, 0x00000008);
   
   /**
    * Return all values available in this enumeration
    * @return Array of avail. VkAccessFlagBits
    */
    @SuppressWarnings("unchecked")
    public static VkCompositeAlphaFlagBitsKHR[] values(){
            return values;
    }

	/**
	 * Get class of this enumeration
	 */
    protected static Class<VkCompositeAlphaFlagBitsKHR> myGetClass(){
        return myClass;
    }

    /**
     * Creates a bitwise ORed enumeration
     * @param bits - list of enumerations to bitwise OR 
     * @return an enumeration of ORed bits 
     */
    public static VkCompositeAlphaFlagBitsKHR or(VkCompositeAlphaFlagBitsKHR...bits){
        int value = bits[0].getValue();        
        for (int i=1; i<bits.length; i++) {
            VkCompositeAlphaFlagBitsKHR item = bits[i];
            value |= item.getValue();
        } 
        String name = myGetClass().getSimpleName() + " from bitwise Operation.[" + value +"]";
        VkCompositeAlphaFlagBitsKHR ored = new VkCompositeAlphaFlagBitsKHR(name, -1, value);        
        return ored;
    }
    
    /**
     * Creates a enumeration of this class, if valid. 
     * If you try to create a invalid enumeration it will raise a exception.
     * @param value - a valid enumeration value or ar ORed value.
     * @return a instance of VkCompositeAlphaFlagBitsKHR from value. NULL if it is invalid value.
     */
    public static VkCompositeAlphaFlagBitsKHR fromValue(int value){
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
        VkCompositeAlphaFlagBitsKHR flag = new VkCompositeAlphaFlagBitsKHR(name, -1, value); 
        return flag;
    }
    
    /**
     * Check is a given flagA is bitwise ORed with flagB
     * @param flagA - flag to test
     * @param flagB - flag to test
     * @return true if flagA bit
     */
    public static boolean isORed(VkCompositeAlphaFlagBitsKHR flagA, VkCompositeAlphaFlagBitsKHR flagB){
        int valA = flagA.getValue();
        int valB = flagB.getValue();
        return (valA & valB) == valB;
    }


    /** private ctor */
    private VkCompositeAlphaFlagBitsKHR(String name, int ordinal, int v) {
       super(name, ordinal, v);
       values[ordinal] = this;
    }

 } // end of class VkCompositeAlphaFlagBitsKHR
