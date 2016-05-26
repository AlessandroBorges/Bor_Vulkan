#include <bor.vulkan.Vk10.h>

//@line:101

     
      
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
      
      using namespace std;
      
      typedef void* PointerToAnything;
      typedef PointerToAnything* PointerToAnythingArray;
      
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
 
  
#define BUFFERARRAY_SET(TYPE, BUFFERS, COUNT, P_VK)\
     TYPE* P_VK = (TYPE*) calloc(COUNT,sizeof(TYPE));\
     for(int i = 0; i < (int) COUNT; i++){\
       jobject obj = (BUFFERS) ? (jobject) env->GetObjectArrayElement(BUFFERS, i) : NULL;\
       if(obj != NULL){\
          TYPE* elem = (TYPE*)(env->GetDirectBufferAddress(obj));\
          P_VK[i] = (*elem);\
       }\
     }\
 
 #define BUFFERARRAY_COMMIT(TYPE, BUFFERS, COUNT, P_VK) \
  for(int i = 0; i < (int) COUNT; i++){\       
           TYPE* obj = (TYPE*)calloc(1, sizeof(TYPE));\
           *obj = P_VK[i];\
           jobject bb_ = (jobject)(env->NewDirectByteBuffer(obj, sizeof(TYPE)));\
           env->SetObjectArrayElement(BUFFERS, i, bb_);\
      }\
  if (P_VK != NULL) free(P_VK);\
 
 // Vk10 header end
  JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_init(JNIEnv* env, jclass clazz) {


//@line:236

       jclass bufferClassLocal = env->FindClass("java/nio/ByteBuffer");
       byteBufferClass = reinterpret_cast<jclass>(env->NewGlobalRef(bufferClassLocal));
       
       init();
       isVulkanAvailable =  (InitVulkan() != 0);
       
    

}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_sizeOfDispatchableHandle(JNIEnv* env, jclass clazz) {


//@line:257

        return(jint) sizeof(VkInstance);
    

}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_sizeOfNonDispatchableHandle(JNIEnv* env, jclass clazz) {


//@line:265

        return(jint) sizeof(VkSemaphore);
    

}

JNIEXPORT jboolean JNICALL Java_bor_vulkan_Vk10_isVulkanAvailable(JNIEnv* env, jclass clazz) {


//@line:269

       return (jboolean) isVulkanAvailable;
    
    

}

static inline jobject wrapped_Java_bor_vulkan_Vk10_vkCreateInstance1
(JNIEnv* env, jclass clazz, jobject obj_pCreateInfo, jobject obj_pAllocator, jintArray obj_result, unsigned char* pCreateInfo, unsigned char* pAllocator, int* result) {

//@line:317

                                               
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
      
}

JNIEXPORT jobject JNICALL Java_bor_vulkan_Vk10_vkCreateInstance1(JNIEnv* env, jclass clazz, jobject obj_pCreateInfo, jobject obj_pAllocator, jintArray obj_result) {
	unsigned char* pCreateInfo = (unsigned char*)(obj_pCreateInfo?env->GetDirectBufferAddress(obj_pCreateInfo) : NULL);
	unsigned char* pAllocator = (unsigned char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator) : NULL);
	int* result = (int*)(obj_result ? env->GetIntArrayElements(obj_result, 0) : NULL);

	jobject JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkCreateInstance1(env, clazz, obj_pCreateInfo, obj_pAllocator, obj_result, pCreateInfo, pAllocator, result);

	if(obj_result != NULL){
		 env->ReleaseIntArrayElements(obj_result, (jint*)result, 0);
	}

	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkDestroyInstance0(JNIEnv* env, jclass clazz, jobject obj_instance, jobject obj_pAllocator) {
	char* instance = (char*)(obj_instance?env->GetDirectBufferAddress(obj_instance) : NULL);
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator) : NULL);


