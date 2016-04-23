/**
 * 
 */
package bor.vulkan.khr;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;

import bor.vulkan.VkDebugReportCallbackEXT;
import bor.vulkan.VkDevice;
import bor.vulkan.VkFence;
import bor.vulkan.VkHandle;
import bor.vulkan.VkImage;
import bor.vulkan.VkInstance;
import bor.vulkan.VkPhysicalDevice;
import bor.vulkan.VkQueue;
import bor.vulkan.VkSemaphore;
import bor.vulkan.enumerations.VkDebugReportObjectTypeEXT;
import bor.vulkan.enumerations.VkPresentModeKHR;
import bor.vulkan.enumerations.VkResult;
import bor.vulkan.khr.structs.VkAndroidSurfaceCreateInfoKHR;
import bor.vulkan.khr.structs.VkDisplayModeCreateInfoKHR;
import bor.vulkan.khr.structs.VkDisplayModePropertiesKHR;
import bor.vulkan.khr.structs.VkDisplayPlaneCapabilitiesKHR;
import bor.vulkan.khr.structs.VkDisplayPlanePropertiesKHR;
import bor.vulkan.khr.structs.VkDisplayPropertiesKHR;
import bor.vulkan.khr.structs.VkDisplaySurfaceCreateInfoKHR;
import bor.vulkan.khr.structs.VkMirSurfaceCreateInfoKHR;
import bor.vulkan.khr.structs.VkPresentInfoKHR;
import bor.vulkan.khr.structs.VkSurfaceCapabilitiesKHR;
import bor.vulkan.khr.structs.VkSurfaceFormatKHR;
import bor.vulkan.khr.structs.VkSwapchainCreateInfoKHR;
import bor.vulkan.khr.structs.VkWaylandSurfaceCreateInfoKHR;
import bor.vulkan.khr.structs.VkWin32SurfaceCreateInfoKHR;
import bor.vulkan.khr.structs.VkXcbSurfaceCreateInfoKHR;
import bor.vulkan.khr.structs.VkXlibSurfaceCreateInfoKHR;
import bor.vulkan.structs.VkAllocationCallbacks;
import bor.vulkan.structs.VkDebugReportCallbackCreateInfoEXT;

/**
 * Class to hold functions related to Vulkan's<br>
 * <b>Window System Integration (WSI) </b>
 * @author Alessandro Borges
 *
 */
public class WSI {

    /** Includes **/
    //@off
    /*JNI
     #if defined(_WIN32)
        #define VK_USE_PLATFORM_WIN32_KHR 1
        #define WIN32_LEAN_AND_MEAN 1
        #define VC_EXTRALEAN 1
     #elif defined(__ANDROID__) && defined(__ARM_EABI__) && !defined(__ARM_ARCH_7A__)
       #define VK_USE_PLATFORM_ANDROID_KHR 1
     #elif defined(__ANDROID__) && defined(__ARM_ARCH_7A__)
       #define VK_USE_PLATFORM_ANDROID_KHR 1
     #else
       #define VK_USE_PLATFORM_XLIB_KHR 1
     #endif    
          
      #define BOR_LOADER 1
      
      #include <vulkan/vulkan.h>      
      #include <stdio.h>
      #include <stdlib.h>     
      #include <JBufferArray.h>
      #include <WSI.h>  
  
      using namespace std;
     
      */
    
    
    private VkHandle wsi;
    private VkInstance instance;
    private VkDevice device;


    /**
     * Create a WSI instance
     * @param instance - VKInstance instance
     * @param device - VkDevice instance
     */
    public WSI(VkInstance instance, VkDevice device) {
        this.instance = instance;
        this.device = device;
        ByteBuffer handle = createWSI(instance.getPointer(), device.getPointer());
        wsi = (handle == null) ? null : new VkHandle(handle) ;
    }
    
    /**
     * releases wsi on exit
     */
    @Override
    public void finalize() throws Throwable {
        super.finalize();
        if(wsi==null) return;
        destroyWSI0(wsi.getPointer());
        
    }
    
    
    
    /**
     * Create WSI instance
     * @param instance - VkInstance
     * @param device - VkDevice instance
     * @return
     */
    private static native ByteBuffer createWSI(ByteBuffer instance, ByteBuffer device);/*  
          WSI* wsi = new WSI((VkInstance) (instance), (VkDevice) (device));
         
          if(wsi){
              jobject buffer = (jobject)(env->NewDirectByteBuffer(wsi, sizeof(WSI)));
              return buffer; 
         }else{
           return NULL;
         }
    */
    
    private static native void destroyWSI0(ByteBuffer _wsi);/*
       WSI* wsi = (WSI*) _wsi;
       if(wsi){
         delete wsi;
      }   
    */

    /**
     *  Vulkan procedure ID: 164
     * <h2>Prototype</h2><pre>
     *  VkResult  vkCreateAndroidSurfaceKHR(
     *     VkInstance                                  instance,
     *     const VkAndroidSurfaceCreateInfoKHR*        pCreateInfo,
     *     const VkAllocationCallbacks*                pAllocator,
     *     VkSurfaceKHR*                               pSurface);
     * </pre>
     * 
     * @param instance - 
     * @param pCreateInfo - 
     * @param pAllocator - 
     * @param pSurface - 
     * 
     * @return VkResult
     */
    public VkResult vkCreateAndroidSurfaceKHR(
               //  VkInstance instance,
                  VkAndroidSurfaceCreateInfoKHR  pCreateInfo,
                  VkAllocationCallbacks  pAllocator,
                  VkSurfaceKHR[]  pSurface){
         int[] result = {0};
         ByteBuffer handle = vkCreateAndroidSurfaceKHR0(
                          wsi.getPointer(),
//                       (instance==null ? null : instance.getPointer()) /* ByteBuffer */ ,
                         (pCreateInfo==null ? null : pCreateInfo.getPointer()) /* ByteBuffer */ ,
                         (pAllocator==null ? null : pAllocator.getPointer()) /* ByteBuffer */ ,
                         result);
         
         if(pSurface[0]==null){
             pSurface[0] = new VkHandle(handle);
         }else{
             pSurface[0].setPointer(handle);
         }
          return VkResult.fromValue(result[0]);
    } 

    /**
     *  Native interface for Vulkan method #164
     *  vkCreateAndroidSurfaceKHR 
     * 
     * @param instance - 
     * @param pCreateInfo - 
     * @param pAllocator - 
     * @param pSurface - 
     * 
     * @return VkResult as int  
     */
     private static native java.nio.ByteBuffer vkCreateAndroidSurfaceKHR0(
                 java.nio.ByteBuffer   _wsi,               
                 java.nio.ByteBuffer   pCreateInfo,
                 java.nio.ByteBuffer   pAllocator,
                 int[] result);/*
        #ifdef VK_USE_PLATFORM_ANDROID_KHR        
         WSI* wsi = (WSI*) _wsi;
         VkSurfaceKHR* pSurface = (VkSurfaceKHR*)malloc(sizeof(VkSurfaceKHR));         
         
         VkResult res = wsi->pfnCreateAndroidSurfaceKHR(
                         wsi->instance, 
                         (const VkAndroidSurfaceCreateInfoKHR*) pCreateInfo,
                         (const VkAllocationCallbacks*) pAllocator,
                         (VkSurfaceKHR*) pSurface);
           result[0] = (jint) res;
            
           jobject buffer = NULL;              
           if(pSurface){
             buffer = (jobject)(env->NewDirectByteBuffer((void*)pSurface, sizeof(VkSurfaceKHR)));
           }            
          return buffer;
          
        #else
         result[0] = (jint)VkResult::VK_ERROR_INCOMPATIBLE_DISPLAY_KHR;  
         return NULL;
        #endif  
    */ 
     
     

/**
 *  Vulkan procedure ID: 165
 * <h2>Prototype</h2><pre>
 *  VkResult  vkCreateWin32SurfaceKHR(
 *     VkInstance                                  instance,
 *     const VkWin32SurfaceCreateInfoKHR*          pCreateInfo,
 *     const VkAllocationCallbacks*                pAllocator,
 *     VkSurfaceKHR*                               pSurface);
 * </pre>
 * 
 * @param instance - 
 * @param pCreateInfo - 
 * @param pAllocator - 
 * @param pSurface - 
 * 
 * @return VkResult
 */
public VkResult vkCreateWin32SurfaceKHR(
              //VkInstance instance,
              VkWin32SurfaceCreateInfoKHR  pCreateInfo,
              VkAllocationCallbacks  pAllocator,
              VkSurfaceKHR[]  pSurface){
      int[] result = {0};    
      ByteBuffer surface= vkCreateWin32SurfaceKHR0(
                      wsi.getPointer(),                     
                     (pCreateInfo==null ? null : pCreateInfo.getPointer()) /* ByteBuffer */ ,
                     (pAllocator==null ? null : pAllocator.getPointer()) /* ByteBuffer */ ,
                      result );
      
      pSurface[0] = surface==null ? null : new VkHandle(surface);
      
      int  _val = result[0];
      return VkResult.fromValue(_val);
} 

/**
 *  Native interface for Vulkan method #165
 *  vkCreateWin32SurfaceKHR 
 * 
 * @param instance - 
 * @param pCreateInfo - 
 * @param pAllocator - 
 * @param pSurface - 
 * 
 * @return VkResult as int  
 */
 private static native ByteBuffer  vkCreateWin32SurfaceKHR0(
             java.nio.ByteBuffer   _wsi,
             java.nio.ByteBuffer   pCreateInfo,
             java.nio.ByteBuffer   pAllocator,
             int[] result);/* 
             
 #ifdef VK_USE_PLATFORM_WIN32_KHR                 
     WSI* wsi = (WSI*)_wsi;   
     VkSurfaceKHR* pSurface = (VkSurfaceKHR*)malloc(sizeof(VkSurfaceKHR));     
     VkResult res = wsi->pfnCreateWin32SurfaceKHR(
                     (VkInstance) wsi->instance,
                     ( VkWin32SurfaceCreateInfoKHR*) pCreateInfo,
                     ( VkAllocationCallbacks*) pAllocator,
                     (VkSurfaceKHR*) pSurface);
      result[0] = (jint) res;  
      
      if(pSurface && res >= 0){
        jobject buffer = (jobject)(env->NewDirectByteBuffer((void*)pSurface, sizeof(VkSurfaceKHR)));
        return buffer;
      }                   
      return (jobject)NULL;      
#else
      return (jint) VkResult::VK_ERROR_INCOMPATIBLE_DISPLAY_KHR;  
#endif  
*/ 


