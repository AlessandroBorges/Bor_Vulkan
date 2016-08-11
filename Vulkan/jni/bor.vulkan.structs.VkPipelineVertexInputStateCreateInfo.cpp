#include <bor.vulkan.structs.VkPipelineVertexInputStateCreateInfo.h>

//@line:44

    #include <BorVulkan.hpp>
    JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPipelineVertexInputStateCreateInfo_setSType0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _sType) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:365

		  VkPipelineVertexInputStateCreateInfo* vkObj = (VkPipelineVertexInputStateCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->sType = (VkStructureType) (_sType);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkPipelineVertexInputStateCreateInfo_getSType0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:375

		  VkPipelineVertexInputStateCreateInfo* vkObj = (VkPipelineVertexInputStateCreateInfo*)(ptr);
		  return (VkStructureType) (vkObj->sType);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkPipelineVertexInputStateCreateInfo_getSType0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPipelineVertexInputStateCreateInfo_getSType0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPipelineVertexInputStateCreateInfo_setPNext0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__pNext) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _pNext = (char*)(obj__pNext?env->GetDirectBufferAddress(obj__pNext) : NULL);


//@line:384

		  VkPipelineVertexInputStateCreateInfo* vkObj = (VkPipelineVertexInputStateCreateInfo*)(ptr);
		 // code for Buffer - referenced by ptr
		  vkObj->pNext = (const void*) (_pNext);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkPipelineVertexInputStateCreateInfo_getPNext0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:394

		  VkPipelineVertexInputStateCreateInfo* vkObj = (VkPipelineVertexInputStateCreateInfo*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->pNext);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkPipelineVertexInputStateCreateInfo_getPNext0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPipelineVertexInputStateCreateInfo_getPNext0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPipelineVertexInputStateCreateInfo_setFlags0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _flags) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:404

		  VkPipelineVertexInputStateCreateInfo* vkObj = (VkPipelineVertexInputStateCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->flags = (VkPipelineVertexInputStateCreateFlags) (_flags);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkPipelineVertexInputStateCreateInfo_getFlags0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:414

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


//@line:423

		  VkPipelineVertexInputStateCreateInfo* vkObj = (VkPipelineVertexInputStateCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->vertexBindingDescriptionCount = (uint32_t) (_vertexBindingDescriptionCount);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkPipelineVertexInputStateCreateInfo_getVertexBindingDescriptionCount0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:433

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


//@line:442

		  VkPipelineVertexInputStateCreateInfo* vkObj = (VkPipelineVertexInputStateCreateInfo*)(ptr);
		 // code for Buffer - referenced by ptr
		  vkObj->pVertexBindingDescriptions = (const VkVertexInputBindingDescription*) (_pVertexBindingDescriptions);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkPipelineVertexInputStateCreateInfo_getPVertexBindingDescriptions0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:452

		  VkPipelineVertexInputStateCreateInfo* vkObj = (VkPipelineVertexInputStateCreateInfo*)(ptr);
		  // generic get for array of VkHandle and VkStruct 
		  return (jlong) reinterpret_cast<jlong>( &vkObj->pVertexBindingDescriptions );
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkPipelineVertexInputStateCreateInfo_getPVertexBindingDescriptions0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPipelineVertexInputStateCreateInfo_getPVertexBindingDescriptions0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPipelineVertexInputStateCreateInfo_setVertexAttributeDescriptionCount0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _vertexAttributeDescriptionCount) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:462

		  VkPipelineVertexInputStateCreateInfo* vkObj = (VkPipelineVertexInputStateCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->vertexAttributeDescriptionCount = (uint32_t) (_vertexAttributeDescriptionCount);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkPipelineVertexInputStateCreateInfo_getVertexAttributeDescriptionCount0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:472

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


//@line:481

		  VkPipelineVertexInputStateCreateInfo* vkObj = (VkPipelineVertexInputStateCreateInfo*)(ptr);
		 // code for Buffer - referenced by ptr
		  vkObj->pVertexAttributeDescriptions = (const VkVertexInputAttributeDescription*) (_pVertexAttributeDescriptions);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkPipelineVertexInputStateCreateInfo_getPVertexAttributeDescriptions0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:491

		  VkPipelineVertexInputStateCreateInfo* vkObj = (VkPipelineVertexInputStateCreateInfo*)(ptr);
		  // generic get for array of VkHandle and VkStruct 
		  return (jlong) reinterpret_cast<jlong>( &vkObj->pVertexAttributeDescriptions );
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkPipelineVertexInputStateCreateInfo_getPVertexAttributeDescriptions0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPipelineVertexInputStateCreateInfo_getPVertexAttributeDescriptions0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

