#include <bor.vulkan.structs.VkQueueFamilyProperties.h>

//@line:41

    #include <BorVulkan.hpp>
    JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkQueueFamilyProperties_setQueueFlags0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _queueFlags) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:263

		  VkQueueFamilyProperties* vkObj = (VkQueueFamilyProperties*)(ptr);
		 // code for simple past value 
		  vkObj->queueFlags = (VkQueueFlags) (_queueFlags);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkQueueFamilyProperties_getQueueFlags0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:273

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


//@line:282

		  VkQueueFamilyProperties* vkObj = (VkQueueFamilyProperties*)(ptr);
		 // code for simple past value 
		  vkObj->queueCount = (uint32_t) (_queueCount);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkQueueFamilyProperties_getQueueCount0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:292

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


//@line:301

		  VkQueueFamilyProperties* vkObj = (VkQueueFamilyProperties*)(ptr);
		 // code for simple past value 
		  vkObj->timestampValidBits = (uint32_t) (_timestampValidBits);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkQueueFamilyProperties_getTimestampValidBits0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:311

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


//@line:320

		  VkQueueFamilyProperties* vkObj = (VkQueueFamilyProperties*)(ptr);
		 // code for Buffer - ptr to struct 
		 VkExtent3D* p_minImageTransferGranularity = (VkExtent3D*) _minImageTransferGranularity; 
		 vkObj->minImageTransferGranularity = (*p_minImageTransferGranularity); 
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkQueueFamilyProperties_getMinImageTransferGranularity0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:331

		  VkQueueFamilyProperties* vkObj = (VkQueueFamilyProperties*)(ptr);
		  // generic get for Buffer - field must be pointer! 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->minImageTransferGranularity);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkQueueFamilyProperties_getMinImageTransferGranularity0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkQueueFamilyProperties_getMinImageTransferGranularity0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

