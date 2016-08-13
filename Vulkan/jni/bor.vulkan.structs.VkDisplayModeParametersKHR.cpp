#include <bor.vulkan.structs.VkDisplayModeParametersKHR.h>

//@line:39

    #include <BorVulkan.hpp>
    JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDisplayModeParametersKHR_setVisibleRegion0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__visibleRegion) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _visibleRegion = (char*)(obj__visibleRegion?env->GetDirectBufferAddress(obj__visibleRegion) : NULL);


//@line:190

		  VkDisplayModeParametersKHR* vkObj = (VkDisplayModeParametersKHR*)(ptr);
		 // code for Buffer - ptr to struct 
		 VkExtent2D* p_visibleRegion = (VkExtent2D*) _visibleRegion; 
		 vkObj->visibleRegion = (*p_visibleRegion); 
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkDisplayModeParametersKHR_getVisibleRegion0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:201

		  VkDisplayModeParametersKHR* vkObj = (VkDisplayModeParametersKHR*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->visibleRegion);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkDisplayModeParametersKHR_getVisibleRegion0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDisplayModeParametersKHR_getVisibleRegion0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDisplayModeParametersKHR_setRefreshRate0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _refreshRate) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:211

		  VkDisplayModeParametersKHR* vkObj = (VkDisplayModeParametersKHR*)(ptr);
		 // code for simple past value 
		  vkObj->refreshRate = (uint32_t) (_refreshRate);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkDisplayModeParametersKHR_getRefreshRate0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:221

		  VkDisplayModeParametersKHR* vkObj = (VkDisplayModeParametersKHR*)(ptr);
		  return (jint) (vkObj->refreshRate);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkDisplayModeParametersKHR_getRefreshRate0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDisplayModeParametersKHR_getRefreshRate0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

