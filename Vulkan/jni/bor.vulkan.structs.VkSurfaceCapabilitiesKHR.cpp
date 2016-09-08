#include <bor.vulkan.structs.VkSurfaceCapabilitiesKHR.h>

//@line:47

    #include <BorVulkan.hpp>
    JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkSurfaceCapabilitiesKHR_setMinImageCount0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _minImageCount) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:470

		  VkSurfaceCapabilitiesKHR* vkObj = (VkSurfaceCapabilitiesKHR*)(ptr);
		 // code for simple past value 
		  vkObj->minImageCount = (uint32_t) (_minImageCount);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkSurfaceCapabilitiesKHR_getMinImageCount0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:480

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


//@line:489

		  VkSurfaceCapabilitiesKHR* vkObj = (VkSurfaceCapabilitiesKHR*)(ptr);
		 // code for simple past value 
		  vkObj->maxImageCount = (uint32_t) (_maxImageCount);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkSurfaceCapabilitiesKHR_getMaxImageCount0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:499

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


//@line:508

		  VkSurfaceCapabilitiesKHR* vkObj = (VkSurfaceCapabilitiesKHR*)(ptr);
		 // code for Buffer - ptr to struct 
		 VkExtent2D* p_currentExtent = (VkExtent2D*) _currentExtent; 
		 vkObj->currentExtent = (*p_currentExtent); 
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkSurfaceCapabilitiesKHR_getCurrentExtent0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:519

		  VkSurfaceCapabilitiesKHR* vkObj = (VkSurfaceCapabilitiesKHR*)(ptr);
		  // generic get for Buffer - field must be pointer! 
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


//@line:529

		  VkSurfaceCapabilitiesKHR* vkObj = (VkSurfaceCapabilitiesKHR*)(ptr);
		 // code for Buffer - ptr to struct 
		 VkExtent2D* p_minImageExtent = (VkExtent2D*) _minImageExtent; 
		 vkObj->minImageExtent = (*p_minImageExtent); 
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkSurfaceCapabilitiesKHR_getMinImageExtent0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:540

		  VkSurfaceCapabilitiesKHR* vkObj = (VkSurfaceCapabilitiesKHR*)(ptr);
		  // generic get for Buffer - field must be pointer! 
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


//@line:550

		  VkSurfaceCapabilitiesKHR* vkObj = (VkSurfaceCapabilitiesKHR*)(ptr);
		 // code for Buffer - ptr to struct 
		 VkExtent2D* p_maxImageExtent = (VkExtent2D*) _maxImageExtent; 
		 vkObj->maxImageExtent = (*p_maxImageExtent); 
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkSurfaceCapabilitiesKHR_getMaxImageExtent0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:561

		  VkSurfaceCapabilitiesKHR* vkObj = (VkSurfaceCapabilitiesKHR*)(ptr);
		  // generic get for Buffer - field must be pointer! 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->maxImageExtent);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkSurfaceCapabilitiesKHR_getMaxImageExtent0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkSurfaceCapabilitiesKHR_getMaxImageExtent0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkSurfaceCapabilitiesKHR_setMaxImageArrayLayers0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _maxImageArrayLayers) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:571

		  VkSurfaceCapabilitiesKHR* vkObj = (VkSurfaceCapabilitiesKHR*)(ptr);
		 // code for simple past value 
		  vkObj->maxImageArrayLayers = (uint32_t) (_maxImageArrayLayers);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkSurfaceCapabilitiesKHR_getMaxImageArrayLayers0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:581

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


//@line:590

		  VkSurfaceCapabilitiesKHR* vkObj = (VkSurfaceCapabilitiesKHR*)(ptr);
		 // code for simple past value 
		  vkObj->supportedTransforms = (VkSurfaceTransformFlagsKHR) (_supportedTransforms);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkSurfaceCapabilitiesKHR_getSupportedTransforms0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:600

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


//@line:609

		  VkSurfaceCapabilitiesKHR* vkObj = (VkSurfaceCapabilitiesKHR*)(ptr);
		 // code for simple past value 
		  vkObj->currentTransform = (VkSurfaceTransformFlagBitsKHR) (_currentTransform);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkSurfaceCapabilitiesKHR_getCurrentTransform0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:619

		  VkSurfaceCapabilitiesKHR* vkObj = (VkSurfaceCapabilitiesKHR*)(ptr);
		  // generic get for Vk enums
		  return (jint) (vkObj->currentTransform);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkSurfaceCapabilitiesKHR_getCurrentTransform0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkSurfaceCapabilitiesKHR_getCurrentTransform0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkSurfaceCapabilitiesKHR_setSupportedCompositeAlpha0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _supportedCompositeAlpha) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:629

		  VkSurfaceCapabilitiesKHR* vkObj = (VkSurfaceCapabilitiesKHR*)(ptr);
		 // code for simple past value 
		  vkObj->supportedCompositeAlpha = (VkCompositeAlphaFlagsKHR) (_supportedCompositeAlpha);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkSurfaceCapabilitiesKHR_getSupportedCompositeAlpha0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:639

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


//@line:648

		  VkSurfaceCapabilitiesKHR* vkObj = (VkSurfaceCapabilitiesKHR*)(ptr);
		 // code for simple past value 
		  vkObj->supportedUsageFlags = (VkImageUsageFlags) (_supportedUsageFlags);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkSurfaceCapabilitiesKHR_getSupportedUsageFlags0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:658

		  VkSurfaceCapabilitiesKHR* vkObj = (VkSurfaceCapabilitiesKHR*)(ptr);
		  return (jint) (vkObj->supportedUsageFlags);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkSurfaceCapabilitiesKHR_getSupportedUsageFlags0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkSurfaceCapabilitiesKHR_getSupportedUsageFlags0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

