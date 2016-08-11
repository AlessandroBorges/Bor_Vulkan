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
 * Class to wrap Vulkan enumeration VkMemoryPropertyFlagBits
 *
 * <h3>Prototype</h3> <pre>
 * typedef enum VkMemoryPropertyFlagBits {
 *     VK_MEMORY_PROPERTY_DEVICE_LOCAL_BIT = 0x00000001,
 *     VK_MEMORY_PROPERTY_HOST_VISIBLE_BIT = 0x00000002,
 *     VK_MEMORY_PROPERTY_HOST_COHERENT_BIT = 0x00000004,
 *     VK_MEMORY_PROPERTY_HOST_CACHED_BIT = 0x00000008,
 *     VK_MEMORY_PROPERTY_LAZILY_ALLOCATED_BIT = 0x00000010,
 *     VK_MEMORY_PROPERTY_FLAG_BITS_MAX_ENUM = 0x7FFFFFFF
 * } VkMemoryPropertyFlagBits;
 * </pre>
 * @author Alessandro Borges
 */
public class VkMemoryPropertyFlagBits extends IntEnum<VkMemoryPropertyFlagBits> {


   /** class */
   private static final Class<VkMemoryPropertyFlagBits> myClass = VkMemoryPropertyFlagBits.class;

   /** values */
   private static VkMemoryPropertyFlagBits[] values = new VkMemoryPropertyFlagBits[5];

   public static final VkMemoryPropertyFlagBits VK_MEMORY_PROPERTY_DEVICE_LOCAL_BIT = new VkMemoryPropertyFlagBits("VK_MEMORY_PROPERTY_DEVICE_LOCAL_BIT", 0, 0x00000001);
   public static final VkMemoryPropertyFlagBits VK_MEMORY_PROPERTY_HOST_VISIBLE_BIT = new VkMemoryPropertyFlagBits("VK_MEMORY_PROPERTY_HOST_VISIBLE_BIT", 1, 0x00000002);
   public static final VkMemoryPropertyFlagBits VK_MEMORY_PROPERTY_HOST_COHERENT_BIT = new VkMemoryPropertyFlagBits("VK_MEMORY_PROPERTY_HOST_COHERENT_BIT", 2, 0x00000004);
   public static final VkMemoryPropertyFlagBits VK_MEMORY_PROPERTY_HOST_CACHED_BIT = new VkMemoryPropertyFlagBits("VK_MEMORY_PROPERTY_HOST_CACHED_BIT", 3, 0x00000008);
   public static final VkMemoryPropertyFlagBits VK_MEMORY_PROPERTY_LAZILY_ALLOCATED_BIT = new VkMemoryPropertyFlagBits("VK_MEMORY_PROPERTY_LAZILY_ALLOCATED_BIT", 4, 0x00000010);
   
   /**
    * Return all values available in this enumeration
    * @return Array of avail. VkAccessFlagBits
    */
    @SuppressWarnings("unchecked")
    public static VkMemoryPropertyFlagBits[] values(){
            return values;
    }

	/**
	 * Get class of this enumeration
	 */
    protected static Class<VkMemoryPropertyFlagBits> myGetClass(){
        return myClass;
    }

    /**
     * Creates a bitwise ORed enumeration
     * @param bits - list of enumerations to bitwise OR 
     * @return an enumeration of ORed bits 
     */
    public static VkMemoryPropertyFlagBits or(VkMemoryPropertyFlagBits...bits){
        int value = bits[0].getValue();        
        for (int i=1; i<bits.length; i++) {
            VkMemoryPropertyFlagBits item = bits[i];
            value |= item.getValue();
        } 
        String name = myGetClass().getSimpleName() + " from bitwise Operation.[" + value +"]";
        VkMemoryPropertyFlagBits ored = new VkMemoryPropertyFlagBits(name, -1, value);        
        return ored;
    }
    
    /**
     * Creates a enumeration of this class, if valid. 
     * If you try to create a invalid enumeration it will raise a exception.
     * @param value - a valid enumeration value or ar ORed value.
     * @return a instance of VkMemoryPropertyFlagBits from value. NULL if it is invalid value.
     */
    public static VkMemoryPropertyFlagBits fromValue(int value){
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
        VkMemoryPropertyFlagBits flag = new VkMemoryPropertyFlagBits(name, -1, value); 
        return flag;
    }
	
	/**
     * Creates/populates a array of VkMemoryPropertyFlagBits from a set of values.
     * @param dst - destination array. Can be null.
     * @param values - int[] with valid values of this enumeration.
     * @return VkMemoryPropertyFlagBits array with matching values
     */
    public static VkMemoryPropertyFlagBits[] fromValues(VkMemoryPropertyFlagBits[] dst, int[] values){
        if(values == null) 
               return null;
        if(dst == null || dst.length != values.length){
            dst = new VkMemoryPropertyFlagBits[values.length];
        }        
        for (int i = 0; i < values.length; i++) {
            int val = values[i];
            dst[i] = VkMemoryPropertyFlagBits.fromValue(val);
        }        
        return dst;
    }
    
    /**
     * Check is a given flagA is bitwise ORed with flagB
     * @param flagA - flag to test
     * @param flagB - flag to test
     * @return true if flagA bit
     */
    public static boolean isORed(VkMemoryPropertyFlagBits flagA, VkMemoryPropertyFlagBits flagB){
        int valA = flagA.getValue();
        int valB = flagB.getValue();
        return (valA & valB) == valB;
    }


    /** private ctor */
    private VkMemoryPropertyFlagBits(String name, int ordinal, int v) {
       super(name, ordinal, v);
       values[ordinal] = this;
    }

 } // end of class VkMemoryPropertyFlagBits
