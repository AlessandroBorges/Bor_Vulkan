#include <bor.vulkan.structs.VkDisplayPlaneCapabilitiesKHR.h>

//@line:46

    #include <BorVulkan.hpp>
    JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDisplayPlaneCapabilitiesKHR_setSupportedAlpha0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _supportedAlpha) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:477

		  VkDisplayPlaneCapabilitiesKHR* vkObj = (VkDisplayPlaneCapabilitiesKHR*)(ptr);
		 // code for simple past value 
		  vkObj->supportedAlpha = (VkDisplayPlaneAlphaFlagsKHR) (_supportedAlpha);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkDisplayPlaneCapabilitiesKHR_getSupportedAlpha0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:487

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


//@line:496

		  VkDisplayPlaneCapabilitiesKHR* vkObj = (VkDisplayPlaneCapabilitiesKHR*)(ptr);
		 // code for Buffer - referenced by ptr
		  vkObj->minSrcPosition = (VkOffset2D) (_minSrcPosition);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkDisplayPlaneCapabilitiesKHR_getMinSrcPosition0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:506

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


//@line:516

		  VkDisplayPlaneCapabilitiesKHR* vkObj = (VkDisplayPlaneCapabilitiesKHR*)(ptr);
		 // code for Buffer - referenced by ptr
		  vkObj->maxSrcPosition = (VkOffset2D) (_maxSrcPosition);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkDisplayPlaneCapabilitiesKHR_getMaxSrcPosition0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:526

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


//@line:536

		  VkDisplayPlaneCapabilitiesKHR* vkObj = (VkDisplayPlaneCapabilitiesKHR*)(ptr);
		 // code for Buffer - referenced by ptr
		  vkObj->minSrcExtent = (VkExtent2D) (_minSrcExtent);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkDisplayPlaneCapabilitiesKHR_getMinSrcExtent0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:546

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


//@line:556

		  VkDisplayPlaneCapabilitiesKHR* vkObj = (VkDisplayPlaneCapabilitiesKHR*)(ptr);
		 // code for Buffer - referenced by ptr
		  vkObj->maxSrcExtent = (VkExtent2D) (_maxSrcExtent);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkDisplayPlaneCapabilitiesKHR_getMaxSrcExtent0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:566

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


//@line:576

		  VkDisplayPlaneCapabilitiesKHR* vkObj = (VkDisplayPlaneCapabilitiesKHR*)(ptr);
		 // code for Buffer - referenced by ptr
		  vkObj->minDstPosition = (VkOffset2D) (_minDstPosition);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkDisplayPlaneCapabilitiesKHR_getMinDstPosition0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:586

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


//@line:596

		  VkDisplayPlaneCapabilitiesKHR* vkObj = (VkDisplayPlaneCapabilitiesKHR*)(ptr);
		 // code for Buffer - referenced by ptr
		  vkObj->maxDstPosition = (VkOffset2D) (_maxDstPosition);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkDisplayPlaneCapabilitiesKHR_getMaxDstPosition0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:606

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


//@line:616

		  VkDisplayPlaneCapabilitiesKHR* vkObj = (VkDisplayPlaneCapabilitiesKHR*)(ptr);
		 // code for Buffer - referenced by ptr
		  vkObj->minDstExtent = (VkExtent2D) (_minDstExtent);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkDisplayPlaneCapabilitiesKHR_getMinDstExtent0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:626

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


//@line:636

		  VkDisplayPlaneCapabilitiesKHR* vkObj = (VkDisplayPlaneCapabilitiesKHR*)(ptr);
		 // code for Buffer - referenced by ptr
		  vkObj->maxDstExtent = (VkExtent2D) (_maxDstExtent);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkDisplayPlaneCapabilitiesKHR_getMaxDstExtent0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:646

		  VkDisplayPlaneCapabilitiesKHR* vkObj = (VkDisplayPlaneCapabilitiesKHR*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->maxDstExtent);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkDisplayPlaneCapabilitiesKHR_getMaxDstExtent0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDisplayPlaneCapabilitiesKHR_getMaxDstExtent0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

