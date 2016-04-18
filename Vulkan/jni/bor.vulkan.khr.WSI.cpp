#include <bor.vulkan.khr.WSI.h>

//@line:51

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
     
      static inline jobject wrapped_Java_bor_vulkan_khr_WSI_createWSI
(JNIEnv* env, jclass clazz, jobject obj_instance, jobject obj_device, char* instance, char* device) {

//@line:101
       
          VkInstance* pInstance = (VkInstance*)instance;
          VkDevice*   pDevice = (VkDevice*)device;
          WSI* wsi = new WSI((VkInstance) (*pInstance), (VkDevice) (*pDevice));
         
          if(wsi){
              jobject buffer = (jobject)(env->NewDirectByteBuffer(wsi, sizeof(WSI)));
              return buffer; 
         }else{
           return NULL;
         }
    
}

JNIEXPORT jobject JNICALL Java_bor_vulkan_khr_WSI_createWSI(JNIEnv* env, jclass clazz, jobject obj_instance, jobject obj_device) {
	char* instance = (char*)(obj_instance?env->GetDirectBufferAddress(obj_instance):0);
	char* device = (char*)(obj_device?env->GetDirectBufferAddress(obj_device):0);

	jobject JNI_returnValue = wrapped_Java_bor_vulkan_khr_WSI_createWSI(env, clazz, obj_instance, obj_device, instance, device);


	return JNI_returnValue;
}

static inline jobject wrapped_Java_bor_vulkan_khr_WSI_vkCreateAndroidSurfaceKHR0
(JNIEnv* env, jclass clazz, jobject obj__wsi, jobject obj_pCreateInfo, jobject obj_pAllocator, jintArray obj_result, char* _wsi, char* pCreateInfo, char* pAllocator, int* result) {

//@line:167

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
    
}

JNIEXPORT jobject JNICALL Java_bor_vulkan_khr_WSI_vkCreateAndroidSurfaceKHR0(JNIEnv* env, jclass clazz, jobject obj__wsi, jobject obj_pCreateInfo, jobject obj_pAllocator, jintArray obj_result) {
	char* _wsi = (char*)(obj__wsi?env->GetDirectBufferAddress(obj__wsi):0);
	char* pCreateInfo = (char*)(obj_pCreateInfo?env->GetDirectBufferAddress(obj_pCreateInfo):0);
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator):0);
	int* result = (int*)env->GetPrimitiveArrayCritical(obj_result, 0);

	jobject JNI_returnValue = wrapped_Java_bor_vulkan_khr_WSI_vkCreateAndroidSurfaceKHR0(env, clazz, obj__wsi, obj_pCreateInfo, obj_pAllocator, obj_result, _wsi, pCreateInfo, pAllocator, result);

	env->ReleasePrimitiveArrayCritical(obj_result, result, 0);

	return JNI_returnValue;
}

static inline jobject wrapped_Java_bor_vulkan_khr_WSI_vkCreateWin32SurfaceKHR0
(JNIEnv* env, jclass clazz, jobject obj__wsi, jobject obj_pCreateInfo, jobject obj_pAllocator, jintArray obj_result, char* _wsi, char* pCreateInfo, char* pAllocator, int* result) {

//@line:243
 
             
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

}

JNIEXPORT jobject JNICALL Java_bor_vulkan_khr_WSI_vkCreateWin32SurfaceKHR0(JNIEnv* env, jclass clazz, jobject obj__wsi, jobject obj_pCreateInfo, jobject obj_pAllocator, jintArray obj_result) {
	char* _wsi = (char*)(obj__wsi?env->GetDirectBufferAddress(obj__wsi):0);
	char* pCreateInfo = (char*)(obj_pCreateInfo?env->GetDirectBufferAddress(obj_pCreateInfo):0);
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator):0);
	int* result = (int*)env->GetPrimitiveArrayCritical(obj_result, 0);

	jobject JNI_returnValue = wrapped_Java_bor_vulkan_khr_WSI_vkCreateWin32SurfaceKHR0(env, clazz, obj__wsi, obj_pCreateInfo, obj_pAllocator, obj_result, _wsi, pCreateInfo, pAllocator, result);

	env->ReleasePrimitiveArrayCritical(obj_result, result, 0);

	return JNI_returnValue;
}

static inline jboolean wrapped_Java_bor_vulkan_khr_WSI_vkGetPhysicalDeviceWin32PresentationSupportKHR0
(JNIEnv* env, jclass clazz, jobject obj__wsi, jobject obj_physicalDevice, jint queueFamilyIndex, char* _wsi, char* physicalDevice) {

//@line:303
 
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
      

}

JNIEXPORT jboolean JNICALL Java_bor_vulkan_khr_WSI_vkGetPhysicalDeviceWin32PresentationSupportKHR0(JNIEnv* env, jclass clazz, jobject obj__wsi, jobject obj_physicalDevice, jint queueFamilyIndex) {
	char* _wsi = (char*)(obj__wsi?env->GetDirectBufferAddress(obj__wsi):0);
	char* physicalDevice = (char*)(obj_physicalDevice?env->GetDirectBufferAddress(obj_physicalDevice):0);

	jboolean JNI_returnValue = wrapped_Java_bor_vulkan_khr_WSI_vkGetPhysicalDeviceWin32PresentationSupportKHR0(env, clazz, obj__wsi, obj_physicalDevice, queueFamilyIndex, _wsi, physicalDevice);


	return JNI_returnValue;
}

