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
 * Class to wrap Vulkan enumeration VkPipelineCreateFlagBits
 *
 * <h3>Prototype</h3> <pre>
 * typedef enum VkPipelineCreateFlagBits {
 *     VK_PIPELINE_CREATE_DISABLE_OPTIMIZATION_BIT = 0x00000001,
 *     VK_PIPELINE_CREATE_ALLOW_DERIVATIVES_BIT = 0x00000002,
 *     VK_PIPELINE_CREATE_DERIVATIVE_BIT = 0x00000004,
 *     VK_PIPELINE_CREATE_FLAG_BITS_MAX_ENUM = 0x7FFFFFFF
 * } VkPipelineCreateFlagBits;
 * </pre>
 * @author Alessandro Borges
 */
public class VkPipelineCreateFlagBits extends IntEnum<VkPipelineCreateFlagBits> {


   /** class */
   private static final Class<VkPipelineCreateFlagBits> myClass = VkPipelineCreateFlagBits.class;

   /** values */
   private static VkPipelineCreateFlagBits[] values = new VkPipelineCreateFlagBits[3];

   public static final VkPipelineCreateFlagBits VK_PIPELINE_CREATE_DISABLE_OPTIMIZATION_BIT = new VkPipelineCreateFlagBits("VK_PIPELINE_CREATE_DISABLE_OPTIMIZATION_BIT", 0, 0x00000001);
   public static final VkPipelineCreateFlagBits VK_PIPELINE_CREATE_ALLOW_DERIVATIVES_BIT = new VkPipelineCreateFlagBits("VK_PIPELINE_CREATE_ALLOW_DERIVATIVES_BIT", 1, 0x00000002);
   public static final VkPipelineCreateFlagBits VK_PIPELINE_CREATE_DERIVATIVE_BIT = new VkPipelineCreateFlagBits("VK_PIPELINE_CREATE_DERIVATIVE_BIT", 2, 0x00000004);
   
   /**
    * Return all values available in this enumeration
    * @return Array of avail. VkAccessFlagBits
    */
    @SuppressWarnings("unchecked")
    public static VkPipelineCreateFlagBits[] values(){
            return values;
    }

	/**
	 * Get class of this enumeration
	 */
    protected static Class<VkPipelineCreateFlagBits> myGetClass(){
        return myClass;
    }

    /**
     * Creates a bitwise ORed enumeration
     * @param bits - list of enumerations to bitwise OR 
     * @return an enumeration of ORed bits 
     */
    public static VkPipelineCreateFlagBits or(VkPipelineCreateFlagBits...bits){
        int value = bits[0].getValue();        
        for (int i=1; i<bits.length; i++) {
            VkPipelineCreateFlagBits item = bits[i];
            value |= item.getValue();
        } 
        String name = myGetClass().getSimpleName() + " from bitwise Operation.[" + value +"]";
        VkPipelineCreateFlagBits ored = new VkPipelineCreateFlagBits(name, -1, value);        
        return ored;
    }
    
    /**
     * Creates a enumeration of this class, if valid. 
     * If you try to create a invalid enumeration it will raise a exception.
     * @param value - a valid enumeration value or ar ORed value.
     * @return a instance of VkPipelineCreateFlagBits from value. NULL if it is invalid value.
     */
    public static VkPipelineCreateFlagBits fromValue(int value){
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
        VkPipelineCreateFlagBits flag = new VkPipelineCreateFlagBits(name, -1, value); 
        return flag;
    }
    
    /**
     * Check is a given flagA is bitwise ORed with flagB
     * @param flagA - flag to test
     * @param flagB - flag to test
     * @return true if flagA bit
     */
    public static boolean isORed(VkPipelineCreateFlagBits flagA, VkPipelineCreateFlagBits flagB){
        int valA = flagA.getValue();
        int valB = flagB.getValue();
        return (valA & valB) == valB;
    }


    /** private ctor */
    private VkPipelineCreateFlagBits(String name, int ordinal, int v) {
       super(name, ordinal, v);
       values[ordinal] = this;
    }

 } // end of class VkPipelineCreateFlagBits
