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
 * Class to wrap Vulkan enumeration VkMemoryHeapFlagBits
 *
 * <h3>Prototype</h3> <pre>
 * typedef enum VkMemoryHeapFlagBits {
 *     VK_MEMORY_HEAP_DEVICE_LOCAL_BIT = 0x00000001,
 * } VkMemoryHeapFlagBits;
 * </pre>
 * @author Alessandro Borges
 */
public class VkMemoryHeapFlagBits extends IntEnum<VkMemoryHeapFlagBits> {


   /** class */
   private static final Class<VkMemoryHeapFlagBits> myClass = VkMemoryHeapFlagBits.class;

   /** values */
   private static VkMemoryHeapFlagBits[] values = new VkMemoryHeapFlagBits[1];

   public static final VkMemoryHeapFlagBits VK_MEMORY_HEAP_DEVICE_LOCAL_BIT = new VkMemoryHeapFlagBits("VK_MEMORY_HEAP_DEVICE_LOCAL_BIT", 0, 0x00000001);
   
   /**
    * Return all values available in this enumeration
    * @return Array of avail. VkAccessFlagBits
    */
    @SuppressWarnings("unchecked")
    public static VkMemoryHeapFlagBits[] values(){
            return values;
    }

	/**
	 * Get class of this enumeration
	 */
    protected static Class<VkMemoryHeapFlagBits> myGetClass(){
        return myClass;
    }

    /**
     * Creates a bitwise ORed enumeration
     * @param bits - list of enumerations to bitwise OR 
     * @return an enumeration of ORed bits 
     */
    public static VkMemoryHeapFlagBits or(VkMemoryHeapFlagBits...bits){
        int value = bits[0].getValue();        
        for (int i=1; i<bits.length; i++) {
            VkMemoryHeapFlagBits item = bits[i];
            value |= item.getValue();
        } 
        String name = myGetClass().getSimpleName() + " from bitwise Operation.[" + value +"]";
        VkMemoryHeapFlagBits ored = new VkMemoryHeapFlagBits(name, -1, value);        
        return ored;
    }
    
    /**
     * Creates a enumeration of this class, if valid. 
     * If you try to create a invalid enumeration it will raise a exception.
     * @param value - a valid enumeration value or ar ORed value.
     * @return a instance of VkMemoryHeapFlagBits from value. NULL if it is invalid value.
     */
    public static VkMemoryHeapFlagBits fromValue(int value){
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
        VkMemoryHeapFlagBits flag = new VkMemoryHeapFlagBits(name, -1, value); 
        return flag;
    }
    
    /**
     * Check is a given flagA is bitwise ORed with flagB
     * @param flagA - flag to test
     * @param flagB - flag to test
     * @return true if flagA bit
     */
    public static boolean isORed(VkMemoryHeapFlagBits flagA, VkMemoryHeapFlagBits flagB){
        int valA = flagA.getValue();
        int valB = flagB.getValue();
        return (valA & valB) == valB;
    }


    /** private ctor */
    private VkMemoryHeapFlagBits(String name, int ordinal, int v) {
       super(name, ordinal, v);
       values[ordinal] = this;
    }

 } // end of class VkMemoryHeapFlagBits
