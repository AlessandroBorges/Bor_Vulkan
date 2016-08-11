#include <bor.vulkan.structs.VkPipelineDynamicStateCreateInfo.h>

//@line:42

    #include <BorVulkan.hpp>
    JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPipelineDynamicStateCreateInfo_setSType0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _sType) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:287

		  VkPipelineDynamicStateCreateInfo* vkObj = (VkPipelineDynamicStateCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->sType = (VkStructureType) (_sType);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkPipelineDynamicStateCreateInfo_getSType0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:297

		  VkPipelineDynamicStateCreateInfo* vkObj = (VkPipelineDynamicStateCreateInfo*)(ptr);
		  return (VkStructureType) (vkObj->sType);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkPipelineDynamicStateCreateInfo_getSType0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPipelineDynamicStateCreateInfo_getSType0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPipelineDynamicStateCreateInfo_setPNext0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__pNext) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _pNext = (char*)(obj__pNext?env->GetDirectBufferAddress(obj__pNext) : NULL);


//@line:306

		  VkPipelineDynamicStateCreateInfo* vkObj = (VkPipelineDynamicStateCreateInfo*)(ptr);
		 // code for Buffer - referenced by ptr
		  vkObj->pNext = (const void*) (_pNext);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkPipelineDynamicStateCreateInfo_getPNext0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:316

		  VkPipelineDynamicStateCreateInfo* vkObj = (VkPipelineDynamicStateCreateInfo*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->pNext);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkPipelineDynamicStateCreateInfo_getPNext0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPipelineDynamicStateCreateInfo_getPNext0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPipelineDynamicStateCreateInfo_setFlags0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _flags) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:326

		  VkPipelineDynamicStateCreateInfo* vkObj = (VkPipelineDynamicStateCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->flags = (VkPipelineDynamicStateCreateFlags) (_flags);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkPipelineDynamicStateCreateInfo_getFlags0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:336

		  VkPipelineDynamicStateCreateInfo* vkObj = (VkPipelineDynamicStateCreateInfo*)(ptr);
		  return (jint) (vkObj->flags);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkPipelineDynamicStateCreateInfo_getFlags0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPipelineDynamicStateCreateInfo_getFlags0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPipelineDynamicStateCreateInfo_setDynamicStateCount0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _dynamicStateCount) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:345

		  VkPipelineDynamicStateCreateInfo* vkObj = (VkPipelineDynamicStateCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->dynamicStateCount = (uint32_t) (_dynamicStateCount);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkPipelineDynamicStateCreateInfo_getDynamicStateCount0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:355

		  VkPipelineDynamicStateCreateInfo* vkObj = (VkPipelineDynamicStateCreateInfo*)(ptr);
		  return (jint) (vkObj->dynamicStateCount);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkPipelineDynamicStateCreateInfo_getDynamicStateCount0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPipelineDynamicStateCreateInfo_getDynamicStateCount0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

static inline void wrapped_Java_bor_vulkan_structs_VkPipelineDynamicStateCreateInfo_setPDynamicStates0
(JNIEnv* env, jclass clazz, jobject obj_ptr, jintArray obj__pDynamicStates, unsigned char* ptr, int* _pDynamicStates) {

//@line:364

		  VkPipelineDynamicStateCreateInfo* vkObj = (VkPipelineDynamicStateCreateInfo*)(ptr);
		 // code for generic array 
		  if( NULL == _pDynamicStates ){
		    vkObj->dynamicStateCount = 0;
		    FREE_IT(vkObj->pDynamicStates);
		     return;
		   }
		  uint32_t count = (uint32_t)env->GetArrayLength( obj__pDynamicStates);
		  if( vkObj->dynamicStateCount != count){ 
		    FREE_IT(vkObj->pDynamicStates); 
		    vkObj->pDynamicStates = CALLOC(count, VkDynamicState);
		   }
		  memcpy( vkObj->pDynamicStates, _pDynamicStates, count * sizeof(VkDynamicState));
		  vkObj->dynamicStateCount = count;
	  
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPipelineDynamicStateCreateInfo_setPDynamicStates0(JNIEnv* env, jclass clazz, jobject obj_ptr, jintArray obj__pDynamicStates) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	int* _pDynamicStates = (int*)(obj__pDynamicStates ? env->GetIntArrayElements(obj__pDynamicStates, 0) : NULL);

	wrapped_Java_bor_vulkan_structs_VkPipelineDynamicStateCreateInfo_setPDynamicStates0(env, clazz, obj_ptr, obj__pDynamicStates, ptr, _pDynamicStates);

	if(obj__pDynamicStates != NULL){
		 env->ReleaseIntArrayElements(obj__pDynamicStates, (jint*)_pDynamicStates, 0);
	}

	return;
}

static inline jintArray wrapped_Java_bor_vulkan_structs_VkPipelineDynamicStateCreateInfo_getPDynamicStates0
(JNIEnv* env, jclass clazz, jobject obj_ptr, jintArray obj__pDynamicStates, unsigned char* ptr, int* _pDynamicStates) {

//@line:385

		  VkPipelineDynamicStateCreateInfo* vkObj = (VkPipelineDynamicStateCreateInfo*)(ptr);
		  // generic get for C type array, with content copy 
		  if( 0 == vkObj->dynamicStateCount){ 
		     return NULL;
		   }
		  uint32_t count = (uint32_t)env->GetArrayLength( obj__pDynamicStates);
		  if(vkObj->pDynamicStates == NULL){
		    return NULL;
		   }
 		  memcpy(_pDynamicStates, vkObj->pDynamicStates, count * sizeof(VkDynamicState));
		  return obj__pDynamicStates;
	 
}

JNIEXPORT jintArray JNICALL Java_bor_vulkan_structs_VkPipelineDynamicStateCreateInfo_getPDynamicStates0(JNIEnv* env, jclass clazz, jobject obj_ptr, jintArray obj__pDynamicStates) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	int* _pDynamicStates = (int*)(obj__pDynamicStates ? env->GetIntArrayElements(obj__pDynamicStates, 0) : NULL);

	jintArray JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPipelineDynamicStateCreateInfo_getPDynamicStates0(env, clazz, obj_ptr, obj__pDynamicStates, ptr, _pDynamicStates);

	if(obj__pDynamicStates != NULL){
		 env->ReleaseIntArrayElements(obj__pDynamicStates, (jint*)_pDynamicStates, 0);
	}

	return JNI_returnValue;
}

