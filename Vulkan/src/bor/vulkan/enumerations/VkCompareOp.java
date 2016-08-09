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
 * Class to wrap Vulkan enumeration VkCompareOp
 *
 * <h3>Prototype</h3> <pre>
 * typedef enum VkCompareOp {
 *     VK_COMPARE_OP_NEVER = 0,
 *     VK_COMPARE_OP_LESS = 1,
 *     VK_COMPARE_OP_EQUAL = 2,
 *     VK_COMPARE_OP_LESS_OR_EQUAL = 3,
 *     VK_COMPARE_OP_GREATER = 4,
 *     VK_COMPARE_OP_NOT_EQUAL = 5,
 *     VK_COMPARE_OP_GREATER_OR_EQUAL = 6,
 *     VK_COMPARE_OP_ALWAYS = 7,
 *     VK_COMPARE_OP_BEGIN_RANGE = VK_COMPARE_OP_NEVER,
 *     VK_COMPARE_OP_END_RANGE = VK_COMPARE_OP_ALWAYS,
 *     VK_COMPARE_OP_RANGE_SIZE = (VK_COMPARE_OP_ALWAYS - VK_COMPARE_OP_NEVER + 1),
 *     VK_COMPARE_OP_MAX_ENUM = 0x7FFFFFFF
 * } VkCompareOp;
 * </pre>
 * @author Alessandro Borges
 */
public class VkCompareOp extends IntEnum<VkCompareOp> {


   /** class */
   private static final Class<VkCompareOp> myClass = VkCompareOp.class;

   /** values */
   private static VkCompareOp[] values = new VkCompareOp[8];

   public static final VkCompareOp VK_COMPARE_OP_NEVER = new VkCompareOp("VK_COMPARE_OP_NEVER", 0, 0);
   public static final VkCompareOp VK_COMPARE_OP_LESS = new VkCompareOp("VK_COMPARE_OP_LESS", 1, 1);
   public static final VkCompareOp VK_COMPARE_OP_EQUAL = new VkCompareOp("VK_COMPARE_OP_EQUAL", 2, 2);
   public static final VkCompareOp VK_COMPARE_OP_LESS_OR_EQUAL = new VkCompareOp("VK_COMPARE_OP_LESS_OR_EQUAL", 3, 3);
   public static final VkCompareOp VK_COMPARE_OP_GREATER = new VkCompareOp("VK_COMPARE_OP_GREATER", 4, 4);
   public static final VkCompareOp VK_COMPARE_OP_NOT_EQUAL = new VkCompareOp("VK_COMPARE_OP_NOT_EQUAL", 5, 5);
   public static final VkCompareOp VK_COMPARE_OP_GREATER_OR_EQUAL = new VkCompareOp("VK_COMPARE_OP_GREATER_OR_EQUAL", 6, 6);
   public static final VkCompareOp VK_COMPARE_OP_ALWAYS = new VkCompareOp("VK_COMPARE_OP_ALWAYS", 7, 7);
   
   /**
    * Return all values available in this enumeration
    * @return Array of avail. VkAccessFlagBits
    */
    @SuppressWarnings("unchecked")
    public static VkCompareOp[] values(){
            return values;
    }

	/**
	 * Get class of this enumeration
	 */
    protected static Class<VkCompareOp> myGetClass(){
        return myClass;
    }

    /**
     * Creates a bitwise ORed enumeration
     * @param bits - list of enumerations to bitwise OR 
     * @return an enumeration of ORed bits 
     */
    public static VkCompareOp or(VkCompareOp...bits){
        int value = bits[0].getValue();        
        for (int i=1; i<bits.length; i++) {
            VkCompareOp item = bits[i];
            value |= item.getValue();
        } 
        String name = myGetClass().getSimpleName() + " from bitwise Operation.[" + value +"]";
        VkCompareOp ored = new VkCompareOp(name, -1, value);        
        return ored;
    }
    
    /**
     * Creates a enumeration of this class, if valid. 
     * If you try to create a invalid enumeration it will raise a exception.
     * @param value - a valid enumeration value or ar ORed value.
     * @return a instance of VkCompareOp from value. NULL if it is invalid value.
     */
    public static VkCompareOp fromValue(int value){
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
        VkCompareOp flag = new VkCompareOp(name, -1, value); 
        return flag;
    }
    
    /**
     * Check is a given flagA is bitwise ORed with flagB
     * @param flagA - flag to test
     * @param flagB - flag to test
     * @return true if flagA bit
     */
    public static boolean isORed(VkCompareOp flagA, VkCompareOp flagB){
        int valA = flagA.getValue();
        int valB = flagB.getValue();
        return (valA & valB) == valB;
    }


    /** private ctor */
    private VkCompareOp(String name, int ordinal, int v) {
       super(name, ordinal, v);
       values[ordinal] = this;
    }

 } // end of class VkCompareOp
