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
 * Class to wrap Vulkan enumeration VkStructureType
 *
 * <h3>Prototype</h3> <pre>
 * typedef enum VkStructureType {
 *     VK_STRUCTURE_TYPE_APPLICATION_INFO = 0,
 *     VK_STRUCTURE_TYPE_INSTANCE_CREATE_INFO = 1,
 *     VK_STRUCTURE_TYPE_DEVICE_QUEUE_CREATE_INFO = 2,
 *     VK_STRUCTURE_TYPE_DEVICE_CREATE_INFO = 3,
 *     VK_STRUCTURE_TYPE_SUBMIT_INFO = 4,
 *     VK_STRUCTURE_TYPE_MEMORY_ALLOCATE_INFO = 5,
 *     VK_STRUCTURE_TYPE_MAPPED_MEMORY_RANGE = 6,
 *     VK_STRUCTURE_TYPE_BIND_SPARSE_INFO = 7,
 *     VK_STRUCTURE_TYPE_FENCE_CREATE_INFO = 8,
 *     VK_STRUCTURE_TYPE_SEMAPHORE_CREATE_INFO = 9,
 *     VK_STRUCTURE_TYPE_EVENT_CREATE_INFO = 10,
 *     VK_STRUCTURE_TYPE_QUERY_POOL_CREATE_INFO = 11,
 *     VK_STRUCTURE_TYPE_BUFFER_CREATE_INFO = 12,
 *     VK_STRUCTURE_TYPE_BUFFER_VIEW_CREATE_INFO = 13,
 *     VK_STRUCTURE_TYPE_IMAGE_CREATE_INFO = 14,
 *     VK_STRUCTURE_TYPE_IMAGE_VIEW_CREATE_INFO = 15,
 *     VK_STRUCTURE_TYPE_SHADER_MODULE_CREATE_INFO = 16,
 *     VK_STRUCTURE_TYPE_PIPELINE_CACHE_CREATE_INFO = 17,
 *     VK_STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_CREATE_INFO = 18,
 *     VK_STRUCTURE_TYPE_PIPELINE_VERTEX_INPUT_STATE_CREATE_INFO = 19,
 *     VK_STRUCTURE_TYPE_PIPELINE_INPUT_ASSEMBLY_STATE_CREATE_INFO = 20,
 *     VK_STRUCTURE_TYPE_PIPELINE_TESSELLATION_STATE_CREATE_INFO = 21,
 *     VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_STATE_CREATE_INFO = 22,
 *     VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_STATE_CREATE_INFO = 23,
 *     VK_STRUCTURE_TYPE_PIPELINE_MULTISAMPLE_STATE_CREATE_INFO = 24,
 *     VK_STRUCTURE_TYPE_PIPELINE_DEPTH_STENCIL_STATE_CREATE_INFO = 25,
 *     VK_STRUCTURE_TYPE_PIPELINE_COLOR_BLEND_STATE_CREATE_INFO = 26,
 *     VK_STRUCTURE_TYPE_PIPELINE_DYNAMIC_STATE_CREATE_INFO = 27,
 *     VK_STRUCTURE_TYPE_GRAPHICS_PIPELINE_CREATE_INFO = 28,
 *     VK_STRUCTURE_TYPE_COMPUTE_PIPELINE_CREATE_INFO = 29,
 *     VK_STRUCTURE_TYPE_PIPELINE_LAYOUT_CREATE_INFO = 30,
 *     VK_STRUCTURE_TYPE_SAMPLER_CREATE_INFO = 31,
 *     VK_STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_CREATE_INFO = 32,
 *     VK_STRUCTURE_TYPE_DESCRIPTOR_POOL_CREATE_INFO = 33,
 *     VK_STRUCTURE_TYPE_DESCRIPTOR_SET_ALLOCATE_INFO = 34,
 *     VK_STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET = 35,
 *     VK_STRUCTURE_TYPE_COPY_DESCRIPTOR_SET = 36,
 *     VK_STRUCTURE_TYPE_FRAMEBUFFER_CREATE_INFO = 37,
 *     VK_STRUCTURE_TYPE_RENDER_PASS_CREATE_INFO = 38,
 *     VK_STRUCTURE_TYPE_COMMAND_POOL_CREATE_INFO = 39,
 *     VK_STRUCTURE_TYPE_COMMAND_BUFFER_ALLOCATE_INFO = 40,
 *     VK_STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_INFO = 41,
 *     VK_STRUCTURE_TYPE_COMMAND_BUFFER_BEGIN_INFO = 42,
 *     VK_STRUCTURE_TYPE_RENDER_PASS_BEGIN_INFO = 43,
 *     VK_STRUCTURE_TYPE_BUFFER_MEMORY_BARRIER = 44,
 *     VK_STRUCTURE_TYPE_IMAGE_MEMORY_BARRIER = 45,
 *     VK_STRUCTURE_TYPE_MEMORY_BARRIER = 46,
 *     VK_STRUCTURE_TYPE_LOADER_INSTANCE_CREATE_INFO = 47,
 *     VK_STRUCTURE_TYPE_LOADER_DEVICE_CREATE_INFO = 48,
 *     VK_STRUCTURE_TYPE_SWAPCHAIN_CREATE_INFO_KHR = 1000001000,
 *     VK_STRUCTURE_TYPE_PRESENT_INFO_KHR = 1000001001,
 *     VK_STRUCTURE_TYPE_DISPLAY_MODE_CREATE_INFO_KHR = 1000002000,
 *     VK_STRUCTURE_TYPE_DISPLAY_SURFACE_CREATE_INFO_KHR = 1000002001,
 *     VK_STRUCTURE_TYPE_DISPLAY_PRESENT_INFO_KHR = 1000003000,
 *     VK_STRUCTURE_TYPE_XLIB_SURFACE_CREATE_INFO_KHR = 1000004000,
 *     VK_STRUCTURE_TYPE_XCB_SURFACE_CREATE_INFO_KHR = 1000005000,
 *     VK_STRUCTURE_TYPE_WAYLAND_SURFACE_CREATE_INFO_KHR = 1000006000,
 *     VK_STRUCTURE_TYPE_MIR_SURFACE_CREATE_INFO_KHR = 1000007000,
 *     VK_STRUCTURE_TYPE_ANDROID_SURFACE_CREATE_INFO_KHR = 1000008000,
 *     VK_STRUCTURE_TYPE_WIN32_SURFACE_CREATE_INFO_KHR = 1000009000,
 *     VK_STRUCTURE_TYPE_DEBUG_REPORT_CALLBACK_CREATE_INFO_EXT = 1000011000,
 *     VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_STATE_RASTERIZATION_ORDER_AMD = 1000018000,
 *     VK_STRUCTURE_TYPE_DEBUG_MARKER_OBJECT_NAME_INFO_EXT = 1000022000,
 *     VK_STRUCTURE_TYPE_DEBUG_MARKER_OBJECT_TAG_INFO_EXT = 1000022001,
 *     VK_STRUCTURE_TYPE_DEBUG_MARKER_MARKER_INFO_EXT = 1000022002,
 *     VK_STRUCTURE_TYPE_DEDICATED_ALLOCATION_IMAGE_CREATE_INFO_NV = 1000026000,
 *     VK_STRUCTURE_TYPE_DEDICATED_ALLOCATION_BUFFER_CREATE_INFO_NV = 1000026001,
 *     VK_STRUCTURE_TYPE_DEDICATED_ALLOCATION_MEMORY_ALLOCATE_INFO_NV = 1000026002,
 *     VK_STRUCTURE_TYPE_BEGIN_RANGE = VK_STRUCTURE_TYPE_APPLICATION_INFO,
 *     VK_STRUCTURE_TYPE_END_RANGE = VK_STRUCTURE_TYPE_LOADER_DEVICE_CREATE_INFO,
 *     VK_STRUCTURE_TYPE_RANGE_SIZE = (VK_STRUCTURE_TYPE_LOADER_DEVICE_CREATE_INFO - VK_STRUCTURE_TYPE_APPLICATION_INFO + 1),
 *     VK_STRUCTURE_TYPE_MAX_ENUM = 0x7FFFFFFF
 * } VkStructureType;
 * </pre>
 * @author Alessandro Borges
 */
