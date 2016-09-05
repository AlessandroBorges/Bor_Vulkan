#include <bor.vulkan.structs.VkApplicationInfo.h>

//@line:44

    #include <BorVulkan.hpp>
    JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkApplicationInfo_setSType0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _sType) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:356

		  VkApplicationInfo* vkObj = (VkApplicationInfo*)(ptr);
		 // code for simple past value 
		  vkObj->sType = (VkStructureType) (_sType);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkApplicationInfo_getSType0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:366

		  VkApplicationInfo* vkObj = (VkApplicationInfo*)(ptr);
		  // generic get for Vk enums
		  return (jint) (vkObj->sType);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkApplicationInfo_getSType0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkApplicationInfo_getSType0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkApplicationInfo_setPNext0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__pNext) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _pNext = (char*)(obj__pNext?env->GetDirectBufferAddress(obj__pNext) : NULL);


//@line:376

		  VkApplicationInfo* vkObj = (VkApplicationInfo*)(ptr);
		 // code for Buffer - ptr to ptr 
		 const void* p_pNext = ( void*) _pNext; 
		 vkObj->pNext = p_pNext; 
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkApplicationInfo_getPNext0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:387

		  VkApplicationInfo* vkObj = (VkApplicationInfo*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->pNext);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkApplicationInfo_getPNext0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkApplicationInfo_getPNext0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkApplicationInfo_setPApplicationName0(JNIEnv* env, jclass clazz, jobject obj_ptr, jstring obj__pApplicationName) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _pApplicationName = (char*)(obj__pApplicationName ? env->GetStringUTFChars(obj__pApplicationName, 0) : NULL);


//@line:397

		  VkApplicationInfo* vkObj = (VkApplicationInfo*)(ptr);
		  vkObj->pApplicationName = cloneStr(_pApplicationName);
	  
	 if(obj__pApplicationName != NULL){
		 env->ReleaseStringUTFChars(obj__pApplicationName, _pApplicationName);
	 }

}

static inline jstring wrapped_Java_bor_vulkan_structs_VkApplicationInfo_getPApplicationName0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:406

		  VkApplicationInfo* vkObj = (VkApplicationInfo*)(ptr);
		  return (jstring)(env->NewStringUTF(vkObj->pApplicationName));
	 
}

JNIEXPORT jstring JNICALL Java_bor_vulkan_structs_VkApplicationInfo_getPApplicationName0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jstring JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkApplicationInfo_getPApplicationName0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkApplicationInfo_setApplicationVersion0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _applicationVersion) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:415

		  VkApplicationInfo* vkObj = (VkApplicationInfo*)(ptr);
		 // code for simple past value 
		  vkObj->applicationVersion = (uint32_t) (_applicationVersion);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkApplicationInfo_getApplicationVersion0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:425

		  VkApplicationInfo* vkObj = (VkApplicationInfo*)(ptr);
		  return (jint) (vkObj->applicationVersion);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkApplicationInfo_getApplicationVersion0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkApplicationInfo_getApplicationVersion0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkApplicationInfo_setPEngineName0(JNIEnv* env, jclass clazz, jobject obj_ptr, jstring obj__pEngineName) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _pEngineName = (char*)(obj__pEngineName ? env->GetStringUTFChars(obj__pEngineName, 0) : NULL);


//@line:434

		  VkApplicationInfo* vkObj = (VkApplicationInfo*)(ptr);
		  vkObj->pEngineName = cloneStr(_pEngineName);
	  
	 if(obj__pEngineName != NULL){
		 env->ReleaseStringUTFChars(obj__pEngineName, _pEngineName);
	 }

}

static inline jstring wrapped_Java_bor_vulkan_structs_VkApplicationInfo_getPEngineName0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:443

		  VkApplicationInfo* vkObj = (VkApplicationInfo*)(ptr);
		  return (jstring)(env->NewStringUTF(vkObj->pEngineName));
	 
}

JNIEXPORT jstring JNICALL Java_bor_vulkan_structs_VkApplicationInfo_getPEngineName0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jstring JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkApplicationInfo_getPEngineName0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkApplicationInfo_setEngineVersion0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _engineVersion) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:452

		  VkApplicationInfo* vkObj = (VkApplicationInfo*)(ptr);
		 // code for simple past value 
		  vkObj->engineVersion = (uint32_t) (_engineVersion);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkApplicationInfo_getEngineVersion0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:462

		  VkApplicationInfo* vkObj = (VkApplicationInfo*)(ptr);
		  return (jint) (vkObj->engineVersion);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkApplicationInfo_getEngineVersion0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkApplicationInfo_getEngineVersion0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkApplicationInfo_setApiVersion0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _apiVersion) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:471

		  VkApplicationInfo* vkObj = (VkApplicationInfo*)(ptr);
		 // code for simple past value 
		  vkObj->apiVersion = (uint32_t) (_apiVersion);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkApplicationInfo_getApiVersion0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:481

		  VkApplicationInfo* vkObj = (VkApplicationInfo*)(ptr);
		  return (jint) (vkObj->apiVersion);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkApplicationInfo_getApiVersion0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkApplicationInfo_getApiVersion0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

