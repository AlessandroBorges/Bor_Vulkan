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
 * Class to wrap Vulkan enumeration VkSharingMode
 *
 * <h3>Prototype</h3> <pre>
 * typedef enum VkSharingMode {
 *     VK_SHARING_MODE_EXCLUSIVE = 0,
 *     VK_SHARING_MODE_CONCURRENT = 1,
 *     VK_SHARING_MODE_BEGIN_RANGE = VK_SHARING_MODE_EXCLUSIVE,
 *     VK_SHARING_MODE_END_RANGE = VK_SHARING_MODE_CONCURRENT,
 *     VK_SHARING_MODE_RANGE_SIZE = (VK_SHARING_MODE_CONCURRENT - VK_SHARING_MODE_EXCLUSIVE + 1),
 *     VK_SHARING_MODE_MAX_ENUM = 0x7FFFFFFF
 * } VkSharingMode;
 * </pre>
 * @author Alessandro Borges
 */
public class VkSharingMode extends IntEnum<VkSharingMode> {


   /** class */
   private static final Class<VkSharingMode> myClass = VkSharingMode.class;

   /** values */
   private static VkSharingMode[] values = new VkSharingMode[2];

   public static final VkSharingMode VK_SHARING_MODE_EXCLUSIVE = new VkSharingMode("VK_SHARING_MODE_EXCLUSIVE", 0, 0);
   public static final VkSharingMode VK_SHARING_MODE_CONCURRENT = new VkSharingMode("VK_SHARING_MODE_CONCURRENT", 1, 1);
   
   /**
    * Return all values available in this enumeration
    * @return Array of avail. VkAccessFlagBits
    */
    @SuppressWarnings("unchecked")
    public static VkSharingMode[] values(){
            return values;
    }

	/**
	 * Get class of this enumeration
	 */
    protected static Class<VkSharingMode> myGetClass(){
        return myClass;
    }

    /**
     * Creates a bitwise ORed enumeration
     * @param bits - list of enumerations to bitwise OR 
     * @return an enumeration of ORed bits 
     */
    public static VkSharingMode or(VkSharingMode...bits){
        int value = bits[0].getValue();        
        for (int i=1; i<bits.length; i++) {
            VkSharingMode item = bits[i];
            value |= item.getValue();
        } 
        String name = myGetClass().getSimpleName() + " from bitwise Operation.[" + value +"]";
        VkSharingMode ored = new VkSharingMode(name, -1, value);        
        return ored;
    }
    
    /**
     * Creates a enumeration of this class, if valid. 
     * If you try to create a invalid enumeration it will raise a exception.
     * @param value - a valid enumeration value or ar ORed value.
     * @return a instance of VkSharingMode from value. NULL if it is invalid value.
     */
    public static VkSharingMode fromValue(int value){
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
        VkSharingMode flag = new VkSharingMode(name, -1, value); 
        return flag;
    }
    
    /**
     * Check is a given flagA is bitwise ORed with flagB
     * @param flagA - flag to test
     * @param flagB - flag to test
     * @return true if flagA bit
     */
    public static boolean isORed(VkSharingMode flagA, VkSharingMode flagB){
        int valA = flagA.getValue();
        int valB = flagB.getValue();
        return (valA & valB) == valB;
    }


    /** private ctor */
    private VkSharingMode(String name, int ordinal, int v) {
       super(name, ordinal, v);
       values[ordinal] = this;
    }

 } // end of class VkSharingMode
