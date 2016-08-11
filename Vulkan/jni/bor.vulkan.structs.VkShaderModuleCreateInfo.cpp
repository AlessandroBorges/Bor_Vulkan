#include <bor.vulkan.structs.VkShaderModuleCreateInfo.h>

//@line:42

    #include <BorVulkan.hpp>
    JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkShaderModuleCreateInfo_setSType0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _sType) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:283

		  VkShaderModuleCreateInfo* vkObj = (VkShaderModuleCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->sType = (VkStructureType) (_sType);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkShaderModuleCreateInfo_getSType0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:293

		  VkShaderModuleCreateInfo* vkObj = (VkShaderModuleCreateInfo*)(ptr);
		  return (VkStructureType) (vkObj->sType);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkShaderModuleCreateInfo_getSType0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkShaderModuleCreateInfo_getSType0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkShaderModuleCreateInfo_setPNext0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__pNext) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _pNext = (char*)(obj__pNext?env->GetDirectBufferAddress(obj__pNext) : NULL);


//@line:302

		  VkShaderModuleCreateInfo* vkObj = (VkShaderModuleCreateInfo*)(ptr);
		 // code for Buffer - referenced by ptr
		  vkObj->pNext = (const void*) (_pNext);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkShaderModuleCreateInfo_getPNext0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:312

		  VkShaderModuleCreateInfo* vkObj = (VkShaderModuleCreateInfo*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->pNext);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkShaderModuleCreateInfo_getPNext0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkShaderModuleCreateInfo_getPNext0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkShaderModuleCreateInfo_setFlags0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _flags) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:322

		  VkShaderModuleCreateInfo* vkObj = (VkShaderModuleCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->flags = (VkShaderModuleCreateFlags) (_flags);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkShaderModuleCreateInfo_getFlags0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:332

		  VkShaderModuleCreateInfo* vkObj = (VkShaderModuleCreateInfo*)(ptr);
		  return (jint) (vkObj->flags);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkShaderModuleCreateInfo_getFlags0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkShaderModuleCreateInfo_getFlags0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkShaderModuleCreateInfo_setCodeSize0(JNIEnv* env, jclass clazz, jobject obj_ptr, jlong _codeSize) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:341

		  VkShaderModuleCreateInfo* vkObj = (VkShaderModuleCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->codeSize = (size_t) (_codeSize);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkShaderModuleCreateInfo_getCodeSize0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:351

		  VkShaderModuleCreateInfo* vkObj = (VkShaderModuleCreateInfo*)(ptr);
		  return (jlong) (vkObj->codeSize);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkShaderModuleCreateInfo_getCodeSize0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkShaderModuleCreateInfo_getCodeSize0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

static inline void wrapped_Java_bor_vulkan_structs_VkShaderModuleCreateInfo_setPCode0
(JNIEnv* env, jclass clazz, jobject obj_ptr, jintArray obj__pCode, unsigned char* ptr, int* _pCode) {

//@line:360

		  VkShaderModuleCreateInfo* vkObj = (VkShaderModuleCreateInfo*)(ptr);
		 // code for generic array 
		  if( NULL == _pCode ){
		    vkObj->codeSize = 0;
		    FREE_IT(vkObj->pCode);
		     return;
		   }
		  uint32_t count = (uint32_t)env->GetArrayLength( obj__pCode);
		  if( vkObj->codeSize != count){ 
		    FREE_IT(vkObj->pCode); 
		    vkObj->pCode = CALLOC(count, uint32_t);
		   }
		  memcpy( vkObj->pCode, _pCode, count * sizeof(uint32_t));
		  vkObj->codeSize = count;
	  
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkShaderModuleCreateInfo_setPCode0(JNIEnv* env, jclass clazz, jobject obj_ptr, jintArray obj__pCode) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	int* _pCode = (int*)(obj__pCode ? env->GetIntArrayElements(obj__pCode, 0) : NULL);

	wrapped_Java_bor_vulkan_structs_VkShaderModuleCreateInfo_setPCode0(env, clazz, obj_ptr, obj__pCode, ptr, _pCode);

	if(obj__pCode != NULL){
		 env->ReleaseIntArrayElements(obj__pCode, (jint*)_pCode, 0);
	}

	return;
}

static inline jintArray wrapped_Java_bor_vulkan_structs_VkShaderModuleCreateInfo_getPCode0
(JNIEnv* env, jclass clazz, jobject obj_ptr, jintArray obj__pCode, unsigned char* ptr, int* _pCode) {

//@line:381

		  VkShaderModuleCreateInfo* vkObj = (VkShaderModuleCreateInfo*)(ptr);
		  // generic get for C type array, with content copy 
		  if( 0 == vkObj->codeSize){ 
		     return NULL;
		   }
		  uint32_t count = (uint32_t)env->GetArrayLength( obj__pCode);
		  if(vkObj->pCode == NULL){
		    return NULL;
		   }
 		  memcpy(_pCode, vkObj->pCode, count * sizeof(uint32_t));
		  return obj__pCode;
	 
}

JNIEXPORT jintArray JNICALL Java_bor_vulkan_structs_VkShaderModuleCreateInfo_getPCode0(JNIEnv* env, jclass clazz, jobject obj_ptr, jintArray obj__pCode) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	int* _pCode = (int*)(obj__pCode ? env->GetIntArrayElements(obj__pCode, 0) : NULL);

	jintArray JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkShaderModuleCreateInfo_getPCode0(env, clazz, obj_ptr, obj__pCode, ptr, _pCode);

	if(obj__pCode != NULL){
		 env->ReleaseIntArrayElements(obj__pCode, (jint*)_pCode, 0);
	}

	return JNI_returnValue;
}

