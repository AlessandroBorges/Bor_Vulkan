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
 * Class to wrap Vulkan enumeration VkAttachmentLoadOp
 *
 * <h3>Prototype</h3> <pre>
 * typedef enum VkAttachmentLoadOp {
 *     VK_ATTACHMENT_LOAD_OP_LOAD = 0,
 *     VK_ATTACHMENT_LOAD_OP_CLEAR = 1,
 *     VK_ATTACHMENT_LOAD_OP_DONT_CARE = 2,
 *     VK_ATTACHMENT_LOAD_OP_BEGIN_RANGE = VK_ATTACHMENT_LOAD_OP_LOAD,
 *     VK_ATTACHMENT_LOAD_OP_END_RANGE = VK_ATTACHMENT_LOAD_OP_DONT_CARE,
 *     VK_ATTACHMENT_LOAD_OP_RANGE_SIZE = (VK_ATTACHMENT_LOAD_OP_DONT_CARE - VK_ATTACHMENT_LOAD_OP_LOAD + 1),
 *     VK_ATTACHMENT_LOAD_OP_MAX_ENUM = 0x7FFFFFFF
 * } VkAttachmentLoadOp;
 * </pre>
 * @author Alessandro Borges
 */
public class VkAttachmentLoadOp extends IntEnum<VkAttachmentLoadOp> {


   /** class */
   private static final Class<VkAttachmentLoadOp> myClass = VkAttachmentLoadOp.class;

   /** values */
   private static VkAttachmentLoadOp[] values = new VkAttachmentLoadOp[3];

   public static final VkAttachmentLoadOp VK_ATTACHMENT_LOAD_OP_LOAD = new VkAttachmentLoadOp("VK_ATTACHMENT_LOAD_OP_LOAD", 0, 0);
   public static final VkAttachmentLoadOp VK_ATTACHMENT_LOAD_OP_CLEAR = new VkAttachmentLoadOp("VK_ATTACHMENT_LOAD_OP_CLEAR", 1, 1);
   public static final VkAttachmentLoadOp VK_ATTACHMENT_LOAD_OP_DONT_CARE = new VkAttachmentLoadOp("VK_ATTACHMENT_LOAD_OP_DONT_CARE", 2, 2);
   
   /**
    * Return all values available in this enumeration
    * @return Array of avail. VkAccessFlagBits
    */
    @SuppressWarnings("unchecked")
    public static VkAttachmentLoadOp[] values(){
            return values;
    }

	/**
	 * Get class of this enumeration
	 */
    protected static Class<VkAttachmentLoadOp> myGetClass(){
        return myClass;
    }

    /**
     * Creates a bitwise ORed enumeration
     * @param bits - list of enumerations to bitwise OR 
     * @return an enumeration of ORed bits 
     */
    public static VkAttachmentLoadOp or(VkAttachmentLoadOp...bits){
        int value = bits[0].getValue();        
        for (int i=1; i<bits.length; i++) {
            VkAttachmentLoadOp item = bits[i];
            value |= item.getValue();
        } 
        String name = myGetClass().getSimpleName() + " from bitwise Operation.[" + value +"]";
        VkAttachmentLoadOp ored = new VkAttachmentLoadOp(name, -1, value);        
        return ored;
    }
    
    /**
     * Creates a enumeration of this class, if valid. 
     * If you try to create a invalid enumeration it will raise a exception.
     * @param value - a valid enumeration value or ar ORed value.
     * @return a instance of VkAttachmentLoadOp from value. NULL if it is invalid value.
     */
    public static VkAttachmentLoadOp fromValue(int value){
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
        VkAttachmentLoadOp flag = new VkAttachmentLoadOp(name, -1, value); 
        return flag;
    }
    
    /**
     * Check is a given flagA is bitwise ORed with flagB
     * @param flagA - flag to test
     * @param flagB - flag to test
     * @return true if flagA bit
     */
    public static boolean isORed(VkAttachmentLoadOp flagA, VkAttachmentLoadOp flagB){
        int valA = flagA.getValue();
        int valB = flagB.getValue();
        return (valA & valB) == valB;
    }


    /** private ctor */
    private VkAttachmentLoadOp(String name, int ordinal, int v) {
       super(name, ordinal, v);
       values[ordinal] = this;
    }

 } // end of class VkAttachmentLoadOp
