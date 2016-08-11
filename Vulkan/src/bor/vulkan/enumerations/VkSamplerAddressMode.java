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
 * Class to wrap Vulkan enumeration VkSamplerAddressMode
 *
 * <h3>Prototype</h3> <pre>
 * typedef enum VkSamplerAddressMode {
 *     VK_SAMPLER_ADDRESS_MODE_REPEAT = 0,
 *     VK_SAMPLER_ADDRESS_MODE_MIRRORED_REPEAT = 1,
 *     VK_SAMPLER_ADDRESS_MODE_CLAMP_TO_EDGE = 2,
 *     VK_SAMPLER_ADDRESS_MODE_CLAMP_TO_BORDER = 3,
 *     VK_SAMPLER_ADDRESS_MODE_MIRROR_CLAMP_TO_EDGE = 4,
 *     VK_SAMPLER_ADDRESS_MODE_BEGIN_RANGE = VK_SAMPLER_ADDRESS_MODE_REPEAT,
 *     VK_SAMPLER_ADDRESS_MODE_END_RANGE = VK_SAMPLER_ADDRESS_MODE_CLAMP_TO_BORDER,
 *     VK_SAMPLER_ADDRESS_MODE_RANGE_SIZE = (VK_SAMPLER_ADDRESS_MODE_CLAMP_TO_BORDER - VK_SAMPLER_ADDRESS_MODE_REPEAT + 1),
 *     VK_SAMPLER_ADDRESS_MODE_MAX_ENUM = 0x7FFFFFFF
 * } VkSamplerAddressMode;
 * </pre>
 * @author Alessandro Borges
 */
public class VkSamplerAddressMode extends IntEnum<VkSamplerAddressMode> {


   /** class */
   private static final Class<VkSamplerAddressMode> myClass = VkSamplerAddressMode.class;

   /** values */
   private static VkSamplerAddressMode[] values = new VkSamplerAddressMode[5];

   public static final VkSamplerAddressMode VK_SAMPLER_ADDRESS_MODE_REPEAT = new VkSamplerAddressMode("VK_SAMPLER_ADDRESS_MODE_REPEAT", 0, 0);
   public static final VkSamplerAddressMode VK_SAMPLER_ADDRESS_MODE_MIRRORED_REPEAT = new VkSamplerAddressMode("VK_SAMPLER_ADDRESS_MODE_MIRRORED_REPEAT", 1, 1);
   public static final VkSamplerAddressMode VK_SAMPLER_ADDRESS_MODE_CLAMP_TO_EDGE = new VkSamplerAddressMode("VK_SAMPLER_ADDRESS_MODE_CLAMP_TO_EDGE", 2, 2);
   public static final VkSamplerAddressMode VK_SAMPLER_ADDRESS_MODE_CLAMP_TO_BORDER = new VkSamplerAddressMode("VK_SAMPLER_ADDRESS_MODE_CLAMP_TO_BORDER", 3, 3);
   public static final VkSamplerAddressMode VK_SAMPLER_ADDRESS_MODE_MIRROR_CLAMP_TO_EDGE = new VkSamplerAddressMode("VK_SAMPLER_ADDRESS_MODE_MIRROR_CLAMP_TO_EDGE", 4, 4);
   
   /**
    * Return all values available in this enumeration
    * @return Array of avail. VkAccessFlagBits
    */
    @SuppressWarnings("unchecked")
    public static VkSamplerAddressMode[] values(){
            return values;
    }

	/**
	 * Get class of this enumeration
	 */
    protected static Class<VkSamplerAddressMode> myGetClass(){
        return myClass;
    }

    /**
     * Creates a bitwise ORed enumeration
     * @param bits - list of enumerations to bitwise OR 
     * @return an enumeration of ORed bits 
     */
    public static VkSamplerAddressMode or(VkSamplerAddressMode...bits){
        int value = bits[0].getValue();        
        for (int i=1; i<bits.length; i++) {
            VkSamplerAddressMode item = bits[i];
            value |= item.getValue();
        } 
        String name = myGetClass().getSimpleName() + " from bitwise Operation.[" + value +"]";
        VkSamplerAddressMode ored = new VkSamplerAddressMode(name, -1, value);        
        return ored;
    }
    
    /**
     * Creates a enumeration of this class, if valid. 
     * If you try to create a invalid enumeration it will raise a exception.
     * @param value - a valid enumeration value or ar ORed value.
     * @return a instance of VkSamplerAddressMode from value. NULL if it is invalid value.
     */
    public static VkSamplerAddressMode fromValue(int value){
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
        VkSamplerAddressMode flag = new VkSamplerAddressMode(name, -1, value); 
        return flag;
    }
	
	/**
     * Creates/populates a array of VkSamplerAddressMode from a set of values.
     * @param dst - destination array. Can be null.
     * @param values - int[] with valid values of this enumeration.
     * @return VkSamplerAddressMode array with matching values
     */
    public static VkSamplerAddressMode[] fromValues(VkSamplerAddressMode[] dst, int[] values){
        if(values == null) 
               return null;
        if(dst == null || dst.length != values.length){
            dst = new VkSamplerAddressMode[values.length];
        }        
        for (int i = 0; i < values.length; i++) {
            int val = values[i];
            dst[i] = VkSamplerAddressMode.fromValue(val);
        }        
        return dst;
    }
    
    /**
     * Check is a given flagA is bitwise ORed with flagB
     * @param flagA - flag to test
     * @param flagB - flag to test
     * @return true if flagA bit
     */
    public static boolean isORed(VkSamplerAddressMode flagA, VkSamplerAddressMode flagB){
        int valA = flagA.getValue();
        int valB = flagB.getValue();
        return (valA & valB) == valB;
    }


    /** private ctor */
    private VkSamplerAddressMode(String name, int ordinal, int v) {
       super(name, ordinal, v);
       values[ordinal] = this;
    }

 } // end of class VkSamplerAddressMode