//@line:359
                                                           
       vkDestroyInstance( (VkInstance) (instance),
                          (const VkAllocationCallbacks*)   pAllocator);        
       

}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkEnumeratePhysicalDevices0
(JNIEnv* env, jclass clazz, jobject obj_instance, jintArray obj_pPhysicalDeviceCount, jobjectArray pPhysicalDevicesRet, jint maxSize, char* instance, int* pPhysicalDeviceCount) {

//@line:415
      
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
       
}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkEnumeratePhysicalDevices0(JNIEnv* env, jclass clazz, jobject obj_instance, jintArray obj_pPhysicalDeviceCount, jobjectArray pPhysicalDevicesRet, jint maxSize) {
	char* instance = (char*)(obj_instance?env->GetDirectBufferAddress(obj_instance) : NULL);
	int* pPhysicalDeviceCount = (int*)(obj_pPhysicalDeviceCount ? env->GetIntArrayElements(obj_pPhysicalDeviceCount, 0) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkEnumeratePhysicalDevices0(env, clazz, obj_instance, obj_pPhysicalDeviceCount, pPhysicalDevicesRet, maxSize, instance, pPhysicalDeviceCount);

	if(obj_pPhysicalDeviceCount != NULL){
		 env->ReleaseIntArrayElements(obj_pPhysicalDeviceCount, (jint*)pPhysicalDeviceCount, 0);
	}

	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkGetPhysicalDeviceFeatures0(JNIEnv* env, jclass clazz, jobject obj_pphysicalDevice, jobject obj_pFeatures) {
	char* pphysicalDevice = (char*)(obj_pphysicalDevice?env->GetDirectBufferAddress(obj_pphysicalDevice) : NULL);
	char* pFeatures = (char*)(obj_pFeatures?env->GetDirectBufferAddress(obj_pFeatures) : NULL);


//@line:512
    
    vkGetPhysicalDeviceFeatures(
               (VkPhysicalDevice)  (pphysicalDevice),
               (VkPhysicalDeviceFeatures*)  pFeatures);
       

}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkGetPhysicalDeviceFormatProperties0(JNIEnv* env, jclass clazz, jobject obj_physicalDevice, jint format, jobject obj_pFormatProperties) {
	unsigned char* physicalDevice = (unsigned char*)(obj_physicalDevice?env->GetDirectBufferAddress(obj_physicalDevice) : NULL);
	unsigned char* pFormatProperties = (unsigned char*)(obj_pFormatProperties?env->GetDirectBufferAddress(obj_pFormatProperties) : NULL);


//@line:543
           
     vkGetPhysicalDeviceFormatProperties(
              (VkPhysicalDevice)  physicalDevice,
              (VkFormat)  format,
              (VkFormatProperties*)   pFormatProperties);
    

}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkGetPhysicalDeviceImageFormatProperties0
(JNIEnv* env, jclass clazz, jobject obj_physicalDevice, jint format, jint type, jint tiling, jint usage, jint flags, jobject obj_pImageFormatProperties, unsigned char* physicalDevice, unsigned char* pImageFormatProperties) {

//@line:605

  
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
	unsigned char* physicalDevice = (unsigned char*)(obj_physicalDevice?env->GetDirectBufferAddress(obj_physicalDevice) : NULL);
	unsigned char* pImageFormatProperties = (unsigned char*)(obj_pImageFormatProperties?env->GetDirectBufferAddress(obj_pImageFormatProperties) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkGetPhysicalDeviceImageFormatProperties0(env, clazz, obj_physicalDevice, format, type, tiling, usage, flags, obj_pImageFormatProperties, physicalDevice, pImageFormatProperties);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkGetPhysicalDeviceProperties0(JNIEnv* env, jclass clazz, jobject obj_physicalDevice, jobject obj_pProperties) {
	unsigned char* physicalDevice = (unsigned char*)(obj_physicalDevice?env->GetDirectBufferAddress(obj_physicalDevice) : NULL);
	unsigned char* pProperties = (unsigned char*)(obj_pProperties?env->GetDirectBufferAddress(obj_pProperties) : NULL);


//@line:642
     
       vkGetPhysicalDeviceProperties(
            (VkPhysicalDevice)   (physicalDevice),
            (VkPhysicalDeviceProperties*)  pProperties);               
      

}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkGetPhysicalDeviceQueueFamilyProperties1(JNIEnv* env, jclass clazz, jobject obj_pointer, jintArray obj_pQueueFamilyPropertyCount, jobject obj__array) {
	char* pointer = (char*)(obj_pointer?env->GetDirectBufferAddress(obj_pointer) : NULL);
	char* _array = (char*)(obj__array?env->GetDirectBufferAddress(obj__array) : NULL);
	int* pQueueFamilyPropertyCount = (int*)(obj_pQueueFamilyPropertyCount ? env->GetIntArrayElements(obj_pQueueFamilyPropertyCount, 0) : NULL);


//@line:687

       VkQueueFamilyProperties* array = (VkQueueFamilyProperties*) _array;
       uint32_t count=0;
       vkGetPhysicalDeviceQueueFamilyProperties(
                                  (VkPhysicalDevice) (pointer),
                                  (uint32_t*)  &count,
                                  (VkQueueFamilyProperties*) array);
       pQueueFamilyPropertyCount[0] = count; 
   
	if(obj_pQueueFamilyPropertyCount != NULL){
		 env->ReleaseIntArrayElements(obj_pQueueFamilyPropertyCount, (jint*)pQueueFamilyPropertyCount, 0);
	}

}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkGetPhysicalDeviceMemoryProperties0(JNIEnv* env, jclass clazz, jobject obj_physicalDevice, jobject obj_pMemoryProperties) {
	unsigned char* physicalDevice = (unsigned char*)(obj_physicalDevice?env->GetDirectBufferAddress(obj_physicalDevice) : NULL);
	unsigned char* pMemoryProperties = (unsigned char*)(obj_pMemoryProperties?env->GetDirectBufferAddress(obj_pMemoryProperties) : NULL);


//@line:721

         vkGetPhysicalDeviceMemoryProperties(
             (VkPhysicalDevice)  physicalDevice,
             (VkPhysicalDeviceMemoryProperties*)  pMemoryProperties);     
    

}

static inline jobject wrapped_Java_bor_vulkan_Vk10_vkGetInstanceProcAddr0
(JNIEnv* env, jclass clazz, jobject obj_instance, jstring obj_pName, unsigned char* instance, char* pName) {

//@line:745
               
               PFN_vkVoidFunction func;               
               func  = vkGetInstanceProcAddr(
                            (VkInstance)   instance,
                            (const char*)     pName);                            
              jobject pFunc = env->NewDirectByteBuffer((void*) func, 
                                                      (jlong) sizeof(PFN_vkVoidFunction));                                                       
              return pFunc;                                                                               
       
}

JNIEXPORT jobject JNICALL Java_bor_vulkan_Vk10_vkGetInstanceProcAddr0(JNIEnv* env, jclass clazz, jobject obj_instance, jstring obj_pName) {
	unsigned char* instance = (unsigned char*)(obj_instance?env->GetDirectBufferAddress(obj_instance) : NULL);
	char* pName = (char*)(obj_pName ? env->GetStringUTFChars(obj_pName, 0) : NULL);

	jobject JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkGetInstanceProcAddr0(env, clazz, obj_instance, obj_pName, instance, pName);

	 if(obj_pName != NULL){
		 env->ReleaseStringUTFChars(obj_pName, pName);
	 }

	return JNI_returnValue;
}

static inline jobject wrapped_Java_bor_vulkan_Vk10_vkGetDeviceProcAddr0
(JNIEnv* env, jclass clazz, jobject obj_device, jstring obj_pName, unsigned char* device, char* pName) {

//@line:774
             
       PFN_vkVoidFunction func =  vkGetDeviceProcAddr(
                                     (VkDevice) device,
                                     (const char*) pName);                               
       jobject pFunc = env->NewDirectByteBuffer((void*) func, 
                                                (jlong) sizeof(PFN_vkVoidFunction));                                                       
        return pFunc;
      
}

JNIEXPORT jobject JNICALL Java_bor_vulkan_Vk10_vkGetDeviceProcAddr0(JNIEnv* env, jclass clazz, jobject obj_device, jstring obj_pName) {
	unsigned char* device = (unsigned char*)(obj_device?env->GetDirectBufferAddress(obj_device) : NULL);
	char* pName = (char*)(obj_pName ? env->GetStringUTFChars(obj_pName, 0) : NULL);

	jobject JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkGetDeviceProcAddr0(env, clazz, obj_device, obj_pName, device, pName);

	 if(obj_pName != NULL){
		 env->ReleaseStringUTFChars(obj_pName, pName);
	 }

	return JNI_returnValue;
}

static inline jobject wrapped_Java_bor_vulkan_Vk10_vkCreateDevice0
(JNIEnv* env, jclass clazz, jobject obj_physicalDevice, jobject obj_pCreateInfo, jobject obj_pAllocator, jintArray obj_result, unsigned char* physicalDevice, unsigned char* pCreateInfo, unsigned char* pAllocator, int* result) {

//@line:826

                
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
       
}

JNIEXPORT jobject JNICALL Java_bor_vulkan_Vk10_vkCreateDevice0(JNIEnv* env, jclass clazz, jobject obj_physicalDevice, jobject obj_pCreateInfo, jobject obj_pAllocator, jintArray obj_result) {
	unsigned char* physicalDevice = (unsigned char*)(obj_physicalDevice?env->GetDirectBufferAddress(obj_physicalDevice) : NULL);
	unsigned char* pCreateInfo = (unsigned char*)(obj_pCreateInfo?env->GetDirectBufferAddress(obj_pCreateInfo) : NULL);
	unsigned char* pAllocator = (unsigned char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator) : NULL);
	int* result = (int*)(obj_result ? env->GetIntArrayElements(obj_result, 0) : NULL);

	jobject JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkCreateDevice0(env, clazz, obj_physicalDevice, obj_pCreateInfo, obj_pAllocator, obj_result, physicalDevice, pCreateInfo, pAllocator, result);

	if(obj_result != NULL){
		 env->ReleaseIntArrayElements(obj_result, (jint*)result, 0);
	}

	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkDestroyDevice0(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_pAllocator) {
	char* device = (char*)(obj_device?env->GetDirectBufferAddress(obj_device) : NULL);
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator) : NULL);


//@line:872
             
         vkDestroyDevice( (VkDevice) device,
                          (const VkAllocationCallbacks*)   pAllocator);
      

}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkEnumerateInstanceExtensionProperties0
(JNIEnv* env, jclass clazz, jstring obj_pLayerName, jintArray obj_pPropertyCount, jobject obj_array, char* array, char* pLayerName, int* pPropertyCount) {

//@line:956
     
     uint32_t count = 0;          
     VkResult res = vkEnumerateInstanceExtensionProperties(
                        (const char*)  pLayerName,
                        (uint32_t*)    &count,
                        (VkExtensionProperties*) array);                        
      pPropertyCount[0] = (jint)count;
      return res; 
     
}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkEnumerateInstanceExtensionProperties0(JNIEnv* env, jclass clazz, jstring obj_pLayerName, jintArray obj_pPropertyCount, jobject obj_array) {
	char* array = (char*)(obj_array?env->GetDirectBufferAddress(obj_array) : NULL);
	char* pLayerName = (char*)(obj_pLayerName ? env->GetStringUTFChars(obj_pLayerName, 0) : NULL);
	int* pPropertyCount = (int*)(obj_pPropertyCount ? env->GetIntArrayElements(obj_pPropertyCount, 0) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkEnumerateInstanceExtensionProperties0(env, clazz, obj_pLayerName, obj_pPropertyCount, obj_array, array, pLayerName, pPropertyCount);

	if(obj_pPropertyCount != NULL){
		 env->ReleaseIntArrayElements(obj_pPropertyCount, (jint*)pPropertyCount, 0);
	}
	 if(obj_pLayerName != NULL){
		 env->ReleaseStringUTFChars(obj_pLayerName, pLayerName);
	 }

	return JNI_returnValue;
}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkEnumerateDeviceExtensionProperties0
(JNIEnv* env, jclass clazz, jobject obj_physicalDevice, jstring obj_pLayerName, jintArray obj_pPropertyCount, jobject obj_array, unsigned char* physicalDevice, char* array, char* pLayerName, int* pPropertyCount) {

//@line:1000

     uint32_t count = 0;          
     VkResult res =  vkEnumerateDeviceExtensionProperties(
               (VkPhysicalDevice)  physicalDevice,
               (const char*)    pLayerName,
               (uint32_t*)     &count,
               (VkExtensionProperties*)  array);                   
     pPropertyCount[0] = (jint)count; 
     return (jint)res;     
    
}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkEnumerateDeviceExtensionProperties0(JNIEnv* env, jclass clazz, jobject obj_physicalDevice, jstring obj_pLayerName, jintArray obj_pPropertyCount, jobject obj_array) {
	unsigned char* physicalDevice = (unsigned char*)(obj_physicalDevice?env->GetDirectBufferAddress(obj_physicalDevice) : NULL);
	char* array = (char*)(obj_array?env->GetDirectBufferAddress(obj_array) : NULL);
	char* pLayerName = (char*)(obj_pLayerName ? env->GetStringUTFChars(obj_pLayerName, 0) : NULL);
	int* pPropertyCount = (int*)(obj_pPropertyCount ? env->GetIntArrayElements(obj_pPropertyCount, 0) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkEnumerateDeviceExtensionProperties0(env, clazz, obj_physicalDevice, obj_pLayerName, obj_pPropertyCount, obj_array, physicalDevice, array, pLayerName, pPropertyCount);

	if(obj_pPropertyCount != NULL){
		 env->ReleaseIntArrayElements(obj_pPropertyCount, (jint*)pPropertyCount, 0);
	}
	 if(obj_pLayerName != NULL){
		 env->ReleaseStringUTFChars(obj_pLayerName, pLayerName);
	 }

	return JNI_returnValue;
}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkEnumerateInstanceLayerProperties0
(JNIEnv* env, jclass clazz, jintArray obj_pPropertyCount, jobject obj_array, char* array, int* pPropertyCount) {

//@line:1036
    
      uint32_t count = 0;
      VkResult res =  vkEnumerateInstanceLayerProperties(
                    (uint32_t*) &count,
                    (VkLayerProperties*)  array);  
      pPropertyCount[0] = count;
      return res;
  
}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkEnumerateInstanceLayerProperties0(JNIEnv* env, jclass clazz, jintArray obj_pPropertyCount, jobject obj_array) {
	char* array = (char*)(obj_array?env->GetDirectBufferAddress(obj_array) : NULL);
	int* pPropertyCount = (int*)(obj_pPropertyCount ? env->GetIntArrayElements(obj_pPropertyCount, 0) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkEnumerateInstanceLayerProperties0(env, clazz, obj_pPropertyCount, obj_array, array, pPropertyCount);

	if(obj_pPropertyCount != NULL){
		 env->ReleaseIntArrayElements(obj_pPropertyCount, (jint*)pPropertyCount, 0);
	}

	return JNI_returnValue;
}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkEnumerateDeviceLayerProperties0
(JNIEnv* env, jclass clazz, jobject obj_physicalDevice, jintArray obj_pPropertyCount, jobject obj_array, unsigned char* physicalDevice, char* array, int* pPropertyCount) {

//@line:1085

       uint32_t count=0;               
       VkResult res =   vkEnumerateDeviceLayerProperties(
                                  (VkPhysicalDevice)  physicalDevice,
                                  (uint32_t*)  &count,
                                  (VkLayerProperties*) array);
       pPropertyCount[0] = (jint) count;            
       return (jint)res;
      
}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkEnumerateDeviceLayerProperties0(JNIEnv* env, jclass clazz, jobject obj_physicalDevice, jintArray obj_pPropertyCount, jobject obj_array) {
	unsigned char* physicalDevice = (unsigned char*)(obj_physicalDevice?env->GetDirectBufferAddress(obj_physicalDevice) : NULL);
	char* array = (char*)(obj_array?env->GetDirectBufferAddress(obj_array) : NULL);
	int* pPropertyCount = (int*)(obj_pPropertyCount ? env->GetIntArrayElements(obj_pPropertyCount, 0) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkEnumerateDeviceLayerProperties0(env, clazz, obj_physicalDevice, obj_pPropertyCount, obj_array, physicalDevice, array, pPropertyCount);

	if(obj_pPropertyCount != NULL){
		 env->ReleaseIntArrayElements(obj_pPropertyCount, (jint*)pPropertyCount, 0);
	}

	return JNI_returnValue;
}

static inline jobject wrapped_Java_bor_vulkan_Vk10_vkGetDeviceQueue0
(JNIEnv* env, jclass clazz, jobject obj_device, jint queueFamilyIndex, jint queueIndex, unsigned char* device) {

//@line:1133

               
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
                  
      
}

JNIEXPORT jobject JNICALL Java_bor_vulkan_Vk10_vkGetDeviceQueue0(JNIEnv* env, jclass clazz, jobject obj_device, jint queueFamilyIndex, jint queueIndex) {
	unsigned char* device = (unsigned char*)(obj_device?env->GetDirectBufferAddress(obj_device) : NULL);

	jobject JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkGetDeviceQueue0(env, clazz, obj_device, queueFamilyIndex, queueIndex, device);


	return JNI_returnValue;
}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkQueueSubmit0
(JNIEnv* env, jclass clazz, jobject obj__queue, jint submitCount, jobject obj_pSubmits, jobject obj__fence, char* _queue, char* pSubmits, char* _fence) {

//@line:1188

    
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
	char* _queue = (char*)(obj__queue?env->GetDirectBufferAddress(obj__queue) : NULL);
	char* pSubmits = (char*)(obj_pSubmits?env->GetDirectBufferAddress(obj_pSubmits) : NULL);
	char* _fence = (char*)(obj__fence?env->GetDirectBufferAddress(obj__fence) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkQueueSubmit0(env, clazz, obj__queue, submitCount, obj_pSubmits, obj__fence, _queue, pSubmits, _fence);


	return JNI_returnValue;
}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkQueueWaitIdle0
(JNIEnv* env, jclass clazz, jobject obj_queue, char* queue) {

//@line:1229
 
      
     VkResult res = vkQueueWaitIdle(
                     (VkQueue) queue);
      return (jint) res;

}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkQueueWaitIdle0(JNIEnv* env, jclass clazz, jobject obj_queue) {
	char* queue = (char*)(obj_queue?env->GetDirectBufferAddress(obj_queue) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkQueueWaitIdle0(env, clazz, obj_queue, queue);


	return JNI_returnValue;
}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkDeviceWaitIdle0
(JNIEnv* env, jclass clazz, jobject obj_device, char* device) {

//@line:1266
 
     
     VkResult res = vkDeviceWaitIdle(
                     (VkDevice) (device));
      return (jint) res;

}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkDeviceWaitIdle0(JNIEnv* env, jclass clazz, jobject obj_device) {
	char* device = (char*)(obj_device?env->GetDirectBufferAddress(obj_device) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkDeviceWaitIdle0(env, clazz, obj_device, device);


	return JNI_returnValue;
}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkAllocateMemory0
(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_pAllocateInfo, jobject obj_pAllocator, jobject obj_pMemory, char* device, char* pAllocateInfo, char* pAllocator, char* pMemory) {

//@line:1321
 
     
     VkResult res = vkAllocateMemory(
                     (VkDevice) (device),
                     (const VkMemoryAllocateInfo*) pAllocateInfo,
                     (const VkAllocationCallbacks*) pAllocator,
                     (VkDeviceMemory*) pMemory);
      return (jint) res;

}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkAllocateMemory0(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_pAllocateInfo, jobject obj_pAllocator, jobject obj_pMemory) {
	char* device = (char*)(obj_device?env->GetDirectBufferAddress(obj_device) : NULL);
	char* pAllocateInfo = (char*)(obj_pAllocateInfo?env->GetDirectBufferAddress(obj_pAllocateInfo) : NULL);
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator) : NULL);
	char* pMemory = (char*)(obj_pMemory?env->GetDirectBufferAddress(obj_pMemory) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkAllocateMemory0(env, clazz, obj_device, obj_pAllocateInfo, obj_pAllocator, obj_pMemory, device, pAllocateInfo, pAllocator, pMemory);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkFreeMemory0(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_memory, jobject obj_pAllocator) {
	char* device = (char*)(obj_device?env->GetDirectBufferAddress(obj_device) : NULL);
	char* memory = (char*)(obj_memory?env->GetDirectBufferAddress(obj_memory) : NULL);
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator) : NULL);


//@line:1369
 
     vkFreeMemory(
                     (VkDevice) (device),
                     (VkDeviceMemory) memory,
                     (const VkAllocationCallbacks*) pAllocator);



}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkMapMemory0
(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_memory, jlong offset, jlong size, jint flags, jobjectArray ppData, char* device, char* memory) {

//@line:1437
 
             
     void* pData;
     VkResult res = vkMapMemory(
                     (VkDevice) (device),
                     (VkDeviceMemory) memory,
                     (VkDeviceSize) offset,
                     (VkDeviceSize) size,
                     (VkMemoryMapFlags) flags,
                     (void**) &pData);                     
      
      if(res >= 0){
         jobject buffer = env->NewDirectByteBuffer((void*) pData, (jlong) size); 
         env->SetObjectArrayElement(ppData, 0, buffer);
      }           
      return (jint) res;

}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkMapMemory0(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_memory, jlong offset, jlong size, jint flags, jobjectArray ppData) {
	char* device = (char*)(obj_device?env->GetDirectBufferAddress(obj_device) : NULL);
	char* memory = (char*)(obj_memory?env->GetDirectBufferAddress(obj_memory) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkMapMemory0(env, clazz, obj_device, obj_memory, offset, size, flags, ppData, device, memory);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkUnmapMemory0(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_memory) {
	char* device = (char*)(obj_device?env->GetDirectBufferAddress(obj_device) : NULL);
	char* memory = (char*)(obj_memory?env->GetDirectBufferAddress(obj_memory) : NULL);


//@line:1479

     vkUnmapMemory( (VkDevice) (device),
                    (VkDeviceMemory) memory);


}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkFlushMappedMemoryRanges0
(JNIEnv* env, jclass clazz, jobject obj_device, jint memoryRangeCount, jobjectArray buffers, char* device) {

//@line:1526
 
	
     BUFFERARRAY_SET(VkMappedMemoryRange, buffers, memoryRangeCount, pMemoryRangesArray);
	     
     VkResult res = vkFlushMappedMemoryRanges(
                     (VkDevice) (device),
                     (uint32_t) memoryRangeCount,
                     (const VkMappedMemoryRange*) pMemoryRangesArray);
      return (jint) res;

}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkFlushMappedMemoryRanges0(JNIEnv* env, jclass clazz, jobject obj_device, jint memoryRangeCount, jobjectArray buffers) {
	char* device = (char*)(obj_device?env->GetDirectBufferAddress(obj_device) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkFlushMappedMemoryRanges0(env, clazz, obj_device, memoryRangeCount, buffers, device);


	return JNI_returnValue;
}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkInvalidateMappedMemoryRanges0
(JNIEnv* env, jclass clazz, jobject obj_device, jint memoryRangeCount, jobjectArray buffers, char* device) {

//@line:1581
     
     BUFFERARRAY_SET(VkMappedMemoryRange, buffers, memoryRangeCount, pMemoryRanges);     
     VkResult res = vkInvalidateMappedMemoryRanges(
                     (VkDevice) (device),
                     (uint32_t) memoryRangeCount,
                     (const VkMappedMemoryRange*) pMemoryRanges);
                      
      if(pMemoryRanges != NULL){ 
            free(pMemoryRanges);
             pMemoryRanges = NULL;
      }                                  
      return (jint) res;

}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkInvalidateMappedMemoryRanges0(JNIEnv* env, jclass clazz, jobject obj_device, jint memoryRangeCount, jobjectArray buffers) {
	char* device = (char*)(obj_device?env->GetDirectBufferAddress(obj_device) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkInvalidateMappedMemoryRanges0(env, clazz, obj_device, memoryRangeCount, buffers, device);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkGetDeviceMemoryCommitment0(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_memory, jlongArray obj_pCommittedMemoryInBytes) {
	char* device = (char*)(obj_device?env->GetDirectBufferAddress(obj_device) : NULL);
	char* memory = (char*)(obj_memory?env->GetDirectBufferAddress(obj_memory) : NULL);
	long long* pCommittedMemoryInBytes = (long long*)(obj_pCommittedMemoryInBytes ? env->GetLongArrayElements(obj_pCommittedMemoryInBytes, 0) : NULL);


//@line:1630
 

     vkGetDeviceMemoryCommitment(
                     (VkDevice) (device),
                     (VkDeviceMemory) memory,
                     (VkDeviceSize*) pCommittedMemoryInBytes);


	if(obj_pCommittedMemoryInBytes != NULL){
		 env->ReleaseLongArrayElements(obj_pCommittedMemoryInBytes, (jlong*)pCommittedMemoryInBytes, 0);
	}

}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkBindBufferMemory0
(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_buffer, jobject obj_memory, jlong memoryOffset, char* device, char* buffer, char* memory) {

//@line:1687
 
  
     VkResult res = vkBindBufferMemory(
                     (VkDevice) (device),
                     (VkBuffer) buffer,
                     (VkDeviceMemory) memory,
                     (VkDeviceSize) memoryOffset);
      return (jint) res;

}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkBindBufferMemory0(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_buffer, jobject obj_memory, jlong memoryOffset) {
	char* device = (char*)(obj_device?env->GetDirectBufferAddress(obj_device) : NULL);
	char* buffer = (char*)(obj_buffer?env->GetDirectBufferAddress(obj_buffer) : NULL);
	char* memory = (char*)(obj_memory?env->GetDirectBufferAddress(obj_memory) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkBindBufferMemory0(env, clazz, obj_device, obj_buffer, obj_memory, memoryOffset, device, buffer, memory);


	return JNI_returnValue;
}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkBindImageMemory0
(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_image, jobject obj_memory, jlong memoryOffset, char* device, char* image, char* memory) {

//@line:1745
 
     

     VkResult res = vkBindImageMemory(
                     (VkDevice) (device),
                     (VkImage) image,
                     (VkDeviceMemory) memory,
                     (VkDeviceSize) memoryOffset);
      return (jint) res;

}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkBindImageMemory0(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_image, jobject obj_memory, jlong memoryOffset) {
	char* device = (char*)(obj_device?env->GetDirectBufferAddress(obj_device) : NULL);
	char* image = (char*)(obj_image?env->GetDirectBufferAddress(obj_image) : NULL);
	char* memory = (char*)(obj_memory?env->GetDirectBufferAddress(obj_memory) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkBindImageMemory0(env, clazz, obj_device, obj_image, obj_memory, memoryOffset, device, image, memory);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkGetBufferMemoryRequirements0(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_buffer, jobject obj_pMemoryRequirements) {
	char* device = (char*)(obj_device?env->GetDirectBufferAddress(obj_device) : NULL);
	char* buffer = (char*)(obj_buffer?env->GetDirectBufferAddress(obj_buffer) : NULL);
	char* pMemoryRequirements = (char*)(obj_pMemoryRequirements?env->GetDirectBufferAddress(obj_pMemoryRequirements) : NULL);


//@line:1794
 

     vkGetBufferMemoryRequirements(
                     (VkDevice) (device),
                     (VkBuffer) buffer,
                     (VkMemoryRequirements*) pMemoryRequirements);



}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkGetImageMemoryRequirements0(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_image, jobject obj_pMemoryRequirements) {
	char* device = (char*)(obj_device?env->GetDirectBufferAddress(obj_device) : NULL);
	char* image = (char*)(obj_image?env->GetDirectBufferAddress(obj_image) : NULL);
	char* pMemoryRequirements = (char*)(obj_pMemoryRequirements?env->GetDirectBufferAddress(obj_pMemoryRequirements) : NULL);


//@line:1841
 

     vkGetImageMemoryRequirements(
                     (VkDevice) (device),
                     (VkImage) image,
                     (VkMemoryRequirements*) pMemoryRequirements);



}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkGetImageSparseMemoryRequirements0(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_image, jintArray obj_pSparseMemoryRequirementCount, jobject obj_pSparseMemoryRequirements) {
	char* device = (char*)(obj_device?env->GetDirectBufferAddress(obj_device) : NULL);
	char* image = (char*)(obj_image?env->GetDirectBufferAddress(obj_image) : NULL);
	char* pSparseMemoryRequirements = (char*)(obj_pSparseMemoryRequirements?env->GetDirectBufferAddress(obj_pSparseMemoryRequirements) : NULL);
	int* pSparseMemoryRequirementCount = (int*)(obj_pSparseMemoryRequirementCount ? env->GetIntArrayElements(obj_pSparseMemoryRequirementCount, 0) : NULL);


//@line:1900
 
     vkGetImageSparseMemoryRequirements(
                     (VkDevice) (device),
                     (VkImage) image,
                     (uint32_t*) pSparseMemoryRequirementCount,
                     (VkSparseImageMemoryRequirements*) pSparseMemoryRequirements);


	if(obj_pSparseMemoryRequirementCount != NULL){
		 env->ReleaseIntArrayElements(obj_pSparseMemoryRequirementCount, (jint*)pSparseMemoryRequirementCount, 0);
	}

}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkGetPhysicalDeviceSparseImageFormatProperties0(JNIEnv* env, jclass clazz, jobject obj_physicalDevice, jint format, jint type, jint samples, jint usage, jint tiling, jintArray obj_pPropertyCount, jobject obj_bigBuffer) {
	char* physicalDevice = (char*)(obj_physicalDevice?env->GetDirectBufferAddress(obj_physicalDevice) : NULL);
	char* bigBuffer = (char*)(obj_bigBuffer?env->GetDirectBufferAddress(obj_bigBuffer) : NULL);
	int* pPropertyCount = (int*)(obj_pPropertyCount ? env->GetIntArrayElements(obj_pPropertyCount, 0) : NULL);


//@line:1979

     vkGetPhysicalDeviceSparseImageFormatProperties(
                     (VkPhysicalDevice) physicalDevice,
                     (VkFormat) format,
                     (VkImageType) type,
                     (VkSampleCountFlagBits) samples,
                     (VkImageUsageFlags) usage,
                     (VkImageTiling) tiling,
                     (uint32_t*) pPropertyCount,
                     (VkSparseImageFormatProperties*) bigBuffer);

	if(obj_pPropertyCount != NULL){
		 env->ReleaseIntArrayElements(obj_pPropertyCount, (jint*)pPropertyCount, 0);
	}

}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkQueueBindSparse0
(JNIEnv* env, jclass clazz, jobject obj_queue, jint bindInfoCount, jobject obj_pBindInfo, jobject obj_fence, char* queue, char* pBindInfo, char* fence) {

//@line:2039
 
 
     VkResult res = vkQueueBindSparse(
                     (VkQueue) queue,
                     (uint32_t) bindInfoCount,
                     (const VkBindSparseInfo*) pBindInfo,
                     (VkFence) fence);
      return (jint) res;

}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkQueueBindSparse0(JNIEnv* env, jclass clazz, jobject obj_queue, jint bindInfoCount, jobject obj_pBindInfo, jobject obj_fence) {
	char* queue = (char*)(obj_queue?env->GetDirectBufferAddress(obj_queue) : NULL);
	char* pBindInfo = (char*)(obj_pBindInfo?env->GetDirectBufferAddress(obj_pBindInfo) : NULL);
	char* fence = (char*)(obj_fence?env->GetDirectBufferAddress(obj_fence) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkQueueBindSparse0(env, clazz, obj_queue, bindInfoCount, obj_pBindInfo, obj_fence, queue, pBindInfo, fence);


	return JNI_returnValue;
}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkCreateFence0
(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_pCreateInfo, jobject obj_pAllocator, jobject obj_pFence, char* device, char* pCreateInfo, char* pAllocator, char* pFence) {

//@line:2097
 
     
     VkResult res = vkCreateFence(
                     (VkDevice) (device),
                     (const VkFenceCreateInfo*) pCreateInfo,
                     (const VkAllocationCallbacks*) pAllocator,
                     (VkFence*) pFence);
      return (jint) res;

}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkCreateFence0(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_pCreateInfo, jobject obj_pAllocator, jobject obj_pFence) {
	char* device = (char*)(obj_device?env->GetDirectBufferAddress(obj_device) : NULL);
	char* pCreateInfo = (char*)(obj_pCreateInfo?env->GetDirectBufferAddress(obj_pCreateInfo) : NULL);
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator) : NULL);
	char* pFence = (char*)(obj_pFence?env->GetDirectBufferAddress(obj_pFence) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkCreateFence0(env, clazz, obj_device, obj_pCreateInfo, obj_pAllocator, obj_pFence, device, pCreateInfo, pAllocator, pFence);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkDestroyFence0(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_fence, jobject obj_pAllocator) {
	char* device = (char*)(obj_device?env->GetDirectBufferAddress(obj_device) : NULL);
	char* fence = (char*)(obj_fence?env->GetDirectBufferAddress(obj_fence) : NULL);
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator) : NULL);


//@line:2145
 

     vkDestroyFence(
                     (VkDevice) (device),
                     (VkFence) fence,
                     (const VkAllocationCallbacks*) pAllocator);



}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkResetFences0
(JNIEnv* env, jclass clazz, jobject obj_device, jint fenceCount, jobjectArray buffers, char* device) {

//@line:2199
 
             
     BUFFERARRAY_SET(VkFence, buffers, fenceCount, pFences);
     VkResult res = vkResetFences(
                     (VkDevice) (device),
                     (uint32_t) fenceCount,
                     (const VkFence*) pFences);
      if( pFences != NULL){
          free(pFences);
      }                
      return (jint) res;

}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkResetFences0(JNIEnv* env, jclass clazz, jobject obj_device, jint fenceCount, jobjectArray buffers) {
	char* device = (char*)(obj_device?env->GetDirectBufferAddress(obj_device) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkResetFences0(env, clazz, obj_device, fenceCount, buffers, device);


	return JNI_returnValue;
}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkGetFenceStatus0
(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_fence, char* device, char* fence) {

//@line:2248
 

     VkResult res = vkGetFenceStatus(
                     (VkDevice) (device),
                     (VkFence) fence);
      return (jint) res;

}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkGetFenceStatus0(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_fence) {
	char* device = (char*)(obj_device?env->GetDirectBufferAddress(obj_device) : NULL);
	char* fence = (char*)(obj_fence?env->GetDirectBufferAddress(obj_fence) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkGetFenceStatus0(env, clazz, obj_device, obj_fence, device, fence);


	return JNI_returnValue;
}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkWaitForFences0
(JNIEnv* env, jclass clazz, jobject obj_device, jint fenceCount, jobjectArray buffers, jboolean waitAll, jlong timeout, char* device) {

//@line:2312
 
     
     BUFFERARRAY_SET(VkFence, buffers, fenceCount, pFences);
     
     VkResult res = vkWaitForFences(
                     (VkDevice) (device),
                     (uint32_t) fenceCount,
                     (const VkFence*) pFences,
                     (VkBool32) waitAll,
                     (uint64_t) timeout);
      if(pFences != NULL){
         free(pFences);
       }
      return (jint) res;

}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkWaitForFences0(JNIEnv* env, jclass clazz, jobject obj_device, jint fenceCount, jobjectArray buffers, jboolean waitAll, jlong timeout) {
	char* device = (char*)(obj_device?env->GetDirectBufferAddress(obj_device) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkWaitForFences0(env, clazz, obj_device, fenceCount, buffers, waitAll, timeout, device);


	return JNI_returnValue;
}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkCreateSemaphore0
(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_pCreateInfo, jobject obj_pAllocator, jobject obj_pSemaphore, char* device, char* pCreateInfo, char* pAllocator, char* pSemaphore) {

//@line:2376
 
     
     VkResult res = vkCreateSemaphore(
                     (VkDevice) (device),
                     (const VkSemaphoreCreateInfo*) pCreateInfo,
                     (const VkAllocationCallbacks*) pAllocator,
                     (VkSemaphore*) pSemaphore);
      return (jint) res;

}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkCreateSemaphore0(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_pCreateInfo, jobject obj_pAllocator, jobject obj_pSemaphore) {
	char* device = (char*)(obj_device?env->GetDirectBufferAddress(obj_device) : NULL);
	char* pCreateInfo = (char*)(obj_pCreateInfo?env->GetDirectBufferAddress(obj_pCreateInfo) : NULL);
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator) : NULL);
	char* pSemaphore = (char*)(obj_pSemaphore?env->GetDirectBufferAddress(obj_pSemaphore) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkCreateSemaphore0(env, clazz, obj_device, obj_pCreateInfo, obj_pAllocator, obj_pSemaphore, device, pCreateInfo, pAllocator, pSemaphore);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkDestroySemaphore0(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_semaphore, jobject obj_pAllocator) {
	char* device = (char*)(obj_device?env->GetDirectBufferAddress(obj_device) : NULL);
	char* semaphore = (char*)(obj_semaphore?env->GetDirectBufferAddress(obj_semaphore) : NULL);
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator) : NULL);


//@line:2424
 

     vkDestroySemaphore(
                     (VkDevice) (device),
                     (VkSemaphore) semaphore,
                     (const VkAllocationCallbacks*) pAllocator);



}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkCreateEvent0
(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_pCreateInfo, jobject obj_pAllocator, jobject obj_pEvent, char* device, char* pCreateInfo, char* pAllocator, char* pEvent) {

//@line:2481
 
     
     VkResult res = vkCreateEvent(
                     (VkDevice) (device),
                     (const VkEventCreateInfo*) pCreateInfo,
                     (const VkAllocationCallbacks*) pAllocator,
                     (VkEvent*) pEvent);
      return (jint) res;

}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkCreateEvent0(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_pCreateInfo, jobject obj_pAllocator, jobject obj_pEvent) {
	char* device = (char*)(obj_device?env->GetDirectBufferAddress(obj_device) : NULL);
	char* pCreateInfo = (char*)(obj_pCreateInfo?env->GetDirectBufferAddress(obj_pCreateInfo) : NULL);
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator) : NULL);
	char* pEvent = (char*)(obj_pEvent?env->GetDirectBufferAddress(obj_pEvent) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkCreateEvent0(env, clazz, obj_device, obj_pCreateInfo, obj_pAllocator, obj_pEvent, device, pCreateInfo, pAllocator, pEvent);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkDestroyEvent0(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_event, jobject obj_pAllocator) {
	char* device = (char*)(obj_device?env->GetDirectBufferAddress(obj_device) : NULL);
	char* event = (char*)(obj_event?env->GetDirectBufferAddress(obj_event) : NULL);
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator) : NULL);


//@line:2529
 

     vkDestroyEvent(
                     (VkDevice) (device),
                     (VkEvent) event ,
                     (const VkAllocationCallbacks*) pAllocator);



}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkGetEventStatus0
(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_event, char* device, char* event) {

//@line:2574
 
     
     
     VkResult res = vkGetEventStatus(
                     (VkDevice) (device),
                     (VkEvent) event );
      return (jint) res;

}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkGetEventStatus0(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_event) {
	char* device = (char*)(obj_device?env->GetDirectBufferAddress(obj_device) : NULL);
	char* event = (char*)(obj_event?env->GetDirectBufferAddress(obj_event) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkGetEventStatus0(env, clazz, obj_device, obj_event, device, event);


	return JNI_returnValue;
}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkSetEvent0
(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_event, char* device, char* event) {

//@line:2619
 

     VkResult res = vkSetEvent(
                     (VkDevice) (device),
                     (VkEvent) event);
      return (jint) res;

}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkSetEvent0(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_event) {
	char* device = (char*)(obj_device?env->GetDirectBufferAddress(obj_device) : NULL);
	char* event = (char*)(obj_event?env->GetDirectBufferAddress(obj_event) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkSetEvent0(env, clazz, obj_device, obj_event, device, event);


	return JNI_returnValue;
}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkResetEvent0
(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_event, char* device, char* event) {

//@line:2663
 

     VkResult res = vkResetEvent(
                     (VkDevice) (device),
                     (VkEvent) event);
      return (jint) res;

}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkResetEvent0(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_event) {
	char* device = (char*)(obj_device?env->GetDirectBufferAddress(obj_device) : NULL);
	char* event = (char*)(obj_event?env->GetDirectBufferAddress(obj_event) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkResetEvent0(env, clazz, obj_device, obj_event, device, event);


	return JNI_returnValue;
}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkCreateQueryPool0
(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_pCreateInfo, jobject obj_pAllocator, jobjectArray retBuff, char* device, char* pCreateInfo, char* pAllocator) {

//@line:2725
 
     
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
	char* device = (char*)(obj_device?env->GetDirectBufferAddress(obj_device) : NULL);
	char* pCreateInfo = (char*)(obj_pCreateInfo?env->GetDirectBufferAddress(obj_pCreateInfo) : NULL);
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkCreateQueryPool0(env, clazz, obj_device, obj_pCreateInfo, obj_pAllocator, retBuff, device, pCreateInfo, pAllocator);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkDestroyQueryPool0(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_queryPool, jobject obj_pAllocator) {
	char* device = (char*)(obj_device?env->GetDirectBufferAddress(obj_device) : NULL);
	char* queryPool = (char*)(obj_queryPool?env->GetDirectBufferAddress(obj_queryPool) : NULL);
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator) : NULL);


//@line:2783
 
     
     vkDestroyQueryPool(
                     (VkDevice) (device),
                     (VkQueryPool) (queryPool),
                     (const VkAllocationCallbacks*) pAllocator);



}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkGetQueryPoolResults0
(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_queryPool, jint firstQuery, jint queryCount, jlong dataSize, jobject obj_pData, jlong stride, jint flags, char* device, char* queryPool, unsigned char* pData) {

//@line:2886
 

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
	char* device = (char*)(obj_device?env->GetDirectBufferAddress(obj_device) : NULL);
	char* queryPool = (char*)(obj_queryPool?env->GetDirectBufferAddress(obj_queryPool) : NULL);
	unsigned char* pData = (unsigned char*)(obj_pData?env->GetDirectBufferAddress(obj_pData) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkGetQueryPoolResults0(env, clazz, obj_device, obj_queryPool, firstQuery, queryCount, dataSize, obj_pData, stride, flags, device, queryPool, pData);


	return JNI_returnValue;
}

static inline jobject wrapped_Java_bor_vulkan_Vk10_vkCreateBuffer0
(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_pCreateInfo, jobject obj_pAllocator, jintArray obj_result, char* device, char* pCreateInfo, char* pAllocator, int* result) {

//@line:2951
        
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
	char* device = (char*)(obj_device?env->GetDirectBufferAddress(obj_device) : NULL);
	char* pCreateInfo = (char*)(obj_pCreateInfo?env->GetDirectBufferAddress(obj_pCreateInfo) : NULL);
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator) : NULL);
	int* result = (int*)(obj_result ? env->GetIntArrayElements(obj_result, 0) : NULL);

	jobject JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkCreateBuffer0(env, clazz, obj_device, obj_pCreateInfo, obj_pAllocator, obj_result, device, pCreateInfo, pAllocator, result);

	if(obj_result != NULL){
		 env->ReleaseIntArrayElements(obj_result, (jint*)result, 0);
	}

	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkDestroyBuffer0(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_buffer, jobject obj_pAllocator) {
	char* device = (char*)(obj_device?env->GetDirectBufferAddress(obj_device) : NULL);
	char* buffer = (char*)(obj_buffer?env->GetDirectBufferAddress(obj_buffer) : NULL);
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator) : NULL);


//@line:3006

     vkDestroyBuffer((VkDevice) (device),
                     (VkBuffer) (buffer),
                     (const VkAllocationCallbacks*) pAllocator);



}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkCreateBufferView0
(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_pCreateInfo, jobject obj_pAllocator, jobjectArray retView, char* device, char* pCreateInfo, char* pAllocator) {

//@line:3058
         
     VkBufferView* pView = new VkBufferView[1] ;     
     VkResult res = vkCreateBufferView(
                     (VkDevice) (device),
                     (const VkBufferViewCreateInfo*) pCreateInfo,
                     (const VkAllocationCallbacks*) pAllocator,
                     (VkBufferView*) pView);
                     
      if(res>= 0){
         VkBufferView obj = pView[0];
         jobject buffer = env->NewDirectByteBuffer((void *)obj, sizeof(VkBufferView));        
         env->SetObjectArrayElement(retView, 0, buffer);
       }
       if(pView)
          delete[] pView;                      
      return (jint) res;

}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkCreateBufferView0(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_pCreateInfo, jobject obj_pAllocator, jobjectArray retView) {
	char* device = (char*)(obj_device?env->GetDirectBufferAddress(obj_device) : NULL);
	char* pCreateInfo = (char*)(obj_pCreateInfo?env->GetDirectBufferAddress(obj_pCreateInfo) : NULL);
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkCreateBufferView0(env, clazz, obj_device, obj_pCreateInfo, obj_pAllocator, retView, device, pCreateInfo, pAllocator);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkDestroyBufferView0(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_bufferView, jobject obj_pAllocator) {
	char* device = (char*)(obj_device?env->GetDirectBufferAddress(obj_device) : NULL);
	char* bufferView = (char*)(obj_bufferView?env->GetDirectBufferAddress(obj_bufferView) : NULL);
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator) : NULL);


//@line:3110

     vkDestroyBufferView( (VkDevice) (device),
                          (VkBufferView) bufferView,
                          (const VkAllocationCallbacks*) pAllocator);


}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkCreateImage0
(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_pCreateInfo, jobject obj_pAllocator, jobjectArray pImage, char* device, char* pCreateInfo, char* pAllocator) {

//@line:3165
      
     VkImage* array = new VkImage[1];     
     VkResult res = vkCreateImage(
                     (VkDevice) (device),
                     (const VkImageCreateInfo*) pCreateInfo,
                     (const VkAllocationCallbacks*) pAllocator,
                     (VkImage*) array);                     
       if(res >= 0){
          VkImage image = array[0];
          jobject buffer = env->NewDirectByteBuffer((void*)image, sizeof(VkImage));
          env->SetObjectArrayElement(pImage, 0 , buffer);
       }                     
       if(array)
         delete[] array;         
      return (jint) res;

}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkCreateImage0(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_pCreateInfo, jobject obj_pAllocator, jobjectArray pImage) {
	char* device = (char*)(obj_device?env->GetDirectBufferAddress(obj_device) : NULL);
	char* pCreateInfo = (char*)(obj_pCreateInfo?env->GetDirectBufferAddress(obj_pCreateInfo) : NULL);
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkCreateImage0(env, clazz, obj_device, obj_pCreateInfo, obj_pAllocator, pImage, device, pCreateInfo, pAllocator);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkDestroyImage0(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_image, jobject obj_pAllocator) {
	char* device = (char*)(obj_device?env->GetDirectBufferAddress(obj_device) : NULL);
	char* image = (char*)(obj_image?env->GetDirectBufferAddress(obj_image) : NULL);
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator) : NULL);


//@line:3216
 
     vkDestroyImage( (VkDevice) (device),
                     (VkImage) image,
                     (const VkAllocationCallbacks*) pAllocator);


}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkGetImageSubresourceLayout0(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_image, jobject obj_pSubresource, jobject obj_pLayout) {
	char* device = (char*)(obj_device?env->GetDirectBufferAddress(obj_device) : NULL);
	char* image = (char*)(obj_image?env->GetDirectBufferAddress(obj_image) : NULL);
	char* pSubresource = (char*)(obj_pSubresource?env->GetDirectBufferAddress(obj_pSubresource) : NULL);
	char* pLayout = (char*)(obj_pLayout?env->GetDirectBufferAddress(obj_pLayout) : NULL);


//@line:3262
 
     vkGetImageSubresourceLayout( (VkDevice) (device),
                          (VkImage) image,
                          (const VkImageSubresource*) pSubresource,
                          (VkSubresourceLayout*) pLayout);


}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkCreateImageView0
(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_pCreateInfo, jobject obj_pAllocator, jobject obj_pView, char* device, char* pCreateInfo, char* pAllocator, char* pView) {

//@line:3317
 
     
     VkResult res = vkCreateImageView(
                     (VkDevice) (device),
                     (const VkImageViewCreateInfo*) pCreateInfo,
                     (const VkAllocationCallbacks*) pAllocator,
                     (VkImageView*) pView);
      return (jint) res;

}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkCreateImageView0(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_pCreateInfo, jobject obj_pAllocator, jobject obj_pView) {
	char* device = (char*)(obj_device?env->GetDirectBufferAddress(obj_device) : NULL);
	char* pCreateInfo = (char*)(obj_pCreateInfo?env->GetDirectBufferAddress(obj_pCreateInfo) : NULL);
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator) : NULL);
	char* pView = (char*)(obj_pView?env->GetDirectBufferAddress(obj_pView) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkCreateImageView0(env, clazz, obj_device, obj_pCreateInfo, obj_pAllocator, obj_pView, device, pCreateInfo, pAllocator, pView);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkDestroyImageView0(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_imageView, jobject obj_pAllocator) {
	char* device = (char*)(obj_device?env->GetDirectBufferAddress(obj_device) : NULL);
	char* imageView = (char*)(obj_imageView?env->GetDirectBufferAddress(obj_imageView) : NULL);
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator) : NULL);


//@line:3365
 
    
     vkDestroyImageView(
                     (VkDevice) (device),
                     (VkImageView) (imageView),
                     (const VkAllocationCallbacks*) pAllocator);



}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkCreateShaderModule0
(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_pCreateInfo, jobject obj_pAllocator, jobject obj_pShaderModule, char* device, char* pCreateInfo, char* pAllocator, char* pShaderModule) {

//@line:3422
 
     
     VkResult res = vkCreateShaderModule(
                     (VkDevice) (device),
                     (const VkShaderModuleCreateInfo*) pCreateInfo,
                     (const VkAllocationCallbacks*) pAllocator,
                     (VkShaderModule*) pShaderModule);
      return (jint) res;

}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkCreateShaderModule0(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_pCreateInfo, jobject obj_pAllocator, jobject obj_pShaderModule) {
	char* device = (char*)(obj_device?env->GetDirectBufferAddress(obj_device) : NULL);
	char* pCreateInfo = (char*)(obj_pCreateInfo?env->GetDirectBufferAddress(obj_pCreateInfo) : NULL);
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator) : NULL);
	char* pShaderModule = (char*)(obj_pShaderModule?env->GetDirectBufferAddress(obj_pShaderModule) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkCreateShaderModule0(env, clazz, obj_device, obj_pCreateInfo, obj_pAllocator, obj_pShaderModule, device, pCreateInfo, pAllocator, pShaderModule);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkDestroyShaderModule0(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_shaderModule, jobject obj_pAllocator) {
	char* device = (char*)(obj_device?env->GetDirectBufferAddress(obj_device) : NULL);
	char* shaderModule = (char*)(obj_shaderModule?env->GetDirectBufferAddress(obj_shaderModule) : NULL);
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator) : NULL);


//@line:3470
 
   
     vkDestroyShaderModule(
                     (VkDevice) (device),
                     (VkShaderModule) (shaderModule),
                     (const VkAllocationCallbacks*) pAllocator);



}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkCreatePipelineCache0
(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_pCreateInfo, jobject obj_pAllocator, jobject obj_pPipelineCache, char* device, char* pCreateInfo, char* pAllocator, char* pPipelineCache) {

//@line:3527
 
     
     VkResult res = vkCreatePipelineCache(
                     (VkDevice) (device),
                     (const VkPipelineCacheCreateInfo*) pCreateInfo,
                     (const VkAllocationCallbacks*) pAllocator,
                     (VkPipelineCache*) pPipelineCache);
      return (jint) res;

}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkCreatePipelineCache0(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_pCreateInfo, jobject obj_pAllocator, jobject obj_pPipelineCache) {
	char* device = (char*)(obj_device?env->GetDirectBufferAddress(obj_device) : NULL);
	char* pCreateInfo = (char*)(obj_pCreateInfo?env->GetDirectBufferAddress(obj_pCreateInfo) : NULL);
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator) : NULL);
	char* pPipelineCache = (char*)(obj_pPipelineCache?env->GetDirectBufferAddress(obj_pPipelineCache) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkCreatePipelineCache0(env, clazz, obj_device, obj_pCreateInfo, obj_pAllocator, obj_pPipelineCache, device, pCreateInfo, pAllocator, pPipelineCache);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkDestroyPipelineCache0(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_pipelineCache, jobject obj_pAllocator) {
	char* device = (char*)(obj_device?env->GetDirectBufferAddress(obj_device) : NULL);
	char* pipelineCache = (char*)(obj_pipelineCache?env->GetDirectBufferAddress(obj_pipelineCache) : NULL);
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator) : NULL);


//@line:3575
 
     
     
     vkDestroyPipelineCache(
                     (VkDevice) (device),
                     (VkPipelineCache) pipelineCache,
                     (const VkAllocationCallbacks*) pAllocator);



}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkGetPipelineCacheData0
(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_pipelineCache, jlongArray obj_pDataSize, jobject obj_pData, char* device, char* pipelineCache, unsigned char* pData, long long* pDataSize) {

//@line:3633
 
     
     
     VkResult res = vkGetPipelineCacheData(
                     (VkDevice) (device),
                     (VkPipelineCache) pipelineCache,
                     (size_t*) pDataSize,
                     (void*) pData);
      return (jint) res;

}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkGetPipelineCacheData0(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_pipelineCache, jlongArray obj_pDataSize, jobject obj_pData) {
	char* device = (char*)(obj_device?env->GetDirectBufferAddress(obj_device) : NULL);
	char* pipelineCache = (char*)(obj_pipelineCache?env->GetDirectBufferAddress(obj_pipelineCache) : NULL);
	unsigned char* pData = (unsigned char*)(obj_pData?env->GetDirectBufferAddress(obj_pData) : NULL);
	long long* pDataSize = (long long*)(obj_pDataSize ? env->GetLongArrayElements(obj_pDataSize, 0) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkGetPipelineCacheData0(env, clazz, obj_device, obj_pipelineCache, obj_pDataSize, obj_pData, device, pipelineCache, pData, pDataSize);

	if(obj_pDataSize != NULL){
		 env->ReleaseLongArrayElements(obj_pDataSize, (jlong*)pDataSize, 0);
	}

	return JNI_returnValue;
}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkMergePipelineCaches0
(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_dstCache, jint srcCacheCount, jobject obj_pSrcCaches, char* device, char* dstCache, char* pSrcCaches) {

//@line:3692
 

     VkResult res = vkMergePipelineCaches(
                     (VkDevice) (device),
                     (VkPipelineCache) (dstCache),
                     (uint32_t) srcCacheCount,
                     (const VkPipelineCache*) pSrcCaches);
      return (jint) res;

}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkMergePipelineCaches0(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_dstCache, jint srcCacheCount, jobject obj_pSrcCaches) {
	char* device = (char*)(obj_device?env->GetDirectBufferAddress(obj_device) : NULL);
	char* dstCache = (char*)(obj_dstCache?env->GetDirectBufferAddress(obj_dstCache) : NULL);
	char* pSrcCaches = (char*)(obj_pSrcCaches?env->GetDirectBufferAddress(obj_pSrcCaches) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkMergePipelineCaches0(env, clazz, obj_device, obj_dstCache, srcCacheCount, obj_pSrcCaches, device, dstCache, pSrcCaches);


	return JNI_returnValue;
}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkCreateGraphicsPipelines0
(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_pipelineCache, jint createInfoCount, jobject obj_pCreateInfos, jobject obj_pAllocator, jobject obj_pPipelines, char* device, char* pipelineCache, char* pCreateInfos, char* pAllocator, char* pPipelines) {

//@line:3762
 
     
     
     VkResult res = vkCreateGraphicsPipelines(
                     (VkDevice) (device),
                     (VkPipelineCache) pipelineCache,
                     (uint32_t) createInfoCount,
                     (const VkGraphicsPipelineCreateInfo*) pCreateInfos,
                     (const VkAllocationCallbacks*) pAllocator,
                     (VkPipeline*) pPipelines);
      return (jint) res;

}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkCreateGraphicsPipelines0(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_pipelineCache, jint createInfoCount, jobject obj_pCreateInfos, jobject obj_pAllocator, jobject obj_pPipelines) {
	char* device = (char*)(obj_device?env->GetDirectBufferAddress(obj_device) : NULL);
	char* pipelineCache = (char*)(obj_pipelineCache?env->GetDirectBufferAddress(obj_pipelineCache) : NULL);
	char* pCreateInfos = (char*)(obj_pCreateInfos?env->GetDirectBufferAddress(obj_pCreateInfos) : NULL);
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator) : NULL);
	char* pPipelines = (char*)(obj_pPipelines?env->GetDirectBufferAddress(obj_pPipelines) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkCreateGraphicsPipelines0(env, clazz, obj_device, obj_pipelineCache, createInfoCount, obj_pCreateInfos, obj_pAllocator, obj_pPipelines, device, pipelineCache, pCreateInfos, pAllocator, pPipelines);


	return JNI_returnValue;
}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkCreateComputePipelines0
(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_pipelineCache, jint createInfoCount, jobject obj_pCreateInfos, jobject obj_pAllocator, jobject obj_pPipelines, char* device, char* pipelineCache, char* pCreateInfos, char* pAllocator, char* pPipelines) {

//@line:3835
 
     
     
     VkResult res = vkCreateComputePipelines(
                     (VkDevice) (device),
                     (VkPipelineCache) pipelineCache,
                     (uint32_t) createInfoCount,
                     (const VkComputePipelineCreateInfo*) pCreateInfos,
                     (const VkAllocationCallbacks*) pAllocator,
                     (VkPipeline*) pPipelines);
      return (jint) res;

}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkCreateComputePipelines0(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_pipelineCache, jint createInfoCount, jobject obj_pCreateInfos, jobject obj_pAllocator, jobject obj_pPipelines) {
	char* device = (char*)(obj_device?env->GetDirectBufferAddress(obj_device) : NULL);
	char* pipelineCache = (char*)(obj_pipelineCache?env->GetDirectBufferAddress(obj_pipelineCache) : NULL);
	char* pCreateInfos = (char*)(obj_pCreateInfos?env->GetDirectBufferAddress(obj_pCreateInfos) : NULL);
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator) : NULL);
	char* pPipelines = (char*)(obj_pPipelines?env->GetDirectBufferAddress(obj_pPipelines) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkCreateComputePipelines0(env, clazz, obj_device, obj_pipelineCache, createInfoCount, obj_pCreateInfos, obj_pAllocator, obj_pPipelines, device, pipelineCache, pCreateInfos, pAllocator, pPipelines);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkDestroyPipeline0(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_pipeline, jobject obj_pAllocator) {
	char* device = (char*)(obj_device?env->GetDirectBufferAddress(obj_device) : NULL);
	char* pipeline = (char*)(obj_pipeline?env->GetDirectBufferAddress(obj_pipeline) : NULL);
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator) : NULL);


//@line:3886
 
    
     vkDestroyPipeline(
                     (VkDevice) (device),
                     (VkPipeline) (pipeline),
                     (const VkAllocationCallbacks*) pAllocator);



}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkCreatePipelineLayout0
(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_pCreateInfo, jobject obj_pAllocator, jobject obj_pPipelineLayout, char* device, char* pCreateInfo, char* pAllocator, char* pPipelineLayout) {

//@line:3943
 
     
     VkResult res = vkCreatePipelineLayout(
                     (VkDevice) (device),
                     (const VkPipelineLayoutCreateInfo*) pCreateInfo,
                     (const VkAllocationCallbacks*) pAllocator,
                     (VkPipelineLayout*) pPipelineLayout);
      return (jint) res;

}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkCreatePipelineLayout0(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_pCreateInfo, jobject obj_pAllocator, jobject obj_pPipelineLayout) {
	char* device = (char*)(obj_device?env->GetDirectBufferAddress(obj_device) : NULL);
	char* pCreateInfo = (char*)(obj_pCreateInfo?env->GetDirectBufferAddress(obj_pCreateInfo) : NULL);
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator) : NULL);
	char* pPipelineLayout = (char*)(obj_pPipelineLayout?env->GetDirectBufferAddress(obj_pPipelineLayout) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkCreatePipelineLayout0(env, clazz, obj_device, obj_pCreateInfo, obj_pAllocator, obj_pPipelineLayout, device, pCreateInfo, pAllocator, pPipelineLayout);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkDestroyPipelineLayout0(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_pipelineLayout, jobject obj_pAllocator) {
	char* device = (char*)(obj_device?env->GetDirectBufferAddress(obj_device) : NULL);
	char* pipelineLayout = (char*)(obj_pipelineLayout?env->GetDirectBufferAddress(obj_pipelineLayout) : NULL);
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator) : NULL);


//@line:3991
 
   
     vkDestroyPipelineLayout(
                     (VkDevice) (device),
                     (VkPipelineLayout) (pipelineLayout),
                     (const VkAllocationCallbacks*) pAllocator);



}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkCreateSampler0
(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_pCreateInfo, jobject obj_pAllocator, jobjectArray pSampler, char* device, char* pCreateInfo, char* pAllocator) {

//@line:4052

              
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
	char* device = (char*)(obj_device?env->GetDirectBufferAddress(obj_device) : NULL);
	char* pCreateInfo = (char*)(obj_pCreateInfo?env->GetDirectBufferAddress(obj_pCreateInfo) : NULL);
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkCreateSampler0(env, clazz, obj_device, obj_pCreateInfo, obj_pAllocator, pSampler, device, pCreateInfo, pAllocator);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkDestroySampler0(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_sampler, jobject obj_pAllocator) {
	char* device = (char*)(obj_device?env->GetDirectBufferAddress(obj_device) : NULL);
	char* sampler = (char*)(obj_sampler?env->GetDirectBufferAddress(obj_sampler) : NULL);
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator) : NULL);


//@line:4109
 
     vkDestroySampler(
                     (VkDevice) (device),
                     (VkSampler) (sampler),
                     (const VkAllocationCallbacks*) pAllocator);


}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkCreateDescriptorSetLayout0
(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_pCreateInfo, jobject obj_pAllocator, jobjectArray pSetLayout, char* device, char* pCreateInfo, char* pAllocator) {

//@line:4166
 
             
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

}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkCreateDescriptorSetLayout0(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_pCreateInfo, jobject obj_pAllocator, jobjectArray pSetLayout) {
	char* device = (char*)(obj_device?env->GetDirectBufferAddress(obj_device) : NULL);
	char* pCreateInfo = (char*)(obj_pCreateInfo?env->GetDirectBufferAddress(obj_pCreateInfo) : NULL);
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkCreateDescriptorSetLayout0(env, clazz, obj_device, obj_pCreateInfo, obj_pAllocator, pSetLayout, device, pCreateInfo, pAllocator);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkDestroyDescriptorSetLayout0(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_descriptorSetLayout, jobject obj_pAllocator) {
	char* device = (char*)(obj_device?env->GetDirectBufferAddress(obj_device) : NULL);
	char* descriptorSetLayout = (char*)(obj_descriptorSetLayout?env->GetDirectBufferAddress(obj_descriptorSetLayout) : NULL);
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator) : NULL);


//@line:4220
 
     vkDestroyDescriptorSetLayout(
                     (VkDevice) (device),
                     (VkDescriptorSetLayout) (descriptorSetLayout),
                     (const VkAllocationCallbacks*) pAllocator);


}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkCreateDescriptorPool0
(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_pCreateInfo, jobject obj_pAllocator, jobjectArray pDescriptorPool, char* device, char* pCreateInfo, char* pAllocator) {

//@line:4276

             
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

}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkCreateDescriptorPool0(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_pCreateInfo, jobject obj_pAllocator, jobjectArray pDescriptorPool) {
	char* device = (char*)(obj_device?env->GetDirectBufferAddress(obj_device) : NULL);
	char* pCreateInfo = (char*)(obj_pCreateInfo?env->GetDirectBufferAddress(obj_pCreateInfo) : NULL);
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkCreateDescriptorPool0(env, clazz, obj_device, obj_pCreateInfo, obj_pAllocator, pDescriptorPool, device, pCreateInfo, pAllocator);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkDestroyDescriptorPool0(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_descriptorPool, jobject obj_pAllocator) {
	char* device = (char*)(obj_device?env->GetDirectBufferAddress(obj_device) : NULL);
	char* descriptorPool = (char*)(obj_descriptorPool?env->GetDirectBufferAddress(obj_descriptorPool) : NULL);
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator) : NULL);


