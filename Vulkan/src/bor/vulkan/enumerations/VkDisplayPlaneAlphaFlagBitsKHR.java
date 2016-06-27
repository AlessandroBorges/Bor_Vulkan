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
 * Class to wrap Vulkan enumeration VkDisplayPlaneAlphaFlagBitsKHR
 *
 * <h3>Prototype</h3> <pre>
 * typedef enum VkDisplayPlaneAlphaFlagBitsKHR {
 *     VK_DISPLAY_PLANE_ALPHA_OPAQUE_BIT_KHR = 0x00000001,
 *     VK_DISPLAY_PLANE_ALPHA_GLOBAL_BIT_KHR = 0x00000002,
 *     VK_DISPLAY_PLANE_ALPHA_PER_PIXEL_BIT_KHR = 0x00000004,
 *     VK_DISPLAY_PLANE_ALPHA_PER_PIXEL_PREMULTIPLIED_BIT_KHR = 0x00000008,
 *     VK_DISPLAY_PLANE_ALPHA_FLAG_BITS_MAX_ENUM_KHR = 0x7FFFFFFF
 * } VkDisplayPlaneAlphaFlagBitsKHR;
 * </pre>
 * @author Alessandro Borges
 */
public class VkDisplayPlaneAlphaFlagBitsKHR extends IntEnum<VkDisplayPlaneAlphaFlagBitsKHR> {


   /** class */
   private static final Class<VkDisplayPlaneAlphaFlagBitsKHR> myClass = VkDisplayPlaneAlphaFlagBitsKHR.class;

   /** values */
   private static VkDisplayPlaneAlphaFlagBitsKHR[] values = new VkDisplayPlaneAlphaFlagBitsKHR[4];

   public static final VkDisplayPlaneAlphaFlagBitsKHR VK_DISPLAY_PLANE_ALPHA_OPAQUE_BIT_KHR = new VkDisplayPlaneAlphaFlagBitsKHR("VK_DISPLAY_PLANE_ALPHA_OPAQUE_BIT_KHR", 0, 0x00000001);
   public static final VkDisplayPlaneAlphaFlagBitsKHR VK_DISPLAY_PLANE_ALPHA_GLOBAL_BIT_KHR = new VkDisplayPlaneAlphaFlagBitsKHR("VK_DISPLAY_PLANE_ALPHA_GLOBAL_BIT_KHR", 1, 0x00000002);
   public static final VkDisplayPlaneAlphaFlagBitsKHR VK_DISPLAY_PLANE_ALPHA_PER_PIXEL_BIT_KHR = new VkDisplayPlaneAlphaFlagBitsKHR("VK_DISPLAY_PLANE_ALPHA_PER_PIXEL_BIT_KHR", 2, 0x00000004);
   public static final VkDisplayPlaneAlphaFlagBitsKHR VK_DISPLAY_PLANE_ALPHA_PER_PIXEL_PREMULTIPLIED_BIT_KHR = new VkDisplayPlaneAlphaFlagBitsKHR("VK_DISPLAY_PLANE_ALPHA_PER_PIXEL_PREMULTIPLIED_BIT_KHR", 3, 0x00000008);
   
   /**
    * Return all values available in this enumeration
    * @return Array of avail. VkAccessFlagBits
    */
    @SuppressWarnings("unchecked")
    public static VkDisplayPlaneAlphaFlagBitsKHR[] values(){
            return values;
    }

	/**
	 * Get class of this enumeration
	 */
    protected static Class<VkDisplayPlaneAlphaFlagBitsKHR> myGetClass(){
        return myClass;
    }

    /**
     * Creates a bitwise ORed enumeration
     * @param bits - list of enumerations to bitwise OR 
     * @return an enumeration of ORed bits 
     */
    public static VkDisplayPlaneAlphaFlagBitsKHR or(VkDisplayPlaneAlphaFlagBitsKHR...bits){
        int value = bits[0].getValue();        
        for (int i=1; i<bits.length; i++) {
            VkDisplayPlaneAlphaFlagBitsKHR item = bits[i];
            value |= item.getValue();
        } 
        String name = myGetClass().getSimpleName() + " from bitwise Operation.[" + value +"]";
        VkDisplayPlaneAlphaFlagBitsKHR ored = new VkDisplayPlaneAlphaFlagBitsKHR(name, -1, value);        
        return ored;
    }
    
    /**
     * Creates a enumeration of this class, if valid. 
     * If you try to create a invalid enumeration it will raise a exception.
     * @param value - a valid enumeration value or ar ORed value.
     * @return a instance of VkDisplayPlaneAlphaFlagBitsKHR from value. NULL if it is invalid value.
     */
    public static VkDisplayPlaneAlphaFlagBitsKHR fromValue(int value){
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
        VkDisplayPlaneAlphaFlagBitsKHR flag = new VkDisplayPlaneAlphaFlagBitsKHR(name, -1, value); 
        return flag;
    }
    
    /**
     * Check is a given flagA is bitwise ORed with flagB
     * @param flagA - flag to test
     * @param flagB - flag to test
     * @return true if flagA bit
     */
    public static boolean isORed(VkDisplayPlaneAlphaFlagBitsKHR flagA, VkDisplayPlaneAlphaFlagBitsKHR flagB){
        int valA = flagA.getValue();
        int valB = flagB.getValue();
        return (valA & valB) == valB;
    }


    /** private ctor */
    private VkDisplayPlaneAlphaFlagBitsKHR(String name, int ordinal, int v) {
       super(name, ordinal, v);
       values[ordinal] = this;
    }

 } // end of class VkDisplayPlaneAlphaFlagBitsKHR
