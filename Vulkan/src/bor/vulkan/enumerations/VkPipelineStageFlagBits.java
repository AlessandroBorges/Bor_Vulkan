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
 * Class to wrap Vulkan enumeration VkPipelineStageFlagBits
 *
 * <h3>Prototype</h3> <pre>
 * typedef enum VkPipelineStageFlagBits {
 *     VK_PIPELINE_STAGE_TOP_OF_PIPE_BIT = 0x00000001,
 *     VK_PIPELINE_STAGE_DRAW_INDIRECT_BIT = 0x00000002,
 *     VK_PIPELINE_STAGE_VERTEX_INPUT_BIT = 0x00000004,
 *     VK_PIPELINE_STAGE_VERTEX_SHADER_BIT = 0x00000008,
 *     VK_PIPELINE_STAGE_TESSELLATION_CONTROL_SHADER_BIT = 0x00000010,
 *     VK_PIPELINE_STAGE_TESSELLATION_EVALUATION_SHADER_BIT = 0x00000020,
 *     VK_PIPELINE_STAGE_GEOMETRY_SHADER_BIT = 0x00000040,
 *     VK_PIPELINE_STAGE_FRAGMENT_SHADER_BIT = 0x00000080,
 *     VK_PIPELINE_STAGE_EARLY_FRAGMENT_TESTS_BIT = 0x00000100,
 *     VK_PIPELINE_STAGE_LATE_FRAGMENT_TESTS_BIT = 0x00000200,
 *     VK_PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT = 0x00000400,
 *     VK_PIPELINE_STAGE_COMPUTE_SHADER_BIT = 0x00000800,
 *     VK_PIPELINE_STAGE_TRANSFER_BIT = 0x00001000,
 *     VK_PIPELINE_STAGE_BOTTOM_OF_PIPE_BIT = 0x00002000,
 *     VK_PIPELINE_STAGE_HOST_BIT = 0x00004000,
 *     VK_PIPELINE_STAGE_ALL_GRAPHICS_BIT = 0x00008000,
 *     VK_PIPELINE_STAGE_ALL_COMMANDS_BIT = 0x00010000,
 * } VkPipelineStageFlagBits;
 * </pre>
 * @author Alessandro Borges
 */
public class VkPipelineStageFlagBits extends IntEnum<VkPipelineStageFlagBits> {


   /** class */
   private static final Class<VkPipelineStageFlagBits> myClass = VkPipelineStageFlagBits.class;

   /** values */
   private static VkPipelineStageFlagBits[] values = new VkPipelineStageFlagBits[17];

