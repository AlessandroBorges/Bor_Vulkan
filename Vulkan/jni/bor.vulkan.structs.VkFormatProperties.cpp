#include <bor.vulkan.structs.VkFormatProperties.h>

//@line:40

    #include <BorVulkan.hpp>
    JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkFormatProperties_setLinearTilingFeatures0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _linearTilingFeatures) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:211

		  VkFormatProperties* vkObj = (VkFormatProperties*)(ptr);
		 // code for simple past value 
		  vkObj->linearTilingFeatures = (VkFormatFeatureFlags) (_linearTilingFeatures);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkFormatProperties_getLinearTilingFeatures0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:221

		  VkFormatProperties* vkObj = (VkFormatProperties*)(ptr);
		  return (jint) (vkObj->linearTilingFeatures);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkFormatProperties_getLinearTilingFeatures0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkFormatProperties_getLinearTilingFeatures0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkFormatProperties_setOptimalTilingFeatures0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _optimalTilingFeatures) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:230

		  VkFormatProperties* vkObj = (VkFormatProperties*)(ptr);
		 // code for simple past value 
		  vkObj->optimalTilingFeatures = (VkFormatFeatureFlags) (_optimalTilingFeatures);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkFormatProperties_getOptimalTilingFeatures0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:240

		  VkFormatProperties* vkObj = (VkFormatProperties*)(ptr);
		  return (jint) (vkObj->optimalTilingFeatures);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkFormatProperties_getOptimalTilingFeatures0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkFormatProperties_getOptimalTilingFeatures0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkFormatProperties_setBufferFeatures0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _bufferFeatures) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:249

		  VkFormatProperties* vkObj = (VkFormatProperties*)(ptr);
		 // code for simple past value 
		  vkObj->bufferFeatures = (VkFormatFeatureFlags) (_bufferFeatures);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkFormatProperties_getBufferFeatures0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:259

		  VkFormatProperties* vkObj = (VkFormatProperties*)(ptr);
		  return (jint) (vkObj->bufferFeatures);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkFormatProperties_getBufferFeatures0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkFormatProperties_getBufferFeatures0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

