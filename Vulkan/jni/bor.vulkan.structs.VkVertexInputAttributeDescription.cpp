#include <bor.vulkan.structs.VkVertexInputAttributeDescription.h>

//@line:41

    #include <BorVulkan.hpp>
    JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkVertexInputAttributeDescription_setLocation0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _location) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:243

		  VkVertexInputAttributeDescription* vkObj = (VkVertexInputAttributeDescription*)(ptr);
		 // code for simple past value 
		  vkObj->location = (uint32_t) (_location);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkVertexInputAttributeDescription_getLocation0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:253

		  VkVertexInputAttributeDescription* vkObj = (VkVertexInputAttributeDescription*)(ptr);
		  return (jint) (vkObj->location);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkVertexInputAttributeDescription_getLocation0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkVertexInputAttributeDescription_getLocation0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkVertexInputAttributeDescription_setBinding0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _binding) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:262

		  VkVertexInputAttributeDescription* vkObj = (VkVertexInputAttributeDescription*)(ptr);
		 // code for simple past value 
		  vkObj->binding = (uint32_t) (_binding);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkVertexInputAttributeDescription_getBinding0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:272

		  VkVertexInputAttributeDescription* vkObj = (VkVertexInputAttributeDescription*)(ptr);
		  return (jint) (vkObj->binding);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkVertexInputAttributeDescription_getBinding0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkVertexInputAttributeDescription_getBinding0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkVertexInputAttributeDescription_setFormat0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _format) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:281

		  VkVertexInputAttributeDescription* vkObj = (VkVertexInputAttributeDescription*)(ptr);
		 // code for simple past value 
		  vkObj->format = (VkFormat) (_format);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkVertexInputAttributeDescription_getFormat0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:291

		  VkVertexInputAttributeDescription* vkObj = (VkVertexInputAttributeDescription*)(ptr);
		  // generic get for Vk enums
		  return (jint) (vkObj->format);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkVertexInputAttributeDescription_getFormat0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkVertexInputAttributeDescription_getFormat0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkVertexInputAttributeDescription_setOffset0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _offset) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:301

		  VkVertexInputAttributeDescription* vkObj = (VkVertexInputAttributeDescription*)(ptr);
		 // code for simple past value 
		  vkObj->offset = (uint32_t) (_offset);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkVertexInputAttributeDescription_getOffset0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:311

		  VkVertexInputAttributeDescription* vkObj = (VkVertexInputAttributeDescription*)(ptr);
		  return (jint) (vkObj->offset);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkVertexInputAttributeDescription_getOffset0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkVertexInputAttributeDescription_getOffset0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

