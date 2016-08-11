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
		  return (VkStencilOp) (vkObj->failOp);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkStencilOpState_getFailOp0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkStencilOpState_getFailOp0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkStencilOpState_setPassOp0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _passOp) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:358

		  VkStencilOpState* vkObj = (VkStencilOpState*)(ptr);
		 // code for simple past value 
		  vkObj->passOp = (VkStencilOp) (_passOp);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkStencilOpState_getPassOp0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:368

		  VkStencilOpState* vkObj = (VkStencilOpState*)(ptr);
		  return (VkStencilOp) (vkObj->passOp);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkStencilOpState_getPassOp0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkStencilOpState_getPassOp0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkStencilOpState_setDepthFailOp0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _depthFailOp) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:377

		  VkStencilOpState* vkObj = (VkStencilOpState*)(ptr);
		 // code for simple past value 
		  vkObj->depthFailOp = (VkStencilOp) (_depthFailOp);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkStencilOpState_getDepthFailOp0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:387

		  VkStencilOpState* vkObj = (VkStencilOpState*)(ptr);
		  return (VkStencilOp) (vkObj->depthFailOp);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkStencilOpState_getDepthFailOp0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkStencilOpState_getDepthFailOp0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkStencilOpState_setCompareOp0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _compareOp) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:396

		  VkStencilOpState* vkObj = (VkStencilOpState*)(ptr);
		 // code for simple past value 
		  vkObj->compareOp = (VkCompareOp) (_compareOp);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkStencilOpState_getCompareOp0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:406

		  VkStencilOpState* vkObj = (VkStencilOpState*)(ptr);
		  return (VkCompareOp) (vkObj->compareOp);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkStencilOpState_getCompareOp0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkStencilOpState_getCompareOp0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkStencilOpState_setCompareMask0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _compareMask) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:415

		  VkStencilOpState* vkObj = (VkStencilOpState*)(ptr);
		 // code for simple past value 
		  vkObj->compareMask = (uint32_t) (_compareMask);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkStencilOpState_getCompareMask0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:425

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


//@line:434

		  VkStencilOpState* vkObj = (VkStencilOpState*)(ptr);
		 // code for simple past value 
		  vkObj->writeMask = (uint32_t) (_writeMask);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkStencilOpState_getWriteMask0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:444

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


//@line:453

		  VkStencilOpState* vkObj = (VkStencilOpState*)(ptr);
		 // code for simple past value 
		  vkObj->reference = (uint32_t) (_reference);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkStencilOpState_getReference0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:463

		  VkStencilOpState* vkObj = (VkStencilOpState*)(ptr);
		  return (jint) (vkObj->reference);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkStencilOpState_getReference0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkStencilOpState_getReference0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

