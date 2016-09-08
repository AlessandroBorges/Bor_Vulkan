#include <bor.vulkan.structs.VkDisplayModePropertiesKHR.h>

//@line:39

    #include <BorVulkan.hpp>
    JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDisplayModePropertiesKHR_setDisplayMode0(JNIEnv* env, jclass clazz, jobject obj_ptr, jlong _displayMode) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:212

		  VkDisplayModePropertiesKHR* vkObj = (VkDisplayModePropertiesKHR*)(ptr);
		 // code for simple past value 
		  vkObj->displayMode = (VkDisplayModeKHR) (_displayMode);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkDisplayModePropertiesKHR_getDisplayMode0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:222

		  VkDisplayModePropertiesKHR* vkObj = (VkDisplayModePropertiesKHR*)(ptr);
		  // generic get for struct field of type  VkHandle or VkStruct 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->displayMode);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkDisplayModePropertiesKHR_getDisplayMode0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDisplayModePropertiesKHR_getDisplayMode0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDisplayModePropertiesKHR_setParameters0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__parameters) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _parameters = (char*)(obj__parameters?env->GetDirectBufferAddress(obj__parameters) : NULL);


//@line:232

		  VkDisplayModePropertiesKHR* vkObj = (VkDisplayModePropertiesKHR*)(ptr);
		 // code for Buffer - ptr to struct 
		 VkDisplayModeParametersKHR* p_parameters = (VkDisplayModeParametersKHR*) _parameters; 
		 vkObj->parameters = (*p_parameters); 
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkDisplayModePropertiesKHR_getParameters0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:243

		  VkDisplayModePropertiesKHR* vkObj = (VkDisplayModePropertiesKHR*)(ptr);
		  // generic get for Buffer - field must be pointer! 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->parameters);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkDisplayModePropertiesKHR_getParameters0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDisplayModePropertiesKHR_getParameters0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

