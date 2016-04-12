/**
 * 
 */
package bor.vulkan;

import bor.vulkan.enumerations.VkDebugReportObjectTypeEXT;
import bor.vulkan.enumerations.VkResult;
import bor.vulkan.structs.VkAllocationCallbacks;
import bor.vulkan.structs.VkDebugReportCallbackCreateInfoEXT;

/**
 * Class to Handle Debug Report in Vulkan
 * @author Alessandro Borges
 *
 */
public class VkDebugReport {
    /** Includes **/
    //@off
    /*JNI
      #define VK_USE_PLATFORM_WIN32_KHR 1     
      
      #define BOR_LOADER 1
      #undef BOR_LOADER
      
      #include <vulkan/vulkan.h>      
      #include <stdio.h>
      #include <stdlib.h>     
      #include <JBufferArray.h>
      #include <WSI.h>  
      
      using namespace std;
     
      */
    
    
    public VkDebugReport() {
    
    }
    
    
    /**
     *  Vulkan procedure ID: 167
     * <h2>Prototype</h2><pre>
     *  VkResult  vkCreateDebugReportCallbackEXT(
     *     VkInstance                                  instance,
     *     const VkDebugReportCallbackCreateInfoEXT*   pCreateInfo,
     *     const VkAllocationCallbacks*                pAllocator,
     *     VkDebugReportCallbackEXT*                   pCallback);
     * </pre>
     * 
     * @param instance - 
     * @param pCreateInfo - 
     * @param pAllocator - 
     * @param pCallback - 
     * 
     * @return VkResult
     */
    public VkResult vkCreateDebugReportCallbackEXT(
                 VkInstance instance,
                  VkDebugReportCallbackCreateInfoEXT  pCreateInfo,
                  VkAllocationCallbacks  pAllocator,
                  VkDebugReportCallbackEXT  pCallback){
         int  _val = vkCreateDebugReportCallbackEXT0(
                         (instance==null ? null : instance.getHandle()) /* ByteBuffer */ ,
                         (pCreateInfo==null ? null : pCreateInfo.getPointerStruct()) /* ByteBuffer */ ,
                         (pAllocator==null ? null : pAllocator.getPointerStruct()) /* ByteBuffer */ ,
                         (pCallback==null ? null : pCallback.getHandle()) /* ByteBuffer */  );
          return VkResult.fromValue(_val);
    } 

    /**
     *  Native interface for Vulkan method #167
     *  vkCreateDebugReportCallbackEXT 
     * 
     * @param instance - 
     * @param pCreateInfo - 
     * @param pAllocator - 
     * @param pCallback - 
     * 
     * @return VkResult as int  
     */
     private static native int  vkCreateDebugReportCallbackEXT0(
                 java.nio.ByteBuffer   instance,
                 java.nio.ByteBuffer   pCreateInfo,
                 java.nio.ByteBuffer   pAllocator,
                 java.nio.ByteBuffer   pCallback);/* 
      #ifdef BOR_LOADER            
         VkInstance* ptr_instance = (VkInstance*) instance;
         VkResult res = vkCreateDebugReportCallbackEXT(
                         (VkInstance) (*ptr_instance),
                         (const VkDebugReportCallbackCreateInfoEXT*) pCreateInfo,
                         (const VkAllocationCallbacks*) pAllocator,
                         (VkDebugReportCallbackEXT*) pCallback);
          return (jint) res;
     #else
          return (jint) VkResult::VK_ERROR_EXTENSION_NOT_PRESENT;
     #endif 
          
    */ 


         /////////////////////////////////////

    /**
     *  Vulkan procedure ID: 168
     * <h2>Prototype</h2><pre>
     *  void  vkDestroyDebugReportCallbackEXT(
     *     VkInstance                                  instance,
     *     VkDebugReportCallbackEXT                    callback,
     *     const VkAllocationCallbacks*                pAllocator);
     * </pre>
     * 
     * @param instance - 
     * @param callback - 
     * @param pAllocator - 
     */
    public void vkDestroyDebugReportCallbackEXT(
                 VkInstance instance,
                 VkDebugReportCallbackEXT callback,
                  VkAllocationCallbacks  pAllocator){
         vkDestroyDebugReportCallbackEXT0(
                 (instance==null ? null : instance.getHandle()) /* ByteBuffer */ ,
                 (callback==null ? null : callback.getHandle()) /* ByteBuffer */ ,
                 (pAllocator==null ? null : pAllocator.getPointerStruct()) /* ByteBuffer */  );

    } 

