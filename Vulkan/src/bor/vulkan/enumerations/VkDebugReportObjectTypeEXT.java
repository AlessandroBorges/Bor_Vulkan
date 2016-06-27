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
 * Class to wrap Vulkan enumeration VkDebugReportObjectTypeEXT
 *
 * <h3>Prototype</h3> <pre>
 * typedef enum VkDebugReportObjectTypeEXT {
 *     VK_DEBUG_REPORT_OBJECT_TYPE_UNKNOWN_EXT = 0,
 *     VK_DEBUG_REPORT_OBJECT_TYPE_INSTANCE_EXT = 1,
 *     VK_DEBUG_REPORT_OBJECT_TYPE_PHYSICAL_DEVICE_EXT = 2,
 *     VK_DEBUG_REPORT_OBJECT_TYPE_DEVICE_EXT = 3,
 *     VK_DEBUG_REPORT_OBJECT_TYPE_QUEUE_EXT = 4,
 *     VK_DEBUG_REPORT_OBJECT_TYPE_SEMAPHORE_EXT = 5,
 *     VK_DEBUG_REPORT_OBJECT_TYPE_COMMAND_BUFFER_EXT = 6,
 *     VK_DEBUG_REPORT_OBJECT_TYPE_FENCE_EXT = 7,
 *     VK_DEBUG_REPORT_OBJECT_TYPE_DEVICE_MEMORY_EXT = 8,
 *     VK_DEBUG_REPORT_OBJECT_TYPE_BUFFER_EXT = 9,
 *     VK_DEBUG_REPORT_OBJECT_TYPE_IMAGE_EXT = 10,
 *     VK_DEBUG_REPORT_OBJECT_TYPE_EVENT_EXT = 11,
 *     VK_DEBUG_REPORT_OBJECT_TYPE_QUERY_POOL_EXT = 12,
 *     VK_DEBUG_REPORT_OBJECT_TYPE_BUFFER_VIEW_EXT = 13,
 *     VK_DEBUG_REPORT_OBJECT_TYPE_IMAGE_VIEW_EXT = 14,
 *     VK_DEBUG_REPORT_OBJECT_TYPE_SHADER_MODULE_EXT = 15,
 *     VK_DEBUG_REPORT_OBJECT_TYPE_PIPELINE_CACHE_EXT = 16,
 *     VK_DEBUG_REPORT_OBJECT_TYPE_PIPELINE_LAYOUT_EXT = 17,
 *     VK_DEBUG_REPORT_OBJECT_TYPE_RENDER_PASS_EXT = 18,
 *     VK_DEBUG_REPORT_OBJECT_TYPE_PIPELINE_EXT = 19,
 *     VK_DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_SET_LAYOUT_EXT = 20,
 *     VK_DEBUG_REPORT_OBJECT_TYPE_SAMPLER_EXT = 21,
 *     VK_DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_POOL_EXT = 22,
 *     VK_DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_SET_EXT = 23,
 *     VK_DEBUG_REPORT_OBJECT_TYPE_FRAMEBUFFER_EXT = 24,
 *     VK_DEBUG_REPORT_OBJECT_TYPE_COMMAND_POOL_EXT = 25,
 *     VK_DEBUG_REPORT_OBJECT_TYPE_SURFACE_KHR_EXT = 26,
 *     VK_DEBUG_REPORT_OBJECT_TYPE_SWAPCHAIN_KHR_EXT = 27,
 *     VK_DEBUG_REPORT_OBJECT_TYPE_DEBUG_REPORT_EXT = 28,
 *     VK_DEBUG_REPORT_OBJECT_TYPE_BEGIN_RANGE_EXT = VK_DEBUG_REPORT_OBJECT_TYPE_UNKNOWN_EXT,
 *     VK_DEBUG_REPORT_OBJECT_TYPE_END_RANGE_EXT = VK_DEBUG_REPORT_OBJECT_TYPE_DEBUG_REPORT_EXT,
 *     VK_DEBUG_REPORT_OBJECT_TYPE_RANGE_SIZE_EXT = (VK_DEBUG_REPORT_OBJECT_TYPE_DEBUG_REPORT_EXT - VK_DEBUG_REPORT_OBJECT_TYPE_UNKNOWN_EXT + 1),
 *     VK_DEBUG_REPORT_OBJECT_TYPE_MAX_ENUM_EXT = 0x7FFFFFFF
 * } VkDebugReportObjectTypeEXT;
 * </pre>
 * @author Alessandro Borges
 */
