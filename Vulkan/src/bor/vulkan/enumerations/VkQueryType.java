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
 * Class to wrap Vulkan enumeration VkQueryType
 *
 * <h3>Prototype</h3> <pre>
 * typedef enum VkQueryType {
 *     VK_QUERY_TYPE_OCCLUSION = 0,
 *     VK_QUERY_TYPE_PIPELINE_STATISTICS = 1,
 *     VK_QUERY_TYPE_TIMESTAMP = 2,
 *     VK_QUERY_TYPE_BEGIN_RANGE = VK_QUERY_TYPE_OCCLUSION,
 *     VK_QUERY_TYPE_END_RANGE = VK_QUERY_TYPE_TIMESTAMP,
 *     VK_QUERY_TYPE_RANGE_SIZE = (VK_QUERY_TYPE_TIMESTAMP - VK_QUERY_TYPE_OCCLUSION + 1),
 *     VK_QUERY_TYPE_MAX_ENUM = 0x7FFFFFFF
 * } VkQueryType;
 * </pre>
 * @author Alessandro Borges
 */
public class VkQueryType extends IntEnum<VkQueryType> {


   /** class */
   private static final Class<VkQueryType> myClass = VkQueryType.class;

   /** values */
   private static VkQueryType[] values = new VkQueryType[3];

   public static final VkQueryType VK_QUERY_TYPE_OCCLUSION = new VkQueryType("VK_QUERY_TYPE_OCCLUSION", 0, 0);
   public static final VkQueryType VK_QUERY_TYPE_PIPELINE_STATISTICS = new VkQueryType("VK_QUERY_TYPE_PIPELINE_STATISTICS", 1, 1);
   public static final VkQueryType VK_QUERY_TYPE_TIMESTAMP = new VkQueryType("VK_QUERY_TYPE_TIMESTAMP", 2, 2);
   
   /**
    * Return all values available in this enumeration
    * @return Array of avail. VkAccessFlagBits
    */
    @SuppressWarnings("unchecked")
    public static VkQueryType[] values(){
            return values;
    }

	/**
	 * Get class of this enumeration
	 */
    protected static Class<VkQueryType> myGetClass(){
        return myClass;
    }

    /**
     * Creates a bitwise ORed enumeration
     * @param bits - list of enumerations to bitwise OR 
     * @return an enumeration of ORed bits 
     */
    public static VkQueryType or(VkQueryType...bits){
        int value = bits[0].getValue();        
        for (int i=1; i<bits.length; i++) {
            VkQueryType item = bits[i];
            value |= item.getValue();
        } 
        String name = myGetClass().getSimpleName() + " from bitwise Operation.[" + value +"]";
        VkQueryType ored = new VkQueryType(name, -1, value);        
        return ored;
    }
    
    /**
     * Creates a enumeration of this class, if valid. 
     * If you try to create a invalid enumeration it will raise a exception.
     * @param value - a valid enumeration value or ar ORed value.
     * @return a instance of VkQueryType from value. NULL if it is invalid value.
     */
    public static VkQueryType fromValue(int value){
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
        VkQueryType flag = new VkQueryType(name, -1, value); 
        return flag;
    }
    
    /**
     * Check is a given flagA is bitwise ORed with flagB
     * @param flagA - flag to test
     * @param flagB - flag to test
     * @return true if flagA bit
     */
    public static boolean isORed(VkQueryType flagA, VkQueryType flagB){
        int valA = flagA.getValue();
        int valB = flagB.getValue();
        return (valA & valB) == valB;
    }


    /** private ctor */
    private VkQueryType(String name, int ordinal, int v) {
       super(name, ordinal, v);
       values[ordinal] = this;
    }

 } // end of class VkQueryType