//@line:4328
 
        vkDestroyDescriptorPool(
                     (VkDevice) (device),
                     (VkDescriptorPool) (descriptorPool),
                     (const VkAllocationCallbacks*) pAllocator);
     


}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkResetDescriptorPool0
(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_descriptorPool, jint flags, char* device, char* descriptorPool) {

//@line:4376
     
     VkResult res = vkResetDescriptorPool(
                     (VkDevice) (device),
                     (VkDescriptorPool) (descriptorPool),
                     (VkDescriptorPoolResetFlags) flags);
      return (jint) res;

}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkResetDescriptorPool0(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_descriptorPool, jint flags) {
	char* device = (char*)(obj_device?env->GetDirectBufferAddress(obj_device) : NULL);
	char* descriptorPool = (char*)(obj_descriptorPool?env->GetDirectBufferAddress(obj_descriptorPool) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkResetDescriptorPool0(env, clazz, obj_device, obj_descriptorPool, flags, device, descriptorPool);


	return JNI_returnValue;
}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkAllocateDescriptorSets0
(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_pAllocateInfo0, jobjectArray pDescriptorSetsBuff, char* device, char* pAllocateInfo0) {

//@line:4432
 
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

}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkAllocateDescriptorSets0(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_pAllocateInfo0, jobjectArray pDescriptorSetsBuff) {
	char* device = (char*)(obj_device?env->GetDirectBufferAddress(obj_device) : NULL);
	char* pAllocateInfo0 = (char*)(obj_pAllocateInfo0?env->GetDirectBufferAddress(obj_pAllocateInfo0) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkAllocateDescriptorSets0(env, clazz, obj_device, obj_pAllocateInfo0, pDescriptorSetsBuff, device, pAllocateInfo0);


	return JNI_returnValue;
}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkFreeDescriptorSets0
(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_descriptorPool, jint descriptorSetCount, jobject obj_pDescriptorSets, char* device, char* descriptorPool, char* pDescriptorSets) {

//@line:4496
 
     VkResult res = vkFreeDescriptorSets(
                     (VkDevice) (device),
                     (VkDescriptorPool) (descriptorPool),
                     (uint32_t) descriptorSetCount,
                     (const VkDescriptorSet*) pDescriptorSets);
      return (jint) res;

}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkFreeDescriptorSets0(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_descriptorPool, jint descriptorSetCount, jobject obj_pDescriptorSets) {
	char* device = (char*)(obj_device?env->GetDirectBufferAddress(obj_device) : NULL);
	char* descriptorPool = (char*)(obj_descriptorPool?env->GetDirectBufferAddress(obj_descriptorPool) : NULL);
	char* pDescriptorSets = (char*)(obj_pDescriptorSets?env->GetDirectBufferAddress(obj_pDescriptorSets) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkFreeDescriptorSets0(env, clazz, obj_device, obj_descriptorPool, descriptorSetCount, obj_pDescriptorSets, device, descriptorPool, pDescriptorSets);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkUpdateDescriptorSets0(JNIEnv* env, jclass clazz, jobject obj_device, jint descriptorWriteCount, jobject obj_pDescriptorWrites, jint descriptorCopyCount, jobject obj_pDescriptorCopies) {
	char* device = (char*)(obj_device?env->GetDirectBufferAddress(obj_device) : NULL);
	char* pDescriptorWrites = (char*)(obj_pDescriptorWrites?env->GetDirectBufferAddress(obj_pDescriptorWrites) : NULL);
	char* pDescriptorCopies = (char*)(obj_pDescriptorCopies?env->GetDirectBufferAddress(obj_pDescriptorCopies) : NULL);


//@line:4554
 
     vkUpdateDescriptorSets(
                     (VkDevice) (device),
                     (uint32_t) descriptorWriteCount,
                     (const VkWriteDescriptorSet*) pDescriptorWrites,
                     (uint32_t) descriptorCopyCount,
                     (const VkCopyDescriptorSet*) pDescriptorCopies);


}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkCreateFramebuffer0
(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_pCreateInfo, jobject obj_pAllocator, jobjectArray pFramebuffer, char* device, char* pCreateInfo, char* pAllocator) {

//@line:4611
 
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

}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkCreateFramebuffer0(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_pCreateInfo, jobject obj_pAllocator, jobjectArray pFramebuffer) {
	char* device = (char*)(obj_device?env->GetDirectBufferAddress(obj_device) : NULL);
	char* pCreateInfo = (char*)(obj_pCreateInfo?env->GetDirectBufferAddress(obj_pCreateInfo) : NULL);
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkCreateFramebuffer0(env, clazz, obj_device, obj_pCreateInfo, obj_pAllocator, pFramebuffer, device, pCreateInfo, pAllocator);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkDestroyFramebuffer0(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_framebuffer, jobject obj_pAllocator) {
	char* device = (char*)(obj_device?env->GetDirectBufferAddress(obj_device) : NULL);
	char* framebuffer = (char*)(obj_framebuffer?env->GetDirectBufferAddress(obj_framebuffer) : NULL);
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator) : NULL);


//@line:4659
 
     vkDestroyFramebuffer(
                     (VkDevice) (device),
                     (VkFramebuffer) (framebuffer),
                     (const VkAllocationCallbacks*) pAllocator);


}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkCreateRenderPass0
(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_pCreateInfo, jobject obj_pAllocator, jobjectArray retBuff, char* device, char* pCreateInfo, char* pAllocator) {

//@line:4714
 
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

}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkCreateRenderPass0(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_pCreateInfo, jobject obj_pAllocator, jobjectArray retBuff) {
	char* device = (char*)(obj_device?env->GetDirectBufferAddress(obj_device) : NULL);
	char* pCreateInfo = (char*)(obj_pCreateInfo?env->GetDirectBufferAddress(obj_pCreateInfo) : NULL);
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkCreateRenderPass0(env, clazz, obj_device, obj_pCreateInfo, obj_pAllocator, retBuff, device, pCreateInfo, pAllocator);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkDestroyRenderPass0(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_renderPass, jobject obj_pAllocator) {
	char* device = (char*)(obj_device?env->GetDirectBufferAddress(obj_device) : NULL);
	char* renderPass = (char*)(obj_renderPass?env->GetDirectBufferAddress(obj_renderPass) : NULL);
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator) : NULL);


//@line:4763
 
     vkDestroyRenderPass(
                     (VkDevice) (device),
                     (VkRenderPass) (renderPass),
                     (const VkAllocationCallbacks*) pAllocator);


}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkGetRenderAreaGranularity0(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_renderPass, jobject obj_pGranularity) {
	char* device = (char*)(obj_device?env->GetDirectBufferAddress(obj_device) : NULL);
	char* renderPass = (char*)(obj_renderPass?env->GetDirectBufferAddress(obj_renderPass) : NULL);
	char* pGranularity = (char*)(obj_pGranularity?env->GetDirectBufferAddress(obj_pGranularity) : NULL);


//@line:4805

     vkGetRenderAreaGranularity(
                     (VkDevice) (device),
                     (VkRenderPass) (renderPass),
                     (VkExtent2D*) pGranularity);


}

static inline jobject wrapped_Java_bor_vulkan_Vk10_vkCreateCommandPool0
(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_pCreateInfo, jobject obj_pAllocator, jintArray obj_result, char* device, char* pCreateInfo, char* pAllocator, int* result) {

//@line:4859
 
     VkCommandPool* pCommandPool = new VkCommandPool;
     VkResult res = vkCreateCommandPool(
                     (VkDevice) (device),
                     (const VkCommandPoolCreateInfo*) pCreateInfo,
                     (const VkAllocationCallbacks*) pAllocator,
                     (VkCommandPool*) pCommandPool);
      result[0] = res;
      jobject buffer = NULL;
      if(res >= 0){
       buffer = (jobject)(env->NewDirectByteBuffer(pCommandPool[0], sizeof(void*)));       
      }  
      delete pCommandPool;
      return buffer;

}

JNIEXPORT jobject JNICALL Java_bor_vulkan_Vk10_vkCreateCommandPool0(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_pCreateInfo, jobject obj_pAllocator, jintArray obj_result) {
	char* device = (char*)(obj_device?env->GetDirectBufferAddress(obj_device) : NULL);
	char* pCreateInfo = (char*)(obj_pCreateInfo?env->GetDirectBufferAddress(obj_pCreateInfo) : NULL);
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator) : NULL);
	int* result = (int*)(obj_result ? env->GetIntArrayElements(obj_result, 0) : NULL);

	jobject JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkCreateCommandPool0(env, clazz, obj_device, obj_pCreateInfo, obj_pAllocator, obj_result, device, pCreateInfo, pAllocator, result);

	if(obj_result != NULL){
		 env->ReleaseIntArrayElements(obj_result, (jint*)result, 0);
	}

	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkDestroyCommandPool0(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_commandPool, jobject obj_pAllocator) {
	char* device = (char*)(obj_device?env->GetDirectBufferAddress(obj_device) : NULL);
	char* commandPool = (char*)(obj_commandPool?env->GetDirectBufferAddress(obj_commandPool) : NULL);
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator) : NULL);


