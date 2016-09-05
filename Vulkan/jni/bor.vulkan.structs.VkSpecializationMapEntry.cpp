#include <bor.vulkan.structs.VkSpecializationMapEntry.h>

//@line:40

    #include <BorVulkan.hpp>
    JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkSpecializationMapEntry_setConstantID0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _constantID) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:222

		  VkSpecializationMapEntry* vkObj = (VkSpecializationMapEntry*)(ptr);
		 // code for simple past value 
		  vkObj->constantID = (uint32_t) (_constantID);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkSpecializationMapEntry_getConstantID0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:232

		  VkSpecializationMapEntry* vkObj = (VkSpecializationMapEntry*)(ptr);
		  return (jint) (vkObj->constantID);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkSpecializationMapEntry_getConstantID0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkSpecializationMapEntry_getConstantID0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkSpecializationMapEntry_setOffset0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _offset) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:241

		  VkSpecializationMapEntry* vkObj = (VkSpecializationMapEntry*)(ptr);
		 // code for simple past value 
		  vkObj->offset = (uint32_t) (_offset);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkSpecializationMapEntry_getOffset0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:251

		  VkSpecializationMapEntry* vkObj = (VkSpecializationMapEntry*)(ptr);
		  return (jint) (vkObj->offset);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkSpecializationMapEntry_getOffset0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkSpecializationMapEntry_getOffset0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkSpecializationMapEntry_setSize0(JNIEnv* env, jclass clazz, jobject obj_ptr, jlong _size) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:260

		  VkSpecializationMapEntry* vkObj = (VkSpecializationMapEntry*)(ptr);
		 // code for simple past value 
		  vkObj->size = (size_t) (_size);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkSpecializationMapEntry_getSize0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:270

		  VkSpecializationMapEntry* vkObj = (VkSpecializationMapEntry*)(ptr);
		  return (jlong) (vkObj->size);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkSpecializationMapEntry_getSize0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkSpecializationMapEntry_getSize0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

