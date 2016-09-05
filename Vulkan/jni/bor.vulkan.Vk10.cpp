#include <bor.vulkan.Vk10.h>

//@line:105

     
      
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


//@line:246

       jclass bufferClassLocal = env->FindClass("java/nio/ByteBuffer");
       byteBufferClass = reinterpret_cast<jclass>(env->NewGlobalRef(bufferClassLocal));
       
       init();
       isVulkanAvailable =  (InitVulkan() != 0);
       
    

}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_sizeOfDispatchableHandle(JNIEnv* env, jclass clazz) {


//@line:267

        return(jint) sizeof(VkInstance);
    

}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_sizeOfNonDispatchableHandle(JNIEnv* env, jclass clazz) {


//@line:275

        return(jint) sizeof(VkSemaphore);
    

}

JNIEXPORT jboolean JNICALL Java_bor_vulkan_Vk10_isVulkanAvailable(JNIEnv* env, jclass clazz) {


//@line:283

       return (jboolean) isVulkanAvailable;
    
    

}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkCreateInstance0
(JNIEnv* env, jclass clazz, jobject obj_pCreateInfo, jobject obj_pAllocator, jobject obj_pInstance, char* pCreateInfo, char* pAllocator, char* pInstance) {

//@line:335
 
	VkResult res = vkCreateInstance(
			(const VkInstanceCreateInfo*) pCreateInfo,
			(const VkAllocationCallbacks*) pAllocator,
			(VkInstance*) pInstance);
	 return (jint) res;
  
}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkCreateInstance0(JNIEnv* env, jclass clazz, jobject obj_pCreateInfo, jobject obj_pAllocator, jobject obj_pInstance) {
	char* pCreateInfo = (char*)(obj_pCreateInfo?env->GetDirectBufferAddress(obj_pCreateInfo) : NULL);
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator) : NULL);
	char* pInstance = (char*)(obj_pInstance?env->GetDirectBufferAddress(obj_pInstance) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkCreateInstance0(env, clazz, obj_pCreateInfo, obj_pAllocator, obj_pInstance, pCreateInfo, pAllocator, pInstance);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkDestroyInstance0(JNIEnv* env, jclass clazz, jlong instance, jobject obj_pAllocator) {
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator) : NULL);


