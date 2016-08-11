#include <bor.vulkan.structs.VkPipelineTessellationStateCreateInfo.h>

//@line:41

    #include <BorVulkan.hpp>
    JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPipelineTessellationStateCreateInfo_setSType0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _sType) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:252

		  VkPipelineTessellationStateCreateInfo* vkObj = (VkPipelineTessellationStateCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->sType = (VkStructureType) (_sType);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkPipelineTessellationStateCreateInfo_getSType0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:262

		  VkPipelineTessellationStateCreateInfo* vkObj = (VkPipelineTessellationStateCreateInfo*)(ptr);
		  return (VkStructureType) (vkObj->sType);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkPipelineTessellationStateCreateInfo_getSType0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPipelineTessellationStateCreateInfo_getSType0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPipelineTessellationStateCreateInfo_setPNext0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__pNext) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _pNext = (char*)(obj__pNext?env->GetDirectBufferAddress(obj__pNext) : NULL);


//@line:271

		  VkPipelineTessellationStateCreateInfo* vkObj = (VkPipelineTessellationStateCreateInfo*)(ptr);
		 // code for Buffer - referenced by ptr
		  vkObj->pNext = (const void*) (_pNext);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkPipelineTessellationStateCreateInfo_getPNext0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:281

		  VkPipelineTessellationStateCreateInfo* vkObj = (VkPipelineTessellationStateCreateInfo*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->pNext);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkPipelineTessellationStateCreateInfo_getPNext0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPipelineTessellationStateCreateInfo_getPNext0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPipelineTessellationStateCreateInfo_setFlags0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _flags) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:291

		  VkPipelineTessellationStateCreateInfo* vkObj = (VkPipelineTessellationStateCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->flags = (VkPipelineTessellationStateCreateFlags) (_flags);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkPipelineTessellationStateCreateInfo_getFlags0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:301

		  VkPipelineTessellationStateCreateInfo* vkObj = (VkPipelineTessellationStateCreateInfo*)(ptr);
		  return (jint) (vkObj->flags);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkPipelineTessellationStateCreateInfo_getFlags0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPipelineTessellationStateCreateInfo_getFlags0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPipelineTessellationStateCreateInfo_setPatchControlPoints0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _patchControlPoints) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:310

		  VkPipelineTessellationStateCreateInfo* vkObj = (VkPipelineTessellationStateCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->patchControlPoints = (uint32_t) (_patchControlPoints);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkPipelineTessellationStateCreateInfo_getPatchControlPoints0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:320

		  VkPipelineTessellationStateCreateInfo* vkObj = (VkPipelineTessellationStateCreateInfo*)(ptr);
		  return (jint) (vkObj->patchControlPoints);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkPipelineTessellationStateCreateInfo_getPatchControlPoints0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPipelineTessellationStateCreateInfo_getPatchControlPoints0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

