#include <bor.vulkan.structs.VkDisplayModeCreateInfoKHR.h>

//@line:41

    #include <BorVulkan.hpp>
    JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDisplayModeCreateInfoKHR_setSType0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _sType) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:273

		  VkDisplayModeCreateInfoKHR* vkObj = (VkDisplayModeCreateInfoKHR*)(ptr);
		 // code for simple past value 
		  vkObj->sType = (VkStructureType) (_sType);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkDisplayModeCreateInfoKHR_getSType0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:283

		  VkDisplayModeCreateInfoKHR* vkObj = (VkDisplayModeCreateInfoKHR*)(ptr);
		  // generic get for Vk enums
		  return (jint) (vkObj->sType);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkDisplayModeCreateInfoKHR_getSType0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDisplayModeCreateInfoKHR_getSType0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDisplayModeCreateInfoKHR_setPNext0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__pNext) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _pNext = (char*)(obj__pNext?env->GetDirectBufferAddress(obj__pNext) : NULL);


//@line:293

		  VkDisplayModeCreateInfoKHR* vkObj = (VkDisplayModeCreateInfoKHR*)(ptr);
		 // code for Buffer - ptr to ptr 
		 const void* p_pNext = ( void*) _pNext; 
		 vkObj->pNext = p_pNext; 
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkDisplayModeCreateInfoKHR_getPNext0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:304

		  VkDisplayModeCreateInfoKHR* vkObj = (VkDisplayModeCreateInfoKHR*)(ptr);
		  // generic get for Buffer - field must be pointer! 
		  return (jlong) reinterpret_cast<jlong>(vkObj->pNext);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkDisplayModeCreateInfoKHR_getPNext0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDisplayModeCreateInfoKHR_getPNext0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDisplayModeCreateInfoKHR_setFlags0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _flags) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:314

		  VkDisplayModeCreateInfoKHR* vkObj = (VkDisplayModeCreateInfoKHR*)(ptr);
		 // code for simple past value 
		  vkObj->flags = (VkDisplayModeCreateFlagsKHR) (_flags);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkDisplayModeCreateInfoKHR_getFlags0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:324

		  VkDisplayModeCreateInfoKHR* vkObj = (VkDisplayModeCreateInfoKHR*)(ptr);
		  return (jint) (vkObj->flags);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkDisplayModeCreateInfoKHR_getFlags0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDisplayModeCreateInfoKHR_getFlags0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDisplayModeCreateInfoKHR_setParameters0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__parameters) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _parameters = (char*)(obj__parameters?env->GetDirectBufferAddress(obj__parameters) : NULL);


//@line:333

		  VkDisplayModeCreateInfoKHR* vkObj = (VkDisplayModeCreateInfoKHR*)(ptr);
		 // code for Buffer - ptr to struct 
		 VkDisplayModeParametersKHR* p_parameters = (VkDisplayModeParametersKHR*) _parameters; 
		 vkObj->parameters = (*p_parameters); 
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkDisplayModeCreateInfoKHR_getParameters0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:344

		  VkDisplayModeCreateInfoKHR* vkObj = (VkDisplayModeCreateInfoKHR*)(ptr);
		  // generic get for Buffer - field must be pointer! 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->parameters);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkDisplayModeCreateInfoKHR_getParameters0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDisplayModeCreateInfoKHR_getParameters0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

