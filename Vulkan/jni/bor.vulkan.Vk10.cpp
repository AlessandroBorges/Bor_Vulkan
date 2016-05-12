#include <bor.vulkan.Vk10.h>

//@line:94

      #define VK_USE_PLATFORM_WIN32_KHR 1
      
      
      #define BOR_LOADER 0
      #undef BOR_LOADER
      
      #include <vulkan/vulkan.h>      
      #include <stdio.h>
      #include <stdlib.h>
      #include <JBufferArray.h>  
      using namespace std;
      
      static jclass byteBufferClass;
      
      #define GET_INSTANCE_PROC_ADDR(inst, entrypoint)                       \
    {                                                                     \
        pfn##entrypoint =                                                 \
            (PFN_vk##entrypoint)vkGetInstanceProcAddr(inst, "vk"#entrypoint); \
        if (pfn##entrypoint == NULL) {                                    \
            printf("vkGetInstanceProcAddr failed to find vk"#entrypoint); \
        }                                                                 \
    } \
      
      static PFN_vkGetPhysicalDeviceDisplayPropertiesKHR       pfnGetPhysicalDeviceDisplayPropertiesKHR;
      static PFN_vkGetPhysicalDeviceDisplayPlanePropertiesKHR  pfnGetPhysicalDeviceDisplayPlanePropertiesKHR;
      static PFN_vkGetDisplayModePropertiesKHR                 pfnGetDisplayModePropertiesKHR;
      static PFN_vkGetDisplayPlaneCapabilitiesKHR              pfnGetDisplayPlaneCapabilitiesKHR;
      static PFN_vkGetDisplayPlaneSupportedDisplaysKHR         pfnGetDisplayPlaneSupportedDisplaysKHR;
      static PFN_vkCreateDisplayPlaneSurfaceKHR                pfnCreateDisplayPlaneSurfaceKHR;
  
      static PFN_vkCreateDisplayModeKHR                       pfnCreateDisplayModeKHR;//i11
      
      static  bool isWin32;
      static  bool isAndroid;
      static  bool isMIR;
      static  bool isWayland;
      static  bool isXCB;
      static  bool isXLIB;
      
      
   #ifdef VK_USE_PLATFORM_ANDROID_KHR  
     static PFN_vkCreateAndroidSurfaceKHR pfnCreateAndroidSurfaceKHR;
   #endif
   #ifdef VK_USE_PLATFORM_WIN32_KHR
     static PFN_vkCreateWin32SurfaceKHR pfnCreateWin32SurfaceKHR;
     static PFN_vkGetPhysicalDeviceWin32PresentationSupportKHR pfnGetPhysicalDeviceWin32PresentationSupportKHR;
   #endif 

   #ifdef VK_USE_PLATFORM_MIR_KHR
        static PFN_vkCreateMirSurfaceKHR pfnCreateMirSurfaceKHR;
        static PFN_vkGetPhysicalDeviceMirPresentationSupportKHR pfnGetPhysicalDeviceMirPresentationSupportKHR;
   #endif
   
   #ifdef VK_USE_PLATFORM_WAYLAND_KHR
      static PFN_vkCreateWaylandSurfaceKHR pfnCreateWaylandSurfaceKHR;
      static PFN_vkGetPhysicalDeviceWaylandPresentationSupportKHR pfnGetPhysicalDeviceWaylandPresentationSupportKHR;
   #endif
        
   #ifdef VK_USE_PLATFORM_XCB_KHR
    static PFN_vkCreateXcbSurfaceKHR pfnCreateXcbSurfaceKHR;
    static PFN_vkGetPhysicalDeviceXcbPresentationSupportKHR pfnGetPhysicalDeviceXcbPresentationSupportKHR;
   #endif   
        
   #ifdef VK_USE_PLATFORM_XLIB_KHR
    static PFN_vkCreateXlibSurfaceKHR pfnCreateXlibSurfaceKHR;
    static PFN_vkGetPhysicalDeviceXlibPresentationSupportKHR pfnGetPhysicalDeviceXlibPresentationSupportKHR;
   #endif
   
    static void initInstance(VkInstance instance){
         // platforms support 
        isWin32 = false;
        isAndroid = false;
        isMIR = false;
        isWayland = false;
        isXCB = false;
        isXLIB = false;
        
        //instance  
   GET_INSTANCE_PROC_ADDR(instance, GetPhysicalDeviceSurfaceSupportKHR);
   GET_INSTANCE_PROC_ADDR(instance, GetPhysicalDeviceSurfaceCapabilitiesKHR);
   GET_INSTANCE_PROC_ADDR(instance, GetPhysicalDeviceSurfaceFormatsKHR);
   GET_INSTANCE_PROC_ADDR(instance, GetPhysicalDeviceSurfacePresentModesKHR);
   GET_INSTANCE_PROC_ADDR(instance, GetPhysicalDeviceDisplayPropertiesKHR);
   GET_INSTANCE_PROC_ADDR(instance, GetPhysicalDeviceDisplayPlanePropertiesKHR);
   GET_INSTANCE_PROC_ADDR(instance, GetDisplayModePropertiesKHR);
   GET_INSTANCE_PROC_ADDR(instance, GetDisplayPlaneCapabilitiesKHR);
   GET_INSTANCE_PROC_ADDR(instance, GetDisplayPlaneSupportedDisplaysKHR);
   GET_INSTANCE_PROC_ADDR(instance, CreateDisplayPlaneSurfaceKHR);
   
   #ifdef VK_USE_PLATFORM_ANDROID_KHR  
     GET_INSTANCE_PROC_ADDR(instance, CreateAndroidSurfaceKHR);
         isAndroid = true;
   #endif
   
    #ifdef VK_USE_PLATFORM_WIN32_KHR
    GET_INSTANCE_PROC_ADDR(instance, CreateWin32SurfaceKHR);
        GET_INSTANCE_PROC_ADDR(instance, GetPhysicalDeviceWin32PresentationSupportKHR);
        isWin32 = true;
   #endif 

   #ifdef VK_USE_PLATFORM_MIR_KHR
        GET_INSTANCE_PROC_ADDR(instance, CreateMirSurfaceKHR);
        GET_INSTANCE_PROC_ADDR(instance, GetPhysicalDeviceMirPresentationSupportKHR);
        isMIR = true;
   #endif
   
   #ifdef VK_USE_PLATFORM_WAYLAND_KHR
       GET_INSTANCE_PROC_ADDR(instance, CreateWaylandSurfaceKHR);
       GET_INSTANCE_PROC_ADDR(instance, pfnGetPhysicalDeviceWaylandPresentationSupportKHR);
       isWayland = true;
   #endif
        
   #ifdef VK_USE_PLATFORM_XCB_KHR
        GET_INSTANCE_PROC_ADDR(instance, CreateXcbSurfaceKHR);
        GET_INSTANCE_PROC_ADDR(instance, GetPhysicalDeviceXcbPresentationSupportKHR);
        isXCB = true;
   #endif   
        
        #ifdef VK_USE_PLATFORM_XLIB_KHR
          GET_INSTANCE_PROC_ADDR(instance, CreateXlibSurfaceKHR);
          GET_INSTANCE_PROC_ADDR(instance, GetPhysicalDeviceXlibPresentationSupportKHR);
          isXLIB = true;
        #endif    
      
      }
      
     
      ////////////////////////////////////////
     JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_init(JNIEnv* env, jclass clazz) {


//@line:233

       jclass bufferClassLocal = env->FindClass("java/nio/ByteBuffer");
       byteBufferClass = (jclass) env->NewGlobalRef(bufferClassLocal);
    

}

static inline jobject wrapped_Java_bor_vulkan_Vk10_vkCreateInstance1
(JNIEnv* env, jclass clazz, jobject obj_pCreateInfo, jobject obj_pAllocator, jintArray obj_result, unsigned char* pCreateInfo, unsigned char* pAllocator, int* result) {

//@line:306

                                               
      VkInstance* pInstance_ = (VkInstance*)malloc(sizeof(VkInstance));                                
      VkResult res =  vkCreateInstance(
                       (const VkInstanceCreateInfo*)                 pCreateInfo,
                       (const VkAllocationCallbacks*)                pAllocator,
                       (VkInstance*)                                 pInstance_);
      result[0] = (jint) res;
                                                     
    //  printf("VkInstance* %p \n",  pInstance);
    //  printf("VkInstance  %p \n", (*pInstance));
      
      jobject buff = NULL; 
      if(pInstance_){
        VkInstance instance_ = (*pInstance_);
        buff = (jobject)(env->NewDirectByteBuffer((void*)(instance_), sizeof(VkInstance)));
        free(pInstance_);
      }    
      
      return buff; 
      
}

JNIEXPORT jobject JNICALL Java_bor_vulkan_Vk10_vkCreateInstance1(JNIEnv* env, jclass clazz, jobject obj_pCreateInfo, jobject obj_pAllocator, jintArray obj_result) {
	unsigned char* pCreateInfo = (unsigned char*)(obj_pCreateInfo?env->GetDirectBufferAddress(obj_pCreateInfo):0);
	unsigned char* pAllocator = (unsigned char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator):0);
	int* result = (int*)env->GetPrimitiveArrayCritical(obj_result, 0);

	jobject JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkCreateInstance1(env, clazz, obj_pCreateInfo, obj_pAllocator, obj_result, pCreateInfo, pAllocator, result);

	env->ReleasePrimitiveArrayCritical(obj_result, result, 0);

	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkDestroyInstance0(JNIEnv* env, jclass clazz, jobject obj_instance, jobject obj_pAllocator) {
	char* instance = (char*)(obj_instance?env->GetDirectBufferAddress(obj_instance):0);
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator):0);


//@line:352
                                                           
       vkDestroyInstance( (VkInstance) (instance),
                          (const VkAllocationCallbacks*)   pAllocator);        
       

}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkEnumeratePhysicalDevices0
(JNIEnv* env, jclass clazz, jobject obj_instance, jintArray obj_pPhysicalDeviceCount, jobjectArray pPhysicalDevicesRet, jint size, char* instance, int* pPhysicalDeviceCount) {

//@line:426

      
       VkPhysicalDevice* array = NULL;
       uint32_t count=0;        
       if(size>0){
          array = new VkPhysicalDevice[size]; 
          count = (uint32_t)size;        
        }     
              
       VkResult res = vkEnumeratePhysicalDevices(
                                  (VkInstance) (instance),
                                  (uint32_t*)  &count,
                                  (VkPhysicalDevice*) array);
       pPhysicalDeviceCount[0] = count;
       
       
       if(res>=0 && array){
           for(int i=0; i < size ; i++){
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
       
}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkEnumeratePhysicalDevices0(JNIEnv* env, jclass clazz, jobject obj_instance, jintArray obj_pPhysicalDeviceCount, jobjectArray pPhysicalDevicesRet, jint size) {
	char* instance = (char*)(obj_instance?env->GetDirectBufferAddress(obj_instance):0);
	int* pPhysicalDeviceCount = (int*)env->GetPrimitiveArrayCritical(obj_pPhysicalDeviceCount, 0);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkEnumeratePhysicalDevices0(env, clazz, obj_instance, obj_pPhysicalDeviceCount, pPhysicalDevicesRet, size, instance, pPhysicalDeviceCount);

	env->ReleasePrimitiveArrayCritical(obj_pPhysicalDeviceCount, pPhysicalDeviceCount, 0);

	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkGetPhysicalDeviceFeatures0(JNIEnv* env, jclass clazz, jobject obj_pphysicalDevice, jobject obj_pFeatures) {
	unsigned char* pphysicalDevice = (unsigned char*)(obj_pphysicalDevice?env->GetDirectBufferAddress(obj_pphysicalDevice):0);
	unsigned char* pFeatures = (unsigned char*)(obj_pFeatures?env->GetDirectBufferAddress(obj_pFeatures):0);


//@line:518

    
    vkGetPhysicalDeviceFeatures(
               (VkPhysicalDevice)  (pphysicalDevice),
               (VkPhysicalDeviceFeatures*)  pFeatures);
       

}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkGetPhysicalDeviceFormatProperties0(JNIEnv* env, jclass clazz, jobject obj_physicalDevice, jint format, jobject obj_pFormatProperties) {
	unsigned char* physicalDevice = (unsigned char*)(obj_physicalDevice?env->GetDirectBufferAddress(obj_physicalDevice):0);
	unsigned char* pFormatProperties = (unsigned char*)(obj_pFormatProperties?env->GetDirectBufferAddress(obj_pFormatProperties):0);


//@line:551

           
     vkGetPhysicalDeviceFormatProperties(
              (VkPhysicalDevice)  physicalDevice,
              (VkFormat)  format,
              (VkFormatProperties*)   pFormatProperties);
    

}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkGetPhysicalDeviceImageFormatProperties0
(JNIEnv* env, jclass clazz, jobject obj_physicalDevice, jint format, jint type, jint tiling, jint usage, jint flags, jobject obj_pImageFormatProperties, unsigned char* physicalDevice, unsigned char* pImageFormatProperties) {

//@line:615

               
         
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
       
}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkGetPhysicalDeviceImageFormatProperties0(JNIEnv* env, jclass clazz, jobject obj_physicalDevice, jint format, jint type, jint tiling, jint usage, jint flags, jobject obj_pImageFormatProperties) {
	unsigned char* physicalDevice = (unsigned char*)(obj_physicalDevice?env->GetDirectBufferAddress(obj_physicalDevice):0);
	unsigned char* pImageFormatProperties = (unsigned char*)(obj_pImageFormatProperties?env->GetDirectBufferAddress(obj_pImageFormatProperties):0);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkGetPhysicalDeviceImageFormatProperties0(env, clazz, obj_physicalDevice, format, type, tiling, usage, flags, obj_pImageFormatProperties, physicalDevice, pImageFormatProperties);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkGetPhysicalDeviceProperties0(JNIEnv* env, jclass clazz, jobject obj_physicalDevice, jobject obj_pProperties) {
	unsigned char* physicalDevice = (unsigned char*)(obj_physicalDevice?env->GetDirectBufferAddress(obj_physicalDevice):0);
	unsigned char* pProperties = (unsigned char*)(obj_pProperties?env->GetDirectBufferAddress(obj_pProperties):0);


//@line:658
 
      // printf("VkPhysicalDevice %p \n", physicalDevice);
      // printf("VkPhysicalDeviceProperties %p \n", pProperties);  
             
       vkGetPhysicalDeviceProperties(
            (VkPhysicalDevice)   (physicalDevice),
            (VkPhysicalDeviceProperties*)  pProperties);               
      

}

static inline jobjectArray wrapped_Java_bor_vulkan_Vk10_vkGetPhysicalDeviceQueueFamilyProperties0
(JNIEnv* env, jclass clazz, jobject obj_physicalDevice, jintArray obj_pQueueFamilyPropertyCount, unsigned char* physicalDevice, int* pQueueFamilyPropertyCount) {

//@line:718

                                             
     
     uint32_t count = 0;                                
     vkGetPhysicalDeviceQueueFamilyProperties(
             (VkPhysicalDevice) (physicalDevice),
             (uint32_t*)  &count,
             (VkQueueFamilyProperties*)  NULL);
     
      pQueueFamilyPropertyCount[0] = (jint) count;      
      VkQueueFamilyProperties*  pQueueFamilyProperties = NULL;
      
      if(count >0){
         pQueueFamilyProperties = new VkQueueFamilyProperties[count];
      }
      
      vkGetPhysicalDeviceQueueFamilyProperties(
             (VkPhysicalDevice) (physicalDevice),
             (uint32_t*)  &count,
             (VkQueueFamilyProperties*)  pQueueFamilyProperties);
      
      
      if(pQueueFamilyProperties)
         {           
           int length = pQueueFamilyPropertyCount[0];           
           jobjectArray bufArray = 
                        (jobjectArray) env->NewObjectArray(length, 
                                                           byteBufferClass, 
                                                           NULL);
                        
           for(int i=0; i<length; i++){
              VkQueueFamilyProperties* pQFP = pQueueFamilyProperties + i;
              jobject pObj = env->NewDirectByteBuffer((void*) pQFP, 
                                                      (jlong) sizeof(VkQueueFamilyProperties)
                                                      );
              env->SetObjectArrayElement(bufArray,(jsize)i, pObj);                                          
            }
            
            delete[] pQueueFamilyProperties;
            return bufArray;
         }   
         else{
          return NULL;
         }               
      
}

JNIEXPORT jobjectArray JNICALL Java_bor_vulkan_Vk10_vkGetPhysicalDeviceQueueFamilyProperties0(JNIEnv* env, jclass clazz, jobject obj_physicalDevice, jintArray obj_pQueueFamilyPropertyCount) {
	unsigned char* physicalDevice = (unsigned char*)(obj_physicalDevice?env->GetDirectBufferAddress(obj_physicalDevice):0);
	int* pQueueFamilyPropertyCount = (int*)env->GetPrimitiveArrayCritical(obj_pQueueFamilyPropertyCount, 0);

	jobjectArray JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkGetPhysicalDeviceQueueFamilyProperties0(env, clazz, obj_physicalDevice, obj_pQueueFamilyPropertyCount, physicalDevice, pQueueFamilyPropertyCount);

	env->ReleasePrimitiveArrayCritical(obj_pQueueFamilyPropertyCount, pQueueFamilyPropertyCount, 0);

	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkGetPhysicalDeviceMemoryProperties0(JNIEnv* env, jclass clazz, jobject obj_physicalDevice, jobject obj_pMemoryProperties) {
	unsigned char* physicalDevice = (unsigned char*)(obj_physicalDevice?env->GetDirectBufferAddress(obj_physicalDevice):0);
	unsigned char* pMemoryProperties = (unsigned char*)(obj_pMemoryProperties?env->GetDirectBufferAddress(obj_pMemoryProperties):0);


//@line:788

         vkGetPhysicalDeviceMemoryProperties(
             (VkPhysicalDevice)  physicalDevice,
             (VkPhysicalDeviceMemoryProperties*)  pMemoryProperties);        
               
    

}

static inline jobject wrapped_Java_bor_vulkan_Vk10_vkGetInstanceProcAddr0
(JNIEnv* env, jclass clazz, jobject obj_instance, jstring obj_pName, unsigned char* instance, char* pName) {

//@line:814
               
               PFN_vkVoidFunction func;               
               func  = vkGetInstanceProcAddr(
                            (VkInstance)   instance,
                            (const char*)     pName);                            
              jobject pFunc = env->NewDirectByteBuffer((void*) func, 
                                                      (jlong) sizeof(PFN_vkVoidFunction));                                                       
              return pFunc;                                                                               
       
}

JNIEXPORT jobject JNICALL Java_bor_vulkan_Vk10_vkGetInstanceProcAddr0(JNIEnv* env, jclass clazz, jobject obj_instance, jstring obj_pName) {
	unsigned char* instance = (unsigned char*)(obj_instance?env->GetDirectBufferAddress(obj_instance):0);
	char* pName = (char*)env->GetStringUTFChars(obj_pName, 0);

	jobject JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkGetInstanceProcAddr0(env, clazz, obj_instance, obj_pName, instance, pName);

	env->ReleaseStringUTFChars(obj_pName, pName);

	return JNI_returnValue;
}

static inline jobject wrapped_Java_bor_vulkan_Vk10_vkGetDeviceProcAddr0
(JNIEnv* env, jclass clazz, jobject obj_device, jstring obj_pName, unsigned char* device, char* pName) {

//@line:844
             
       PFN_vkVoidFunction func =  vkGetDeviceProcAddr(
                                     (VkDevice) device,
                                     (const char*) pName);
                               
       jobject pFunc = env->NewDirectByteBuffer((void*) func, 
                                                (jlong) sizeof(PFN_vkVoidFunction));                                                       
        return pFunc;
      
}

JNIEXPORT jobject JNICALL Java_bor_vulkan_Vk10_vkGetDeviceProcAddr0(JNIEnv* env, jclass clazz, jobject obj_device, jstring obj_pName) {
	unsigned char* device = (unsigned char*)(obj_device?env->GetDirectBufferAddress(obj_device):0);
	char* pName = (char*)env->GetStringUTFChars(obj_pName, 0);

	jobject JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkGetDeviceProcAddr0(env, clazz, obj_device, obj_pName, device, pName);

	env->ReleaseStringUTFChars(obj_pName, pName);

	return JNI_returnValue;
}

static inline jobject wrapped_Java_bor_vulkan_Vk10_vkCreateDevice0
(JNIEnv* env, jclass clazz, jobject obj_physicalDevice, jobject obj_pCreateInfo, jobject obj_pAllocator, jintArray obj_result, unsigned char* physicalDevice, unsigned char* pCreateInfo, unsigned char* pAllocator, int* result) {

//@line:898

                
       VkDevice* pDevice = new VkDevice[1];
       VkResult res =  vkCreateDevice(
                                      (VkPhysicalDevice) (physicalDevice),
                                      (const VkDeviceCreateInfo*)     pCreateInfo,
                                      (const VkAllocationCallbacks*)  pAllocator,
                                      (VkDevice*)                     pDevice);
      
         result[0] = res;   
         jobject pObj = NULL;
         
         VkDevice device = pDevice[0]; 
         if(device){     
           pObj = env->NewDirectByteBuffer((void*) device, 
                                           (jlong) sizeof(VkDevice));
         }else{
           printf("No Device available !\n");
         }
         if(pDevice)
           delete[] pDevice;
                 
         return pObj;      
       
}

JNIEXPORT jobject JNICALL Java_bor_vulkan_Vk10_vkCreateDevice0(JNIEnv* env, jclass clazz, jobject obj_physicalDevice, jobject obj_pCreateInfo, jobject obj_pAllocator, jintArray obj_result) {
	unsigned char* physicalDevice = (unsigned char*)(obj_physicalDevice?env->GetDirectBufferAddress(obj_physicalDevice):0);
	unsigned char* pCreateInfo = (unsigned char*)(obj_pCreateInfo?env->GetDirectBufferAddress(obj_pCreateInfo):0);
	unsigned char* pAllocator = (unsigned char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator):0);
	int* result = (int*)env->GetPrimitiveArrayCritical(obj_result, 0);

	jobject JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkCreateDevice0(env, clazz, obj_physicalDevice, obj_pCreateInfo, obj_pAllocator, obj_result, physicalDevice, pCreateInfo, pAllocator, result);

	env->ReleasePrimitiveArrayCritical(obj_result, result, 0);

	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkDestroyDevice0(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_pAllocator) {
	char* device = (char*)(obj_device?env->GetDirectBufferAddress(obj_device):0);
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator):0);


//@line:947
             
         vkDestroyDevice( (VkDevice) device,
                          (const VkAllocationCallbacks*)   pAllocator);
      

}

static inline jobjectArray wrapped_Java_bor_vulkan_Vk10_vkEnumerateInstanceExtensionProperties0
(JNIEnv* env, jclass clazz, jstring obj_pLayerName, jintArray obj_pPropertyCount, jintArray obj_result, char* pLayerName, int* pPropertyCount, int* result) {

//@line:1008

       
     
     uint32_t count = 0;          
     VkResult res = vkEnumerateInstanceExtensionProperties(
                        (const char*)  pLayerName,
                        (uint32_t*)    &count,
                        (VkExtensionProperties*) NULL);
                        
      pPropertyCount[0] = count;
      result[0] = res;
      
      VkExtensionProperties* pProperties = new VkExtensionProperties[count];
      
      res = vkEnumerateInstanceExtensionProperties(
                        (const char*)  pLayerName,
                        (uint32_t*)    &count,
                        (VkExtensionProperties*) pProperties);
           
      if(res>=0 && pProperties)
         {
           int length = pPropertyCount[0];
           jobjectArray bufArray =  (jobjectArray) env->NewObjectArray(length, 
                                                                       byteBufferClass, 
                                                                       NULL);                        
           for(int i=0; i<length; i++){
              VkExtensionProperties* prop = pProperties+i;
              jobject pObj = env->NewDirectByteBuffer((void*) prop, 
                                                      (jlong) sizeof(VkExtensionProperties)); 
              env->SetObjectArrayElement(bufArray, (jsize)i, pObj);                     
            }
            
            delete[] pProperties;
            return bufArray;
         }   
         else
          return NULL;               
               
         
}

JNIEXPORT jobjectArray JNICALL Java_bor_vulkan_Vk10_vkEnumerateInstanceExtensionProperties0(JNIEnv* env, jclass clazz, jstring obj_pLayerName, jintArray obj_pPropertyCount, jintArray obj_result) {
	char* pLayerName = (char*)env->GetStringUTFChars(obj_pLayerName, 0);
	int* pPropertyCount = (int*)env->GetPrimitiveArrayCritical(obj_pPropertyCount, 0);
	int* result = (int*)env->GetPrimitiveArrayCritical(obj_result, 0);

	jobjectArray JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkEnumerateInstanceExtensionProperties0(env, clazz, obj_pLayerName, obj_pPropertyCount, obj_result, pLayerName, pPropertyCount, result);

	env->ReleasePrimitiveArrayCritical(obj_pPropertyCount, pPropertyCount, 0);
	env->ReleasePrimitiveArrayCritical(obj_result, result, 0);
	env->ReleaseStringUTFChars(obj_pLayerName, pLayerName);

	return JNI_returnValue;
}

static inline jobjectArray wrapped_Java_bor_vulkan_Vk10_vkEnumerateDeviceExtensionProperties0
(JNIEnv* env, jclass clazz, jobject obj_physicalDevice, jstring obj_pLayerName, jintArray obj_result, unsigned char* physicalDevice, char* pLayerName, int* result) {

//@line:1109

               
     
     uint32_t count = 0;          
     VkResult res =  vkEnumerateDeviceExtensionProperties(
                  (VkPhysicalDevice)  physicalDevice,
                  (const char*)    pLayerName,
                  (uint32_t*)     &count,
                  (VkExtensionProperties*)  NULL);                   
     result[0] = res; 
     
     VkExtensionProperties*  pProperties = NULL;
     if(res >= 0 && count > 0){
         pProperties = new VkExtensionProperties[count];
     }          
     
     if(pProperties){
       res =  vkEnumerateDeviceExtensionProperties(
                  (VkPhysicalDevice)  physicalDevice,
                  (const char*)       pLayerName,
                  (uint32_t*)         &count,
                  (VkExtensionProperties*)  pProperties);      
        jobjectArray bufArray = (jobjectArray) env->NewObjectArray( count, 
                                                                    byteBufferClass, 
                                                                    NULL);                                               
        for(uint32_t i=0; i<count; i++){
            VkExtensionProperties* prop = pProperties + i;
            if(prop){
               jobject pObj = env->NewDirectByteBuffer((void*) prop, 
                                                       (jlong) sizeof(VkExtensionProperties));                   
               env->SetObjectArrayElement( bufArray,(jsize)i, pObj);
            } //if 
         }//for
         delete[] pProperties;
         return bufArray;
      }
      else
       return NULL;
               
       
}

JNIEXPORT jobjectArray JNICALL Java_bor_vulkan_Vk10_vkEnumerateDeviceExtensionProperties0(JNIEnv* env, jclass clazz, jobject obj_physicalDevice, jstring obj_pLayerName, jintArray obj_result) {
	unsigned char* physicalDevice = (unsigned char*)(obj_physicalDevice?env->GetDirectBufferAddress(obj_physicalDevice):0);
	char* pLayerName = (char*)env->GetStringUTFChars(obj_pLayerName, 0);
	int* result = (int*)env->GetPrimitiveArrayCritical(obj_result, 0);

	jobjectArray JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkEnumerateDeviceExtensionProperties0(env, clazz, obj_physicalDevice, obj_pLayerName, obj_result, physicalDevice, pLayerName, result);

	env->ReleasePrimitiveArrayCritical(obj_result, result, 0);
	env->ReleaseStringUTFChars(obj_pLayerName, pLayerName);

	return JNI_returnValue;
}

static inline jobjectArray wrapped_Java_bor_vulkan_Vk10_vkEnumerateInstanceLayerProperties0
(JNIEnv* env, jclass clazz, jintArray obj_result, int* result) {

//@line:1184

               
               
               uint32_t count = 0;
               VkResult res =  vkEnumerateInstanceLayerProperties(
                                 (uint32_t*) &count,
                                 (VkLayerProperties*)  NULL);
               
               result[0] = res;
               
               if(res>=0 && count > 0){
                 VkLayerProperties*  pProperties = new VkLayerProperties[count];  
                 res =  vkEnumerateInstanceLayerProperties(
                                 (uint32_t*) &count,
                                 (VkLayerProperties*)  pProperties);
                                 
                 result[0] = res;
                 jobjectArray bufArray = (jobjectArray) env->NewObjectArray(count, byteBufferClass, NULL);
                 
                 for(uint32_t i = 0; i < count; i++){
                   VkLayerProperties* prop = pProperties + i;
                   if(prop){
                       jobject pObj = env->NewDirectByteBuffer((void*) prop, 
                                                               (jlong) sizeof(VkLayerProperties));
                       env->SetObjectArrayElement(bufArray, i, pObj);
                   }                     
                }
                return bufArray;
               }else
               return NULL;
        
}

JNIEXPORT jobjectArray JNICALL Java_bor_vulkan_Vk10_vkEnumerateInstanceLayerProperties0(JNIEnv* env, jclass clazz, jintArray obj_result) {
	int* result = (int*)env->GetPrimitiveArrayCritical(obj_result, 0);

	jobjectArray JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkEnumerateInstanceLayerProperties0(env, clazz, obj_result, result);

	env->ReleasePrimitiveArrayCritical(obj_result, result, 0);

	return JNI_returnValue;
}

static inline jobjectArray wrapped_Java_bor_vulkan_Vk10_vkEnumerateDeviceLayerProperties0
(JNIEnv* env, jclass clazz, jobject obj_physicalDevice, jintArray obj_result, unsigned char* physicalDevice, int* result) {

//@line:1264

               
            
       uint32_t count=0;               
       VkResult res =   vkEnumerateDeviceLayerProperties(
                                  (VkPhysicalDevice)  physicalDevice,
                                  (uint32_t*)  &count,
                                  (VkLayerProperties*) NULL);            
       result[0] = res;
      
       if(res >= 0){  
          VkLayerProperties*  pProperties = new VkLayerProperties[count];
          res =  vkEnumerateDeviceLayerProperties(
                                  (VkPhysicalDevice)  physicalDevice,
                                  (uint32_t*)  &count,
                                  (VkLayerProperties*) pProperties);            
          result[0] = res;
                   
          jobjectArray bufArray = (jobjectArray) env->NewObjectArray(count, byteBufferClass, NULL);
          for(uint32_t i=0; i< count; i++){
              VkLayerProperties* prop = pProperties+i;
              if(prop){
                 jobject pObj = env->NewDirectByteBuffer((void*) prop, 
                                                         (jlong) sizeof(VkLayerProperties));
                  env->SetObjectArrayElement( bufArray,i, pObj);
               }                     
           }
           delete[] pProperties;
           return bufArray;
         }else
           return NULL;
      
}

JNIEXPORT jobjectArray JNICALL Java_bor_vulkan_Vk10_vkEnumerateDeviceLayerProperties0(JNIEnv* env, jclass clazz, jobject obj_physicalDevice, jintArray obj_result) {
	unsigned char* physicalDevice = (unsigned char*)(obj_physicalDevice?env->GetDirectBufferAddress(obj_physicalDevice):0);
	int* result = (int*)env->GetPrimitiveArrayCritical(obj_result, 0);

	jobjectArray JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkEnumerateDeviceLayerProperties0(env, clazz, obj_physicalDevice, obj_result, physicalDevice, result);

	env->ReleasePrimitiveArrayCritical(obj_result, result, 0);

	return JNI_returnValue;
}

static inline jobject wrapped_Java_bor_vulkan_Vk10_vkGetDeviceQueue0
(JNIEnv* env, jclass clazz, jobject obj_pDevice, jint queueFamilyIndex, jint queueIndex, unsigned char* pDevice) {

//@line:1336

               
       VkQueue*   pQueue = NULL;
       VkDevice* device = (VkDevice*) pDevice;
       
       VKAPI_CALL vkGetDeviceQueue(
                  (VkDevice)   (*device),
                  (uint32_t)   queueFamilyIndex,
                  (uint32_t)   queueIndex,
                  (VkQueue*)   pQueue);
       
          return  env->NewDirectByteBuffer((void*) pQueue, 
                                           (jlong) sizeof(void*));        
                  
      
}

JNIEXPORT jobject JNICALL Java_bor_vulkan_Vk10_vkGetDeviceQueue0(JNIEnv* env, jclass clazz, jobject obj_pDevice, jint queueFamilyIndex, jint queueIndex) {
	unsigned char* pDevice = (unsigned char*)(obj_pDevice?env->GetDirectBufferAddress(obj_pDevice):0);

	jobject JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkGetDeviceQueue0(env, clazz, obj_pDevice, queueFamilyIndex, queueIndex, pDevice);


	return JNI_returnValue;
}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkQueueSubmit0
(JNIEnv* env, jclass clazz, jobject obj__queue, jint submitCount, jobject obj_pSubmits, jobject obj__fence, char* _queue, char* pSubmits, char* _fence) {

//@line:1392

    
       VkQueue* queue = (VkQueue*)_queue;
       VkFence* fence = (VkFence*)_fence;
       
       VkResult res = vkQueueSubmit(
                                (VkQueue)   (*queue),
                                (uint32_t)  submitCount,
                                (const VkSubmitInfo*)  pSubmits,
                                (VkFence) fence);                                
       return (jint) res;
     
}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkQueueSubmit0(JNIEnv* env, jclass clazz, jobject obj__queue, jint submitCount, jobject obj_pSubmits, jobject obj__fence) {
	char* _queue = (char*)(obj__queue?env->GetDirectBufferAddress(obj__queue):0);
	char* pSubmits = (char*)(obj_pSubmits?env->GetDirectBufferAddress(obj_pSubmits):0);
	char* _fence = (char*)(obj__fence?env->GetDirectBufferAddress(obj__fence):0);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkQueueSubmit0(env, clazz, obj__queue, submitCount, obj_pSubmits, obj__fence, _queue, pSubmits, _fence);


	return JNI_returnValue;
}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkQueueWaitIdle0
(JNIEnv* env, jclass clazz, jobject obj_queue, char* queue) {

//@line:1433
 
     VkQueue* ptr_queue = (VkQueue*) queue;
     VkResult res = vkQueueWaitIdle(
                     (VkQueue) (*ptr_queue));
      return (jint) res;

}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkQueueWaitIdle0(JNIEnv* env, jclass clazz, jobject obj_queue) {
	char* queue = (char*)(obj_queue?env->GetDirectBufferAddress(obj_queue):0);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkQueueWaitIdle0(env, clazz, obj_queue, queue);


	return JNI_returnValue;
}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkDeviceWaitIdle0
(JNIEnv* env, jclass clazz, jobject obj_device, char* device) {

//@line:1470
 
     
     VkResult res = vkDeviceWaitIdle(
                     (VkDevice) (device));
      return (jint) res;

}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkDeviceWaitIdle0(JNIEnv* env, jclass clazz, jobject obj_device) {
	char* device = (char*)(obj_device?env->GetDirectBufferAddress(obj_device):0);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkDeviceWaitIdle0(env, clazz, obj_device, device);


	return JNI_returnValue;
}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkAllocateMemory0
(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_pAllocateInfo, jobject obj_pAllocator, jobject obj_pMemory, char* device, char* pAllocateInfo, char* pAllocator, char* pMemory) {

//@line:1525
 
     
     VkResult res = vkAllocateMemory(
                     (VkDevice) (device),
                     (const VkMemoryAllocateInfo*) pAllocateInfo,
                     (const VkAllocationCallbacks*) pAllocator,
                     (VkDeviceMemory*) pMemory);
      return (jint) res;

}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkAllocateMemory0(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_pAllocateInfo, jobject obj_pAllocator, jobject obj_pMemory) {
	char* device = (char*)(obj_device?env->GetDirectBufferAddress(obj_device):0);
	char* pAllocateInfo = (char*)(obj_pAllocateInfo?env->GetDirectBufferAddress(obj_pAllocateInfo):0);
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator):0);
	char* pMemory = (char*)(obj_pMemory?env->GetDirectBufferAddress(obj_pMemory):0);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkAllocateMemory0(env, clazz, obj_device, obj_pAllocateInfo, obj_pAllocator, obj_pMemory, device, pAllocateInfo, pAllocator, pMemory);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkFreeMemory0(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_memory, jobject obj_pAllocator) {
	char* device = (char*)(obj_device?env->GetDirectBufferAddress(obj_device):0);
	char* memory = (char*)(obj_memory?env->GetDirectBufferAddress(obj_memory):0);
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator):0);


//@line:1573
 
     
     VkDeviceMemory* ptr_memory = (VkDeviceMemory*) memory;
     vkFreeMemory(
                     (VkDevice) (device),
                     (VkDeviceMemory) (*ptr_memory),
                     (const VkAllocationCallbacks*) pAllocator);



}

