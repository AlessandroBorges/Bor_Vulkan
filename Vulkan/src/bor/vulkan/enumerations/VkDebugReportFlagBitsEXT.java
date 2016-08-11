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
 * Class to wrap Vulkan enumeration VkDebugReportFlagBitsEXT
 *
 * <h3>Prototype</h3> <pre>
 * typedef enum VkDebugReportFlagBitsEXT {
 *     VK_DEBUG_REPORT_INFORMATION_BIT_EXT = 0x00000001,
 *     VK_DEBUG_REPORT_WARNING_BIT_EXT = 0x00000002,
 *     VK_DEBUG_REPORT_PERFORMANCE_WARNING_BIT_EXT = 0x00000004,
 *     VK_DEBUG_REPORT_ERROR_BIT_EXT = 0x00000008,
 *     VK_DEBUG_REPORT_DEBUG_BIT_EXT = 0x00000010,
 *     VK_DEBUG_REPORT_FLAG_BITS_MAX_ENUM_EXT = 0x7FFFFFFF
 * } VkDebugReportFlagBitsEXT;
 * </pre>
 * @author Alessandro Borges
 */
public class VkDebugReportFlagBitsEXT extends IntEnum<VkDebugReportFlagBitsEXT> {


   /** class */
   private static final Class<VkDebugReportFlagBitsEXT> myClass = VkDebugReportFlagBitsEXT.class;

   /** values */
   private static VkDebugReportFlagBitsEXT[] values = new VkDebugReportFlagBitsEXT[5];

   public static final VkDebugReportFlagBitsEXT VK_DEBUG_REPORT_INFORMATION_BIT_EXT = new VkDebugReportFlagBitsEXT("VK_DEBUG_REPORT_INFORMATION_BIT_EXT", 0, 0x00000001);
   public static final VkDebugReportFlagBitsEXT VK_DEBUG_REPORT_WARNING_BIT_EXT = new VkDebugReportFlagBitsEXT("VK_DEBUG_REPORT_WARNING_BIT_EXT", 1, 0x00000002);
   public static final VkDebugReportFlagBitsEXT VK_DEBUG_REPORT_PERFORMANCE_WARNING_BIT_EXT = new VkDebugReportFlagBitsEXT("VK_DEBUG_REPORT_PERFORMANCE_WARNING_BIT_EXT", 2, 0x00000004);
   public static final VkDebugReportFlagBitsEXT VK_DEBUG_REPORT_ERROR_BIT_EXT = new VkDebugReportFlagBitsEXT("VK_DEBUG_REPORT_ERROR_BIT_EXT", 3, 0x00000008);
   public static final VkDebugReportFlagBitsEXT VK_DEBUG_REPORT_DEBUG_BIT_EXT = new VkDebugReportFlagBitsEXT("VK_DEBUG_REPORT_DEBUG_BIT_EXT", 4, 0x00000010);
   
   /**
    * Return all values available in this enumeration
    * @return Array of avail. VkAccessFlagBits
    */
    @SuppressWarnings("unchecked")
    public static VkDebugReportFlagBitsEXT[] values(){
            return values;
    }

	/**
	 * Get class of this enumeration
	 */
    protected static Class<VkDebugReportFlagBitsEXT> myGetClass(){
        return myClass;
    }

    /**
     * Creates a bitwise ORed enumeration
     * @param bits - list of enumerations to bitwise OR 
     * @return an enumeration of ORed bits 
     */
    public static VkDebugReportFlagBitsEXT or(VkDebugReportFlagBitsEXT...bits){
        int value = bits[0].getValue();        
        for (int i=1; i<bits.length; i++) {
            VkDebugReportFlagBitsEXT item = bits[i];
            value |= item.getValue();
        } 
        String name = myGetClass().getSimpleName() + " from bitwise Operation.[" + value +"]";
        VkDebugReportFlagBitsEXT ored = new VkDebugReportFlagBitsEXT(name, -1, value);        
        return ored;
    }
    
    /**
     * Creates a enumeration of this class, if valid. 
     * If you try to create a invalid enumeration it will raise a exception.
     * @param value - a valid enumeration value or ar ORed value.
     * @return a instance of VkDebugReportFlagBitsEXT from value. NULL if it is invalid value.
     */
    public static VkDebugReportFlagBitsEXT fromValue(int value){
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
        VkDebugReportFlagBitsEXT flag = new VkDebugReportFlagBitsEXT(name, -1, value); 
        return flag;
    }
	
	/**
     * Creates/populates a array of VkDebugReportFlagBitsEXT from a set of values.
     * @param dst - destination array. Can be null.
     * @param values - int[] with valid values of this enumeration.
     * @return VkDebugReportFlagBitsEXT array with matching values
     */
    public static VkDebugReportFlagBitsEXT[] fromValues(VkDebugReportFlagBitsEXT[] dst, int[] values){
        if(values == null) 
               return null;
        if(dst == null || dst.length != values.length){
            dst = new VkDebugReportFlagBitsEXT[values.length];
        }        
        for (int i = 0; i < values.length; i++) {
            int val = values[i];
            dst[i] = VkDebugReportFlagBitsEXT.fromValue(val);
        }        
        return dst;
    }
    
    /**
     * Check is a given flagA is bitwise ORed with flagB
     * @param flagA - flag to test
     * @param flagB - flag to test
     * @return true if flagA bit
     */
    public static boolean isORed(VkDebugReportFlagBitsEXT flagA, VkDebugReportFlagBitsEXT flagB){
        int valA = flagA.getValue();
        int valB = flagB.getValue();
        return (valA & valB) == valB;
    }


    /** private ctor */
    private VkDebugReportFlagBitsEXT(String name, int ordinal, int v) {
       super(name, ordinal, v);
       values[ordinal] = this;
    }

 } // end of class VkDebugReportFlagBitsEXT