static inline jobject wrapped_Java_bor_vulkan_khr_WSI_vkGetPhysicalDeviceDisplayPropertiesKHR0
(JNIEnv* env, jclass clazz, jobject obj__wsi, jobject obj_physicalDevice, jintArray obj_pPropertyCount, jint arrayLen, jintArray obj_result, jintArray obj_structSize, char* _wsi, char* physicalDevice, int* pPropertyCount, int* result, int* structSize) {

//@line:398
 
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

}

JNIEXPORT jobject JNICALL Java_bor_vulkan_khr_WSI_vkGetPhysicalDeviceDisplayPropertiesKHR0(JNIEnv* env, jclass clazz, jobject obj__wsi, jobject obj_physicalDevice, jintArray obj_pPropertyCount, jint arrayLen, jintArray obj_result, jintArray obj_structSize) {
	char* _wsi = (char*)(obj__wsi?env->GetDirectBufferAddress(obj__wsi):0);
	char* physicalDevice = (char*)(obj_physicalDevice?env->GetDirectBufferAddress(obj_physicalDevice):0);
	int* pPropertyCount = (int*)env->GetPrimitiveArrayCritical(obj_pPropertyCount, 0);
	int* result = (int*)env->GetPrimitiveArrayCritical(obj_result, 0);
	int* structSize = (int*)env->GetPrimitiveArrayCritical(obj_structSize, 0);

	jobject JNI_returnValue = wrapped_Java_bor_vulkan_khr_WSI_vkGetPhysicalDeviceDisplayPropertiesKHR0(env, clazz, obj__wsi, obj_physicalDevice, obj_pPropertyCount, arrayLen, obj_result, obj_structSize, _wsi, physicalDevice, pPropertyCount, result, structSize);

	env->ReleasePrimitiveArrayCritical(obj_pPropertyCount, pPropertyCount, 0);
	env->ReleasePrimitiveArrayCritical(obj_result, result, 0);
	env->ReleasePrimitiveArrayCritical(obj_structSize, structSize, 0);

	return JNI_returnValue;
}

static inline jobject wrapped_Java_bor_vulkan_khr_WSI_vkGetPhysicalDeviceDisplayPlanePropertiesKHR0
(JNIEnv* env, jclass clazz, jobject obj__wsi, jobject obj_physicalDevice, jintArray obj_pPropertyCount, jboolean justCount, jintArray obj_structSize, jintArray obj_result, char* _wsi, char* physicalDevice, int* pPropertyCount, int* structSize, int* result) {

//@line:526
 
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
       
 
}

JNIEXPORT jobject JNICALL Java_bor_vulkan_khr_WSI_vkGetPhysicalDeviceDisplayPlanePropertiesKHR0(JNIEnv* env, jclass clazz, jobject obj__wsi, jobject obj_physicalDevice, jintArray obj_pPropertyCount, jboolean justCount, jintArray obj_structSize, jintArray obj_result) {
	char* _wsi = (char*)(obj__wsi?env->GetDirectBufferAddress(obj__wsi):0);
	char* physicalDevice = (char*)(obj_physicalDevice?env->GetDirectBufferAddress(obj_physicalDevice):0);
	int* pPropertyCount = (int*)env->GetPrimitiveArrayCritical(obj_pPropertyCount, 0);
	int* structSize = (int*)env->GetPrimitiveArrayCritical(obj_structSize, 0);
	int* result = (int*)env->GetPrimitiveArrayCritical(obj_result, 0);

	jobject JNI_returnValue = wrapped_Java_bor_vulkan_khr_WSI_vkGetPhysicalDeviceDisplayPlanePropertiesKHR0(env, clazz, obj__wsi, obj_physicalDevice, obj_pPropertyCount, justCount, obj_structSize, obj_result, _wsi, physicalDevice, pPropertyCount, structSize, result);

	env->ReleasePrimitiveArrayCritical(obj_pPropertyCount, pPropertyCount, 0);
	env->ReleasePrimitiveArrayCritical(obj_structSize, structSize, 0);
	env->ReleasePrimitiveArrayCritical(obj_result, result, 0);

	return JNI_returnValue;
}

static inline jobject wrapped_Java_bor_vulkan_khr_WSI_vkGetDisplayModePropertiesKHR0
(JNIEnv* env, jclass clazz, jobject obj__wsi, jobject obj_physicalDevice, jobject obj_display, jintArray obj_pPropertyCount, jboolean justCount, jintArray obj_structSize, jintArray obj_result, char* _wsi, char* physicalDevice, char* display, int* pPropertyCount, int* structSize, int* result) {

//@line:659
 
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
  
}

JNIEXPORT jobject JNICALL Java_bor_vulkan_khr_WSI_vkGetDisplayModePropertiesKHR0(JNIEnv* env, jclass clazz, jobject obj__wsi, jobject obj_physicalDevice, jobject obj_display, jintArray obj_pPropertyCount, jboolean justCount, jintArray obj_structSize, jintArray obj_result) {
	char* _wsi = (char*)(obj__wsi?env->GetDirectBufferAddress(obj__wsi):0);
	char* physicalDevice = (char*)(obj_physicalDevice?env->GetDirectBufferAddress(obj_physicalDevice):0);
	char* display = (char*)(obj_display?env->GetDirectBufferAddress(obj_display):0);
	int* pPropertyCount = (int*)env->GetPrimitiveArrayCritical(obj_pPropertyCount, 0);
	int* structSize = (int*)env->GetPrimitiveArrayCritical(obj_structSize, 0);
	int* result = (int*)env->GetPrimitiveArrayCritical(obj_result, 0);

	jobject JNI_returnValue = wrapped_Java_bor_vulkan_khr_WSI_vkGetDisplayModePropertiesKHR0(env, clazz, obj__wsi, obj_physicalDevice, obj_display, obj_pPropertyCount, justCount, obj_structSize, obj_result, _wsi, physicalDevice, display, pPropertyCount, structSize, result);

	env->ReleasePrimitiveArrayCritical(obj_pPropertyCount, pPropertyCount, 0);
	env->ReleasePrimitiveArrayCritical(obj_structSize, structSize, 0);
	env->ReleasePrimitiveArrayCritical(obj_result, result, 0);

	return JNI_returnValue;
}

