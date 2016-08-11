#include <bor.vulkan.structs.VkDescriptorImageInfo.h>

//@line:40

    #include <BorVulkan.hpp>
    JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDescriptorImageInfo_setSampler0(JNIEnv* env, jclass clazz, jobject obj_ptr, jlong _sampler) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:234

		  VkDescriptorImageInfo* vkObj = (VkDescriptorImageInfo*)(ptr);
		 // code for simple past value 
		  vkObj->sampler = (VkSampler) (_sampler);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkDescriptorImageInfo_getSampler0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:244

		  VkDescriptorImageInfo* vkObj = (VkDescriptorImageInfo*)(ptr);
		  // generic get for struct field of type  VkHandle or VkStruct 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->sampler);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkDescriptorImageInfo_getSampler0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDescriptorImageInfo_getSampler0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDescriptorImageInfo_setImageView0(JNIEnv* env, jclass clazz, jobject obj_ptr, jlong _imageView) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:254

		  VkDescriptorImageInfo* vkObj = (VkDescriptorImageInfo*)(ptr);
		 // code for simple past value 
		  vkObj->imageView = (VkImageView) (_imageView);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkDescriptorImageInfo_getImageView0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:264

		  VkDescriptorImageInfo* vkObj = (VkDescriptorImageInfo*)(ptr);
		  // generic get for struct field of type  VkHandle or VkStruct 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->imageView);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkDescriptorImageInfo_getImageView0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDescriptorImageInfo_getImageView0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDescriptorImageInfo_setImageLayout0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _imageLayout) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:274

		  VkDescriptorImageInfo* vkObj = (VkDescriptorImageInfo*)(ptr);
		 // code for simple past value 
		  vkObj->imageLayout = (VkImageLayout) (_imageLayout);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkDescriptorImageInfo_getImageLayout0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:284

		  VkDescriptorImageInfo* vkObj = (VkDescriptorImageInfo*)(ptr);
		  return (VkImageLayout) (vkObj->imageLayout);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkDescriptorImageInfo_getImageLayout0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDescriptorImageInfo_getImageLayout0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

