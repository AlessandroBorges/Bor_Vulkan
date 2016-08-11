#include <bor.vulkan.structs.VkImageSubresource.h>

//@line:40

    #include <BorVulkan.hpp>
    JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkImageSubresource_setAspectMask0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _aspectMask) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:211

		  VkImageSubresource* vkObj = (VkImageSubresource*)(ptr);
		 // code for simple past value 
		  vkObj->aspectMask = (VkImageAspectFlags) (_aspectMask);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkImageSubresource_getAspectMask0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:221

		  VkImageSubresource* vkObj = (VkImageSubresource*)(ptr);
		  return (jint) (vkObj->aspectMask);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkImageSubresource_getAspectMask0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkImageSubresource_getAspectMask0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkImageSubresource_setMipLevel0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _mipLevel) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:230

		  VkImageSubresource* vkObj = (VkImageSubresource*)(ptr);
		 // code for simple past value 
		  vkObj->mipLevel = (uint32_t) (_mipLevel);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkImageSubresource_getMipLevel0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:240

		  VkImageSubresource* vkObj = (VkImageSubresource*)(ptr);
		  return (jint) (vkObj->mipLevel);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkImageSubresource_getMipLevel0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkImageSubresource_getMipLevel0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkImageSubresource_setArrayLayer0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _arrayLayer) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:249

		  VkImageSubresource* vkObj = (VkImageSubresource*)(ptr);
		 // code for simple past value 
		  vkObj->arrayLayer = (uint32_t) (_arrayLayer);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkImageSubresource_getArrayLayer0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:259

		  VkImageSubresource* vkObj = (VkImageSubresource*)(ptr);
		  return (jint) (vkObj->arrayLayer);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkImageSubresource_getArrayLayer0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkImageSubresource_getArrayLayer0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