//@line:4910
 
     vkDestroyCommandPool(
                     (VkDevice) (device),
                     (VkCommandPool) commandPool,
                     (const VkAllocationCallbacks*) pAllocator);


}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkResetCommandPool0
(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_commandPool, jint flags, char* device, char* commandPool) {

//@line:4956
 
     VkResult res = vkResetCommandPool(
                     (VkDevice) (device),
                     (VkCommandPool) commandPool,
                     (VkCommandPoolResetFlags) flags);
      return (jint) res;

}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkResetCommandPool0(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_commandPool, jint flags) {
	char* device = (char*)(obj_device?env->GetDirectBufferAddress(obj_device) : NULL);
	char* commandPool = (char*)(obj_commandPool?env->GetDirectBufferAddress(obj_commandPool) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkResetCommandPool0(env, clazz, obj_device, obj_commandPool, flags, device, commandPool);


	return JNI_returnValue;
}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkAllocateCommandBuffers0
(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_pAllocateInfo, jint count, jobjectArray buffers, char* device, char* pAllocateInfo) {

//@line:5006

     BUFFERARRAY_SET(VkCommandBuffer, buffers, count, pCommandBuffers);

     VkResult res = vkAllocateCommandBuffers(
                     (VkDevice) (device),
                     (const VkCommandBufferAllocateInfo*) pAllocateInfo,
                     (VkCommandBuffer*) pCommandBuffers);
                     
     BUFFERARRAY_COMMIT(VkCommandBuffer, buffers, count, pCommandBuffers); 
     
     return (jint) res;

}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkAllocateCommandBuffers0(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_pAllocateInfo, jint count, jobjectArray buffers) {
	char* device = (char*)(obj_device?env->GetDirectBufferAddress(obj_device) : NULL);
	char* pAllocateInfo = (char*)(obj_pAllocateInfo?env->GetDirectBufferAddress(obj_pAllocateInfo) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkAllocateCommandBuffers0(env, clazz, obj_device, obj_pAllocateInfo, count, buffers, device, pAllocateInfo);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkFreeCommandBuffers0(JNIEnv* env, jclass clazz, jobject obj_device, jobject obj_commandPool, jint commandBufferCount, jobjectArray buffers) {
	char* device = (char*)(obj_device?env->GetDirectBufferAddress(obj_device) : NULL);
	char* commandPool = (char*)(obj_commandPool?env->GetDirectBufferAddress(obj_commandPool) : NULL);


//@line:5059
 
													 
     BUFFERARRAY_SET(VkCommandBuffer, buffers,commandBufferCount,pCommandBuffers);   	     
     vkFreeCommandBuffers( (VkDevice) (device),
                     (VkCommandPool) commandPool,
                     (uint32_t) commandBufferCount,
                     (const VkCommandBuffer*) pCommandBuffers);
     if(pCommandBuffers != NULL){
       free(pCommandBuffers);
     }


}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkBeginCommandBuffer0
(JNIEnv* env, jclass clazz, jobject obj_commandBuffer, jobject obj_pBeginInfo, char* commandBuffer, char* pBeginInfo) {

//@line:5102
 
     VkResult res = vkBeginCommandBuffer(
                     (VkCommandBuffer) commandBuffer,
                     (const VkCommandBufferBeginInfo*) pBeginInfo);
      return (jint) res;

}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkBeginCommandBuffer0(JNIEnv* env, jclass clazz, jobject obj_commandBuffer, jobject obj_pBeginInfo) {
	char* commandBuffer = (char*)(obj_commandBuffer?env->GetDirectBufferAddress(obj_commandBuffer) : NULL);
	char* pBeginInfo = (char*)(obj_pBeginInfo?env->GetDirectBufferAddress(obj_pBeginInfo) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkBeginCommandBuffer0(env, clazz, obj_commandBuffer, obj_pBeginInfo, commandBuffer, pBeginInfo);


	return JNI_returnValue;
}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkEndCommandBuffer0
(JNIEnv* env, jclass clazz, jobject obj_commandBuffer, char* commandBuffer) {

//@line:5135
 
     VkResult res = vkEndCommandBuffer((VkCommandBuffer) commandBuffer);
      return (jint) res;

}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkEndCommandBuffer0(JNIEnv* env, jclass clazz, jobject obj_commandBuffer) {
	char* commandBuffer = (char*)(obj_commandBuffer?env->GetDirectBufferAddress(obj_commandBuffer) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkEndCommandBuffer0(env, clazz, obj_commandBuffer, commandBuffer);


	return JNI_returnValue;
}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkResetCommandBuffer0
(JNIEnv* env, jclass clazz, jobject obj_commandBuffer, jint flags, char* commandBuffer) {

//@line:5172

     VkResult res = vkResetCommandBuffer( (VkCommandBuffer) commandBuffer,
                                          (VkCommandBufferResetFlags) flags);
      return (jint) res;

}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkResetCommandBuffer0(JNIEnv* env, jclass clazz, jobject obj_commandBuffer, jint flags) {
	char* commandBuffer = (char*)(obj_commandBuffer?env->GetDirectBufferAddress(obj_commandBuffer) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkResetCommandBuffer0(env, clazz, obj_commandBuffer, flags, commandBuffer);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkCmdBindPipeline0(JNIEnv* env, jclass clazz, jobject obj_commandBuffer, jint pipelineBindPoint, jobject obj_pipeline) {
	char* commandBuffer = (char*)(obj_commandBuffer?env->GetDirectBufferAddress(obj_commandBuffer) : NULL);
	char* pipeline = (char*)(obj_pipeline?env->GetDirectBufferAddress(obj_pipeline) : NULL);


//@line:5209
 
     vkCmdBindPipeline((VkCommandBuffer) commandBuffer,
                     (VkPipelineBindPoint) pipelineBindPoint,
                     (VkPipeline) pipeline);


}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkCmdSetViewport0(JNIEnv* env, jclass clazz, jobject obj_commandBuffer, jint firstViewport, jint viewportCount, jobject obj_pViewports) {
	char* commandBuffer = (char*)(obj_commandBuffer?env->GetDirectBufferAddress(obj_commandBuffer) : NULL);
	char* pViewports = (char*)(obj_pViewports?env->GetDirectBufferAddress(obj_pViewports) : NULL);


//@line:5251
 
     vkCmdSetViewport((VkCommandBuffer) commandBuffer,
                     (uint32_t) firstViewport,
                     (uint32_t) viewportCount,
                     (const VkViewport*) pViewports);


}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkCmdSetScissor0(JNIEnv* env, jclass clazz, jobject obj_commandBuffer, jint firstScissor, jint scissorCount, jobject obj_pScissors) {
	char* commandBuffer = (char*)(obj_commandBuffer?env->GetDirectBufferAddress(obj_commandBuffer) : NULL);
	char* pScissors = (char*)(obj_pScissors?env->GetDirectBufferAddress(obj_pScissors) : NULL);


//@line:5294
 
     vkCmdSetScissor((VkCommandBuffer) commandBuffer,
                     (uint32_t) firstScissor,
                     (uint32_t) scissorCount,
                     (const VkRect2D*) pScissors);


}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkCmdSetLineWidth0(JNIEnv* env, jclass clazz, jobject obj_commandBuffer, jfloat lineWidth) {
	char* commandBuffer = (char*)(obj_commandBuffer?env->GetDirectBufferAddress(obj_commandBuffer) : NULL);


//@line:5327
 
     vkCmdSetLineWidth((VkCommandBuffer) commandBuffer,
                     (float) lineWidth);


}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkCmdSetDepthBias0(JNIEnv* env, jclass clazz, jobject obj_commandBuffer, jfloat depthBiasConstantFactor, jfloat depthBiasClamp, jfloat depthBiasSlopeFactor) {
	char* commandBuffer = (char*)(obj_commandBuffer?env->GetDirectBufferAddress(obj_commandBuffer) : NULL);


//@line:5367
 
     vkCmdSetDepthBias((VkCommandBuffer) commandBuffer,
                     (float) depthBiasConstantFactor,
                     (float) depthBiasClamp,
                     (float) depthBiasSlopeFactor);


}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkCmdSetBlendConstants0(JNIEnv* env, jclass clazz, jobject obj_commandBuffer, jfloatArray obj_blendConstants0) {
	char* commandBuffer = (char*)(obj_commandBuffer?env->GetDirectBufferAddress(obj_commandBuffer) : NULL);
	float* blendConstants0 = (float*)(obj_blendConstants0 ? env->GetFloatArrayElements(obj_blendConstants0, 0) : NULL);


//@line:5402
 
     //float* blendConstants = new float[4];
     float blendConstants[4]; 
     for(int i=0; i<4; i++){
       blendConstants[i] = (float) blendConstants0[i];
     }     
     vkCmdSetBlendConstants((VkCommandBuffer) commandBuffer, blendConstants);

	if(obj_blendConstants0 != NULL){
		 env->ReleaseFloatArrayElements(obj_blendConstants0, (jfloat*)blendConstants0, 0);
	}

}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkCmdSetDepthBounds0(JNIEnv* env, jclass clazz, jobject obj_commandBuffer, jfloat minDepthBounds, jfloat maxDepthBounds) {
	char* commandBuffer = (char*)(obj_commandBuffer?env->GetDirectBufferAddress(obj_commandBuffer) : NULL);


//@line:5446
 
     vkCmdSetDepthBounds(
                     (VkCommandBuffer) commandBuffer,
                     (float) minDepthBounds,
                     (float) maxDepthBounds);


}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkCmdSetStencilCompareMask0(JNIEnv* env, jclass clazz, jobject obj_commandBuffer, jint faceMask, jint compareMask) {
	char* commandBuffer = (char*)(obj_commandBuffer?env->GetDirectBufferAddress(obj_commandBuffer) : NULL);


//@line:5487

     vkCmdSetStencilCompareMask((VkCommandBuffer) commandBuffer,
                     (VkStencilFaceFlags) faceMask,
                     (uint32_t) compareMask);


}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkCmdSetStencilWriteMask0(JNIEnv* env, jclass clazz, jobject obj_commandBuffer, jint faceMask, jint writeMask) {
	char* commandBuffer = (char*)(obj_commandBuffer?env->GetDirectBufferAddress(obj_commandBuffer) : NULL);


//@line:5525
 
     vkCmdSetStencilWriteMask( (VkCommandBuffer) commandBuffer,
                     (VkStencilFaceFlags) faceMask,
                     (uint32_t) writeMask);


}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkCmdSetStencilReference0(JNIEnv* env, jclass clazz, jobject obj_commandBuffer, jint faceMask, jint reference) {
	char* commandBuffer = (char*)(obj_commandBuffer?env->GetDirectBufferAddress(obj_commandBuffer) : NULL);


//@line:5563
 
     vkCmdSetStencilReference( (VkCommandBuffer) commandBuffer,
                     (VkStencilFaceFlags) faceMask,
                     (uint32_t) reference);


}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkCmdBindDescriptorSets0(JNIEnv* env, jclass clazz, jobject obj_commandBuffer, jint pipelineBindPoint, jobject obj_layout, jint firstSet, jint descriptorSetCount, jobjectArray buffers, jint dynamicOffsetCount, jintArray obj_pDynamicOffsets) {
	char* commandBuffer = (char*)(obj_commandBuffer?env->GetDirectBufferAddress(obj_commandBuffer) : NULL);
	char* layout = (char*)(obj_layout?env->GetDirectBufferAddress(obj_layout) : NULL);
	int* pDynamicOffsets = (int*)(obj_pDynamicOffsets ? env->GetIntArrayElements(obj_pDynamicOffsets, 0) : NULL);


//@line:5637
 
      
     BUFFERARRAY_SET(VkDescriptorSet, buffers, descriptorSetCount, pDescriptorSets);                                                      
     vkCmdBindDescriptorSets(
                     (VkCommandBuffer) commandBuffer,
                     (VkPipelineBindPoint) pipelineBindPoint,
                     (VkPipelineLayout) layout,
                     (uint32_t) firstSet,
                     (uint32_t) descriptorSetCount,
                     (const VkDescriptorSet*) pDescriptorSets,
                     (uint32_t) dynamicOffsetCount,
                     (const uint32_t*) pDynamicOffsets);

	if(obj_pDynamicOffsets != NULL){
		 env->ReleaseIntArrayElements(obj_pDynamicOffsets, (jint*)pDynamicOffsets, 0);
	}

}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkCmdBindIndexBuffer0(JNIEnv* env, jclass clazz, jobject obj_commandBuffer, jobject obj_buffer, jlong offset, jint indexType) {
	char* commandBuffer = (char*)(obj_commandBuffer?env->GetDirectBufferAddress(obj_commandBuffer) : NULL);
	char* buffer = (char*)(obj_buffer?env->GetDirectBufferAddress(obj_buffer) : NULL);


//@line:5690
 
     vkCmdBindIndexBuffer((VkCommandBuffer) commandBuffer,
                     (VkBuffer) buffer,
                     (VkDeviceSize) offset,
                     (VkIndexType) indexType);


}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkCmdBindVertexBuffers0(JNIEnv* env, jclass clazz, jobject obj_commandBuffer, jint firstBinding, jint bindingCount, jobjectArray buffers, jlongArray obj_pOffsets) {
	char* commandBuffer = (char*)(obj_commandBuffer?env->GetDirectBufferAddress(obj_commandBuffer) : NULL);
	long long* pOffsets = (long long*)(obj_pOffsets ? env->GetLongArrayElements(obj_pOffsets, 0) : NULL);


//@line:5744
 
     BUFFERARRAY_SET(VkBuffer, buffers,bindingCount,pBuffers);   	     
     vkCmdBindVertexBuffers((VkCommandBuffer) commandBuffer,
                     (uint32_t) firstBinding,
                     (uint32_t) bindingCount,
                     (const VkBuffer*) pBuffers,
                     (const VkDeviceSize*) pOffsets);
	if(pBuffers != NULL)
		free(pBuffers);
					 

	if(obj_pOffsets != NULL){
		 env->ReleaseLongArrayElements(obj_pOffsets, (jlong*)pOffsets, 0);
	}

}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkCmdDraw0(JNIEnv* env, jclass clazz, jobject obj_commandBuffer, jint vertexCount, jint instanceCount, jint firstVertex, jint firstInstance) {
	char* commandBuffer = (char*)(obj_commandBuffer?env->GetDirectBufferAddress(obj_commandBuffer) : NULL);


//@line:5803
 
     vkCmdDraw(
                     (VkCommandBuffer) commandBuffer,
                     (uint32_t) vertexCount,
                     (uint32_t) instanceCount,
                     (uint32_t) firstVertex,
                     (uint32_t) firstInstance);


}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkCmdDrawIndexed0(JNIEnv* env, jclass clazz, jobject obj_commandBuffer, jint indexCount, jint instanceCount, jint firstIndex, jint vertexOffset, jint firstInstance) {
	char* commandBuffer = (char*)(obj_commandBuffer?env->GetDirectBufferAddress(obj_commandBuffer) : NULL);


//@line:5862
 
     vkCmdDrawIndexed((VkCommandBuffer) commandBuffer,
                     (uint32_t) indexCount,
                     (uint32_t) instanceCount,
                     (uint32_t) firstIndex,
                     (int32_t) vertexOffset,
                     (uint32_t) firstInstance);


}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkCmdDrawIndirect0(JNIEnv* env, jclass clazz, jobject obj_commandBuffer, jobject obj_buffer, jlong offset, jint drawCount, jint stride) {
	char* commandBuffer = (char*)(obj_commandBuffer?env->GetDirectBufferAddress(obj_commandBuffer) : NULL);
	char* buffer = (char*)(obj_buffer?env->GetDirectBufferAddress(obj_buffer) : NULL);


//@line:5917
 
     vkCmdDrawIndirect((VkCommandBuffer) commandBuffer,
                     (VkBuffer) buffer,
                     (VkDeviceSize) offset,
                     (uint32_t) drawCount,
                     (uint32_t) stride);


}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkCmdDrawIndexedIndirect0(JNIEnv* env, jclass clazz, jobject obj_commandBuffer, jobject obj_buffer, jlong offset, jint drawCount, jint stride) {
	char* commandBuffer = (char*)(obj_commandBuffer?env->GetDirectBufferAddress(obj_commandBuffer) : NULL);
	char* buffer = (char*)(obj_buffer?env->GetDirectBufferAddress(obj_buffer) : NULL);


//@line:5969
 
     vkCmdDrawIndexedIndirect( (VkCommandBuffer) commandBuffer,
                               (VkBuffer) buffer,
                               (VkDeviceSize) offset,
                               (uint32_t) drawCount,
                               (uint32_t) stride);


}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkCmdDispatch0(JNIEnv* env, jclass clazz, jobject obj_commandBuffer, jint x, jint y, jint z) {
	char* commandBuffer = (char*)(obj_commandBuffer?env->GetDirectBufferAddress(obj_commandBuffer) : NULL);


//@line:6007
 
     vkCmdDispatch((VkCommandBuffer) commandBuffer,
                     (uint32_t) x,
                     (uint32_t) y,
                     (uint32_t) z);


}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkCmdDispatchIndirect0(JNIEnv* env, jclass clazz, jobject obj_commandBuffer, jobject obj_buffer, jlong offset) {
	char* commandBuffer = (char*)(obj_commandBuffer?env->GetDirectBufferAddress(obj_commandBuffer) : NULL);
	char* buffer = (char*)(obj_buffer?env->GetDirectBufferAddress(obj_buffer) : NULL);


//@line:6048

     vkCmdDispatchIndirect(
                     (VkCommandBuffer) commandBuffer,
                     (VkBuffer) buffer,
                     (VkDeviceSize) offset);


}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkCmdCopyBuffer0(JNIEnv* env, jclass clazz, jobject obj_commandBuffer, jobject obj_srcBuffer, jobject obj_dstBuffer, jint regionCount, jobject obj_pRegions) {
	char* commandBuffer = (char*)(obj_commandBuffer?env->GetDirectBufferAddress(obj_commandBuffer) : NULL);
	char* srcBuffer = (char*)(obj_srcBuffer?env->GetDirectBufferAddress(obj_srcBuffer) : NULL);
	char* dstBuffer = (char*)(obj_dstBuffer?env->GetDirectBufferAddress(obj_dstBuffer) : NULL);
	char* pRegions = (char*)(obj_pRegions?env->GetDirectBufferAddress(obj_pRegions) : NULL);


//@line:6102

     vkCmdCopyBuffer(
                     (VkCommandBuffer) commandBuffer,
                     (VkBuffer) srcBuffer,
                     (VkBuffer) dstBuffer,
                     (uint32_t) regionCount,
                     (const VkBufferCopy*) pRegions);


}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkCmdCopyImage0(JNIEnv* env, jclass clazz, jobject obj_commandBuffer, jobject obj_srcImage, jint srcImageLayout, jobject obj_dstImage, jint dstImageLayout, jint regionCount, jobject obj_pRegions) {
	char* commandBuffer = (char*)(obj_commandBuffer?env->GetDirectBufferAddress(obj_commandBuffer) : NULL);
	char* srcImage = (char*)(obj_srcImage?env->GetDirectBufferAddress(obj_srcImage) : NULL);
	char* dstImage = (char*)(obj_dstImage?env->GetDirectBufferAddress(obj_dstImage) : NULL);
	char* pRegions = (char*)(obj_pRegions?env->GetDirectBufferAddress(obj_pRegions) : NULL);


//@line:6172

     vkCmdCopyImage(
                     (VkCommandBuffer) commandBuffer,
                     (VkImage) srcImage,
                     (VkImageLayout) srcImageLayout,
                     (VkImage) dstImage,
                     (VkImageLayout) dstImageLayout,
                     (uint32_t) regionCount,
                     (const VkImageCopy*) pRegions);


}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkCmdBlitImage0(JNIEnv* env, jclass clazz, jobject obj_commandBuffer, jobject obj_srcImage, jint srcImageLayout, jobject obj_dstImage, jint dstImageLayout, jint regionCount, jobject obj_pRegions, jint filter) {
	char* commandBuffer = (char*)(obj_commandBuffer?env->GetDirectBufferAddress(obj_commandBuffer) : NULL);
	char* srcImage = (char*)(obj_srcImage?env->GetDirectBufferAddress(obj_srcImage) : NULL);
	char* dstImage = (char*)(obj_dstImage?env->GetDirectBufferAddress(obj_dstImage) : NULL);
	char* pRegions = (char*)(obj_pRegions?env->GetDirectBufferAddress(obj_pRegions) : NULL);


//@line:6250
 
     vkCmdBlitImage(
                     (VkCommandBuffer) commandBuffer,
                     (VkImage) srcImage,
                     (VkImageLayout) srcImageLayout,
                     (VkImage) dstImage,
                     (VkImageLayout) dstImageLayout,
                     (uint32_t) regionCount,
                     (const VkImageBlit*) pRegions,
                     (VkFilter) filter);


}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkCmdCopyBufferToImage0(JNIEnv* env, jclass clazz, jobject obj_commandBuffer, jobject obj_srcBuffer, jobject obj_dstImage, jint dstImageLayout, jint regionCount, jobject obj_pRegions) {
	char* commandBuffer = (char*)(obj_commandBuffer?env->GetDirectBufferAddress(obj_commandBuffer) : NULL);
	char* srcBuffer = (char*)(obj_srcBuffer?env->GetDirectBufferAddress(obj_srcBuffer) : NULL);
	char* dstImage = (char*)(obj_dstImage?env->GetDirectBufferAddress(obj_dstImage) : NULL);
	char* pRegions = (char*)(obj_pRegions?env->GetDirectBufferAddress(obj_pRegions) : NULL);


//@line:6317
 
     vkCmdCopyBufferToImage(
                     (VkCommandBuffer) commandBuffer,
                     (VkBuffer) srcBuffer,
                     (VkImage) dstImage,
                     (VkImageLayout) dstImageLayout,
                     (uint32_t) regionCount,
                     (const VkBufferImageCopy*) pRegions);


}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkCmdCopyImageToBuffer0(JNIEnv* env, jclass clazz, jobject obj_commandBuffer, jobject obj_srcImage, jint srcImageLayout, jobject obj_dstBuffer, jint regionCount, jobject obj_pRegions) {
	char* commandBuffer = (char*)(obj_commandBuffer?env->GetDirectBufferAddress(obj_commandBuffer) : NULL);
	char* srcImage = (char*)(obj_srcImage?env->GetDirectBufferAddress(obj_srcImage) : NULL);
	char* dstBuffer = (char*)(obj_dstBuffer?env->GetDirectBufferAddress(obj_dstBuffer) : NULL);
	char* pRegions = (char*)(obj_pRegions?env->GetDirectBufferAddress(obj_pRegions) : NULL);


//@line:6382

     vkCmdCopyImageToBuffer(
                     (VkCommandBuffer) commandBuffer,
                     (VkImage) srcImage,
                     (VkImageLayout) srcImageLayout,
                     (VkBuffer) dstBuffer,
                     (uint32_t) regionCount,
                     (const VkBufferImageCopy*) pRegions);


}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkCmdUpdateBuffer0(JNIEnv* env, jclass clazz, jobject obj_commandBuffer, jobject obj_dstBuffer, jlong dstOffset, jlong dataSize, jintArray obj_pData) {
	char* commandBuffer = (char*)(obj_commandBuffer?env->GetDirectBufferAddress(obj_commandBuffer) : NULL);
	char* dstBuffer = (char*)(obj_dstBuffer?env->GetDirectBufferAddress(obj_dstBuffer) : NULL);
	int* pData = (int*)(obj_pData ? env->GetIntArrayElements(obj_pData, 0) : NULL);


//@line:6441
 
     vkCmdUpdateBuffer(
                     (VkCommandBuffer) commandBuffer,
                     (VkBuffer) dstBuffer,
                     (VkDeviceSize) dstOffset,
                     (VkDeviceSize) dataSize,
                     (const uint32_t*) pData);

	if(obj_pData != NULL){
		 env->ReleaseIntArrayElements(obj_pData, (jint*)pData, 0);
	}

}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkCmdFillBuffer0(JNIEnv* env, jclass clazz, jobject obj_commandBuffer, jobject obj_dstBuffer, jlong dstOffset, jlong size, jint data) {
	char* commandBuffer = (char*)(obj_commandBuffer?env->GetDirectBufferAddress(obj_commandBuffer) : NULL);
	char* dstBuffer = (char*)(obj_dstBuffer?env->GetDirectBufferAddress(obj_dstBuffer) : NULL);


//@line:6497
 
     vkCmdFillBuffer(
                     (VkCommandBuffer) commandBuffer,
                     (VkBuffer) dstBuffer,
                     (VkDeviceSize) dstOffset,
                     (VkDeviceSize) size,
                     (uint32_t) data);


}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkCmdClearColorImage0(JNIEnv* env, jclass clazz, jobject obj_commandBuffer, jobject obj_image, jint imageLayout, jobject obj_pColor, jint rangeCount, jobjectArray buffers) {
	char* commandBuffer = (char*)(obj_commandBuffer?env->GetDirectBufferAddress(obj_commandBuffer) : NULL);
	char* image = (char*)(obj_image?env->GetDirectBufferAddress(obj_image) : NULL);
	char* pColor = (char*)(obj_pColor?env->GetDirectBufferAddress(obj_pColor) : NULL);


//@line:6562

            
     BUFFERARRAY_SET(VkImageSubresourceRange, buffers,rangeCount,pRanges);            
     vkCmdClearColorImage(
                     (VkCommandBuffer) commandBuffer,
                     (VkImage) image,
                     (VkImageLayout) imageLayout,
                     (const VkClearColorValue*) pColor,
                     (uint32_t) rangeCount,
                     (const VkImageSubresourceRange*) pRanges);
      if(pRanges != NULL)
          free(pRanges);               
                     


}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkCmdClearDepthStencilImage0(JNIEnv* env, jclass clazz, jobject obj_commandBuffer, jobject obj_image, jint imageLayout, jobject obj_pDepthStencil, jint rangeCount, jobject obj_pRanges) {
	char* commandBuffer = (char*)(obj_commandBuffer?env->GetDirectBufferAddress(obj_commandBuffer) : NULL);
	char* image = (char*)(obj_image?env->GetDirectBufferAddress(obj_image) : NULL);
	char* pDepthStencil = (char*)(obj_pDepthStencil?env->GetDirectBufferAddress(obj_pDepthStencil) : NULL);
	char* pRanges = (char*)(obj_pRanges?env->GetDirectBufferAddress(obj_pRanges) : NULL);


//@line:6629
 
     vkCmdClearDepthStencilImage(
                     (VkCommandBuffer) commandBuffer,
                     (VkImage) image,
                     (VkImageLayout) imageLayout,
                     (const VkClearDepthStencilValue*) pDepthStencil,
                     (uint32_t) rangeCount,
                     (const VkImageSubresourceRange*) pRanges);


}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkCmdClearAttachments0(JNIEnv* env, jclass clazz, jobject obj_commandBuffer, jint attachmentCount, jobject obj_pAttachments, jint rectCount, jobject obj_pRects) {
	char* commandBuffer = (char*)(obj_commandBuffer?env->GetDirectBufferAddress(obj_commandBuffer) : NULL);
	char* pAttachments = (char*)(obj_pAttachments?env->GetDirectBufferAddress(obj_pAttachments) : NULL);
	char* pRects = (char*)(obj_pRects?env->GetDirectBufferAddress(obj_pRects) : NULL);


//@line:6688
 
     vkCmdClearAttachments(
                     (VkCommandBuffer) commandBuffer,
                     (uint32_t) attachmentCount,
                     (const VkClearAttachment*) pAttachments,
                     (uint32_t) rectCount,
                     (const VkClearRect*) pRects);


}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkCmdResolveImage0(JNIEnv* env, jclass clazz, jobject obj_commandBuffer, jobject obj_srcImage, jint srcImageLayout, jobject obj_dstImage, jint dstImageLayout, jint regionCount, jobject obj_pRegions) {
	char* commandBuffer = (char*)(obj_commandBuffer?env->GetDirectBufferAddress(obj_commandBuffer) : NULL);
	char* srcImage = (char*)(obj_srcImage?env->GetDirectBufferAddress(obj_srcImage) : NULL);
	char* dstImage = (char*)(obj_dstImage?env->GetDirectBufferAddress(obj_dstImage) : NULL);
	char* pRegions = (char*)(obj_pRegions?env->GetDirectBufferAddress(obj_pRegions) : NULL);


//@line:6756
 
     vkCmdResolveImage(
                     (VkCommandBuffer) commandBuffer,
                     (VkImage) srcImage,
                     (VkImageLayout) srcImageLayout,
                     (VkImage) dstImage,
                     (VkImageLayout) dstImageLayout,
                     (uint32_t) regionCount,
                     (const VkImageResolve*) pRegions);


}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkCmdSetEvent0(JNIEnv* env, jclass clazz, jobject obj_commandBuffer, jobject obj_event, jint stageMask) {
	char* commandBuffer = (char*)(obj_commandBuffer?env->GetDirectBufferAddress(obj_commandBuffer) : NULL);
	char* event = (char*)(obj_event?env->GetDirectBufferAddress(obj_event) : NULL);


//@line:6803
 
     vkCmdSetEvent(
                     (VkCommandBuffer) commandBuffer,
                     (VkEvent) event ,
                     (VkPipelineStageFlags) stageMask);


}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkCmdResetEvent0(JNIEnv* env, jclass clazz, jobject obj_commandBuffer, jobject obj_event, jint stageMask) {
	char* commandBuffer = (char*)(obj_commandBuffer?env->GetDirectBufferAddress(obj_commandBuffer) : NULL);
	char* event = (char*)(obj_event?env->GetDirectBufferAddress(obj_event) : NULL);


//@line:6844
 
     vkCmdResetEvent(
                     (VkCommandBuffer) commandBuffer,
                     (VkEvent) event ,
                     (VkPipelineStageFlags) stageMask);


}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkCmdWaitEvents0(JNIEnv* env, jclass clazz, jobject obj_commandBuffer, jint eventCount, jobject obj_pEvents, jint srcStageMask, jint dstStageMask, jint memoryBarrierCount, jobject obj_pMemoryBarriers, jint bufferMemoryBarrierCount, jobject obj_pBufferMemoryBarriers, jint imageMemoryBarrierCount, jobject obj_pImageMemoryBarriers) {
	char* commandBuffer = (char*)(obj_commandBuffer?env->GetDirectBufferAddress(obj_commandBuffer) : NULL);
	char* pEvents = (char*)(obj_pEvents?env->GetDirectBufferAddress(obj_pEvents) : NULL);
	char* pMemoryBarriers = (char*)(obj_pMemoryBarriers?env->GetDirectBufferAddress(obj_pMemoryBarriers) : NULL);
	char* pBufferMemoryBarriers = (char*)(obj_pBufferMemoryBarriers?env->GetDirectBufferAddress(obj_pBufferMemoryBarriers) : NULL);
	char* pImageMemoryBarriers = (char*)(obj_pImageMemoryBarriers?env->GetDirectBufferAddress(obj_pImageMemoryBarriers) : NULL);


//@line:6936
 
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


}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkCmdPipelineBarrier0(JNIEnv* env, jclass clazz, jobject obj_commandBuffer, jint srcStageMask, jint dstStageMask, jint dependencyFlags, jint memoryBarrierCount, jobject obj_pMemoryBarriers, jint bufferMemoryBarrierCount, jobject obj_pBufferMemoryBarriers, jint imageMemoryBarrierCount, jobject obj_pImageMemoryBarriers) {
	char* commandBuffer = (char*)(obj_commandBuffer?env->GetDirectBufferAddress(obj_commandBuffer) : NULL);
	char* pMemoryBarriers = (char*)(obj_pMemoryBarriers?env->GetDirectBufferAddress(obj_pMemoryBarriers) : NULL);
	char* pBufferMemoryBarriers = (char*)(obj_pBufferMemoryBarriers?env->GetDirectBufferAddress(obj_pBufferMemoryBarriers) : NULL);
	char* pImageMemoryBarriers = (char*)(obj_pImageMemoryBarriers?env->GetDirectBufferAddress(obj_pImageMemoryBarriers) : NULL);


//@line:7026
 
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


}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkCmdBeginQuery0(JNIEnv* env, jclass clazz, jobject obj_commandBuffer, jobject obj_queryPool, jint query, jint flags) {
	char* commandBuffer = (char*)(obj_commandBuffer?env->GetDirectBufferAddress(obj_commandBuffer) : NULL);
	char* queryPool = (char*)(obj_queryPool?env->GetDirectBufferAddress(obj_queryPool) : NULL);


//@line:7081
 
     vkCmdBeginQuery(
                     (VkCommandBuffer) commandBuffer,
                     (VkQueryPool) queryPool,
                     (uint32_t) query,
                     (VkQueryControlFlags) flags);


}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkCmdEndQuery0(JNIEnv* env, jclass clazz, jobject obj_commandBuffer, jobject obj_queryPool, jint query) {
	char* commandBuffer = (char*)(obj_commandBuffer?env->GetDirectBufferAddress(obj_commandBuffer) : NULL);
	char* queryPool = (char*)(obj_queryPool?env->GetDirectBufferAddress(obj_queryPool) : NULL);


//@line:7125
 
     vkCmdEndQuery(
                     (VkCommandBuffer) commandBuffer,
                     (VkQueryPool) queryPool,
                     (uint32_t) query);


}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkCmdResetQueryPool0(JNIEnv* env, jclass clazz, jobject obj_commandBuffer, jobject obj_queryPool, jint firstQuery, jint queryCount) {
	char* commandBuffer = (char*)(obj_commandBuffer?env->GetDirectBufferAddress(obj_commandBuffer) : NULL);
	char* queryPool = (char*)(obj_queryPool?env->GetDirectBufferAddress(obj_queryPool) : NULL);


//@line:7173
 
     vkCmdResetQueryPool(
                     (VkCommandBuffer) commandBuffer,
                     (VkQueryPool) queryPool,
                     (uint32_t) firstQuery,
                     (uint32_t) queryCount);


}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkCmdWriteTimestamp0(JNIEnv* env, jclass clazz, jobject obj_commandBuffer, jint pipelineStage, jobject obj_queryPool, jint query) {
	char* commandBuffer = (char*)(obj_commandBuffer?env->GetDirectBufferAddress(obj_commandBuffer) : NULL);
	char* queryPool = (char*)(obj_queryPool?env->GetDirectBufferAddress(obj_queryPool) : NULL);


//@line:7223
 
     vkCmdWriteTimestamp(
                     (VkCommandBuffer) commandBuffer,
                     (VkPipelineStageFlagBits) pipelineStage,
                     (VkQueryPool) queryPool,
                     (uint32_t) query);


}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkCmdCopyQueryPoolResults0(JNIEnv* env, jclass clazz, jobject obj_commandBuffer, jobject obj_queryPool, jint firstQuery, jint queryCount, jobject obj_dstBuffer, jlong dstOffset, jlong stride, jint flags) {
	char* commandBuffer = (char*)(obj_commandBuffer?env->GetDirectBufferAddress(obj_commandBuffer) : NULL);
	char* queryPool = (char*)(obj_queryPool?env->GetDirectBufferAddress(obj_queryPool) : NULL);
	char* dstBuffer = (char*)(obj_dstBuffer?env->GetDirectBufferAddress(obj_dstBuffer) : NULL);


//@line:7297
 
     vkCmdCopyQueryPoolResults(
                     (VkCommandBuffer) commandBuffer,
                     (VkQueryPool) queryPool,
                     (uint32_t) firstQuery,
                     (uint32_t) queryCount,
                     (VkBuffer) dstBuffer,
                     (VkDeviceSize) dstOffset,
                     (VkDeviceSize) stride,
                     (VkQueryResultFlags) flags);


}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkCmdPushConstants0(JNIEnv* env, jclass clazz, jobject obj_commandBuffer, jobject obj_layout, jint stageFlags, jint offset, jint size, jobject obj_pValues) {
	char* commandBuffer = (char*)(obj_commandBuffer?env->GetDirectBufferAddress(obj_commandBuffer) : NULL);
	char* layout = (char*)(obj_layout?env->GetDirectBufferAddress(obj_layout) : NULL);
	unsigned char* pValues = (unsigned char*)(obj_pValues?env->GetDirectBufferAddress(obj_pValues) : NULL);


//@line:7363
 
     vkCmdPushConstants(
                     (VkCommandBuffer) commandBuffer,
                     (VkPipelineLayout) layout,
                     (VkShaderStageFlags) stageFlags,
                     (uint32_t) offset,
                     (uint32_t) size,
                     (const void*) pValues);


}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkCmdBeginRenderPass0(JNIEnv* env, jclass clazz, jobject obj_commandBuffer, jobject obj_pRenderPassBegin, jint contents) {
	char* commandBuffer = (char*)(obj_commandBuffer?env->GetDirectBufferAddress(obj_commandBuffer) : NULL);
	char* pRenderPassBegin = (char*)(obj_pRenderPassBegin?env->GetDirectBufferAddress(obj_pRenderPassBegin) : NULL);


//@line:7408
 
     vkCmdBeginRenderPass(
                     (VkCommandBuffer) commandBuffer,
                     (const VkRenderPassBeginInfo*) pRenderPassBegin,
                     (VkSubpassContents) contents);


}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkCmdNextSubpass0(JNIEnv* env, jclass clazz, jobject obj_commandBuffer, jint contents) {
	char* commandBuffer = (char*)(obj_commandBuffer?env->GetDirectBufferAddress(obj_commandBuffer) : NULL);


//@line:7444
 
     vkCmdNextSubpass(
                     (VkCommandBuffer) commandBuffer,
                     (VkSubpassContents) contents);


}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkCmdEndRenderPass0(JNIEnv* env, jclass clazz, jobject obj_commandBuffer) {
	char* commandBuffer = (char*)(obj_commandBuffer?env->GetDirectBufferAddress(obj_commandBuffer) : NULL);


//@line:7472
 
     vkCmdEndRenderPass((VkCommandBuffer) commandBuffer);


}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkCmdExecuteCommands0(JNIEnv* env, jclass clazz, jobject obj_commandBuffer, jint commandBufferCount, jobject obj_pCommandBuffers) {
	char* commandBuffer = (char*)(obj_commandBuffer?env->GetDirectBufferAddress(obj_commandBuffer) : NULL);
	char* pCommandBuffers = (char*)(obj_pCommandBuffers?env->GetDirectBufferAddress(obj_pCommandBuffers) : NULL);


//@line:7514
 
     
     vkCmdExecuteCommands(
                     (VkCommandBuffer) commandBuffer,
                     (uint32_t) commandBufferCount,
                     (const VkCommandBuffer*) pCommandBuffers);



}

static inline jobject wrapped_Java_bor_vulkan_Vk10_vkCreateAndroidSurfaceKHR0
(JNIEnv* env, jclass clazz, jobject obj_instance, jobject obj_pCreateInfo, jobject obj_pAllocator, jintArray obj_result, char* instance, char* pCreateInfo, char* pAllocator, int* result) {

//@line:7545

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
    
}

JNIEXPORT jobject JNICALL Java_bor_vulkan_Vk10_vkCreateAndroidSurfaceKHR0(JNIEnv* env, jclass clazz, jobject obj_instance, jobject obj_pCreateInfo, jobject obj_pAllocator, jintArray obj_result) {
	char* instance = (char*)(obj_instance?env->GetDirectBufferAddress(obj_instance) : NULL);
	char* pCreateInfo = (char*)(obj_pCreateInfo?env->GetDirectBufferAddress(obj_pCreateInfo) : NULL);
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator) : NULL);
	int* result = (int*)(obj_result ? env->GetIntArrayElements(obj_result, 0) : NULL);

	jobject JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkCreateAndroidSurfaceKHR0(env, clazz, obj_instance, obj_pCreateInfo, obj_pAllocator, obj_result, instance, pCreateInfo, pAllocator, result);

	if(obj_result != NULL){
		 env->ReleaseIntArrayElements(obj_result, (jint*)result, 0);
	}

	return JNI_returnValue;
}

static inline jobject wrapped_Java_bor_vulkan_Vk10_vkCreateMirSurfaceKHR0
(JNIEnv* env, jclass clazz, jobject obj_instance, jobject obj_pCreateInfo, jobject obj_pAllocator, jintArray obj_result, char* instance, char* pCreateInfo, char* pAllocator, int* result) {

//@line:7595

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
           
}

JNIEXPORT jobject JNICALL Java_bor_vulkan_Vk10_vkCreateMirSurfaceKHR0(JNIEnv* env, jclass clazz, jobject obj_instance, jobject obj_pCreateInfo, jobject obj_pAllocator, jintArray obj_result) {
	char* instance = (char*)(obj_instance?env->GetDirectBufferAddress(obj_instance) : NULL);
	char* pCreateInfo = (char*)(obj_pCreateInfo?env->GetDirectBufferAddress(obj_pCreateInfo) : NULL);
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator) : NULL);
	int* result = (int*)(obj_result ? env->GetIntArrayElements(obj_result, 0) : NULL);

	jobject JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkCreateMirSurfaceKHR0(env, clazz, obj_instance, obj_pCreateInfo, obj_pAllocator, obj_result, instance, pCreateInfo, pAllocator, result);

	if(obj_result != NULL){
		 env->ReleaseIntArrayElements(obj_result, (jint*)result, 0);
	}

	return JNI_returnValue;
}

static inline jobject wrapped_Java_bor_vulkan_Vk10_vkCreateWaylandSurfaceKHR0
(JNIEnv* env, jclass clazz, jobject obj_instance, jobject obj_pCreateInfo, jobject obj_pAllocator, jintArray obj_result, char* instance, char* pCreateInfo, char* pAllocator, int* result) {

//@line:7652

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
           
}

JNIEXPORT jobject JNICALL Java_bor_vulkan_Vk10_vkCreateWaylandSurfaceKHR0(JNIEnv* env, jclass clazz, jobject obj_instance, jobject obj_pCreateInfo, jobject obj_pAllocator, jintArray obj_result) {
	char* instance = (char*)(obj_instance?env->GetDirectBufferAddress(obj_instance) : NULL);
	char* pCreateInfo = (char*)(obj_pCreateInfo?env->GetDirectBufferAddress(obj_pCreateInfo) : NULL);
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator) : NULL);
	int* result = (int*)(obj_result ? env->GetIntArrayElements(obj_result, 0) : NULL);

	jobject JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkCreateWaylandSurfaceKHR0(env, clazz, obj_instance, obj_pCreateInfo, obj_pAllocator, obj_result, instance, pCreateInfo, pAllocator, result);

	if(obj_result != NULL){
		 env->ReleaseIntArrayElements(obj_result, (jint*)result, 0);
	}

	return JNI_returnValue;
}

static inline jobject wrapped_Java_bor_vulkan_Vk10_vkCreateWin32SurfaceKHR0
(JNIEnv* env, jclass clazz, jobject obj_instance, jobject obj_pCreateInfo, jobject obj_pAllocator, jintArray obj_result, char* instance, char* pCreateInfo, char* pAllocator, int* result) {

//@line:7709

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
            
}

JNIEXPORT jobject JNICALL Java_bor_vulkan_Vk10_vkCreateWin32SurfaceKHR0(JNIEnv* env, jclass clazz, jobject obj_instance, jobject obj_pCreateInfo, jobject obj_pAllocator, jintArray obj_result) {
	char* instance = (char*)(obj_instance?env->GetDirectBufferAddress(obj_instance) : NULL);
	char* pCreateInfo = (char*)(obj_pCreateInfo?env->GetDirectBufferAddress(obj_pCreateInfo) : NULL);
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator) : NULL);
	int* result = (int*)(obj_result ? env->GetIntArrayElements(obj_result, 0) : NULL);

	jobject JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkCreateWin32SurfaceKHR0(env, clazz, obj_instance, obj_pCreateInfo, obj_pAllocator, obj_result, instance, pCreateInfo, pAllocator, result);

	if(obj_result != NULL){
		 env->ReleaseIntArrayElements(obj_result, (jint*)result, 0);
	}

	return JNI_returnValue;
}

