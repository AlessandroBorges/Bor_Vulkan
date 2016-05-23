package bor.vulkan;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import bor.util.Utils;
import bor.vulkan.enumerations.VkFilter;
import bor.vulkan.enumerations.VkFormat;
import bor.vulkan.enumerations.VkImageCreateFlags;
import bor.vulkan.enumerations.VkImageLayout;
import bor.vulkan.enumerations.VkImageTiling;
import bor.vulkan.enumerations.VkImageType;
import bor.vulkan.enumerations.VkImageUsageFlags;
import bor.vulkan.enumerations.VkIndexType;
import bor.vulkan.enumerations.VkPipelineBindPoint;
import bor.vulkan.enumerations.VkPipelineStageFlagBits;
import bor.vulkan.enumerations.VkResult;
import bor.vulkan.enumerations.VkSampleCountFlagBits;
import bor.vulkan.enumerations.VkSubpassContents;
import bor.vulkan.khr.VkSurfaceKHR;
import bor.vulkan.khr.structs.VkAndroidSurfaceCreateInfoKHR;
import bor.vulkan.khr.structs.VkDisplaySurfaceCreateInfoKHR;
import bor.vulkan.khr.structs.VkMirSurfaceCreateInfoKHR;
import bor.vulkan.khr.structs.VkWaylandSurfaceCreateInfoKHR;
import bor.vulkan.khr.structs.VkWin32SurfaceCreateInfoKHR;
import bor.vulkan.khr.structs.VkXcbSurfaceCreateInfoKHR;
import bor.vulkan.khr.structs.VkXlibSurfaceCreateInfoKHR;
import bor.vulkan.structs.VkAllocationCallbacks;
import bor.vulkan.structs.VkBindSparseInfo;
import bor.vulkan.structs.VkBufferCopy;
import bor.vulkan.structs.VkBufferCreateInfo;
import bor.vulkan.structs.VkBufferImageCopy;
import bor.vulkan.structs.VkBufferMemoryBarrier;
import bor.vulkan.structs.VkBufferViewCreateInfo;
import bor.vulkan.structs.VkClearAttachment;
import bor.vulkan.structs.VkClearColorValue;
import bor.vulkan.structs.VkClearDepthStencilValue;
import bor.vulkan.structs.VkClearRect;
import bor.vulkan.structs.VkCommandBufferAllocateInfo;
import bor.vulkan.structs.VkCommandBufferBeginInfo;
import bor.vulkan.structs.VkCommandPoolCreateInfo;
import bor.vulkan.structs.VkComputePipelineCreateInfo;
import bor.vulkan.structs.VkCopyDescriptorSet;
import bor.vulkan.structs.VkDescriptorPoolCreateInfo;
import bor.vulkan.structs.VkDescriptorSetAllocateInfo;
import bor.vulkan.structs.VkDescriptorSetLayoutCreateInfo;
import bor.vulkan.structs.VkDeviceCreateInfo;
import bor.vulkan.structs.VkEventCreateInfo;
import bor.vulkan.structs.VkExtensionProperties;
import bor.vulkan.structs.VkExtent2D;
import bor.vulkan.structs.VkFenceCreateInfo;
import bor.vulkan.structs.VkFormatProperties;
import bor.vulkan.structs.VkFramebufferCreateInfo;
import bor.vulkan.structs.VkGraphicsPipelineCreateInfo;
import bor.vulkan.structs.VkImageBlit;
import bor.vulkan.structs.VkImageCopy;
import bor.vulkan.structs.VkImageCreateInfo;
import bor.vulkan.structs.VkImageFormatProperties;
import bor.vulkan.structs.VkImageMemoryBarrier;
import bor.vulkan.structs.VkImageResolve;
import bor.vulkan.structs.VkImageSubresource;
import bor.vulkan.structs.VkImageSubresourceRange;
import bor.vulkan.structs.VkImageViewCreateInfo;
import bor.vulkan.structs.VkInstanceCreateInfo;
import bor.vulkan.structs.VkLayerProperties;
import bor.vulkan.structs.VkMappedMemoryRange;
import bor.vulkan.structs.VkMemoryAllocateInfo;
import bor.vulkan.structs.VkMemoryBarrier;
import bor.vulkan.structs.VkMemoryRequirements;
import bor.vulkan.structs.VkPhysicalDeviceFeatures;
import bor.vulkan.structs.VkPhysicalDeviceMemoryProperties;
import bor.vulkan.structs.VkPhysicalDeviceProperties;
import bor.vulkan.structs.VkPipelineCacheCreateInfo;
import bor.vulkan.structs.VkPipelineLayoutCreateInfo;
import bor.vulkan.structs.VkQueryPoolCreateInfo;
import bor.vulkan.structs.VkQueueFamilyProperties;
import bor.vulkan.structs.VkRect2D;
import bor.vulkan.structs.VkRenderPassBeginInfo;
import bor.vulkan.structs.VkRenderPassCreateInfo;
import bor.vulkan.structs.VkSamplerCreateInfo;
import bor.vulkan.structs.VkSemaphoreCreateInfo;
import bor.vulkan.structs.VkShaderModuleCreateInfo;
import bor.vulkan.structs.VkSparseImageFormatProperties;
import bor.vulkan.structs.VkSparseImageMemoryRequirements;
import bor.vulkan.structs.VkStruct;
import bor.vulkan.structs.VkSubmitInfo;
import bor.vulkan.structs.VkSubresourceLayout;
import bor.vulkan.structs.VkViewport;
import bor.vulkan.structs.VkWriteDescriptorSet;

import static bor.util.Utils.splitBuffer;

public class Vk10 extends Vulkan {

    /** Includes **/
    //@off
    /*JNI
     
      
 #if defined(_WIN32)
        #define VK_USE_PLATFORM_WIN32_KHR 1
        #define WIN32_LEAN_AND_MEAN 1
        #define VC_EXTRALEAN 1
 #elif defined(__ANDROID__) 
       #define VK_USE_PLATFORM_ANDROID_KHR 1
 #else      
       #define VK_USE_PLATFORM_XCB_KHR 1
       #define VK_USE_PLATFORM_XLIB_KHR 1
 #endif   
  
      #define VULKAN_WRAPPER_ENABLE_ALL_EXTENSIONS_DEFAULT 1
      #include "BorVulkan.hpp"
      #include "vulkan_wrapper.h" 
           
      #include <stdio.h>
      #include <stdlib.h>
      #include "JBufferArray.h"  
      
      using namespace std;
      
      static  jclass byteBufferClass;      
      static  bool isWin32;
      static  bool isAndroid;
      static  bool isMIR;
      static  bool isWayland;
      static  bool isXCB;
      static  bool isXLIB;
      static  bool isVulkanAvailable;
  
    static void init(){
         // platforms support 
        isWin32 = false;
        isAndroid = false;
        isMIR = false;
        isWayland = false;
        isXCB = false;
        isXLIB = false;
   
   #ifdef VK_USE_PLATFORM_ANDROID_KHR
         isAndroid = true;
   #endif
   
    #ifdef VK_USE_PLATFORM_WIN32_KHR    
        isWin32 = true;
   #endif 

   #ifdef VK_USE_PLATFORM_MIR_KHR        
        isMIR = true;
   #endif
   
   #ifdef VK_USE_PLATFORM_WAYLAND_KHR       
       isWayland = true;
   #endif
        
   #ifdef VK_USE_PLATFORM_XCB_KHR        
        isXCB = true;
   #endif   
        
   #ifdef VK_USE_PLATFORM_XLIB_KHR          
    isXLIB = true;
   #endif    
      
 }//
 // Vk10 header end
  */
    /**
     * <pre>
     * Default size in bytes of Dispatchable VkHandler.
     * It can be 4bytes in 32bits OS or 8bytes in 64bits OS. 
     * Dispatchable VkHandlers are the following: 
     *   VK_DEFINE_HANDLE(VkInstance)
     *   VK_DEFINE_HANDLE(VkPhysicalDevice)
     *   VK_DEFINE_HANDLE(VkDevice)
     *   VK_DEFINE_HANDLE(VkQueue)
     *   VK_DEFINE_HANDLE(VkCommandBuffer)
     * </pre>
     */
    private static int SIZE_OF_HANDLE = 8;
    /**
     * Default size in bytes of Non Dispatchable VkHandler.
     * Expected to be always 8 bytes in both 32/64bits environments.
     */
    private static int SIZE_OF_NON__DISPATCHABLE_HANDLE = 8;
    
    /**
     * Vulkan Supported Plaforms
     * TODO - move to Vulkan.Java
     * @author Alessandro Borges
     *
     */
    public enum PLATFORMS{
        WIN32,
        ANDROID,
        XLIB,
        XCB,
        WAYLAND,
        MIR
    }
    
    static{
        init();        
        SIZE_OF_HANDLE = sizeOfDispatchableHandle();
        SIZE_OF_NON__DISPATCHABLE_HANDLE = sizeOfNonDispatchableHandle();
    }
    
    /**
     * initilize native codes
     */
    private static native void init();/*
       jclass bufferClassLocal = env->FindClass("java/nio/ByteBuffer");
       byteBufferClass = reinterpret_cast<jclass>(env->NewGlobalRef(bufferClassLocal));
       
       init();
       isVulkanAvailable =  (InitVulkan() != 0);
       
    */
    
    /**
     * <pre>
     * Get Size of Dispatchable VkHandle;
     *   VK_DEFINE_HANDLE(VkInstance)
     *   VK_DEFINE_HANDLE(VkPhysicalDevice)
     *   VK_DEFINE_HANDLE(VkDevice)
     *   VK_DEFINE_HANDLE(VkQueue)
     *   VK_DEFINE_HANDLE(VkCommandBuffer)
     *  
     * </pre>
     * @return size in bytes of native pointer
     */
    private static native int sizeOfDispatchableHandle();/*
        return(jint) sizeof(VkInstance);
    */
    
    /**
     * Get Size of native pointer (void*);
     * @return size in bytes of native pointer
     */
    private static native int sizeOfNonDispatchableHandle();/*
        return(jint) sizeof(VkSemaphore);
    */
    
    public static native boolean  isVulkanAvailable();/*
       return (jboolean) isVulkanAvailable;
    
    */
    
   
    
    /**
     * Wrap a buffer as VkHandle
     * 
     * @param buff - bytebuffer array
     * @return null or VkHandle instance using buffers[0]
     */
    private static VkHandle wrapClean(ByteBuffer[] buff) {
        VkHandle vk =  buff[0] == null ? null : new VkHandle(buff[0]);
        buff[0] = null;
        return vk;
    }
    
    /**
     * clean an array
     * @param array
     */
    private static void clean(Object[] array){
        Arrays.fill(array, null);
    }

    /**
     * Wrap a ByteBuffer as Handler
     * 
     * @param buffer - native buffer to wrap
     * @return VkHandle instance
     */
    private static VkHandle wrap(ByteBuffer buffer) {
        return buffer == null ? null : new VkHandle(buffer);
    }
    
    /**
     * Store a Buffer in VkHandle and put it in a VkHandle array
     * @param dstArray - VkHandle Array
     * @param buff - ByteBuffer to wrap as VkHandler
     */
    private static final void wrapVkHandle(VkHandleInterface[] dstArray, ByteBuffer buff){
        if(dstArray[0] == null){         
            dstArray [0] = new VkHandle(buff);
         }  else{
             ((VkHandle)dstArray[0]).setPointer(buff);
         }
    }
    
    /**
     * Create a Direct ByteBuffer as container for VkStructs.
     * @param count - user requested amount of VkStructs
     * @param array - array to hold returning structs
     * @param sizeOf - size of this VkStruct
     * 
     * @return a direct ByteBuffer large enough to hold all structures 
     */
    private static ByteBuffer createBigBuffer(int[] count, VkStruct<?>[] array, int sizeOf){
        if(array ==null || count==null || count[0] ==0){
          return null;
        }
        int size = Math.min(count[0], array.length);
        ByteBuffer bigBuffer = ByteBuffer.allocateDirect(size * sizeOf);
        bigBuffer.order(ByteOrder.nativeOrder());
        return bigBuffer;
     }
    
    /**
     * Create a Direct ByteBuffer as container for VkHandlers.
     * @param count - user requested amount of VkHandles, at count[0]. 
     * @param array - array to hold returning handlers
     * @param isDispatchable - if VkHandle is a VkInstance, VkPhysicalDevice,
     * VkDevice, VkQueue or VkCommandBuffer
     * 
     * @return  a direct ByteBuffer large enough to hold all Handles 
     */
    private static ByteBuffer createBigBuffer(int[] count, VkHandle[] array,  boolean isDispatchable){
        if(array ==null || count==null || count[0] ==0){
          return null;
        }
        int size = Math.min(count[0], array.length) ;
        size *= isDispatchable ? SIZE_OF_HANDLE : SIZE_OF_NON__DISPATCHABLE_HANDLE;
        ByteBuffer bigBuffer = ByteBuffer.allocateDirect(size * VkHandle.SIZEOF_PTR);
        bigBuffer.order(ByteOrder.nativeOrder());
        return bigBuffer;
     }
    
    /**
     * Analize a set of parameters and create a ByteBuffer array for VkHandle
     * @param pHandles - array of Handlers to be filled with VkHandle instances
     * @param count - array with count
     * @return a array of ByteBuffer to filled in native side
     */
    private static ByteBuffer[] createBufferArray2Handles(Object[] pHandles, int[] count){
        if(pHandles==null || count==null || count[0] == 0){
            return null;
        }
        int size = Math.min(pHandles.length, count[0]) ;
        clean(pHandles); 
        return new ByteBuffer[size];
    }
     
    
    
   /**
    * <h2>Prototype</h2>
    * 
    * <pre>
    * VKAPI_ATTR VkResult VKAPI_CALL vkCreateInstance(
    *     const VkInstanceCreateInfo*                 pCreateInfo,
    *     const VkAllocationCallbacks*                pAllocator,
    *     VkInstance*                                 pInstance);
    * </pre>
    * 
    * @param pCreateInfo -  Pointer to instance creation structure.
    * @param pAllocator - 
    * @param pInstance - Pointer to variable which will receive the new instance handle.
    * 
    */
   public static VkResult vkCreateInstance(VkInstanceCreateInfo pCreateInfo,
                                           VkAllocationCallbacks pAllocator,
                                           VkInstance[] pInstance) {
       int[] res = {0};
       ByteBuffer buff = vkCreateInstance1(
             pCreateInfo.getPointer(), 
             (pAllocator ==null? null :pAllocator.getPointer()),
             res);
    
       if(res[0]>=0){
           wrapVkHandle(pInstance, buff);
       }       
     return VkResult.fromValue(res[0]);
   }
    
  
   /**
    * 
    * @param pCreateInfo
    * @param pAllocator
    * @param result
    * @return
    */
   private static native ByteBuffer vkCreateInstance1(
                                               Buffer  pCreateInfo,
                                               Buffer  pAllocator,
                                               int[] result);/*
                                               
      VkInstance* pInstance = new VkInstance;                                
      VkResult res =  vkCreateInstance(
                       (const VkInstanceCreateInfo*)                 pCreateInfo,
                       (const VkAllocationCallbacks*)                pAllocator,
                       (VkInstance*)                                 pInstance);
      result[0] = (jint) res;
  
      jobject buff = NULL; 
      if(res >= 0){
        VkInstance instance = (*pInstance);
        buff = (jobject)(env->NewDirectByteBuffer((void*)(instance), sizeof(VkInstance)));       
      }    
      free(pInstance);
      return buff; 
      */
   
       /////////////////////////////////////

       /**
        * <h2>Prototype</h2><pre>
        * VKAPI_ATTR void VKAPI_CALL vkDestroyInstance(
        *     VkInstance                                  instance,
        *     const VkAllocationCallbacks*                pAllocator);
        * </pre>
        *  @param instance - Vulkan instance to release. 
        *  @param pAllocator - callBacks
        */
  public static void vkDestroyInstance(VkInstance  instance,
                                VkAllocationCallbacks  pAllocator){
      
      vkDestroyInstance0(instance.getPointer(), 
                         pAllocator==null ? null : pAllocator.getPointer());      
  }

  /**
   * Native method
   * @param instance
   * @param pAllocator
   */
   private static native void vkDestroyInstance0(ByteBuffer  instance,
                                                 ByteBuffer  pAllocator);/*                                                           
       vkDestroyInstance( (VkInstance) (instance),
                          (const VkAllocationCallbacks*)   pAllocator);        
       */

    

   /**
    * <h2>Prototype</h2>
    * 
    * <pre>
    * VKAPI_ATTR VkResult VKAPI_CALL vkEnumeratePhysicalDevices(
    *     VkInstance                                  instance,
    *     uint32_t*                                   pPhysicalDeviceCount,
    *     VkPhysicalDevice*                           pPhysicalDevices);
    * </pre>
    * 
    * @param instance -  A handle to the instance to be used to enumerate devices.
    * @param pPhysicalDeviceCount - 
    *  A pointer to a variable containing the maximum number of devices to enumerate.
    * @param pPhysicalDevices - 
    * A pointer to an array that will be filled with handles to the enumerated devices.
    * 
    * @return VkResult
    * 
    */
   public static VkResult vkEnumeratePhysicalDevices(VkInstance instance,
                                                     int[] pPhysicalDeviceCount,
                                                     VkPhysicalDevice[] pPhysicalDevices){      
       ByteBuffer[]  array = createBufferArray2Handles(pPhysicalDevices, pPhysicalDeviceCount);
       int size =  array == null ? 0 : array.length;       
       int res = vkEnumeratePhysicalDevices0(instance.getPointer(),
                                              pPhysicalDeviceCount,
                                              array,
                                              size);
       if(pPhysicalDevices==null){
           return  VkResult.fromValue(res);
       }
       Utils.populateHandlers(pPhysicalDevices, array, pPhysicalDeviceCount);       
       return VkResult.fromValue(res);
   }// method
   
   

   /**
    * 
    * @param instance
    * @param pPhysicalDeviceCount
    * @param pPhysicalDevicesRet
    * @param maxSize
    * @return
    */
   private static native int vkEnumeratePhysicalDevices0(
                                       ByteBuffer instance,
                                       int[]      pPhysicalDeviceCount,
                                       Buffer[]   pPhysicalDevicesRet,
                                       int        maxSize);/*      
       VkPhysicalDevice* array = NULL;
       uint32_t count=0;        
       if(maxSize > 0){
          array = new VkPhysicalDevice[maxSize]; 
          count = (uint32_t)maxSize;        
        }     
             
       VkResult res = vkEnumeratePhysicalDevices(
                                  (VkInstance) (instance),
                                  (uint32_t*)  &count,
                                  (VkPhysicalDevice*) array);
       pPhysicalDeviceCount[0] = count;       
       
       if(res >= 0 && array){
           for(int i=0; i < maxSize && i < (int)count ; i++){
               VkPhysicalDevice step = array[i];
               if(step){
                  jobject buff =  env->NewDirectByteBuffer((void*) (step), 
                                                           (jlong) sizeof(VkPhysicalDevice));              
                  if(buff)
                      env->SetObjectArrayElement(pPhysicalDevicesRet, i, buff);
              }
           }//for            
         }//if
         
         if(array)
              delete[]  array; 
         
         return (jint) res;
       */

     
   /**
    * 
    * @param instance
    * @param physicalDevicesList
    * @return VKResult
    */
   public static List<VkPhysicalDevice> vkEnumeratePhysicalDevices(VkInstance instance, VkResult[] res){  
       List<VkPhysicalDevice> physicalDevicesList = new ArrayList<VkPhysicalDevice>(2);
       if(res==null){
           res = new VkResult[1];
       }
       if(instance== null){           
           res[0] = VkResult.VK_ERROR_INITIALIZATION_FAILED;
           return physicalDevicesList;
       }                    
       
       // get Count
       int[] count = {0};
       int res0 = vkEnumeratePhysicalDevices0(instance.getPointer(),
                                              count,
                                              null,
                                              0);        
       int size = count[0];
       if(size <= 0 || res0 < 0){
           res[0] = VkResult.fromValue(res0);
           return physicalDevicesList;
       }
       
       ByteBuffer[]  pPhysicalDevicesArray = new ByteBuffer[size];        
       res0 = vkEnumeratePhysicalDevices0(instance.getPointer(),
                                         count,
                                         pPhysicalDevicesArray,
                                         size);
       res[0] = VkResult.fromValue(res0);
       for (int i = 0; i < pPhysicalDevicesArray.length; i++) {
               ByteBuffer handle = pPhysicalDevicesArray[i];
               if (handle != null) {
                   physicalDevicesList.add(new VkHandle(handle));
               }
      } 
      clean(pPhysicalDevicesArray);
      return physicalDevicesList;
   }// method

   
       /**
        * <h2>Prototype</h2><pre>
        * VKAPI_ATTR void VKAPI_CALL vkGetPhysicalDeviceFeatures(
        *     VkPhysicalDevice                            physicalDevice,
        *     VkPhysicalDeviceFeatures*                   pFeatures);
        * </pre>
        */
  public static  void vkGetPhysicalDeviceFeatures(VkPhysicalDevice  physicalDevice,
                                                  VkPhysicalDeviceFeatures  pFeatures){
      vkGetPhysicalDeviceFeatures0( physicalDevice.getPointer(),
                                    pFeatures.getPointer());      
  }

   /**
    * Native method to get struct
    * @param pphysicalDevice
    * @param pFeatures
    */
   private static native void vkGetPhysicalDeviceFeatures0(ByteBuffer  pphysicalDevice,
                                                           ByteBuffer  pFeatures);/*    
    vkGetPhysicalDeviceFeatures(
               (VkPhysicalDevice)  (pphysicalDevice),
               (VkPhysicalDeviceFeatures*)  pFeatures);
       */

   
       /**
        * <h2>Prototype</h2><pre>
        * VKAPI_ATTR void VKAPI_CALL vkGetPhysicalDeviceFormatProperties(
        *     VkPhysicalDevice                            physicalDevice,
        *     VkFormat                                    format,
        *     VkFormatProperties*                         pFormatProperties);
        * </pre>
        * @param  physicalDevice - A handle to the physical device to query. 
        * @param format -  The format whose properties to query. 
        * @param pFormatProperties- A pointer to the structure to
        *  receive the result of the query. 
        * 
        */
   public static void vkGetPhysicalDeviceFormatProperties(VkPhysicalDevice physicalDevice,
                                                   VkFormat format,
                                                   VkFormatProperties pFormatProperties) {
       vkGetPhysicalDeviceFormatProperties0( physicalDevice.getPointer(),
                                             format.getValue(),
                                             pFormatProperties.getPointer());
      }

   private static native void vkGetPhysicalDeviceFormatProperties0(
               Buffer  physicalDevice,
               int  format,
               Buffer  pFormatProperties);/*           
     vkGetPhysicalDeviceFormatProperties(
              (VkPhysicalDevice)  physicalDevice,
              (VkFormat)  format,
              (VkFormatProperties*)   pFormatProperties);
    */

   

       /**
        * <h2>Prototype</h2><pre>
        * VKAPI_ATTR VkResult VKAPI_CALL vkGetPhysicalDeviceImageFormatProperties(
        *     VkPhysicalDevice                            physicalDevice,
        *     VkFormat                                    format,
        *     VkImageType                                 type,
        *     VkImageTiling                               tiling,
        *     VkImageUsageFlags                           usage,
        *     VkImageCreateFlags                          flags,
        *     VkImageFormatProperties*                    pImageFormatProperties);
        * </pre>
        */
  public static  VkResult vkGetPhysicalDeviceImageFormatProperties(
               VkPhysicalDevice  physicalDevice,
               VkFormat  format,
               VkImageType  type,
               VkImageTiling  tiling,
               VkImageUsageFlags  usage,
               VkImageCreateFlags  flags,
               VkImageFormatProperties  pImageFormatProperties){
      
    int res =  vkGetPhysicalDeviceImageFormatProperties0(
             /*VkPhysicalDevice*/  physicalDevice.getPointer(),
             /* VkFormat*/     format.getValue(),
             /* VkImageType*/  type.getValue(),
             /* VkImageTiling*/  tiling.getValue(),
             /* VkImageUsageFlags*/  usage.getValue(),
             /* VkImageCreateFlags*/  flags.getValue(),
             /* VkImageFormatProperties*/  pImageFormatProperties.getPointer()
              );    
    return VkResult.fromValue(res);       
  }
  
  
   /**
    * Native call
    * 
    * @param physicalDevice
    * @param format
    * @param type
    * @param tiling
    * @param usage
    * @param flags
    * @param pImageFormatProperties
    * @return VkResult
    */
   private static native int vkGetPhysicalDeviceImageFormatProperties0(
               Buffer  physicalDevice,
               int  format,
               int  type,
               int  tiling,
               int  usage,
               int  flags,
               Buffer  pImageFormatProperties);/*
  
         VkResult res = 
         vkGetPhysicalDeviceImageFormatProperties(
               (VkPhysicalDevice) physicalDevice,
               (VkFormat)    format,
               (VkImageType) type,
               (VkImageTiling) tiling,
               (VkImageUsageFlags)  usage,
               (VkImageCreateFlags)  flags,
               (VkImageFormatProperties*) pImageFormatProperties);               
         return (jint) res; 
       */

       /**
        * <h2>Prototype</h2><pre>
        * VKAPI_ATTR void VKAPI_CALL vkGetPhysicalDeviceProperties(
        *     VkPhysicalDevice                            physicalDevice,
        *     VkPhysicalDeviceProperties*                 pProperties);
        * </pre>
        */
  public static  void vkGetPhysicalDeviceProperties(
               VkPhysicalDevice  physicalDevice,
               VkPhysicalDeviceProperties  pProperties){      
      vkGetPhysicalDeviceProperties0(
              physicalDevice.getPointer(),
              pProperties.getPointer()
              );      
  }

  /**
   * 
   * @param physicalDevice
   * @param pProperties
   */
   private static native void vkGetPhysicalDeviceProperties0(
               Buffer  physicalDevice,
               Buffer  pProperties);/*     
       vkGetPhysicalDeviceProperties(
            (VkPhysicalDevice)   (physicalDevice),
            (VkPhysicalDeviceProperties*)  pProperties);               
      */

    /**
     * <h2>Prototype</h2>
     * 
     * <pre>
     * VKAPI_ATTR void VKAPI_CALL vkGetPhysicalDeviceQueueFamilyProperties(
     *     VkPhysicalDevice                            physicalDevice,
     *     uint32_t*                                   pQueueFamilyPropertyCount,
     *     VkQueueFamilyProperties*                    pQueueFamilyProperties);
     * </pre>
     * 
     * 
     * @param physicalDevice - Physical device to query.
     * @param pQueueFamilyPropertyCount - Count indicating number of VkQueueFamilyProperties pointed to by
     * pQueueFamilyProperties.
     * @param pQueueFamilyProperties - Pointer to an array of VkQueueFamilyProperties structures receiving the information
     * about each particular queue family.
     * 
     * 
     * 
     */
   public static  void 
   vkGetPhysicalDeviceQueueFamilyProperties( VkPhysicalDevice  physicalDevice,
                                             int[]  pQueueFamilyPropertyCount,
                                             VkQueueFamilyProperties[] pQueueFamilyProperties){
       if(pQueueFamilyPropertyCount==null){
           pQueueFamilyPropertyCount = new int[1];  
       }         
       ByteBuffer bigBuffer = createBigBuffer(pQueueFamilyPropertyCount, 
                                              pQueueFamilyProperties, 
                                              VkQueueFamilyProperties.sizeOf());
      
       vkGetPhysicalDeviceQueueFamilyProperties1( physicalDevice.getPointer(),
                                                  pQueueFamilyPropertyCount,
                                                  bigBuffer);
       Utils.populate(pQueueFamilyProperties, bigBuffer,pQueueFamilyPropertyCount, VkQueueFamilyProperties.TAG_ID);       
   }
   
   private static native void vkGetPhysicalDeviceQueueFamilyProperties1(ByteBuffer pointer,
                                                                        int[] pQueueFamilyPropertyCount,
                                                                        ByteBuffer _array ); /*
       VkQueueFamilyProperties* array = (VkQueueFamilyProperties*) _array;
       uint32_t count=0;
       vkGetPhysicalDeviceQueueFamilyProperties(
                                  (VkPhysicalDevice) (pointer),
                                  (uint32_t*)  &count,
                                  (VkQueueFamilyProperties*) array);
       pQueueFamilyPropertyCount[0] = count; 
   */


    /**
     * <h2>Prototype</h2>
     * 
     * <pre>
     * VKAPI_ATTR void VKAPI_CALL vkGetPhysicalDeviceMemoryProperties(
     *     VkPhysicalDevice                            physicalDevice,
     *     VkPhysicalDeviceMemoryProperties*           pMemoryProperties);
     * </pre>
     */
  public static void vkGetPhysicalDeviceMemoryProperties(
               VkPhysicalDevice  physicalDevice,
               VkPhysicalDeviceMemoryProperties  pMemoryProperties){      
      vkGetPhysicalDeviceMemoryProperties0(physicalDevice.getPointer(),
                                            pMemoryProperties.getPointer());
  }

  /**
   * 
   * @param physicalDevice
   * @param pMemoryProperties
   */
   private static native void vkGetPhysicalDeviceMemoryProperties0(
               Buffer  physicalDevice,
               Buffer  pMemoryProperties);/*
         vkGetPhysicalDeviceMemoryProperties(
             (VkPhysicalDevice)  physicalDevice,
             (VkPhysicalDeviceMemoryProperties*)  pMemoryProperties);     
    */

  
       /**
        * <h2>Prototype</h2><pre>
        * VKAPI_ATTR PFN_vkVoidFunction VKAPI_CALL vkGetInstanceProcAddr(
        *     VkInstance                                  instance,
        *     const char*                                 pName);
        * </pre>
        */
  public static PFNvkVoidFunction vkGetInstanceProcAddr(
               VkInstance  instance,
               String  pName){
      ByteBuffer pFunc = vkGetInstanceProcAddr0(instance.getPointer(),pName);
      PFNvkVoidFunction func = new PFNvkVoidFunction(pFunc);
      return func;       
  }

   private static native ByteBuffer vkGetInstanceProcAddr0(
               Buffer  instance,
               String  pName);/*               
               PFN_vkVoidFunction func;               
               func  = vkGetInstanceProcAddr(
                            (VkInstance)   instance,
                            (const char*)     pName);                            
              jobject pFunc = env->NewDirectByteBuffer((void*) func, 
                                                      (jlong) sizeof(PFN_vkVoidFunction));                                                       
              return pFunc;                                                                               
       */

       /////////////////////////////////////

       /**
        * <h2>Prototype</h2><pre>
        * VKAPI_ATTR PFN_vkVoidFunction VKAPI_CALL vkGetDeviceProcAddr(
        *     VkDevice                                    device,
        *     const char*                                 pName);
        * </pre>
        */
  public static PFNvkVoidFunction vkGetDeviceProcAddr(
               VkDevice  device,
               String  pName){      
     ByteBuffer nativeHandle =  vkGetDeviceProcAddr0(device.getPointer(), pName);     
     PFNvkVoidFunction pfn = new PFNvkVoidFunction(nativeHandle);
     return pfn;      
  }

   private static native ByteBuffer vkGetDeviceProcAddr0(
               Buffer  device,
               String  pName);/*             
       PFN_vkVoidFunction func =  vkGetDeviceProcAddr(
                                     (VkDevice) device,
                                     (const char*) pName);                               
       jobject pFunc = env->NewDirectByteBuffer((void*) func, 
                                                (jlong) sizeof(PFN_vkVoidFunction));                                                       
        return pFunc;
      */

  
       /**
        * <h2>Prototype</h2><pre>
        * VKAPI_ATTR VkResult VKAPI_CALL vkCreateDevice(
        *     VkPhysicalDevice                            physicalDevice,
        *     const VkDeviceCreateInfo*                   pCreateInfo,
        *     const VkAllocationCallbacks*                pAllocator,
        *     VkDevice*                                   pDevice);
        * </pre>
        */
  public static VkResult vkCreateDevice(
                        VkPhysicalDevice  physicalDevice,
                        VkDeviceCreateInfo  pCreateDeviceInfo,
                        VkAllocationCallbacks  pAllocator,
                        VkDevice[]  pDevice){
      
   if(pDevice==null || pDevice.length<1){
       throw new IllegalArgumentException("pDevice[] must be not null and length >=1");
   }  
   int[] result = {0};   
   ByteBuffer nativeHandle =   vkCreateDevice0(
               physicalDevice.getPointer(),
               pCreateDeviceInfo.getPointer(),
               (pAllocator==null? null: pAllocator.getPointer()),
               result);
   VkDevice device = new VkHandle(nativeHandle);
   pDevice[0] = device;
   VkResult res = VkResult.fromValue(result[0]);   
   return res;   
  }

  /**
   * 
   * @param physicalDevice
   * @param pCreateInfo
   * @param pAllocator
   * @param pDevice
   * @return
   */
   private static native ByteBuffer vkCreateDevice0(
               Buffer  physicalDevice,
               Buffer  pCreateInfo,
               Buffer  pAllocator,
               int[] result);/*
                
       VkDevice* pDevice = new VkDevice;
       VkResult res =  vkCreateDevice(
                                      (VkPhysicalDevice) (physicalDevice),
                                      (const VkDeviceCreateInfo*)     pCreateInfo,
                                      (const VkAllocationCallbacks*)  pAllocator,
                                      (VkDevice*)                     pDevice);
      
         result[0] = res;   
         jobject pObj = NULL;
         if(res >= 0){     
           pObj = env->NewDirectByteBuffer((void*) pDevice[0], 
                                           (jlong) sizeof(VkDevice));
         }else{
           printf("No Device available !\n");
         }
         if(pDevice != NULL) 
            delete pDevice;
                 
         return pObj;      
       */

       /////////////////////////////////////

       /**
        * <h2>Prototype</h2><pre>
        * VKAPI_ATTR void VKAPI_CALL vkDestroyDevice(
        *     VkDevice                                    device,
        *     const VkAllocationCallbacks*                pAllocator);
        * </pre>
        */
  public static void vkDestroyDevice( VkDevice  device,
                                      VkAllocationCallbacks  pAllocator){
      vkDestroyDevice0( device.getPointer(),
                        ( pAllocator==null ? null : pAllocator.getPointer()));
      
  }