     /////////////////////////////////////

/**
 *  Vulkan procedure ID: 166
 * <h2>Prototype</h2><pre>
 *  VkBool32  vkGetPhysicalDeviceWin32PresentationSupportKHR(
 *     VkPhysicalDevice                            physicalDevice,
 *     uint32_t                                    queueFamilyIndex);
 * </pre>
 * 
 * @param physicalDevice - 
 * @param queueFamilyIndex - 
 * 
 * @return boolean
 */
public boolean vkGetPhysicalDeviceWin32PresentationSupportKHR(
             VkPhysicalDevice physicalDevice,
             int queueFamilyIndex){
     boolean _val = vkGetPhysicalDeviceWin32PresentationSupportKHR0(
                      wsi.getPointer(),
                     (physicalDevice==null ? null : physicalDevice.getPointer()) /* ByteBuffer */ ,
                     queueFamilyIndex  );
      return _val;
} 

/**
 *  Native interface for Vulkan method #166
 *  vkGetPhysicalDeviceWin32PresentationSupportKHR 
 * 
 * @param physicalDevice - 
 * @param queueFamilyIndex - 
 * 
 * @return boolean as boolean 
 */
 private static native boolean vkGetPhysicalDeviceWin32PresentationSupportKHR0(
             java.nio.ByteBuffer _wsi,                                                                  
             java.nio.ByteBuffer   physicalDevice,
             int  queueFamilyIndex);/* 
   #ifdef VK_USE_PLATFORM_WIN32_KHR          
     VkPhysicalDevice* ptr_physicalDevice = (VkPhysicalDevice*) physicalDevice;
     WSI* wsi = (WSI*)_wsi;
     VkBool32 res = wsi->pfnGetPhysicalDeviceWin32PresentationSupportKHR(
                     (VkPhysicalDevice) (*ptr_physicalDevice),
                     (uint32_t) queueFamilyIndex);
                     
      return (jboolean) res != 0;
    #else
        return (jboolean) JNI_FALSE;
    #endif      
      
*/ 


     /////////////////////////////////////


/**
 *  Vulkan procedure ID: 148
 * <h2>Prototype</h2><pre>
 *  VkResult  vkGetPhysicalDeviceDisplayPropertiesKHR(
 *     VkPhysicalDevice                            physicalDevice,
 *     uint32_t*                                   pPropertyCount,
 *     VkDisplayPropertiesKHR*                     pProperties);
 * </pre>
 * 
 * @param physicalDevice - 
 * @param pPropertyCount - 
 * @param pProperties - 
 * 
 * @return VkResult
 */
public VkResult vkGetPhysicalDeviceDisplayPropertiesKHR(
             VkPhysicalDevice physicalDevice,
             int[] pPropertyCount,
             List<VkDisplayPropertiesKHR>  pProperties){
     int[] result = {0};
     int[] structSize = {0};
     int arrayLen = pProperties == null ? 0 : pProperties.size();
     
     ByteBuffer bigBuffer = vkGetPhysicalDeviceDisplayPropertiesKHR0(
                     wsi.getPointer(),
                     (physicalDevice==null ? null : physicalDevice.getPointer()) /* ByteBuffer */ ,
                     pPropertyCount,                     
                     arrayLen,
                     result,
                     structSize
                       );
     VkResult res =  VkResult.fromValue(result[0]);
      // slice buffers
      if(bigBuffer!= null && pProperties != null){
          pProperties.clear();
          bigBuffer.order(ByteOrder.nativeOrder());
          bigBuffer.rewind();   
          
          int fullSize = bigBuffer.capacity();
          int singleSize = structSize[0];
          if(singleSize <= 0){
              throw new InternalError("Invalid native sizeof(VkDisplayPropertiesKHR)");
          }
          // unique value
          if(fullSize==singleSize){
              VkDisplayPropertiesKHR displayProp = new VkDisplayPropertiesKHR(bigBuffer);
              pProperties.add(displayProp);
              return res;
          }
          for(int i = 0; i < fullSize; i += singleSize){
              bigBuffer.position(i);
              ByteBuffer struct = bigBuffer.slice();
              struct.limit(singleSize);
              VkDisplayPropertiesKHR displayProp = new VkDisplayPropertiesKHR(struct);
              pProperties.add(displayProp);
          }
      }
      return res;
} 

/**
 *  Native interface for Vulkan method #148
 *  vkGetPhysicalDeviceDisplayPropertiesKHR 
 * 
 * @param physicalDevice - 
 * @param pPropertyCount - 
 * @param pProperties - 
 * 
 * @return VkResult as int  
 */
 private static native ByteBuffer  vkGetPhysicalDeviceDisplayPropertiesKHR0(
             java.nio.ByteBuffer _wsi,                                                                     
             java.nio.ByteBuffer   physicalDevice,
             int[]  pPropertyCount,
             int arrayLen,
             int[] result,
             int[] structSize);/* 
    #ifdef BOR_LOADER   
     
     WSI* wsi = (WSI*)_wsi;;       
     VkPhysicalDevice* pPhysicalDevice = (VkPhysicalDevice*) physicalDevice;     
     
     uint32_t displayCount;
     VkDisplayPropertiesKHR* pDisplayProps = NULL;
     VkResult res;
     // first thing to do 
     structSize[0] =(jint)sizeof(VkDisplayPropertiesKHR);
     
     // find the  properties count
     displayCount = 0;
     res = wsi->pfnGetPhysicalDeviceDisplayPropertiesKHR((VkPhysicalDevice) (*pPhysicalDevice), &displayCount, NULL);
      
     if(arrayLen==0){ // just to know how many structures
       result[0] = res;
       pPropertyCount[0] = (jint) displayCount;
       return NULL;       
     }
     
     // how many ? zero or display count get all. 
     if(pPropertyCount[0]==0 || pPropertyCount[0] >= (jint) displayCount){
         pPropertyCount[0]= (jint)displayCount; 
     }else{
     // partial structs
        displayCount = (uint32_t)pPropertyCount[0];
     }
         
     
     // get then all
      size_t sizeProps = sizeof(VkDisplayPropertiesKHR) * displayCount;
      pDisplayProps = (VkDisplayPropertiesKHR*)malloc(sizeProps);
      
      res = wsi->pfnGetPhysicalDeviceDisplayPropertiesKHR(
                     (VkPhysicalDevice) (*pPhysicalDevice),
                     (uint32_t*) &displayCount,
                     (VkDisplayPropertiesKHR*) pDisplayProps); // pProperties);
      result[0] = res;
      
      jobject buffer = (jobject)(env->NewDirectByteBuffer((void*)(pDisplayProps), sizeProps));  
      return buffer;               
      
    #else
      return (jint) VkResult::VK_ERROR_EXTENSION_NOT_PRESENT;
    #endif    
*/ 
 
 
 /**
  *  Vulkan procedure ID: 149
  * <h2>Prototype</h2><pre>
  *  VkResult  vkGetPhysicalDeviceDisplayPlanePropertiesKHR(
  *     VkPhysicalDevice                            physicalDevice,
  *     uint32_t*                                   pPropertyCount,
  *     VkDisplayPlanePropertiesKHR*                pProperties);
  * </pre>
  * 
  * @param physicalDevice - 
  * @param pPropertyCount - 
  * @param pProperties - 
  * 
  * @return VkResult
  */
 public VkResult vkGetPhysicalDeviceDisplayPlanePropertiesKHR(
              VkPhysicalDevice physicalDevice,
              int[] pPropertyCount,
              List<VkDisplayPlanePropertiesKHR>  pProperties){
     
      int[] result = {0};
      boolean justCount = pProperties==null;
      int[] structSize = {0};
      ByteBuffer bigBuffer = vkGetPhysicalDeviceDisplayPlanePropertiesKHR0(
                      wsi.getPointer(),
                      (physicalDevice==null ? null : physicalDevice.getPointer()) /* ByteBuffer */ ,
                      pPropertyCount ,
                      justCount,
                      structSize,
                      result);
        
      VkResult res =  VkResult.fromValue(result[0]);
      // slice buffers
      if(bigBuffer!= null && pProperties != null){
          pProperties.clear();
          bigBuffer.order(ByteOrder.nativeOrder());
          bigBuffer.rewind();   
          
          int fullSize = bigBuffer.capacity();
          int singleSize = structSize[0];
          if(singleSize <= 0){
              throw new InternalError("Invalid native sizeof(VkDisplayPlanePropertiesKHR)");
          }
          // unique value
          if(fullSize==singleSize){
              VkDisplayPlanePropertiesKHR planeProp = new VkDisplayPlanePropertiesKHR(bigBuffer);
              pProperties.add(planeProp);
              return res;
          }
          for(int i = 0; i < fullSize; i += singleSize){
              bigBuffer.position(i);
              ByteBuffer struct = bigBuffer.slice();
              struct.limit(singleSize);
              VkDisplayPlanePropertiesKHR obj = new VkDisplayPlanePropertiesKHR(struct);
              pProperties.add(obj);
          }
      }
                      
       return res;
 } 

 /**
  *  Native interface for Vulkan method #149
  *  vkGetPhysicalDeviceDisplayPlanePropertiesKHR 
  * 
  * @param physicalDevice - 
  * @param pPropertyCount - 
  * @param pProperties - 
  * 
  * @return VkResult as int  
  */
  private static native ByteBuffer vkGetPhysicalDeviceDisplayPlanePropertiesKHR0(
              ByteBuffer _wsi,                                                                   
              java.nio.ByteBuffer   physicalDevice,
              int[]  pPropertyCount,
              boolean justCount,
              int[] structSize,
              int[] result
              );/* 
   #ifdef BOR_LOADER 
      WSI* wsi = (WSI*)_wsi;;
      structSize[0] = sizeof(sizeof(VkDisplayPlanePropertiesKHR));     
      VkPhysicalDevice* ptr_physicalDevice = (VkPhysicalDevice*) physicalDevice;
      
      VkResult res;
      uint32_t planeCount = 0;
      VkDisplayPlanePropertiesKHR* pPlaneProps;
            
      res = wsi->pfnGetPhysicalDeviceDisplayPlanePropertiesKHR(
                      (VkPhysicalDevice) (*ptr_physicalDevice),
                      (uint32_t*) &planeCount,
                      (VkDisplayPlanePropertiesKHR*)NULL);
                      
      if(justCount==JNI_TRUE){
         pPropertyCount[0] = (jint) planeCount;
         result[0] = (jint)res;
         return NULL;
      }
      
      if( pPropertyCount[0] == 0 || pPropertyCount[0] >= (jint)planeCount){
          pPropertyCount[0] = (jint) planeCount;
       }else{
          planeCount =   (uint32_t) pPropertyCount[0];
       }
      
      size_t sizeAll = sizeof(sizeof(VkDisplayPlanePropertiesKHR) * planeCount);
      pPlaneProps = (VkDisplayPlanePropertiesKHR*)malloc(sizeAll);
       
      res = wsi->pfnGetPhysicalDeviceDisplayPlanePropertiesKHR(
                      (VkPhysicalDevice) (*ptr_physicalDevice),
                      (uint32_t*) pPropertyCount,
                      (VkDisplayPlanePropertiesKHR*) pPlaneProps);
       result[0] = res;
                      
       if( res >= 0){   
         jobject buffer = (jobject)(env->NewDirectByteBuffer((void*)(pPlaneProps), sizeAll));            
         return buffer;
       }       
       return NULL;       
   #else
       result[0] = (jint) VkResult::VK_ERROR_EXTENSION_NOT_PRESENT; 
       return NULL;
   #endif     
       
 */ 

  
  /**
   *  Vulkan procedure ID: 151
   * <h2>Prototype</h2><pre>
   *  VkResult  vkGetDisplayModePropertiesKHR(
   *     VkPhysicalDevice                            physicalDevice,
   *     VkDisplayKHR                                display,
   *     uint32_t*                                   pPropertyCount,
   *     VkDisplayModePropertiesKHR*                 pProperties);
   * </pre>
   * 
   * @param physicalDevice - 
   * @param display - 
   * @param pPropertyCount - 
   * @param pProperties - 
   * 
   * @return VkResult
   */
  public VkResult vkGetDisplayModePropertiesKHR(
               VkPhysicalDevice physicalDevice,
               VkDisplayKHR display,
               int[] pPropertyCount,
               List<VkDisplayModePropertiesKHR>  pProperties){
      
        int[] result = {0};
        boolean justCount = pProperties == null;
        int[] structSize = {0};
        
        ByteBuffer bigBuffer = vkGetDisplayModePropertiesKHR0(
                       wsi.getPointer(),
                       (physicalDevice==null ? null : physicalDevice.getPointer()) /* ByteBuffer */ ,
                       (display==null ? null : display.getPointer()) /* ByteBuffer */ ,
                       pPropertyCount ,
                       justCount,
                       structSize,
                       result
                       );
        
        VkResult res = VkResult.fromValue(result[0]);
     // slice buffers
        if(bigBuffer!= null && pProperties != null){
            pProperties.clear();
            bigBuffer.order(ByteOrder.nativeOrder());
            bigBuffer.rewind();   
            
            int fullSize = bigBuffer.capacity();
            int singleSize = structSize[0];
            if(singleSize <= 0){
                throw new InternalError("Invalid native sizeof(VkDisplayModePropertiesKHR)");
            }
            // unique value
            if(fullSize==singleSize){
                VkDisplayModePropertiesKHR obj = new VkDisplayModePropertiesKHR(bigBuffer);
                pProperties.add(obj);
                return res;
            }
            for(int i = 0; i < fullSize; i += singleSize){
                bigBuffer.position(i);
                ByteBuffer struct = bigBuffer.slice();
                struct.limit(singleSize);
                VkDisplayModePropertiesKHR obj = new VkDisplayModePropertiesKHR(struct);
                pProperties.add(obj);
            }
        }
        return res;
  } 

