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
 * Class to wrap Vulkan enumeration VkPolygonMode
 *
 * <h3>Prototype</h3> <pre>
 * typedef enum VkPolygonMode {
 *     VK_POLYGON_MODE_FILL = 0,
 *     VK_POLYGON_MODE_LINE = 1,
 *     VK_POLYGON_MODE_POINT = 2,
 *     VK_POLYGON_MODE_BEGIN_RANGE = VK_POLYGON_MODE_FILL,
 *     VK_POLYGON_MODE_END_RANGE = VK_POLYGON_MODE_POINT,
 *     VK_POLYGON_MODE_RANGE_SIZE = (VK_POLYGON_MODE_POINT - VK_POLYGON_MODE_FILL + 1),
 *     VK_POLYGON_MODE_MAX_ENUM = 0x7FFFFFFF
 * } VkPolygonMode;
 * </pre>
 * @author Alessandro Borges
 */
public class VkPolygonMode extends IntEnum<VkPolygonMode> {


   /** class */
   private static final Class<VkPolygonMode> myClass = VkPolygonMode.class;

   /** values */
   private static VkPolygonMode[] values = new VkPolygonMode[3];

   public static final VkPolygonMode VK_POLYGON_MODE_FILL = new VkPolygonMode("VK_POLYGON_MODE_FILL", 0, 0);
   public static final VkPolygonMode VK_POLYGON_MODE_LINE = new VkPolygonMode("VK_POLYGON_MODE_LINE", 1, 1);
   public static final VkPolygonMode VK_POLYGON_MODE_POINT = new VkPolygonMode("VK_POLYGON_MODE_POINT", 2, 2);
   
   /**
    * Return all values available in this enumeration
    * @return Array of avail. VkAccessFlagBits
    */
    @SuppressWarnings("unchecked")
    public static VkPolygonMode[] values(){
            return values;
    }

	/**
	 * Get class of this enumeration
	 */
    protected static Class<VkPolygonMode> myGetClass(){
        return myClass;
    }

    /**
     * Creates a bitwise ORed enumeration
     * @param bits - list of enumerations to bitwise OR 
     * @return an enumeration of ORed bits 
     */
    public static VkPolygonMode or(VkPolygonMode...bits){
        int value = bits[0].getValue();        
        for (int i=1; i<bits.length; i++) {
            VkPolygonMode item = bits[i];
            value |= item.getValue();
        } 
        String name = myGetClass().getSimpleName() + " from bitwise Operation.[" + value +"]";
        VkPolygonMode ored = new VkPolygonMode(name, -1, value);        
        return ored;
    }
    
    /**
     * Creates a enumeration of this class, if valid. 
     * If you try to create a invalid enumeration it will raise a exception.
     * @param value - a valid enumeration value or ar ORed value.
     * @return a instance of VkPolygonMode from value. NULL if it is invalid value.
     */
    public static VkPolygonMode fromValue(int value){
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
        VkPolygonMode flag = new VkPolygonMode(name, -1, value); 
        return flag;
    }
    
    /**
     * Check is a given flagA is bitwise ORed with flagB
     * @param flagA - flag to test
     * @param flagB - flag to test
     * @return true if flagA bit
     */
    public static boolean isORed(VkPolygonMode flagA, VkPolygonMode flagB){
        int valA = flagA.getValue();
        int valB = flagB.getValue();
        return (valA & valB) == valB;
    }


    /** private ctor */
    private VkPolygonMode(String name, int ordinal, int v) {
       super(name, ordinal, v);
       values[ordinal] = this;
    }

 } // end of class VkPolygonMode