  /**
   * 
   * @param device
   * @param pAllocator
   */
   private static native void vkDestroyDevice0(
               ByteBuffer  device,
               ByteBuffer  pAllocator);/*             
         vkDestroyDevice( (VkDevice) device,
                          (const VkAllocationCallbacks*)   pAllocator);
      */

    
    /**
     * <h2>Prototype</h2>
     * 
     * <pre>
     * VKAPI_ATTR VkResult VKAPI_CALL vkEnumerateInstanceExtensionProperties(
     *     const char*                                 pLayerName,
     *     uint32_t*                                   pPropertyCount,
     *     VkExtensionProperties*                      pProperties);
     * </pre>
     * 
     * @param pLayerName - is either NULL or a pointer to a null-terminated UTF-8 string
     *        naming the instance layer to retrieve extensions from.
     * @param pPropertyCount - is a pointer to an integer related to the number of extension
     *        properties available or queried, as described below.
     * @param pProperties -  is either NULL or a pointer to an array of VkExtensionProperties
     *        structures.
     * 
     */
   @Deprecated
  public static VkResult vkEnumerateInstanceExtensionProperties(
               String pLayerName,              
               List<VkExtensionProperties>  pProperties){
      pProperties.clear();      
      int[] result = {0};
      int[] count = {0};
      VkResult res = vkEnumerateInstanceExtensionProperties(pLayerName, count, null);
      
      if(res.getValue() < 0){
       return res;    
      }
      VkExtensionProperties[] pProperties_ = new VkExtensionProperties[count[0]];
      res = vkEnumerateInstanceExtensionProperties(pLayerName, count, pProperties_);
      
      for (int i = 0; i < pProperties_.length; i++) {
       pProperties.add(pProperties_[i]);        
      } 
      return VkResult.fromValue(result[0]);
  }
  
   /**
    * <h2>Prototype</h2>
    * 
    * <pre>
    * VKAPI_ATTR VkResult VKAPI_CALL vkEnumerateInstanceExtensionProperties(
    *     const char*                                 pLayerName,
    *     uint32_t*                                   pPropertyCount,
    *     VkExtensionProperties*                      pProperties);
    * </pre>
    * 
    * @param pLayerName - is either NULL or a pointer to a null-terminated UTF-8 string
    *        naming the instance layer to retrieve extensions from.
    * @param pPropertyCount - is a pointer to an integer related to the number of extension
    *        properties available or queried, as described below.
    * @param pProperties -  is either NULL or a pointer to an array of VkExtensionProperties
    *        structures.
    * 
    */
    public static VkResult vkEnumerateInstanceExtensionProperties(String pLayerName,
                                                                  int[] pPropertyCount,
                                                                  VkExtensionProperties[] pProperties) {       
        ByteBuffer bigBuffer = createBigBuffer(pPropertyCount, pProperties, VkExtensionProperties.sizeOf());
        int res = vkEnumerateInstanceExtensionProperties0(pLayerName, pPropertyCount, bigBuffer);
        Utils.populate(pProperties, bigBuffer, pPropertyCount, VkExtensionProperties.TAG_ID);                
        return VkResult.fromValue(res);
    }
  
 
  /**
   *  
   * 
   * @param pLayerName
   * @param pPropertyCount
   * @param result
   * @return
   */
   private static native int vkEnumerateInstanceExtensionProperties0(
               String  pLayerName,
               int[]  pPropertyCount,
               ByteBuffer array);/*     
     uint32_t count = 0;          
     VkResult res = vkEnumerateInstanceExtensionProperties(
                        (const char*)  pLayerName,
                        (uint32_t*)    &count,
                        (VkExtensionProperties*) array);                        
      pPropertyCount[0] = (jint)count;
      return res; 
     */
  
  

       /**
        * <h2>Prototype</h2><pre>
        * VKAPI_ATTR VkResult VKAPI_CALL vkEnumerateDeviceExtensionProperties(
        *     VkPhysicalDevice                            physicalDevice,
        *     const char*                                 pLayerName,
        *     uint32_t*                                   pPropertyCount,
        *     VkExtensionProperties*                      pProperties);
        * </pre>
        * 
        * @param physicalDevice -    Physical device to query.
        * @param pLayerName - Optional layer name to query.
        * @param pPropertyCount -  Count indicating number of 
        * VkExtensionProperties pointed to by pProperties.
        * @param pProperties - Pointer to an array of VkExtensionProperties.
        * 
        * 
        */
  public static  VkResult vkEnumerateDeviceExtensionProperties(
               VkPhysicalDevice  physicalDevice,
               String  pLayerName,
               int[]  pPropertyCount,
               VkExtensionProperties[]  pProperties){      
        ByteBuffer bigBuffer = createBigBuffer(pPropertyCount, pProperties, VkExtensionProperties.sizeOf());
        int res = vkEnumerateDeviceExtensionProperties0( physicalDevice.getPointer(), pLayerName,  pPropertyCount, bigBuffer);
        Utils.populate(pProperties, bigBuffer, pPropertyCount, VkExtensionProperties.TAG_ID);        
        return VkResult.fromValue(res);
    }

   
   private static native int vkEnumerateDeviceExtensionProperties0( Buffer  physicalDevice,
                                                                    String  pLayerName,
                                                                    int[]  pPropertyCount,
                                                                    ByteBuffer array);/*
     uint32_t count = 0;          
     VkResult res =  vkEnumerateDeviceExtensionProperties(
               (VkPhysicalDevice)  physicalDevice,
               (const char*)    pLayerName,
               (uint32_t*)     &count,
               (VkExtensionProperties*)  array);                   
     pPropertyCount[0] = (jint)count; 
     return (jint)res;     
    */                                                         
                                                                
       /////////////////////////////////////

       /**
        * <h2>Prototype</h2><pre>
        * VKAPI_ATTR VkResult VKAPI_CALL vkEnumerateInstanceLayerProperties(
        *     uint32_t*                                   pPropertyCount,
        *     VkLayerProperties*                          pProperties);
        * </pre>
        * 
        * @param pPropertyCount -  Pointer to count indicating 
        * space available on input and structures returned on output.
        * @param pProperties - Pointer to a array to receive the results.
        * 
        * @return VkResult
        */
  public static VkResult vkEnumerateInstanceLayerProperties(
               int[]  pPropertyCount,
               VkLayerProperties[]  pProperties){
      ByteBuffer bigBuffer = createBigBuffer(pPropertyCount, pProperties, VkLayerProperties.sizeOf());      
      int res = vkEnumerateInstanceLayerProperties0(pPropertyCount, bigBuffer);      
      Utils.populate(pProperties, bigBuffer, pPropertyCount,VkLayerProperties.TAG_ID);      
      return VkResult.fromValue(res);
  }

  private static native int vkEnumerateInstanceLayerProperties0(int[]  pPropertyCount,
                                                                ByteBuffer array);/*    
      uint32_t count = 0;
      VkResult res =  vkEnumerateInstanceLayerProperties(
                    (uint32_t*) &count,
                    (VkLayerProperties*)  array);  
      pPropertyCount[0] = count;
      return res;
  */
  

  /**
   * vkEnumerateDeviceLayerProperties - Returns properties of 
   * available physical device layers.
   * 
   * <h2>Prototype</h2><pre>
   * VKAPI_ATTR VkResult VKAPI_CALL vkEnumerateDeviceLayerProperties(
   *     VkPhysicalDevice                            physicalDevice,
   *     uint32_t*                                   pPropertyCount,
   *     VkLayerProperties*                          pProperties);
   * </pre>
   * 
   * @param physicalDevice - Physical device to query.
   * @param pPropertyCount -   Count indicating number of VkLayerProperties
   *  pointed to by pProperties.
   * @param pProperties - Pointer to an array of VkLayerProperties.
   * 
   * @return VkResult
   */

   public static  VkResult vkEnumerateDeviceLayerProperties( VkPhysicalDevice  physicalDevice, 
                                                          int[]  pPropertyCount, 
                                                          VkLayerProperties[]  pProperties){
       ByteBuffer bigBuffer = createBigBuffer(pPropertyCount, pProperties, VkLayerProperties.sizeOf());
       int res = vkEnumerateDeviceLayerProperties0(physicalDevice.getPointer(), pPropertyCount, bigBuffer);
       Utils.populate(pProperties, bigBuffer, pPropertyCount, VkLayerProperties.TAG_ID);                
       return VkResult.fromValue(res);
   }
   
    
  /**
   * Native method
   * @param physicalDevice
   * @param pPropertyCount
   * @param array
   * @return
   */
   private static native int vkEnumerateDeviceLayerProperties0(
               Buffer  physicalDevice,
               int[]  pPropertyCount,               
               ByteBuffer array);/*
       uint32_t count=0;               
       VkResult res =   vkEnumerateDeviceLayerProperties(
                                  (VkPhysicalDevice)  physicalDevice,
                                  (uint32_t*)  &count,
                                  (VkLayerProperties*) array);
       pPropertyCount[0] = (jint) count;            
       return (jint)res;
      */

   

       /**
        * <h2>Prototype</h2><pre>
        * VKAPI_ATTR void VKAPI_CALL vkGetDeviceQueue(
        *     VkDevice                                    device,
        *     uint32_t                                    queueFamilyIndex,
        *     uint32_t                                    queueIndex,
        *     VkQueue*                                    pQueue);
        * </pre>
        * 
        * @param device -  Handle to the device that is the owner of the queue.
        * @param queueFamilyIndex -   The family index of the queue within the device.
        * @param queueIndex - The index of the queue within the queue family.
        * 
        * @return pQueue -   A pointer to a variable that is to receive the resulting handle.
        */
  public static  VkQueue vkGetDeviceQueue( VkDevice  device,
                                           int  queueFamilyIndex,
                                           int  queueIndex){
      
      ByteBuffer nativeHandle = vkGetDeviceQueue0( device.getPointer(),
                                                   queueFamilyIndex,
                                                   queueIndex);
      VkQueue q = new VkHandle(nativeHandle);
      return q;
  }

  /**
   * 
   * @param device
   * @param queueFamilyIndex
   * @param queueIndex
   * @return native handle to 
   */
   private static native ByteBuffer vkGetDeviceQueue0(
               Buffer  device,
               int  queueFamilyIndex,
               int  queueIndex);/*
               
       VkQueue*   pQueue = new VkQueue;             
       vkGetDeviceQueue(
                  (VkDevice)   (device),
                  (uint32_t)   queueFamilyIndex,
                  (uint32_t)   queueIndex,
                  (VkQueue*)   pQueue);        
        jobject bb =  env->NewDirectByteBuffer((void*) pQueue[0], 
                                               (jlong) sizeof(VkQueue));
        delete pQueue;                                
        return bb;         
                  
      */

   /**
    *  Vulkan procedure ID: 19
    * <h2>Prototype</h2><pre>
    * VKAPI_ATTR VkResult VKAPI_CALL vkQueueSubmit(
    *     VkQueue                                     queue,
    *     uint32_t                                    submitCount,
    *     const VkSubmitInfo*                         pSubmits,
    *     VkFence                                     fence);
    * </pre>
    * 
    * @param queue - 
    * @param submitCount - 
    * @param pSubmits - 
    * @param fence - 
    */
    public static VkResult vkQueueSubmit(
           VkQueue queue,
           int submitCount,
           VkSubmitInfo  pSubmits,
           VkFence fence){
    int res =  vkQueueSubmit0(queue.getPointer(),
                       submitCount,
                       pSubmits.getPointer(),
                       fence.getPointer());
    
    return VkResult.fromValue(res);
}

   /**
    *  native interface 19
    * 
    * @param queue - 
    * @param submitCount - 
    * @param pSubmits - 
    * @param fence - 
    */
private static native int vkQueueSubmit0(
           java.nio.ByteBuffer   _queue,
           int  submitCount,
           java.nio.ByteBuffer   pSubmits,
           java.nio.ByteBuffer   _fence);/*
    
       VkQueue* queue = (VkQueue*)_queue;
       VkFence* fence = (VkFence*)_fence;
       
       VkResult res = vkQueueSubmit(
                                (VkQueue)   (*queue),
                                (uint32_t)  submitCount,
                                (const VkSubmitInfo*)  pSubmits,
                                (VkFence) fence);                                
       return (jint) res;
     */


/**
 *  Vulkan procedure ID: 20
 * <h2>Prototype</h2><pre>
 *  VkResult  vkQueueWaitIdle(
 *     VkQueue                                     queue);
 * </pre>
 * 
 * @param queue - 
 * 
 * @return VkResult
 */
    public static VkResult vkQueueWaitIdle(
             VkQueue queue){
     int  _val = vkQueueWaitIdle0(
                     (queue==null ? null : queue.getPointer()) /* ByteBuffer */  );
      return VkResult.fromValue(_val);
} 

/**
 *  Native interface for Vulkan method #20
 *  vkQueueWaitIdle 
 * 
 * @param queue - 
 * 
 * @return VkResult as int  
 */
 private static native int  vkQueueWaitIdle0(
             java.nio.ByteBuffer   queue);/* 
      
     VkResult res = vkQueueWaitIdle(
                     (VkQueue) queue);
      return (jint) res;
*/ 


     /////////////////////////////////////

/**
 *  Vulkan procedure ID: 21
 * <h2>Prototype</h2><pre>
 *  VkResult  vkDeviceWaitIdle(
 *     VkDevice                                    device);
 * </pre>
 * 
 * @param device - 
 * 
 * @return VkResult
 */
    public static VkResult vkDeviceWaitIdle(
             VkDevice device){
     int  _val = vkDeviceWaitIdle0(
                     (device==null ? null : device.getPointer()) /* ByteBuffer */  );
      return VkResult.fromValue(_val);
} 

/**
 *  Native interface for Vulkan method #21
 *  vkDeviceWaitIdle 
 * 
 * @param device - 
 * 
 * @return VkResult as int  
 */
 private static native int  vkDeviceWaitIdle0(
             java.nio.ByteBuffer   device);/* 
     
     VkResult res = vkDeviceWaitIdle(
                     (VkDevice) (device));
      return (jint) res;
*/ 


     /////////////////////////////////////

/**
 *  Vulkan procedure ID: 22
 * <h2>Prototype</h2><pre>
 *  VkResult  vkAllocateMemory(
 *     VkDevice                                    device,
 *     const VkMemoryAllocateInfo*                 pAllocateInfo,
 *     const VkAllocationCallbacks*                pAllocator,
 *     VkDeviceMemory*                             pMemory);
 * </pre>
 * 
 * @param device - 
 * @param pAllocateInfo - 
 * @param pAllocator - 
 * @param pMemory - 
 * 
 * @return VkResult
 */
    public static VkResult vkAllocateMemory(
             VkDevice device,
              VkMemoryAllocateInfo  pAllocateInfo,
              VkAllocationCallbacks  pAllocator,
              VkDeviceMemory  pMemory){
     int  _val = vkAllocateMemory0(
                     (device==null ? null : device.getPointer()) /* ByteBuffer */ ,
                     (pAllocateInfo==null ? null : pAllocateInfo.getPointer()) /* ByteBuffer */ ,
                     (pAllocator==null ? null : pAllocator.getPointer()) /* ByteBuffer */ ,
                     (pMemory==null ? null : pMemory.getPointer()) /* ByteBuffer */  );
      return VkResult.fromValue(_val);
} 

/**
 *  Native interface for Vulkan method #22
 *  vkAllocateMemory 
 * 
 * @param device - 
 * @param pAllocateInfo - 
 * @param pAllocator - 
 * @param pMemory - 
 * 
 * @return VkResult as int  
 */
 private static native int  vkAllocateMemory0(
             java.nio.ByteBuffer   device,
             java.nio.ByteBuffer   pAllocateInfo,
             java.nio.ByteBuffer   pAllocator,
             java.nio.ByteBuffer   pMemory);/* 
     
     VkResult res = vkAllocateMemory(
                     (VkDevice) (device),
                     (const VkMemoryAllocateInfo*) pAllocateInfo,
                     (const VkAllocationCallbacks*) pAllocator,
                     (VkDeviceMemory*) pMemory);
      return (jint) res;
*/ 


     /////////////////////////////////////

/**
 *  Vulkan procedure ID: 23
 * <h2>Prototype</h2><pre>
 *  void  vkFreeMemory(
 *     VkDevice                                    device,
 *     VkDeviceMemory                              memory,
 *     const VkAllocationCallbacks*                pAllocator);
 * </pre>
 * 
 * @param device - 
 * @param memory - 
 * @param pAllocator - 
 */
    public static void  vkFreeMemory(
             VkDevice device,
             VkDeviceMemory memory,
              VkAllocationCallbacks  pAllocator){
     vkFreeMemory0(
             (device==null ? null : device.getPointer()) /* ByteBuffer */ ,
             (memory==null ? null : memory.getPointer()) /* ByteBuffer */ ,
             (pAllocator==null ? null : pAllocator.getPointer()) /* ByteBuffer */  );

} 

/**
 *  Native interface for Vulkan method #23
 *  vkFreeMemory 
 * 
 * @param device - 
 * @param memory - 
 * @param pAllocator - 
 */
 private static native void vkFreeMemory0(
             java.nio.ByteBuffer   device,
             java.nio.ByteBuffer   memory,
             java.nio.ByteBuffer   pAllocator);/* 

     vkFreeMemory(
                     (VkDevice) (device),
                     (VkDeviceMemory) memory,
                     (const VkAllocationCallbacks*) pAllocator);

*/ 


     /////////////////////////////////////

/**
 *  Vulkan procedure ID: 24
 * <h2>Prototype</h2><pre>
 *  VkResult  vkMapMemory(
 *     VkDevice                                    device,
 *     VkDeviceMemory                              memory,
 *     VkDeviceSize                                offset,
 *     VkDeviceSize                                size,
 *     VkMemoryMapFlags                            flags,
 *     void**                                      ppData);
 * </pre>
 * 
 * @param device - 
 * @param memory - 
 * @param offset - 
 * @param size - 
 * @param flags - 
 * @param ppData - 
 * 
 * @return VkResult
 */
    public static VkResult vkMapMemory(
             VkDevice device,
             VkDeviceMemory memory,
             long offset,
             long size,
             int flags,
             ByteBuffer[] ppData){
     //FIXED
     int[] result = {0};
     
     ByteBuffer pData = vkMapMemory0(
                     (device==null ? null : device.getPointer()) /* ByteBuffer */ ,
                     (memory==null ? null : memory.getPointer()) /* ByteBuffer */ ,
                     offset ,
                     size ,
                     flags ,
                     result);     
      ppData[0] = pData;
      return VkResult.fromValue(result[0]);
} 

/**
 *  Native interface for Vulkan method #24
 *  vkMapMemory 
 * 
 * @param device - 
 * @param memory - 
 * @param offset - 
 * @param size - 
 * @param flags - 
 * @param ppData - 
 * 
 * @return VkResult as int  
 */
 private static native java.nio.ByteBuffer vkMapMemory0(
             java.nio.ByteBuffer   device,
             java.nio.ByteBuffer   memory,
             long  offset,
             long  size,
             int  flags,
             int[] result);/* 
     // FIXED        

     void* pData = nullptr;
     jobject buff = NULL;
     
     VkResult res = vkMapMemory(
                     (VkDevice) (device),
                     (VkDeviceMemory) memory,
                     (VkDeviceSize) offset,
                     (VkDeviceSize) size,
                     (VkMemoryMapFlags) flags,
                     (void**) &pData);
                     
      result[0] = (jint) res; 
                    
      if(pData){
         buff = env->NewDirectByteBuffer((void*) pData, 
                                         (jlong) size); 
      }           
      return buff;
*/ 


     /////////////////////////////////////

/**
 *  Vulkan procedure ID: 25
 * <h2>Prototype</h2><pre>
 *  void  vkUnmapMemory(
 *     VkDevice                                    device,
 *     VkDeviceMemory                              memory);
 * </pre>
 * 
 * @param device - 
 * @param memory - 
 */
    public static void  vkUnmapMemory(
             VkDevice device,
             VkDeviceMemory memory){
     vkUnmapMemory0(
             (device==null ? null : device.getPointer()) /* ByteBuffer */ ,
             (memory==null ? null : memory.getPointer()) /* ByteBuffer */  );

} 

/**
 *  Native interface for Vulkan method #25
 *  vkUnmapMemory 
 * 
 * @param device - 
 * @param memory - 
 */
 private static native void vkUnmapMemory0(
             java.nio.ByteBuffer   device,
             java.nio.ByteBuffer   memory);/* 

     vkUnmapMemory(
                     (VkDevice) (device),
                     (VkDeviceMemory) memory);

*/ 


     /////////////////////////////////////

/**
 *  Vulkan procedure ID: 26
 * <h2>Prototype</h2><pre>
 *  VkResult  vkFlushMappedMemoryRanges(
 *     VkDevice                                    device,
 *     uint32_t                                    memoryRangeCount,
 *     const VkMappedMemoryRange*                  pMemoryRanges);
 * </pre>
 * 
 * @param device - 
 * @param memoryRangeCount - 
 * @param pMemoryRanges - 
 * 
 * @return VkResult
 */
    public static VkResult vkFlushMappedMemoryRanges(
             VkDevice device,
             int memoryRangeCount,
             VkMappedMemoryRange[]  pMemoryRanges){
     //FIXING -     
     ByteBuffer[] pMemoryRangesBuffers = getBuffers(pMemoryRanges, memoryRangeCount);
     int  _val = vkFlushMappedMemoryRanges0(
                     (device==null ? null : device.getPointer()) /* ByteBuffer */ ,
                     pMemoryRangesBuffers.length,
                     pMemoryRangesBuffers);
     
     setBuffers(pMemoryRanges, pMemoryRangesBuffers);
     return VkResult.fromValue(_val);
} 

/**
 * Set new buffer to VkStruct or VkHandkers.
 * @param vkObjArray - array of Structs
 * @param buffers - array of buffers to set
 */
 private static void setBuffers(VkObject[] vkObjArray, ByteBuffer[] buffers){
     int len = Math.min(vkObjArray.length, buffers.length);
     for(int i=0; i<len; i++){
         VkObject stru = vkObjArray[i];
         if(stru != null){
             stru.setPointer(buffers[i]);
         }
     }
 }
 
 /**
  * Get native buffers from VkObject array
  * @param vkObjArray - array of VkStructs or VkHandlers to extract buffers
  * @param max - max number of buffers to read.
  * @return array of Bytebuffers 
  */
 private static ByteBuffer[] getBuffers(VkObject[] vkObjArray, int max){
     int len = Math.min(max,vkObjArray.length);
     ByteBuffer[] buffers = new ByteBuffer[len];     
     for(int i=0; i<len; i++){
        buffers[i] = (vkObjArray[i] == null) ? null : vkObjArray[i].getPointer();
     }
     return buffers;
 }

/**
 *  Native interface for Vulkan method #26
 *  vkFlushMappedMemoryRanges 
 * 
 * @param device - 
 * @param memoryRangeCount - 
 * @param pMemoryRanges - 
 * 
 * @return VkResult as int  
 */
 private static native int  vkFlushMappedMemoryRanges0(
             java.nio.ByteBuffer   device,
             int  memoryRangeCount,
             java.nio.ByteBuffer[]   pMemoryRangesArray);/* 
     //FIXED
                    
            
     JBufferArray buffers (env, pMemoryRangesArray);          
     const VkMappedMemoryRange* pMemoryRanges = (const VkMappedMemoryRange*) buffers.getPointers();
     VkResult res = vkFlushMappedMemoryRanges(
                     (VkDevice) (device),
                     (uint32_t) memoryRangeCount,
                     (const VkMappedMemoryRange*) pMemoryRanges);
                     
                     
      return (jint) res;
*/ 


     /////////////////////////////////////

/**
 *  Vulkan procedure ID: 27
 * <h2>Prototype</h2><pre>
 *  VkResult  vkInvalidateMappedMemoryRanges(
 *     VkDevice                                    device,
 *     uint32_t                                    memoryRangeCount,
 *     const VkMappedMemoryRange*                  pMemoryRanges);
 * </pre>
 * 
 * @param device - 
 * @param memoryRangeCount - 
 * @param pMemoryRanges - 
 * 
 * @return VkResult
 */
    public static VkResult vkInvalidateMappedMemoryRanges(
             VkDevice device,
             int memoryRangeCount,
             VkMappedMemoryRange[]  pMemoryRanges){
    
    
    ByteBuffer[] pMemoryRangesBuffers = getBuffers(pMemoryRanges, memoryRangeCount);
       
     int  _val = vkInvalidateMappedMemoryRanges0(
                     (device==null ? null : device.getPointer()) /* ByteBuffer */ ,
                     memoryRangeCount ,
                     pMemoryRangesBuffers);
      setBuffers(pMemoryRanges, pMemoryRangesBuffers);
      
      return VkResult.fromValue(_val);
} 

/**
 *  Native interface for Vulkan method #27
 *  vkInvalidateMappedMemoryRanges 
 * 
 * @param device - 
 * @param memoryRangeCount - 
 * @param pMemoryRanges - 
 * 
 * @return VkResult as int  
 */
 private static native int  vkInvalidateMappedMemoryRanges0(
             java.nio.ByteBuffer   device,
             int  memoryRangeCount,
             java.nio.ByteBuffer[]   pMemoryRanges);/*
                           
          
     JBufferArray bufferArray (env, pMemoryRanges);
     PointerToAnything* buffers = bufferArray.getPointers();
     VkResult res = vkInvalidateMappedMemoryRanges(
                     (VkDevice) (device),
                     (uint32_t) memoryRangeCount,
                     (const VkMappedMemoryRange*) buffers);
                     
      return (jint) res;
*/ 


     /////////////////////////////////////

/**
 *  Vulkan procedure ID: 28
 * <h2>Prototype</h2><pre>
 *  void  vkGetDeviceMemoryCommitment(
 *     VkDevice                                    device,
 *     VkDeviceMemory                              memory,
 *     VkDeviceSize*                               pCommittedMemoryInBytes);
 * </pre>
 * 
 * @param device - 
 * @param memory - 
 * @param pCommittedMemoryInBytes - 
 */
    public static void  vkGetDeviceMemoryCommitment(
             VkDevice device,
             VkDeviceMemory memory,
             long[] pCommittedMemoryInBytes){
     vkGetDeviceMemoryCommitment0(
             (device==null ? null : device.getPointer()) /* ByteBuffer */ ,
             (memory==null ? null : memory.getPointer()) /* ByteBuffer */ ,
             pCommittedMemoryInBytes  );

} 

/**
 *  Native interface for Vulkan method #28
 *  vkGetDeviceMemoryCommitment 
 * 
 * @param device - 
 * @param memory - 
 * @param pCommittedMemoryInBytes - 
 */
 private static native void vkGetDeviceMemoryCommitment0(
             java.nio.ByteBuffer   device,
             java.nio.ByteBuffer   memory,
             long[]  pCommittedMemoryInBytes);/* 

     vkGetDeviceMemoryCommitment(
                     (VkDevice) (device),
                     (VkDeviceMemory) memory,
                     (VkDeviceSize*) pCommittedMemoryInBytes);

*/ 


     /////////////////////////////////////

/**
 *  Vulkan procedure ID: 29
 * <h2>Prototype</h2><pre>
 *  VkResult  vkBindBufferMemory(
 *     VkDevice                                    device,
 *     VkBuffer                                    buffer,
 *     VkDeviceMemory                              memory,
 *     VkDeviceSize                                memoryOffset);
 * </pre>
 * 
 * @param device - 
 * @param buffer - 
 * @param memory - 
 * @param memoryOffset - 
 * 
 * @return VkResult
 */
    public static VkResult vkBindBufferMemory(
             VkDevice device,
             VkBuffer buffer,
             VkDeviceMemory memory,
             long memoryOffset){
     int  _val = vkBindBufferMemory0(
                     (device==null ? null : device.getPointer()) /* ByteBuffer */ ,
                     (buffer==null ? null : buffer.getPointer()) /* ByteBuffer */ ,
                     (memory==null ? null : memory.getPointer()) /* ByteBuffer */ ,
                     memoryOffset  );
      return VkResult.fromValue(_val);
} 

/**
 *  Native interface for Vulkan method #29
 *  vkBindBufferMemory 
 * 
 * @param device - 
 * @param buffer - 
 * @param memory - 
 * @param memoryOffset - 
 * 
 * @return VkResult as int  
 */
 private static native int  vkBindBufferMemory0(
             java.nio.ByteBuffer   device,
             java.nio.ByteBuffer   buffer,
             java.nio.ByteBuffer   memory,
             long  memoryOffset);/* 
  
     VkResult res = vkBindBufferMemory(
                     (VkDevice) (device),
                     (VkBuffer) buffer,
                     (VkDeviceMemory) memory,
                     (VkDeviceSize) memoryOffset);
      return (jint) res;
*/ 


     /////////////////////////////////////

/**
 *  Vulkan procedure ID: 30
 * <h2>Prototype</h2><pre>
 *  VkResult  vkBindImageMemory(
 *     VkDevice                                    device,
 *     VkImage                                     image,
 *     VkDeviceMemory                              memory,
 *     VkDeviceSize                                memoryOffset);
 * </pre>
 * 
 * @param device - 
 * @param image - 
 * @param memory - 
 * @param memoryOffset - 
 * 
 * @return VkResult
 */
    public static VkResult vkBindImageMemory(
             VkDevice device,
             VkImage image,
             VkDeviceMemory memory,
             long memoryOffset){
     int  _val = vkBindImageMemory0(
                     (device==null ? null : device.getPointer()) /* ByteBuffer */ ,
                     (image==null ? null : image.getPointer()) /* ByteBuffer */ ,
                     (memory==null ? null : memory.getPointer()) /* ByteBuffer */ ,
                     memoryOffset  );
      return VkResult.fromValue(_val);
} 

/**
 *  Native interface for Vulkan method #30
 *  vkBindImageMemory 
 * 
 * @param device - 
 * @param image - 
 * @param memory - 
 * @param memoryOffset - 
 * 
 * @return VkResult as int  
 */
 private static native int  vkBindImageMemory0(
             java.nio.ByteBuffer   device,
             java.nio.ByteBuffer   image,
             java.nio.ByteBuffer   memory,
             long  memoryOffset);/* 
     

     VkResult res = vkBindImageMemory(
                     (VkDevice) (device),
                     (VkImage) image,
                     (VkDeviceMemory) memory,
                     (VkDeviceSize) memoryOffset);
      return (jint) res;
*/ 


     /////////////////////////////////////

/**
 *  Vulkan procedure ID: 31
 * <h2>Prototype</h2><pre>
 *  void  vkGetBufferMemoryRequirements(
 *     VkDevice                                    device,
 *     VkBuffer                                    buffer,
 *     VkMemoryRequirements*                       pMemoryRequirements);
 * </pre>
 * 
 * @param device - 
 * @param buffer - 
 * @param pMemoryRequirements - 
 */
    public static void  vkGetBufferMemoryRequirements(
             VkDevice device,
             VkBuffer buffer,
             VkMemoryRequirements  pMemoryRequirements){
     vkGetBufferMemoryRequirements0(
             (device==null ? null : device.getPointer()) /* ByteBuffer */ ,
             (buffer==null ? null : buffer.getPointer()) /* ByteBuffer */ ,
             (pMemoryRequirements==null ? null : pMemoryRequirements.getPointer()) /* ByteBuffer */  );

} 

/**
 *  Native interface for Vulkan method #31
 *  vkGetBufferMemoryRequirements 
 * 
 * @param device - 
 * @param buffer - 
 * @param pMemoryRequirements - 
 */
 private static native void vkGetBufferMemoryRequirements0(
             java.nio.ByteBuffer   device,
             java.nio.ByteBuffer   buffer,
             java.nio.ByteBuffer   pMemoryRequirements);/* 

     vkGetBufferMemoryRequirements(
                     (VkDevice) (device),
                     (VkBuffer) buffer,
                     (VkMemoryRequirements*) pMemoryRequirements);

*/ 


     /////////////////////////////////////

/**
 *  Vulkan procedure ID: 32
 * <h2>Prototype</h2><pre>
 *  void  vkGetImageMemoryRequirements(
 *     VkDevice                                    device,
 *     VkImage                                     image,
 *     VkMemoryRequirements*                       pMemoryRequirements);
 * </pre>
 * 
 * @param device - 
 * @param image - 
 * @param pMemoryRequirements - 
 */
    public static void  vkGetImageMemoryRequirements(
             VkDevice device,
             VkImage image,
             VkMemoryRequirements  pMemoryRequirements){
     vkGetImageMemoryRequirements0(
             (device==null ? null : device.getPointer()) /* ByteBuffer */ ,
             (image==null ? null : image.getPointer()) /* ByteBuffer */ ,
             (pMemoryRequirements==null ? null : pMemoryRequirements.getPointer()) /* ByteBuffer */  );

} 

/**
 *  Native interface for Vulkan method #32
 *  vkGetImageMemoryRequirements 
 * 
 * @param device - 
 * @param image - 
 * @param pMemoryRequirements - 
 */
 private static native void vkGetImageMemoryRequirements0(
             java.nio.ByteBuffer   device,
             java.nio.ByteBuffer   image,
             java.nio.ByteBuffer   pMemoryRequirements);/* 

     vkGetImageMemoryRequirements(
                     (VkDevice) (device),
                     (VkImage) image,
                     (VkMemoryRequirements*) pMemoryRequirements);

*/ 


