#include <bor.vulkan.structs.VkDescriptorSetLayoutBinding.h>

//@line:42

    #include <BorVulkan.hpp>
    JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDescriptorSetLayoutBinding_setBinding0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _binding) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:295

		  VkDescriptorSetLayoutBinding* vkObj = (VkDescriptorSetLayoutBinding*)(ptr);
		 // code for simple past value 
		  vkObj->binding = (uint32_t) (_binding);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkDescriptorSetLayoutBinding_getBinding0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:305

		  VkDescriptorSetLayoutBinding* vkObj = (VkDescriptorSetLayoutBinding*)(ptr);
		  return (jint) (vkObj->binding);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkDescriptorSetLayoutBinding_getBinding0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDescriptorSetLayoutBinding_getBinding0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDescriptorSetLayoutBinding_setDescriptorType0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _descriptorType) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:314

		  VkDescriptorSetLayoutBinding* vkObj = (VkDescriptorSetLayoutBinding*)(ptr);
		 // code for simple past value 
		  vkObj->descriptorType = (VkDescriptorType) (_descriptorType);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkDescriptorSetLayoutBinding_getDescriptorType0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:324

		  VkDescriptorSetLayoutBinding* vkObj = (VkDescriptorSetLayoutBinding*)(ptr);
		  // generic get for Vk enums
		  return (jint) (vkObj->descriptorType);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkDescriptorSetLayoutBinding_getDescriptorType0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDescriptorSetLayoutBinding_getDescriptorType0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDescriptorSetLayoutBinding_setDescriptorCount0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _descriptorCount) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:334

		  VkDescriptorSetLayoutBinding* vkObj = (VkDescriptorSetLayoutBinding*)(ptr);
		 // code for simple past value 
		  vkObj->descriptorCount = (uint32_t) (_descriptorCount);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkDescriptorSetLayoutBinding_getDescriptorCount0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:344

		  VkDescriptorSetLayoutBinding* vkObj = (VkDescriptorSetLayoutBinding*)(ptr);
		  return (jint) (vkObj->descriptorCount);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkDescriptorSetLayoutBinding_getDescriptorCount0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDescriptorSetLayoutBinding_getDescriptorCount0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDescriptorSetLayoutBinding_setStageFlags0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _stageFlags) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:353

		  VkDescriptorSetLayoutBinding* vkObj = (VkDescriptorSetLayoutBinding*)(ptr);
		 // code for simple past value 
		  vkObj->stageFlags = (VkShaderStageFlags) (_stageFlags);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkDescriptorSetLayoutBinding_getStageFlags0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:363

		  VkDescriptorSetLayoutBinding* vkObj = (VkDescriptorSetLayoutBinding*)(ptr);
		  return (jint) (vkObj->stageFlags);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkDescriptorSetLayoutBinding_getStageFlags0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDescriptorSetLayoutBinding_getStageFlags0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDescriptorSetLayoutBinding_setPImmutableSamplers0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__pImmutableSamplers) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _pImmutableSamplers = (char*)(obj__pImmutableSamplers?env->GetDirectBufferAddress(obj__pImmutableSamplers) : NULL);


//@line:372

		  VkDescriptorSetLayoutBinding* vkObj = (VkDescriptorSetLayoutBinding*)(ptr);
		 // code for Buffer - ptr to ptr 
		 const VkSampler* p_pImmutableSamplers = ( VkSampler*) _pImmutableSamplers; 
		 vkObj->pImmutableSamplers = p_pImmutableSamplers; 
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkDescriptorSetLayoutBinding_getPImmutableSamplers0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:383

		  VkDescriptorSetLayoutBinding* vkObj = (VkDescriptorSetLayoutBinding*)(ptr);
		  // generic get for array of VkHandle and VkStruct 
		  return (jlong) reinterpret_cast<jlong>( &vkObj->pImmutableSamplers );
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkDescriptorSetLayoutBinding_getPImmutableSamplers0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDescriptorSetLayoutBinding_getPImmutableSamplers0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