public class VkDebugReportObjectTypeEXT extends IntEnum<VkDebugReportObjectTypeEXT> {


   /** class */
   private static final Class<VkDebugReportObjectTypeEXT> myClass = VkDebugReportObjectTypeEXT.class;

   /** values */
   private static VkDebugReportObjectTypeEXT[] values = new VkDebugReportObjectTypeEXT[29];

   public static final VkDebugReportObjectTypeEXT VK_DEBUG_REPORT_OBJECT_TYPE_UNKNOWN_EXT = new VkDebugReportObjectTypeEXT("VK_DEBUG_REPORT_OBJECT_TYPE_UNKNOWN_EXT", 0, 0);
   public static final VkDebugReportObjectTypeEXT VK_DEBUG_REPORT_OBJECT_TYPE_INSTANCE_EXT = new VkDebugReportObjectTypeEXT("VK_DEBUG_REPORT_OBJECT_TYPE_INSTANCE_EXT", 1, 1);
   public static final VkDebugReportObjectTypeEXT VK_DEBUG_REPORT_OBJECT_TYPE_PHYSICAL_DEVICE_EXT = new VkDebugReportObjectTypeEXT("VK_DEBUG_REPORT_OBJECT_TYPE_PHYSICAL_DEVICE_EXT", 2, 2);
   public static final VkDebugReportObjectTypeEXT VK_DEBUG_REPORT_OBJECT_TYPE_DEVICE_EXT = new VkDebugReportObjectTypeEXT("VK_DEBUG_REPORT_OBJECT_TYPE_DEVICE_EXT", 3, 3);
   public static final VkDebugReportObjectTypeEXT VK_DEBUG_REPORT_OBJECT_TYPE_QUEUE_EXT = new VkDebugReportObjectTypeEXT("VK_DEBUG_REPORT_OBJECT_TYPE_QUEUE_EXT", 4, 4);
   public static final VkDebugReportObjectTypeEXT VK_DEBUG_REPORT_OBJECT_TYPE_SEMAPHORE_EXT = new VkDebugReportObjectTypeEXT("VK_DEBUG_REPORT_OBJECT_TYPE_SEMAPHORE_EXT", 5, 5);
   public static final VkDebugReportObjectTypeEXT VK_DEBUG_REPORT_OBJECT_TYPE_COMMAND_BUFFER_EXT = new VkDebugReportObjectTypeEXT("VK_DEBUG_REPORT_OBJECT_TYPE_COMMAND_BUFFER_EXT", 6, 6);
   public static final VkDebugReportObjectTypeEXT VK_DEBUG_REPORT_OBJECT_TYPE_FENCE_EXT = new VkDebugReportObjectTypeEXT("VK_DEBUG_REPORT_OBJECT_TYPE_FENCE_EXT", 7, 7);
   public static final VkDebugReportObjectTypeEXT VK_DEBUG_REPORT_OBJECT_TYPE_DEVICE_MEMORY_EXT = new VkDebugReportObjectTypeEXT("VK_DEBUG_REPORT_OBJECT_TYPE_DEVICE_MEMORY_EXT", 8, 8);
   public static final VkDebugReportObjectTypeEXT VK_DEBUG_REPORT_OBJECT_TYPE_BUFFER_EXT = new VkDebugReportObjectTypeEXT("VK_DEBUG_REPORT_OBJECT_TYPE_BUFFER_EXT", 9, 9);
   public static final VkDebugReportObjectTypeEXT VK_DEBUG_REPORT_OBJECT_TYPE_IMAGE_EXT = new VkDebugReportObjectTypeEXT("VK_DEBUG_REPORT_OBJECT_TYPE_IMAGE_EXT", 10, 10);
   public static final VkDebugReportObjectTypeEXT VK_DEBUG_REPORT_OBJECT_TYPE_EVENT_EXT = new VkDebugReportObjectTypeEXT("VK_DEBUG_REPORT_OBJECT_TYPE_EVENT_EXT", 11, 11);
   public static final VkDebugReportObjectTypeEXT VK_DEBUG_REPORT_OBJECT_TYPE_QUERY_POOL_EXT = new VkDebugReportObjectTypeEXT("VK_DEBUG_REPORT_OBJECT_TYPE_QUERY_POOL_EXT", 12, 12);
   public static final VkDebugReportObjectTypeEXT VK_DEBUG_REPORT_OBJECT_TYPE_BUFFER_VIEW_EXT = new VkDebugReportObjectTypeEXT("VK_DEBUG_REPORT_OBJECT_TYPE_BUFFER_VIEW_EXT", 13, 13);
   public static final VkDebugReportObjectTypeEXT VK_DEBUG_REPORT_OBJECT_TYPE_IMAGE_VIEW_EXT = new VkDebugReportObjectTypeEXT("VK_DEBUG_REPORT_OBJECT_TYPE_IMAGE_VIEW_EXT", 14, 14);
   public static final VkDebugReportObjectTypeEXT VK_DEBUG_REPORT_OBJECT_TYPE_SHADER_MODULE_EXT = new VkDebugReportObjectTypeEXT("VK_DEBUG_REPORT_OBJECT_TYPE_SHADER_MODULE_EXT", 15, 15);
   public static final VkDebugReportObjectTypeEXT VK_DEBUG_REPORT_OBJECT_TYPE_PIPELINE_CACHE_EXT = new VkDebugReportObjectTypeEXT("VK_DEBUG_REPORT_OBJECT_TYPE_PIPELINE_CACHE_EXT", 16, 16);
   public static final VkDebugReportObjectTypeEXT VK_DEBUG_REPORT_OBJECT_TYPE_PIPELINE_LAYOUT_EXT = new VkDebugReportObjectTypeEXT("VK_DEBUG_REPORT_OBJECT_TYPE_PIPELINE_LAYOUT_EXT", 17, 17);
   public static final VkDebugReportObjectTypeEXT VK_DEBUG_REPORT_OBJECT_TYPE_RENDER_PASS_EXT = new VkDebugReportObjectTypeEXT("VK_DEBUG_REPORT_OBJECT_TYPE_RENDER_PASS_EXT", 18, 18);
   public static final VkDebugReportObjectTypeEXT VK_DEBUG_REPORT_OBJECT_TYPE_PIPELINE_EXT = new VkDebugReportObjectTypeEXT("VK_DEBUG_REPORT_OBJECT_TYPE_PIPELINE_EXT", 19, 19);
   public static final VkDebugReportObjectTypeEXT VK_DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_SET_LAYOUT_EXT = new VkDebugReportObjectTypeEXT("VK_DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_SET_LAYOUT_EXT", 20, 20);
   public static final VkDebugReportObjectTypeEXT VK_DEBUG_REPORT_OBJECT_TYPE_SAMPLER_EXT = new VkDebugReportObjectTypeEXT("VK_DEBUG_REPORT_OBJECT_TYPE_SAMPLER_EXT", 21, 21);
   public static final VkDebugReportObjectTypeEXT VK_DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_POOL_EXT = new VkDebugReportObjectTypeEXT("VK_DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_POOL_EXT", 22, 22);
   public static final VkDebugReportObjectTypeEXT VK_DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_SET_EXT = new VkDebugReportObjectTypeEXT("VK_DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_SET_EXT", 23, 23);
   public static final VkDebugReportObjectTypeEXT VK_DEBUG_REPORT_OBJECT_TYPE_FRAMEBUFFER_EXT = new VkDebugReportObjectTypeEXT("VK_DEBUG_REPORT_OBJECT_TYPE_FRAMEBUFFER_EXT", 24, 24);
   public static final VkDebugReportObjectTypeEXT VK_DEBUG_REPORT_OBJECT_TYPE_COMMAND_POOL_EXT = new VkDebugReportObjectTypeEXT("VK_DEBUG_REPORT_OBJECT_TYPE_COMMAND_POOL_EXT", 25, 25);
   public static final VkDebugReportObjectTypeEXT VK_DEBUG_REPORT_OBJECT_TYPE_SURFACE_KHR_EXT = new VkDebugReportObjectTypeEXT("VK_DEBUG_REPORT_OBJECT_TYPE_SURFACE_KHR_EXT", 26, 26);
   public static final VkDebugReportObjectTypeEXT VK_DEBUG_REPORT_OBJECT_TYPE_SWAPCHAIN_KHR_EXT = new VkDebugReportObjectTypeEXT("VK_DEBUG_REPORT_OBJECT_TYPE_SWAPCHAIN_KHR_EXT", 27, 27);
   public static final VkDebugReportObjectTypeEXT VK_DEBUG_REPORT_OBJECT_TYPE_DEBUG_REPORT_EXT = new VkDebugReportObjectTypeEXT("VK_DEBUG_REPORT_OBJECT_TYPE_DEBUG_REPORT_EXT", 28, 28);
   
