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
 * Class to wrap Vulkan enumeration VkQueryResultFlagBits
 *
 * <h3>Prototype</h3> <pre>
 * typedef enum VkQueryResultFlagBits {
 *     VK_QUERY_RESULT_64_BIT = 0x00000001,
 *     VK_QUERY_RESULT_WAIT_BIT = 0x00000002,
 *     VK_QUERY_RESULT_WITH_AVAILABILITY_BIT = 0x00000004,
 *     VK_QUERY_RESULT_PARTIAL_BIT = 0x00000008,
 *     VK_QUERY_RESULT_FLAG_BITS_MAX_ENUM = 0x7FFFFFFF
 * } VkQueryResultFlagBits;
 * </pre>
 * @author Alessandro Borges
 */
public class VkQueryResultFlagBits extends IntEnum<VkQueryResultFlagBits> {


   /** class */
   private static final Class<VkQueryResultFlagBits> myClass = VkQueryResultFlagBits.class;

   /** values */
   private static VkQueryResultFlagBits[] values = new VkQueryResultFlagBits[4];

   public static final VkQueryResultFlagBits VK_QUERY_RESULT_64_BIT = new VkQueryResultFlagBits("VK_QUERY_RESULT_64_BIT", 0, 0x00000001);
   public static final VkQueryResultFlagBits VK_QUERY_RESULT_WAIT_BIT = new VkQueryResultFlagBits("VK_QUERY_RESULT_WAIT_BIT", 1, 0x00000002);
   public static final VkQueryResultFlagBits VK_QUERY_RESULT_WITH_AVAILABILITY_BIT = new VkQueryResultFlagBits("VK_QUERY_RESULT_WITH_AVAILABILITY_BIT", 2, 0x00000004);
   public static final VkQueryResultFlagBits VK_QUERY_RESULT_PARTIAL_BIT = new VkQueryResultFlagBits("VK_QUERY_RESULT_PARTIAL_BIT", 3, 0x00000008);
   
   /**
    * Return all values available in this enumeration
    * @return Array of avail. VkAccessFlagBits
    */
    @SuppressWarnings("unchecked")
    public static VkQueryResultFlagBits[] values(){
            return values;
    }

	/**
	 * Get class of this enumeration
	 */
    protected static Class<VkQueryResultFlagBits> myGetClass(){
        return myClass;
    }

    /**
     * Creates a bitwise ORed enumeration
     * @param bits - list of enumerations to bitwise OR 
     * @return an enumeration of ORed bits 
     */
    public static VkQueryResultFlagBits or(VkQueryResultFlagBits...bits){
        int value = bits[0].getValue();        
        for (int i=1; i<bits.length; i++) {
            VkQueryResultFlagBits item = bits[i];
            value |= item.getValue();
        } 
        String name = myGetClass().getSimpleName() + " from bitwise Operation.[" + value +"]";
        VkQueryResultFlagBits ored = new VkQueryResultFlagBits(name, -1, value);        
        return ored;
    }
    
    /**
     * Creates a enumeration of this class, if valid. 
     * If you try to create a invalid enumeration it will raise a exception.
     * @param value - a valid enumeration value or ar ORed value.
     * @return a instance of VkQueryResultFlagBits from value. NULL if it is invalid value.
     */
    public static VkQueryResultFlagBits fromValue(int value){
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
        VkQueryResultFlagBits flag = new VkQueryResultFlagBits(name, -1, value); 
        return flag;
    }
    
    /**
     * Check is a given flagA is bitwise ORed with flagB
     * @param flagA - flag to test
     * @param flagB - flag to test
     * @return true if flagA bit
     */
    public static boolean isORed(VkQueryResultFlagBits flagA, VkQueryResultFlagBits flagB){
        int valA = flagA.getValue();
        int valB = flagB.getValue();
        return (valA & valB) == valB;
    }


    /** private ctor */
    private VkQueryResultFlagBits(String name, int ordinal, int v) {
       super(name, ordinal, v);
       values[ordinal] = this;
    }

 } // end of class VkQueryResultFlagBits
