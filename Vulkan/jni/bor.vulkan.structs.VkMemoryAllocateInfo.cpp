#include <bor.vulkan.structs.VkMemoryAllocateInfo.h>

//@line:41

    #include <BorVulkan.hpp>
    JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkMemoryAllocateInfo_setSType0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _sType) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:252

		  VkMemoryAllocateInfo* vkObj = (VkMemoryAllocateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->sType = (VkStructureType) (_sType);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkMemoryAllocateInfo_getSType0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:262

		  VkMemoryAllocateInfo* vkObj = (VkMemoryAllocateInfo*)(ptr);
		  // generic get for Vk enums
		  return (jint) (vkObj->sType);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkMemoryAllocateInfo_getSType0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkMemoryAllocateInfo_getSType0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkMemoryAllocateInfo_setPNext0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__pNext) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _pNext = (char*)(obj__pNext?env->GetDirectBufferAddress(obj__pNext) : NULL);


//@line:272

		  VkMemoryAllocateInfo* vkObj = (VkMemoryAllocateInfo*)(ptr);
		 // code for Buffer - ptr to ptr 
		 const void* p_pNext = ( void*) _pNext; 
		 vkObj->pNext = p_pNext; 
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkMemoryAllocateInfo_getPNext0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:283

		  VkMemoryAllocateInfo* vkObj = (VkMemoryAllocateInfo*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->pNext);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkMemoryAllocateInfo_getPNext0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkMemoryAllocateInfo_getPNext0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkMemoryAllocateInfo_setAllocationSize0(JNIEnv* env, jclass clazz, jobject obj_ptr, jlong _allocationSize) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:293

		  VkMemoryAllocateInfo* vkObj = (VkMemoryAllocateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->allocationSize = (VkDeviceSize) (_allocationSize);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkMemoryAllocateInfo_getAllocationSize0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:303

		  VkMemoryAllocateInfo* vkObj = (VkMemoryAllocateInfo*)(ptr);
		  return (jlong) (vkObj->allocationSize);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkMemoryAllocateInfo_getAllocationSize0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkMemoryAllocateInfo_getAllocationSize0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkMemoryAllocateInfo_setMemoryTypeIndex0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _memoryTypeIndex) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:312

		  VkMemoryAllocateInfo* vkObj = (VkMemoryAllocateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->memoryTypeIndex = (uint32_t) (_memoryTypeIndex);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkMemoryAllocateInfo_getMemoryTypeIndex0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:322

		  VkMemoryAllocateInfo* vkObj = (VkMemoryAllocateInfo*)(ptr);
		  return (jint) (vkObj->memoryTypeIndex);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkMemoryAllocateInfo_getMemoryTypeIndex0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkMemoryAllocateInfo_getMemoryTypeIndex0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