static inline jobject wrapped_Java_bor_vulkan_Vk10_vkCreateXcbSurfaceKHR0
(JNIEnv* env, jclass clazz, jobject obj_instance, jobject obj_pCreateInfo, jobject obj_pAllocator, jintArray obj_result, char* instance, char* pCreateInfo, char* pAllocator, int* result) {

//@line:7766

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
             
}

JNIEXPORT jobject JNICALL Java_bor_vulkan_Vk10_vkCreateXcbSurfaceKHR0(JNIEnv* env, jclass clazz, jobject obj_instance, jobject obj_pCreateInfo, jobject obj_pAllocator, jintArray obj_result) {
	char* instance = (char*)(obj_instance?env->GetDirectBufferAddress(obj_instance) : NULL);
	char* pCreateInfo = (char*)(obj_pCreateInfo?env->GetDirectBufferAddress(obj_pCreateInfo) : NULL);
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator) : NULL);
	int* result = (int*)(obj_result ? env->GetIntArrayElements(obj_result, 0) : NULL);

	jobject JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkCreateXcbSurfaceKHR0(env, clazz, obj_instance, obj_pCreateInfo, obj_pAllocator, obj_result, instance, pCreateInfo, pAllocator, result);

	if(obj_result != NULL){
		 env->ReleaseIntArrayElements(obj_result, (jint*)result, 0);
	}

	return JNI_returnValue;
}

