#include <bor.vulkan.structs.VkDeviceCreateInfo.h>

//@line:47

    #include <BorVulkan.hpp>
    JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDeviceCreateInfo_setSType0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _sType) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:483

		  VkDeviceCreateInfo* vkObj = (VkDeviceCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->sType = (VkStructureType) (_sType);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkDeviceCreateInfo_getSType0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:493

		  VkDeviceCreateInfo* vkObj = (VkDeviceCreateInfo*)(ptr);
		  // generic get for Vk enums
		  return (jint) (vkObj->sType);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkDeviceCreateInfo_getSType0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDeviceCreateInfo_getSType0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDeviceCreateInfo_setPNext0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__pNext) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _pNext = (char*)(obj__pNext?env->GetDirectBufferAddress(obj__pNext) : NULL);


//@line:503

		  VkDeviceCreateInfo* vkObj = (VkDeviceCreateInfo*)(ptr);
		 // code for Buffer - ptr to ptr 
		 const void* p_pNext = ( void*) _pNext; 
		 vkObj->pNext = p_pNext; 
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkDeviceCreateInfo_getPNext0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:514

		  VkDeviceCreateInfo* vkObj = (VkDeviceCreateInfo*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->pNext);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkDeviceCreateInfo_getPNext0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDeviceCreateInfo_getPNext0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDeviceCreateInfo_setFlags0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _flags) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:524

		  VkDeviceCreateInfo* vkObj = (VkDeviceCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->flags = (VkDeviceCreateFlags) (_flags);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkDeviceCreateInfo_getFlags0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:534

		  VkDeviceCreateInfo* vkObj = (VkDeviceCreateInfo*)(ptr);
		  return (jint) (vkObj->flags);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkDeviceCreateInfo_getFlags0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDeviceCreateInfo_getFlags0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDeviceCreateInfo_setQueueCreateInfoCount0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _queueCreateInfoCount) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:543

		  VkDeviceCreateInfo* vkObj = (VkDeviceCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->queueCreateInfoCount = (uint32_t) (_queueCreateInfoCount);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkDeviceCreateInfo_getQueueCreateInfoCount0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:553

		  VkDeviceCreateInfo* vkObj = (VkDeviceCreateInfo*)(ptr);
		  return (jint) (vkObj->queueCreateInfoCount);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkDeviceCreateInfo_getQueueCreateInfoCount0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDeviceCreateInfo_getQueueCreateInfoCount0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDeviceCreateInfo_setPQueueCreateInfos0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__pQueueCreateInfos) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _pQueueCreateInfos = (char*)(obj__pQueueCreateInfos?env->GetDirectBufferAddress(obj__pQueueCreateInfos) : NULL);


//@line:562

		  VkDeviceCreateInfo* vkObj = (VkDeviceCreateInfo*)(ptr);
		 // code for Buffer - ptr to ptr 
		 const VkDeviceQueueCreateInfo* p_pQueueCreateInfos = ( VkDeviceQueueCreateInfo*) _pQueueCreateInfos; 
		 vkObj->pQueueCreateInfos = p_pQueueCreateInfos; 
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkDeviceCreateInfo_getPQueueCreateInfos0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:573

		  VkDeviceCreateInfo* vkObj = (VkDeviceCreateInfo*)(ptr);
		  // generic get for array of VkHandle and VkStruct 
		  return (jlong) reinterpret_cast<jlong>( &vkObj->pQueueCreateInfos );
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkDeviceCreateInfo_getPQueueCreateInfos0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDeviceCreateInfo_getPQueueCreateInfos0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDeviceCreateInfo_setEnabledLayerCount0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _enabledLayerCount) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:583

		  VkDeviceCreateInfo* vkObj = (VkDeviceCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->enabledLayerCount = (uint32_t) (_enabledLayerCount);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkDeviceCreateInfo_getEnabledLayerCount0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:593

		  VkDeviceCreateInfo* vkObj = (VkDeviceCreateInfo*)(ptr);
		  return (jint) (vkObj->enabledLayerCount);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkDeviceCreateInfo_getEnabledLayerCount0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDeviceCreateInfo_getEnabledLayerCount0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

static inline void wrapped_Java_bor_vulkan_structs_VkDeviceCreateInfo_setPpEnabledLayerNames0
(JNIEnv* env, jclass clazz, jobject obj_ptr, jobjectArray ppEnabledLayerNames, unsigned char* ptr) {

//@line:602

          VkDeviceCreateInfo* vkObj = (VkDeviceCreateInfo*)(ptr);
          int stringCount = ppEnabledLayerNames ? env->GetArrayLength(ppEnabledLayerNames) : 0;
          if(stringCount==0)
              return;
              
                  const char** enabledLayers = CALLOC(stringCount,const char*) ;
                  
                  for (int i=0; i<stringCount; i++) {
                          jstring string = (jstring) env->GetObjectArrayElement(ppEnabledLayerNames, i);
                          const char *rawString = env->GetStringUTFChars(string, 0);
                          enabledLayers[i] = cloneStr(rawString);
                          env->ReleaseStringUTFChars(string, rawString);
                   }
                  vkObj->enabledLayerCount = stringCount;
                  vkObj->ppEnabledLayerNames = enabledLayers;
      
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDeviceCreateInfo_setPpEnabledLayerNames0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobjectArray ppEnabledLayerNames) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	wrapped_Java_bor_vulkan_structs_VkDeviceCreateInfo_setPpEnabledLayerNames0(env, clazz, obj_ptr, ppEnabledLayerNames, ptr);


	return;
}