//@line:376
 
	vkDestroyInstance(
			(VkInstance) reinterpret_cast<VkInstance>(instance),
			(const VkAllocationCallbacks*) pAllocator);

  

}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkEnumeratePhysicalDevices0
(JNIEnv* env, jclass clazz, jlong instance, jintArray obj_pPhysicalDeviceCount, jobject obj_pPhysicalDevices, char* pPhysicalDevices, int* pPhysicalDeviceCount) {

//@line:429
 
	VkResult res = vkEnumeratePhysicalDevices(
			(VkInstance) reinterpret_cast<VkInstance>(instance),
			(uint32_t*) pPhysicalDeviceCount,
			(VkPhysicalDevice*) pPhysicalDevices);
	 return (jint) res;
  
}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkEnumeratePhysicalDevices0(JNIEnv* env, jclass clazz, jlong instance, jintArray obj_pPhysicalDeviceCount, jobject obj_pPhysicalDevices) {
	char* pPhysicalDevices = (char*)(obj_pPhysicalDevices?env->GetDirectBufferAddress(obj_pPhysicalDevices) : NULL);
	int* pPhysicalDeviceCount = (int*)(obj_pPhysicalDeviceCount ? env->GetIntArrayElements(obj_pPhysicalDeviceCount, 0) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkEnumeratePhysicalDevices0(env, clazz, instance, obj_pPhysicalDeviceCount, obj_pPhysicalDevices, pPhysicalDevices, pPhysicalDeviceCount);

	if(obj_pPhysicalDeviceCount != NULL){
		 env->ReleaseIntArrayElements(obj_pPhysicalDeviceCount, (jint*)pPhysicalDeviceCount, 0);
	}

	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkGetPhysicalDeviceFeatures0(JNIEnv* env, jclass clazz, jlong physicalDevice, jobject obj_pFeatures) {
	char* pFeatures = (char*)(obj_pFeatures?env->GetDirectBufferAddress(obj_pFeatures) : NULL);


//@line:470
 
	vkGetPhysicalDeviceFeatures(
			(VkPhysicalDevice) reinterpret_cast<VkPhysicalDevice>(physicalDevice),
			(VkPhysicalDeviceFeatures*) pFeatures);

  

}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkGetPhysicalDeviceFormatProperties0(JNIEnv* env, jclass clazz, jlong physicalDevice, jint format, jobject obj_pFormatProperties) {
	char* pFormatProperties = (char*)(obj_pFormatProperties?env->GetDirectBufferAddress(obj_pFormatProperties) : NULL);


//@line:516
 
	vkGetPhysicalDeviceFormatProperties(
			(VkPhysicalDevice) reinterpret_cast<VkPhysicalDevice>(physicalDevice),
			(VkFormat) format,
			(VkFormatProperties*) pFormatProperties);

  

}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkGetPhysicalDeviceImageFormatProperties0
(JNIEnv* env, jclass clazz, jlong physicalDevice, jint format, jint type, jint tiling, jint usage, jint flags, jobject obj_pImageFormatProperties, char* pImageFormatProperties) {

//@line:591
 
	VkResult res = vkGetPhysicalDeviceImageFormatProperties(
			(VkPhysicalDevice) reinterpret_cast<VkPhysicalDevice>(physicalDevice),
			(VkFormat) format,
			(VkImageType) type,
			(VkImageTiling) tiling,
			(VkImageUsageFlags) usage,
			(VkImageCreateFlags) flags,
			(VkImageFormatProperties*) pImageFormatProperties);
	 return (jint) res;
  
}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkGetPhysicalDeviceImageFormatProperties0(JNIEnv* env, jclass clazz, jlong physicalDevice, jint format, jint type, jint tiling, jint usage, jint flags, jobject obj_pImageFormatProperties) {
	char* pImageFormatProperties = (char*)(obj_pImageFormatProperties?env->GetDirectBufferAddress(obj_pImageFormatProperties) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkGetPhysicalDeviceImageFormatProperties0(env, clazz, physicalDevice, format, type, tiling, usage, flags, obj_pImageFormatProperties, pImageFormatProperties);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkGetPhysicalDeviceProperties0(JNIEnv* env, jclass clazz, jlong physicalDevice, jobject obj_pProperties) {
	char* pProperties = (char*)(obj_pProperties?env->GetDirectBufferAddress(obj_pProperties) : NULL);


//@line:636
 
	vkGetPhysicalDeviceProperties(
			(VkPhysicalDevice) reinterpret_cast<VkPhysicalDevice>(physicalDevice),
			(VkPhysicalDeviceProperties*) pProperties);

  

}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkGetPhysicalDeviceQueueFamilyProperties0(JNIEnv* env, jclass clazz, jlong physicalDevice, jintArray obj_pQueueFamilyPropertyCount, jobject obj_pQueueFamilyProperties) {
	char* pQueueFamilyProperties = (char*)(obj_pQueueFamilyProperties?env->GetDirectBufferAddress(obj_pQueueFamilyProperties) : NULL);
	int* pQueueFamilyPropertyCount = (int*)(obj_pQueueFamilyPropertyCount ? env->GetIntArrayElements(obj_pQueueFamilyPropertyCount, 0) : NULL);


//@line:685
 
	vkGetPhysicalDeviceQueueFamilyProperties(
			(VkPhysicalDevice) reinterpret_cast<VkPhysicalDevice>(physicalDevice),
			(uint32_t*) pQueueFamilyPropertyCount,
			(VkQueueFamilyProperties*) pQueueFamilyProperties);

  
	if(obj_pQueueFamilyPropertyCount != NULL){
		 env->ReleaseIntArrayElements(obj_pQueueFamilyPropertyCount, (jint*)pQueueFamilyPropertyCount, 0);
	}

}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkGetPhysicalDeviceMemoryProperties0(JNIEnv* env, jclass clazz, jlong physicalDevice, jobject obj_pMemoryProperties) {
	char* pMemoryProperties = (char*)(obj_pMemoryProperties?env->GetDirectBufferAddress(obj_pMemoryProperties) : NULL);


//@line:726
 
	vkGetPhysicalDeviceMemoryProperties(
			(VkPhysicalDevice) reinterpret_cast<VkPhysicalDevice>(physicalDevice),
			(VkPhysicalDeviceMemoryProperties*) pMemoryProperties);

  

}

static inline jlong wrapped_Java_bor_vulkan_Vk10_vkGetInstanceProcAddr0
(JNIEnv* env, jclass clazz, jlong instance, jstring obj_pName, char* pName) {

//@line:770
 
	PFN_vkVoidFunction res = vkGetInstanceProcAddr(
			(VkInstance) reinterpret_cast<VkInstance>(instance),
			(const char*) pName);
	 return (jlong) res;
  
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_Vk10_vkGetInstanceProcAddr0(JNIEnv* env, jclass clazz, jlong instance, jstring obj_pName) {
	char* pName = (char*)(obj_pName ? env->GetStringUTFChars(obj_pName, 0) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkGetInstanceProcAddr0(env, clazz, instance, obj_pName, pName);

	 if(obj_pName != NULL){
		 env->ReleaseStringUTFChars(obj_pName, pName);
	 }

	return JNI_returnValue;
}

static inline jlong wrapped_Java_bor_vulkan_Vk10_vkGetDeviceProcAddr0
(JNIEnv* env, jclass clazz, jlong device, jstring obj_pName, char* pName) {

//@line:814
 
	PFN_vkVoidFunction res = vkGetDeviceProcAddr(
			(VkDevice) reinterpret_cast<VkDevice>(device),
			(const char*) pName);
	 return (jlong) res;
  
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_Vk10_vkGetDeviceProcAddr0(JNIEnv* env, jclass clazz, jlong device, jstring obj_pName) {
	char* pName = (char*)(obj_pName ? env->GetStringUTFChars(obj_pName, 0) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkGetDeviceProcAddr0(env, clazz, device, obj_pName, pName);

	 if(obj_pName != NULL){
		 env->ReleaseStringUTFChars(obj_pName, pName);
	 }

	return JNI_returnValue;
}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkCreateDevice0
(JNIEnv* env, jclass clazz, jlong physicalDevice, jobject obj_pCreateInfo, jobject obj_pAllocator, jobject obj_pDevice, char* pCreateInfo, char* pAllocator, char* pDevice) {

//@line:873
 
	VkResult res = vkCreateDevice(
			(VkPhysicalDevice) reinterpret_cast<VkPhysicalDevice>(physicalDevice),
			(const VkDeviceCreateInfo*) pCreateInfo,
			(const VkAllocationCallbacks*) pAllocator,
			(VkDevice*) pDevice);
	 return (jint) res;
  
}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkCreateDevice0(JNIEnv* env, jclass clazz, jlong physicalDevice, jobject obj_pCreateInfo, jobject obj_pAllocator, jobject obj_pDevice) {
	char* pCreateInfo = (char*)(obj_pCreateInfo?env->GetDirectBufferAddress(obj_pCreateInfo) : NULL);
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator) : NULL);
	char* pDevice = (char*)(obj_pDevice?env->GetDirectBufferAddress(obj_pDevice) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkCreateDevice0(env, clazz, physicalDevice, obj_pCreateInfo, obj_pAllocator, obj_pDevice, pCreateInfo, pAllocator, pDevice);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkDestroyDevice0(JNIEnv* env, jclass clazz, jlong device, jobject obj_pAllocator) {
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator) : NULL);


//@line:915
 
	vkDestroyDevice(
			(VkDevice) reinterpret_cast<VkDevice>(device),
			(const VkAllocationCallbacks*) pAllocator);

  

}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkEnumerateInstanceExtensionProperties0
(JNIEnv* env, jclass clazz, jstring obj_pLayerName, jintArray obj_pPropertyCount, jobject obj_pProperties, char* pProperties, char* pLayerName, int* pPropertyCount) {

//@line:968
 
	VkResult res = vkEnumerateInstanceExtensionProperties(
			(const char*) pLayerName,
			(uint32_t*) pPropertyCount,
			(VkExtensionProperties*) pProperties);
	 return (jint) res;
  
}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkEnumerateInstanceExtensionProperties0(JNIEnv* env, jclass clazz, jstring obj_pLayerName, jintArray obj_pPropertyCount, jobject obj_pProperties) {
	char* pProperties = (char*)(obj_pProperties?env->GetDirectBufferAddress(obj_pProperties) : NULL);
	char* pLayerName = (char*)(obj_pLayerName ? env->GetStringUTFChars(obj_pLayerName, 0) : NULL);
	int* pPropertyCount = (int*)(obj_pPropertyCount ? env->GetIntArrayElements(obj_pPropertyCount, 0) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkEnumerateInstanceExtensionProperties0(env, clazz, obj_pLayerName, obj_pPropertyCount, obj_pProperties, pProperties, pLayerName, pPropertyCount);

	if(obj_pPropertyCount != NULL){
		 env->ReleaseIntArrayElements(obj_pPropertyCount, (jint*)pPropertyCount, 0);
	}
	 if(obj_pLayerName != NULL){
		 env->ReleaseStringUTFChars(obj_pLayerName, pLayerName);
	 }

	return JNI_returnValue;
}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkEnumerateDeviceExtensionProperties0
(JNIEnv* env, jclass clazz, jlong physicalDevice, jstring obj_pLayerName, jintArray obj_pPropertyCount, jobject obj_pProperties, char* pProperties, char* pLayerName, int* pPropertyCount) {

//@line:1028
 
	VkResult res = vkEnumerateDeviceExtensionProperties(
			(VkPhysicalDevice) reinterpret_cast<VkPhysicalDevice>(physicalDevice),
			(const char*) pLayerName,
			(uint32_t*) pPropertyCount,
			(VkExtensionProperties*) pProperties);
	 return (jint) res;
  
}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkEnumerateDeviceExtensionProperties0(JNIEnv* env, jclass clazz, jlong physicalDevice, jstring obj_pLayerName, jintArray obj_pPropertyCount, jobject obj_pProperties) {
	char* pProperties = (char*)(obj_pProperties?env->GetDirectBufferAddress(obj_pProperties) : NULL);
	char* pLayerName = (char*)(obj_pLayerName ? env->GetStringUTFChars(obj_pLayerName, 0) : NULL);
	int* pPropertyCount = (int*)(obj_pPropertyCount ? env->GetIntArrayElements(obj_pPropertyCount, 0) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkEnumerateDeviceExtensionProperties0(env, clazz, physicalDevice, obj_pLayerName, obj_pPropertyCount, obj_pProperties, pProperties, pLayerName, pPropertyCount);

	if(obj_pPropertyCount != NULL){
		 env->ReleaseIntArrayElements(obj_pPropertyCount, (jint*)pPropertyCount, 0);
	}
	 if(obj_pLayerName != NULL){
		 env->ReleaseStringUTFChars(obj_pLayerName, pLayerName);
	 }

	return JNI_returnValue;
}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkEnumerateInstanceLayerProperties0
(JNIEnv* env, jclass clazz, jintArray obj_pPropertyCount, jobject obj_pProperties, char* pProperties, int* pPropertyCount) {

//@line:1077
 
	VkResult res = vkEnumerateInstanceLayerProperties(
			(uint32_t*) pPropertyCount,
			(VkLayerProperties*) pProperties);
	 return (jint) res;
  
}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkEnumerateInstanceLayerProperties0(JNIEnv* env, jclass clazz, jintArray obj_pPropertyCount, jobject obj_pProperties) {
	char* pProperties = (char*)(obj_pProperties?env->GetDirectBufferAddress(obj_pProperties) : NULL);
	int* pPropertyCount = (int*)(obj_pPropertyCount ? env->GetIntArrayElements(obj_pPropertyCount, 0) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkEnumerateInstanceLayerProperties0(env, clazz, obj_pPropertyCount, obj_pProperties, pProperties, pPropertyCount);

	if(obj_pPropertyCount != NULL){
		 env->ReleaseIntArrayElements(obj_pPropertyCount, (jint*)pPropertyCount, 0);
	}

	return JNI_returnValue;
}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkEnumerateDeviceLayerProperties0
(JNIEnv* env, jclass clazz, jlong physicalDevice, jintArray obj_pPropertyCount, jobject obj_pProperties, char* pProperties, int* pPropertyCount) {

//@line:1130
 
	VkResult res = vkEnumerateDeviceLayerProperties(
			(VkPhysicalDevice) reinterpret_cast<VkPhysicalDevice>(physicalDevice),
			(uint32_t*) pPropertyCount,
			(VkLayerProperties*) pProperties);
	 return (jint) res;
  
}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkEnumerateDeviceLayerProperties0(JNIEnv* env, jclass clazz, jlong physicalDevice, jintArray obj_pPropertyCount, jobject obj_pProperties) {
	char* pProperties = (char*)(obj_pProperties?env->GetDirectBufferAddress(obj_pProperties) : NULL);
	int* pPropertyCount = (int*)(obj_pPropertyCount ? env->GetIntArrayElements(obj_pPropertyCount, 0) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkEnumerateDeviceLayerProperties0(env, clazz, physicalDevice, obj_pPropertyCount, obj_pProperties, pProperties, pPropertyCount);

	if(obj_pPropertyCount != NULL){
		 env->ReleaseIntArrayElements(obj_pPropertyCount, (jint*)pPropertyCount, 0);
	}

	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkGetDeviceQueue0(JNIEnv* env, jclass clazz, jlong device, jint queueFamilyIndex, jint queueIndex, jlong pQueue) {


//@line:1183
 
	vkGetDeviceQueue(
			(VkDevice) reinterpret_cast<VkDevice>(device),
			(uint32_t) queueFamilyIndex,
			(uint32_t) queueIndex,
			(VkQueue*) pQueue);

  

}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkQueueSubmit0
(JNIEnv* env, jclass clazz, jlong queue, jint submitCount, jobject obj_pSubmits, jlong fence, char* pSubmits) {

//@line:1245
 
	VkResult res = vkQueueSubmit(
			(VkQueue) reinterpret_cast<VkQueue>(queue),
			(uint32_t) submitCount,
			(const VkSubmitInfo*) pSubmits,
			(VkFence) reinterpret_cast<VkFence>(fence));
	 return (jint) res;
  
}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkQueueSubmit0(JNIEnv* env, jclass clazz, jlong queue, jint submitCount, jobject obj_pSubmits, jlong fence) {
	char* pSubmits = (char*)(obj_pSubmits?env->GetDirectBufferAddress(obj_pSubmits) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkQueueSubmit0(env, clazz, queue, submitCount, obj_pSubmits, fence, pSubmits);


	return JNI_returnValue;
}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkQueueWaitIdle0(JNIEnv* env, jclass clazz, jlong queue) {


//@line:1285
 
	VkResult res = vkQueueWaitIdle(
			(VkQueue) reinterpret_cast<VkQueue>(queue));
	 return (jint) res;
  

}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkDeviceWaitIdle0(JNIEnv* env, jclass clazz, jlong device) {


//@line:1322
 
	VkResult res = vkDeviceWaitIdle(
			(VkDevice) reinterpret_cast<VkDevice>(device));
	 return (jint) res;
  

}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkAllocateMemory0
(JNIEnv* env, jclass clazz, jlong device, jobject obj_pAllocateInfo, jobject obj_pAllocator, jlong pMemory, char* pAllocateInfo, char* pAllocator) {

//@line:1377
 
	VkResult res = vkAllocateMemory(
			(VkDevice) reinterpret_cast<VkDevice>(device),
			(const VkMemoryAllocateInfo*) pAllocateInfo,
			(const VkAllocationCallbacks*) pAllocator,
			(VkDeviceMemory*) pMemory);
	 return (jint) res;
  
}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkAllocateMemory0(JNIEnv* env, jclass clazz, jlong device, jobject obj_pAllocateInfo, jobject obj_pAllocator, jlong pMemory) {
	char* pAllocateInfo = (char*)(obj_pAllocateInfo?env->GetDirectBufferAddress(obj_pAllocateInfo) : NULL);
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkAllocateMemory0(env, clazz, device, obj_pAllocateInfo, obj_pAllocator, pMemory, pAllocateInfo, pAllocator);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkFreeMemory0(JNIEnv* env, jclass clazz, jlong device, jlong memory, jobject obj_pAllocator) {
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator) : NULL);


//@line:1425
 
	vkFreeMemory(
			(VkDevice) reinterpret_cast<VkDevice>(device),
			(VkDeviceMemory) reinterpret_cast<VkDeviceMemory>(memory),
			(const VkAllocationCallbacks*) pAllocator);

  

}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkMapMemory0
(JNIEnv* env, jclass clazz, jlong device, jlong memory, jlong offset, jlong size, jint flags, jobject obj_ppData, char* ppData) {

//@line:1494
 
	VkResult res = vkMapMemory(
			(VkDevice) reinterpret_cast<VkDevice>(device),
			(VkDeviceMemory) reinterpret_cast<VkDeviceMemory>(memory),
			(VkDeviceSize) offset,
			(VkDeviceSize) size,
			(VkMemoryMapFlags) flags,
			(void**) ppData);
	 return (jint) res;
  
}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkMapMemory0(JNIEnv* env, jclass clazz, jlong device, jlong memory, jlong offset, jlong size, jint flags, jobject obj_ppData) {
	char* ppData = (char*)(obj_ppData?env->GetDirectBufferAddress(obj_ppData) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkMapMemory0(env, clazz, device, memory, offset, size, flags, obj_ppData, ppData);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkUnmapMemory0(JNIEnv* env, jclass clazz, jlong device, jlong memory) {


//@line:1538
 
	vkUnmapMemory(
			(VkDevice) reinterpret_cast<VkDevice>(device),
			(VkDeviceMemory) reinterpret_cast<VkDeviceMemory>(memory));

  

}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkFlushMappedMemoryRanges0
(JNIEnv* env, jclass clazz, jlong device, jint memoryRangeCount, jobject obj_pMemoryRanges, char* pMemoryRanges) {

//@line:1591
 
	VkResult res = vkFlushMappedMemoryRanges(
			(VkDevice) reinterpret_cast<VkDevice>(device),
			(uint32_t) memoryRangeCount,
			(const VkMappedMemoryRange*) pMemoryRanges);
	 return (jint) res;
  
}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkFlushMappedMemoryRanges0(JNIEnv* env, jclass clazz, jlong device, jint memoryRangeCount, jobject obj_pMemoryRanges) {
	char* pMemoryRanges = (char*)(obj_pMemoryRanges?env->GetDirectBufferAddress(obj_pMemoryRanges) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkFlushMappedMemoryRanges0(env, clazz, device, memoryRangeCount, obj_pMemoryRanges, pMemoryRanges);


	return JNI_returnValue;
}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkInvalidateMappedMemoryRanges0
(JNIEnv* env, jclass clazz, jlong device, jint memoryRangeCount, jobject obj_pMemoryRanges, char* pMemoryRanges) {

//@line:1645
 
	VkResult res = vkInvalidateMappedMemoryRanges(
			(VkDevice) reinterpret_cast<VkDevice>(device),
			(uint32_t) memoryRangeCount,
			(const VkMappedMemoryRange*) pMemoryRanges);
	 return (jint) res;
  
}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkInvalidateMappedMemoryRanges0(JNIEnv* env, jclass clazz, jlong device, jint memoryRangeCount, jobject obj_pMemoryRanges) {
	char* pMemoryRanges = (char*)(obj_pMemoryRanges?env->GetDirectBufferAddress(obj_pMemoryRanges) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkInvalidateMappedMemoryRanges0(env, clazz, device, memoryRangeCount, obj_pMemoryRanges, pMemoryRanges);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkGetDeviceMemoryCommitment0(JNIEnv* env, jclass clazz, jlong device, jlong memory, jlongArray obj_pCommittedMemoryInBytes) {
	long long* pCommittedMemoryInBytes = (long long*)(obj_pCommittedMemoryInBytes ? env->GetLongArrayElements(obj_pCommittedMemoryInBytes, 0) : NULL);


//@line:1692
 
	vkGetDeviceMemoryCommitment(
			(VkDevice) reinterpret_cast<VkDevice>(device),
			(VkDeviceMemory) reinterpret_cast<VkDeviceMemory>(memory),
			(VkDeviceSize*) pCommittedMemoryInBytes);

  
	if(obj_pCommittedMemoryInBytes != NULL){
		 env->ReleaseLongArrayElements(obj_pCommittedMemoryInBytes, (jlong*)pCommittedMemoryInBytes, 0);
	}

}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkBindBufferMemory0(JNIEnv* env, jclass clazz, jlong device, jlong buffer, jlong memory, jlong memoryOffset) {


//@line:1749
 
	VkResult res = vkBindBufferMemory(
			(VkDevice) reinterpret_cast<VkDevice>(device),
			(VkBuffer) reinterpret_cast<VkBuffer>(buffer),
			(VkDeviceMemory) reinterpret_cast<VkDeviceMemory>(memory),
			(VkDeviceSize) memoryOffset);
	 return (jint) res;
  

}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkBindImageMemory0(JNIEnv* env, jclass clazz, jlong device, jlong image, jlong memory, jlong memoryOffset) {


//@line:1807
 
	VkResult res = vkBindImageMemory(
			(VkDevice) reinterpret_cast<VkDevice>(device),
			(VkImage) reinterpret_cast<VkImage>(image),
			(VkDeviceMemory) reinterpret_cast<VkDeviceMemory>(memory),
			(VkDeviceSize) memoryOffset);
	 return (jint) res;
  

}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkGetBufferMemoryRequirements0(JNIEnv* env, jclass clazz, jlong device, jlong buffer, jobject obj_pMemoryRequirements) {
	char* pMemoryRequirements = (char*)(obj_pMemoryRequirements?env->GetDirectBufferAddress(obj_pMemoryRequirements) : NULL);


//@line:1855
 
	vkGetBufferMemoryRequirements(
			(VkDevice) reinterpret_cast<VkDevice>(device),
			(VkBuffer) reinterpret_cast<VkBuffer>(buffer),
			(VkMemoryRequirements*) pMemoryRequirements);

  

}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkGetImageMemoryRequirements0(JNIEnv* env, jclass clazz, jlong device, jlong image, jobject obj_pMemoryRequirements) {
	char* pMemoryRequirements = (char*)(obj_pMemoryRequirements?env->GetDirectBufferAddress(obj_pMemoryRequirements) : NULL);


//@line:1902
 
	vkGetImageMemoryRequirements(
			(VkDevice) reinterpret_cast<VkDevice>(device),
			(VkImage) reinterpret_cast<VkImage>(image),
			(VkMemoryRequirements*) pMemoryRequirements);

  

}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkGetImageSparseMemoryRequirements0(JNIEnv* env, jclass clazz, jlong device, jlong image, jintArray obj_pSparseMemoryRequirementCount, jobject obj_pSparseMemoryRequirements) {
	char* pSparseMemoryRequirements = (char*)(obj_pSparseMemoryRequirements?env->GetDirectBufferAddress(obj_pSparseMemoryRequirements) : NULL);
	int* pSparseMemoryRequirementCount = (int*)(obj_pSparseMemoryRequirementCount ? env->GetIntArrayElements(obj_pSparseMemoryRequirementCount, 0) : NULL);


//@line:1958
 
	vkGetImageSparseMemoryRequirements(
			(VkDevice) reinterpret_cast<VkDevice>(device),
			(VkImage) reinterpret_cast<VkImage>(image),
			(uint32_t*) pSparseMemoryRequirementCount,
			(VkSparseImageMemoryRequirements*) pSparseMemoryRequirements);

  
	if(obj_pSparseMemoryRequirementCount != NULL){
		 env->ReleaseIntArrayElements(obj_pSparseMemoryRequirementCount, (jint*)pSparseMemoryRequirementCount, 0);
	}

}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkGetPhysicalDeviceSparseImageFormatProperties0(JNIEnv* env, jclass clazz, jlong physicalDevice, jint format, jint type, jint samples, jint usage, jint tiling, jintArray obj_pPropertyCount, jobject obj_pProperties) {
	char* pProperties = (char*)(obj_pProperties?env->GetDirectBufferAddress(obj_pProperties) : NULL);
	int* pPropertyCount = (int*)(obj_pPropertyCount ? env->GetIntArrayElements(obj_pPropertyCount, 0) : NULL);


//@line:2039
 
	vkGetPhysicalDeviceSparseImageFormatProperties(
			(VkPhysicalDevice) reinterpret_cast<VkPhysicalDevice>(physicalDevice),
			(VkFormat) format,
			(VkImageType) type,
			(VkSampleCountFlagBits) samples,
			(VkImageUsageFlags) usage,
			(VkImageTiling) tiling,
			(uint32_t*) pPropertyCount,
			(VkSparseImageFormatProperties*) pProperties);

  
	if(obj_pPropertyCount != NULL){
		 env->ReleaseIntArrayElements(obj_pPropertyCount, (jint*)pPropertyCount, 0);
	}

}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkQueueBindSparse0
(JNIEnv* env, jclass clazz, jlong queue, jint bindInfoCount, jobject obj_pBindInfo, jlong fence, char* pBindInfo) {

//@line:2105
 
	VkResult res = vkQueueBindSparse(
			(VkQueue) reinterpret_cast<VkQueue>(queue),
			(uint32_t) bindInfoCount,
			(const VkBindSparseInfo*) pBindInfo,
			(VkFence) reinterpret_cast<VkFence>(fence));
	 return (jint) res;
  
}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkQueueBindSparse0(JNIEnv* env, jclass clazz, jlong queue, jint bindInfoCount, jobject obj_pBindInfo, jlong fence) {
	char* pBindInfo = (char*)(obj_pBindInfo?env->GetDirectBufferAddress(obj_pBindInfo) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkQueueBindSparse0(env, clazz, queue, bindInfoCount, obj_pBindInfo, fence, pBindInfo);


	return JNI_returnValue;
}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkCreateFence0
(JNIEnv* env, jclass clazz, jlong device, jobject obj_pCreateInfo, jobject obj_pAllocator, jobject obj_pFence, char* pCreateInfo, char* pAllocator, char* pFence) {

//@line:2166
 
	VkResult res = vkCreateFence(
			(VkDevice) reinterpret_cast<VkDevice>(device),
			(const VkFenceCreateInfo*) pCreateInfo,
			(const VkAllocationCallbacks*) pAllocator,
			(VkFence*) pFence);
	 return (jint) res;
  
}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkCreateFence0(JNIEnv* env, jclass clazz, jlong device, jobject obj_pCreateInfo, jobject obj_pAllocator, jobject obj_pFence) {
	char* pCreateInfo = (char*)(obj_pCreateInfo?env->GetDirectBufferAddress(obj_pCreateInfo) : NULL);
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator) : NULL);
	char* pFence = (char*)(obj_pFence?env->GetDirectBufferAddress(obj_pFence) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkCreateFence0(env, clazz, device, obj_pCreateInfo, obj_pAllocator, obj_pFence, pCreateInfo, pAllocator, pFence);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkDestroyFence0(JNIEnv* env, jclass clazz, jlong device, jlong fence, jobject obj_pAllocator) {
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator) : NULL);


//@line:2214
 
	vkDestroyFence(
			(VkDevice) reinterpret_cast<VkDevice>(device),
			(VkFence) reinterpret_cast<VkFence>(fence),
			(const VkAllocationCallbacks*) pAllocator);

  

}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkResetFences0
(JNIEnv* env, jclass clazz, jlong device, jint fenceCount, jobject obj_pFences, char* pFences) {

//@line:2268
 
	VkResult res = vkResetFences(
			(VkDevice) reinterpret_cast<VkDevice>(device),
			(uint32_t) fenceCount,
			(const VkFence*) pFences);
	 return (jint) res;
  
}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkResetFences0(JNIEnv* env, jclass clazz, jlong device, jint fenceCount, jobject obj_pFences) {
	char* pFences = (char*)(obj_pFences?env->GetDirectBufferAddress(obj_pFences) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkResetFences0(env, clazz, device, fenceCount, obj_pFences, pFences);


	return JNI_returnValue;
}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkGetFenceStatus0(JNIEnv* env, jclass clazz, jlong device, jlong fence) {


//@line:2313
 
	VkResult res = vkGetFenceStatus(
			(VkDevice) reinterpret_cast<VkDevice>(device),
			(VkFence) reinterpret_cast<VkFence>(fence));
	 return (jint) res;
  

}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkWaitForFences0
(JNIEnv* env, jclass clazz, jlong device, jint fenceCount, jobject obj_pFences, jboolean waitAll, jlong timeout, char* pFences) {

//@line:2378
 
	VkResult res = vkWaitForFences(
			(VkDevice) reinterpret_cast<VkDevice>(device),
			(uint32_t) fenceCount,
			(const VkFence*) pFences,
			(VkBool32) waitAll,
			(uint64_t) timeout);
	 return (jint) res;
  
}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkWaitForFences0(JNIEnv* env, jclass clazz, jlong device, jint fenceCount, jobject obj_pFences, jboolean waitAll, jlong timeout) {
	char* pFences = (char*)(obj_pFences?env->GetDirectBufferAddress(obj_pFences) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkWaitForFences0(env, clazz, device, fenceCount, obj_pFences, waitAll, timeout, pFences);


	return JNI_returnValue;
}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkCreateSemaphore0
(JNIEnv* env, jclass clazz, jlong device, jobject obj_pCreateInfo, jobject obj_pAllocator, jobject obj_pSemaphore, char* pCreateInfo, char* pAllocator, char* pSemaphore) {

//@line:2440
 
	VkResult res = vkCreateSemaphore(
			(VkDevice) reinterpret_cast<VkDevice>(device),
			(const VkSemaphoreCreateInfo*) pCreateInfo,
			(const VkAllocationCallbacks*) pAllocator,
			(VkSemaphore*) pSemaphore);
	 return (jint) res;
  
}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkCreateSemaphore0(JNIEnv* env, jclass clazz, jlong device, jobject obj_pCreateInfo, jobject obj_pAllocator, jobject obj_pSemaphore) {
	char* pCreateInfo = (char*)(obj_pCreateInfo?env->GetDirectBufferAddress(obj_pCreateInfo) : NULL);
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator) : NULL);
	char* pSemaphore = (char*)(obj_pSemaphore?env->GetDirectBufferAddress(obj_pSemaphore) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkCreateSemaphore0(env, clazz, device, obj_pCreateInfo, obj_pAllocator, obj_pSemaphore, pCreateInfo, pAllocator, pSemaphore);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkDestroySemaphore0(JNIEnv* env, jclass clazz, jlong device, jlong semaphore, jobject obj_pAllocator) {
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator) : NULL);


//@line:2488
 
	vkDestroySemaphore(
			(VkDevice) reinterpret_cast<VkDevice>(device),
			(VkSemaphore) reinterpret_cast<VkSemaphore>(semaphore),
			(const VkAllocationCallbacks*) pAllocator);

  

}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkCreateEvent0
(JNIEnv* env, jclass clazz, jlong device, jobject obj_pCreateInfo, jobject obj_pAllocator, jobject obj_pEvent, char* pCreateInfo, char* pAllocator, char* pEvent) {

//@line:2548
 
	VkResult res = vkCreateEvent(
			(VkDevice) reinterpret_cast<VkDevice>(device),
			(const VkEventCreateInfo*) pCreateInfo,
			(const VkAllocationCallbacks*) pAllocator,
			(VkEvent*) pEvent);
	 return (jint) res;
  
}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkCreateEvent0(JNIEnv* env, jclass clazz, jlong device, jobject obj_pCreateInfo, jobject obj_pAllocator, jobject obj_pEvent) {
	char* pCreateInfo = (char*)(obj_pCreateInfo?env->GetDirectBufferAddress(obj_pCreateInfo) : NULL);
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator) : NULL);
	char* pEvent = (char*)(obj_pEvent?env->GetDirectBufferAddress(obj_pEvent) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkCreateEvent0(env, clazz, device, obj_pCreateInfo, obj_pAllocator, obj_pEvent, pCreateInfo, pAllocator, pEvent);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkDestroyEvent0(JNIEnv* env, jclass clazz, jlong device, jlong event, jobject obj_pAllocator) {
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator) : NULL);


//@line:2596
 
	vkDestroyEvent(
			(VkDevice) reinterpret_cast<VkDevice>(device),
			(VkEvent) reinterpret_cast<VkEvent>(event),
			(const VkAllocationCallbacks*) pAllocator);

  

}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkGetEventStatus0(JNIEnv* env, jclass clazz, jlong device, jlong event) {


//@line:2641
 
	VkResult res = vkGetEventStatus(
			(VkDevice) reinterpret_cast<VkDevice>(device),
			(VkEvent) reinterpret_cast<VkEvent>(event));
	 return (jint) res;
  

}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkSetEvent0(JNIEnv* env, jclass clazz, jlong device, jlong event) {


//@line:2685
 
	VkResult res = vkSetEvent(
			(VkDevice) reinterpret_cast<VkDevice>(device),
			(VkEvent) reinterpret_cast<VkEvent>(event));
	 return (jint) res;
  

}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkResetEvent0(JNIEnv* env, jclass clazz, jlong device, jlong event) {


//@line:2729
 
	VkResult res = vkResetEvent(
			(VkDevice) reinterpret_cast<VkDevice>(device),
			(VkEvent) reinterpret_cast<VkEvent>(event));
	 return (jint) res;
  

}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkCreateQueryPool0
(JNIEnv* env, jclass clazz, jlong device, jobject obj_pCreateInfo, jobject obj_pAllocator, jobject obj_pQueryPool, char* pCreateInfo, char* pAllocator, char* pQueryPool) {

//@line:2788
 
	VkResult res = vkCreateQueryPool(
			(VkDevice) reinterpret_cast<VkDevice>(device),
			(const VkQueryPoolCreateInfo*) pCreateInfo,
			(const VkAllocationCallbacks*) pAllocator,
			(VkQueryPool*) pQueryPool);
	 return (jint) res;
  
}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkCreateQueryPool0(JNIEnv* env, jclass clazz, jlong device, jobject obj_pCreateInfo, jobject obj_pAllocator, jobject obj_pQueryPool) {
	char* pCreateInfo = (char*)(obj_pCreateInfo?env->GetDirectBufferAddress(obj_pCreateInfo) : NULL);
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator) : NULL);
	char* pQueryPool = (char*)(obj_pQueryPool?env->GetDirectBufferAddress(obj_pQueryPool) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkCreateQueryPool0(env, clazz, device, obj_pCreateInfo, obj_pAllocator, obj_pQueryPool, pCreateInfo, pAllocator, pQueryPool);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkDestroyQueryPool0(JNIEnv* env, jclass clazz, jlong device, jlong queryPool, jobject obj_pAllocator) {
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator) : NULL);


//@line:2836
 
	vkDestroyQueryPool(
			(VkDevice) reinterpret_cast<VkDevice>(device),
			(VkQueryPool) reinterpret_cast<VkQueryPool>(queryPool),
			(const VkAllocationCallbacks*) pAllocator);

  

}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkGetQueryPoolResults0
(JNIEnv* env, jclass clazz, jlong device, jlong queryPool, jint firstQuery, jint queryCount, jlong dataSize, jobject obj_pData, jlong stride, jint flags, unsigned char* pData) {

//@line:2917
 
	VkResult res = vkGetQueryPoolResults(
			(VkDevice) reinterpret_cast<VkDevice>(device),
			(VkQueryPool) reinterpret_cast<VkQueryPool>(queryPool),
			(uint32_t) firstQuery,
			(uint32_t) queryCount,
			(size_t) dataSize,
			(void*) pData,
			(VkDeviceSize) stride,
			(VkQueryResultFlags) flags);
	 return (jint) res;
  
}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkGetQueryPoolResults0(JNIEnv* env, jclass clazz, jlong device, jlong queryPool, jint firstQuery, jint queryCount, jlong dataSize, jobject obj_pData, jlong stride, jint flags) {
	unsigned char* pData = (unsigned char*)(obj_pData?env->GetDirectBufferAddress(obj_pData) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkGetQueryPoolResults0(env, clazz, device, queryPool, firstQuery, queryCount, dataSize, obj_pData, stride, flags, pData);


	return JNI_returnValue;
}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkCreateBuffer0
(JNIEnv* env, jclass clazz, jlong device, jobject obj_pCreateInfo, jobject obj_pAllocator, jobject obj_pBuffer, char* pCreateInfo, char* pAllocator, char* pBuffer) {

//@line:2982
 
	VkResult res = vkCreateBuffer(
			(VkDevice) reinterpret_cast<VkDevice>(device),
			(const VkBufferCreateInfo*) pCreateInfo,
			(const VkAllocationCallbacks*) pAllocator,
			(VkBuffer*) pBuffer);
	 return (jint) res;
  
}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkCreateBuffer0(JNIEnv* env, jclass clazz, jlong device, jobject obj_pCreateInfo, jobject obj_pAllocator, jobject obj_pBuffer) {
	char* pCreateInfo = (char*)(obj_pCreateInfo?env->GetDirectBufferAddress(obj_pCreateInfo) : NULL);
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator) : NULL);
	char* pBuffer = (char*)(obj_pBuffer?env->GetDirectBufferAddress(obj_pBuffer) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkCreateBuffer0(env, clazz, device, obj_pCreateInfo, obj_pAllocator, obj_pBuffer, pCreateInfo, pAllocator, pBuffer);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkDestroyBuffer0(JNIEnv* env, jclass clazz, jlong device, jlong buffer, jobject obj_pAllocator) {
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator) : NULL);


//@line:3030
 
	vkDestroyBuffer(
			(VkDevice) reinterpret_cast<VkDevice>(device),
			(VkBuffer) reinterpret_cast<VkBuffer>(buffer),
			(const VkAllocationCallbacks*) pAllocator);

  

}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkCreateBufferView0
(JNIEnv* env, jclass clazz, jlong device, jobject obj_pCreateInfo, jobject obj_pAllocator, jobject obj_pView, char* pCreateInfo, char* pAllocator, char* pView) {

//@line:3090
 
	VkResult res = vkCreateBufferView(
			(VkDevice) reinterpret_cast<VkDevice>(device),
			(const VkBufferViewCreateInfo*) pCreateInfo,
			(const VkAllocationCallbacks*) pAllocator,
			(VkBufferView*) pView);
	 return (jint) res;
  
}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkCreateBufferView0(JNIEnv* env, jclass clazz, jlong device, jobject obj_pCreateInfo, jobject obj_pAllocator, jobject obj_pView) {
	char* pCreateInfo = (char*)(obj_pCreateInfo?env->GetDirectBufferAddress(obj_pCreateInfo) : NULL);
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator) : NULL);
	char* pView = (char*)(obj_pView?env->GetDirectBufferAddress(obj_pView) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkCreateBufferView0(env, clazz, device, obj_pCreateInfo, obj_pAllocator, obj_pView, pCreateInfo, pAllocator, pView);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkDestroyBufferView0(JNIEnv* env, jclass clazz, jlong device, jlong bufferView, jobject obj_pAllocator) {
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator) : NULL);


//@line:3138
 
	vkDestroyBufferView(
			(VkDevice) reinterpret_cast<VkDevice>(device),
			(VkBufferView) reinterpret_cast<VkBufferView>(bufferView),
			(const VkAllocationCallbacks*) pAllocator);

  

}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkCreateImage0
(JNIEnv* env, jclass clazz, jlong device, jobject obj_pCreateInfo, jobject obj_pAllocator, jobject obj_pImage, char* pCreateInfo, char* pAllocator, char* pImage) {

//@line:3198
 
	VkResult res = vkCreateImage(
			(VkDevice) reinterpret_cast<VkDevice>(device),
			(const VkImageCreateInfo*) pCreateInfo,
			(const VkAllocationCallbacks*) pAllocator,
			(VkImage*) pImage);
	 return (jint) res;
  
}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkCreateImage0(JNIEnv* env, jclass clazz, jlong device, jobject obj_pCreateInfo, jobject obj_pAllocator, jobject obj_pImage) {
	char* pCreateInfo = (char*)(obj_pCreateInfo?env->GetDirectBufferAddress(obj_pCreateInfo) : NULL);
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator) : NULL);
	char* pImage = (char*)(obj_pImage?env->GetDirectBufferAddress(obj_pImage) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkCreateImage0(env, clazz, device, obj_pCreateInfo, obj_pAllocator, obj_pImage, pCreateInfo, pAllocator, pImage);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkDestroyImage0(JNIEnv* env, jclass clazz, jlong device, jlong image, jobject obj_pAllocator) {
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator) : NULL);


//@line:3246
 
	vkDestroyImage(
			(VkDevice) reinterpret_cast<VkDevice>(device),
			(VkImage) reinterpret_cast<VkImage>(image),
			(const VkAllocationCallbacks*) pAllocator);

  

}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkGetImageSubresourceLayout0(JNIEnv* env, jclass clazz, jlong device, jlong image, jobject obj_pSubresource, jobject obj_pLayout) {
	char* pSubresource = (char*)(obj_pSubresource?env->GetDirectBufferAddress(obj_pSubresource) : NULL);
	char* pLayout = (char*)(obj_pLayout?env->GetDirectBufferAddress(obj_pLayout) : NULL);


//@line:3299
 
	vkGetImageSubresourceLayout(
			(VkDevice) reinterpret_cast<VkDevice>(device),
			(VkImage) reinterpret_cast<VkImage>(image),
			(const VkImageSubresource*) pSubresource,
			(VkSubresourceLayout*) pLayout);

  

}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkCreateImageView0
(JNIEnv* env, jclass clazz, jlong device, jobject obj_pCreateInfo, jobject obj_pAllocator, jobject obj_pView, char* pCreateInfo, char* pAllocator, char* pView) {

//@line:3360
 
	VkResult res = vkCreateImageView(
			(VkDevice) reinterpret_cast<VkDevice>(device),
			(const VkImageViewCreateInfo*) pCreateInfo,
			(const VkAllocationCallbacks*) pAllocator,
			(VkImageView*) pView);
	 return (jint) res;
  
}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkCreateImageView0(JNIEnv* env, jclass clazz, jlong device, jobject obj_pCreateInfo, jobject obj_pAllocator, jobject obj_pView) {
	char* pCreateInfo = (char*)(obj_pCreateInfo?env->GetDirectBufferAddress(obj_pCreateInfo) : NULL);
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator) : NULL);
	char* pView = (char*)(obj_pView?env->GetDirectBufferAddress(obj_pView) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkCreateImageView0(env, clazz, device, obj_pCreateInfo, obj_pAllocator, obj_pView, pCreateInfo, pAllocator, pView);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkDestroyImageView0(JNIEnv* env, jclass clazz, jlong device, jlong imageView, jobject obj_pAllocator) {
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator) : NULL);


//@line:3408
 
	vkDestroyImageView(
			(VkDevice) reinterpret_cast<VkDevice>(device),
			(VkImageView) reinterpret_cast<VkImageView>(imageView),
			(const VkAllocationCallbacks*) pAllocator);

  

}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkCreateShaderModule0
(JNIEnv* env, jclass clazz, jlong device, jobject obj_pCreateInfo, jobject obj_pAllocator, jobject obj_pShaderModule, char* pCreateInfo, char* pAllocator, char* pShaderModule) {

//@line:3468
 
	VkResult res = vkCreateShaderModule(
			(VkDevice) reinterpret_cast<VkDevice>(device),
			(const VkShaderModuleCreateInfo*) pCreateInfo,
			(const VkAllocationCallbacks*) pAllocator,
			(VkShaderModule*) pShaderModule);
	 return (jint) res;
  
}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkCreateShaderModule0(JNIEnv* env, jclass clazz, jlong device, jobject obj_pCreateInfo, jobject obj_pAllocator, jobject obj_pShaderModule) {
	char* pCreateInfo = (char*)(obj_pCreateInfo?env->GetDirectBufferAddress(obj_pCreateInfo) : NULL);
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator) : NULL);
	char* pShaderModule = (char*)(obj_pShaderModule?env->GetDirectBufferAddress(obj_pShaderModule) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkCreateShaderModule0(env, clazz, device, obj_pCreateInfo, obj_pAllocator, obj_pShaderModule, pCreateInfo, pAllocator, pShaderModule);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkDestroyShaderModule0(JNIEnv* env, jclass clazz, jlong device, jlong shaderModule, jobject obj_pAllocator) {
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator) : NULL);


//@line:3516
 
	vkDestroyShaderModule(
			(VkDevice) reinterpret_cast<VkDevice>(device),
			(VkShaderModule) reinterpret_cast<VkShaderModule>(shaderModule),
			(const VkAllocationCallbacks*) pAllocator);

  

}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkCreatePipelineCache0
(JNIEnv* env, jclass clazz, jlong device, jobject obj_pCreateInfo, jobject obj_pAllocator, jobject obj_pPipelineCache, char* pCreateInfo, char* pAllocator, char* pPipelineCache) {

//@line:3576
 
	VkResult res = vkCreatePipelineCache(
			(VkDevice) reinterpret_cast<VkDevice>(device),
			(const VkPipelineCacheCreateInfo*) pCreateInfo,
			(const VkAllocationCallbacks*) pAllocator,
			(VkPipelineCache*) pPipelineCache);
	 return (jint) res;
  
}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkCreatePipelineCache0(JNIEnv* env, jclass clazz, jlong device, jobject obj_pCreateInfo, jobject obj_pAllocator, jobject obj_pPipelineCache) {
	char* pCreateInfo = (char*)(obj_pCreateInfo?env->GetDirectBufferAddress(obj_pCreateInfo) : NULL);
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator) : NULL);
	char* pPipelineCache = (char*)(obj_pPipelineCache?env->GetDirectBufferAddress(obj_pPipelineCache) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkCreatePipelineCache0(env, clazz, device, obj_pCreateInfo, obj_pAllocator, obj_pPipelineCache, pCreateInfo, pAllocator, pPipelineCache);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkDestroyPipelineCache0(JNIEnv* env, jclass clazz, jlong device, jlong pipelineCache, jobject obj_pAllocator) {
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator) : NULL);


//@line:3624
 
	vkDestroyPipelineCache(
			(VkDevice) reinterpret_cast<VkDevice>(device),
			(VkPipelineCache) reinterpret_cast<VkPipelineCache>(pipelineCache),
			(const VkAllocationCallbacks*) pAllocator);

  

}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkGetPipelineCacheData0
(JNIEnv* env, jclass clazz, jlong device, jlong pipelineCache, jlongArray obj_pDataSize, jobject obj_pData, unsigned char* pData, long long* pDataSize) {

//@line:3681
 
	VkResult res = vkGetPipelineCacheData(
			(VkDevice) reinterpret_cast<VkDevice>(device),
			(VkPipelineCache) reinterpret_cast<VkPipelineCache>(pipelineCache),
			(size_t*) pDataSize,
			(void*) pData);
	 return (jint) res;
  
}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkGetPipelineCacheData0(JNIEnv* env, jclass clazz, jlong device, jlong pipelineCache, jlongArray obj_pDataSize, jobject obj_pData) {
	unsigned char* pData = (unsigned char*)(obj_pData?env->GetDirectBufferAddress(obj_pData) : NULL);
	long long* pDataSize = (long long*)(obj_pDataSize ? env->GetLongArrayElements(obj_pDataSize, 0) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkGetPipelineCacheData0(env, clazz, device, pipelineCache, obj_pDataSize, obj_pData, pData, pDataSize);

	if(obj_pDataSize != NULL){
		 env->ReleaseLongArrayElements(obj_pDataSize, (jlong*)pDataSize, 0);
	}

	return JNI_returnValue;
}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkMergePipelineCaches0
(JNIEnv* env, jclass clazz, jlong device, jlong dstCache, jint srcCacheCount, jobject obj_pSrcCaches, char* pSrcCaches) {

//@line:3742
 
	VkResult res = vkMergePipelineCaches(
			(VkDevice) reinterpret_cast<VkDevice>(device),
			(VkPipelineCache) reinterpret_cast<VkPipelineCache>(dstCache),
			(uint32_t) srcCacheCount,
			(const VkPipelineCache*) pSrcCaches);
	 return (jint) res;
  
}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkMergePipelineCaches0(JNIEnv* env, jclass clazz, jlong device, jlong dstCache, jint srcCacheCount, jobject obj_pSrcCaches) {
	char* pSrcCaches = (char*)(obj_pSrcCaches?env->GetDirectBufferAddress(obj_pSrcCaches) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkMergePipelineCaches0(env, clazz, device, dstCache, srcCacheCount, obj_pSrcCaches, pSrcCaches);


	return JNI_returnValue;
}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkCreateGraphicsPipelines0
(JNIEnv* env, jclass clazz, jlong device, jlong pipelineCache, jint createInfoCount, jobject obj_pCreateInfos, jobject obj_pAllocator, jobject obj_pPipelines, char* pCreateInfos, char* pAllocator, char* pPipelines) {

//@line:3818
 
	VkResult res = vkCreateGraphicsPipelines(
			(VkDevice) reinterpret_cast<VkDevice>(device),
			(VkPipelineCache) reinterpret_cast<VkPipelineCache>(pipelineCache),
			(uint32_t) createInfoCount,
			(const VkGraphicsPipelineCreateInfo*) pCreateInfos,
			(const VkAllocationCallbacks*) pAllocator,
			(VkPipeline*) pPipelines);
	 return (jint) res;
  
}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkCreateGraphicsPipelines0(JNIEnv* env, jclass clazz, jlong device, jlong pipelineCache, jint createInfoCount, jobject obj_pCreateInfos, jobject obj_pAllocator, jobject obj_pPipelines) {
	char* pCreateInfos = (char*)(obj_pCreateInfos?env->GetDirectBufferAddress(obj_pCreateInfos) : NULL);
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator) : NULL);
	char* pPipelines = (char*)(obj_pPipelines?env->GetDirectBufferAddress(obj_pPipelines) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkCreateGraphicsPipelines0(env, clazz, device, pipelineCache, createInfoCount, obj_pCreateInfos, obj_pAllocator, obj_pPipelines, pCreateInfos, pAllocator, pPipelines);


	return JNI_returnValue;
}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkCreateComputePipelines0
(JNIEnv* env, jclass clazz, jlong device, jlong pipelineCache, jint createInfoCount, jobject obj_pCreateInfos, jobject obj_pAllocator, jobject obj_pPipelines, char* pCreateInfos, char* pAllocator, char* pPipelines) {

//@line:3896
 
	VkResult res = vkCreateComputePipelines(
			(VkDevice) reinterpret_cast<VkDevice>(device),
			(VkPipelineCache) reinterpret_cast<VkPipelineCache>(pipelineCache),
			(uint32_t) createInfoCount,
			(const VkComputePipelineCreateInfo*) pCreateInfos,
			(const VkAllocationCallbacks*) pAllocator,
			(VkPipeline*) pPipelines);
	 return (jint) res;
  
}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkCreateComputePipelines0(JNIEnv* env, jclass clazz, jlong device, jlong pipelineCache, jint createInfoCount, jobject obj_pCreateInfos, jobject obj_pAllocator, jobject obj_pPipelines) {
	char* pCreateInfos = (char*)(obj_pCreateInfos?env->GetDirectBufferAddress(obj_pCreateInfos) : NULL);
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator) : NULL);
	char* pPipelines = (char*)(obj_pPipelines?env->GetDirectBufferAddress(obj_pPipelines) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkCreateComputePipelines0(env, clazz, device, pipelineCache, createInfoCount, obj_pCreateInfos, obj_pAllocator, obj_pPipelines, pCreateInfos, pAllocator, pPipelines);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkDestroyPipeline0(JNIEnv* env, jclass clazz, jlong device, jlong pipeline, jobject obj_pAllocator) {
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator) : NULL);


