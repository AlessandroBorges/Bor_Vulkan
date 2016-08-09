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
 * Class to wrap Vulkan enumeration VkAttachmentStoreOp
 *
 * <h3>Prototype</h3> <pre>
 * typedef enum VkAttachmentStoreOp {
 *     VK_ATTACHMENT_STORE_OP_STORE = 0,
 *     VK_ATTACHMENT_STORE_OP_DONT_CARE = 1,
 *     VK_ATTACHMENT_STORE_OP_BEGIN_RANGE = VK_ATTACHMENT_STORE_OP_STORE,
 *     VK_ATTACHMENT_STORE_OP_END_RANGE = VK_ATTACHMENT_STORE_OP_DONT_CARE,
 *     VK_ATTACHMENT_STORE_OP_RANGE_SIZE = (VK_ATTACHMENT_STORE_OP_DONT_CARE - VK_ATTACHMENT_STORE_OP_STORE + 1),
 *     VK_ATTACHMENT_STORE_OP_MAX_ENUM = 0x7FFFFFFF
 * } VkAttachmentStoreOp;
 * </pre>
 * @author Alessandro Borges
 */
public class VkAttachmentStoreOp extends IntEnum<VkAttachmentStoreOp> {


   /** class */
   private static final Class<VkAttachmentStoreOp> myClass = VkAttachmentStoreOp.class;

   /** values */
   private static VkAttachmentStoreOp[] values = new VkAttachmentStoreOp[2];

   public static final VkAttachmentStoreOp VK_ATTACHMENT_STORE_OP_STORE = new VkAttachmentStoreOp("VK_ATTACHMENT_STORE_OP_STORE", 0, 0);
   public static final VkAttachmentStoreOp VK_ATTACHMENT_STORE_OP_DONT_CARE = new VkAttachmentStoreOp("VK_ATTACHMENT_STORE_OP_DONT_CARE", 1, 1);
   
   /**
    * Return all values available in this enumeration
    * @return Array of avail. VkAccessFlagBits
    */
    @SuppressWarnings("unchecked")
    public static VkAttachmentStoreOp[] values(){
            return values;
    }

	/**
	 * Get class of this enumeration
	 */
    protected static Class<VkAttachmentStoreOp> myGetClass(){
        return myClass;
    }

    /**
     * Creates a bitwise ORed enumeration
     * @param bits - list of enumerations to bitwise OR 
     * @return an enumeration of ORed bits 
     */
    public static VkAttachmentStoreOp or(VkAttachmentStoreOp...bits){
        int value = bits[0].getValue();        
        for (int i=1; i<bits.length; i++) {
            VkAttachmentStoreOp item = bits[i];
            value |= item.getValue();
        } 
        String name = myGetClass().getSimpleName() + " from bitwise Operation.[" + value +"]";
        VkAttachmentStoreOp ored = new VkAttachmentStoreOp(name, -1, value);        
        return ored;
    }
    
    /**
     * Creates a enumeration of this class, if valid. 
     * If you try to create a invalid enumeration it will raise a exception.
     * @param value - a valid enumeration value or ar ORed value.
     * @return a instance of VkAttachmentStoreOp from value. NULL if it is invalid value.
     */
    public static VkAttachmentStoreOp fromValue(int value){
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
        VkAttachmentStoreOp flag = new VkAttachmentStoreOp(name, -1, value); 
        return flag;
    }
    
    /**
     * Check is a given flagA is bitwise ORed with flagB
     * @param flagA - flag to test
     * @param flagB - flag to test
     * @return true if flagA bit
     */
    public static boolean isORed(VkAttachmentStoreOp flagA, VkAttachmentStoreOp flagB){
        int valA = flagA.getValue();
        int valB = flagB.getValue();
        return (valA & valB) == valB;
    }


    /** private ctor */
    private VkAttachmentStoreOp(String name, int ordinal, int v) {
       super(name, ordinal, v);
       values[ordinal] = this;
    }

 } // end of class VkAttachmentStoreOp
