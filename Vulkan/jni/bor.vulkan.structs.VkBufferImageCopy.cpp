#include <bor.vulkan.structs.VkBufferImageCopy.h>

//@line:43

    #include <BorVulkan.hpp>
    JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkBufferImageCopy_setBufferOffset0(JNIEnv* env, jclass clazz, jobject obj_ptr, jlong _bufferOffset) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:334

		  VkBufferImageCopy* vkObj = (VkBufferImageCopy*)(ptr);
		 // code for simple past value 
		  vkObj->bufferOffset = (VkDeviceSize) (_bufferOffset);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkBufferImageCopy_getBufferOffset0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:344

		  VkBufferImageCopy* vkObj = (VkBufferImageCopy*)(ptr);
		  return (jlong) (vkObj->bufferOffset);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkBufferImageCopy_getBufferOffset0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkBufferImageCopy_getBufferOffset0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkBufferImageCopy_setBufferRowLength0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _bufferRowLength) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:353

		  VkBufferImageCopy* vkObj = (VkBufferImageCopy*)(ptr);
		 // code for simple past value 
		  vkObj->bufferRowLength = (uint32_t) (_bufferRowLength);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkBufferImageCopy_getBufferRowLength0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:363

		  VkBufferImageCopy* vkObj = (VkBufferImageCopy*)(ptr);
		  return (jint) (vkObj->bufferRowLength);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkBufferImageCopy_getBufferRowLength0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkBufferImageCopy_getBufferRowLength0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkBufferImageCopy_setBufferImageHeight0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _bufferImageHeight) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:372

		  VkBufferImageCopy* vkObj = (VkBufferImageCopy*)(ptr);
		 // code for simple past value 
		  vkObj->bufferImageHeight = (uint32_t) (_bufferImageHeight);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkBufferImageCopy_getBufferImageHeight0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:382

		  VkBufferImageCopy* vkObj = (VkBufferImageCopy*)(ptr);
		  return (jint) (vkObj->bufferImageHeight);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkBufferImageCopy_getBufferImageHeight0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkBufferImageCopy_getBufferImageHeight0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkBufferImageCopy_setImageSubresource0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__imageSubresource) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _imageSubresource = (char*)(obj__imageSubresource?env->GetDirectBufferAddress(obj__imageSubresource) : NULL);


//@line:391

		  VkBufferImageCopy* vkObj = (VkBufferImageCopy*)(ptr);
		 // code for Buffer - ptr to struct 
		 VkImageSubresourceLayers* p_imageSubresource = (VkImageSubresourceLayers*) _imageSubresource; 
		 vkObj->imageSubresource = (*p_imageSubresource); 
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkBufferImageCopy_getImageSubresource0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:402

		  VkBufferImageCopy* vkObj = (VkBufferImageCopy*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->imageSubresource);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkBufferImageCopy_getImageSubresource0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkBufferImageCopy_getImageSubresource0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkBufferImageCopy_setImageOffset0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__imageOffset) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _imageOffset = (char*)(obj__imageOffset?env->GetDirectBufferAddress(obj__imageOffset) : NULL);


//@line:412

		  VkBufferImageCopy* vkObj = (VkBufferImageCopy*)(ptr);
		 // code for Buffer - ptr to struct 
		 VkOffset3D* p_imageOffset = (VkOffset3D*) _imageOffset; 
		 vkObj->imageOffset = (*p_imageOffset); 
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkBufferImageCopy_getImageOffset0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:423

		  VkBufferImageCopy* vkObj = (VkBufferImageCopy*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->imageOffset);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkBufferImageCopy_getImageOffset0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkBufferImageCopy_getImageOffset0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkBufferImageCopy_setImageExtent0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__imageExtent) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _imageExtent = (char*)(obj__imageExtent?env->GetDirectBufferAddress(obj__imageExtent) : NULL);


//@line:433

		  VkBufferImageCopy* vkObj = (VkBufferImageCopy*)(ptr);
		 // code for Buffer - ptr to struct 
		 VkExtent3D* p_imageExtent = (VkExtent3D*) _imageExtent; 
		 vkObj->imageExtent = (*p_imageExtent); 
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkBufferImageCopy_getImageExtent0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:444

		  VkBufferImageCopy* vkObj = (VkBufferImageCopy*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->imageExtent);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkBufferImageCopy_getImageExtent0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkBufferImageCopy_getImageExtent0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

