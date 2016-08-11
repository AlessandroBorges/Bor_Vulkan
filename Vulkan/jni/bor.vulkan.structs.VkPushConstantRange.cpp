#include <bor.vulkan.structs.VkPushConstantRange.h>

//@line:40

    #include <BorVulkan.hpp>
    JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPushConstantRange_setStageFlags0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _stageFlags) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:211

		  VkPushConstantRange* vkObj = (VkPushConstantRange*)(ptr);
		 // code for simple past value 
		  vkObj->stageFlags = (VkShaderStageFlags) (_stageFlags);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkPushConstantRange_getStageFlags0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:221

		  VkPushConstantRange* vkObj = (VkPushConstantRange*)(ptr);
		  return (jint) (vkObj->stageFlags);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkPushConstantRange_getStageFlags0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPushConstantRange_getStageFlags0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPushConstantRange_setOffset0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _offset) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:230

		  VkPushConstantRange* vkObj = (VkPushConstantRange*)(ptr);
		 // code for simple past value 
		  vkObj->offset = (uint32_t) (_offset);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkPushConstantRange_getOffset0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:240

		  VkPushConstantRange* vkObj = (VkPushConstantRange*)(ptr);
		  return (jint) (vkObj->offset);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkPushConstantRange_getOffset0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPushConstantRange_getOffset0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPushConstantRange_setSize0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _size) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:249

		  VkPushConstantRange* vkObj = (VkPushConstantRange*)(ptr);
		 // code for simple past value 
		  vkObj->size = (uint32_t) (_size);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkPushConstantRange_getSize0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:259

		  VkPushConstantRange* vkObj = (VkPushConstantRange*)(ptr);
		  return (jint) (vkObj->size);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkPushConstantRange_getSize0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPushConstantRange_getSize0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