    /**
     *  Native interface for Vulkan method #168
     *  vkDestroyDebugReportCallbackEXT 
     * 
     * @param instance - 
     * @param callback - 
     * @param pAllocator - 
     */
     private static native void vkDestroyDebugReportCallbackEXT0(
                 java.nio.ByteBuffer   instance,
                 java.nio.ByteBuffer   callback,
                 java.nio.ByteBuffer   pAllocator);/* 
    #ifdef BOR_LOADER              
         VkInstance* ptr_instance = (VkInstance*) instance;
         VkDebugReportCallbackEXT* ptr_callback = (VkDebugReportCallbackEXT*) callback;
         vkDestroyDebugReportCallbackEXT(
                         (VkInstance) (*ptr_instance),
                         (VkDebugReportCallbackEXT) (*ptr_callback),
                         (const VkAllocationCallbacks*) pAllocator);
     #else
         // return (jint) VkResult::VK_ERROR_EXTENSION_NOT_PRESENT;
     #endif  
    */ 


         /////////////////////////////////////

    /**
     *  Vulkan procedure ID: 169
     * <h2>Prototype</h2><pre>
     *  void  vkDebugReportMessageEXT(
     *     VkInstance                                  instance,
     *     VkDebugReportFlagsEXT                       flags,
     *     VkDebugReportObjectTypeEXT                  objectType,
     *     uint64_t                                    object,
     *     size_t                                      location,
     *     int32_t                                     messageCode,
     *     const char*                                 pLayerPrefix,
     *     const char*                                 pMessage);
     * </pre>
     * 
     * @param instance - 
     * @param flags - 
     * @param objectType - 
     * @param object - 
     * @param location - 
     * @param messageCode - 
     * @param pLayerPrefix - 
     * @param pMessage - 
     */
    public void vkDebugReportMessageEXT(
                 VkInstance instance,
                 int flags,
                 VkDebugReportObjectTypeEXT objectType,
                 long object,
                 long location,
                 int messageCode,
                 String pLayerPrefix,
                 String pMessage){
         vkDebugReportMessageEXT0(
                 (instance==null ? null : instance.getHandle()) /* ByteBuffer */ ,
                 flags ,
                 objectType.getValue() /* enum */,
                 object ,
                 location ,
                 messageCode ,
                 pLayerPrefix ,
                 pMessage  );

    } 

    /**
     *  Native interface for Vulkan method #169
     *  vkDebugReportMessageEXT 
     * 
     * @param instance - 
     * @param flags - 
     * @param objectType - 
     * @param object - 
     * @param location - 
     * @param messageCode - 
     * @param pLayerPrefix - 
     * @param pMessage - 
     */
     private static native void vkDebugReportMessageEXT0(
                 java.nio.ByteBuffer   instance,
                 int  flags,
                 int   objectType,
                 long  object,
                 long  location,
                 int  messageCode,
                 String  pLayerPrefix,
                 String  pMessage);/* 
                 
      #ifdef BOR_LOADER             
         VkInstance* ptr_instance = (VkInstance*) instance;
         vkDebugReportMessageEXT(
                         (VkInstance) (*ptr_instance),
                         (VkDebugReportFlagsEXT) flags,
                         (VkDebugReportObjectTypeEXT) objectType,
                         (uint64_t) object,
                         (size_t) location,
                         (int32_t) messageCode,
                         (const char*) pLayerPrefix,
                         (const char*) pMessage);
     #else
        //  return (jint) VkResult::VK_ERROR_EXTENSION_NOT_PRESENT;
     #endif   
    */ 


    

}
