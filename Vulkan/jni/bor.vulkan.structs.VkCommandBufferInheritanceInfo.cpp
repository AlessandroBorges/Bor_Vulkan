#include <bor.vulkan.structs.VkCommandBufferInheritanceInfo.h>

//@line:45

    #include <BorVulkan.hpp>
    JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkCommandBufferInheritanceInfo_setSType0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _sType) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:398

		  VkCommandBufferInheritanceInfo* vkObj = (VkCommandBufferInheritanceInfo*)(ptr);
		 // code for simple past value 
		  vkObj->sType = (VkStructureType) (_sType);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkCommandBufferInheritanceInfo_getSType0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:408

		  VkCommandBufferInheritanceInfo* vkObj = (VkCommandBufferInheritanceInfo*)(ptr);
		  // generic get for Vk enums
		  return (jint) (vkObj->sType);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkCommandBufferInheritanceInfo_getSType0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkCommandBufferInheritanceInfo_getSType0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkCommandBufferInheritanceInfo_setPNext0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__pNext) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _pNext = (char*)(obj__pNext?env->GetDirectBufferAddress(obj__pNext) : NULL);


//@line:418

		  VkCommandBufferInheritanceInfo* vkObj = (VkCommandBufferInheritanceInfo*)(ptr);
		 // code for Buffer - ptr to ptr 
		 const void* p_pNext = ( void*) _pNext; 
		 vkObj->pNext = p_pNext; 
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkCommandBufferInheritanceInfo_getPNext0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:429

		  VkCommandBufferInheritanceInfo* vkObj = (VkCommandBufferInheritanceInfo*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->pNext);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkCommandBufferInheritanceInfo_getPNext0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkCommandBufferInheritanceInfo_getPNext0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkCommandBufferInheritanceInfo_setRenderPass0(JNIEnv* env, jclass clazz, jobject obj_ptr, jlong _renderPass) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:439

		  VkCommandBufferInheritanceInfo* vkObj = (VkCommandBufferInheritanceInfo*)(ptr);
		 // code for simple past value 
		  vkObj->renderPass = (VkRenderPass) (_renderPass);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkCommandBufferInheritanceInfo_getRenderPass0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:449

		  VkCommandBufferInheritanceInfo* vkObj = (VkCommandBufferInheritanceInfo*)(ptr);
		  // generic get for struct field of type  VkHandle or VkStruct 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->renderPass);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkCommandBufferInheritanceInfo_getRenderPass0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkCommandBufferInheritanceInfo_getRenderPass0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkCommandBufferInheritanceInfo_setSubpass0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _subpass) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:459

		  VkCommandBufferInheritanceInfo* vkObj = (VkCommandBufferInheritanceInfo*)(ptr);
		 // code for simple past value 
		  vkObj->subpass = (uint32_t) (_subpass);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkCommandBufferInheritanceInfo_getSubpass0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:469

		  VkCommandBufferInheritanceInfo* vkObj = (VkCommandBufferInheritanceInfo*)(ptr);
		  return (jint) (vkObj->subpass);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkCommandBufferInheritanceInfo_getSubpass0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkCommandBufferInheritanceInfo_getSubpass0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkCommandBufferInheritanceInfo_setFramebuffer0(JNIEnv* env, jclass clazz, jobject obj_ptr, jlong _framebuffer) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:478

		  VkCommandBufferInheritanceInfo* vkObj = (VkCommandBufferInheritanceInfo*)(ptr);
		 // code for simple past value 
		  vkObj->framebuffer = (VkFramebuffer) (_framebuffer);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkCommandBufferInheritanceInfo_getFramebuffer0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:488

		  VkCommandBufferInheritanceInfo* vkObj = (VkCommandBufferInheritanceInfo*)(ptr);
		  // generic get for struct field of type  VkHandle or VkStruct 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->framebuffer);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkCommandBufferInheritanceInfo_getFramebuffer0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkCommandBufferInheritanceInfo_getFramebuffer0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkCommandBufferInheritanceInfo_setOcclusionQueryEnable0(JNIEnv* env, jclass clazz, jobject obj_ptr, jboolean _occlusionQueryEnable) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:498

		  VkCommandBufferInheritanceInfo* vkObj = (VkCommandBufferInheritanceInfo*)(ptr);
		 // code for simple past value 
		  vkObj->occlusionQueryEnable = (VkBool32) (_occlusionQueryEnable);
	  

}

static inline jboolean wrapped_Java_bor_vulkan_structs_VkCommandBufferInheritanceInfo_getOcclusionQueryEnable0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:508

		  VkCommandBufferInheritanceInfo* vkObj = (VkCommandBufferInheritanceInfo*)(ptr);
		  return (jboolean) (vkObj->occlusionQueryEnable);
	 
}

JNIEXPORT jboolean JNICALL Java_bor_vulkan_structs_VkCommandBufferInheritanceInfo_getOcclusionQueryEnable0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jboolean JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkCommandBufferInheritanceInfo_getOcclusionQueryEnable0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkCommandBufferInheritanceInfo_setQueryFlags0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _queryFlags) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:517

		  VkCommandBufferInheritanceInfo* vkObj = (VkCommandBufferInheritanceInfo*)(ptr);
		 // code for simple past value 
		  vkObj->queryFlags = (VkQueryControlFlags) (_queryFlags);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkCommandBufferInheritanceInfo_getQueryFlags0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:527

		  VkCommandBufferInheritanceInfo* vkObj = (VkCommandBufferInheritanceInfo*)(ptr);
		  return (jint) (vkObj->queryFlags);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkCommandBufferInheritanceInfo_getQueryFlags0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkCommandBufferInheritanceInfo_getQueryFlags0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkCommandBufferInheritanceInfo_setPipelineStatistics0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _pipelineStatistics) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:536

		  VkCommandBufferInheritanceInfo* vkObj = (VkCommandBufferInheritanceInfo*)(ptr);
		 // code for simple past value 
		  vkObj->pipelineStatistics = (VkQueryPipelineStatisticFlags) (_pipelineStatistics);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkCommandBufferInheritanceInfo_getPipelineStatistics0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:546

		  VkCommandBufferInheritanceInfo* vkObj = (VkCommandBufferInheritanceInfo*)(ptr);
		  return (jint) (vkObj->pipelineStatistics);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkCommandBufferInheritanceInfo_getPipelineStatistics0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkCommandBufferInheritanceInfo_getPipelineStatistics0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

