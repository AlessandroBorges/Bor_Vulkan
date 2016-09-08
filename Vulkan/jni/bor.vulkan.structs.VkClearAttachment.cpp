#include <bor.vulkan.structs.VkClearAttachment.h>

//@line:40

    #include <BorVulkan.hpp>
    JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkClearAttachment_setAspectMask0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _aspectMask) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:232

		  VkClearAttachment* vkObj = (VkClearAttachment*)(ptr);
		 // code for simple past value 
		  vkObj->aspectMask = (VkImageAspectFlags) (_aspectMask);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkClearAttachment_getAspectMask0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:242

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


//@line:251

		  VkClearAttachment* vkObj = (VkClearAttachment*)(ptr);
		 // code for simple past value 
		  vkObj->colorAttachment = (uint32_t) (_colorAttachment);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkClearAttachment_getColorAttachment0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:261

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


//@line:270

		  VkClearAttachment* vkObj = (VkClearAttachment*)(ptr);
		 // code for Buffer - ptr to struct 
		 VkClearValue* p_clearValue = (VkClearValue*) _clearValue; 
		 vkObj->clearValue = (*p_clearValue); 
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkClearAttachment_getClearValue0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:281

		  VkClearAttachment* vkObj = (VkClearAttachment*)(ptr);
		  // generic get for Buffer - field must be pointer! 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->clearValue);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkClearAttachment_getClearValue0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkClearAttachment_getClearValue0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