     /////////////////////////////////////

/**
 *  Vulkan procedure ID: 33
 * <h2>Prototype</h2><pre>
 *  void  vkGetImageSparseMemoryRequirements(
 *     VkDevice                                    device,
 *     VkImage                                     image,
 *     uint32_t*                                   pSparseMemoryRequirementCount,
 *     VkSparseImageMemoryRequirements*            pSparseMemoryRequirements);
 * </pre>
 * 
 * @param device - 
 * @param image - 
 * @param pSparseMemoryRequirementCount - 
 * @param pSparseMemoryRequirements - 
 */
    public static void  vkGetImageSparseMemoryRequirements(
             VkDevice device,
             VkImage image,
             int[] pSparseMemoryRequirementCount,
             VkSparseImageMemoryRequirements[]  pSparseMemoryRequirements){
    
     ByteBuffer[] buffers = getBuffers(pSparseMemoryRequirements, pSparseMemoryRequirementCount[0]);
     
     vkGetImageSparseMemoryRequirements0(
             (device==null ? null : device.getPointer()) /* ByteBuffer */ ,
             (image==null ? null : image.getPointer()) /* ByteBuffer */ ,
             pSparseMemoryRequirementCount ,
             buffers);
     
     setBuffers(pSparseMemoryRequirements, buffers);
} 

/**
 *  Native interface for Vulkan method #33
 *  vkGetImageSparseMemoryRequirements 
 * 
 * @param device - 
 * @param image - 
 * @param pSparseMemoryRequirementCount - 
 * @param pSparseMemoryRequirements - 
 */
 private static native void vkGetImageSparseMemoryRequirements0(
             java.nio.ByteBuffer   device,
             java.nio.ByteBuffer   image,
             int[]  pSparseMemoryRequirementCount,
             java.nio.ByteBuffer[]   pSparseMemoryRequirements);/* 

     JBufferArray buffers(env,pSparseMemoryRequirements);
     vkGetImageSparseMemoryRequirements(
                     (VkDevice) (device),
                     (VkImage) image,
                     (uint32_t*) pSparseMemoryRequirementCount,
                     (VkSparseImageMemoryRequirements*) buffers.getPointers());

*/ 


     /////////////////////////////////////

/**
 *  Vulkan procedure ID: 34
 * <h2>Prototype</h2><pre>
 *  void  vkGetPhysicalDeviceSparseImageFormatProperties(
 *     VkPhysicalDevice                            physicalDevice,
 *     VkFormat                                    format,
 *     VkImageType                                 type,
 *     VkSampleCountFlagBits                       samples,
 *     VkImageUsageFlags                           usage,
 *     VkImageTiling                               tiling,
 *     uint32_t*                                   pPropertyCount,
 *     VkSparseImageFormatProperties*              pProperties);
 * </pre>
 * 
 * @param physicalDevice - 
 * @param format - 
 * @param type - 
 * @param samples - 
 * @param usage - 
 * @param tiling - 
 * @param pPropertyCount - 
 * @param pProperties - 
 */
    public static void  vkGetPhysicalDeviceSparseImageFormatProperties(
             VkPhysicalDevice physicalDevice,
             VkFormat format,
             VkImageType type,
             VkSampleCountFlagBits samples,
             int usage,
             VkImageTiling tiling,
             int[] pPropertyCount,
             VkSparseImageFormatProperties[]  pProperties){
    
     ByteBuffer[] buffers = getBuffers(pProperties, pPropertyCount[0]);
     vkGetPhysicalDeviceSparseImageFormatProperties0(
             (physicalDevice==null ? null : physicalDevice.getPointer()) /* ByteBuffer */ ,
             format.getValue() /* enum */,
             type.getValue() /* enum */,
             samples.getValue() /* enum */,
             usage ,
             tiling.getValue() /* enum */,
             pPropertyCount ,
             buffers );
     
     setBuffers(pProperties, buffers);

} 

/**
 *  Native interface for Vulkan method #34
 *  vkGetPhysicalDeviceSparseImageFormatProperties 
 * 
 * @param physicalDevice - 
 * @param format - 
 * @param type - 
 * @param samples - 
 * @param usage - 
 * @param tiling - 
 * @param pPropertyCount - 
 * @param pProperties - 
 */
 private static native void vkGetPhysicalDeviceSparseImageFormatProperties0(
             java.nio.ByteBuffer   physicalDevice,
             int   format,
             int   type,
             int   samples,
             int  usage,
             int   tiling,
             int[]  pPropertyCount,
             java.nio.ByteBuffer[]   pProperties);/* 
     
     JBufferArray buffers (env, pProperties);
     
     vkGetPhysicalDeviceSparseImageFormatProperties(
                     (VkPhysicalDevice) physicalDevice,
                     (VkFormat) format,
                     (VkImageType) type,
                     (VkSampleCountFlagBits) samples,
                     (VkImageUsageFlags) usage,
                     (VkImageTiling) tiling,
                     (uint32_t*) pPropertyCount,
                     (VkSparseImageFormatProperties*) buffers.getPointers());

*/ 


     /////////////////////////////////////

/**
 *  Vulkan procedure ID: 35
 * <h2>Prototype</h2><pre>
 *  VkResult  vkQueueBindSparse(
 *     VkQueue                                     queue,
 *     uint32_t                                    bindInfoCount,
 *     const VkBindSparseInfo*                     pBindInfo,
 *     VkFence                                     fence);
 * </pre>
 * 
 * @param queue - 
 * @param bindInfoCount - 
 * @param pBindInfo - 
 * @param fence - 
 * 
 * @return VkResult
 */
    public static VkResult vkQueueBindSparse(
             VkQueue queue,
             int bindInfoCount,
              VkBindSparseInfo  pBindInfo,
             VkFence fence){
     int  _val = vkQueueBindSparse0(
                     (queue==null ? null : queue.getPointer()) /* ByteBuffer */ ,
                     bindInfoCount ,
                     (pBindInfo==null ? null : pBindInfo.getPointer()) /* ByteBuffer */ ,
                     (fence==null ? null : fence.getPointer()) /* ByteBuffer */  );
      return VkResult.fromValue(_val);
} 

/**
 *  Native interface for Vulkan method #35
 *  vkQueueBindSparse 
 * 
 * @param queue - 
 * @param bindInfoCount - 
 * @param pBindInfo - 
 * @param fence - 
 * 
 * @return VkResult as int  
 */
 private static native int  vkQueueBindSparse0(
             java.nio.ByteBuffer   queue,
             int  bindInfoCount,
             java.nio.ByteBuffer   pBindInfo,
             java.nio.ByteBuffer   fence);/* 
 
     VkResult res = vkQueueBindSparse(
                     (VkQueue) queue,
                     (uint32_t) bindInfoCount,
                     (const VkBindSparseInfo*) pBindInfo,
                     (VkFence) fence);
      return (jint) res;
*/ 


     /////////////////////////////////////

/**
 *  Vulkan procedure ID: 36
 * <h2>Prototype</h2><pre>
 *  VkResult  vkCreateFence(
 *     VkDevice                                    device,
 *     const VkFenceCreateInfo*                    pCreateInfo,
 *     const VkAllocationCallbacks*                pAllocator,
 *     VkFence*                                    pFence);
 * </pre>
 * 
 * @param device - 
 * @param pCreateInfo - 
 * @param pAllocator - 
 * @param pFence - 
 * 
 * @return VkResult
 */
    public static VkResult vkCreateFence(
             VkDevice device,
              VkFenceCreateInfo  pCreateInfo,
              VkAllocationCallbacks  pAllocator,
              VkFence  pFence){
     int  _val = vkCreateFence0(
                     (device==null ? null : device.getPointer()) /* ByteBuffer */ ,
                     (pCreateInfo==null ? null : pCreateInfo.getPointer()) /* ByteBuffer */ ,
                     (pAllocator==null ? null : pAllocator.getPointer()) /* ByteBuffer */ ,
                     (pFence==null ? null : pFence.getPointer()) /* ByteBuffer */  );
      return VkResult.fromValue(_val);
} 

/**
 *  Native interface for Vulkan method #36
 *  vkCreateFence 
 * 
 * @param device - 
 * @param pCreateInfo - 
 * @param pAllocator - 
 * @param pFence - 
 * 
 * @return VkResult as int  
 */
 private static native int  vkCreateFence0(
             java.nio.ByteBuffer   device,
             java.nio.ByteBuffer   pCreateInfo,
             java.nio.ByteBuffer   pAllocator,
             java.nio.ByteBuffer   pFence);/* 
     
     VkResult res = vkCreateFence(
                     (VkDevice) (device),
                     (const VkFenceCreateInfo*) pCreateInfo,
                     (const VkAllocationCallbacks*) pAllocator,
                     (VkFence*) pFence);
      return (jint) res;
*/ 


     /////////////////////////////////////

/**
 *  Vulkan procedure ID: 37
 * <h2>Prototype</h2><pre>
 *  void  vkDestroyFence(
 *     VkDevice                                    device,
 *     VkFence                                     fence,
 *     const VkAllocationCallbacks*                pAllocator);
 * </pre>
 * 
 * @param device - 
 * @param fence - 
 * @param pAllocator - 
 */
    public static void  vkDestroyFence(
             VkDevice device,
             VkFence fence,
             VkAllocationCallbacks  pAllocator){
     vkDestroyFence0(
             (device==null ? null : device.getPointer()) /* ByteBuffer */ ,
             (fence==null ? null : fence.getPointer()) /* ByteBuffer */ ,
             (pAllocator==null ? null : pAllocator.getPointer()) /* ByteBuffer */  );

} 

/**
 *  Native interface for Vulkan method #37
 *  vkDestroyFence 
 * 
 * @param device - 
 * @param fence - 
 * @param pAllocator - 
 */
 private static native void vkDestroyFence0(
             java.nio.ByteBuffer   device,
             java.nio.ByteBuffer   fence,
             java.nio.ByteBuffer   pAllocator);/* 

     vkDestroyFence(
                     (VkDevice) (device),
                     (VkFence) fence,
                     (const VkAllocationCallbacks*) pAllocator);

*/ 


     /////////////////////////////////////

/**
 *  Vulkan procedure ID: 38
 * <h2>Prototype</h2><pre>
 *  VkResult  vkResetFences(
 *     VkDevice                                    device,
 *     uint32_t                                    fenceCount,
 *     const VkFence*                              pFences);
 * </pre>
 * 
 * @param device - 
 * @param fenceCount - 
 * @param pFences - 
 * 
 * @return VkResult
 */
    public static VkResult vkResetFences(
             VkDevice device,
             int fenceCount,
             VkFence[]  pFences){
     ByteBuffer[] buffers = getBuffers(pFences, fenceCount);
     int  _val = vkResetFences0(
                     (device==null ? null : device.getPointer()) /* ByteBuffer */ ,
                     fenceCount ,
                     buffers);
     
     setBuffers(pFences, buffers);
      return VkResult.fromValue(_val);
} 

/**
 *  Native interface for Vulkan method #38
 *  vkResetFences 
 * 
 * @param device - 
 * @param fenceCount - 
 * @param pFences - 
 * 
 * @return VkResult as int  
 */
 private static native int  vkResetFences0(
             java.nio.ByteBuffer   device,
             int  fenceCount,
             java.nio.ByteBuffer[]   pFences);/* 
     
     JBufferArray buffers (env, pFences);
     
     VkResult res = vkResetFences(
                     (VkDevice) (device),
                     (uint32_t) fenceCount,
                     (const VkFence*) buffers.getPointers());
      return (jint) res;
*/ 


     /////////////////////////////////////

/**
 *  Vulkan procedure ID: 39
 * <h2>Prototype</h2><pre>
 *  VkResult  vkGetFenceStatus(
 *     VkDevice                                    device,
 *     VkFence                                     fence);
 * </pre>
 * 
 * @param device - 
 * @param fence - 
 * 
 * @return VkResult
 */
    public static VkResult vkGetFenceStatus(
             VkDevice device,
             VkFence fence){
     int  _val = vkGetFenceStatus0(
                     (device==null ? null : device.getPointer()) /* ByteBuffer */ ,
                     (fence==null ? null : fence.getPointer()) /* ByteBuffer */  );
      return VkResult.fromValue(_val);
} 

/**
 *  Native interface for Vulkan method #39
 *  vkGetFenceStatus 
 * 
 * @param device - 
 * @param fence - 
 * 
 * @return VkResult as int  
 */
 private static native int  vkGetFenceStatus0(
             java.nio.ByteBuffer   device,
             java.nio.ByteBuffer   fence);/* 

     VkResult res = vkGetFenceStatus(
                     (VkDevice) (device),
                     (VkFence) fence);
      return (jint) res;
*/ 


     /////////////////////////////////////

/**
 *  Vulkan procedure ID: 40
 * <h2>Prototype</h2><pre>
 *  VkResult  vkWaitForFences(
 *     VkDevice                                    device,
 *     uint32_t                                    fenceCount,
 *     const VkFence*                              pFences,
 *     VkBool32                                    waitAll,
 *     uint64_t                                    timeout);
 * </pre>
 * 
 * @param device - 
 * @param fenceCount - 
 * @param pFences - 
 * @param waitAll - 
 * @param timeout - 
 * 
 * @return VkResult
 */
    public static VkResult vkWaitForFences(
             VkDevice device,
             int fenceCount,
             VkFence[]  pFences,
             boolean waitAll,
             long timeout){
     ByteBuffer[] buffers = getBuffers(pFences, fenceCount); 
     int  _val = vkWaitForFences0(
                     (device==null ? null : device.getPointer()) /* ByteBuffer */ ,
                     fenceCount ,
                     buffers /* ByteBuffer */ ,
                     waitAll ,
                     timeout  );
      setBuffers(pFences, buffers);
      return VkResult.fromValue(_val);
} 

/**
 *  Native interface for Vulkan method #40
 *  vkWaitForFences 
 * 
 * @param device - 
 * @param fenceCount - 
 * @param pFences - 
 * @param waitAll - 
 * @param timeout - 
 * 
 * @return VkResult as int  
 */
 private static native int  vkWaitForFences0(
             java.nio.ByteBuffer   device,
             int  fenceCount,
             java.nio.ByteBuffer[]   pFences,
             boolean  waitAll,
             long  timeout);/* 
     
     JBufferArray buffers (env, pFences);
     
     VkResult res = vkWaitForFences(
                     (VkDevice) (device),
                     (uint32_t) fenceCount,
                     (const VkFence*) buffers.getPointers(),
                     (VkBool32) waitAll,
                     (uint64_t) timeout);
      return (jint) res;
*/ 


     /////////////////////////////////////

/**
 *  Vulkan procedure ID: 41
 * <h2>Prototype</h2><pre>
 *  VkResult  vkCreateSemaphore(
 *     VkDevice                                    device,
 *     const VkSemaphoreCreateInfo*                pCreateInfo,
 *     const VkAllocationCallbacks*                pAllocator,
 *     VkSemaphore*                                pSemaphore);
 * </pre>
 * 
 * @param device - 
 * @param pCreateInfo - 
 * @param pAllocator - 
 * @param pSemaphore - 
 * 
 * @return VkResult
 */
    public static VkResult vkCreateSemaphore(
             VkDevice device,
              VkSemaphoreCreateInfo  pCreateInfo,
              VkAllocationCallbacks  pAllocator,
              VkSemaphore  pSemaphore){
     int  _val = vkCreateSemaphore0(
                     (device==null ? null : device.getPointer()) /* ByteBuffer */ ,
                     (pCreateInfo==null ? null : pCreateInfo.getPointer()) /* ByteBuffer */ ,
                     (pAllocator==null ? null : pAllocator.getPointer()) /* ByteBuffer */ ,
                     (pSemaphore==null ? null : pSemaphore.getPointer()) /* ByteBuffer */  );
      return VkResult.fromValue(_val);
} 

/**
 *  Native interface for Vulkan method #41
 *  vkCreateSemaphore 
 * 
 * @param device - 
 * @param pCreateInfo - 
 * @param pAllocator - 
 * @param pSemaphore - 
 * 
 * @return VkResult as int  
 */
 private static native int  vkCreateSemaphore0(
             java.nio.ByteBuffer   device,
             java.nio.ByteBuffer   pCreateInfo,
             java.nio.ByteBuffer   pAllocator,
             java.nio.ByteBuffer   pSemaphore);/* 
     
     VkResult res = vkCreateSemaphore(
                     (VkDevice) (device),
                     (const VkSemaphoreCreateInfo*) pCreateInfo,
                     (const VkAllocationCallbacks*) pAllocator,
                     (VkSemaphore*) pSemaphore);
      return (jint) res;
*/ 


     /////////////////////////////////////

/**
 *  Vulkan procedure ID: 42
 * <h2>Prototype</h2><pre>
 *  void  vkDestroySemaphore(
 *     VkDevice                                    device,
 *     VkSemaphore                                 semaphore,
 *     const VkAllocationCallbacks*                pAllocator);
 * </pre>
 * 
 * @param device - 
 * @param semaphore - 
 * @param pAllocator - 
 */
    public static void  vkDestroySemaphore(
             VkDevice device,
             VkSemaphore semaphore,
             VkAllocationCallbacks  pAllocator){
     vkDestroySemaphore0(
             (device==null ? null : device.getPointer()) /* ByteBuffer */ ,
             (semaphore==null ? null : semaphore.getPointer()) /* ByteBuffer */ ,
             (pAllocator==null ? null : pAllocator.getPointer()) /* ByteBuffer */  );

} 

/**
 *  Native interface for Vulkan method #42
 *  vkDestroySemaphore 
 * 
 * @param device - 
 * @param semaphore - 
 * @param pAllocator - 
 */
 private static native void vkDestroySemaphore0(
             java.nio.ByteBuffer   device,
             java.nio.ByteBuffer   semaphore,
             java.nio.ByteBuffer   pAllocator);/* 

     vkDestroySemaphore(
                     (VkDevice) (device),
                     (VkSemaphore) semaphore,
                     (const VkAllocationCallbacks*) pAllocator);

*/ 


     /////////////////////////////////////

/**
 *  Vulkan procedure ID: 43
 * <h2>Prototype</h2><pre>
 *  VkResult  vkCreateEvent(
 *     VkDevice                                    device,
 *     const VkEventCreateInfo*                    pCreateInfo,
 *     const VkAllocationCallbacks*                pAllocator,
 *     VkEvent*                                    pEvent);
 * </pre>
 * 
 * @param device - 
 * @param pCreateInfo - 
 * @param pAllocator - 
 * @param pEvent - 
 * 
 * @return VkResult
 */
    public static VkResult vkCreateEvent(
             VkDevice device,
             VkEventCreateInfo  pCreateInfo,
             VkAllocationCallbacks  pAllocator,
             VkEvent  pEvent){
     int  _val = vkCreateEvent0(
                     (device==null ? null : device.getPointer()) /* ByteBuffer */ ,
                     (pCreateInfo==null ? null : pCreateInfo.getPointer()) /* ByteBuffer */ ,
                     (pAllocator==null ? null : pAllocator.getPointer()) /* ByteBuffer */ ,
                     (pEvent==null ? null : pEvent.getPointer()) /* ByteBuffer */  );
      return VkResult.fromValue(_val);
} 

/**
 *  Native interface for Vulkan method #43
 *  vkCreateEvent 
 * 
 * @param device - 
 * @param pCreateInfo - 
 * @param pAllocator - 
 * @param pEvent - 
 * 
 * @return VkResult as int  
 */
 private static native int  vkCreateEvent0(
             java.nio.ByteBuffer   device,
             java.nio.ByteBuffer   pCreateInfo,
             java.nio.ByteBuffer   pAllocator,
             java.nio.ByteBuffer   pEvent);/* 
     
     VkResult res = vkCreateEvent(
                     (VkDevice) (device),
                     (const VkEventCreateInfo*) pCreateInfo,
                     (const VkAllocationCallbacks*) pAllocator,
                     (VkEvent*) pEvent);
      return (jint) res;
*/ 


     /////////////////////////////////////

/**
 *  Vulkan procedure ID: 44
 * <h2>Prototype</h2><pre>
 *  void  vkDestroyEvent(
 *     VkDevice                                    device,
 *     VkEvent                                     event,
 *     const VkAllocationCallbacks*                pAllocator);
 * </pre>
 * 
 * @param device - 
 * @param event - 
 * @param pAllocator - 
 */
    public static void  vkDestroyEvent(
             VkDevice device,
             VkEvent event,
              VkAllocationCallbacks  pAllocator){
     vkDestroyEvent0(
             (device==null ? null : device.getPointer()) /* ByteBuffer */ ,
             (event==null ? null : event.getPointer()) /* ByteBuffer */ ,
             (pAllocator==null ? null : pAllocator.getPointer()) /* ByteBuffer */  );

} 

/**
 *  Native interface for Vulkan method #44
 *  vkDestroyEvent 
 * 
 * @param device - 
 * @param event - 
 * @param pAllocator - 
 */
 private static native void vkDestroyEvent0(
             java.nio.ByteBuffer   device,
             java.nio.ByteBuffer   event,
             java.nio.ByteBuffer   pAllocator);/* 

     vkDestroyEvent(
                     (VkDevice) (device),
                     (VkEvent) event ,
                     (const VkAllocationCallbacks*) pAllocator);

*/ 


     /////////////////////////////////////

/**
 *  Vulkan procedure ID: 45
 * <h2>Prototype</h2><pre>
 *  VkResult  vkGetEventStatus(
 *     VkDevice                                    device,
 *     VkEvent                                     event);
 * </pre>
 * 
 * @param device - 
 * @param event - 
 * 
 * @return VkResult
 */
    public static VkResult vkGetEventStatus(
             VkDevice device,
             VkEvent event){
     int  _val = vkGetEventStatus0(
                     (device==null ? null : device.getPointer()) /* ByteBuffer */ ,
                     (event==null ? null : event.getPointer()) /* ByteBuffer */  );
      return VkResult.fromValue(_val);
} 

/**
 *  Native interface for Vulkan method #45
 *  vkGetEventStatus 
 * 
 * @param device - 
 * @param event - 
 * 
 * @return VkResult as int  
 */
 private static native int  vkGetEventStatus0(
             java.nio.ByteBuffer   device,
             java.nio.ByteBuffer   event);/* 
     
     
     VkResult res = vkGetEventStatus(
                     (VkDevice) (device),
                     (VkEvent) event );
      return (jint) res;
*/ 


     /////////////////////////////////////

/**
 *  Vulkan procedure ID: 46
 * <h2>Prototype</h2><pre>
 *  VkResult  vkSetEvent(
 *     VkDevice                                    device,
 *     VkEvent                                     event);
 * </pre>
 * 
 * @param device - 
 * @param event - 
 * 
 * @return VkResult
 */
    public static VkResult vkSetEvent(
             VkDevice device,
             VkEvent event){
     int  _val = vkSetEvent0(
                     (device==null ? null : device.getPointer()) /* ByteBuffer */ ,
                     (event==null ? null : event.getPointer()) /* ByteBuffer */  );
      return VkResult.fromValue(_val);
} 

/**
 *  Native interface for Vulkan method #46
 *  vkSetEvent 
 * 
 * @param device - 
 * @param event - 
 * 
 * @return VkResult as int  
 */
 private static native int  vkSetEvent0(
             java.nio.ByteBuffer   device,
             java.nio.ByteBuffer   event);/* 

     VkResult res = vkSetEvent(
                     (VkDevice) (device),
                     (VkEvent) event);
      return (jint) res;
*/ 


     /////////////////////////////////////

/**
 *  Vulkan procedure ID: 47
 * <h2>Prototype</h2><pre>
 *  VkResult  vkResetEvent(
 *     VkDevice                                    device,
 *     VkEvent                                     event);
 * </pre>
 * 
 * @param device - 
 * @param event - 
 * 
 * @return VkResult
 */
    public static VkResult vkResetEvent(
             VkDevice device,
             VkEvent event){
     int  _val = vkResetEvent0(
                     (device==null ? null : device.getPointer()) /* ByteBuffer */ ,
                     (event==null ? null : event.getPointer()) /* ByteBuffer */  );
      return VkResult.fromValue(_val);
} 

/**
 *  Native interface for Vulkan method #47
 *  vkResetEvent 
 * 
 * @param device - 
 * @param event - 
 * 
 * @return VkResult as int  
 */
 private static native int  vkResetEvent0(
             java.nio.ByteBuffer   device,
             java.nio.ByteBuffer   event);/* 

     VkResult res = vkResetEvent(
                     (VkDevice) (device),
                     (VkEvent) event);
      return (jint) res;
*/ 


     /////////////////////////////////////

/**
 *  Vulkan procedure ID: 48
 * <h2>Prototype</h2><pre>
 *  VkResult  vkCreateQueryPool(
 *     VkDevice                                    device,
 *     const VkQueryPoolCreateInfo*                pCreateInfo,
 *     const VkAllocationCallbacks*                pAllocator,
 *     VkQueryPool*                                pQueryPool);
 * </pre>
 * 
 * @param device - 
 * @param pCreateInfo - 
 * @param pAllocator - 
 * @param pQueryPool - 
 * 
 * @return VkResult
 */
    public static VkResult vkCreateQueryPool(
             VkDevice device,
              VkQueryPoolCreateInfo  pCreateInfo,
              VkAllocationCallbacks  pAllocator,
              VkQueryPool[]  pQueryPool){
    
     ByteBuffer[] buff = new ByteBuffer[1];
     int  _val = vkCreateQueryPool0(
                     (device==null ? null : device.getPointer()) /* ByteBuffer */ ,
                     (pCreateInfo==null ? null : pCreateInfo.getPointer()) /* ByteBuffer */ ,
                     (pAllocator==null ? null : pAllocator.getPointer()) /* ByteBuffer */ ,
                     buff /* ByteBuffer */  );

      pQueryPool[0] = buff[0] == null ? null : new VkHandle(buff[0]);     
      buff[0] = null;
      
      return VkResult.fromValue(_val);
} 

/**
 *  Native interface for Vulkan method #48
 *  vkCreateQueryPool 
 * 
 * @param device - 
 * @param pCreateInfo - 
 * @param pAllocator - 
 * @param pQueryPool - 
 * 
 * @return VkResult as int  
 */
 private static native int  vkCreateQueryPool0(
             java.nio.ByteBuffer   device,
             java.nio.ByteBuffer   pCreateInfo,
             java.nio.ByteBuffer   pAllocator,
             java.nio.ByteBuffer[]   retBuff);/* 
     
     VkQueryPool* pQueryPool = new VkQueryPool[1];
     VkResult res = vkCreateQueryPool(
                     (VkDevice) (device),
                     (const VkQueryPoolCreateInfo*) pCreateInfo,
                     (const VkAllocationCallbacks*) pAllocator,
                     (VkQueryPool*) pQueryPool);
       
       if(res>=0){
          VkQueryPool obj = pQueryPool[0];
          jobject buf = (jobject)(env->NewDirectByteBuffer((void*)obj, sizeof(VkQueryPool)));
          env->SetObjectArrayElement(retBuff,0, buf);
       }
       if(pQueryPool)
          delete[] pQueryPool;
                     
      return (jint) res;
*/ 


     /////////////////////////////////////

/**
 *  Vulkan procedure ID: 49
 * <h2>Prototype</h2><pre>
 *  void  vkDestroyQueryPool(
 *     VkDevice                                    device,
 *     VkQueryPool                                 queryPool,
 *     const VkAllocationCallbacks*                pAllocator);
 * </pre>
 * 
 * @param device - 
 * @param queryPool - 
 * @param pAllocator - 
 */
    public static void  vkDestroyQueryPool(
             VkDevice device,
             VkQueryPool queryPool,
              VkAllocationCallbacks  pAllocator){
     vkDestroyQueryPool0(
             (device==null ? null : device.getPointer()) /* ByteBuffer */ ,
             (queryPool==null ? null : queryPool.getPointer()) /* ByteBuffer */ ,
             (pAllocator==null ? null : pAllocator.getPointer()) /* ByteBuffer */  );

} 

/**
 *  Native interface for Vulkan method #49
 *  vkDestroyQueryPool 
 * 
 * @param device - 
 * @param queryPool - 
 * @param pAllocator - 
 */
 private static native void vkDestroyQueryPool0(
             java.nio.ByteBuffer   device,
             java.nio.ByteBuffer   queryPool,
             java.nio.ByteBuffer   pAllocator);/* 
     
     vkDestroyQueryPool(
                     (VkDevice) (device),
                     (VkQueryPool) (queryPool),
                     (const VkAllocationCallbacks*) pAllocator);

*/ 


     /////////////////////////////////////

/**
 *  Vulkan procedure ID: 50
 * <h2>Prototype</h2><pre>
 *  VkResult  vkGetQueryPoolResults(
 *     VkDevice                                    device,
 *     VkQueryPool                                 queryPool,
 *     uint32_t                                    firstQuery,
 *     uint32_t                                    queryCount,
 *     size_t                                      dataSize,
 *     void*                                       pData,
 *     VkDeviceSize                                stride,
 *     VkQueryResultFlags                          flags);
 * </pre>
 * 
 * @param device - 
 * @param queryPool - 
 * @param firstQuery - 
 * @param queryCount - 
 * @param dataSize - 
 * @param pData - 
 * @param stride - 
 * @param flags - 
 * 
 * @return VkResult
 */
    public static VkResult vkGetQueryPoolResults(
             VkDevice device,
             VkQueryPool queryPool,
             int firstQuery,
             int queryCount,
             long dataSize,
             java.nio.Buffer pData,
             long stride,
             int flags){
     
     // pData must respect Buffers position
     Buffer pData2 = (pData.position() == 0)? pData : slice(pData);
     int  _val = vkGetQueryPoolResults0(
                     (device==null ? null : device.getPointer()) /* ByteBuffer */ ,
                     (queryPool==null ? null : queryPool.getPointer()) /* ByteBuffer */ ,
                     firstQuery ,
                     queryCount ,
                     dataSize ,
                     pData2,
                     stride ,
                     flags  );
      return VkResult.fromValue(_val);
} 

/**
 * Slice a buffer at current position
 * @param b - buffer to slice
 * @return sliced buffer
 */
 private static final Buffer slice(Buffer b){
     if(b==null) return null;
     if(b.position()==0) return b;
     
     if(b instanceof java.nio.IntBuffer) return ((java.nio.IntBuffer)b).slice();
     if(b instanceof java.nio.LongBuffer) return ((java.nio.LongBuffer)b).slice();
     if(b instanceof java.nio.ByteBuffer) return ((java.nio.LongBuffer)b).slice();
     if(b instanceof java.nio.FloatBuffer) return ((java.nio.FloatBuffer)b).slice();
     if(b instanceof java.nio.CharBuffer) return ((java.nio.CharBuffer)b).slice();
     if(b instanceof java.nio.DoubleBuffer) return ((java.nio.DoubleBuffer)b).slice();
          
     return b;
 }

/**
 *  Native interface for Vulkan method #50
 *  vkGetQueryPoolResults 
 * 
 * @param device - 
 * @param queryPool - 
 * @param firstQuery - 
 * @param queryCount - 
 * @param dataSize - 
 * @param pData - 
 * @param stride - 
 * @param flags - 
 * 
 * @return VkResult as int  
 */
 private static native int  vkGetQueryPoolResults0(
             java.nio.ByteBuffer   device,
             java.nio.ByteBuffer   queryPool,
             int  firstQuery,
             int  queryCount,
             long  dataSize,
             java.nio.Buffer  pData,
             long  stride,
             int  flags);/* 

     VkResult res = vkGetQueryPoolResults(
                     (VkDevice) (device),
                     (VkQueryPool) (queryPool),
                     (uint32_t) firstQuery,
                     (uint32_t) queryCount,
                     (size_t) dataSize,
                     (void*) pData,
                     (VkDeviceSize) stride,
                     (VkQueryResultFlags) flags);
      return (jint) res;
*/ 


     /////////////////////////////////////

/**
 *  Vulkan procedure ID: 51
 * <h2>Prototype</h2><pre>
 *  VkResult  vkCreateBuffer(
 *     VkDevice                                    device,
 *     const VkBufferCreateInfo*                   pCreateInfo,
 *     const VkAllocationCallbacks*                pAllocator,
 *     VkBuffer*                                   pBuffer);
 * </pre>
 * 
 * @param device - 
 * @param pCreateInfo - 
 * @param pAllocator - 
 * @param pBuffer - 
 * 
 * @return VkResult
 */
    public static VkResult vkCreateBuffer(
              VkDevice device,
              VkBufferCreateInfo  pCreateInfo,
              VkAllocationCallbacks  pAllocator,
              VkBuffer[]  pBuffer){
    
     int[] result = {0};     
     ByteBuffer handle = vkCreateBuffer0(
                     (device==null ? null : device.getPointer()) /* ByteBuffer */ ,
                     (pCreateInfo==null ? null : pCreateInfo.getPointer()) /* ByteBuffer */ ,
                     (pAllocator==null ? null : pAllocator.getPointer()) /* ByteBuffer */ ,
                     result);   
     pBuffer[0] = new VkHandle(handle);    
     return VkResult.fromValue(result[0]);
} 

/**
 *  Native interface for Vulkan method #51
 *  vkCreateBuffer 
 * 
 * @param device - 
 * @param pCreateInfo - 
 * @param pAllocator - 
 * @param pBuffer - 
 * 
 * @return VkResult as int  
 */
 private static native ByteBuffer vkCreateBuffer0(
             java.nio.ByteBuffer   device,
             java.nio.ByteBuffer   pCreateInfo,
             java.nio.ByteBuffer   pAllocator,             
             int[] result);/*        
     VkBuffer* pBuffer = new VkBuffer[1];         
     VkResult res = vkCreateBuffer(
                     (VkDevice) (device),
                     (const VkBufferCreateInfo*) pCreateInfo,
                     (const VkAllocationCallbacks*) pAllocator,
                     (VkBuffer*) pBuffer);
      result[0] = res;
      jobject buffer=NULL;
      if(res >= 0 && pBuffer){ 
            VkBuffer obj = pBuffer[0];     
            buffer = (jobject)(env->NewDirectByteBuffer((void*)(obj), sizeof(VkBuffer)));
      }
      if(pBuffer)
        delete[] pBuffer;
        
      return buffer;
*/ 


