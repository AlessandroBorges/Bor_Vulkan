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
 * Class to wrap Vulkan enumeration VkLogicOp
 *
 * <h3>Prototype</h3> <pre>
 * typedef enum VkLogicOp {
 *     VK_LOGIC_OP_CLEAR = 0,
 *     VK_LOGIC_OP_AND = 1,
 *     VK_LOGIC_OP_AND_REVERSE = 2,
 *     VK_LOGIC_OP_COPY = 3,
 *     VK_LOGIC_OP_AND_INVERTED = 4,
 *     VK_LOGIC_OP_NO_OP = 5,
 *     VK_LOGIC_OP_XOR = 6,
 *     VK_LOGIC_OP_OR = 7,
 *     VK_LOGIC_OP_NOR = 8,
 *     VK_LOGIC_OP_EQUIVALENT = 9,
 *     VK_LOGIC_OP_INVERT = 10,
 *     VK_LOGIC_OP_OR_REVERSE = 11,
 *     VK_LOGIC_OP_COPY_INVERTED = 12,
 *     VK_LOGIC_OP_OR_INVERTED = 13,
 *     VK_LOGIC_OP_NAND = 14,
 *     VK_LOGIC_OP_SET = 15,
 *     VK_LOGIC_OP_BEGIN_RANGE = VK_LOGIC_OP_CLEAR,
 *     VK_LOGIC_OP_END_RANGE = VK_LOGIC_OP_SET,
 *     VK_LOGIC_OP_RANGE_SIZE = (VK_LOGIC_OP_SET - VK_LOGIC_OP_CLEAR + 1),
 *     VK_LOGIC_OP_MAX_ENUM = 0x7FFFFFFF
 * } VkLogicOp;
 * </pre>
 * @author Alessandro Borges
 */
public class VkLogicOp extends IntEnum<VkLogicOp> {


   /** class */
   private static final Class<VkLogicOp> myClass = VkLogicOp.class;

   /** values */
   private static VkLogicOp[] values = new VkLogicOp[16];

   public static final VkLogicOp VK_LOGIC_OP_CLEAR = new VkLogicOp("VK_LOGIC_OP_CLEAR", 0, 0);
   public static final VkLogicOp VK_LOGIC_OP_AND = new VkLogicOp("VK_LOGIC_OP_AND", 1, 1);
   public static final VkLogicOp VK_LOGIC_OP_AND_REVERSE = new VkLogicOp("VK_LOGIC_OP_AND_REVERSE", 2, 2);
   public static final VkLogicOp VK_LOGIC_OP_COPY = new VkLogicOp("VK_LOGIC_OP_COPY", 3, 3);
   public static final VkLogicOp VK_LOGIC_OP_AND_INVERTED = new VkLogicOp("VK_LOGIC_OP_AND_INVERTED", 4, 4);
   public static final VkLogicOp VK_LOGIC_OP_NO_OP = new VkLogicOp("VK_LOGIC_OP_NO_OP", 5, 5);
   public static final VkLogicOp VK_LOGIC_OP_XOR = new VkLogicOp("VK_LOGIC_OP_XOR", 6, 6);
   public static final VkLogicOp VK_LOGIC_OP_OR = new VkLogicOp("VK_LOGIC_OP_OR", 7, 7);
   public static final VkLogicOp VK_LOGIC_OP_NOR = new VkLogicOp("VK_LOGIC_OP_NOR", 8, 8);
   public static final VkLogicOp VK_LOGIC_OP_EQUIVALENT = new VkLogicOp("VK_LOGIC_OP_EQUIVALENT", 9, 9);
   public static final VkLogicOp VK_LOGIC_OP_INVERT = new VkLogicOp("VK_LOGIC_OP_INVERT", 10, 10);
   public static final VkLogicOp VK_LOGIC_OP_OR_REVERSE = new VkLogicOp("VK_LOGIC_OP_OR_REVERSE", 11, 11);
   public static final VkLogicOp VK_LOGIC_OP_COPY_INVERTED = new VkLogicOp("VK_LOGIC_OP_COPY_INVERTED", 12, 12);
   public static final VkLogicOp VK_LOGIC_OP_OR_INVERTED = new VkLogicOp("VK_LOGIC_OP_OR_INVERTED", 13, 13);
   public static final VkLogicOp VK_LOGIC_OP_NAND = new VkLogicOp("VK_LOGIC_OP_NAND", 14, 14);
   public static final VkLogicOp VK_LOGIC_OP_SET = new VkLogicOp("VK_LOGIC_OP_SET", 15, 15);
   
   /**
    * Return all values available in this enumeration
    * @return Array of avail. VkAccessFlagBits
    */
    @SuppressWarnings("unchecked")
    public static VkLogicOp[] values(){
            return values;
    }

	/**
	 * Get class of this enumeration
	 */
    protected static Class<VkLogicOp> myGetClass(){
        return myClass;
    }

    /**
     * Creates a bitwise ORed enumeration
     * @param bits - list of enumerations to bitwise OR 
     * @return an enumeration of ORed bits 
     */
    public static VkLogicOp or(VkLogicOp...bits){
        int value = bits[0].getValue();        
        for (int i=1; i<bits.length; i++) {
            VkLogicOp item = bits[i];
            value |= item.getValue();
        } 
        String name = myGetClass().getSimpleName() + " from bitwise Operation.[" + value +"]";
        VkLogicOp ored = new VkLogicOp(name, -1, value);        
        return ored;
    }
    
    /**
     * Creates a enumeration of this class, if valid. 
     * If you try to create a invalid enumeration it will raise a exception.
     * @param value - a valid enumeration value or ar ORed value.
     * @return a instance of VkLogicOp from value. NULL if it is invalid value.
     */
    public static VkLogicOp fromValue(int value){
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
        VkLogicOp flag = new VkLogicOp(name, -1, value); 
        return flag;
    }
    
    /**
     * Check is a given flagA is bitwise ORed with flagB
     * @param flagA - flag to test
     * @param flagB - flag to test
     * @return true if flagA bit
     */
    public static boolean isORed(VkLogicOp flagA, VkLogicOp flagB){
        int valA = flagA.getValue();
        int valB = flagB.getValue();
        return (valA & valB) == valB;
    }


    /** private ctor */
    private VkLogicOp(String name, int ordinal, int v) {
       super(name, ordinal, v);
       values[ordinal] = this;
    }

 } // end of class VkLogicOp
