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
 * Class to wrap Vulkan enumeration VkFrontFace
 *
 * <h3>Prototype</h3> <pre>
 * typedef enum VkFrontFace {
 *     VK_FRONT_FACE_COUNTER_CLOCKWISE = 0,
 *     VK_FRONT_FACE_CLOCKWISE = 1,
 *     VK_FRONT_FACE_BEGIN_RANGE = VK_FRONT_FACE_COUNTER_CLOCKWISE,
 *     VK_FRONT_FACE_END_RANGE = VK_FRONT_FACE_CLOCKWISE,
 *     VK_FRONT_FACE_RANGE_SIZE = (VK_FRONT_FACE_CLOCKWISE - VK_FRONT_FACE_COUNTER_CLOCKWISE + 1),
 *     VK_FRONT_FACE_MAX_ENUM = 0x7FFFFFFF
 * } VkFrontFace;
 * </pre>
 * @author Alessandro Borges
 */
public class VkFrontFace extends IntEnum<VkFrontFace> {


   /** class */
   private static final Class<VkFrontFace> myClass = VkFrontFace.class;

   /** values */
   private static VkFrontFace[] values = new VkFrontFace[2];

   public static final VkFrontFace VK_FRONT_FACE_COUNTER_CLOCKWISE = new VkFrontFace("VK_FRONT_FACE_COUNTER_CLOCKWISE", 0, 0);
   public static final VkFrontFace VK_FRONT_FACE_CLOCKWISE = new VkFrontFace("VK_FRONT_FACE_CLOCKWISE", 1, 1);
   
   /**
    * Return all values available in this enumeration
    * @return Array of avail. VkAccessFlagBits
    */
    @SuppressWarnings("unchecked")
    public static VkFrontFace[] values(){
            return values;
    }

	/**
	 * Get class of this enumeration
	 */
    protected static Class<VkFrontFace> myGetClass(){
        return myClass;
    }

    /**
     * Creates a bitwise ORed enumeration
     * @param bits - list of enumerations to bitwise OR 
     * @return an enumeration of ORed bits 
     */
    public static VkFrontFace or(VkFrontFace...bits){
        int value = bits[0].getValue();        
        for (int i=1; i<bits.length; i++) {
            VkFrontFace item = bits[i];
            value |= item.getValue();
        } 
        String name = myGetClass().getSimpleName() + " from bitwise Operation.[" + value +"]";
        VkFrontFace ored = new VkFrontFace(name, -1, value);        
        return ored;
    }
    
    /**
     * Creates a enumeration of this class, if valid. 
     * If you try to create a invalid enumeration it will raise a exception.
     * @param value - a valid enumeration value or ar ORed value.
     * @return a instance of VkFrontFace from value. NULL if it is invalid value.
     */
    public static VkFrontFace fromValue(int value){
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
        VkFrontFace flag = new VkFrontFace(name, -1, value); 
        return flag;
    }
    
    /**
     * Check is a given flagA is bitwise ORed with flagB
     * @param flagA - flag to test
     * @param flagB - flag to test
     * @return true if flagA bit
     */
    public static boolean isORed(VkFrontFace flagA, VkFrontFace flagB){
        int valA = flagA.getValue();
        int valB = flagB.getValue();
        return (valA & valB) == valB;
    }


    /** private ctor */
    private VkFrontFace(String name, int ordinal, int v) {
       super(name, ordinal, v);
       values[ordinal] = this;
    }

 } // end of class VkFrontFace
