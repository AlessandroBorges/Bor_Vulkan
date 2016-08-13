#include <bor.vulkan.structs.VkAttachmentReference.h>

//@line:39

    #include <BorVulkan.hpp>
    JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkAttachmentReference_setAttachment0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _attachment) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:181

		  VkAttachmentReference* vkObj = (VkAttachmentReference*)(ptr);
		 // code for simple past value 
		  vkObj->attachment = (uint32_t) (_attachment);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkAttachmentReference_getAttachment0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:191

		  VkAttachmentReference* vkObj = (VkAttachmentReference*)(ptr);
		  return (jint) (vkObj->attachment);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkAttachmentReference_getAttachment0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkAttachmentReference_getAttachment0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkAttachmentReference_setLayout0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _layout) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:200

		  VkAttachmentReference* vkObj = (VkAttachmentReference*)(ptr);
		 // code for simple past value 
		  vkObj->layout = (VkImageLayout) (_layout);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkAttachmentReference_getLayout0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:210

		  VkAttachmentReference* vkObj = (VkAttachmentReference*)(ptr);
		  // generic get for Vk enums
		  return (jint) (vkObj->layout);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkAttachmentReference_getLayout0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkAttachmentReference_getLayout0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

