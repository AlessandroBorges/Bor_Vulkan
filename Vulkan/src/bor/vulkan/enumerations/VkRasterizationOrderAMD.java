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
 * Class to wrap Vulkan enumeration VkRasterizationOrderAMD
 *
 * <h3>Prototype</h3> <pre>
 * typedef enum VkRasterizationOrderAMD {
 *     VK_RASTERIZATION_ORDER_STRICT_AMD = 0,
 *     VK_RASTERIZATION_ORDER_RELAXED_AMD = 1,
 *     VK_RASTERIZATION_ORDER_BEGIN_RANGE_AMD = VK_RASTERIZATION_ORDER_STRICT_AMD,
 *     VK_RASTERIZATION_ORDER_END_RANGE_AMD = VK_RASTERIZATION_ORDER_RELAXED_AMD,
 *     VK_RASTERIZATION_ORDER_RANGE_SIZE_AMD = (VK_RASTERIZATION_ORDER_RELAXED_AMD - VK_RASTERIZATION_ORDER_STRICT_AMD + 1),
 *     VK_RASTERIZATION_ORDER_MAX_ENUM_AMD = 0x7FFFFFFF
 * } VkRasterizationOrderAMD;
 * </pre>
 * @author Alessandro Borges
 */
public class VkRasterizationOrderAMD extends IntEnum<VkRasterizationOrderAMD> {


   /** class */
   private static final Class<VkRasterizationOrderAMD> myClass = VkRasterizationOrderAMD.class;

   /** values */
   private static VkRasterizationOrderAMD[] values = new VkRasterizationOrderAMD[2];

   public static final VkRasterizationOrderAMD VK_RASTERIZATION_ORDER_STRICT_AMD = new VkRasterizationOrderAMD("VK_RASTERIZATION_ORDER_STRICT_AMD", 0, 0);
   public static final VkRasterizationOrderAMD VK_RASTERIZATION_ORDER_RELAXED_AMD = new VkRasterizationOrderAMD("VK_RASTERIZATION_ORDER_RELAXED_AMD", 1, 1);
   
   /**
    * Return all values available in this enumeration
    * @return Array of avail. VkAccessFlagBits
    */
    @SuppressWarnings("unchecked")
    public static VkRasterizationOrderAMD[] values(){
            return values;
    }

	/**
	 * Get class of this enumeration
	 */
    protected static Class<VkRasterizationOrderAMD> myGetClass(){
        return myClass;
    }

    /**
     * Creates a bitwise ORed enumeration
     * @param bits - list of enumerations to bitwise OR 
     * @return an enumeration of ORed bits 
     */
    public static VkRasterizationOrderAMD or(VkRasterizationOrderAMD...bits){
        int value = bits[0].getValue();        
        for (int i=1; i<bits.length; i++) {
            VkRasterizationOrderAMD item = bits[i];
            value |= item.getValue();
        } 
        String name = myGetClass().getSimpleName() + " from bitwise Operation.[" + value +"]";
        VkRasterizationOrderAMD ored = new VkRasterizationOrderAMD(name, -1, value);        
        return ored;
    }
    
    /**
     * Creates a enumeration of this class, if valid. 
     * If you try to create a invalid enumeration it will raise a exception.
     * @param value - a valid enumeration value or ar ORed value.
     * @return a instance of VkRasterizationOrderAMD from value. NULL if it is invalid value.
     */
    public static VkRasterizationOrderAMD fromValue(int value){
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
        VkRasterizationOrderAMD flag = new VkRasterizationOrderAMD(name, -1, value); 
        return flag;
    }
    
    /**
     * Check is a given flagA is bitwise ORed with flagB
     * @param flagA - flag to test
     * @param flagB - flag to test
     * @return true if flagA bit
     */
    public static boolean isORed(VkRasterizationOrderAMD flagA, VkRasterizationOrderAMD flagB){
        int valA = flagA.getValue();
        int valB = flagB.getValue();
        return (valA & valB) == valB;
    }


    /** private ctor */
    private VkRasterizationOrderAMD(String name, int ordinal, int v) {
       super(name, ordinal, v);
       values[ordinal] = this;
    }

 } // end of class VkRasterizationOrderAMD
