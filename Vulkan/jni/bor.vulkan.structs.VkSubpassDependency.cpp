#include <bor.vulkan.structs.VkSubpassDependency.h>

//@line:44

    #include <BorVulkan.hpp>
    JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkSubpassDependency_setSrcSubpass0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _srcSubpass) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:346

		  VkSubpassDependency* vkObj = (VkSubpassDependency*)(ptr);
		 // code for simple past value 
		  vkObj->srcSubpass = (uint32_t) (_srcSubpass);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkSubpassDependency_getSrcSubpass0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:356

		  VkSubpassDependency* vkObj = (VkSubpassDependency*)(ptr);
		  return (jint) (vkObj->srcSubpass);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkSubpassDependency_getSrcSubpass0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkSubpassDependency_getSrcSubpass0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkSubpassDependency_setDstSubpass0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _dstSubpass) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:365

		  VkSubpassDependency* vkObj = (VkSubpassDependency*)(ptr);
		 // code for simple past value 
		  vkObj->dstSubpass = (uint32_t) (_dstSubpass);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkSubpassDependency_getDstSubpass0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:375

		  VkSubpassDependency* vkObj = (VkSubpassDependency*)(ptr);
		  return (jint) (vkObj->dstSubpass);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkSubpassDependency_getDstSubpass0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkSubpassDependency_getDstSubpass0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkSubpassDependency_setSrcStageMask0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _srcStageMask) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:384

		  VkSubpassDependency* vkObj = (VkSubpassDependency*)(ptr);
		 // code for simple past value 
		  vkObj->srcStageMask = (VkPipelineStageFlags) (_srcStageMask);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkSubpassDependency_getSrcStageMask0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:394

		  VkSubpassDependency* vkObj = (VkSubpassDependency*)(ptr);
		  return (jint) (vkObj->srcStageMask);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkSubpassDependency_getSrcStageMask0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkSubpassDependency_getSrcStageMask0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkSubpassDependency_setDstStageMask0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _dstStageMask) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:403

		  VkSubpassDependency* vkObj = (VkSubpassDependency*)(ptr);
		 // code for simple past value 
		  vkObj->dstStageMask = (VkPipelineStageFlags) (_dstStageMask);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkSubpassDependency_getDstStageMask0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:413

		  VkSubpassDependency* vkObj = (VkSubpassDependency*)(ptr);
		  return (jint) (vkObj->dstStageMask);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkSubpassDependency_getDstStageMask0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkSubpassDependency_getDstStageMask0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkSubpassDependency_setSrcAccessMask0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _srcAccessMask) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:422

		  VkSubpassDependency* vkObj = (VkSubpassDependency*)(ptr);
		 // code for simple past value 
		  vkObj->srcAccessMask = (VkAccessFlags) (_srcAccessMask);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkSubpassDependency_getSrcAccessMask0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:432

		  VkSubpassDependency* vkObj = (VkSubpassDependency*)(ptr);
		  return (jint) (vkObj->srcAccessMask);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkSubpassDependency_getSrcAccessMask0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkSubpassDependency_getSrcAccessMask0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkSubpassDependency_setDstAccessMask0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _dstAccessMask) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:441

		  VkSubpassDependency* vkObj = (VkSubpassDependency*)(ptr);
		 // code for simple past value 
		  vkObj->dstAccessMask = (VkAccessFlags) (_dstAccessMask);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkSubpassDependency_getDstAccessMask0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:451

		  VkSubpassDependency* vkObj = (VkSubpassDependency*)(ptr);
		  return (jint) (vkObj->dstAccessMask);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkSubpassDependency_getDstAccessMask0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkSubpassDependency_getDstAccessMask0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkSubpassDependency_setDependencyFlags0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _dependencyFlags) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:460

		  VkSubpassDependency* vkObj = (VkSubpassDependency*)(ptr);
		 // code for simple past value 
		  vkObj->dependencyFlags = (VkDependencyFlags) (_dependencyFlags);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkSubpassDependency_getDependencyFlags0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:470

		  VkSubpassDependency* vkObj = (VkSubpassDependency*)(ptr);
		  return (jint) (vkObj->dependencyFlags);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkSubpassDependency_getDependencyFlags0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkSubpassDependency_getDependencyFlags0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

