#include <bor.vulkan.structs.VkSparseImageMemoryRequirements.h>

//@line:42

    #include <BorVulkan.hpp>
    JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkSparseImageMemoryRequirements_setFormatProperties0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__formatProperties) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _formatProperties = (char*)(obj__formatProperties?env->GetDirectBufferAddress(obj__formatProperties) : NULL);


//@line:283

		  VkSparseImageMemoryRequirements* vkObj = (VkSparseImageMemoryRequirements*)(ptr);
		 // code for Buffer - ptr to struct 
		 VkSparseImageFormatProperties* p_formatProperties = (VkSparseImageFormatProperties*) _formatProperties; 
		 vkObj->formatProperties = (*p_formatProperties); 
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkSparseImageMemoryRequirements_getFormatProperties0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:294

		  VkSparseImageMemoryRequirements* vkObj = (VkSparseImageMemoryRequirements*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->formatProperties);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkSparseImageMemoryRequirements_getFormatProperties0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkSparseImageMemoryRequirements_getFormatProperties0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkSparseImageMemoryRequirements_setImageMipTailFirstLod0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _imageMipTailFirstLod) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:304

		  VkSparseImageMemoryRequirements* vkObj = (VkSparseImageMemoryRequirements*)(ptr);
		 // code for simple past value 
		  vkObj->imageMipTailFirstLod = (uint32_t) (_imageMipTailFirstLod);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkSparseImageMemoryRequirements_getImageMipTailFirstLod0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:314

		  VkSparseImageMemoryRequirements* vkObj = (VkSparseImageMemoryRequirements*)(ptr);
		  return (jint) (vkObj->imageMipTailFirstLod);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkSparseImageMemoryRequirements_getImageMipTailFirstLod0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkSparseImageMemoryRequirements_getImageMipTailFirstLod0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkSparseImageMemoryRequirements_setImageMipTailSize0(JNIEnv* env, jclass clazz, jobject obj_ptr, jlong _imageMipTailSize) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:323

		  VkSparseImageMemoryRequirements* vkObj = (VkSparseImageMemoryRequirements*)(ptr);
		 // code for simple past value 
		  vkObj->imageMipTailSize = (VkDeviceSize) (_imageMipTailSize);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkSparseImageMemoryRequirements_getImageMipTailSize0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:333

		  VkSparseImageMemoryRequirements* vkObj = (VkSparseImageMemoryRequirements*)(ptr);
		  return (jlong) (vkObj->imageMipTailSize);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkSparseImageMemoryRequirements_getImageMipTailSize0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkSparseImageMemoryRequirements_getImageMipTailSize0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkSparseImageMemoryRequirements_setImageMipTailOffset0(JNIEnv* env, jclass clazz, jobject obj_ptr, jlong _imageMipTailOffset) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:342

		  VkSparseImageMemoryRequirements* vkObj = (VkSparseImageMemoryRequirements*)(ptr);
		 // code for simple past value 
		  vkObj->imageMipTailOffset = (VkDeviceSize) (_imageMipTailOffset);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkSparseImageMemoryRequirements_getImageMipTailOffset0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:352

		  VkSparseImageMemoryRequirements* vkObj = (VkSparseImageMemoryRequirements*)(ptr);
		  return (jlong) (vkObj->imageMipTailOffset);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkSparseImageMemoryRequirements_getImageMipTailOffset0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkSparseImageMemoryRequirements_getImageMipTailOffset0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkSparseImageMemoryRequirements_setImageMipTailStride0(JNIEnv* env, jclass clazz, jobject obj_ptr, jlong _imageMipTailStride) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:361

		  VkSparseImageMemoryRequirements* vkObj = (VkSparseImageMemoryRequirements*)(ptr);
		 // code for simple past value 
		  vkObj->imageMipTailStride = (VkDeviceSize) (_imageMipTailStride);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkSparseImageMemoryRequirements_getImageMipTailStride0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:371

		  VkSparseImageMemoryRequirements* vkObj = (VkSparseImageMemoryRequirements*)(ptr);
		  return (jlong) (vkObj->imageMipTailStride);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkSparseImageMemoryRequirements_getImageMipTailStride0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkSparseImageMemoryRequirements_getImageMipTailStride0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

