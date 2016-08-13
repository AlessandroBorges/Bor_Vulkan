#include <bor.vulkan.structs.VkStencilOpState.h>

//@line:44

    #include <BorVulkan.hpp>
    JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkStencilOpState_setFailOp0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _failOp) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:339

		  VkStencilOpState* vkObj = (VkStencilOpState*)(ptr);
		 // code for simple past value 
		  vkObj->failOp = (VkStencilOp) (_failOp);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkStencilOpState_getFailOp0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:349

		  VkStencilOpState* vkObj = (VkStencilOpState*)(ptr);
		  // generic get for Vk enums
		  return (jint) (vkObj->failOp);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkStencilOpState_getFailOp0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkStencilOpState_getFailOp0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkStencilOpState_setPassOp0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _passOp) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:359

		  VkStencilOpState* vkObj = (VkStencilOpState*)(ptr);
		 // code for simple past value 
		  vkObj->passOp = (VkStencilOp) (_passOp);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkStencilOpState_getPassOp0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:369

		  VkStencilOpState* vkObj = (VkStencilOpState*)(ptr);
		  // generic get for Vk enums
		  return (jint) (vkObj->passOp);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkStencilOpState_getPassOp0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkStencilOpState_getPassOp0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkStencilOpState_setDepthFailOp0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _depthFailOp) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:379

		  VkStencilOpState* vkObj = (VkStencilOpState*)(ptr);
		 // code for simple past value 
		  vkObj->depthFailOp = (VkStencilOp) (_depthFailOp);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkStencilOpState_getDepthFailOp0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:389

		  VkStencilOpState* vkObj = (VkStencilOpState*)(ptr);
		  // generic get for Vk enums
		  return (jint) (vkObj->depthFailOp);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkStencilOpState_getDepthFailOp0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkStencilOpState_getDepthFailOp0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkStencilOpState_setCompareOp0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _compareOp) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:399

		  VkStencilOpState* vkObj = (VkStencilOpState*)(ptr);
		 // code for simple past value 
		  vkObj->compareOp = (VkCompareOp) (_compareOp);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkStencilOpState_getCompareOp0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:409

		  VkStencilOpState* vkObj = (VkStencilOpState*)(ptr);
		  // generic get for Vk enums
		  return (jint) (vkObj->compareOp);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkStencilOpState_getCompareOp0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkStencilOpState_getCompareOp0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkStencilOpState_setCompareMask0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _compareMask) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:419

		  VkStencilOpState* vkObj = (VkStencilOpState*)(ptr);
		 // code for simple past value 
		  vkObj->compareMask = (uint32_t) (_compareMask);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkStencilOpState_getCompareMask0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:429

		  VkStencilOpState* vkObj = (VkStencilOpState*)(ptr);
		  return (jint) (vkObj->compareMask);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkStencilOpState_getCompareMask0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkStencilOpState_getCompareMask0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkStencilOpState_setWriteMask0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _writeMask) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:438

		  VkStencilOpState* vkObj = (VkStencilOpState*)(ptr);
		 // code for simple past value 
		  vkObj->writeMask = (uint32_t) (_writeMask);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkStencilOpState_getWriteMask0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:448

		  VkStencilOpState* vkObj = (VkStencilOpState*)(ptr);
		  return (jint) (vkObj->writeMask);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkStencilOpState_getWriteMask0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkStencilOpState_getWriteMask0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkStencilOpState_setReference0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _reference) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:457

		  VkStencilOpState* vkObj = (VkStencilOpState*)(ptr);
		 // code for simple past value 
		  vkObj->reference = (uint32_t) (_reference);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkStencilOpState_getReference0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:467

		  VkStencilOpState* vkObj = (VkStencilOpState*)(ptr);
		  return (jint) (vkObj->reference);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkStencilOpState_getReference0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkStencilOpState_getReference0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

