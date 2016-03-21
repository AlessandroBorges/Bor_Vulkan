#include <bor.vulkan.Vk10.h>

//@line:29

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
     static inline jobject wrapped_Java_bor_vulkan_Vk10_vkCreateInstance0
(JNIEnv* env, jclass clazz, jobject obj_pCreateInfo, jobject obj_pAllocator, jintArray obj_result, unsigned char* pCreateInfo, unsigned char* pAllocator, int* result) {

//@line:94

       
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
       
}

JNIEXPORT jobject JNICALL Java_bor_vulkan_Vk10_vkCreateInstance0(JNIEnv* env, jclass clazz, jobject obj_pCreateInfo, jobject obj_pAllocator, jintArray obj_result) {
	unsigned char* pCreateInfo = (unsigned char*)(obj_pCreateInfo?env->GetDirectBufferAddress(obj_pCreateInfo):0);
	unsigned char* pAllocator = (unsigned char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator):0);
	int* result = (int*)env->GetPrimitiveArrayCritical(obj_result, 0);

	jobject JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkCreateInstance0(env, clazz, obj_pCreateInfo, obj_pAllocator, obj_result, pCreateInfo, pAllocator, result);

	env->ReleasePrimitiveArrayCritical(obj_result, result, 0);

	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkDestroyInstance0(JNIEnv* env, jclass clazz, jobject obj_pInstance, jobject obj_pAllocator) {
	unsigned char* pInstance = (unsigned char*)(obj_pInstance?env->GetDirectBufferAddress(obj_pInstance):0);
	unsigned char* pAllocator = (unsigned char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator):0);


