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
 * Class to wrap Vulkan enumeration VkSystemAllocationScope
 *
 * <h3>Prototype</h3> <pre>
 * typedef enum VkSystemAllocationScope {
 *     VK_SYSTEM_ALLOCATION_SCOPE_COMMAND = 0,
 *     VK_SYSTEM_ALLOCATION_SCOPE_OBJECT = 1,
 *     VK_SYSTEM_ALLOCATION_SCOPE_CACHE = 2,
 *     VK_SYSTEM_ALLOCATION_SCOPE_DEVICE = 3,
 *     VK_SYSTEM_ALLOCATION_SCOPE_INSTANCE = 4,
 *     VK_SYSTEM_ALLOCATION_SCOPE_BEGIN_RANGE = VK_SYSTEM_ALLOCATION_SCOPE_COMMAND,
 *     VK_SYSTEM_ALLOCATION_SCOPE_END_RANGE = VK_SYSTEM_ALLOCATION_SCOPE_INSTANCE,
 *     VK_SYSTEM_ALLOCATION_SCOPE_RANGE_SIZE = (VK_SYSTEM_ALLOCATION_SCOPE_INSTANCE - VK_SYSTEM_ALLOCATION_SCOPE_COMMAND + 1),
 *     VK_SYSTEM_ALLOCATION_SCOPE_MAX_ENUM = 0x7FFFFFFF
 * } VkSystemAllocationScope;
 * </pre>
 * @author Alessandro Borges
 */
public class VkSystemAllocationScope extends IntEnum<VkSystemAllocationScope> {


   /** class */
   private static final Class<VkSystemAllocationScope> myClass = VkSystemAllocationScope.class;

   /** values */
   private static VkSystemAllocationScope[] values = new VkSystemAllocationScope[5];

   public static final VkSystemAllocationScope VK_SYSTEM_ALLOCATION_SCOPE_COMMAND = new VkSystemAllocationScope("VK_SYSTEM_ALLOCATION_SCOPE_COMMAND", 0, 0);
   public static final VkSystemAllocationScope VK_SYSTEM_ALLOCATION_SCOPE_OBJECT = new VkSystemAllocationScope("VK_SYSTEM_ALLOCATION_SCOPE_OBJECT", 1, 1);
   public static final VkSystemAllocationScope VK_SYSTEM_ALLOCATION_SCOPE_CACHE = new VkSystemAllocationScope("VK_SYSTEM_ALLOCATION_SCOPE_CACHE", 2, 2);
   public static final VkSystemAllocationScope VK_SYSTEM_ALLOCATION_SCOPE_DEVICE = new VkSystemAllocationScope("VK_SYSTEM_ALLOCATION_SCOPE_DEVICE", 3, 3);
   public static final VkSystemAllocationScope VK_SYSTEM_ALLOCATION_SCOPE_INSTANCE = new VkSystemAllocationScope("VK_SYSTEM_ALLOCATION_SCOPE_INSTANCE", 4, 4);
   
   /**
    * Return all values available in this enumeration
    * @return Array of avail. VkAccessFlagBits
    */
    @SuppressWarnings("unchecked")
    public static VkSystemAllocationScope[] values(){
            return values;
    }

	/**
	 * Get class of this enumeration
	 */
    protected static Class<VkSystemAllocationScope> myGetClass(){
        return myClass;
    }

    /**
     * Creates a bitwise ORed enumeration
     * @param bits - list of enumerations to bitwise OR 
     * @return an enumeration of ORed bits 
     */
    public static VkSystemAllocationScope or(VkSystemAllocationScope...bits){
        int value = bits[0].getValue();        
        for (int i=1; i<bits.length; i++) {
            VkSystemAllocationScope item = bits[i];
            value |= item.getValue();
        } 
        String name = myGetClass().getSimpleName() + " from bitwise Operation.[" + value +"]";
        VkSystemAllocationScope ored = new VkSystemAllocationScope(name, -1, value);        
        return ored;
    }
    
    /**
     * Creates a enumeration of this class, if valid. 
     * If you try to create a invalid enumeration it will raise a exception.
     * @param value - a valid enumeration value or ar ORed value.
     * @return a instance of VkSystemAllocationScope from value. NULL if it is invalid value.
     */
    public static VkSystemAllocationScope fromValue(int value){
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
        VkSystemAllocationScope flag = new VkSystemAllocationScope(name, -1, value); 
        return flag;
    }
    
    /**
     * Check is a given flagA is bitwise ORed with flagB
     * @param flagA - flag to test
     * @param flagB - flag to test
     * @return true if flagA bit
     */
    public static boolean isORed(VkSystemAllocationScope flagA, VkSystemAllocationScope flagB){
        int valA = flagA.getValue();
        int valB = flagB.getValue();
        return (valA & valB) == valB;
    }


    /** private ctor */
    private VkSystemAllocationScope(String name, int ordinal, int v) {
       super(name, ordinal, v);
       values[ordinal] = this;
    }

 } // end of class VkSystemAllocationScope