  /**
   *  Native interface for Vulkan method #151
   *  vkGetDisplayModePropertiesKHR 
   * 
   * @param physicalDevice - 
   * @param display - 
   * @param pPropertyCount - 
   * @param pProperties - 
   * 
   * @return VkResult as int  
   */
   private static native ByteBuffer  vkGetDisplayModePropertiesKHR0(
               ByteBuffer _wsi,                                                     
               java.nio.ByteBuffer   physicalDevice,
               java.nio.ByteBuffer   display,
               int[]  pPropertyCount,
               boolean justCount,
               int[] structSize,
               int[] result);/* 
   #ifdef BOR_LOADER 
       WSI* wsi = (WSI*)_wsi;;
       VkPhysicalDevice* pPhysicalDevice = (VkPhysicalDevice*) physicalDevice;
       VkDisplayKHR* pDisplay = (VkDisplayKHR*) display;
       
       VkDisplayModePropertiesKHR* pModes;
       uint32_t modeCount=0;
       
       structSize[0] = sizeof(VkDisplayModePropertiesKHR);
       
       VkResult res =  wsi->pfnGetDisplayModePropertiesKHR((VkPhysicalDevice)(*pPhysicalDevice),
                                                            (VkDisplayKHR) (*pDisplay), 
                                                            &modeCount, 
                                                            NULL);
      
      if(justCount==JNI_TRUE){
          result[0] = res;
          pPropertyCount[0] = modeCount;
          return NULL;
      }
      
      if(pPropertyCount[0] == 0 || pPropertyCount[0] >= (jint)modeCount){
         pPropertyCount[0] = (jint) modeCount;
      }else{
          modeCount = (uint32_t)pPropertyCount[0];
      }
      
      pModes = (VkDisplayModePropertiesKHR*)malloc(sizeof(VkDisplayModePropertiesKHR) * modeCount);
       
       res = wsi->pfnGetDisplayModePropertiesKHR(
                       (VkPhysicalDevice) (*pPhysicalDevice),
                       (VkDisplayKHR) (*pDisplay),
                       (uint32_t*) &modeCount,
                       (VkDisplayModePropertiesKHR*) pModes);
                       
         pPropertyCount[0] = (jint) modeCount;               
        result[0] = res;
        if(res >= 0){
           jobject buffer = (jobject)(env->NewDirectByteBuffer((void*)(pModes), sizeof(VkDisplayModePropertiesKHR) * modeCount));            
         return buffer;
         }
        return (jobject) NULL;
   #else
         result[0] = VkResult::VK_ERROR_EXTENSION_NOT_PRESENT;
        return (jobject) NULL;
   #endif      
  */ 

   /**
    *  Vulkan procedure ID: 152
    * <h2>Prototype</h2><pre>
    *  VkResult  vkCreateDisplayModeKHR(
    *     VkPhysicalDevice                            physicalDevice,
    *     VkDisplayKHR                                display,
    *     const VkDisplayModeCreateInfoKHR*           pCreateInfo,
    *     const VkAllocationCallbacks*                pAllocator,
    *     VkDisplayModeKHR*                           pMode);
    * </pre>
    * 
    * @param physicalDevice - 
    * @param display - 
    * @param pCreateInfo - 
    * @param pAllocator - 
    * @param pMode - 
    * 
    * @return VkResult
    */
   public VkResult vkCreateDisplayModeKHR(
                   VkPhysicalDevice physicalDevice,
                   VkDisplayKHR display,
                   VkDisplayModeCreateInfoKHR  pCreateInfo,
                   VkAllocationCallbacks  pAllocator,
                   VkDisplayModeKHR[]  pMode){
       
        ByteBuffer[] buffers = new ByteBuffer[1];
        
        
        int  _val = vkCreateDisplayModeKHR0(
                        wsi.getPointer(),
                        (physicalDevice==null ? null : physicalDevice.getPointer()) /* ByteBuffer */ ,
                        (display==null ? null : display.getPointer()) /* ByteBuffer */ ,
                        (pCreateInfo==null ? null : pCreateInfo.getPointer()) /* ByteBuffer */ ,
                        (pAllocator==null ? null : pAllocator.getPointer()) /* ByteBuffer */ ,
                        buffers );
         if(pMode != null && buffers[0] != null){
             VkDisplayModeKHR displayMode = new VkHandle(buffers[0]);
             pMode[0] = displayMode;
         }
         return VkResult.fromValue(_val);
   } 

   /**
    *  Native interface for Vulkan method #152
    *  vkCreateDisplayModeKHR 
    * 
    * @param physicalDevice - 
    * @param display - 
    * @param pCreateInfo - 
    * @param pAllocator - 
    * @param pMode - 
    * 
    * @return VkResult as int  
    */
    private static native int  vkCreateDisplayModeKHR0(
                java.nio.ByteBuffer   _wsi,                                       
                java.nio.ByteBuffer   physicalDevice,
                java.nio.ByteBuffer   display,
                java.nio.ByteBuffer   pCreateInfo,
                java.nio.ByteBuffer   pAllocator,
                java.nio.ByteBuffer[]   _pMode);/* 
    #ifdef BOR_LOADER  
        WSI* wsi = (WSI*)_wsi;;      
        VkPhysicalDevice* ptr_physicalDevice = (VkPhysicalDevice*) physicalDevice;
        VkDisplayKHR* ptr_display = (VkDisplayKHR*) display;
        VkDisplayModeKHR* pMode = (VkDisplayModeKHR*) malloc(sizeof(VkDisplayModeKHR)) ;
        
        VkResult res = wsi->pfnCreateDisplayModeKHR(
                        (VkPhysicalDevice) (*ptr_physicalDevice),
                        (VkDisplayKHR) (*ptr_display),
                        (const VkDisplayModeCreateInfoKHR*) pCreateInfo,
                        (const VkAllocationCallbacks*) pAllocator,
                        (VkDisplayModeKHR*) pMode);
         
         if(res>=0){
            JBufferArray buffers(env, _pMode);
            buffers.setPointer(pMode, sizeof(VkDisplayModeKHR),0);                        
         }
         return (jint) res;
         
         
    #else
         return (jint) VkResult::VK_ERROR_EXTENSION_NOT_PRESENT;
    #endif        
         
   */ 

    //////////////////////////////////////////////////
    /////////////////////////////////////////////////
    ////////////////////////////////////////////////
    
    /**
     *  Vulkan procedure ID: 154
     * <h2>Prototype</h2><pre>
     *  VkResult  vkCreateDisplayPlaneSurfaceKHR(
     *     VkInstance                                  instance,
     *     const VkDisplaySurfaceCreateInfoKHR*        pCreateInfo,
     *     const VkAllocationCallbacks*                pAllocator,
     *     VkSurfaceKHR*                               pSurface);
     * </pre>
     * 
     * @param instance - 
     * @param pCreateInfo - 
     * @param pAllocator - 
     * @param pSurface - 
     * 
     * @return VkResult
     */
    public VkResult vkCreateDisplayPlaneSurfaceKHR(               
                  VkDisplaySurfaceCreateInfoKHR  pCreateInfo,
                  VkAllocationCallbacks  pAllocator,
                  VkSurfaceKHR[]  pSurface){
        
         ByteBuffer[] buffers = new ByteBuffer[0];
         
         int  _val = vkCreateDisplayPlaneSurfaceKHR0(
                         wsi.getPointer(),
                      //   (instance==null ? null : instance.getPointer()) /* ByteBuffer */ ,
                         (pCreateInfo==null ? null : pCreateInfo.getPointer()) /* ByteBuffer */ ,
                         (pAllocator==null ? null : pAllocator.getPointer()) /* ByteBuffer */ ,
                          buffers);
         
          
          return VkResult.fromValue(_val);
    } 

    /**
     *  Native interface for Vulkan method #154
     *  vkCreateDisplayPlaneSurfaceKHR 
     * 
     * @param instance - 
     * @param pCreateInfo - 
     * @param pAllocator - 
     * @param pSurface - 
     * 
     * @return VkResult as int  
     */
     private static native int  vkCreateDisplayPlaneSurfaceKHR0(
                 java.nio.ByteBuffer   _wsi,
               
                 java.nio.ByteBuffer   pCreateInfo,
                 java.nio.ByteBuffer   pAllocator,
                 java.nio.ByteBuffer[]   buffer);/* 
       #ifdef BOR_LOADER          
         WSI* wsi = (WSI*)_wsi;;
         VkSurfaceKHR* pSurface = (VkSurfaceKHR*)malloc(sizeof(VkSurfaceKHR));
         
         VkResult res = wsi->pfnCreateDisplayPlaneSurfaceKHR(
                         (VkInstance) wsi->instance,
                         (const VkDisplaySurfaceCreateInfoKHR*) pCreateInfo,
                         (const VkAllocationCallbacks*) pAllocator,
                         (VkSurfaceKHR*) pSurface);
          
          JBufferArray buffers (env, buffer);          
          buffers.setPointer(pSurface,sizeof(VkSurfaceKHR),0);
          buffers.commit();
                         
          return (jint) res;
     #else
          return (jint) VkResult::VK_ERROR_EXTENSION_NOT_PRESENT;
     #endif    
    */ 


         /////////////////////////////////////

