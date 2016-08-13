#include <bor.vulkan.structs.VkImageFormatProperties.h>

//@line:42

    #include <BorVulkan.hpp>
    JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkImageFormatProperties_setMaxExtent0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__maxExtent) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _maxExtent = (char*)(obj__maxExtent?env->GetDirectBufferAddress(obj__maxExtent) : NULL);


//@line:283

		  VkImageFormatProperties* vkObj = (VkImageFormatProperties*)(ptr);
		 // code for Buffer - ptr to struct 
		 VkExtent3D* p_maxExtent = (VkExtent3D*) _maxExtent; 
		 vkObj->maxExtent = (*p_maxExtent); 
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkImageFormatProperties_getMaxExtent0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:294

		  VkImageFormatProperties* vkObj = (VkImageFormatProperties*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->maxExtent);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkImageFormatProperties_getMaxExtent0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkImageFormatProperties_getMaxExtent0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkImageFormatProperties_setMaxMipLevels0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _maxMipLevels) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:304

		  VkImageFormatProperties* vkObj = (VkImageFormatProperties*)(ptr);
		 // code for simple past value 
		  vkObj->maxMipLevels = (uint32_t) (_maxMipLevels);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkImageFormatProperties_getMaxMipLevels0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:314

		  VkImageFormatProperties* vkObj = (VkImageFormatProperties*)(ptr);
		  return (jint) (vkObj->maxMipLevels);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkImageFormatProperties_getMaxMipLevels0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkImageFormatProperties_getMaxMipLevels0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkImageFormatProperties_setMaxArrayLayers0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _maxArrayLayers) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:323

		  VkImageFormatProperties* vkObj = (VkImageFormatProperties*)(ptr);
		 // code for simple past value 
		  vkObj->maxArrayLayers = (uint32_t) (_maxArrayLayers);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkImageFormatProperties_getMaxArrayLayers0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:333

		  VkImageFormatProperties* vkObj = (VkImageFormatProperties*)(ptr);
		  return (jint) (vkObj->maxArrayLayers);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkImageFormatProperties_getMaxArrayLayers0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkImageFormatProperties_getMaxArrayLayers0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkImageFormatProperties_setSampleCounts0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _sampleCounts) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:342

		  VkImageFormatProperties* vkObj = (VkImageFormatProperties*)(ptr);
		 // code for simple past value 
		  vkObj->sampleCounts = (VkSampleCountFlags) (_sampleCounts);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkImageFormatProperties_getSampleCounts0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:352

		  VkImageFormatProperties* vkObj = (VkImageFormatProperties*)(ptr);
		  return (jint) (vkObj->sampleCounts);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkImageFormatProperties_getSampleCounts0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkImageFormatProperties_getSampleCounts0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkImageFormatProperties_setMaxResourceSize0(JNIEnv* env, jclass clazz, jobject obj_ptr, jlong _maxResourceSize) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:361

		  VkImageFormatProperties* vkObj = (VkImageFormatProperties*)(ptr);
		 // code for simple past value 
		  vkObj->maxResourceSize = (VkDeviceSize) (_maxResourceSize);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkImageFormatProperties_getMaxResourceSize0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:371

		  VkImageFormatProperties* vkObj = (VkImageFormatProperties*)(ptr);
		  return (jlong) (vkObj->maxResourceSize);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkImageFormatProperties_getMaxResourceSize0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkImageFormatProperties_getMaxResourceSize0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

