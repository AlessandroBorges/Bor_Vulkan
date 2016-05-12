#include <bor.vulkan.structs.VkExtent2D.h>

//@line:38

    #include <BorVulkan.hpp>
    JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkExtent2D_setWidth0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _width) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr):0);


//@line:201

		  VkExtent2D* vkObj = (VkExtent2D*)(ptr);
		  vkObj->width = (uint32_t) (_width);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkExtent2D_getWidth0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:210

		  VkExtent2D* vkObj = (VkExtent2D*)(ptr);
		  return (jint) (vkObj->width);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkExtent2D_getWidth0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr):0);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkExtent2D_getWidth0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkExtent2D_setHeight0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _height) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr):0);


//@line:219

		  VkExtent2D* vkObj = (VkExtent2D*)(ptr);
		  vkObj->height = (uint32_t) (_height);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkExtent2D_getHeight0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:228

		  VkExtent2D* vkObj = (VkExtent2D*)(ptr);
		  return (jint) (vkObj->height);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkExtent2D_getHeight0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr):0);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkExtent2D_getHeight0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

