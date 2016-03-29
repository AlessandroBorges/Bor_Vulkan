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
 * Class to wrap Vulkan enumeration VkShaderStageFlagBits
 *
 * <h3>Prototype</h3> <pre>
 * typedef enum VkShaderStageFlagBits {
 *     VK_SHADER_STAGE_VERTEX_BIT = 0x00000001,
 *     VK_SHADER_STAGE_TESSELLATION_CONTROL_BIT = 0x00000002,
 *     VK_SHADER_STAGE_TESSELLATION_EVALUATION_BIT = 0x00000004,
 *     VK_SHADER_STAGE_GEOMETRY_BIT = 0x00000008,
 *     VK_SHADER_STAGE_FRAGMENT_BIT = 0x00000010,
 *     VK_SHADER_STAGE_COMPUTE_BIT = 0x00000020,
 *     VK_SHADER_STAGE_ALL_GRAPHICS = 0x0000001F,
 *     VK_SHADER_STAGE_ALL = 0x7FFFFFFF,
 * } VkShaderStageFlagBits;
 * </pre>
 * @author Alessandro Borges
 */
public class VkShaderStageFlagBits extends IntEnum<VkShaderStageFlagBits> {


   /** class */
   private static final Class<VkShaderStageFlagBits> myClass = VkShaderStageFlagBits.class;

   /** values */
   private static VkShaderStageFlagBits[] values = new VkShaderStageFlagBits[8];

   public static final VkShaderStageFlagBits VK_SHADER_STAGE_VERTEX_BIT = new VkShaderStageFlagBits("VK_SHADER_STAGE_VERTEX_BIT", 0, 0x00000001);
   public static final VkShaderStageFlagBits VK_SHADER_STAGE_TESSELLATION_CONTROL_BIT = new VkShaderStageFlagBits("VK_SHADER_STAGE_TESSELLATION_CONTROL_BIT", 1, 0x00000002);
   public static final VkShaderStageFlagBits VK_SHADER_STAGE_TESSELLATION_EVALUATION_BIT = new VkShaderStageFlagBits("VK_SHADER_STAGE_TESSELLATION_EVALUATION_BIT", 2, 0x00000004);
   public static final VkShaderStageFlagBits VK_SHADER_STAGE_GEOMETRY_BIT = new VkShaderStageFlagBits("VK_SHADER_STAGE_GEOMETRY_BIT", 3, 0x00000008);
   public static final VkShaderStageFlagBits VK_SHADER_STAGE_FRAGMENT_BIT = new VkShaderStageFlagBits("VK_SHADER_STAGE_FRAGMENT_BIT", 4, 0x00000010);
   public static final VkShaderStageFlagBits VK_SHADER_STAGE_COMPUTE_BIT = new VkShaderStageFlagBits("VK_SHADER_STAGE_COMPUTE_BIT", 5, 0x00000020);
   public static final VkShaderStageFlagBits VK_SHADER_STAGE_ALL_GRAPHICS = new VkShaderStageFlagBits("VK_SHADER_STAGE_ALL_GRAPHICS", 6, 0x0000001F);
   public static final VkShaderStageFlagBits VK_SHADER_STAGE_ALL = new VkShaderStageFlagBits("VK_SHADER_STAGE_ALL", 7, 0x7FFFFFFF);
   
   /**
    * Return all values available in this enumeration
    * @return Array of avail. VkAccessFlagBits
    */
    @SuppressWarnings("unchecked")
    public static VkShaderStageFlagBits[] values(){
            return values;
    }

	/**
	 * Get class of this enumeration
	 */
    protected static Class<VkShaderStageFlagBits> myGetClass(){
        return myClass;
    }

    /**
     * Creates a bitwise ORed enumeration
     * @param bits - list of enumerations to bitwise OR 
     * @return an enumeration of ORed bits 
     */
    public static VkShaderStageFlagBits or(VkShaderStageFlagBits...bits){
        int value = bits[0].getValue();        
        for (int i=1; i<bits.length; i++) {
            VkShaderStageFlagBits item = bits[i];
            value |= item.getValue();
        } 
        String name = myGetClass().getSimpleName() + " from bitwise Operation.[" + value +"]";
        VkShaderStageFlagBits ored = new VkShaderStageFlagBits(name, -1, value);        
        return ored;
    }
    
    /**
     * Creates a enumeration of this class, if valid. 
     * If you try to create a invalid enumeration it will raise a exception.
     * @param value - a valid enumeration value or ar ORed value.
     * @return a instance of VkShaderStageFlagBits from value. NULL if it is invalid value.
     */
    public static VkShaderStageFlagBits fromValue(int value){
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
        VkShaderStageFlagBits flag = new VkShaderStageFlagBits(name, -1, value); 
        return flag;
    }
    
    /**
     * Check is a given flagA is bitwise ORed with flagB
     * @param flagA - flag to test
     * @param flagB - flag to test
     * @return true if flagA bit
     */
    public static boolean isORed(VkShaderStageFlagBits flagA, VkShaderStageFlagBits flagB){
        int valA = flagA.getValue();
        int valB = flagB.getValue();
        return (valA & valB) == valB;
    }


    /** private ctor */
    private VkShaderStageFlagBits(String name, int ordinal, int v) {
       super(name, ordinal, v);
       values[ordinal] = this;
    }

 } // end of class VkShaderStageFlagBits
