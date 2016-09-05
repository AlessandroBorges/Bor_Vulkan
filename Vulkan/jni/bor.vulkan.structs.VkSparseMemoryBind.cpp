#include <bor.vulkan.structs.VkSparseMemoryBind.h>

//@line:42

    #include <BorVulkan.hpp>
    JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkSparseMemoryBind_setResourceOffset0(JNIEnv* env, jclass clazz, jobject obj_ptr, jlong _resourceOffset) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:295

		  VkSparseMemoryBind* vkObj = (VkSparseMemoryBind*)(ptr);
		 // code for simple past value 
		  vkObj->resourceOffset = (VkDeviceSize) (_resourceOffset);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkSparseMemoryBind_getResourceOffset0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:305

		  VkSparseMemoryBind* vkObj = (VkSparseMemoryBind*)(ptr);
		  return (jlong) (vkObj->resourceOffset);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkSparseMemoryBind_getResourceOffset0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkSparseMemoryBind_getResourceOffset0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkSparseMemoryBind_setSize0(JNIEnv* env, jclass clazz, jobject obj_ptr, jlong _size) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:314

		  VkSparseMemoryBind* vkObj = (VkSparseMemoryBind*)(ptr);
		 // code for simple past value 
		  vkObj->size = (VkDeviceSize) (_size);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkSparseMemoryBind_getSize0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:324

		  VkSparseMemoryBind* vkObj = (VkSparseMemoryBind*)(ptr);
		  return (jlong) (vkObj->size);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkSparseMemoryBind_getSize0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkSparseMemoryBind_getSize0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkSparseMemoryBind_setMemory0(JNIEnv* env, jclass clazz, jobject obj_ptr, jlong _memory) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:333

		  VkSparseMemoryBind* vkObj = (VkSparseMemoryBind*)(ptr);
		 // code for simple past value 
		  vkObj->memory = (VkDeviceMemory) (_memory);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkSparseMemoryBind_getMemory0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:343

		  VkSparseMemoryBind* vkObj = (VkSparseMemoryBind*)(ptr);
		  // generic get for struct field of type  VkHandle or VkStruct 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->memory);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkSparseMemoryBind_getMemory0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkSparseMemoryBind_getMemory0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkSparseMemoryBind_setMemoryOffset0(JNIEnv* env, jclass clazz, jobject obj_ptr, jlong _memoryOffset) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:353

		  VkSparseMemoryBind* vkObj = (VkSparseMemoryBind*)(ptr);
		 // code for simple past value 
		  vkObj->memoryOffset = (VkDeviceSize) (_memoryOffset);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkSparseMemoryBind_getMemoryOffset0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:363

		  VkSparseMemoryBind* vkObj = (VkSparseMemoryBind*)(ptr);
		  return (jlong) (vkObj->memoryOffset);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkSparseMemoryBind_getMemoryOffset0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkSparseMemoryBind_getMemoryOffset0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkSparseMemoryBind_setFlags0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _flags) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:372

		  VkSparseMemoryBind* vkObj = (VkSparseMemoryBind*)(ptr);
		 // code for simple past value 
		  vkObj->flags = (VkSparseMemoryBindFlags) (_flags);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkSparseMemoryBind_getFlags0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:382

		  VkSparseMemoryBind* vkObj = (VkSparseMemoryBind*)(ptr);
		  return (jint) (vkObj->flags);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkSparseMemoryBind_getFlags0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkSparseMemoryBind_getFlags0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

