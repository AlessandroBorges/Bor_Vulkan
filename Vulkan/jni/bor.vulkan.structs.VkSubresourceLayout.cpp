#include <bor.vulkan.structs.VkSubresourceLayout.h>

//@line:42

    #include <BorVulkan.hpp>
    JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkSubresourceLayout_setOffset0(JNIEnv* env, jclass clazz, jobject obj_ptr, jlong _offset) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:273

		  VkSubresourceLayout* vkObj = (VkSubresourceLayout*)(ptr);
		 // code for simple past value 
		  vkObj->offset = (VkDeviceSize) (_offset);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkSubresourceLayout_getOffset0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:283

		  VkSubresourceLayout* vkObj = (VkSubresourceLayout*)(ptr);
		  return (jlong) (vkObj->offset);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkSubresourceLayout_getOffset0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkSubresourceLayout_getOffset0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkSubresourceLayout_setSize0(JNIEnv* env, jclass clazz, jobject obj_ptr, jlong _size) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:292

		  VkSubresourceLayout* vkObj = (VkSubresourceLayout*)(ptr);
		 // code for simple past value 
		  vkObj->size = (VkDeviceSize) (_size);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkSubresourceLayout_getSize0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:302

		  VkSubresourceLayout* vkObj = (VkSubresourceLayout*)(ptr);
		  return (jlong) (vkObj->size);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkSubresourceLayout_getSize0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkSubresourceLayout_getSize0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkSubresourceLayout_setRowPitch0(JNIEnv* env, jclass clazz, jobject obj_ptr, jlong _rowPitch) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:311

		  VkSubresourceLayout* vkObj = (VkSubresourceLayout*)(ptr);
		 // code for simple past value 
		  vkObj->rowPitch = (VkDeviceSize) (_rowPitch);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkSubresourceLayout_getRowPitch0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:321

		  VkSubresourceLayout* vkObj = (VkSubresourceLayout*)(ptr);
		  return (jlong) (vkObj->rowPitch);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkSubresourceLayout_getRowPitch0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkSubresourceLayout_getRowPitch0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkSubresourceLayout_setArrayPitch0(JNIEnv* env, jclass clazz, jobject obj_ptr, jlong _arrayPitch) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:330

		  VkSubresourceLayout* vkObj = (VkSubresourceLayout*)(ptr);
		 // code for simple past value 
		  vkObj->arrayPitch = (VkDeviceSize) (_arrayPitch);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkSubresourceLayout_getArrayPitch0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:340

		  VkSubresourceLayout* vkObj = (VkSubresourceLayout*)(ptr);
		  return (jlong) (vkObj->arrayPitch);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkSubresourceLayout_getArrayPitch0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkSubresourceLayout_getArrayPitch0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkSubresourceLayout_setDepthPitch0(JNIEnv* env, jclass clazz, jobject obj_ptr, jlong _depthPitch) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:349

		  VkSubresourceLayout* vkObj = (VkSubresourceLayout*)(ptr);
		 // code for simple past value 
		  vkObj->depthPitch = (VkDeviceSize) (_depthPitch);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkSubresourceLayout_getDepthPitch0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:359

		  VkSubresourceLayout* vkObj = (VkSubresourceLayout*)(ptr);
		  return (jlong) (vkObj->depthPitch);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkSubresourceLayout_getDepthPitch0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkSubresourceLayout_getDepthPitch0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

