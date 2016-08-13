#include <bor.vulkan.structs.VkCommandBufferBeginInfo.h>

//@line:41

    #include <BorVulkan.hpp>
    JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkCommandBufferBeginInfo_setSType0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _sType) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:262

		  VkCommandBufferBeginInfo* vkObj = (VkCommandBufferBeginInfo*)(ptr);
		 // code for simple past value 
		  vkObj->sType = (VkStructureType) (_sType);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkCommandBufferBeginInfo_getSType0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:272

		  VkCommandBufferBeginInfo* vkObj = (VkCommandBufferBeginInfo*)(ptr);
		  // generic get for Vk enums
		  return (jint) (vkObj->sType);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkCommandBufferBeginInfo_getSType0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkCommandBufferBeginInfo_getSType0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkCommandBufferBeginInfo_setPNext0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__pNext) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _pNext = (char*)(obj__pNext?env->GetDirectBufferAddress(obj__pNext) : NULL);


//@line:282

		  VkCommandBufferBeginInfo* vkObj = (VkCommandBufferBeginInfo*)(ptr);
		 // code for Buffer - ptr to ptr 
		 const void* p_pNext = ( void*) _pNext; 
		 vkObj->pNext = p_pNext; 
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkCommandBufferBeginInfo_getPNext0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:293

		  VkCommandBufferBeginInfo* vkObj = (VkCommandBufferBeginInfo*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->pNext);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkCommandBufferBeginInfo_getPNext0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkCommandBufferBeginInfo_getPNext0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkCommandBufferBeginInfo_setFlags0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _flags) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:303

		  VkCommandBufferBeginInfo* vkObj = (VkCommandBufferBeginInfo*)(ptr);
		 // code for simple past value 
		  vkObj->flags = (VkCommandBufferUsageFlags) (_flags);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkCommandBufferBeginInfo_getFlags0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:313

		  VkCommandBufferBeginInfo* vkObj = (VkCommandBufferBeginInfo*)(ptr);
		  return (jint) (vkObj->flags);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkCommandBufferBeginInfo_getFlags0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkCommandBufferBeginInfo_getFlags0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkCommandBufferBeginInfo_setPInheritanceInfo0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__pInheritanceInfo) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _pInheritanceInfo = (char*)(obj__pInheritanceInfo?env->GetDirectBufferAddress(obj__pInheritanceInfo) : NULL);


//@line:322

		  VkCommandBufferBeginInfo* vkObj = (VkCommandBufferBeginInfo*)(ptr);
		 // code for Buffer - ptr to ptr 
		 const VkCommandBufferInheritanceInfo* p_pInheritanceInfo = ( VkCommandBufferInheritanceInfo*) _pInheritanceInfo; 
		 vkObj->pInheritanceInfo = p_pInheritanceInfo; 
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkCommandBufferBeginInfo_getPInheritanceInfo0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:333

		  VkCommandBufferBeginInfo* vkObj = (VkCommandBufferBeginInfo*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->pInheritanceInfo);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkCommandBufferBeginInfo_getPInheritanceInfo0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkCommandBufferBeginInfo_getPInheritanceInfo0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

