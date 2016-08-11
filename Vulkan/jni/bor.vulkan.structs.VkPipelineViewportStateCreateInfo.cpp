#include <bor.vulkan.structs.VkPipelineViewportStateCreateInfo.h>

//@line:44

    #include <BorVulkan.hpp>
    JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPipelineViewportStateCreateInfo_setSType0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _sType) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:365

		  VkPipelineViewportStateCreateInfo* vkObj = (VkPipelineViewportStateCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->sType = (VkStructureType) (_sType);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkPipelineViewportStateCreateInfo_getSType0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:375

		  VkPipelineViewportStateCreateInfo* vkObj = (VkPipelineViewportStateCreateInfo*)(ptr);
		  return (VkStructureType) (vkObj->sType);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkPipelineViewportStateCreateInfo_getSType0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPipelineViewportStateCreateInfo_getSType0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPipelineViewportStateCreateInfo_setPNext0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__pNext) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _pNext = (char*)(obj__pNext?env->GetDirectBufferAddress(obj__pNext) : NULL);


//@line:384

		  VkPipelineViewportStateCreateInfo* vkObj = (VkPipelineViewportStateCreateInfo*)(ptr);
		 // code for Buffer - referenced by ptr
		  vkObj->pNext = (const void*) (_pNext);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkPipelineViewportStateCreateInfo_getPNext0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:394

		  VkPipelineViewportStateCreateInfo* vkObj = (VkPipelineViewportStateCreateInfo*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->pNext);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkPipelineViewportStateCreateInfo_getPNext0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPipelineViewportStateCreateInfo_getPNext0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPipelineViewportStateCreateInfo_setFlags0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _flags) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:404

		  VkPipelineViewportStateCreateInfo* vkObj = (VkPipelineViewportStateCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->flags = (VkPipelineViewportStateCreateFlags) (_flags);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkPipelineViewportStateCreateInfo_getFlags0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:414

		  VkPipelineViewportStateCreateInfo* vkObj = (VkPipelineViewportStateCreateInfo*)(ptr);
		  return (jint) (vkObj->flags);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkPipelineViewportStateCreateInfo_getFlags0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPipelineViewportStateCreateInfo_getFlags0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPipelineViewportStateCreateInfo_setViewportCount0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _viewportCount) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:423

		  VkPipelineViewportStateCreateInfo* vkObj = (VkPipelineViewportStateCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->viewportCount = (uint32_t) (_viewportCount);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkPipelineViewportStateCreateInfo_getViewportCount0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:433

		  VkPipelineViewportStateCreateInfo* vkObj = (VkPipelineViewportStateCreateInfo*)(ptr);
		  return (jint) (vkObj->viewportCount);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkPipelineViewportStateCreateInfo_getViewportCount0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPipelineViewportStateCreateInfo_getViewportCount0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPipelineViewportStateCreateInfo_setPViewports0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__pViewports) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _pViewports = (char*)(obj__pViewports?env->GetDirectBufferAddress(obj__pViewports) : NULL);


//@line:442

		  VkPipelineViewportStateCreateInfo* vkObj = (VkPipelineViewportStateCreateInfo*)(ptr);
		 // code for Buffer - referenced by ptr
		  vkObj->pViewports = (const VkViewport*) (_pViewports);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkPipelineViewportStateCreateInfo_getPViewports0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:452

		  VkPipelineViewportStateCreateInfo* vkObj = (VkPipelineViewportStateCreateInfo*)(ptr);
		  // generic get for array of VkHandle and VkStruct 
		  return (jlong) reinterpret_cast<jlong>( &vkObj->pViewports );
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkPipelineViewportStateCreateInfo_getPViewports0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPipelineViewportStateCreateInfo_getPViewports0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPipelineViewportStateCreateInfo_setScissorCount0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _scissorCount) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:462

		  VkPipelineViewportStateCreateInfo* vkObj = (VkPipelineViewportStateCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->scissorCount = (uint32_t) (_scissorCount);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkPipelineViewportStateCreateInfo_getScissorCount0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:472

		  VkPipelineViewportStateCreateInfo* vkObj = (VkPipelineViewportStateCreateInfo*)(ptr);
		  return (jint) (vkObj->scissorCount);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkPipelineViewportStateCreateInfo_getScissorCount0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPipelineViewportStateCreateInfo_getScissorCount0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPipelineViewportStateCreateInfo_setPScissors0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__pScissors) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _pScissors = (char*)(obj__pScissors?env->GetDirectBufferAddress(obj__pScissors) : NULL);


//@line:481

		  VkPipelineViewportStateCreateInfo* vkObj = (VkPipelineViewportStateCreateInfo*)(ptr);
		 // code for Buffer - referenced by ptr
		  vkObj->pScissors = (const VkRect2D*) (_pScissors);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkPipelineViewportStateCreateInfo_getPScissors0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:491

		  VkPipelineViewportStateCreateInfo* vkObj = (VkPipelineViewportStateCreateInfo*)(ptr);
		  // generic get for array of VkHandle and VkStruct 
		  return (jlong) reinterpret_cast<jlong>( &vkObj->pScissors );
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkPipelineViewportStateCreateInfo_getPScissors0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPipelineViewportStateCreateInfo_getPScissors0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