public class VkStructureType extends IntEnum<VkStructureType> {


   /** class */
   private static final Class<VkStructureType> myClass = VkStructureType.class;

   /** values */
   private static VkStructureType[] values = new VkStructureType[68];

   public static final VkStructureType VK_STRUCTURE_TYPE_APPLICATION_INFO = new VkStructureType("VK_STRUCTURE_TYPE_APPLICATION_INFO", 0, 0);
   public static final VkStructureType VK_STRUCTURE_TYPE_INSTANCE_CREATE_INFO = new VkStructureType("VK_STRUCTURE_TYPE_INSTANCE_CREATE_INFO", 1, 1);
   public static final VkStructureType VK_STRUCTURE_TYPE_DEVICE_QUEUE_CREATE_INFO = new VkStructureType("VK_STRUCTURE_TYPE_DEVICE_QUEUE_CREATE_INFO", 2, 2);
   public static final VkStructureType VK_STRUCTURE_TYPE_DEVICE_CREATE_INFO = new VkStructureType("VK_STRUCTURE_TYPE_DEVICE_CREATE_INFO", 3, 3);
   public static final VkStructureType VK_STRUCTURE_TYPE_SUBMIT_INFO = new VkStructureType("VK_STRUCTURE_TYPE_SUBMIT_INFO", 4, 4);
   public static final VkStructureType VK_STRUCTURE_TYPE_MEMORY_ALLOCATE_INFO = new VkStructureType("VK_STRUCTURE_TYPE_MEMORY_ALLOCATE_INFO", 5, 5);
   public static final VkStructureType VK_STRUCTURE_TYPE_MAPPED_MEMORY_RANGE = new VkStructureType("VK_STRUCTURE_TYPE_MAPPED_MEMORY_RANGE", 6, 6);
   public static final VkStructureType VK_STRUCTURE_TYPE_BIND_SPARSE_INFO = new VkStructureType("VK_STRUCTURE_TYPE_BIND_SPARSE_INFO", 7, 7);
   public static final VkStructureType VK_STRUCTURE_TYPE_FENCE_CREATE_INFO = new VkStructureType("VK_STRUCTURE_TYPE_FENCE_CREATE_INFO", 8, 8);
   public static final VkStructureType VK_STRUCTURE_TYPE_SEMAPHORE_CREATE_INFO = new VkStructureType("VK_STRUCTURE_TYPE_SEMAPHORE_CREATE_INFO", 9, 9);
   public static final VkStructureType VK_STRUCTURE_TYPE_EVENT_CREATE_INFO = new VkStructureType("VK_STRUCTURE_TYPE_EVENT_CREATE_INFO", 10, 10);
   public static final VkStructureType VK_STRUCTURE_TYPE_QUERY_POOL_CREATE_INFO = new VkStructureType("VK_STRUCTURE_TYPE_QUERY_POOL_CREATE_INFO", 11, 11);
   public static final VkStructureType VK_STRUCTURE_TYPE_BUFFER_CREATE_INFO = new VkStructureType("VK_STRUCTURE_TYPE_BUFFER_CREATE_INFO", 12, 12);
   public static final VkStructureType VK_STRUCTURE_TYPE_BUFFER_VIEW_CREATE_INFO = new VkStructureType("VK_STRUCTURE_TYPE_BUFFER_VIEW_CREATE_INFO", 13, 13);
   public static final VkStructureType VK_STRUCTURE_TYPE_IMAGE_CREATE_INFO = new VkStructureType("VK_STRUCTURE_TYPE_IMAGE_CREATE_INFO", 14, 14);
   public static final VkStructureType VK_STRUCTURE_TYPE_IMAGE_VIEW_CREATE_INFO = new VkStructureType("VK_STRUCTURE_TYPE_IMAGE_VIEW_CREATE_INFO", 15, 15);
   public static final VkStructureType VK_STRUCTURE_TYPE_SHADER_MODULE_CREATE_INFO = new VkStructureType("VK_STRUCTURE_TYPE_SHADER_MODULE_CREATE_INFO", 16, 16);
   public static final VkStructureType VK_STRUCTURE_TYPE_PIPELINE_CACHE_CREATE_INFO = new VkStructureType("VK_STRUCTURE_TYPE_PIPELINE_CACHE_CREATE_INFO", 17, 17);
   public static final VkStructureType VK_STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_CREATE_INFO = new VkStructureType("VK_STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_CREATE_INFO", 18, 18);
   public static final VkStructureType VK_STRUCTURE_TYPE_PIPELINE_VERTEX_INPUT_STATE_CREATE_INFO = new VkStructureType("VK_STRUCTURE_TYPE_PIPELINE_VERTEX_INPUT_STATE_CREATE_INFO", 19, 19);
   public static final VkStructureType VK_STRUCTURE_TYPE_PIPELINE_INPUT_ASSEMBLY_STATE_CREATE_INFO = new VkStructureType("VK_STRUCTURE_TYPE_PIPELINE_INPUT_ASSEMBLY_STATE_CREATE_INFO", 20, 20);
   public static final VkStructureType VK_STRUCTURE_TYPE_PIPELINE_TESSELLATION_STATE_CREATE_INFO = new VkStructureType("VK_STRUCTURE_TYPE_PIPELINE_TESSELLATION_STATE_CREATE_INFO", 21, 21);
   public static final VkStructureType VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_STATE_CREATE_INFO = new VkStructureType("VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_STATE_CREATE_INFO", 22, 22);
   public static final VkStructureType VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_STATE_CREATE_INFO = new VkStructureType("VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_STATE_CREATE_INFO", 23, 23);
   public static final VkStructureType VK_STRUCTURE_TYPE_PIPELINE_MULTISAMPLE_STATE_CREATE_INFO = new VkStructureType("VK_STRUCTURE_TYPE_PIPELINE_MULTISAMPLE_STATE_CREATE_INFO", 24, 24);
   public static final VkStructureType VK_STRUCTURE_TYPE_PIPELINE_DEPTH_STENCIL_STATE_CREATE_INFO = new VkStructureType("VK_STRUCTURE_TYPE_PIPELINE_DEPTH_STENCIL_STATE_CREATE_INFO", 25, 25);
   public static final VkStructureType VK_STRUCTURE_TYPE_PIPELINE_COLOR_BLEND_STATE_CREATE_INFO = new VkStructureType("VK_STRUCTURE_TYPE_PIPELINE_COLOR_BLEND_STATE_CREATE_INFO", 26, 26);
   public static final VkStructureType VK_STRUCTURE_TYPE_PIPELINE_DYNAMIC_STATE_CREATE_INFO = new VkStructureType("VK_STRUCTURE_TYPE_PIPELINE_DYNAMIC_STATE_CREATE_INFO", 27, 27);
   public static final VkStructureType VK_STRUCTURE_TYPE_GRAPHICS_PIPELINE_CREATE_INFO = new VkStructureType("VK_STRUCTURE_TYPE_GRAPHICS_PIPELINE_CREATE_INFO", 28, 28);
   public static final VkStructureType VK_STRUCTURE_TYPE_COMPUTE_PIPELINE_CREATE_INFO = new VkStructureType("VK_STRUCTURE_TYPE_COMPUTE_PIPELINE_CREATE_INFO", 29, 29);
   public static final VkStructureType VK_STRUCTURE_TYPE_PIPELINE_LAYOUT_CREATE_INFO = new VkStructureType("VK_STRUCTURE_TYPE_PIPELINE_LAYOUT_CREATE_INFO", 30, 30);
   public static final VkStructureType VK_STRUCTURE_TYPE_SAMPLER_CREATE_INFO = new VkStructureType("VK_STRUCTURE_TYPE_SAMPLER_CREATE_INFO", 31, 31);
   public static final VkStructureType VK_STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_CREATE_INFO = new VkStructureType("VK_STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_CREATE_INFO", 32, 32);
   public static final VkStructureType VK_STRUCTURE_TYPE_DESCRIPTOR_POOL_CREATE_INFO = new VkStructureType("VK_STRUCTURE_TYPE_DESCRIPTOR_POOL_CREATE_INFO", 33, 33);
   public static final VkStructureType VK_STRUCTURE_TYPE_DESCRIPTOR_SET_ALLOCATE_INFO = new VkStructureType("VK_STRUCTURE_TYPE_DESCRIPTOR_SET_ALLOCATE_INFO", 34, 34);
   public static final VkStructureType VK_STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET = new VkStructureType("VK_STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET", 35, 35);
   public static final VkStructureType VK_STRUCTURE_TYPE_COPY_DESCRIPTOR_SET = new VkStructureType("VK_STRUCTURE_TYPE_COPY_DESCRIPTOR_SET", 36, 36);
   public static final VkStructureType VK_STRUCTURE_TYPE_FRAMEBUFFER_CREATE_INFO = new VkStructureType("VK_STRUCTURE_TYPE_FRAMEBUFFER_CREATE_INFO", 37, 37);
   public static final VkStructureType VK_STRUCTURE_TYPE_RENDER_PASS_CREATE_INFO = new VkStructureType("VK_STRUCTURE_TYPE_RENDER_PASS_CREATE_INFO", 38, 38);
   public static final VkStructureType VK_STRUCTURE_TYPE_COMMAND_POOL_CREATE_INFO = new VkStructureType("VK_STRUCTURE_TYPE_COMMAND_POOL_CREATE_INFO", 39, 39);
   public static final VkStructureType VK_STRUCTURE_TYPE_COMMAND_BUFFER_ALLOCATE_INFO = new VkStructureType("VK_STRUCTURE_TYPE_COMMAND_BUFFER_ALLOCATE_INFO", 40, 40);
   public static final VkStructureType VK_STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_INFO = new VkStructureType("VK_STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_INFO", 41, 41);
   public static final VkStructureType VK_STRUCTURE_TYPE_COMMAND_BUFFER_BEGIN_INFO = new VkStructureType("VK_STRUCTURE_TYPE_COMMAND_BUFFER_BEGIN_INFO", 42, 42);
   public static final VkStructureType VK_STRUCTURE_TYPE_RENDER_PASS_BEGIN_INFO = new VkStructureType("VK_STRUCTURE_TYPE_RENDER_PASS_BEGIN_INFO", 43, 43);
   public static final VkStructureType VK_STRUCTURE_TYPE_BUFFER_MEMORY_BARRIER = new VkStructureType("VK_STRUCTURE_TYPE_BUFFER_MEMORY_BARRIER", 44, 44);
   public static final VkStructureType VK_STRUCTURE_TYPE_IMAGE_MEMORY_BARRIER = new VkStructureType("VK_STRUCTURE_TYPE_IMAGE_MEMORY_BARRIER", 45, 45);
   public static final VkStructureType VK_STRUCTURE_TYPE_MEMORY_BARRIER = new VkStructureType("VK_STRUCTURE_TYPE_MEMORY_BARRIER", 46, 46);
   public static final VkStructureType VK_STRUCTURE_TYPE_LOADER_INSTANCE_CREATE_INFO = new VkStructureType("VK_STRUCTURE_TYPE_LOADER_INSTANCE_CREATE_INFO", 47, 47);
   public static final VkStructureType VK_STRUCTURE_TYPE_LOADER_DEVICE_CREATE_INFO = new VkStructureType("VK_STRUCTURE_TYPE_LOADER_DEVICE_CREATE_INFO", 48, 48);
   public static final VkStructureType VK_STRUCTURE_TYPE_SWAPCHAIN_CREATE_INFO_KHR = new VkStructureType("VK_STRUCTURE_TYPE_SWAPCHAIN_CREATE_INFO_KHR", 49, 1000001000);
   public static final VkStructureType VK_STRUCTURE_TYPE_PRESENT_INFO_KHR = new VkStructureType("VK_STRUCTURE_TYPE_PRESENT_INFO_KHR", 50, 1000001001);
   public static final VkStructureType VK_STRUCTURE_TYPE_DISPLAY_MODE_CREATE_INFO_KHR = new VkStructureType("VK_STRUCTURE_TYPE_DISPLAY_MODE_CREATE_INFO_KHR", 51, 1000002000);
   public static final VkStructureType VK_STRUCTURE_TYPE_DISPLAY_SURFACE_CREATE_INFO_KHR = new VkStructureType("VK_STRUCTURE_TYPE_DISPLAY_SURFACE_CREATE_INFO_KHR", 52, 1000002001);
   public static final VkStructureType VK_STRUCTURE_TYPE_DISPLAY_PRESENT_INFO_KHR = new VkStructureType("VK_STRUCTURE_TYPE_DISPLAY_PRESENT_INFO_KHR", 53, 1000003000);
   public static final VkStructureType VK_STRUCTURE_TYPE_XLIB_SURFACE_CREATE_INFO_KHR = new VkStructureType("VK_STRUCTURE_TYPE_XLIB_SURFACE_CREATE_INFO_KHR", 54, 1000004000);
   public static final VkStructureType VK_STRUCTURE_TYPE_XCB_SURFACE_CREATE_INFO_KHR = new VkStructureType("VK_STRUCTURE_TYPE_XCB_SURFACE_CREATE_INFO_KHR", 55, 1000005000);
   public static final VkStructureType VK_STRUCTURE_TYPE_WAYLAND_SURFACE_CREATE_INFO_KHR = new VkStructureType("VK_STRUCTURE_TYPE_WAYLAND_SURFACE_CREATE_INFO_KHR", 56, 1000006000);
   public static final VkStructureType VK_STRUCTURE_TYPE_MIR_SURFACE_CREATE_INFO_KHR = new VkStructureType("VK_STRUCTURE_TYPE_MIR_SURFACE_CREATE_INFO_KHR", 57, 1000007000);
   public static final VkStructureType VK_STRUCTURE_TYPE_ANDROID_SURFACE_CREATE_INFO_KHR = new VkStructureType("VK_STRUCTURE_TYPE_ANDROID_SURFACE_CREATE_INFO_KHR", 58, 1000008000);
   public static final VkStructureType VK_STRUCTURE_TYPE_WIN32_SURFACE_CREATE_INFO_KHR = new VkStructureType("VK_STRUCTURE_TYPE_WIN32_SURFACE_CREATE_INFO_KHR", 59, 1000009000);
   public static final VkStructureType VK_STRUCTURE_TYPE_DEBUG_REPORT_CALLBACK_CREATE_INFO_EXT = new VkStructureType("VK_STRUCTURE_TYPE_DEBUG_REPORT_CALLBACK_CREATE_INFO_EXT", 60, 1000011000);
   public static final VkStructureType VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_STATE_RASTERIZATION_ORDER_AMD = new VkStructureType("VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_STATE_RASTERIZATION_ORDER_AMD", 61, 1000018000);
   public static final VkStructureType VK_STRUCTURE_TYPE_DEBUG_MARKER_OBJECT_NAME_INFO_EXT = new VkStructureType("VK_STRUCTURE_TYPE_DEBUG_MARKER_OBJECT_NAME_INFO_EXT", 62, 1000022000);
   public static final VkStructureType VK_STRUCTURE_TYPE_DEBUG_MARKER_OBJECT_TAG_INFO_EXT = new VkStructureType("VK_STRUCTURE_TYPE_DEBUG_MARKER_OBJECT_TAG_INFO_EXT", 63, 1000022001);
   public static final VkStructureType VK_STRUCTURE_TYPE_DEBUG_MARKER_MARKER_INFO_EXT = new VkStructureType("VK_STRUCTURE_TYPE_DEBUG_MARKER_MARKER_INFO_EXT", 64, 1000022002);
   public static final VkStructureType VK_STRUCTURE_TYPE_DEDICATED_ALLOCATION_IMAGE_CREATE_INFO_NV = new VkStructureType("VK_STRUCTURE_TYPE_DEDICATED_ALLOCATION_IMAGE_CREATE_INFO_NV", 65, 1000026000);
   public static final VkStructureType VK_STRUCTURE_TYPE_DEDICATED_ALLOCATION_BUFFER_CREATE_INFO_NV = new VkStructureType("VK_STRUCTURE_TYPE_DEDICATED_ALLOCATION_BUFFER_CREATE_INFO_NV", 66, 1000026001);
   public static final VkStructureType VK_STRUCTURE_TYPE_DEDICATED_ALLOCATION_MEMORY_ALLOCATE_INFO_NV = new VkStructureType("VK_STRUCTURE_TYPE_DEDICATED_ALLOCATION_MEMORY_ALLOCATE_INFO_NV", 67, 1000026002);
   