     /////////////////////////////////////

/**
 *  Vulkan procedure ID: 52
 * <h2>Prototype</h2><pre>
 *  void  vkDestroyBuffer(
 *     VkDevice                                    device,
 *     VkBuffer                                    buffer,
 *     const VkAllocationCallbacks*                pAllocator);
 * </pre>
 * 
 * @param device - 
 * @param buffer - 
 * @param pAllocator - 
 */
    public static void  vkDestroyBuffer(
             VkDevice device,
             VkBuffer buffer,
             VkAllocationCallbacks  pAllocator){
     vkDestroyBuffer0(
             (device==null ? null : device.getPointer()) /* ByteBuffer */ ,
             (buffer==null ? null : buffer.getPointer()) /* ByteBuffer */ ,
             (pAllocator==null ? null : pAllocator.getPointer()) /* ByteBuffer */  );

} 

/**
 *  Native interface for Vulkan method #52
 *  vkDestroyBuffer 
 * 
 * @param device - 
 * @param buffer - 
 * @param pAllocator - 
 */
 private static native void vkDestroyBuffer0(
             java.nio.ByteBuffer   device,
             java.nio.ByteBuffer   buffer,
             java.nio.ByteBuffer   pAllocator);/*
     vkDestroyBuffer(
                     (VkDevice) (device),
                     (VkBuffer) (buffer),
                     (const VkAllocationCallbacks*) pAllocator);

*/ 


     /////////////////////////////////////

/**
 *  Vulkan procedure ID: 53
 * <h2>Prototype</h2><pre>
 *  VkResult  vkCreateBufferView(
 *     VkDevice                                    device,
 *     const VkBufferViewCreateInfo*               pCreateInfo,
 *     const VkAllocationCallbacks*                pAllocator,
 *     VkBufferView*                               pView);
 * </pre>
 * 
 * @param device - 
 * @param pCreateInfo - 
 * @param pAllocator - 
 * @param pView - 
 * 
 * @return VkResult
 */
    public static VkResult vkCreateBufferView(
              VkDevice device,
              VkBufferViewCreateInfo  pCreateInfo,
              VkAllocationCallbacks  pAllocator,
              VkBufferView[]  pView){
    
     ByteBuffer[] buffer = new ByteBuffer[1];
     int  _val = vkCreateBufferView0(
                     (device==null ? null : device.getPointer()) /* ByteBuffer */ ,
                     (pCreateInfo==null ? null : pCreateInfo.getPointer()) /* ByteBuffer */ ,
                     (pAllocator==null ? null : pAllocator.getPointer()) /* ByteBuffer */ ,
                     buffer);
     
     ByteBuffer handle = buffer[0]; 
     buffer[0] = null;
     pView[0] = new VkHandle(handle);        
     return VkResult.fromValue(_val);
} 

/**
 *  Native interface for Vulkan method #53
 *  vkCreateBufferView 
 * 
 * @param device - 
 * @param pCreateInfo - 
 * @param pAllocator - 
 * @param pView - 
 * 
 * @return VkResult as int  
 */
 private static native int  vkCreateBufferView0(
             java.nio.ByteBuffer   device,
             java.nio.ByteBuffer   pCreateInfo,
             java.nio.ByteBuffer   pAllocator,
             java.nio.ByteBuffer[]   retView);/* 
        
     VkBufferView* pView = new VkBufferView[1] ;
     
     VkResult res = vkCreateBufferView(
                     (VkDevice) (device),
                     (const VkBufferViewCreateInfo*) pCreateInfo,
                     (const VkAllocationCallbacks*) pAllocator,
                     (VkBufferView*) pView);
                     
      if(res>= 0 && pView){
         VkBufferView obj = pView[0];
         jobject buffer = env->NewDirectByteBuffer((void *)obj, sizeof(VkBufferView));        
         env->SetObjectArrayElement(retView, 0, buffer);
       }
       if(pView)
          delete[] pView; 
                     
      return (jint) res;
*/ 


     /////////////////////////////////////

/**
 *  Vulkan procedure ID: 54
 * <h2>Prototype</h2><pre>
 *  void  vkDestroyBufferView(
 *     VkDevice                                    device,
 *     VkBufferView                                bufferView,
 *     const VkAllocationCallbacks*                pAllocator);
 * </pre>
 * 
 * @param device - 
 * @param bufferView - 
 * @param pAllocator - 
 */
    public static void  vkDestroyBufferView(
             VkDevice device,
             VkBufferView bufferView,
              VkAllocationCallbacks  pAllocator){
     vkDestroyBufferView0(
             (device==null ? null : device.getPointer()) /* ByteBuffer */ ,
             (bufferView==null ? null : bufferView.getPointer()) /* ByteBuffer */ ,
             (pAllocator==null ? null : pAllocator.getPointer()) /* ByteBuffer */  );

} 

/**
 *  Native interface for Vulkan method #54
 *  vkDestroyBufferView 
 * 
 * @param device - 
 * @param bufferView - 
 * @param pAllocator - 
 */
 private static native void vkDestroyBufferView0(
             java.nio.ByteBuffer   device,
             java.nio.ByteBuffer   bufferView,
             java.nio.ByteBuffer   pAllocator);/* 

     vkDestroyBufferView(
                     (VkDevice) (device),
                     (VkBufferView) bufferView,
                     (const VkAllocationCallbacks*) pAllocator);

*/ 


     /////////////////////////////////////

/**
 *  Vulkan procedure ID: 55
 * <h2>Prototype</h2><pre>
 *  VkResult  vkCreateImage(
 *     VkDevice                                    device,
 *     const VkImageCreateInfo*                    pCreateInfo,
 *     const VkAllocationCallbacks*                pAllocator,
 *     VkImage*                                    pImage);
 * </pre>
 * 
 * @param device - 
 * @param pCreateInfo - 
 * @param pAllocator - 
 * @param pImage - 
 * 
 * @return VkResult
 */
    public static VkResult vkCreateImage(
             VkDevice device,
              VkImageCreateInfo  pCreateInfo,
              VkAllocationCallbacks  pAllocator,
              VkImage[]  pImage){
    
     ByteBuffer[] buff = new ByteBuffer[1];
     int  _val = vkCreateImage0(
                     (device==null ? null : device.getPointer()) /* ByteBuffer */ ,
                     (pCreateInfo==null ? null : pCreateInfo.getPointer()) /* ByteBuffer */ ,
                     (pAllocator==null ? null : pAllocator.getPointer()) /* ByteBuffer */ ,
                      buff);
      return VkResult.fromValue(_val);
} 

/**
 *  Native interface for Vulkan method #55
 *  vkCreateImage 
 * 
 * @param device - 
 * @param pCreateInfo - 
 * @param pAllocator - 
 * @param pImage - 
 * 
 * @return VkResult as int  
 */
 private static native int  vkCreateImage0(
             java.nio.ByteBuffer   device,
             java.nio.ByteBuffer   pCreateInfo,
             java.nio.ByteBuffer   pAllocator,
             java.nio.ByteBuffer[]   pImage);/* 
     
     VkImage* array = new VkImage[1];     
     VkResult res = vkCreateImage(
                     (VkDevice) (device),
                     (const VkImageCreateInfo*) pCreateInfo,
                     (const VkAllocationCallbacks*) pAllocator,
                     (VkImage*) array);
                     
       if(res>=0 && pImage){
          VkImage obj = array[0];
          jobject buffer = env->NewDirectByteBuffer((void*)obj, sizeof(VkImage));
          env->SetObjectArrayElement(pImage, 0 , buffer);
       } 
                    
       if(array)
         delete[] array;
         
      return (jint) res;
*/ 


     /////////////////////////////////////

/**
 *  Vulkan procedure ID: 56
 * <h2>Prototype</h2><pre>
 *  void  vkDestroyImage(
 *     VkDevice                                    device,
 *     VkImage                                     image,
 *     const VkAllocationCallbacks*                pAllocator);
 * </pre>
 * 
 * @param device - 
 * @param image - 
 * @param pAllocator - 
 */
    public static void  vkDestroyImage(
             VkDevice device,
             VkImage image,
              VkAllocationCallbacks  pAllocator){
     vkDestroyImage0(
             (device==null ? null : device.getPointer()) /* ByteBuffer */ ,
             (image==null ? null : image.getPointer()) /* ByteBuffer */ ,
             (pAllocator==null ? null : pAllocator.getPointer()) /* ByteBuffer */  );

} 

/**
 *  Native interface for Vulkan method #56
 *  vkDestroyImage 
 * 
 * @param device - 
 * @param image - 
 * @param pAllocator - 
 */
 private static native void vkDestroyImage0(
             java.nio.ByteBuffer   device,
             java.nio.ByteBuffer   image,
             java.nio.ByteBuffer   pAllocator);/* 

     vkDestroyImage(
                     (VkDevice) (device),
                     (VkImage) image,
                     (const VkAllocationCallbacks*) pAllocator);

*/ 


     /////////////////////////////////////

/**
 *  Vulkan procedure ID: 57
 * <h2>Prototype</h2><pre>
 *  void  vkGetImageSubresourceLayout(
 *     VkDevice                                    device,
 *     VkImage                                     image,
 *     const VkImageSubresource*                   pSubresource,
 *     VkSubresourceLayout*                        pLayout);
 * </pre>
 * 
 * @param device - 
 * @param image - 
 * @param pSubresource - 
 * @param pLayout - 
 */
    public static void  vkGetImageSubresourceLayout(
             VkDevice device,
             VkImage image,
              VkImageSubresource  pSubresource,
              VkSubresourceLayout  pLayout){
     vkGetImageSubresourceLayout0(
             (device==null ? null : device.getPointer()) /* ByteBuffer */ ,
             (image==null ? null : image.getPointer()) /* ByteBuffer */ ,
             (pSubresource==null ? null : pSubresource.getPointer()) /* ByteBuffer */ ,
             (pLayout==null ? null : pLayout.getPointer()) /* ByteBuffer */  );

} 

/**
 *  Native interface for Vulkan method #57
 *  vkGetImageSubresourceLayout 
 * 
 * @param device - 
 * @param image - 
 * @param pSubresource - 
 * @param pLayout - 
 */
 private static native void vkGetImageSubresourceLayout0(
             java.nio.ByteBuffer   device,
             java.nio.ByteBuffer   image,
             java.nio.ByteBuffer   pSubresource,
             java.nio.ByteBuffer   pLayout);/* 
     
     
     vkGetImageSubresourceLayout(
                     (VkDevice) (device),
                     (VkImage) image,
                     (const VkImageSubresource*) pSubresource,
                     (VkSubresourceLayout*) pLayout);

*/ 


     /////////////////////////////////////

/**
 *  Vulkan procedure ID: 58
 * <h2>Prototype</h2><pre>
 *  VkResult  vkCreateImageView(
 *     VkDevice                                    device,
 *     const VkImageViewCreateInfo*                pCreateInfo,
 *     const VkAllocationCallbacks*                pAllocator,
 *     VkImageView*                                pView);
 * </pre>
 * 
 * @param device - 
 * @param pCreateInfo - 
 * @param pAllocator - 
 * @param pView - 
 * 
 * @return VkResult
 */
    public static VkResult vkCreateImageView(
             VkDevice device,
              VkImageViewCreateInfo  pCreateInfo,
              VkAllocationCallbacks  pAllocator,
              VkImageView  pView){
     int  _val = vkCreateImageView0(
                     (device==null ? null : device.getPointer()) /* ByteBuffer */ ,
                     (pCreateInfo==null ? null : pCreateInfo.getPointer()) /* ByteBuffer */ ,
                     (pAllocator==null ? null : pAllocator.getPointer()) /* ByteBuffer */ ,
                     (pView==null ? null : pView.getPointer()) /* ByteBuffer */  );
      return VkResult.fromValue(_val);
} 

/**
 *  Native interface for Vulkan method #58
 *  vkCreateImageView 
 * 
 * @param device - 
 * @param pCreateInfo - 
 * @param pAllocator - 
 * @param pView - 
 * 
 * @return VkResult as int  
 */
 private static native int  vkCreateImageView0(
             java.nio.ByteBuffer   device,
             java.nio.ByteBuffer   pCreateInfo,
             java.nio.ByteBuffer   pAllocator,
             java.nio.ByteBuffer   pView);/* 
     
     VkResult res = vkCreateImageView(
                     (VkDevice) (device),
                     (const VkImageViewCreateInfo*) pCreateInfo,
                     (const VkAllocationCallbacks*) pAllocator,
                     (VkImageView*) pView);
      return (jint) res;
*/ 


     /////////////////////////////////////

/**
 *  Vulkan procedure ID: 59
 * <h2>Prototype</h2><pre>
 *  void  vkDestroyImageView(
 *     VkDevice                                    device,
 *     VkImageView                                 imageView,
 *     const VkAllocationCallbacks*                pAllocator);
 * </pre>
 * 
 * @param device - 
 * @param imageView - 
 * @param pAllocator - 
 */
    public static void  vkDestroyImageView(
             VkDevice device,
             VkImageView imageView,
              VkAllocationCallbacks  pAllocator){
     vkDestroyImageView0(
             (device==null ? null : device.getPointer()) /* ByteBuffer */ ,
             (imageView==null ? null : imageView.getPointer()) /* ByteBuffer */ ,
             (pAllocator==null ? null : pAllocator.getPointer()) /* ByteBuffer */  );

} 

/**
 *  Native interface for Vulkan method #59
 *  vkDestroyImageView 
 * 
 * @param device - 
 * @param imageView - 
 * @param pAllocator - 
 */
 private static native void vkDestroyImageView0(
             java.nio.ByteBuffer   device,
             java.nio.ByteBuffer   imageView,
             java.nio.ByteBuffer   pAllocator);/* 
    
     vkDestroyImageView(
                     (VkDevice) (device),
                     (VkImageView) (imageView),
                     (const VkAllocationCallbacks*) pAllocator);

*/ 


     /////////////////////////////////////

/**
 *  Vulkan procedure ID: 60
 * <h2>Prototype</h2><pre>
 *  VkResult  vkCreateShaderModule(
 *     VkDevice                                    device,
 *     const VkShaderModuleCreateInfo*             pCreateInfo,
 *     const VkAllocationCallbacks*                pAllocator,
 *     VkShaderModule*                             pShaderModule);
 * </pre>
 * 
 * @param device - 
 * @param pCreateInfo - 
 * @param pAllocator - 
 * @param pShaderModule - 
 * 
 * @return VkResult
 */
    public static VkResult vkCreateShaderModule(
             VkDevice device,
              VkShaderModuleCreateInfo  pCreateInfo,
              VkAllocationCallbacks  pAllocator,
              VkShaderModule  pShaderModule){
     int  _val = vkCreateShaderModule0(
                     (device==null ? null : device.getPointer()) /* ByteBuffer */ ,
                     (pCreateInfo==null ? null : pCreateInfo.getPointer()) /* ByteBuffer */ ,
                     (pAllocator==null ? null : pAllocator.getPointer()) /* ByteBuffer */ ,
                     (pShaderModule==null ? null : pShaderModule.getPointer()) /* ByteBuffer */  );
      return VkResult.fromValue(_val);
} 

/**
 *  Native interface for Vulkan method #60
 *  vkCreateShaderModule 
 * 
 * @param device - 
 * @param pCreateInfo - 
 * @param pAllocator - 
 * @param pShaderModule - 
 * 
 * @return VkResult as int  
 */
 private static native int  vkCreateShaderModule0(
             java.nio.ByteBuffer   device,
             java.nio.ByteBuffer   pCreateInfo,
             java.nio.ByteBuffer   pAllocator,
             java.nio.ByteBuffer   pShaderModule);/* 
     
     VkResult res = vkCreateShaderModule(
                     (VkDevice) (device),
                     (const VkShaderModuleCreateInfo*) pCreateInfo,
                     (const VkAllocationCallbacks*) pAllocator,
                     (VkShaderModule*) pShaderModule);
      return (jint) res;
*/ 


     /////////////////////////////////////

/**
 *  Vulkan procedure ID: 61
 * <h2>Prototype</h2><pre>
 *  void  vkDestroyShaderModule(
 *     VkDevice                                    device,
 *     VkShaderModule                              shaderModule,
 *     const VkAllocationCallbacks*                pAllocator);
 * </pre>
 * 
 * @param device - 
 * @param shaderModule - 
 * @param pAllocator - 
 */
    public static void  vkDestroyShaderModule(
             VkDevice device,
             VkShaderModule shaderModule,
              VkAllocationCallbacks  pAllocator){
     vkDestroyShaderModule0(
             (device==null ? null : device.getPointer()) /* ByteBuffer */ ,
             (shaderModule==null ? null : shaderModule.getPointer()) /* ByteBuffer */ ,
             (pAllocator==null ? null : pAllocator.getPointer()) /* ByteBuffer */  );

} 

/**
 *  Native interface for Vulkan method #61
 *  vkDestroyShaderModule 
 * 
 * @param device - 
 * @param shaderModule - 
 * @param pAllocator - 
 */
 private static native void vkDestroyShaderModule0(
             java.nio.ByteBuffer   device,
             java.nio.ByteBuffer   shaderModule,
             java.nio.ByteBuffer   pAllocator);/* 
   
     vkDestroyShaderModule(
                     (VkDevice) (device),
                     (VkShaderModule) (shaderModule),
                     (const VkAllocationCallbacks*) pAllocator);

*/ 


     /////////////////////////////////////

/**
 *  Vulkan procedure ID: 62
 * <h2>Prototype</h2><pre>
 *  VkResult  vkCreatePipelineCache(
 *     VkDevice                                    device,
 *     const VkPipelineCacheCreateInfo*            pCreateInfo,
 *     const VkAllocationCallbacks*                pAllocator,
 *     VkPipelineCache*                            pPipelineCache);
 * </pre>
 * 
 * @param device - 
 * @param pCreateInfo - 
 * @param pAllocator - 
 * @param pPipelineCache - 
 * 
 * @return VkResult
 */
    public static VkResult vkCreatePipelineCache(
             VkDevice device,
              VkPipelineCacheCreateInfo  pCreateInfo,
              VkAllocationCallbacks  pAllocator,
              VkPipelineCache  pPipelineCache){
     int  _val = vkCreatePipelineCache0(
                     (device==null ? null : device.getPointer()) /* ByteBuffer */ ,
                     (pCreateInfo==null ? null : pCreateInfo.getPointer()) /* ByteBuffer */ ,
                     (pAllocator==null ? null : pAllocator.getPointer()) /* ByteBuffer */ ,
                     (pPipelineCache==null ? null : pPipelineCache.getPointer()) /* ByteBuffer */  );
      return VkResult.fromValue(_val);
} 

/**
 *  Native interface for Vulkan method #62
 *  vkCreatePipelineCache 
 * 
 * @param device - 
 * @param pCreateInfo - 
 * @param pAllocator - 
 * @param pPipelineCache - 
 * 
 * @return VkResult as int  
 */
 private static native int  vkCreatePipelineCache0(
             java.nio.ByteBuffer   device,
             java.nio.ByteBuffer   pCreateInfo,
             java.nio.ByteBuffer   pAllocator,
             java.nio.ByteBuffer   pPipelineCache);/* 
     
     VkResult res = vkCreatePipelineCache(
                     (VkDevice) (device),
                     (const VkPipelineCacheCreateInfo*) pCreateInfo,
                     (const VkAllocationCallbacks*) pAllocator,
                     (VkPipelineCache*) pPipelineCache);
      return (jint) res;
*/ 


     /////////////////////////////////////

/**
 *  Vulkan procedure ID: 63
 * <h2>Prototype</h2><pre>
 *  void  vkDestroyPipelineCache(
 *     VkDevice                                    device,
 *     VkPipelineCache                             pipelineCache,
 *     const VkAllocationCallbacks*                pAllocator);
 * </pre>
 * 
 * @param device - 
 * @param pipelineCache - 
 * @param pAllocator - 
 */
    public static void  vkDestroyPipelineCache(
             VkDevice device,
             VkPipelineCache pipelineCache,
              VkAllocationCallbacks  pAllocator){
     vkDestroyPipelineCache0(
             (device==null ? null : device.getPointer()) /* ByteBuffer */ ,
             (pipelineCache==null ? null : pipelineCache.getPointer()) /* ByteBuffer */ ,
             (pAllocator==null ? null : pAllocator.getPointer()) /* ByteBuffer */  );

} 

/**
 *  Native interface for Vulkan method #63
 *  vkDestroyPipelineCache 
 * 
 * @param device - 
 * @param pipelineCache - 
 * @param pAllocator - 
 */
 private static native void vkDestroyPipelineCache0(
             java.nio.ByteBuffer   device,
             java.nio.ByteBuffer   pipelineCache,
             java.nio.ByteBuffer   pAllocator);/* 
     
     
     vkDestroyPipelineCache(
                     (VkDevice) (device),
                     (VkPipelineCache) pipelineCache,
                     (const VkAllocationCallbacks*) pAllocator);

*/ 


     /////////////////////////////////////

/**
 *  Vulkan procedure ID: 64
 * <h2>Prototype</h2><pre>
 *  VkResult  vkGetPipelineCacheData(
 *     VkDevice                                    device,
 *     VkPipelineCache                             pipelineCache,
 *     size_t*                                     pDataSize,
 *     void*                                       pData);
 * </pre>
 * 
 * @param device - 
 * @param pipelineCache - 
 * @param pDataSize - 
 * @param pData - 
 * 
 * @return VkResult
 */
    public static VkResult vkGetPipelineCacheData(
             VkDevice device,
             VkPipelineCache pipelineCache,
             long[] pDataSize,
             java.nio.Buffer pData){
     int  _val = vkGetPipelineCacheData0(
                     (device==null ? null : device.getPointer()) /* ByteBuffer */ ,
                     (pipelineCache==null ? null : pipelineCache.getPointer()) /* ByteBuffer */ ,
                     pDataSize ,
                     pData  );
      return VkResult.fromValue(_val);
} 

/**
 *  Native interface for Vulkan method #64
 *  vkGetPipelineCacheData 
 * 
 * @param device - 
 * @param pipelineCache - 
 * @param pDataSize - 
 * @param pData - 
 * 
 * @return VkResult as int  
 */
 private static native int  vkGetPipelineCacheData0(
             java.nio.ByteBuffer   device,
             java.nio.ByteBuffer   pipelineCache,
             long[]  pDataSize,
             java.nio.Buffer  pData);/* 
     
     
     VkResult res = vkGetPipelineCacheData(
                     (VkDevice) (device),
                     (VkPipelineCache) pipelineCache,
                     (size_t*) pDataSize,
                     (void*) pData);
      return (jint) res;
*/ 


     /////////////////////////////////////

/**
 *  Vulkan procedure ID: 65
 * <h2>Prototype</h2><pre>
 *  VkResult  vkMergePipelineCaches(
 *     VkDevice                                    device,
 *     VkPipelineCache                             dstCache,
 *     uint32_t                                    srcCacheCount,
 *     const VkPipelineCache*                      pSrcCaches);
 * </pre>
 * 
 * @param device - 
 * @param dstCache - 
 * @param srcCacheCount - 
 * @param pSrcCaches - 
 * 
 * @return VkResult
 */
    public static VkResult vkMergePipelineCaches(
             VkDevice device,
             VkPipelineCache dstCache,
             int srcCacheCount,
              VkPipelineCache  pSrcCaches){
     int  _val = vkMergePipelineCaches0(
                     (device==null ? null : device.getPointer()) /* ByteBuffer */ ,
                     (dstCache==null ? null : dstCache.getPointer()) /* ByteBuffer */ ,
                     srcCacheCount ,
                     (pSrcCaches==null ? null : pSrcCaches.getPointer()) /* ByteBuffer */  );
      return VkResult.fromValue(_val);
} 

/**
 *  Native interface for Vulkan method #65
 *  vkMergePipelineCaches 
 * 
 * @param device - 
 * @param dstCache - 
 * @param srcCacheCount - 
 * @param pSrcCaches - 
 * 
 * @return VkResult as int  
 */
 private static native int  vkMergePipelineCaches0(
             java.nio.ByteBuffer   device,
             java.nio.ByteBuffer   dstCache,
             int  srcCacheCount,
             java.nio.ByteBuffer   pSrcCaches);/* 

     VkResult res = vkMergePipelineCaches(
                     (VkDevice) (device),
                     (VkPipelineCache) (dstCache),
                     (uint32_t) srcCacheCount,
                     (const VkPipelineCache*) pSrcCaches);
      return (jint) res;
*/ 


     /////////////////////////////////////

/**
 *  Vulkan procedure ID: 66
 * <h2>Prototype</h2><pre>
 *  VkResult  vkCreateGraphicsPipelines(
 *     VkDevice                                    device,
 *     VkPipelineCache                             pipelineCache,
 *     uint32_t                                    createInfoCount,
 *     const VkGraphicsPipelineCreateInfo*         pCreateInfos,
 *     const VkAllocationCallbacks*                pAllocator,
 *     VkPipeline*                                 pPipelines);
 * </pre>
 * 
 * @param device - 
 * @param pipelineCache - 
 * @param createInfoCount - 
 * @param pCreateInfos - 
 * @param pAllocator - 
 * @param pPipelines - 
 * 
 * @return VkResult
 */
    public static VkResult vkCreateGraphicsPipelines(
             VkDevice device,
             VkPipelineCache pipelineCache,
             int createInfoCount,
              VkGraphicsPipelineCreateInfo  pCreateInfos,
              VkAllocationCallbacks  pAllocator,
              VkPipeline  pPipelines){
     int  _val = vkCreateGraphicsPipelines0(
                     (device==null ? null : device.getPointer()) /* ByteBuffer */ ,
                     (pipelineCache==null ? null : pipelineCache.getPointer()) /* ByteBuffer */ ,
                     createInfoCount ,
                     (pCreateInfos==null ? null : pCreateInfos.getPointer()) /* ByteBuffer */ ,
                     (pAllocator==null ? null : pAllocator.getPointer()) /* ByteBuffer */ ,
                     (pPipelines==null ? null : pPipelines.getPointer()) /* ByteBuffer */  );
      return VkResult.fromValue(_val);
} 

/**
 *  Native interface for Vulkan method #66
 *  vkCreateGraphicsPipelines 
 * 
 * @param device - 
 * @param pipelineCache - 
 * @param createInfoCount - 
 * @param pCreateInfos - 
 * @param pAllocator - 
 * @param pPipelines - 
 * 
 * @return VkResult as int  
 */
 private static native int  vkCreateGraphicsPipelines0(
             java.nio.ByteBuffer   device,
             java.nio.ByteBuffer   pipelineCache,
             int  createInfoCount,
             java.nio.ByteBuffer   pCreateInfos,
             java.nio.ByteBuffer   pAllocator,
             java.nio.ByteBuffer   pPipelines);/* 
     
     
     VkResult res = vkCreateGraphicsPipelines(
                     (VkDevice) (device),
                     (VkPipelineCache) pipelineCache,
                     (uint32_t) createInfoCount,
                     (const VkGraphicsPipelineCreateInfo*) pCreateInfos,
                     (const VkAllocationCallbacks*) pAllocator,
                     (VkPipeline*) pPipelines);
      return (jint) res;
*/ 


     /////////////////////////////////////

/**
 *  Vulkan procedure ID: 67
 * <h2>Prototype</h2><pre>
 *  VkResult  vkCreateComputePipelines(
 *     VkDevice                                    device,
 *     VkPipelineCache                             pipelineCache,
 *     uint32_t                                    createInfoCount,
 *     const VkComputePipelineCreateInfo*          pCreateInfos,
 *     const VkAllocationCallbacks*                pAllocator,
 *     VkPipeline*                                 pPipelines);
 * </pre>
 * 
 * @param device - 
 * @param pipelineCache - 
 * @param createInfoCount - 
 * @param pCreateInfos - 
 * @param pAllocator - 
 * @param pPipelines - 
 * 
 * @return VkResult
 */
    public static VkResult vkCreateComputePipelines(
             VkDevice device,
             VkPipelineCache pipelineCache,
             int createInfoCount,
              VkComputePipelineCreateInfo  pCreateInfos,
              VkAllocationCallbacks  pAllocator,
              VkPipeline  pPipelines){
     int  _val = vkCreateComputePipelines0(
                     (device==null ? null : device.getPointer()) /* ByteBuffer */ ,
                     (pipelineCache==null ? null : pipelineCache.getPointer()) /* ByteBuffer */ ,
                     createInfoCount ,
                     (pCreateInfos==null ? null : pCreateInfos.getPointer()) /* ByteBuffer */ ,
                     (pAllocator==null ? null : pAllocator.getPointer()) /* ByteBuffer */ ,
                     (pPipelines==null ? null : pPipelines.getPointer()) /* ByteBuffer */  );
      return VkResult.fromValue(_val);
} 

/**
 *  Native interface for Vulkan method #67
 *  vkCreateComputePipelines 
 * 
 * @param device - 
 * @param pipelineCache - 
 * @param createInfoCount - 
 * @param pCreateInfos - 
 * @param pAllocator - 
 * @param pPipelines - 
 * 
 * @return VkResult as int  
 */
 private static native int  vkCreateComputePipelines0(
             java.nio.ByteBuffer   device,
             java.nio.ByteBuffer   pipelineCache,
             int  createInfoCount,
             java.nio.ByteBuffer   pCreateInfos,
             java.nio.ByteBuffer   pAllocator,
             java.nio.ByteBuffer   pPipelines);/* 
     
     
     VkResult res = vkCreateComputePipelines(
                     (VkDevice) (device),
                     (VkPipelineCache) pipelineCache,
                     (uint32_t) createInfoCount,
                     (const VkComputePipelineCreateInfo*) pCreateInfos,
                     (const VkAllocationCallbacks*) pAllocator,
                     (VkPipeline*) pPipelines);
      return (jint) res;
*/ 


     /////////////////////////////////////

/**
 *  Vulkan procedure ID: 68
 * <h2>Prototype</h2><pre>
 *  void  vkDestroyPipeline(
 *     VkDevice                                    device,
 *     VkPipeline                                  pipeline,
 *     const VkAllocationCallbacks*                pAllocator);
 * </pre>
 * 
 * @param device - 
 * @param pipeline - 
 * @param pAllocator - 
 */
    public static void  vkDestroyPipeline(
             VkDevice device,
             VkPipeline pipeline,
              VkAllocationCallbacks  pAllocator){
     vkDestroyPipeline0(
             (device==null ? null : device.getPointer()) /* ByteBuffer */ ,
             (pipeline==null ? null : pipeline.getPointer()) /* ByteBuffer */ ,
             (pAllocator==null ? null : pAllocator.getPointer()) /* ByteBuffer */  );

} 

/**
 *  Native interface for Vulkan method #68
 *  vkDestroyPipeline 
 * 
 * @param device - 
 * @param pipeline - 
 * @param pAllocator - 
 */
 private static native void vkDestroyPipeline0(
             java.nio.ByteBuffer   device,
             java.nio.ByteBuffer   pipeline,
             java.nio.ByteBuffer   pAllocator);/* 
    
     vkDestroyPipeline(
                     (VkDevice) (device),
                     (VkPipeline) (pipeline),
                     (const VkAllocationCallbacks*) pAllocator);

*/ 


     /////////////////////////////////////

/**
 *  Vulkan procedure ID: 69
 * <h2>Prototype</h2><pre>
 *  VkResult  vkCreatePipelineLayout(
 *     VkDevice                                    device,
 *     const VkPipelineLayoutCreateInfo*           pCreateInfo,
 *     const VkAllocationCallbacks*                pAllocator,
 *     VkPipelineLayout*                           pPipelineLayout);
 * </pre>
 * 
 * @param device - 
 * @param pCreateInfo - 
 * @param pAllocator - 
 * @param pPipelineLayout - 
 * 
 * @return VkResult
 */
    public static VkResult vkCreatePipelineLayout(
             VkDevice device,
              VkPipelineLayoutCreateInfo  pCreateInfo,
              VkAllocationCallbacks  pAllocator,
              VkPipelineLayout  pPipelineLayout){
     int  _val = vkCreatePipelineLayout0(
                     (device==null ? null : device.getPointer()) /* ByteBuffer */ ,
                     (pCreateInfo==null ? null : pCreateInfo.getPointer()) /* ByteBuffer */ ,
                     (pAllocator==null ? null : pAllocator.getPointer()) /* ByteBuffer */ ,
                     (pPipelineLayout==null ? null : pPipelineLayout.getPointer()) /* ByteBuffer */  );
      return VkResult.fromValue(_val);
} 

/**
 *  Native interface for Vulkan method #69
 *  vkCreatePipelineLayout 
 * 
 * @param device - 
 * @param pCreateInfo - 
 * @param pAllocator - 
 * @param pPipelineLayout - 
 * 
 * @return VkResult as int  
 */
 private static native int  vkCreatePipelineLayout0(
             java.nio.ByteBuffer   device,
             java.nio.ByteBuffer   pCreateInfo,
             java.nio.ByteBuffer   pAllocator,
             java.nio.ByteBuffer   pPipelineLayout);/* 
     
     VkResult res = vkCreatePipelineLayout(
                     (VkDevice) (device),
                     (const VkPipelineLayoutCreateInfo*) pCreateInfo,
                     (const VkAllocationCallbacks*) pAllocator,
                     (VkPipelineLayout*) pPipelineLayout);
      return (jint) res;
*/ 


     /////////////////////////////////////

/**
 *  Vulkan procedure ID: 70
 * <h2>Prototype</h2><pre>
 *  void  vkDestroyPipelineLayout(
 *     VkDevice                                    device,
 *     VkPipelineLayout                            pipelineLayout,
 *     const VkAllocationCallbacks*                pAllocator);
 * </pre>
 * 
 * @param device - 
 * @param pipelineLayout - 
 * @param pAllocator - 
 */
    public static void  vkDestroyPipelineLayout(
             VkDevice device,
             VkPipelineLayout pipelineLayout,
              VkAllocationCallbacks  pAllocator){
     vkDestroyPipelineLayout0(
             (device==null ? null : device.getPointer()) /* ByteBuffer */ ,
             (pipelineLayout==null ? null : pipelineLayout.getPointer()) /* ByteBuffer */ ,
             (pAllocator==null ? null : pAllocator.getPointer()) /* ByteBuffer */  );

} 

/**
 *  Native interface for Vulkan method #70
 *  vkDestroyPipelineLayout 
 * 
 * @param device - 
 * @param pipelineLayout - 
 * @param pAllocator - 
 */
 private static native void vkDestroyPipelineLayout0(
             java.nio.ByteBuffer   device,
             java.nio.ByteBuffer   pipelineLayout,
             java.nio.ByteBuffer   pAllocator);/* 
   
     vkDestroyPipelineLayout(
                     (VkDevice) (device),
                     (VkPipelineLayout) (pipelineLayout),
                     (const VkAllocationCallbacks*) pAllocator);

*/ 


