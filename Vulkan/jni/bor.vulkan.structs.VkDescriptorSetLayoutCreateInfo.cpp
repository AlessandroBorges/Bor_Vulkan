#include <bor.vulkan.structs.VkDescriptorSetLayoutCreateInfo.h>

//@line:42

    #include <BorVulkan.hpp>
    JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDescriptorSetLayoutCreateInfo_setSType0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _sType) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:304

		  VkDescriptorSetLayoutCreateInfo* vkObj = (VkDescriptorSetLayoutCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->sType = (VkStructureType) (_sType);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkDescriptorSetLayoutCreateInfo_getSType0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:314

		  VkDescriptorSetLayoutCreateInfo* vkObj = (VkDescriptorSetLayoutCreateInfo*)(ptr);
		  // generic get for Vk enums
		  return (jint) (vkObj->sType);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkDescriptorSetLayoutCreateInfo_getSType0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDescriptorSetLayoutCreateInfo_getSType0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDescriptorSetLayoutCreateInfo_setPNext0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__pNext) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _pNext = (char*)(obj__pNext?env->GetDirectBufferAddress(obj__pNext) : NULL);


//@line:324

		  VkDescriptorSetLayoutCreateInfo* vkObj = (VkDescriptorSetLayoutCreateInfo*)(ptr);
		 // code for Buffer - ptr to ptr 
		 const void* p_pNext = ( void*) _pNext; 
		 vkObj->pNext = p_pNext; 
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkDescriptorSetLayoutCreateInfo_getPNext0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:335

		  VkDescriptorSetLayoutCreateInfo* vkObj = (VkDescriptorSetLayoutCreateInfo*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->pNext);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkDescriptorSetLayoutCreateInfo_getPNext0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDescriptorSetLayoutCreateInfo_getPNext0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDescriptorSetLayoutCreateInfo_setFlags0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _flags) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:345

		  VkDescriptorSetLayoutCreateInfo* vkObj = (VkDescriptorSetLayoutCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->flags = (VkDescriptorSetLayoutCreateFlags) (_flags);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkDescriptorSetLayoutCreateInfo_getFlags0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:355

		  VkDescriptorSetLayoutCreateInfo* vkObj = (VkDescriptorSetLayoutCreateInfo*)(ptr);
		  return (jint) (vkObj->flags);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkDescriptorSetLayoutCreateInfo_getFlags0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDescriptorSetLayoutCreateInfo_getFlags0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDescriptorSetLayoutCreateInfo_setBindingCount0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _bindingCount) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:364

		  VkDescriptorSetLayoutCreateInfo* vkObj = (VkDescriptorSetLayoutCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->bindingCount = (uint32_t) (_bindingCount);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkDescriptorSetLayoutCreateInfo_getBindingCount0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:374

		  VkDescriptorSetLayoutCreateInfo* vkObj = (VkDescriptorSetLayoutCreateInfo*)(ptr);
		  return (jint) (vkObj->bindingCount);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkDescriptorSetLayoutCreateInfo_getBindingCount0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDescriptorSetLayoutCreateInfo_getBindingCount0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDescriptorSetLayoutCreateInfo_setPBindings0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__pBindings) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _pBindings = (char*)(obj__pBindings?env->GetDirectBufferAddress(obj__pBindings) : NULL);


//@line:383

		  VkDescriptorSetLayoutCreateInfo* vkObj = (VkDescriptorSetLayoutCreateInfo*)(ptr);
		 // code for Buffer - ptr to ptr 
		 const VkDescriptorSetLayoutBinding* p_pBindings = ( VkDescriptorSetLayoutBinding*) _pBindings; 
		 vkObj->pBindings = p_pBindings; 
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkDescriptorSetLayoutCreateInfo_getPBindings0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:394

		  VkDescriptorSetLayoutCreateInfo* vkObj = (VkDescriptorSetLayoutCreateInfo*)(ptr);
		  // generic get for array of VkHandle and VkStruct 
		  return (jlong) reinterpret_cast<jlong>( &vkObj->pBindings );
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkDescriptorSetLayoutCreateInfo_getPBindings0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDescriptorSetLayoutCreateInfo_getPBindings0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

