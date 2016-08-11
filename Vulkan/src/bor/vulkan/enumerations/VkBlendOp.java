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
 * Class to wrap Vulkan enumeration VkBlendOp
 *
 * <h3>Prototype</h3> <pre>
 * typedef enum VkBlendOp {
 *     VK_BLEND_OP_ADD = 0,
 *     VK_BLEND_OP_SUBTRACT = 1,
 *     VK_BLEND_OP_REVERSE_SUBTRACT = 2,
 *     VK_BLEND_OP_MIN = 3,
 *     VK_BLEND_OP_MAX = 4,
 *     VK_BLEND_OP_BEGIN_RANGE = VK_BLEND_OP_ADD,
 *     VK_BLEND_OP_END_RANGE = VK_BLEND_OP_MAX,
 *     VK_BLEND_OP_RANGE_SIZE = (VK_BLEND_OP_MAX - VK_BLEND_OP_ADD + 1),
 *     VK_BLEND_OP_MAX_ENUM = 0x7FFFFFFF
 * } VkBlendOp;
 * </pre>
 * @author Alessandro Borges
 */
public class VkBlendOp extends IntEnum<VkBlendOp> {


   /** class */
   private static final Class<VkBlendOp> myClass = VkBlendOp.class;

   /** values */
   private static VkBlendOp[] values = new VkBlendOp[5];

   public static final VkBlendOp VK_BLEND_OP_ADD = new VkBlendOp("VK_BLEND_OP_ADD", 0, 0);
   public static final VkBlendOp VK_BLEND_OP_SUBTRACT = new VkBlendOp("VK_BLEND_OP_SUBTRACT", 1, 1);
   public static final VkBlendOp VK_BLEND_OP_REVERSE_SUBTRACT = new VkBlendOp("VK_BLEND_OP_REVERSE_SUBTRACT", 2, 2);
   public static final VkBlendOp VK_BLEND_OP_MIN = new VkBlendOp("VK_BLEND_OP_MIN", 3, 3);
   public static final VkBlendOp VK_BLEND_OP_MAX = new VkBlendOp("VK_BLEND_OP_MAX", 4, 4);
   
   /**
    * Return all values available in this enumeration
    * @return Array of avail. VkAccessFlagBits
    */
    @SuppressWarnings("unchecked")
    public static VkBlendOp[] values(){
            return values;
    }

	/**
	 * Get class of this enumeration
	 */
    protected static Class<VkBlendOp> myGetClass(){
        return myClass;
    }

    /**
     * Creates a bitwise ORed enumeration
     * @param bits - list of enumerations to bitwise OR 
     * @return an enumeration of ORed bits 
     */
    public static VkBlendOp or(VkBlendOp...bits){
        int value = bits[0].getValue();        
        for (int i=1; i<bits.length; i++) {
            VkBlendOp item = bits[i];
            value |= item.getValue();
        } 
        String name = myGetClass().getSimpleName() + " from bitwise Operation.[" + value +"]";
        VkBlendOp ored = new VkBlendOp(name, -1, value);        
        return ored;
    }
    
    /**
     * Creates a enumeration of this class, if valid. 
     * If you try to create a invalid enumeration it will raise a exception.
     * @param value - a valid enumeration value or ar ORed value.
     * @return a instance of VkBlendOp from value. NULL if it is invalid value.
     */
    public static VkBlendOp fromValue(int value){
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
        VkBlendOp flag = new VkBlendOp(name, -1, value); 
        return flag;
    }
	
	/**
     * Creates/populates a array of VkBlendOp from a set of values.
     * @param dst - destination array. Can be null.
     * @param values - int[] with valid values of this enumeration.
     * @return VkBlendOp array with matching values
     */
    public static VkBlendOp[] fromValues(VkBlendOp[] dst, int[] values){
        if(values == null) 
               return null;
        if(dst == null || dst.length != values.length){
            dst = new VkBlendOp[values.length];
        }        
        for (int i = 0; i < values.length; i++) {
            int val = values[i];
            dst[i] = VkBlendOp.fromValue(val);
        }        
        return dst;
    }
    
    /**
     * Check is a given flagA is bitwise ORed with flagB
     * @param flagA - flag to test
     * @param flagB - flag to test
     * @return true if flagA bit
     */
    public static boolean isORed(VkBlendOp flagA, VkBlendOp flagB){
        int valA = flagA.getValue();
        int valB = flagB.getValue();
        return (valA & valB) == valB;
    }


    /** private ctor */
    private VkBlendOp(String name, int ordinal, int v) {
       super(name, ordinal, v);
       values[ordinal] = this;
    }

 } // end of class VkBlendOp