     /////////////////////////////////////

/**
 *  Vulkan procedure ID: 71
 * <h2>Prototype</h2><pre>
 *  VkResult  vkCreateSampler(
 *     VkDevice                                    device,
 *     const VkSamplerCreateInfo*                  pCreateInfo,
 *     const VkAllocationCallbacks*                pAllocator,
 *     VkSampler*                                  pSampler);
 * </pre>
 * 
 * @param device - 
 * @param pCreateInfo - 
 * @param pAllocator - 
 * @param pSampler - 
 * 
 * @return VkResult
 */
    public static VkResult vkCreateSampler(
             VkDevice device,
              VkSamplerCreateInfo  pCreateInfo,
              VkAllocationCallbacks  pAllocator,
              VkSampler[]  pSampler){
     ByteBuffer[] buff = new ByteBuffer[1];
     int  _val = vkCreateSampler0(
                     (device==null ? null : device.getPointer()) /* ByteBuffer */ ,
                     (pCreateInfo==null ? null : pCreateInfo.getPointer()) /* ByteBuffer */ ,
                     (pAllocator==null ? null : pAllocator.getPointer()) /* ByteBuffer */ ,
                     buff);
     
      pSampler[0] = wrapClean(buff);
      
      return VkResult.fromValue(_val);
} 

/**
 *  Native interface for Vulkan method #71
 *  vkCreateSampler 
 * 
 * @param device - 
 * @param pCreateInfo - 
 * @param pAllocator - 
 * @param pSampler - 
 * 
 * @return VkResult as int  
 */
 private static native int  vkCreateSampler0(
             java.nio.ByteBuffer   device,
             java.nio.ByteBuffer   pCreateInfo,
             java.nio.ByteBuffer   pAllocator,
             java.nio.ByteBuffer[]   pSampler);/*
              
     VkSampler* array = new VkSampler[1];
     VkResult res = vkCreateSampler(
                     (VkDevice) (device),
                     (const VkSamplerCreateInfo*) pCreateInfo,
                     (const VkAllocationCallbacks*) pAllocator,
                     (VkSampler*) array);
                     
      if(res>=0){
          VkSampler obj = array[0];
          jobject buff = (jobject)(env->NewDirectByteBuffer((void*)obj, sizeof(VkSampler)));
          env->SetObjectArrayElement(pSampler ,0, buff);
       }
       if(array) delete[] array;    
                  
      return (jint) res;
*/ 


     /////////////////////////////////////

/**
 *  Vulkan procedure ID: 72
 * <h2>Prototype</h2><pre>
 *  void  vkDestroySampler(
 *     VkDevice                                    device,
 *     VkSampler                                   sampler,
 *     const VkAllocationCallbacks*                pAllocator);
 * </pre>
 * 
 * @param device - 
 * @param sampler - 
 * @param pAllocator - 
 */
    public static void  vkDestroySampler(
             VkDevice device,
             VkSampler sampler,
              VkAllocationCallbacks  pAllocator){
     vkDestroySampler0(
             (device==null ? null : device.getPointer()) /* ByteBuffer */ ,
             (sampler==null ? null : sampler.getPointer()) /* ByteBuffer */ ,
             (pAllocator==null ? null : pAllocator.getPointer()) /* ByteBuffer */  );

} 

/**
 *  Native interface for Vulkan method #72
 *  vkDestroySampler 
 * 
 * @param device - 
 * @param sampler - 
 * @param pAllocator - 
 */
 private static native void vkDestroySampler0(
             java.nio.ByteBuffer   device,
             java.nio.ByteBuffer   sampler,
             java.nio.ByteBuffer   pAllocator);/* 
     vkDestroySampler(
                     (VkDevice) (device),
                     (VkSampler) (sampler),
                     (const VkAllocationCallbacks*) pAllocator);
*/ 



/**
 *  Vulkan procedure ID: 73
 * <h2>Prototype</h2><pre>
 *  VkResult  vkCreateDescriptorSetLayout(
 *     VkDevice                                    device,
 *     const VkDescriptorSetLayoutCreateInfo*      pCreateInfo,
 *     const VkAllocationCallbacks*                pAllocator,
 *     VkDescriptorSetLayout*                      pSetLayout);
 * </pre>
 * 
 * @param device - 
 * @param pCreateInfo - 
 * @param pAllocator - 
 * @param pSetLayout - 
 * 
 * @return VkResult
 */
    public static VkResult vkCreateDescriptorSetLayout(
              VkDevice device,
              VkDescriptorSetLayoutCreateInfo  pCreateInfo,
              VkAllocationCallbacks  pAllocator,
              VkDescriptorSetLayout[]  pSetLayout){
     ByteBuffer[] buff = new ByteBuffer[1];
     int  _val = vkCreateDescriptorSetLayout0(
                     (device==null ? null : device.getPointer()) /* ByteBuffer */ ,
                     (pCreateInfo==null ? null : pCreateInfo.getPointer()) /* ByteBuffer */ ,
                     (pAllocator==null ? null : pAllocator.getPointer()) /* ByteBuffer */ ,
                     buff);
     
     pSetLayout[0] = wrapClean(buff);
     return VkResult.fromValue(_val);
} 

/**
 *  Native interface for Vulkan method #73
 *  vkCreateDescriptorSetLayout 
 * 
 * @param device - 
 * @param pCreateInfo - 
 * @param pAllocator - 
 * @param pSetLayout - 
 * 
 * @return VkResult as int  
 */
 private static native int  vkCreateDescriptorSetLayout0(
             java.nio.ByteBuffer   device,
             java.nio.ByteBuffer   pCreateInfo,
             java.nio.ByteBuffer   pAllocator,
             java.nio.ByteBuffer[]   pSetLayout);/* 
             
     VkDescriptorSetLayout* array = new VkDescriptorSetLayout;
     VkResult res = vkCreateDescriptorSetLayout(
                     (VkDevice) (device),
                     (const VkDescriptorSetLayoutCreateInfo*) pCreateInfo,
                     (const VkAllocationCallbacks*) pAllocator,
                     (VkDescriptorSetLayout*) array);
      
      if(res>=0){
          VkDescriptorSetLayout obj = array[0];
          jobject buff = (jobject)(env->NewDirectByteBuffer((void*)obj, sizeof(VkDescriptorSetLayout)));
          env->SetObjectArrayElement(pSetLayout ,0, buff);
       }else{
           delete array;
       }
      return (jint) res;
*/ 


/**
 *  Vulkan procedure ID: 74
 * <h2>Prototype</h2><pre>
 *  void  vkDestroyDescriptorSetLayout(
 *     VkDevice                                    device,
 *     VkDescriptorSetLayout                       descriptorSetLayout,
 *     const VkAllocationCallbacks*                pAllocator);
 * </pre>
 * 
 * @param device - 
 * @param descriptorSetLayout - 
 * @param pAllocator - 
 */
    public static void  vkDestroyDescriptorSetLayout(
             VkDevice device,
             VkDescriptorSetLayout descriptorSetLayout,
              VkAllocationCallbacks  pAllocator){
     vkDestroyDescriptorSetLayout0(
             (device==null ? null : device.getPointer()) /* ByteBuffer */ ,
             (descriptorSetLayout==null ? null : descriptorSetLayout.getPointer()) /* ByteBuffer */ ,
             (pAllocator==null ? null : pAllocator.getPointer()) /* ByteBuffer */  );
} 

/**
 *  Native interface for Vulkan method #74
 *  vkDestroyDescriptorSetLayout 
 * 
 * @param device - 
 * @param descriptorSetLayout - 
 * @param pAllocator - 
 */
 private static native void vkDestroyDescriptorSetLayout0(
             java.nio.ByteBuffer   device,
             java.nio.ByteBuffer   descriptorSetLayout,
             java.nio.ByteBuffer   pAllocator);/* 
     vkDestroyDescriptorSetLayout(
                     (VkDevice) (device),
                     (VkDescriptorSetLayout) (descriptorSetLayout),
                     (const VkAllocationCallbacks*) pAllocator);
*/ 

/**
 *  Vulkan procedure ID: 75
 * <h2>Prototype</h2><pre>
 *  VkResult  vkCreateDescriptorPool(
 *     VkDevice                                    device,
 *     const VkDescriptorPoolCreateInfo*           pCreateInfo,
 *     const VkAllocationCallbacks*                pAllocator,
 *     VkDescriptorPool*                           pDescriptorPool);
 * </pre>
 * 
 * @param device - 
 * @param pCreateInfo - 
 * @param pAllocator - 
 * @param pDescriptorPool - 
 * 
 * @return VkResult
 */
    public static VkResult vkCreateDescriptorPool(
             VkDevice device,
              VkDescriptorPoolCreateInfo  pCreateInfo,
              VkAllocationCallbacks  pAllocator,
              VkDescriptorPool[]  pDescriptorPool){
    
     ByteBuffer[] buff = new ByteBuffer[1];
     int  _val = vkCreateDescriptorPool0(
                     (device==null ? null : device.getPointer()) /* ByteBuffer */ ,
                     (pCreateInfo==null ? null : pCreateInfo.getPointer()) /* ByteBuffer */ ,
                     (pAllocator==null ? null : pAllocator.getPointer()) /* ByteBuffer */ ,
                     buff);
     
     pDescriptorPool[0] = wrapClean(buff);
     return VkResult.fromValue(_val);
} 

/**
 *  Native interface for Vulkan method #75
 *  vkCreateDescriptorPool 
 * 
 * @param device - 
 * @param pCreateInfo - 
 * @param pAllocator - 
 * @param pDescriptorPool - 
 * 
 * @return VkResult as int  
 */
 private static native int  vkCreateDescriptorPool0(
             java.nio.ByteBuffer   device,
             java.nio.ByteBuffer   pCreateInfo,
             java.nio.ByteBuffer   pAllocator,
             java.nio.ByteBuffer[]   pDescriptorPool);/*
             
     VkDescriptorPool* array = new  VkDescriptorPool;
     VkResult res = vkCreateDescriptorPool(
                     (VkDevice) (device),
                     (const VkDescriptorPoolCreateInfo*) pCreateInfo,
                     (const VkAllocationCallbacks*) pAllocator,
                     (VkDescriptorPool*) array);
                     
      if(res>=0){
          //VkDescriptorPool obj = &array[0];
          jobject buff = (jobject)(env->NewDirectByteBuffer((void*)array, sizeof(VkDescriptorPool)));
          env->SetObjectArrayElement(pDescriptorPool ,0, buff);
       }
      return (jint) res;
*/ 


/**
 *  Vulkan procedure ID: 76
 * <h2>Prototype</h2><pre>
 *  void  vkDestroyDescriptorPool(
 *     VkDevice                                    device,
 *     VkDescriptorPool                            descriptorPool,
 *     const VkAllocationCallbacks*                pAllocator);
 * </pre>
 * 
 * @param device - 
 * @param descriptorPool - 
 * @param pAllocator - 
 */
    public static void  vkDestroyDescriptorPool(
             VkDevice device,
             VkDescriptorPool descriptorPool,
              VkAllocationCallbacks  pAllocator){
     vkDestroyDescriptorPool0(
             (device==null ? null : device.getPointer()) /* ByteBuffer */ ,
             (descriptorPool==null ? null : descriptorPool.getPointer()) /* ByteBuffer */ ,
             (pAllocator==null ? null : pAllocator.getPointer()) /* ByteBuffer */  );
} 

/**
 *  Native interface for Vulkan method #76
 *  vkDestroyDescriptorPool 
 * 
 * @param device - 
 * @param descriptorPool - 
 * @param pAllocator - 
 */
 private static native void vkDestroyDescriptorPool0(
             java.nio.ByteBuffer   device,
             java.nio.ByteBuffer   descriptorPool,
             java.nio.ByteBuffer   pAllocator);/* 
        vkDestroyDescriptorPool(
                     (VkDevice) (device),
                     (VkDescriptorPool) (descriptorPool),
                     (const VkAllocationCallbacks*) pAllocator);
     
*/ 


/**
 *  Vulkan procedure ID: 77
 * <h2>Prototype</h2><pre>
 *  VkResult  vkResetDescriptorPool(
 *     VkDevice                                    device,
 *     VkDescriptorPool                            descriptorPool,
 *     VkDescriptorPoolResetFlags                  flags);
 * </pre>
 * 
 * @param device - 
 * @param descriptorPool - 
 * @param flags - 
 * 
 * @return VkResult
 */
    public static VkResult vkResetDescriptorPool(
             VkDevice device,
             VkDescriptorPool descriptorPool,
             int flags){
     int  _val = vkResetDescriptorPool0(
                     (device==null ? null : device.getPointer()) /* ByteBuffer */ ,
                     (descriptorPool==null ? null : descriptorPool.getPointer()) /* ByteBuffer */ ,
                     flags  );
      return VkResult.fromValue(_val);
} 

/**
 *  Native interface for Vulkan method #77
 *  vkResetDescriptorPool 
 * 
 * @param device - 
 * @param descriptorPool - 
 * @param flags - 
 * 
 * @return VkResult as int  
 */
 private static native int  vkResetDescriptorPool0(
             java.nio.ByteBuffer   device,
             java.nio.ByteBuffer   descriptorPool,
             int  flags);/*     
     VkResult res = vkResetDescriptorPool(
                     (VkDevice) (device),
                     (VkDescriptorPool) (descriptorPool),
                     (VkDescriptorPoolResetFlags) flags);
      return (jint) res;
*/ 



/**
 *  Vulkan procedure ID: 78
 * <h2>Prototype</h2><pre>
 *  VkResult  vkAllocateDescriptorSets(
 *     VkDevice                                    device,
 *     const VkDescriptorSetAllocateInfo*          pAllocateInfo,
 *     VkDescriptorSet*                            pDescriptorSets);
 * </pre>
 * 
 * @param device - 
 * @param pAllocateInfo - 
 * @param pDescriptorSets - 
 * 
 * @return VkResult
 */
    public static VkResult vkAllocateDescriptorSets(
             VkDevice device,
              VkDescriptorSetAllocateInfo  pAllocateInfo,
              VkDescriptorSet[]  pDescriptorSets){
                  // implement bigBuffer
     ByteBuffer[] bigBuffer = new ByteBuffer[1];   
     int  _val = vkAllocateDescriptorSets0(
                     (device==null ? null : device.getPointer()) /* ByteBuffer */ ,
                     (pAllocateInfo==null ? null : pAllocateInfo.getPointer()) /* ByteBuffer */ ,
                     bigBuffer);
     
     int count = pAllocateInfo.descriptorSetCount();
     VkDescriptorSet set = new VkHandle(bigBuffer[0], count);
     pDescriptorSets[0] = set;
     return VkResult.fromValue(_val);
} 

/**
 *  Native interface for Vulkan method #78
 *  vkAllocateDescriptorSets 
 * 
 * @param device - 
 * @param pAllocateInfo - 
 * @param pDescriptorSets - 
 * 
 * @return VkResult as int  
 */
 private static native int  vkAllocateDescriptorSets0(
             java.nio.ByteBuffer   device,
             java.nio.ByteBuffer   pAllocateInfo0,
             java.nio.ByteBuffer[]   pDescriptorSetsBuff
             );/* 
     const VkDescriptorSetAllocateInfo* pAllocateInfo = (VkDescriptorSetAllocateInfo*)pAllocateInfo0;  
     uint32_t count = pAllocateInfo->descriptorSetCount;   
     VkDescriptorSet*  pDescriptorSets = CALLOC(count, VkDescriptorSet);
     VkResult res = vkAllocateDescriptorSets(
                     (VkDevice) (device),
                     (const VkDescriptorSetAllocateInfo*) pAllocateInfo,
                     (VkDescriptorSet*) pDescriptorSets);
     if(res >= 0){
         jobject buff = (jobject)(env->NewDirectByteBuffer((void*)pDescriptorSets, 
                                                           sizeof(VkDescriptorSet)*count));
          env->SetObjectArrayElement(pDescriptorSetsBuff, 0, buff);
     }
     return (jint) res;
*/ 


     /////////////////////////////////////

/**
 *  Vulkan procedure ID: 79
 * <h2>Prototype</h2><pre>
 *  VkResult  vkFreeDescriptorSets(
 *     VkDevice                                    device,
 *     VkDescriptorPool                            descriptorPool,
 *     uint32_t                                    descriptorSetCount,
 *     const VkDescriptorSet*                      pDescriptorSets);
 * </pre>
 * 
 * @param device - 
 * @param descriptorPool - 
 * @param descriptorSetCount - 
 * @param pDescriptorSets - 
 * 
 * @return VkResult
 */
    public static VkResult vkFreeDescriptorSets(
             VkDevice device,
             VkDescriptorPool descriptorPool,
             int descriptorSetCount,
              VkDescriptorSet  pDescriptorSets){
     int  _val = vkFreeDescriptorSets0(
                     (device==null ? null : device.getPointer()) /* ByteBuffer */ ,
                     (descriptorPool==null ? null : descriptorPool.getPointer()) /* ByteBuffer */ ,
                     descriptorSetCount ,
                     (pDescriptorSets==null ? null : pDescriptorSets.getPointer()) /* ByteBuffer */  );
      return VkResult.fromValue(_val);
} 

/**
 *  Native interface for Vulkan method #79
 *  vkFreeDescriptorSets 
 * 
 * @param device - 
 * @param descriptorPool - 
 * @param descriptorSetCount - 
 * @param pDescriptorSets - 
 * 
 * @return VkResult as int  
 */
 private static native int  vkFreeDescriptorSets0(
             java.nio.ByteBuffer   device,
             java.nio.ByteBuffer   descriptorPool,
             int  descriptorSetCount,
             java.nio.ByteBuffer   pDescriptorSets);/* 
     VkResult res = vkFreeDescriptorSets(
                     (VkDevice) (device),
                     (VkDescriptorPool) (descriptorPool),
                     (uint32_t) descriptorSetCount,
                     (const VkDescriptorSet*) pDescriptorSets);
      return (jint) res;
*/ 


     /////////////////////////////////////

/**
 *  Vulkan procedure ID: 80
 * <h2>Prototype</h2><pre>
 *  void  vkUpdateDescriptorSets(
 *     VkDevice                                    device,
 *     uint32_t                                    descriptorWriteCount,
 *     const VkWriteDescriptorSet*                 pDescriptorWrites,
 *     uint32_t                                    descriptorCopyCount,
 *     const VkCopyDescriptorSet*                  pDescriptorCopies);
 * </pre>
 * 
 * @param device - 
 * @param descriptorWriteCount - 
 * @param pDescriptorWrites - 
 * @param descriptorCopyCount - 
 * @param pDescriptorCopies - 
 */
    public static void  vkUpdateDescriptorSets(
             VkDevice device,
             int descriptorWriteCount,
              VkWriteDescriptorSet  pDescriptorWrites,
             int descriptorCopyCount,
              VkCopyDescriptorSet  pDescriptorCopies){
     vkUpdateDescriptorSets0(
             (device==null ? null : device.getPointer()) /* ByteBuffer */ ,
             descriptorWriteCount ,
             (pDescriptorWrites==null ? null : pDescriptorWrites.getPointer()) /* ByteBuffer */ ,
             descriptorCopyCount ,
             (pDescriptorCopies==null ? null : pDescriptorCopies.getPointer()) /* ByteBuffer */  );
} 

/**
 *  Native interface for Vulkan method #80
 *  vkUpdateDescriptorSets 
 * 
 * @param device - 
 * @param descriptorWriteCount - 
 * @param pDescriptorWrites - 
 * @param descriptorCopyCount - 
 * @param pDescriptorCopies - 
 */
 private static native void vkUpdateDescriptorSets0(
             java.nio.ByteBuffer   device,
             int  descriptorWriteCount,
             java.nio.ByteBuffer   pDescriptorWrites,
             int  descriptorCopyCount,
             java.nio.ByteBuffer   pDescriptorCopies);/* 
     vkUpdateDescriptorSets(
                     (VkDevice) (device),
                     (uint32_t) descriptorWriteCount,
                     (const VkWriteDescriptorSet*) pDescriptorWrites,
                     (uint32_t) descriptorCopyCount,
                     (const VkCopyDescriptorSet*) pDescriptorCopies);
*/ 

/**
 *  Vulkan procedure ID: 81
 * <h2>Prototype</h2><pre>
 *  VkResult  vkCreateFramebuffer(
 *     VkDevice                                    device,
 *     const VkFramebufferCreateInfo*              pCreateInfo,
 *     const VkAllocationCallbacks*                pAllocator,
 *     VkFramebuffer*                              pFramebuffer);
 * </pre>
 * 
 * @param device - 
 * @param pCreateInfo - 
 * @param pAllocator - 
 * @param pFramebuffer - 
 * 
 * @return VkResult
 */
    public static VkResult vkCreateFramebuffer(
              VkDevice device,
              VkFramebufferCreateInfo  pCreateInfo,
              VkAllocationCallbacks  pAllocator,
              VkFramebuffer[]  pFramebuffer){
    
     ByteBuffer[] buff = new ByteBuffer[1];
     int  _val = vkCreateFramebuffer0(
                     (device==null ? null : device.getPointer()) /* ByteBuffer */ ,
                     (pCreateInfo==null ? null : pCreateInfo.getPointer()) /* ByteBuffer */ ,
                     (pAllocator==null ? null : pAllocator.getPointer()) /* ByteBuffer */ ,
                     buff );
      pFramebuffer[0] = wrapClean(buff);
      return VkResult.fromValue(_val);
} 

/**
 *  Native interface for Vulkan method #81
 *  vkCreateFramebuffer 
 * 
 * @param device - 
 * @param pCreateInfo - 
 * @param pAllocator - 
 * @param pFramebuffer - 
 * 
 * @return VkResult as int  
 */
 private static native int  vkCreateFramebuffer0(
             java.nio.ByteBuffer   device,
             java.nio.ByteBuffer   pCreateInfo,
             java.nio.ByteBuffer   pAllocator,
             java.nio.ByteBuffer[]   pFramebuffer);/* 
     VkFramebuffer* array = new VkFramebuffer;
     VkResult res = vkCreateFramebuffer(
                     (VkDevice) (device),
                     (const VkFramebufferCreateInfo*) pCreateInfo,
                     (const VkAllocationCallbacks*) pAllocator,
                     (VkFramebuffer*) array);
       if(res>=0){          
          jobject buff = (jobject)(env->NewDirectByteBuffer((void*)array, sizeof(VkFramebuffer)));
          env->SetObjectArrayElement(pFramebuffer, 0, buff);
       }             
      return (jint) res;
*/ 

/**
 *  Vulkan procedure ID: 82
 * <h2>Prototype</h2><pre>
 *  void  vkDestroyFramebuffer(
 *     VkDevice                                    device,
 *     VkFramebuffer                               framebuffer,
 *     const VkAllocationCallbacks*                pAllocator);
 * </pre>
 * 
 * @param device - 
 * @param framebuffer - 
 * @param pAllocator - 
 */
    public static void  vkDestroyFramebuffer(
             VkDevice device,
             VkFramebuffer framebuffer,
              VkAllocationCallbacks  pAllocator){
     vkDestroyFramebuffer0(
             (device==null ? null : device.getPointer()) /* ByteBuffer */ ,
             (framebuffer==null ? null : framebuffer.getPointer()) /* ByteBuffer */ ,
             (pAllocator==null ? null : pAllocator.getPointer()) /* ByteBuffer */  );
} 

/**
 *  Native interface for Vulkan method #82
 *  vkDestroyFramebuffer 
 * 
 * @param device - 
 * @param framebuffer - 
 * @param pAllocator - 
 */
 private static native void vkDestroyFramebuffer0(
             java.nio.ByteBuffer   device,
             java.nio.ByteBuffer   framebuffer,
             java.nio.ByteBuffer   pAllocator);/* 
     vkDestroyFramebuffer(
                     (VkDevice) (device),
                     (VkFramebuffer) (framebuffer),
                     (const VkAllocationCallbacks*) pAllocator);
*/


/**
 *  Vulkan procedure ID: 83
 * <h2>Prototype</h2><pre>
 *  VkResult  vkCreateRenderPass(
 *     VkDevice                                    device,
 *     const VkRenderPassCreateInfo*               pCreateInfo,
 *     const VkAllocationCallbacks*                pAllocator,
 *     VkRenderPass*                               pRenderPass);
 * </pre>
 * 
 * @param device - 
 * @param pCreateInfo - 
 * @param pAllocator - 
 * @param pRenderPass - 
 * 
 * @return VkResult
 */
    public static VkResult vkCreateRenderPass(
             VkDevice device,
              VkRenderPassCreateInfo  pCreateInfo,
              VkAllocationCallbacks  pAllocator,
              VkRenderPass[]  pRenderPass){
     ByteBuffer[] buff = new ByteBuffer[1];
     int  _val = vkCreateRenderPass0(
                     (device==null ? null : device.getPointer()) /* ByteBuffer */ ,
                     (pCreateInfo==null ? null : pCreateInfo.getPointer()) /* ByteBuffer */ ,
                     (pAllocator==null ? null : pAllocator.getPointer()) /* ByteBuffer */ ,
                      buff);
      pRenderPass[0] = wrapClean(buff); 
      return VkResult.fromValue(_val);
} 

/**
 *  Native interface for Vulkan method #83
 *  vkCreateRenderPass 
 * 
 * @param device - 
 * @param pCreateInfo - 
 * @param pAllocator - 
 * @param pRenderPass - 
 * 
 * @return VkResult as int  
 */
 private static native int  vkCreateRenderPass0(
             java.nio.ByteBuffer   device,
             java.nio.ByteBuffer   pCreateInfo,
             java.nio.ByteBuffer   pAllocator,
             java.nio.ByteBuffer[]   retBuff);/* 
     VkRenderPass* array = new VkRenderPass;
     VkResult res = vkCreateRenderPass(
                     (VkDevice) (device),
                     (const VkRenderPassCreateInfo*) pCreateInfo,
                     (const VkAllocationCallbacks*) pAllocator,
                     (VkRenderPass*) array);
     if(res>=0 && retBuff != NULL){         
          jobject buff = (jobject)(env->NewDirectByteBuffer((void*)array, sizeof(VkRenderPass)));
          env->SetObjectArrayElement(retBuff,0, buff);
       }             
      return (jint) res;
*/ 


/**
 *  Vulkan procedure ID: 84
 * <h2>Prototype</h2><pre>
 *  void  vkDestroyRenderPass(
 *     VkDevice                                    device,
 *     VkRenderPass                                renderPass,
 *     const VkAllocationCallbacks*                pAllocator);
 * </pre>
 * 
 * @param device - 
 * @param renderPass - 
 * @param pAllocator - 
 */
    public static void  vkDestroyRenderPass(
             VkDevice device,
             VkRenderPass renderPass,
             VkAllocationCallbacks  pAllocator){
     vkDestroyRenderPass0(
             (device==null ? null : device.getPointer()) /* ByteBuffer */ ,
             (renderPass==null ? null : renderPass.getPointer()) /* ByteBuffer */ ,
             (pAllocator==null ? null : pAllocator.getPointer()) /* ByteBuffer */  );
} 

/**
 *  Native interface for Vulkan method #84
 *  vkDestroyRenderPass 
 * 
 * @param device - 
 * @param renderPass - 
 * @param pAllocator - 
 */
 private static native void vkDestroyRenderPass0(
             java.nio.ByteBuffer   device,
             java.nio.ByteBuffer   renderPass,
             java.nio.ByteBuffer   pAllocator);/* 
     vkDestroyRenderPass(
                     (VkDevice) (device),
                     (VkRenderPass) (renderPass),
                     (const VkAllocationCallbacks*) pAllocator);
*/ 


/**
 *  Vulkan procedure ID: 85
 * <h2>Prototype</h2><pre>
 *  void  vkGetRenderAreaGranularity(
 *     VkDevice                                    device,
 *     VkRenderPass                                renderPass,
 *     VkExtent2D*                                 pGranularity);
 * </pre>
 * 
 * @param device - 
 * @param renderPass - 
 * @param pGranularity - 
 */
    public static void  vkGetRenderAreaGranularity(
             VkDevice device,
             VkRenderPass renderPass,
              VkExtent2D  pGranularity){
     vkGetRenderAreaGranularity0(
             (device==null ? null : device.getPointer()) /* ByteBuffer */ ,
             (renderPass==null ? null : renderPass.getPointer()) /* ByteBuffer */ ,
             (pGranularity==null ? null : pGranularity.getPointer()) /* ByteBuffer */  );
} 

/**
 *  Native interface for Vulkan method #85
 *  vkGetRenderAreaGranularity 
 * 
 * @param device - 
 * @param renderPass - 
 * @param pGranularity - 
 */
 private static native void vkGetRenderAreaGranularity0(
             java.nio.ByteBuffer   device,
             java.nio.ByteBuffer   renderPass,
             java.nio.ByteBuffer   pGranularity);/*
     vkGetRenderAreaGranularity(
                     (VkDevice) (device),
                     (VkRenderPass) (renderPass),
                     (VkExtent2D*) pGranularity);
*/ 

/**
 *  Vulkan procedure ID: 86
 * <h2>Prototype</h2><pre>
 *  VkResult  vkCreateCommandPool(
 *     VkDevice                                    device,
 *     const VkCommandPoolCreateInfo*              pCreateInfo,
 *     const VkAllocationCallbacks*                pAllocator,
 *     VkCommandPool*                              pCommandPool);
 * </pre>
 * 
 * @param device - 
 * @param pCreateInfo - 
 * @param pAllocator - 
 * @param pCommandPool - 
 * 
 * @return VkResult
 */
    public static VkResult vkCreateCommandPool(
              VkDevice device,
              VkCommandPoolCreateInfo  pCreateInfo,
              VkAllocationCallbacks  pAllocator,
              VkCommandPool[]  pCommandPool){
     int[] result = {0};
     ByteBuffer handle = vkCreateCommandPool0(
                     (device==null ? null : device.getPointer()) /* ByteBuffer */ ,
                     (pCreateInfo==null ? null : pCreateInfo.getPointer()) /* ByteBuffer */ ,
                     (pAllocator==null ? null : pAllocator.getPointer()) /* ByteBuffer */ ,
                     result );
      return VkResult.fromValue(result[0]);
} 

/**
 *  Native interface for Vulkan method #86
 *  vkCreateCommandPool 
 * 
 * @param device - 
 * @param pCreateInfo - 
 * @param pAllocator - 
 * @param pCommandPool - 
 * 
 * @return VkResult as int  
 */
 private static native ByteBuffer  vkCreateCommandPool0(
             java.nio.ByteBuffer   device,
             java.nio.ByteBuffer   pCreateInfo,
             java.nio.ByteBuffer   pAllocator,
             int[] result);/* 
     VkCommandPool* pCommandPool = new VkCommandPool;
     VkResult res = vkCreateCommandPool(
                     (VkDevice) (device),
                     (const VkCommandPoolCreateInfo*) pCreateInfo,
                     (const VkAllocationCallbacks*) pAllocator,
                     (VkCommandPool*) pCommandPool);
      result[0] = res;
      if(pCommandPool){
       jobject buffer = (jobject)(env->NewDirectByteBuffer(pCommandPool, sizeof(void*)));
       return buffer;
      }   
      return NULL;
*/ 


/**
 *  Vulkan procedure ID: 87
 * <h2>Prototype</h2><pre>
 *  void  vkDestroyCommandPool(
 *     VkDevice                                    device,
 *     VkCommandPool                               commandPool,
 *     const VkAllocationCallbacks*                pAllocator);
 * </pre>
 * 
 * @param device - 
 * @param commandPool - 
 * @param pAllocator - 
 */
    public static void  vkDestroyCommandPool(
             VkDevice device,
             VkCommandPool commandPool,
              VkAllocationCallbacks  pAllocator){
     vkDestroyCommandPool0(
             (device==null ? null : device.getPointer()) /* ByteBuffer */ ,
             (commandPool==null ? null : commandPool.getPointer()) /* ByteBuffer */ ,
             (pAllocator==null ? null : pAllocator.getPointer()) /* ByteBuffer */  );
} 

/**
 *  Native interface for Vulkan method #87
 *  vkDestroyCommandPool 
 * 
 * @param device - 
 * @param commandPool - 
 * @param pAllocator - 
 */
 private static native void vkDestroyCommandPool0(
             java.nio.ByteBuffer   device,
             java.nio.ByteBuffer   commandPool,
             java.nio.ByteBuffer   pAllocator);/* 
     vkDestroyCommandPool(
                     (VkDevice) (device),
                     (VkCommandPool) commandPool,
                     (const VkAllocationCallbacks*) pAllocator);
*/ 


/**
 *  Vulkan procedure ID: 88
 * <h2>Prototype</h2><pre>
 *  VkResult  vkResetCommandPool(
 *     VkDevice                                    device,
 *     VkCommandPool                               commandPool,
 *     VkCommandPoolResetFlags                     flags);
 * </pre>
 * 
 * @param device - 
 * @param commandPool - 
 * @param flags - 
 * 
 * @return VkResult
 */
    public static VkResult vkResetCommandPool(
             VkDevice device,
             VkCommandPool commandPool,
             int flags){
     int  _val = vkResetCommandPool0(
                     (device==null ? null : device.getPointer()) /* ByteBuffer */ ,
                     (commandPool==null ? null : commandPool.getPointer()) /* ByteBuffer */ ,
                     flags  );
      return VkResult.fromValue(_val);
} 

/**
 *  Native interface for Vulkan method #88
 *  vkResetCommandPool 
 * 
 * @param device - 
 * @param commandPool - 
 * @param flags - 
 * 
 * @return VkResult as int  
 */
 private static native int  vkResetCommandPool0(
             java.nio.ByteBuffer   device,
             java.nio.ByteBuffer   commandPool,
             int  flags);/* 
     VkResult res = vkResetCommandPool(
                     (VkDevice) (device),
                     (VkCommandPool) commandPool,
                     (VkCommandPoolResetFlags) flags);
      return (jint) res;
*/ 

/**
 *  Vulkan procedure ID: 89
 * <h2>Prototype</h2><pre>
 *  VkResult  vkAllocateCommandBuffers(
 *     VkDevice                                    device,
 *     const VkCommandBufferAllocateInfo*          pAllocateInfo,
 *     VkCommandBuffer*                            pCommandBuffers);
 * </pre>
 * 
 * @param device - 
 * @param pAllocateInfo - 
 * @param pCommandBuffers - 
 * 
 * @return VkResult
 */
    public static VkResult vkAllocateCommandBuffers(
             VkDevice device,
              VkCommandBufferAllocateInfo  pAllocateInfo,
              VkCommandBuffer  pCommandBuffers){
     int  _val = vkAllocateCommandBuffers0(
                     (device==null ? null : device.getPointer()) /* ByteBuffer */ ,
                     (pAllocateInfo==null ? null : pAllocateInfo.getPointer()) /* ByteBuffer */ ,
                     (pCommandBuffers==null ? null : pCommandBuffers.getPointer()) /* ByteBuffer */  );
      return VkResult.fromValue(_val);
} 

/**
 *  Native interface for Vulkan method #89
 *  vkAllocateCommandBuffers 
 * 
 * @param device - 
 * @param pAllocateInfo - 
 * @param pCommandBuffers - 
 * 
 * @return VkResult as int  
 */
 private static native int  vkAllocateCommandBuffers0(
             java.nio.ByteBuffer   device,
             java.nio.ByteBuffer   pAllocateInfo,
             java.nio.ByteBuffer   pCommandBuffers);/* 
     VkResult res = vkAllocateCommandBuffers(
                     (VkDevice) (device),
                     (const VkCommandBufferAllocateInfo*) pAllocateInfo,
                     (VkCommandBuffer*) pCommandBuffers);
      return (jint) res;
*/ 



/**
 *  Vulkan procedure ID: 90
 * <h2>Prototype</h2><pre>
 *  void  vkFreeCommandBuffers(
 *     VkDevice                                    device,
 *     VkCommandPool                               commandPool,
 *     uint32_t                                    commandBufferCount,
 *     const VkCommandBuffer*                      pCommandBuffers);
 * </pre>
 * 
 * @param device - 
 * @param commandPool - 
 * @param commandBufferCount - 
 * @param pCommandBuffers - 
 */
    public static void  vkFreeCommandBuffers(
             VkDevice device,
             VkCommandPool commandPool,
             int commandBufferCount,
              VkCommandBuffer  pCommandBuffers){
     vkFreeCommandBuffers0(
             (device==null ? null : device.getPointer()) /* ByteBuffer */ ,
             (commandPool==null ? null : commandPool.getPointer()) /* ByteBuffer */ ,
             commandBufferCount ,
             (pCommandBuffers==null ? null : pCommandBuffers.getPointer()) /* ByteBuffer */  );
} 

/**
 *  Native interface for Vulkan method #90
 *  vkFreeCommandBuffers 
 * 
 * @param device - 
 * @param commandPool - 
 * @param commandBufferCount - 
 * @param pCommandBuffers - 
 */
 private static native void vkFreeCommandBuffers0(
             java.nio.ByteBuffer   device,
             java.nio.ByteBuffer   commandPool,
             int  commandBufferCount,
             java.nio.ByteBuffer   pCommandBuffers);/* 
     vkFreeCommandBuffers(
                     (VkDevice) (device),
                     (VkCommandPool) commandPool,
                     (uint32_t) commandBufferCount,
                     (const VkCommandBuffer*) pCommandBuffers);
*/ 

/**
 *  Vulkan procedure ID: 91
 * <h2>Prototype</h2><pre>
 *  VkResult  vkBeginCommandBuffer(
 *     VkCommandBuffer                             commandBuffer,
 *     const VkCommandBufferBeginInfo*             pBeginInfo);
 * </pre>
 * 
 * @param commandBuffer - 
 * @param pBeginInfo - 
 * 
 * @return VkResult
 */
    public static VkResult vkBeginCommandBuffer(
             VkCommandBuffer commandBuffer,
              VkCommandBufferBeginInfo  pBeginInfo){
     int  _val = vkBeginCommandBuffer0(
                     (commandBuffer==null ? null : commandBuffer.getPointer()) /* ByteBuffer */ ,
                     (pBeginInfo==null ? null : pBeginInfo.getPointer()) /* ByteBuffer */  );
      return VkResult.fromValue(_val);
} 

/**
 *  Native interface for Vulkan method #91
 *  vkBeginCommandBuffer 
 * 
 * @param commandBuffer - 
 * @param pBeginInfo - 
 * 
 * @return VkResult as int  
 */
 private static native int  vkBeginCommandBuffer0(
             java.nio.ByteBuffer   commandBuffer,
             java.nio.ByteBuffer   pBeginInfo);/* 
     VkResult res = vkBeginCommandBuffer(
                     (VkCommandBuffer) commandBuffer,
                     (const VkCommandBufferBeginInfo*) pBeginInfo);
      return (jint) res;
*/ 


