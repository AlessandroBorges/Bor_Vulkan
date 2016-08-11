#include <bor.vulkan.structs.VkPipelineRasterizationStateCreateInfo.h>

//@line:50

    #include <BorVulkan.hpp>
    JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPipelineRasterizationStateCreateInfo_setSType0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _sType) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:533

		  VkPipelineRasterizationStateCreateInfo* vkObj = (VkPipelineRasterizationStateCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->sType = (VkStructureType) (_sType);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkPipelineRasterizationStateCreateInfo_getSType0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:543

		  VkPipelineRasterizationStateCreateInfo* vkObj = (VkPipelineRasterizationStateCreateInfo*)(ptr);
		  return (VkStructureType) (vkObj->sType);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkPipelineRasterizationStateCreateInfo_getSType0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPipelineRasterizationStateCreateInfo_getSType0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPipelineRasterizationStateCreateInfo_setPNext0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__pNext) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _pNext = (char*)(obj__pNext?env->GetDirectBufferAddress(obj__pNext) : NULL);


//@line:552

		  VkPipelineRasterizationStateCreateInfo* vkObj = (VkPipelineRasterizationStateCreateInfo*)(ptr);
		 // code for Buffer - referenced by ptr
		  vkObj->pNext = (const void*) (_pNext);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkPipelineRasterizationStateCreateInfo_getPNext0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:562

		  VkPipelineRasterizationStateCreateInfo* vkObj = (VkPipelineRasterizationStateCreateInfo*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->pNext);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkPipelineRasterizationStateCreateInfo_getPNext0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPipelineRasterizationStateCreateInfo_getPNext0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPipelineRasterizationStateCreateInfo_setFlags0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _flags) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:572

		  VkPipelineRasterizationStateCreateInfo* vkObj = (VkPipelineRasterizationStateCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->flags = (VkPipelineRasterizationStateCreateFlags) (_flags);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkPipelineRasterizationStateCreateInfo_getFlags0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:582

		  VkPipelineRasterizationStateCreateInfo* vkObj = (VkPipelineRasterizationStateCreateInfo*)(ptr);
		  return (jint) (vkObj->flags);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkPipelineRasterizationStateCreateInfo_getFlags0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPipelineRasterizationStateCreateInfo_getFlags0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPipelineRasterizationStateCreateInfo_setDepthClampEnable0(JNIEnv* env, jclass clazz, jobject obj_ptr, jboolean _depthClampEnable) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:591

		  VkPipelineRasterizationStateCreateInfo* vkObj = (VkPipelineRasterizationStateCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->depthClampEnable = (VkBool32) (_depthClampEnable);
	  

}

static inline jboolean wrapped_Java_bor_vulkan_structs_VkPipelineRasterizationStateCreateInfo_getDepthClampEnable0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:601

		  VkPipelineRasterizationStateCreateInfo* vkObj = (VkPipelineRasterizationStateCreateInfo*)(ptr);
		  return (jboolean) (vkObj->depthClampEnable);
	 
}

JNIEXPORT jboolean JNICALL Java_bor_vulkan_structs_VkPipelineRasterizationStateCreateInfo_getDepthClampEnable0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jboolean JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPipelineRasterizationStateCreateInfo_getDepthClampEnable0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPipelineRasterizationStateCreateInfo_setRasterizerDiscardEnable0(JNIEnv* env, jclass clazz, jobject obj_ptr, jboolean _rasterizerDiscardEnable) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:610

		  VkPipelineRasterizationStateCreateInfo* vkObj = (VkPipelineRasterizationStateCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->rasterizerDiscardEnable = (VkBool32) (_rasterizerDiscardEnable);
	  

}

static inline jboolean wrapped_Java_bor_vulkan_structs_VkPipelineRasterizationStateCreateInfo_getRasterizerDiscardEnable0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:620

		  VkPipelineRasterizationStateCreateInfo* vkObj = (VkPipelineRasterizationStateCreateInfo*)(ptr);
		  return (jboolean) (vkObj->rasterizerDiscardEnable);
	 
}

JNIEXPORT jboolean JNICALL Java_bor_vulkan_structs_VkPipelineRasterizationStateCreateInfo_getRasterizerDiscardEnable0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jboolean JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPipelineRasterizationStateCreateInfo_getRasterizerDiscardEnable0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPipelineRasterizationStateCreateInfo_setPolygonMode0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _polygonMode) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:629

		  VkPipelineRasterizationStateCreateInfo* vkObj = (VkPipelineRasterizationStateCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->polygonMode = (VkPolygonMode) (_polygonMode);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkPipelineRasterizationStateCreateInfo_getPolygonMode0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:639

		  VkPipelineRasterizationStateCreateInfo* vkObj = (VkPipelineRasterizationStateCreateInfo*)(ptr);
		  return (VkPolygonMode) (vkObj->polygonMode);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkPipelineRasterizationStateCreateInfo_getPolygonMode0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPipelineRasterizationStateCreateInfo_getPolygonMode0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPipelineRasterizationStateCreateInfo_setCullMode0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _cullMode) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:648

		  VkPipelineRasterizationStateCreateInfo* vkObj = (VkPipelineRasterizationStateCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->cullMode = (VkCullModeFlags) (_cullMode);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkPipelineRasterizationStateCreateInfo_getCullMode0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:658

		  VkPipelineRasterizationStateCreateInfo* vkObj = (VkPipelineRasterizationStateCreateInfo*)(ptr);
		  return (jint) (vkObj->cullMode);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkPipelineRasterizationStateCreateInfo_getCullMode0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPipelineRasterizationStateCreateInfo_getCullMode0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPipelineRasterizationStateCreateInfo_setFrontFace0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _frontFace) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:667

		  VkPipelineRasterizationStateCreateInfo* vkObj = (VkPipelineRasterizationStateCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->frontFace = (VkFrontFace) (_frontFace);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkPipelineRasterizationStateCreateInfo_getFrontFace0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:677

		  VkPipelineRasterizationStateCreateInfo* vkObj = (VkPipelineRasterizationStateCreateInfo*)(ptr);
		  return (VkFrontFace) (vkObj->frontFace);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkPipelineRasterizationStateCreateInfo_getFrontFace0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPipelineRasterizationStateCreateInfo_getFrontFace0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPipelineRasterizationStateCreateInfo_setDepthBiasEnable0(JNIEnv* env, jclass clazz, jobject obj_ptr, jboolean _depthBiasEnable) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:686

		  VkPipelineRasterizationStateCreateInfo* vkObj = (VkPipelineRasterizationStateCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->depthBiasEnable = (VkBool32) (_depthBiasEnable);
	  

}

static inline jboolean wrapped_Java_bor_vulkan_structs_VkPipelineRasterizationStateCreateInfo_getDepthBiasEnable0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:696

		  VkPipelineRasterizationStateCreateInfo* vkObj = (VkPipelineRasterizationStateCreateInfo*)(ptr);
		  return (jboolean) (vkObj->depthBiasEnable);
	 
}

