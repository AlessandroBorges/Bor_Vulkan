#include <bor.vulkan.structs.VkRenderPassBeginInfo.h>

//@line:44

    #include <BorVulkan.hpp>
    JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkRenderPassBeginInfo_setSType0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _sType) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:387

		  VkRenderPassBeginInfo* vkObj = (VkRenderPassBeginInfo*)(ptr);
		 // code for simple past value 
		  vkObj->sType = (VkStructureType) (_sType);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkRenderPassBeginInfo_getSType0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:397

		  VkRenderPassBeginInfo* vkObj = (VkRenderPassBeginInfo*)(ptr);
		  return (VkStructureType) (vkObj->sType);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkRenderPassBeginInfo_getSType0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkRenderPassBeginInfo_getSType0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkRenderPassBeginInfo_setPNext0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__pNext) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _pNext = (char*)(obj__pNext?env->GetDirectBufferAddress(obj__pNext) : NULL);


//@line:406

		  VkRenderPassBeginInfo* vkObj = (VkRenderPassBeginInfo*)(ptr);
		 // code for Buffer - referenced by ptr
		  vkObj->pNext = (const void*) (_pNext);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkRenderPassBeginInfo_getPNext0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:416

		  VkRenderPassBeginInfo* vkObj = (VkRenderPassBeginInfo*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->pNext);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkRenderPassBeginInfo_getPNext0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkRenderPassBeginInfo_getPNext0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkRenderPassBeginInfo_setRenderPass0(JNIEnv* env, jclass clazz, jobject obj_ptr, jlong _renderPass) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:426

		  VkRenderPassBeginInfo* vkObj = (VkRenderPassBeginInfo*)(ptr);
		 // code for simple past value 
		  vkObj->renderPass = (VkRenderPass) (_renderPass);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkRenderPassBeginInfo_getRenderPass0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:436

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


//@line:446

		  VkRenderPassBeginInfo* vkObj = (VkRenderPassBeginInfo*)(ptr);
		 // code for simple past value 
		  vkObj->framebuffer = (VkFramebuffer) (_framebuffer);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkRenderPassBeginInfo_getFramebuffer0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:456

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


//@line:466

		  VkRenderPassBeginInfo* vkObj = (VkRenderPassBeginInfo*)(ptr);
		 // code for Buffer - referenced by ptr
		  vkObj->renderArea = (VkRect2D) (_renderArea);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkRenderPassBeginInfo_getRenderArea0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:476

		  VkRenderPassBeginInfo* vkObj = (VkRenderPassBeginInfo*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->renderArea);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkRenderPassBeginInfo_getRenderArea0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkRenderPassBeginInfo_getRenderArea0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkRenderPassBeginInfo_setClearValueCount0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _clearValueCount) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:486

		  VkRenderPassBeginInfo* vkObj = (VkRenderPassBeginInfo*)(ptr);
		 // code for simple past value 
		  vkObj->clearValueCount = (uint32_t) (_clearValueCount);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkRenderPassBeginInfo_getClearValueCount0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:496

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


//@line:505

		  VkRenderPassBeginInfo* vkObj = (VkRenderPassBeginInfo*)(ptr);
		 // code for Buffer - referenced by ptr
		  vkObj->pClearValues = (const VkClearValue*) (_pClearValues);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkRenderPassBeginInfo_getPClearValues0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:515

		  VkRenderPassBeginInfo* vkObj = (VkRenderPassBeginInfo*)(ptr);
		  // generic get for array of VkHandle and VkStruct 
		  return (jlong) reinterpret_cast<jlong>( &vkObj->pClearValues );
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkRenderPassBeginInfo_getPClearValues0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkRenderPassBeginInfo_getPClearValues0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

