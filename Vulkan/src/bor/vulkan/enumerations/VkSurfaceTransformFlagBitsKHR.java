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
 * Class to wrap Vulkan enumeration VkSurfaceTransformFlagBitsKHR
 *
 * <h3>Prototype</h3> <pre>
 * typedef enum VkSurfaceTransformFlagBitsKHR {
 *     VK_SURFACE_TRANSFORM_IDENTITY_BIT_KHR = 0x00000001,
 *     VK_SURFACE_TRANSFORM_ROTATE_90_BIT_KHR = 0x00000002,
 *     VK_SURFACE_TRANSFORM_ROTATE_180_BIT_KHR = 0x00000004,
 *     VK_SURFACE_TRANSFORM_ROTATE_270_BIT_KHR = 0x00000008,
 *     VK_SURFACE_TRANSFORM_HORIZONTAL_MIRROR_BIT_KHR = 0x00000010,
 *     VK_SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_90_BIT_KHR = 0x00000020,
 *     VK_SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_180_BIT_KHR = 0x00000040,
 *     VK_SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_270_BIT_KHR = 0x00000080,
 *     VK_SURFACE_TRANSFORM_INHERIT_BIT_KHR = 0x00000100,
 * } VkSurfaceTransformFlagBitsKHR;
 * </pre>
 * @author Alessandro Borges
 */
public class VkSurfaceTransformFlagBitsKHR extends IntEnum<VkSurfaceTransformFlagBitsKHR> {


   /** class */
   private static final Class<VkSurfaceTransformFlagBitsKHR> myClass = VkSurfaceTransformFlagBitsKHR.class;

   /** values */
   private static VkSurfaceTransformFlagBitsKHR[] values = new VkSurfaceTransformFlagBitsKHR[9];

   public static final VkSurfaceTransformFlagBitsKHR VK_SURFACE_TRANSFORM_IDENTITY_BIT_KHR = new VkSurfaceTransformFlagBitsKHR("VK_SURFACE_TRANSFORM_IDENTITY_BIT_KHR", 0, 0x00000001);
   public static final VkSurfaceTransformFlagBitsKHR VK_SURFACE_TRANSFORM_ROTATE_90_BIT_KHR = new VkSurfaceTransformFlagBitsKHR("VK_SURFACE_TRANSFORM_ROTATE_90_BIT_KHR", 1, 0x00000002);
   public static final VkSurfaceTransformFlagBitsKHR VK_SURFACE_TRANSFORM_ROTATE_180_BIT_KHR = new VkSurfaceTransformFlagBitsKHR("VK_SURFACE_TRANSFORM_ROTATE_180_BIT_KHR", 2, 0x00000004);
   public static final VkSurfaceTransformFlagBitsKHR VK_SURFACE_TRANSFORM_ROTATE_270_BIT_KHR = new VkSurfaceTransformFlagBitsKHR("VK_SURFACE_TRANSFORM_ROTATE_270_BIT_KHR", 3, 0x00000008);
   public static final VkSurfaceTransformFlagBitsKHR VK_SURFACE_TRANSFORM_HORIZONTAL_MIRROR_BIT_KHR = new VkSurfaceTransformFlagBitsKHR("VK_SURFACE_TRANSFORM_HORIZONTAL_MIRROR_BIT_KHR", 4, 0x00000010);
   public static final VkSurfaceTransformFlagBitsKHR VK_SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_90_BIT_KHR = new VkSurfaceTransformFlagBitsKHR("VK_SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_90_BIT_KHR", 5, 0x00000020);
   public static final VkSurfaceTransformFlagBitsKHR VK_SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_180_BIT_KHR = new VkSurfaceTransformFlagBitsKHR("VK_SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_180_BIT_KHR", 6, 0x00000040);
   public static final VkSurfaceTransformFlagBitsKHR VK_SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_270_BIT_KHR = new VkSurfaceTransformFlagBitsKHR("VK_SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_270_BIT_KHR", 7, 0x00000080);
   public static final VkSurfaceTransformFlagBitsKHR VK_SURFACE_TRANSFORM_INHERIT_BIT_KHR = new VkSurfaceTransformFlagBitsKHR("VK_SURFACE_TRANSFORM_INHERIT_BIT_KHR", 8, 0x00000100);
   
   /**
    * Return all values available in this enumeration
    * @return Array of avail. VkAccessFlagBits
    */
    @SuppressWarnings("unchecked")
    public static VkSurfaceTransformFlagBitsKHR[] values(){
            return values;
    }

	/**
	 * Get class of this enumeration
	 */
    protected static Class<VkSurfaceTransformFlagBitsKHR> myGetClass(){
        return myClass;
    }

    /**
     * Creates a bitwise ORed enumeration
     * @param bits - list of enumerations to bitwise OR 
     * @return an enumeration of ORed bits 
     */
    public static VkSurfaceTransformFlagBitsKHR or(VkSurfaceTransformFlagBitsKHR...bits){
        int value = bits[0].getValue();        
        for (int i=1; i<bits.length; i++) {
            VkSurfaceTransformFlagBitsKHR item = bits[i];
            value |= item.getValue();
        } 
        String name = myGetClass().getSimpleName() + " from bitwise Operation.[" + value +"]";
        VkSurfaceTransformFlagBitsKHR ored = new VkSurfaceTransformFlagBitsKHR(name, -1, value);        
        return ored;
    }
    
    /**
     * Creates a enumeration of this class, if valid. 
     * If you try to create a invalid enumeration it will raise a exception.
     * @param value - a valid enumeration value or ar ORed value.
     * @return a instance of VkSurfaceTransformFlagBitsKHR from value. NULL if it is invalid value.
     */
    public static VkSurfaceTransformFlagBitsKHR fromValue(int value){
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
        VkSurfaceTransformFlagBitsKHR flag = new VkSurfaceTransformFlagBitsKHR(name, -1, value); 
        return flag;
    }
    
    /**
     * Check is a given flagA is bitwise ORed with flagB
     * @param flagA - flag to test
     * @param flagB - flag to test
     * @return true if flagA bit
     */
    public static boolean isORed(VkSurfaceTransformFlagBitsKHR flagA, VkSurfaceTransformFlagBitsKHR flagB){
        int valA = flagA.getValue();
        int valB = flagB.getValue();
        return (valA & valB) == valB;
    }


    /** private ctor */
    private VkSurfaceTransformFlagBitsKHR(String name, int ordinal, int v) {
       super(name, ordinal, v);
       values[ordinal] = this;
    }

 } // end of class VkSurfaceTransformFlagBitsKHR