//@line:3946
 
	vkDestroyPipeline(
			(VkDevice) reinterpret_cast<VkDevice>(device),
			(VkPipeline) reinterpret_cast<VkPipeline>(pipeline),
			(const VkAllocationCallbacks*) pAllocator);

  

}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkCreatePipelineLayout0
(JNIEnv* env, jclass clazz, jlong device, jobject obj_pCreateInfo, jobject obj_pAllocator, jobject obj_pPipelineLayout, char* pCreateInfo, char* pAllocator, char* pPipelineLayout) {

//@line:4006
 
	VkResult res = vkCreatePipelineLayout(
			(VkDevice) reinterpret_cast<VkDevice>(device),
			(const VkPipelineLayoutCreateInfo*) pCreateInfo,
			(const VkAllocationCallbacks*) pAllocator,
			(VkPipelineLayout*) pPipelineLayout);
	 return (jint) res;
  
}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkCreatePipelineLayout0(JNIEnv* env, jclass clazz, jlong device, jobject obj_pCreateInfo, jobject obj_pAllocator, jobject obj_pPipelineLayout) {
	char* pCreateInfo = (char*)(obj_pCreateInfo?env->GetDirectBufferAddress(obj_pCreateInfo) : NULL);
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator) : NULL);
	char* pPipelineLayout = (char*)(obj_pPipelineLayout?env->GetDirectBufferAddress(obj_pPipelineLayout) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkCreatePipelineLayout0(env, clazz, device, obj_pCreateInfo, obj_pAllocator, obj_pPipelineLayout, pCreateInfo, pAllocator, pPipelineLayout);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkDestroyPipelineLayout0(JNIEnv* env, jclass clazz, jlong device, jlong pipelineLayout, jobject obj_pAllocator) {
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator) : NULL);


