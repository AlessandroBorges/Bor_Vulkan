#include <bor.vulkan.structs.VkCommandBufferAllocateInfo.h>

//@line:42

    #include <BorVulkan.hpp>
    JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkCommandBufferAllocateInfo_setSType0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _sType) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:306

		  VkCommandBufferAllocateInfo* vkObj = (VkCommandBufferAllocateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->sType = (VkStructureType) (_sType);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkCommandBufferAllocateInfo_getSType0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:316

		  VkCommandBufferAllocateInfo* vkObj = (VkCommandBufferAllocateInfo*)(ptr);
		  // generic get for Vk enums
		  return (jint) (vkObj->sType);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkCommandBufferAllocateInfo_getSType0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkCommandBufferAllocateInfo_getSType0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkCommandBufferAllocateInfo_setPNext0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__pNext) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _pNext = (char*)(obj__pNext?env->GetDirectBufferAddress(obj__pNext) : NULL);


//@line:326

		  VkCommandBufferAllocateInfo* vkObj = (VkCommandBufferAllocateInfo*)(ptr);
		 // code for Buffer - ptr to ptr 
		 const void* p_pNext = ( void*) _pNext; 
		 vkObj->pNext = p_pNext; 
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkCommandBufferAllocateInfo_getPNext0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:337

		  VkCommandBufferAllocateInfo* vkObj = (VkCommandBufferAllocateInfo*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->pNext);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkCommandBufferAllocateInfo_getPNext0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkCommandBufferAllocateInfo_getPNext0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkCommandBufferAllocateInfo_setCommandPool0(JNIEnv* env, jclass clazz, jobject obj_ptr, jlong _commandPool) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:347

		  VkCommandBufferAllocateInfo* vkObj = (VkCommandBufferAllocateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->commandPool = (VkCommandPool) (_commandPool);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkCommandBufferAllocateInfo_getCommandPool0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:357

		  VkCommandBufferAllocateInfo* vkObj = (VkCommandBufferAllocateInfo*)(ptr);
		  // generic get for struct field of type  VkHandle or VkStruct 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->commandPool);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkCommandBufferAllocateInfo_getCommandPool0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkCommandBufferAllocateInfo_getCommandPool0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkCommandBufferAllocateInfo_setLevel0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _level) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:367

		  VkCommandBufferAllocateInfo* vkObj = (VkCommandBufferAllocateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->level = (VkCommandBufferLevel) (_level);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkCommandBufferAllocateInfo_getLevel0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:377

		  VkCommandBufferAllocateInfo* vkObj = (VkCommandBufferAllocateInfo*)(ptr);
		  // generic get for Vk enums
		  return (jint) (vkObj->level);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkCommandBufferAllocateInfo_getLevel0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkCommandBufferAllocateInfo_getLevel0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkCommandBufferAllocateInfo_setCommandBufferCount0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _commandBufferCount) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:387

		  VkCommandBufferAllocateInfo* vkObj = (VkCommandBufferAllocateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->commandBufferCount = (uint32_t) (_commandBufferCount);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkCommandBufferAllocateInfo_getCommandBufferCount0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:397

		  VkCommandBufferAllocateInfo* vkObj = (VkCommandBufferAllocateInfo*)(ptr);
		  return (jint) (vkObj->commandBufferCount);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkCommandBufferAllocateInfo_getCommandBufferCount0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkCommandBufferAllocateInfo_getCommandBufferCount0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