static inline jint wrapped_Java_bor_vulkan_khr_WSI_vkCreateDisplayModeKHR0
(JNIEnv* env, jclass clazz, jobject obj__wsi, jobject obj_physicalDevice, jobject obj_display, jobject obj_pCreateInfo, jobject obj_pAllocator, jobjectArray _pMode, char* _wsi, char* physicalDevice, char* display, char* pCreateInfo, char* pAllocator) {

//@line:769
 
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
         
   
}

JNIEXPORT jint JNICALL Java_bor_vulkan_khr_WSI_vkCreateDisplayModeKHR0(JNIEnv* env, jclass clazz, jobject obj__wsi, jobject obj_physicalDevice, jobject obj_display, jobject obj_pCreateInfo, jobject obj_pAllocator, jobjectArray _pMode) {
	char* _wsi = (char*)(obj__wsi?env->GetDirectBufferAddress(obj__wsi):0);
	char* physicalDevice = (char*)(obj_physicalDevice?env->GetDirectBufferAddress(obj_physicalDevice):0);
	char* display = (char*)(obj_display?env->GetDirectBufferAddress(obj_display):0);
	char* pCreateInfo = (char*)(obj_pCreateInfo?env->GetDirectBufferAddress(obj_pCreateInfo):0);
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator):0);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_khr_WSI_vkCreateDisplayModeKHR0(env, clazz, obj__wsi, obj_physicalDevice, obj_display, obj_pCreateInfo, obj_pAllocator, _pMode, _wsi, physicalDevice, display, pCreateInfo, pAllocator);


	return JNI_returnValue;
}

static inline jint wrapped_Java_bor_vulkan_khr_WSI_vkCreateDisplayPlaneSurfaceKHR0
(JNIEnv* env, jclass clazz, jobject obj__wsi, jobject obj_pCreateInfo, jobject obj_pAllocator, jobjectArray buffer, char* _wsi, char* pCreateInfo, char* pAllocator) {

//@line:851
 
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
    
}

JNIEXPORT jint JNICALL Java_bor_vulkan_khr_WSI_vkCreateDisplayPlaneSurfaceKHR0(JNIEnv* env, jclass clazz, jobject obj__wsi, jobject obj_pCreateInfo, jobject obj_pAllocator, jobjectArray buffer) {
	char* _wsi = (char*)(obj__wsi?env->GetDirectBufferAddress(obj__wsi):0);
	char* pCreateInfo = (char*)(obj_pCreateInfo?env->GetDirectBufferAddress(obj_pCreateInfo):0);
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator):0);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_khr_WSI_vkCreateDisplayPlaneSurfaceKHR0(env, clazz, obj__wsi, obj_pCreateInfo, obj_pAllocator, buffer, _wsi, pCreateInfo, pAllocator);


	return JNI_returnValue;
}

static inline jint wrapped_Java_bor_vulkan_khr_WSI_vkCreateSharedSwapchainsKHR0
(JNIEnv* env, jclass clazz, jobject obj__wsi, jint swapchainCount, jobject obj_pCreateInfos, jobject obj_pAllocator, jintArray obj_sizeofPTR, jobjectArray bufferArr, char* _wsi, char* pCreateInfos, char* pAllocator, int* sizeofPTR) {

//@line:941
 
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
    
}

JNIEXPORT jint JNICALL Java_bor_vulkan_khr_WSI_vkCreateSharedSwapchainsKHR0(JNIEnv* env, jclass clazz, jobject obj__wsi, jint swapchainCount, jobject obj_pCreateInfos, jobject obj_pAllocator, jintArray obj_sizeofPTR, jobjectArray bufferArr) {
	char* _wsi = (char*)(obj__wsi?env->GetDirectBufferAddress(obj__wsi):0);
	char* pCreateInfos = (char*)(obj_pCreateInfos?env->GetDirectBufferAddress(obj_pCreateInfos):0);
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator):0);
	int* sizeofPTR = (int*)env->GetPrimitiveArrayCritical(obj_sizeofPTR, 0);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_khr_WSI_vkCreateSharedSwapchainsKHR0(env, clazz, obj__wsi, swapchainCount, obj_pCreateInfos, obj_pAllocator, obj_sizeofPTR, bufferArr, _wsi, pCreateInfos, pAllocator, sizeofPTR);

	env->ReleasePrimitiveArrayCritical(obj_sizeofPTR, sizeofPTR, 0);

	return JNI_returnValue;
}

static inline jint wrapped_Java_bor_vulkan_khr_WSI_vkCreateXlibSurfaceKHR0
(JNIEnv* env, jclass clazz, jobject obj__wsi, jobject obj_pCreateInfo, jobject obj_pAllocator, jobjectArray buffer, char* _wsi, char* pCreateInfo, char* pAllocator) {

//@line:1022
 
                 
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
    
}