   /**
    * Return all values available in this enumeration
    * @return Array of avail. VkAccessFlagBits
    */
    @SuppressWarnings("unchecked")
    public static VkDebugReportObjectTypeEXT[] values(){
            return values;
    }

	/**
	 * Get class of this enumeration
	 */
    protected static Class<VkDebugReportObjectTypeEXT> myGetClass(){
        return myClass;
    }

    /**
     * Creates a bitwise ORed enumeration
     * @param bits - list of enumerations to bitwise OR 
     * @return an enumeration of ORed bits 
     */
    public static VkDebugReportObjectTypeEXT or(VkDebugReportObjectTypeEXT...bits){
        int value = bits[0].getValue();        
        for (int i=1; i<bits.length; i++) {
            VkDebugReportObjectTypeEXT item = bits[i];
            value |= item.getValue();
        } 
        String name = myGetClass().getSimpleName() + " from bitwise Operation.[" + value +"]";
        VkDebugReportObjectTypeEXT ored = new VkDebugReportObjectTypeEXT(name, -1, value);        
        return ored;
    }
    
    /**
     * Creates a enumeration of this class, if valid. 
     * If you try to create a invalid enumeration it will raise a exception.
     * @param value - a valid enumeration value or ar ORed value.
     * @return a instance of VkDebugReportObjectTypeEXT from value. NULL if it is invalid value.
     */
    public static VkDebugReportObjectTypeEXT fromValue(int value){
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
        VkDebugReportObjectTypeEXT flag = new VkDebugReportObjectTypeEXT(name, -1, value); 
        return flag;
    }
    
    /**
     * Check is a given flagA is bitwise ORed with flagB
     * @param flagA - flag to test
     * @param flagB - flag to test
     * @return true if flagA bit
     */
    public static boolean isORed(VkDebugReportObjectTypeEXT flagA, VkDebugReportObjectTypeEXT flagB){
        int valA = flagA.getValue();
        int valB = flagB.getValue();
        return (valA & valB) == valB;
    }


    /** private ctor */
    private VkDebugReportObjectTypeEXT(String name, int ordinal, int v) {
       super(name, ordinal, v);
       values[ordinal] = this;
    }

 } // end of class VkDebugReportObjectTypeEXT
