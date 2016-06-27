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
 * Class to wrap Vulkan enumeration VkQueryPipelineStatisticFlagBits
 *
 * <h3>Prototype</h3> <pre>
 * typedef enum VkQueryPipelineStatisticFlagBits {
 *     VK_QUERY_PIPELINE_STATISTIC_INPUT_ASSEMBLY_VERTICES_BIT = 0x00000001,
 *     VK_QUERY_PIPELINE_STATISTIC_INPUT_ASSEMBLY_PRIMITIVES_BIT = 0x00000002,
 *     VK_QUERY_PIPELINE_STATISTIC_VERTEX_SHADER_INVOCATIONS_BIT = 0x00000004,
 *     VK_QUERY_PIPELINE_STATISTIC_GEOMETRY_SHADER_INVOCATIONS_BIT = 0x00000008,
 *     VK_QUERY_PIPELINE_STATISTIC_GEOMETRY_SHADER_PRIMITIVES_BIT = 0x00000010,
 *     VK_QUERY_PIPELINE_STATISTIC_CLIPPING_INVOCATIONS_BIT = 0x00000020,
 *     VK_QUERY_PIPELINE_STATISTIC_CLIPPING_PRIMITIVES_BIT = 0x00000040,
 *     VK_QUERY_PIPELINE_STATISTIC_FRAGMENT_SHADER_INVOCATIONS_BIT = 0x00000080,
 *     VK_QUERY_PIPELINE_STATISTIC_TESSELLATION_CONTROL_SHADER_PATCHES_BIT = 0x00000100,
 *     VK_QUERY_PIPELINE_STATISTIC_TESSELLATION_EVALUATION_SHADER_INVOCATIONS_BIT = 0x00000200,
 *     VK_QUERY_PIPELINE_STATISTIC_COMPUTE_SHADER_INVOCATIONS_BIT = 0x00000400,
 *     VK_QUERY_PIPELINE_STATISTIC_FLAG_BITS_MAX_ENUM = 0x7FFFFFFF
 * } VkQueryPipelineStatisticFlagBits;
 * </pre>
 * @author Alessandro Borges
 */
public class VkQueryPipelineStatisticFlagBits extends IntEnum<VkQueryPipelineStatisticFlagBits> {


   /** class */
   private static final Class<VkQueryPipelineStatisticFlagBits> myClass = VkQueryPipelineStatisticFlagBits.class;

   /** values */
   private static VkQueryPipelineStatisticFlagBits[] values = new VkQueryPipelineStatisticFlagBits[11];

