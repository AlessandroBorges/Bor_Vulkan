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
 * Class to wrap Vulkan enumeration VkImageViewType
 *
 * <h3>Prototype</h3> <pre>
 * typedef enum VkImageViewType {
 *     VK_IMAGE_VIEW_TYPE_1D = 0,
 *     VK_IMAGE_VIEW_TYPE_2D = 1,
 *     VK_IMAGE_VIEW_TYPE_3D = 2,
 *     VK_IMAGE_VIEW_TYPE_CUBE = 3,
 *     VK_IMAGE_VIEW_TYPE_1D_ARRAY = 4,
 *     VK_IMAGE_VIEW_TYPE_2D_ARRAY = 5,
 *     VK_IMAGE_VIEW_TYPE_CUBE_ARRAY = 6,
 *     VK_IMAGE_VIEW_TYPE_BEGIN_RANGE = VK_IMAGE_VIEW_TYPE_1D,
 *     VK_IMAGE_VIEW_TYPE_END_RANGE = VK_IMAGE_VIEW_TYPE_CUBE_ARRAY,
 *     VK_IMAGE_VIEW_TYPE_RANGE_SIZE = (VK_IMAGE_VIEW_TYPE_CUBE_ARRAY - VK_IMAGE_VIEW_TYPE_1D + 1),
 *     VK_IMAGE_VIEW_TYPE_MAX_ENUM = 0x7FFFFFFF
 * } VkImageViewType;
 * </pre>
 * @author Alessandro Borges
 */
public class VkImageViewType extends IntEnum<VkImageViewType> {


   /** class */
   private static final Class<VkImageViewType> myClass = VkImageViewType.class;

   /** values */
   private static VkImageViewType[] values = new VkImageViewType[7];

   public static final VkImageViewType VK_IMAGE_VIEW_TYPE_1D = new VkImageViewType("VK_IMAGE_VIEW_TYPE_1D", 0, 0);
   public static final VkImageViewType VK_IMAGE_VIEW_TYPE_2D = new VkImageViewType("VK_IMAGE_VIEW_TYPE_2D", 1, 1);
   public static final VkImageViewType VK_IMAGE_VIEW_TYPE_3D = new VkImageViewType("VK_IMAGE_VIEW_TYPE_3D", 2, 2);
   public static final VkImageViewType VK_IMAGE_VIEW_TYPE_CUBE = new VkImageViewType("VK_IMAGE_VIEW_TYPE_CUBE", 3, 3);
   public static final VkImageViewType VK_IMAGE_VIEW_TYPE_1D_ARRAY = new VkImageViewType("VK_IMAGE_VIEW_TYPE_1D_ARRAY", 4, 4);
   public static final VkImageViewType VK_IMAGE_VIEW_TYPE_2D_ARRAY = new VkImageViewType("VK_IMAGE_VIEW_TYPE_2D_ARRAY", 5, 5);
   public static final VkImageViewType VK_IMAGE_VIEW_TYPE_CUBE_ARRAY = new VkImageViewType("VK_IMAGE_VIEW_TYPE_CUBE_ARRAY", 6, 6);
   
   /**
    * Return all values available in this enumeration
    * @return Array of avail. VkAccessFlagBits
    */
    @SuppressWarnings("unchecked")
    public static VkImageViewType[] values(){
            return values;
    }

	/**
	 * Get class of this enumeration
	 */
    protected static Class<VkImageViewType> myGetClass(){
        return myClass;
    }

    /**
     * Creates a bitwise ORed enumeration
     * @param bits - list of enumerations to bitwise OR 
     * @return an enumeration of ORed bits 
     */
    public static VkImageViewType or(VkImageViewType...bits){
        int value = bits[0].getValue();        
        for (int i=1; i<bits.length; i++) {
            VkImageViewType item = bits[i];
            value |= item.getValue();
        } 
        String name = myGetClass().getSimpleName() + " from bitwise Operation.[" + value +"]";
        VkImageViewType ored = new VkImageViewType(name, -1, value);        
        return ored;
    }
    
    /**
     * Creates a enumeration of this class, if valid. 
     * If you try to create a invalid enumeration it will raise a exception.
     * @param value - a valid enumeration value or ar ORed value.
     * @return a instance of VkImageViewType from value. NULL if it is invalid value.
     */
    public static VkImageViewType fromValue(int value){
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
        VkImageViewType flag = new VkImageViewType(name, -1, value); 
        return flag;
    }
    
    /**
     * Check is a given flagA is bitwise ORed with flagB
     * @param flagA - flag to test
     * @param flagB - flag to test
     * @return true if flagA bit
     */
    public static boolean isORed(VkImageViewType flagA, VkImageViewType flagB){
        int valA = flagA.getValue();
        int valB = flagB.getValue();
        return (valA & valB) == valB;
    }


    /** private ctor */
    private VkImageViewType(String name, int ordinal, int v) {
       super(name, ordinal, v);
       values[ordinal] = this;
    }

 } // end of class VkImageViewType
