#include <bor.vulkan.structs.VkPipelineShaderStageCreateInfo.h>

//@line:44

    #include <BorVulkan.hpp>
    JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPipelineShaderStageCreateInfo_setSType0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _sType) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:378

		  VkPipelineShaderStageCreateInfo* vkObj = (VkPipelineShaderStageCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->sType = (VkStructureType) (_sType);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkPipelineShaderStageCreateInfo_getSType0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:388

		  VkPipelineShaderStageCreateInfo* vkObj = (VkPipelineShaderStageCreateInfo*)(ptr);
		  // generic get for Vk enums
		  return (jint) (vkObj->sType);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkPipelineShaderStageCreateInfo_getSType0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPipelineShaderStageCreateInfo_getSType0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPipelineShaderStageCreateInfo_setPNext0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__pNext) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _pNext = (char*)(obj__pNext?env->GetDirectBufferAddress(obj__pNext) : NULL);


//@line:398

		  VkPipelineShaderStageCreateInfo* vkObj = (VkPipelineShaderStageCreateInfo*)(ptr);
		 // code for Buffer - ptr to ptr 
		 const void* p_pNext = ( void*) _pNext; 
		 vkObj->pNext = p_pNext; 
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkPipelineShaderStageCreateInfo_getPNext0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:409

		  VkPipelineShaderStageCreateInfo* vkObj = (VkPipelineShaderStageCreateInfo*)(ptr);
		  // generic get for Buffer - field must be pointer! 
		  return (jlong) reinterpret_cast<jlong>(vkObj->pNext);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkPipelineShaderStageCreateInfo_getPNext0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPipelineShaderStageCreateInfo_getPNext0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPipelineShaderStageCreateInfo_setFlags0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _flags) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:419

		  VkPipelineShaderStageCreateInfo* vkObj = (VkPipelineShaderStageCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->flags = (VkPipelineShaderStageCreateFlags) (_flags);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkPipelineShaderStageCreateInfo_getFlags0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:429

		  VkPipelineShaderStageCreateInfo* vkObj = (VkPipelineShaderStageCreateInfo*)(ptr);
		  return (jint) (vkObj->flags);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkPipelineShaderStageCreateInfo_getFlags0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPipelineShaderStageCreateInfo_getFlags0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPipelineShaderStageCreateInfo_setStage0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _stage) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:438

		  VkPipelineShaderStageCreateInfo* vkObj = (VkPipelineShaderStageCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->stage = (VkShaderStageFlagBits) (_stage);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkPipelineShaderStageCreateInfo_getStage0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:448

		  VkPipelineShaderStageCreateInfo* vkObj = (VkPipelineShaderStageCreateInfo*)(ptr);
		  // generic get for Vk enums
		  return (jint) (vkObj->stage);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkPipelineShaderStageCreateInfo_getStage0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPipelineShaderStageCreateInfo_getStage0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPipelineShaderStageCreateInfo_setModule0(JNIEnv* env, jclass clazz, jobject obj_ptr, jlong _module) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:458

		  VkPipelineShaderStageCreateInfo* vkObj = (VkPipelineShaderStageCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->module = (VkShaderModule) (_module);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkPipelineShaderStageCreateInfo_getModule0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:468

		  VkPipelineShaderStageCreateInfo* vkObj = (VkPipelineShaderStageCreateInfo*)(ptr);
		  // generic get for struct field of type  VkHandle or VkStruct 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->module);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkPipelineShaderStageCreateInfo_getModule0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPipelineShaderStageCreateInfo_getModule0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPipelineShaderStageCreateInfo_setPName0(JNIEnv* env, jclass clazz, jobject obj_ptr, jstring obj__pName) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _pName = (char*)(obj__pName ? env->GetStringUTFChars(obj__pName, 0) : NULL);


//@line:478

		  VkPipelineShaderStageCreateInfo* vkObj = (VkPipelineShaderStageCreateInfo*)(ptr);
		  vkObj->pName = cloneStr(_pName);
	  
	 if(obj__pName != NULL){
		 env->ReleaseStringUTFChars(obj__pName, _pName);
	 }

}

static inline jstring wrapped_Java_bor_vulkan_structs_VkPipelineShaderStageCreateInfo_getPName0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:487

		  VkPipelineShaderStageCreateInfo* vkObj = (VkPipelineShaderStageCreateInfo*)(ptr);
		  return (jstring)(env->NewStringUTF(cloneStr(vkObj->pName)));
	 
}

JNIEXPORT jstring JNICALL Java_bor_vulkan_structs_VkPipelineShaderStageCreateInfo_getPName0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jstring JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPipelineShaderStageCreateInfo_getPName0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPipelineShaderStageCreateInfo_setPSpecializationInfo0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__pSpecializationInfo) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _pSpecializationInfo = (char*)(obj__pSpecializationInfo?env->GetDirectBufferAddress(obj__pSpecializationInfo) : NULL);


//@line:496

		  VkPipelineShaderStageCreateInfo* vkObj = (VkPipelineShaderStageCreateInfo*)(ptr);
		 // code for Buffer - ptr to ptr 
		 const VkSpecializationInfo* p_pSpecializationInfo = ( VkSpecializationInfo*) _pSpecializationInfo; 
		 vkObj->pSpecializationInfo = p_pSpecializationInfo; 
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkPipelineShaderStageCreateInfo_getPSpecializationInfo0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:507

		  VkPipelineShaderStageCreateInfo* vkObj = (VkPipelineShaderStageCreateInfo*)(ptr);
		  // generic get for Buffer - field must be pointer! 
		  return (jlong) reinterpret_cast<jlong>(vkObj->pSpecializationInfo);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkPipelineShaderStageCreateInfo_getPSpecializationInfo0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPipelineShaderStageCreateInfo_getPSpecializationInfo0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

