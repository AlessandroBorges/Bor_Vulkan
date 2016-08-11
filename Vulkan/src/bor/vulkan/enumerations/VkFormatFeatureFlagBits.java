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
 * Class to wrap Vulkan enumeration VkFormatFeatureFlagBits
 *
 * <h3>Prototype</h3> <pre>
 * typedef enum VkFormatFeatureFlagBits {
 *     VK_FORMAT_FEATURE_SAMPLED_IMAGE_BIT = 0x00000001,
 *     VK_FORMAT_FEATURE_STORAGE_IMAGE_BIT = 0x00000002,
 *     VK_FORMAT_FEATURE_STORAGE_IMAGE_ATOMIC_BIT = 0x00000004,
 *     VK_FORMAT_FEATURE_UNIFORM_TEXEL_BUFFER_BIT = 0x00000008,
 *     VK_FORMAT_FEATURE_STORAGE_TEXEL_BUFFER_BIT = 0x00000010,
 *     VK_FORMAT_FEATURE_STORAGE_TEXEL_BUFFER_ATOMIC_BIT = 0x00000020,
 *     VK_FORMAT_FEATURE_VERTEX_BUFFER_BIT = 0x00000040,
 *     VK_FORMAT_FEATURE_COLOR_ATTACHMENT_BIT = 0x00000080,
 *     VK_FORMAT_FEATURE_COLOR_ATTACHMENT_BLEND_BIT = 0x00000100,
 *     VK_FORMAT_FEATURE_DEPTH_STENCIL_ATTACHMENT_BIT = 0x00000200,
 *     VK_FORMAT_FEATURE_BLIT_SRC_BIT = 0x00000400,
 *     VK_FORMAT_FEATURE_BLIT_DST_BIT = 0x00000800,
 *     VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT = 0x00001000,
 *     VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_CUBIC_BIT_IMG = 0x00002000,
 *     VK_FORMAT_FEATURE_FLAG_BITS_MAX_ENUM = 0x7FFFFFFF
 * } VkFormatFeatureFlagBits;
 * </pre>
 * @author Alessandro Borges
 */
public class VkFormatFeatureFlagBits extends IntEnum<VkFormatFeatureFlagBits> {


   /** class */
   private static final Class<VkFormatFeatureFlagBits> myClass = VkFormatFeatureFlagBits.class;

   /** values */
   private static VkFormatFeatureFlagBits[] values = new VkFormatFeatureFlagBits[14];

   public static final VkFormatFeatureFlagBits VK_FORMAT_FEATURE_SAMPLED_IMAGE_BIT = new VkFormatFeatureFlagBits("VK_FORMAT_FEATURE_SAMPLED_IMAGE_BIT", 0, 0x00000001);
   public static final VkFormatFeatureFlagBits VK_FORMAT_FEATURE_STORAGE_IMAGE_BIT = new VkFormatFeatureFlagBits("VK_FORMAT_FEATURE_STORAGE_IMAGE_BIT", 1, 0x00000002);
   public static final VkFormatFeatureFlagBits VK_FORMAT_FEATURE_STORAGE_IMAGE_ATOMIC_BIT = new VkFormatFeatureFlagBits("VK_FORMAT_FEATURE_STORAGE_IMAGE_ATOMIC_BIT", 2, 0x00000004);
   public static final VkFormatFeatureFlagBits VK_FORMAT_FEATURE_UNIFORM_TEXEL_BUFFER_BIT = new VkFormatFeatureFlagBits("VK_FORMAT_FEATURE_UNIFORM_TEXEL_BUFFER_BIT", 3, 0x00000008);
   public static final VkFormatFeatureFlagBits VK_FORMAT_FEATURE_STORAGE_TEXEL_BUFFER_BIT = new VkFormatFeatureFlagBits("VK_FORMAT_FEATURE_STORAGE_TEXEL_BUFFER_BIT", 4, 0x00000010);
   public static final VkFormatFeatureFlagBits VK_FORMAT_FEATURE_STORAGE_TEXEL_BUFFER_ATOMIC_BIT = new VkFormatFeatureFlagBits("VK_FORMAT_FEATURE_STORAGE_TEXEL_BUFFER_ATOMIC_BIT", 5, 0x00000020);
   public static final VkFormatFeatureFlagBits VK_FORMAT_FEATURE_VERTEX_BUFFER_BIT = new VkFormatFeatureFlagBits("VK_FORMAT_FEATURE_VERTEX_BUFFER_BIT", 6, 0x00000040);
   public static final VkFormatFeatureFlagBits VK_FORMAT_FEATURE_COLOR_ATTACHMENT_BIT = new VkFormatFeatureFlagBits("VK_FORMAT_FEATURE_COLOR_ATTACHMENT_BIT", 7, 0x00000080);
   public static final VkFormatFeatureFlagBits VK_FORMAT_FEATURE_COLOR_ATTACHMENT_BLEND_BIT = new VkFormatFeatureFlagBits("VK_FORMAT_FEATURE_COLOR_ATTACHMENT_BLEND_BIT", 8, 0x00000100);
   public static final VkFormatFeatureFlagBits VK_FORMAT_FEATURE_DEPTH_STENCIL_ATTACHMENT_BIT = new VkFormatFeatureFlagBits("VK_FORMAT_FEATURE_DEPTH_STENCIL_ATTACHMENT_BIT", 9, 0x00000200);
   public static final VkFormatFeatureFlagBits VK_FORMAT_FEATURE_BLIT_SRC_BIT = new VkFormatFeatureFlagBits("VK_FORMAT_FEATURE_BLIT_SRC_BIT", 10, 0x00000400);
   public static final VkFormatFeatureFlagBits VK_FORMAT_FEATURE_BLIT_DST_BIT = new VkFormatFeatureFlagBits("VK_FORMAT_FEATURE_BLIT_DST_BIT", 11, 0x00000800);
   public static final VkFormatFeatureFlagBits VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT = new VkFormatFeatureFlagBits("VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT", 12, 0x00001000);
   public static final VkFormatFeatureFlagBits VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_CUBIC_BIT_IMG = new VkFormatFeatureFlagBits("VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_CUBIC_BIT_IMG", 13, 0x00002000);
   
