#include <bor.vulkan.structs.VkImageSubresourceRange.h>

//@line:42

    #include <BorVulkan.hpp>
    JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkImageSubresourceRange_setAspectMask0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _aspectMask) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:284

		  VkImageSubresourceRange* vkObj = (VkImageSubresourceRange*)(ptr);
		 // code for simple past value 
		  vkObj->aspectMask = (VkImageAspectFlags) (_aspectMask);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkImageSubresourceRange_getAspectMask0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:294

		  VkImageSubresourceRange* vkObj = (VkImageSubresourceRange*)(ptr);
		  return (jint) (vkObj->aspectMask);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkImageSubresourceRange_getAspectMask0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkImageSubresourceRange_getAspectMask0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkImageSubresourceRange_setBaseMipLevel0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _baseMipLevel) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:303

		  VkImageSubresourceRange* vkObj = (VkImageSubresourceRange*)(ptr);
		 // code for simple past value 
		  vkObj->baseMipLevel = (uint32_t) (_baseMipLevel);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkImageSubresourceRange_getBaseMipLevel0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:313

		  VkImageSubresourceRange* vkObj = (VkImageSubresourceRange*)(ptr);
		  return (jint) (vkObj->baseMipLevel);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkImageSubresourceRange_getBaseMipLevel0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkImageSubresourceRange_getBaseMipLevel0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkImageSubresourceRange_setLevelCount0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _levelCount) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:322

		  VkImageSubresourceRange* vkObj = (VkImageSubresourceRange*)(ptr);
		 // code for simple past value 
		  vkObj->levelCount = (uint32_t) (_levelCount);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkImageSubresourceRange_getLevelCount0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:332

		  VkImageSubresourceRange* vkObj = (VkImageSubresourceRange*)(ptr);
		  return (jint) (vkObj->levelCount);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkImageSubresourceRange_getLevelCount0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkImageSubresourceRange_getLevelCount0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkImageSubresourceRange_setBaseArrayLayer0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _baseArrayLayer) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:341

		  VkImageSubresourceRange* vkObj = (VkImageSubresourceRange*)(ptr);
		 // code for simple past value 
		  vkObj->baseArrayLayer = (uint32_t) (_baseArrayLayer);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkImageSubresourceRange_getBaseArrayLayer0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:351

		  VkImageSubresourceRange* vkObj = (VkImageSubresourceRange*)(ptr);
		  return (jint) (vkObj->baseArrayLayer);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkImageSubresourceRange_getBaseArrayLayer0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkImageSubresourceRange_getBaseArrayLayer0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkImageSubresourceRange_setLayerCount0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _layerCount) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:360

		  VkImageSubresourceRange* vkObj = (VkImageSubresourceRange*)(ptr);
		 // code for simple past value 
		  vkObj->layerCount = (uint32_t) (_layerCount);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkImageSubresourceRange_getLayerCount0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:370

		  VkImageSubresourceRange* vkObj = (VkImageSubresourceRange*)(ptr);
		  return (jint) (vkObj->layerCount);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkImageSubresourceRange_getLayerCount0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkImageSubresourceRange_getLayerCount0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

