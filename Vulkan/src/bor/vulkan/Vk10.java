package bor.vulkan;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.List;

import bor.vulkan.enumerations.VkFormat;
import bor.vulkan.enumerations.VkImageCreateFlags;
import bor.vulkan.enumerations.VkImageTiling;
import bor.vulkan.enumerations.VkImageType;
import bor.vulkan.enumerations.VkImageUsageFlags;
import bor.vulkan.enumerations.VkResult;
import bor.vulkan.structs.VkAllocationCallbacks;
import bor.vulkan.structs.VkDeviceCreateInfo;
import bor.vulkan.structs.VkExtensionProperties;
import bor.vulkan.structs.VkFormatProperties;
import bor.vulkan.structs.VkImageFormatProperties;
import bor.vulkan.structs.VkInstanceCreateInfo;
import bor.vulkan.structs.VkLayerProperties;
import bor.vulkan.structs.VkPhysicalDeviceFeatures;
import bor.vulkan.structs.VkPhysicalDeviceMemoryProperties;
import bor.vulkan.structs.VkPhysicalDeviceProperties;
import bor.vulkan.structs.VkQueueFamilyProperties;

public class Vk10 extends Vulkan {

    /** Includes **/
    //@off
    /*JNI
      #include <vulkan/vulkan.h>      
      #include <stdio.h>
      #include <stdlib.h>
       
      using namespace std;
      
      static jclass byteBufferClass;
      
      // Cache method IDs each time the class is loaded. 
      static void
      nativeClassInit(JNIEnv *_env, jclass glImplClass)
      {                      
            jclass bufferClassLocal = _env->FindClass("java/nio/ByteBuffer");
            byteBufferClass = (jclass) _env->NewGlobalRef(bufferClassLocal);     
      }
      
      /////////////////
      //
      /////////////////  
      inline VkInstance deferVkInstance(unsigned char* pInstance)
      {
       VkInstance* instance = (VkInstance*)(pInstance);  
       return *instance;
      }
      
      ////////////////////////////////////////
     */
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
   public VkResult vkCreateInstance(VkInstanceCreateInfo pCreateInfo,
                                    VkAllocationCallbacks pAllocator,
                                    VkInstance pInstance) {
       int[] result = { 0 };
       ByteBuffer pInstanceHandle = vkCreateInstance0(pCreateInfo.getPointerStruct(), 
               pAllocator.getPointerStruct(),
               result);

       ((VkHandle) pInstance).setHandle(pInstanceHandle);
       return VkResult.fromValue(result[0]);
   }

  /**
   * 
   * @param pCreateInfo
   * @param pAllocator
   * @param result
   * @return
   */
   private static native ByteBuffer vkCreateInstance0(
       Buffer  pCreateInfo,
       Buffer  pAllocator,
       int[] result);/*
       
       // isolate [in][out] parameter and cast it
       jobject buff = NULL; 
       VkInstance* pInstance = nullptr;
               
       VkResult res =  vkCreateInstance(
        (const VkInstanceCreateInfo*)                 pCreateInfo,
        (const VkAllocationCallbacks*)                pAllocator,
        (VkInstance*)                                 pInstance);
                 
        // restore value for [OUT]
        result[0] = (jint) res;
        
         if(res==VK_SUCCESS){      
            buff = env->NewDirectByteBuffer((void*) pInstance, 
                                            (jlong) sizeof(void*));
         }                    
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
  public void vkDestroyInstance(VkInstance  instance,
                                VkAllocationCallbacks  pAllocator){
      
      vkDestroyInstance0(instance.getHandle(), 
                         pAllocator.getPointerStruct());
      
  }

  /**
   * Native method
   * @param instance
   * @param pAllocator
   */
   private static native void vkDestroyInstance0(Buffer  pInstance,
                                                 Buffer  pAllocator);/*       
       
       VkInstance* instance = (VkInstance*)(pInstance);                                                         
       vkDestroyInstance( (VkInstance) (*instance),
                          (const VkAllocationCallbacks*)   pAllocator);        
       */

