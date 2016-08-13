#include <bor.vulkan.structs.VkMemoryBarrier.h>

//@line:41

    #include <BorVulkan.hpp>
    JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkMemoryBarrier_setSType0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _sType) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:252

		  VkMemoryBarrier* vkObj = (VkMemoryBarrier*)(ptr);
		 // code for simple past value 
		  vkObj->sType = (VkStructureType) (_sType);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkMemoryBarrier_getSType0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:262

		  VkMemoryBarrier* vkObj = (VkMemoryBarrier*)(ptr);
		  // generic get for Vk enums
		  return (jint) (vkObj->sType);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkMemoryBarrier_getSType0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkMemoryBarrier_getSType0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkMemoryBarrier_setPNext0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__pNext) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _pNext = (char*)(obj__pNext?env->GetDirectBufferAddress(obj__pNext) : NULL);


//@line:272

		  VkMemoryBarrier* vkObj = (VkMemoryBarrier*)(ptr);
		 // code for Buffer - ptr to ptr 
		 const void* p_pNext = ( void*) _pNext; 
		 vkObj->pNext = p_pNext; 
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkMemoryBarrier_getPNext0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:283

		  VkMemoryBarrier* vkObj = (VkMemoryBarrier*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->pNext);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkMemoryBarrier_getPNext0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkMemoryBarrier_getPNext0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkMemoryBarrier_setSrcAccessMask0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _srcAccessMask) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:293

		  VkMemoryBarrier* vkObj = (VkMemoryBarrier*)(ptr);
		 // code for simple past value 
		  vkObj->srcAccessMask = (VkAccessFlags) (_srcAccessMask);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkMemoryBarrier_getSrcAccessMask0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:303

		  VkMemoryBarrier* vkObj = (VkMemoryBarrier*)(ptr);
		  return (jint) (vkObj->srcAccessMask);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkMemoryBarrier_getSrcAccessMask0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkMemoryBarrier_getSrcAccessMask0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkMemoryBarrier_setDstAccessMask0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _dstAccessMask) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:312

		  VkMemoryBarrier* vkObj = (VkMemoryBarrier*)(ptr);
		 // code for simple past value 
		  vkObj->dstAccessMask = (VkAccessFlags) (_dstAccessMask);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkMemoryBarrier_getDstAccessMask0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:322

		  VkMemoryBarrier* vkObj = (VkMemoryBarrier*)(ptr);
		  return (jint) (vkObj->dstAccessMask);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkMemoryBarrier_getDstAccessMask0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkMemoryBarrier_getDstAccessMask0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