static inline jobject wrapped_Java_bor_vulkan_Vk10_vkMapMemory0
(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_memory, jlong offset, jlong size, jint flags, jintArray obj_result, char* device, char* memory, int* result) {

//@line:1647
 
     // FIXED        
     
     VkDeviceMemory* ptr_memory = (VkDeviceMemory*) memory;
     void* pData = nullptr;
     jobject buff = NULL;
     
     VkResult res = vkMapMemory(
                     (VkDevice) (device),
                     (VkDeviceMemory) (*ptr_memory),
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

}

JNIEXPORT jobject JNICALL Java_bor_vulkan_Vk10_vkMapMemory0(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_memory, jlong offset, jlong size, jint flags, jintArray obj_result) {
	char* device = (char*)(obj_device?env->GetDirectBufferAddress(obj_device):0);
	char* memory = (char*)(obj_memory?env->GetDirectBufferAddress(obj_memory):0);
	int* result = (int*)env->GetPrimitiveArrayCritical(obj_result, 0);

	jobject JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkMapMemory0(env, clazz, obj_device, obj_memory, offset, size, flags, obj_result, device, memory, result);

	env->ReleasePrimitiveArrayCritical(obj_result, result, 0);

	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkUnmapMemory0(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_memory) {
	char* device = (char*)(obj_device?env->GetDirectBufferAddress(obj_device):0);
	char* memory = (char*)(obj_memory?env->GetDirectBufferAddress(obj_memory):0);


//@line:1703
 
     
     VkDeviceMemory* ptr_memory = (VkDeviceMemory*) memory;
     vkUnmapMemory(
                     (VkDevice) (device),
                     (VkDeviceMemory) (*ptr_memory));



}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkFlushMappedMemoryRanges0
(JNIEnv* env, jclass clazz, jobject obj_device, jint memoryRangeCount, jobjectArray pMemoryRangesArray, char* device) {

//@line:1788
 
     //FIXED
                    
            
     JBufferArray buffers (env, pMemoryRangesArray);          
     const VkMappedMemoryRange* pMemoryRanges = (const VkMappedMemoryRange*) buffers.getPointers();
     VkResult res = vkFlushMappedMemoryRanges(
                     (VkDevice) (device),
                     (uint32_t) memoryRangeCount,
                     (const VkMappedMemoryRange*) pMemoryRanges);
                     
                     
      return (jint) res;

}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkFlushMappedMemoryRanges0(JNIEnv* env, jclass clazz, jobject obj_device, jint memoryRangeCount, jobjectArray pMemoryRangesArray) {
	char* device = (char*)(obj_device?env->GetDirectBufferAddress(obj_device):0);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkFlushMappedMemoryRanges0(env, clazz, obj_device, memoryRangeCount, pMemoryRangesArray, device);


	return JNI_returnValue;
}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkInvalidateMappedMemoryRanges0
(JNIEnv* env, jclass clazz, jobject obj_device, jint memoryRangeCount, jobjectArray pMemoryRanges, char* device) {

//@line:1851

                           
          
     JBufferArray bufferArray (env, pMemoryRanges);
     PointerToAnything* buffers = bufferArray.getPointers();
     VkResult res = vkInvalidateMappedMemoryRanges(
                     (VkDevice) (device),
                     (uint32_t) memoryRangeCount,
                     (const VkMappedMemoryRange*) buffers);
                     
      return (jint) res;

}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkInvalidateMappedMemoryRanges0(JNIEnv* env, jclass clazz, jobject obj_device, jint memoryRangeCount, jobjectArray pMemoryRanges) {
	char* device = (char*)(obj_device?env->GetDirectBufferAddress(obj_device):0);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkInvalidateMappedMemoryRanges0(env, clazz, obj_device, memoryRangeCount, pMemoryRanges, device);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkGetDeviceMemoryCommitment0(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_memory, jlongArray obj_pCommittedMemoryInBytes) {
	char* device = (char*)(obj_device?env->GetDirectBufferAddress(obj_device):0);
	char* memory = (char*)(obj_memory?env->GetDirectBufferAddress(obj_memory):0);
	long long* pCommittedMemoryInBytes = (long long*)env->GetPrimitiveArrayCritical(obj_pCommittedMemoryInBytes, 0);


//@line:1902
 
     
     VkDeviceMemory* ptr_memory = (VkDeviceMemory*) memory;
     vkGetDeviceMemoryCommitment(
                     (VkDevice) (device),
                     (VkDeviceMemory) (*ptr_memory),
                     (VkDeviceSize*) pCommittedMemoryInBytes);


	env->ReleasePrimitiveArrayCritical(obj_pCommittedMemoryInBytes, pCommittedMemoryInBytes, 0);

}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkBindBufferMemory0
(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_buffer, jobject obj_memory, jlong memoryOffset, char* device, char* buffer, char* memory) {

//@line:1960
 
     
     VkBuffer* ptr_buffer = (VkBuffer*) buffer;
     VkDeviceMemory* ptr_memory = (VkDeviceMemory*) memory;
     VkResult res = vkBindBufferMemory(
                     (VkDevice) (device),
                     (VkBuffer) (*ptr_buffer),
                     (VkDeviceMemory) (*ptr_memory),
                     (VkDeviceSize) memoryOffset);
      return (jint) res;

}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkBindBufferMemory0(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_buffer, jobject obj_memory, jlong memoryOffset) {
	char* device = (char*)(obj_device?env->GetDirectBufferAddress(obj_device):0);
	char* buffer = (char*)(obj_buffer?env->GetDirectBufferAddress(obj_buffer):0);
	char* memory = (char*)(obj_memory?env->GetDirectBufferAddress(obj_memory):0);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkBindBufferMemory0(env, clazz, obj_device, obj_buffer, obj_memory, memoryOffset, device, buffer, memory);


	return JNI_returnValue;
}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkBindImageMemory0
(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_image, jobject obj_memory, jlong memoryOffset, char* device, char* image, char* memory) {

//@line:2020
 
     
     VkImage* ptr_image = (VkImage*) image;
     VkDeviceMemory* ptr_memory = (VkDeviceMemory*) memory;
     VkResult res = vkBindImageMemory(
                     (VkDevice) (device),
                     (VkImage) (*ptr_image),
                     (VkDeviceMemory) (*ptr_memory),
                     (VkDeviceSize) memoryOffset);
      return (jint) res;

}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkBindImageMemory0(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_image, jobject obj_memory, jlong memoryOffset) {
	char* device = (char*)(obj_device?env->GetDirectBufferAddress(obj_device):0);
	char* image = (char*)(obj_image?env->GetDirectBufferAddress(obj_image):0);
	char* memory = (char*)(obj_memory?env->GetDirectBufferAddress(obj_memory):0);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkBindImageMemory0(env, clazz, obj_device, obj_image, obj_memory, memoryOffset, device, image, memory);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkGetBufferMemoryRequirements0(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_buffer, jobject obj_pMemoryRequirements) {
	char* device = (char*)(obj_device?env->GetDirectBufferAddress(obj_device):0);
	char* buffer = (char*)(obj_buffer?env->GetDirectBufferAddress(obj_buffer):0);
	char* pMemoryRequirements = (char*)(obj_pMemoryRequirements?env->GetDirectBufferAddress(obj_pMemoryRequirements):0);


//@line:2070
 
     
     VkBuffer* ptr_buffer = (VkBuffer*) buffer;
     vkGetBufferMemoryRequirements(
                     (VkDevice) (device),
                     (VkBuffer) (*ptr_buffer),
                     (VkMemoryRequirements*) pMemoryRequirements);



}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkGetImageMemoryRequirements0(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_image, jobject obj_pMemoryRequirements) {
	char* device = (char*)(obj_device?env->GetDirectBufferAddress(obj_device):0);
	char* image = (char*)(obj_image?env->GetDirectBufferAddress(obj_image):0);
	char* pMemoryRequirements = (char*)(obj_pMemoryRequirements?env->GetDirectBufferAddress(obj_pMemoryRequirements):0);


//@line:2118
 
     
     VkImage* ptr_image = (VkImage*) image;
     vkGetImageMemoryRequirements(
                     (VkDevice) (device),
                     (VkImage) (*ptr_image),
                     (VkMemoryRequirements*) pMemoryRequirements);



}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkGetImageSparseMemoryRequirements0(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_image, jintArray obj_pSparseMemoryRequirementCount, jobjectArray pSparseMemoryRequirements) {
	char* device = (char*)(obj_device?env->GetDirectBufferAddress(obj_device):0);
	char* image = (char*)(obj_image?env->GetDirectBufferAddress(obj_image):0);
	int* pSparseMemoryRequirementCount = (int*)env->GetPrimitiveArrayCritical(obj_pSparseMemoryRequirementCount, 0);


//@line:2176
 
     
     VkImage* ptr_image = (VkImage*) image;
     JBufferArray buffers(env,pSparseMemoryRequirements);
     vkGetImageSparseMemoryRequirements(
                     (VkDevice) (device),
                     (VkImage) (*ptr_image),
                     (uint32_t*) pSparseMemoryRequirementCount,
                     (VkSparseImageMemoryRequirements*) buffers.getPointers());


	env->ReleasePrimitiveArrayCritical(obj_pSparseMemoryRequirementCount, pSparseMemoryRequirementCount, 0);

}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkGetPhysicalDeviceSparseImageFormatProperties0(JNIEnv* env, jclass clazz, jobject obj_physicalDevice, jint format, jint type, jint samples, jint usage, jint tiling, jintArray obj_pPropertyCount, jobjectArray pProperties) {
	char* physicalDevice = (char*)(obj_physicalDevice?env->GetDirectBufferAddress(obj_physicalDevice):0);
	int* pPropertyCount = (int*)env->GetPrimitiveArrayCritical(obj_pPropertyCount, 0);


//@line:2260
 
     VkPhysicalDevice* ptr_physicalDevice = (VkPhysicalDevice*) physicalDevice;
     JBufferArray buffers (env, pProperties);
     
     vkGetPhysicalDeviceSparseImageFormatProperties(
                     (VkPhysicalDevice) (*ptr_physicalDevice),
                     (VkFormat) format,
                     (VkImageType) type,
                     (VkSampleCountFlagBits) samples,
                     (VkImageUsageFlags) usage,
                     (VkImageTiling) tiling,
                     (uint32_t*) pPropertyCount,
                     (VkSparseImageFormatProperties*) buffers.getPointers());


	env->ReleasePrimitiveArrayCritical(obj_pPropertyCount, pPropertyCount, 0);

}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkQueueBindSparse0
(JNIEnv* env, jclass clazz, jobject obj_queue, jint bindInfoCount, jobject obj_pBindInfo, jobject obj_fence, char* queue, char* pBindInfo, char* fence) {

//@line:2324
 
     VkQueue* ptr_queue = (VkQueue*) queue;
     VkFence* ptr_fence = (VkFence*) fence;
     VkResult res = vkQueueBindSparse(
                     (VkQueue) (*ptr_queue),
                     (uint32_t) bindInfoCount,
                     (const VkBindSparseInfo*) pBindInfo,
                     (VkFence) (*ptr_fence));
      return (jint) res;

}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkQueueBindSparse0(JNIEnv* env, jclass clazz, jobject obj_queue, jint bindInfoCount, jobject obj_pBindInfo, jobject obj_fence) {
	char* queue = (char*)(obj_queue?env->GetDirectBufferAddress(obj_queue):0);
	char* pBindInfo = (char*)(obj_pBindInfo?env->GetDirectBufferAddress(obj_pBindInfo):0);
	char* fence = (char*)(obj_fence?env->GetDirectBufferAddress(obj_fence):0);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkQueueBindSparse0(env, clazz, obj_queue, bindInfoCount, obj_pBindInfo, obj_fence, queue, pBindInfo, fence);


	return JNI_returnValue;
}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkCreateFence0
(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_pCreateInfo, jobject obj_pAllocator, jobject obj_pFence, char* device, char* pCreateInfo, char* pAllocator, char* pFence) {

//@line:2383
 
     
     VkResult res = vkCreateFence(
                     (VkDevice) (device),
                     (const VkFenceCreateInfo*) pCreateInfo,
                     (const VkAllocationCallbacks*) pAllocator,
                     (VkFence*) pFence);
      return (jint) res;

}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkCreateFence0(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_pCreateInfo, jobject obj_pAllocator, jobject obj_pFence) {
	char* device = (char*)(obj_device?env->GetDirectBufferAddress(obj_device):0);
	char* pCreateInfo = (char*)(obj_pCreateInfo?env->GetDirectBufferAddress(obj_pCreateInfo):0);
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator):0);
	char* pFence = (char*)(obj_pFence?env->GetDirectBufferAddress(obj_pFence):0);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkCreateFence0(env, clazz, obj_device, obj_pCreateInfo, obj_pAllocator, obj_pFence, device, pCreateInfo, pAllocator, pFence);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkDestroyFence0(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_fence, jobject obj_pAllocator) {
	char* device = (char*)(obj_device?env->GetDirectBufferAddress(obj_device):0);
	char* fence = (char*)(obj_fence?env->GetDirectBufferAddress(obj_fence):0);
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator):0);


//@line:2431
 
     
     VkFence* ptr_fence = (VkFence*) fence;
     vkDestroyFence(
                     (VkDevice) (device),
                     (VkFence) (*ptr_fence),
                     (const VkAllocationCallbacks*) pAllocator);



}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkResetFences0
(JNIEnv* env, jclass clazz, jobject obj_device, jint fenceCount, jobjectArray pFences, char* device) {

//@line:2486
 
     
     JBufferArray buffers (env, pFences);
     
     VkResult res = vkResetFences(
                     (VkDevice) (device),
                     (uint32_t) fenceCount,
                     (const VkFence*) buffers.getPointers());
      return (jint) res;

}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkResetFences0(JNIEnv* env, jclass clazz, jobject obj_device, jint fenceCount, jobjectArray pFences) {
	char* device = (char*)(obj_device?env->GetDirectBufferAddress(obj_device):0);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkResetFences0(env, clazz, obj_device, fenceCount, pFences, device);


	return JNI_returnValue;
}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkGetFenceStatus0
(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_fence, char* device, char* fence) {

//@line:2533
 
     
     VkFence* ptr_fence = (VkFence*) fence;
     VkResult res = vkGetFenceStatus(
                     (VkDevice) (device),
                     (VkFence) (*ptr_fence));
      return (jint) res;

}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkGetFenceStatus0(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_fence) {
	char* device = (char*)(obj_device?env->GetDirectBufferAddress(obj_device):0);
	char* fence = (char*)(obj_fence?env->GetDirectBufferAddress(obj_fence):0);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkGetFenceStatus0(env, clazz, obj_device, obj_fence, device, fence);


	return JNI_returnValue;
}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkWaitForFences0
(JNIEnv* env, jclass clazz, jobject obj_device, jint fenceCount, jobjectArray pFences, jboolean waitAll, jlong timeout, char* device) {

//@line:2598
 
     
     JBufferArray buffers (env, pFences);
     
     VkResult res = vkWaitForFences(
                     (VkDevice) (device),
                     (uint32_t) fenceCount,
                     (const VkFence*) buffers.getPointers(),
                     (VkBool32) waitAll,
                     (uint64_t) timeout);
      return (jint) res;

}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkWaitForFences0(JNIEnv* env, jclass clazz, jobject obj_device, jint fenceCount, jobjectArray pFences, jboolean waitAll, jlong timeout) {
	char* device = (char*)(obj_device?env->GetDirectBufferAddress(obj_device):0);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkWaitForFences0(env, clazz, obj_device, fenceCount, pFences, waitAll, timeout, device);


	return JNI_returnValue;
}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkCreateSemaphore0
(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_pCreateInfo, jobject obj_pAllocator, jobject obj_pSemaphore, char* device, char* pCreateInfo, char* pAllocator, char* pSemaphore) {

//@line:2659
 
     
     VkResult res = vkCreateSemaphore(
                     (VkDevice) (device),
                     (const VkSemaphoreCreateInfo*) pCreateInfo,
                     (const VkAllocationCallbacks*) pAllocator,
                     (VkSemaphore*) pSemaphore);
      return (jint) res;

}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkCreateSemaphore0(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_pCreateInfo, jobject obj_pAllocator, jobject obj_pSemaphore) {
	char* device = (char*)(obj_device?env->GetDirectBufferAddress(obj_device):0);
	char* pCreateInfo = (char*)(obj_pCreateInfo?env->GetDirectBufferAddress(obj_pCreateInfo):0);
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator):0);
	char* pSemaphore = (char*)(obj_pSemaphore?env->GetDirectBufferAddress(obj_pSemaphore):0);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkCreateSemaphore0(env, clazz, obj_device, obj_pCreateInfo, obj_pAllocator, obj_pSemaphore, device, pCreateInfo, pAllocator, pSemaphore);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkDestroySemaphore0(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_semaphore, jobject obj_pAllocator) {
	char* device = (char*)(obj_device?env->GetDirectBufferAddress(obj_device):0);
	char* semaphore = (char*)(obj_semaphore?env->GetDirectBufferAddress(obj_semaphore):0);
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator):0);