     /////////////////////////////////////

/**
 *  Vulkan procedure ID: 92
 * <h2>Prototype</h2><pre>
 *  VkResult  vkEndCommandBuffer(
 *     VkCommandBuffer                             commandBuffer);
 * </pre>
 * 
 * @param commandBuffer - 
 * 
 * @return VkResult
 */
    public static VkResult vkEndCommandBuffer(
             VkCommandBuffer commandBuffer){
     int  _val = vkEndCommandBuffer0(
                     (commandBuffer==null ? null : commandBuffer.getPointer()) /* ByteBuffer */  );
      return VkResult.fromValue(_val);
} 

/**
 *  Native interface for Vulkan method #92
 *  vkEndCommandBuffer 
 * 
 * @param commandBuffer - 
 * 
 * @return VkResult as int  
 */
 private static native int  vkEndCommandBuffer0( java.nio.ByteBuffer   commandBuffer);/* 
     VkResult res = vkEndCommandBuffer((VkCommandBuffer) commandBuffer);
      return (jint) res;
*/ 


     /////////////////////////////////////

/**
 *  Vulkan procedure ID: 93
 * <h2>Prototype</h2><pre>
 *  VkResult  vkResetCommandBuffer(
 *     VkCommandBuffer                             commandBuffer,
 *     VkCommandBufferResetFlags                   flags);
 * </pre>
 * 
 * @param commandBuffer - 
 * @param flags - 
 * 
 * @return VkResult
 */
    public static VkResult vkResetCommandBuffer(
             VkCommandBuffer commandBuffer,
             int flags){
     int  _val = vkResetCommandBuffer0(
                     (commandBuffer==null ? null : commandBuffer.getPointer()) /* ByteBuffer */ ,
                     flags  );
      return VkResult.fromValue(_val);
} 

/**
 *  Native interface for Vulkan method #93
 *  vkResetCommandBuffer 
 * 
 * @param commandBuffer - 
 * @param flags - 
 * 
 * @return VkResult as int  
 */
 private static native int  vkResetCommandBuffer0(
             java.nio.ByteBuffer   commandBuffer,
             int  flags);/*
     VkResult res = vkResetCommandBuffer(
                     (VkCommandBuffer) commandBuffer,
                     (VkCommandBufferResetFlags) flags);
      return (jint) res;
*/ 


     /////////////////////////////////////

/**
 *  Vulkan procedure ID: 94
 * <h2>Prototype</h2><pre>
 *  void  vkCmdBindPipeline(
 *     VkCommandBuffer                             commandBuffer,
 *     VkPipelineBindPoint                         pipelineBindPoint,
 *     VkPipeline                                  pipeline);
 * </pre>
 * 
 * @param commandBuffer - 
 * @param pipelineBindPoint - 
 * @param pipeline - 
 */
    public static void  vkCmdBindPipeline(
             VkCommandBuffer commandBuffer,
             VkPipelineBindPoint pipelineBindPoint,
             VkPipeline pipeline){
     vkCmdBindPipeline0(
             (commandBuffer==null ? null : commandBuffer.getPointer()) /* ByteBuffer */ ,
             pipelineBindPoint.getValue() /* enum */,
             (pipeline==null ? null : pipeline.getPointer()) /* ByteBuffer */  );
} 

/**
 *  Native interface for Vulkan method #94
 *  vkCmdBindPipeline 
 * 
 * @param commandBuffer - 
 * @param pipelineBindPoint - 
 * @param pipeline - 
 */
 private static native void vkCmdBindPipeline0(
             java.nio.ByteBuffer   commandBuffer,
             int   pipelineBindPoint,
             java.nio.ByteBuffer   pipeline);/* 
     vkCmdBindPipeline(
                     (VkCommandBuffer) commandBuffer,
                     (VkPipelineBindPoint) pipelineBindPoint,
                     (VkPipeline) pipeline);
*/ 


/**
 *  Vulkan procedure ID: 95
 * <h2>Prototype</h2><pre>
 *  void  vkCmdSetViewport(
 *     VkCommandBuffer                             commandBuffer,
 *     uint32_t                                    firstViewport,
 *     uint32_t                                    viewportCount,
 *     const VkViewport*                           pViewports);
 * </pre>
 * 
 * @param commandBuffer - 
 * @param firstViewport - 
 * @param viewportCount - 
 * @param pViewports - 
 */
    public static void  vkCmdSetViewport(
             VkCommandBuffer commandBuffer,
             int firstViewport,
             int viewportCount,
              VkViewport  pViewports){
     vkCmdSetViewport0(
             (commandBuffer==null ? null : commandBuffer.getPointer()) /* ByteBuffer */ ,
             firstViewport ,
             viewportCount ,
             (pViewports==null ? null : pViewports.getPointer()) /* ByteBuffer */  );
} 

/**
 *  Native interface for Vulkan method #95
 *  vkCmdSetViewport 
 * 
 * @param commandBuffer - 
 * @param firstViewport - 
 * @param viewportCount - 
 * @param pViewports - 
 */
 private static native void vkCmdSetViewport0(
             java.nio.ByteBuffer   commandBuffer,
             int  firstViewport,
             int  viewportCount,
             java.nio.ByteBuffer   pViewports);/* 
     vkCmdSetViewport(
                     (VkCommandBuffer) commandBuffer,
                     (uint32_t) firstViewport,
                     (uint32_t) viewportCount,
                     (const VkViewport*) pViewports);
*/ 



/**
 *  Vulkan procedure ID: 96
 * <h2>Prototype</h2><pre>
 *  void  vkCmdSetScissor(
 *     VkCommandBuffer                             commandBuffer,
 *     uint32_t                                    firstScissor,
 *     uint32_t                                    scissorCount,
 *     const VkRect2D*                             pScissors);
 * </pre>
 * 
 * @param commandBuffer - 
 * @param firstScissor - 
 * @param scissorCount - 
 * @param pScissors - 
 */
    public static void  vkCmdSetScissor(
             VkCommandBuffer commandBuffer,
             int firstScissor,
             int scissorCount,
              VkRect2D  pScissors){
     vkCmdSetScissor0(
             (commandBuffer==null ? null : commandBuffer.getPointer()) /* ByteBuffer */ ,
             firstScissor ,
             scissorCount ,
             (pScissors==null ? null : pScissors.getPointer()) /* ByteBuffer */  );
} 

/**
 *  Native interface for Vulkan method #96
 *  vkCmdSetScissor 
 * 
 * @param commandBuffer - 
 * @param firstScissor - 
 * @param scissorCount - 
 * @param pScissors - 
 */
 private static native void vkCmdSetScissor0(
             java.nio.ByteBuffer   commandBuffer,
             int  firstScissor,
             int  scissorCount,
             java.nio.ByteBuffer   pScissors);/* 
     vkCmdSetScissor(
                     (VkCommandBuffer) commandBuffer,
                     (uint32_t) firstScissor,
                     (uint32_t) scissorCount,
                     (const VkRect2D*) pScissors);
*/ 


     /////////////////////////////////////

/**
 *  Vulkan procedure ID: 97
 * <h2>Prototype</h2><pre>
 *  void  vkCmdSetLineWidth(
 *     VkCommandBuffer                             commandBuffer,
 *     float                                       lineWidth);
 * </pre>
 * 
 * @param commandBuffer - 
 * @param lineWidth - 
 */
    public static void  vkCmdSetLineWidth(
             VkCommandBuffer commandBuffer,
             float lineWidth){
     vkCmdSetLineWidth0(
             (commandBuffer==null ? null : commandBuffer.getPointer()) /* ByteBuffer */ ,
             lineWidth  );

} 

/**
 *  Native interface for Vulkan method #97
 *  vkCmdSetLineWidth 
 * 
 * @param commandBuffer - 
 * @param lineWidth - 
 */
 private static native void vkCmdSetLineWidth0(
             java.nio.ByteBuffer   commandBuffer,
             float  lineWidth);/* 
     vkCmdSetLineWidth(
                     (VkCommandBuffer) commandBuffer,
                     (float) lineWidth);
*/ 


/**
 *  Vulkan procedure ID: 98
 * <h2>Prototype</h2><pre>
 *  void  vkCmdSetDepthBias(
 *     VkCommandBuffer                             commandBuffer,
 *     float                                       depthBiasConstantFactor,
 *     float                                       depthBiasClamp,
 *     float                                       depthBiasSlopeFactor);
 * </pre>
 * 
 * @param commandBuffer - 
 * @param depthBiasConstantFactor - 
 * @param depthBiasClamp - 
 * @param depthBiasSlopeFactor - 
 */
    public static void  vkCmdSetDepthBias(
             VkCommandBuffer commandBuffer,
             float depthBiasConstantFactor,
             float depthBiasClamp,
             float depthBiasSlopeFactor){
     vkCmdSetDepthBias0(
             (commandBuffer==null ? null : commandBuffer.getPointer()) /* ByteBuffer */ ,
             depthBiasConstantFactor ,
             depthBiasClamp ,
             depthBiasSlopeFactor  );
} 

/**
 *  Native interface for Vulkan method #98
 *  vkCmdSetDepthBias 
 * 
 * @param commandBuffer - 
 * @param depthBiasConstantFactor - 
 * @param depthBiasClamp - 
 * @param depthBiasSlopeFactor - 
 */
 private static native void vkCmdSetDepthBias0(
             java.nio.ByteBuffer   commandBuffer,
             float  depthBiasConstantFactor,
             float  depthBiasClamp,
             float  depthBiasSlopeFactor);/* 
     vkCmdSetDepthBias(
                     (VkCommandBuffer) commandBuffer,
                     (float) depthBiasConstantFactor,
                     (float) depthBiasClamp,
                     (float) depthBiasSlopeFactor);
*/ 

/**
 *  Vulkan procedure ID: 99
 * <h2>Prototype</h2><pre>
 *  void  vkCmdSetBlendConstants(
 *     VkCommandBuffer                             commandBuffer,
 *     const float                                 blendConstants[4]);
 * </pre>
 * 
 * @param commandBuffer - 
 * @param blendConstants - 
 */
    public static void  vkCmdSetBlendConstants(
             VkCommandBuffer commandBuffer,
             float[] blendConstants){
     vkCmdSetBlendConstants0(
             (commandBuffer==null ? null : commandBuffer.getPointer()) /* ByteBuffer */ ,
             blendConstants  );

} 

/**
 *  Native interface for Vulkan method #99
 *  vkCmdSetBlendConstants 
 * 
 * @param commandBuffer - 
 * @param blendConstants - 
 */
 private static native void vkCmdSetBlendConstants0(
             java.nio.ByteBuffer   commandBuffer,
             float[]  blendConstants);/* 
     vkCmdSetBlendConstants(
                     (VkCommandBuffer) commandBuffer,
                     blendConstants);
*/ 


/**
 *  Vulkan procedure ID: 100
 * <h2>Prototype</h2><pre>
 *  void  vkCmdSetDepthBounds(
 *     VkCommandBuffer                             commandBuffer,
 *     float                                       minDepthBounds,
 *     float                                       maxDepthBounds);
 * </pre>
 * 
 * @param commandBuffer - 
 * @param minDepthBounds - 
 * @param maxDepthBounds - 
 */
    public static void  vkCmdSetDepthBounds(
             VkCommandBuffer commandBuffer,
             float minDepthBounds,
             float maxDepthBounds){
     vkCmdSetDepthBounds0(
             (commandBuffer==null ? null : commandBuffer.getPointer()) /* ByteBuffer */ ,
             minDepthBounds ,
             maxDepthBounds  );
} 

/**
 *  Native interface for Vulkan method #100
 *  vkCmdSetDepthBounds 
 * 
 * @param commandBuffer - 
 * @param minDepthBounds - 
 * @param maxDepthBounds - 
 */
 private static native void vkCmdSetDepthBounds0(
             java.nio.ByteBuffer   commandBuffer,
             float  minDepthBounds,
             float  maxDepthBounds);/* 
     vkCmdSetDepthBounds(
                     (VkCommandBuffer) commandBuffer,
                     (float) minDepthBounds,
                     (float) maxDepthBounds);
*/ 


     /////////////////////////////////////

/**
 *  Vulkan procedure ID: 101
 * <h2>Prototype</h2><pre>
 *  void  vkCmdSetStencilCompareMask(
 *     VkCommandBuffer                             commandBuffer,
 *     VkStencilFaceFlags                          faceMask,
 *     uint32_t                                    compareMask);
 * </pre>
 * 
 * @param commandBuffer - 
 * @param faceMask - 
 * @param compareMask - 
 */
    public static void  vkCmdSetStencilCompareMask(
             VkCommandBuffer commandBuffer,
             int faceMask,
             int compareMask){
     vkCmdSetStencilCompareMask0(
             (commandBuffer==null ? null : commandBuffer.getPointer()) /* ByteBuffer */ ,
             faceMask ,
             compareMask  );
} 

/**
 *  Native interface for Vulkan method #101
 *  vkCmdSetStencilCompareMask 
 * 
 * @param commandBuffer - 
 * @param faceMask - 
 * @param compareMask - 
 */
 private static native void vkCmdSetStencilCompareMask0(
             java.nio.ByteBuffer   commandBuffer,
             int  faceMask,
             int  compareMask);/* 
     vkCmdSetStencilCompareMask(
                     (VkCommandBuffer) commandBuffer,
                     (VkStencilFaceFlags) faceMask,
                     (uint32_t) compareMask);
*/ 


     /////////////////////////////////////

/**
 *  Vulkan procedure ID: 102
 * <h2>Prototype</h2><pre>
 *  void  vkCmdSetStencilWriteMask(
 *     VkCommandBuffer                             commandBuffer,
 *     VkStencilFaceFlags                          faceMask,
 *     uint32_t                                    writeMask);
 * </pre>
 * 
 * @param commandBuffer - 
 * @param faceMask - 
 * @param writeMask - 
 */
    public static void  vkCmdSetStencilWriteMask(
             VkCommandBuffer commandBuffer,
             int faceMask,
             int writeMask){
     vkCmdSetStencilWriteMask0(
             (commandBuffer==null ? null : commandBuffer.getPointer()) /* ByteBuffer */ ,
             faceMask ,
             writeMask  );
} 

/**
 *  Native interface for Vulkan method #102
 *  vkCmdSetStencilWriteMask 
 * 
 * @param commandBuffer - 
 * @param faceMask - 
 * @param writeMask - 
 */
 private static native void vkCmdSetStencilWriteMask0(
             java.nio.ByteBuffer   commandBuffer,
             int  faceMask,
             int  writeMask);/* 
     vkCmdSetStencilWriteMask(
                     (VkCommandBuffer) commandBuffer,
                     (VkStencilFaceFlags) faceMask,
                     (uint32_t) writeMask);
*/ 


/**
 *  Vulkan procedure ID: 103
 * <h2>Prototype</h2><pre>
 *  void  vkCmdSetStencilReference(
 *     VkCommandBuffer                             commandBuffer,
 *     VkStencilFaceFlags                          faceMask,
 *     uint32_t                                    reference);
 * </pre>
 * 
 * @param commandBuffer - 
 * @param faceMask - 
 * @param reference - 
 */
    public static void  vkCmdSetStencilReference(
             VkCommandBuffer commandBuffer,
             int faceMask,
             int reference){
     vkCmdSetStencilReference0(
             (commandBuffer==null ? null : commandBuffer.getPointer()) /* ByteBuffer */ ,
             faceMask ,
             reference  );
} 

/**
 *  Native interface for Vulkan method #103
 *  vkCmdSetStencilReference 
 * 
 * @param commandBuffer - 
 * @param faceMask - 
 * @param reference - 
 */
 private static native void vkCmdSetStencilReference0(
             java.nio.ByteBuffer   commandBuffer,
             int  faceMask,
             int  reference);/* 
     vkCmdSetStencilReference(
                     (VkCommandBuffer) commandBuffer,
                     (VkStencilFaceFlags) faceMask,
                     (uint32_t) reference);
*/ 


/**
 *  Vulkan procedure ID: 104
 * <h2>Prototype</h2><pre>
 *  void  vkCmdBindDescriptorSets(
 *     VkCommandBuffer                             commandBuffer,
 *     VkPipelineBindPoint                         pipelineBindPoint,
 *     VkPipelineLayout                            layout,
 *     uint32_t                                    firstSet,
 *     uint32_t                                    descriptorSetCount,
 *     const VkDescriptorSet*                      pDescriptorSets,
 *     uint32_t                                    dynamicOffsetCount,
 *     const uint32_t*                             pDynamicOffsets);
 * </pre>
 * 
 * @param commandBuffer - 
 * @param pipelineBindPoint - 
 * @param layout - 
 * @param firstSet - 
 * @param descriptorSetCount - 
 * @param pDescriptorSets - 
 * @param dynamicOffsetCount - 
 * @param pDynamicOffsets - 
 */
    public static void  vkCmdBindDescriptorSets(
             VkCommandBuffer commandBuffer,
             VkPipelineBindPoint pipelineBindPoint,
             VkPipelineLayout layout,
             int firstSet,
             int descriptorSetCount,
              VkDescriptorSet  pDescriptorSets,
             int dynamicOffsetCount,
             int[] pDynamicOffsets){
     vkCmdBindDescriptorSets0(
             (commandBuffer==null ? null : commandBuffer.getPointer()) /* ByteBuffer */ ,
             pipelineBindPoint.getValue() /* enum */,
             (layout==null ? null : layout.getPointer()) /* ByteBuffer */ ,
             firstSet ,
             descriptorSetCount ,
             (pDescriptorSets==null ? null : pDescriptorSets.getPointer()) /* ByteBuffer */ ,
             dynamicOffsetCount ,
             pDynamicOffsets  );
} 

/**
 *  Native interface for Vulkan method #104
 *  vkCmdBindDescriptorSets 
 * 
 * @param commandBuffer - 
 * @param pipelineBindPoint - 
 * @param layout - 
 * @param firstSet - 
 * @param descriptorSetCount - 
 * @param pDescriptorSets - 
 * @param dynamicOffsetCount - 
 * @param pDynamicOffsets - 
 */
 private static native void vkCmdBindDescriptorSets0(
             java.nio.ByteBuffer   commandBuffer,
             int   pipelineBindPoint,
             java.nio.ByteBuffer   layout,
             int  firstSet,
             int  descriptorSetCount,
             java.nio.ByteBuffer   pDescriptorSets,
             int  dynamicOffsetCount,
             int[]  pDynamicOffsets);/* 
     vkCmdBindDescriptorSets(
                     (VkCommandBuffer) commandBuffer,
                     (VkPipelineBindPoint) pipelineBindPoint,
                     (VkPipelineLayout) layout,
                     (uint32_t) firstSet,
                     (uint32_t) descriptorSetCount,
                     (const VkDescriptorSet*) pDescriptorSets,
                     (uint32_t) dynamicOffsetCount,
                     (const uint32_t*) pDynamicOffsets);
*/ 


/**
 *  Vulkan procedure ID: 105
 * <h2>Prototype</h2><pre>
 *  void  vkCmdBindIndexBuffer(
 *     VkCommandBuffer                             commandBuffer,
 *     VkBuffer                                    buffer,
 *     VkDeviceSize                                offset,
 *     VkIndexType                                 indexType);
 * </pre>
 * 
 * @param commandBuffer - 
 * @param buffer - 
 * @param offset - 
 * @param indexType - 
 */
    public static void  vkCmdBindIndexBuffer(
             VkCommandBuffer commandBuffer,
             VkBuffer buffer,
             long offset,
             VkIndexType indexType){
     vkCmdBindIndexBuffer0(
             (commandBuffer==null ? null : commandBuffer.getPointer()) /* ByteBuffer */ ,
             (buffer==null ? null : buffer.getPointer()) /* ByteBuffer */ ,
             offset ,
             indexType.getValue() /* enum */ );

} 

/**
 *  Native interface for Vulkan method #105
 *  vkCmdBindIndexBuffer 
 * 
 * @param commandBuffer - 
 * @param buffer - 
 * @param offset - 
 * @param indexType - 
 */
 private static native void vkCmdBindIndexBuffer0(
             java.nio.ByteBuffer   commandBuffer,
             java.nio.ByteBuffer   buffer,
             long  offset,
             int   indexType);/* 
     vkCmdBindIndexBuffer(
                     (VkCommandBuffer) commandBuffer,
                     (VkBuffer) buffer,
                     (VkDeviceSize) offset,
                     (VkIndexType) indexType);
*/ 


     /////////////////////////////////////

/**
 *  Vulkan procedure ID: 106
 * <h2>Prototype</h2><pre>
 *  void  vkCmdBindVertexBuffers(
 *     VkCommandBuffer                             commandBuffer,
 *     uint32_t                                    firstBinding,
 *     uint32_t                                    bindingCount,
 *     const VkBuffer*                             pBuffers,
 *     const VkDeviceSize*                         pOffsets);
 * </pre>
 * 
 * @param commandBuffer - 
 * @param firstBinding - 
 * @param bindingCount - 
 * @param pBuffers - 
 * @param pOffsets - 
 */
    public static void  vkCmdBindVertexBuffers(
             VkCommandBuffer commandBuffer,
             int firstBinding,
             int bindingCount,
              VkBuffer  pBuffers,
             long[] pOffsets){
     vkCmdBindVertexBuffers0(
             (commandBuffer==null ? null : commandBuffer.getPointer()) /* ByteBuffer */ ,
             firstBinding ,
             bindingCount ,
             (pBuffers==null ? null : pBuffers.getPointer()) /* ByteBuffer */ ,
             pOffsets  );
} 

/**
 *  Native interface for Vulkan method #106
 *  vkCmdBindVertexBuffers 
 * 
 * @param commandBuffer - 
 * @param firstBinding - 
 * @param bindingCount - 
 * @param pBuffers - 
 * @param pOffsets - 
 */
 private static native void vkCmdBindVertexBuffers0(
             java.nio.ByteBuffer   commandBuffer,
             int  firstBinding,
             int  bindingCount,
             java.nio.ByteBuffer   pBuffers,
             long[]  pOffsets);/* 
     vkCmdBindVertexBuffers(
                     (VkCommandBuffer) commandBuffer,
                     (uint32_t) firstBinding,
                     (uint32_t) bindingCount,
                     (const VkBuffer*) pBuffers,
                     (const VkDeviceSize*) pOffsets);
*/ 


     /////////////////////////////////////

/**
 *  Vulkan procedure ID: 107
 * <h2>Prototype</h2><pre>
 *  void  vkCmdDraw(
 *     VkCommandBuffer                             commandBuffer,
 *     uint32_t                                    vertexCount,
 *     uint32_t                                    instanceCount,
 *     uint32_t                                    firstVertex,
 *     uint32_t                                    firstInstance);
 * </pre>
 * 
 * @param commandBuffer - 
 * @param vertexCount - 
 * @param instanceCount - 
 * @param firstVertex - 
 * @param firstInstance - 
 */
    public static void  vkCmdDraw(
             VkCommandBuffer commandBuffer,
             int vertexCount,
             int instanceCount,
             int firstVertex,
             int firstInstance){
     vkCmdDraw0(
             (commandBuffer==null ? null : commandBuffer.getPointer()) /* ByteBuffer */ ,
             vertexCount ,
             instanceCount ,
             firstVertex ,
             firstInstance  );
} 

/**
 *  Native interface for Vulkan method #107
 *  vkCmdDraw 
 * 
 * @param commandBuffer - 
 * @param vertexCount - 
 * @param instanceCount - 
 * @param firstVertex - 
 * @param firstInstance - 
 */
 private static native void vkCmdDraw0(
             java.nio.ByteBuffer   commandBuffer,
             int  vertexCount,
             int  instanceCount,
             int  firstVertex,
             int  firstInstance);/* 
     vkCmdDraw(
                     (VkCommandBuffer) commandBuffer,
                     (uint32_t) vertexCount,
                     (uint32_t) instanceCount,
                     (uint32_t) firstVertex,
                     (uint32_t) firstInstance);
*/ 


/**
 *  Vulkan procedure ID: 108
 * <h2>Prototype</h2><pre>
 *  void  vkCmdDrawIndexed(
 *     VkCommandBuffer                             commandBuffer,
 *     uint32_t                                    indexCount,
 *     uint32_t                                    instanceCount,
 *     uint32_t                                    firstIndex,
 *     int32_t                                     vertexOffset,
 *     uint32_t                                    firstInstance);
 * </pre>
 * 
 * @param commandBuffer - 
 * @param indexCount - 
 * @param instanceCount - 
 * @param firstIndex - 
 * @param vertexOffset - 
 * @param firstInstance - 
 */
    public static void  vkCmdDrawIndexed(
             VkCommandBuffer commandBuffer,
             int indexCount,
             int instanceCount,
             int firstIndex,
             int vertexOffset,
             int firstInstance){
     vkCmdDrawIndexed0(
             (commandBuffer==null ? null : commandBuffer.getPointer()) /* ByteBuffer */ ,
             indexCount ,
             instanceCount ,
             firstIndex ,
             vertexOffset ,
             firstInstance  );
} 

/**
 *  Native interface for Vulkan method #108
 *  vkCmdDrawIndexed 
 * 
 * @param commandBuffer - 
 * @param indexCount - 
 * @param instanceCount - 
 * @param firstIndex - 
 * @param vertexOffset - 
 * @param firstInstance - 
 */
 private static native void vkCmdDrawIndexed0(
             java.nio.ByteBuffer   commandBuffer,
             int  indexCount,
             int  instanceCount,
             int  firstIndex,
             int  vertexOffset,
             int  firstInstance);/* 
     vkCmdDrawIndexed(
                     (VkCommandBuffer) commandBuffer,
                     (uint32_t) indexCount,
                     (uint32_t) instanceCount,
                     (uint32_t) firstIndex,
                     (int32_t) vertexOffset,
                     (uint32_t) firstInstance);
*/ 


