#include <bor.vulkan.structs.VkDisplayPlaneCapabilitiesKHR.h>

//@line:46

    #include <BorVulkan.hpp>
    JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDisplayPlaneCapabilitiesKHR_setSupportedAlpha0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _supportedAlpha) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:488

		  VkDisplayPlaneCapabilitiesKHR* vkObj = (VkDisplayPlaneCapabilitiesKHR*)(ptr);
		 // code for simple past value 
		  vkObj->supportedAlpha = (VkDisplayPlaneAlphaFlagsKHR) (_supportedAlpha);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkDisplayPlaneCapabilitiesKHR_getSupportedAlpha0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:498

		  VkDisplayPlaneCapabilitiesKHR* vkObj = (VkDisplayPlaneCapabilitiesKHR*)(ptr);
		  return (jint) (vkObj->supportedAlpha);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkDisplayPlaneCapabilitiesKHR_getSupportedAlpha0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDisplayPlaneCapabilitiesKHR_getSupportedAlpha0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDisplayPlaneCapabilitiesKHR_setMinSrcPosition0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__minSrcPosition) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _minSrcPosition = (char*)(obj__minSrcPosition?env->GetDirectBufferAddress(obj__minSrcPosition) : NULL);


//@line:507

		  VkDisplayPlaneCapabilitiesKHR* vkObj = (VkDisplayPlaneCapabilitiesKHR*)(ptr);
		 // code for Buffer - ptr to struct 
		 VkOffset2D* p_minSrcPosition = (VkOffset2D*) _minSrcPosition; 
		 vkObj->minSrcPosition = (*p_minSrcPosition); 
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkDisplayPlaneCapabilitiesKHR_getMinSrcPosition0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:518

		  VkDisplayPlaneCapabilitiesKHR* vkObj = (VkDisplayPlaneCapabilitiesKHR*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->minSrcPosition);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkDisplayPlaneCapabilitiesKHR_getMinSrcPosition0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDisplayPlaneCapabilitiesKHR_getMinSrcPosition0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDisplayPlaneCapabilitiesKHR_setMaxSrcPosition0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__maxSrcPosition) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _maxSrcPosition = (char*)(obj__maxSrcPosition?env->GetDirectBufferAddress(obj__maxSrcPosition) : NULL);


//@line:528

		  VkDisplayPlaneCapabilitiesKHR* vkObj = (VkDisplayPlaneCapabilitiesKHR*)(ptr);
		 // code for Buffer - ptr to struct 
		 VkOffset2D* p_maxSrcPosition = (VkOffset2D*) _maxSrcPosition; 
		 vkObj->maxSrcPosition = (*p_maxSrcPosition); 
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkDisplayPlaneCapabilitiesKHR_getMaxSrcPosition0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:539

		  VkDisplayPlaneCapabilitiesKHR* vkObj = (VkDisplayPlaneCapabilitiesKHR*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->maxSrcPosition);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkDisplayPlaneCapabilitiesKHR_getMaxSrcPosition0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDisplayPlaneCapabilitiesKHR_getMaxSrcPosition0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDisplayPlaneCapabilitiesKHR_setMinSrcExtent0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__minSrcExtent) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _minSrcExtent = (char*)(obj__minSrcExtent?env->GetDirectBufferAddress(obj__minSrcExtent) : NULL);


//@line:549

		  VkDisplayPlaneCapabilitiesKHR* vkObj = (VkDisplayPlaneCapabilitiesKHR*)(ptr);
		 // code for Buffer - ptr to struct 
		 VkExtent2D* p_minSrcExtent = (VkExtent2D*) _minSrcExtent; 
		 vkObj->minSrcExtent = (*p_minSrcExtent); 
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkDisplayPlaneCapabilitiesKHR_getMinSrcExtent0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:560

		  VkDisplayPlaneCapabilitiesKHR* vkObj = (VkDisplayPlaneCapabilitiesKHR*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->minSrcExtent);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkDisplayPlaneCapabilitiesKHR_getMinSrcExtent0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDisplayPlaneCapabilitiesKHR_getMinSrcExtent0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDisplayPlaneCapabilitiesKHR_setMaxSrcExtent0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__maxSrcExtent) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _maxSrcExtent = (char*)(obj__maxSrcExtent?env->GetDirectBufferAddress(obj__maxSrcExtent) : NULL);