//@line:2707
 
     
     VkSemaphore* ptr_semaphore = (VkSemaphore*) semaphore;
     vkDestroySemaphore(
                     (VkDevice) (device),
                     (VkSemaphore) (*ptr_semaphore),
                     (const VkAllocationCallbacks*) pAllocator);



}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkCreateEvent0
(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_pCreateInfo, jobject obj_pAllocator, jobject obj_pEvent, char* device, char* pCreateInfo, char* pAllocator, char* pEvent) {

//@line:2765
 
     
     VkResult res = vkCreateEvent(
                     (VkDevice) (device),
                     (const VkEventCreateInfo*) pCreateInfo,
                     (const VkAllocationCallbacks*) pAllocator,
                     (VkEvent*) pEvent);
      return (jint) res;

}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkCreateEvent0(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_pCreateInfo, jobject obj_pAllocator, jobject obj_pEvent) {
	char* device = (char*)(obj_device?env->GetDirectBufferAddress(obj_device):0);
	char* pCreateInfo = (char*)(obj_pCreateInfo?env->GetDirectBufferAddress(obj_pCreateInfo):0);
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator):0);
	char* pEvent = (char*)(obj_pEvent?env->GetDirectBufferAddress(obj_pEvent):0);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkCreateEvent0(env, clazz, obj_device, obj_pCreateInfo, obj_pAllocator, obj_pEvent, device, pCreateInfo, pAllocator, pEvent);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkDestroyEvent0(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_event, jobject obj_pAllocator) {
	char* device = (char*)(obj_device?env->GetDirectBufferAddress(obj_device):0);
	char* event = (char*)(obj_event?env->GetDirectBufferAddress(obj_event):0);
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator):0);