       /////////////////////////////////////

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
    * 
    */
   public VkResult vkEnumeratePhysicalDevices(VkInstance instance,
                                              int[] pPhysicalDeviceCount,
                                              VkPhysicalDevice[] pPhysicalDevices){       
       int size = 0;
       ByteBuffer[]  pPhysicalDevicesArray = null;
       
       if (pPhysicalDevices != null) {
           size = pPhysicalDevices.length;
           pPhysicalDevicesArray = new ByteBuffer[size];
           for (int i = 0; i < pPhysicalDevices.length; i++) {
               pPhysicalDevices[i] = null;
           }
       }
       //sanity check
       if(pPhysicalDeviceCount==null || pPhysicalDeviceCount.length<1){
           pPhysicalDeviceCount = new int[1];
       }
             
       int res = vkEnumeratePhysicalDevices0(instance.getHandle(),
                                              pPhysicalDeviceCount,
                                              pPhysicalDevicesArray,
                                              size);
       // prepare to return
       if (pPhysicalDevices != null) {
           for (int i = 0; i < pPhysicalDevicesArray.length; i++) {
               ByteBuffer handle = pPhysicalDevicesArray[i];
               if (handle != null) {
                   pPhysicalDevices[i] = new VkHandle(handle);
               } // if
           }// for
       }// if null
       
       VkResult ret = VkResult.fromValue(res);
       if(ret==null){
           throw new UnsupportedOperationException("VkResult is ored value:" + res);
       }
       return ret;
   }// method

   /**
    * 
    * @param instance
    * @param pPhysicalDeviceCount
    * @param pPhysicalDevicesRet
    * @param size
    * @return
    */
   private static native int vkEnumeratePhysicalDevices0(
                                       Buffer instance,
                                       int[]   pPhysicalDeviceCount,
                                       Buffer[]  pPhysicalDevicesRet,
                                       int size);/*
       
       VkPhysicalDevice* pPhysicalDevices;        
       if(size>0){
          pPhysicalDevices =  new VkPhysicalDevice[size];
        }     
              
       VkResult res = vkEnumeratePhysicalDevices(deferVkInstance(instance),
                                  (uint32_t*)  pPhysicalDeviceCount,
                                  (VkPhysicalDevice*) pPhysicalDevices);
                                  
         // wrap pointers to ByteBuffer[] pPhysicalDevicesRet
         for(int i=0; i<size; i++){
               // if not null
              if(pPhysicalDevices+i){
                jobject buff =  env->NewDirectByteBuffer((void*) (pPhysicalDevices+i), 
                                                         (jlong) sizeof(void*));               
                if(buff)
                     env->SetObjectArrayElement(pPhysicalDevicesRet, i, buff);
              }
         }
         // clean up    
         if(pPhysicalDevices)
              delete pPhysicalDevices; 
         
         return (jint) res;
                     
                     
       */

       /////////////////////////////////////

       /**
        * <h2>Prototype</h2><pre>
        * VKAPI_ATTR void VKAPI_CALL vkGetPhysicalDeviceFeatures(
        *     VkPhysicalDevice                            physicalDevice,
        *     VkPhysicalDeviceFeatures*                   pFeatures);
        * </pre>
        */
  public  void vkGetPhysicalDeviceFeatures(VkPhysicalDevice  physicalDevice,
                                           VkPhysicalDeviceFeatures  pFeatures){
      vkGetPhysicalDeviceFeatures0( physicalDevice.getHandle(),
                                    pFeatures.getPointerStruct());      
  }

   private static native void vkGetPhysicalDeviceFeatures0(Buffer  pphysicalDevice,
                                                           Buffer  pFeatures);/*
                                                           
    VkPhysicalDevice* physicalDevice = (VkPhysicalDevice*)pphysicalDevice;
                                                           
    vkGetPhysicalDeviceFeatures(
               (VkPhysicalDevice)  (*physicalDevice),
               (VkPhysicalDeviceFeatures*)  pFeatures);
       */

