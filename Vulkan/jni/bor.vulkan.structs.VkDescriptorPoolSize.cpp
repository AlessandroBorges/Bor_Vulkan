#include <bor.vulkan.structs.VkDescriptorPoolSize.h>

//@line:39

    #include <BorVulkan.hpp>
    JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDescriptorPoolSize_setType0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _type) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:181

		  VkDescriptorPoolSize* vkObj = (VkDescriptorPoolSize*)(ptr);
		 // code for simple past value 
		  vkObj->type = (VkDescriptorType) (_type);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkDescriptorPoolSize_getType0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:191

		  VkDescriptorPoolSize* vkObj = (VkDescriptorPoolSize*)(ptr);
		  // generic get for Vk enums
		  return (jint) (vkObj->type);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkDescriptorPoolSize_getType0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDescriptorPoolSize_getType0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDescriptorPoolSize_setDescriptorCount0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _descriptorCount) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:201

		  VkDescriptorPoolSize* vkObj = (VkDescriptorPoolSize*)(ptr);
		 // code for simple past value 
		  vkObj->descriptorCount = (uint32_t) (_descriptorCount);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkDescriptorPoolSize_getDescriptorCount0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:211

		  VkDescriptorPoolSize* vkObj = (VkDescriptorPoolSize*)(ptr);
		  return (jint) (vkObj->descriptorCount);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkDescriptorPoolSize_getDescriptorCount0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDescriptorPoolSize_getDescriptorCount0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