//@line:2813
 
     
     VkEvent* ptr_event = (VkEvent*) event;
     vkDestroyEvent(
                     (VkDevice) (device),
                     (VkEvent) (*ptr_event),
                     (const VkAllocationCallbacks*) pAllocator);



}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkGetEventStatus0
(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_event, char* device, char* event) {

//@line:2859
 
     
     VkEvent* ptr_event = (VkEvent*) event;
     VkResult res = vkGetEventStatus(
                     (VkDevice) (device),
                     (VkEvent) (*ptr_event));
      return (jint) res;

}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkGetEventStatus0(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_event) {
	char* device = (char*)(obj_device?env->GetDirectBufferAddress(obj_device):0);
	char* event = (char*)(obj_event?env->GetDirectBufferAddress(obj_event):0);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkGetEventStatus0(env, clazz, obj_device, obj_event, device, event);


	return JNI_returnValue;
}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkSetEvent0
(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_event, char* device, char* event) {

//@line:2904
 
     
     VkEvent* ptr_event = (VkEvent*) event;
     VkResult res = vkSetEvent(
                     (VkDevice) (device),
                     (VkEvent) (*ptr_event));
      return (jint) res;

}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkSetEvent0(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_event) {
	char* device = (char*)(obj_device?env->GetDirectBufferAddress(obj_device):0);
	char* event = (char*)(obj_event?env->GetDirectBufferAddress(obj_event):0);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkSetEvent0(env, clazz, obj_device, obj_event, device, event);


	return JNI_returnValue;
}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkResetEvent0
(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_event, char* device, char* event) {

//@line:2949
 
     
     VkEvent* ptr_event = (VkEvent*) event;
     VkResult res = vkResetEvent(
                     (VkDevice) (device),
                     (VkEvent) (*ptr_event));
      return (jint) res;

}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkResetEvent0(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_event) {
	char* device = (char*)(obj_device?env->GetDirectBufferAddress(obj_device):0);
	char* event = (char*)(obj_event?env->GetDirectBufferAddress(obj_event):0);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkResetEvent0(env, clazz, obj_device, obj_event, device, event);


	return JNI_returnValue;
}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkCreateQueryPool0
(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_pCreateInfo, jobject obj_pAllocator, jobjectArray retBuff, char* device, char* pCreateInfo, char* pAllocator) {

//@line:3013
 
     
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

}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkCreateQueryPool0(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_pCreateInfo, jobject obj_pAllocator, jobjectArray retBuff) {
	char* device = (char*)(obj_device?env->GetDirectBufferAddress(obj_device):0);
	char* pCreateInfo = (char*)(obj_pCreateInfo?env->GetDirectBufferAddress(obj_pCreateInfo):0);
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator):0);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkCreateQueryPool0(env, clazz, obj_device, obj_pCreateInfo, obj_pAllocator, retBuff, device, pCreateInfo, pAllocator);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkDestroyQueryPool0(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_queryPool, jobject obj_pAllocator) {
	char* device = (char*)(obj_device?env->GetDirectBufferAddress(obj_device):0);
	char* queryPool = (char*)(obj_queryPool?env->GetDirectBufferAddress(obj_queryPool):0);
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator):0);


//@line:3071
 
     
     vkDestroyQueryPool(
                     (VkDevice) (device),
                     (VkQueryPool) (queryPool),
                     (const VkAllocationCallbacks*) pAllocator);



}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkGetQueryPoolResults0
(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_queryPool, jint firstQuery, jint queryCount, jlong dataSize, jobject obj_pData, jlong stride, jint flags, char* device, char* queryPool, unsigned char* pData) {

//@line:3174
 
     
     
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

}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkGetQueryPoolResults0(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_queryPool, jint firstQuery, jint queryCount, jlong dataSize, jobject obj_pData, jlong stride, jint flags) {
	char* device = (char*)(obj_device?env->GetDirectBufferAddress(obj_device):0);
	char* queryPool = (char*)(obj_queryPool?env->GetDirectBufferAddress(obj_queryPool):0);
	unsigned char* pData = (unsigned char*)(obj_pData?env->GetDirectBufferAddress(obj_pData):0);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkGetQueryPoolResults0(env, clazz, obj_device, obj_queryPool, firstQuery, queryCount, dataSize, obj_pData, stride, flags, device, queryPool, pData);


	return JNI_returnValue;
}

static inline jobject wrapped_Java_bor_vulkan_Vk10_vkCreateBuffer0
(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_pCreateInfo, jobject obj_pAllocator, jintArray obj_result, char* device, char* pCreateInfo, char* pAllocator, int* result) {

//@line:3240
             
     
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

}

JNIEXPORT jobject JNICALL Java_bor_vulkan_Vk10_vkCreateBuffer0(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_pCreateInfo, jobject obj_pAllocator, jintArray obj_result) {
	char* device = (char*)(obj_device?env->GetDirectBufferAddress(obj_device):0);
	char* pCreateInfo = (char*)(obj_pCreateInfo?env->GetDirectBufferAddress(obj_pCreateInfo):0);
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator):0);
	int* result = (int*)env->GetPrimitiveArrayCritical(obj_result, 0);

	jobject JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkCreateBuffer0(env, clazz, obj_device, obj_pCreateInfo, obj_pAllocator, obj_result, device, pCreateInfo, pAllocator, result);

	env->ReleasePrimitiveArrayCritical(obj_result, result, 0);

	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkDestroyBuffer0(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_buffer, jobject obj_pAllocator) {
	char* device = (char*)(obj_device?env->GetDirectBufferAddress(obj_device):0);
	char* buffer = (char*)(obj_buffer?env->GetDirectBufferAddress(obj_buffer):0);
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator):0);


//@line:3298

     vkDestroyBuffer(
                     (VkDevice) (device),
                     (VkBuffer) (buffer),
                     (const VkAllocationCallbacks*) pAllocator);



}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkCreateBufferView0
(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_pCreateInfo, jobject obj_pAllocator, jobjectArray retView, char* device, char* pCreateInfo, char* pAllocator) {

//@line:3360
 
             
     
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

}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkCreateBufferView0(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_pCreateInfo, jobject obj_pAllocator, jobjectArray retView) {
	char* device = (char*)(obj_device?env->GetDirectBufferAddress(obj_device):0);
	char* pCreateInfo = (char*)(obj_pCreateInfo?env->GetDirectBufferAddress(obj_pCreateInfo):0);
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator):0);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkCreateBufferView0(env, clazz, obj_device, obj_pCreateInfo, obj_pAllocator, retView, device, pCreateInfo, pAllocator);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkDestroyBufferView0(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_bufferView, jobject obj_pAllocator) {
	char* device = (char*)(obj_device?env->GetDirectBufferAddress(obj_device):0);
	char* bufferView = (char*)(obj_bufferView?env->GetDirectBufferAddress(obj_bufferView):0);
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator):0);


//@line:3420
 
     
     VkBufferView* ptr_bufferView = (VkBufferView*) bufferView;
     vkDestroyBufferView(
                     (VkDevice) (device),
                     (VkBufferView) (*ptr_bufferView),
                     (const VkAllocationCallbacks*) pAllocator);



}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkCreateImage0
(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_pCreateInfo, jobject obj_pAllocator, jobjectArray pImage, char* device, char* pCreateInfo, char* pAllocator) {

//@line:3480
 
     
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

}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkCreateImage0(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_pCreateInfo, jobject obj_pAllocator, jobjectArray pImage) {
	char* device = (char*)(obj_device?env->GetDirectBufferAddress(obj_device):0);
	char* pCreateInfo = (char*)(obj_pCreateInfo?env->GetDirectBufferAddress(obj_pCreateInfo):0);
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator):0);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkCreateImage0(env, clazz, obj_device, obj_pCreateInfo, obj_pAllocator, pImage, device, pCreateInfo, pAllocator);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkDestroyImage0(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_image, jobject obj_pAllocator) {
	char* device = (char*)(obj_device?env->GetDirectBufferAddress(obj_device):0);
	char* image = (char*)(obj_image?env->GetDirectBufferAddress(obj_image):0);
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator):0);


//@line:3539
 
     
     VkImage* ptr_image = (VkImage*) image;
     vkDestroyImage(
                     (VkDevice) (device),
                     (VkImage) (*ptr_image),
                     (const VkAllocationCallbacks*) pAllocator);



}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkGetImageSubresourceLayout0(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_image, jobject obj_pSubresource, jobject obj_pLayout) {
	char* device = (char*)(obj_device?env->GetDirectBufferAddress(obj_device):0);
	char* image = (char*)(obj_image?env->GetDirectBufferAddress(obj_image):0);
	char* pSubresource = (char*)(obj_pSubresource?env->GetDirectBufferAddress(obj_pSubresource):0);
	char* pLayout = (char*)(obj_pLayout?env->GetDirectBufferAddress(obj_pLayout):0);


//@line:3593
 
     
     VkImage* ptr_image = (VkImage*) image;
     vkGetImageSubresourceLayout(
                     (VkDevice) (device),
                     (VkImage) (*ptr_image),
                     (const VkImageSubresource*) pSubresource,
                     (VkSubresourceLayout*) pLayout);



}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkCreateImageView0
(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_pCreateInfo, jobject obj_pAllocator, jobject obj_pView, char* device, char* pCreateInfo, char* pAllocator, char* pView) {

//@line:3652
 
     
     VkResult res = vkCreateImageView(
                     (VkDevice) (device),
                     (const VkImageViewCreateInfo*) pCreateInfo,
                     (const VkAllocationCallbacks*) pAllocator,
                     (VkImageView*) pView);
      return (jint) res;

}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkCreateImageView0(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_pCreateInfo, jobject obj_pAllocator, jobject obj_pView) {
	char* device = (char*)(obj_device?env->GetDirectBufferAddress(obj_device):0);
	char* pCreateInfo = (char*)(obj_pCreateInfo?env->GetDirectBufferAddress(obj_pCreateInfo):0);
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator):0);
	char* pView = (char*)(obj_pView?env->GetDirectBufferAddress(obj_pView):0);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkCreateImageView0(env, clazz, obj_device, obj_pCreateInfo, obj_pAllocator, obj_pView, device, pCreateInfo, pAllocator, pView);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkDestroyImageView0(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_imageView, jobject obj_pAllocator) {
	char* device = (char*)(obj_device?env->GetDirectBufferAddress(obj_device):0);
	char* imageView = (char*)(obj_imageView?env->GetDirectBufferAddress(obj_imageView):0);
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator):0);


//@line:3700
 
     
     VkImageView* ptr_imageView = (VkImageView*) imageView;
     vkDestroyImageView(
                     (VkDevice) (device),
                     (VkImageView) (*ptr_imageView),
                     (const VkAllocationCallbacks*) pAllocator);



}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkCreateShaderModule0
(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_pCreateInfo, jobject obj_pAllocator, jobject obj_pShaderModule, char* device, char* pCreateInfo, char* pAllocator, char* pShaderModule) {

//@line:3758
 
     
     VkResult res = vkCreateShaderModule(
                     (VkDevice) (device),
                     (const VkShaderModuleCreateInfo*) pCreateInfo,
                     (const VkAllocationCallbacks*) pAllocator,
                     (VkShaderModule*) pShaderModule);
      return (jint) res;

}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkCreateShaderModule0(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_pCreateInfo, jobject obj_pAllocator, jobject obj_pShaderModule) {
	char* device = (char*)(obj_device?env->GetDirectBufferAddress(obj_device):0);
	char* pCreateInfo = (char*)(obj_pCreateInfo?env->GetDirectBufferAddress(obj_pCreateInfo):0);
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator):0);
	char* pShaderModule = (char*)(obj_pShaderModule?env->GetDirectBufferAddress(obj_pShaderModule):0);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkCreateShaderModule0(env, clazz, obj_device, obj_pCreateInfo, obj_pAllocator, obj_pShaderModule, device, pCreateInfo, pAllocator, pShaderModule);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkDestroyShaderModule0(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_shaderModule, jobject obj_pAllocator) {
	char* device = (char*)(obj_device?env->GetDirectBufferAddress(obj_device):0);
	char* shaderModule = (char*)(obj_shaderModule?env->GetDirectBufferAddress(obj_shaderModule):0);
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator):0);


//@line:3806
 
     
     VkShaderModule* ptr_shaderModule = (VkShaderModule*) shaderModule;
     vkDestroyShaderModule(
                     (VkDevice) (device),
                     (VkShaderModule) (*ptr_shaderModule),
                     (const VkAllocationCallbacks*) pAllocator);



}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkCreatePipelineCache0
(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_pCreateInfo, jobject obj_pAllocator, jobject obj_pPipelineCache, char* device, char* pCreateInfo, char* pAllocator, char* pPipelineCache) {

//@line:3864
 
     
     VkResult res = vkCreatePipelineCache(
                     (VkDevice) (device),
                     (const VkPipelineCacheCreateInfo*) pCreateInfo,
                     (const VkAllocationCallbacks*) pAllocator,
                     (VkPipelineCache*) pPipelineCache);
      return (jint) res;

}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkCreatePipelineCache0(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_pCreateInfo, jobject obj_pAllocator, jobject obj_pPipelineCache) {
	char* device = (char*)(obj_device?env->GetDirectBufferAddress(obj_device):0);
	char* pCreateInfo = (char*)(obj_pCreateInfo?env->GetDirectBufferAddress(obj_pCreateInfo):0);
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator):0);
	char* pPipelineCache = (char*)(obj_pPipelineCache?env->GetDirectBufferAddress(obj_pPipelineCache):0);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkCreatePipelineCache0(env, clazz, obj_device, obj_pCreateInfo, obj_pAllocator, obj_pPipelineCache, device, pCreateInfo, pAllocator, pPipelineCache);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkDestroyPipelineCache0(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_pipelineCache, jobject obj_pAllocator) {
	char* device = (char*)(obj_device?env->GetDirectBufferAddress(obj_device):0);
	char* pipelineCache = (char*)(obj_pipelineCache?env->GetDirectBufferAddress(obj_pipelineCache):0);
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator):0);


//@line:3912
 
     
     VkPipelineCache* ptr_pipelineCache = (VkPipelineCache*) pipelineCache;
     vkDestroyPipelineCache(
                     (VkDevice) (device),
                     (VkPipelineCache) (*ptr_pipelineCache),
                     (const VkAllocationCallbacks*) pAllocator);



}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkGetPipelineCacheData0
(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_pipelineCache, jlongArray obj_pDataSize, jobject obj_pData, char* device, char* pipelineCache, unsigned char* pData, long long* pDataSize) {

//@line:3970
 
     
     VkPipelineCache* ptr_pipelineCache = (VkPipelineCache*) pipelineCache;
     VkResult res = vkGetPipelineCacheData(
                     (VkDevice) (device),
                     (VkPipelineCache) (*ptr_pipelineCache),
                     (size_t*) pDataSize,
                     (void*) pData);
      return (jint) res;

}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkGetPipelineCacheData0(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_pipelineCache, jlongArray obj_pDataSize, jobject obj_pData) {
	char* device = (char*)(obj_device?env->GetDirectBufferAddress(obj_device):0);
	char* pipelineCache = (char*)(obj_pipelineCache?env->GetDirectBufferAddress(obj_pipelineCache):0);
	unsigned char* pData = (unsigned char*)(obj_pData?env->GetDirectBufferAddress(obj_pData):0);
	long long* pDataSize = (long long*)env->GetPrimitiveArrayCritical(obj_pDataSize, 0);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkGetPipelineCacheData0(env, clazz, obj_device, obj_pipelineCache, obj_pDataSize, obj_pData, device, pipelineCache, pData, pDataSize);

	env->ReleasePrimitiveArrayCritical(obj_pDataSize, pDataSize, 0);

	return JNI_returnValue;
}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkMergePipelineCaches0
(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_dstCache, jint srcCacheCount, jobject obj_pSrcCaches, char* device, char* dstCache, char* pSrcCaches) {

//@line:4029
 
     
     VkPipelineCache* ptr_dstCache = (VkPipelineCache*) dstCache;
     VkResult res = vkMergePipelineCaches(
                     (VkDevice) (device),
                     (VkPipelineCache) (*ptr_dstCache),
                     (uint32_t) srcCacheCount,
                     (const VkPipelineCache*) pSrcCaches);
      return (jint) res;

}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkMergePipelineCaches0(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_dstCache, jint srcCacheCount, jobject obj_pSrcCaches) {
	char* device = (char*)(obj_device?env->GetDirectBufferAddress(obj_device):0);
	char* dstCache = (char*)(obj_dstCache?env->GetDirectBufferAddress(obj_dstCache):0);
	char* pSrcCaches = (char*)(obj_pSrcCaches?env->GetDirectBufferAddress(obj_pSrcCaches):0);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkMergePipelineCaches0(env, clazz, obj_device, obj_dstCache, srcCacheCount, obj_pSrcCaches, device, dstCache, pSrcCaches);


	return JNI_returnValue;
}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkCreateGraphicsPipelines0
(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_pipelineCache, jint createInfoCount, jobject obj_pCreateInfos, jobject obj_pAllocator, jobject obj_pPipelines, char* device, char* pipelineCache, char* pCreateInfos, char* pAllocator, char* pPipelines) {

//@line:4100
 
     
     VkPipelineCache* ptr_pipelineCache = (VkPipelineCache*) pipelineCache;
     VkResult res = vkCreateGraphicsPipelines(
                     (VkDevice) (device),
                     (VkPipelineCache) (*ptr_pipelineCache),
                     (uint32_t) createInfoCount,
                     (const VkGraphicsPipelineCreateInfo*) pCreateInfos,
                     (const VkAllocationCallbacks*) pAllocator,
                     (VkPipeline*) pPipelines);
      return (jint) res;

}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkCreateGraphicsPipelines0(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_pipelineCache, jint createInfoCount, jobject obj_pCreateInfos, jobject obj_pAllocator, jobject obj_pPipelines) {
	char* device = (char*)(obj_device?env->GetDirectBufferAddress(obj_device):0);
	char* pipelineCache = (char*)(obj_pipelineCache?env->GetDirectBufferAddress(obj_pipelineCache):0);
	char* pCreateInfos = (char*)(obj_pCreateInfos?env->GetDirectBufferAddress(obj_pCreateInfos):0);
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator):0);
	char* pPipelines = (char*)(obj_pPipelines?env->GetDirectBufferAddress(obj_pPipelines):0);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkCreateGraphicsPipelines0(env, clazz, obj_device, obj_pipelineCache, createInfoCount, obj_pCreateInfos, obj_pAllocator, obj_pPipelines, device, pipelineCache, pCreateInfos, pAllocator, pPipelines);


	return JNI_returnValue;
}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkCreateComputePipelines0
(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_pipelineCache, jint createInfoCount, jobject obj_pCreateInfos, jobject obj_pAllocator, jobject obj_pPipelines, char* device, char* pipelineCache, char* pCreateInfos, char* pAllocator, char* pPipelines) {

//@line:4173
 
     
     VkPipelineCache* ptr_pipelineCache = (VkPipelineCache*) pipelineCache;
     VkResult res = vkCreateComputePipelines(
                     (VkDevice) (device),
                     (VkPipelineCache) (*ptr_pipelineCache),
                     (uint32_t) createInfoCount,
                     (const VkComputePipelineCreateInfo*) pCreateInfos,
                     (const VkAllocationCallbacks*) pAllocator,
                     (VkPipeline*) pPipelines);
      return (jint) res;

}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkCreateComputePipelines0(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_pipelineCache, jint createInfoCount, jobject obj_pCreateInfos, jobject obj_pAllocator, jobject obj_pPipelines) {
	char* device = (char*)(obj_device?env->GetDirectBufferAddress(obj_device):0);
	char* pipelineCache = (char*)(obj_pipelineCache?env->GetDirectBufferAddress(obj_pipelineCache):0);
	char* pCreateInfos = (char*)(obj_pCreateInfos?env->GetDirectBufferAddress(obj_pCreateInfos):0);
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator):0);
	char* pPipelines = (char*)(obj_pPipelines?env->GetDirectBufferAddress(obj_pPipelines):0);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkCreateComputePipelines0(env, clazz, obj_device, obj_pipelineCache, createInfoCount, obj_pCreateInfos, obj_pAllocator, obj_pPipelines, device, pipelineCache, pCreateInfos, pAllocator, pPipelines);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkDestroyPipeline0(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_pipeline, jobject obj_pAllocator) {
	char* device = (char*)(obj_device?env->GetDirectBufferAddress(obj_device):0);
	char* pipeline = (char*)(obj_pipeline?env->GetDirectBufferAddress(obj_pipeline):0);
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator):0);