    /**
     *  Vulkan procedure ID: 155
     * <h2>Prototype</h2><pre>
     *  VkResult  vkCreateSharedSwapchainsKHR(
     *     VkDevice                                    device,
     *     uint32_t                                    swapchainCount,
     *     const VkSwapchainCreateInfoKHR*             pCreateInfos,
     *     const VkAllocationCallbacks*                pAllocator,
     *     VkSwapchainKHR*                             pSwapchains);
     * </pre>
     * 
     * @param device - 
     * @param swapchainCount - 
     * @param pCreateInfos - 
     * @param pAllocator - 
     * @param pSwapchains - 
     * 
     * @return VkResult
     */
    public VkResult vkCreateSharedSwapchainsKHR(
                //VkDevice device,
                //  int swapchainCount,
                 VkSwapchainCreateInfoKHR  pCreateInfos,
                 VkAllocationCallbacks  pAllocator,
                 VkSwapchainKHR[]  pSwapchains){
         
         ByteBuffer[] buffers = new ByteBuffer[pSwapchains.length];
         int[] sizeOfPtr = {0};
         int  _val = vkCreateSharedSwapchainsKHR0(
                         wsi.getPointer(),
                         //(device==null ? null : device.getPointer()) /* ByteBuffer */ ,
                         (pSwapchains == null? 0 : pSwapchains.length),//swapchainCount ,
                         (pCreateInfos==null ? null : pCreateInfos.getPointer()) /* ByteBuffer */ ,
                         (pAllocator==null ? null : pAllocator.getPointer()) /* ByteBuffer */ ,
                          sizeOfPtr,
                          buffers );
          
         if(sizeOfPtr[0] == 0){
           throw new InternalError("Failed to get size of VkSwapchainKHR*");     
         }else{
             for (int i = 0; i < pSwapchains.length; i++) {
                 pSwapchains[i] = (buffers[i] == null) ? null : new VkHandle(buffers[i]);
            }
             
         }
          return VkResult.fromValue(_val);
    } 

    /**
     *  Native interface for Vulkan method #155
     *  vkCreateSharedSwapchainsKHR 
     * 
     * @param device - 
     * @param swapchainCount - 
     * @param pCreateInfos - 
     * @param pAllocator - 
     * @param pSwapchains - 
     * 
     * @return VkResult as int  
     */
     private static native int  vkCreateSharedSwapchainsKHR0(
                 java.nio.ByteBuffer   _wsi,
                 int  swapchainCount,
                 java.nio.ByteBuffer   pCreateInfos,
                 java.nio.ByteBuffer   pAllocator,
                 int[] sizeofPTR,
                 ByteBuffer[]   bufferArr);/* 
     #ifdef BOR_LOADER
         WSI* wsi = (WSI*)_wsi;;
        
         VkSwapchainKHR* pSwapchains = (VkSwapchainKHR*)malloc(sizeof(VkSwapchainKHR) * swapchainCount);
         
         VkResult res = wsi->pfnCreateSharedSwapchainsKHR(
                         (VkDevice) wsi->device,
                         (uint32_t) swapchainCount,
                         (const VkSwapchainCreateInfoKHR*) pCreateInfos,
                         (const VkAllocationCallbacks*) pAllocator,
                         (VkSwapchainKHR*) pSwapchains);
         
         if(pSwapchains){           
           sizeofPTR[0] = sizeof(VkSwapchainKHR);
           JBufferArray buffers (env, bufferArr);           
           for(int i=0; i<swapchainCount; i++){
               buffers.setPointer(pSwapchains+i, sizeof(VkSwapchainKHR), i);
           }                
         }
                         
         return (jint) res;
      #else
          return (jint) VkResult::VK_ERROR_EXTENSION_NOT_PRESENT;
     #endif      
    */ 


         /////////////////////////////////////

    /**
     *  Vulkan procedure ID: 156
     * <h2>Prototype</h2><pre>
     *  VkResult  vkCreateXlibSurfaceKHR(
     *     VkInstance                                  instance,
     *     const VkXlibSurfaceCreateInfoKHR*           pCreateInfo,
     *     const VkAllocationCallbacks*                pAllocator,
     *     VkSurfaceKHR*                               pSurface);
     * </pre>
     * 
     * @param instance - 
     * @param pCreateInfo - 
     * @param pAllocator - 
     * @param pSurface - 
     * 
     * @return VkResult
     */
    public VkResult vkCreateXlibSurfaceKHR(
                 //VkInstance instance,
                  VkXlibSurfaceCreateInfoKHR  pCreateInfo,
                  VkAllocationCallbacks  pAllocator,
                  VkSurfaceKHR[]  pSurface){
        
         ByteBuffer [] buffers = new ByteBuffer[1];
         int  _val = vkCreateXlibSurfaceKHR0(
                          wsi.getPointer(),
                         //(instance==null ? null : instance.getPointer()) /* ByteBuffer */ ,
                         (pCreateInfo==null ? null : pCreateInfo.getPointer()) /* ByteBuffer */ ,
                         (pAllocator==null ? null : pAllocator.getPointer()) /* ByteBuffer */ ,
                         buffers);
         
         pSurface[0] = buffers[0]==null ? null : new VkHandle(buffers[0]);
         
         return VkResult.fromValue(_val);
    } 

    /**
     *  Native interface for Vulkan method #156
     *  vkCreateXlibSurfaceKHR 
     * 
     * @param instance - 
     * @param pCreateInfo - 
     * @param pAllocator - 
     * @param pSurface - 
     * 
     * @return VkResult as int  
     */
     private static native int  vkCreateXlibSurfaceKHR0(
                 java.nio.ByteBuffer   _wsi,
                 java.nio.ByteBuffer   pCreateInfo,
                 java.nio.ByteBuffer   pAllocator,
                 java.nio.ByteBuffer[]   buffer);/* 
                 
        #ifdef VK_USE_PLATFORM_XLIB_KHR         
         WSI* wsi = (WSI*)_wsi;;
         VkSurfaceKHR surface;
         
         VkResult res = wsi->pfnCreateXlibSurfaceKHR(
                         (VkInstance) wsi->instance,
                         (VkXlibSurfaceCreateInfoKHR*) pCreateInfo,
                         (VkAllocationCallbacks*) pAllocator,
                         (VkSurfaceKHR*) &surface);
          
          if(pSurface){
           JBufferArray buffers (env, buffer);
           buffers.setPointer(&surface, sizeof(VkSurfaceKHR), 0); 
          }
                         
          return (jint) res;
         #else
          return (jint) VkResult::VK_ERROR_INCOMPATIBLE_DRIVER;
         #endif   
    */ 


         /////////////////////////////////////

    /**
     *  Vulkan procedure ID: 157
     * <h2>Prototype</h2><pre>
     *  VkBool32  vkGetPhysicalDeviceXlibPresentationSupportKHR(
     *     VkPhysicalDevice                            physicalDevice,
     *     uint32_t                                    queueFamilyIndex,
     *     Display*                                    dpy,
     *     VisualID                                    visualID);
     * </pre>
     * 
     * @param physicalDevice - 
     * @param queueFamilyIndex - 
     * @param dpy - 
     * @param visualID - 
     * 
     * @return boolean
     */
    public boolean vkGetPhysicalDeviceXlibPresentationSupportKHR(
                 VkPhysicalDevice physicalDevice,
                 int queueFamilyIndex,
                 XlibDisplay dpy,
                 XlibVisualID visualID){
         boolean _val = vkGetPhysicalDeviceXlibPresentationSupportKHR0(
                          wsi.getPointer(),
                         (physicalDevice==null ? null : physicalDevice.getPointer()) /* ByteBuffer */ ,
                         queueFamilyIndex ,
                         (dpy==null ? null : dpy.getPointer()) /* ByteBuffer */ ,
                         (visualID==null ? null : visualID.getPointer()) /* ByteBuffer */  );
          return _val;
    } 

    /**
     *  Native interface for Vulkan method #157
     *  vkGetPhysicalDeviceXlibPresentationSupportKHR 
     * 
     * @param physicalDevice - 
     * @param queueFamilyIndex - 
     * @param dpy - 
     * @param visualID - 
     * 
     * @return boolean as boolean 
     */
     private static native boolean vkGetPhysicalDeviceXlibPresentationSupportKHR0(
                 ByteBuffer _wsi,                                                                  
                 java.nio.ByteBuffer   physicalDevice,
                 int  queueFamilyIndex,
                 java.nio.ByteBuffer   dpy,
                 java.nio.ByteBuffer   visualID);/* 
       #ifdef VK_USE_PLATFORM_XCB_KHR
         WSI* wsi = (WSI*)_wsi;;
         VkPhysicalDevice* ptr_physicalDevice = (VkPhysicalDevice*) physicalDevice;
         VisualID* ptr_visualID = (VisualID*) visualID;
         
         VkBool32 res = wsi->pfnGetPhysicalDeviceXlibPresentationSupportKHR(
                         (VkPhysicalDevice) (*ptr_physicalDevice),
                         (uint32_t) queueFamilyIndex,
                         (Display*) dpy,
                         (VisualID) (*ptr_visualID));
          return (jboolean) res;
       #else
        return (jboolean)JNI_FALSE;
       #endif    
    */ 


         /////////////////////////////////////

    /**
     *  Vulkan procedure ID: 158
     * <h2>Prototype</h2><pre>
     *  VkResult  vkCreateXcbSurfaceKHR(
     *     VkInstance                                  instance,
     *     const VkXcbSurfaceCreateInfoKHR*            pCreateInfo,
     *     const VkAllocationCallbacks*                pAllocator,
     *     VkSurfaceKHR*                               pSurface);
     * </pre>
     * 
     * @param instance - 
     * @param pCreateInfo - 
     * @param pAllocator - 
     * @param pSurface - 
     * 
     * @return VkResult
     */
    public VkResult vkCreateXcbSurfaceKHR(
                  VkInstance instance,
                  VkXcbSurfaceCreateInfoKHR  pCreateInfo,
                  VkAllocationCallbacks  pAllocator,
                  VkSurfaceKHR[]  pSurface){
         
        ByteBuffer[] buffers = new ByteBuffer[1];
         
         int  _val = vkCreateXcbSurfaceKHR0(
                         wsi.getPointer(),
                         (pCreateInfo==null ? null : pCreateInfo.getPointer()) /* ByteBuffer */ ,
                         (pAllocator==null ? null : pAllocator.getPointer()) /* ByteBuffer */ ,
                         buffers);
         
          pSurface[0] = buffers[0]==null ? null : new VkHandle(buffers[0]);
         
          return VkResult.fromValue(_val);
    } 

    /**
     *  Native interface for Vulkan method #158
     *  vkCreateXcbSurfaceKHR 
     * 
     * @param instance - 
     * @param pCreateInfo - 
     * @param pAllocator - 
     * @param pSurface - 
     * 
     * @return VkResult as int  
     */
     private static native int  vkCreateXcbSurfaceKHR0(
                 java.nio.ByteBuffer   _wsi,
                 java.nio.ByteBuffer   pCreateInfo,
                 java.nio.ByteBuffer   pAllocator,
                 java.nio.ByteBuffer[]   buffer);/* 
       #ifdef VK_USE_PLATFORM_XCB_KHR          
         WSI* wsi = (WSI*)_wsi;;
         VkSurfaceKHR* pSurface;
         
         VkResult res = wsi->pfnCreateXcbSurfaceKHR(
                         (VkInstance) (*ptr_instance),
                         (VkXcbSurfaceCreateInfoKHR*) pCreateInfo,
                         (VkAllocationCallbacks*) pAllocator,
                         (VkSurfaceKHR*) pSurface);
          if(pSurface){
           JBufferArray buffers (env, buffer);
           buffers.setPointer(pSurface, sizeof(VkSurfaceKHR), 0); 
          }
          return (jint) res;
       #else
        return (jint) VkResult::VK_ERROR_INCOMPATIBLE_DRIVER;
       #endif 
    */ 