     /////////////////////////////////////

/**
 *  Vulkan procedure ID: 109
 * <h2>Prototype</h2><pre>
 *  void  vkCmdDrawIndirect(
 *     VkCommandBuffer                             commandBuffer,
 *     VkBuffer                                    buffer,
 *     VkDeviceSize                                offset,
 *     uint32_t                                    drawCount,
 *     uint32_t                                    stride);
 * </pre>
 * 
 * @param commandBuffer - 
 * @param buffer - 
 * @param offset - 
 * @param drawCount - 
 * @param stride - 
 */
    public static void  vkCmdDrawIndirect(
             VkCommandBuffer commandBuffer,
             VkBuffer buffer,
             long offset,
             int drawCount,
             int stride){
     vkCmdDrawIndirect0(
             (commandBuffer==null ? null : commandBuffer.getPointer()) /* ByteBuffer */ ,
             (buffer==null ? null : buffer.getPointer()) /* ByteBuffer */ ,
             offset ,
             drawCount ,
             stride  );
} 

/**
 *  Native interface for Vulkan method #109
 *  vkCmdDrawIndirect 
 * 
 * @param commandBuffer - 
 * @param buffer - 
 * @param offset - 
 * @param drawCount - 
 * @param stride - 
 */
 private static native void vkCmdDrawIndirect0(
             java.nio.ByteBuffer   commandBuffer,
             java.nio.ByteBuffer   buffer,
             long  offset,
             int  drawCount,
             int  stride);/* 
     vkCmdDrawIndirect(
                     (VkCommandBuffer) commandBuffer,
                     (VkBuffer) buffer,
                     (VkDeviceSize) offset,
                     (uint32_t) drawCount,
                     (uint32_t) stride);
*/ 


/**
 *  Vulkan procedure ID: 110
 * <h2>Prototype</h2><pre>
 *  void  vkCmdDrawIndexedIndirect(
 *     VkCommandBuffer                             commandBuffer,
 *     VkBuffer                                    buffer,
 *     VkDeviceSize                                offset,
 *     uint32_t                                    drawCount,
 *     uint32_t                                    stride);
 * </pre>
 * 
 * @param commandBuffer - 
 * @param buffer - 
 * @param offset - 
 * @param drawCount - 
 * @param stride - 
 */
    public static void  vkCmdDrawIndexedIndirect(
             VkCommandBuffer commandBuffer,
             VkBuffer buffer,
             long offset,
             int drawCount,
             int stride){
     vkCmdDrawIndexedIndirect0(
             (commandBuffer==null ? null : commandBuffer.getPointer()) /* ByteBuffer */ ,
             (buffer==null ? null : buffer.getPointer()) /* ByteBuffer */ ,
             offset ,
             drawCount ,
             stride  );
} 

/**
 *  Native interface for Vulkan method #110
 *  vkCmdDrawIndexedIndirect 
 * 
 * @param commandBuffer - 
 * @param buffer - 
 * @param offset - 
 * @param drawCount - 
 * @param stride - 
 */
 private static native void vkCmdDrawIndexedIndirect0(
             java.nio.ByteBuffer   commandBuffer,
             java.nio.ByteBuffer   buffer,
             long  offset,
             int  drawCount,
             int  stride);/* 
     vkCmdDrawIndexedIndirect(
                     (VkCommandBuffer) commandBuffer,
                     (VkBuffer) buffer,
                     (VkDeviceSize) offset,
                     (uint32_t) drawCount,
                     (uint32_t) stride);
*/ 


  
/**
 *  Vulkan procedure ID: 111
 * <h2>Prototype</h2><pre>
 *  void  vkCmdDispatch(
 *     VkCommandBuffer                             commandBuffer,
 *     uint32_t                                    x,
 *     uint32_t                                    y,
 *     uint32_t                                    z);
 * </pre>
 * 
 * @param commandBuffer - 
 * @param x - 
 * @param y - 
 * @param z - 
 */
    public static void  vkCmdDispatch(
             VkCommandBuffer commandBuffer,
             int x,
             int y,
             int z){
     vkCmdDispatch0(
             (commandBuffer==null ? null : commandBuffer.getPointer()) /* ByteBuffer */ ,
             x ,
             y ,
             z  );
} 

/**
 *  Native interface for Vulkan method #111
 *  vkCmdDispatch 
 * 
 * @param commandBuffer - 
 * @param x - 
 * @param y - 
 * @param z - 
 */
 private static native void vkCmdDispatch0(
             java.nio.ByteBuffer   commandBuffer,
             int  x,
             int  y,
             int  z);/* 
     vkCmdDispatch(
                     (VkCommandBuffer) commandBuffer,
                     (uint32_t) x,
                     (uint32_t) y,
                     (uint32_t) z);
*/ 



/**
 *  Vulkan procedure ID: 112
 * <h2>Prototype</h2><pre>
 *  void  vkCmdDispatchIndirect(
 *     VkCommandBuffer                             commandBuffer,
 *     VkBuffer                                    buffer,
 *     VkDeviceSize                                offset);
 * </pre>
 * 
 * @param commandBuffer - 
 * @param buffer - 
 * @param offset - 
 */
    public static void  vkCmdDispatchIndirect(
             VkCommandBuffer commandBuffer,
             VkBuffer buffer,
             long offset){
     vkCmdDispatchIndirect0(
             (commandBuffer==null ? null : commandBuffer.getPointer()) /* ByteBuffer */ ,
             (buffer==null ? null : buffer.getPointer()) /* ByteBuffer */ ,
             offset  );

} 

/**
 *  Native interface for Vulkan method #112
 *  vkCmdDispatchIndirect 
 * 
 * @param commandBuffer - 
 * @param buffer - 
 * @param offset - 
 */
 private static native void vkCmdDispatchIndirect0(
             java.nio.ByteBuffer   commandBuffer,
             java.nio.ByteBuffer   buffer,
             long  offset);/*
     vkCmdDispatchIndirect(
                     (VkCommandBuffer) commandBuffer,
                     (VkBuffer) buffer,
                     (VkDeviceSize) offset);
*/ 


/**
 *  Vulkan procedure ID: 113
 * <h2>Prototype</h2><pre>
 *  void  vkCmdCopyBuffer(
 *     VkCommandBuffer                             commandBuffer,
 *     VkBuffer                                    srcBuffer,
 *     VkBuffer                                    dstBuffer,
 *     uint32_t                                    regionCount,
 *     const VkBufferCopy*                         pRegions);
 * </pre>
 * 
 * @param commandBuffer - 
 * @param srcBuffer - 
 * @param dstBuffer - 
 * @param regionCount - 
 * @param pRegions - 
 */
    public static void  vkCmdCopyBuffer(
             VkCommandBuffer commandBuffer,
             VkBuffer srcBuffer,
             VkBuffer dstBuffer,
             int regionCount,
              VkBufferCopy  pRegions){
     vkCmdCopyBuffer0(
             (commandBuffer==null ? null : commandBuffer.getPointer()) /* ByteBuffer */ ,
             (srcBuffer==null ? null : srcBuffer.getPointer()) /* ByteBuffer */ ,
             (dstBuffer==null ? null : dstBuffer.getPointer()) /* ByteBuffer */ ,
             regionCount ,
             (pRegions==null ? null : pRegions.getPointer()) /* ByteBuffer */  );
} 

/**
 *  Native interface for Vulkan method #113
 *  vkCmdCopyBuffer 
 * 
 * @param commandBuffer - 
 * @param srcBuffer - 
 * @param dstBuffer - 
 * @param regionCount - 
 * @param pRegions - 
 */
 private static native void vkCmdCopyBuffer0(
             java.nio.ByteBuffer   commandBuffer,
             java.nio.ByteBuffer   srcBuffer,
             java.nio.ByteBuffer   dstBuffer,
             int  regionCount,
             java.nio.ByteBuffer   pRegions);/*
     vkCmdCopyBuffer(
                     (VkCommandBuffer) commandBuffer,
                     (VkBuffer) srcBuffer,
                     (VkBuffer) dstBuffer,
                     (uint32_t) regionCount,
                     (const VkBufferCopy*) pRegions);
*/ 


     /////////////////////////////////////

/**
 *  Vulkan procedure ID: 114
 * <h2>Prototype</h2><pre>
 *  void  vkCmdCopyImage(
 *     VkCommandBuffer                             commandBuffer,
 *     VkImage                                     srcImage,
 *     VkImageLayout                               srcImageLayout,
 *     VkImage                                     dstImage,
 *     VkImageLayout                               dstImageLayout,
 *     uint32_t                                    regionCount,
 *     const VkImageCopy*                          pRegions);
 * </pre>
 * 
 * @param commandBuffer - 
 * @param srcImage - 
 * @param srcImageLayout - 
 * @param dstImage - 
 * @param dstImageLayout - 
 * @param regionCount - 
 * @param pRegions - 
 */
    public static void  vkCmdCopyImage(
             VkCommandBuffer commandBuffer,
             VkImage srcImage,
             VkImageLayout srcImageLayout,
             VkImage dstImage,
             VkImageLayout dstImageLayout,
             int regionCount,
              VkImageCopy  pRegions){
     vkCmdCopyImage0(
             (commandBuffer==null ? null : commandBuffer.getPointer()) /* ByteBuffer */ ,
             (srcImage==null ? null : srcImage.getPointer()) /* ByteBuffer */ ,
             srcImageLayout.getValue() /* enum */,
             (dstImage==null ? null : dstImage.getPointer()) /* ByteBuffer */ ,
             dstImageLayout.getValue() /* enum */,
             regionCount ,
             (pRegions==null ? null : pRegions.getPointer()) /* ByteBuffer */  );
} 

/**
 *  Native interface for Vulkan method #114
 *  vkCmdCopyImage 
 * 
 * @param commandBuffer - 
 * @param srcImage - 
 * @param srcImageLayout - 
 * @param dstImage - 
 * @param dstImageLayout - 
 * @param regionCount - 
 * @param pRegions - 
 */
 private static native void vkCmdCopyImage0(
             java.nio.ByteBuffer   commandBuffer,
             java.nio.ByteBuffer   srcImage,
             int   srcImageLayout,
             java.nio.ByteBuffer   dstImage,
             int   dstImageLayout,
             int  regionCount,
             java.nio.ByteBuffer   pRegions);/*
     vkCmdCopyImage(
                     (VkCommandBuffer) commandBuffer,
                     (VkImage) srcImage,
                     (VkImageLayout) srcImageLayout,
                     (VkImage) dstImage,
                     (VkImageLayout) dstImageLayout,
                     (uint32_t) regionCount,
                     (const VkImageCopy*) pRegions);
*/ 


     /////////////////////////////////////

/**
 *  Vulkan procedure ID: 115
 * <h2>Prototype</h2><pre>
 *  void  vkCmdBlitImage(
 *     VkCommandBuffer                             commandBuffer,
 *     VkImage                                     srcImage,
 *     VkImageLayout                               srcImageLayout,
 *     VkImage                                     dstImage,
 *     VkImageLayout                               dstImageLayout,
 *     uint32_t                                    regionCount,
 *     const VkImageBlit*                          pRegions,
 *     VkFilter                                    filter);
 * </pre>
 * 
 * @param commandBuffer - 
 * @param srcImage - 
 * @param srcImageLayout - 
 * @param dstImage - 
 * @param dstImageLayout - 
 * @param regionCount - 
 * @param pRegions - 
 * @param filter - 
 */
    public static void  vkCmdBlitImage(
             VkCommandBuffer commandBuffer,
             VkImage srcImage,
             VkImageLayout srcImageLayout,
             VkImage dstImage,
             VkImageLayout dstImageLayout,
             int regionCount,
              VkImageBlit  pRegions,
             VkFilter filter){
     vkCmdBlitImage0(
             (commandBuffer==null ? null : commandBuffer.getPointer()) /* ByteBuffer */ ,
             (srcImage==null ? null : srcImage.getPointer()) /* ByteBuffer */ ,
             srcImageLayout.getValue() /* enum */,
             (dstImage==null ? null : dstImage.getPointer()) /* ByteBuffer */ ,
             dstImageLayout.getValue() /* enum */,
             regionCount ,
             (pRegions==null ? null : pRegions.getPointer()) /* ByteBuffer */ ,
             filter.getValue() /* enum */ );
} 

/**
 *  Native interface for Vulkan method #115
 *  vkCmdBlitImage 
 * 
 * @param commandBuffer - 
 * @param srcImage - 
 * @param srcImageLayout - 
 * @param dstImage - 
 * @param dstImageLayout - 
 * @param regionCount - 
 * @param pRegions - 
 * @param filter - 
 */
 private static native void vkCmdBlitImage0(
             java.nio.ByteBuffer   commandBuffer,
             java.nio.ByteBuffer   srcImage,
             int   srcImageLayout,
             java.nio.ByteBuffer   dstImage,
             int   dstImageLayout,
             int  regionCount,
             java.nio.ByteBuffer   pRegions,
             int   filter);/* 
     vkCmdBlitImage(
                     (VkCommandBuffer) commandBuffer,
                     (VkImage) srcImage,
                     (VkImageLayout) srcImageLayout,
                     (VkImage) dstImage,
                     (VkImageLayout) dstImageLayout,
                     (uint32_t) regionCount,
                     (const VkImageBlit*) pRegions,
                     (VkFilter) filter);
*/ 


     /////////////////////////////////////

/**
 *  Vulkan procedure ID: 116
 * <h2>Prototype</h2><pre>
 *  void  vkCmdCopyBufferToImage(
 *     VkCommandBuffer                             commandBuffer,
 *     VkBuffer                                    srcBuffer,
 *     VkImage                                     dstImage,
 *     VkImageLayout                               dstImageLayout,
 *     uint32_t                                    regionCount,
 *     const VkBufferImageCopy*                    pRegions);
 * </pre>
 * 
 * @param commandBuffer - 
 * @param srcBuffer - 
 * @param dstImage - 
 * @param dstImageLayout - 
 * @param regionCount - 
 * @param pRegions - 
 */
    public static void  vkCmdCopyBufferToImage(
             VkCommandBuffer commandBuffer,
             VkBuffer srcBuffer,
             VkImage dstImage,
             VkImageLayout dstImageLayout,
             int regionCount,
              VkBufferImageCopy  pRegions){
     vkCmdCopyBufferToImage0(
             (commandBuffer==null ? null : commandBuffer.getPointer()) /* ByteBuffer */ ,
             (srcBuffer==null ? null : srcBuffer.getPointer()) /* ByteBuffer */ ,
             (dstImage==null ? null : dstImage.getPointer()) /* ByteBuffer */ ,
             dstImageLayout.getValue() /* enum */,
             regionCount ,
             (pRegions==null ? null : pRegions.getPointer()) /* ByteBuffer */  );
} 

/**
 *  Native interface for Vulkan method #116
 *  vkCmdCopyBufferToImage 
 * 
 * @param commandBuffer - 
 * @param srcBuffer - 
 * @param dstImage - 
 * @param dstImageLayout - 
 * @param regionCount - 
 * @param pRegions - 
 */
 private static native void vkCmdCopyBufferToImage0(
             java.nio.ByteBuffer   commandBuffer,
             java.nio.ByteBuffer   srcBuffer,
             java.nio.ByteBuffer   dstImage,
             int   dstImageLayout,
             int  regionCount,
             java.nio.ByteBuffer   pRegions);/* 
     vkCmdCopyBufferToImage(
                     (VkCommandBuffer) commandBuffer,
                     (VkBuffer) srcBuffer,
                     (VkImage) dstImage,
                     (VkImageLayout) dstImageLayout,
                     (uint32_t) regionCount,
                     (const VkBufferImageCopy*) pRegions);
*/ 


 

/**
 *  Vulkan procedure ID: 117
 * <h2>Prototype</h2><pre>
 *  void  vkCmdCopyImageToBuffer(
 *     VkCommandBuffer                             commandBuffer,
 *     VkImage                                     srcImage,
 *     VkImageLayout                               srcImageLayout,
 *     VkBuffer                                    dstBuffer,
 *     uint32_t                                    regionCount,
 *     const VkBufferImageCopy*                    pRegions);
 * </pre>
 * 
 * @param commandBuffer - 
 * @param srcImage - 
 * @param srcImageLayout - 
 * @param dstBuffer - 
 * @param regionCount - 
 * @param pRegions - 
 */
    public static void  vkCmdCopyImageToBuffer(
             VkCommandBuffer commandBuffer,
             VkImage srcImage,
             VkImageLayout srcImageLayout,
             VkBuffer dstBuffer,
             int regionCount,
              VkBufferImageCopy  pRegions){
     vkCmdCopyImageToBuffer0(
             (commandBuffer==null ? null : commandBuffer.getPointer()) /* ByteBuffer */ ,
             (srcImage==null ? null : srcImage.getPointer()) /* ByteBuffer */ ,
             srcImageLayout.getValue() /* enum */,
             (dstBuffer==null ? null : dstBuffer.getPointer()) /* ByteBuffer */ ,
             regionCount ,
             (pRegions==null ? null : pRegions.getPointer()) /* ByteBuffer */  );
} 

/**
 *  Native interface for Vulkan method #117
 *  vkCmdCopyImageToBuffer 
 * 
 * @param commandBuffer - 
 * @param srcImage - 
 * @param srcImageLayout - 
 * @param dstBuffer - 
 * @param regionCount - 
 * @param pRegions - 
 */
 private static native void vkCmdCopyImageToBuffer0(
             java.nio.ByteBuffer   commandBuffer,
             java.nio.ByteBuffer   srcImage,
             int   srcImageLayout,
             java.nio.ByteBuffer   dstBuffer,
             int  regionCount,
             java.nio.ByteBuffer   pRegions);/*
     vkCmdCopyImageToBuffer(
                     (VkCommandBuffer) commandBuffer,
                     (VkImage) srcImage,
                     (VkImageLayout) srcImageLayout,
                     (VkBuffer) dstBuffer,
                     (uint32_t) regionCount,
                     (const VkBufferImageCopy*) pRegions);
*/ 


   

/**
 *  Vulkan procedure ID: 118
 * <h2>Prototype</h2><pre>
 *  void  vkCmdUpdateBuffer(
 *     VkCommandBuffer                             commandBuffer,
 *     VkBuffer                                    dstBuffer,
 *     VkDeviceSize                                dstOffset,
 *     VkDeviceSize                                dataSize,
 *     const uint32_t*                             pData);
 * </pre>
 * 
 * @param commandBuffer - 
 * @param dstBuffer - 
 * @param dstOffset - 
 * @param dataSize - 
 * @param pData - 
 */
    public static void  vkCmdUpdateBuffer(
             VkCommandBuffer commandBuffer,
             VkBuffer dstBuffer,
             long dstOffset,
             long dataSize,
             int[] pData){
     vkCmdUpdateBuffer0(
             (commandBuffer==null ? null : commandBuffer.getPointer()) /* ByteBuffer */ ,
             (dstBuffer==null ? null : dstBuffer.getPointer()) /* ByteBuffer */ ,
             dstOffset ,
             dataSize ,
             pData  );
} 

/**
 *  Native interface for Vulkan method #118
 *  vkCmdUpdateBuffer 
 * 
 * @param commandBuffer - 
 * @param dstBuffer - 
 * @param dstOffset - 
 * @param dataSize - 
 * @param pData - 
 */
 private static native void vkCmdUpdateBuffer0(
             java.nio.ByteBuffer   commandBuffer,
             java.nio.ByteBuffer   dstBuffer,
             long  dstOffset,
             long  dataSize,
             int[]  pData);/* 
     vkCmdUpdateBuffer(
                     (VkCommandBuffer) commandBuffer,
                     (VkBuffer) dstBuffer,
                     (VkDeviceSize) dstOffset,
                     (VkDeviceSize) dataSize,
                     (const uint32_t*) pData);
*/ 


/**
 *  Vulkan procedure ID: 119
 * <h2>Prototype</h2><pre>
 *  void  vkCmdFillBuffer(
 *     VkCommandBuffer                             commandBuffer,
 *     VkBuffer                                    dstBuffer,
 *     VkDeviceSize                                dstOffset,
 *     VkDeviceSize                                size,
 *     uint32_t                                    data);
 * </pre>
 * 
 * @param commandBuffer - 
 * @param dstBuffer - 
 * @param dstOffset - 
 * @param size - 
 * @param data - 
 */
    public static void  vkCmdFillBuffer(
             VkCommandBuffer commandBuffer,
             VkBuffer dstBuffer,
             long dstOffset,
             long size,
             int data){
     vkCmdFillBuffer0(
             (commandBuffer==null ? null : commandBuffer.getPointer()) /* ByteBuffer */ ,
             (dstBuffer==null ? null : dstBuffer.getPointer()) /* ByteBuffer */ ,
             dstOffset ,
             size ,
             data  );
} 

/**
 *  Native interface for Vulkan method #119
 *  vkCmdFillBuffer 
 * 
 * @param commandBuffer - 
 * @param dstBuffer - 
 * @param dstOffset - 
 * @param size - 
 * @param data - 
 */
 private static native void vkCmdFillBuffer0(
             java.nio.ByteBuffer   commandBuffer,
             java.nio.ByteBuffer   dstBuffer,
             long  dstOffset,
             long  size,
             int  data);/* 
     vkCmdFillBuffer(
                     (VkCommandBuffer) commandBuffer,
                     (VkBuffer) dstBuffer,
                     (VkDeviceSize) dstOffset,
                     (VkDeviceSize) size,
                     (uint32_t) data);
*/ 


/**
 *  Vulkan procedure ID: 120
 * <h2>Prototype</h2><pre>
 *  void  vkCmdClearColorImage(
 *     VkCommandBuffer                             commandBuffer,
 *     VkImage                                     image,
 *     VkImageLayout                               imageLayout,
 *     const VkClearColorValue*                    pColor,
 *     uint32_t                                    rangeCount,
 *     const VkImageSubresourceRange*              pRanges);
 * </pre>
 * 
 * @param commandBuffer - 
 * @param image - 
 * @param imageLayout - 
 * @param pColor - 
 * @param rangeCount - 
 * @param pRanges - 
 */
    public static void  vkCmdClearColorImage(
             VkCommandBuffer commandBuffer,
             VkImage image,
             VkImageLayout imageLayout,
              VkClearColorValue  pColor,
             int rangeCount,
              VkImageSubresourceRange  pRanges){
     vkCmdClearColorImage0(
             (commandBuffer==null ? null : commandBuffer.getPointer()) /* ByteBuffer */ ,
             (image==null ? null : image.getPointer()) /* ByteBuffer */ ,
             imageLayout.getValue() /* enum */,
             (pColor==null ? null : pColor.getPointer()) /* ByteBuffer */ ,
             rangeCount ,
             (pRanges==null ? null : pRanges.getPointer()) /* ByteBuffer */  );
} 

/**
 *  Native interface for Vulkan method #120
 *  vkCmdClearColorImage 
 * 
 * @param commandBuffer - 
 * @param image - 
 * @param imageLayout - 
 * @param pColor - 
 * @param rangeCount - 
 * @param pRanges - 
 */
 private static native void vkCmdClearColorImage0(
             java.nio.ByteBuffer   commandBuffer,
             java.nio.ByteBuffer   image,
             int   imageLayout,
             java.nio.ByteBuffer   pColor,
             int  rangeCount,
             java.nio.ByteBuffer   pRanges);/* 
     vkCmdClearColorImage(
                     (VkCommandBuffer) commandBuffer,
                     (VkImage) image,
                     (VkImageLayout) imageLayout,
                     (const VkClearColorValue*) pColor,
                     (uint32_t) rangeCount,
                     (const VkImageSubresourceRange*) pRanges);
*/ 


     /////////////////////////////////////

/**
 *  Vulkan procedure ID: 121
 * <h2>Prototype</h2><pre>
 *  void  vkCmdClearDepthStencilImage(
 *     VkCommandBuffer                             commandBuffer,
 *     VkImage                                     image,
 *     VkImageLayout                               imageLayout,
 *     const VkClearDepthStencilValue*             pDepthStencil,
 *     uint32_t                                    rangeCount,
 *     const VkImageSubresourceRange*              pRanges);
 * </pre>
 * 
 * @param commandBuffer - 
 * @param image - 
 * @param imageLayout - 
 * @param pDepthStencil - 
 * @param rangeCount - 
 * @param pRanges - 
 */
    public static void  vkCmdClearDepthStencilImage(
             VkCommandBuffer commandBuffer,
             VkImage image,
             VkImageLayout imageLayout,
              VkClearDepthStencilValue  pDepthStencil,
             int rangeCount,
              VkImageSubresourceRange  pRanges){
     vkCmdClearDepthStencilImage0(
             (commandBuffer==null ? null : commandBuffer.getPointer()) /* ByteBuffer */ ,
             (image==null ? null : image.getPointer()) /* ByteBuffer */ ,
             imageLayout.getValue() /* enum */,
             (pDepthStencil==null ? null : pDepthStencil.getPointer()) /* ByteBuffer */ ,
             rangeCount ,
             (pRanges==null ? null : pRanges.getPointer()) /* ByteBuffer */  );
} 

/**
 *  Native interface for Vulkan method #121
 *  vkCmdClearDepthStencilImage 
 * 
 * @param commandBuffer - 
 * @param image - 
 * @param imageLayout - 
 * @param pDepthStencil - 
 * @param rangeCount - 
 * @param pRanges - 
 */
 private static native void vkCmdClearDepthStencilImage0(
             java.nio.ByteBuffer   commandBuffer,
             java.nio.ByteBuffer   image,
             int   imageLayout,
             java.nio.ByteBuffer   pDepthStencil,
             int  rangeCount,
             java.nio.ByteBuffer   pRanges);/* 
     vkCmdClearDepthStencilImage(
                     (VkCommandBuffer) commandBuffer,
                     (VkImage) image,
                     (VkImageLayout) imageLayout,
                     (const VkClearDepthStencilValue*) pDepthStencil,
                     (uint32_t) rangeCount,
                     (const VkImageSubresourceRange*) pRanges);
*/ 


     /////////////////////////////////////

/**
 *  Vulkan procedure ID: 122
 * <h2>Prototype</h2><pre>
 *  void  vkCmdClearAttachments(
 *     VkCommandBuffer                             commandBuffer,
 *     uint32_t                                    attachmentCount,
 *     const VkClearAttachment*                    pAttachments,
 *     uint32_t                                    rectCount,
 *     const VkClearRect*                          pRects);
 * </pre>
 * 
 * @param commandBuffer - 
 * @param attachmentCount - 
 * @param pAttachments - 
 * @param rectCount - 
 * @param pRects - 
 */
    public static void  vkCmdClearAttachments(
             VkCommandBuffer commandBuffer,
             int attachmentCount,
              VkClearAttachment  pAttachments,
             int rectCount,
              VkClearRect  pRects){
     vkCmdClearAttachments0(
             (commandBuffer==null ? null : commandBuffer.getPointer()) /* ByteBuffer */ ,
             attachmentCount ,
             (pAttachments==null ? null : pAttachments.getPointer()) /* ByteBuffer */ ,
             rectCount ,
             (pRects==null ? null : pRects.getPointer()) /* ByteBuffer */  );
} 

/**
 *  Native interface for Vulkan method #122
 *  vkCmdClearAttachments 
 * 
 * @param commandBuffer - 
 * @param attachmentCount - 
 * @param pAttachments - 
 * @param rectCount - 
 * @param pRects - 
 */
 private static native void vkCmdClearAttachments0(
             java.nio.ByteBuffer   commandBuffer,
             int  attachmentCount,
             java.nio.ByteBuffer   pAttachments,
             int  rectCount,
             java.nio.ByteBuffer   pRects);/* 
     vkCmdClearAttachments(
                     (VkCommandBuffer) commandBuffer,
                     (uint32_t) attachmentCount,
                     (const VkClearAttachment*) pAttachments,
                     (uint32_t) rectCount,
                     (const VkClearRect*) pRects);
*/ 


/**
 *  Vulkan procedure ID: 123
 * <h2>Prototype</h2><pre>
 *  void  vkCmdResolveImage(
 *     VkCommandBuffer                             commandBuffer,
 *     VkImage                                     srcImage,
 *     VkImageLayout                               srcImageLayout,
 *     VkImage                                     dstImage,
 *     VkImageLayout                               dstImageLayout,
 *     uint32_t                                    regionCount,
 *     const VkImageResolve*                       pRegions);
 * </pre>
 * 
 * @param commandBuffer - 
 * @param srcImage - 
 * @param srcImageLayout - 
 * @param dstImage - 
 * @param dstImageLayout - 
 * @param regionCount - 
 * @param pRegions - 
 */
    public static void  vkCmdResolveImage(
             VkCommandBuffer commandBuffer,
             VkImage srcImage,
             VkImageLayout srcImageLayout,
             VkImage dstImage,
             VkImageLayout dstImageLayout,
             int regionCount,
              VkImageResolve  pRegions){
     vkCmdResolveImage0(
             (commandBuffer==null ? null : commandBuffer.getPointer()) /* ByteBuffer */ ,
             (srcImage==null ? null : srcImage.getPointer()) /* ByteBuffer */ ,
             srcImageLayout.getValue() /* enum */,
             (dstImage==null ? null : dstImage.getPointer()) /* ByteBuffer */ ,
             dstImageLayout.getValue() /* enum */,
             regionCount ,
             (pRegions==null ? null : pRegions.getPointer()) /* ByteBuffer */  );
} 

/**
 *  Native interface for Vulkan method #123
 *  vkCmdResolveImage 
 * 
 * @param commandBuffer - 
 * @param srcImage - 
 * @param srcImageLayout - 
 * @param dstImage - 
 * @param dstImageLayout - 
 * @param regionCount - 
 * @param pRegions - 
 */
 private static native void vkCmdResolveImage0(
             java.nio.ByteBuffer   commandBuffer,
             java.nio.ByteBuffer   srcImage,
             int   srcImageLayout,
             java.nio.ByteBuffer   dstImage,
             int   dstImageLayout,
             int  regionCount,
             java.nio.ByteBuffer   pRegions);/* 
     vkCmdResolveImage(
                     (VkCommandBuffer) commandBuffer,
                     (VkImage) srcImage,
                     (VkImageLayout) srcImageLayout,
                     (VkImage) dstImage,
                     (VkImageLayout) dstImageLayout,
                     (uint32_t) regionCount,
                     (const VkImageResolve*) pRegions);
*/ 



/**
 *  Vulkan procedure ID: 124
 * <h2>Prototype</h2><pre>
 *  void  vkCmdSetEvent(
 *     VkCommandBuffer                             commandBuffer,
 *     VkEvent                                     event,
 *     VkPipelineStageFlags                        stageMask);
 * </pre>
 * 
 * @param commandBuffer - 
 * @param event - 
 * @param stageMask - 
 */
    public static void  vkCmdSetEvent(
             VkCommandBuffer commandBuffer,
             VkEvent event,
             int stageMask){
     vkCmdSetEvent0(
             (commandBuffer==null ? null : commandBuffer.getPointer()) /* ByteBuffer */ ,
             (event==null ? null : event.getPointer()) /* ByteBuffer */ ,
             stageMask  );
} 

/**
 *  Native interface for Vulkan method #124
 *  vkCmdSetEvent 
 * 
 * @param commandBuffer - 
 * @param event - 
 * @param stageMask - 
 */
 private static native void vkCmdSetEvent0(
             java.nio.ByteBuffer   commandBuffer,
             java.nio.ByteBuffer   event,
             int  stageMask);/* 
     vkCmdSetEvent(
                     (VkCommandBuffer) commandBuffer,
                     (VkEvent) event ,
                     (VkPipelineStageFlags) stageMask);
*/ 

/**
 *  Vulkan procedure ID: 125
 * <h2>Prototype</h2><pre>
 *  void  vkCmdResetEvent(
 *     VkCommandBuffer                             commandBuffer,
 *     VkEvent                                     event,
 *     VkPipelineStageFlags                        stageMask);
 * </pre>
 * 
 * @param commandBuffer - 
 * @param event - 
 * @param stageMask - 
 */
    public static void  vkCmdResetEvent(
             VkCommandBuffer commandBuffer,
             VkEvent event,
             int stageMask){
     vkCmdResetEvent0(
             (commandBuffer==null ? null : commandBuffer.getPointer()) /* ByteBuffer */ ,
             (event==null ? null : event.getPointer()) /* ByteBuffer */ ,
             stageMask  );
} 

/**
 *  Native interface for Vulkan method #125
 *  vkCmdResetEvent 
 * 
 * @param commandBuffer - 
 * @param event - 
 * @param stageMask - 
 */
 private static native void vkCmdResetEvent0(
             java.nio.ByteBuffer   commandBuffer,
             java.nio.ByteBuffer   event,
             int  stageMask);/* 
     vkCmdResetEvent(
                     (VkCommandBuffer) commandBuffer,
                     (VkEvent) event ,
                     (VkPipelineStageFlags) stageMask);
*/ 


     /////////////////////////////////////

/**
 *  Vulkan procedure ID: 126
 * <h2>Prototype</h2><pre>
 *  void  vkCmdWaitEvents(
 *     VkCommandBuffer                             commandBuffer,
 *     uint32_t                                    eventCount,
 *     const VkEvent*                              pEvents,
 *     VkPipelineStageFlags                        srcStageMask,
 *     VkPipelineStageFlags                        dstStageMask,
 *     uint32_t                                    memoryBarrierCount,
 *     const VkMemoryBarrier*                      pMemoryBarriers,
 *     uint32_t                                    bufferMemoryBarrierCount,
 *     const VkBufferMemoryBarrier*                pBufferMemoryBarriers,
 *     uint32_t                                    imageMemoryBarrierCount,
 *     const VkImageMemoryBarrier*                 pImageMemoryBarriers);
 * </pre>
 * 
 * @param commandBuffer - 
 * @param eventCount - 
 * @param pEvents - 
 * @param srcStageMask - 
 * @param dstStageMask - 
 * @param memoryBarrierCount - 
 * @param pMemoryBarriers - 
 * @param bufferMemoryBarrierCount - 
 * @param pBufferMemoryBarriers - 
 * @param imageMemoryBarrierCount - 
 * @param pImageMemoryBarriers - 
 */
    public static void  vkCmdWaitEvents(
             VkCommandBuffer commandBuffer,
             int eventCount,
              VkEvent  pEvents,
             int srcStageMask,
             int dstStageMask,
             int memoryBarrierCount,
              VkMemoryBarrier  pMemoryBarriers,
             int bufferMemoryBarrierCount,
              VkBufferMemoryBarrier  pBufferMemoryBarriers,
             int imageMemoryBarrierCount,
              VkImageMemoryBarrier  pImageMemoryBarriers){
     vkCmdWaitEvents0(
             (commandBuffer==null ? null : commandBuffer.getPointer()) /* ByteBuffer */ ,
             eventCount ,
             (pEvents==null ? null : pEvents.getPointer()) /* ByteBuffer */ ,
             srcStageMask ,
             dstStageMask ,
             memoryBarrierCount ,
             (pMemoryBarriers==null ? null : pMemoryBarriers.getPointer()) /* ByteBuffer */ ,
             bufferMemoryBarrierCount ,
             (pBufferMemoryBarriers==null ? null : pBufferMemoryBarriers.getPointer()) /* ByteBuffer */ ,
             imageMemoryBarrierCount ,
             (pImageMemoryBarriers==null ? null : pImageMemoryBarriers.getPointer()) /* ByteBuffer */  );
} 

/**
 *  Native interface for Vulkan method #126
 *  vkCmdWaitEvents 
 * 
 * @param commandBuffer - 
 * @param eventCount - 
 * @param pEvents - 
 * @param srcStageMask - 
 * @param dstStageMask - 
 * @param memoryBarrierCount - 
 * @param pMemoryBarriers - 
 * @param bufferMemoryBarrierCount - 
 * @param pBufferMemoryBarriers - 
 * @param imageMemoryBarrierCount - 
 * @param pImageMemoryBarriers - 
 */
 private static native void vkCmdWaitEvents0(
             java.nio.ByteBuffer   commandBuffer,
             int  eventCount,
             java.nio.ByteBuffer   pEvents,
             int  srcStageMask,
             int  dstStageMask,
             int  memoryBarrierCount,
             java.nio.ByteBuffer   pMemoryBarriers,
             int  bufferMemoryBarrierCount,
             java.nio.ByteBuffer   pBufferMemoryBarriers,
             int  imageMemoryBarrierCount,
             java.nio.ByteBuffer   pImageMemoryBarriers);/* 
     vkCmdWaitEvents(
                     (VkCommandBuffer) commandBuffer,
                     (uint32_t) eventCount,
                     (const VkEvent*) pEvents,
                     (VkPipelineStageFlags) srcStageMask,
                     (VkPipelineStageFlags) dstStageMask,
                     (uint32_t) memoryBarrierCount,
                     (const VkMemoryBarrier*) pMemoryBarriers,
                     (uint32_t) bufferMemoryBarrierCount,
                     (const VkBufferMemoryBarrier*) pBufferMemoryBarriers,
                     (uint32_t) imageMemoryBarrierCount,
                     (const VkImageMemoryBarrier*) pImageMemoryBarriers);
*/ 


