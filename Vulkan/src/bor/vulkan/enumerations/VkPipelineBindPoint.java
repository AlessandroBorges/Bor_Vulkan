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
 * Class to wrap Vulkan enumeration VkPipelineBindPoint
 *
 * <h3>Prototype</h3> <pre>
 * typedef enum VkPipelineBindPoint {
 *     VK_PIPELINE_BIND_POINT_GRAPHICS = 0,
 *     VK_PIPELINE_BIND_POINT_COMPUTE = 1,
 *     VK_PIPELINE_BIND_POINT_BEGIN_RANGE = VK_PIPELINE_BIND_POINT_GRAPHICS,
 *     VK_PIPELINE_BIND_POINT_END_RANGE = VK_PIPELINE_BIND_POINT_COMPUTE,
 *     VK_PIPELINE_BIND_POINT_RANGE_SIZE = (VK_PIPELINE_BIND_POINT_COMPUTE - VK_PIPELINE_BIND_POINT_GRAPHICS + 1),
 *     VK_PIPELINE_BIND_POINT_MAX_ENUM = 0x7FFFFFFF
 * } VkPipelineBindPoint;
 * </pre>
 * @author Alessandro Borges
 */
public class VkPipelineBindPoint extends IntEnum<VkPipelineBindPoint> {


   /** class */
   private static final Class<VkPipelineBindPoint> myClass = VkPipelineBindPoint.class;

   /** values */
   private static VkPipelineBindPoint[] values = new VkPipelineBindPoint[2];

   public static final VkPipelineBindPoint VK_PIPELINE_BIND_POINT_GRAPHICS = new VkPipelineBindPoint("VK_PIPELINE_BIND_POINT_GRAPHICS", 0, 0);
   public static final VkPipelineBindPoint VK_PIPELINE_BIND_POINT_COMPUTE = new VkPipelineBindPoint("VK_PIPELINE_BIND_POINT_COMPUTE", 1, 1);
   
   /**
    * Return all values available in this enumeration
    * @return Array of avail. VkAccessFlagBits
    */
    @SuppressWarnings("unchecked")
    public static VkPipelineBindPoint[] values(){
            return values;
    }

	/**
	 * Get class of this enumeration
	 */
    protected static Class<VkPipelineBindPoint> myGetClass(){
        return myClass;
    }

    /**
     * Creates a bitwise ORed enumeration
     * @param bits - list of enumerations to bitwise OR 
     * @return an enumeration of ORed bits 
     */
    public static VkPipelineBindPoint or(VkPipelineBindPoint...bits){
        int value = bits[0].getValue();        
        for (int i=1; i<bits.length; i++) {
            VkPipelineBindPoint item = bits[i];
            value |= item.getValue();
        } 
        String name = myGetClass().getSimpleName() + " from bitwise Operation.[" + value +"]";
        VkPipelineBindPoint ored = new VkPipelineBindPoint(name, -1, value);        
        return ored;
    }
    
    /**
     * Creates a enumeration of this class, if valid. 
     * If you try to create a invalid enumeration it will raise a exception.
     * @param value - a valid enumeration value or ar ORed value.
     * @return a instance of VkPipelineBindPoint from value. NULL if it is invalid value.
     */
    public static VkPipelineBindPoint fromValue(int value){
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
        VkPipelineBindPoint flag = new VkPipelineBindPoint(name, -1, value); 
        return flag;
    }
    
    /**
     * Check is a given flagA is bitwise ORed with flagB
     * @param flagA - flag to test
     * @param flagB - flag to test
     * @return true if flagA bit
     */
    public static boolean isORed(VkPipelineBindPoint flagA, VkPipelineBindPoint flagB){
        int valA = flagA.getValue();
        int valB = flagB.getValue();
        return (valA & valB) == valB;
    }


    /** private ctor */
    private VkPipelineBindPoint(String name, int ordinal, int v) {
       super(name, ordinal, v);
       values[ordinal] = this;
    }

 } // end of class VkPipelineBindPoint
