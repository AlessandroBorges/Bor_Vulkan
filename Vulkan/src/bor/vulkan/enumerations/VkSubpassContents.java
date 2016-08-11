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
 * Class to wrap Vulkan enumeration VkSubpassContents
 *
 * <h3>Prototype</h3> <pre>
 * typedef enum VkSubpassContents {
 *     VK_SUBPASS_CONTENTS_INLINE = 0,
 *     VK_SUBPASS_CONTENTS_SECONDARY_COMMAND_BUFFERS = 1,
 *     VK_SUBPASS_CONTENTS_BEGIN_RANGE = VK_SUBPASS_CONTENTS_INLINE,
 *     VK_SUBPASS_CONTENTS_END_RANGE = VK_SUBPASS_CONTENTS_SECONDARY_COMMAND_BUFFERS,
 *     VK_SUBPASS_CONTENTS_RANGE_SIZE = (VK_SUBPASS_CONTENTS_SECONDARY_COMMAND_BUFFERS - VK_SUBPASS_CONTENTS_INLINE + 1),
 *     VK_SUBPASS_CONTENTS_MAX_ENUM = 0x7FFFFFFF
 * } VkSubpassContents;
 * </pre>
 * @author Alessandro Borges
 */
public class VkSubpassContents extends IntEnum<VkSubpassContents> {


   /** class */
   private static final Class<VkSubpassContents> myClass = VkSubpassContents.class;

   /** values */
   private static VkSubpassContents[] values = new VkSubpassContents[2];

   public static final VkSubpassContents VK_SUBPASS_CONTENTS_INLINE = new VkSubpassContents("VK_SUBPASS_CONTENTS_INLINE", 0, 0);
   public static final VkSubpassContents VK_SUBPASS_CONTENTS_SECONDARY_COMMAND_BUFFERS = new VkSubpassContents("VK_SUBPASS_CONTENTS_SECONDARY_COMMAND_BUFFERS", 1, 1);
   
   /**
    * Return all values available in this enumeration
    * @return Array of avail. VkAccessFlagBits
    */
    @SuppressWarnings("unchecked")
    public static VkSubpassContents[] values(){
            return values;
    }

	/**
	 * Get class of this enumeration
	 */
    protected static Class<VkSubpassContents> myGetClass(){
        return myClass;
    }

    /**
     * Creates a bitwise ORed enumeration
     * @param bits - list of enumerations to bitwise OR 
     * @return an enumeration of ORed bits 
     */
    public static VkSubpassContents or(VkSubpassContents...bits){
        int value = bits[0].getValue();        
        for (int i=1; i<bits.length; i++) {
            VkSubpassContents item = bits[i];
            value |= item.getValue();
        } 
        String name = myGetClass().getSimpleName() + " from bitwise Operation.[" + value +"]";
        VkSubpassContents ored = new VkSubpassContents(name, -1, value);        
        return ored;
    }
    
    /**
     * Creates a enumeration of this class, if valid. 
     * If you try to create a invalid enumeration it will raise a exception.
     * @param value - a valid enumeration value or ar ORed value.
     * @return a instance of VkSubpassContents from value. NULL if it is invalid value.
     */
    public static VkSubpassContents fromValue(int value){
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
        VkSubpassContents flag = new VkSubpassContents(name, -1, value); 
        return flag;
    }
	
	/**
     * Creates/populates a array of VkSubpassContents from a set of values.
     * @param dst - destination array. Can be null.
     * @param values - int[] with valid values of this enumeration.
     * @return VkSubpassContents array with matching values
     */
    public static VkSubpassContents[] fromValues(VkSubpassContents[] dst, int[] values){
        if(values == null) 
               return null;
        if(dst == null || dst.length != values.length){
            dst = new VkSubpassContents[values.length];
        }        
        for (int i = 0; i < values.length; i++) {
            int val = values[i];
            dst[i] = VkSubpassContents.fromValue(val);
        }        
        return dst;
    }
    
    /**
     * Check is a given flagA is bitwise ORed with flagB
     * @param flagA - flag to test
     * @param flagB - flag to test
     * @return true if flagA bit
     */
    public static boolean isORed(VkSubpassContents flagA, VkSubpassContents flagB){
        int valA = flagA.getValue();
        int valB = flagB.getValue();
        return (valA & valB) == valB;
    }


    /** private ctor */
    private VkSubpassContents(String name, int ordinal, int v) {
       super(name, ordinal, v);
       values[ordinal] = this;
    }

 } // end of class VkSubpassContents