static inline jobject wrapped_Java_bor_vulkan_Vk10_vkCreateXlibSurfaceKHR0
(JNIEnv* env, jclass clazz, jobject obj_instance, jobject obj_pCreateInfo, jobject obj_pAllocator, jintArray obj_result, char* instance, char* pCreateInfo, char* pAllocator, int* result) {

//@line:7821

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
              
}

JNIEXPORT jobject JNICALL Java_bor_vulkan_Vk10_vkCreateXlibSurfaceKHR0(JNIEnv* env, jclass clazz, jobject obj_instance, jobject obj_pCreateInfo, jobject obj_pAllocator, jintArray obj_result) {
	char* instance = (char*)(obj_instance?env->GetDirectBufferAddress(obj_instance) : NULL);
	char* pCreateInfo = (char*)(obj_pCreateInfo?env->GetDirectBufferAddress(obj_pCreateInfo) : NULL);
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator) : NULL);
	int* result = (int*)(obj_result ? env->GetIntArrayElements(obj_result, 0) : NULL);

	jobject JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkCreateXlibSurfaceKHR0(env, clazz, obj_instance, obj_pCreateInfo, obj_pAllocator, obj_result, instance, pCreateInfo, pAllocator, result);

	if(obj_result != NULL){
		 env->ReleaseIntArrayElements(obj_result, (jint*)result, 0);
	}

	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkDestroySurfaceKHR0(JNIEnv* env, jclass clazz, jobject obj_instance, jobject obj_surface, jobject obj_pAllocator) {
	char* instance = (char*)(obj_instance?env->GetDirectBufferAddress(obj_instance) : NULL);
	char* surface = (char*)(obj_surface?env->GetDirectBufferAddress(obj_surface) : NULL);
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator) : NULL);


