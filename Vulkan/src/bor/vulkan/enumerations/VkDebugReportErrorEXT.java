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
 * Class to wrap Vulkan enumeration VkDebugReportErrorEXT
 *
 * <h3>Prototype</h3> <pre>
 * typedef enum VkDebugReportErrorEXT {
 *     VK_DEBUG_REPORT_ERROR_NONE_EXT = 0,
 *     VK_DEBUG_REPORT_ERROR_CALLBACK_REF_EXT = 1,
 *     VK_DEBUG_REPORT_ERROR_BEGIN_RANGE_EXT = VK_DEBUG_REPORT_ERROR_NONE_EXT,
 *     VK_DEBUG_REPORT_ERROR_END_RANGE_EXT = VK_DEBUG_REPORT_ERROR_CALLBACK_REF_EXT,
 *     VK_DEBUG_REPORT_ERROR_RANGE_SIZE_EXT = (VK_DEBUG_REPORT_ERROR_CALLBACK_REF_EXT - VK_DEBUG_REPORT_ERROR_NONE_EXT + 1),
 *     VK_DEBUG_REPORT_ERROR_MAX_ENUM_EXT = 0x7FFFFFFF
 * } VkDebugReportErrorEXT;
 * </pre>
 * @author Alessandro Borges
 */
public class VkDebugReportErrorEXT extends IntEnum<VkDebugReportErrorEXT> {


   /** class */
   private static final Class<VkDebugReportErrorEXT> myClass = VkDebugReportErrorEXT.class;

   /** values */
   private static VkDebugReportErrorEXT[] values = new VkDebugReportErrorEXT[2];

   public static final VkDebugReportErrorEXT VK_DEBUG_REPORT_ERROR_NONE_EXT = new VkDebugReportErrorEXT("VK_DEBUG_REPORT_ERROR_NONE_EXT", 0, 0);
   public static final VkDebugReportErrorEXT VK_DEBUG_REPORT_ERROR_CALLBACK_REF_EXT = new VkDebugReportErrorEXT("VK_DEBUG_REPORT_ERROR_CALLBACK_REF_EXT", 1, 1);
   
   /**
    * Return all values available in this enumeration
    * @return Array of avail. VkAccessFlagBits
    */
    @SuppressWarnings("unchecked")
    public static VkDebugReportErrorEXT[] values(){
            return values;
    }

	/**
	 * Get class of this enumeration
	 */
    protected static Class<VkDebugReportErrorEXT> myGetClass(){
        return myClass;
    }

    /**
     * Creates a bitwise ORed enumeration
     * @param bits - list of enumerations to bitwise OR 
     * @return an enumeration of ORed bits 
     */
    public static VkDebugReportErrorEXT or(VkDebugReportErrorEXT...bits){
        int value = bits[0].getValue();        
        for (int i=1; i<bits.length; i++) {
            VkDebugReportErrorEXT item = bits[i];
            value |= item.getValue();
        } 
        String name = myGetClass().getSimpleName() + " from bitwise Operation.[" + value +"]";
        VkDebugReportErrorEXT ored = new VkDebugReportErrorEXT(name, -1, value);        
        return ored;
    }
    
    /**
     * Creates a enumeration of this class, if valid. 
     * If you try to create a invalid enumeration it will raise a exception.
     * @param value - a valid enumeration value or ar ORed value.
     * @return a instance of VkDebugReportErrorEXT from value. NULL if it is invalid value.
     */
    public static VkDebugReportErrorEXT fromValue(int value){
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
        VkDebugReportErrorEXT flag = new VkDebugReportErrorEXT(name, -1, value); 
        return flag;
    }
    
    /**
     * Check is a given flagA is bitwise ORed with flagB
     * @param flagA - flag to test
     * @param flagB - flag to test
     * @return true if flagA bit
     */
    public static boolean isORed(VkDebugReportErrorEXT flagA, VkDebugReportErrorEXT flagB){
        int valA = flagA.getValue();
        int valB = flagB.getValue();
        return (valA & valB) == valB;
    }


    /** private ctor */
    private VkDebugReportErrorEXT(String name, int ordinal, int v) {
       super(name, ordinal, v);
       values[ordinal] = this;
    }

 } // end of class VkDebugReportErrorEXT