static inline jobjectArray wrapped_Java_bor_vulkan_structs_VkDeviceCreateInfo_getPpEnabledLayerNames0
(JNIEnv* env, jclass clazz, jobject obj_ptr, jobjectArray names, unsigned char* ptr) {

//@line:625

              if(names == NULL) return NULL;
          VkDeviceCreateInfo* vkObj = (VkDeviceCreateInfo*)(ptr);
          int count = (int) vkObj->enabledLayerCount;
                  if(count > 0){
                    for(int i = 0; i<count; i++){
                         env->SetObjectArrayElement(names, 
                                                    i,
                                                    env->NewStringUTF(vkObj->ppEnabledLayerNames[i]));
                      }//for                      
                  }//if count                  
         return names;
     
}

JNIEXPORT jobjectArray JNICALL Java_bor_vulkan_structs_VkDeviceCreateInfo_getPpEnabledLayerNames0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobjectArray names) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jobjectArray JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDeviceCreateInfo_getPpEnabledLayerNames0(env, clazz, obj_ptr, names, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDeviceCreateInfo_setEnabledExtensionCount0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _enabledExtensionCount) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:643

		  VkDeviceCreateInfo* vkObj = (VkDeviceCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->enabledExtensionCount = (uint32_t) (_enabledExtensionCount);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkDeviceCreateInfo_getEnabledExtensionCount0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:653

		  VkDeviceCreateInfo* vkObj = (VkDeviceCreateInfo*)(ptr);
		  return (jint) (vkObj->enabledExtensionCount);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkDeviceCreateInfo_getEnabledExtensionCount0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDeviceCreateInfo_getEnabledExtensionCount0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDeviceCreateInfo_setPpEnabledExtensionNames0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobjectArray _ppEnabledExtensionNames) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:662

          VkDeviceCreateInfo* vkObj = (VkDeviceCreateInfo*)(ptr);         
          int stringCount = _ppEnabledExtensionNames ? env->GetArrayLength(_ppEnabledExtensionNames) : 0;
          
                  const char** names = CALLOC(stringCount,const char*);  
                                  
                  for (int i=0; i<stringCount; i++) {
                          jstring string = (jstring) env->GetObjectArrayElement(_ppEnabledExtensionNames, i);
                          const char *rawString = env->GetStringUTFChars(string, 0);
                          names[i] = cloneStr(rawString);                          
                          env->ReleaseStringUTFChars(string, rawString);
                   }                   
                  vkObj->enabledExtensionCount = stringCount;
                  vkObj->ppEnabledExtensionNames = names; 
            
      

}

static inline jobjectArray wrapped_Java_bor_vulkan_structs_VkDeviceCreateInfo_getPpEnabledExtensionNames0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:684

          VkDeviceCreateInfo* vkObj = (VkDeviceCreateInfo*)(ptr);
          int count = (int) vkObj->enabledExtensionCount;
          
                  jobjectArray ret = NULL;                  
                  if(count>0){                   
                   // thanks to code ranch 
                   // http://www.coderanch.com/t/326467/java/java/Returning-String-array-program-Java
                   ret = (jobjectArray)env->NewObjectArray(count,
                                                           env->FindClass("java/lang/String"),
                                                           NULL);//env->NewStringUTF(""));                  
                    for(int i = 0; i<count; i++){
                         env->SetObjectArrayElement(ret, 
                                                    i,
                                                    env->NewStringUTF(vkObj->ppEnabledExtensionNames[i]));
                      }//for
                  }//if count
                  
        return ret;
     
}

JNIEXPORT jobjectArray JNICALL Java_bor_vulkan_structs_VkDeviceCreateInfo_getPpEnabledExtensionNames0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jobjectArray JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDeviceCreateInfo_getPpEnabledExtensionNames0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDeviceCreateInfo_setPEnabledFeatures0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__pEnabledFeatures) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _pEnabledFeatures = (char*)(obj__pEnabledFeatures?env->GetDirectBufferAddress(obj__pEnabledFeatures) : NULL);


//@line:709

		  VkDeviceCreateInfo* vkObj = (VkDeviceCreateInfo*)(ptr);
		 // code for Buffer - ptr to ptr 
		 const VkPhysicalDeviceFeatures* p_pEnabledFeatures = ( VkPhysicalDeviceFeatures*) _pEnabledFeatures; 
		 vkObj->pEnabledFeatures = p_pEnabledFeatures; 
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkDeviceCreateInfo_getPEnabledFeatures0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:720

		  VkDeviceCreateInfo* vkObj = (VkDeviceCreateInfo*)(ptr);
		  // generic get for array of VkHandle and VkStruct 
		  return (jlong) reinterpret_cast<jlong>( &vkObj->pEnabledFeatures );
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkDeviceCreateInfo_getPEnabledFeatures0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDeviceCreateInfo_getPEnabledFeatures0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