   public static final VkQueryPipelineStatisticFlagBits VK_QUERY_PIPELINE_STATISTIC_INPUT_ASSEMBLY_VERTICES_BIT = new VkQueryPipelineStatisticFlagBits("VK_QUERY_PIPELINE_STATISTIC_INPUT_ASSEMBLY_VERTICES_BIT", 0, 0x00000001);
   public static final VkQueryPipelineStatisticFlagBits VK_QUERY_PIPELINE_STATISTIC_INPUT_ASSEMBLY_PRIMITIVES_BIT = new VkQueryPipelineStatisticFlagBits("VK_QUERY_PIPELINE_STATISTIC_INPUT_ASSEMBLY_PRIMITIVES_BIT", 1, 0x00000002);
   public static final VkQueryPipelineStatisticFlagBits VK_QUERY_PIPELINE_STATISTIC_VERTEX_SHADER_INVOCATIONS_BIT = new VkQueryPipelineStatisticFlagBits("VK_QUERY_PIPELINE_STATISTIC_VERTEX_SHADER_INVOCATIONS_BIT", 2, 0x00000004);
   public static final VkQueryPipelineStatisticFlagBits VK_QUERY_PIPELINE_STATISTIC_GEOMETRY_SHADER_INVOCATIONS_BIT = new VkQueryPipelineStatisticFlagBits("VK_QUERY_PIPELINE_STATISTIC_GEOMETRY_SHADER_INVOCATIONS_BIT", 3, 0x00000008);
   public static final VkQueryPipelineStatisticFlagBits VK_QUERY_PIPELINE_STATISTIC_GEOMETRY_SHADER_PRIMITIVES_BIT = new VkQueryPipelineStatisticFlagBits("VK_QUERY_PIPELINE_STATISTIC_GEOMETRY_SHADER_PRIMITIVES_BIT", 4, 0x00000010);
   public static final VkQueryPipelineStatisticFlagBits VK_QUERY_PIPELINE_STATISTIC_CLIPPING_INVOCATIONS_BIT = new VkQueryPipelineStatisticFlagBits("VK_QUERY_PIPELINE_STATISTIC_CLIPPING_INVOCATIONS_BIT", 5, 0x00000020);
   public static final VkQueryPipelineStatisticFlagBits VK_QUERY_PIPELINE_STATISTIC_CLIPPING_PRIMITIVES_BIT = new VkQueryPipelineStatisticFlagBits("VK_QUERY_PIPELINE_STATISTIC_CLIPPING_PRIMITIVES_BIT", 6, 0x00000040);
   public static final VkQueryPipelineStatisticFlagBits VK_QUERY_PIPELINE_STATISTIC_FRAGMENT_SHADER_INVOCATIONS_BIT = new VkQueryPipelineStatisticFlagBits("VK_QUERY_PIPELINE_STATISTIC_FRAGMENT_SHADER_INVOCATIONS_BIT", 7, 0x00000080);
   public static final VkQueryPipelineStatisticFlagBits VK_QUERY_PIPELINE_STATISTIC_TESSELLATION_CONTROL_SHADER_PATCHES_BIT = new VkQueryPipelineStatisticFlagBits("VK_QUERY_PIPELINE_STATISTIC_TESSELLATION_CONTROL_SHADER_PATCHES_BIT", 8, 0x00000100);
   public static final VkQueryPipelineStatisticFlagBits VK_QUERY_PIPELINE_STATISTIC_TESSELLATION_EVALUATION_SHADER_INVOCATIONS_BIT = new VkQueryPipelineStatisticFlagBits("VK_QUERY_PIPELINE_STATISTIC_TESSELLATION_EVALUATION_SHADER_INVOCATIONS_BIT", 9, 0x00000200);
   public static final VkQueryPipelineStatisticFlagBits VK_QUERY_PIPELINE_STATISTIC_COMPUTE_SHADER_INVOCATIONS_BIT = new VkQueryPipelineStatisticFlagBits("VK_QUERY_PIPELINE_STATISTIC_COMPUTE_SHADER_INVOCATIONS_BIT", 10, 0x00000400);
   
   /**
    * Return all values available in this enumeration
    * @return Array of avail. VkAccessFlagBits
    */
    @SuppressWarnings("unchecked")
    public static VkQueryPipelineStatisticFlagBits[] values(){
            return values;
    }

	/**
	 * Get class of this enumeration
	 */
    protected static Class<VkQueryPipelineStatisticFlagBits> myGetClass(){
        return myClass;
    }

    /**
     * Creates a bitwise ORed enumeration
     * @param bits - list of enumerations to bitwise OR 
     * @return an enumeration of ORed bits 
     */
    public static VkQueryPipelineStatisticFlagBits or(VkQueryPipelineStatisticFlagBits...bits){
        int value = bits[0].getValue();        
        for (int i=1; i<bits.length; i++) {
            VkQueryPipelineStatisticFlagBits item = bits[i];
            value |= item.getValue();
        } 
        String name = myGetClass().getSimpleName() + " from bitwise Operation.[" + value +"]";
        VkQueryPipelineStatisticFlagBits ored = new VkQueryPipelineStatisticFlagBits(name, -1, value);        
        return ored;
    }
    
    /**
     * Creates a enumeration of this class, if valid. 
     * If you try to create a invalid enumeration it will raise a exception.
     * @param value - a valid enumeration value or ar ORed value.
     * @return a instance of VkQueryPipelineStatisticFlagBits from value. NULL if it is invalid value.
     */
    public static VkQueryPipelineStatisticFlagBits fromValue(int value){
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
        VkQueryPipelineStatisticFlagBits flag = new VkQueryPipelineStatisticFlagBits(name, -1, value); 
        return flag;
    }
    
    /**
     * Check is a given flagA is bitwise ORed with flagB
     * @param flagA - flag to test
     * @param flagB - flag to test
     * @return true if flagA bit
     */
    public static boolean isORed(VkQueryPipelineStatisticFlagBits flagA, VkQueryPipelineStatisticFlagBits flagB){
        int valA = flagA.getValue();
        int valB = flagB.getValue();
        return (valA & valB) == valB;
    }


    /** private ctor */
    private VkQueryPipelineStatisticFlagBits(String name, int ordinal, int v) {
       super(name, ordinal, v);
       values[ordinal] = this;
    }

 } // end of class VkQueryPipelineStatisticFlagBits