   /**
    * Return all values available in this enumeration
    * @return Array of avail. VkAccessFlagBits
    */
    @SuppressWarnings("unchecked")
    public static VkStructureType[] values(){
            return values;
    }

	/**
	 * Get class of this enumeration
	 */
    protected static Class<VkStructureType> myGetClass(){
        return myClass;
    }

    /**
     * Creates a bitwise ORed enumeration
     * @param bits - list of enumerations to bitwise OR 
     * @return an enumeration of ORed bits 
     */
    public static VkStructureType or(VkStructureType...bits){
        int value = bits[0].getValue();        
        for (int i=1; i<bits.length; i++) {
            VkStructureType item = bits[i];
            value |= item.getValue();
        } 
        String name = myGetClass().getSimpleName() + " from bitwise Operation.[" + value +"]";
        VkStructureType ored = new VkStructureType(name, -1, value);        
        return ored;
    }
    
    /**
     * Creates a enumeration of this class, if valid. 
     * If you try to create a invalid enumeration it will raise a exception.
     * @param value - a valid enumeration value or ar ORed value.
     * @return a instance of VkStructureType from value. NULL if it is invalid value.
     */
    public static VkStructureType fromValue(int value){
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
        VkStructureType flag = new VkStructureType(name, -1, value); 
        return flag;
    }
	
	/**
     * Creates/populates a array of VkStructureType from a set of values.
     * @param dst - destination array. Can be null.
     * @param values - int[] with valid values of this enumeration.
     * @return VkStructureType array with matching values
     */
    public static VkStructureType[] fromValues(VkStructureType[] dst, int[] values){
        if(values == null) 
               return null;
        if(dst == null || dst.length != values.length){
            dst = new VkStructureType[values.length];
        }        
        for (int i = 0; i < values.length; i++) {
            int val = values[i];
            dst[i] = VkStructureType.fromValue(val);
        }        
        return dst;
    }
    
    /**
     * Check is a given flagA is bitwise ORed with flagB
     * @param flagA - flag to test
     * @param flagB - flag to test
     * @return true if flagA bit
     */
    public static boolean isORed(VkStructureType flagA, VkStructureType flagB){
        int valA = flagA.getValue();
        int valB = flagB.getValue();
        return (valA & valB) == valB;
    }


    /** private ctor */
    private VkStructureType(String name, int ordinal, int v) {
       super(name, ordinal, v);
       values[ordinal] = this;
    }

 } // end of class VkStructureType
