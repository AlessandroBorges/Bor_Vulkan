#include <bor.vulkan.structs.VkMemoryRequirements.h>

//@line:40

    #include <BorVulkan.hpp>
    JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkMemoryRequirements_setSize0(JNIEnv* env, jclass clazz, jobject obj_ptr, jlong _size) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:211

		  VkMemoryRequirements* vkObj = (VkMemoryRequirements*)(ptr);
		 // code for simple past value 
		  vkObj->size = (VkDeviceSize) (_size);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkMemoryRequirements_getSize0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:221

		  VkMemoryRequirements* vkObj = (VkMemoryRequirements*)(ptr);
		  return (jlong) (vkObj->size);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkMemoryRequirements_getSize0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkMemoryRequirements_getSize0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkMemoryRequirements_setAlignment0(JNIEnv* env, jclass clazz, jobject obj_ptr, jlong _alignment) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:230

		  VkMemoryRequirements* vkObj = (VkMemoryRequirements*)(ptr);
		 // code for simple past value 
		  vkObj->alignment = (VkDeviceSize) (_alignment);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkMemoryRequirements_getAlignment0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:240

		  VkMemoryRequirements* vkObj = (VkMemoryRequirements*)(ptr);
		  return (jlong) (vkObj->alignment);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkMemoryRequirements_getAlignment0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkMemoryRequirements_getAlignment0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkMemoryRequirements_setMemoryTypeBits0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _memoryTypeBits) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:249

		  VkMemoryRequirements* vkObj = (VkMemoryRequirements*)(ptr);
		 // code for simple past value 
		  vkObj->memoryTypeBits = (uint32_t) (_memoryTypeBits);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkMemoryRequirements_getMemoryTypeBits0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:259

		  VkMemoryRequirements* vkObj = (VkMemoryRequirements*)(ptr);
		  return (jint) (vkObj->memoryTypeBits);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkMemoryRequirements_getMemoryTypeBits0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkMemoryRequirements_getMemoryTypeBits0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

