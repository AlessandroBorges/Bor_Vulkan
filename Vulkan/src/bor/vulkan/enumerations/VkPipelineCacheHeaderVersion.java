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
 * Class to wrap Vulkan enumeration VkPipelineCacheHeaderVersion
 *
 * <h3>Prototype</h3> <pre>
 * typedef enum VkPipelineCacheHeaderVersion {
 *     VK_PIPELINE_CACHE_HEADER_VERSION_ONE = 1,
 *     VK_PIPELINE_CACHE_HEADER_VERSION_BEGIN_RANGE = VK_PIPELINE_CACHE_HEADER_VERSION_ONE,
 *     VK_PIPELINE_CACHE_HEADER_VERSION_END_RANGE = VK_PIPELINE_CACHE_HEADER_VERSION_ONE,
 *     VK_PIPELINE_CACHE_HEADER_VERSION_RANGE_SIZE = (VK_PIPELINE_CACHE_HEADER_VERSION_ONE - VK_PIPELINE_CACHE_HEADER_VERSION_ONE + 1),
 *     VK_PIPELINE_CACHE_HEADER_VERSION_MAX_ENUM = 0x7FFFFFFF
 * } VkPipelineCacheHeaderVersion;
 * </pre>
 * @author Alessandro Borges
 */
public class VkPipelineCacheHeaderVersion extends IntEnum<VkPipelineCacheHeaderVersion> {


   /** class */
   private static final Class<VkPipelineCacheHeaderVersion> myClass = VkPipelineCacheHeaderVersion.class;

   /** values */
   private static VkPipelineCacheHeaderVersion[] values = new VkPipelineCacheHeaderVersion[1];

   public static final VkPipelineCacheHeaderVersion VK_PIPELINE_CACHE_HEADER_VERSION_ONE = new VkPipelineCacheHeaderVersion("VK_PIPELINE_CACHE_HEADER_VERSION_ONE", 0, 1);
   
   /**
    * Return all values available in this enumeration
    * @return Array of avail. VkAccessFlagBits
    */
    @SuppressWarnings("unchecked")
    public static VkPipelineCacheHeaderVersion[] values(){
            return values;
    }

	/**
	 * Get class of this enumeration
	 */
    protected static Class<VkPipelineCacheHeaderVersion> myGetClass(){
        return myClass;
    }

    /**
     * Creates a bitwise ORed enumeration
     * @param bits - list of enumerations to bitwise OR 
     * @return an enumeration of ORed bits 
     */
    public static VkPipelineCacheHeaderVersion or(VkPipelineCacheHeaderVersion...bits){
        int value = bits[0].getValue();        
        for (int i=1; i<bits.length; i++) {
            VkPipelineCacheHeaderVersion item = bits[i];
            value |= item.getValue();
        } 
        String name = myGetClass().getSimpleName() + " from bitwise Operation.[" + value +"]";
        VkPipelineCacheHeaderVersion ored = new VkPipelineCacheHeaderVersion(name, -1, value);        
        return ored;
    }
    
    /**
     * Creates a enumeration of this class, if valid. 
     * If you try to create a invalid enumeration it will raise a exception.
     * @param value - a valid enumeration value or ar ORed value.
     * @return a instance of VkPipelineCacheHeaderVersion from value. NULL if it is invalid value.
     */
    public static VkPipelineCacheHeaderVersion fromValue(int value){
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
        VkPipelineCacheHeaderVersion flag = new VkPipelineCacheHeaderVersion(name, -1, value); 
        return flag;
    }
	
	/**
     * Creates/populates a array of VkPipelineCacheHeaderVersion from a set of values.
     * @param dst - destination array. Can be null.
     * @param values - int[] with valid values of this enumeration.
     * @return VkPipelineCacheHeaderVersion array with matching values
     */
    public static VkPipelineCacheHeaderVersion[] fromValues(VkPipelineCacheHeaderVersion[] dst, int[] values){
        if(values == null) 
               return null;
        if(dst == null || dst.length != values.length){
            dst = new VkPipelineCacheHeaderVersion[values.length];
        }        
        for (int i = 0; i < values.length; i++) {
            int val = values[i];
            dst[i] = VkPipelineCacheHeaderVersion.fromValue(val);
        }        
        return dst;
    }
    
    /**
     * Check is a given flagA is bitwise ORed with flagB
     * @param flagA - flag to test
     * @param flagB - flag to test
     * @return true if flagA bit
     */
    public static boolean isORed(VkPipelineCacheHeaderVersion flagA, VkPipelineCacheHeaderVersion flagB){
        int valA = flagA.getValue();
        int valB = flagB.getValue();
        return (valA & valB) == valB;
    }


    /** private ctor */
    private VkPipelineCacheHeaderVersion(String name, int ordinal, int v) {
       super(name, ordinal, v);
       values[ordinal] = this;
    }

 } // end of class VkPipelineCacheHeaderVersion
