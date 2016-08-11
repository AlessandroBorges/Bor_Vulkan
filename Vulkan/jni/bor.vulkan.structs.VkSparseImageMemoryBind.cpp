#include <bor.vulkan.structs.VkSparseImageMemoryBind.h>

//@line:43

    #include <BorVulkan.hpp>
    JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkSparseImageMemoryBind_setSubresource0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__subresource) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _subresource = (char*)(obj__subresource?env->GetDirectBufferAddress(obj__subresource) : NULL);


//@line:345

		  VkSparseImageMemoryBind* vkObj = (VkSparseImageMemoryBind*)(ptr);
		 // code for Buffer - referenced by ptr
		  vkObj->subresource = (VkImageSubresource) (_subresource);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkSparseImageMemoryBind_getSubresource0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:355

		  VkSparseImageMemoryBind* vkObj = (VkSparseImageMemoryBind*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->subresource);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkSparseImageMemoryBind_getSubresource0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkSparseImageMemoryBind_getSubresource0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkSparseImageMemoryBind_setOffset0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__offset) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _offset = (char*)(obj__offset?env->GetDirectBufferAddress(obj__offset) : NULL);


//@line:365

		  VkSparseImageMemoryBind* vkObj = (VkSparseImageMemoryBind*)(ptr);
		 // code for Buffer - referenced by ptr
		  vkObj->offset = (VkOffset3D) (_offset);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkSparseImageMemoryBind_getOffset0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:375

		  VkSparseImageMemoryBind* vkObj = (VkSparseImageMemoryBind*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->offset);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkSparseImageMemoryBind_getOffset0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkSparseImageMemoryBind_getOffset0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkSparseImageMemoryBind_setExtent0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__extent) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _extent = (char*)(obj__extent?env->GetDirectBufferAddress(obj__extent) : NULL);


//@line:385

		  VkSparseImageMemoryBind* vkObj = (VkSparseImageMemoryBind*)(ptr);
		 // code for Buffer - referenced by ptr
		  vkObj->extent = (VkExtent3D) (_extent);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkSparseImageMemoryBind_getExtent0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:395

		  VkSparseImageMemoryBind* vkObj = (VkSparseImageMemoryBind*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->extent);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkSparseImageMemoryBind_getExtent0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkSparseImageMemoryBind_getExtent0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkSparseImageMemoryBind_setMemory0(JNIEnv* env, jclass clazz, jobject obj_ptr, jlong _memory) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:405

		  VkSparseImageMemoryBind* vkObj = (VkSparseImageMemoryBind*)(ptr);
		 // code for simple past value 
		  vkObj->memory = (VkDeviceMemory) (_memory);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkSparseImageMemoryBind_getMemory0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:415

		  VkSparseImageMemoryBind* vkObj = (VkSparseImageMemoryBind*)(ptr);
		  // generic get for struct field of type  VkHandle or VkStruct 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->memory);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkSparseImageMemoryBind_getMemory0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkSparseImageMemoryBind_getMemory0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkSparseImageMemoryBind_setMemoryOffset0(JNIEnv* env, jclass clazz, jobject obj_ptr, jlong _memoryOffset) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:425

		  VkSparseImageMemoryBind* vkObj = (VkSparseImageMemoryBind*)(ptr);
		 // code for simple past value 
		  vkObj->memoryOffset = (VkDeviceSize) (_memoryOffset);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkSparseImageMemoryBind_getMemoryOffset0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:435

		  VkSparseImageMemoryBind* vkObj = (VkSparseImageMemoryBind*)(ptr);
		  return (jlong) (vkObj->memoryOffset);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkSparseImageMemoryBind_getMemoryOffset0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkSparseImageMemoryBind_getMemoryOffset0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkSparseImageMemoryBind_setFlags0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _flags) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:444

		  VkSparseImageMemoryBind* vkObj = (VkSparseImageMemoryBind*)(ptr);
		 // code for simple past value 
		  vkObj->flags = (VkSparseMemoryBindFlags) (_flags);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkSparseImageMemoryBind_getFlags0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:454

		  VkSparseImageMemoryBind* vkObj = (VkSparseImageMemoryBind*)(ptr);
		  return (jint) (vkObj->flags);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkSparseImageMemoryBind_getFlags0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkSparseImageMemoryBind_getFlags0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