   /**
    * Return all values available in this enumeration
    * @return Array of avail. VkAccessFlagBits
    */
    @SuppressWarnings("unchecked")
    public static VkFormatFeatureFlagBits[] values(){
            return values;
    }

	/**
	 * Get class of this enumeration
	 */
    protected static Class<VkFormatFeatureFlagBits> myGetClass(){
        return myClass;
    }

    /**
     * Creates a bitwise ORed enumeration
     * @param bits - list of enumerations to bitwise OR 
     * @return an enumeration of ORed bits 
     */
    public static VkFormatFeatureFlagBits or(VkFormatFeatureFlagBits...bits){
        int value = bits[0].getValue();        
        for (int i=1; i<bits.length; i++) {
            VkFormatFeatureFlagBits item = bits[i];
            value |= item.getValue();
        } 
        String name = myGetClass().getSimpleName() + " from bitwise Operation.[" + value +"]";
        VkFormatFeatureFlagBits ored = new VkFormatFeatureFlagBits(name, -1, value);        
        return ored;
    }
    
    /**
     * Creates a enumeration of this class, if valid. 
     * If you try to create a invalid enumeration it will raise a exception.
     * @param value - a valid enumeration value or ar ORed value.
     * @return a instance of VkFormatFeatureFlagBits from value. NULL if it is invalid value.
     */
    public static VkFormatFeatureFlagBits fromValue(int value){
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
        VkFormatFeatureFlagBits flag = new VkFormatFeatureFlagBits(name, -1, value); 
        return flag;
    }
	
	/**
     * Creates/populates a array of VkFormatFeatureFlagBits from a set of values.
     * @param dst - destination array. Can be null.
     * @param values - int[] with valid values of this enumeration.
     * @return VkFormatFeatureFlagBits array with matching values
     */
    public static VkFormatFeatureFlagBits[] fromValues(VkFormatFeatureFlagBits[] dst, int[] values){
        if(values == null) 
               return null;
        if(dst == null || dst.length != values.length){
            dst = new VkFormatFeatureFlagBits[values.length];
        }        
        for (int i = 0; i < values.length; i++) {
            int val = values[i];
            dst[i] = VkFormatFeatureFlagBits.fromValue(val);
        }        
        return dst;
    }
    
    /**
     * Check is a given flagA is bitwise ORed with flagB
     * @param flagA - flag to test
     * @param flagB - flag to test
     * @return true if flagA bit
     */
    public static boolean isORed(VkFormatFeatureFlagBits flagA, VkFormatFeatureFlagBits flagB){
        int valA = flagA.getValue();
        int valB = flagB.getValue();
        return (valA & valB) == valB;
    }


    /** private ctor */
    private VkFormatFeatureFlagBits(String name, int ordinal, int v) {
       super(name, ordinal, v);
       values[ordinal] = this;
    }

 } // end of class VkFormatFeatureFlagBits