         /////////////////////////////////////

    /**
     *  Vulkan procedure ID: 159
     * <h2>Prototype</h2><pre>
     *  VkBool32  vkGetPhysicalDeviceXcbPresentationSupportKHR(
     *     VkPhysicalDevice                            physicalDevice,
     *     uint32_t                                    queueFamilyIndex,
     *     xcb_connection_t*                           connection,
     *     xcb_visualid_t                              visual_id);
     * </pre>
     * 
     * @param physicalDevice - 
     * @param queueFamilyIndex - 
     * @param connection - 
     * @param visual_id - 
     * 
     * @return boolean
     */
    public boolean vkGetPhysicalDeviceXcbPresentationSupportKHR(
                 VkPhysicalDevice physicalDevice,
                 int queueFamilyIndex,
                 XCBconnection connection,
                 XCBVisualID visual_id){
         boolean _val = vkGetPhysicalDeviceXcbPresentationSupportKHR0(
                         (physicalDevice==null ? null : physicalDevice.getPointer()) /* ByteBuffer */ ,
                         queueFamilyIndex ,
                         (connection==null ? null : connection.getPointer()) /* ByteBuffer */ ,
                         visual_id  );
          return _val;
    } 

    /**
     *  Native interface for Vulkan method #159
     *  vkGetPhysicalDeviceXcbPresentationSupportKHR 
     * 
     * @param physicalDevice - 
     * @param queueFamilyIndex - 
     * @param connection - 
     * @param visual_id - 
     * 
     * @return boolean as boolean 
     */
     private static native boolean vkGetPhysicalDeviceXcbPresentationSupportKHR0(
                 java.nio.ByteBuffer   physicalDevice,
                 int  queueFamilyIndex,
                 java.nio.ByteBuffer   connection,
                 XCBVisualID  visual_id);/* 
       #ifdef VK_USE_PLATFORM_XCB_KHR         
         VkPhysicalDevice* ptr_physicalDevice = (VkPhysicalDevice*) physicalDevice;
         VkBool32 res = vkGetPhysicalDeviceXcbPresentationSupportKHR(
                         (VkPhysicalDevice) (*ptr_physicalDevice),
                         (uint32_t) queueFamilyIndex,
                         (xcb_connection_t*) connection,
                         (xcb_visualid_t) visual_id);
          return (jboolean) res;
        #else
         return JNI_FALSE;
        #endif   
    */ 


         /////////////////////////////////////

    /**
     *  Vulkan procedure ID: 160
     * <h2>Prototype</h2><pre>
     *  VkResult  vkCreateWaylandSurfaceKHR(
     *     VkInstance                                  instance,
     *     const VkWaylandSurfaceCreateInfoKHR*        pCreateInfo,
     *     const VkAllocationCallbacks*                pAllocator,
     *     VkSurfaceKHR*                               pSurface);
     * </pre>
     * 
     * @param instance - 
     * @param pCreateInfo - 
     * @param pAllocator - 
     * @param pSurface - 
     * 
     * @return VkResult
     */
    public VkResult vkCreateWaylandSurfaceKHR(
                 VkInstance instance,
                  VkWaylandSurfaceCreateInfoKHR  pCreateInfo,
                  VkAllocationCallbacks  pAllocator,
                  VkSurfaceKHR[]  pSurface){
        
         ByteBuffer[] buffers = new ByteBuffer[1];        
         int  _val = vkCreateWaylandSurfaceKHR0(
                         (instance==null ? null : instance.getPointer()) /* ByteBuffer */ ,
                         (pCreateInfo==null ? null : pCreateInfo.getPointer()) /* ByteBuffer */ ,
                         (pAllocator==null ? null : pAllocator.getPointer()) /* ByteBuffer */ ,
                         buffers);
         
         
         pSurface[0] = buffers[0]==null ? null : new VkHandle(buffers[0]);
         
         
         return VkResult.fromValue(_val);
    } 

    /**
     *  Native interface for Vulkan method #160
     *  vkCreateWaylandSurfaceKHR 
     * 
     * @param instance - 
     * @param pCreateInfo - 
     * @param pAllocator - 
     * @param pSurface - 
     * 
     * @return VkResult as int  
     */
     private static native int  vkCreateWaylandSurfaceKHR0(
                 java.nio.ByteBuffer   instance,
                 java.nio.ByteBuffer   pCreateInfo,
                 java.nio.ByteBuffer   pAllocator,
                 java.nio.ByteBuffer[]  buffer);/* 
      #ifdef VK_USE_PLATFORM_WAYLAND_KHR        
         VkInstance* ptr_instance = (VkInstance*) instance;
         VkSurfaceKHR* pSurface = NULL;
         
         VkResult res = vkCreateWaylandSurfaceKHR(
                         (VkInstance) (*ptr_instance),
                         ( VkWaylandSurfaceCreateInfoKHR*) pCreateInfo,
                         ( VkAllocationCallbacks*) pAllocator,
                         (VkSurfaceKHR*) pSurface);
          if(pSurface){
             JBufferArray buffs(env, buffer);
             buffs.setPointer(pSurface, 0, 0);
          }
          return (jint) res;  
    #else
          return (jint) VkResult::VK_ERROR_INCOMPATIBLE_DISPLAY_KHR;  
    #endif       
    */ 


         /////////////////////////////////////

    /**
     *  Vulkan procedure ID: 161
     * <h2>Prototype</h2><pre>
     *  VkBool32  vkGetPhysicalDeviceWaylandPresentationSupportKHR(
     *     VkPhysicalDevice                            physicalDevice,
     *     uint32_t                                    queueFamilyIndex,
     *     struct wl_display*                          display);
     * </pre>
     * 
     * @param physicalDevice - 
     * @param queueFamilyIndex - 
     * @param display - 
     * 
     * @return boolean
     */
    public boolean vkGetPhysicalDeviceWaylandPresentationSupportKHR(
                 VkPhysicalDevice physicalDevice,
                 int queueFamilyIndex,
                 WlDisplay display){
         boolean _val = vkGetPhysicalDeviceWaylandPresentationSupportKHR0(
                         (physicalDevice==null ? null : physicalDevice.getPointer()) /* ByteBuffer */ ,
                         queueFamilyIndex ,
                         (display==null ? null : display.getPointer()) /* ByteBuffer */  );
          return _val;
    } 

    /**
     *  Native interface for Vulkan method #161
     *  vkGetPhysicalDeviceWaylandPresentationSupportKHR 
     * 
     * @param physicalDevice - 
     * @param queueFamilyIndex - 
     * @param display - 
     * 
     * @return boolean as boolean 
     */
     private static native boolean vkGetPhysicalDeviceWaylandPresentationSupportKHR0(
                 java.nio.ByteBuffer   physicalDevice,
                 int  queueFamilyIndex,
                 java.nio.ByteBuffer   display);/*
       #ifdef VK_USE_PLATFORM_WAYLAND_KHR           
         VkPhysicalDevice* ptr_physicalDevice = (VkPhysicalDevice*) physicalDevice;
         VkBool32 res = vkGetPhysicalDeviceWaylandPresentationSupportKHR(
                         (VkPhysicalDevice) (*ptr_physicalDevice),
                         (uint32_t) queueFamilyIndex,
                         (struct wl_display*) display);
                         
          return (jboolean) res;
       #else
         return (jboolean) JNI_FALSE;   
       #endif  
    */ 


         /////////////////////////////////////

    /**
     *  Vulkan procedure ID: 162
     * <h2>Prototype</h2><pre>
     *  VkResult  vkCreateMirSurfaceKHR(
     *     VkInstance                                  instance,
     *     const VkMirSurfaceCreateInfoKHR*            pCreateInfo,
     *     const VkAllocationCallbacks*                pAllocator,
     *     VkSurfaceKHR*                               pSurface);
     * </pre>
     * 
     * @param instance - 
     * @param pCreateInfo - 
     * @param pAllocator - 
     * @param pSurface - 
     * 
     * @return VkResult
     */
    public VkResult vkCreateMirSurfaceKHR(
                 VkInstance instance,
                  VkMirSurfaceCreateInfoKHR  pCreateInfo,
                  VkAllocationCallbacks  pAllocator,
                  VkSurfaceKHR[]  pSurface){
         ByteBuffer[] buff = new ByteBuffer[1];
         
         int  _val = vkCreateMirSurfaceKHR0(
                         (instance==null ? null : instance.getPointer()) /* ByteBuffer */ ,
                         (pCreateInfo==null ? null : pCreateInfo.getPointer()) /* ByteBuffer */ ,
                         (pAllocator==null ? null : pAllocator.getPointer()) /* ByteBuffer */ ,
                         buff);
         
          pSurface[0] = buff[0] ==null? null : new VkHandle(buff[0]);
          return VkResult.fromValue(_val);
    } 

    /**
     *  Native interface for Vulkan method #162
     *  vkCreateMirSurfaceKHR 
     * 
     * @param instance - 
     * @param pCreateInfo - 
     * @param pAllocator - 
     * @param pSurface - 
     * 
     * @return VkResult as int  
     */
     private static native int  vkCreateMirSurfaceKHR0(
                 java.nio.ByteBuffer   instance,
                 java.nio.ByteBuffer   pCreateInfo,
                 java.nio.ByteBuffer   pAllocator,
                 java.nio.ByteBuffer[] buff);/* 
        #ifdef VK_USE_PLATFORM_MIR_KHR         
                 
         VkInstance* ptr_instance = (VkInstance*) instance;
         VkSurfaceKHR* pSurface = NULL;
         
         VkResult res = vkCreateMirSurfaceKHR(
                         (VkInstance) (*ptr_instance),
                         (const VkMirSurfaceCreateInfoKHR*) pCreateInfo,
                         (const VkAllocationCallbacks*) pAllocator,
                         (VkSurfaceKHR*) pSurface);
          if(pSurface){
            JBufferArray buffers(env, buff);
            buffers.setPointer(pSurface, 0,0);
           }
          return (jint) res;
        #else
          return (jint) VkResult::VK_ERROR_INCOMPATIBLE_DISPLAY_KHR;  
        #endif  
    */ 


         /////////////////////////////////////

    /**
     *  Vulkan procedure ID: 163
     * <h2>Prototype</h2><pre>
     *  VkBool32  vkGetPhysicalDeviceMirPresentationSupportKHR(
     *     VkPhysicalDevice                            physicalDevice,
     *     uint32_t                                    queueFamilyIndex,
     *     MirConnection*                              connection);
     * </pre>
     * 
     * @param physicalDevice - 
     * @param queueFamilyIndex - 
     * @param connection - 
     * 
     * @return boolean
     */
    public boolean vkGetPhysicalDeviceMirPresentationSupportKHR(
                 VkPhysicalDevice physicalDevice,
                 int queueFamilyIndex,
                 MirConnection connection){
         boolean _val = vkGetPhysicalDeviceMirPresentationSupportKHR0(
                         (physicalDevice==null ? null : physicalDevice.getPointer()) /* ByteBuffer */ ,
                         queueFamilyIndex ,
                         (connection==null ? null : connection.getPointer()) /* ByteBuffer */  );
          return _val;
    } 

