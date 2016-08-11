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
 * Class to wrap Vulkan enumeration VkPrimitiveTopology
 *
 * <h3>Prototype</h3> <pre>
 * typedef enum VkPrimitiveTopology {
 *     VK_PRIMITIVE_TOPOLOGY_POINT_LIST = 0,
 *     VK_PRIMITIVE_TOPOLOGY_LINE_LIST = 1,
 *     VK_PRIMITIVE_TOPOLOGY_LINE_STRIP = 2,
 *     VK_PRIMITIVE_TOPOLOGY_TRIANGLE_LIST = 3,
 *     VK_PRIMITIVE_TOPOLOGY_TRIANGLE_STRIP = 4,
 *     VK_PRIMITIVE_TOPOLOGY_TRIANGLE_FAN = 5,
 *     VK_PRIMITIVE_TOPOLOGY_LINE_LIST_WITH_ADJACENCY = 6,
 *     VK_PRIMITIVE_TOPOLOGY_LINE_STRIP_WITH_ADJACENCY = 7,
 *     VK_PRIMITIVE_TOPOLOGY_TRIANGLE_LIST_WITH_ADJACENCY = 8,
 *     VK_PRIMITIVE_TOPOLOGY_TRIANGLE_STRIP_WITH_ADJACENCY = 9,
 *     VK_PRIMITIVE_TOPOLOGY_PATCH_LIST = 10,
 *     VK_PRIMITIVE_TOPOLOGY_BEGIN_RANGE = VK_PRIMITIVE_TOPOLOGY_POINT_LIST,
 *     VK_PRIMITIVE_TOPOLOGY_END_RANGE = VK_PRIMITIVE_TOPOLOGY_PATCH_LIST,
 *     VK_PRIMITIVE_TOPOLOGY_RANGE_SIZE = (VK_PRIMITIVE_TOPOLOGY_PATCH_LIST - VK_PRIMITIVE_TOPOLOGY_POINT_LIST + 1),
 *     VK_PRIMITIVE_TOPOLOGY_MAX_ENUM = 0x7FFFFFFF
 * } VkPrimitiveTopology;
 * </pre>
 * @author Alessandro Borges
 */
public class VkPrimitiveTopology extends IntEnum<VkPrimitiveTopology> {


   /** class */
   private static final Class<VkPrimitiveTopology> myClass = VkPrimitiveTopology.class;

   /** values */
   private static VkPrimitiveTopology[] values = new VkPrimitiveTopology[11];

   public static final VkPrimitiveTopology VK_PRIMITIVE_TOPOLOGY_POINT_LIST = new VkPrimitiveTopology("VK_PRIMITIVE_TOPOLOGY_POINT_LIST", 0, 0);
   public static final VkPrimitiveTopology VK_PRIMITIVE_TOPOLOGY_LINE_LIST = new VkPrimitiveTopology("VK_PRIMITIVE_TOPOLOGY_LINE_LIST", 1, 1);
   public static final VkPrimitiveTopology VK_PRIMITIVE_TOPOLOGY_LINE_STRIP = new VkPrimitiveTopology("VK_PRIMITIVE_TOPOLOGY_LINE_STRIP", 2, 2);
   public static final VkPrimitiveTopology VK_PRIMITIVE_TOPOLOGY_TRIANGLE_LIST = new VkPrimitiveTopology("VK_PRIMITIVE_TOPOLOGY_TRIANGLE_LIST", 3, 3);
   public static final VkPrimitiveTopology VK_PRIMITIVE_TOPOLOGY_TRIANGLE_STRIP = new VkPrimitiveTopology("VK_PRIMITIVE_TOPOLOGY_TRIANGLE_STRIP", 4, 4);
   public static final VkPrimitiveTopology VK_PRIMITIVE_TOPOLOGY_TRIANGLE_FAN = new VkPrimitiveTopology("VK_PRIMITIVE_TOPOLOGY_TRIANGLE_FAN", 5, 5);
   public static final VkPrimitiveTopology VK_PRIMITIVE_TOPOLOGY_LINE_LIST_WITH_ADJACENCY = new VkPrimitiveTopology("VK_PRIMITIVE_TOPOLOGY_LINE_LIST_WITH_ADJACENCY", 6, 6);
   public static final VkPrimitiveTopology VK_PRIMITIVE_TOPOLOGY_LINE_STRIP_WITH_ADJACENCY = new VkPrimitiveTopology("VK_PRIMITIVE_TOPOLOGY_LINE_STRIP_WITH_ADJACENCY", 7, 7);
   public static final VkPrimitiveTopology VK_PRIMITIVE_TOPOLOGY_TRIANGLE_LIST_WITH_ADJACENCY = new VkPrimitiveTopology("VK_PRIMITIVE_TOPOLOGY_TRIANGLE_LIST_WITH_ADJACENCY", 8, 8);
   public static final VkPrimitiveTopology VK_PRIMITIVE_TOPOLOGY_TRIANGLE_STRIP_WITH_ADJACENCY = new VkPrimitiveTopology("VK_PRIMITIVE_TOPOLOGY_TRIANGLE_STRIP_WITH_ADJACENCY", 9, 9);
   public static final VkPrimitiveTopology VK_PRIMITIVE_TOPOLOGY_PATCH_LIST = new VkPrimitiveTopology("VK_PRIMITIVE_TOPOLOGY_PATCH_LIST", 10, 10);
   
