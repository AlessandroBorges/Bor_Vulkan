#include <bor.vulkan.structs.VkImageSubresourceLayers.h>

//@line:41

    #include <BorVulkan.hpp>
    JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkImageSubresourceLayers_setAspectMask0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _aspectMask) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:242

		  VkImageSubresourceLayers* vkObj = (VkImageSubresourceLayers*)(ptr);
		 // code for simple past value 
		  vkObj->aspectMask = (VkImageAspectFlags) (_aspectMask);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkImageSubresourceLayers_getAspectMask0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:252

		  VkImageSubresourceLayers* vkObj = (VkImageSubresourceLayers*)(ptr);
		  return (jint) (vkObj->aspectMask);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkImageSubresourceLayers_getAspectMask0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkImageSubresourceLayers_getAspectMask0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkImageSubresourceLayers_setMipLevel0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _mipLevel) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:261

		  VkImageSubresourceLayers* vkObj = (VkImageSubresourceLayers*)(ptr);
		 // code for simple past value 
		  vkObj->mipLevel = (uint32_t) (_mipLevel);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkImageSubresourceLayers_getMipLevel0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:271

		  VkImageSubresourceLayers* vkObj = (VkImageSubresourceLayers*)(ptr);
		  return (jint) (vkObj->mipLevel);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkImageSubresourceLayers_getMipLevel0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkImageSubresourceLayers_getMipLevel0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkImageSubresourceLayers_setBaseArrayLayer0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _baseArrayLayer) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:280

		  VkImageSubresourceLayers* vkObj = (VkImageSubresourceLayers*)(ptr);
		 // code for simple past value 
		  vkObj->baseArrayLayer = (uint32_t) (_baseArrayLayer);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkImageSubresourceLayers_getBaseArrayLayer0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:290

		  VkImageSubresourceLayers* vkObj = (VkImageSubresourceLayers*)(ptr);
		  return (jint) (vkObj->baseArrayLayer);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkImageSubresourceLayers_getBaseArrayLayer0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkImageSubresourceLayers_getBaseArrayLayer0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkImageSubresourceLayers_setLayerCount0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _layerCount) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:299

		  VkImageSubresourceLayers* vkObj = (VkImageSubresourceLayers*)(ptr);
		 // code for simple past value 
		  vkObj->layerCount = (uint32_t) (_layerCount);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkImageSubresourceLayers_getLayerCount0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:309

		  VkImageSubresourceLayers* vkObj = (VkImageSubresourceLayers*)(ptr);
		  return (jint) (vkObj->layerCount);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkImageSubresourceLayers_getLayerCount0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkImageSubresourceLayers_getLayerCount0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