JNIEXPORT jint JNICALL Java_bor_vulkan_khr_WSI_vkCreateXlibSurfaceKHR0(JNIEnv* env, jclass clazz, jobject obj__wsi, jobject obj_pCreateInfo, jobject obj_pAllocator, jobjectArray buffer) {
	char* _wsi = (char*)(obj__wsi?env->GetDirectBufferAddress(obj__wsi):0);
	char* pCreateInfo = (char*)(obj_pCreateInfo?env->GetDirectBufferAddress(obj_pCreateInfo):0);
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator):0);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_khr_WSI_vkCreateXlibSurfaceKHR0(env, clazz, obj__wsi, obj_pCreateInfo, obj_pAllocator, buffer, _wsi, pCreateInfo, pAllocator);


	return JNI_returnValue;
}

static inline jboolean wrapped_Java_bor_vulkan_khr_WSI_vkGetPhysicalDeviceXlibPresentationSupportKHR0
(JNIEnv* env, jclass clazz, jobject obj__wsi, jobject obj_physicalDevice, jint queueFamilyIndex, jobject obj_dpy, jobject obj_visualID, char* _wsi, char* physicalDevice, char* dpy, char* visualID) {

//@line:1095
 
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
    
}

JNIEXPORT jboolean JNICALL Java_bor_vulkan_khr_WSI_vkGetPhysicalDeviceXlibPresentationSupportKHR0(JNIEnv* env, jclass clazz, jobject obj__wsi, jobject obj_physicalDevice, jint queueFamilyIndex, jobject obj_dpy, jobject obj_visualID) {
	char* _wsi = (char*)(obj__wsi?env->GetDirectBufferAddress(obj__wsi):0);
	char* physicalDevice = (char*)(obj_physicalDevice?env->GetDirectBufferAddress(obj_physicalDevice):0);
	char* dpy = (char*)(obj_dpy?env->GetDirectBufferAddress(obj_dpy):0);
	char* visualID = (char*)(obj_visualID?env->GetDirectBufferAddress(obj_visualID):0);

	jboolean JNI_returnValue = wrapped_Java_bor_vulkan_khr_WSI_vkGetPhysicalDeviceXlibPresentationSupportKHR0(env, clazz, obj__wsi, obj_physicalDevice, queueFamilyIndex, obj_dpy, obj_visualID, _wsi, physicalDevice, dpy, visualID);


	return JNI_returnValue;
}

static inline jint wrapped_Java_bor_vulkan_khr_WSI_vkCreateXcbSurfaceKHR0
(JNIEnv* env, jclass clazz, jobject obj__wsi, jobject obj_pCreateInfo, jobject obj_pAllocator, jobjectArray buffer, char* _wsi, char* pCreateInfo, char* pAllocator) {

//@line:1166
 
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
    
}

JNIEXPORT jint JNICALL Java_bor_vulkan_khr_WSI_vkCreateXcbSurfaceKHR0(JNIEnv* env, jclass clazz, jobject obj__wsi, jobject obj_pCreateInfo, jobject obj_pAllocator, jobjectArray buffer) {
	char* _wsi = (char*)(obj__wsi?env->GetDirectBufferAddress(obj__wsi):0);
	char* pCreateInfo = (char*)(obj_pCreateInfo?env->GetDirectBufferAddress(obj_pCreateInfo):0);
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator):0);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_khr_WSI_vkCreateXcbSurfaceKHR0(env, clazz, obj__wsi, obj_pCreateInfo, obj_pAllocator, buffer, _wsi, pCreateInfo, pAllocator);


	return JNI_returnValue;
}

static inline jboolean wrapped_Java_bor_vulkan_khr_WSI_vkGetPhysicalDeviceXcbPresentationSupportKHR0
(JNIEnv* env, jclass clazz, jobject obj_physicalDevice, jint queueFamilyIndex, jobject obj_connection, jobject visual_id, char* physicalDevice, char* connection) {

//@line:1234
 
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
    
}

JNIEXPORT jboolean JNICALL Java_bor_vulkan_khr_WSI_vkGetPhysicalDeviceXcbPresentationSupportKHR0(JNIEnv* env, jclass clazz, jobject obj_physicalDevice, jint queueFamilyIndex, jobject obj_connection, jobject visual_id) {
	char* physicalDevice = (char*)(obj_physicalDevice?env->GetDirectBufferAddress(obj_physicalDevice):0);
	char* connection = (char*)(obj_connection?env->GetDirectBufferAddress(obj_connection):0);

	jboolean JNI_returnValue = wrapped_Java_bor_vulkan_khr_WSI_vkGetPhysicalDeviceXcbPresentationSupportKHR0(env, clazz, obj_physicalDevice, queueFamilyIndex, obj_connection, visual_id, physicalDevice, connection);


	return JNI_returnValue;
}

static inline jint wrapped_Java_bor_vulkan_khr_WSI_vkCreateWaylandSurfaceKHR0
(JNIEnv* env, jclass clazz, jobject obj_instance, jobject obj_pCreateInfo, jobject obj_pAllocator, jobjectArray buffer, char* instance, char* pCreateInfo, char* pAllocator) {

//@line:1303
 
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
    
}