   public static final VkPipelineStageFlagBits VK_PIPELINE_STAGE_TOP_OF_PIPE_BIT = new VkPipelineStageFlagBits("VK_PIPELINE_STAGE_TOP_OF_PIPE_BIT", 0, 0x00000001);
   public static final VkPipelineStageFlagBits VK_PIPELINE_STAGE_DRAW_INDIRECT_BIT = new VkPipelineStageFlagBits("VK_PIPELINE_STAGE_DRAW_INDIRECT_BIT", 1, 0x00000002);
   public static final VkPipelineStageFlagBits VK_PIPELINE_STAGE_VERTEX_INPUT_BIT = new VkPipelineStageFlagBits("VK_PIPELINE_STAGE_VERTEX_INPUT_BIT", 2, 0x00000004);
   public static final VkPipelineStageFlagBits VK_PIPELINE_STAGE_VERTEX_SHADER_BIT = new VkPipelineStageFlagBits("VK_PIPELINE_STAGE_VERTEX_SHADER_BIT", 3, 0x00000008);
   public static final VkPipelineStageFlagBits VK_PIPELINE_STAGE_TESSELLATION_CONTROL_SHADER_BIT = new VkPipelineStageFlagBits("VK_PIPELINE_STAGE_TESSELLATION_CONTROL_SHADER_BIT", 4, 0x00000010);
   public static final VkPipelineStageFlagBits VK_PIPELINE_STAGE_TESSELLATION_EVALUATION_SHADER_BIT = new VkPipelineStageFlagBits("VK_PIPELINE_STAGE_TESSELLATION_EVALUATION_SHADER_BIT", 5, 0x00000020);
   public static final VkPipelineStageFlagBits VK_PIPELINE_STAGE_GEOMETRY_SHADER_BIT = new VkPipelineStageFlagBits("VK_PIPELINE_STAGE_GEOMETRY_SHADER_BIT", 6, 0x00000040);
   public static final VkPipelineStageFlagBits VK_PIPELINE_STAGE_FRAGMENT_SHADER_BIT = new VkPipelineStageFlagBits("VK_PIPELINE_STAGE_FRAGMENT_SHADER_BIT", 7, 0x00000080);
   public static final VkPipelineStageFlagBits VK_PIPELINE_STAGE_EARLY_FRAGMENT_TESTS_BIT = new VkPipelineStageFlagBits("VK_PIPELINE_STAGE_EARLY_FRAGMENT_TESTS_BIT", 8, 0x00000100);
   public static final VkPipelineStageFlagBits VK_PIPELINE_STAGE_LATE_FRAGMENT_TESTS_BIT = new VkPipelineStageFlagBits("VK_PIPELINE_STAGE_LATE_FRAGMENT_TESTS_BIT", 9, 0x00000200);
   public static final VkPipelineStageFlagBits VK_PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT = new VkPipelineStageFlagBits("VK_PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT", 10, 0x00000400);
   public static final VkPipelineStageFlagBits VK_PIPELINE_STAGE_COMPUTE_SHADER_BIT = new VkPipelineStageFlagBits("VK_PIPELINE_STAGE_COMPUTE_SHADER_BIT", 11, 0x00000800);
   public static final VkPipelineStageFlagBits VK_PIPELINE_STAGE_TRANSFER_BIT = new VkPipelineStageFlagBits("VK_PIPELINE_STAGE_TRANSFER_BIT", 12, 0x00001000);
   public static final VkPipelineStageFlagBits VK_PIPELINE_STAGE_BOTTOM_OF_PIPE_BIT = new VkPipelineStageFlagBits("VK_PIPELINE_STAGE_BOTTOM_OF_PIPE_BIT", 13, 0x00002000);
   public static final VkPipelineStageFlagBits VK_PIPELINE_STAGE_HOST_BIT = new VkPipelineStageFlagBits("VK_PIPELINE_STAGE_HOST_BIT", 14, 0x00004000);
   public static final VkPipelineStageFlagBits VK_PIPELINE_STAGE_ALL_GRAPHICS_BIT = new VkPipelineStageFlagBits("VK_PIPELINE_STAGE_ALL_GRAPHICS_BIT", 15, 0x00008000);
   public static final VkPipelineStageFlagBits VK_PIPELINE_STAGE_ALL_COMMANDS_BIT = new VkPipelineStageFlagBits("VK_PIPELINE_STAGE_ALL_COMMANDS_BIT", 16, 0x00010000);
   
   /**
    * Return all values available in this enumeration
    * @return Array of avail. VkAccessFlagBits
    */
    @SuppressWarnings("unchecked")
    public static VkPipelineStageFlagBits[] values(){
            return values;
    }

	/**
	 * Get class of this enumeration
	 */
    protected static Class<VkPipelineStageFlagBits> myGetClass(){
        return myClass;
    }

    /**
     * Creates a bitwise ORed enumeration
     * @param bits - list of enumerations to bitwise OR 
     * @return an enumeration of ORed bits 
     */
    public static VkPipelineStageFlagBits or(VkPipelineStageFlagBits...bits){
        int value = bits[0].getValue();        
        for (int i=1; i<bits.length; i++) {
            VkPipelineStageFlagBits item = bits[i];
            value |= item.getValue();
        } 
        String name = myGetClass().getSimpleName() + " from bitwise Operation.[" + value +"]";
        VkPipelineStageFlagBits ored = new VkPipelineStageFlagBits(name, -1, value);        
        return ored;
    }
    
    /**
     * Creates a enumeration of this class, if valid. 
     * If you try to create a invalid enumeration it will raise a exception.
     * @param value - a valid enumeration value or ar ORed value.
     * @return a instance of VkPipelineStageFlagBits from value. NULL if it is invalid value.
     */
    public static VkPipelineStageFlagBits fromValue(int value){
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
        VkPipelineStageFlagBits flag = new VkPipelineStageFlagBits(name, -1, value); 
        return flag;
    }
    
    /**
     * Check is a given flagA is bitwise ORed with flagB
     * @param flagA - flag to test
     * @param flagB - flag to test
     * @return true if flagA bit
     */
    public static boolean isORed(VkPipelineStageFlagBits flagA, VkPipelineStageFlagBits flagB){
        int valA = flagA.getValue();
        int valB = flagB.getValue();
        return (valA & valB) == valB;
    }


    /** private ctor */
    private VkPipelineStageFlagBits(String name, int ordinal, int v) {
       super(name, ordinal, v);
       values[ordinal] = this;
    }

 } // end of class VkPipelineStageFlagBits
