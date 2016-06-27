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
 * Class to wrap Vulkan enumeration VkAccessFlagBits
 *
 * <h3>Prototype</h3> <pre>
 * typedef enum VkAccessFlagBits {
 *     VK_ACCESS_INDIRECT_COMMAND_READ_BIT = 0x00000001,
 *     VK_ACCESS_INDEX_READ_BIT = 0x00000002,
 *     VK_ACCESS_VERTEX_ATTRIBUTE_READ_BIT = 0x00000004,
 *     VK_ACCESS_UNIFORM_READ_BIT = 0x00000008,
 *     VK_ACCESS_INPUT_ATTACHMENT_READ_BIT = 0x00000010,
 *     VK_ACCESS_SHADER_READ_BIT = 0x00000020,
 *     VK_ACCESS_SHADER_WRITE_BIT = 0x00000040,
 *     VK_ACCESS_COLOR_ATTACHMENT_READ_BIT = 0x00000080,
 *     VK_ACCESS_COLOR_ATTACHMENT_WRITE_BIT = 0x00000100,
 *     VK_ACCESS_DEPTH_STENCIL_ATTACHMENT_READ_BIT = 0x00000200,
 *     VK_ACCESS_DEPTH_STENCIL_ATTACHMENT_WRITE_BIT = 0x00000400,
 *     VK_ACCESS_TRANSFER_READ_BIT = 0x00000800,
 *     VK_ACCESS_TRANSFER_WRITE_BIT = 0x00001000,
 *     VK_ACCESS_HOST_READ_BIT = 0x00002000,
 *     VK_ACCESS_HOST_WRITE_BIT = 0x00004000,
 *     VK_ACCESS_MEMORY_READ_BIT = 0x00008000,
 *     VK_ACCESS_MEMORY_WRITE_BIT = 0x00010000,
 *     VK_ACCESS_FLAG_BITS_MAX_ENUM = 0x7FFFFFFF
 * } VkAccessFlagBits;
 * </pre>
 * @author Alessandro Borges
 */
public class VkAccessFlagBits extends IntEnum<VkAccessFlagBits> {


   /** class */
   private static final Class<VkAccessFlagBits> myClass = VkAccessFlagBits.class;

   /** values */
   private static VkAccessFlagBits[] values = new VkAccessFlagBits[17];