JNIEXPORT jint JNICALL Java_bor_vulkan_khr_WSI_vkCreateWaylandSurfaceKHR0(JNIEnv* env, jclass clazz, jobject obj_instance, jobject obj_pCreateInfo, jobject obj_pAllocator, jobjectArray buffer) {
	char* instance = (char*)(obj_instance?env->GetDirectBufferAddress(obj_instance):0);
	char* pCreateInfo = (char*)(obj_pCreateInfo?env->GetDirectBufferAddress(obj_pCreateInfo):0);
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator):0);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_khr_WSI_vkCreateWaylandSurfaceKHR0(env, clazz, obj_instance, obj_pCreateInfo, obj_pAllocator, buffer, instance, pCreateInfo, pAllocator);


	return JNI_returnValue;
}

static inline jboolean wrapped_Java_bor_vulkan_khr_WSI_vkGetPhysicalDeviceWaylandPresentationSupportKHR0
(JNIEnv* env, jclass clazz, jobject obj_physicalDevice, jint queueFamilyIndex, jobject obj_display, char* physicalDevice, char* display) {

//@line:1365

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
    
}

JNIEXPORT jboolean JNICALL Java_bor_vulkan_khr_WSI_vkGetPhysicalDeviceWaylandPresentationSupportKHR0(JNIEnv* env, jclass clazz, jobject obj_physicalDevice, jint queueFamilyIndex, jobject obj_display) {
	char* physicalDevice = (char*)(obj_physicalDevice?env->GetDirectBufferAddress(obj_physicalDevice):0);
	char* display = (char*)(obj_display?env->GetDirectBufferAddress(obj_display):0);

	jboolean JNI_returnValue = wrapped_Java_bor_vulkan_khr_WSI_vkGetPhysicalDeviceWaylandPresentationSupportKHR0(env, clazz, obj_physicalDevice, queueFamilyIndex, obj_display, physicalDevice, display);


	return JNI_returnValue;
}

static inline jint wrapped_Java_bor_vulkan_khr_WSI_vkCreateMirSurfaceKHR0
(JNIEnv* env, jclass clazz, jobject obj_instance, jobject obj_pCreateInfo, jobject obj_pAllocator, jobjectArray buff, char* instance, char* pCreateInfo, char* pAllocator) {

//@line:1431
 
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
    
}

JNIEXPORT jint JNICALL Java_bor_vulkan_khr_WSI_vkCreateMirSurfaceKHR0(JNIEnv* env, jclass clazz, jobject obj_instance, jobject obj_pCreateInfo, jobject obj_pAllocator, jobjectArray buff) {
	char* instance = (char*)(obj_instance?env->GetDirectBufferAddress(obj_instance):0);
	char* pCreateInfo = (char*)(obj_pCreateInfo?env->GetDirectBufferAddress(obj_pCreateInfo):0);
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator):0);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_khr_WSI_vkCreateMirSurfaceKHR0(env, clazz, obj_instance, obj_pCreateInfo, obj_pAllocator, buff, instance, pCreateInfo, pAllocator);


	return JNI_returnValue;
}

static inline jboolean wrapped_Java_bor_vulkan_khr_WSI_vkGetPhysicalDeviceMirPresentationSupportKHR0
(JNIEnv* env, jclass clazz, jobject obj_physicalDevice, jint queueFamilyIndex, jobject obj_connection, char* physicalDevice, char* connection) {

//@line:1494
 
                 
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
    
}

JNIEXPORT jboolean JNICALL Java_bor_vulkan_khr_WSI_vkGetPhysicalDeviceMirPresentationSupportKHR0(JNIEnv* env, jclass clazz, jobject obj_physicalDevice, jint queueFamilyIndex, jobject obj_connection) {
	char* physicalDevice = (char*)(obj_physicalDevice?env->GetDirectBufferAddress(obj_physicalDevice):0);
	char* connection = (char*)(obj_connection?env->GetDirectBufferAddress(obj_connection):0);

	jboolean JNI_returnValue = wrapped_Java_bor_vulkan_khr_WSI_vkGetPhysicalDeviceMirPresentationSupportKHR0(env, clazz, obj_physicalDevice, queueFamilyIndex, obj_connection, physicalDevice, connection);


	return JNI_returnValue;
}

static inline jint wrapped_Java_bor_vulkan_khr_WSI_vkGetDisplayPlaneCapabilitiesKHR0
(JNIEnv* env, jclass clazz, jobject obj__wsi, jobject obj_physicalDevice, jobject obj_mode, jint planeIndex, jobject obj_pCapabilities, char* _wsi, char* physicalDevice, char* mode, char* pCapabilities) {

//@line:1561
 
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
      

}

JNIEXPORT jint JNICALL Java_bor_vulkan_khr_WSI_vkGetDisplayPlaneCapabilitiesKHR0(JNIEnv* env, jclass clazz, jobject obj__wsi, jobject obj_physicalDevice, jobject obj_mode, jint planeIndex, jobject obj_pCapabilities) {
	char* _wsi = (char*)(obj__wsi?env->GetDirectBufferAddress(obj__wsi):0);
	char* physicalDevice = (char*)(obj_physicalDevice?env->GetDirectBufferAddress(obj_physicalDevice):0);
	char* mode = (char*)(obj_mode?env->GetDirectBufferAddress(obj_mode):0);
	char* pCapabilities = (char*)(obj_pCapabilities?env->GetDirectBufferAddress(obj_pCapabilities):0);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_khr_WSI_vkGetDisplayPlaneCapabilitiesKHR0(env, clazz, obj__wsi, obj_physicalDevice, obj_mode, planeIndex, obj_pCapabilities, _wsi, physicalDevice, mode, pCapabilities);


	return JNI_returnValue;
}

