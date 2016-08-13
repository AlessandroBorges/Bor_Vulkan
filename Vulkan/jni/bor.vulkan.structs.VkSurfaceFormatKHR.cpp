#include <bor.vulkan.structs.VkSurfaceFormatKHR.h>

//@line:39

    #include <BorVulkan.hpp>
    JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkSurfaceFormatKHR_setFormat0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _format) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:182

		  VkSurfaceFormatKHR* vkObj = (VkSurfaceFormatKHR*)(ptr);
		 // code for simple past value 
		  vkObj->format = (VkFormat) (_format);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkSurfaceFormatKHR_getFormat0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:192

		  VkSurfaceFormatKHR* vkObj = (VkSurfaceFormatKHR*)(ptr);
		  // generic get for Vk enums
		  return (jint) (vkObj->format);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkSurfaceFormatKHR_getFormat0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkSurfaceFormatKHR_getFormat0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkSurfaceFormatKHR_setColorSpace0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _colorSpace) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:202

		  VkSurfaceFormatKHR* vkObj = (VkSurfaceFormatKHR*)(ptr);
		 // code for simple past value 
		  vkObj->colorSpace = (VkColorSpaceKHR) (_colorSpace);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkSurfaceFormatKHR_getColorSpace0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:212

		  VkSurfaceFormatKHR* vkObj = (VkSurfaceFormatKHR*)(ptr);
		  // generic get for Vk enums
		  return (jint) (vkObj->colorSpace);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkSurfaceFormatKHR_getColorSpace0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkSurfaceFormatKHR_getColorSpace0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

