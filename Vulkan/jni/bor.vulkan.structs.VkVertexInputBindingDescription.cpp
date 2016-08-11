#include <bor.vulkan.structs.VkVertexInputBindingDescription.h>

//@line:40

    #include <BorVulkan.hpp>
    JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkVertexInputBindingDescription_setBinding0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _binding) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:212

		  VkVertexInputBindingDescription* vkObj = (VkVertexInputBindingDescription*)(ptr);
		 // code for simple past value 
		  vkObj->binding = (uint32_t) (_binding);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkVertexInputBindingDescription_getBinding0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:222

		  VkVertexInputBindingDescription* vkObj = (VkVertexInputBindingDescription*)(ptr);
		  return (jint) (vkObj->binding);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkVertexInputBindingDescription_getBinding0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkVertexInputBindingDescription_getBinding0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkVertexInputBindingDescription_setStride0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _stride) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:231

		  VkVertexInputBindingDescription* vkObj = (VkVertexInputBindingDescription*)(ptr);
		 // code for simple past value 
		  vkObj->stride = (uint32_t) (_stride);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkVertexInputBindingDescription_getStride0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:241

		  VkVertexInputBindingDescription* vkObj = (VkVertexInputBindingDescription*)(ptr);
		  return (jint) (vkObj->stride);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkVertexInputBindingDescription_getStride0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkVertexInputBindingDescription_getStride0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkVertexInputBindingDescription_setInputRate0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _inputRate) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:250

		  VkVertexInputBindingDescription* vkObj = (VkVertexInputBindingDescription*)(ptr);
		 // code for simple past value 
		  vkObj->inputRate = (VkVertexInputRate) (_inputRate);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkVertexInputBindingDescription_getInputRate0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:260

		  VkVertexInputBindingDescription* vkObj = (VkVertexInputBindingDescription*)(ptr);
		  return (VkVertexInputRate) (vkObj->inputRate);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkVertexInputBindingDescription_getInputRate0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkVertexInputBindingDescription_getInputRate0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

