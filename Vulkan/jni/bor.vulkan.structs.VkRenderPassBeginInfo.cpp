#include <bor.vulkan.structs.VkRenderPassBeginInfo.h>

//@line:44

    #include <BorVulkan.hpp>
    JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkRenderPassBeginInfo_setSType0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _sType) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:402

		  VkRenderPassBeginInfo* vkObj = (VkRenderPassBeginInfo*)(ptr);
		 // code for simple past value 
		  vkObj->sType = (VkStructureType) (_sType);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkRenderPassBeginInfo_getSType0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:412

		  VkRenderPassBeginInfo* vkObj = (VkRenderPassBeginInfo*)(ptr);
		  // generic get for Vk enums
		  return (jint) (vkObj->sType);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkRenderPassBeginInfo_getSType0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkRenderPassBeginInfo_getSType0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkRenderPassBeginInfo_setPNext0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__pNext) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _pNext = (char*)(obj__pNext?env->GetDirectBufferAddress(obj__pNext) : NULL);


//@line:422

		  VkRenderPassBeginInfo* vkObj = (VkRenderPassBeginInfo*)(ptr);
		 // code for Buffer - ptr to ptr 
		 const void* p_pNext = ( void*) _pNext; 
		 vkObj->pNext = p_pNext; 
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkRenderPassBeginInfo_getPNext0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:433

		  VkRenderPassBeginInfo* vkObj = (VkRenderPassBeginInfo*)(ptr);
		  // generic get for Buffer - field must be pointer! 
		  return (jlong) reinterpret_cast<jlong>(vkObj->pNext);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkRenderPassBeginInfo_getPNext0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkRenderPassBeginInfo_getPNext0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkRenderPassBeginInfo_setRenderPass0(JNIEnv* env, jclass clazz, jobject obj_ptr, jlong _renderPass) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:443

		  VkRenderPassBeginInfo* vkObj = (VkRenderPassBeginInfo*)(ptr);
		 // code for simple past value 
		  vkObj->renderPass = (VkRenderPass) (_renderPass);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkRenderPassBeginInfo_getRenderPass0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:453

		  VkRenderPassBeginInfo* vkObj = (VkRenderPassBeginInfo*)(ptr);
		  // generic get for struct field of type  VkHandle or VkStruct 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->renderPass);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkRenderPassBeginInfo_getRenderPass0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkRenderPassBeginInfo_getRenderPass0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkRenderPassBeginInfo_setFramebuffer0(JNIEnv* env, jclass clazz, jobject obj_ptr, jlong _framebuffer) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:463

		  VkRenderPassBeginInfo* vkObj = (VkRenderPassBeginInfo*)(ptr);
		 // code for simple past value 
		  vkObj->framebuffer = (VkFramebuffer) (_framebuffer);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkRenderPassBeginInfo_getFramebuffer0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:473

		  VkRenderPassBeginInfo* vkObj = (VkRenderPassBeginInfo*)(ptr);
		  // generic get for struct field of type  VkHandle or VkStruct 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->framebuffer);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkRenderPassBeginInfo_getFramebuffer0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkRenderPassBeginInfo_getFramebuffer0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkRenderPassBeginInfo_setRenderArea0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__renderArea) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _renderArea = (char*)(obj__renderArea?env->GetDirectBufferAddress(obj__renderArea) : NULL);


//@line:483

		  VkRenderPassBeginInfo* vkObj = (VkRenderPassBeginInfo*)(ptr);
		 // code for Buffer - ptr to struct 
		 VkRect2D* p_renderArea = (VkRect2D*) _renderArea; 
		 vkObj->renderArea = (*p_renderArea); 
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkRenderPassBeginInfo_getRenderArea0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:494

		  VkRenderPassBeginInfo* vkObj = (VkRenderPassBeginInfo*)(ptr);
		  // generic get for Buffer - field must be pointer! 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->renderArea);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkRenderPassBeginInfo_getRenderArea0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkRenderPassBeginInfo_getRenderArea0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkRenderPassBeginInfo_setClearValueCount0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _clearValueCount) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:504

		  VkRenderPassBeginInfo* vkObj = (VkRenderPassBeginInfo*)(ptr);
		 // code for simple past value 
		  vkObj->clearValueCount = (uint32_t) (_clearValueCount);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkRenderPassBeginInfo_getClearValueCount0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:514

		  VkRenderPassBeginInfo* vkObj = (VkRenderPassBeginInfo*)(ptr);
		  return (jint) (vkObj->clearValueCount);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkRenderPassBeginInfo_getClearValueCount0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkRenderPassBeginInfo_getClearValueCount0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkRenderPassBeginInfo_setPClearValues0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__pClearValues) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _pClearValues = (char*)(obj__pClearValues?env->GetDirectBufferAddress(obj__pClearValues) : NULL);


//@line:523

		  VkRenderPassBeginInfo* vkObj = (VkRenderPassBeginInfo*)(ptr);
		 // code for Buffer - ptr to ptr 
		 const VkClearValue* p_pClearValues = ( VkClearValue*) _pClearValues; 
		 vkObj->pClearValues = p_pClearValues; 
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkRenderPassBeginInfo_getPClearValues0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:534

		  VkRenderPassBeginInfo* vkObj = (VkRenderPassBeginInfo*)(ptr);
		  // generic get for array of VkHandle and VkStruct 
		  return (jlong) reinterpret_cast<jlong>( vkObj->pClearValues );
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkRenderPassBeginInfo_getPClearValues0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkRenderPassBeginInfo_getPClearValues0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

