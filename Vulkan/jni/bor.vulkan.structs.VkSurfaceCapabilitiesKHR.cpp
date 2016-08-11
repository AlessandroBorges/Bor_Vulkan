#include <bor.vulkan.structs.VkSurfaceCapabilitiesKHR.h>

//@line:47

    #include <BorVulkan.hpp>
    JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkSurfaceCapabilitiesKHR_setMinImageCount0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _minImageCount) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:459

		  VkSurfaceCapabilitiesKHR* vkObj = (VkSurfaceCapabilitiesKHR*)(ptr);
		 // code for simple past value 
		  vkObj->minImageCount = (uint32_t) (_minImageCount);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkSurfaceCapabilitiesKHR_getMinImageCount0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:469

		  VkSurfaceCapabilitiesKHR* vkObj = (VkSurfaceCapabilitiesKHR*)(ptr);
		  return (jint) (vkObj->minImageCount);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkSurfaceCapabilitiesKHR_getMinImageCount0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkSurfaceCapabilitiesKHR_getMinImageCount0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkSurfaceCapabilitiesKHR_setMaxImageCount0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _maxImageCount) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:478

		  VkSurfaceCapabilitiesKHR* vkObj = (VkSurfaceCapabilitiesKHR*)(ptr);
		 // code for simple past value 
		  vkObj->maxImageCount = (uint32_t) (_maxImageCount);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkSurfaceCapabilitiesKHR_getMaxImageCount0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:488

		  VkSurfaceCapabilitiesKHR* vkObj = (VkSurfaceCapabilitiesKHR*)(ptr);
		  return (jint) (vkObj->maxImageCount);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkSurfaceCapabilitiesKHR_getMaxImageCount0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkSurfaceCapabilitiesKHR_getMaxImageCount0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkSurfaceCapabilitiesKHR_setCurrentExtent0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__currentExtent) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _currentExtent = (char*)(obj__currentExtent?env->GetDirectBufferAddress(obj__currentExtent) : NULL);


//@line:497

		  VkSurfaceCapabilitiesKHR* vkObj = (VkSurfaceCapabilitiesKHR*)(ptr);
		 // code for Buffer - referenced by ptr
		  vkObj->currentExtent = (VkExtent2D) (_currentExtent);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkSurfaceCapabilitiesKHR_getCurrentExtent0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:507

		  VkSurfaceCapabilitiesKHR* vkObj = (VkSurfaceCapabilitiesKHR*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->currentExtent);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkSurfaceCapabilitiesKHR_getCurrentExtent0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkSurfaceCapabilitiesKHR_getCurrentExtent0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkSurfaceCapabilitiesKHR_setMinImageExtent0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__minImageExtent) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _minImageExtent = (char*)(obj__minImageExtent?env->GetDirectBufferAddress(obj__minImageExtent) : NULL);


//@line:517

		  VkSurfaceCapabilitiesKHR* vkObj = (VkSurfaceCapabilitiesKHR*)(ptr);
		 // code for Buffer - referenced by ptr
		  vkObj->minImageExtent = (VkExtent2D) (_minImageExtent);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkSurfaceCapabilitiesKHR_getMinImageExtent0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:527

		  VkSurfaceCapabilitiesKHR* vkObj = (VkSurfaceCapabilitiesKHR*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->minImageExtent);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkSurfaceCapabilitiesKHR_getMinImageExtent0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkSurfaceCapabilitiesKHR_getMinImageExtent0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkSurfaceCapabilitiesKHR_setMaxImageExtent0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__maxImageExtent) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _maxImageExtent = (char*)(obj__maxImageExtent?env->GetDirectBufferAddress(obj__maxImageExtent) : NULL);