static inline jint wrapped_Java_bor_vulkan_khr_WSI_vkGetDisplayPlaneSupportedDisplaysKHR0
(JNIEnv* env, jclass clazz, jobject obj__wsi, jobject obj_physicalDevice, jint planeIndex, jintArray obj_pDisplayCount, jobjectArray buffers, char* _wsi, char* physicalDevice, int* pDisplayCount) {

//@line:1638
 
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

}

JNIEXPORT jint JNICALL Java_bor_vulkan_khr_WSI_vkGetDisplayPlaneSupportedDisplaysKHR0(JNIEnv* env, jclass clazz, jobject obj__wsi, jobject obj_physicalDevice, jint planeIndex, jintArray obj_pDisplayCount, jobjectArray buffers) {
	char* _wsi = (char*)(obj__wsi?env->GetDirectBufferAddress(obj__wsi):0);
	char* physicalDevice = (char*)(obj_physicalDevice?env->GetDirectBufferAddress(obj_physicalDevice):0);
	int* pDisplayCount = (int*)env->GetPrimitiveArrayCritical(obj_pDisplayCount, 0);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_khr_WSI_vkGetDisplayPlaneSupportedDisplaysKHR0(env, clazz, obj__wsi, obj_physicalDevice, planeIndex, obj_pDisplayCount, buffers, _wsi, physicalDevice, pDisplayCount);

	env->ReleasePrimitiveArrayCritical(obj_pDisplayCount, pDisplayCount, 0);

	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_khr_WSI_vkDestroySurfaceKHR0(JNIEnv* env, jclass clazz, jobject obj_instance, jobject obj_surface, jobject obj_pAllocator) {
	char* instance = (char*)(obj_instance?env->GetDirectBufferAddress(obj_instance):0);
	char* surface = (char*)(obj_surface?env->GetDirectBufferAddress(obj_surface):0);
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator):0);


//@line:1708
 
 VkInstance* ptr_instance = (VkInstance*) instance;
 VkSurfaceKHR* ptr_surface = (VkSurfaceKHR*) surface;
 vkDestroySurfaceKHR(
                 (VkInstance) (*ptr_instance),
                 (VkSurfaceKHR) (*ptr_surface),
                 (const VkAllocationCallbacks*) pAllocator);



}

static inline jint wrapped_Java_bor_vulkan_khr_WSI_vkGetPhysicalDeviceSurfaceSupportKHR0
(JNIEnv* env, jclass clazz, jobject obj_physicalDevice, jint queueFamilyIndex, jobject obj_surface, jbooleanArray obj_pSupported, char* physicalDevice, char* surface, bool* pSupported) {

//@line:1767
 
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

}

JNIEXPORT jint JNICALL Java_bor_vulkan_khr_WSI_vkGetPhysicalDeviceSurfaceSupportKHR0(JNIEnv* env, jclass clazz, jobject obj_physicalDevice, jint queueFamilyIndex, jobject obj_surface, jbooleanArray obj_pSupported) {
	char* physicalDevice = (char*)(obj_physicalDevice?env->GetDirectBufferAddress(obj_physicalDevice):0);
	char* surface = (char*)(obj_surface?env->GetDirectBufferAddress(obj_surface):0);
	bool* pSupported = (bool*)env->GetPrimitiveArrayCritical(obj_pSupported, 0);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_khr_WSI_vkGetPhysicalDeviceSurfaceSupportKHR0(env, clazz, obj_physicalDevice, queueFamilyIndex, obj_surface, obj_pSupported, physicalDevice, surface, pSupported);

	env->ReleasePrimitiveArrayCritical(obj_pSupported, pSupported, 0);

	return JNI_returnValue;
}

static inline jint wrapped_Java_bor_vulkan_khr_WSI_vkGetPhysicalDeviceSurfaceCapabilitiesKHR0
(JNIEnv* env, jclass clazz, jobject obj_physicalDevice, jobject obj_surface, jobject obj_pSurfaceCapabilities, char* physicalDevice, char* surface, char* pSurfaceCapabilities) {

//@line:1824
 
 VkPhysicalDevice* ptr_physicalDevice = (VkPhysicalDevice*) physicalDevice;
 VkSurfaceKHR* ptr_surface = (VkSurfaceKHR*) surface;
 
 VkResult res = vkGetPhysicalDeviceSurfaceCapabilitiesKHR(
                 (VkPhysicalDevice) (*ptr_physicalDevice),
                 (VkSurfaceKHR) (*ptr_surface),
                 (VkSurfaceCapabilitiesKHR*) pSurfaceCapabilities);
  return (jint) res;

}

JNIEXPORT jint JNICALL Java_bor_vulkan_khr_WSI_vkGetPhysicalDeviceSurfaceCapabilitiesKHR0(JNIEnv* env, jclass clazz, jobject obj_physicalDevice, jobject obj_surface, jobject obj_pSurfaceCapabilities) {
	char* physicalDevice = (char*)(obj_physicalDevice?env->GetDirectBufferAddress(obj_physicalDevice):0);
	char* surface = (char*)(obj_surface?env->GetDirectBufferAddress(obj_surface):0);
	char* pSurfaceCapabilities = (char*)(obj_pSurfaceCapabilities?env->GetDirectBufferAddress(obj_pSurfaceCapabilities):0);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_khr_WSI_vkGetPhysicalDeviceSurfaceCapabilitiesKHR0(env, clazz, obj_physicalDevice, obj_surface, obj_pSurfaceCapabilities, physicalDevice, surface, pSurfaceCapabilities);


	return JNI_returnValue;
}

