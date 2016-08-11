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
		  return (VkStructureType) (vkObj->sType);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkPipelineDepthStencilStateCreateInfo_getSType0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPipelineDepthStencilStateCreateInfo_getSType0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPipelineDepthStencilStateCreateInfo_setPNext0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__pNext) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _pNext = (char*)(obj__pNext?env->GetDirectBufferAddress(obj__pNext) : NULL);


//@line:540

		  VkPipelineDepthStencilStateCreateInfo* vkObj = (VkPipelineDepthStencilStateCreateInfo*)(ptr);
		 // code for Buffer - referenced by ptr
		  vkObj->pNext = (const void*) (_pNext);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkPipelineDepthStencilStateCreateInfo_getPNext0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:550

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


//@line:560

		  VkPipelineDepthStencilStateCreateInfo* vkObj = (VkPipelineDepthStencilStateCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->flags = (VkPipelineDepthStencilStateCreateFlags) (_flags);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkPipelineDepthStencilStateCreateInfo_getFlags0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:570

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


//@line:579

		  VkPipelineDepthStencilStateCreateInfo* vkObj = (VkPipelineDepthStencilStateCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->depthTestEnable = (VkBool32) (_depthTestEnable);
	  

}

static inline jboolean wrapped_Java_bor_vulkan_structs_VkPipelineDepthStencilStateCreateInfo_getDepthTestEnable0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:589

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


//@line:598

		  VkPipelineDepthStencilStateCreateInfo* vkObj = (VkPipelineDepthStencilStateCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->depthWriteEnable = (VkBool32) (_depthWriteEnable);
	  

}

static inline jboolean wrapped_Java_bor_vulkan_structs_VkPipelineDepthStencilStateCreateInfo_getDepthWriteEnable0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:608

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


//@line:617

		  VkPipelineDepthStencilStateCreateInfo* vkObj = (VkPipelineDepthStencilStateCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->depthCompareOp = (VkCompareOp) (_depthCompareOp);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkPipelineDepthStencilStateCreateInfo_getDepthCompareOp0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:627

		  VkPipelineDepthStencilStateCreateInfo* vkObj = (VkPipelineDepthStencilStateCreateInfo*)(ptr);
		  return (VkCompareOp) (vkObj->depthCompareOp);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkPipelineDepthStencilStateCreateInfo_getDepthCompareOp0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPipelineDepthStencilStateCreateInfo_getDepthCompareOp0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPipelineDepthStencilStateCreateInfo_setDepthBoundsTestEnable0(JNIEnv* env, jclass clazz, jobject obj_ptr, jboolean _depthBoundsTestEnable) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:636

		  VkPipelineDepthStencilStateCreateInfo* vkObj = (VkPipelineDepthStencilStateCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->depthBoundsTestEnable = (VkBool32) (_depthBoundsTestEnable);
	  

}

static inline jboolean wrapped_Java_bor_vulkan_structs_VkPipelineDepthStencilStateCreateInfo_getDepthBoundsTestEnable0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:646

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


//@line:655

		  VkPipelineDepthStencilStateCreateInfo* vkObj = (VkPipelineDepthStencilStateCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->stencilTestEnable = (VkBool32) (_stencilTestEnable);
	  

}

static inline jboolean wrapped_Java_bor_vulkan_structs_VkPipelineDepthStencilStateCreateInfo_getStencilTestEnable0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:665

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


//@line:674

		  VkPipelineDepthStencilStateCreateInfo* vkObj = (VkPipelineDepthStencilStateCreateInfo*)(ptr);
		 // code for Buffer - referenced by ptr
		  vkObj->front = (VkStencilOpState) (_front);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkPipelineDepthStencilStateCreateInfo_getFront0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:684

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


//@line:694

		  VkPipelineDepthStencilStateCreateInfo* vkObj = (VkPipelineDepthStencilStateCreateInfo*)(ptr);
		 // code for Buffer - referenced by ptr
		  vkObj->back = (VkStencilOpState) (_back);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkPipelineDepthStencilStateCreateInfo_getBack0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:704

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


//@line:714

		  VkPipelineDepthStencilStateCreateInfo* vkObj = (VkPipelineDepthStencilStateCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->minDepthBounds = (float) (_minDepthBounds);
	  

}

static inline jfloat wrapped_Java_bor_vulkan_structs_VkPipelineDepthStencilStateCreateInfo_getMinDepthBounds0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:724

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


//@line:733

		  VkPipelineDepthStencilStateCreateInfo* vkObj = (VkPipelineDepthStencilStateCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->maxDepthBounds = (float) (_maxDepthBounds);
	  

}

static inline jfloat wrapped_Java_bor_vulkan_structs_VkPipelineDepthStencilStateCreateInfo_getMaxDepthBounds0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:743

		  VkPipelineDepthStencilStateCreateInfo* vkObj = (VkPipelineDepthStencilStateCreateInfo*)(ptr);
		  return (jfloat) (vkObj->maxDepthBounds);
	 
}

JNIEXPORT jfloat JNICALL Java_bor_vulkan_structs_VkPipelineDepthStencilStateCreateInfo_getMaxDepthBounds0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jfloat JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPipelineDepthStencilStateCreateInfo_getMaxDepthBounds0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

