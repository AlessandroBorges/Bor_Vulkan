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
 * Class to wrap Vulkan enumeration VkDynamicState
 *
 * <h3>Prototype</h3> <pre>
 * typedef enum VkDynamicState {
 *     VK_DYNAMIC_STATE_VIEWPORT = 0,
 *     VK_DYNAMIC_STATE_SCISSOR = 1,
 *     VK_DYNAMIC_STATE_LINE_WIDTH = 2,
 *     VK_DYNAMIC_STATE_DEPTH_BIAS = 3,
 *     VK_DYNAMIC_STATE_BLEND_CONSTANTS = 4,
 *     VK_DYNAMIC_STATE_DEPTH_BOUNDS = 5,
 *     VK_DYNAMIC_STATE_STENCIL_COMPARE_MASK = 6,
 *     VK_DYNAMIC_STATE_STENCIL_WRITE_MASK = 7,
 *     VK_DYNAMIC_STATE_STENCIL_REFERENCE = 8,
 *     VK_DYNAMIC_STATE_BEGIN_RANGE = VK_DYNAMIC_STATE_VIEWPORT,
 *     VK_DYNAMIC_STATE_END_RANGE = VK_DYNAMIC_STATE_STENCIL_REFERENCE,
 *     VK_DYNAMIC_STATE_RANGE_SIZE = (VK_DYNAMIC_STATE_STENCIL_REFERENCE - VK_DYNAMIC_STATE_VIEWPORT + 1),
 *     VK_DYNAMIC_STATE_MAX_ENUM = 0x7FFFFFFF
 * } VkDynamicState;
 * </pre>
 * @author Alessandro Borges
 */
public class VkDynamicState extends IntEnum<VkDynamicState> {


   /** class */
   private static final Class<VkDynamicState> myClass = VkDynamicState.class;

   /** values */
   private static VkDynamicState[] values = new VkDynamicState[9];

   public static final VkDynamicState VK_DYNAMIC_STATE_VIEWPORT = new VkDynamicState("VK_DYNAMIC_STATE_VIEWPORT", 0, 0);
   public static final VkDynamicState VK_DYNAMIC_STATE_SCISSOR = new VkDynamicState("VK_DYNAMIC_STATE_SCISSOR", 1, 1);
   public static final VkDynamicState VK_DYNAMIC_STATE_LINE_WIDTH = new VkDynamicState("VK_DYNAMIC_STATE_LINE_WIDTH", 2, 2);
   public static final VkDynamicState VK_DYNAMIC_STATE_DEPTH_BIAS = new VkDynamicState("VK_DYNAMIC_STATE_DEPTH_BIAS", 3, 3);
   public static final VkDynamicState VK_DYNAMIC_STATE_BLEND_CONSTANTS = new VkDynamicState("VK_DYNAMIC_STATE_BLEND_CONSTANTS", 4, 4);
   public static final VkDynamicState VK_DYNAMIC_STATE_DEPTH_BOUNDS = new VkDynamicState("VK_DYNAMIC_STATE_DEPTH_BOUNDS", 5, 5);
   public static final VkDynamicState VK_DYNAMIC_STATE_STENCIL_COMPARE_MASK = new VkDynamicState("VK_DYNAMIC_STATE_STENCIL_COMPARE_MASK", 6, 6);
   public static final VkDynamicState VK_DYNAMIC_STATE_STENCIL_WRITE_MASK = new VkDynamicState("VK_DYNAMIC_STATE_STENCIL_WRITE_MASK", 7, 7);
   public static final VkDynamicState VK_DYNAMIC_STATE_STENCIL_REFERENCE = new VkDynamicState("VK_DYNAMIC_STATE_STENCIL_REFERENCE", 8, 8);
   
   /**
    * Return all values available in this enumeration
    * @return Array of avail. VkAccessFlagBits
    */
    @SuppressWarnings("unchecked")
    public static VkDynamicState[] values(){
            return values;
    }

	/**
	 * Get class of this enumeration
	 */
    protected static Class<VkDynamicState> myGetClass(){
        return myClass;
    }

    /**
     * Creates a bitwise ORed enumeration
     * @param bits - list of enumerations to bitwise OR 
     * @return an enumeration of ORed bits 
     */
    public static VkDynamicState or(VkDynamicState...bits){
        int value = bits[0].getValue();        
        for (int i=1; i<bits.length; i++) {
            VkDynamicState item = bits[i];
            value |= item.getValue();
        } 
        String name = myGetClass().getSimpleName() + " from bitwise Operation.[" + value +"]";
        VkDynamicState ored = new VkDynamicState(name, -1, value);        
        return ored;
    }
    
    /**
     * Creates a enumeration of this class, if valid. 
     * If you try to create a invalid enumeration it will raise a exception.
     * @param value - a valid enumeration value or ar ORed value.
     * @return a instance of VkDynamicState from value. NULL if it is invalid value.
     */
    public static VkDynamicState fromValue(int value){
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
        VkDynamicState flag = new VkDynamicState(name, -1, value); 
        return flag;
    }
    
    /**
     * Check is a given flagA is bitwise ORed with flagB
     * @param flagA - flag to test
     * @param flagB - flag to test
     * @return true if flagA bit
     */
    public static boolean isORed(VkDynamicState flagA, VkDynamicState flagB){
        int valA = flagA.getValue();
        int valB = flagB.getValue();
        return (valA & valB) == valB;
    }


    /** private ctor */
    private VkDynamicState(String name, int ordinal, int v) {
       super(name, ordinal, v);
       values[ordinal] = this;
    }

 } // end of class VkDynamicState
