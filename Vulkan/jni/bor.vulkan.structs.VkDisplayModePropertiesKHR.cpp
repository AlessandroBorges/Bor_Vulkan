#include <bor.vulkan.structs.VkDisplayModePropertiesKHR.h>

//@line:39

    #include <BorVulkan.hpp>
    JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDisplayModePropertiesKHR_setDisplayMode0(JNIEnv* env, jclass clazz, jobject obj_ptr, jlong _displayMode) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:201

		  VkDisplayModePropertiesKHR* vkObj = (VkDisplayModePropertiesKHR*)(ptr);
		 // code for simple past value 
		  vkObj->displayMode = (VkDisplayModeKHR) (_displayMode);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkDisplayModePropertiesKHR_getDisplayMode0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:211

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


//@line:221

		  VkDisplayModePropertiesKHR* vkObj = (VkDisplayModePropertiesKHR*)(ptr);
		 // code for Buffer - referenced by ptr
		  vkObj->parameters = (VkDisplayModeParametersKHR) (_parameters);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkDisplayModePropertiesKHR_getParameters0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:231

		  VkDisplayModePropertiesKHR* vkObj = (VkDisplayModePropertiesKHR*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->parameters);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkDisplayModePropertiesKHR_getParameters0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDisplayModePropertiesKHR_getParameters0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