    /**
     *  Native interface for Vulkan method #163
     *  vkGetPhysicalDeviceMirPresentationSupportKHR 
     * 
     * @param physicalDevice - 
     * @param queueFamilyIndex - 
     * @param connection - 
     * 
     * @return boolean as boolean 
     */
     private static native boolean vkGetPhysicalDeviceMirPresentationSupportKHR0(
                 java.nio.ByteBuffer   physicalDevice,
                 int  queueFamilyIndex,
                 java.nio.ByteBuffer   connection);/* 
                 
        #ifdef VK_USE_PLATFORM_MIR_KHR              
         VkPhysicalDevice* ptr_physicalDevice = (VkPhysicalDevice*) physicalDevice;
         bool res = vkGetPhysicalDeviceMirPresentationSupportKHR(
                         (VkPhysicalDevice) (*ptr_physicalDevice),
                         (uint32_t) queueFamilyIndex,
                         (MirConnection*) connection);
          return (jboolean) res;
         #else
          return (jboolean) JNI_FALSE; //VkResult::VK_ERROR_INCOMPATIBLE_DISPLAY_KHR;  
         #endif 
    */ 


/**
 *  Vulkan procedure ID: 153
 * <h2>Prototype</h2><pre>
 *  VkResult  vkGetDisplayPlaneCapabilitiesKHR(
 *     VkPhysicalDevice                            physicalDevice,
 *     VkDisplayModeKHR                            mode,
 *     uint32_t                                    planeIndex,
 *     VkDisplayPlaneCapabilitiesKHR*              pCapabilities);
 * </pre>
 * 
 * @param physicalDevice - 
 * @param mode - 
 * @param planeIndex - 
 * @param pCapabilities - 
 * 
 * @return VkResult
 */
public VkResult vkGetDisplayPlaneCapabilitiesKHR(
             VkPhysicalDevice physicalDevice,
             VkDisplayModeKHR mode,
             int planeIndex,
             VkDisplayPlaneCapabilitiesKHR[]  pCapabilities){
     
    VkDisplayPlaneCapabilitiesKHR caps = new VkDisplayPlaneCapabilitiesKHR();
    
     int  _val = vkGetDisplayPlaneCapabilitiesKHR0(
                     wsi.getPointer(),
                     (physicalDevice==null ? null : physicalDevice.getPointer()) /* ByteBuffer */ ,
                     (mode==null ? null : mode.getPointer()) /* ByteBuffer */ ,
                     planeIndex ,
                     (caps==null ? null : caps.getPointer()) /* ByteBuffer */  );
     
     pCapabilities[0] = caps;
     return VkResult.fromValue(_val);
} 

/**
 *  Native interface for Vulkan method #153
 *  vkGetDisplayPlaneCapabilitiesKHR 
 * 
 * @param physicalDevice - 
 * @param mode - 
 * @param planeIndex - 
 * @param pCapabilities - 
 * 
 * @return VkResult as int  
 */
 private static native int  vkGetDisplayPlaneCapabilitiesKHR0(
             java.nio.ByteBuffer   _wsi,                                                  
             java.nio.ByteBuffer   physicalDevice,
             java.nio.ByteBuffer   mode,
             int  planeIndex,
             java.nio.ByteBuffer   pCapabilities);/* 
   #ifdef BOR_LOADER     
     WSI* wsi = (WSI*) _wsi;       
     VkPhysicalDevice* ptr_physicalDevice = (VkPhysicalDevice*) physicalDevice;
     VkDisplayModeKHR* ptr_mode = (VkDisplayModeKHR*) mode;
     
     VkResult res = wsi->pfnGetDisplayPlaneCapabilitiesKHR(
                     (VkPhysicalDevice) (*ptr_physicalDevice),
                     (VkDisplayModeKHR) (*ptr_mode),
                     (uint32_t) planeIndex,
                     (VkDisplayPlaneCapabilitiesKHR*) pCapabilities);
      return (jint) res;
    
 #else
      return (jint) VkResult::VK_ERROR_EXTENSION_NOT_PRESENT;
 #endif    
      
*/ 


/**
 *  Vulkan procedure ID: 150
 * <h2>Prototype</h2><pre>
 *  VkResult  vkGetDisplayPlaneSupportedDisplaysKHR(
 *     VkPhysicalDevice                            physicalDevice,
 *     uint32_t                                    planeIndex,
 *     uint32_t*                                   pDisplayCount,
 *     VkDisplayKHR*                               pDisplays);
 * </pre>
 * 
 * @param physicalDevice - 
 * @param planeIndex - 
 * @param pDisplayCount - 
 * @param pDisplays - 
 * 
 * @return VkResult
 */
public VkResult vkGetDisplayPlaneSupportedDisplaysKHR(
             VkPhysicalDevice physicalDevice,
             int planeIndex,
             int[] pDisplayCount,
             VkDisplayKHR[]  pDisplays){
    
     ByteBuffer[] buffers = pDisplays == null ? null : new ByteBuffer[pDisplays.length];
             
     int  _val = vkGetDisplayPlaneSupportedDisplaysKHR0(
                      wsi.getPointer(),
                     (physicalDevice==null ? null : physicalDevice.getPointer()) /* ByteBuffer */ ,
                     planeIndex ,
                     pDisplayCount ,
                     buffers);
     
     if(pDisplays != null){
         for (int i = 0; i < buffers.length; i++) {
            pDisplays[i] = buffers[i] == null ? null : new VkHandle(buffers[i]);
        }
         
     }     
      return VkResult.fromValue(_val);
} 

/**
 *  Native interface for Vulkan method #150
 *  vkGetDisplayPlaneSupportedDisplaysKHR 
 * 
 * @param physicalDevice - 
 * @param planeIndex - 
 * @param pDisplayCount - 
 * @param pDisplays - 
 * 
 * @return VkResult as int  
 */
 private static native int  vkGetDisplayPlaneSupportedDisplaysKHR0(
             java.nio.ByteBuffer   _wsi,                                                      
             java.nio.ByteBuffer   physicalDevice,
             int  planeIndex,
             int[]  pDisplayCount,
             java.nio.ByteBuffer[]   buffers );/* 
#ifdef BOR_LOADER 
     WSI* wsi = (WSI*)_wsi;            
     VkPhysicalDevice* ptr_physicalDevice = (VkPhysicalDevice*) physicalDevice;
     VkDisplayKHR* pDisplays = NULL;
     
     JBufferArray buff(env, buffers);
     int size = (int)buff.getSize();     
     pDisplays = (size == 0) ? NULL : (VkDisplayKHR*) malloc(sizeof(VkDisplayKHR) * size);
     
     VkResult res = wsi->pfnGetDisplayPlaneSupportedDisplaysKHR(
                     (VkPhysicalDevice) (*ptr_physicalDevice),
                     (uint32_t) planeIndex,
                     (uint32_t*) pDisplayCount,
                     (VkDisplayKHR*) pDisplays);
      
      if(pDisplays){
        
        int len = (int) pDisplayCount[0];
        // avoid index out of bounds at all costs
        for(int i=0; (i < len && i < size); i++){
            if(pDisplays+i)
                 buff.setPointer(pDisplays+i, sizeof(VkDisplayKHR), i);
        } 
      }
                     
      return (jint) res;
 #else
      return (jint) VkResult::VK_ERROR_EXTENSION_NOT_PRESENT;
 #endif  
*/ 


 /////////////////////////////////////

/**
*  Vulkan procedure ID: 138
* <h2>Prototype</h2><pre>
*  void  vkDestroySurfaceKHR(
*     VkInstance                                  instance,
*     VkSurfaceKHR                                surface,
*     const VkAllocationCallbacks*                pAllocator);
* </pre>
* 
* @param instance - 
* @param surface - 
* @param pAllocator - 
*/
public void vkDestroySurfaceKHR(
         VkInstance instance,
         VkSurfaceKHR surface,
         VkAllocationCallbacks  pAllocator){
 vkDestroySurfaceKHR0(
         (instance==null ? null : instance.getPointer()) /* ByteBuffer */ ,
         (surface==null ? null : surface.getPointer()) /* ByteBuffer */ ,
         (pAllocator==null ? null : pAllocator.getPointer()) /* ByteBuffer */  );

} 

/**
*  Native interface for Vulkan method #138
*  vkDestroySurfaceKHR 
* 
* @param instance - 
* @param surface - 
* @param pAllocator - 
*/
private static native void vkDestroySurfaceKHR0(
         java.nio.ByteBuffer   instance,
         java.nio.ByteBuffer   surface,
         java.nio.ByteBuffer   pAllocator);/* 
 VkInstance* ptr_instance = (VkInstance*) instance;
 VkSurfaceKHR* ptr_surface = (VkSurfaceKHR*) surface;
 vkDestroySurfaceKHR(
                 (VkInstance) (*ptr_instance),
                 (VkSurfaceKHR) (*ptr_surface),
                 (const VkAllocationCallbacks*) pAllocator);

*/ 


 /////////////////////////////////////

/**
*  Vulkan procedure ID: 139
* <h2>Prototype</h2><pre>
*  VkResult  vkGetPhysicalDeviceSurfaceSupportKHR(
*     VkPhysicalDevice                            physicalDevice,
*     uint32_t                                    queueFamilyIndex,
*     VkSurfaceKHR                                surface,
*     VkBool32*                                   pSupported);
* </pre>
* 
* @param physicalDevice - 
* @param queueFamilyIndex - 
* @param surface - 
* @param pSupported - 
* 
* @return VkResult
*/
public VkResult vkGetPhysicalDeviceSurfaceSupportKHR(
         VkPhysicalDevice physicalDevice,
         int queueFamilyIndex,
         VkSurfaceKHR surface,
         boolean[] pSupported){
    
 int  _val = vkGetPhysicalDeviceSurfaceSupportKHR0(
                 (physicalDevice==null ? null : physicalDevice.getPointer()) /* ByteBuffer */ ,
                 queueFamilyIndex ,
                 (surface==null ? null : surface.getPointer()) /* ByteBuffer */ ,
                 pSupported  );
  return VkResult.fromValue(_val);
} 

/**
*  Native interface for Vulkan method #139
*  vkGetPhysicalDeviceSurfaceSupportKHR 
* 
* @param physicalDevice - 
* @param queueFamilyIndex - 
* @param surface - 
* @param pSupported - 
* 
* @return VkResult as int  
*/
private static native int  vkGetPhysicalDeviceSurfaceSupportKHR0(
         java.nio.ByteBuffer   physicalDevice,
         int  queueFamilyIndex,
         java.nio.ByteBuffer   surface,
         boolean[]  pSupported);/* 
 VkPhysicalDevice* ptr_physicalDevice = (VkPhysicalDevice*) physicalDevice;
 VkSurfaceKHR* ptr_surface = (VkSurfaceKHR*) surface;
 VkBool32 supported = VK_FALSE;
 
 VkResult res = vkGetPhysicalDeviceSurfaceSupportKHR(
                 (VkPhysicalDevice) (*ptr_physicalDevice),
                 (uint32_t) queueFamilyIndex,
                 (VkSurfaceKHR) (*ptr_surface),
                 (VkBool32*) &supported);
                 
       pSupported[0] = (supported == VK_TRUE) ? JNI_TRUE : JNI_FALSE;          
  return (jint) res;
*/ 