//@line:537

		  VkSurfaceCapabilitiesKHR* vkObj = (VkSurfaceCapabilitiesKHR*)(ptr);
		 // code for Buffer - referenced by ptr
		  vkObj->maxImageExtent = (VkExtent2D) (_maxImageExtent);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkSurfaceCapabilitiesKHR_getMaxImageExtent0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:547

		  VkSurfaceCapabilitiesKHR* vkObj = (VkSurfaceCapabilitiesKHR*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->maxImageExtent);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkSurfaceCapabilitiesKHR_getMaxImageExtent0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkSurfaceCapabilitiesKHR_getMaxImageExtent0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkSurfaceCapabilitiesKHR_setMaxImageArrayLayers0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _maxImageArrayLayers) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:557

		  VkSurfaceCapabilitiesKHR* vkObj = (VkSurfaceCapabilitiesKHR*)(ptr);
		 // code for simple past value 
		  vkObj->maxImageArrayLayers = (uint32_t) (_maxImageArrayLayers);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkSurfaceCapabilitiesKHR_getMaxImageArrayLayers0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:567

		  VkSurfaceCapabilitiesKHR* vkObj = (VkSurfaceCapabilitiesKHR*)(ptr);
		  return (jint) (vkObj->maxImageArrayLayers);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkSurfaceCapabilitiesKHR_getMaxImageArrayLayers0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkSurfaceCapabilitiesKHR_getMaxImageArrayLayers0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkSurfaceCapabilitiesKHR_setSupportedTransforms0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _supportedTransforms) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:576

		  VkSurfaceCapabilitiesKHR* vkObj = (VkSurfaceCapabilitiesKHR*)(ptr);
		 // code for simple past value 
		  vkObj->supportedTransforms = (VkSurfaceTransformFlagsKHR) (_supportedTransforms);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkSurfaceCapabilitiesKHR_getSupportedTransforms0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:586

		  VkSurfaceCapabilitiesKHR* vkObj = (VkSurfaceCapabilitiesKHR*)(ptr);
		  return (jint) (vkObj->supportedTransforms);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkSurfaceCapabilitiesKHR_getSupportedTransforms0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkSurfaceCapabilitiesKHR_getSupportedTransforms0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkSurfaceCapabilitiesKHR_setCurrentTransform0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _currentTransform) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:595

		  VkSurfaceCapabilitiesKHR* vkObj = (VkSurfaceCapabilitiesKHR*)(ptr);
		 // code for simple past value 
		  vkObj->currentTransform = (VkSurfaceTransformFlagBitsKHR) (_currentTransform);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkSurfaceCapabilitiesKHR_getCurrentTransform0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:605

		  VkSurfaceCapabilitiesKHR* vkObj = (VkSurfaceCapabilitiesKHR*)(ptr);
		  return (VkSurfaceTransformFlagBitsKHR) (vkObj->currentTransform);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkSurfaceCapabilitiesKHR_getCurrentTransform0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkSurfaceCapabilitiesKHR_getCurrentTransform0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkSurfaceCapabilitiesKHR_setSupportedCompositeAlpha0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _supportedCompositeAlpha) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:614

		  VkSurfaceCapabilitiesKHR* vkObj = (VkSurfaceCapabilitiesKHR*)(ptr);
		 // code for simple past value 
		  vkObj->supportedCompositeAlpha = (VkCompositeAlphaFlagsKHR) (_supportedCompositeAlpha);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkSurfaceCapabilitiesKHR_getSupportedCompositeAlpha0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:624

		  VkSurfaceCapabilitiesKHR* vkObj = (VkSurfaceCapabilitiesKHR*)(ptr);
		  return (jint) (vkObj->supportedCompositeAlpha);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkSurfaceCapabilitiesKHR_getSupportedCompositeAlpha0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkSurfaceCapabilitiesKHR_getSupportedCompositeAlpha0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkSurfaceCapabilitiesKHR_setSupportedUsageFlags0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _supportedUsageFlags) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:633

		  VkSurfaceCapabilitiesKHR* vkObj = (VkSurfaceCapabilitiesKHR*)(ptr);
		 // code for simple past value 
		  vkObj->supportedUsageFlags = (VkImageUsageFlags) (_supportedUsageFlags);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkSurfaceCapabilitiesKHR_getSupportedUsageFlags0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:643

		  VkSurfaceCapabilitiesKHR* vkObj = (VkSurfaceCapabilitiesKHR*)(ptr);
		  return (jint) (vkObj->supportedUsageFlags);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkSurfaceCapabilitiesKHR_getSupportedUsageFlags0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkSurfaceCapabilitiesKHR_getSupportedUsageFlags0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

