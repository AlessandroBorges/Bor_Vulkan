#include <bor.vulkan.structs.VkPipelineDepthStencilStateCreateInfo.h>

//@line:49

    #include <BorVulkan.hpp>
    JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPipelineDepthStencilStateCreateInfo_setSType0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _sType) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:521

		  VkPipelineDepthStencilStateCreateInfo* vkObj = (VkPipelineDepthStencilStateCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->sType = (VkStructureType) (_sType);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkPipelineDepthStencilStateCreateInfo_getSType0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:531

		  VkPipelineDepthStencilStateCreateInfo* vkObj = (VkPipelineDepthStencilStateCreateInfo*)(ptr);
		  // generic get for Vk enums
		  return (jint) (vkObj->sType);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkPipelineDepthStencilStateCreateInfo_getSType0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPipelineDepthStencilStateCreateInfo_getSType0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPipelineDepthStencilStateCreateInfo_setPNext0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__pNext) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _pNext = (char*)(obj__pNext?env->GetDirectBufferAddress(obj__pNext) : NULL);


//@line:541

		  VkPipelineDepthStencilStateCreateInfo* vkObj = (VkPipelineDepthStencilStateCreateInfo*)(ptr);
		 // code for Buffer - ptr to ptr 
		 const void* p_pNext = ( void*) _pNext; 
		 vkObj->pNext = p_pNext; 
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkPipelineDepthStencilStateCreateInfo_getPNext0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:552

		  VkPipelineDepthStencilStateCreateInfo* vkObj = (VkPipelineDepthStencilStateCreateInfo*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->pNext);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkPipelineDepthStencilStateCreateInfo_getPNext0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPipelineDepthStencilStateCreateInfo_getPNext0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPipelineDepthStencilStateCreateInfo_setFlags0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _flags) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:562

		  VkPipelineDepthStencilStateCreateInfo* vkObj = (VkPipelineDepthStencilStateCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->flags = (VkPipelineDepthStencilStateCreateFlags) (_flags);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkPipelineDepthStencilStateCreateInfo_getFlags0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:572

		  VkPipelineDepthStencilStateCreateInfo* vkObj = (VkPipelineDepthStencilStateCreateInfo*)(ptr);
		  return (jint) (vkObj->flags);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkPipelineDepthStencilStateCreateInfo_getFlags0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPipelineDepthStencilStateCreateInfo_getFlags0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPipelineDepthStencilStateCreateInfo_setDepthTestEnable0(JNIEnv* env, jclass clazz, jobject obj_ptr, jboolean _depthTestEnable) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:581

		  VkPipelineDepthStencilStateCreateInfo* vkObj = (VkPipelineDepthStencilStateCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->depthTestEnable = (VkBool32) (_depthTestEnable);
	  

}

static inline jboolean wrapped_Java_bor_vulkan_structs_VkPipelineDepthStencilStateCreateInfo_getDepthTestEnable0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:591

		  VkPipelineDepthStencilStateCreateInfo* vkObj = (VkPipelineDepthStencilStateCreateInfo*)(ptr);
		  return (jboolean) (vkObj->depthTestEnable);
	 
}

JNIEXPORT jboolean JNICALL Java_bor_vulkan_structs_VkPipelineDepthStencilStateCreateInfo_getDepthTestEnable0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jboolean JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPipelineDepthStencilStateCreateInfo_getDepthTestEnable0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPipelineDepthStencilStateCreateInfo_setDepthWriteEnable0(JNIEnv* env, jclass clazz, jobject obj_ptr, jboolean _depthWriteEnable) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:600

		  VkPipelineDepthStencilStateCreateInfo* vkObj = (VkPipelineDepthStencilStateCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->depthWriteEnable = (VkBool32) (_depthWriteEnable);
	  

}

static inline jboolean wrapped_Java_bor_vulkan_structs_VkPipelineDepthStencilStateCreateInfo_getDepthWriteEnable0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:610

		  VkPipelineDepthStencilStateCreateInfo* vkObj = (VkPipelineDepthStencilStateCreateInfo*)(ptr);
		  return (jboolean) (vkObj->depthWriteEnable);
	 
}

JNIEXPORT jboolean JNICALL Java_bor_vulkan_structs_VkPipelineDepthStencilStateCreateInfo_getDepthWriteEnable0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jboolean JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPipelineDepthStencilStateCreateInfo_getDepthWriteEnable0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPipelineDepthStencilStateCreateInfo_setDepthCompareOp0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _depthCompareOp) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:619

		  VkPipelineDepthStencilStateCreateInfo* vkObj = (VkPipelineDepthStencilStateCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->depthCompareOp = (VkCompareOp) (_depthCompareOp);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkPipelineDepthStencilStateCreateInfo_getDepthCompareOp0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:629

		  VkPipelineDepthStencilStateCreateInfo* vkObj = (VkPipelineDepthStencilStateCreateInfo*)(ptr);
		  // generic get for Vk enums
		  return (jint) (vkObj->depthCompareOp);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkPipelineDepthStencilStateCreateInfo_getDepthCompareOp0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPipelineDepthStencilStateCreateInfo_getDepthCompareOp0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPipelineDepthStencilStateCreateInfo_setDepthBoundsTestEnable0(JNIEnv* env, jclass clazz, jobject obj_ptr, jboolean _depthBoundsTestEnable) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:639

		  VkPipelineDepthStencilStateCreateInfo* vkObj = (VkPipelineDepthStencilStateCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->depthBoundsTestEnable = (VkBool32) (_depthBoundsTestEnable);
	  

}

static inline jboolean wrapped_Java_bor_vulkan_structs_VkPipelineDepthStencilStateCreateInfo_getDepthBoundsTestEnable0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:649

		  VkPipelineDepthStencilStateCreateInfo* vkObj = (VkPipelineDepthStencilStateCreateInfo*)(ptr);
		  return (jboolean) (vkObj->depthBoundsTestEnable);
	 
}