//@line:140
       
       
       VkInstance* instance = (VkInstance*)(pInstance);                                                         
       vkDestroyInstance( (VkInstance) (*instance),
                          (const VkAllocationCallbacks*)   pAllocator);        
       

}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkEnumeratePhysicalDevices0
(JNIEnv* env, jclass clazz, jobject obj_instance, jintArray obj_pPhysicalDeviceCount, jobjectArray pPhysicalDevicesRet, jint size, unsigned char* instance, int* pPhysicalDeviceCount) {

//@line:218

       
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
                     
                     
       
}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkEnumeratePhysicalDevices0(JNIEnv* env, jclass clazz, jobject obj_instance, jintArray obj_pPhysicalDeviceCount, jobjectArray pPhysicalDevicesRet, jint size) {
	unsigned char* instance = (unsigned char*)(obj_instance?env->GetDirectBufferAddress(obj_instance):0);
	int* pPhysicalDeviceCount = (int*)env->GetPrimitiveArrayCritical(obj_pPhysicalDeviceCount, 0);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkEnumeratePhysicalDevices0(env, clazz, obj_instance, obj_pPhysicalDeviceCount, pPhysicalDevicesRet, size, instance, pPhysicalDeviceCount);

	env->ReleasePrimitiveArrayCritical(obj_pPhysicalDeviceCount, pPhysicalDeviceCount, 0);

	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkGetPhysicalDeviceFeatures0(JNIEnv* env, jclass clazz, jobject obj_pphysicalDevice, jobject obj_pFeatures) {
	unsigned char* pphysicalDevice = (unsigned char*)(obj_pphysicalDevice?env->GetDirectBufferAddress(obj_pphysicalDevice):0);
	unsigned char* pFeatures = (unsigned char*)(obj_pFeatures?env->GetDirectBufferAddress(obj_pFeatures):0);


//@line:264

                                                           
    VkPhysicalDevice* physicalDevice = (VkPhysicalDevice*)pphysicalDevice;
                                                           
    vkGetPhysicalDeviceFeatures(
               (VkPhysicalDevice)  (*physicalDevice),
               (VkPhysicalDeviceFeatures*)  pFeatures);
       

}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkGetPhysicalDeviceFormatProperties0(JNIEnv* env, jclass clazz, jobject obj_pphysicalDevice, jint format, jobject obj_pFormatProperties) {
	unsigned char* pphysicalDevice = (unsigned char*)(obj_pphysicalDevice?env->GetDirectBufferAddress(obj_pphysicalDevice):0);
	unsigned char* pFormatProperties = (unsigned char*)(obj_pFormatProperties?env->GetDirectBufferAddress(obj_pFormatProperties):0);


//@line:299

               
     VkPhysicalDevice* physicalDevice = (VkPhysicalDevice*)pphysicalDevice;          
     vkGetPhysicalDeviceFormatProperties(
              (VkPhysicalDevice)  (*physicalDevice),
              (VkFormat)  format,
              (VkFormatProperties*)   pFormatProperties);
    

}

static inline jint wrapped_Java_bor_vulkan_Vk10_vkGetPhysicalDeviceImageFormatProperties0
(JNIEnv* env, jclass clazz, jobject obj_pphysicalDevice, jint format, jint type, jint tiling, jint usage, jint flags, jobject obj_pImageFormatProperties, unsigned char* pphysicalDevice, unsigned char* pImageFormatProperties) {

//@line:364

               
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
       
}

JNIEXPORT jint JNICALL Java_bor_vulkan_Vk10_vkGetPhysicalDeviceImageFormatProperties0(JNIEnv* env, jclass clazz, jobject obj_pphysicalDevice, jint format, jint type, jint tiling, jint usage, jint flags, jobject obj_pImageFormatProperties) {
	unsigned char* pphysicalDevice = (unsigned char*)(obj_pphysicalDevice?env->GetDirectBufferAddress(obj_pphysicalDevice):0);
	unsigned char* pImageFormatProperties = (unsigned char*)(obj_pImageFormatProperties?env->GetDirectBufferAddress(obj_pImageFormatProperties):0);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkGetPhysicalDeviceImageFormatProperties0(env, clazz, obj_pphysicalDevice, format, type, tiling, usage, flags, obj_pImageFormatProperties, pphysicalDevice, pImageFormatProperties);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkGetPhysicalDeviceProperties0(JNIEnv* env, jclass clazz, jobject obj_pphysicalDevice, jobject obj_pProperties) {
	unsigned char* pphysicalDevice = (unsigned char*)(obj_pphysicalDevice?env->GetDirectBufferAddress(obj_pphysicalDevice):0);
	unsigned char* pProperties = (unsigned char*)(obj_pProperties?env->GetDirectBufferAddress(obj_pProperties):0);


//@line:407
 
               
       VkPhysicalDevice* physicalDevice = (VkPhysicalDevice*)pphysicalDevice;
               
       vkGetPhysicalDeviceProperties(
            (VkPhysicalDevice)   (*physicalDevice),
            (VkPhysicalDeviceProperties*)  pProperties);               
      

}

static inline jobjectArray wrapped_Java_bor_vulkan_Vk10_vkGetPhysicalDeviceQueueFamilyProperties0
(JNIEnv* env, jclass clazz, jobject obj_pphysicalDevice, jintArray obj_pQueueFamilyPropertyCount, unsigned char* pphysicalDevice, int* pQueueFamilyPropertyCount) {

//@line:467
                              
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
      
}

JNIEXPORT jobjectArray JNICALL Java_bor_vulkan_Vk10_vkGetPhysicalDeviceQueueFamilyProperties0(JNIEnv* env, jclass clazz, jobject obj_pphysicalDevice, jintArray obj_pQueueFamilyPropertyCount) {
	unsigned char* pphysicalDevice = (unsigned char*)(obj_pphysicalDevice?env->GetDirectBufferAddress(obj_pphysicalDevice):0);
	int* pQueueFamilyPropertyCount = (int*)env->GetPrimitiveArrayCritical(obj_pQueueFamilyPropertyCount, 0);

	jobjectArray JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkGetPhysicalDeviceQueueFamilyProperties0(env, clazz, obj_pphysicalDevice, obj_pQueueFamilyPropertyCount, pphysicalDevice, pQueueFamilyPropertyCount);

	env->ReleasePrimitiveArrayCritical(obj_pQueueFamilyPropertyCount, pQueueFamilyPropertyCount, 0);

	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkGetPhysicalDeviceMemoryProperties0(JNIEnv* env, jclass clazz, jobject obj_pphysicalDevice, jobject obj_pMemoryProperties) {
	unsigned char* pphysicalDevice = (unsigned char*)(obj_pphysicalDevice?env->GetDirectBufferAddress(obj_pphysicalDevice):0);
	unsigned char* pMemoryProperties = (unsigned char*)(obj_pMemoryProperties?env->GetDirectBufferAddress(obj_pMemoryProperties):0);


//@line:518

               
     VkPhysicalDevice* physicalDevice = (VkPhysicalDevice*)pphysicalDevice;
     vkGetPhysicalDeviceMemoryProperties(
             (VkPhysicalDevice) (*physicalDevice),
             (VkPhysicalDeviceMemoryProperties*)  pMemoryProperties);        
               
    

}

static inline jobject wrapped_Java_bor_vulkan_Vk10_vkGetInstanceProcAddr0
(JNIEnv* env, jclass clazz, jobject obj_pInstance, jstring obj_pName, unsigned char* pInstance, char* pName) {

//@line:546

               VkInstance* instance = (VkInstance*)(pInstance); 
               PFN_vkVoidFunction func;               
               func  = vkGetInstanceProcAddr(
                            (VkInstance)   (*instance),
                            (const char*)     pName);                            
              jobject pFunc = env->NewDirectByteBuffer((void*) func, 
                                                      (jlong) sizeof(void*));                                                       
              return pFunc;                                                                               
       
}

JNIEXPORT jobject JNICALL Java_bor_vulkan_Vk10_vkGetInstanceProcAddr0(JNIEnv* env, jclass clazz, jobject obj_pInstance, jstring obj_pName) {
	unsigned char* pInstance = (unsigned char*)(obj_pInstance?env->GetDirectBufferAddress(obj_pInstance):0);
	char* pName = (char*)env->GetStringUTFChars(obj_pName, 0);

	jobject JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkGetInstanceProcAddr0(env, clazz, obj_pInstance, obj_pName, pInstance, pName);

	env->ReleaseStringUTFChars(obj_pName, pName);

	return JNI_returnValue;
}

static inline jobject wrapped_Java_bor_vulkan_Vk10_vkGetDeviceProcAddr0
(JNIEnv* env, jclass clazz, jobject obj_pDevice, jstring obj_pName, unsigned char* pDevice, char* pName) {

//@line:577

       VkDevice* device = (VkDevice*) pDevice;        
       PFN_vkVoidFunction func =  vkGetDeviceProcAddr(
                                     (VkDevice) (*device),
                                     (const char*) pName);
                               
       jobject pFunc = env->NewDirectByteBuffer((void*) func, 
                                                (jlong) sizeof(void*));                                                       
        return pFunc;
      
}

JNIEXPORT jobject JNICALL Java_bor_vulkan_Vk10_vkGetDeviceProcAddr0(JNIEnv* env, jclass clazz, jobject obj_pDevice, jstring obj_pName) {
	unsigned char* pDevice = (unsigned char*)(obj_pDevice?env->GetDirectBufferAddress(obj_pDevice):0);
	char* pName = (char*)env->GetStringUTFChars(obj_pName, 0);

	jobject JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkGetDeviceProcAddr0(env, clazz, obj_pDevice, obj_pName, pDevice, pName);

	env->ReleaseStringUTFChars(obj_pName, pName);

	return JNI_returnValue;
}

static inline jobject wrapped_Java_bor_vulkan_Vk10_vkCreateDevice0
(JNIEnv* env, jclass clazz, jobject obj_pPhysicalDevice, jobject obj_pCreateInfo, jobject obj_pAllocator, jintArray obj_result, unsigned char* pPhysicalDevice, unsigned char* pCreateInfo, unsigned char* pAllocator, int* result) {

//@line:631

       
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
       
}

JNIEXPORT jobject JNICALL Java_bor_vulkan_Vk10_vkCreateDevice0(JNIEnv* env, jclass clazz, jobject obj_pPhysicalDevice, jobject obj_pCreateInfo, jobject obj_pAllocator, jintArray obj_result) {
	unsigned char* pPhysicalDevice = (unsigned char*)(obj_pPhysicalDevice?env->GetDirectBufferAddress(obj_pPhysicalDevice):0);
	unsigned char* pCreateInfo = (unsigned char*)(obj_pCreateInfo?env->GetDirectBufferAddress(obj_pCreateInfo):0);
	unsigned char* pAllocator = (unsigned char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator):0);
	int* result = (int*)env->GetPrimitiveArrayCritical(obj_result, 0);

	jobject JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkCreateDevice0(env, clazz, obj_pPhysicalDevice, obj_pCreateInfo, obj_pAllocator, obj_result, pPhysicalDevice, pCreateInfo, pAllocator, result);

	env->ReleasePrimitiveArrayCritical(obj_result, result, 0);

	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_Vk10_vkDestroyDevice0(JNIEnv* env, jclass clazz, jobject obj_pDevice, jobject obj_pAllocator) {
	unsigned char* pDevice = (unsigned char*)(obj_pDevice?env->GetDirectBufferAddress(obj_pDevice):0);
	unsigned char* pAllocator = (unsigned char*)(obj_pAllocator?env->GetDirectBufferAddress(obj_pAllocator):0);


//@line:673

         VkDevice* device = (VkDevice*) pDevice;      
         vkDestroyDevice( (VkDevice) (*device),
                          (const VkAllocationCallbacks*)   pAllocator);
      

}

static inline jobjectArray wrapped_Java_bor_vulkan_Vk10_vkEnumerateInstanceExtensionProperties0
(JNIEnv* env, jclass clazz, jstring obj_pLayerName, jintArray obj_pPropertyCount, jintArray obj_result, char* pLayerName, int* pPropertyCount, int* result) {

//@line:726

       
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
(JNIEnv* env, jclass clazz, jobject obj_pPhysicalDevice, jstring obj_pLayerName, jintArray obj_pPropertyCount, jintArray obj_result, unsigned char* pPhysicalDevice, char* pLayerName, int* pPropertyCount, int* result) {

//@line:809

               
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
               
       
}

JNIEXPORT jobjectArray JNICALL Java_bor_vulkan_Vk10_vkEnumerateDeviceExtensionProperties0(JNIEnv* env, jclass clazz, jobject obj_pPhysicalDevice, jstring obj_pLayerName, jintArray obj_pPropertyCount, jintArray obj_result) {
	unsigned char* pPhysicalDevice = (unsigned char*)(obj_pPhysicalDevice?env->GetDirectBufferAddress(obj_pPhysicalDevice):0);
	char* pLayerName = (char*)env->GetStringUTFChars(obj_pLayerName, 0);
	int* pPropertyCount = (int*)env->GetPrimitiveArrayCritical(obj_pPropertyCount, 0);
	int* result = (int*)env->GetPrimitiveArrayCritical(obj_result, 0);

	jobjectArray JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkEnumerateDeviceExtensionProperties0(env, clazz, obj_pPhysicalDevice, obj_pLayerName, obj_pPropertyCount, obj_result, pPhysicalDevice, pLayerName, pPropertyCount, result);

	env->ReleasePrimitiveArrayCritical(obj_pPropertyCount, pPropertyCount, 0);
	env->ReleasePrimitiveArrayCritical(obj_result, result, 0);
	env->ReleaseStringUTFChars(obj_pLayerName, pLayerName);

	return JNI_returnValue;
}

static inline jobjectArray wrapped_Java_bor_vulkan_Vk10_vkEnumerateInstanceLayerProperties0
(JNIEnv* env, jclass clazz, jintArray obj_pPropertyCount, jintArray obj_result, int* pPropertyCount, int* result) {

//@line:883

               
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
        
}

JNIEXPORT jobjectArray JNICALL Java_bor_vulkan_Vk10_vkEnumerateInstanceLayerProperties0(JNIEnv* env, jclass clazz, jintArray obj_pPropertyCount, jintArray obj_result) {
	int* pPropertyCount = (int*)env->GetPrimitiveArrayCritical(obj_pPropertyCount, 0);
	int* result = (int*)env->GetPrimitiveArrayCritical(obj_result, 0);

	jobjectArray JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkEnumerateInstanceLayerProperties0(env, clazz, obj_pPropertyCount, obj_result, pPropertyCount, result);

	env->ReleasePrimitiveArrayCritical(obj_pPropertyCount, pPropertyCount, 0);
	env->ReleasePrimitiveArrayCritical(obj_result, result, 0);

	return JNI_returnValue;
}

static inline jobjectArray wrapped_Java_bor_vulkan_Vk10_vkEnumerateDeviceLayerProperties0
(JNIEnv* env, jclass clazz, jobject obj_pPhysicalDevice, jintArray obj_pPropertyCount, jintArray obj_result, unsigned char* pPhysicalDevice, int* pPropertyCount, int* result) {

//@line:960

               
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
      
}

JNIEXPORT jobjectArray JNICALL Java_bor_vulkan_Vk10_vkEnumerateDeviceLayerProperties0(JNIEnv* env, jclass clazz, jobject obj_pPhysicalDevice, jintArray obj_pPropertyCount, jintArray obj_result) {
	unsigned char* pPhysicalDevice = (unsigned char*)(obj_pPhysicalDevice?env->GetDirectBufferAddress(obj_pPhysicalDevice):0);
	int* pPropertyCount = (int*)env->GetPrimitiveArrayCritical(obj_pPropertyCount, 0);
	int* result = (int*)env->GetPrimitiveArrayCritical(obj_result, 0);

	jobjectArray JNI_returnValue = wrapped_Java_bor_vulkan_Vk10_vkEnumerateDeviceLayerProperties0(env, clazz, obj_pPhysicalDevice, obj_pPropertyCount, obj_result, pPhysicalDevice, pPropertyCount, result);

	env->ReleasePrimitiveArrayCritical(obj_pPropertyCount, pPropertyCount, 0);
	env->ReleasePrimitiveArrayCritical(obj_result, result, 0);

	return JNI_returnValue;
}

static inline jobject wrapped_Java_bor_vulkan_Vk10_vkGetDeviceQueue0
(JNIEnv* env, jclass clazz, jobject obj_pDevice, jint queueFamilyIndex, jint queueIndex, unsigned char* pDevice) {

//@line:1027

               
       VkQueue*   pQueue;
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