static inline jint wrapped_Java_bor_vulkan_khr_WSI_vkGetPhysicalDeviceSurfaceFormatsKHR0
(JNIEnv* env, jclass clazz, jobject obj__wsi, jobject obj_physicalDevice, jobject obj_surface, jintArray obj_pSurfaceFormatCount, jintArray obj_sizeofStr, jobjectArray buffers, char* _wsi, char* physicalDevice, char* surface, int* pSurfaceFormatCount, int* sizeofStr) {

//@line:1921
 
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

}

JNIEXPORT jint JNICALL Java_bor_vulkan_khr_WSI_vkGetPhysicalDeviceSurfaceFormatsKHR0(JNIEnv* env, jclass clazz, jobject obj__wsi, jobject obj_physicalDevice, jobject obj_surface, jintArray obj_pSurfaceFormatCount, jintArray obj_sizeofStr, jobjectArray buffers) {
	char* _wsi = (char*)(obj__wsi?env->GetDirectBufferAddress(obj__wsi):0);
	char* physicalDevice = (char*)(obj_physicalDevice?env->GetDirectBufferAddress(obj_physicalDevice):0);
	char* surface = (char*)(obj_surface?env->GetDirectBufferAddress(obj_surface):0);
	int* pSurfaceFormatCount = (int*)env->GetPrimitiveArrayCritical(obj_pSurfaceFormatCount, 0);
	int* sizeofStr = (int*)env->GetPrimitiveArrayCritical(obj_sizeofStr, 0);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_khr_WSI_vkGetPhysicalDeviceSurfaceFormatsKHR0(env, clazz, obj__wsi, obj_physicalDevice, obj_surface, obj_pSurfaceFormatCount, obj_sizeofStr, buffers, _wsi, physicalDevice, surface, pSurfaceFormatCount, sizeofStr);

	env->ReleasePrimitiveArrayCritical(obj_pSurfaceFormatCount, pSurfaceFormatCount, 0);
	env->ReleasePrimitiveArrayCritical(obj_sizeofStr, sizeofStr, 0);

	return JNI_returnValue;
}

static inline jint wrapped_Java_bor_vulkan_khr_WSI_vkGetPhysicalDeviceSurfacePresentModesKHR0
(JNIEnv* env, jclass clazz, jobject obj_physicalDevice, jobject obj_surface, jintArray obj_pPresentModeCount, jintArray obj_pPresentModes, char* physicalDevice, char* surface, int* pPresentModeCount, int* pPresentModes) {

//@line:2024
 
         
 VkPhysicalDevice* ptr_physicalDevice = (VkPhysicalDevice*) physicalDevice;
 VkSurfaceKHR* ptr_surface = (VkSurfaceKHR*) surface;
 VkResult res = vkGetPhysicalDeviceSurfacePresentModesKHR(
                 (VkPhysicalDevice) (*ptr_physicalDevice),
                 (VkSurfaceKHR) (*ptr_surface),
                 (uint32_t*) pPresentModeCount,
                 (VkPresentModeKHR*) pPresentModes);
  return (jint) res;

}

JNIEXPORT jint JNICALL Java_bor_vulkan_khr_WSI_vkGetPhysicalDeviceSurfacePresentModesKHR0(JNIEnv* env, jclass clazz, jobject obj_physicalDevice, jobject obj_surface, jintArray obj_pPresentModeCount, jintArray obj_pPresentModes) {
	char* physicalDevice = (char*)(obj_physicalDevice?env->GetDirectBufferAddress(obj_physicalDevice):0);
	char* surface = (char*)(obj_surface?env->GetDirectBufferAddress(obj_surface):0);
	int* pPresentModeCount = (int*)env->GetPrimitiveArrayCritical(obj_pPresentModeCount, 0);
	int* pPresentModes = (int*)env->GetPrimitiveArrayCritical(obj_pPresentModes, 0);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_khr_WSI_vkGetPhysicalDeviceSurfacePresentModesKHR0(env, clazz, obj_physicalDevice, obj_surface, obj_pPresentModeCount, obj_pPresentModes, physicalDevice, surface, pPresentModeCount, pPresentModes);

	env->ReleasePrimitiveArrayCritical(obj_pPresentModeCount, pPresentModeCount, 0);
	env->ReleasePrimitiveArrayCritical(obj_pPresentModes, pPresentModes, 0);

	return JNI_returnValue;
}

static inline jint wrapped_Java_bor_vulkan_khr_WSI_vkCreateSwapchainKHR0
(JNIEnv* env, jclass clazz, jobject obj__wsi, jobject obj_pCreateInfo, jobject obj_pAllocator, jobjectArray buffer, char* _wsi, char* pCreateInfo, char* pAllocator) {

//@line:2090
 
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

}

JNIEXPORT jint JNICALL Java_bor_vulkan_khr_WSI_vkCreateSwapchainKHR0(JNIEnv* env, jclass clazz, jobject obj__wsi, jobject obj_pCreateInfo, jobject obj_pAllocator, jobjectArray buffer) {
	char* _wsi = (char*)(obj__wsi?env->GetDirectBufferAddress(obj__wsi):0);
	char* pCreateInfo = (char*)(obj_pCreateInfo?env->GetDirectBufferAddress(obj_pCreateInfo):0);
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator):0);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_khr_WSI_vkCreateSwapchainKHR0(env, clazz, obj__wsi, obj_pCreateInfo, obj_pAllocator, buffer, _wsi, pCreateInfo, pAllocator);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_khr_WSI_vkDestroySwapchainKHR0(JNIEnv* env, jclass clazz, jobject obj__wsi, jobject obj_swapchain, jobject obj_pAllocator) {
	char* _wsi = (char*)(obj__wsi?env->GetDirectBufferAddress(obj__wsi):0);
	char* swapchain = (char*)(obj_swapchain?env->GetDirectBufferAddress(obj_swapchain):0);
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator):0);