//@line:4224
 
     
     VkPipeline* ptr_pipeline = (VkPipeline*) pipeline;
     vkDestroyPipeline(
                     (VkDevice) (device),
                     (VkPipeline) (*ptr_pipeline),
                     (const VkAllocationCallbacks*) pAllocator);



}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkCreatePipelineLayout0
(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_pCreateInfo, jobject obj_pAllocator, jobject obj_pPipelineLayout, char* device, char* pCreateInfo, char* pAllocator, char* pPipelineLayout) {

//@line:4282
 
     
     VkResult res = vkCreatePipelineLayout(
                     (VkDevice) (device),
                     (const VkPipelineLayoutCreateInfo*) pCreateInfo,
                     (const VkAllocationCallbacks*) pAllocator,
                     (VkPipelineLayout*) pPipelineLayout);
      return (jint) res;

}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkCreatePipelineLayout0(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_pCreateInfo, jobject obj_pAllocator, jobject obj_pPipelineLayout) {
	char* device = (char*)(obj_device?env->GetDirectBufferAddress(obj_device):0);
	char* pCreateInfo = (char*)(obj_pCreateInfo?env->GetDirectBufferAddress(obj_pCreateInfo):0);
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator):0);
	char* pPipelineLayout = (char*)(obj_pPipelineLayout?env->GetDirectBufferAddress(obj_pPipelineLayout):0);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkCreatePipelineLayout0(env, clazz, obj_device, obj_pCreateInfo, obj_pAllocator, obj_pPipelineLayout, device, pCreateInfo, pAllocator, pPipelineLayout);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkDestroyPipelineLayout0(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_pipelineLayout, jobject obj_pAllocator) {
	char* device = (char*)(obj_device?env->GetDirectBufferAddress(obj_device):0);
	char* pipelineLayout = (char*)(obj_pipelineLayout?env->GetDirectBufferAddress(obj_pipelineLayout):0);
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator):0);


//@line:4330
 
     
     VkPipelineLayout* ptr_pipelineLayout = (VkPipelineLayout*) pipelineLayout;
     vkDestroyPipelineLayout(
                     (VkDevice) (device),
                     (VkPipelineLayout) (*ptr_pipelineLayout),
                     (const VkAllocationCallbacks*) pAllocator);



}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkCreateSampler0
(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_pCreateInfo, jobject obj_pAllocator, jobjectArray pSampler, char* device, char* pCreateInfo, char* pAllocator) {

//@line:4392

              
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

}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkCreateSampler0(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_pCreateInfo, jobject obj_pAllocator, jobjectArray pSampler) {
	char* device = (char*)(obj_device?env->GetDirectBufferAddress(obj_device):0);
	char* pCreateInfo = (char*)(obj_pCreateInfo?env->GetDirectBufferAddress(obj_pCreateInfo):0);
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator):0);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkCreateSampler0(env, clazz, obj_device, obj_pCreateInfo, obj_pAllocator, pSampler, device, pCreateInfo, pAllocator);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkDestroySampler0(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_sampler, jobject obj_pAllocator) {
	char* device = (char*)(obj_device?env->GetDirectBufferAddress(obj_device):0);
	char* sampler = (char*)(obj_sampler?env->GetDirectBufferAddress(obj_sampler):0);
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator):0);


//@line:4449
 
    
     vkDestroySampler(
                     (VkDevice) (device),
                     (VkSampler) (sampler),
                     (const VkAllocationCallbacks*) pAllocator);



}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkCreateDescriptorSetLayout0
(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_pCreateInfo, jobject obj_pAllocator, jobjectArray pSetLayout, char* device, char* pCreateInfo, char* pAllocator) {

//@line:4511
 
             
     VkDescriptorSetLayout* array = new VkDescriptorSetLayout[1];
     VkResult res = vkCreateDescriptorSetLayout(
                     (VkDevice) (device),
                     (const VkDescriptorSetLayoutCreateInfo*) pCreateInfo,
                     (const VkAllocationCallbacks*) pAllocator,
                     (VkDescriptorSetLayout*) array);
      
      if(res>=0){
          VkDescriptorSetLayout obj = array[0];
          jobject buff = (jobject)(env->NewDirectByteBuffer((void*)obj, sizeof(VkDescriptorSetLayout)));
          env->SetObjectArrayElement(pSetLayout ,0, buff);
       }
       if(array) delete[] array;
                     
      return (jint) res;

}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkCreateDescriptorSetLayout0(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_pCreateInfo, jobject obj_pAllocator, jobjectArray pSetLayout) {
	char* device = (char*)(obj_device?env->GetDirectBufferAddress(obj_device):0);
	char* pCreateInfo = (char*)(obj_pCreateInfo?env->GetDirectBufferAddress(obj_pCreateInfo):0);
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator):0);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkCreateDescriptorSetLayout0(env, clazz, obj_device, obj_pCreateInfo, obj_pAllocator, pSetLayout, device, pCreateInfo, pAllocator);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkDestroyDescriptorSetLayout0(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_descriptorSetLayout, jobject obj_pAllocator) {
	char* device = (char*)(obj_device?env->GetDirectBufferAddress(obj_device):0);
	char* descriptorSetLayout = (char*)(obj_descriptorSetLayout?env->GetDirectBufferAddress(obj_descriptorSetLayout):0);
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator):0);


//@line:4568
 
   
     vkDestroyDescriptorSetLayout(
                     (VkDevice) (device),
                     (VkDescriptorSetLayout) (descriptorSetLayout),
                     (const VkAllocationCallbacks*) pAllocator);



}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkCreateDescriptorPool0
(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_pCreateInfo, jobject obj_pAllocator, jobjectArray pDescriptorPool, char* device, char* pCreateInfo, char* pAllocator) {

//@line:4629

              
     VkDescriptorPool* array = new  VkDescriptorPool[1];
     
     VkResult res = vkCreateDescriptorPool(
                     (VkDevice) (device),
                     (const VkDescriptorPoolCreateInfo*) pCreateInfo,
                     (const VkAllocationCallbacks*) pAllocator,
                     (VkDescriptorPool*) array);
                     
      if(res>=0){
          VkDescriptorPool obj = array[0];
          jobject buff = (jobject)(env->NewDirectByteBuffer((void*)obj, sizeof(VkDescriptorPool)));
          env->SetObjectArrayElement(pDescriptorPool ,0, buff);
       }
       if(array) delete[] array;               
      return (jint) res;

}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkCreateDescriptorPool0(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_pCreateInfo, jobject obj_pAllocator, jobjectArray pDescriptorPool) {
	char* device = (char*)(obj_device?env->GetDirectBufferAddress(obj_device):0);
	char* pCreateInfo = (char*)(obj_pCreateInfo?env->GetDirectBufferAddress(obj_pCreateInfo):0);
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator):0);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkCreateDescriptorPool0(env, clazz, obj_device, obj_pCreateInfo, obj_pAllocator, pDescriptorPool, device, pCreateInfo, pAllocator);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkDestroyDescriptorPool0(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_descriptorPool, jobject obj_pAllocator) {
	char* device = (char*)(obj_device?env->GetDirectBufferAddress(obj_device):0);
	char* descriptorPool = (char*)(obj_descriptorPool?env->GetDirectBufferAddress(obj_descriptorPool):0);
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator):0);


//@line:4686
 
     
        vkDestroyDescriptorPool(
                     (VkDevice) (device),
                     (VkDescriptorPool) (descriptorPool),
                     (const VkAllocationCallbacks*) pAllocator);
     


}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkResetDescriptorPool0
(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_descriptorPool, jint flags, char* device, char* descriptorPool) {

//@line:4737
     
     VkResult res = vkResetDescriptorPool(
                     (VkDevice) (device),
                     (VkDescriptorPool) (descriptorPool),
                     (VkDescriptorPoolResetFlags) flags);
      return (jint) res;

}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkResetDescriptorPool0(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_descriptorPool, jint flags) {
	char* device = (char*)(obj_device?env->GetDirectBufferAddress(obj_device):0);
	char* descriptorPool = (char*)(obj_descriptorPool?env->GetDirectBufferAddress(obj_descriptorPool):0);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkResetDescriptorPool0(env, clazz, obj_device, obj_descriptorPool, flags, device, descriptorPool);


	return JNI_returnValue;
}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkAllocateDescriptorSets0
(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_pAllocateInfo, jobject obj_pDescriptorSets, char* device, char* pAllocateInfo, char* pDescriptorSets) {

//@line:4787
 
     
     VkResult res = vkAllocateDescriptorSets(
                     (VkDevice) (device),
                     (const VkDescriptorSetAllocateInfo*) pAllocateInfo,
                     (VkDescriptorSet*) pDescriptorSets);
      return (jint) res;

}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkAllocateDescriptorSets0(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_pAllocateInfo, jobject obj_pDescriptorSets) {
	char* device = (char*)(obj_device?env->GetDirectBufferAddress(obj_device):0);
	char* pAllocateInfo = (char*)(obj_pAllocateInfo?env->GetDirectBufferAddress(obj_pAllocateInfo):0);
	char* pDescriptorSets = (char*)(obj_pDescriptorSets?env->GetDirectBufferAddress(obj_pDescriptorSets):0);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkAllocateDescriptorSets0(env, clazz, obj_device, obj_pAllocateInfo, obj_pDescriptorSets, device, pAllocateInfo, pDescriptorSets);


	return JNI_returnValue;
}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkFreeDescriptorSets0
(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_descriptorPool, jint descriptorSetCount, jobject obj_pDescriptorSets, char* device, char* descriptorPool, char* pDescriptorSets) {

//@line:4844
 
     
     VkDescriptorPool* ptr_descriptorPool = (VkDescriptorPool*) descriptorPool;
     VkResult res = vkFreeDescriptorSets(
                     (VkDevice) (device),
                     (VkDescriptorPool) (*ptr_descriptorPool),
                     (uint32_t) descriptorSetCount,
                     (const VkDescriptorSet*) pDescriptorSets);
      return (jint) res;

}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkFreeDescriptorSets0(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_descriptorPool, jint descriptorSetCount, jobject obj_pDescriptorSets) {
	char* device = (char*)(obj_device?env->GetDirectBufferAddress(obj_device):0);
	char* descriptorPool = (char*)(obj_descriptorPool?env->GetDirectBufferAddress(obj_descriptorPool):0);
	char* pDescriptorSets = (char*)(obj_pDescriptorSets?env->GetDirectBufferAddress(obj_pDescriptorSets):0);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkFreeDescriptorSets0(env, clazz, obj_device, obj_descriptorPool, descriptorSetCount, obj_pDescriptorSets, device, descriptorPool, pDescriptorSets);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkUpdateDescriptorSets0(JNIEnv* env, jclass clazz, jobject obj_device, jint descriptorWriteCount, jobject obj_pDescriptorWrites, jint descriptorCopyCount, jobject obj_pDescriptorCopies) {
	char* device = (char*)(obj_device?env->GetDirectBufferAddress(obj_device):0);
	char* pDescriptorWrites = (char*)(obj_pDescriptorWrites?env->GetDirectBufferAddress(obj_pDescriptorWrites):0);
	char* pDescriptorCopies = (char*)(obj_pDescriptorCopies?env->GetDirectBufferAddress(obj_pDescriptorCopies):0);


//@line:4905
 
     
     vkUpdateDescriptorSets(
                     (VkDevice) (device),
                     (uint32_t) descriptorWriteCount,
                     (const VkWriteDescriptorSet*) pDescriptorWrites,
                     (uint32_t) descriptorCopyCount,
                     (const VkCopyDescriptorSet*) pDescriptorCopies);



}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkCreateFramebuffer0
(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_pCreateInfo, jobject obj_pAllocator, jobjectArray pFramebuffer, char* device, char* pCreateInfo, char* pAllocator) {

//@line:4969
 
     
     VkFramebuffer* array = new VkFramebuffer[1];
     
     VkResult res = vkCreateFramebuffer(
                     (VkDevice) (device),
                     (const VkFramebufferCreateInfo*) pCreateInfo,
                     (const VkAllocationCallbacks*) pAllocator,
                     (VkFramebuffer*) pFramebuffer);
       if(res>=0){
          VkFramebuffer obj = array[0];
          jobject buff = (jobject)(env->NewDirectByteBuffer((void*)obj, sizeof(VkFramebuffer)));
          env->SetObjectArrayElement(pFramebuffer, 0, buff);
       }
       if(array) delete[] array;              
                     
      return (jint) res;

}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkCreateFramebuffer0(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_pCreateInfo, jobject obj_pAllocator, jobjectArray pFramebuffer) {
	char* device = (char*)(obj_device?env->GetDirectBufferAddress(obj_device):0);
	char* pCreateInfo = (char*)(obj_pCreateInfo?env->GetDirectBufferAddress(obj_pCreateInfo):0);
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator):0);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkCreateFramebuffer0(env, clazz, obj_device, obj_pCreateInfo, obj_pAllocator, pFramebuffer, device, pCreateInfo, pAllocator);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkDestroyFramebuffer0(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_framebuffer, jobject obj_pAllocator) {
	char* device = (char*)(obj_device?env->GetDirectBufferAddress(obj_device):0);
	char* framebuffer = (char*)(obj_framebuffer?env->GetDirectBufferAddress(obj_framebuffer):0);
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator):0);


//@line:5026
 
    
     vkDestroyFramebuffer(
                     (VkDevice) (device),
                     (VkFramebuffer) (framebuffer),
                     (const VkAllocationCallbacks*) pAllocator);



}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkCreateRenderPass0
(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_pCreateInfo, jobject obj_pAllocator, jobjectArray retBuff, char* device, char* pCreateInfo, char* pAllocator) {

//@line:5088
 
     
     VkRenderPass* array = new VkRenderPass[1];
     
     VkResult res = vkCreateRenderPass(
                     (VkDevice) (device),
                     (const VkRenderPassCreateInfo*) pCreateInfo,
                     (const VkAllocationCallbacks*) pAllocator,
                     (VkRenderPass*) array);
                     
     if(res>=0){
          VkRenderPass obj = array[0];
          jobject buff = (jobject)(env->NewDirectByteBuffer((void*)obj, sizeof(VkRenderPass)));
          env->SetObjectArrayElement(retBuff,0, buff);
       }
       if(array)
          delete[] array;
                     
      return (jint) res;

}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkCreateRenderPass0(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_pCreateInfo, jobject obj_pAllocator, jobjectArray retBuff) {
	char* device = (char*)(obj_device?env->GetDirectBufferAddress(obj_device):0);
	char* pCreateInfo = (char*)(obj_pCreateInfo?env->GetDirectBufferAddress(obj_pCreateInfo):0);
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator):0);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkCreateRenderPass0(env, clazz, obj_device, obj_pCreateInfo, obj_pAllocator, retBuff, device, pCreateInfo, pAllocator);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkDestroyRenderPass0(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_renderPass, jobject obj_pAllocator) {
	char* device = (char*)(obj_device?env->GetDirectBufferAddress(obj_device):0);
	char* renderPass = (char*)(obj_renderPass?env->GetDirectBufferAddress(obj_renderPass):0);
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator):0);


//@line:5147
 
        
     vkDestroyRenderPass(
                     (VkDevice) (device),
                     (VkRenderPass) (renderPass),
                     (const VkAllocationCallbacks*) pAllocator);



}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkGetRenderAreaGranularity0(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_renderPass, jobject obj_pGranularity) {
	char* device = (char*)(obj_device?env->GetDirectBufferAddress(obj_device):0);
	char* renderPass = (char*)(obj_renderPass?env->GetDirectBufferAddress(obj_renderPass):0);
	char* pGranularity = (char*)(obj_pGranularity?env->GetDirectBufferAddress(obj_pGranularity):0);


//@line:5194
 
     
     VkRenderPass* ptr_renderPass = (VkRenderPass*) renderPass;
     vkGetRenderAreaGranularity(
                     (VkDevice) (device),
                     (VkRenderPass) (*ptr_renderPass),
                     (VkExtent2D*) pGranularity);



}

static inline jobject wrapped_Java_bor_vulkan_Vk10_vkCreateCommandPool0
(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_pCreateInfo, jobject obj_pAllocator, jintArray obj_result, char* device, char* pCreateInfo, char* pAllocator, int* result) {

//@line:5254
 
             
     
     VkCommandPool* pCommandPool = NULL;
     
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

}

JNIEXPORT jobject JNICALL Java_bor_vulkan_Vk10_vkCreateCommandPool0(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_pCreateInfo, jobject obj_pAllocator, jintArray obj_result) {
	char* device = (char*)(obj_device?env->GetDirectBufferAddress(obj_device):0);
	char* pCreateInfo = (char*)(obj_pCreateInfo?env->GetDirectBufferAddress(obj_pCreateInfo):0);
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator):0);
	int* result = (int*)env->GetPrimitiveArrayCritical(obj_result, 0);

	jobject JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkCreateCommandPool0(env, clazz, obj_device, obj_pCreateInfo, obj_pAllocator, obj_result, device, pCreateInfo, pAllocator, result);

	env->ReleasePrimitiveArrayCritical(obj_result, result, 0);

	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkDestroyCommandPool0(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_commandPool, jobject obj_pAllocator) {
	char* device = (char*)(obj_device?env->GetDirectBufferAddress(obj_device):0);
	char* commandPool = (char*)(obj_commandPool?env->GetDirectBufferAddress(obj_commandPool):0);
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator):0);


