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
 * Class to wrap Vulkan enumeration VkVertexInputRate
 *
 * <h3>Prototype</h3> <pre>
 * typedef enum VkVertexInputRate {
 *     VK_VERTEX_INPUT_RATE_VERTEX = 0,
 *     VK_VERTEX_INPUT_RATE_INSTANCE = 1,
 *     VK_VERTEX_INPUT_RATE_BEGIN_RANGE = VK_VERTEX_INPUT_RATE_VERTEX,
 *     VK_VERTEX_INPUT_RATE_END_RANGE = VK_VERTEX_INPUT_RATE_INSTANCE,
 *     VK_VERTEX_INPUT_RATE_RANGE_SIZE = (VK_VERTEX_INPUT_RATE_INSTANCE - VK_VERTEX_INPUT_RATE_VERTEX + 1),
 *     VK_VERTEX_INPUT_RATE_MAX_ENUM = 0x7FFFFFFF
 * } VkVertexInputRate;
 * </pre>
 * @author Alessandro Borges
 */
public class VkVertexInputRate extends IntEnum<VkVertexInputRate> {


   /** class */
   private static final Class<VkVertexInputRate> myClass = VkVertexInputRate.class;

   /** values */
   private static VkVertexInputRate[] values = new VkVertexInputRate[2];

   public static final VkVertexInputRate VK_VERTEX_INPUT_RATE_VERTEX = new VkVertexInputRate("VK_VERTEX_INPUT_RATE_VERTEX", 0, 0);
   public static final VkVertexInputRate VK_VERTEX_INPUT_RATE_INSTANCE = new VkVertexInputRate("VK_VERTEX_INPUT_RATE_INSTANCE", 1, 1);
   
   /**
    * Return all values available in this enumeration
    * @return Array of avail. VkAccessFlagBits
    */
    @SuppressWarnings("unchecked")
    public static VkVertexInputRate[] values(){
            return values;
    }

	/**
	 * Get class of this enumeration
	 */
    protected static Class<VkVertexInputRate> myGetClass(){
        return myClass;
    }

    /**
     * Creates a bitwise ORed enumeration
     * @param bits - list of enumerations to bitwise OR 
     * @return an enumeration of ORed bits 
     */
    public static VkVertexInputRate or(VkVertexInputRate...bits){
        int value = bits[0].getValue();        
        for (int i=1; i<bits.length; i++) {
            VkVertexInputRate item = bits[i];
            value |= item.getValue();
        } 
        String name = myGetClass().getSimpleName() + " from bitwise Operation.[" + value +"]";
        VkVertexInputRate ored = new VkVertexInputRate(name, -1, value);        
        return ored;
    }
    
    /**
     * Creates a enumeration of this class, if valid. 
     * If you try to create a invalid enumeration it will raise a exception.
     * @param value - a valid enumeration value or ar ORed value.
     * @return a instance of VkVertexInputRate from value. NULL if it is invalid value.
     */
    public static VkVertexInputRate fromValue(int value){
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
        VkVertexInputRate flag = new VkVertexInputRate(name, -1, value); 
        return flag;
    }
    
    /**
     * Check is a given flagA is bitwise ORed with flagB
     * @param flagA - flag to test
     * @param flagB - flag to test
     * @return true if flagA bit
     */
    public static boolean isORed(VkVertexInputRate flagA, VkVertexInputRate flagB){
        int valA = flagA.getValue();
        int valB = flagB.getValue();
        return (valA & valB) == valB;
    }


    /** private ctor */
    private VkVertexInputRate(String name, int ordinal, int v) {
       super(name, ordinal, v);
       values[ordinal] = this;
    }

 } // end of class VkVertexInputRate
