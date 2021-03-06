#include <bor.vulkan.structs.VkPipelineCacheCreateInfo.h>

//@line:42

    #include <BorVulkan.hpp>
    JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPipelineCacheCreateInfo_setSType0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _sType) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:297

		  VkPipelineCacheCreateInfo* vkObj = (VkPipelineCacheCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->sType = (VkStructureType) (_sType);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkPipelineCacheCreateInfo_getSType0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:307

		  VkPipelineCacheCreateInfo* vkObj = (VkPipelineCacheCreateInfo*)(ptr);
		  // generic get for Vk enums
		  return (jint) (vkObj->sType);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkPipelineCacheCreateInfo_getSType0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPipelineCacheCreateInfo_getSType0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPipelineCacheCreateInfo_setPNext0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__pNext) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _pNext = (char*)(obj__pNext?env->GetDirectBufferAddress(obj__pNext) : NULL);


//@line:317

		  VkPipelineCacheCreateInfo* vkObj = (VkPipelineCacheCreateInfo*)(ptr);
		 // code for Buffer - ptr to ptr 
		 const void* p_pNext = ( void*) _pNext; 
		 vkObj->pNext = p_pNext; 
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkPipelineCacheCreateInfo_getPNext0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:328

		  VkPipelineCacheCreateInfo* vkObj = (VkPipelineCacheCreateInfo*)(ptr);
		  // generic get for Buffer - field must be pointer! 
		  return (jlong) reinterpret_cast<jlong>(vkObj->pNext);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkPipelineCacheCreateInfo_getPNext0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPipelineCacheCreateInfo_getPNext0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPipelineCacheCreateInfo_setFlags0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _flags) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:338

		  VkPipelineCacheCreateInfo* vkObj = (VkPipelineCacheCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->flags = (VkPipelineCacheCreateFlags) (_flags);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkPipelineCacheCreateInfo_getFlags0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:348

		  VkPipelineCacheCreateInfo* vkObj = (VkPipelineCacheCreateInfo*)(ptr);
		  return (jint) (vkObj->flags);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkPipelineCacheCreateInfo_getFlags0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPipelineCacheCreateInfo_getFlags0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPipelineCacheCreateInfo_setInitialDataSize0(JNIEnv* env, jclass clazz, jobject obj_ptr, jlong _initialDataSize) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:357

		  VkPipelineCacheCreateInfo* vkObj = (VkPipelineCacheCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->initialDataSize = (size_t) (_initialDataSize);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkPipelineCacheCreateInfo_getInitialDataSize0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:367

		  VkPipelineCacheCreateInfo* vkObj = (VkPipelineCacheCreateInfo*)(ptr);
		  return (jlong) (vkObj->initialDataSize);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkPipelineCacheCreateInfo_getInitialDataSize0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPipelineCacheCreateInfo_getInitialDataSize0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPipelineCacheCreateInfo_setPInitialData0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__pInitialData) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	unsigned char* _pInitialData = (unsigned char*)(obj__pInitialData?env->GetDirectBufferAddress(obj__pInitialData) : NULL);


//@line:376

		  VkPipelineCacheCreateInfo* vkObj = (VkPipelineCacheCreateInfo*)(ptr);
		 // code for Buffer - ptr to ptr 
		 const void* p_pInitialData = ( void*) _pInitialData; 
		 vkObj->pInitialData = p_pInitialData; 
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkPipelineCacheCreateInfo_getPInitialData0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:387

		  VkPipelineCacheCreateInfo* vkObj = (VkPipelineCacheCreateInfo*)(ptr);
		  // generic get for Buffer - field must be pointer! 
		  return (jlong) reinterpret_cast<jlong>(vkObj->pInitialData);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkPipelineCacheCreateInfo_getPInitialData0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPipelineCacheCreateInfo_getPInitialData0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