//@line:570

		  VkDisplayPlaneCapabilitiesKHR* vkObj = (VkDisplayPlaneCapabilitiesKHR*)(ptr);
		 // code for Buffer - ptr to struct 
		 VkExtent2D* p_maxSrcExtent = (VkExtent2D*) _maxSrcExtent; 
		 vkObj->maxSrcExtent = (*p_maxSrcExtent); 
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkDisplayPlaneCapabilitiesKHR_getMaxSrcExtent0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:581

		  VkDisplayPlaneCapabilitiesKHR* vkObj = (VkDisplayPlaneCapabilitiesKHR*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->maxSrcExtent);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkDisplayPlaneCapabilitiesKHR_getMaxSrcExtent0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDisplayPlaneCapabilitiesKHR_getMaxSrcExtent0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDisplayPlaneCapabilitiesKHR_setMinDstPosition0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__minDstPosition) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _minDstPosition = (char*)(obj__minDstPosition?env->GetDirectBufferAddress(obj__minDstPosition) : NULL);


//@line:591

		  VkDisplayPlaneCapabilitiesKHR* vkObj = (VkDisplayPlaneCapabilitiesKHR*)(ptr);
		 // code for Buffer - ptr to struct 
		 VkOffset2D* p_minDstPosition = (VkOffset2D*) _minDstPosition; 
		 vkObj->minDstPosition = (*p_minDstPosition); 
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkDisplayPlaneCapabilitiesKHR_getMinDstPosition0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:602

		  VkDisplayPlaneCapabilitiesKHR* vkObj = (VkDisplayPlaneCapabilitiesKHR*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->minDstPosition);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkDisplayPlaneCapabilitiesKHR_getMinDstPosition0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDisplayPlaneCapabilitiesKHR_getMinDstPosition0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDisplayPlaneCapabilitiesKHR_setMaxDstPosition0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__maxDstPosition) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _maxDstPosition = (char*)(obj__maxDstPosition?env->GetDirectBufferAddress(obj__maxDstPosition) : NULL);


//@line:612

		  VkDisplayPlaneCapabilitiesKHR* vkObj = (VkDisplayPlaneCapabilitiesKHR*)(ptr);
		 // code for Buffer - ptr to struct 
		 VkOffset2D* p_maxDstPosition = (VkOffset2D*) _maxDstPosition; 
		 vkObj->maxDstPosition = (*p_maxDstPosition); 
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkDisplayPlaneCapabilitiesKHR_getMaxDstPosition0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:623

		  VkDisplayPlaneCapabilitiesKHR* vkObj = (VkDisplayPlaneCapabilitiesKHR*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->maxDstPosition);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkDisplayPlaneCapabilitiesKHR_getMaxDstPosition0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDisplayPlaneCapabilitiesKHR_getMaxDstPosition0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDisplayPlaneCapabilitiesKHR_setMinDstExtent0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__minDstExtent) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _minDstExtent = (char*)(obj__minDstExtent?env->GetDirectBufferAddress(obj__minDstExtent) : NULL);


//@line:633

		  VkDisplayPlaneCapabilitiesKHR* vkObj = (VkDisplayPlaneCapabilitiesKHR*)(ptr);
		 // code for Buffer - ptr to struct 
		 VkExtent2D* p_minDstExtent = (VkExtent2D*) _minDstExtent; 
		 vkObj->minDstExtent = (*p_minDstExtent); 
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkDisplayPlaneCapabilitiesKHR_getMinDstExtent0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:644

		  VkDisplayPlaneCapabilitiesKHR* vkObj = (VkDisplayPlaneCapabilitiesKHR*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->minDstExtent);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkDisplayPlaneCapabilitiesKHR_getMinDstExtent0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDisplayPlaneCapabilitiesKHR_getMinDstExtent0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDisplayPlaneCapabilitiesKHR_setMaxDstExtent0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__maxDstExtent) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _maxDstExtent = (char*)(obj__maxDstExtent?env->GetDirectBufferAddress(obj__maxDstExtent) : NULL);


//@line:654

		  VkDisplayPlaneCapabilitiesKHR* vkObj = (VkDisplayPlaneCapabilitiesKHR*)(ptr);
		 // code for Buffer - ptr to struct 
		 VkExtent2D* p_maxDstExtent = (VkExtent2D*) _maxDstExtent; 
		 vkObj->maxDstExtent = (*p_maxDstExtent); 
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkDisplayPlaneCapabilitiesKHR_getMaxDstExtent0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:665

		  VkDisplayPlaneCapabilitiesKHR* vkObj = (VkDisplayPlaneCapabilitiesKHR*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->maxDstExtent);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkDisplayPlaneCapabilitiesKHR_getMaxDstExtent0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDisplayPlaneCapabilitiesKHR_getMaxDstExtent0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

