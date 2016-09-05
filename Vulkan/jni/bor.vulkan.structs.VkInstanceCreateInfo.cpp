#include <bor.vulkan.structs.VkInstanceCreateInfo.h>

//@line:45

    #include <BorVulkan.hpp>
    JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkInstanceCreateInfo_setSType0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _sType) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:422

		  VkInstanceCreateInfo* vkObj = (VkInstanceCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->sType = (VkStructureType) (_sType);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkInstanceCreateInfo_getSType0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:432

		  VkInstanceCreateInfo* vkObj = (VkInstanceCreateInfo*)(ptr);
		  // generic get for Vk enums
		  return (jint) (vkObj->sType);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkInstanceCreateInfo_getSType0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkInstanceCreateInfo_getSType0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkInstanceCreateInfo_setPNext0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__pNext) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _pNext = (char*)(obj__pNext?env->GetDirectBufferAddress(obj__pNext) : NULL);


//@line:442

		  VkInstanceCreateInfo* vkObj = (VkInstanceCreateInfo*)(ptr);
		 // code for Buffer - ptr to ptr 
		 const void* p_pNext = ( void*) _pNext; 
		 vkObj->pNext = p_pNext; 
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkInstanceCreateInfo_getPNext0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:453

		  VkInstanceCreateInfo* vkObj = (VkInstanceCreateInfo*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->pNext);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkInstanceCreateInfo_getPNext0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkInstanceCreateInfo_getPNext0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkInstanceCreateInfo_setFlags0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _flags) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:463

		  VkInstanceCreateInfo* vkObj = (VkInstanceCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->flags = (VkInstanceCreateFlags) (_flags);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkInstanceCreateInfo_getFlags0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:473

		  VkInstanceCreateInfo* vkObj = (VkInstanceCreateInfo*)(ptr);
		  return (jint) (vkObj->flags);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkInstanceCreateInfo_getFlags0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkInstanceCreateInfo_getFlags0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkInstanceCreateInfo_setPApplicationInfo0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__pApplicationInfo) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _pApplicationInfo = (char*)(obj__pApplicationInfo?env->GetDirectBufferAddress(obj__pApplicationInfo) : NULL);


//@line:482

		  VkInstanceCreateInfo* vkObj = (VkInstanceCreateInfo*)(ptr);
		 // code for Buffer - ptr to ptr 
		 const VkApplicationInfo* p_pApplicationInfo = ( VkApplicationInfo*) _pApplicationInfo; 
		 vkObj->pApplicationInfo = p_pApplicationInfo; 
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkInstanceCreateInfo_getPApplicationInfo0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:493

		  VkInstanceCreateInfo* vkObj = (VkInstanceCreateInfo*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->pApplicationInfo);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkInstanceCreateInfo_getPApplicationInfo0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkInstanceCreateInfo_getPApplicationInfo0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkInstanceCreateInfo_setEnabledLayerCount0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _enabledLayerCount) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:503

		  VkInstanceCreateInfo* vkObj = (VkInstanceCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->enabledLayerCount = (uint32_t) (_enabledLayerCount);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkInstanceCreateInfo_getEnabledLayerCount0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:513

		  VkInstanceCreateInfo* vkObj = (VkInstanceCreateInfo*)(ptr);
		  return (jint) (vkObj->enabledLayerCount);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkInstanceCreateInfo_getEnabledLayerCount0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkInstanceCreateInfo_getEnabledLayerCount0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

static inline void wrapped_Java_bor_vulkan_structs_VkInstanceCreateInfo_setPpEnabledLayerNames0
(JNIEnv* env, jclass clazz, jobject obj_ptr, jobjectArray enabledLayerNames, unsigned char* ptr) {

//@line:522

              VkInstanceCreateInfo* vkObj = (VkInstanceCreateInfo*)(ptr);
              if(enabledLayerNames==NULL){
                 vkObj->enabledLayerCount = 0;
                 vkObj->ppEnabledLayerNames = NULL;
                 return;
              }
              int stringCount =  env->GetArrayLength(enabledLayerNames);
              const char** enabledLayers = CALLOC(stringCount, const char*);
                  
              for (int i=0; i<stringCount; i++) {
                   jstring string = (jstring) env->GetObjectArrayElement(enabledLayerNames, i);
                   const char* rawString = env->GetStringUTFChars(string, 0);                          
                   enabledLayers[i] = cloneStr(rawString);
                   env->ReleaseStringUTFChars(string, rawString);
               }                   
              vkObj->enabledLayerCount = stringCount;
              vkObj->ppEnabledLayerNames = enabledLayers;        
      
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkInstanceCreateInfo_setPpEnabledLayerNames0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobjectArray enabledLayerNames) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	wrapped_Java_bor_vulkan_structs_VkInstanceCreateInfo_setPpEnabledLayerNames0(env, clazz, obj_ptr, enabledLayerNames, ptr);


	return;
}