//@line:4054
 
	vkDestroyPipelineLayout(
			(VkDevice) reinterpret_cast<VkDevice>(device),
			(VkPipelineLayout) reinterpret_cast<VkPipelineLayout>(pipelineLayout),
			(const VkAllocationCallbacks*) pAllocator);

  

}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkCreateSampler0
(JNIEnv* env, jclass clazz, jlong device, jobject obj_pCreateInfo, jobject obj_pAllocator, jobject obj_pSampler, char* pCreateInfo, char* pAllocator, char* pSampler) {

//@line:4114
 
	VkResult res = vkCreateSampler(
			(VkDevice) reinterpret_cast<VkDevice>(device),
			(const VkSamplerCreateInfo*) pCreateInfo,
			(const VkAllocationCallbacks*) pAllocator,
			(VkSampler*) pSampler);
	 return (jint) res;
  
}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkCreateSampler0(JNIEnv* env, jclass clazz, jlong device, jobject obj_pCreateInfo, jobject obj_pAllocator, jobject obj_pSampler) {
	char* pCreateInfo = (char*)(obj_pCreateInfo?env->GetDirectBufferAddress(obj_pCreateInfo) : NULL);
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator) : NULL);
	char* pSampler = (char*)(obj_pSampler?env->GetDirectBufferAddress(obj_pSampler) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkCreateSampler0(env, clazz, device, obj_pCreateInfo, obj_pAllocator, obj_pSampler, pCreateInfo, pAllocator, pSampler);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkDestroySampler0(JNIEnv* env, jclass clazz, jlong device, jlong sampler, jobject obj_pAllocator) {
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator) : NULL);


//@line:4162
 
	vkDestroySampler(
			(VkDevice) reinterpret_cast<VkDevice>(device),
			(VkSampler) reinterpret_cast<VkSampler>(sampler),
			(const VkAllocationCallbacks*) pAllocator);

  

}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkCreateDescriptorSetLayout0
(JNIEnv* env, jclass clazz, jlong device, jobject obj_pCreateInfo, jobject obj_pAllocator, jobject obj_pSetLayout, char* pCreateInfo, char* pAllocator, char* pSetLayout) {

//@line:4222
 
	VkResult res = vkCreateDescriptorSetLayout(
			(VkDevice) reinterpret_cast<VkDevice>(device),
			(const VkDescriptorSetLayoutCreateInfo*) pCreateInfo,
			(const VkAllocationCallbacks*) pAllocator,
			(VkDescriptorSetLayout*) pSetLayout);
	 return (jint) res;
  
}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkCreateDescriptorSetLayout0(JNIEnv* env, jclass clazz, jlong device, jobject obj_pCreateInfo, jobject obj_pAllocator, jobject obj_pSetLayout) {
	char* pCreateInfo = (char*)(obj_pCreateInfo?env->GetDirectBufferAddress(obj_pCreateInfo) : NULL);
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator) : NULL);
	char* pSetLayout = (char*)(obj_pSetLayout?env->GetDirectBufferAddress(obj_pSetLayout) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkCreateDescriptorSetLayout0(env, clazz, device, obj_pCreateInfo, obj_pAllocator, obj_pSetLayout, pCreateInfo, pAllocator, pSetLayout);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkDestroyDescriptorSetLayout0(JNIEnv* env, jclass clazz, jlong device, jlong descriptorSetLayout, jobject obj_pAllocator) {
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator) : NULL);


//@line:4270
 
	vkDestroyDescriptorSetLayout(
			(VkDevice) reinterpret_cast<VkDevice>(device),
			(VkDescriptorSetLayout) reinterpret_cast<VkDescriptorSetLayout>(descriptorSetLayout),
			(const VkAllocationCallbacks*) pAllocator);

  

}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkCreateDescriptorPool0
(JNIEnv* env, jclass clazz, jlong device, jobject obj_pCreateInfo, jobject obj_pAllocator, jobject obj_pDescriptorPool, char* pCreateInfo, char* pAllocator, char* pDescriptorPool) {

//@line:4330
 
	VkResult res = vkCreateDescriptorPool(
			(VkDevice) reinterpret_cast<VkDevice>(device),
			(const VkDescriptorPoolCreateInfo*) pCreateInfo,
			(const VkAllocationCallbacks*) pAllocator,
			(VkDescriptorPool*) pDescriptorPool);
	 return (jint) res;
  
}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkCreateDescriptorPool0(JNIEnv* env, jclass clazz, jlong device, jobject obj_pCreateInfo, jobject obj_pAllocator, jobject obj_pDescriptorPool) {
	char* pCreateInfo = (char*)(obj_pCreateInfo?env->GetDirectBufferAddress(obj_pCreateInfo) : NULL);
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator) : NULL);
	char* pDescriptorPool = (char*)(obj_pDescriptorPool?env->GetDirectBufferAddress(obj_pDescriptorPool) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkCreateDescriptorPool0(env, clazz, device, obj_pCreateInfo, obj_pAllocator, obj_pDescriptorPool, pCreateInfo, pAllocator, pDescriptorPool);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkDestroyDescriptorPool0(JNIEnv* env, jclass clazz, jlong device, jlong descriptorPool, jobject obj_pAllocator) {
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator) : NULL);


//@line:4378
 
	vkDestroyDescriptorPool(
			(VkDevice) reinterpret_cast<VkDevice>(device),
			(VkDescriptorPool) reinterpret_cast<VkDescriptorPool>(descriptorPool),
			(const VkAllocationCallbacks*) pAllocator);

  

}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkResetDescriptorPool0(JNIEnv* env, jclass clazz, jlong device, jlong descriptorPool, jint flags) {


//@line:4429
 
	VkResult res = vkResetDescriptorPool(
			(VkDevice) reinterpret_cast<VkDevice>(device),
			(VkDescriptorPool) reinterpret_cast<VkDescriptorPool>(descriptorPool),
			(VkDescriptorPoolResetFlags) flags);
	 return (jint) res;
  

}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkAllocateDescriptorSets0
(JNIEnv* env, jclass clazz, jlong device, jobject obj_pAllocateInfo, jlong pDescriptorSets, char* pAllocateInfo) {

//@line:4480
 
	VkResult res = vkAllocateDescriptorSets(
			(VkDevice) reinterpret_cast<VkDevice>(device),
			(const VkDescriptorSetAllocateInfo*) pAllocateInfo,
			(VkDescriptorSet*) pDescriptorSets);
	 return (jint) res;
  
}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkAllocateDescriptorSets0(JNIEnv* env, jclass clazz, jlong device, jobject obj_pAllocateInfo, jlong pDescriptorSets) {
	char* pAllocateInfo = (char*)(obj_pAllocateInfo?env->GetDirectBufferAddress(obj_pAllocateInfo) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkAllocateDescriptorSets0(env, clazz, device, obj_pAllocateInfo, pDescriptorSets, pAllocateInfo);


	return JNI_returnValue;
}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkFreeDescriptorSets0
(JNIEnv* env, jclass clazz, jlong device, jlong descriptorPool, jint descriptorSetCount, jobject obj_pDescriptorSets, char* pDescriptorSets) {

//@line:4540
 
	VkResult res = vkFreeDescriptorSets(
			(VkDevice) reinterpret_cast<VkDevice>(device),
			(VkDescriptorPool) reinterpret_cast<VkDescriptorPool>(descriptorPool),
			(uint32_t) descriptorSetCount,
			(const VkDescriptorSet*) pDescriptorSets);
	 return (jint) res;
  
}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkFreeDescriptorSets0(JNIEnv* env, jclass clazz, jlong device, jlong descriptorPool, jint descriptorSetCount, jobject obj_pDescriptorSets) {
	char* pDescriptorSets = (char*)(obj_pDescriptorSets?env->GetDirectBufferAddress(obj_pDescriptorSets) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkFreeDescriptorSets0(env, clazz, device, descriptorPool, descriptorSetCount, obj_pDescriptorSets, pDescriptorSets);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkUpdateDescriptorSets0(JNIEnv* env, jclass clazz, jlong device, jint descriptorWriteCount, jobject obj_pDescriptorWrites, jint descriptorCopyCount, jobject obj_pDescriptorCopies) {
	char* pDescriptorWrites = (char*)(obj_pDescriptorWrites?env->GetDirectBufferAddress(obj_pDescriptorWrites) : NULL);
	char* pDescriptorCopies = (char*)(obj_pDescriptorCopies?env->GetDirectBufferAddress(obj_pDescriptorCopies) : NULL);


//@line:4606
 
	vkUpdateDescriptorSets(
			(VkDevice) reinterpret_cast<VkDevice>(device),
			(uint32_t) descriptorWriteCount,
			(const VkWriteDescriptorSet*) pDescriptorWrites,
			(uint32_t) descriptorCopyCount,
			(const VkCopyDescriptorSet*) pDescriptorCopies);

  

}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkCreateFramebuffer0
(JNIEnv* env, jclass clazz, jlong device, jobject obj_pCreateInfo, jobject obj_pAllocator, jobject obj_pFramebuffer, char* pCreateInfo, char* pAllocator, char* pFramebuffer) {

//@line:4668
 
	VkResult res = vkCreateFramebuffer(
			(VkDevice) reinterpret_cast<VkDevice>(device),
			(const VkFramebufferCreateInfo*) pCreateInfo,
			(const VkAllocationCallbacks*) pAllocator,
			(VkFramebuffer*) pFramebuffer);
	 return (jint) res;
  
}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkCreateFramebuffer0(JNIEnv* env, jclass clazz, jlong device, jobject obj_pCreateInfo, jobject obj_pAllocator, jobject obj_pFramebuffer) {
	char* pCreateInfo = (char*)(obj_pCreateInfo?env->GetDirectBufferAddress(obj_pCreateInfo) : NULL);
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator) : NULL);
	char* pFramebuffer = (char*)(obj_pFramebuffer?env->GetDirectBufferAddress(obj_pFramebuffer) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkCreateFramebuffer0(env, clazz, device, obj_pCreateInfo, obj_pAllocator, obj_pFramebuffer, pCreateInfo, pAllocator, pFramebuffer);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkDestroyFramebuffer0(JNIEnv* env, jclass clazz, jlong device, jlong framebuffer, jobject obj_pAllocator) {
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator) : NULL);


//@line:4716
 
	vkDestroyFramebuffer(
			(VkDevice) reinterpret_cast<VkDevice>(device),
			(VkFramebuffer) reinterpret_cast<VkFramebuffer>(framebuffer),
			(const VkAllocationCallbacks*) pAllocator);

  

}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkCreateRenderPass0
(JNIEnv* env, jclass clazz, jlong device, jobject obj_pCreateInfo, jobject obj_pAllocator, jobject obj_pRenderPass, char* pCreateInfo, char* pAllocator, char* pRenderPass) {

//@line:4776
 
	VkResult res = vkCreateRenderPass(
			(VkDevice) reinterpret_cast<VkDevice>(device),
			(const VkRenderPassCreateInfo*) pCreateInfo,
			(const VkAllocationCallbacks*) pAllocator,
			(VkRenderPass*) pRenderPass);
	 return (jint) res;
  
}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkCreateRenderPass0(JNIEnv* env, jclass clazz, jlong device, jobject obj_pCreateInfo, jobject obj_pAllocator, jobject obj_pRenderPass) {
	char* pCreateInfo = (char*)(obj_pCreateInfo?env->GetDirectBufferAddress(obj_pCreateInfo) : NULL);
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator) : NULL);
	char* pRenderPass = (char*)(obj_pRenderPass?env->GetDirectBufferAddress(obj_pRenderPass) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkCreateRenderPass0(env, clazz, device, obj_pCreateInfo, obj_pAllocator, obj_pRenderPass, pCreateInfo, pAllocator, pRenderPass);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkDestroyRenderPass0(JNIEnv* env, jclass clazz, jlong device, jlong renderPass, jobject obj_pAllocator) {
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator) : NULL);


//@line:4824
 
	vkDestroyRenderPass(
			(VkDevice) reinterpret_cast<VkDevice>(device),
			(VkRenderPass) reinterpret_cast<VkRenderPass>(renderPass),
			(const VkAllocationCallbacks*) pAllocator);

  

}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkGetRenderAreaGranularity0(JNIEnv* env, jclass clazz, jlong device, jlong renderPass, jobject obj_pGranularity) {
	char* pGranularity = (char*)(obj_pGranularity?env->GetDirectBufferAddress(obj_pGranularity) : NULL);


//@line:4871
 
	vkGetRenderAreaGranularity(
			(VkDevice) reinterpret_cast<VkDevice>(device),
			(VkRenderPass) reinterpret_cast<VkRenderPass>(renderPass),
			(VkExtent2D*) pGranularity);

  

}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkCreateCommandPool0
(JNIEnv* env, jclass clazz, jlong device, jobject obj_pCreateInfo, jobject obj_pAllocator, jobject obj_pCommandPool, char* pCreateInfo, char* pAllocator, char* pCommandPool) {

//@line:4931
 
	VkResult res = vkCreateCommandPool(
			(VkDevice) reinterpret_cast<VkDevice>(device),
			(const VkCommandPoolCreateInfo*) pCreateInfo,
			(const VkAllocationCallbacks*) pAllocator,
			(VkCommandPool*) pCommandPool);
	 return (jint) res;
  
}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkCreateCommandPool0(JNIEnv* env, jclass clazz, jlong device, jobject obj_pCreateInfo, jobject obj_pAllocator, jobject obj_pCommandPool) {
	char* pCreateInfo = (char*)(obj_pCreateInfo?env->GetDirectBufferAddress(obj_pCreateInfo) : NULL);
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator) : NULL);
	char* pCommandPool = (char*)(obj_pCommandPool?env->GetDirectBufferAddress(obj_pCommandPool) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkCreateCommandPool0(env, clazz, device, obj_pCreateInfo, obj_pAllocator, obj_pCommandPool, pCreateInfo, pAllocator, pCommandPool);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkDestroyCommandPool0(JNIEnv* env, jclass clazz, jlong device, jlong commandPool, jobject obj_pAllocator) {
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator) : NULL);


