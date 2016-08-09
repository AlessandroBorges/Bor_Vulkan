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
 * Class to wrap Vulkan enumeration VkIndexType
 *
 * <h3>Prototype</h3> <pre>
 * typedef enum VkIndexType {
 *     VK_INDEX_TYPE_UINT16 = 0,
 *     VK_INDEX_TYPE_UINT32 = 1,
 *     VK_INDEX_TYPE_BEGIN_RANGE = VK_INDEX_TYPE_UINT16,
 *     VK_INDEX_TYPE_END_RANGE = VK_INDEX_TYPE_UINT32,
 *     VK_INDEX_TYPE_RANGE_SIZE = (VK_INDEX_TYPE_UINT32 - VK_INDEX_TYPE_UINT16 + 1),
 *     VK_INDEX_TYPE_MAX_ENUM = 0x7FFFFFFF
 * } VkIndexType;
 * </pre>
 * @author Alessandro Borges
 */
public class VkIndexType extends IntEnum<VkIndexType> {


   /** class */
   private static final Class<VkIndexType> myClass = VkIndexType.class;

   /** values */
   private static VkIndexType[] values = new VkIndexType[2];

   public static final VkIndexType VK_INDEX_TYPE_UINT16 = new VkIndexType("VK_INDEX_TYPE_UINT16", 0, 0);
   public static final VkIndexType VK_INDEX_TYPE_UINT32 = new VkIndexType("VK_INDEX_TYPE_UINT32", 1, 1);
   
   /**
    * Return all values available in this enumeration
    * @return Array of avail. VkAccessFlagBits
    */
    @SuppressWarnings("unchecked")
    public static VkIndexType[] values(){
            return values;
    }

	/**
	 * Get class of this enumeration
	 */
    protected static Class<VkIndexType> myGetClass(){
        return myClass;
    }

    /**
     * Creates a bitwise ORed enumeration
     * @param bits - list of enumerations to bitwise OR 
     * @return an enumeration of ORed bits 
     */
    public static VkIndexType or(VkIndexType...bits){
        int value = bits[0].getValue();        
        for (int i=1; i<bits.length; i++) {
            VkIndexType item = bits[i];
            value |= item.getValue();
        } 
        String name = myGetClass().getSimpleName() + " from bitwise Operation.[" + value +"]";
        VkIndexType ored = new VkIndexType(name, -1, value);        
        return ored;
    }
    
    /**
     * Creates a enumeration of this class, if valid. 
     * If you try to create a invalid enumeration it will raise a exception.
     * @param value - a valid enumeration value or ar ORed value.
     * @return a instance of VkIndexType from value. NULL if it is invalid value.
     */
    public static VkIndexType fromValue(int value){
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
        VkIndexType flag = new VkIndexType(name, -1, value); 
        return flag;
    }
    
    /**
     * Check is a given flagA is bitwise ORed with flagB
     * @param flagA - flag to test
     * @param flagB - flag to test
     * @return true if flagA bit
     */
    public static boolean isORed(VkIndexType flagA, VkIndexType flagB){
        int valA = flagA.getValue();
        int valB = flagB.getValue();
        return (valA & valB) == valB;
    }


    /** private ctor */
    private VkIndexType(String name, int ordinal, int v) {
       super(name, ordinal, v);
       values[ordinal] = this;
    }

 } // end of class VkIndexType