JNIEXPORT jboolean JNICALL Java_bor_vulkan_structs_VkPipelineRasterizationStateCreateInfo_getDepthBiasEnable0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jboolean JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPipelineRasterizationStateCreateInfo_getDepthBiasEnable0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPipelineRasterizationStateCreateInfo_setDepthBiasConstantFactor0(JNIEnv* env, jclass clazz, jobject obj_ptr, jfloat _depthBiasConstantFactor) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:705

		  VkPipelineRasterizationStateCreateInfo* vkObj = (VkPipelineRasterizationStateCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->depthBiasConstantFactor = (float) (_depthBiasConstantFactor);
	  

}

static inline jfloat wrapped_Java_bor_vulkan_structs_VkPipelineRasterizationStateCreateInfo_getDepthBiasConstantFactor0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:715

		  VkPipelineRasterizationStateCreateInfo* vkObj = (VkPipelineRasterizationStateCreateInfo*)(ptr);
		  return (jfloat) (vkObj->depthBiasConstantFactor);
	 
}

JNIEXPORT jfloat JNICALL Java_bor_vulkan_structs_VkPipelineRasterizationStateCreateInfo_getDepthBiasConstantFactor0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jfloat JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPipelineRasterizationStateCreateInfo_getDepthBiasConstantFactor0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPipelineRasterizationStateCreateInfo_setDepthBiasClamp0(JNIEnv* env, jclass clazz, jobject obj_ptr, jfloat _depthBiasClamp) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:724

		  VkPipelineRasterizationStateCreateInfo* vkObj = (VkPipelineRasterizationStateCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->depthBiasClamp = (float) (_depthBiasClamp);
	  

}

static inline jfloat wrapped_Java_bor_vulkan_structs_VkPipelineRasterizationStateCreateInfo_getDepthBiasClamp0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:734

		  VkPipelineRasterizationStateCreateInfo* vkObj = (VkPipelineRasterizationStateCreateInfo*)(ptr);
		  return (jfloat) (vkObj->depthBiasClamp);
	 
}

JNIEXPORT jfloat JNICALL Java_bor_vulkan_structs_VkPipelineRasterizationStateCreateInfo_getDepthBiasClamp0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jfloat JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPipelineRasterizationStateCreateInfo_getDepthBiasClamp0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPipelineRasterizationStateCreateInfo_setDepthBiasSlopeFactor0(JNIEnv* env, jclass clazz, jobject obj_ptr, jfloat _depthBiasSlopeFactor) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:743

		  VkPipelineRasterizationStateCreateInfo* vkObj = (VkPipelineRasterizationStateCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->depthBiasSlopeFactor = (float) (_depthBiasSlopeFactor);
	  

}

static inline jfloat wrapped_Java_bor_vulkan_structs_VkPipelineRasterizationStateCreateInfo_getDepthBiasSlopeFactor0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:753

		  VkPipelineRasterizationStateCreateInfo* vkObj = (VkPipelineRasterizationStateCreateInfo*)(ptr);
		  return (jfloat) (vkObj->depthBiasSlopeFactor);
	 
}

JNIEXPORT jfloat JNICALL Java_bor_vulkan_structs_VkPipelineRasterizationStateCreateInfo_getDepthBiasSlopeFactor0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jfloat JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPipelineRasterizationStateCreateInfo_getDepthBiasSlopeFactor0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPipelineRasterizationStateCreateInfo_setLineWidth0(JNIEnv* env, jclass clazz, jobject obj_ptr, jfloat _lineWidth) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:762

		  VkPipelineRasterizationStateCreateInfo* vkObj = (VkPipelineRasterizationStateCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->lineWidth = (float) (_lineWidth);
	  

}

static inline jfloat wrapped_Java_bor_vulkan_structs_VkPipelineRasterizationStateCreateInfo_getLineWidth0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:772

		  VkPipelineRasterizationStateCreateInfo* vkObj = (VkPipelineRasterizationStateCreateInfo*)(ptr);
		  return (jfloat) (vkObj->lineWidth);
	 
}

JNIEXPORT jfloat JNICALL Java_bor_vulkan_structs_VkPipelineRasterizationStateCreateInfo_getLineWidth0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jfloat JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPipelineRasterizationStateCreateInfo_getLineWidth0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}
