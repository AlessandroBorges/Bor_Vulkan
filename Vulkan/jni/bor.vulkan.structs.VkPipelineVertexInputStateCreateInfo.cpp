#include <bor.vulkan.structs.VkPipelineVertexInputStateCreateInfo.h>

//@line:44

    #include <BorVulkan.hpp>
    JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPipelineVertexInputStateCreateInfo_setSType0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _sType) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:384

		  VkPipelineVertexInputStateCreateInfo* vkObj = (VkPipelineVertexInputStateCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->sType = (VkStructureType) (_sType);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkPipelineVertexInputStateCreateInfo_getSType0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:394

		  VkPipelineVertexInputStateCreateInfo* vkObj = (VkPipelineVertexInputStateCreateInfo*)(ptr);
		  // generic get for Vk enums
		  return (jint) (vkObj->sType);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkPipelineVertexInputStateCreateInfo_getSType0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPipelineVertexInputStateCreateInfo_getSType0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPipelineVertexInputStateCreateInfo_setPNext0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__pNext) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _pNext = (char*)(obj__pNext?env->GetDirectBufferAddress(obj__pNext) : NULL);


//@line:404

		  VkPipelineVertexInputStateCreateInfo* vkObj = (VkPipelineVertexInputStateCreateInfo*)(ptr);
		 // code for Buffer - ptr to ptr 
		 const void* p_pNext = ( void*) _pNext; 
		 vkObj->pNext = p_pNext; 
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkPipelineVertexInputStateCreateInfo_getPNext0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:415

		  VkPipelineVertexInputStateCreateInfo* vkObj = (VkPipelineVertexInputStateCreateInfo*)(ptr);
		  // generic get for Buffer - field must be pointer! 
		  return (jlong) reinterpret_cast<jlong>(vkObj->pNext);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkPipelineVertexInputStateCreateInfo_getPNext0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPipelineVertexInputStateCreateInfo_getPNext0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPipelineVertexInputStateCreateInfo_setFlags0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _flags) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:425

		  VkPipelineVertexInputStateCreateInfo* vkObj = (VkPipelineVertexInputStateCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->flags = (VkPipelineVertexInputStateCreateFlags) (_flags);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkPipelineVertexInputStateCreateInfo_getFlags0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:435

		  VkPipelineVertexInputStateCreateInfo* vkObj = (VkPipelineVertexInputStateCreateInfo*)(ptr);
		  return (jint) (vkObj->flags);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkPipelineVertexInputStateCreateInfo_getFlags0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPipelineVertexInputStateCreateInfo_getFlags0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPipelineVertexInputStateCreateInfo_setVertexBindingDescriptionCount0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _vertexBindingDescriptionCount) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:444

		  VkPipelineVertexInputStateCreateInfo* vkObj = (VkPipelineVertexInputStateCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->vertexBindingDescriptionCount = (uint32_t) (_vertexBindingDescriptionCount);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkPipelineVertexInputStateCreateInfo_getVertexBindingDescriptionCount0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:454

		  VkPipelineVertexInputStateCreateInfo* vkObj = (VkPipelineVertexInputStateCreateInfo*)(ptr);
		  return (jint) (vkObj->vertexBindingDescriptionCount);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkPipelineVertexInputStateCreateInfo_getVertexBindingDescriptionCount0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPipelineVertexInputStateCreateInfo_getVertexBindingDescriptionCount0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPipelineVertexInputStateCreateInfo_setPVertexBindingDescriptions0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__pVertexBindingDescriptions) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _pVertexBindingDescriptions = (char*)(obj__pVertexBindingDescriptions?env->GetDirectBufferAddress(obj__pVertexBindingDescriptions) : NULL);


//@line:463

		  VkPipelineVertexInputStateCreateInfo* vkObj = (VkPipelineVertexInputStateCreateInfo*)(ptr);
		 // code for Buffer - ptr to ptr 
		 const VkVertexInputBindingDescription* p_pVertexBindingDescriptions = ( VkVertexInputBindingDescription*) _pVertexBindingDescriptions; 
		 vkObj->pVertexBindingDescriptions = p_pVertexBindingDescriptions; 
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkPipelineVertexInputStateCreateInfo_getPVertexBindingDescriptions0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:474

		  VkPipelineVertexInputStateCreateInfo* vkObj = (VkPipelineVertexInputStateCreateInfo*)(ptr);
		  // generic get for array of VkHandle and VkStruct 
		  return (jlong) reinterpret_cast<jlong>( vkObj->pVertexBindingDescriptions );
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkPipelineVertexInputStateCreateInfo_getPVertexBindingDescriptions0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPipelineVertexInputStateCreateInfo_getPVertexBindingDescriptions0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPipelineVertexInputStateCreateInfo_setVertexAttributeDescriptionCount0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _vertexAttributeDescriptionCount) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:484

		  VkPipelineVertexInputStateCreateInfo* vkObj = (VkPipelineVertexInputStateCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->vertexAttributeDescriptionCount = (uint32_t) (_vertexAttributeDescriptionCount);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkPipelineVertexInputStateCreateInfo_getVertexAttributeDescriptionCount0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:494

		  VkPipelineVertexInputStateCreateInfo* vkObj = (VkPipelineVertexInputStateCreateInfo*)(ptr);
		  return (jint) (vkObj->vertexAttributeDescriptionCount);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkPipelineVertexInputStateCreateInfo_getVertexAttributeDescriptionCount0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPipelineVertexInputStateCreateInfo_getVertexAttributeDescriptionCount0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPipelineVertexInputStateCreateInfo_setPVertexAttributeDescriptions0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__pVertexAttributeDescriptions) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _pVertexAttributeDescriptions = (char*)(obj__pVertexAttributeDescriptions?env->GetDirectBufferAddress(obj__pVertexAttributeDescriptions) : NULL);


//@line:503

		  VkPipelineVertexInputStateCreateInfo* vkObj = (VkPipelineVertexInputStateCreateInfo*)(ptr);
		 // code for Buffer - ptr to ptr 
		 const VkVertexInputAttributeDescription* p_pVertexAttributeDescriptions = ( VkVertexInputAttributeDescription*) _pVertexAttributeDescriptions; 
		 vkObj->pVertexAttributeDescriptions = p_pVertexAttributeDescriptions; 
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkPipelineVertexInputStateCreateInfo_getPVertexAttributeDescriptions0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:514

		  VkPipelineVertexInputStateCreateInfo* vkObj = (VkPipelineVertexInputStateCreateInfo*)(ptr);
		  // generic get for array of VkHandle and VkStruct 
		  return (jlong) reinterpret_cast<jlong>( vkObj->pVertexAttributeDescriptions );
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkPipelineVertexInputStateCreateInfo_getPVertexAttributeDescriptions0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPipelineVertexInputStateCreateInfo_getPVertexAttributeDescriptions0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