       /////////////////////////////////////

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
        *  receive the result of the query. . 
        * 
        */
   public void vkGetPhysicalDeviceFormatProperties(VkPhysicalDevice physicalDevice,
                                                   VkFormat format,
                                                   VkFormatProperties pFormatProperties) {
       vkGetPhysicalDeviceFormatProperties0( physicalDevice.getHandle(),
                                             format.getValue(),
                                             pFormatProperties.getPointerStruct());
      }

   private static native void vkGetPhysicalDeviceFormatProperties0(
               Buffer  pphysicalDevice,
               int  format,
               Buffer  pFormatProperties);/*
               
     VkPhysicalDevice* physicalDevice = (VkPhysicalDevice*)pphysicalDevice;          
     vkGetPhysicalDeviceFormatProperties(
              (VkPhysicalDevice)  (*physicalDevice),
              (VkFormat)  format,
              (VkFormatProperties*)   pFormatProperties);
    */

       /////////////////////////////////////

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
  public  VkResult vkGetPhysicalDeviceImageFormatProperties(
               VkPhysicalDevice  physicalDevice,
               VkFormat  format,
               VkImageType  type,
               VkImageTiling  tiling,
               VkImageUsageFlags  usage,
               VkImageCreateFlags  flags,
               VkImageFormatProperties  pImageFormatProperties){
      
    int res =  vkGetPhysicalDeviceImageFormatProperties0(
             /*VkPhysicalDevice*/  physicalDevice.getHandle(),
             /* VkFormat*/     format.getValue(),
             /* VkImageType*/  type.getValue(),
             /* VkImageTiling*/  tiling.getValue(),
             /* VkImageUsageFlags*/  usage.getValue(),
             /* VkImageCreateFlags*/  flags.getValue(),
             /* VkImageFormatProperties*/  pImageFormatProperties.getPointerStruct()
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
               Buffer  pphysicalDevice,
               int  format,
               int  type,
               int  tiling,
               int  usage,
               int  flags,
               Buffer  pImageFormatProperties);/*
               
         VkPhysicalDevice* physicalDevice = (VkPhysicalDevice*)pphysicalDevice;
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

       /////////////////////////////////////

       /**
        * <h2>Prototype</h2><pre>
        * VKAPI_ATTR void VKAPI_CALL vkGetPhysicalDeviceProperties(
        *     VkPhysicalDevice                            physicalDevice,
        *     VkPhysicalDeviceProperties*                 pProperties);
        * </pre>
        */
  public  void vkGetPhysicalDeviceProperties(
               VkPhysicalDevice  physicalDevice,
               VkPhysicalDeviceProperties  pProperties){
      
      vkGetPhysicalDeviceProperties0(
              physicalDevice.getHandle(),
              pProperties.getPointerStruct()
              );
      
  }

  /**
   * 
   * @param physicalDevice
   * @param pProperties
   */
   private static native void vkGetPhysicalDeviceProperties0(
               Buffer  pphysicalDevice,
               Buffer  pProperties);/* 
               
       VkPhysicalDevice* physicalDevice = (VkPhysicalDevice*)pphysicalDevice;
               
       vkGetPhysicalDeviceProperties(
            (VkPhysicalDevice)   (*physicalDevice),
            (VkPhysicalDeviceProperties*)  pProperties);               
      */

       /////////////////////////////////////

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
  public  void vkGetPhysicalDeviceQueueFamilyProperties(
               VkPhysicalDevice  physicalDevice,
               int[]  pQueueFamilyPropertyCount,
               List<VkQueueFamilyProperties>  pQueueFamilyProperties){
     
     if(pQueueFamilyPropertyCount==null){
         pQueueFamilyPropertyCount = new int[1];  
     }
     ByteBuffer[] array =  vkGetPhysicalDeviceQueueFamilyProperties0(
                                   physicalDevice.getHandle(),
                                   pQueueFamilyPropertyCount);
     
     if(array != null && pQueueFamilyProperties != null ){
         pQueueFamilyProperties.clear();
         for (ByteBuffer nativeBuffer : array) {
             VkQueueFamilyProperties qfp = new VkQueueFamilyProperties(nativeBuffer);
             pQueueFamilyProperties.add(qfp);
        }
     }
  }

  /**
   * 
   * @param physicalDevice
   * @param pQueueFamilyPropertyCount
   * @return pQueueFamilyProperties as List of VkQueueFamilyProperties
   */
   private static native ByteBuffer[] vkGetPhysicalDeviceQueueFamilyProperties0(
               Buffer  pphysicalDevice,
               int[]  pQueueFamilyPropertyCount);/*                              
     VkQueueFamilyProperties*  pQueueFamilyProperties = nullptr;
     VkPhysicalDevice* physicalDevice = (VkPhysicalDevice*)pphysicalDevice;
                            
     vkGetPhysicalDeviceQueueFamilyProperties(
             (VkPhysicalDevice) (*physicalDevice),
             (uint32_t*)  pQueueFamilyPropertyCount,
             (VkQueueFamilyProperties*)  pQueueFamilyProperties);
             
         if(pQueueFamilyProperties)
         {
           int length = pQueueFamilyPropertyCount[0];
           jobjectArray bufArray = 
                        (jobjectArray) env->NewObjectArray(length, byteBufferClass, NULL);
                        
           for(int i=0; i<length; i++){
              VkQueueFamilyProperties* qfp = pQueueFamilyProperties+i;
              jobject pObj = env->NewDirectByteBuffer((void*) qfp, 
                                  (jlong) sizeof(VkQueueFamilyProperties));
              env->SetObjectArrayElement(bufArray,(jsize)i, pObj);                                          
            }
            return bufArray;
         }   
         else
          return NULL;               
      */

       /////////////////////////////////////

       /**
        * <h2>Prototype</h2><pre>
        * VKAPI_ATTR void VKAPI_CALL vkGetPhysicalDeviceMemoryProperties(
        *     VkPhysicalDevice                            physicalDevice,
        *     VkPhysicalDeviceMemoryProperties*           pMemoryProperties);
        * </pre>
        */
  public void vkGetPhysicalDeviceMemoryProperties(
               VkPhysicalDevice  physicalDevice,
               VkPhysicalDeviceMemoryProperties  pMemoryProperties){
      // call native method
      vkGetPhysicalDeviceMemoryProperties0(physicalDevice.getHandle(),
                                            pMemoryProperties.getPointerStruct());
  }

  /**
   * 
   * @param physicalDevice
   * @param pMemoryProperties
   */
   private static native void vkGetPhysicalDeviceMemoryProperties0(
               Buffer  pphysicalDevice,
               Buffer  pMemoryProperties);/*
               
     VkPhysicalDevice* physicalDevice = (VkPhysicalDevice*)pphysicalDevice;
     vkGetPhysicalDeviceMemoryProperties(
             (VkPhysicalDevice) (*physicalDevice),
             (VkPhysicalDeviceMemoryProperties*)  pMemoryProperties);        
               
    */

       /////////////////////////////////////

       /**
        * <h2>Prototype</h2><pre>
        * VKAPI_ATTR PFN_vkVoidFunction VKAPI_CALL vkGetInstanceProcAddr(
        *     VkInstance                                  instance,
        *     const char*                                 pName);
        * </pre>
        */
  public PFNvkVoidFunction vkGetInstanceProcAddr(
               VkInstance  instance,
               String  pName){
      ByteBuffer pFunc = vkGetInstanceProcAddr0(instance.getHandle(),pName);
      PFNvkVoidFunction func = new PFNvkVoidFunction(pFunc);
      return func;       
  }

   private static native ByteBuffer vkGetInstanceProcAddr0(
               Buffer  pInstance,
               String  pName);/*
               VkInstance* instance = (VkInstance*)(pInstance); 
               PFN_vkVoidFunction func;               
               func  = vkGetInstanceProcAddr(
                            (VkInstance)   (*instance),
                            (const char*)     pName);                            
              jobject pFunc = env->NewDirectByteBuffer((void*) func, 
                                                      (jlong) sizeof(void*));                                                       
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
  public PFNvkVoidFunction vkGetDeviceProcAddr(
               VkDevice  device,
               String  pName){
      
     ByteBuffer nativeHandle =  vkGetDeviceProcAddr0(device.getHandle(), pName);     
     PFNvkVoidFunction pfn = new PFNvkVoidFunction(nativeHandle);
     return pfn;      
  }

   private static native ByteBuffer vkGetDeviceProcAddr0(
               Buffer  pDevice,
               String pName);/*
       VkDevice* device = (VkDevice*) pDevice;        
       PFN_vkVoidFunction func =  vkGetDeviceProcAddr(
                                     (VkDevice) (*device),
                                     (const char*) pName);
                               
       jobject pFunc = env->NewDirectByteBuffer((void*) func, 
                                                (jlong) sizeof(void*));                                                       
        return pFunc;
      */

       /////////////////////////////////////

       /**
        * <h2>Prototype</h2><pre>
        * VKAPI_ATTR VkResult VKAPI_CALL vkCreateDevice(
        *     VkPhysicalDevice                            physicalDevice,
        *     const VkDeviceCreateInfo*                   pCreateInfo,
        *     const VkAllocationCallbacks*                pAllocator,
        *     VkDevice*                                   pDevice);
        * </pre>
        */
  public VkResult vkCreateDevice(
               VkPhysicalDevice  physicalDevice,
               VkDeviceCreateInfo  pCreateInfo,
               VkAllocationCallbacks  pAllocator,
               VkDevice[]  pDevice){
      
   if(pDevice==null || pDevice.length<1){
       throw new IllegalArgumentException("pDevice[] must be not null and length >=1");
   }  
   int[] result = {0};   
   ByteBuffer nativeHandle =   vkCreateDevice0(/*VkPhysicalDevice*/  physicalDevice.getHandle(),
               /*VkDeviceCreateInfo*/  pCreateInfo.getPointerStruct(),
               /*VkAllocationCallbacks*/  pAllocator.getPointerStruct(),
               /*VkDevice*/  result);
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
               Buffer  pPhysicalDevice,
               Buffer  pCreateInfo,
               Buffer  pAllocator,
               int[] result);/*
       
       VkDevice* pDevice = nullptr;
       VkPhysicalDevice* physicalDevice = (VkPhysicalDevice*)pPhysicalDevice;
        
       VkResult res =  vkCreateDevice(
             (VkPhysicalDevice) (*physicalDevice),
             (const VkDeviceCreateInfo*)     pCreateInfo,
             (const VkAllocationCallbacks*)  pAllocator,
             (VkDevice*)                     pDevice);
         
         result[0] = res;         
         jobject pObj = env->NewDirectByteBuffer((void*) pDevice, 
                          (jlong) sizeof(void*)); 
               
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
  public void vkDestroyDevice(
               VkDevice  device,
               VkAllocationCallbacks  pAllocator){
      vkDestroyDevice0(device.getHandle(),
                       pAllocator.getPointerStruct());
      
  }

  /**
   * 
   * @param device
   * @param pAllocator
   */
   private static native void vkDestroyDevice0(
               Buffer  pDevice,
               Buffer  pAllocator);/*
         VkDevice* device = (VkDevice*) pDevice;      
         vkDestroyDevice( (VkDevice) (*device),
                          (const VkAllocationCallbacks*)   pAllocator);
      */

       /////////////////////////////////////

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
  public VkResult vkEnumerateInstanceExtensionProperties(
               String pLayerName,
               int[]  pPropertyCount,
               List<VkExtensionProperties>  pProperties){
      
      int[] result = {0};
      ByteBuffer[] props = vkEnumerateInstanceExtensionProperties0(pLayerName,
              pPropertyCount,
              result );
      
        if (pProperties != null) {
            pProperties.clear();
            if (props != null) {
                for (ByteBuffer nativeBuff : props) {
                    if (nativeBuff != null) {
                        VkExtensionProperties ep = new VkExtensionProperties(nativeBuff);
                        pProperties.add(ep);
                    }
                }
            }
        }
      return VkResult.fromValue(result[0]);
  }

   private static native ByteBuffer[] vkEnumerateInstanceExtensionProperties0(
               String  pLayerName,
               int[]  pPropertyCount,
               int[] result);/*
       
     VkExtensionProperties* pProperties = nullptr;
               
     VkResult res =vkEnumerateInstanceExtensionProperties(
                        (const char*)  pLayerName,
                        (uint32_t*)    pPropertyCount,
                        (VkExtensionProperties*) pProperties);
      
      result[0] = res;
           
      if(pProperties)
         {
           int length = pPropertyCount[0];
           jobjectArray bufArray = 
                (jobjectArray) env->NewObjectArray(length, byteBufferClass, NULL);
                        
           for(int i=0; i<length; i++){
              VkExtensionProperties* prop = pProperties+i;
              jobject pObj = env->NewDirectByteBuffer((void*) prop, 
                                   (jlong) sizeof(VkExtensionProperties)); 
              env->SetObjectArrayElement( bufArray,(jsize)i, pObj);                     
            }
            return bufArray;
         }   
         else
          return NULL;               
               
         */

       /////////////////////////////////////

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
  public  VkResult vkEnumerateDeviceExtensionProperties(
               VkPhysicalDevice  physicalDevice,
               String  pLayerName,
               int[]  pPropertyCount,
               List<VkExtensionProperties>  pProperties){
      
      int[] result = {0};
      if(pPropertyCount==null){
          pPropertyCount = new int[1];
      }
      ByteBuffer[] handles = vkEnumerateDeviceExtensionProperties0(
              physicalDevice.getHandle(),
              pLayerName,
              pPropertyCount,
              result);
      
      if(pProperties != null){
          pProperties.clear();
          for (ByteBuffer nativeHand : handles) {
            if(nativeHand != null){
                VkExtensionProperties prop = new VkExtensionProperties(nativeHand);
                pProperties.add(prop);
            }
        }
      }
      
      int res = result[0];
      return VkResult.fromValue(res);
  }

   private static native ByteBuffer[] vkEnumerateDeviceExtensionProperties0(
               Buffer  pPhysicalDevice,
               String  pLayerName,
               int[]  pPropertyCount,
               int[] result);/*
               
     VkExtensionProperties*  pProperties = nullptr;
     VkPhysicalDevice* physicalDevice = (VkPhysicalDevice*)pPhysicalDevice;
               
     VkResult res =  vkEnumerateDeviceExtensionProperties(
                  (VkPhysicalDevice) (*physicalDevice),
                  (const char*)    pLayerName,
                  (uint32_t*)     pPropertyCount,
                  (VkExtensionProperties*)  pProperties); 
     result[0] = res;
               
     if(pProperties){
        int length = pPropertyCount[0];
        jobjectArray bufArray = 
             (jobjectArray) env->NewObjectArray( length, 
                                                 byteBufferClass, 
                                                 NULL);                                               
        for(int i=0; i<length; i++){
            VkExtensionProperties* prop = pProperties+i;
            if(prop){
               jobject pObj = env->NewDirectByteBuffer((void*) prop, 
                                   (jlong) sizeof(VkExtensionProperties));                   
               env->SetObjectArrayElement( bufArray,(jsize)i, pObj);
            } //if 
         }//for
         return bufArray;
      }
      else
       return NULL;
               
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
  public VkResult vkEnumerateInstanceLayerProperties(
               int[]  pPropertyCount,
               List<VkLayerProperties>  pProperties){
      
      int[] result = {0};
      if(pPropertyCount==null){
          pPropertyCount = new int[1];
      }
      ByteBuffer[] nativeHandlers = vkEnumerateInstanceLayerProperties0(
              pPropertyCount,
              result);
      if(pProperties != null){
          pProperties.clear();
          for (ByteBuffer buff : nativeHandlers) {
              if(buff !=null ){
                  VkLayerProperties prop = new VkLayerProperties(buff);
                  pProperties.add(prop);
              }
        } 
      }// if
      
      return VkResult.fromValue(result[0]);
  }

   private static native ByteBuffer[] vkEnumerateInstanceLayerProperties0(
               int[]  pPropertyCount,              
               int[] result);/*
               
               VkLayerProperties*  pProperties = nullptr;
               
               VkResult res =  vkEnumerateInstanceLayerProperties(
                                 (uint32_t*) pPropertyCount,
                                 (VkLayerProperties*)  pProperties);
               
               result[0] = res;
               
               if(pProperties){
                int len = (int)pPropertyCount[0];
                jobjectArray bufArray = 
                        (jobjectArray) env->NewObjectArray(len, byteBufferClass, NULL);
                for(int i=0; i<len; i++){
                   VkLayerProperties* prop = pProperties+i;
                   if(prop){
                       jobject pObj = env->NewDirectByteBuffer((void*) prop, 
                                         (jlong) sizeof(VkLayerProperties));
                       env->SetObjectArrayElement(bufArray,(jsize)i, pObj);
                   }                     
                }
                return bufArray;
               }else
               return NULL;
        */

       /////////////////////////////////////

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
  public  VkResult vkEnumerateDeviceLayerProperties(
               VkPhysicalDevice  physicalDevice,
               int[]  pPropertyCount,
               List<VkLayerProperties>  pProperties){
      int[] result = {0};
      if(pPropertyCount==null){
          pPropertyCount = new int[1];
      }
      ByteBuffer[] nativeHandlers = vkEnumerateDeviceLayerProperties0(
                                          physicalDevice.getHandle(),
                                          pPropertyCount,
                                          result);
      if(pProperties != null){
          pProperties.clear();
          for (ByteBuffer buff : nativeHandlers) {
              if(buff !=null ){
                  VkLayerProperties prop = new VkLayerProperties(buff);
                  pProperties.add(prop);
              }
        } 
      }// if
      
      return VkResult.fromValue(result[0]);
  }

   private static native ByteBuffer[] vkEnumerateDeviceLayerProperties0(
               Buffer  pPhysicalDevice,
               int[]  pPropertyCount,               
               int[] result);/*
               
       VkLayerProperties*  pProperties = nullptr;
       VkPhysicalDevice* physicalDevice = (VkPhysicalDevice*)pPhysicalDevice;
                      
       VkResult res =   vkEnumerateDeviceLayerProperties(
                                  (VkPhysicalDevice)  (*physicalDevice),
                                  (uint32_t*)  pPropertyCount,
                                  (VkLayerProperties*) pProperties); 
                                                                                
       result[0] = res;
       if(pProperties){
          int len = (int)pPropertyCount[0];
          jobjectArray bufArray = 
                  (jobjectArray) env->NewObjectArray(len, byteBufferClass, NULL);
          for(int i=0; i<len; i++){
              VkLayerProperties* prop = pProperties+i;
              if(prop){
                 jobject pObj = env->NewDirectByteBuffer((void*) prop, 
                                         (jlong) sizeof(VkLayerProperties));
                  env->SetObjectArrayElement( bufArray,(jsize)i, pObj);
               }                     
           }
           return bufArray;
         }else
           return NULL;
      */

       /////////////////////////////////////

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
        * @aram queueFamilyIndex -   The family index of the queue within the device.
        * @param queueIndex - The index of the queue within the queue family.
        * 
        * @return pQueue -   A pointer to a variable that is to receive the resulting handle.
        */
  public  VkQueue vkGetDeviceQueue(
               VkDevice  device,
               int  queueFamilyIndex,
               int  queueIndex){
      
      ByteBuffer nativeHandle = vkGetDeviceQueue0(device.getHandle(),
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
               Buffer  pDevice,
               int  queueFamilyIndex,
               int  queueIndex);/*
               
       VkQueue*   pQueue;
       VkDevice* device = (VkDevice*) pDevice;
       
       VKAPI_CALL vkGetDeviceQueue(
                  (VkDevice)   (*device),
                  (uint32_t)   queueFamilyIndex,
                  (uint32_t)   queueIndex,
                  (VkQueue*)   pQueue);
       
          return  env->NewDirectByteBuffer((void*) pQueue, 
                                           (jlong) sizeof(void*));        
                  
      */

    
    public Vk10() {       
    }

}