 /////////////////////////////////////

/**
*  Vulkan procedure ID: 140
* <h2>Prototype</h2><pre>
*  VkResult  vkGetPhysicalDeviceSurfaceCapabilitiesKHR(
*     VkPhysicalDevice                            physicalDevice,
*     VkSurfaceKHR                                surface,
*     VkSurfaceCapabilitiesKHR*                   pSurfaceCapabilities);
* </pre>
* 
* @param physicalDevice - 
* @param surface - 
* @param pSurfaceCapabilities - 
* 
* @return VkResult
*/
public VkResult vkGetPhysicalDeviceSurfaceCapabilitiesKHR(
          VkPhysicalDevice physicalDevice,
          VkSurfaceKHR surface,
          VkSurfaceCapabilitiesKHR  pSurfaceCapabilities){
 int  _val = vkGetPhysicalDeviceSurfaceCapabilitiesKHR0(
                 (physicalDevice==null ? null : physicalDevice.getPointer()) /* ByteBuffer */ ,
                 (surface==null ? null : surface.getPointer()) /* ByteBuffer */ ,
                 (pSurfaceCapabilities==null ? null : pSurfaceCapabilities.getPointer()) /* ByteBuffer */  );
  return VkResult.fromValue(_val);
} 

/**
*  Native interface for Vulkan method #140
*  vkGetPhysicalDeviceSurfaceCapabilitiesKHR 
* 
* @param physicalDevice - 
* @param surface - 
* @param pSurfaceCapabilities - 
* 
* @return VkResult as int  
*/
private static native int  vkGetPhysicalDeviceSurfaceCapabilitiesKHR0(
         java.nio.ByteBuffer   physicalDevice,
         java.nio.ByteBuffer   surface,
         java.nio.ByteBuffer   pSurfaceCapabilities);/* 
 VkPhysicalDevice* ptr_physicalDevice = (VkPhysicalDevice*) physicalDevice;
 VkSurfaceKHR* ptr_surface = (VkSurfaceKHR*) surface;
 
 VkResult res = vkGetPhysicalDeviceSurfaceCapabilitiesKHR(
                 (VkPhysicalDevice) (*ptr_physicalDevice),
                 (VkSurfaceKHR) (*ptr_surface),
                 (VkSurfaceCapabilitiesKHR*) pSurfaceCapabilities);
  return (jint) res;
*/ 


 /////////////////////////////////////

/**
*  Vulkan procedure ID: 141
* <h2>Prototype</h2><pre>
*  VkResult  vkGetPhysicalDeviceSurfaceFormatsKHR(
*     VkPhysicalDevice                            physicalDevice,
*     VkSurfaceKHR                                surface,
*     uint32_t*                                   pSurfaceFormatCount,
*     VkSurfaceFormatKHR*                         pSurfaceFormats);
* </pre>
* 
* @param physicalDevice - 
* @param surface - 
* @param pSurfaceFormatCount - 
* @param pSurfaceFormats - 
* 
* @return VkResult
*/
public VkResult vkGetPhysicalDeviceSurfaceFormatsKHR(
         VkPhysicalDevice physicalDevice,
         VkSurfaceKHR surface,
         int[] pSurfaceFormatCount,
         List<VkSurfaceFormatKHR>  pSurfaceFormats){
    
 if(pSurfaceFormats != null){
     pSurfaceFormats.clear();
 }
 ByteBuffer[] bigBuffer = pSurfaceFormats ==null ? null : new ByteBuffer[1];
 int[] sizeofStr = {0};
 int  _val = vkGetPhysicalDeviceSurfaceFormatsKHR0(
                 wsi.getPointer(),
                 (physicalDevice==null ? null : physicalDevice.getPointer()) /* ByteBuffer */ ,
                 (surface==null ? null : surface.getPointer()) /* ByteBuffer */ ,
                 pSurfaceFormatCount,
                 sizeofStr,
                 bigBuffer);
 
 VkResult res = VkResult.fromValue(_val);
 
 if(bigBuffer!=null && bigBuffer[0] != null){
     ByteBuffer master = bigBuffer[0];
     master.order(ByteOrder.nativeOrder());
     master.rewind();
     
     int len = pSurfaceFormatCount[0];
     if(len==1){
         VkSurfaceFormatKHR obj = new VkSurfaceFormatKHR(master);
         pSurfaceFormats.add(obj);
         return res;
     }
     // multipass
     int size = sizeofStr[0];
     if(size<=0){
         throw new InternalError("Failed to get native sizeof VkSurfaceFormatKHR");
     }
     for(int i=0; i<len; i++){
         master.position(i*size);
         ByteBuffer slice = master.slice();
         slice.limit(size);
         VkSurfaceFormatKHR obj = new VkSurfaceFormatKHR(slice);
         pSurfaceFormats.add(obj);
     }    
 }
 
  return res;
} 

/**
*  Native interface for Vulkan method #141
*  vkGetPhysicalDeviceSurfaceFormatsKHR 
* 
* @param physicalDevice - 
* @param surface - 
* @param pSurfaceFormatCount - 
* @param pSurfaceFormats - 
* 
* @return VkResult as int  
*/
private static native int  vkGetPhysicalDeviceSurfaceFormatsKHR0(
         java.nio.ByteBuffer   _wsi,                                                        
         java.nio.ByteBuffer   physicalDevice,
         java.nio.ByteBuffer   surface,
         int[]  pSurfaceFormatCount,
         int[] sizeofStr,
         java.nio.ByteBuffer[]   buffers);/* 
 WSI* wsi = (WSI*)_wsi;       
 VkPhysicalDevice* ptr_physicalDevice = (VkPhysicalDevice*) physicalDevice;
 VkSurfaceKHR* ptr_surface = (VkSurfaceKHR*) surface;
 
 VkSurfaceFormatKHR* pSurfaceFormats = NULL;
 sizeofStr[0] = (jint) sizeof(VkSurfaceFormatKHR);
 
 JBufferArray buff(env, buffers);
 int size = (int) buff.getSize(); 
 
 uint32_t formatCount = 0;
 
 VkResult res = vkGetPhysicalDeviceSurfaceFormatsKHR(
                 (VkPhysicalDevice) (*ptr_physicalDevice),
                 (VkSurfaceKHR) (*ptr_surface),
                 (uint32_t*) &formatCount,
                 (VkSurfaceFormatKHR*) NULL);
   
  pSurfaceFormatCount[0] = (jint)formatCount;
   
  // get the size - only
  if(size==0){                 
     return (jint) res;    
 } 
  
 pSurfaceFormats = (VkSurfaceFormatKHR*) malloc(formatCount * sizeof(VkSurfaceFormatKHR));
  
 res = wsi->pfnGetPhysicalDeviceSurfaceFormatsKHR(
                 (VkPhysicalDevice) (*ptr_physicalDevice),
                 (VkSurfaceKHR) (*ptr_surface),
                 (uint32_t*) &formatCount, //pSurfaceFormatCount,
                 (VkSurfaceFormatKHR*) pSurfaceFormats);
  if(res>=0){                
   buff.setPointer(pSurfaceFormats,
                     formatCount * sizeof(VkSurfaceFormatKHR),
                     0);                  
   }
                                 
  return (jint) res;
*/ 


 /////////////////////////////////////

/**
*  Vulkan procedure ID: 142
* <h2>Prototype</h2><pre>
*  VkResult  vkGetPhysicalDeviceSurfacePresentModesKHR(
*     VkPhysicalDevice                            physicalDevice,
*     VkSurfaceKHR                                surface,
*     uint32_t*                                   pPresentModeCount,
*     VkPresentModeKHR*                           pPresentModes);
* </pre>
* 
* @param physicalDevice - 
* @param surface - 
* @param pPresentModeCount - 
* @param pPresentModes - 
* 
* @return VkResult
*/
public VkResult vkGetPhysicalDeviceSurfacePresentModesKHR(
         VkPhysicalDevice physicalDevice,
         VkSurfaceKHR surface,
         int[] pPresentModeCount,
         VkPresentModeKHR[]  pPresentModes){
    
 int len = Math.min(pPresentModeCount[0], pPresentModes.length); 
 int[] enumValues = new int[len];
 
 int  _val = vkGetPhysicalDeviceSurfacePresentModesKHR0(
                 (physicalDevice==null ? null : physicalDevice.getPointer()) /* ByteBuffer */ ,
                 (surface==null ? null : surface.getPointer()) /* ByteBuffer */ ,
                 pPresentModeCount ,
                 enumValues /* enum */ );
 
for (int i = 0; i < enumValues.length; i++) {
      pPresentModes[i] = VkPresentModeKHR.fromValue(enumValues[i]);
}
// remove dirty
for(int i = enumValues.length; i < pPresentModes.length; i++){
    pPresentModes[i] = null;
}

return VkResult.fromValue(_val);
} 

/**
*  Native interface for Vulkan method #142
*  vkGetPhysicalDeviceSurfacePresentModesKHR 
* 
* @param physicalDevice - 
* @param surface - 
* @param pPresentModeCount - 
* @param pPresentModes - 
* 
* @return VkResult as int  
*/
private static native int  vkGetPhysicalDeviceSurfacePresentModesKHR0(
         java.nio.ByteBuffer   physicalDevice,
         java.nio.ByteBuffer   surface,
         int[]  pPresentModeCount,
         int[]   pPresentModes);/* 
         
 VkPhysicalDevice* ptr_physicalDevice = (VkPhysicalDevice*) physicalDevice;
 VkSurfaceKHR* ptr_surface = (VkSurfaceKHR*) surface;
 VkResult res = vkGetPhysicalDeviceSurfacePresentModesKHR(
                 (VkPhysicalDevice) (*ptr_physicalDevice),
                 (VkSurfaceKHR) (*ptr_surface),
                 (uint32_t*) pPresentModeCount,
                 (VkPresentModeKHR*) pPresentModes);
  return (jint) res;
*/ 


