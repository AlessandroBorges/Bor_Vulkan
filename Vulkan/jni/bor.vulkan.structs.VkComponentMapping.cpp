#include <bor.vulkan.structs.VkComponentMapping.h>

//@line:41

    #include <BorVulkan.hpp>
    JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkComponentMapping_setR0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _r) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:246

		  VkComponentMapping* vkObj = (VkComponentMapping*)(ptr);
		 // code for simple past value 
		  vkObj->r = (VkComponentSwizzle) (_r);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkComponentMapping_getR0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:256

		  VkComponentMapping* vkObj = (VkComponentMapping*)(ptr);
		  return (VkComponentSwizzle) (vkObj->r);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkComponentMapping_getR0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkComponentMapping_getR0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkComponentMapping_setG0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _g) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:265

		  VkComponentMapping* vkObj = (VkComponentMapping*)(ptr);
		 // code for simple past value 
		  vkObj->g = (VkComponentSwizzle) (_g);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkComponentMapping_getG0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:275

		  VkComponentMapping* vkObj = (VkComponentMapping*)(ptr);
		  return (VkComponentSwizzle) (vkObj->g);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkComponentMapping_getG0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkComponentMapping_getG0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkComponentMapping_setB0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _b) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:284

		  VkComponentMapping* vkObj = (VkComponentMapping*)(ptr);
		 // code for simple past value 
		  vkObj->b = (VkComponentSwizzle) (_b);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkComponentMapping_getB0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:294

		  VkComponentMapping* vkObj = (VkComponentMapping*)(ptr);
		  return (VkComponentSwizzle) (vkObj->b);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkComponentMapping_getB0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkComponentMapping_getB0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkComponentMapping_setA0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _a) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:303

		  VkComponentMapping* vkObj = (VkComponentMapping*)(ptr);
		 // code for simple past value 
		  vkObj->a = (VkComponentSwizzle) (_a);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkComponentMapping_getA0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:313

		  VkComponentMapping* vkObj = (VkComponentMapping*)(ptr);
		  return (VkComponentSwizzle) (vkObj->a);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkComponentMapping_getA0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkComponentMapping_getA0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}