//@line:5311
 
     
     VkCommandPool* ptr_commandPool = (VkCommandPool*) commandPool;
     vkDestroyCommandPool(
                     (VkDevice) (device),
                     (VkCommandPool) (*ptr_commandPool),
                     (const VkAllocationCallbacks*) pAllocator);



}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkResetCommandPool0
(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_commandPool, jint flags, char* device, char* commandPool) {

//@line:5363
 
     
     VkCommandPool* ptr_commandPool = (VkCommandPool*) commandPool;
     VkResult res = vkResetCommandPool(
                     (VkDevice) (device),
                     (VkCommandPool) (*ptr_commandPool),
                     (VkCommandPoolResetFlags) flags);
      return (jint) res;

}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkResetCommandPool0(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_commandPool, jint flags) {
	char* device = (char*)(obj_device?env->GetDirectBufferAddress(obj_device):0);
	char* commandPool = (char*)(obj_commandPool?env->GetDirectBufferAddress(obj_commandPool):0);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkResetCommandPool0(env, clazz, obj_device, obj_commandPool, flags, device, commandPool);


	return JNI_returnValue;
}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkAllocateCommandBuffers0
(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_pAllocateInfo, jobject obj_pCommandBuffers, char* device, char* pAllocateInfo, char* pCommandBuffers) {

//@line:5415
 
     
     VkResult res = vkAllocateCommandBuffers(
                     (VkDevice) (device),
                     (const VkCommandBufferAllocateInfo*) pAllocateInfo,
                     (VkCommandBuffer*) pCommandBuffers);
      return (jint) res;

}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkAllocateCommandBuffers0(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_pAllocateInfo, jobject obj_pCommandBuffers) {
	char* device = (char*)(obj_device?env->GetDirectBufferAddress(obj_device):0);
	char* pAllocateInfo = (char*)(obj_pAllocateInfo?env->GetDirectBufferAddress(obj_pAllocateInfo):0);
	char* pCommandBuffers = (char*)(obj_pCommandBuffers?env->GetDirectBufferAddress(obj_pCommandBuffers):0);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkAllocateCommandBuffers0(env, clazz, obj_device, obj_pAllocateInfo, obj_pCommandBuffers, device, pAllocateInfo, pCommandBuffers);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkFreeCommandBuffers0(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_commandPool, jint commandBufferCount, jobject obj_pCommandBuffers) {
	char* device = (char*)(obj_device?env->GetDirectBufferAddress(obj_device):0);
	char* commandPool = (char*)(obj_commandPool?env->GetDirectBufferAddress(obj_commandPool):0);
	char* pCommandBuffers = (char*)(obj_pCommandBuffers?env->GetDirectBufferAddress(obj_pCommandBuffers):0);


//@line:5468
 
     
     VkCommandPool* ptr_commandPool = (VkCommandPool*) commandPool;
     vkFreeCommandBuffers(
                     (VkDevice) (device),
                     (VkCommandPool) (*ptr_commandPool),
                     (uint32_t) commandBufferCount,
                     (const VkCommandBuffer*) pCommandBuffers);



}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkBeginCommandBuffer0
(JNIEnv* env, jclass clazz, jobject obj_commandBuffer, jobject obj_pBeginInfo, char* commandBuffer, char* pBeginInfo) {

//@line:5515
 
     VkCommandBuffer* ptr_commandBuffer = (VkCommandBuffer*) commandBuffer;
     VkResult res = vkBeginCommandBuffer(
                     (VkCommandBuffer) (*ptr_commandBuffer),
                     (const VkCommandBufferBeginInfo*) pBeginInfo);
      return (jint) res;

}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkBeginCommandBuffer0(JNIEnv* env, jclass clazz, jobject obj_commandBuffer, jobject obj_pBeginInfo) {
	char* commandBuffer = (char*)(obj_commandBuffer?env->GetDirectBufferAddress(obj_commandBuffer):0);
	char* pBeginInfo = (char*)(obj_pBeginInfo?env->GetDirectBufferAddress(obj_pBeginInfo):0);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkBeginCommandBuffer0(env, clazz, obj_commandBuffer, obj_pBeginInfo, commandBuffer, pBeginInfo);


	return JNI_returnValue;
}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkEndCommandBuffer0
(JNIEnv* env, jclass clazz, jobject obj_commandBuffer, char* commandBuffer) {

//@line:5553
 
     VkCommandBuffer* ptr_commandBuffer = (VkCommandBuffer*) commandBuffer;
     VkResult res = vkEndCommandBuffer(
                     (VkCommandBuffer) (*ptr_commandBuffer));
      return (jint) res;

}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkEndCommandBuffer0(JNIEnv* env, jclass clazz, jobject obj_commandBuffer) {
	char* commandBuffer = (char*)(obj_commandBuffer?env->GetDirectBufferAddress(obj_commandBuffer):0);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkEndCommandBuffer0(env, clazz, obj_commandBuffer, commandBuffer);


	return JNI_returnValue;
}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkResetCommandBuffer0
(JNIEnv* env, jclass clazz, jobject obj_commandBuffer, jint flags, char* commandBuffer) {

//@line:5596
 
     VkCommandBuffer* ptr_commandBuffer = (VkCommandBuffer*) commandBuffer;
     VkResult res = vkResetCommandBuffer(
                     (VkCommandBuffer) (*ptr_commandBuffer),
                     (VkCommandBufferResetFlags) flags);
      return (jint) res;

}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkResetCommandBuffer0(JNIEnv* env, jclass clazz, jobject obj_commandBuffer, jint flags) {
	char* commandBuffer = (char*)(obj_commandBuffer?env->GetDirectBufferAddress(obj_commandBuffer):0);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkResetCommandBuffer0(env, clazz, obj_commandBuffer, flags, commandBuffer);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkCmdBindPipeline0(JNIEnv* env, jclass clazz, jobject obj_commandBuffer, jint pipelineBindPoint, jobject obj_pipeline) {
	char* commandBuffer = (char*)(obj_commandBuffer?env->GetDirectBufferAddress(obj_commandBuffer):0);
	char* pipeline = (char*)(obj_pipeline?env->GetDirectBufferAddress(obj_pipeline):0);


//@line:5642
 
     VkCommandBuffer* ptr_commandBuffer = (VkCommandBuffer*) commandBuffer;
     VkPipeline* ptr_pipeline = (VkPipeline*) pipeline;
     vkCmdBindPipeline(
                     (VkCommandBuffer) (*ptr_commandBuffer),
                     (VkPipelineBindPoint) pipelineBindPoint,
                     (VkPipeline) (*ptr_pipeline));



}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkCmdSetViewport0(JNIEnv* env, jclass clazz, jobject obj_commandBuffer, jint firstViewport, jint viewportCount, jobject obj_pViewports) {
	char* commandBuffer = (char*)(obj_commandBuffer?env->GetDirectBufferAddress(obj_commandBuffer):0);
	char* pViewports = (char*)(obj_pViewports?env->GetDirectBufferAddress(obj_pViewports):0);


//@line:5696
 
     VkCommandBuffer* ptr_commandBuffer = (VkCommandBuffer*) commandBuffer;
     vkCmdSetViewport(
                     (VkCommandBuffer) (*ptr_commandBuffer),
                     (uint32_t) firstViewport,
                     (uint32_t) viewportCount,
                     (const VkViewport*) pViewports);



}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkCmdSetScissor0(JNIEnv* env, jclass clazz, jobject obj_commandBuffer, jint firstScissor, jint scissorCount, jobject obj_pScissors) {
	char* commandBuffer = (char*)(obj_commandBuffer?env->GetDirectBufferAddress(obj_commandBuffer):0);
	char* pScissors = (char*)(obj_pScissors?env->GetDirectBufferAddress(obj_pScissors):0);


//@line:5750
 
     VkCommandBuffer* ptr_commandBuffer = (VkCommandBuffer*) commandBuffer;
     vkCmdSetScissor(
                     (VkCommandBuffer) (*ptr_commandBuffer),
                     (uint32_t) firstScissor,
                     (uint32_t) scissorCount,
                     (const VkRect2D*) pScissors);



}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkCmdSetLineWidth0(JNIEnv* env, jclass clazz, jobject obj_commandBuffer, jfloat lineWidth) {
	char* commandBuffer = (char*)(obj_commandBuffer?env->GetDirectBufferAddress(obj_commandBuffer):0);


//@line:5792
 
     VkCommandBuffer* ptr_commandBuffer = (VkCommandBuffer*) commandBuffer;
     vkCmdSetLineWidth(
                     (VkCommandBuffer) (*ptr_commandBuffer),
                     (float) lineWidth);



}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkCmdSetDepthBias0(JNIEnv* env, jclass clazz, jobject obj_commandBuffer, jfloat depthBiasConstantFactor, jfloat depthBiasClamp, jfloat depthBiasSlopeFactor) {
	char* commandBuffer = (char*)(obj_commandBuffer?env->GetDirectBufferAddress(obj_commandBuffer):0);


//@line:5844
 
     VkCommandBuffer* ptr_commandBuffer = (VkCommandBuffer*) commandBuffer;
     vkCmdSetDepthBias(
                     (VkCommandBuffer) (*ptr_commandBuffer),
                     (float) depthBiasConstantFactor,
                     (float) depthBiasClamp,
                     (float) depthBiasSlopeFactor);



}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkCmdSetBlendConstants0(JNIEnv* env, jclass clazz, jobject obj_commandBuffer, jfloatArray obj_blendConstants) {
	char* commandBuffer = (char*)(obj_commandBuffer?env->GetDirectBufferAddress(obj_commandBuffer):0);
	float* blendConstants = (float*)env->GetPrimitiveArrayCritical(obj_blendConstants, 0);


//@line:5886
 
     VkCommandBuffer* ptr_commandBuffer = (VkCommandBuffer*) commandBuffer;
     vkCmdSetBlendConstants(
                     (VkCommandBuffer) (*ptr_commandBuffer),
                     blendConstants);


	env->ReleasePrimitiveArrayCritical(obj_blendConstants, blendConstants, 0);

}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkCmdSetDepthBounds0(JNIEnv* env, jclass clazz, jobject obj_commandBuffer, jfloat minDepthBounds, jfloat maxDepthBounds) {
	char* commandBuffer = (char*)(obj_commandBuffer?env->GetDirectBufferAddress(obj_commandBuffer):0);


//@line:5932
 
     VkCommandBuffer* ptr_commandBuffer = (VkCommandBuffer*) commandBuffer;
     vkCmdSetDepthBounds(
                     (VkCommandBuffer) (*ptr_commandBuffer),
                     (float) minDepthBounds,
                     (float) maxDepthBounds);



}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkCmdSetStencilCompareMask0(JNIEnv* env, jclass clazz, jobject obj_commandBuffer, jint faceMask, jint compareMask) {
	char* commandBuffer = (char*)(obj_commandBuffer?env->GetDirectBufferAddress(obj_commandBuffer):0);


//@line:5979
 
     VkCommandBuffer* ptr_commandBuffer = (VkCommandBuffer*) commandBuffer;
     vkCmdSetStencilCompareMask(
                     (VkCommandBuffer) (*ptr_commandBuffer),
                     (VkStencilFaceFlags) faceMask,
                     (uint32_t) compareMask);



}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkCmdSetStencilWriteMask0(JNIEnv* env, jclass clazz, jobject obj_commandBuffer, jint faceMask, jint writeMask) {
	char* commandBuffer = (char*)(obj_commandBuffer?env->GetDirectBufferAddress(obj_commandBuffer):0);


//@line:6026
 
     VkCommandBuffer* ptr_commandBuffer = (VkCommandBuffer*) commandBuffer;
     vkCmdSetStencilWriteMask(
                     (VkCommandBuffer) (*ptr_commandBuffer),
                     (VkStencilFaceFlags) faceMask,
                     (uint32_t) writeMask);



}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkCmdSetStencilReference0(JNIEnv* env, jclass clazz, jobject obj_commandBuffer, jint faceMask, jint reference) {
	char* commandBuffer = (char*)(obj_commandBuffer?env->GetDirectBufferAddress(obj_commandBuffer):0);


//@line:6073
 
     VkCommandBuffer* ptr_commandBuffer = (VkCommandBuffer*) commandBuffer;
     vkCmdSetStencilReference(
                     (VkCommandBuffer) (*ptr_commandBuffer),
                     (VkStencilFaceFlags) faceMask,
                     (uint32_t) reference);



}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkCmdBindDescriptorSets0(JNIEnv* env, jclass clazz, jobject obj_commandBuffer, jint pipelineBindPoint, jobject obj_layout, jint firstSet, jint descriptorSetCount, jobject obj_pDescriptorSets, jint dynamicOffsetCount, jintArray obj_pDynamicOffsets) {
	char* commandBuffer = (char*)(obj_commandBuffer?env->GetDirectBufferAddress(obj_commandBuffer):0);
	char* layout = (char*)(obj_layout?env->GetDirectBufferAddress(obj_layout):0);
	char* pDescriptorSets = (char*)(obj_pDescriptorSets?env->GetDirectBufferAddress(obj_pDescriptorSets):0);
	int* pDynamicOffsets = (int*)env->GetPrimitiveArrayCritical(obj_pDynamicOffsets, 0);


//@line:6150
 
     VkCommandBuffer* ptr_commandBuffer = (VkCommandBuffer*) commandBuffer;
     VkPipelineLayout* ptr_layout = (VkPipelineLayout*) layout;
     vkCmdBindDescriptorSets(
                     (VkCommandBuffer) (*ptr_commandBuffer),
                     (VkPipelineBindPoint) pipelineBindPoint,
                     (VkPipelineLayout) (*ptr_layout),
                     (uint32_t) firstSet,
                     (uint32_t) descriptorSetCount,
                     (const VkDescriptorSet*) pDescriptorSets,
                     (uint32_t) dynamicOffsetCount,
                     (const uint32_t*) pDynamicOffsets);


	env->ReleasePrimitiveArrayCritical(obj_pDynamicOffsets, pDynamicOffsets, 0);

}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkCmdBindIndexBuffer0(JNIEnv* env, jclass clazz, jobject obj_commandBuffer, jobject obj_buffer, jlong offset, jint indexType) {
	char* commandBuffer = (char*)(obj_commandBuffer?env->GetDirectBufferAddress(obj_commandBuffer):0);
	char* buffer = (char*)(obj_buffer?env->GetDirectBufferAddress(obj_buffer):0);


//@line:6209
 
     VkCommandBuffer* ptr_commandBuffer = (VkCommandBuffer*) commandBuffer;
     VkBuffer* ptr_buffer = (VkBuffer*) buffer;
     vkCmdBindIndexBuffer(
                     (VkCommandBuffer) (*ptr_commandBuffer),
                     (VkBuffer) (*ptr_buffer),
                     (VkDeviceSize) offset,
                     (VkIndexType) indexType);



}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkCmdBindVertexBuffers0(JNIEnv* env, jclass clazz, jobject obj_commandBuffer, jint firstBinding, jint bindingCount, jobject obj_pBuffers, jlongArray obj_pOffsets) {
	char* commandBuffer = (char*)(obj_commandBuffer?env->GetDirectBufferAddress(obj_commandBuffer):0);
	char* pBuffers = (char*)(obj_pBuffers?env->GetDirectBufferAddress(obj_pBuffers):0);
	long long* pOffsets = (long long*)env->GetPrimitiveArrayCritical(obj_pOffsets, 0);


//@line:6270
 
     VkCommandBuffer* ptr_commandBuffer = (VkCommandBuffer*) commandBuffer;
     vkCmdBindVertexBuffers(
                     (VkCommandBuffer) (*ptr_commandBuffer),
                     (uint32_t) firstBinding,
                     (uint32_t) bindingCount,
                     (const VkBuffer*) pBuffers,
                     (const VkDeviceSize*) pOffsets);


	env->ReleasePrimitiveArrayCritical(obj_pOffsets, pOffsets, 0);

}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkCmdDraw0(JNIEnv* env, jclass clazz, jobject obj_commandBuffer, jint vertexCount, jint instanceCount, jint firstVertex, jint firstInstance) {
	char* commandBuffer = (char*)(obj_commandBuffer?env->GetDirectBufferAddress(obj_commandBuffer):0);


//@line:6331
 
     VkCommandBuffer* ptr_commandBuffer = (VkCommandBuffer*) commandBuffer;
     vkCmdDraw(
                     (VkCommandBuffer) (*ptr_commandBuffer),
                     (uint32_t) vertexCount,
                     (uint32_t) instanceCount,
                     (uint32_t) firstVertex,
                     (uint32_t) firstInstance);



}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkCmdDrawIndexed0(JNIEnv* env, jclass clazz, jobject obj_commandBuffer, jint indexCount, jint instanceCount, jint firstIndex, jint vertexOffset, jint firstInstance) {
	char* commandBuffer = (char*)(obj_commandBuffer?env->GetDirectBufferAddress(obj_commandBuffer):0);


//@line:6398
 
     VkCommandBuffer* ptr_commandBuffer = (VkCommandBuffer*) commandBuffer;
     vkCmdDrawIndexed(
                     (VkCommandBuffer) (*ptr_commandBuffer),
                     (uint32_t) indexCount,
                     (uint32_t) instanceCount,
                     (uint32_t) firstIndex,
                     (int32_t) vertexOffset,
                     (uint32_t) firstInstance);



}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkCmdDrawIndirect0(JNIEnv* env, jclass clazz, jobject obj_commandBuffer, jobject obj_buffer, jlong offset, jint drawCount, jint stride) {
	char* commandBuffer = (char*)(obj_commandBuffer?env->GetDirectBufferAddress(obj_commandBuffer):0);
	char* buffer = (char*)(obj_buffer?env->GetDirectBufferAddress(obj_buffer):0);


//@line:6460
 
     VkCommandBuffer* ptr_commandBuffer = (VkCommandBuffer*) commandBuffer;
     VkBuffer* ptr_buffer = (VkBuffer*) buffer;
     vkCmdDrawIndirect(
                     (VkCommandBuffer) (*ptr_commandBuffer),
                     (VkBuffer) (*ptr_buffer),
                     (VkDeviceSize) offset,
                     (uint32_t) drawCount,
                     (uint32_t) stride);



}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkCmdDrawIndexedIndirect0(JNIEnv* env, jclass clazz, jobject obj_commandBuffer, jobject obj_buffer, jlong offset, jint drawCount, jint stride) {
	char* commandBuffer = (char*)(obj_commandBuffer?env->GetDirectBufferAddress(obj_commandBuffer):0);
	char* buffer = (char*)(obj_buffer?env->GetDirectBufferAddress(obj_buffer):0);


//@line:6522
 
     VkCommandBuffer* ptr_commandBuffer = (VkCommandBuffer*) commandBuffer;
     VkBuffer* ptr_buffer = (VkBuffer*) buffer;
     vkCmdDrawIndexedIndirect(
                     (VkCommandBuffer) (*ptr_commandBuffer),
                     (VkBuffer) (*ptr_buffer),
                     (VkDeviceSize) offset,
                     (uint32_t) drawCount,
                     (uint32_t) stride);



}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkCmdDispatch0(JNIEnv* env, jclass clazz, jobject obj_commandBuffer, jint x, jint y, jint z) {
	char* commandBuffer = (char*)(obj_commandBuffer?env->GetDirectBufferAddress(obj_commandBuffer):0);


//@line:6578
 
     VkCommandBuffer* ptr_commandBuffer = (VkCommandBuffer*) commandBuffer;
     vkCmdDispatch(
                     (VkCommandBuffer) (*ptr_commandBuffer),
                     (uint32_t) x,
                     (uint32_t) y,
                     (uint32_t) z);



}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkCmdDispatchIndirect0(JNIEnv* env, jclass clazz, jobject obj_commandBuffer, jobject obj_buffer, jlong offset) {
	char* commandBuffer = (char*)(obj_commandBuffer?env->GetDirectBufferAddress(obj_commandBuffer):0);
	char* buffer = (char*)(obj_buffer?env->GetDirectBufferAddress(obj_buffer):0);


//@line:6626
 
     VkCommandBuffer* ptr_commandBuffer = (VkCommandBuffer*) commandBuffer;
     VkBuffer* ptr_buffer = (VkBuffer*) buffer;
     vkCmdDispatchIndirect(
                     (VkCommandBuffer) (*ptr_commandBuffer),
                     (VkBuffer) (*ptr_buffer),
                     (VkDeviceSize) offset);



}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkCmdCopyBuffer0(JNIEnv* env, jclass clazz, jobject obj_commandBuffer, jobject obj_srcBuffer, jobject obj_dstBuffer, jint regionCount, jobject obj_pRegions) {
	char* commandBuffer = (char*)(obj_commandBuffer?env->GetDirectBufferAddress(obj_commandBuffer):0);
	char* srcBuffer = (char*)(obj_srcBuffer?env->GetDirectBufferAddress(obj_srcBuffer):0);
	char* dstBuffer = (char*)(obj_dstBuffer?env->GetDirectBufferAddress(obj_dstBuffer):0);
	char* pRegions = (char*)(obj_pRegions?env->GetDirectBufferAddress(obj_pRegions):0);


//@line:6686
 
     VkCommandBuffer* ptr_commandBuffer = (VkCommandBuffer*) commandBuffer;
     VkBuffer* ptr_srcBuffer = (VkBuffer*) srcBuffer;
     VkBuffer* ptr_dstBuffer = (VkBuffer*) dstBuffer;
     vkCmdCopyBuffer(
                     (VkCommandBuffer) (*ptr_commandBuffer),
                     (VkBuffer) (*ptr_srcBuffer),
                     (VkBuffer) (*ptr_dstBuffer),
                     (uint32_t) regionCount,
                     (const VkBufferCopy*) pRegions);



}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkCmdCopyImage0(JNIEnv* env, jclass clazz, jobject obj_commandBuffer, jobject obj_srcImage, jint srcImageLayout, jobject obj_dstImage, jint dstImageLayout, jint regionCount, jobject obj_pRegions) {
	char* commandBuffer = (char*)(obj_commandBuffer?env->GetDirectBufferAddress(obj_commandBuffer):0);
	char* srcImage = (char*)(obj_srcImage?env->GetDirectBufferAddress(obj_srcImage):0);
	char* dstImage = (char*)(obj_dstImage?env->GetDirectBufferAddress(obj_dstImage):0);
	char* pRegions = (char*)(obj_pRegions?env->GetDirectBufferAddress(obj_pRegions):0);


//@line:6761
 
     VkCommandBuffer* ptr_commandBuffer = (VkCommandBuffer*) commandBuffer;
     VkImage* ptr_srcImage = (VkImage*) srcImage;
     VkImage* ptr_dstImage = (VkImage*) dstImage;
     vkCmdCopyImage(
                     (VkCommandBuffer) (*ptr_commandBuffer),
                     (VkImage) (*ptr_srcImage),
                     (VkImageLayout) srcImageLayout,
                     (VkImage) (*ptr_dstImage),
                     (VkImageLayout) dstImageLayout,
                     (uint32_t) regionCount,
                     (const VkImageCopy*) pRegions);



}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkCmdBlitImage0(JNIEnv* env, jclass clazz, jobject obj_commandBuffer, jobject obj_srcImage, jint srcImageLayout, jobject obj_dstImage, jint dstImageLayout, jint regionCount, jobject obj_pRegions, jint filter) {
	char* commandBuffer = (char*)(obj_commandBuffer?env->GetDirectBufferAddress(obj_commandBuffer):0);
	char* srcImage = (char*)(obj_srcImage?env->GetDirectBufferAddress(obj_srcImage):0);
	char* dstImage = (char*)(obj_dstImage?env->GetDirectBufferAddress(obj_dstImage):0);
	char* pRegions = (char*)(obj_pRegions?env->GetDirectBufferAddress(obj_pRegions):0);


//@line:6844
 
     VkCommandBuffer* ptr_commandBuffer = (VkCommandBuffer*) commandBuffer;
     VkImage* ptr_srcImage = (VkImage*) srcImage;
     VkImage* ptr_dstImage = (VkImage*) dstImage;
     vkCmdBlitImage(
                     (VkCommandBuffer) (*ptr_commandBuffer),
                     (VkImage) (*ptr_srcImage),
                     (VkImageLayout) srcImageLayout,
                     (VkImage) (*ptr_dstImage),
                     (VkImageLayout) dstImageLayout,
                     (uint32_t) regionCount,
                     (const VkImageBlit*) pRegions,
                     (VkFilter) filter);



}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkCmdCopyBufferToImage0(JNIEnv* env, jclass clazz, jobject obj_commandBuffer, jobject obj_srcBuffer, jobject obj_dstImage, jint dstImageLayout, jint regionCount, jobject obj_pRegions) {
	char* commandBuffer = (char*)(obj_commandBuffer?env->GetDirectBufferAddress(obj_commandBuffer):0);
	char* srcBuffer = (char*)(obj_srcBuffer?env->GetDirectBufferAddress(obj_srcBuffer):0);
	char* dstImage = (char*)(obj_dstImage?env->GetDirectBufferAddress(obj_dstImage):0);
	char* pRegions = (char*)(obj_pRegions?env->GetDirectBufferAddress(obj_pRegions):0);


//@line:6916
 
     VkCommandBuffer* ptr_commandBuffer = (VkCommandBuffer*) commandBuffer;
     VkBuffer* ptr_srcBuffer = (VkBuffer*) srcBuffer;
     VkImage* ptr_dstImage = (VkImage*) dstImage;
     vkCmdCopyBufferToImage(
                     (VkCommandBuffer) (*ptr_commandBuffer),
                     (VkBuffer) (*ptr_srcBuffer),
                     (VkImage) (*ptr_dstImage),
                     (VkImageLayout) dstImageLayout,
                     (uint32_t) regionCount,
                     (const VkBufferImageCopy*) pRegions);



}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkCmdCopyImageToBuffer0(JNIEnv* env, jclass clazz, jobject obj_commandBuffer, jobject obj_srcImage, jint srcImageLayout, jobject obj_dstBuffer, jint regionCount, jobject obj_pRegions) {
	char* commandBuffer = (char*)(obj_commandBuffer?env->GetDirectBufferAddress(obj_commandBuffer):0);
	char* srcImage = (char*)(obj_srcImage?env->GetDirectBufferAddress(obj_srcImage):0);
	char* dstBuffer = (char*)(obj_dstBuffer?env->GetDirectBufferAddress(obj_dstBuffer):0);
	char* pRegions = (char*)(obj_pRegions?env->GetDirectBufferAddress(obj_pRegions):0);


//@line:6986
 
     VkCommandBuffer* ptr_commandBuffer = (VkCommandBuffer*) commandBuffer;
     VkImage* ptr_srcImage = (VkImage*) srcImage;
     VkBuffer* ptr_dstBuffer = (VkBuffer*) dstBuffer;
     vkCmdCopyImageToBuffer(
                     (VkCommandBuffer) (*ptr_commandBuffer),
                     (VkImage) (*ptr_srcImage),
                     (VkImageLayout) srcImageLayout,
                     (VkBuffer) (*ptr_dstBuffer),
                     (uint32_t) regionCount,
                     (const VkBufferImageCopy*) pRegions);



}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkCmdUpdateBuffer0(JNIEnv* env, jclass clazz, jobject obj_commandBuffer, jobject obj_dstBuffer, jlong dstOffset, jlong dataSize, jintArray obj_pData) {
	char* commandBuffer = (char*)(obj_commandBuffer?env->GetDirectBufferAddress(obj_commandBuffer):0);
	char* dstBuffer = (char*)(obj_dstBuffer?env->GetDirectBufferAddress(obj_dstBuffer):0);
	int* pData = (int*)env->GetPrimitiveArrayCritical(obj_pData, 0);


//@line:7050
 
     VkCommandBuffer* ptr_commandBuffer = (VkCommandBuffer*) commandBuffer;
     VkBuffer* ptr_dstBuffer = (VkBuffer*) dstBuffer;
     vkCmdUpdateBuffer(
                     (VkCommandBuffer) (*ptr_commandBuffer),
                     (VkBuffer) (*ptr_dstBuffer),
                     (VkDeviceSize) dstOffset,
                     (VkDeviceSize) dataSize,
                     (const uint32_t*) pData);


	env->ReleasePrimitiveArrayCritical(obj_pData, pData, 0);

}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkCmdFillBuffer0(JNIEnv* env, jclass clazz, jobject obj_commandBuffer, jobject obj_dstBuffer, jlong dstOffset, jlong size, jint data) {
	char* commandBuffer = (char*)(obj_commandBuffer?env->GetDirectBufferAddress(obj_commandBuffer):0);
	char* dstBuffer = (char*)(obj_dstBuffer?env->GetDirectBufferAddress(obj_dstBuffer):0);


//@line:7112
 
     VkCommandBuffer* ptr_commandBuffer = (VkCommandBuffer*) commandBuffer;
     VkBuffer* ptr_dstBuffer = (VkBuffer*) dstBuffer;
     vkCmdFillBuffer(
                     (VkCommandBuffer) (*ptr_commandBuffer),
                     (VkBuffer) (*ptr_dstBuffer),
                     (VkDeviceSize) dstOffset,
                     (VkDeviceSize) size,
                     (uint32_t) data);



}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkCmdClearColorImage0(JNIEnv* env, jclass clazz, jobject obj_commandBuffer, jobject obj_image, jint imageLayout, jobject obj_pColor, jint rangeCount, jobject obj_pRanges) {
	char* commandBuffer = (char*)(obj_commandBuffer?env->GetDirectBufferAddress(obj_commandBuffer):0);
	char* image = (char*)(obj_image?env->GetDirectBufferAddress(obj_image):0);
	char* pColor = (char*)(obj_pColor?env->GetDirectBufferAddress(obj_pColor):0);
	char* pRanges = (char*)(obj_pRanges?env->GetDirectBufferAddress(obj_pRanges):0);


//@line:7180
 
     VkCommandBuffer* ptr_commandBuffer = (VkCommandBuffer*) commandBuffer;
     VkImage* ptr_image = (VkImage*) image;
     vkCmdClearColorImage(
                     (VkCommandBuffer) (*ptr_commandBuffer),
                     (VkImage) (*ptr_image),
                     (VkImageLayout) imageLayout,
                     (const VkClearColorValue*) pColor,
                     (uint32_t) rangeCount,
                     (const VkImageSubresourceRange*) pRanges);



}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkCmdClearDepthStencilImage0(JNIEnv* env, jclass clazz, jobject obj_commandBuffer, jobject obj_image, jint imageLayout, jobject obj_pDepthStencil, jint rangeCount, jobject obj_pRanges) {
	char* commandBuffer = (char*)(obj_commandBuffer?env->GetDirectBufferAddress(obj_commandBuffer):0);
	char* image = (char*)(obj_image?env->GetDirectBufferAddress(obj_image):0);
	char* pDepthStencil = (char*)(obj_pDepthStencil?env->GetDirectBufferAddress(obj_pDepthStencil):0);
	char* pRanges = (char*)(obj_pRanges?env->GetDirectBufferAddress(obj_pRanges):0);


//@line:7249
 
     VkCommandBuffer* ptr_commandBuffer = (VkCommandBuffer*) commandBuffer;
     VkImage* ptr_image = (VkImage*) image;
     vkCmdClearDepthStencilImage(
                     (VkCommandBuffer) (*ptr_commandBuffer),
                     (VkImage) (*ptr_image),
                     (VkImageLayout) imageLayout,
                     (const VkClearDepthStencilValue*) pDepthStencil,
                     (uint32_t) rangeCount,
                     (const VkImageSubresourceRange*) pRanges);



}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkCmdClearAttachments0(JNIEnv* env, jclass clazz, jobject obj_commandBuffer, jint attachmentCount, jobject obj_pAttachments, jint rectCount, jobject obj_pRects) {
	char* commandBuffer = (char*)(obj_commandBuffer?env->GetDirectBufferAddress(obj_commandBuffer):0);
	char* pAttachments = (char*)(obj_pAttachments?env->GetDirectBufferAddress(obj_pAttachments):0);
	char* pRects = (char*)(obj_pRects?env->GetDirectBufferAddress(obj_pRects):0);


//@line:7312
 
     VkCommandBuffer* ptr_commandBuffer = (VkCommandBuffer*) commandBuffer;
     vkCmdClearAttachments(
                     (VkCommandBuffer) (*ptr_commandBuffer),
                     (uint32_t) attachmentCount,
                     (const VkClearAttachment*) pAttachments,
                     (uint32_t) rectCount,
                     (const VkClearRect*) pRects);



}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkCmdResolveImage0(JNIEnv* env, jclass clazz, jobject obj_commandBuffer, jobject obj_srcImage, jint srcImageLayout, jobject obj_dstImage, jint dstImageLayout, jint regionCount, jobject obj_pRegions) {
	char* commandBuffer = (char*)(obj_commandBuffer?env->GetDirectBufferAddress(obj_commandBuffer):0);
	char* srcImage = (char*)(obj_srcImage?env->GetDirectBufferAddress(obj_srcImage):0);
	char* dstImage = (char*)(obj_dstImage?env->GetDirectBufferAddress(obj_dstImage):0);
	char* pRegions = (char*)(obj_pRegions?env->GetDirectBufferAddress(obj_pRegions):0);


//@line:7385
 
     VkCommandBuffer* ptr_commandBuffer = (VkCommandBuffer*) commandBuffer;
     VkImage* ptr_srcImage = (VkImage*) srcImage;
     VkImage* ptr_dstImage = (VkImage*) dstImage;
     vkCmdResolveImage(
                     (VkCommandBuffer) (*ptr_commandBuffer),
                     (VkImage) (*ptr_srcImage),
                     (VkImageLayout) srcImageLayout,
                     (VkImage) (*ptr_dstImage),
                     (VkImageLayout) dstImageLayout,
                     (uint32_t) regionCount,
                     (const VkImageResolve*) pRegions);



}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkCmdSetEvent0(JNIEnv* env, jclass clazz, jobject obj_commandBuffer, jobject obj_event, jint stageMask) {
	char* commandBuffer = (char*)(obj_commandBuffer?env->GetDirectBufferAddress(obj_commandBuffer):0);
	char* event = (char*)(obj_event?env->GetDirectBufferAddress(obj_event):0);


//@line:7438
 
     VkCommandBuffer* ptr_commandBuffer = (VkCommandBuffer*) commandBuffer;
     VkEvent* ptr_event = (VkEvent*) event;
     vkCmdSetEvent(
                     (VkCommandBuffer) (*ptr_commandBuffer),
                     (VkEvent) (*ptr_event),
                     (VkPipelineStageFlags) stageMask);



}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkCmdResetEvent0(JNIEnv* env, jclass clazz, jobject obj_commandBuffer, jobject obj_event, jint stageMask) {
	char* commandBuffer = (char*)(obj_commandBuffer?env->GetDirectBufferAddress(obj_commandBuffer):0);
	char* event = (char*)(obj_event?env->GetDirectBufferAddress(obj_event):0);


//@line:7486
 
     VkCommandBuffer* ptr_commandBuffer = (VkCommandBuffer*) commandBuffer;
     VkEvent* ptr_event = (VkEvent*) event;
     vkCmdResetEvent(
                     (VkCommandBuffer) (*ptr_commandBuffer),
                     (VkEvent) (*ptr_event),
                     (VkPipelineStageFlags) stageMask);



}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkCmdWaitEvents0(JNIEnv* env, jclass clazz, jobject obj_commandBuffer, jint eventCount, jobject obj_pEvents, jint srcStageMask, jint dstStageMask, jint memoryBarrierCount, jobject obj_pMemoryBarriers, jint bufferMemoryBarrierCount, jobject obj_pBufferMemoryBarriers, jint imageMemoryBarrierCount, jobject obj_pImageMemoryBarriers) {
	char* commandBuffer = (char*)(obj_commandBuffer?env->GetDirectBufferAddress(obj_commandBuffer):0);
	char* pEvents = (char*)(obj_pEvents?env->GetDirectBufferAddress(obj_pEvents):0);
	char* pMemoryBarriers = (char*)(obj_pMemoryBarriers?env->GetDirectBufferAddress(obj_pMemoryBarriers):0);
	char* pBufferMemoryBarriers = (char*)(obj_pBufferMemoryBarriers?env->GetDirectBufferAddress(obj_pBufferMemoryBarriers):0);
	char* pImageMemoryBarriers = (char*)(obj_pImageMemoryBarriers?env->GetDirectBufferAddress(obj_pImageMemoryBarriers):0);


//@line:7582
 
     VkCommandBuffer* ptr_commandBuffer = (VkCommandBuffer*) commandBuffer;
     vkCmdWaitEvents(
                     (VkCommandBuffer) (*ptr_commandBuffer),
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



}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkCmdPipelineBarrier0(JNIEnv* env, jclass clazz, jobject obj_commandBuffer, jint srcStageMask, jint dstStageMask, jint dependencyFlags, jint memoryBarrierCount, jobject obj_pMemoryBarriers, jint bufferMemoryBarrierCount, jobject obj_pBufferMemoryBarriers, jint imageMemoryBarrierCount, jobject obj_pImageMemoryBarriers) {
	char* commandBuffer = (char*)(obj_commandBuffer?env->GetDirectBufferAddress(obj_commandBuffer):0);
	char* pMemoryBarriers = (char*)(obj_pMemoryBarriers?env->GetDirectBufferAddress(obj_pMemoryBarriers):0);
	char* pBufferMemoryBarriers = (char*)(obj_pBufferMemoryBarriers?env->GetDirectBufferAddress(obj_pBufferMemoryBarriers):0);
	char* pImageMemoryBarriers = (char*)(obj_pImageMemoryBarriers?env->GetDirectBufferAddress(obj_pImageMemoryBarriers):0);


//@line:7679
 
     VkCommandBuffer* ptr_commandBuffer = (VkCommandBuffer*) commandBuffer;
     vkCmdPipelineBarrier(
                     (VkCommandBuffer) (*ptr_commandBuffer),
                     (VkPipelineStageFlags) srcStageMask,
                     (VkPipelineStageFlags) dstStageMask,
                     (VkDependencyFlags) dependencyFlags,
                     (uint32_t) memoryBarrierCount,
                     (const VkMemoryBarrier*) pMemoryBarriers,
                     (uint32_t) bufferMemoryBarrierCount,
                     (const VkBufferMemoryBarrier*) pBufferMemoryBarriers,
                     (uint32_t) imageMemoryBarrierCount,
                     (const VkImageMemoryBarrier*) pImageMemoryBarriers);



}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkCmdBeginQuery0(JNIEnv* env, jclass clazz, jobject obj_commandBuffer, jobject obj_queryPool, jint query, jint flags) {
	char* commandBuffer = (char*)(obj_commandBuffer?env->GetDirectBufferAddress(obj_commandBuffer):0);
	char* queryPool = (char*)(obj_queryPool?env->GetDirectBufferAddress(obj_queryPool):0);


//@line:7739
 
     VkCommandBuffer* ptr_commandBuffer = (VkCommandBuffer*) commandBuffer;
     VkQueryPool* ptr_queryPool = (VkQueryPool*) queryPool;
     vkCmdBeginQuery(
                     (VkCommandBuffer) (*ptr_commandBuffer),
                     (VkQueryPool) (*ptr_queryPool),
                     (uint32_t) query,
                     (VkQueryControlFlags) flags);



}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkCmdEndQuery0(JNIEnv* env, jclass clazz, jobject obj_commandBuffer, jobject obj_queryPool, jint query) {
	char* commandBuffer = (char*)(obj_commandBuffer?env->GetDirectBufferAddress(obj_commandBuffer):0);
	char* queryPool = (char*)(obj_queryPool?env->GetDirectBufferAddress(obj_queryPool):0);


//@line:7788
 
     VkCommandBuffer* ptr_commandBuffer = (VkCommandBuffer*) commandBuffer;
     VkQueryPool* ptr_queryPool = (VkQueryPool*) queryPool;
     vkCmdEndQuery(
                     (VkCommandBuffer) (*ptr_commandBuffer),
                     (VkQueryPool) (*ptr_queryPool),
                     (uint32_t) query);



}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkCmdResetQueryPool0(JNIEnv* env, jclass clazz, jobject obj_commandBuffer, jobject obj_queryPool, jint firstQuery, jint queryCount) {
	char* commandBuffer = (char*)(obj_commandBuffer?env->GetDirectBufferAddress(obj_commandBuffer):0);
	char* queryPool = (char*)(obj_queryPool?env->GetDirectBufferAddress(obj_queryPool):0);


//@line:7842
 
     VkCommandBuffer* ptr_commandBuffer = (VkCommandBuffer*) commandBuffer;
     VkQueryPool* ptr_queryPool = (VkQueryPool*) queryPool;
     vkCmdResetQueryPool(
                     (VkCommandBuffer) (*ptr_commandBuffer),
                     (VkQueryPool) (*ptr_queryPool),
                     (uint32_t) firstQuery,
                     (uint32_t) queryCount);



}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkCmdWriteTimestamp0(JNIEnv* env, jclass clazz, jobject obj_commandBuffer, jint pipelineStage, jobject obj_queryPool, jint query) {
	char* commandBuffer = (char*)(obj_commandBuffer?env->GetDirectBufferAddress(obj_commandBuffer):0);
	char* queryPool = (char*)(obj_queryPool?env->GetDirectBufferAddress(obj_queryPool):0);


//@line:7897
 
     VkCommandBuffer* ptr_commandBuffer = (VkCommandBuffer*) commandBuffer;
     VkQueryPool* ptr_queryPool = (VkQueryPool*) queryPool;
     vkCmdWriteTimestamp(
                     (VkCommandBuffer) (*ptr_commandBuffer),
                     (VkPipelineStageFlagBits) pipelineStage,
                     (VkQueryPool) (*ptr_queryPool),
                     (uint32_t) query);



}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkCmdCopyQueryPoolResults0(JNIEnv* env, jclass clazz, jobject obj_commandBuffer, jobject obj_queryPool, jint firstQuery, jint queryCount, jobject obj_dstBuffer, jlong dstOffset, jlong stride, jint flags) {
	char* commandBuffer = (char*)(obj_commandBuffer?env->GetDirectBufferAddress(obj_commandBuffer):0);
	char* queryPool = (char*)(obj_queryPool?env->GetDirectBufferAddress(obj_queryPool):0);
	char* dstBuffer = (char*)(obj_dstBuffer?env->GetDirectBufferAddress(obj_dstBuffer):0);


//@line:7976
 
     VkCommandBuffer* ptr_commandBuffer = (VkCommandBuffer*) commandBuffer;
     VkQueryPool* ptr_queryPool = (VkQueryPool*) queryPool;
     VkBuffer* ptr_dstBuffer = (VkBuffer*) dstBuffer;
     vkCmdCopyQueryPoolResults(
                     (VkCommandBuffer) (*ptr_commandBuffer),
                     (VkQueryPool) (*ptr_queryPool),
                     (uint32_t) firstQuery,
                     (uint32_t) queryCount,
                     (VkBuffer) (*ptr_dstBuffer),
                     (VkDeviceSize) dstOffset,
                     (VkDeviceSize) stride,
                     (VkQueryResultFlags) flags);



}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkCmdPushConstants0(JNIEnv* env, jclass clazz, jobject obj_commandBuffer, jobject obj_layout, jint stageFlags, jint offset, jint size, jobject obj_pValues) {
	char* commandBuffer = (char*)(obj_commandBuffer?env->GetDirectBufferAddress(obj_commandBuffer):0);
	char* layout = (char*)(obj_layout?env->GetDirectBufferAddress(obj_layout):0);
	unsigned char* pValues = (unsigned char*)(obj_pValues?env->GetDirectBufferAddress(obj_pValues):0);


//@line:8048
 
     VkCommandBuffer* ptr_commandBuffer = (VkCommandBuffer*) commandBuffer;
     VkPipelineLayout* ptr_layout = (VkPipelineLayout*) layout;
     vkCmdPushConstants(
                     (VkCommandBuffer) (*ptr_commandBuffer),
                     (VkPipelineLayout) (*ptr_layout),
                     (VkShaderStageFlags) stageFlags,
                     (uint32_t) offset,
                     (uint32_t) size,
                     (const void*) pValues);



}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkCmdBeginRenderPass0(JNIEnv* env, jclass clazz, jobject obj_commandBuffer, jobject obj_pRenderPassBegin, jint contents) {
	char* commandBuffer = (char*)(obj_commandBuffer?env->GetDirectBufferAddress(obj_commandBuffer):0);
	char* pRenderPassBegin = (char*)(obj_pRenderPassBegin?env->GetDirectBufferAddress(obj_pRenderPassBegin):0);


//@line:8099
 
     VkCommandBuffer* ptr_commandBuffer = (VkCommandBuffer*) commandBuffer;
     vkCmdBeginRenderPass(
                     (VkCommandBuffer) (*ptr_commandBuffer),
                     (const VkRenderPassBeginInfo*) pRenderPassBegin,
                     (VkSubpassContents) contents);



}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkCmdNextSubpass0(JNIEnv* env, jclass clazz, jobject obj_commandBuffer, jint contents) {
	char* commandBuffer = (char*)(obj_commandBuffer?env->GetDirectBufferAddress(obj_commandBuffer):0);


//@line:8140
 
     VkCommandBuffer* ptr_commandBuffer = (VkCommandBuffer*) commandBuffer;
     vkCmdNextSubpass(
                     (VkCommandBuffer) (*ptr_commandBuffer),
                     (VkSubpassContents) contents);



}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkCmdEndRenderPass0(JNIEnv* env, jclass clazz, jobject obj_commandBuffer) {
	char* commandBuffer = (char*)(obj_commandBuffer?env->GetDirectBufferAddress(obj_commandBuffer):0);


//@line:8174
 
     VkCommandBuffer* ptr_commandBuffer = (VkCommandBuffer*) commandBuffer;
     vkCmdEndRenderPass(
                     (VkCommandBuffer) (*ptr_commandBuffer));



}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkCmdExecuteCommands0(JNIEnv* env, jclass clazz, jobject obj_commandBuffer, jint commandBufferCount, jobject obj_pCommandBuffers) {
	char* commandBuffer = (char*)(obj_commandBuffer?env->GetDirectBufferAddress(obj_commandBuffer):0);
	char* pCommandBuffers = (char*)(obj_pCommandBuffers?env->GetDirectBufferAddress(obj_pCommandBuffers):0);


//@line:8219
 
     VkCommandBuffer* ptr_commandBuffer = (VkCommandBuffer*) commandBuffer;
     vkCmdExecuteCommands(
                     (VkCommandBuffer) (*ptr_commandBuffer),
                     (uint32_t) commandBufferCount,
                     (const VkCommandBuffer*) pCommandBuffers);



}

static inline jobject wrapped_Java_bor_vulkan_Vk10_vkCreateAndroidSurfaceKHR0
(JNIEnv* env, jclass clazz, jobject obj_instance, jobject obj_pCreateInfo, jobject obj_pAllocator, jintArray obj_result, char* instance, char* pCreateInfo, char* pAllocator, int* result) {

//@line:8250

    #ifdef VK_USE_PLATFORM_ANDROID_KHR                                                        
           VkSurfaceKHR* pSurface = (VkSurfaceKHR*)malloc(sizeof(VkSurfaceKHR));                                                     
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
    
}

JNIEXPORT jobject JNICALL Java_bor_vulkan_Vk10_vkCreateAndroidSurfaceKHR0(JNIEnv* env, jclass clazz, jobject obj_instance, jobject obj_pCreateInfo, jobject obj_pAllocator, jintArray obj_result) {
	char* instance = (char*)(obj_instance?env->GetDirectBufferAddress(obj_instance):0);
	char* pCreateInfo = (char*)(obj_pCreateInfo?env->GetDirectBufferAddress(obj_pCreateInfo):0);
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator):0);
	int* result = (int*)env->GetPrimitiveArrayCritical(obj_result, 0);

	jobject JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkCreateAndroidSurfaceKHR0(env, clazz, obj_instance, obj_pCreateInfo, obj_pAllocator, obj_result, instance, pCreateInfo, pAllocator, result);

	env->ReleasePrimitiveArrayCritical(obj_result, result, 0);

	return JNI_returnValue;
}

static inline jobject wrapped_Java_bor_vulkan_Vk10_vkCreateMirSurfaceKHR0
(JNIEnv* env, jclass clazz, jobject obj_instance, jobject obj_pCreateInfo, jobject obj_pAllocator, jintArray obj_result, char* instance, char* pCreateInfo, char* pAllocator, int* result) {

//@line:8300

           #ifdef VK_USE_PLATFORM_MIR_KHR                                                        
                  VkSurfaceKHR* pSurface = (VkSurfaceKHR*)malloc(sizeof(VkSurfaceKHR));                                                     
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
           
}

JNIEXPORT jobject JNICALL Java_bor_vulkan_Vk10_vkCreateMirSurfaceKHR0(JNIEnv* env, jclass clazz, jobject obj_instance, jobject obj_pCreateInfo, jobject obj_pAllocator, jintArray obj_result) {
	char* instance = (char*)(obj_instance?env->GetDirectBufferAddress(obj_instance):0);
	char* pCreateInfo = (char*)(obj_pCreateInfo?env->GetDirectBufferAddress(obj_pCreateInfo):0);
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator):0);
	int* result = (int*)env->GetPrimitiveArrayCritical(obj_result, 0);

	jobject JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkCreateMirSurfaceKHR0(env, clazz, obj_instance, obj_pCreateInfo, obj_pAllocator, obj_result, instance, pCreateInfo, pAllocator, result);

	env->ReleasePrimitiveArrayCritical(obj_result, result, 0);

	return JNI_returnValue;
}