 /////////////////////////////////////

/**
*  Vulkan procedure ID: 143
* <h2>Prototype</h2><pre>
*  VkResult  vkCreateSwapchainKHR(
*     VkDevice                                    device,
*     const VkSwapchainCreateInfoKHR*             pCreateInfo,
*     const VkAllocationCallbacks*                pAllocator,
*     VkSwapchainKHR*                             pSwapchain);
* </pre>
* 
* @param device - 
* @param pCreateInfo - 
* @param pAllocator - 
* @param pSwapchain - 
* 
* @return VkResult
*/
public VkResult vkCreateSwapchainKHR(
          VkDevice device,
          VkSwapchainCreateInfoKHR  pCreateInfo,
          VkAllocationCallbacks  pAllocator,
          VkSwapchainKHR[]  pSwapchain){
 
 ByteBuffer[] buffer = new ByteBuffer[1];   
 int  _val = vkCreateSwapchainKHR0(
                 (device==null ? null : device.getPointer()) /* ByteBuffer */ ,
                 (pCreateInfo==null ? null : pCreateInfo.getPointer()) /* ByteBuffer */ ,
                 (pAllocator==null ? null : pAllocator.getPointer()) /* ByteBuffer */ ,
                 buffer  );
 
  if(pSwapchain != null){
      VkSwapchainKHR obj = buffer[0] == null ? null : new VkHandle(buffer[0]);
  }
  return VkResult.fromValue(_val);
} 

/**
*  Native interface for Vulkan method #143
*  vkCreateSwapchainKHR 
* 
* @param device - 
* @param pCreateInfo - 
* @param pAllocator - 
* @param pSwapchain - 
* 
* @return VkResult as int  
*/
private static native int  vkCreateSwapchainKHR0(
         java.nio.ByteBuffer   _wsi,
         java.nio.ByteBuffer   pCreateInfo,
         java.nio.ByteBuffer   pAllocator,
         java.nio.ByteBuffer[]   buffer);/* 
 WSI* wsi = (WSI*)_wsi;;        
 
 VkSwapchainKHR* pSwapchain = (VkSwapchainKHR*) malloc(sizeof(VkSwapchainKHR));
 
 VkResult res = wsi->pfnCreateSwapchainKHR(
                 (VkDevice) (wsi->device),
                 (const VkSwapchainCreateInfoKHR*) pCreateInfo,
                 (const VkAllocationCallbacks*) pAllocator,
                 (VkSwapchainKHR*) pSwapchain);
                 
  if(pSwapchain){
     JBufferArray buffers(env, buffer);
     buffers.setPointer(pSwapchain, sizeof(VkSwapchainKHR*), 0);
   }
  return (jint) res;
*/ 


 /////////////////////////////////////

/**
*  Vulkan procedure ID: 144
* <h2>Prototype</h2><pre>
*  void  vkDestroySwapchainKHR(
*     VkDevice                                    device,
*     VkSwapchainKHR                              swapchain,
*     const VkAllocationCallbacks*                pAllocator);
* </pre>
* 
* @param device - 
* @param swapchain - 
* @param pAllocator - 
*/
public void vkDestroySwapchainKHR(
         VkDevice device,
         VkSwapchainKHR swapchain,
          VkAllocationCallbacks  pAllocator){
 vkDestroySwapchainKHR0(
         wsi.getPointer() ,
         (swapchain==null ? null : swapchain.getPointer()) /* ByteBuffer */ ,
         (pAllocator==null ? null : pAllocator.getPointer()) /* ByteBuffer */  );

} 

/**
*  Native interface for Vulkan method #144
*  vkDestroySwapchainKHR 
* 
* @param device - 
* @param swapchain - 
* @param pAllocator - 
*/
private static native void vkDestroySwapchainKHR0(
         java.nio.ByteBuffer   _wsi,
         java.nio.ByteBuffer   swapchain,
         java.nio.ByteBuffer   pAllocator);/* 
 WSI* wsi = (WSI*)_wsi;
 VkSwapchainKHR* pSwapChain = (VkSwapchainKHR*) swapchain;
 wsi->pfnDestroySwapchainKHR(
                 (VkDevice) wsi->device,
                 (VkSwapchainKHR) (*pSwapChain),
                 (const VkAllocationCallbacks*) pAllocator);

*/ 


 /////////////////////////////////////

/**
*  Vulkan procedure ID: 145
* <h2>Prototype</h2><pre>
*  VkResult  vkGetSwapchainImagesKHR(
*     VkDevice                                    device,
*     VkSwapchainKHR                              swapchain,
*     uint32_t*                                   pSwapchainImageCount,
*     VkImage*                                    pSwapchainImages);
* </pre>
* 
* @param device - 
* @param swapchain - 
* @param pSwapchainImageCount - 
* @param pSwapchainImages - 
* 
* @return VkResult
*/
public VkResult vkGetSwapchainImagesKHR(
         VkDevice device,
         VkSwapchainKHR swapchain,
         int[] pSwapchainImageCount,
         List<VkImage>  pSwapchainImages){
    
 ByteBuffer[] bigBuffer = pSwapchainImages == null ? null : new ByteBuffer[1];
 if(pSwapchainImages!=null) 
     pSwapchainImages.clear();
 
 int  _val = vkGetSwapchainImagesKHR0(
                wsi.getPointer(),
                 (swapchain==null ? null : swapchain.getPointer()) /* ByteBuffer */ ,
                 pSwapchainImageCount,
                 bigBuffer);
 VkResult res =  VkResult.fromValue(_val);
 int count = pSwapchainImageCount[0];
 if(count==0)
     return res;
 
 if(pSwapchainImages!=null && bigBuffer != null && bigBuffer[0] != null){
    ByteBuffer master = bigBuffer[0];
    master.order(ByteOrder.nativeOrder());
    if(count==1){
        VkImage obj = wrap(bigBuffer);
        pSwapchainImages.add(obj);
        return res;
    }else{
        int size = master.capacity() / count;
        for(int i= 0; i<count; i++){
            ByteBuffer slice = master.slice();
            slice.limit(size);
            VkImage obj = wrap(slice);
            pSwapchainImages.add(obj);
        }//for
    } // else 
 }//if
 
  return VkResult.fromValue(_val);
} 



/**
*  Native interface for Vulkan method #145
*  vkGetSwapchainImagesKHR 
* 
* @param device - 
* @param swapchain - 
* @param pSwapchainImageCount - 
* @param pSwapchainImages - 
* 
* @return VkResult as int  
*/
private static native int  vkGetSwapchainImagesKHR0(
         java.nio.ByteBuffer   _wsi,
         java.nio.ByteBuffer   swapchain,
         int[]  pSwapchainImageCount,
         java.nio.ByteBuffer[]   bigBuffer);/* 
 WSI* wsi = (WSI*)_wsi;
 VkSwapchainKHR* ptr_swapchain = (VkSwapchainKHR*) swapchain;
 uint32_t swapchainImageCount;  
 
 // get the number of VkImages  
 VkResult res = wsi->pfnGetSwapchainImagesKHR(
                 (VkDevice) wsi->device,
                 (VkSwapchainKHR) (*ptr_swapchain),
                 (uint32_t*) &swapchainImageCount,
                 (VkImage*) NULL);
                 
   pSwapchainImageCount[0] = (jint) swapchainImageCount;
   
   // just the size then end of story
   if(bigBuffer == NULL){
      return res;
    }  
    
        //more...
    VkImage* pSwapchainImages = (VkImage*)malloc(swapchainImageCount * sizeof(VkImage));    
    res = wsi->pfnGetSwapchainImagesKHR(
                 (VkDevice) wsi->device,
                 (VkSwapchainKHR) (*ptr_swapchain),
                 (uint32_t*) &swapchainImageCount,
                 (VkImage*) pSwapchainImages);
                 
    pSwapchainImageCount[0] = (jint) swapchainImageCount;
    JBufferArray buffers(env, bigBuffer);
    buffers.setPointer(pSwapchainImages, swapchainImageCount * sizeof(VkImage), 0);
    
    return (jint) res;
*/ 


 /////////////////////////////////////

/**
*  Vulkan procedure ID: 146
* <h2>Prototype</h2><pre>
*  VkResult  vkAcquireNextImageKHR(
*     VkDevice                                    device,
*     VkSwapchainKHR                              swapchain,
*     uint64_t                                    timeout,
*     VkSemaphore                                 semaphore,
*     VkFence                                     fence,
*     uint32_t*                                   pImageIndex);
* </pre>
* 
* @param device - 
* @param swapchain - 
* @param timeout - 
* @param semaphore - 
* @param fence - 
* @param pImageIndex - 
* 
* @return VkResult
*/
public VkResult vkAcquireNextImageKHR(
        // VkDevice device,
         VkSwapchainKHR swapchain,
         long timeout,
         VkSemaphore semaphore,
         VkFence fence,
         int[] pImageIndex){
    
 int  _val = vkAcquireNextImageKHR0(
                // (device==null    ? null : device.getPointer()) /* ByteBuffer */ ,
                 wsi.getPointer(),
                 (swapchain==null ? null : swapchain.getPointer()) /* ByteBuffer */ ,
                 timeout ,
                 (semaphore==null ? null : semaphore.getPointer()) /* ByteBuffer */ ,
                 (fence==null     ? null : fence.getPointer()) /* ByteBuffer */ ,
                 pImageIndex  );
  return VkResult.fromValue(_val);
} 

/**
*  Native interface for Vulkan method #146
*  vkAcquireNextImageKHR 
* 
* @param device - 
* @param swapchain - 
* @param timeout - 
* @param semaphore - 
* @param fence - 
* @param pImageIndex - 
* 
* @return VkResult as int  
*/
private static native int  vkAcquireNextImageKHR0(
         //java.nio.ByteBuffer   device,
         java.nio.ByteBuffer   _wsi,
         java.nio.ByteBuffer   swapchain,
         long  timeout,
         java.nio.ByteBuffer   semaphore,
         java.nio.ByteBuffer   fence,
         int[]  pImageIndex);/* 
         
 WSI* wsi = (WSI*) _wsi;
 VkSwapchainKHR* ptr_swapchain = (VkSwapchainKHR*) swapchain;
 VkSemaphore* ptr_semaphore = (VkSemaphore*) semaphore;
 VkFence* ptr_fence = (VkFence*) fence;
 
 VkResult res = wsi->pfnAcquireNextImageKHR(
                 (VkDevice) wsi->device, 
                 (VkSwapchainKHR) (*ptr_swapchain),
                 (uint64_t) timeout,
                 (VkSemaphore) (*ptr_semaphore),
                 (VkFence) (*ptr_fence),
                 (uint32_t*) pImageIndex);
  return (jint) res;
*/ 


 /////////////////////////////////////

/**
*  Vulkan procedure ID: 147
* <h2>Prototype</h2><pre>
*  VkResult  vkQueuePresentKHR(
*     VkQueue                                     queue,
*     const VkPresentInfoKHR*                     pPresentInfo);
* </pre>
* 
* @param queue - 
* @param pPresentInfo - 
* 
* @return VkResult
*/
public VkResult vkQueuePresentKHR(
                VkQueue queue,
                VkPresentInfoKHR  pPresentInfo){
 int  _val = vkQueuePresentKHR0(
                  wsi.getPointer(),
                 (queue==null ? null : queue.getPointer()) /* ByteBuffer */ ,
                 (pPresentInfo==null ? null : pPresentInfo.getPointer()) /* ByteBuffer */  );
  return VkResult.fromValue(_val);
} 

/**
*  Native interface for Vulkan method #147
*  vkQueuePresentKHR 
* 
* @param queue - 
* @param pPresentInfo - 
* 
* @return VkResult as int  
*/
private static native int  vkQueuePresentKHR0(
         java.nio.ByteBuffer   _wsi,                                     
         java.nio.ByteBuffer   queue,
         java.nio.ByteBuffer   pPresentInfo);/* 
 VkQueue* ptr_queue = (VkQueue*) queue;
 WSI* wsi = (WSI*)_wsi;
 VkResult res = wsi->pfnQueuePresentKHR(
                 (VkQueue) (*ptr_queue),
                 (const VkPresentInfoKHR*) pPresentInfo);
  return (jint) res;
*/ 

    /**
     * Wrap a buffer as VkHandle
     * 
     * @param buffers - bytebuffer array
     * @return null or VkHandle instance using buffers[0]
     */
    private static VkHandle wrap(ByteBuffer[] buffers) {
        return buffers[0] == null ? null : new VkHandle(buffers[0]);
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

}