     /////////////////////////////////////

/**
 *  Vulkan procedure ID: 127
 * <h2>Prototype</h2><pre>
 *  void  vkCmdPipelineBarrier(
 *     VkCommandBuffer                             commandBuffer,
 *     VkPipelineStageFlags                        srcStageMask,
 *     VkPipelineStageFlags                        dstStageMask,
 *     VkDependencyFlags                           dependencyFlags,
 *     uint32_t                                    memoryBarrierCount,
 *     const VkMemoryBarrier*                      pMemoryBarriers,
 *     uint32_t                                    bufferMemoryBarrierCount,
 *     const VkBufferMemoryBarrier*                pBufferMemoryBarriers,
 *     uint32_t                                    imageMemoryBarrierCount,
 *     const VkImageMemoryBarrier*                 pImageMemoryBarriers);
 * </pre>
 * 
 * @param commandBuffer - 
 * @param srcStageMask - 
 * @param dstStageMask - 
 * @param dependencyFlags - 
 * @param memoryBarrierCount - 
 * @param pMemoryBarriers - 
 * @param bufferMemoryBarrierCount - 
 * @param pBufferMemoryBarriers - 
 * @param imageMemoryBarrierCount - 
 * @param pImageMemoryBarriers - 
 */
    public static void  vkCmdPipelineBarrier(
             VkCommandBuffer commandBuffer,
             int srcStageMask,
             int dstStageMask,
             int dependencyFlags,
             int memoryBarrierCount,
              VkMemoryBarrier  pMemoryBarriers,
             int bufferMemoryBarrierCount,
              VkBufferMemoryBarrier  pBufferMemoryBarriers,
             int imageMemoryBarrierCount,
              VkImageMemoryBarrier  pImageMemoryBarriers){
     vkCmdPipelineBarrier0(
             (commandBuffer==null ? null : commandBuffer.getPointer()) /* ByteBuffer */ ,
             srcStageMask ,
             dstStageMask ,
             dependencyFlags ,
             memoryBarrierCount ,
             (pMemoryBarriers==null ? null : pMemoryBarriers.getPointer()) /* ByteBuffer */ ,
             bufferMemoryBarrierCount ,
             (pBufferMemoryBarriers==null ? null : pBufferMemoryBarriers.getPointer()) /* ByteBuffer */ ,
             imageMemoryBarrierCount ,
             (pImageMemoryBarriers==null ? null : pImageMemoryBarriers.getPointer()) /* ByteBuffer */  );
} 

/**
 *  Native interface for Vulkan method #127
 *  vkCmdPipelineBarrier 
 * 
 * @param commandBuffer - 
 * @param srcStageMask - 
 * @param dstStageMask - 
 * @param dependencyFlags - 
 * @param memoryBarrierCount - 
 * @param pMemoryBarriers - 
 * @param bufferMemoryBarrierCount - 
 * @param pBufferMemoryBarriers - 
 * @param imageMemoryBarrierCount - 
 * @param pImageMemoryBarriers - 
 */
 private static native void vkCmdPipelineBarrier0(
             java.nio.ByteBuffer   commandBuffer,
             int  srcStageMask,
             int  dstStageMask,
             int  dependencyFlags,
             int  memoryBarrierCount,
             java.nio.ByteBuffer   pMemoryBarriers,
             int  bufferMemoryBarrierCount,
             java.nio.ByteBuffer   pBufferMemoryBarriers,
             int  imageMemoryBarrierCount,
             java.nio.ByteBuffer   pImageMemoryBarriers);/* 
     vkCmdPipelineBarrier(
                     (VkCommandBuffer) commandBuffer,
                     (VkPipelineStageFlags) srcStageMask,
                     (VkPipelineStageFlags) dstStageMask,
                     (VkDependencyFlags) dependencyFlags,
                     (uint32_t) memoryBarrierCount,
                     (const VkMemoryBarrier*) pMemoryBarriers,
                     (uint32_t) bufferMemoryBarrierCount,
                     (const VkBufferMemoryBarrier*) pBufferMemoryBarriers,
                     (uint32_t) imageMemoryBarrierCount,
                     (const VkImageMemoryBarrier*) pImageMemoryBarriers);
*/ 


/**
 *  Vulkan procedure ID: 128
 * <h2>Prototype</h2><pre>
 *  void  vkCmdBeginQuery(
 *     VkCommandBuffer                             commandBuffer,
 *     VkQueryPool                                 queryPool,
 *     uint32_t                                    query,
 *     VkQueryControlFlags                         flags);
 * </pre>
 * 
 * @param commandBuffer - 
 * @param queryPool - 
 * @param query - 
 * @param flags - 
 */
    public static void  vkCmdBeginQuery(
             VkCommandBuffer commandBuffer,
             VkQueryPool queryPool,
             int query,
             int flags){
     vkCmdBeginQuery0(
             (commandBuffer==null ? null : commandBuffer.getPointer()) /* ByteBuffer */ ,
             (queryPool==null ? null : queryPool.getPointer()) /* ByteBuffer */ ,
             query ,
             flags  );
} 

/**
 *  Native interface for Vulkan method #128
 *  vkCmdBeginQuery 
 * 
 * @param commandBuffer - 
 * @param queryPool - 
 * @param query - 
 * @param flags - 
 */
 private static native void vkCmdBeginQuery0(
             java.nio.ByteBuffer   commandBuffer,
             java.nio.ByteBuffer   queryPool,
             int  query,
             int  flags);/* 
     vkCmdBeginQuery(
                     (VkCommandBuffer) commandBuffer,
                     (VkQueryPool) queryPool,
                     (uint32_t) query,
                     (VkQueryControlFlags) flags);
*/ 



/**
 *  Vulkan procedure ID: 129
 * <h2>Prototype</h2><pre>
 *  void  vkCmdEndQuery(
 *     VkCommandBuffer                             commandBuffer,
 *     VkQueryPool                                 queryPool,
 *     uint32_t                                    query);
 * </pre>
 * 
 * @param commandBuffer - 
 * @param queryPool - 
 * @param query - 
 */
    public static void  vkCmdEndQuery(
             VkCommandBuffer commandBuffer,
             VkQueryPool queryPool,
             int query){
     vkCmdEndQuery0(
             (commandBuffer==null ? null : commandBuffer.getPointer()) /* ByteBuffer */ ,
             (queryPool==null ? null : queryPool.getPointer()) /* ByteBuffer */ ,
             query  );
} 

/**
 *  Native interface for Vulkan method #129
 *  vkCmdEndQuery 
 * 
 * @param commandBuffer - 
 * @param queryPool - 
 * @param query - 
 */
 private static native void vkCmdEndQuery0(
             java.nio.ByteBuffer   commandBuffer,
             java.nio.ByteBuffer   queryPool,
             int  query);/* 
     vkCmdEndQuery(
                     (VkCommandBuffer) commandBuffer,
                     (VkQueryPool) queryPool,
                     (uint32_t) query);
*/ 


/**
 *  Vulkan procedure ID: 130
 * <h2>Prototype</h2><pre>
 *  void  vkCmdResetQueryPool(
 *     VkCommandBuffer                             commandBuffer,
 *     VkQueryPool                                 queryPool,
 *     uint32_t                                    firstQuery,
 *     uint32_t                                    queryCount);
 * </pre>
 * 
 * @param commandBuffer - 
 * @param queryPool - 
 * @param firstQuery - 
 * @param queryCount - 
 */
    public static void  vkCmdResetQueryPool(
             VkCommandBuffer commandBuffer,
             VkQueryPool queryPool,
             int firstQuery,
             int queryCount){
     vkCmdResetQueryPool0(
             (commandBuffer==null ? null : commandBuffer.getPointer()) /* ByteBuffer */ ,
             (queryPool==null ? null : queryPool.getPointer()) /* ByteBuffer */ ,
             firstQuery ,
             queryCount  );
} 

/**
 *  Native interface for Vulkan method #130
 *  vkCmdResetQueryPool 
 * 
 * @param commandBuffer - 
 * @param queryPool - 
 * @param firstQuery - 
 * @param queryCount - 
 */
 private static native void vkCmdResetQueryPool0(
             java.nio.ByteBuffer   commandBuffer,
             java.nio.ByteBuffer   queryPool,
             int  firstQuery,
             int  queryCount);/* 
     vkCmdResetQueryPool(
                     (VkCommandBuffer) commandBuffer,
                     (VkQueryPool) queryPool,
                     (uint32_t) firstQuery,
                     (uint32_t) queryCount);
*/ 



/**
 *  Vulkan procedure ID: 131
 * <h2>Prototype</h2><pre>
 *  void  vkCmdWriteTimestamp(
 *     VkCommandBuffer                             commandBuffer,
 *     VkPipelineStageFlagBits                     pipelineStage,
 *     VkQueryPool                                 queryPool,
 *     uint32_t                                    query);
 * </pre>
 * 
 * @param commandBuffer - 
 * @param pipelineStage - 
 * @param queryPool - 
 * @param query - 
 */
    public static void  vkCmdWriteTimestamp(
             VkCommandBuffer commandBuffer,
             VkPipelineStageFlagBits pipelineStage,
             VkQueryPool queryPool,
             int query){
     vkCmdWriteTimestamp0(
             (commandBuffer==null ? null : commandBuffer.getPointer()) /* ByteBuffer */ ,
             pipelineStage.getValue() /* enum */,
             (queryPool==null ? null : queryPool.getPointer()) /* ByteBuffer */ ,
             query  );
} 

/**
 *  Native interface for Vulkan method #131
 *  vkCmdWriteTimestamp 
 * 
 * @param commandBuffer - 
 * @param pipelineStage - 
 * @param queryPool - 
 * @param query - 
 */
 private static native void vkCmdWriteTimestamp0(
             java.nio.ByteBuffer   commandBuffer,
             int   pipelineStage,
             java.nio.ByteBuffer   queryPool,
             int  query);/* 
     vkCmdWriteTimestamp(
                     (VkCommandBuffer) commandBuffer,
                     (VkPipelineStageFlagBits) pipelineStage,
                     (VkQueryPool) queryPool,
                     (uint32_t) query);
*/ 


/**
 *  Vulkan procedure ID: 132
 * <h2>Prototype</h2><pre>
 *  void  vkCmdCopyQueryPoolResults(
 *     VkCommandBuffer                             commandBuffer,
 *     VkQueryPool                                 queryPool,
 *     uint32_t                                    firstQuery,
 *     uint32_t                                    queryCount,
 *     VkBuffer                                    dstBuffer,
 *     VkDeviceSize                                dstOffset,
 *     VkDeviceSize                                stride,
 *     VkQueryResultFlags                          flags);
 * </pre>
 * 
 * @param commandBuffer - 
 * @param queryPool - 
 * @param firstQuery - 
 * @param queryCount - 
 * @param dstBuffer - 
 * @param dstOffset - 
 * @param stride - 
 * @param flags - 
 */
    public static void  vkCmdCopyQueryPoolResults(
             VkCommandBuffer commandBuffer,
             VkQueryPool queryPool,
             int firstQuery,
             int queryCount,
             VkBuffer dstBuffer,
             long dstOffset,
             long stride,
             int flags){
     vkCmdCopyQueryPoolResults0(
             (commandBuffer==null ? null : commandBuffer.getPointer()) /* ByteBuffer */ ,
             (queryPool==null ? null : queryPool.getPointer()) /* ByteBuffer */ ,
             firstQuery ,
             queryCount ,
             (dstBuffer==null ? null : dstBuffer.getPointer()) /* ByteBuffer */ ,
             dstOffset ,
             stride ,
             flags  );

} 

/**
 *  Native interface for Vulkan method #132
 *  vkCmdCopyQueryPoolResults 
 * 
 * @param commandBuffer - 
 * @param queryPool - 
 * @param firstQuery - 
 * @param queryCount - 
 * @param dstBuffer - 
 * @param dstOffset - 
 * @param stride - 
 * @param flags - 
 */
 private static native void vkCmdCopyQueryPoolResults0(
             java.nio.ByteBuffer   commandBuffer,
             java.nio.ByteBuffer   queryPool,
             int  firstQuery,
             int  queryCount,
             java.nio.ByteBuffer   dstBuffer,
             long  dstOffset,
             long  stride,
             int  flags);/* 
     vkCmdCopyQueryPoolResults(
                     (VkCommandBuffer) commandBuffer,
                     (VkQueryPool) queryPool,
                     (uint32_t) firstQuery,
                     (uint32_t) queryCount,
                     (VkBuffer) dstBuffer,
                     (VkDeviceSize) dstOffset,
                     (VkDeviceSize) stride,
                     (VkQueryResultFlags) flags);
*/ 


     /////////////////////////////////////

/**
 *  Vulkan procedure ID: 133
 * <h2>Prototype</h2><pre>
 *  void  vkCmdPushConstants(
 *     VkCommandBuffer                             commandBuffer,
 *     VkPipelineLayout                            layout,
 *     VkShaderStageFlags                          stageFlags,
 *     uint32_t                                    offset,
 *     uint32_t                                    size,
 *     const void*                                 pValues);
 * </pre>
 * 
 * @param commandBuffer - 
 * @param layout - 
 * @param stageFlags - 
 * @param offset - 
 * @param size - 
 * @param pValues - 
 */
    public static void  vkCmdPushConstants(
             VkCommandBuffer commandBuffer,
             VkPipelineLayout layout,
             int stageFlags,
             int offset,
             int size,
             java.nio.Buffer pValues){
     vkCmdPushConstants0(
             (commandBuffer==null ? null : commandBuffer.getPointer()) /* ByteBuffer */ ,
             (layout==null ? null : layout.getPointer()) /* ByteBuffer */ ,
             stageFlags ,
             offset ,
             size ,
             pValues  );
} 

/**
 *  Native interface for Vulkan method #133
 *  vkCmdPushConstants 
 * 
 * @param commandBuffer - 
 * @param layout - 
 * @param stageFlags - 
 * @param offset - 
 * @param size - 
 * @param pValues - 
 */
 private static native void vkCmdPushConstants0(
             java.nio.ByteBuffer   commandBuffer,
             java.nio.ByteBuffer   layout,
             int  stageFlags,
             int  offset,
             int  size,
             java.nio.Buffer  pValues);/* 
     vkCmdPushConstants(
                     (VkCommandBuffer) commandBuffer,
                     (VkPipelineLayout) layout,
                     (VkShaderStageFlags) stageFlags,
                     (uint32_t) offset,
                     (uint32_t) size,
                     (const void*) pValues);
*/ 

/**
 *  Vulkan procedure ID: 134
 * <h2>Prototype</h2><pre>
 *  void  vkCmdBeginRenderPass(
 *     VkCommandBuffer                             commandBuffer,
 *     const VkRenderPassBeginInfo*                pRenderPassBegin,
 *     VkSubpassContents                           contents);
 * </pre>
 * 
 * @param commandBuffer - 
 * @param pRenderPassBegin - 
 * @param contents - 
 */
    public static void  vkCmdBeginRenderPass(
             VkCommandBuffer commandBuffer,
              VkRenderPassBeginInfo  pRenderPassBegin,
             VkSubpassContents contents){
     vkCmdBeginRenderPass0(
             (commandBuffer==null ? null : commandBuffer.getPointer()) /* ByteBuffer */ ,
             (pRenderPassBegin==null ? null : pRenderPassBegin.getPointer()) /* ByteBuffer */ ,
             contents.getValue() /* enum */ );

} 

/**
 *  Native interface for Vulkan method #134
 *  vkCmdBeginRenderPass 
 * 
 * @param commandBuffer - 
 * @param pRenderPassBegin - 
 * @param contents - 
 */
 private static native void vkCmdBeginRenderPass0(
             java.nio.ByteBuffer   commandBuffer,
             java.nio.ByteBuffer   pRenderPassBegin,
             int   contents);/* 
     vkCmdBeginRenderPass(
                     (VkCommandBuffer) commandBuffer,
                     (const VkRenderPassBeginInfo*) pRenderPassBegin,
                     (VkSubpassContents) contents);
*/ 

/**
 *  Vulkan procedure ID: 135
 * <h2>Prototype</h2><pre>
 *  void  vkCmdNextSubpass(
 *     VkCommandBuffer                             commandBuffer,
 *     VkSubpassContents                           contents);
 * </pre>
 * 
 * @param commandBuffer - 
 * @param contents - 
 */
    public static void  vkCmdNextSubpass(
             VkCommandBuffer commandBuffer,
             VkSubpassContents contents){
     vkCmdNextSubpass0(
             (commandBuffer==null ? null : commandBuffer.getPointer()) /* ByteBuffer */ ,
             contents.getValue() /* enum */ );

} 

/**
 *  Native interface for Vulkan method #135
 *  vkCmdNextSubpass 
 * 
 * @param commandBuffer - 
 * @param contents - 
 */
 private static native void vkCmdNextSubpass0(
             java.nio.ByteBuffer   commandBuffer,
             int   contents);/* 
     vkCmdNextSubpass(
                     (VkCommandBuffer) commandBuffer,
                     (VkSubpassContents) contents);
*/ 


     /////////////////////////////////////

/**
 *  Vulkan procedure ID: 136
 * <h2>Prototype</h2><pre>
 *  void  vkCmdEndRenderPass(
 *     VkCommandBuffer                             commandBuffer);
 * </pre>
 * 
 * @param commandBuffer - 
 */
    public static void  vkCmdEndRenderPass(VkCommandBuffer commandBuffer){
     vkCmdEndRenderPass0((commandBuffer==null ? null : commandBuffer.getPointer()));
} 

/**
 *  Native interface for Vulkan method #136
 *  vkCmdEndRenderPass 
 * 
 * @param commandBuffer - 
 */
 private static native void vkCmdEndRenderPass0(java.nio.ByteBuffer   commandBuffer);/* 
     vkCmdEndRenderPass((VkCommandBuffer) commandBuffer);
*/ 


     /////////////////////////////////////

/**
 *  Vulkan procedure ID: 137
 * <h2>Prototype</h2><pre>
 *  void  vkCmdExecuteCommands(
 *     VkCommandBuffer                             commandBuffer,
 *     uint32_t                                    commandBufferCount,
 *     const VkCommandBuffer*                      pCommandBuffers);
 * </pre>
 * 
 * @param commandBuffer - 
 * @param commandBufferCount - 
 * @param pCommandBuffers - 
 */
    public static void  vkCmdExecuteCommands(
             VkCommandBuffer commandBuffer,
             int commandBufferCount,
              VkCommandBuffer  pCommandBuffers){
     vkCmdExecuteCommands0(
             (commandBuffer==null ? null : commandBuffer.getPointer()) /* ByteBuffer */ ,
             commandBufferCount ,
             (pCommandBuffers==null ? null : pCommandBuffers.getPointer()) /* ByteBuffer */  );

} 

/**
 *  Native interface for Vulkan method #137
 *  vkCmdExecuteCommands 
 * 
 * @param commandBuffer - 
 * @param commandBufferCount - 
 * @param pCommandBuffers - 
 */
 private static native void vkCmdExecuteCommands0(
             java.nio.ByteBuffer   commandBuffer,
             int  commandBufferCount,
             java.nio.ByteBuffer   pCommandBuffers);/* 
     
     vkCmdExecuteCommands(
                     (VkCommandBuffer) commandBuffer,
                     (uint32_t) commandBufferCount,
                     (const VkCommandBuffer*) pCommandBuffers);

*/ 

 ////////////////////////////////////////////////////////////
 // WSI SURFACES
 ///////////////////////////////////////////////////////////
 
   public static VkResult vkCreateAndroidSurfaceKHR(VkInstance  instance,
                                             VkAndroidSurfaceCreateInfoKHR        pCreateInfo,
                                             VkAllocationCallbacks   pAllocator,
                                             VkSurfaceKHR[]   pSurface){
       int[] result = {0};
       
       ByteBuffer bb = vkCreateAndroidSurfaceKHR0(instance.getPointer(), 
                                                  pCreateInfo.getPointer(), 
                                                  (pAllocator == null? null : pAllocator.getPointer()), 
                                                  result); 
       pSurface[0] = wrap(bb);
       
       return VkResult.fromValue(result[0]);
   }
   
   private static native  ByteBuffer vkCreateAndroidSurfaceKHR0(ByteBuffer  instance,
                                                                ByteBuffer   pCreateInfo,
                                                                ByteBuffer   pAllocator,
                                                                int[] result);/*
    #ifdef VK_USE_PLATFORM_ANDROID_KHR                                                        
           VkSurfaceKHR* pSurface = new VkSurfaceKHR;                                                     
           VkResult res =  vkCreateAndroidSurfaceKHR( (VkInstance) instance,
                                                      (VkAndroidSurfaceCreateInfoKHR*) pCreateInfo,
                                                      (VkAllocationCallbacks*)   pAllocator,
                                                      (VkSurfaceKHR*)  pSurface);
           result[0] = (jint) res;
           jobject buffer = NULL; 
           if(res>=0){
               buffer = (jobject)(env->NewDirectByteBuffer((void*)pSurface, sizeof(VkSurfaceKHR)));                 
            }else{
              if(pSurface)
                 free(pSurface);
            }
            return buffer;
      #else
              result[0] = (jint)VkResult::VK_ERROR_INCOMPATIBLE_DISPLAY_KHR;  
              return NULL;
      #endif  
    */
   
   
  
   

   /**
    * 
    * @param instance
    * @param pCreateInfo
    * @param pAllocator
    * @param pSurface
    * @return
    */
   public static VkResult vkCreateMirSurfaceKHR(VkInstance  instance,
                                                VkMirSurfaceCreateInfoKHR        pCreateInfo,
                                                VkAllocationCallbacks   pAllocator,
                                                VkSurfaceKHR[]   pSurface){
              int[] result = {0};              
              ByteBuffer bb = vkCreateMirSurfaceKHR0(instance.getPointer(), 
                                                     pCreateInfo.getPointer(), 
                                                     (pAllocator == null? null : pAllocator.getPointer()), 
                                                     result); 
              pSurface[0] = wrap(bb);              
              return VkResult.fromValue(result[0]);
          }
          
    private static native  ByteBuffer vkCreateMirSurfaceKHR0(ByteBuffer  instance,
                                                                       ByteBuffer   pCreateInfo,
                                                                       ByteBuffer   pAllocator,
                                                                       int[] result);/*
           #ifdef VK_USE_PLATFORM_MIR_KHR                                                        
                  VkSurfaceKHR* pSurface = new VkSurfaceKHR;                                                     
                  VkResult res =  vkCreateMirSurfaceKHR( (VkInstance) instance,
                                                             (VkMirSurfaceCreateInfoKHR*) pCreateInfo,
                                                             (VkAllocationCallbacks*)   pAllocator,
                                                             (VkSurfaceKHR*)  pSurface);
                  result[0] = (jint) res;
                  jobject buffer = NULL; 
                  if(res>=0){
                      buffer = (jobject)(env->NewDirectByteBuffer((void*)pSurface, sizeof(VkSurfaceKHR)));                 
                   }else{
                     if(pSurface)
                        free(pSurface);
                   }
                   return buffer;
             #else
                     result[0] = (jint)VkResult::VK_ERROR_INCOMPATIBLE_DISPLAY_KHR;  
                     return NULL;
             #endif  
           */
   
   
  // vkCreateWaylandSurfaceKHR
   
   /**
    * 
    * @param instance
    * @param pCreateInfo
    * @param pAllocator
    * @param pSurface
    * @return
    */
   public static VkResult vkCreateWaylandSurfaceKHR(VkInstance  instance,
                                                    VkWaylandSurfaceCreateInfoKHR        pCreateInfo,
                                                    VkAllocationCallbacks   pAllocator,
                                                    VkSurfaceKHR[]   pSurface){
              int[] result = {0};              
              ByteBuffer bb = vkCreateWaylandSurfaceKHR0(instance.getPointer(), 
                                                     pCreateInfo.getPointer(), 
                                                     (pAllocator == null? null : pAllocator.getPointer()), 
                                                     result); 
              pSurface[0] = wrap(bb);              
              return VkResult.fromValue(result[0]);
          }
    
   /**
    * 
    * @param instance
    * @param pCreateInfo
    * @param pAllocator
    * @param result
    * @return
    */
    private static native  ByteBuffer vkCreateWaylandSurfaceKHR0(ByteBuffer  instance,
                                                                 ByteBuffer   pCreateInfo,
                                                                 ByteBuffer   pAllocator,
                                                                 int[] result);/*
           #ifdef VK_USE_PLATFORM_MIR_KHR                                                        
                  VkSurfaceKHR* pSurface = new VkSurfaceKHR;                                                     
                  VkResult res =  vkCreateWaylandSurfaceKHR( (VkInstance) instance,
                                                             (VkMirSurfaceCreateInfoKHR*) pCreateInfo,
                                                             (VkAllocationCallbacks*)   pAllocator,
                                                             (VkSurfaceKHR*)  pSurface);
                  result[0] = (jint) res;
                  jobject buffer = NULL; 
                  if(res>=0){
                      buffer = (jobject)(env->NewDirectByteBuffer((void*)pSurface, sizeof(VkSurfaceKHR)));                 
                   }else{
                     if(pSurface)
                        free(pSurface);
                   }
                   return buffer;
             #else
                     result[0] = (jint)VkResult::VK_ERROR_INCOMPATIBLE_DISPLAY_KHR;  
                     return NULL;
             #endif  
           */
   
   
   // vkCreateWin32SurfaceKHR
   
    /**
     * 
     * @param instance
     * @param pCreateInfo
     * @param pAllocator
     * @param pSurface
     * @return
     */
    public static VkResult vkCreateWin32SurfaceKHR(VkInstance  instance,
                                                   VkWin32SurfaceCreateInfoKHR  pCreateInfo,
                                                   VkAllocationCallbacks   pAllocator,
                                                   VkSurfaceKHR[]   pSurface){
               int[] result = {0};              
               ByteBuffer bb = vkCreateWaylandSurfaceKHR0(instance.getPointer(), 
                                                      pCreateInfo.getPointer(), 
                                                      (pAllocator == null? null : pAllocator.getPointer()), 
                                                      result); 
               pSurface[0] = wrap(bb);              
               return VkResult.fromValue(result[0]);
           }
     
    /**
     * 
     * @param instance
     * @param pCreateInfo
     * @param pAllocator
     * @param result
     * @return
     */
     private static native  ByteBuffer vkCreateWin32SurfaceKHR0(ByteBuffer  instance,
                                                                  ByteBuffer   pCreateInfo,
                                                                  ByteBuffer   pAllocator,
                                                                  int[] result);/*
            // used in Windows OS only                                                      
            #ifdef VK_USE_PLATFORM_WIN32_KHR                                                        
                   VkSurfaceKHR* pSurface = new VkSurfaceKHR;                                                     
                   VkResult res =  vkCreateWin32SurfaceKHR( (VkInstance) instance,
                                                              (VkWin32SurfaceCreateInfoKHR*) pCreateInfo,
                                                              (VkAllocationCallbacks*)   pAllocator,
                                                              (VkSurfaceKHR*)  pSurface);
                   result[0] = (jint) res;
                   jobject buffer = NULL; 
                   if(res>=0){
                       buffer = (jobject)(env->NewDirectByteBuffer((void*)pSurface, sizeof(VkSurfaceKHR)));                 
                    }else{
                      if(pSurface)
                         free(pSurface);
                    }
                    return buffer;
              #else
                      result[0] = (jint)VkResult::VK_ERROR_INCOMPATIBLE_DISPLAY_KHR;  
                      return NULL;
              #endif  
            */
   
   //vkCreateXcbSurfaceKHR
   
     /**
      * 
      * @param instance
      * @param pCreateInfo
      * @param pAllocator
      * @param pSurface
      * @return
      */
     public static VkResult vkCreateXcbSurfaceKHR(VkInstance  instance,
                                                  VkXcbSurfaceCreateInfoKHR  pCreateInfo,
                                                  VkAllocationCallbacks   pAllocator,
                                                  VkSurfaceKHR[]   pSurface){
                int[] result = {0};              
                ByteBuffer bb = vkCreateXcbSurfaceKHR0(instance.getPointer(), 
                                                       pCreateInfo.getPointer(), 
                                                       (pAllocator == null? null : pAllocator.getPointer()), 
                                                       result); 
                pSurface[0] = wrap(bb);              
                return VkResult.fromValue(result[0]);
            }
      
     /**
      * 
      * @param instance
      * @param pCreateInfo
      * @param pAllocator
      * @param result
      * @return
      */
      private static native  ByteBuffer vkCreateXcbSurfaceKHR0(ByteBuffer  instance,
                                                               ByteBuffer   pCreateInfo,
                                                               ByteBuffer   pAllocator,
                                                               int[] result);/*
             #ifdef VK_USE_PLATFORM_XCB_KHR                                                        
                    VkSurfaceKHR* pSurface = new VkSurfaceKHR;//(VkSurfaceKHR*)malloc(sizeof(VkSurfaceKHR));                                                     
                    VkResult res =  vkCreateXcbSurfaceKHR( (VkInstance) instance,
                                                               (VkXcbSurfaceCreateInfoKHR*) pCreateInfo,
                                                               (VkAllocationCallbacks*)   pAllocator,
                                                               (VkSurfaceKHR*)  pSurface);
                    result[0] = (jint) res;
                    jobject buffer = NULL; 
                    if(res>=0){
                        buffer = (jobject)(env->NewDirectByteBuffer((void*)pSurface, sizeof(VkSurfaceKHR)));                 
                     }else{
                       if(pSurface)
                          free(pSurface);
                     }
                     return buffer;
               #else
                       result[0] = (jint)VkResult::VK_ERROR_INCOMPATIBLE_DISPLAY_KHR;  
                       return NULL;
               #endif  
             */
   
   //vkCreateXlibSurfaceKHR
      /**
       * 
       * @param instance
       * @param pCreateInfo
       * @param pAllocator
       * @param pSurface
       * @return
       */
      public static VkResult vkCreateXlibSurfaceKHR(VkInstance  instance,
                                                    VkXlibSurfaceCreateInfoKHR  pCreateInfo,
                                                    VkAllocationCallbacks   pAllocator,
                                                    VkSurfaceKHR[]   pSurface){
                 int[] result = {0};              
                 ByteBuffer bb = vkCreateXlibSurfaceKHR0(instance.getPointer(), 
                                                        pCreateInfo.getPointer(), 
                                                        (pAllocator == null? null : pAllocator.getPointer()), 
                                                        result); 
                 pSurface[0] = wrap(bb);              
                 return VkResult.fromValue(result[0]);
             }
       
      /**
       * 
       * @param instance
       * @param pCreateInfo
       * @param pAllocator
       * @param result
       * @return
       */
       private static native  ByteBuffer vkCreateXlibSurfaceKHR0(ByteBuffer  instance,
                                                                ByteBuffer   pCreateInfo,
                                                                ByteBuffer   pAllocator,
                                                                int[] result);/*
              #ifdef VK_USE_PLATFORM_XCB_KHR                                                        
                     VkSurfaceKHR* pSurface = new VkSurfaceKHR;//(VkSurfaceKHR*)malloc(sizeof(VkSurfaceKHR));                                                     
                     VkResult res =  vkCreateXlibSurfaceKHR( (VkInstance) instance,
                                                                (VkXlibSurfaceCreateInfoKHR*) pCreateInfo,
                                                                (VkAllocationCallbacks*)   pAllocator,
                                                                (VkSurfaceKHR*)  pSurface);
                     result[0] = (jint) res;
                     jobject buffer = NULL; 
                     if(res>=0){
                         buffer = (jobject)(env->NewDirectByteBuffer((void*)pSurface, sizeof(VkSurfaceKHR)));                 
                      }else{
                        if(pSurface)
                           free(pSurface);
                      }
                      return buffer;
                #else
                        result[0] = (jint)VkResult::VK_ERROR_INCOMPATIBLE_DISPLAY_KHR;  
                        return NULL;
                #endif  
              */
   
 

   /**
    *      
    * @param instance
    * @param surface
    * @param pAllocator
    */
   public static void vkDestroySurfaceKHR(VkInstance   instance,
                                          VkSurfaceKHR surface,
                                          VkAllocationCallbacks  pAllocator){
     vkDestroySurfaceKHR0(instance.getPointer(),
                          surface.getPointer(),
                          (pAllocator == null ? null : pAllocator.getPointer()));
     
 }

 /**
  * 
  * @param instance
  * @param surface
  * @param pAllocator
  */
 private static native void vkDestroySurfaceKHR0(ByteBuffer instance,
                                                 ByteBuffer surface,
                                                 ByteBuffer pAllocator);/*
         vkDestroySurfaceKHR((VkInstance)   instance,
                             (VkSurfaceKHR) surface,
                             (VkAllocationCallbacks*)   pAllocator);
                                                     
                                                 
     */
 
 
 //vkCreateDisplayPlaneSurfaceKHR
 
 public static  VkResult vkCreateDisplayPlaneSurfaceKHR( VkInstance  instance,
                                                         VkDisplaySurfaceCreateInfoKHR        pCreateInfo,
                                                         VkAllocationCallbacks pAllocator,
                                                         VkSurfaceKHR[] pSurface){
     int[] result = {0};              
     ByteBuffer bb = vkCreateDisplayPlaneSurfaceKHR0(instance.getPointer(), 
                                                     pCreateInfo.getPointer(), 
                                                     (pAllocator == null? null : pAllocator.getPointer()), 
                                                      result); 
     pSurface[0] = wrap(bb);              
     return VkResult.fromValue(result[0]);
 }
 
 
 
 
 
 
 
 
 private static native ByteBuffer vkCreateDisplayPlaneSurfaceKHR0(ByteBuffer instance,
                                                                  ByteBuffer pCreateInfo,
                                                                  ByteBuffer pAllocator,
                                                                  int[] result);/*
                        
     if(vkCreateDisplayPlaneSurfaceKHR == NULL){
       result[0] = (jint) VkResult::VK_ERROR_EXTENSION_NOT_PRESENT;
       return (jobject) NULL;
     }
     
     VkSurfaceKHR* pSurface = new VkSurfaceKHR; //(VkSurfaceKHR*)malloc(sizeof(VkSurfaceKHR)); 
                                                                
     VkResult res =  vkCreateDisplayPlaneSurfaceKHR((VkInstance) instance,
                                                     (VkDisplaySurfaceCreateInfoKHR*)  pCreateInfo,
                                                     (VkAllocationCallbacks*) pAllocator,
                                                     (VkSurfaceKHR*)  pSurface);
                                                     
       result[0] = (jint) res;
       jobject buffer = NULL; 
       if(res>=0){
          buffer = (jobject)(env->NewDirectByteBuffer((void*)pSurface, sizeof(VkSurfaceKHR)));                 
       }else{
             if(pSurface)
             free(pSurface);
       }
       return buffer;
//    #else
//        result[0] = (jint)VkResult::VK_ERROR_INCOMPATIBLE_DISPLAY_KHR;  
//        return NULL;
//    #endif                                                                                            
                                                                 
    */
 /////////////////////////////////////////////////////////

   /**
    * There is no need to instance this class
    */
    private Vk10() {       
    }

}
