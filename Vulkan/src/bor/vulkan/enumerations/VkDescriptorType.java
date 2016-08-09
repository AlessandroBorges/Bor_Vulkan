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
 * Class to wrap Vulkan enumeration VkDescriptorType
 *
 * <h3>Prototype</h3> <pre>
 * typedef enum VkDescriptorType {
 *     VK_DESCRIPTOR_TYPE_SAMPLER = 0,
 *     VK_DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER = 1,
 *     VK_DESCRIPTOR_TYPE_SAMPLED_IMAGE = 2,
 *     VK_DESCRIPTOR_TYPE_STORAGE_IMAGE = 3,
 *     VK_DESCRIPTOR_TYPE_UNIFORM_TEXEL_BUFFER = 4,
 *     VK_DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER = 5,
 *     VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER = 6,
 *     VK_DESCRIPTOR_TYPE_STORAGE_BUFFER = 7,
 *     VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC = 8,
 *     VK_DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC = 9,
 *     VK_DESCRIPTOR_TYPE_INPUT_ATTACHMENT = 10,
 *     VK_DESCRIPTOR_TYPE_BEGIN_RANGE = VK_DESCRIPTOR_TYPE_SAMPLER,
 *     VK_DESCRIPTOR_TYPE_END_RANGE = VK_DESCRIPTOR_TYPE_INPUT_ATTACHMENT,
 *     VK_DESCRIPTOR_TYPE_RANGE_SIZE = (VK_DESCRIPTOR_TYPE_INPUT_ATTACHMENT - VK_DESCRIPTOR_TYPE_SAMPLER + 1),
 *     VK_DESCRIPTOR_TYPE_MAX_ENUM = 0x7FFFFFFF
 * } VkDescriptorType;
 * </pre>
 * @author Alessandro Borges
 */
public class VkDescriptorType extends IntEnum<VkDescriptorType> {


   /** class */
   private static final Class<VkDescriptorType> myClass = VkDescriptorType.class;

   /** values */
   private static VkDescriptorType[] values = new VkDescriptorType[11];

   public static final VkDescriptorType VK_DESCRIPTOR_TYPE_SAMPLER = new VkDescriptorType("VK_DESCRIPTOR_TYPE_SAMPLER", 0, 0);
   public static final VkDescriptorType VK_DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER = new VkDescriptorType("VK_DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER", 1, 1);
   public static final VkDescriptorType VK_DESCRIPTOR_TYPE_SAMPLED_IMAGE = new VkDescriptorType("VK_DESCRIPTOR_TYPE_SAMPLED_IMAGE", 2, 2);
   public static final VkDescriptorType VK_DESCRIPTOR_TYPE_STORAGE_IMAGE = new VkDescriptorType("VK_DESCRIPTOR_TYPE_STORAGE_IMAGE", 3, 3);
   public static final VkDescriptorType VK_DESCRIPTOR_TYPE_UNIFORM_TEXEL_BUFFER = new VkDescriptorType("VK_DESCRIPTOR_TYPE_UNIFORM_TEXEL_BUFFER", 4, 4);
   public static final VkDescriptorType VK_DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER = new VkDescriptorType("VK_DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER", 5, 5);
   public static final VkDescriptorType VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER = new VkDescriptorType("VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER", 6, 6);
   public static final VkDescriptorType VK_DESCRIPTOR_TYPE_STORAGE_BUFFER = new VkDescriptorType("VK_DESCRIPTOR_TYPE_STORAGE_BUFFER", 7, 7);
   public static final VkDescriptorType VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC = new VkDescriptorType("VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC", 8, 8);
   public static final VkDescriptorType VK_DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC = new VkDescriptorType("VK_DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC", 9, 9);
   public static final VkDescriptorType VK_DESCRIPTOR_TYPE_INPUT_ATTACHMENT = new VkDescriptorType("VK_DESCRIPTOR_TYPE_INPUT_ATTACHMENT", 10, 10);
   
   /**
    * Return all values available in this enumeration
    * @return Array of avail. VkAccessFlagBits
    */
    @SuppressWarnings("unchecked")
    public static VkDescriptorType[] values(){
            return values;
    }

	/**
	 * Get class of this enumeration
	 */
    protected static Class<VkDescriptorType> myGetClass(){
        return myClass;
    }

    /**
     * Creates a bitwise ORed enumeration
     * @param bits - list of enumerations to bitwise OR 
     * @return an enumeration of ORed bits 
     */
    public static VkDescriptorType or(VkDescriptorType...bits){
        int value = bits[0].getValue();        
        for (int i=1; i<bits.length; i++) {
            VkDescriptorType item = bits[i];
            value |= item.getValue();
        } 
        String name = myGetClass().getSimpleName() + " from bitwise Operation.[" + value +"]";
        VkDescriptorType ored = new VkDescriptorType(name, -1, value);        
        return ored;
    }
    
    /**
     * Creates a enumeration of this class, if valid. 
     * If you try to create a invalid enumeration it will raise a exception.
     * @param value - a valid enumeration value or ar ORed value.
     * @return a instance of VkDescriptorType from value. NULL if it is invalid value.
     */
    public static VkDescriptorType fromValue(int value){
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
        VkDescriptorType flag = new VkDescriptorType(name, -1, value); 
        return flag;
    }
    
    /**
     * Check is a given flagA is bitwise ORed with flagB
     * @param flagA - flag to test
     * @param flagB - flag to test
     * @return true if flagA bit
     */
    public static boolean isORed(VkDescriptorType flagA, VkDescriptorType flagB){
        int valA = flagA.getValue();
        int valB = flagB.getValue();
        return (valA & valB) == valB;
    }


    /** private ctor */
    private VkDescriptorType(String name, int ordinal, int v) {
       super(name, ordinal, v);
       values[ordinal] = this;
    }

 } // end of class VkDescriptorType
