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
 * Class to wrap Vulkan enumeration VkPhysicalDeviceType
 *
 * <h3>Prototype</h3> <pre>
 * typedef enum VkPhysicalDeviceType {
 *     VK_PHYSICAL_DEVICE_TYPE_OTHER = 0,
 *     VK_PHYSICAL_DEVICE_TYPE_INTEGRATED_GPU = 1,
 *     VK_PHYSICAL_DEVICE_TYPE_DISCRETE_GPU = 2,
 *     VK_PHYSICAL_DEVICE_TYPE_VIRTUAL_GPU = 3,
 *     VK_PHYSICAL_DEVICE_TYPE_CPU = 4,
 *     VK_PHYSICAL_DEVICE_TYPE_BEGIN_RANGE = VK_PHYSICAL_DEVICE_TYPE_OTHER,
 *     VK_PHYSICAL_DEVICE_TYPE_END_RANGE = VK_PHYSICAL_DEVICE_TYPE_CPU,
 *     VK_PHYSICAL_DEVICE_TYPE_RANGE_SIZE = (VK_PHYSICAL_DEVICE_TYPE_CPU - VK_PHYSICAL_DEVICE_TYPE_OTHER + 1),
 *     VK_PHYSICAL_DEVICE_TYPE_MAX_ENUM = 0x7FFFFFFF
 * } VkPhysicalDeviceType;
 * </pre>
 * @author Alessandro Borges
 */
public class VkPhysicalDeviceType extends IntEnum<VkPhysicalDeviceType> {


   /** class */
   private static final Class<VkPhysicalDeviceType> myClass = VkPhysicalDeviceType.class;

   /** values */
   private static VkPhysicalDeviceType[] values = new VkPhysicalDeviceType[5];

   public static final VkPhysicalDeviceType VK_PHYSICAL_DEVICE_TYPE_OTHER = new VkPhysicalDeviceType("VK_PHYSICAL_DEVICE_TYPE_OTHER", 0, 0);
   public static final VkPhysicalDeviceType VK_PHYSICAL_DEVICE_TYPE_INTEGRATED_GPU = new VkPhysicalDeviceType("VK_PHYSICAL_DEVICE_TYPE_INTEGRATED_GPU", 1, 1);
   public static final VkPhysicalDeviceType VK_PHYSICAL_DEVICE_TYPE_DISCRETE_GPU = new VkPhysicalDeviceType("VK_PHYSICAL_DEVICE_TYPE_DISCRETE_GPU", 2, 2);
   public static final VkPhysicalDeviceType VK_PHYSICAL_DEVICE_TYPE_VIRTUAL_GPU = new VkPhysicalDeviceType("VK_PHYSICAL_DEVICE_TYPE_VIRTUAL_GPU", 3, 3);
   public static final VkPhysicalDeviceType VK_PHYSICAL_DEVICE_TYPE_CPU = new VkPhysicalDeviceType("VK_PHYSICAL_DEVICE_TYPE_CPU", 4, 4);
   
   /**
    * Return all values available in this enumeration
    * @return Array of avail. VkAccessFlagBits
    */
    @SuppressWarnings("unchecked")
    public static VkPhysicalDeviceType[] values(){
            return values;
    }

	/**
	 * Get class of this enumeration
	 */
    protected static Class<VkPhysicalDeviceType> myGetClass(){
        return myClass;
    }

    /**
     * Creates a bitwise ORed enumeration
     * @param bits - list of enumerations to bitwise OR 
     * @return an enumeration of ORed bits 
     */
    public static VkPhysicalDeviceType or(VkPhysicalDeviceType...bits){
        int value = bits[0].getValue();        
        for (int i=1; i<bits.length; i++) {
            VkPhysicalDeviceType item = bits[i];
            value |= item.getValue();
        } 
        String name = myGetClass().getSimpleName() + " from bitwise Operation.[" + value +"]";
        VkPhysicalDeviceType ored = new VkPhysicalDeviceType(name, -1, value);        
        return ored;
    }
    
    /**
     * Creates a enumeration of this class, if valid. 
     * If you try to create a invalid enumeration it will raise a exception.
     * @param value - a valid enumeration value or ar ORed value.
     * @return a instance of VkPhysicalDeviceType from value. NULL if it is invalid value.
     */
    public static VkPhysicalDeviceType fromValue(int value){
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
        VkPhysicalDeviceType flag = new VkPhysicalDeviceType(name, -1, value); 
        return flag;
    }
    
    /**
     * Check is a given flagA is bitwise ORed with flagB
     * @param flagA - flag to test
     * @param flagB - flag to test
     * @return true if flagA bit
     */
    public static boolean isORed(VkPhysicalDeviceType flagA, VkPhysicalDeviceType flagB){
        int valA = flagA.getValue();
        int valB = flagB.getValue();
        return (valA & valB) == valB;
    }


    /** private ctor */
    private VkPhysicalDeviceType(String name, int ordinal, int v) {
       super(name, ordinal, v);
       values[ordinal] = this;
    }

 } // end of class VkPhysicalDeviceType
