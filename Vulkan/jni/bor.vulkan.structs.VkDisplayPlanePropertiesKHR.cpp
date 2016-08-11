#include <bor.vulkan.structs.VkDisplayPlanePropertiesKHR.h>

//@line:39

    #include <BorVulkan.hpp>
    JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDisplayPlanePropertiesKHR_setCurrentDisplay0(JNIEnv* env, jclass clazz, jobject obj_ptr, jlong _currentDisplay) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:191

		  VkDisplayPlanePropertiesKHR* vkObj = (VkDisplayPlanePropertiesKHR*)(ptr);
		 // code for simple past value 
		  vkObj->currentDisplay = (VkDisplayKHR) (_currentDisplay);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkDisplayPlanePropertiesKHR_getCurrentDisplay0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:201

		  VkDisplayPlanePropertiesKHR* vkObj = (VkDisplayPlanePropertiesKHR*)(ptr);
		  // generic get for struct field of type  VkHandle or VkStruct 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->currentDisplay);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkDisplayPlanePropertiesKHR_getCurrentDisplay0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDisplayPlanePropertiesKHR_getCurrentDisplay0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDisplayPlanePropertiesKHR_setCurrentStackIndex0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _currentStackIndex) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:211

		  VkDisplayPlanePropertiesKHR* vkObj = (VkDisplayPlanePropertiesKHR*)(ptr);
		 // code for simple past value 
		  vkObj->currentStackIndex = (uint32_t) (_currentStackIndex);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkDisplayPlanePropertiesKHR_getCurrentStackIndex0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:221

		  VkDisplayPlanePropertiesKHR* vkObj = (VkDisplayPlanePropertiesKHR*)(ptr);
		  return (jint) (vkObj->currentStackIndex);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkDisplayPlanePropertiesKHR_getCurrentStackIndex0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDisplayPlanePropertiesKHR_getCurrentStackIndex0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

