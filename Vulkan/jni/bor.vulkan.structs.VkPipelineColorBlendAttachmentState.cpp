#include <bor.vulkan.structs.VkPipelineColorBlendAttachmentState.h>

//@line:45

    #include <BorVulkan.hpp>
    JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPipelineColorBlendAttachmentState_setBlendEnable0(JNIEnv* env, jclass clazz, jobject obj_ptr, jboolean _blendEnable) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:372

		  VkPipelineColorBlendAttachmentState* vkObj = (VkPipelineColorBlendAttachmentState*)(ptr);
		 // code for simple past value 
		  vkObj->blendEnable = (VkBool32) (_blendEnable);
	  

}

static inline jboolean wrapped_Java_bor_vulkan_structs_VkPipelineColorBlendAttachmentState_getBlendEnable0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:382

		  VkPipelineColorBlendAttachmentState* vkObj = (VkPipelineColorBlendAttachmentState*)(ptr);
		  return (jboolean) (vkObj->blendEnable);
	 
}

JNIEXPORT jboolean JNICALL Java_bor_vulkan_structs_VkPipelineColorBlendAttachmentState_getBlendEnable0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jboolean JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPipelineColorBlendAttachmentState_getBlendEnable0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPipelineColorBlendAttachmentState_setSrcColorBlendFactor0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _srcColorBlendFactor) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:391

		  VkPipelineColorBlendAttachmentState* vkObj = (VkPipelineColorBlendAttachmentState*)(ptr);
		 // code for simple past value 
		  vkObj->srcColorBlendFactor = (VkBlendFactor) (_srcColorBlendFactor);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkPipelineColorBlendAttachmentState_getSrcColorBlendFactor0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:401

		  VkPipelineColorBlendAttachmentState* vkObj = (VkPipelineColorBlendAttachmentState*)(ptr);
		  // generic get for Vk enums
		  return (jint) (vkObj->srcColorBlendFactor);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkPipelineColorBlendAttachmentState_getSrcColorBlendFactor0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPipelineColorBlendAttachmentState_getSrcColorBlendFactor0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPipelineColorBlendAttachmentState_setDstColorBlendFactor0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _dstColorBlendFactor) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:411

		  VkPipelineColorBlendAttachmentState* vkObj = (VkPipelineColorBlendAttachmentState*)(ptr);
		 // code for simple past value 
		  vkObj->dstColorBlendFactor = (VkBlendFactor) (_dstColorBlendFactor);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkPipelineColorBlendAttachmentState_getDstColorBlendFactor0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:421

		  VkPipelineColorBlendAttachmentState* vkObj = (VkPipelineColorBlendAttachmentState*)(ptr);
		  // generic get for Vk enums
		  return (jint) (vkObj->dstColorBlendFactor);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkPipelineColorBlendAttachmentState_getDstColorBlendFactor0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPipelineColorBlendAttachmentState_getDstColorBlendFactor0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPipelineColorBlendAttachmentState_setColorBlendOp0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _colorBlendOp) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:431

		  VkPipelineColorBlendAttachmentState* vkObj = (VkPipelineColorBlendAttachmentState*)(ptr);
		 // code for simple past value 
		  vkObj->colorBlendOp = (VkBlendOp) (_colorBlendOp);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkPipelineColorBlendAttachmentState_getColorBlendOp0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:441

		  VkPipelineColorBlendAttachmentState* vkObj = (VkPipelineColorBlendAttachmentState*)(ptr);
		  // generic get for Vk enums
		  return (jint) (vkObj->colorBlendOp);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkPipelineColorBlendAttachmentState_getColorBlendOp0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPipelineColorBlendAttachmentState_getColorBlendOp0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPipelineColorBlendAttachmentState_setSrcAlphaBlendFactor0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _srcAlphaBlendFactor) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:451

		  VkPipelineColorBlendAttachmentState* vkObj = (VkPipelineColorBlendAttachmentState*)(ptr);
		 // code for simple past value 
		  vkObj->srcAlphaBlendFactor = (VkBlendFactor) (_srcAlphaBlendFactor);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkPipelineColorBlendAttachmentState_getSrcAlphaBlendFactor0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:461

		  VkPipelineColorBlendAttachmentState* vkObj = (VkPipelineColorBlendAttachmentState*)(ptr);
		  // generic get for Vk enums
		  return (jint) (vkObj->srcAlphaBlendFactor);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkPipelineColorBlendAttachmentState_getSrcAlphaBlendFactor0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPipelineColorBlendAttachmentState_getSrcAlphaBlendFactor0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPipelineColorBlendAttachmentState_setDstAlphaBlendFactor0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _dstAlphaBlendFactor) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:471

		  VkPipelineColorBlendAttachmentState* vkObj = (VkPipelineColorBlendAttachmentState*)(ptr);
		 // code for simple past value 
		  vkObj->dstAlphaBlendFactor = (VkBlendFactor) (_dstAlphaBlendFactor);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkPipelineColorBlendAttachmentState_getDstAlphaBlendFactor0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:481

		  VkPipelineColorBlendAttachmentState* vkObj = (VkPipelineColorBlendAttachmentState*)(ptr);
		  // generic get for Vk enums
		  return (jint) (vkObj->dstAlphaBlendFactor);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkPipelineColorBlendAttachmentState_getDstAlphaBlendFactor0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPipelineColorBlendAttachmentState_getDstAlphaBlendFactor0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPipelineColorBlendAttachmentState_setAlphaBlendOp0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _alphaBlendOp) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:491

		  VkPipelineColorBlendAttachmentState* vkObj = (VkPipelineColorBlendAttachmentState*)(ptr);
		 // code for simple past value 
		  vkObj->alphaBlendOp = (VkBlendOp) (_alphaBlendOp);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkPipelineColorBlendAttachmentState_getAlphaBlendOp0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:501

		  VkPipelineColorBlendAttachmentState* vkObj = (VkPipelineColorBlendAttachmentState*)(ptr);
		  // generic get for Vk enums
		  return (jint) (vkObj->alphaBlendOp);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkPipelineColorBlendAttachmentState_getAlphaBlendOp0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPipelineColorBlendAttachmentState_getAlphaBlendOp0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPipelineColorBlendAttachmentState_setColorWriteMask0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _colorWriteMask) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:511

		  VkPipelineColorBlendAttachmentState* vkObj = (VkPipelineColorBlendAttachmentState*)(ptr);
		 // code for simple past value 
		  vkObj->colorWriteMask = (VkColorComponentFlags) (_colorWriteMask);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkPipelineColorBlendAttachmentState_getColorWriteMask0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:521

		  VkPipelineColorBlendAttachmentState* vkObj = (VkPipelineColorBlendAttachmentState*)(ptr);
		  return (jint) (vkObj->colorWriteMask);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkPipelineColorBlendAttachmentState_getColorWriteMask0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPipelineColorBlendAttachmentState_getColorWriteMask0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

