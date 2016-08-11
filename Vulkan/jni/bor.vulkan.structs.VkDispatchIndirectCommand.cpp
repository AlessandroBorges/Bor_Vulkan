#include <bor.vulkan.structs.VkDispatchIndirectCommand.h>

//@line:40

    #include <BorVulkan.hpp>
    JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDispatchIndirectCommand_setX0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _x) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:211

		  VkDispatchIndirectCommand* vkObj = (VkDispatchIndirectCommand*)(ptr);
		 // code for simple past value 
		  vkObj->x = (uint32_t) (_x);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkDispatchIndirectCommand_getX0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:221

		  VkDispatchIndirectCommand* vkObj = (VkDispatchIndirectCommand*)(ptr);
		  return (jint) (vkObj->x);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkDispatchIndirectCommand_getX0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDispatchIndirectCommand_getX0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDispatchIndirectCommand_setY0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _y) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:230

		  VkDispatchIndirectCommand* vkObj = (VkDispatchIndirectCommand*)(ptr);
		 // code for simple past value 
		  vkObj->y = (uint32_t) (_y);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkDispatchIndirectCommand_getY0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:240

		  VkDispatchIndirectCommand* vkObj = (VkDispatchIndirectCommand*)(ptr);
		  return (jint) (vkObj->y);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkDispatchIndirectCommand_getY0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDispatchIndirectCommand_getY0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDispatchIndirectCommand_setZ0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _z) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:249

		  VkDispatchIndirectCommand* vkObj = (VkDispatchIndirectCommand*)(ptr);
		 // code for simple past value 
		  vkObj->z = (uint32_t) (_z);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkDispatchIndirectCommand_getZ0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:259

		  VkDispatchIndirectCommand* vkObj = (VkDispatchIndirectCommand*)(ptr);
		  return (jint) (vkObj->z);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkDispatchIndirectCommand_getZ0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDispatchIndirectCommand_getZ0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

