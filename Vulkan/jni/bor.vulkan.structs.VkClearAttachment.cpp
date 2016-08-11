#include <bor.vulkan.structs.VkClearAttachment.h>

//@line:40

    #include <BorVulkan.hpp>
    JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkClearAttachment_setAspectMask0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _aspectMask) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:221

		  VkClearAttachment* vkObj = (VkClearAttachment*)(ptr);
		 // code for simple past value 
		  vkObj->aspectMask = (VkImageAspectFlags) (_aspectMask);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkClearAttachment_getAspectMask0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:231

		  VkClearAttachment* vkObj = (VkClearAttachment*)(ptr);
		  return (jint) (vkObj->aspectMask);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkClearAttachment_getAspectMask0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkClearAttachment_getAspectMask0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkClearAttachment_setColorAttachment0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _colorAttachment) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:240

		  VkClearAttachment* vkObj = (VkClearAttachment*)(ptr);
		 // code for simple past value 
		  vkObj->colorAttachment = (uint32_t) (_colorAttachment);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkClearAttachment_getColorAttachment0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:250

		  VkClearAttachment* vkObj = (VkClearAttachment*)(ptr);
		  return (jint) (vkObj->colorAttachment);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkClearAttachment_getColorAttachment0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkClearAttachment_getColorAttachment0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkClearAttachment_setClearValue0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__clearValue) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _clearValue = (char*)(obj__clearValue?env->GetDirectBufferAddress(obj__clearValue) : NULL);


//@line:259

		  VkClearAttachment* vkObj = (VkClearAttachment*)(ptr);
		 // code for Buffer - referenced by ptr
		  vkObj->clearValue = (VkClearValue) (_clearValue);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkClearAttachment_getClearValue0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:269

		  VkClearAttachment* vkObj = (VkClearAttachment*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->clearValue);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkClearAttachment_getClearValue0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkClearAttachment_getClearValue0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}
