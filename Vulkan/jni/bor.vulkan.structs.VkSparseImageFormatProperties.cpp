#include <bor.vulkan.structs.VkSparseImageFormatProperties.h>

//@line:40

    #include <BorVulkan.hpp>
    JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkSparseImageFormatProperties_setAspectMask0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _aspectMask) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:232

		  VkSparseImageFormatProperties* vkObj = (VkSparseImageFormatProperties*)(ptr);
		 // code for simple past value 
		  vkObj->aspectMask = (VkImageAspectFlags) (_aspectMask);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkSparseImageFormatProperties_getAspectMask0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:242

		  VkSparseImageFormatProperties* vkObj = (VkSparseImageFormatProperties*)(ptr);
		  return (jint) (vkObj->aspectMask);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkSparseImageFormatProperties_getAspectMask0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkSparseImageFormatProperties_getAspectMask0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkSparseImageFormatProperties_setImageGranularity0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__imageGranularity) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _imageGranularity = (char*)(obj__imageGranularity?env->GetDirectBufferAddress(obj__imageGranularity) : NULL);


//@line:251

		  VkSparseImageFormatProperties* vkObj = (VkSparseImageFormatProperties*)(ptr);
		 // code for Buffer - ptr to struct 
		 VkExtent3D* p_imageGranularity = (VkExtent3D*) _imageGranularity; 
		 vkObj->imageGranularity = (*p_imageGranularity); 
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkSparseImageFormatProperties_getImageGranularity0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:262

		  VkSparseImageFormatProperties* vkObj = (VkSparseImageFormatProperties*)(ptr);
		  // generic get for Buffer - field must be pointer! 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->imageGranularity);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkSparseImageFormatProperties_getImageGranularity0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkSparseImageFormatProperties_getImageGranularity0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkSparseImageFormatProperties_setFlags0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _flags) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:272

		  VkSparseImageFormatProperties* vkObj = (VkSparseImageFormatProperties*)(ptr);
		 // code for simple past value 
		  vkObj->flags = (VkSparseImageFormatFlags) (_flags);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkSparseImageFormatProperties_getFlags0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:282

		  VkSparseImageFormatProperties* vkObj = (VkSparseImageFormatProperties*)(ptr);
		  return (jint) (vkObj->flags);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkSparseImageFormatProperties_getFlags0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkSparseImageFormatProperties_getFlags0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