   public static final VkAccessFlagBits VK_ACCESS_INDIRECT_COMMAND_READ_BIT = new VkAccessFlagBits("VK_ACCESS_INDIRECT_COMMAND_READ_BIT", 0, 0x00000001);
   public static final VkAccessFlagBits VK_ACCESS_INDEX_READ_BIT = new VkAccessFlagBits("VK_ACCESS_INDEX_READ_BIT", 1, 0x00000002);
   public static final VkAccessFlagBits VK_ACCESS_VERTEX_ATTRIBUTE_READ_BIT = new VkAccessFlagBits("VK_ACCESS_VERTEX_ATTRIBUTE_READ_BIT", 2, 0x00000004);
   public static final VkAccessFlagBits VK_ACCESS_UNIFORM_READ_BIT = new VkAccessFlagBits("VK_ACCESS_UNIFORM_READ_BIT", 3, 0x00000008);
   public static final VkAccessFlagBits VK_ACCESS_INPUT_ATTACHMENT_READ_BIT = new VkAccessFlagBits("VK_ACCESS_INPUT_ATTACHMENT_READ_BIT", 4, 0x00000010);
   public static final VkAccessFlagBits VK_ACCESS_SHADER_READ_BIT = new VkAccessFlagBits("VK_ACCESS_SHADER_READ_BIT", 5, 0x00000020);
   public static final VkAccessFlagBits VK_ACCESS_SHADER_WRITE_BIT = new VkAccessFlagBits("VK_ACCESS_SHADER_WRITE_BIT", 6, 0x00000040);
   public static final VkAccessFlagBits VK_ACCESS_COLOR_ATTACHMENT_READ_BIT = new VkAccessFlagBits("VK_ACCESS_COLOR_ATTACHMENT_READ_BIT", 7, 0x00000080);
   public static final VkAccessFlagBits VK_ACCESS_COLOR_ATTACHMENT_WRITE_BIT = new VkAccessFlagBits("VK_ACCESS_COLOR_ATTACHMENT_WRITE_BIT", 8, 0x00000100);
   public static final VkAccessFlagBits VK_ACCESS_DEPTH_STENCIL_ATTACHMENT_READ_BIT = new VkAccessFlagBits("VK_ACCESS_DEPTH_STENCIL_ATTACHMENT_READ_BIT", 9, 0x00000200);
   public static final VkAccessFlagBits VK_ACCESS_DEPTH_STENCIL_ATTACHMENT_WRITE_BIT = new VkAccessFlagBits("VK_ACCESS_DEPTH_STENCIL_ATTACHMENT_WRITE_BIT", 10, 0x00000400);
   public static final VkAccessFlagBits VK_ACCESS_TRANSFER_READ_BIT = new VkAccessFlagBits("VK_ACCESS_TRANSFER_READ_BIT", 11, 0x00000800);
   public static final VkAccessFlagBits VK_ACCESS_TRANSFER_WRITE_BIT = new VkAccessFlagBits("VK_ACCESS_TRANSFER_WRITE_BIT", 12, 0x00001000);
   public static final VkAccessFlagBits VK_ACCESS_HOST_READ_BIT = new VkAccessFlagBits("VK_ACCESS_HOST_READ_BIT", 13, 0x00002000);
   public static final VkAccessFlagBits VK_ACCESS_HOST_WRITE_BIT = new VkAccessFlagBits("VK_ACCESS_HOST_WRITE_BIT", 14, 0x00004000);
   public static final VkAccessFlagBits VK_ACCESS_MEMORY_READ_BIT = new VkAccessFlagBits("VK_ACCESS_MEMORY_READ_BIT", 15, 0x00008000);
   public static final VkAccessFlagBits VK_ACCESS_MEMORY_WRITE_BIT = new VkAccessFlagBits("VK_ACCESS_MEMORY_WRITE_BIT", 16, 0x00010000);
   
   /**
    * Return all values available in this enumeration
    * @return Array of avail. VkAccessFlagBits
    */
    @SuppressWarnings("unchecked")
    public static VkAccessFlagBits[] values(){
            return values;
    }

	/**
	 * Get class of this enumeration
	 */
    protected static Class<VkAccessFlagBits> myGetClass(){
        return myClass;
    }

    /**
     * Creates a bitwise ORed enumeration
     * @param bits - list of enumerations to bitwise OR 
     * @return an enumeration of ORed bits 
     */
    public static VkAccessFlagBits or(VkAccessFlagBits...bits){
        int value = bits[0].getValue();        
        for (int i=1; i<bits.length; i++) {
            VkAccessFlagBits item = bits[i];
            value |= item.getValue();
        } 
        String name = myGetClass().getSimpleName() + " from bitwise Operation.[" + value +"]";
        VkAccessFlagBits ored = new VkAccessFlagBits(name, -1, value);        
        return ored;
    }
    
    /**
     * Creates a enumeration of this class, if valid. 
     * If you try to create a invalid enumeration it will raise a exception.
     * @param value - a valid enumeration value or ar ORed value.
     * @return a instance of VkAccessFlagBits from value. NULL if it is invalid value.
     */
    public static VkAccessFlagBits fromValue(int value){
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
        VkAccessFlagBits flag = new VkAccessFlagBits(name, -1, value); 
        return flag;
    }
    
    /**
     * Check is a given flagA is bitwise ORed with flagB
     * @param flagA - flag to test
     * @param flagB - flag to test
     * @return true if flagA bit
     */
    public static boolean isORed(VkAccessFlagBits flagA, VkAccessFlagBits flagB){
        int valA = flagA.getValue();
        int valB = flagB.getValue();
        return (valA & valB) == valB;
    }


    /** private ctor */
    private VkAccessFlagBits(String name, int ordinal, int v) {
       super(name, ordinal, v);
       values[ordinal] = this;
    }

 } // end of class VkAccessFlagBits
