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
 * Class to wrap Vulkan enumeration VkInternalAllocationType
 *
 * <h3>Prototype</h3> <pre>
 * typedef enum VkInternalAllocationType {
 *     VK_INTERNAL_ALLOCATION_TYPE_EXECUTABLE = 0,
 *     VK_INTERNAL_ALLOCATION_TYPE_BEGIN_RANGE = VK_INTERNAL_ALLOCATION_TYPE_EXECUTABLE,
 *     VK_INTERNAL_ALLOCATION_TYPE_END_RANGE = VK_INTERNAL_ALLOCATION_TYPE_EXECUTABLE,
 *     VK_INTERNAL_ALLOCATION_TYPE_RANGE_SIZE = (VK_INTERNAL_ALLOCATION_TYPE_EXECUTABLE - VK_INTERNAL_ALLOCATION_TYPE_EXECUTABLE + 1),
 *     VK_INTERNAL_ALLOCATION_TYPE_MAX_ENUM = 0x7FFFFFFF
 * } VkInternalAllocationType;
 * </pre>
 * @author Alessandro Borges
 */
public class VkInternalAllocationType extends IntEnum<VkInternalAllocationType> {


   /** class */
   private static final Class<VkInternalAllocationType> myClass = VkInternalAllocationType.class;

   /** values */
   private static VkInternalAllocationType[] values = new VkInternalAllocationType[1];

   public static final VkInternalAllocationType VK_INTERNAL_ALLOCATION_TYPE_EXECUTABLE = new VkInternalAllocationType("VK_INTERNAL_ALLOCATION_TYPE_EXECUTABLE", 0, 0);
   
   /**
    * Return all values available in this enumeration
    * @return Array of avail. VkAccessFlagBits
    */
    @SuppressWarnings("unchecked")
    public static VkInternalAllocationType[] values(){
            return values;
    }

	/**
	 * Get class of this enumeration
	 */
    protected static Class<VkInternalAllocationType> myGetClass(){
        return myClass;
    }

    /**
     * Creates a bitwise ORed enumeration
     * @param bits - list of enumerations to bitwise OR 
     * @return an enumeration of ORed bits 
     */
    public static VkInternalAllocationType or(VkInternalAllocationType...bits){
        int value = bits[0].getValue();        
        for (int i=1; i<bits.length; i++) {
            VkInternalAllocationType item = bits[i];
            value |= item.getValue();
        } 
        String name = myGetClass().getSimpleName() + " from bitwise Operation.[" + value +"]";
        VkInternalAllocationType ored = new VkInternalAllocationType(name, -1, value);        
        return ored;
    }
    
    /**
     * Creates a enumeration of this class, if valid. 
     * If you try to create a invalid enumeration it will raise a exception.
     * @param value - a valid enumeration value or ar ORed value.
     * @return a instance of VkInternalAllocationType from value. NULL if it is invalid value.
     */
    public static VkInternalAllocationType fromValue(int value){
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
        VkInternalAllocationType flag = new VkInternalAllocationType(name, -1, value); 
        return flag;
    }
	
	/**
     * Creates/populates a array of VkInternalAllocationType from a set of values.
     * @param dst - destination array. Can be null.
     * @param values - int[] with valid values of this enumeration.
     * @return VkInternalAllocationType array with matching values
     */
    public static VkInternalAllocationType[] fromValues(VkInternalAllocationType[] dst, int[] values){
        if(values == null) 
               return null;
        if(dst == null || dst.length != values.length){
            dst = new VkInternalAllocationType[values.length];
        }        
        for (int i = 0; i < values.length; i++) {
            int val = values[i];
            dst[i] = VkInternalAllocationType.fromValue(val);
        }        
        return dst;
    }
    
    /**
     * Check is a given flagA is bitwise ORed with flagB
     * @param flagA - flag to test
     * @param flagB - flag to test
     * @return true if flagA bit
     */
    public static boolean isORed(VkInternalAllocationType flagA, VkInternalAllocationType flagB){
        int valA = flagA.getValue();
        int valB = flagB.getValue();
        return (valA & valB) == valB;
    }


    /** private ctor */
    private VkInternalAllocationType(String name, int ordinal, int v) {
       super(name, ordinal, v);
       values[ordinal] = this;
    }

 } // end of class VkInternalAllocationType
