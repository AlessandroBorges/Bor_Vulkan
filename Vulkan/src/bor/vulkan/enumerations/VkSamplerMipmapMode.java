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
 * Class to wrap Vulkan enumeration VkSamplerMipmapMode
 *
 * <h3>Prototype</h3> <pre>
 * typedef enum VkSamplerMipmapMode {
 *     VK_SAMPLER_MIPMAP_MODE_NEAREST = 0,
 *     VK_SAMPLER_MIPMAP_MODE_LINEAR = 1,
 *     VK_SAMPLER_MIPMAP_MODE_BEGIN_RANGE = VK_SAMPLER_MIPMAP_MODE_NEAREST,
 *     VK_SAMPLER_MIPMAP_MODE_END_RANGE = VK_SAMPLER_MIPMAP_MODE_LINEAR,
 *     VK_SAMPLER_MIPMAP_MODE_RANGE_SIZE = (VK_SAMPLER_MIPMAP_MODE_LINEAR - VK_SAMPLER_MIPMAP_MODE_NEAREST + 1),
 *     VK_SAMPLER_MIPMAP_MODE_MAX_ENUM = 0x7FFFFFFF
 * } VkSamplerMipmapMode;
 * </pre>
 * @author Alessandro Borges
 */
public class VkSamplerMipmapMode extends IntEnum<VkSamplerMipmapMode> {


   /** class */
   private static final Class<VkSamplerMipmapMode> myClass = VkSamplerMipmapMode.class;

   /** values */
   private static VkSamplerMipmapMode[] values = new VkSamplerMipmapMode[2];

   public static final VkSamplerMipmapMode VK_SAMPLER_MIPMAP_MODE_NEAREST = new VkSamplerMipmapMode("VK_SAMPLER_MIPMAP_MODE_NEAREST", 0, 0);
   public static final VkSamplerMipmapMode VK_SAMPLER_MIPMAP_MODE_LINEAR = new VkSamplerMipmapMode("VK_SAMPLER_MIPMAP_MODE_LINEAR", 1, 1);
   
   /**
    * Return all values available in this enumeration
    * @return Array of avail. VkAccessFlagBits
    */
    @SuppressWarnings("unchecked")
    public static VkSamplerMipmapMode[] values(){
            return values;
    }

	/**
	 * Get class of this enumeration
	 */
    protected static Class<VkSamplerMipmapMode> myGetClass(){
        return myClass;
    }

    /**
     * Creates a bitwise ORed enumeration
     * @param bits - list of enumerations to bitwise OR 
     * @return an enumeration of ORed bits 
     */
    public static VkSamplerMipmapMode or(VkSamplerMipmapMode...bits){
        int value = bits[0].getValue();        
        for (int i=1; i<bits.length; i++) {
            VkSamplerMipmapMode item = bits[i];
            value |= item.getValue();
        } 
        String name = myGetClass().getSimpleName() + " from bitwise Operation.[" + value +"]";
        VkSamplerMipmapMode ored = new VkSamplerMipmapMode(name, -1, value);        
        return ored;
    }
    
    /**
     * Creates a enumeration of this class, if valid. 
     * If you try to create a invalid enumeration it will raise a exception.
     * @param value - a valid enumeration value or ar ORed value.
     * @return a instance of VkSamplerMipmapMode from value. NULL if it is invalid value.
     */
    public static VkSamplerMipmapMode fromValue(int value){
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
        VkSamplerMipmapMode flag = new VkSamplerMipmapMode(name, -1, value); 
        return flag;
    }
	
	/**
     * Creates/populates a array of VkSamplerMipmapMode from a set of values.
     * @param dst - destination array. Can be null.
     * @param values - int[] with valid values of this enumeration.
     * @return VkSamplerMipmapMode array with matching values
     */
    public static VkSamplerMipmapMode[] fromValues(VkSamplerMipmapMode[] dst, int[] values){
        if(values == null) 
               return null;
        if(dst == null || dst.length != values.length){
            dst = new VkSamplerMipmapMode[values.length];
        }        
        for (int i = 0; i < values.length; i++) {
            int val = values[i];
            dst[i] = VkSamplerMipmapMode.fromValue(val);
        }        
        return dst;
    }
    
    /**
     * Check is a given flagA is bitwise ORed with flagB
     * @param flagA - flag to test
     * @param flagB - flag to test
     * @return true if flagA bit
     */
    public static boolean isORed(VkSamplerMipmapMode flagA, VkSamplerMipmapMode flagB){
        int valA = flagA.getValue();
        int valB = flagB.getValue();
        return (valA & valB) == valB;
    }


    /** private ctor */
    private VkSamplerMipmapMode(String name, int ordinal, int v) {
       super(name, ordinal, v);
       values[ordinal] = this;
    }

 } // end of class VkSamplerMipmapMode
