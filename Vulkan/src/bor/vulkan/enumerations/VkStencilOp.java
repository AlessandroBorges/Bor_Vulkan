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
 * Class to wrap Vulkan enumeration VkStencilOp
 *
 * <h3>Prototype</h3> <pre>
 * typedef enum VkStencilOp {
 *     VK_STENCIL_OP_KEEP = 0,
 *     VK_STENCIL_OP_ZERO = 1,
 *     VK_STENCIL_OP_REPLACE = 2,
 *     VK_STENCIL_OP_INCREMENT_AND_CLAMP = 3,
 *     VK_STENCIL_OP_DECREMENT_AND_CLAMP = 4,
 *     VK_STENCIL_OP_INVERT = 5,
 *     VK_STENCIL_OP_INCREMENT_AND_WRAP = 6,
 *     VK_STENCIL_OP_DECREMENT_AND_WRAP = 7,
 *     VK_STENCIL_OP_BEGIN_RANGE = VK_STENCIL_OP_KEEP,
 *     VK_STENCIL_OP_END_RANGE = VK_STENCIL_OP_DECREMENT_AND_WRAP,
 *     VK_STENCIL_OP_RANGE_SIZE = (VK_STENCIL_OP_DECREMENT_AND_WRAP - VK_STENCIL_OP_KEEP + 1),
 *     VK_STENCIL_OP_MAX_ENUM = 0x7FFFFFFF
 * } VkStencilOp;
 * </pre>
 * @author Alessandro Borges
 */
public class VkStencilOp extends IntEnum<VkStencilOp> {


   /** class */
   private static final Class<VkStencilOp> myClass = VkStencilOp.class;

   /** values */
   private static VkStencilOp[] values = new VkStencilOp[8];

   public static final VkStencilOp VK_STENCIL_OP_KEEP = new VkStencilOp("VK_STENCIL_OP_KEEP", 0, 0);
   public static final VkStencilOp VK_STENCIL_OP_ZERO = new VkStencilOp("VK_STENCIL_OP_ZERO", 1, 1);
   public static final VkStencilOp VK_STENCIL_OP_REPLACE = new VkStencilOp("VK_STENCIL_OP_REPLACE", 2, 2);
   public static final VkStencilOp VK_STENCIL_OP_INCREMENT_AND_CLAMP = new VkStencilOp("VK_STENCIL_OP_INCREMENT_AND_CLAMP", 3, 3);
   public static final VkStencilOp VK_STENCIL_OP_DECREMENT_AND_CLAMP = new VkStencilOp("VK_STENCIL_OP_DECREMENT_AND_CLAMP", 4, 4);
   public static final VkStencilOp VK_STENCIL_OP_INVERT = new VkStencilOp("VK_STENCIL_OP_INVERT", 5, 5);
   public static final VkStencilOp VK_STENCIL_OP_INCREMENT_AND_WRAP = new VkStencilOp("VK_STENCIL_OP_INCREMENT_AND_WRAP", 6, 6);
   public static final VkStencilOp VK_STENCIL_OP_DECREMENT_AND_WRAP = new VkStencilOp("VK_STENCIL_OP_DECREMENT_AND_WRAP", 7, 7);
   
   /**
    * Return all values available in this enumeration
    * @return Array of avail. VkAccessFlagBits
    */
    @SuppressWarnings("unchecked")
    public static VkStencilOp[] values(){
            return values;
    }

	/**
	 * Get class of this enumeration
	 */
    protected static Class<VkStencilOp> myGetClass(){
        return myClass;
    }

    /**
     * Creates a bitwise ORed enumeration
     * @param bits - list of enumerations to bitwise OR 
     * @return an enumeration of ORed bits 
     */
    public static VkStencilOp or(VkStencilOp...bits){
        int value = bits[0].getValue();        
        for (int i=1; i<bits.length; i++) {
            VkStencilOp item = bits[i];
            value |= item.getValue();
        } 
        String name = myGetClass().getSimpleName() + " from bitwise Operation.[" + value +"]";
        VkStencilOp ored = new VkStencilOp(name, -1, value);        
        return ored;
    }
    
    /**
     * Creates a enumeration of this class, if valid. 
     * If you try to create a invalid enumeration it will raise a exception.
     * @param value - a valid enumeration value or ar ORed value.
     * @return a instance of VkStencilOp from value. NULL if it is invalid value.
     */
    public static VkStencilOp fromValue(int value){
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
        VkStencilOp flag = new VkStencilOp(name, -1, value); 
        return flag;
    }
	
	/**
     * Creates/populates a array of VkStencilOp from a set of values.
     * @param dst - destination array. Can be null.
     * @param values - int[] with valid values of this enumeration.
     * @return VkStencilOp array with matching values
     */
    public static VkStencilOp[] fromValues(VkStencilOp[] dst, int[] values){
        if(values == null) 
               return null;
        if(dst == null || dst.length != values.length){
            dst = new VkStencilOp[values.length];
        }        
        for (int i = 0; i < values.length; i++) {
            int val = values[i];
            dst[i] = VkStencilOp.fromValue(val);
        }        
        return dst;
    }
    
    /**
     * Check is a given flagA is bitwise ORed with flagB
     * @param flagA - flag to test
     * @param flagB - flag to test
     * @return true if flagA bit
     */
    public static boolean isORed(VkStencilOp flagA, VkStencilOp flagB){
        int valA = flagA.getValue();
        int valB = flagB.getValue();
        return (valA & valB) == valB;
    }


    /** private ctor */
    private VkStencilOp(String name, int ordinal, int v) {
       super(name, ordinal, v);
       values[ordinal] = this;
    }

 } // end of class VkStencilOp
