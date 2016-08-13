#include <bor.vulkan.structs.VkSparseImageMemoryBind.h>

//@line:43

    #include <BorVulkan.hpp>
    JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkSparseImageMemoryBind_setSubresource0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__subresource) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _subresource = (char*)(obj__subresource?env->GetDirectBufferAddress(obj__subresource) : NULL);


//@line:345

		  VkSparseImageMemoryBind* vkObj = (VkSparseImageMemoryBind*)(ptr);
		 // code for Buffer - ptr to struct 
		 VkImageSubresource* p_subresource = (VkImageSubresource*) _subresource; 
		 vkObj->subresource = (*p_subresource); 
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkSparseImageMemoryBind_getSubresource0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:356

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


//@line:366

		  VkSparseImageMemoryBind* vkObj = (VkSparseImageMemoryBind*)(ptr);
		 // code for Buffer - ptr to struct 
		 VkOffset3D* p_offset = (VkOffset3D*) _offset; 
		 vkObj->offset = (*p_offset); 
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkSparseImageMemoryBind_getOffset0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:377

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


//@line:387

		  VkSparseImageMemoryBind* vkObj = (VkSparseImageMemoryBind*)(ptr);
		 // code for Buffer - ptr to struct 
		 VkExtent3D* p_extent = (VkExtent3D*) _extent; 
		 vkObj->extent = (*p_extent); 
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkSparseImageMemoryBind_getExtent0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:398

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


//@line:408

		  VkSparseImageMemoryBind* vkObj = (VkSparseImageMemoryBind*)(ptr);
		 // code for simple past value 
		  vkObj->memory = (VkDeviceMemory) (_memory);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkSparseImageMemoryBind_getMemory0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:418

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


//@line:428

		  VkSparseImageMemoryBind* vkObj = (VkSparseImageMemoryBind*)(ptr);
		 // code for simple past value 
		  vkObj->memoryOffset = (VkDeviceSize) (_memoryOffset);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkSparseImageMemoryBind_getMemoryOffset0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:438

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


//@line:447

		  VkSparseImageMemoryBind* vkObj = (VkSparseImageMemoryBind*)(ptr);
		 // code for simple past value 
		  vkObj->flags = (VkSparseMemoryBindFlags) (_flags);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkSparseImageMemoryBind_getFlags0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:457

		  VkSparseImageMemoryBind* vkObj = (VkSparseImageMemoryBind*)(ptr);
		  return (jint) (vkObj->flags);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkSparseImageMemoryBind_getFlags0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkSparseImageMemoryBind_getFlags0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

