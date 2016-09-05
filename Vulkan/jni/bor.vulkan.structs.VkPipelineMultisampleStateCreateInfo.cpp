#include <bor.vulkan.structs.VkPipelineMultisampleStateCreateInfo.h>

//@line:46

    #include <BorVulkan.hpp>
    JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPipelineMultisampleStateCreateInfo_setSType0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _sType) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:432

		  VkPipelineMultisampleStateCreateInfo* vkObj = (VkPipelineMultisampleStateCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->sType = (VkStructureType) (_sType);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkPipelineMultisampleStateCreateInfo_getSType0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:442

		  VkPipelineMultisampleStateCreateInfo* vkObj = (VkPipelineMultisampleStateCreateInfo*)(ptr);
		  // generic get for Vk enums
		  return (jint) (vkObj->sType);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkPipelineMultisampleStateCreateInfo_getSType0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPipelineMultisampleStateCreateInfo_getSType0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPipelineMultisampleStateCreateInfo_setPNext0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__pNext) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _pNext = (char*)(obj__pNext?env->GetDirectBufferAddress(obj__pNext) : NULL);


//@line:452

		  VkPipelineMultisampleStateCreateInfo* vkObj = (VkPipelineMultisampleStateCreateInfo*)(ptr);
		 // code for Buffer - ptr to ptr 
		 const void* p_pNext = ( void*) _pNext; 
		 vkObj->pNext = p_pNext; 
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkPipelineMultisampleStateCreateInfo_getPNext0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:463

		  VkPipelineMultisampleStateCreateInfo* vkObj = (VkPipelineMultisampleStateCreateInfo*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->pNext);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkPipelineMultisampleStateCreateInfo_getPNext0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPipelineMultisampleStateCreateInfo_getPNext0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPipelineMultisampleStateCreateInfo_setFlags0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _flags) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:473

		  VkPipelineMultisampleStateCreateInfo* vkObj = (VkPipelineMultisampleStateCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->flags = (VkPipelineMultisampleStateCreateFlags) (_flags);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkPipelineMultisampleStateCreateInfo_getFlags0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:483

		  VkPipelineMultisampleStateCreateInfo* vkObj = (VkPipelineMultisampleStateCreateInfo*)(ptr);
		  return (jint) (vkObj->flags);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkPipelineMultisampleStateCreateInfo_getFlags0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPipelineMultisampleStateCreateInfo_getFlags0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPipelineMultisampleStateCreateInfo_setRasterizationSamples0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _rasterizationSamples) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:492

		  VkPipelineMultisampleStateCreateInfo* vkObj = (VkPipelineMultisampleStateCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->rasterizationSamples = (VkSampleCountFlagBits) (_rasterizationSamples);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkPipelineMultisampleStateCreateInfo_getRasterizationSamples0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:502

		  VkPipelineMultisampleStateCreateInfo* vkObj = (VkPipelineMultisampleStateCreateInfo*)(ptr);
		  // generic get for Vk enums
		  return (jint) (vkObj->rasterizationSamples);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkPipelineMultisampleStateCreateInfo_getRasterizationSamples0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPipelineMultisampleStateCreateInfo_getRasterizationSamples0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPipelineMultisampleStateCreateInfo_setSampleShadingEnable0(JNIEnv* env, jclass clazz, jobject obj_ptr, jboolean _sampleShadingEnable) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:512

		  VkPipelineMultisampleStateCreateInfo* vkObj = (VkPipelineMultisampleStateCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->sampleShadingEnable = (VkBool32) (_sampleShadingEnable);
	  

}

static inline jboolean wrapped_Java_bor_vulkan_structs_VkPipelineMultisampleStateCreateInfo_getSampleShadingEnable0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:522

		  VkPipelineMultisampleStateCreateInfo* vkObj = (VkPipelineMultisampleStateCreateInfo*)(ptr);
		  return (jboolean) (vkObj->sampleShadingEnable);
	 
}

JNIEXPORT jboolean JNICALL Java_bor_vulkan_structs_VkPipelineMultisampleStateCreateInfo_getSampleShadingEnable0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jboolean JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPipelineMultisampleStateCreateInfo_getSampleShadingEnable0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPipelineMultisampleStateCreateInfo_setMinSampleShading0(JNIEnv* env, jclass clazz, jobject obj_ptr, jfloat _minSampleShading) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:531

		  VkPipelineMultisampleStateCreateInfo* vkObj = (VkPipelineMultisampleStateCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->minSampleShading = (float) (_minSampleShading);
	  

}