static inline jobject wrapped_Java_bor_vulkan_Vk10_vkCreateWaylandSurfaceKHR0
(JNIEnv* env, jclass clazz, jobject obj_instance, jobject obj_pCreateInfo, jobject obj_pAllocator, jintArray obj_result, char* instance, char* pCreateInfo, char* pAllocator, int* result) {

//@line:8357

           #ifdef VK_USE_PLATFORM_MIR_KHR                                                        
                  VkSurfaceKHR* pSurface = (VkSurfaceKHR*)malloc(sizeof(VkSurfaceKHR));                                                     
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
           
}

JNIEXPORT jobject JNICALL Java_bor_vulkan_Vk10_vkCreateWaylandSurfaceKHR0(JNIEnv* env, jclass clazz, jobject obj_instance, jobject obj_pCreateInfo, jobject obj_pAllocator, jintArray obj_result) {
	char* instance = (char*)(obj_instance?env->GetDirectBufferAddress(obj_instance):0);
	char* pCreateInfo = (char*)(obj_pCreateInfo?env->GetDirectBufferAddress(obj_pCreateInfo):0);
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator):0);
	int* result = (int*)env->GetPrimitiveArrayCritical(obj_result, 0);

	jobject JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkCreateWaylandSurfaceKHR0(env, clazz, obj_instance, obj_pCreateInfo, obj_pAllocator, obj_result, instance, pCreateInfo, pAllocator, result);

	env->ReleasePrimitiveArrayCritical(obj_result, result, 0);

	return JNI_returnValue;
}

