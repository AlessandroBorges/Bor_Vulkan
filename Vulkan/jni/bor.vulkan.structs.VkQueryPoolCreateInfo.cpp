#include <bor.vulkan.structs.VkQueryPoolCreateInfo.h>

//@line:43

    #include <BorVulkan.hpp>
    JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkQueryPoolCreateInfo_setSType0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _sType) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:315

		  VkQueryPoolCreateInfo* vkObj = (VkQueryPoolCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->sType = (VkStructureType) (_sType);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkQueryPoolCreateInfo_getSType0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:325

		  VkQueryPoolCreateInfo* vkObj = (VkQueryPoolCreateInfo*)(ptr);
		  // generic get for Vk enums
		  return (jint) (vkObj->sType);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkQueryPoolCreateInfo_getSType0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkQueryPoolCreateInfo_getSType0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkQueryPoolCreateInfo_setPNext0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__pNext) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _pNext = (char*)(obj__pNext?env->GetDirectBufferAddress(obj__pNext) : NULL);


//@line:335

		  VkQueryPoolCreateInfo* vkObj = (VkQueryPoolCreateInfo*)(ptr);
		 // code for Buffer - ptr to ptr 
		 const void* p_pNext = ( void*) _pNext; 
		 vkObj->pNext = p_pNext; 
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkQueryPoolCreateInfo_getPNext0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:346

		  VkQueryPoolCreateInfo* vkObj = (VkQueryPoolCreateInfo*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->pNext);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkQueryPoolCreateInfo_getPNext0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkQueryPoolCreateInfo_getPNext0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkQueryPoolCreateInfo_setFlags0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _flags) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:356

		  VkQueryPoolCreateInfo* vkObj = (VkQueryPoolCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->flags = (VkQueryPoolCreateFlags) (_flags);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkQueryPoolCreateInfo_getFlags0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:366

		  VkQueryPoolCreateInfo* vkObj = (VkQueryPoolCreateInfo*)(ptr);
		  return (jint) (vkObj->flags);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkQueryPoolCreateInfo_getFlags0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkQueryPoolCreateInfo_getFlags0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkQueryPoolCreateInfo_setQueryType0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _queryType) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:375

		  VkQueryPoolCreateInfo* vkObj = (VkQueryPoolCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->queryType = (VkQueryType) (_queryType);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkQueryPoolCreateInfo_getQueryType0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:385

		  VkQueryPoolCreateInfo* vkObj = (VkQueryPoolCreateInfo*)(ptr);
		  // generic get for Vk enums
		  return (jint) (vkObj->queryType);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkQueryPoolCreateInfo_getQueryType0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkQueryPoolCreateInfo_getQueryType0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkQueryPoolCreateInfo_setQueryCount0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _queryCount) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:395

		  VkQueryPoolCreateInfo* vkObj = (VkQueryPoolCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->queryCount = (uint32_t) (_queryCount);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkQueryPoolCreateInfo_getQueryCount0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:405

		  VkQueryPoolCreateInfo* vkObj = (VkQueryPoolCreateInfo*)(ptr);
		  return (jint) (vkObj->queryCount);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkQueryPoolCreateInfo_getQueryCount0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkQueryPoolCreateInfo_getQueryCount0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkQueryPoolCreateInfo_setPipelineStatistics0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _pipelineStatistics) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:414

		  VkQueryPoolCreateInfo* vkObj = (VkQueryPoolCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->pipelineStatistics = (VkQueryPipelineStatisticFlags) (_pipelineStatistics);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkQueryPoolCreateInfo_getPipelineStatistics0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:424

		  VkQueryPoolCreateInfo* vkObj = (VkQueryPoolCreateInfo*)(ptr);
		  return (jint) (vkObj->pipelineStatistics);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkQueryPoolCreateInfo_getPipelineStatistics0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkQueryPoolCreateInfo_getPipelineStatistics0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

