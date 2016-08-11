#include <bor.vulkan.structs.VkExtent3D.h>

//@line:40

    #include <BorVulkan.hpp>
    JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkExtent3D_setWidth0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _width) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:211

		  VkExtent3D* vkObj = (VkExtent3D*)(ptr);
		 // code for simple past value 
		  vkObj->width = (uint32_t) (_width);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkExtent3D_getWidth0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:221

		  VkExtent3D* vkObj = (VkExtent3D*)(ptr);
		  return (jint) (vkObj->width);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkExtent3D_getWidth0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkExtent3D_getWidth0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkExtent3D_setHeight0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _height) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:230

		  VkExtent3D* vkObj = (VkExtent3D*)(ptr);
		 // code for simple past value 
		  vkObj->height = (uint32_t) (_height);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkExtent3D_getHeight0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:240

		  VkExtent3D* vkObj = (VkExtent3D*)(ptr);
		  return (jint) (vkObj->height);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkExtent3D_getHeight0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkExtent3D_getHeight0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkExtent3D_setDepth0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _depth) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:249

		  VkExtent3D* vkObj = (VkExtent3D*)(ptr);
		 // code for simple past value 
		  vkObj->depth = (uint32_t) (_depth);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkExtent3D_getDepth0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:259

		  VkExtent3D* vkObj = (VkExtent3D*)(ptr);
		  return (jint) (vkObj->depth);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkExtent3D_getDepth0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkExtent3D_getDepth0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

