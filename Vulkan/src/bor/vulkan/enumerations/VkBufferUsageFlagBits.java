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
 * Class to wrap Vulkan enumeration VkBufferUsageFlagBits
 *
 * <h3>Prototype</h3> <pre>
 * typedef enum VkBufferUsageFlagBits {
 *     VK_BUFFER_USAGE_TRANSFER_SRC_BIT = 0x00000001,
 *     VK_BUFFER_USAGE_TRANSFER_DST_BIT = 0x00000002,
 *     VK_BUFFER_USAGE_UNIFORM_TEXEL_BUFFER_BIT = 0x00000004,
 *     VK_BUFFER_USAGE_STORAGE_TEXEL_BUFFER_BIT = 0x00000008,
 *     VK_BUFFER_USAGE_UNIFORM_BUFFER_BIT = 0x00000010,
 *     VK_BUFFER_USAGE_STORAGE_BUFFER_BIT = 0x00000020,
 *     VK_BUFFER_USAGE_INDEX_BUFFER_BIT = 0x00000040,
 *     VK_BUFFER_USAGE_VERTEX_BUFFER_BIT = 0x00000080,
 *     VK_BUFFER_USAGE_INDIRECT_BUFFER_BIT = 0x00000100,
 *     VK_BUFFER_USAGE_FLAG_BITS_MAX_ENUM = 0x7FFFFFFF
 * } VkBufferUsageFlagBits;
 * </pre>
 * @author Alessandro Borges
 */
public class VkBufferUsageFlagBits extends IntEnum<VkBufferUsageFlagBits> {


   /** class */
   private static final Class<VkBufferUsageFlagBits> myClass = VkBufferUsageFlagBits.class;

   /** values */
   private static VkBufferUsageFlagBits[] values = new VkBufferUsageFlagBits[9];

   public static final VkBufferUsageFlagBits VK_BUFFER_USAGE_TRANSFER_SRC_BIT = new VkBufferUsageFlagBits("VK_BUFFER_USAGE_TRANSFER_SRC_BIT", 0, 0x00000001);
   public static final VkBufferUsageFlagBits VK_BUFFER_USAGE_TRANSFER_DST_BIT = new VkBufferUsageFlagBits("VK_BUFFER_USAGE_TRANSFER_DST_BIT", 1, 0x00000002);
   public static final VkBufferUsageFlagBits VK_BUFFER_USAGE_UNIFORM_TEXEL_BUFFER_BIT = new VkBufferUsageFlagBits("VK_BUFFER_USAGE_UNIFORM_TEXEL_BUFFER_BIT", 2, 0x00000004);
   public static final VkBufferUsageFlagBits VK_BUFFER_USAGE_STORAGE_TEXEL_BUFFER_BIT = new VkBufferUsageFlagBits("VK_BUFFER_USAGE_STORAGE_TEXEL_BUFFER_BIT", 3, 0x00000008);
   public static final VkBufferUsageFlagBits VK_BUFFER_USAGE_UNIFORM_BUFFER_BIT = new VkBufferUsageFlagBits("VK_BUFFER_USAGE_UNIFORM_BUFFER_BIT", 4, 0x00000010);
   public static final VkBufferUsageFlagBits VK_BUFFER_USAGE_STORAGE_BUFFER_BIT = new VkBufferUsageFlagBits("VK_BUFFER_USAGE_STORAGE_BUFFER_BIT", 5, 0x00000020);
   public static final VkBufferUsageFlagBits VK_BUFFER_USAGE_INDEX_BUFFER_BIT = new VkBufferUsageFlagBits("VK_BUFFER_USAGE_INDEX_BUFFER_BIT", 6, 0x00000040);
   public static final VkBufferUsageFlagBits VK_BUFFER_USAGE_VERTEX_BUFFER_BIT = new VkBufferUsageFlagBits("VK_BUFFER_USAGE_VERTEX_BUFFER_BIT", 7, 0x00000080);
   public static final VkBufferUsageFlagBits VK_BUFFER_USAGE_INDIRECT_BUFFER_BIT = new VkBufferUsageFlagBits("VK_BUFFER_USAGE_INDIRECT_BUFFER_BIT", 8, 0x00000100);
   
   /**
    * Return all values available in this enumeration
    * @return Array of avail. VkAccessFlagBits
    */
    @SuppressWarnings("unchecked")
    public static VkBufferUsageFlagBits[] values(){
            return values;
    }

	/**
	 * Get class of this enumeration
	 */
    protected static Class<VkBufferUsageFlagBits> myGetClass(){
        return myClass;
    }

    /**
     * Creates a bitwise ORed enumeration
     * @param bits - list of enumerations to bitwise OR 
     * @return an enumeration of ORed bits 
     */
    public static VkBufferUsageFlagBits or(VkBufferUsageFlagBits...bits){
        int value = bits[0].getValue();        
        for (int i=1; i<bits.length; i++) {
            VkBufferUsageFlagBits item = bits[i];
            value |= item.getValue();
        } 
        String name = myGetClass().getSimpleName() + " from bitwise Operation.[" + value +"]";
        VkBufferUsageFlagBits ored = new VkBufferUsageFlagBits(name, -1, value);        
        return ored;
    }
    
    /**
     * Creates a enumeration of this class, if valid. 
     * If you try to create a invalid enumeration it will raise a exception.
     * @param value - a valid enumeration value or ar ORed value.
     * @return a instance of VkBufferUsageFlagBits from value. NULL if it is invalid value.
     */
    public static VkBufferUsageFlagBits fromValue(int value){
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
        VkBufferUsageFlagBits flag = new VkBufferUsageFlagBits(name, -1, value); 
        return flag;
    }
    
    /**
     * Check is a given flagA is bitwise ORed with flagB
     * @param flagA - flag to test
     * @param flagB - flag to test
     * @return true if flagA bit
     */
    public static boolean isORed(VkBufferUsageFlagBits flagA, VkBufferUsageFlagBits flagB){
        int valA = flagA.getValue();
        int valB = flagB.getValue();
        return (valA & valB) == valB;
    }


    /** private ctor */
    private VkBufferUsageFlagBits(String name, int ordinal, int v) {
       super(name, ordinal, v);
       values[ordinal] = this;
    }

 } // end of class VkBufferUsageFlagBits