//@line:2146
 
 WSI* wsi = (WSI*)_wsi;
 VkSwapchainKHR* pSwapChain = (VkSwapchainKHR*) swapchain;
 wsi->pfnDestroySwapchainKHR(
                 (VkDevice) wsi->device,
                 (VkSwapchainKHR) (*pSwapChain),
                 (const VkAllocationCallbacks*) pAllocator);



}

static inline jint wrapped_Java_bor_vulkan_khr_WSI_vkGetSwapchainImagesKHR0
(JNIEnv* env, jclass clazz, jobject obj__wsi, jobject obj_swapchain, jintArray obj_pSwapchainImageCount, jobjectArray bigBuffer, char* _wsi, char* swapchain, int* pSwapchainImageCount) {

//@line:2234
 
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

}

JNIEXPORT jint JNICALL Java_bor_vulkan_khr_WSI_vkGetSwapchainImagesKHR0(JNIEnv* env, jclass clazz, jobject obj__wsi, jobject obj_swapchain, jintArray obj_pSwapchainImageCount, jobjectArray bigBuffer) {
	char* _wsi = (char*)(obj__wsi?env->GetDirectBufferAddress(obj__wsi):0);
	char* swapchain = (char*)(obj_swapchain?env->GetDirectBufferAddress(obj_swapchain):0);
	int* pSwapchainImageCount = (int*)env->GetPrimitiveArrayCritical(obj_pSwapchainImageCount, 0);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_khr_WSI_vkGetSwapchainImagesKHR0(env, clazz, obj__wsi, obj_swapchain, obj_pSwapchainImageCount, bigBuffer, _wsi, swapchain, pSwapchainImageCount);

	env->ReleasePrimitiveArrayCritical(obj_pSwapchainImageCount, pSwapchainImageCount, 0);

	return JNI_returnValue;
}

static inline jint wrapped_Java_bor_vulkan_khr_WSI_vkAcquireNextImageKHR0
(JNIEnv* env, jclass clazz, jobject obj__wsi, jobject obj_swapchain, jlong timeout, jobject obj_semaphore, jobject obj_fence, jintArray obj_pImageIndex, char* _wsi, char* swapchain, char* semaphore, char* fence, int* pImageIndex) {

//@line:2331
 
         
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

}

JNIEXPORT jint JNICALL Java_bor_vulkan_khr_WSI_vkAcquireNextImageKHR0(JNIEnv* env, jclass clazz, jobject obj__wsi, jobject obj_swapchain, jlong timeout, jobject obj_semaphore, jobject obj_fence, jintArray obj_pImageIndex) {
	char* _wsi = (char*)(obj__wsi?env->GetDirectBufferAddress(obj__wsi):0);
	char* swapchain = (char*)(obj_swapchain?env->GetDirectBufferAddress(obj_swapchain):0);
	char* semaphore = (char*)(obj_semaphore?env->GetDirectBufferAddress(obj_semaphore):0);
	char* fence = (char*)(obj_fence?env->GetDirectBufferAddress(obj_fence):0);
	int* pImageIndex = (int*)env->GetPrimitiveArrayCritical(obj_pImageIndex, 0);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_khr_WSI_vkAcquireNextImageKHR0(env, clazz, obj__wsi, obj_swapchain, timeout, obj_semaphore, obj_fence, obj_pImageIndex, _wsi, swapchain, semaphore, fence, pImageIndex);

	env->ReleasePrimitiveArrayCritical(obj_pImageIndex, pImageIndex, 0);

	return JNI_returnValue;
}

static inline jint wrapped_Java_bor_vulkan_khr_WSI_vkQueuePresentKHR0
(JNIEnv* env, jclass clazz, jobject obj__wsi, jobject obj_queue, jobject obj_pPresentInfo, char* _wsi, char* queue, char* pPresentInfo) {

//@line:2386
 
 VkQueue* ptr_queue = (VkQueue*) queue;
 WSI* wsi = (WSI*)_wsi;
 VkResult res = wsi->pfnQueuePresentKHR(
                 (VkQueue) (*ptr_queue),
                 (const VkPresentInfoKHR*) pPresentInfo);
  return (jint) res;

}

JNIEXPORT jint JNICALL Java_bor_vulkan_khr_WSI_vkQueuePresentKHR0(JNIEnv* env, jclass clazz, jobject obj__wsi, jobject obj_queue, jobject obj_pPresentInfo) {
	char* _wsi = (char*)(obj__wsi?env->GetDirectBufferAddress(obj__wsi):0);
	char* queue = (char*)(obj_queue?env->GetDirectBufferAddress(obj_queue):0);
	char* pPresentInfo = (char*)(obj_pPresentInfo?env->GetDirectBufferAddress(obj_pPresentInfo):0);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_khr_WSI_vkQueuePresentKHR0(env, clazz, obj__wsi, obj_queue, obj_pPresentInfo, _wsi, queue, pPresentInfo);


	return JNI_returnValue;
}
