#include <bor.vulkan.structs.VkBufferCopy.h>

//@line:40

    #include <BorVulkan.hpp>
    JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkBufferCopy_setSrcOffset0(JNIEnv* env, jclass clazz, jobject obj_ptr, jlong _srcOffset) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:222

		  VkBufferCopy* vkObj = (VkBufferCopy*)(ptr);
		 // code for simple past value 
		  vkObj->srcOffset = (VkDeviceSize) (_srcOffset);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkBufferCopy_getSrcOffset0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:232

		  VkBufferCopy* vkObj = (VkBufferCopy*)(ptr);
		  return (jlong) (vkObj->srcOffset);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkBufferCopy_getSrcOffset0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkBufferCopy_getSrcOffset0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkBufferCopy_setDstOffset0(JNIEnv* env, jclass clazz, jobject obj_ptr, jlong _dstOffset) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:241

		  VkBufferCopy* vkObj = (VkBufferCopy*)(ptr);
		 // code for simple past value 
		  vkObj->dstOffset = (VkDeviceSize) (_dstOffset);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkBufferCopy_getDstOffset0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:251

		  VkBufferCopy* vkObj = (VkBufferCopy*)(ptr);
		  return (jlong) (vkObj->dstOffset);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkBufferCopy_getDstOffset0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkBufferCopy_getDstOffset0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkBufferCopy_setSize0(JNIEnv* env, jclass clazz, jobject obj_ptr, jlong _size) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:260

		  VkBufferCopy* vkObj = (VkBufferCopy*)(ptr);
		 // code for simple past value 
		  vkObj->size = (VkDeviceSize) (_size);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkBufferCopy_getSize0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:270

		  VkBufferCopy* vkObj = (VkBufferCopy*)(ptr);
		  return (jlong) (vkObj->size);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkBufferCopy_getSize0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkBufferCopy_getSize0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

