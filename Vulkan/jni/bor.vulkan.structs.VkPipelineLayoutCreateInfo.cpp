#include <bor.vulkan.structs.VkPipelineLayoutCreateInfo.h>

//@line:44

    #include <BorVulkan.hpp>
    JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPipelineLayoutCreateInfo_setSType0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _sType) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:365

		  VkPipelineLayoutCreateInfo* vkObj = (VkPipelineLayoutCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->sType = (VkStructureType) (_sType);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkPipelineLayoutCreateInfo_getSType0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:375

		  VkPipelineLayoutCreateInfo* vkObj = (VkPipelineLayoutCreateInfo*)(ptr);
		  return (VkStructureType) (vkObj->sType);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkPipelineLayoutCreateInfo_getSType0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPipelineLayoutCreateInfo_getSType0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPipelineLayoutCreateInfo_setPNext0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__pNext) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _pNext = (char*)(obj__pNext?env->GetDirectBufferAddress(obj__pNext) : NULL);


//@line:384

		  VkPipelineLayoutCreateInfo* vkObj = (VkPipelineLayoutCreateInfo*)(ptr);
		 // code for Buffer - referenced by ptr
		  vkObj->pNext = (const void*) (_pNext);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkPipelineLayoutCreateInfo_getPNext0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:394

		  VkPipelineLayoutCreateInfo* vkObj = (VkPipelineLayoutCreateInfo*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->pNext);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkPipelineLayoutCreateInfo_getPNext0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPipelineLayoutCreateInfo_getPNext0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPipelineLayoutCreateInfo_setFlags0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _flags) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:404

		  VkPipelineLayoutCreateInfo* vkObj = (VkPipelineLayoutCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->flags = (VkPipelineLayoutCreateFlags) (_flags);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkPipelineLayoutCreateInfo_getFlags0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:414

		  VkPipelineLayoutCreateInfo* vkObj = (VkPipelineLayoutCreateInfo*)(ptr);
		  return (jint) (vkObj->flags);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkPipelineLayoutCreateInfo_getFlags0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPipelineLayoutCreateInfo_getFlags0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPipelineLayoutCreateInfo_setSetLayoutCount0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _setLayoutCount) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:423

		  VkPipelineLayoutCreateInfo* vkObj = (VkPipelineLayoutCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->setLayoutCount = (uint32_t) (_setLayoutCount);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkPipelineLayoutCreateInfo_getSetLayoutCount0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:433

		  VkPipelineLayoutCreateInfo* vkObj = (VkPipelineLayoutCreateInfo*)(ptr);
		  return (jint) (vkObj->setLayoutCount);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkPipelineLayoutCreateInfo_getSetLayoutCount0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPipelineLayoutCreateInfo_getSetLayoutCount0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPipelineLayoutCreateInfo_setPSetLayouts0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__pSetLayouts) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _pSetLayouts = (char*)(obj__pSetLayouts?env->GetDirectBufferAddress(obj__pSetLayouts) : NULL);


//@line:442

		  VkPipelineLayoutCreateInfo* vkObj = (VkPipelineLayoutCreateInfo*)(ptr);
		 // code for Buffer - referenced by ptr
		  vkObj->pSetLayouts = (const VkDescriptorSetLayout*) (_pSetLayouts);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkPipelineLayoutCreateInfo_getPSetLayouts0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:452

		  VkPipelineLayoutCreateInfo* vkObj = (VkPipelineLayoutCreateInfo*)(ptr);
		  // generic get for array of VkHandle and VkStruct 
		  return (jlong) reinterpret_cast<jlong>( &vkObj->pSetLayouts );
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkPipelineLayoutCreateInfo_getPSetLayouts0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPipelineLayoutCreateInfo_getPSetLayouts0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPipelineLayoutCreateInfo_setPushConstantRangeCount0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _pushConstantRangeCount) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:462

		  VkPipelineLayoutCreateInfo* vkObj = (VkPipelineLayoutCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->pushConstantRangeCount = (uint32_t) (_pushConstantRangeCount);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkPipelineLayoutCreateInfo_getPushConstantRangeCount0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:472

		  VkPipelineLayoutCreateInfo* vkObj = (VkPipelineLayoutCreateInfo*)(ptr);
		  return (jint) (vkObj->pushConstantRangeCount);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkPipelineLayoutCreateInfo_getPushConstantRangeCount0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPipelineLayoutCreateInfo_getPushConstantRangeCount0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPipelineLayoutCreateInfo_setPPushConstantRanges0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__pPushConstantRanges) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _pPushConstantRanges = (char*)(obj__pPushConstantRanges?env->GetDirectBufferAddress(obj__pPushConstantRanges) : NULL);


//@line:481

		  VkPipelineLayoutCreateInfo* vkObj = (VkPipelineLayoutCreateInfo*)(ptr);
		 // code for Buffer - referenced by ptr
		  vkObj->pPushConstantRanges = (const VkPushConstantRange*) (_pPushConstantRanges);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkPipelineLayoutCreateInfo_getPPushConstantRanges0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:491

		  VkPipelineLayoutCreateInfo* vkObj = (VkPipelineLayoutCreateInfo*)(ptr);
		  // generic get for array of VkHandle and VkStruct 
		  return (jlong) reinterpret_cast<jlong>( &vkObj->pPushConstantRanges );
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkPipelineLayoutCreateInfo_getPPushConstantRanges0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPipelineLayoutCreateInfo_getPPushConstantRanges0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