JNIEXPORT jboolean JNICALL Java_bor_vulkan_structs_VkPipelineDepthStencilStateCreateInfo_getDepthBoundsTestEnable0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jboolean JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPipelineDepthStencilStateCreateInfo_getDepthBoundsTestEnable0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPipelineDepthStencilStateCreateInfo_setStencilTestEnable0(JNIEnv* env, jclass clazz, jobject obj_ptr, jboolean _stencilTestEnable) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:658

		  VkPipelineDepthStencilStateCreateInfo* vkObj = (VkPipelineDepthStencilStateCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->stencilTestEnable = (VkBool32) (_stencilTestEnable);
	  

}

static inline jboolean wrapped_Java_bor_vulkan_structs_VkPipelineDepthStencilStateCreateInfo_getStencilTestEnable0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:668

		  VkPipelineDepthStencilStateCreateInfo* vkObj = (VkPipelineDepthStencilStateCreateInfo*)(ptr);
		  return (jboolean) (vkObj->stencilTestEnable);
	 
}

JNIEXPORT jboolean JNICALL Java_bor_vulkan_structs_VkPipelineDepthStencilStateCreateInfo_getStencilTestEnable0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jboolean JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPipelineDepthStencilStateCreateInfo_getStencilTestEnable0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPipelineDepthStencilStateCreateInfo_setFront0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__front) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _front = (char*)(obj__front?env->GetDirectBufferAddress(obj__front) : NULL);


//@line:677

		  VkPipelineDepthStencilStateCreateInfo* vkObj = (VkPipelineDepthStencilStateCreateInfo*)(ptr);
		 // code for Buffer - ptr to struct 
		 VkStencilOpState* p_front = (VkStencilOpState*) _front; 
		 vkObj->front = (*p_front); 
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkPipelineDepthStencilStateCreateInfo_getFront0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:688

		  VkPipelineDepthStencilStateCreateInfo* vkObj = (VkPipelineDepthStencilStateCreateInfo*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->front);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkPipelineDepthStencilStateCreateInfo_getFront0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPipelineDepthStencilStateCreateInfo_getFront0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPipelineDepthStencilStateCreateInfo_setBack0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__back) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _back = (char*)(obj__back?env->GetDirectBufferAddress(obj__back) : NULL);


//@line:698

		  VkPipelineDepthStencilStateCreateInfo* vkObj = (VkPipelineDepthStencilStateCreateInfo*)(ptr);
		 // code for Buffer - ptr to struct 
		 VkStencilOpState* p_back = (VkStencilOpState*) _back; 
		 vkObj->back = (*p_back); 
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkPipelineDepthStencilStateCreateInfo_getBack0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:709

		  VkPipelineDepthStencilStateCreateInfo* vkObj = (VkPipelineDepthStencilStateCreateInfo*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->back);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkPipelineDepthStencilStateCreateInfo_getBack0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPipelineDepthStencilStateCreateInfo_getBack0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPipelineDepthStencilStateCreateInfo_setMinDepthBounds0(JNIEnv* env, jclass clazz, jobject obj_ptr, jfloat _minDepthBounds) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:719

		  VkPipelineDepthStencilStateCreateInfo* vkObj = (VkPipelineDepthStencilStateCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->minDepthBounds = (float) (_minDepthBounds);
	  

}

static inline jfloat wrapped_Java_bor_vulkan_structs_VkPipelineDepthStencilStateCreateInfo_getMinDepthBounds0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:729

		  VkPipelineDepthStencilStateCreateInfo* vkObj = (VkPipelineDepthStencilStateCreateInfo*)(ptr);
		  return (jfloat) (vkObj->minDepthBounds);
	 
}

JNIEXPORT jfloat JNICALL Java_bor_vulkan_structs_VkPipelineDepthStencilStateCreateInfo_getMinDepthBounds0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jfloat JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPipelineDepthStencilStateCreateInfo_getMinDepthBounds0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPipelineDepthStencilStateCreateInfo_setMaxDepthBounds0(JNIEnv* env, jclass clazz, jobject obj_ptr, jfloat _maxDepthBounds) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:738

		  VkPipelineDepthStencilStateCreateInfo* vkObj = (VkPipelineDepthStencilStateCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->maxDepthBounds = (float) (_maxDepthBounds);
	  

}

static inline jfloat wrapped_Java_bor_vulkan_structs_VkPipelineDepthStencilStateCreateInfo_getMaxDepthBounds0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:748

		  VkPipelineDepthStencilStateCreateInfo* vkObj = (VkPipelineDepthStencilStateCreateInfo*)(ptr);
		  return (jfloat) (vkObj->maxDepthBounds);
	 
}

JNIEXPORT jfloat JNICALL Java_bor_vulkan_structs_VkPipelineDepthStencilStateCreateInfo_getMaxDepthBounds0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jfloat JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPipelineDepthStencilStateCreateInfo_getMaxDepthBounds0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