static inline jobject wrapped_Java_bor_vulkan_Vk10_vkCreateWin32SurfaceKHR0
(JNIEnv* env, jclass clazz, jobject obj_instance, jobject obj_pCreateInfo, jobject obj_pAllocator, jintArray obj_result, char* instance, char* pCreateInfo, char* pAllocator, int* result) {

//@line:8414

            // used in Windows OS only                                                      
            #ifdef VK_USE_PLATFORM_WIN32_KHR                                                        
                   VkSurfaceKHR* pSurface = (VkSurfaceKHR*)malloc(sizeof(VkSurfaceKHR));                                                     
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
            
}

JNIEXPORT jobject JNICALL Java_bor_vulkan_Vk10_vkCreateWin32SurfaceKHR0(JNIEnv* env, jclass clazz, jobject obj_instance, jobject obj_pCreateInfo, jobject obj_pAllocator, jintArray obj_result) {
	char* instance = (char*)(obj_instance?env->GetDirectBufferAddress(obj_instance):0);
	char* pCreateInfo = (char*)(obj_pCreateInfo?env->GetDirectBufferAddress(obj_pCreateInfo):0);
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator):0);
	int* result = (int*)env->GetPrimitiveArrayCritical(obj_result, 0);

	jobject JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkCreateWin32SurfaceKHR0(env, clazz, obj_instance, obj_pCreateInfo, obj_pAllocator, obj_result, instance, pCreateInfo, pAllocator, result);

	env->ReleasePrimitiveArrayCritical(obj_result, result, 0);

	return JNI_returnValue;
}

static inline jobject wrapped_Java_bor_vulkan_Vk10_vkCreateXcbSurfaceKHR0
(JNIEnv* env, jclass clazz, jobject obj_instance, jobject obj_pCreateInfo, jobject obj_pAllocator, jintArray obj_result, char* instance, char* pCreateInfo, char* pAllocator, int* result) {

//@line:8471

             #ifdef VK_USE_PLATFORM_XCB_KHR                                                        
                    VkSurfaceKHR* pSurface = (VkSurfaceKHR*)malloc(sizeof(VkSurfaceKHR));                                                     
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
             
}

JNIEXPORT jobject JNICALL Java_bor_vulkan_Vk10_vkCreateXcbSurfaceKHR0(JNIEnv* env, jclass clazz, jobject obj_instance, jobject obj_pCreateInfo, jobject obj_pAllocator, jintArray obj_result) {
	char* instance = (char*)(obj_instance?env->GetDirectBufferAddress(obj_instance):0);
	char* pCreateInfo = (char*)(obj_pCreateInfo?env->GetDirectBufferAddress(obj_pCreateInfo):0);
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator):0);
	int* result = (int*)env->GetPrimitiveArrayCritical(obj_result, 0);

	jobject JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkCreateXcbSurfaceKHR0(env, clazz, obj_instance, obj_pCreateInfo, obj_pAllocator, obj_result, instance, pCreateInfo, pAllocator, result);

	env->ReleasePrimitiveArrayCritical(obj_result, result, 0);

	return JNI_returnValue;
}

static inline jobject wrapped_Java_bor_vulkan_Vk10_vkCreateXlibSurfaceKHR0
(JNIEnv* env, jclass clazz, jobject obj_instance, jobject obj_pCreateInfo, jobject obj_pAllocator, jintArray obj_result, char* instance, char* pCreateInfo, char* pAllocator, int* result) {

//@line:8526

              #ifdef VK_USE_PLATFORM_XCB_KHR                                                        
                     VkSurfaceKHR* pSurface = (VkSurfaceKHR*)malloc(sizeof(VkSurfaceKHR));                                                     
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
              
}

JNIEXPORT jobject JNICALL Java_bor_vulkan_Vk10_vkCreateXlibSurfaceKHR0(JNIEnv* env, jclass clazz, jobject obj_instance, jobject obj_pCreateInfo, jobject obj_pAllocator, jintArray obj_result) {
	char* instance = (char*)(obj_instance?env->GetDirectBufferAddress(obj_instance):0);
	char* pCreateInfo = (char*)(obj_pCreateInfo?env->GetDirectBufferAddress(obj_pCreateInfo):0);
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator):0);
	int* result = (int*)env->GetPrimitiveArrayCritical(obj_result, 0);

	jobject JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkCreateXlibSurfaceKHR0(env, clazz, obj_instance, obj_pCreateInfo, obj_pAllocator, obj_result, instance, pCreateInfo, pAllocator, result);

	env->ReleasePrimitiveArrayCritical(obj_result, result, 0);

	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkDestroySurfaceKHR0(JNIEnv* env, jclass clazz, jobject obj_instance, jobject obj_surface, jobject obj_pAllocator) {
	char* instance = (char*)(obj_instance?env->GetDirectBufferAddress(obj_instance):0);
	char* surface = (char*)(obj_surface?env->GetDirectBufferAddress(obj_surface):0);
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator):0);


//@line:8573

         vkDestroySurfaceKHR((VkInstance)   instance,
                             (VkSurfaceKHR) surface,
                             (VkAllocationCallbacks*)   pAllocator);
                                                     
                                                 
     

}

static inline jobject wrapped_Java_bor_vulkan_Vk10_vkCreateDisplayPlaneSurfaceKHR0
(JNIEnv* env, jclass clazz, jobject obj_instance, jobject obj_pCreateInfo, jobject obj_pAllocator, jintArray obj_result, char* instance, char* pCreateInfo, char* pAllocator, int* result) {

//@line:8607

                        
     if(pfnCreateDisplayPlaneSurfaceKHR == NULL){
       result[0] = (jint) VkResult::VK_ERROR_EXTENSION_NOT_PRESENT;
       return (jobject) NULL;
     }
     
     VkSurfaceKHR* pSurface = (VkSurfaceKHR*)malloc(sizeof(VkSurfaceKHR)); 
                                                                
     VkResult res =  pfnCreateDisplayPlaneSurfaceKHR((VkInstance) instance,
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
                                                                 
    
}

JNIEXPORT jobject JNICALL Java_bor_vulkan_Vk10_vkCreateDisplayPlaneSurfaceKHR0(JNIEnv* env, jclass clazz, jobject obj_instance, jobject obj_pCreateInfo, jobject obj_pAllocator, jintArray obj_result) {
	char* instance = (char*)(obj_instance?env->GetDirectBufferAddress(obj_instance):0);
	char* pCreateInfo = (char*)(obj_pCreateInfo?env->GetDirectBufferAddress(obj_pCreateInfo):0);
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator):0);
	int* result = (int*)env->GetPrimitiveArrayCritical(obj_result, 0);

	jobject JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkCreateDisplayPlaneSurfaceKHR0(env, clazz, obj_instance, obj_pCreateInfo, obj_pAllocator, obj_result, instance, pCreateInfo, pAllocator, result);

	env->ReleasePrimitiveArrayCritical(obj_result, result, 0);

	return JNI_returnValue;
}