static inline void wrapped_Java_bor_vulkan_structs_VkInstanceCreateInfo_getPpEnabledLayerNames0
(JNIEnv* env, jclass clazz, jobject obj_ptr, jobjectArray names, unsigned char* ptr) {

//@line:546

          if(names == NULL) 
                    return;              
          VkInstanceCreateInfo* vkObj = (VkInstanceCreateInfo*)(ptr);                 
          int count = MIN((int)vkObj->enabledLayerCount, env->GetArrayLength(names)) ;
          if(count > 0){
            for(int i = 0; i<count; i++){
                env->SetObjectArrayElement(names, 
                                           i,
                                           env->NewStringUTF(vkObj->ppEnabledLayerNames[i]));
             }//for                      
           }//if count
           
           return; 
     
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkInstanceCreateInfo_getPpEnabledLayerNames0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobjectArray names) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	wrapped_Java_bor_vulkan_structs_VkInstanceCreateInfo_getPpEnabledLayerNames0(env, clazz, obj_ptr, names, ptr);


	return;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkInstanceCreateInfo_setEnabledExtensionCount0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _enabledExtensionCount) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:566

		  VkInstanceCreateInfo* vkObj = (VkInstanceCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->enabledExtensionCount = (uint32_t) (_enabledExtensionCount);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkInstanceCreateInfo_getEnabledExtensionCount0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:576

		  VkInstanceCreateInfo* vkObj = (VkInstanceCreateInfo*)(ptr);
		  return (jint) (vkObj->enabledExtensionCount);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkInstanceCreateInfo_getEnabledExtensionCount0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkInstanceCreateInfo_getEnabledExtensionCount0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

static inline void wrapped_Java_bor_vulkan_structs_VkInstanceCreateInfo_setPpEnabledExtensionNames0
(JNIEnv* env, jclass clazz, jobject obj_ptr, jobjectArray enabledExtensionNames, unsigned char* ptr) {

//@line:585

          VkInstanceCreateInfo* vkObj = (VkInstanceCreateInfo*)(ptr);
          if(enabledExtensionNames == NULL){
            vkObj->ppEnabledExtensionNames = NULL;
            vkObj->enabledExtensionCount = 0;
            return;
          }          
          
          int stringCount = env->GetArrayLength(enabledExtensionNames);                   
          const char** enabledExtensions =  CALLOC(stringCount, const char*);
                            
          for (int i=0; i<stringCount; i++) {
               jstring string = (jstring) env->GetObjectArrayElement(enabledExtensionNames, i);
               const char* rawString = env->GetStringUTFChars(string, 0); 
               enabledExtensions[i] = cloneStr(rawString);                          
               env->ReleaseStringUTFChars(string, rawString);
           }
           vkObj->ppEnabledExtensionNames = enabledExtensions;  
           vkObj->enabledExtensionCount = (uint32_t)stringCount;              
      
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkInstanceCreateInfo_setPpEnabledExtensionNames0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobjectArray enabledExtensionNames) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	wrapped_Java_bor_vulkan_structs_VkInstanceCreateInfo_setPpEnabledExtensionNames0(env, clazz, obj_ptr, enabledExtensionNames, ptr);


	return;
}

static inline void wrapped_Java_bor_vulkan_structs_VkInstanceCreateInfo_getPpEnabledExtensionNames0
(JNIEnv* env, jclass clazz, jobject obj_ptr, jobjectArray ext, unsigned char* ptr) {

//@line:610

        if(ext==NULL){
          return ;
         }   
         VkInstanceCreateInfo* vkObj = (VkInstanceCreateInfo*)(ptr);
         int count = MIN((int) vkObj->enabledExtensionCount, env->GetArrayLength(ext)); 
            
         for(int i = 0; i < count; i++){
             const char* extName =  vkObj->ppEnabledExtensionNames[i];
             env->SetObjectArrayElement(ext, 
                                      i,
                                      env->NewStringUTF(extName));                                    
          }//for
        
    
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkInstanceCreateInfo_getPpEnabledExtensionNames0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobjectArray ext) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	wrapped_Java_bor_vulkan_structs_VkInstanceCreateInfo_getPpEnabledExtensionNames0(env, clazz, obj_ptr, ext, ptr);


	return;
}

