#include <bor.vulkan.structs.VkQueueFamilyProperties.h>

//@line:40

    #include <BorVulkan.hpp>
    JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkQueueFamilyProperties_setQueueFlags0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _queueFlags) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:269

		  VkQueueFamilyProperties* vkObj = (VkQueueFamilyProperties*)(ptr);
		  vkObj->queueFlags = (VkQueueFlags) (_queueFlags);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkQueueFamilyProperties_getQueueFlags0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:278

		  VkQueueFamilyProperties* vkObj = (VkQueueFamilyProperties*)(ptr);
		  return (jint) (vkObj->queueFlags);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkQueueFamilyProperties_getQueueFlags0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkQueueFamilyProperties_getQueueFlags0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkQueueFamilyProperties_setQueueCount0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _queueCount) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:287

		  VkQueueFamilyProperties* vkObj = (VkQueueFamilyProperties*)(ptr);
		  vkObj->queueCount = (uint32_t) (_queueCount);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkQueueFamilyProperties_getQueueCount0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:296

		  VkQueueFamilyProperties* vkObj = (VkQueueFamilyProperties*)(ptr);
		  return (jint) (vkObj->queueCount);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkQueueFamilyProperties_getQueueCount0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkQueueFamilyProperties_getQueueCount0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkQueueFamilyProperties_setTimestampValidBits0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _timestampValidBits) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:305

		  VkQueueFamilyProperties* vkObj = (VkQueueFamilyProperties*)(ptr);
		  vkObj->timestampValidBits = (uint32_t) (_timestampValidBits);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkQueueFamilyProperties_getTimestampValidBits0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:314

		  VkQueueFamilyProperties* vkObj = (VkQueueFamilyProperties*)(ptr);
		  return (jint) (vkObj->timestampValidBits);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkQueueFamilyProperties_getTimestampValidBits0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkQueueFamilyProperties_getTimestampValidBits0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkQueueFamilyProperties_setMinImageTransferGranularity0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__minImageTransferGranularity) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _minImageTransferGranularity = (char*)(obj__minImageTransferGranularity?env->GetDirectBufferAddress(obj__minImageTransferGranularity) : NULL);


//@line:323

		  VkQueueFamilyProperties* vkObj = (VkQueueFamilyProperties*)(ptr);
		  VkExtent3D* pObj  = (VkExtent3D*) _minImageTransferGranularity;
		  VkExtent3D obj = (VkExtent3D)(*pObj);
		  vkObj->minImageTransferGranularity = (VkExtent3D) (obj);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkQueueFamilyProperties_getMinImageTransferGranularity0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:334

		  VkQueueFamilyProperties* vkObj = (VkQueueFamilyProperties*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(&vkObj->minImageTransferGranularity);
		  
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkQueueFamilyProperties_getMinImageTransferGranularity0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkQueueFamilyProperties_getMinImageTransferGranularity0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

