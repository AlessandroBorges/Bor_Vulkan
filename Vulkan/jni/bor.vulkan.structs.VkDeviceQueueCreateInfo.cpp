#include <bor.vulkan.structs.VkDeviceQueueCreateInfo.h>

//@line:43

    #include <BorVulkan.hpp>
    JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDeviceQueueCreateInfo_setSType0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _sType) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:314

		  VkDeviceQueueCreateInfo* vkObj = (VkDeviceQueueCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->sType = (VkStructureType) (_sType);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkDeviceQueueCreateInfo_getSType0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:324

		  VkDeviceQueueCreateInfo* vkObj = (VkDeviceQueueCreateInfo*)(ptr);
		  // generic get for Vk enums
		  return (jint) (vkObj->sType);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkDeviceQueueCreateInfo_getSType0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDeviceQueueCreateInfo_getSType0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDeviceQueueCreateInfo_setPNext0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__pNext) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _pNext = (char*)(obj__pNext?env->GetDirectBufferAddress(obj__pNext) : NULL);


//@line:334

		  VkDeviceQueueCreateInfo* vkObj = (VkDeviceQueueCreateInfo*)(ptr);
		 // code for Buffer - ptr to ptr 
		 const void* p_pNext = ( void*) _pNext; 
		 vkObj->pNext = p_pNext; 
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkDeviceQueueCreateInfo_getPNext0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:345

		  VkDeviceQueueCreateInfo* vkObj = (VkDeviceQueueCreateInfo*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->pNext);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkDeviceQueueCreateInfo_getPNext0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDeviceQueueCreateInfo_getPNext0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDeviceQueueCreateInfo_setFlags0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _flags) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:355

		  VkDeviceQueueCreateInfo* vkObj = (VkDeviceQueueCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->flags = (VkDeviceQueueCreateFlags) (_flags);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkDeviceQueueCreateInfo_getFlags0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:365

		  VkDeviceQueueCreateInfo* vkObj = (VkDeviceQueueCreateInfo*)(ptr);
		  return (jint) (vkObj->flags);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkDeviceQueueCreateInfo_getFlags0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDeviceQueueCreateInfo_getFlags0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDeviceQueueCreateInfo_setQueueFamilyIndex0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _queueFamilyIndex) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:374

		  VkDeviceQueueCreateInfo* vkObj = (VkDeviceQueueCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->queueFamilyIndex = (uint32_t) (_queueFamilyIndex);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkDeviceQueueCreateInfo_getQueueFamilyIndex0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:384

		  VkDeviceQueueCreateInfo* vkObj = (VkDeviceQueueCreateInfo*)(ptr);
		  return (jint) (vkObj->queueFamilyIndex);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkDeviceQueueCreateInfo_getQueueFamilyIndex0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDeviceQueueCreateInfo_getQueueFamilyIndex0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDeviceQueueCreateInfo_setQueueCount0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _queueCount) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:393

		  VkDeviceQueueCreateInfo* vkObj = (VkDeviceQueueCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->queueCount = (uint32_t) (_queueCount);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkDeviceQueueCreateInfo_getQueueCount0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:403

		  VkDeviceQueueCreateInfo* vkObj = (VkDeviceQueueCreateInfo*)(ptr);
		  return (jint) (vkObj->queueCount);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkDeviceQueueCreateInfo_getQueueCount0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDeviceQueueCreateInfo_getQueueCount0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

static inline void wrapped_Java_bor_vulkan_structs_VkDeviceQueueCreateInfo_setPQueuePriorities0
(JNIEnv* env, jclass clazz, jobject obj_ptr, jfloatArray obj__pQueuePriorities, unsigned char* ptr, float* _pQueuePriorities) {

//@line:412

		  VkDeviceQueueCreateInfo* vkObj = (VkDeviceQueueCreateInfo*)(ptr);
		 // code for generic array assignment 
		 float* temp = const_cast<float*>(vkObj->pQueuePriorities);
		 if(temp) { free(temp); } 
		 vkObj->pQueuePriorities = NULL; 
		 if( _pQueuePriorities == NULL){ 
		    vkObj->queueCount = 0; 
		     return;
		  }
		  uint32_t count = (uint32_t)env->GetArrayLength( obj__pQueuePriorities); 
		  temp = CALLOC(count, float); 
		  memcpy( temp, _pQueuePriorities, count * sizeof(float)); 
		  vkObj->pQueuePriorities = temp; 
		  vkObj->queueCount = count;
	  
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDeviceQueueCreateInfo_setPQueuePriorities0(JNIEnv* env, jclass clazz, jobject obj_ptr, jfloatArray obj__pQueuePriorities) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	float* _pQueuePriorities = (float*)(obj__pQueuePriorities ? env->GetFloatArrayElements(obj__pQueuePriorities, 0) : NULL);

	wrapped_Java_bor_vulkan_structs_VkDeviceQueueCreateInfo_setPQueuePriorities0(env, clazz, obj_ptr, obj__pQueuePriorities, ptr, _pQueuePriorities);

	if(obj__pQueuePriorities != NULL){
		 env->ReleaseFloatArrayElements(obj__pQueuePriorities, (jfloat*)_pQueuePriorities, 0);
	}

	return;
}

static inline jfloatArray wrapped_Java_bor_vulkan_structs_VkDeviceQueueCreateInfo_getPQueuePriorities0
(JNIEnv* env, jclass clazz, jobject obj_ptr, jfloatArray obj__pQueuePriorities, unsigned char* ptr, float* _pQueuePriorities) {

//@line:433

		  VkDeviceQueueCreateInfo* vkObj = (VkDeviceQueueCreateInfo*)(ptr);
		  // generic get for C type array, with content copy 
		  if( 0 == vkObj->queueCount){ 
		     return NULL;
		   }
		  uint32_t count = (uint32_t)env->GetArrayLength( obj__pQueuePriorities);
		  if(vkObj->pQueuePriorities == NULL){
		    return NULL;
		   }
 		  memcpy(_pQueuePriorities, vkObj->pQueuePriorities, count * sizeof(float));
		  return obj__pQueuePriorities;
	 
}

JNIEXPORT jfloatArray JNICALL Java_bor_vulkan_structs_VkDeviceQueueCreateInfo_getPQueuePriorities0(JNIEnv* env, jclass clazz, jobject obj_ptr, jfloatArray obj__pQueuePriorities) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	float* _pQueuePriorities = (float*)(obj__pQueuePriorities ? env->GetFloatArrayElements(obj__pQueuePriorities, 0) : NULL);

	jfloatArray JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDeviceQueueCreateInfo_getPQueuePriorities0(env, clazz, obj_ptr, obj__pQueuePriorities, ptr, _pQueuePriorities);

	if(obj__pQueuePriorities != NULL){
		 env->ReleaseFloatArrayElements(obj__pQueuePriorities, (jfloat*)_pQueuePriorities, 0);
	}

	return JNI_returnValue;
}

