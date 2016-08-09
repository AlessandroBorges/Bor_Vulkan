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
 * Class to wrap Vulkan enumeration VkStencilFaceFlagBits
 *
 * <h3>Prototype</h3> <pre>
 * typedef enum VkStencilFaceFlagBits {
 *     VK_STENCIL_FACE_FRONT_BIT = 0x00000001,
 *     VK_STENCIL_FACE_BACK_BIT = 0x00000002,
 *     VK_STENCIL_FRONT_AND_BACK = 0x00000003,
 *     VK_STENCIL_FACE_FLAG_BITS_MAX_ENUM = 0x7FFFFFFF
 * } VkStencilFaceFlagBits;
 * </pre>
 * @author Alessandro Borges
 */
public class VkStencilFaceFlagBits extends IntEnum<VkStencilFaceFlagBits> {


   /** class */
   private static final Class<VkStencilFaceFlagBits> myClass = VkStencilFaceFlagBits.class;

   /** values */
   private static VkStencilFaceFlagBits[] values = new VkStencilFaceFlagBits[3];

   public static final VkStencilFaceFlagBits VK_STENCIL_FACE_FRONT_BIT = new VkStencilFaceFlagBits("VK_STENCIL_FACE_FRONT_BIT", 0, 0x00000001);
   public static final VkStencilFaceFlagBits VK_STENCIL_FACE_BACK_BIT = new VkStencilFaceFlagBits("VK_STENCIL_FACE_BACK_BIT", 1, 0x00000002);
   public static final VkStencilFaceFlagBits VK_STENCIL_FRONT_AND_BACK = new VkStencilFaceFlagBits("VK_STENCIL_FRONT_AND_BACK", 2, 0x00000003);
   
   /**
    * Return all values available in this enumeration
    * @return Array of avail. VkAccessFlagBits
    */
    @SuppressWarnings("unchecked")
    public static VkStencilFaceFlagBits[] values(){
            return values;
    }

	/**
	 * Get class of this enumeration
	 */
    protected static Class<VkStencilFaceFlagBits> myGetClass(){
        return myClass;
    }

    /**
     * Creates a bitwise ORed enumeration
     * @param bits - list of enumerations to bitwise OR 
     * @return an enumeration of ORed bits 
     */
    public static VkStencilFaceFlagBits or(VkStencilFaceFlagBits...bits){
        int value = bits[0].getValue();        
        for (int i=1; i<bits.length; i++) {
            VkStencilFaceFlagBits item = bits[i];
            value |= item.getValue();
        } 
        String name = myGetClass().getSimpleName() + " from bitwise Operation.[" + value +"]";
        VkStencilFaceFlagBits ored = new VkStencilFaceFlagBits(name, -1, value);        
        return ored;
    }
    
    /**
     * Creates a enumeration of this class, if valid. 
     * If you try to create a invalid enumeration it will raise a exception.
     * @param value - a valid enumeration value or ar ORed value.
     * @return a instance of VkStencilFaceFlagBits from value. NULL if it is invalid value.
     */
    public static VkStencilFaceFlagBits fromValue(int value){
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
        VkStencilFaceFlagBits flag = new VkStencilFaceFlagBits(name, -1, value); 
        return flag;
    }
    
    /**
     * Check is a given flagA is bitwise ORed with flagB
     * @param flagA - flag to test
     * @param flagB - flag to test
     * @return true if flagA bit
     */
    public static boolean isORed(VkStencilFaceFlagBits flagA, VkStencilFaceFlagBits flagB){
        int valA = flagA.getValue();
        int valB = flagB.getValue();
        return (valA & valB) == valB;
    }


    /** private ctor */
    private VkStencilFaceFlagBits(String name, int ordinal, int v) {
       super(name, ordinal, v);
       values[ordinal] = this;
    }

 } // end of class VkStencilFaceFlagBits