   /**
    * Return all values available in this enumeration
    * @return Array of avail. VkAccessFlagBits
    */
    @SuppressWarnings("unchecked")
    public static VkPrimitiveTopology[] values(){
            return values;
    }

	/**
	 * Get class of this enumeration
	 */
    protected static Class<VkPrimitiveTopology> myGetClass(){
        return myClass;
    }

    /**
     * Creates a bitwise ORed enumeration
     * @param bits - list of enumerations to bitwise OR 
     * @return an enumeration of ORed bits 
     */
    public static VkPrimitiveTopology or(VkPrimitiveTopology...bits){
        int value = bits[0].getValue();        
        for (int i=1; i<bits.length; i++) {
            VkPrimitiveTopology item = bits[i];
            value |= item.getValue();
        } 
        String name = myGetClass().getSimpleName() + " from bitwise Operation.[" + value +"]";
        VkPrimitiveTopology ored = new VkPrimitiveTopology(name, -1, value);        
        return ored;
    }
    
    /**
     * Creates a enumeration of this class, if valid. 
     * If you try to create a invalid enumeration it will raise a exception.
     * @param value - a valid enumeration value or ar ORed value.
     * @return a instance of VkPrimitiveTopology from value. NULL if it is invalid value.
     */
    public static VkPrimitiveTopology fromValue(int value){
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
        VkPrimitiveTopology flag = new VkPrimitiveTopology(name, -1, value); 
        return flag;
    }
	
	/**
     * Creates/populates a array of VkPrimitiveTopology from a set of values.
     * @param dst - destination array. Can be null.
     * @param values - int[] with valid values of this enumeration.
     * @return VkPrimitiveTopology array with matching values
     */
    public static VkPrimitiveTopology[] fromValues(VkPrimitiveTopology[] dst, int[] values){
        if(values == null) 
               return null;
        if(dst == null || dst.length != values.length){
            dst = new VkPrimitiveTopology[values.length];
        }        
        for (int i = 0; i < values.length; i++) {
            int val = values[i];
            dst[i] = VkPrimitiveTopology.fromValue(val);
        }        
        return dst;
    }
    
    /**
     * Check is a given flagA is bitwise ORed with flagB
     * @param flagA - flag to test
     * @param flagB - flag to test
     * @return true if flagA bit
     */
    public static boolean isORed(VkPrimitiveTopology flagA, VkPrimitiveTopology flagB){
        int valA = flagA.getValue();
        int valB = flagB.getValue();
        return (valA & valB) == valB;
    }


    /** private ctor */
    private VkPrimitiveTopology(String name, int ordinal, int v) {
       super(name, ordinal, v);
       values[ordinal] = this;
    }

 } // end of class VkPrimitiveTopology
