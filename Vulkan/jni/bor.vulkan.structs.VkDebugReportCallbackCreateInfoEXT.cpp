#include <bor.vulkan.structs.VkDebugReportCallbackCreateInfoEXT.h>

//@line:42

    #include <BorVulkan.hpp>
    JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDebugReportCallbackCreateInfoEXT_setSType0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _sType) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:297

		  VkDebugReportCallbackCreateInfoEXT* vkObj = (VkDebugReportCallbackCreateInfoEXT*)(ptr);
		 // code for simple past value 
		  vkObj->sType = (VkStructureType) (_sType);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkDebugReportCallbackCreateInfoEXT_getSType0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:307

		  VkDebugReportCallbackCreateInfoEXT* vkObj = (VkDebugReportCallbackCreateInfoEXT*)(ptr);
		  return (VkStructureType) (vkObj->sType);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkDebugReportCallbackCreateInfoEXT_getSType0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDebugReportCallbackCreateInfoEXT_getSType0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDebugReportCallbackCreateInfoEXT_setPNext0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__pNext) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _pNext = (char*)(obj__pNext?env->GetDirectBufferAddress(obj__pNext) : NULL);


//@line:316

		  VkDebugReportCallbackCreateInfoEXT* vkObj = (VkDebugReportCallbackCreateInfoEXT*)(ptr);
		 // code for Buffer - referenced by ptr
		  vkObj->pNext = (const void*) (_pNext);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkDebugReportCallbackCreateInfoEXT_getPNext0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:326

		  VkDebugReportCallbackCreateInfoEXT* vkObj = (VkDebugReportCallbackCreateInfoEXT*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->pNext);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkDebugReportCallbackCreateInfoEXT_getPNext0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDebugReportCallbackCreateInfoEXT_getPNext0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDebugReportCallbackCreateInfoEXT_setFlags0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _flags) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:336

		  VkDebugReportCallbackCreateInfoEXT* vkObj = (VkDebugReportCallbackCreateInfoEXT*)(ptr);
		 // code for simple past value 
		  vkObj->flags = (VkDebugReportFlagsEXT) (_flags);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkDebugReportCallbackCreateInfoEXT_getFlags0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:346

		  VkDebugReportCallbackCreateInfoEXT* vkObj = (VkDebugReportCallbackCreateInfoEXT*)(ptr);
		  return (jint) (vkObj->flags);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkDebugReportCallbackCreateInfoEXT_getFlags0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDebugReportCallbackCreateInfoEXT_getFlags0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDebugReportCallbackCreateInfoEXT_setPfnCallback0(JNIEnv* env, jclass clazz, jobject obj_ptr, jlong _pfnCallback) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:355

		  VkDebugReportCallbackCreateInfoEXT* vkObj = (VkDebugReportCallbackCreateInfoEXT*)(ptr);
		 // code for simple past value 
		  vkObj->pfnCallback = (PFN_vkDebugReportCallbackEXT) (_pfnCallback);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkDebugReportCallbackCreateInfoEXT_getPfnCallback0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:365

		  VkDebugReportCallbackCreateInfoEXT* vkObj = (VkDebugReportCallbackCreateInfoEXT*)(ptr);
		  // generic get for struct field of type  VkHandle or VkStruct 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->pfnCallback);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkDebugReportCallbackCreateInfoEXT_getPfnCallback0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDebugReportCallbackCreateInfoEXT_getPfnCallback0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDebugReportCallbackCreateInfoEXT_setPUserData0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__pUserData) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	unsigned char* _pUserData = (unsigned char*)(obj__pUserData?env->GetDirectBufferAddress(obj__pUserData) : NULL);


//@line:375

		  VkDebugReportCallbackCreateInfoEXT* vkObj = (VkDebugReportCallbackCreateInfoEXT*)(ptr);
		 // code for Buffer - referenced by ptr
		  vkObj->pUserData = (void*) (_pUserData);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkDebugReportCallbackCreateInfoEXT_getPUserData0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:385

		  VkDebugReportCallbackCreateInfoEXT* vkObj = (VkDebugReportCallbackCreateInfoEXT*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->pUserData);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkDebugReportCallbackCreateInfoEXT_getPUserData0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDebugReportCallbackCreateInfoEXT_getPUserData0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

