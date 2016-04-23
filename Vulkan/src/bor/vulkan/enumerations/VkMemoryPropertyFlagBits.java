/**
 * Bor_Vulkan Project Ver. 0.8.01 (beta)
 * Licence terms: 
 * The MIT License (MIT)
 * Copyright (c) 2016 Alessandro Borges
 * See https://opensource.org/licenses/MIT 
 */
package bor.vulkan.enumerations;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import bor.enumerable.*;

/**
 * Class to wrap Vulkan enumeration VkMemoryPropertyFlagBits
 *
 * <h3>Prototype</h3> <pre>
 * typedef enum VkMemoryPropertyFlagBits {
 *     VK_MEMORY_PROPERTY_DEVICE_LOCAL_BIT = 0x00000001,
 *     VK_MEMORY_PROPERTY_HOST_VISIBLE_BIT = 0x00000002,
 *     VK_MEMORY_PROPERTY_HOST_COHERENT_BIT = 0x00000004,
 *     VK_MEMORY_PROPERTY_HOST_CACHED_BIT = 0x00000008,
 *     VK_MEMORY_PROPERTY_LAZILY_ALLOCATED_BIT = 0x00000010,
 * } VkMemoryPropertyFlagBits;
 * </pre>
 * @author Alessandro Borges
 */
public class VkMemoryPropertyFlagBits extends IntEnum<VkMemoryPropertyFlagBits> {


   /** class */
   private static final Class<VkMemoryPropertyFlagBits> myClass = VkMemoryPropertyFlagBits.class;

   /** values */
   private static VkMemoryPropertyFlagBits[] values = new VkMemoryPropertyFlagBits[5];

   public static final VkMemoryPropertyFlagBits VK_MEMORY_PROPERTY_DEVICE_LOCAL_BIT = new VkMemoryPropertyFlagBits("VK_MEMORY_PROPERTY_DEVICE_LOCAL_BIT", 0, 0x00000001);
   public static final VkMemoryPropertyFlagBits VK_MEMORY_PROPERTY_HOST_VISIBLE_BIT = new VkMemoryPropertyFlagBits("VK_MEMORY_PROPERTY_HOST_VISIBLE_BIT", 1, 0x00000002);
   public static final VkMemoryPropertyFlagBits VK_MEMORY_PROPERTY_HOST_COHERENT_BIT = new VkMemoryPropertyFlagBits("VK_MEMORY_PROPERTY_HOST_COHERENT_BIT", 2, 0x00000004);
   public static final VkMemoryPropertyFlagBits VK_MEMORY_PROPERTY_HOST_CACHED_BIT = new VkMemoryPropertyFlagBits("VK_MEMORY_PROPERTY_HOST_CACHED_BIT", 3, 0x00000008);
   public static final VkMemoryPropertyFlagBits VK_MEMORY_PROPERTY_LAZILY_ALLOCATED_BIT = new VkMemoryPropertyFlagBits("VK_MEMORY_PROPERTY_LAZILY_ALLOCATED_BIT", 4, 0x00000010);
   
   /**
    * Return all values available in this enumeration
    * @return Array of avail. VkAccessFlagBits
    */
    @SuppressWarnings("unchecked")
    public static VkMemoryPropertyFlagBits[] values(){
            return values;
    }

	/**
	 * Get class of this enumeration
	 */
    protected static Class<VkMemoryPropertyFlagBits> myGetClass(){
        return myClass;
    }

    /**
     * Creates a bitwise ORed enumeration
     * @param bits - list of enumerations to bitwise OR 
     * @return an enumeration of ORed bits 
     */
    public static VkMemoryPropertyFlagBits or(VkMemoryPropertyFlagBits...bits){
        int value = bits[0].getValue();        
        for (int i=1; i<bits.length; i++) {
            VkMemoryPropertyFlagBits item = bits[i];
            value |= item.getValue();
        } 
        String name = myGetClass().getSimpleName() + " from bitwise Operation.[" + value +"]";
        VkMemoryPropertyFlagBits ored = new VkMemoryPropertyFlagBits(name, -1, value);        
        return ored;
    }
    
    /**
     * Creates a enumeration of this class, if valid. 
     * If you try to create a invalid enumeration it will raise a exception.
     * @param value - a valid enumeration value or ar ORed value.
     * @return a instance of VkMemoryPropertyFlagBits from value. NULL if it is invalid value.
     */
    public static VkMemoryPropertyFlagBits fromValue(int value){
        //simple case
        for (int i = 0; i < values.length; i++) {
            if(value==values[i].getValue()){
                return values[i];
            }
        }
        //ORed values        
        int test = value;
        List<Integer> bits = new ArrayList<Integer>();
        
        for (int i = 0; i < values.length; i++) {
            int v = values[i].getValue();
            bits.add(v);
            if((test & v) != v){
                bits.clear();
                return null;
            }
        }
                
        String name = "[";
        int c = 0;
        for (Integer i : bits) {
            if(c!=0)
                name +=", ";
            c++;
            name += VkMemoryPropertyFlagBits.fromValue(i).toString();
        }
        
        name += "]";
        
        
        VkMemoryPropertyFlagBits flag = new VkMemoryPropertyFlagBits(name, -1, value); 
        return flag;
    }
    
    /**
     * Check is a given flagA is bitwise ORed with flagB
     * @param flagA - flag to test
     * @param flagB - flag to test
     * @return true if flagA bit
     */
    public static boolean isORed(VkMemoryPropertyFlagBits flagA, VkMemoryPropertyFlagBits flagB){
        int valA = flagA.getValue();
        int valB = flagB.getValue();
        return (valA & valB) == valB;
    }


    /** private ctor */
    private VkMemoryPropertyFlagBits(String name, int ordinal, int v) {
       super(name, ordinal, v);
       values[ordinal] = this;
    }

 } // end of class VkMemoryPropertyFlagBits
