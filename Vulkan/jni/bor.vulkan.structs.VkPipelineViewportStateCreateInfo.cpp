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
		  // generic get for Vk enums
		  return (jint) (vkObj->sType);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkPipelineViewportStateCreateInfo_getSType0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPipelineViewportStateCreateInfo_getSType0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPipelineViewportStateCreateInfo_setPNext0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__pNext) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _pNext = (char*)(obj__pNext?env->GetDirectBufferAddress(obj__pNext) : NULL);


//@line:385

		  VkPipelineViewportStateCreateInfo* vkObj = (VkPipelineViewportStateCreateInfo*)(ptr);
		 // code for Buffer - ptr to ptr 
		 const void* p_pNext = ( void*) _pNext; 
		 vkObj->pNext = p_pNext; 
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkPipelineViewportStateCreateInfo_getPNext0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:396

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


//@line:406

		  VkPipelineViewportStateCreateInfo* vkObj = (VkPipelineViewportStateCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->flags = (VkPipelineViewportStateCreateFlags) (_flags);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkPipelineViewportStateCreateInfo_getFlags0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:416

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


//@line:425

		  VkPipelineViewportStateCreateInfo* vkObj = (VkPipelineViewportStateCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->viewportCount = (uint32_t) (_viewportCount);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkPipelineViewportStateCreateInfo_getViewportCount0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:435

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


//@line:444

		  VkPipelineViewportStateCreateInfo* vkObj = (VkPipelineViewportStateCreateInfo*)(ptr);
		 // code for Buffer - ptr to ptr 
		 const VkViewport* p_pViewports = ( VkViewport*) _pViewports; 
		 vkObj->pViewports = p_pViewports; 
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkPipelineViewportStateCreateInfo_getPViewports0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:455

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


//@line:465

		  VkPipelineViewportStateCreateInfo* vkObj = (VkPipelineViewportStateCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->scissorCount = (uint32_t) (_scissorCount);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkPipelineViewportStateCreateInfo_getScissorCount0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:475

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


//@line:484

		  VkPipelineViewportStateCreateInfo* vkObj = (VkPipelineViewportStateCreateInfo*)(ptr);
		 // code for Buffer - ptr to ptr 
		 const VkRect2D* p_pScissors = ( VkRect2D*) _pScissors; 
		 vkObj->pScissors = p_pScissors; 
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkPipelineViewportStateCreateInfo_getPScissors0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:495

		  VkPipelineViewportStateCreateInfo* vkObj = (VkPipelineViewportStateCreateInfo*)(ptr);
		  // generic get for array of VkHandle and VkStruct 
		  return (jlong) reinterpret_cast<jlong>( &vkObj->pScissors );
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkPipelineViewportStateCreateInfo_getPScissors0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPipelineViewportStateCreateInfo_getPScissors0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