//@line:4979
 
	vkDestroyCommandPool(
			(VkDevice) reinterpret_cast<VkDevice>(device),
			(VkCommandPool) reinterpret_cast<VkCommandPool>(commandPool),
			(const VkAllocationCallbacks*) pAllocator);

  

}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkResetCommandPool0(JNIEnv* env, jclass clazz, jlong device, jlong commandPool, jint flags) {


//@line:5030
 
	VkResult res = vkResetCommandPool(
			(VkDevice) reinterpret_cast<VkDevice>(device),
			(VkCommandPool) reinterpret_cast<VkCommandPool>(commandPool),
			(VkCommandPoolResetFlags) flags);
	 return (jint) res;
  

}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkAllocateCommandBuffers0
(JNIEnv* env, jclass clazz, jlong device, jobject obj_pAllocateInfo, jlong pCommandBuffers, char* pAllocateInfo) {

//@line:5081
 
	VkResult res = vkAllocateCommandBuffers(
			(VkDevice) reinterpret_cast<VkDevice>(device),
			(const VkCommandBufferAllocateInfo*) pAllocateInfo,
			(VkCommandBuffer*) pCommandBuffers);
	 return (jint) res;
  
}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkAllocateCommandBuffers0(JNIEnv* env, jclass clazz, jlong device, jobject obj_pAllocateInfo, jlong pCommandBuffers) {
	char* pAllocateInfo = (char*)(obj_pAllocateInfo?env->GetDirectBufferAddress(obj_pAllocateInfo) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkAllocateCommandBuffers0(env, clazz, device, obj_pAllocateInfo, pCommandBuffers, pAllocateInfo);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkFreeCommandBuffers0(JNIEnv* env, jclass clazz, jlong device, jlong commandPool, jint commandBufferCount, jobject obj_pCommandBuffers) {
	char* pCommandBuffers = (char*)(obj_pCommandBuffers?env->GetDirectBufferAddress(obj_pCommandBuffers) : NULL);


//@line:5137
 
	vkFreeCommandBuffers(
			(VkDevice) reinterpret_cast<VkDevice>(device),
			(VkCommandPool) reinterpret_cast<VkCommandPool>(commandPool),
			(uint32_t) commandBufferCount,
			(const VkCommandBuffer*) pCommandBuffers);

  

}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkBeginCommandBuffer0
(JNIEnv* env, jclass clazz, jlong commandBuffer, jobject obj_pBeginInfo, char* pBeginInfo) {

//@line:5183
 
	VkResult res = vkBeginCommandBuffer(
			(VkCommandBuffer) reinterpret_cast<VkCommandBuffer>(commandBuffer),
			(const VkCommandBufferBeginInfo*) pBeginInfo);
	 return (jint) res;
  
}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkBeginCommandBuffer0(JNIEnv* env, jclass clazz, jlong commandBuffer, jobject obj_pBeginInfo) {
	char* pBeginInfo = (char*)(obj_pBeginInfo?env->GetDirectBufferAddress(obj_pBeginInfo) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkBeginCommandBuffer0(env, clazz, commandBuffer, obj_pBeginInfo, pBeginInfo);


	return JNI_returnValue;
}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkEndCommandBuffer0(JNIEnv* env, jclass clazz, jlong commandBuffer) {


//@line:5221
 
	VkResult res = vkEndCommandBuffer(
			(VkCommandBuffer) reinterpret_cast<VkCommandBuffer>(commandBuffer));
	 return (jint) res;
  

}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkResetCommandBuffer0(JNIEnv* env, jclass clazz, jlong commandBuffer, jint flags) {


//@line:5264
 
	VkResult res = vkResetCommandBuffer(
			(VkCommandBuffer) reinterpret_cast<VkCommandBuffer>(commandBuffer),
			(VkCommandBufferResetFlags) flags);
	 return (jint) res;
  

}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkCmdBindPipeline0(JNIEnv* env, jclass clazz, jlong commandBuffer, jint pipelineBindPoint, jlong pipeline) {


//@line:5310
 
	vkCmdBindPipeline(
			(VkCommandBuffer) reinterpret_cast<VkCommandBuffer>(commandBuffer),
			(VkPipelineBindPoint) pipelineBindPoint,
			(VkPipeline) reinterpret_cast<VkPipeline>(pipeline));

  

}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkCmdSetViewport0(JNIEnv* env, jclass clazz, jlong commandBuffer, jint firstViewport, jint viewportCount, jobject obj_pViewports) {
	char* pViewports = (char*)(obj_pViewports?env->GetDirectBufferAddress(obj_pViewports) : NULL);


//@line:5366
 
	vkCmdSetViewport(
			(VkCommandBuffer) reinterpret_cast<VkCommandBuffer>(commandBuffer),
			(uint32_t) firstViewport,
			(uint32_t) viewportCount,
			(const VkViewport*) pViewports);

  

}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkCmdSetScissor0(JNIEnv* env, jclass clazz, jlong commandBuffer, jint firstScissor, jint scissorCount, jobject obj_pScissors) {
	char* pScissors = (char*)(obj_pScissors?env->GetDirectBufferAddress(obj_pScissors) : NULL);


//@line:5423
 
	vkCmdSetScissor(
			(VkCommandBuffer) reinterpret_cast<VkCommandBuffer>(commandBuffer),
			(uint32_t) firstScissor,
			(uint32_t) scissorCount,
			(const VkRect2D*) pScissors);

  

}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkCmdSetLineWidth0(JNIEnv* env, jclass clazz, jlong commandBuffer, jfloat lineWidth) {


//@line:5465
 
	vkCmdSetLineWidth(
			(VkCommandBuffer) reinterpret_cast<VkCommandBuffer>(commandBuffer),
			(float) lineWidth);

  

}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkCmdSetDepthBias0(JNIEnv* env, jclass clazz, jlong commandBuffer, jfloat depthBiasConstantFactor, jfloat depthBiasClamp, jfloat depthBiasSlopeFactor) {


//@line:5517
 
	vkCmdSetDepthBias(
			(VkCommandBuffer) reinterpret_cast<VkCommandBuffer>(commandBuffer),
			(float) depthBiasConstantFactor,
			(float) depthBiasClamp,
			(float) depthBiasSlopeFactor);

  

}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkCmdSetBlendConstants0(JNIEnv* env, jclass clazz, jlong commandBuffer, jfloatArray obj_blendConstants) {
	float* blendConstants = (float*)(obj_blendConstants ? env->GetFloatArrayElements(obj_blendConstants, 0) : NULL);


//@line:5559
 
	float  blendConstantsParam[4] = {0,0,0,0};
	memcpy(blendConstantsParam, blendConstants, sizeof(blendConstantsParam));
	vkCmdSetBlendConstants(
			(VkCommandBuffer) reinterpret_cast<VkCommandBuffer>(commandBuffer),
			blendConstantsParam);

  
	if(obj_blendConstants != NULL){
		 env->ReleaseFloatArrayElements(obj_blendConstants, (jfloat*)blendConstants, 0);
	}

}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkCmdSetDepthBounds0(JNIEnv* env, jclass clazz, jlong commandBuffer, jfloat minDepthBounds, jfloat maxDepthBounds) {


//@line:5607
 
	vkCmdSetDepthBounds(
			(VkCommandBuffer) reinterpret_cast<VkCommandBuffer>(commandBuffer),
			(float) minDepthBounds,
			(float) maxDepthBounds);

  

}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkCmdSetStencilCompareMask0(JNIEnv* env, jclass clazz, jlong commandBuffer, jint faceMask, jint compareMask) {


//@line:5654
 
	vkCmdSetStencilCompareMask(
			(VkCommandBuffer) reinterpret_cast<VkCommandBuffer>(commandBuffer),
			(VkStencilFaceFlags) faceMask,
			(uint32_t) compareMask);

  

}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkCmdSetStencilWriteMask0(JNIEnv* env, jclass clazz, jlong commandBuffer, jint faceMask, jint writeMask) {


//@line:5701
 
	vkCmdSetStencilWriteMask(
			(VkCommandBuffer) reinterpret_cast<VkCommandBuffer>(commandBuffer),
			(VkStencilFaceFlags) faceMask,
			(uint32_t) writeMask);

  

}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkCmdSetStencilReference0(JNIEnv* env, jclass clazz, jlong commandBuffer, jint faceMask, jint reference) {


//@line:5748
 
	vkCmdSetStencilReference(
			(VkCommandBuffer) reinterpret_cast<VkCommandBuffer>(commandBuffer),
			(VkStencilFaceFlags) faceMask,
			(uint32_t) reference);

  

}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkCmdBindDescriptorSets0(JNIEnv* env, jclass clazz, jlong commandBuffer, jint pipelineBindPoint, jlong layout, jint firstSet, jint descriptorSetCount, jobject obj_pDescriptorSets, jint dynamicOffsetCount, jintArray obj_pDynamicOffsets) {
	char* pDescriptorSets = (char*)(obj_pDescriptorSets?env->GetDirectBufferAddress(obj_pDescriptorSets) : NULL);
	int* pDynamicOffsets = (int*)(obj_pDynamicOffsets ? env->GetIntArrayElements(obj_pDynamicOffsets, 0) : NULL);


//@line:5828
 
	vkCmdBindDescriptorSets(
			(VkCommandBuffer) reinterpret_cast<VkCommandBuffer>(commandBuffer),
			(VkPipelineBindPoint) pipelineBindPoint,
			(VkPipelineLayout) reinterpret_cast<VkPipelineLayout>(layout),
			(uint32_t) firstSet,
			(uint32_t) descriptorSetCount,
			(const VkDescriptorSet*) pDescriptorSets,
			(uint32_t) dynamicOffsetCount,
			(const uint32_t*) pDynamicOffsets);

  
	if(obj_pDynamicOffsets != NULL){
		 env->ReleaseIntArrayElements(obj_pDynamicOffsets, (jint*)pDynamicOffsets, 0);
	}

}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkCmdBindIndexBuffer0(JNIEnv* env, jclass clazz, jlong commandBuffer, jlong buffer, jlong offset, jint indexType) {


//@line:5886
 
	vkCmdBindIndexBuffer(
			(VkCommandBuffer) reinterpret_cast<VkCommandBuffer>(commandBuffer),
			(VkBuffer) reinterpret_cast<VkBuffer>(buffer),
			(VkDeviceSize) offset,
			(VkIndexType) indexType);

  

}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkCmdBindVertexBuffers0(JNIEnv* env, jclass clazz, jlong commandBuffer, jint firstBinding, jint bindingCount, jobject obj_pBuffers, jlongArray obj_pOffsets) {
	char* pBuffers = (char*)(obj_pBuffers?env->GetDirectBufferAddress(obj_pBuffers) : NULL);
	long long* pOffsets = (long long*)(obj_pOffsets ? env->GetLongArrayElements(obj_pOffsets, 0) : NULL);


//@line:5949
 
	vkCmdBindVertexBuffers(
			(VkCommandBuffer) reinterpret_cast<VkCommandBuffer>(commandBuffer),
			(uint32_t) firstBinding,
			(uint32_t) bindingCount,
			(const VkBuffer*) pBuffers,
			(const VkDeviceSize*) pOffsets);

  
	if(obj_pOffsets != NULL){
		 env->ReleaseLongArrayElements(obj_pOffsets, (jlong*)pOffsets, 0);
	}

}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkCmdDraw0(JNIEnv* env, jclass clazz, jlong commandBuffer, jint vertexCount, jint instanceCount, jint firstVertex, jint firstInstance) {


//@line:6010
 
	vkCmdDraw(
			(VkCommandBuffer) reinterpret_cast<VkCommandBuffer>(commandBuffer),
			(uint32_t) vertexCount,
			(uint32_t) instanceCount,
			(uint32_t) firstVertex,
			(uint32_t) firstInstance);

  

}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkCmdDrawIndexed0(JNIEnv* env, jclass clazz, jlong commandBuffer, jint indexCount, jint instanceCount, jint firstIndex, jint vertexOffset, jint firstInstance) {


//@line:6077
 
	vkCmdDrawIndexed(
			(VkCommandBuffer) reinterpret_cast<VkCommandBuffer>(commandBuffer),
			(uint32_t) indexCount,
			(uint32_t) instanceCount,
			(uint32_t) firstIndex,
			(int32_t) vertexOffset,
			(uint32_t) firstInstance);

  

}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkCmdDrawIndirect0(JNIEnv* env, jclass clazz, jlong commandBuffer, jlong buffer, jlong offset, jint drawCount, jint stride) {


//@line:6139
 
	vkCmdDrawIndirect(
			(VkCommandBuffer) reinterpret_cast<VkCommandBuffer>(commandBuffer),
			(VkBuffer) reinterpret_cast<VkBuffer>(buffer),
			(VkDeviceSize) offset,
			(uint32_t) drawCount,
			(uint32_t) stride);

  

}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkCmdDrawIndexedIndirect0(JNIEnv* env, jclass clazz, jlong commandBuffer, jlong buffer, jlong offset, jint drawCount, jint stride) {


//@line:6200
 
	vkCmdDrawIndexedIndirect(
			(VkCommandBuffer) reinterpret_cast<VkCommandBuffer>(commandBuffer),
			(VkBuffer) reinterpret_cast<VkBuffer>(buffer),
			(VkDeviceSize) offset,
			(uint32_t) drawCount,
			(uint32_t) stride);

  

}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkCmdDispatch0(JNIEnv* env, jclass clazz, jlong commandBuffer, jint x, jint y, jint z) {


//@line:6255
 
	vkCmdDispatch(
			(VkCommandBuffer) reinterpret_cast<VkCommandBuffer>(commandBuffer),
			(uint32_t) x,
			(uint32_t) y,
			(uint32_t) z);

  

}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkCmdDispatchIndirect0(JNIEnv* env, jclass clazz, jlong commandBuffer, jlong buffer, jlong offset) {


//@line:6303
 
	vkCmdDispatchIndirect(
			(VkCommandBuffer) reinterpret_cast<VkCommandBuffer>(commandBuffer),
			(VkBuffer) reinterpret_cast<VkBuffer>(buffer),
			(VkDeviceSize) offset);

  

}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkCmdCopyBuffer0(JNIEnv* env, jclass clazz, jlong commandBuffer, jlong srcBuffer, jlong dstBuffer, jint regionCount, jobject obj_pRegions) {
	char* pRegions = (char*)(obj_pRegions?env->GetDirectBufferAddress(obj_pRegions) : NULL);


//@line:6365
 
	vkCmdCopyBuffer(
			(VkCommandBuffer) reinterpret_cast<VkCommandBuffer>(commandBuffer),
			(VkBuffer) reinterpret_cast<VkBuffer>(srcBuffer),
			(VkBuffer) reinterpret_cast<VkBuffer>(dstBuffer),
			(uint32_t) regionCount,
			(const VkBufferCopy*) pRegions);

  

}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkCmdCopyImage0(JNIEnv* env, jclass clazz, jlong commandBuffer, jlong srcImage, jint srcImageLayout, jlong dstImage, jint dstImageLayout, jint regionCount, jobject obj_pRegions) {
	char* pRegions = (char*)(obj_pRegions?env->GetDirectBufferAddress(obj_pRegions) : NULL);


//@line:6441
 
	vkCmdCopyImage(
			(VkCommandBuffer) reinterpret_cast<VkCommandBuffer>(commandBuffer),
			(VkImage) reinterpret_cast<VkImage>(srcImage),
			(VkImageLayout) srcImageLayout,
			(VkImage) reinterpret_cast<VkImage>(dstImage),
			(VkImageLayout) dstImageLayout,
			(uint32_t) regionCount,
			(const VkImageCopy*) pRegions);

  

}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkCmdBlitImage0(JNIEnv* env, jclass clazz, jlong commandBuffer, jlong srcImage, jint srcImageLayout, jlong dstImage, jint dstImageLayout, jint regionCount, jobject obj_pRegions, jint filter) {
	char* pRegions = (char*)(obj_pRegions?env->GetDirectBufferAddress(obj_pRegions) : NULL);


//@line:6526
 
	vkCmdBlitImage(
			(VkCommandBuffer) reinterpret_cast<VkCommandBuffer>(commandBuffer),
			(VkImage) reinterpret_cast<VkImage>(srcImage),
			(VkImageLayout) srcImageLayout,
			(VkImage) reinterpret_cast<VkImage>(dstImage),
			(VkImageLayout) dstImageLayout,
			(uint32_t) regionCount,
			(const VkImageBlit*) pRegions,
			(VkFilter) filter);

  

}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkCmdCopyBufferToImage0(JNIEnv* env, jclass clazz, jlong commandBuffer, jlong srcBuffer, jlong dstImage, jint dstImageLayout, jint regionCount, jobject obj_pRegions) {
	char* pRegions = (char*)(obj_pRegions?env->GetDirectBufferAddress(obj_pRegions) : NULL);


//@line:6599
 
	vkCmdCopyBufferToImage(
			(VkCommandBuffer) reinterpret_cast<VkCommandBuffer>(commandBuffer),
			(VkBuffer) reinterpret_cast<VkBuffer>(srcBuffer),
			(VkImage) reinterpret_cast<VkImage>(dstImage),
			(VkImageLayout) dstImageLayout,
			(uint32_t) regionCount,
			(const VkBufferImageCopy*) pRegions);

  

}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkCmdCopyImageToBuffer0(JNIEnv* env, jclass clazz, jlong commandBuffer, jlong srcImage, jint srcImageLayout, jlong dstBuffer, jint regionCount, jobject obj_pRegions) {
	char* pRegions = (char*)(obj_pRegions?env->GetDirectBufferAddress(obj_pRegions) : NULL);


//@line:6670
 
	vkCmdCopyImageToBuffer(
			(VkCommandBuffer) reinterpret_cast<VkCommandBuffer>(commandBuffer),
			(VkImage) reinterpret_cast<VkImage>(srcImage),
			(VkImageLayout) srcImageLayout,
			(VkBuffer) reinterpret_cast<VkBuffer>(dstBuffer),
			(uint32_t) regionCount,
			(const VkBufferImageCopy*) pRegions);

  

}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkCmdUpdateBuffer0(JNIEnv* env, jclass clazz, jlong commandBuffer, jlong dstBuffer, jlong dstOffset, jlong dataSize, jobject obj_pData) {
	unsigned char* pData = (unsigned char*)(obj_pData?env->GetDirectBufferAddress(obj_pData) : NULL);


//@line:6732
 
	vkCmdUpdateBuffer(
			(VkCommandBuffer) reinterpret_cast<VkCommandBuffer>(commandBuffer),
			(VkBuffer) reinterpret_cast<VkBuffer>(dstBuffer),
			(VkDeviceSize) dstOffset,
			(VkDeviceSize) dataSize,
			(const void*) pData);

  

}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkCmdFillBuffer0(JNIEnv* env, jclass clazz, jlong commandBuffer, jlong dstBuffer, jlong dstOffset, jlong size, jint data) {


//@line:6793
 
	vkCmdFillBuffer(
			(VkCommandBuffer) reinterpret_cast<VkCommandBuffer>(commandBuffer),
			(VkBuffer) reinterpret_cast<VkBuffer>(dstBuffer),
			(VkDeviceSize) dstOffset,
			(VkDeviceSize) size,
			(uint32_t) data);

  

}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkCmdClearColorImage0(JNIEnv* env, jclass clazz, jlong commandBuffer, jlong image, jint imageLayout, jobject obj_pColor, jint rangeCount, jobject obj_pRanges) {
	char* pColor = (char*)(obj_pColor?env->GetDirectBufferAddress(obj_pColor) : NULL);
	char* pRanges = (char*)(obj_pRanges?env->GetDirectBufferAddress(obj_pRanges) : NULL);


//@line:6863
 
	vkCmdClearColorImage(
			(VkCommandBuffer) reinterpret_cast<VkCommandBuffer>(commandBuffer),
			(VkImage) reinterpret_cast<VkImage>(image),
			(VkImageLayout) imageLayout,
			(const VkClearColorValue*) pColor,
			(uint32_t) rangeCount,
			(const VkImageSubresourceRange*) pRanges);

  

}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkCmdClearDepthStencilImage0(JNIEnv* env, jclass clazz, jlong commandBuffer, jlong image, jint imageLayout, jobject obj_pDepthStencil, jint rangeCount, jobject obj_pRanges) {
	char* pDepthStencil = (char*)(obj_pDepthStencil?env->GetDirectBufferAddress(obj_pDepthStencil) : NULL);
	char* pRanges = (char*)(obj_pRanges?env->GetDirectBufferAddress(obj_pRanges) : NULL);


//@line:6934
 
	vkCmdClearDepthStencilImage(
			(VkCommandBuffer) reinterpret_cast<VkCommandBuffer>(commandBuffer),
			(VkImage) reinterpret_cast<VkImage>(image),
			(VkImageLayout) imageLayout,
			(const VkClearDepthStencilValue*) pDepthStencil,
			(uint32_t) rangeCount,
			(const VkImageSubresourceRange*) pRanges);

  

}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkCmdClearAttachments0(JNIEnv* env, jclass clazz, jlong commandBuffer, jint attachmentCount, jobject obj_pAttachments, jint rectCount, jobject obj_pRects) {
	char* pAttachments = (char*)(obj_pAttachments?env->GetDirectBufferAddress(obj_pAttachments) : NULL);
	char* pRects = (char*)(obj_pRects?env->GetDirectBufferAddress(obj_pRects) : NULL);


//@line:7003
 
	vkCmdClearAttachments(
			(VkCommandBuffer) reinterpret_cast<VkCommandBuffer>(commandBuffer),
			(uint32_t) attachmentCount,
			(const VkClearAttachment*) pAttachments,
			(uint32_t) rectCount,
			(const VkClearRect*) pRects);

  

}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkCmdResolveImage0(JNIEnv* env, jclass clazz, jlong commandBuffer, jlong srcImage, jint srcImageLayout, jlong dstImage, jint dstImageLayout, jint regionCount, jobject obj_pRegions) {
	char* pRegions = (char*)(obj_pRegions?env->GetDirectBufferAddress(obj_pRegions) : NULL);


//@line:7079
 
	vkCmdResolveImage(
			(VkCommandBuffer) reinterpret_cast<VkCommandBuffer>(commandBuffer),
			(VkImage) reinterpret_cast<VkImage>(srcImage),
			(VkImageLayout) srcImageLayout,
			(VkImage) reinterpret_cast<VkImage>(dstImage),
			(VkImageLayout) dstImageLayout,
			(uint32_t) regionCount,
			(const VkImageResolve*) pRegions);

  

}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkCmdSetEvent0(JNIEnv* env, jclass clazz, jlong commandBuffer, jlong event, jint stageMask) {


//@line:7130
 
	vkCmdSetEvent(
			(VkCommandBuffer) reinterpret_cast<VkCommandBuffer>(commandBuffer),
			(VkEvent) reinterpret_cast<VkEvent>(event),
			(VkPipelineStageFlags) stageMask);

  

}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkCmdResetEvent0(JNIEnv* env, jclass clazz, jlong commandBuffer, jlong event, jint stageMask) {


//@line:7177
 
	vkCmdResetEvent(
			(VkCommandBuffer) reinterpret_cast<VkCommandBuffer>(commandBuffer),
			(VkEvent) reinterpret_cast<VkEvent>(event),
			(VkPipelineStageFlags) stageMask);

  

}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkCmdWaitEvents0(JNIEnv* env, jclass clazz, jlong commandBuffer, jint eventCount, jobject obj_pEvents, jint srcStageMask, jint dstStageMask, jint memoryBarrierCount, jobject obj_pMemoryBarriers, jint bufferMemoryBarrierCount, jobject obj_pBufferMemoryBarriers, jint imageMemoryBarrierCount, jobject obj_pImageMemoryBarriers) {
	char* pEvents = (char*)(obj_pEvents?env->GetDirectBufferAddress(obj_pEvents) : NULL);
	char* pMemoryBarriers = (char*)(obj_pMemoryBarriers?env->GetDirectBufferAddress(obj_pMemoryBarriers) : NULL);
	char* pBufferMemoryBarriers = (char*)(obj_pBufferMemoryBarriers?env->GetDirectBufferAddress(obj_pBufferMemoryBarriers) : NULL);
	char* pImageMemoryBarriers = (char*)(obj_pImageMemoryBarriers?env->GetDirectBufferAddress(obj_pImageMemoryBarriers) : NULL);


//@line:7285
 
	vkCmdWaitEvents(
			(VkCommandBuffer) reinterpret_cast<VkCommandBuffer>(commandBuffer),
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

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkCmdPipelineBarrier0(JNIEnv* env, jclass clazz, jlong commandBuffer, jint srcStageMask, jint dstStageMask, jint dependencyFlags, jint memoryBarrierCount, jobject obj_pMemoryBarriers, jint bufferMemoryBarrierCount, jobject obj_pBufferMemoryBarriers, jint imageMemoryBarrierCount, jobject obj_pImageMemoryBarriers) {
	char* pMemoryBarriers = (char*)(obj_pMemoryBarriers?env->GetDirectBufferAddress(obj_pMemoryBarriers) : NULL);
	char* pBufferMemoryBarriers = (char*)(obj_pBufferMemoryBarriers?env->GetDirectBufferAddress(obj_pBufferMemoryBarriers) : NULL);
	char* pImageMemoryBarriers = (char*)(obj_pImageMemoryBarriers?env->GetDirectBufferAddress(obj_pImageMemoryBarriers) : NULL);


//@line:7391
 
	vkCmdPipelineBarrier(
			(VkCommandBuffer) reinterpret_cast<VkCommandBuffer>(commandBuffer),
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

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkCmdBeginQuery0(JNIEnv* env, jclass clazz, jlong commandBuffer, jlong queryPool, jint query, jint flags) {


//@line:7451
 
	vkCmdBeginQuery(
			(VkCommandBuffer) reinterpret_cast<VkCommandBuffer>(commandBuffer),
			(VkQueryPool) reinterpret_cast<VkQueryPool>(queryPool),
			(uint32_t) query,
			(VkQueryControlFlags) flags);

  

}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkCmdEndQuery0(JNIEnv* env, jclass clazz, jlong commandBuffer, jlong queryPool, jint query) {


//@line:7499
 
	vkCmdEndQuery(
			(VkCommandBuffer) reinterpret_cast<VkCommandBuffer>(commandBuffer),
			(VkQueryPool) reinterpret_cast<VkQueryPool>(queryPool),
			(uint32_t) query);

  

}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkCmdResetQueryPool0(JNIEnv* env, jclass clazz, jlong commandBuffer, jlong queryPool, jint firstQuery, jint queryCount) {


//@line:7552
 
	vkCmdResetQueryPool(
			(VkCommandBuffer) reinterpret_cast<VkCommandBuffer>(commandBuffer),
			(VkQueryPool) reinterpret_cast<VkQueryPool>(queryPool),
			(uint32_t) firstQuery,
			(uint32_t) queryCount);

  

}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkCmdWriteTimestamp0(JNIEnv* env, jclass clazz, jlong commandBuffer, jint pipelineStage, jlong queryPool, jint query) {


//@line:7606
 
	vkCmdWriteTimestamp(
			(VkCommandBuffer) reinterpret_cast<VkCommandBuffer>(commandBuffer),
			(VkPipelineStageFlagBits) pipelineStage,
			(VkQueryPool) reinterpret_cast<VkQueryPool>(queryPool),
			(uint32_t) query);

  

}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkCmdCopyQueryPoolResults0(JNIEnv* env, jclass clazz, jlong commandBuffer, jlong queryPool, jint firstQuery, jint queryCount, jlong dstBuffer, jlong dstOffset, jlong stride, jint flags) {


//@line:7684
 
	vkCmdCopyQueryPoolResults(
			(VkCommandBuffer) reinterpret_cast<VkCommandBuffer>(commandBuffer),
			(VkQueryPool) reinterpret_cast<VkQueryPool>(queryPool),
			(uint32_t) firstQuery,
			(uint32_t) queryCount,
			(VkBuffer) reinterpret_cast<VkBuffer>(dstBuffer),
			(VkDeviceSize) dstOffset,
			(VkDeviceSize) stride,
			(VkQueryResultFlags) flags);

  

}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkCmdPushConstants0(JNIEnv* env, jclass clazz, jlong commandBuffer, jlong layout, jint stageFlags, jint offset, jint size, jobject obj_pValues) {
	unsigned char* pValues = (unsigned char*)(obj_pValues?env->GetDirectBufferAddress(obj_pValues) : NULL);


//@line:7754
 
	vkCmdPushConstants(
			(VkCommandBuffer) reinterpret_cast<VkCommandBuffer>(commandBuffer),
			(VkPipelineLayout) reinterpret_cast<VkPipelineLayout>(layout),
			(VkShaderStageFlags) stageFlags,
			(uint32_t) offset,
			(uint32_t) size,
			(const void*) pValues);

  

}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkCmdBeginRenderPass0(JNIEnv* env, jclass clazz, jlong commandBuffer, jobject obj_pRenderPassBegin, jint contents) {
	char* pRenderPassBegin = (char*)(obj_pRenderPassBegin?env->GetDirectBufferAddress(obj_pRenderPassBegin) : NULL);


//@line:7804
 
	vkCmdBeginRenderPass(
			(VkCommandBuffer) reinterpret_cast<VkCommandBuffer>(commandBuffer),
			(const VkRenderPassBeginInfo*) pRenderPassBegin,
			(VkSubpassContents) contents);

  

}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkCmdNextSubpass0(JNIEnv* env, jclass clazz, jlong commandBuffer, jint contents) {


//@line:7845
 
	vkCmdNextSubpass(
			(VkCommandBuffer) reinterpret_cast<VkCommandBuffer>(commandBuffer),
			(VkSubpassContents) contents);

  

}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkCmdEndRenderPass0(JNIEnv* env, jclass clazz, jlong commandBuffer) {


//@line:7879
 
	vkCmdEndRenderPass(
			(VkCommandBuffer) reinterpret_cast<VkCommandBuffer>(commandBuffer));

  

}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkCmdExecuteCommands0(JNIEnv* env, jclass clazz, jlong commandBuffer, jint commandBufferCount, jobject obj_pCommandBuffers) {
	char* pCommandBuffers = (char*)(obj_pCommandBuffers?env->GetDirectBufferAddress(obj_pCommandBuffers) : NULL);


//@line:7927
 
	vkCmdExecuteCommands(
			(VkCommandBuffer) reinterpret_cast<VkCommandBuffer>(commandBuffer),
			(uint32_t) commandBufferCount,
			(const VkCommandBuffer*) pCommandBuffers);

  

}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkDestroySurfaceKHR0(JNIEnv* env, jclass clazz, jlong instance, jlong surface, jobject obj_pAllocator) {
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator) : NULL);


//@line:7974
 
	vkDestroySurfaceKHR(
			(VkInstance) reinterpret_cast<VkInstance>(instance),
			(VkSurfaceKHR) reinterpret_cast<VkSurfaceKHR>(surface),
			(const VkAllocationCallbacks*) pAllocator);

  

}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkGetPhysicalDeviceSurfaceSupportKHR0
(JNIEnv* env, jclass clazz, jlong physicalDevice, jint queueFamilyIndex, jlong surface, jbooleanArray obj_pSupported, bool* pSupported) {

//@line:8031
 
	VkResult res = vkGetPhysicalDeviceSurfaceSupportKHR(
			(VkPhysicalDevice) reinterpret_cast<VkPhysicalDevice>(physicalDevice),
			(uint32_t) queueFamilyIndex,
			(VkSurfaceKHR) reinterpret_cast<VkSurfaceKHR>(surface),
			(VkBool32*) pSupported);
	 return (jint) res;
  
}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkGetPhysicalDeviceSurfaceSupportKHR0(JNIEnv* env, jclass clazz, jlong physicalDevice, jint queueFamilyIndex, jlong surface, jbooleanArray obj_pSupported) {
	bool* pSupported = (bool*)(obj_pSupported ? env->GetBooleanArrayElements(obj_pSupported, 0) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkGetPhysicalDeviceSurfaceSupportKHR0(env, clazz, physicalDevice, queueFamilyIndex, surface, obj_pSupported, pSupported);

	if(obj_pSupported != NULL){
		 env->ReleaseBooleanArrayElements(obj_pSupported, (jboolean*)pSupported, 0);
	}

	return JNI_returnValue;
}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkGetPhysicalDeviceSurfaceCapabilitiesKHR0
(JNIEnv* env, jclass clazz, jlong physicalDevice, jlong surface, jobject obj_pSurfaceCapabilities, char* pSurfaceCapabilities) {

//@line:8083
 
	VkResult res = vkGetPhysicalDeviceSurfaceCapabilitiesKHR(
			(VkPhysicalDevice) reinterpret_cast<VkPhysicalDevice>(physicalDevice),
			(VkSurfaceKHR) reinterpret_cast<VkSurfaceKHR>(surface),
			(VkSurfaceCapabilitiesKHR*) pSurfaceCapabilities);
	 return (jint) res;
  
}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkGetPhysicalDeviceSurfaceCapabilitiesKHR0(JNIEnv* env, jclass clazz, jlong physicalDevice, jlong surface, jobject obj_pSurfaceCapabilities) {
	char* pSurfaceCapabilities = (char*)(obj_pSurfaceCapabilities?env->GetDirectBufferAddress(obj_pSurfaceCapabilities) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkGetPhysicalDeviceSurfaceCapabilitiesKHR0(env, clazz, physicalDevice, surface, obj_pSurfaceCapabilities, pSurfaceCapabilities);


	return JNI_returnValue;
}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkGetPhysicalDeviceSurfaceFormatsKHR0
(JNIEnv* env, jclass clazz, jlong physicalDevice, jlong surface, jintArray obj_pSurfaceFormatCount, jobject obj_pSurfaceFormats, char* pSurfaceFormats, int* pSurfaceFormatCount) {

//@line:8143
 
	VkResult res = vkGetPhysicalDeviceSurfaceFormatsKHR(
			(VkPhysicalDevice) reinterpret_cast<VkPhysicalDevice>(physicalDevice),
			(VkSurfaceKHR) reinterpret_cast<VkSurfaceKHR>(surface),
			(uint32_t*) pSurfaceFormatCount,
			(VkSurfaceFormatKHR*) pSurfaceFormats);
	 return (jint) res;
  
}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkGetPhysicalDeviceSurfaceFormatsKHR0(JNIEnv* env, jclass clazz, jlong physicalDevice, jlong surface, jintArray obj_pSurfaceFormatCount, jobject obj_pSurfaceFormats) {
	char* pSurfaceFormats = (char*)(obj_pSurfaceFormats?env->GetDirectBufferAddress(obj_pSurfaceFormats) : NULL);
	int* pSurfaceFormatCount = (int*)(obj_pSurfaceFormatCount ? env->GetIntArrayElements(obj_pSurfaceFormatCount, 0) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkGetPhysicalDeviceSurfaceFormatsKHR0(env, clazz, physicalDevice, surface, obj_pSurfaceFormatCount, obj_pSurfaceFormats, pSurfaceFormats, pSurfaceFormatCount);

	if(obj_pSurfaceFormatCount != NULL){
		 env->ReleaseIntArrayElements(obj_pSurfaceFormatCount, (jint*)pSurfaceFormatCount, 0);
	}

	return JNI_returnValue;
}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkGetPhysicalDeviceSurfacePresentModesKHR0
(JNIEnv* env, jclass clazz, jlong physicalDevice, jlong surface, jintArray obj_pPresentModeCount, jintArray obj_pPresentModes, int* pPresentModeCount, int* pPresentModes) {

//@line:8207
 
	VkResult res = vkGetPhysicalDeviceSurfacePresentModesKHR(
			(VkPhysicalDevice) reinterpret_cast<VkPhysicalDevice>(physicalDevice),
			(VkSurfaceKHR) reinterpret_cast<VkSurfaceKHR>(surface),
			(uint32_t*) pPresentModeCount,
			(VkPresentModeKHR*) pPresentModes);
	 return (jint) res;
  
}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkGetPhysicalDeviceSurfacePresentModesKHR0(JNIEnv* env, jclass clazz, jlong physicalDevice, jlong surface, jintArray obj_pPresentModeCount, jintArray obj_pPresentModes) {
	int* pPresentModeCount = (int*)(obj_pPresentModeCount ? env->GetIntArrayElements(obj_pPresentModeCount, 0) : NULL);
	int* pPresentModes = (int*)(obj_pPresentModes ? env->GetIntArrayElements(obj_pPresentModes, 0) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkGetPhysicalDeviceSurfacePresentModesKHR0(env, clazz, physicalDevice, surface, obj_pPresentModeCount, obj_pPresentModes, pPresentModeCount, pPresentModes);

	if(obj_pPresentModeCount != NULL){
		 env->ReleaseIntArrayElements(obj_pPresentModeCount, (jint*)pPresentModeCount, 0);
	}
	if(obj_pPresentModes != NULL){
		 env->ReleaseIntArrayElements(obj_pPresentModes, (jint*)pPresentModes, 0);
	}

	return JNI_returnValue;
}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkCreateSwapchainKHR0
(JNIEnv* env, jclass clazz, jlong device, jobject obj_pCreateInfo, jobject obj_pAllocator, jobject obj_pSwapchain, char* pCreateInfo, char* pAllocator, char* pSwapchain) {

//@line:8268
 
	VkResult res = vkCreateSwapchainKHR(
			(VkDevice) reinterpret_cast<VkDevice>(device),
			(const VkSwapchainCreateInfoKHR*) pCreateInfo,
			(const VkAllocationCallbacks*) pAllocator,
			(VkSwapchainKHR*) pSwapchain);
	 return (jint) res;
  
}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkCreateSwapchainKHR0(JNIEnv* env, jclass clazz, jlong device, jobject obj_pCreateInfo, jobject obj_pAllocator, jobject obj_pSwapchain) {
	char* pCreateInfo = (char*)(obj_pCreateInfo?env->GetDirectBufferAddress(obj_pCreateInfo) : NULL);
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator) : NULL);
	char* pSwapchain = (char*)(obj_pSwapchain?env->GetDirectBufferAddress(obj_pSwapchain) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkCreateSwapchainKHR0(env, clazz, device, obj_pCreateInfo, obj_pAllocator, obj_pSwapchain, pCreateInfo, pAllocator, pSwapchain);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkDestroySwapchainKHR0(JNIEnv* env, jclass clazz, jlong device, jlong swapchain, jobject obj_pAllocator) {
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator) : NULL);


//@line:8316
 
	vkDestroySwapchainKHR(
			(VkDevice) reinterpret_cast<VkDevice>(device),
			(VkSwapchainKHR) reinterpret_cast<VkSwapchainKHR>(swapchain),
			(const VkAllocationCallbacks*) pAllocator);

  

}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkGetSwapchainImagesKHR0
(JNIEnv* env, jclass clazz, jlong device, jlong swapchain, jintArray obj_pSwapchainImageCount, jobject obj_pSwapchainImages, char* pSwapchainImages, int* pSwapchainImageCount) {

//@line:8376
 
	VkResult res = vkGetSwapchainImagesKHR(
			(VkDevice) reinterpret_cast<VkDevice>(device),
			(VkSwapchainKHR) reinterpret_cast<VkSwapchainKHR>(swapchain),
			(uint32_t*) pSwapchainImageCount,
			(VkImage*) pSwapchainImages);
	 return (jint) res;
  
}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkGetSwapchainImagesKHR0(JNIEnv* env, jclass clazz, jlong device, jlong swapchain, jintArray obj_pSwapchainImageCount, jobject obj_pSwapchainImages) {
	char* pSwapchainImages = (char*)(obj_pSwapchainImages?env->GetDirectBufferAddress(obj_pSwapchainImages) : NULL);
	int* pSwapchainImageCount = (int*)(obj_pSwapchainImageCount ? env->GetIntArrayElements(obj_pSwapchainImageCount, 0) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkGetSwapchainImagesKHR0(env, clazz, device, swapchain, obj_pSwapchainImageCount, obj_pSwapchainImages, pSwapchainImages, pSwapchainImageCount);

	if(obj_pSwapchainImageCount != NULL){
		 env->ReleaseIntArrayElements(obj_pSwapchainImageCount, (jint*)pSwapchainImageCount, 0);
	}

	return JNI_returnValue;
}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkAcquireNextImageKHR0
(JNIEnv* env, jclass clazz, jlong device, jlong swapchain, jlong timeout, jlong semaphore, jlong fence, jintArray obj_pImageIndex, int* pImageIndex) {

//@line:8446
 
	VkResult res = vkAcquireNextImageKHR(
			(VkDevice) reinterpret_cast<VkDevice>(device),
			(VkSwapchainKHR) reinterpret_cast<VkSwapchainKHR>(swapchain),
			(uint64_t) timeout,
			(VkSemaphore) reinterpret_cast<VkSemaphore>(semaphore),
			(VkFence) reinterpret_cast<VkFence>(fence),
			(uint32_t*) pImageIndex);
	 return (jint) res;
  
}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkAcquireNextImageKHR0(JNIEnv* env, jclass clazz, jlong device, jlong swapchain, jlong timeout, jlong semaphore, jlong fence, jintArray obj_pImageIndex) {
	int* pImageIndex = (int*)(obj_pImageIndex ? env->GetIntArrayElements(obj_pImageIndex, 0) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkAcquireNextImageKHR0(env, clazz, device, swapchain, timeout, semaphore, fence, obj_pImageIndex, pImageIndex);

	if(obj_pImageIndex != NULL){
		 env->ReleaseIntArrayElements(obj_pImageIndex, (jint*)pImageIndex, 0);
	}

	return JNI_returnValue;
}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkQueuePresentKHR0
(JNIEnv* env, jclass clazz, jlong queue, jobject obj_pPresentInfo, char* pPresentInfo) {

//@line:8494
 
	VkResult res = vkQueuePresentKHR(
			(VkQueue) reinterpret_cast<VkQueue>(queue),
			(const VkPresentInfoKHR*) pPresentInfo);
	 return (jint) res;
  
}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkQueuePresentKHR0(JNIEnv* env, jclass clazz, jlong queue, jobject obj_pPresentInfo) {
	char* pPresentInfo = (char*)(obj_pPresentInfo?env->GetDirectBufferAddress(obj_pPresentInfo) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkQueuePresentKHR0(env, clazz, queue, obj_pPresentInfo, pPresentInfo);


	return JNI_returnValue;
}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkGetPhysicalDeviceDisplayPropertiesKHR0
(JNIEnv* env, jclass clazz, jlong physicalDevice, jintArray obj_pPropertyCount, jobject obj_pProperties, char* pProperties, int* pPropertyCount) {

//@line:8547
 
	VkResult res = vkGetPhysicalDeviceDisplayPropertiesKHR(
			(VkPhysicalDevice) reinterpret_cast<VkPhysicalDevice>(physicalDevice),
			(uint32_t*) pPropertyCount,
			(VkDisplayPropertiesKHR*) pProperties);
	 return (jint) res;
  
}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkGetPhysicalDeviceDisplayPropertiesKHR0(JNIEnv* env, jclass clazz, jlong physicalDevice, jintArray obj_pPropertyCount, jobject obj_pProperties) {
	char* pProperties = (char*)(obj_pProperties?env->GetDirectBufferAddress(obj_pProperties) : NULL);
	int* pPropertyCount = (int*)(obj_pPropertyCount ? env->GetIntArrayElements(obj_pPropertyCount, 0) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkGetPhysicalDeviceDisplayPropertiesKHR0(env, clazz, physicalDevice, obj_pPropertyCount, obj_pProperties, pProperties, pPropertyCount);

	if(obj_pPropertyCount != NULL){
		 env->ReleaseIntArrayElements(obj_pPropertyCount, (jint*)pPropertyCount, 0);
	}

	return JNI_returnValue;
}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkGetPhysicalDeviceDisplayPlanePropertiesKHR0
(JNIEnv* env, jclass clazz, jlong physicalDevice, jintArray obj_pPropertyCount, jobject obj_pProperties, char* pProperties, int* pPropertyCount) {

//@line:8601
 
	VkResult res = vkGetPhysicalDeviceDisplayPlanePropertiesKHR(
			(VkPhysicalDevice) reinterpret_cast<VkPhysicalDevice>(physicalDevice),
			(uint32_t*) pPropertyCount,
			(VkDisplayPlanePropertiesKHR*) pProperties);
	 return (jint) res;
  
}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkGetPhysicalDeviceDisplayPlanePropertiesKHR0(JNIEnv* env, jclass clazz, jlong physicalDevice, jintArray obj_pPropertyCount, jobject obj_pProperties) {
	char* pProperties = (char*)(obj_pProperties?env->GetDirectBufferAddress(obj_pProperties) : NULL);
	int* pPropertyCount = (int*)(obj_pPropertyCount ? env->GetIntArrayElements(obj_pPropertyCount, 0) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkGetPhysicalDeviceDisplayPlanePropertiesKHR0(env, clazz, physicalDevice, obj_pPropertyCount, obj_pProperties, pProperties, pPropertyCount);

	if(obj_pPropertyCount != NULL){
		 env->ReleaseIntArrayElements(obj_pPropertyCount, (jint*)pPropertyCount, 0);
	}

	return JNI_returnValue;
}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkGetDisplayPlaneSupportedDisplaysKHR0
(JNIEnv* env, jclass clazz, jlong physicalDevice, jint planeIndex, jintArray obj_pDisplayCount, jobject obj_pDisplays, char* pDisplays, int* pDisplayCount) {

//@line:8661
 
	VkResult res = vkGetDisplayPlaneSupportedDisplaysKHR(
			(VkPhysicalDevice) reinterpret_cast<VkPhysicalDevice>(physicalDevice),
			(uint32_t) planeIndex,
			(uint32_t*) pDisplayCount,
			(VkDisplayKHR*) pDisplays);
	 return (jint) res;
  
}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkGetDisplayPlaneSupportedDisplaysKHR0(JNIEnv* env, jclass clazz, jlong physicalDevice, jint planeIndex, jintArray obj_pDisplayCount, jobject obj_pDisplays) {
	char* pDisplays = (char*)(obj_pDisplays?env->GetDirectBufferAddress(obj_pDisplays) : NULL);
	int* pDisplayCount = (int*)(obj_pDisplayCount ? env->GetIntArrayElements(obj_pDisplayCount, 0) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkGetDisplayPlaneSupportedDisplaysKHR0(env, clazz, physicalDevice, planeIndex, obj_pDisplayCount, obj_pDisplays, pDisplays, pDisplayCount);

	if(obj_pDisplayCount != NULL){
		 env->ReleaseIntArrayElements(obj_pDisplayCount, (jint*)pDisplayCount, 0);
	}

	return JNI_returnValue;
}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkGetDisplayModePropertiesKHR0
(JNIEnv* env, jclass clazz, jlong physicalDevice, jlong display, jintArray obj_pPropertyCount, jobject obj_pProperties, char* pProperties, int* pPropertyCount) {

//@line:8722
 
	VkResult res = vkGetDisplayModePropertiesKHR(
			(VkPhysicalDevice) reinterpret_cast<VkPhysicalDevice>(physicalDevice),
			(VkDisplayKHR) reinterpret_cast<VkDisplayKHR>(display),
			(uint32_t*) pPropertyCount,
			(VkDisplayModePropertiesKHR*) pProperties);
	 return (jint) res;
  
}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkGetDisplayModePropertiesKHR0(JNIEnv* env, jclass clazz, jlong physicalDevice, jlong display, jintArray obj_pPropertyCount, jobject obj_pProperties) {
	char* pProperties = (char*)(obj_pProperties?env->GetDirectBufferAddress(obj_pProperties) : NULL);
	int* pPropertyCount = (int*)(obj_pPropertyCount ? env->GetIntArrayElements(obj_pPropertyCount, 0) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkGetDisplayModePropertiesKHR0(env, clazz, physicalDevice, display, obj_pPropertyCount, obj_pProperties, pProperties, pPropertyCount);

	if(obj_pPropertyCount != NULL){
		 env->ReleaseIntArrayElements(obj_pPropertyCount, (jint*)pPropertyCount, 0);
	}

	return JNI_returnValue;
}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkCreateDisplayModeKHR0
(JNIEnv* env, jclass clazz, jlong physicalDevice, jlong display, jobject obj_pCreateInfo, jobject obj_pAllocator, jobject obj_pMode, char* pCreateInfo, char* pAllocator, char* pMode) {

//@line:8789
 
	VkResult res = vkCreateDisplayModeKHR(
			(VkPhysicalDevice) reinterpret_cast<VkPhysicalDevice>(physicalDevice),
			(VkDisplayKHR) reinterpret_cast<VkDisplayKHR>(display),
			(const VkDisplayModeCreateInfoKHR*) pCreateInfo,
			(const VkAllocationCallbacks*) pAllocator,
			(VkDisplayModeKHR*) pMode);
	 return (jint) res;
  
}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkCreateDisplayModeKHR0(JNIEnv* env, jclass clazz, jlong physicalDevice, jlong display, jobject obj_pCreateInfo, jobject obj_pAllocator, jobject obj_pMode) {
	char* pCreateInfo = (char*)(obj_pCreateInfo?env->GetDirectBufferAddress(obj_pCreateInfo) : NULL);
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator) : NULL);
	char* pMode = (char*)(obj_pMode?env->GetDirectBufferAddress(obj_pMode) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkCreateDisplayModeKHR0(env, clazz, physicalDevice, display, obj_pCreateInfo, obj_pAllocator, obj_pMode, pCreateInfo, pAllocator, pMode);


	return JNI_returnValue;
}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkGetDisplayPlaneCapabilitiesKHR0
(JNIEnv* env, jclass clazz, jlong physicalDevice, jlong mode, jint planeIndex, jobject obj_pCapabilities, char* pCapabilities) {

//@line:8848
 
	VkResult res = vkGetDisplayPlaneCapabilitiesKHR(
			(VkPhysicalDevice) reinterpret_cast<VkPhysicalDevice>(physicalDevice),
			(VkDisplayModeKHR) reinterpret_cast<VkDisplayModeKHR>(mode),
			(uint32_t) planeIndex,
			(VkDisplayPlaneCapabilitiesKHR*) pCapabilities);
	 return (jint) res;
  
}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkGetDisplayPlaneCapabilitiesKHR0(JNIEnv* env, jclass clazz, jlong physicalDevice, jlong mode, jint planeIndex, jobject obj_pCapabilities) {
	char* pCapabilities = (char*)(obj_pCapabilities?env->GetDirectBufferAddress(obj_pCapabilities) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkGetDisplayPlaneCapabilitiesKHR0(env, clazz, physicalDevice, mode, planeIndex, obj_pCapabilities, pCapabilities);


	return JNI_returnValue;
}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkCreateDisplayPlaneSurfaceKHR0
(JNIEnv* env, jclass clazz, jlong instance, jobject obj_pCreateInfo, jobject obj_pAllocator, jobject obj_pSurface, char* pCreateInfo, char* pAllocator, char* pSurface) {

//@line:8909
 
	VkResult res = vkCreateDisplayPlaneSurfaceKHR(
			(VkInstance) reinterpret_cast<VkInstance>(instance),
			(const VkDisplaySurfaceCreateInfoKHR*) pCreateInfo,
			(const VkAllocationCallbacks*) pAllocator,
			(VkSurfaceKHR*) pSurface);
	 return (jint) res;
  
}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkCreateDisplayPlaneSurfaceKHR0(JNIEnv* env, jclass clazz, jlong instance, jobject obj_pCreateInfo, jobject obj_pAllocator, jobject obj_pSurface) {
	char* pCreateInfo = (char*)(obj_pCreateInfo?env->GetDirectBufferAddress(obj_pCreateInfo) : NULL);
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator) : NULL);
	char* pSurface = (char*)(obj_pSurface?env->GetDirectBufferAddress(obj_pSurface) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkCreateDisplayPlaneSurfaceKHR0(env, clazz, instance, obj_pCreateInfo, obj_pAllocator, obj_pSurface, pCreateInfo, pAllocator, pSurface);


	return JNI_returnValue;
}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkCreateSharedSwapchainsKHR0
(JNIEnv* env, jclass clazz, jlong device, jint swapchainCount, jobject obj_pCreateInfos, jobject obj_pAllocator, jobject obj_pSwapchains, char* pCreateInfos, char* pAllocator, char* pSwapchains) {

//@line:8979
 
	VkResult res = vkCreateSharedSwapchainsKHR(
			(VkDevice) reinterpret_cast<VkDevice>(device),
			(uint32_t) swapchainCount,
			(const VkSwapchainCreateInfoKHR*) pCreateInfos,
			(const VkAllocationCallbacks*) pAllocator,
			(VkSwapchainKHR*) pSwapchains);
	 return (jint) res;
  
}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkCreateSharedSwapchainsKHR0(JNIEnv* env, jclass clazz, jlong device, jint swapchainCount, jobject obj_pCreateInfos, jobject obj_pAllocator, jobject obj_pSwapchains) {
	char* pCreateInfos = (char*)(obj_pCreateInfos?env->GetDirectBufferAddress(obj_pCreateInfos) : NULL);
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator) : NULL);
	char* pSwapchains = (char*)(obj_pSwapchains?env->GetDirectBufferAddress(obj_pSwapchains) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkCreateSharedSwapchainsKHR0(env, clazz, device, swapchainCount, obj_pCreateInfos, obj_pAllocator, obj_pSwapchains, pCreateInfos, pAllocator, pSwapchains);


	return JNI_returnValue;
}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkCreateXlibSurfaceKHR0
(JNIEnv* env, jclass clazz, jlong instance, jobject obj_pCreateInfo, jobject obj_pAllocator, jobject obj_pSurface, char* pCreateInfo, char* pAllocator, char* pSurface) {

//@line:9043
 
     #ifdef VK_USE_PLATFORM_XLIB_KHR	
	VkResult res = vkCreateXlibSurfaceKHR(
			(VkInstance) reinterpret_cast<VkInstance>(instance),
			(const VkXlibSurfaceCreateInfoKHR*) pCreateInfo,
			(const VkAllocationCallbacks*) pAllocator,
			(VkSurfaceKHR*) pSurface);
	 return (jint) res;	 
     #else
         return (jint)VkResult::VK_ERROR_INCOMPATIBLE_DISPLAY_KHR;
     #endif  
  
}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkCreateXlibSurfaceKHR0(JNIEnv* env, jclass clazz, jlong instance, jobject obj_pCreateInfo, jobject obj_pAllocator, jobject obj_pSurface) {
	char* pCreateInfo = (char*)(obj_pCreateInfo?env->GetDirectBufferAddress(obj_pCreateInfo) : NULL);
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator) : NULL);
	char* pSurface = (char*)(obj_pSurface?env->GetDirectBufferAddress(obj_pSurface) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkCreateXlibSurfaceKHR0(env, clazz, instance, obj_pCreateInfo, obj_pAllocator, obj_pSurface, pCreateInfo, pAllocator, pSurface);


	return JNI_returnValue;
}

JNIEXPORT jboolean JNICALL Java_bor_vulkan_Vk10_vkGetPhysicalDeviceXlibPresentationSupportKHR0(JNIEnv* env, jclass clazz, jlong physicalDevice, jint queueFamilyIndex, jlong dpy, jlong visualID) {


//@line:9105

    #ifdef VK_USE_PLATFORM_XLIB_KHR		 
	boolean res = vkGetPhysicalDeviceXlibPresentationSupportKHR(
			(VkPhysicalDevice) reinterpret_cast<VkPhysicalDevice>(physicalDevice),
			(uint32_t) queueFamilyIndex,
			(Display*) dpy,
			(VisualID) reinterpret_cast<VisualID>(visualID));
	 return (jboolean) res;	 
     #else 
         return (jboolean)JNI_FALSE;
     #endif  
  

}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkCreateXcbSurfaceKHR0
(JNIEnv* env, jclass clazz, jlong instance, jobject obj_pCreateInfo, jobject obj_pAllocator, jobject obj_pSurface, char* pCreateInfo, char* pAllocator, char* pSurface) {

//@line:9170
 
    #ifdef VK_USE_PLATFORM_XCB_KHR  
	VkResult res = vkCreateXcbSurfaceKHR(
			(VkInstance) reinterpret_cast<VkInstance>(instance),
			(const VkXcbSurfaceCreateInfoKHR*) pCreateInfo,
			(const VkAllocationCallbacks*) pAllocator,
			(VkSurfaceKHR*) pSurface);
	 return (jint) res;	 
     #else
         return (jint)VkResult::VK_ERROR_INCOMPATIBLE_DISPLAY_KHR;
     #endif  
  
}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkCreateXcbSurfaceKHR0(JNIEnv* env, jclass clazz, jlong instance, jobject obj_pCreateInfo, jobject obj_pAllocator, jobject obj_pSurface) {
	char* pCreateInfo = (char*)(obj_pCreateInfo?env->GetDirectBufferAddress(obj_pCreateInfo) : NULL);
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator) : NULL);
	char* pSurface = (char*)(obj_pSurface?env->GetDirectBufferAddress(obj_pSurface) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkCreateXcbSurfaceKHR0(env, clazz, instance, obj_pCreateInfo, obj_pAllocator, obj_pSurface, pCreateInfo, pAllocator, pSurface);


	return JNI_returnValue;
}

JNIEXPORT jboolean JNICALL Java_bor_vulkan_Vk10_vkGetPhysicalDeviceXcbPresentationSupportKHR0(JNIEnv* env, jclass clazz, jlong physicalDevice, jint queueFamilyIndex, jlong connection, jlong visual_id) {


//@line:9232
 
        #ifdef VK_USE_PLATFORM_XCB_KHR  
	boolean res = vkGetPhysicalDeviceXcbPresentationSupportKHR(
			(VkPhysicalDevice) reinterpret_cast<VkPhysicalDevice>(physicalDevice),
			(uint32_t) queueFamilyIndex,
			(xcb_connection_t*) connection,
			(xcb_visualid_t) reinterpret_cast<xcb_visualid_t>(visual_id));
	 return (jboolean) res;	 
     #else 
         return (jboolean)JNI_FALSE;
     #endif  
  

}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkCreateWaylandSurfaceKHR0
(JNIEnv* env, jclass clazz, jlong instance, jobject obj_pCreateInfo, jobject obj_pAllocator, jobject obj_pSurface, char* pCreateInfo, char* pAllocator, char* pSurface) {

//@line:9297
 
    #ifdef VK_USE_PLATFORM_WAYLAND_KHR
	VkResult res = vkCreateWaylandSurfaceKHR(
			(VkInstance) reinterpret_cast<VkInstance>(instance),
			(const VkWaylandSurfaceCreateInfoKHR*) pCreateInfo,
			(const VkAllocationCallbacks*) pAllocator,
			(VkSurfaceKHR*) pSurface);
	 return (jint) res;	 
     #else
         return (jint)VkResult::VK_ERROR_INCOMPATIBLE_DISPLAY_KHR;
     #endif  
  
}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkCreateWaylandSurfaceKHR0(JNIEnv* env, jclass clazz, jlong instance, jobject obj_pCreateInfo, jobject obj_pAllocator, jobject obj_pSurface) {
	char* pCreateInfo = (char*)(obj_pCreateInfo?env->GetDirectBufferAddress(obj_pCreateInfo) : NULL);
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator) : NULL);
	char* pSurface = (char*)(obj_pSurface?env->GetDirectBufferAddress(obj_pSurface) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkCreateWaylandSurfaceKHR0(env, clazz, instance, obj_pCreateInfo, obj_pAllocator, obj_pSurface, pCreateInfo, pAllocator, pSurface);


	return JNI_returnValue;
}

JNIEXPORT jboolean JNICALL Java_bor_vulkan_Vk10_vkGetPhysicalDeviceWaylandPresentationSupportKHR0(JNIEnv* env, jclass clazz, jlong physicalDevice, jint queueFamilyIndex, jlong display) {


//@line:9353
 
     #ifdef VK_USE_PLATFORM_WAYLAND_KHR
	boolean res = vkGetPhysicalDeviceWaylandPresentationSupportKHR(
			(VkPhysicalDevice) reinterpret_cast<VkPhysicalDevice>(physicalDevice),
			(uint32_t) queueFamilyIndex,
			(struct wl_display*) display);
	 return (jboolean) res;	 
     #else
         return (jboolean)JNI_FALSE;
     #endif  
  

}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkCreateMirSurfaceKHR0
(JNIEnv* env, jclass clazz, jlong instance, jobject obj_pCreateInfo, jobject obj_pAllocator, jobject obj_pSurface, char* pCreateInfo, char* pAllocator, char* pSurface) {

//@line:9417
 
     #ifdef VK_USE_PLATFORM_MIR_KHR 		
	VkResult res = vkCreateMirSurfaceKHR(
			(VkInstance) reinterpret_cast<VkInstance>(instance),
			(const VkMirSurfaceCreateInfoKHR*) pCreateInfo,
			(const VkAllocationCallbacks*) pAllocator,
			(VkSurfaceKHR*) pSurface);
	 return (jint) res;	 
     #else
         return (jint)VkResult::VK_ERROR_INCOMPATIBLE_DISPLAY_KHR;
     #endif  
  
}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkCreateMirSurfaceKHR0(JNIEnv* env, jclass clazz, jlong instance, jobject obj_pCreateInfo, jobject obj_pAllocator, jobject obj_pSurface) {
	char* pCreateInfo = (char*)(obj_pCreateInfo?env->GetDirectBufferAddress(obj_pCreateInfo) : NULL);
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator) : NULL);
	char* pSurface = (char*)(obj_pSurface?env->GetDirectBufferAddress(obj_pSurface) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkCreateMirSurfaceKHR0(env, clazz, instance, obj_pCreateInfo, obj_pAllocator, obj_pSurface, pCreateInfo, pAllocator, pSurface);


	return JNI_returnValue;
}

JNIEXPORT jboolean JNICALL Java_bor_vulkan_Vk10_vkGetPhysicalDeviceMirPresentationSupportKHR0(JNIEnv* env, jclass clazz, jlong physicalDevice, jint queueFamilyIndex, jlong connection) {


//@line:9473
 
     #ifdef VK_USE_PLATFORM_MIR_KHR 
	boolean res = vkGetPhysicalDeviceMirPresentationSupportKHR(
			(VkPhysicalDevice) reinterpret_cast<VkPhysicalDevice>(physicalDevice),
			(uint32_t) queueFamilyIndex,
			(MirConnection*) connection);
	 return (jboolean) res;	 
     #else
          return (jboolean)JNI_FALSE;
     #endif  
  

}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkCreateAndroidSurfaceKHR0
(JNIEnv* env, jclass clazz, jlong instance, jobject obj_pCreateInfo, jobject obj_pAllocator, jobject obj_pSurface, char* pCreateInfo, char* pAllocator, char* pSurface) {

//@line:9537
 
        #ifdef VK_USE_PLATFORM_ANDROID_KHR 
	VkResult res = vkCreateAndroidSurfaceKHR(
			(VkInstance) reinterpret_cast<VkInstance>(instance),
			(const VkAndroidSurfaceCreateInfoKHR*) pCreateInfo,
			(const VkAllocationCallbacks*) pAllocator,
			(VkSurfaceKHR*) pSurface);
	 return (jint) res;	 
     #else
         return (jint)VkResult::VK_ERROR_INCOMPATIBLE_DISPLAY_KHR;
     #endif  
  
}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkCreateAndroidSurfaceKHR0(JNIEnv* env, jclass clazz, jlong instance, jobject obj_pCreateInfo, jobject obj_pAllocator, jobject obj_pSurface) {
	char* pCreateInfo = (char*)(obj_pCreateInfo?env->GetDirectBufferAddress(obj_pCreateInfo) : NULL);
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator) : NULL);
	char* pSurface = (char*)(obj_pSurface?env->GetDirectBufferAddress(obj_pSurface) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkCreateAndroidSurfaceKHR0(env, clazz, instance, obj_pCreateInfo, obj_pAllocator, obj_pSurface, pCreateInfo, pAllocator, pSurface);


	return JNI_returnValue;
}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkCreateWin32SurfaceKHR0
(JNIEnv* env, jclass clazz, jlong instance, jobject obj_pCreateInfo, jobject obj_pAllocator, jobject obj_pSurface, char* pCreateInfo, char* pAllocator, char* pSurface) {

//@line:9602

     // used in Windows OS only                                                      
     #ifdef VK_USE_PLATFORM_WIN32_KHR
	VkResult res = vkCreateWin32SurfaceKHR(
			(VkInstance) reinterpret_cast<VkInstance>(instance),
			(const VkWin32SurfaceCreateInfoKHR*) pCreateInfo,
			(const VkAllocationCallbacks*) pAllocator,
			(VkSurfaceKHR*) pSurface);
	 return (jint) res;
     #else
         return (jint)VkResult::VK_ERROR_INCOMPATIBLE_DISPLAY_KHR;
     #endif  
  
}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkCreateWin32SurfaceKHR0(JNIEnv* env, jclass clazz, jlong instance, jobject obj_pCreateInfo, jobject obj_pAllocator, jobject obj_pSurface) {
	char* pCreateInfo = (char*)(obj_pCreateInfo?env->GetDirectBufferAddress(obj_pCreateInfo) : NULL);
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator) : NULL);
	char* pSurface = (char*)(obj_pSurface?env->GetDirectBufferAddress(obj_pSurface) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkCreateWin32SurfaceKHR0(env, clazz, instance, obj_pCreateInfo, obj_pAllocator, obj_pSurface, pCreateInfo, pAllocator, pSurface);


	return JNI_returnValue;
}

JNIEXPORT jboolean JNICALL Java_bor_vulkan_Vk10_vkGetPhysicalDeviceWin32PresentationSupportKHR0(JNIEnv* env, jclass clazz, jlong physicalDevice, jint queueFamilyIndex) {


//@line:9653
 
     // used in Windows OS only                                                      
     #ifdef VK_USE_PLATFORM_WIN32_KHR
	 VkBool32 res = vkGetPhysicalDeviceWin32PresentationSupportKHR(
			(VkPhysicalDevice) reinterpret_cast<VkPhysicalDevice>(physicalDevice),
			(uint32_t) queueFamilyIndex);
	 return (jboolean) res;	 
     #else
         return (jboolean)JNI_FALSE;
     #endif  
  

}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkCreateDebugReportCallbackEXT0
(JNIEnv* env, jclass clazz, jlong instance, jobject obj_pCreateInfo, jobject obj_pAllocator, jobject obj_pCallback, char* pCreateInfo, char* pAllocator, char* pCallback) {

//@line:9717
 
	VkResult res = vkCreateDebugReportCallbackEXT(
			(VkInstance) reinterpret_cast<VkInstance>(instance),
			(const VkDebugReportCallbackCreateInfoEXT*) pCreateInfo,
			(const VkAllocationCallbacks*) pAllocator,
			(VkDebugReportCallbackEXT*) pCallback);
	 return (jint) res;
  
}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkCreateDebugReportCallbackEXT0(JNIEnv* env, jclass clazz, jlong instance, jobject obj_pCreateInfo, jobject obj_pAllocator, jobject obj_pCallback) {
	char* pCreateInfo = (char*)(obj_pCreateInfo?env->GetDirectBufferAddress(obj_pCreateInfo) : NULL);
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator) : NULL);
	char* pCallback = (char*)(obj_pCallback?env->GetDirectBufferAddress(obj_pCallback) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkCreateDebugReportCallbackEXT0(env, clazz, instance, obj_pCreateInfo, obj_pAllocator, obj_pCallback, pCreateInfo, pAllocator, pCallback);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkDestroyDebugReportCallbackEXT0(JNIEnv* env, jclass clazz, jlong instance, jlong callback, jobject obj_pAllocator) {
	char* pAllocator = (char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator) : NULL);


//@line:9765
 
	vkDestroyDebugReportCallbackEXT(
			(VkInstance) reinterpret_cast<VkInstance>(instance),
			(VkDebugReportCallbackEXT) reinterpret_cast<VkDebugReportCallbackEXT>(callback),
			(const VkAllocationCallbacks*) pAllocator);

  

}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkDebugReportMessageEXT0(JNIEnv* env, jclass clazz, jlong instance, jint flags, jint objectType, jlong object, jlong location, jint messageCode, jstring obj_pLayerPrefix, jstring obj_pMessage) {
	char* pLayerPrefix = (char*)(obj_pLayerPrefix ? env->GetStringUTFChars(obj_pLayerPrefix, 0) : NULL);
	char* pMessage = (char*)(obj_pMessage ? env->GetStringUTFChars(obj_pMessage, 0) : NULL);


//@line:9842
 
	vkDebugReportMessageEXT(
			(VkInstance) reinterpret_cast<VkInstance>(instance),
			(VkDebugReportFlagsEXT) flags,
			(VkDebugReportObjectTypeEXT) objectType,
			(uint64_t) object,
			(size_t) location,
			(int32_t) messageCode,
			(const char*) pLayerPrefix,
			(const char*) pMessage);

  
	 if(obj_pLayerPrefix != NULL){
		 env->ReleaseStringUTFChars(obj_pLayerPrefix, pLayerPrefix);
	 }
	 if(obj_pMessage != NULL){
		 env->ReleaseStringUTFChars(obj_pMessage, pMessage);
	 }

}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkDebugMarkerSetObjectTagEXT0
(JNIEnv* env, jclass clazz, jlong device, jobject obj_pTagInfo, char* pTagInfo) {

//@line:9892
 
	VkResult res = vkDebugMarkerSetObjectTagEXT(
			(VkDevice) reinterpret_cast<VkDevice>(device),
			(VkDebugMarkerObjectTagInfoEXT*) pTagInfo);
	 return (jint) res;
  
}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkDebugMarkerSetObjectTagEXT0(JNIEnv* env, jclass clazz, jlong device, jobject obj_pTagInfo) {
	char* pTagInfo = (char*)(obj_pTagInfo?env->GetDirectBufferAddress(obj_pTagInfo) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkDebugMarkerSetObjectTagEXT0(env, clazz, device, obj_pTagInfo, pTagInfo);


	return JNI_returnValue;
}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkDebugMarkerSetObjectNameEXT0
(JNIEnv* env, jclass clazz, jlong device, jobject obj_pNameInfo, char* pNameInfo) {

//@line:9936
 
	VkResult res = vkDebugMarkerSetObjectNameEXT(
			(VkDevice) reinterpret_cast<VkDevice>(device),
			(VkDebugMarkerObjectNameInfoEXT*) pNameInfo);
	 return (jint) res;
  
}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkDebugMarkerSetObjectNameEXT0(JNIEnv* env, jclass clazz, jlong device, jobject obj_pNameInfo) {
	char* pNameInfo = (char*)(obj_pNameInfo?env->GetDirectBufferAddress(obj_pNameInfo) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkDebugMarkerSetObjectNameEXT0(env, clazz, device, obj_pNameInfo, pNameInfo);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkCmdDebugMarkerBeginEXT0(JNIEnv* env, jclass clazz, jlong commandBuffer, jobject obj_pMarkerInfo) {
	char* pMarkerInfo = (char*)(obj_pMarkerInfo?env->GetDirectBufferAddress(obj_pMarkerInfo) : NULL);


//@line:9976
 
	vkCmdDebugMarkerBeginEXT(
			(VkCommandBuffer) reinterpret_cast<VkCommandBuffer>(commandBuffer),
			(VkDebugMarkerMarkerInfoEXT*) pMarkerInfo);

  

}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkCmdDebugMarkerEndEXT0(JNIEnv* env, jclass clazz, jlong commandBuffer) {


//@line:10010
 
	vkCmdDebugMarkerEndEXT(
			(VkCommandBuffer) reinterpret_cast<VkCommandBuffer>(commandBuffer));

  

}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkCmdDebugMarkerInsertEXT0(JNIEnv* env, jclass clazz, jlong commandBuffer, jobject obj_pMarkerInfo) {
	char* pMarkerInfo = (char*)(obj_pMarkerInfo?env->GetDirectBufferAddress(obj_pMarkerInfo) : NULL);


//@line:10049
 
	vkCmdDebugMarkerInsertEXT(
			(VkCommandBuffer) reinterpret_cast<VkCommandBuffer>(commandBuffer),
			(VkDebugMarkerMarkerInfoEXT*) pMarkerInfo);

  

}

