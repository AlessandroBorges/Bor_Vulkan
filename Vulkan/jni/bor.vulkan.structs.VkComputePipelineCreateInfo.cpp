#include <bor.vulkan.structs.VkComputePipelineCreateInfo.h>

//@line:44

    #include <BorVulkan.hpp>
    JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkComputePipelineCreateInfo_setSType0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _sType) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:388

		  VkComputePipelineCreateInfo* vkObj = (VkComputePipelineCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->sType = (VkStructureType) (_sType);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkComputePipelineCreateInfo_getSType0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:398

		  VkComputePipelineCreateInfo* vkObj = (VkComputePipelineCreateInfo*)(ptr);
		  // generic get for Vk enums
		  return (jint) (vkObj->sType);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkComputePipelineCreateInfo_getSType0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkComputePipelineCreateInfo_getSType0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkComputePipelineCreateInfo_setPNext0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__pNext) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _pNext = (char*)(obj__pNext?env->GetDirectBufferAddress(obj__pNext) : NULL);


//@line:408

		  VkComputePipelineCreateInfo* vkObj = (VkComputePipelineCreateInfo*)(ptr);
		 // code for Buffer - ptr to ptr 
		 const void* p_pNext = ( void*) _pNext; 
		 vkObj->pNext = p_pNext; 
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkComputePipelineCreateInfo_getPNext0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:419

		  VkComputePipelineCreateInfo* vkObj = (VkComputePipelineCreateInfo*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->pNext);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkComputePipelineCreateInfo_getPNext0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkComputePipelineCreateInfo_getPNext0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkComputePipelineCreateInfo_setFlags0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _flags) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:429

		  VkComputePipelineCreateInfo* vkObj = (VkComputePipelineCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->flags = (VkPipelineCreateFlags) (_flags);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkComputePipelineCreateInfo_getFlags0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:439

		  VkComputePipelineCreateInfo* vkObj = (VkComputePipelineCreateInfo*)(ptr);
		  return (jint) (vkObj->flags);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkComputePipelineCreateInfo_getFlags0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkComputePipelineCreateInfo_getFlags0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkComputePipelineCreateInfo_setStage0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__stage) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _stage = (char*)(obj__stage?env->GetDirectBufferAddress(obj__stage) : NULL);


//@line:448

		  VkComputePipelineCreateInfo* vkObj = (VkComputePipelineCreateInfo*)(ptr);
		 // code for Buffer - ptr to struct 
		 VkPipelineShaderStageCreateInfo* p_stage = (VkPipelineShaderStageCreateInfo*) _stage; 
		 vkObj->stage = (*p_stage); 
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkComputePipelineCreateInfo_getStage0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:459

		  VkComputePipelineCreateInfo* vkObj = (VkComputePipelineCreateInfo*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->stage);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkComputePipelineCreateInfo_getStage0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkComputePipelineCreateInfo_getStage0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkComputePipelineCreateInfo_setLayout0(JNIEnv* env, jclass clazz, jobject obj_ptr, jlong _layout) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:469

		  VkComputePipelineCreateInfo* vkObj = (VkComputePipelineCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->layout = (VkPipelineLayout) (_layout);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkComputePipelineCreateInfo_getLayout0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:479

		  VkComputePipelineCreateInfo* vkObj = (VkComputePipelineCreateInfo*)(ptr);
		  // generic get for struct field of type  VkHandle or VkStruct 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->layout);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkComputePipelineCreateInfo_getLayout0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkComputePipelineCreateInfo_getLayout0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkComputePipelineCreateInfo_setBasePipelineHandle0(JNIEnv* env, jclass clazz, jobject obj_ptr, jlong _basePipelineHandle) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:489

		  VkComputePipelineCreateInfo* vkObj = (VkComputePipelineCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->basePipelineHandle = (VkPipeline) (_basePipelineHandle);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkComputePipelineCreateInfo_getBasePipelineHandle0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:499

		  VkComputePipelineCreateInfo* vkObj = (VkComputePipelineCreateInfo*)(ptr);
		  // generic get for struct field of type  VkHandle or VkStruct 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->basePipelineHandle);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkComputePipelineCreateInfo_getBasePipelineHandle0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkComputePipelineCreateInfo_getBasePipelineHandle0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkComputePipelineCreateInfo_setBasePipelineIndex0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _basePipelineIndex) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:509

		  VkComputePipelineCreateInfo* vkObj = (VkComputePipelineCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->basePipelineIndex = (int32_t) (_basePipelineIndex);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkComputePipelineCreateInfo_getBasePipelineIndex0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:519

		  VkComputePipelineCreateInfo* vkObj = (VkComputePipelineCreateInfo*)(ptr);
		  return (jint) (vkObj->basePipelineIndex);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkComputePipelineCreateInfo_getBasePipelineIndex0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkComputePipelineCreateInfo_getBasePipelineIndex0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

