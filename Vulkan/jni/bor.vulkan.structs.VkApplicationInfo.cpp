#include <bor.vulkan.structs.VkApplicationInfo.h>

//@line:43

    #include <BorVulkan.hpp>
    JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkApplicationInfo_setSType0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _sType) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr):0);


//@line:350

		  VkApplicationInfo* vkObj = (VkApplicationInfo*)(ptr);
		  vkObj->sType = (VkStructureType) (_sType);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkApplicationInfo_getSType0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:359

		  VkApplicationInfo* vkObj = (VkApplicationInfo*)(ptr);
		  return (VkStructureType) (vkObj->sType);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkApplicationInfo_getSType0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr):0);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkApplicationInfo_getSType0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkApplicationInfo_setPNext0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__pNext) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr):0);
	char* _pNext = (char*)(obj__pNext?env->GetDirectBufferAddress(obj__pNext):0);


//@line:368

		  VkApplicationInfo* vkObj = (VkApplicationInfo*)(ptr);
		  vkObj->pNext = (const void*) (_pNext);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkApplicationInfo_getPNext0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:377

		  VkApplicationInfo* vkObj = (VkApplicationInfo*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->pNext);	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkApplicationInfo_getPNext0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr):0);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkApplicationInfo_getPNext0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkApplicationInfo_setPApplicationName0(JNIEnv* env, jclass clazz, jobject obj_ptr, jstring obj__pApplicationName) {

//@line:385

	 unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr):0);
         char* _pApplicationName = (char*)env->GetStringUTFChars(obj__pApplicationName, 0);
         
		  VkApplicationInfo* vkObj = (VkApplicationInfo*)(ptr);
		  vkObj->pApplicationName = (const char*) (_pApplicationName);
	  
}

static inline jstring wrapped_Java_bor_vulkan_structs_VkApplicationInfo_getPApplicationName0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:397

		  VkApplicationInfo* vkObj = (VkApplicationInfo*)(ptr);
		  return (jstring)(env->NewStringUTF(vkObj->pApplicationName));	 
}

JNIEXPORT jstring JNICALL Java_bor_vulkan_structs_VkApplicationInfo_getPApplicationName0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr):0);

	jstring JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkApplicationInfo_getPApplicationName0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkApplicationInfo_setApplicationVersion0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _applicationVersion) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr):0);


//@line:405

		  VkApplicationInfo* vkObj = (VkApplicationInfo*)(ptr);
		  vkObj->applicationVersion = (uint32_t) (_applicationVersion);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkApplicationInfo_getApplicationVersion0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:414

		  VkApplicationInfo* vkObj = (VkApplicationInfo*)(ptr);
		  return (jint) (vkObj->applicationVersion);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkApplicationInfo_getApplicationVersion0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr):0);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkApplicationInfo_getApplicationVersion0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkApplicationInfo_setPEngineName0(JNIEnv* env, jclass clazz, jobject obj_ptr, jstring obj__pEngineName) {

//@line:423

                unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr):0);
                char* _pEngineName = (char*)env->GetStringUTFChars(obj__pEngineName, 0);
		
		  VkApplicationInfo* vkObj = (VkApplicationInfo*)(ptr);
		  vkObj->pEngineName = (const char*) (_pEngineName);
	  
}

static inline jstring wrapped_Java_bor_vulkan_structs_VkApplicationInfo_getPEngineName0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:435

		  VkApplicationInfo* vkObj = (VkApplicationInfo*)(ptr);
		  return (jstring)(env->NewStringUTF(vkObj->pEngineName));	 
}

JNIEXPORT jstring JNICALL Java_bor_vulkan_structs_VkApplicationInfo_getPEngineName0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr):0);

	jstring JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkApplicationInfo_getPEngineName0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkApplicationInfo_setEngineVersion0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _engineVersion) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr):0);


//@line:443

		  VkApplicationInfo* vkObj = (VkApplicationInfo*)(ptr);
		  vkObj->engineVersion = (uint32_t) (_engineVersion);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkApplicationInfo_getEngineVersion0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:452

		  VkApplicationInfo* vkObj = (VkApplicationInfo*)(ptr);
		  return (jint) (vkObj->engineVersion);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkApplicationInfo_getEngineVersion0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr):0);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkApplicationInfo_getEngineVersion0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkApplicationInfo_setApiVersion0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _apiVersion) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr):0);


//@line:461

		  VkApplicationInfo* vkObj = (VkApplicationInfo*)(ptr);
		  vkObj->apiVersion = (uint32_t) (_apiVersion);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkApplicationInfo_getApiVersion0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:470

		  VkApplicationInfo* vkObj = (VkApplicationInfo*)(ptr);
		  return (jint) (vkObj->apiVersion);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkApplicationInfo_getApiVersion0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr):0);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkApplicationInfo_getApiVersion0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