static inline jfloat wrapped_Java_bor_vulkan_structs_VkPipelineMultisampleStateCreateInfo_getMinSampleShading0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:541

		  VkPipelineMultisampleStateCreateInfo* vkObj = (VkPipelineMultisampleStateCreateInfo*)(ptr);
		  return (jfloat) (vkObj->minSampleShading);
	 
}

JNIEXPORT jfloat JNICALL Java_bor_vulkan_structs_VkPipelineMultisampleStateCreateInfo_getMinSampleShading0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jfloat JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPipelineMultisampleStateCreateInfo_getMinSampleShading0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPipelineMultisampleStateCreateInfo_setPSampleMask0(JNIEnv* env, jclass clazz, jobject obj_ptr, jintArray obj__pSampleMask, jint count) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	int* _pSampleMask = (int*)(obj__pSampleMask ? env->GetIntArrayElements(obj__pSampleMask, 0) : NULL);


//@line:551

		VkPipelineMultisampleStateCreateInfo* vkObj = (VkPipelineMultisampleStateCreateInfo*)(ptr);  
		VkSampleMask* temp = const_cast<VkSampleMask*>(vkObj->pSampleMask); 
        // I must free it to avoid leaks
        if(temp) 
            free(temp);
        temp = CALLOC(count, VkSampleMask);
		memcpy( temp, _pSampleMask, count * sizeof(VkSampleMask));
        vkObj->pSampleMask = temp;
	  
	if(obj__pSampleMask != NULL){
		 env->ReleaseIntArrayElements(obj__pSampleMask, (jint*)_pSampleMask, 0);
	}

}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPipelineMultisampleStateCreateInfo_getPSampleMask0(JNIEnv* env, jclass clazz, jobject obj_ptr, jintArray obj__pSampleMask, jint count) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	int* _pSampleMask = (int*)(obj__pSampleMask ? env->GetIntArrayElements(obj__pSampleMask, 0) : NULL);


//@line:569

	          VkPipelineMultisampleStateCreateInfo* vkObj = (VkPipelineMultisampleStateCreateInfo*)(ptr);
	           // included code
	           memcpy( _pSampleMask, vkObj->pSampleMask, count * sizeof(VkSampleMask));
	   
	if(obj__pSampleMask != NULL){
		 env->ReleaseIntArrayElements(obj__pSampleMask, (jint*)_pSampleMask, 0);
	}

}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPipelineMultisampleStateCreateInfo_setAlphaToCoverageEnable0(JNIEnv* env, jclass clazz, jobject obj_ptr, jboolean _alphaToCoverageEnable) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:579

		  VkPipelineMultisampleStateCreateInfo* vkObj = (VkPipelineMultisampleStateCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->alphaToCoverageEnable = (VkBool32) (_alphaToCoverageEnable);
	  

}

static inline jboolean wrapped_Java_bor_vulkan_structs_VkPipelineMultisampleStateCreateInfo_getAlphaToCoverageEnable0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:589

		  VkPipelineMultisampleStateCreateInfo* vkObj = (VkPipelineMultisampleStateCreateInfo*)(ptr);
		  return (jboolean) (vkObj->alphaToCoverageEnable);
	 
}

JNIEXPORT jboolean JNICALL Java_bor_vulkan_structs_VkPipelineMultisampleStateCreateInfo_getAlphaToCoverageEnable0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jboolean JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPipelineMultisampleStateCreateInfo_getAlphaToCoverageEnable0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPipelineMultisampleStateCreateInfo_setAlphaToOneEnable0(JNIEnv* env, jclass clazz, jobject obj_ptr, jboolean _alphaToOneEnable) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:598

		  VkPipelineMultisampleStateCreateInfo* vkObj = (VkPipelineMultisampleStateCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->alphaToOneEnable = (VkBool32) (_alphaToOneEnable);
	  

}

static inline jboolean wrapped_Java_bor_vulkan_structs_VkPipelineMultisampleStateCreateInfo_getAlphaToOneEnable0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:608

		  VkPipelineMultisampleStateCreateInfo* vkObj = (VkPipelineMultisampleStateCreateInfo*)(ptr);
		  return (jboolean) (vkObj->alphaToOneEnable);
	 
}

JNIEXPORT jboolean JNICALL Java_bor_vulkan_structs_VkPipelineMultisampleStateCreateInfo_getAlphaToOneEnable0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jboolean JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPipelineMultisampleStateCreateInfo_getAlphaToOneEnable0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

