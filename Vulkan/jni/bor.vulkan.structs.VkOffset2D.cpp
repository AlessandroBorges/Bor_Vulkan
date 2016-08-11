#include <bor.vulkan.structs.VkOffset2D.h>

//@line:39

    #include <BorVulkan.hpp>
    JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkOffset2D_setX0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _x) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:180

		  VkOffset2D* vkObj = (VkOffset2D*)(ptr);
		 // code for simple past value 
		  vkObj->x = (int32_t) (_x);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkOffset2D_getX0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:190

		  VkOffset2D* vkObj = (VkOffset2D*)(ptr);
		  return (jint) (vkObj->x);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkOffset2D_getX0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkOffset2D_getX0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkOffset2D_setY0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _y) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:199

		  VkOffset2D* vkObj = (VkOffset2D*)(ptr);
		 // code for simple past value 
		  vkObj->y = (int32_t) (_y);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkOffset2D_getY0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:209

		  VkOffset2D* vkObj = (VkOffset2D*)(ptr);
		  return (jint) (vkObj->y);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkOffset2D_getY0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkOffset2D_getY0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