//@line:7868

         vkDestroySurfaceKHR((VkInstance)   instance,
                             (VkSurfaceKHR) surface,
                             (VkAllocationCallbacks*)   pAllocator);
                                                     
                                                 
     

}

static inline jobject wrapped_Java_bor_vulkan_Vk10_vkCreateDisplayPlaneSurfaceKHR0
(JNIEnv* env, jclass clazz, jobject obj_instance, jobject obj_pCreateInfo, jobject obj_pAllocator, jintArray obj_result, char* instance, char* pCreateInfo, char* pAllocator, int* result) {

//@line:7902

                        
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
                                                                 
    
}

JNIEXPORT jobject JNICALL Java_bor_vulkan_Vk10_vkCreateDisplayPlaneSurfaceKHR0(JNIEnv* env, jclass clazz, jobject obj_instance, jobject obj_pCreateInfo, jobject obj_pAllocator, jintArray obj_result) {
	char* instance = (char*)(obj_instance?env->GetDirectBufferAddress(obj_instance) : NULL);
	char* pCreateInfo = (char*)(obj_pCreateInfo?env->GetDirectBufferAddress(obj_pCreateInfo) : NULL);
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator) : NULL);
	int* result = (int*)(obj_result ? env->GetIntArrayElements(obj_result, 0) : NULL);

	jobject JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkCreateDisplayPlaneSurfaceKHR0(env, clazz, obj_instance, obj_pCreateInfo, obj_pAllocator, obj_result, instance, pCreateInfo, pAllocator, result);

	if(obj_result != NULL){
		 env->ReleaseIntArrayElements(obj_result, (jint*)result, 0);
	}

	return JNI_returnValue;
}

