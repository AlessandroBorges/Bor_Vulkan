#include <bor.vulkan.structs.VkOffset3D.h>

//@line:40

    #include <BorVulkan.hpp>
    JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkOffset3D_setX0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _x) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:222

		  VkOffset3D* vkObj = (VkOffset3D*)(ptr);
		 // code for simple past value 
		  vkObj->x = (int32_t) (_x);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkOffset3D_getX0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:232

		  VkOffset3D* vkObj = (VkOffset3D*)(ptr);
		  return (jint) (vkObj->x);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkOffset3D_getX0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkOffset3D_getX0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkOffset3D_setY0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _y) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:241

		  VkOffset3D* vkObj = (VkOffset3D*)(ptr);
		 // code for simple past value 
		  vkObj->y = (int32_t) (_y);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkOffset3D_getY0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:251

		  VkOffset3D* vkObj = (VkOffset3D*)(ptr);
		  return (jint) (vkObj->y);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkOffset3D_getY0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkOffset3D_getY0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkOffset3D_setZ0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _z) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:260

		  VkOffset3D* vkObj = (VkOffset3D*)(ptr);
		 // code for simple past value 
		  vkObj->z = (int32_t) (_z);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkOffset3D_getZ0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:270

		  VkOffset3D* vkObj = (VkOffset3D*)(ptr);
		  return (jint) (vkObj->z);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkOffset3D_getZ0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkOffset3D_getZ0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

