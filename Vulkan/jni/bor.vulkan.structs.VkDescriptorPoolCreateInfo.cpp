#include <bor.vulkan.structs.VkDescriptorPoolCreateInfo.h>

//@line:43

    #include <BorVulkan.hpp>
    JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDescriptorPoolCreateInfo_setSType0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _sType) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:324

		  VkDescriptorPoolCreateInfo* vkObj = (VkDescriptorPoolCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->sType = (VkStructureType) (_sType);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkDescriptorPoolCreateInfo_getSType0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:334

		  VkDescriptorPoolCreateInfo* vkObj = (VkDescriptorPoolCreateInfo*)(ptr);
		  // generic get for Vk enums
		  return (jint) (vkObj->sType);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkDescriptorPoolCreateInfo_getSType0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDescriptorPoolCreateInfo_getSType0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDescriptorPoolCreateInfo_setPNext0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__pNext) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _pNext = (char*)(obj__pNext?env->GetDirectBufferAddress(obj__pNext) : NULL);


//@line:344

		  VkDescriptorPoolCreateInfo* vkObj = (VkDescriptorPoolCreateInfo*)(ptr);
		 // code for Buffer - ptr to ptr 
		 const void* p_pNext = ( void*) _pNext; 
		 vkObj->pNext = p_pNext; 
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkDescriptorPoolCreateInfo_getPNext0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:355

		  VkDescriptorPoolCreateInfo* vkObj = (VkDescriptorPoolCreateInfo*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->pNext);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkDescriptorPoolCreateInfo_getPNext0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDescriptorPoolCreateInfo_getPNext0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDescriptorPoolCreateInfo_setFlags0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _flags) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:365

		  VkDescriptorPoolCreateInfo* vkObj = (VkDescriptorPoolCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->flags = (VkDescriptorPoolCreateFlags) (_flags);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkDescriptorPoolCreateInfo_getFlags0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:375

		  VkDescriptorPoolCreateInfo* vkObj = (VkDescriptorPoolCreateInfo*)(ptr);
		  return (jint) (vkObj->flags);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkDescriptorPoolCreateInfo_getFlags0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDescriptorPoolCreateInfo_getFlags0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDescriptorPoolCreateInfo_setMaxSets0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _maxSets) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:384

		  VkDescriptorPoolCreateInfo* vkObj = (VkDescriptorPoolCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->maxSets = (uint32_t) (_maxSets);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkDescriptorPoolCreateInfo_getMaxSets0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:394

		  VkDescriptorPoolCreateInfo* vkObj = (VkDescriptorPoolCreateInfo*)(ptr);
		  return (jint) (vkObj->maxSets);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkDescriptorPoolCreateInfo_getMaxSets0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDescriptorPoolCreateInfo_getMaxSets0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDescriptorPoolCreateInfo_setPoolSizeCount0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _poolSizeCount) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:403

		  VkDescriptorPoolCreateInfo* vkObj = (VkDescriptorPoolCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->poolSizeCount = (uint32_t) (_poolSizeCount);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkDescriptorPoolCreateInfo_getPoolSizeCount0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:413

		  VkDescriptorPoolCreateInfo* vkObj = (VkDescriptorPoolCreateInfo*)(ptr);
		  return (jint) (vkObj->poolSizeCount);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkDescriptorPoolCreateInfo_getPoolSizeCount0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDescriptorPoolCreateInfo_getPoolSizeCount0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDescriptorPoolCreateInfo_setPPoolSizes0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__pPoolSizes) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _pPoolSizes = (char*)(obj__pPoolSizes?env->GetDirectBufferAddress(obj__pPoolSizes) : NULL);


//@line:422

		  VkDescriptorPoolCreateInfo* vkObj = (VkDescriptorPoolCreateInfo*)(ptr);
		 // code for Buffer - ptr to ptr 
		 const VkDescriptorPoolSize* p_pPoolSizes = ( VkDescriptorPoolSize*) _pPoolSizes; 
		 vkObj->pPoolSizes = p_pPoolSizes; 
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkDescriptorPoolCreateInfo_getPPoolSizes0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:433

		  VkDescriptorPoolCreateInfo* vkObj = (VkDescriptorPoolCreateInfo*)(ptr);
		  // generic get for array of VkHandle and VkStruct 
		  return (jlong) reinterpret_cast<jlong>( &vkObj->pPoolSizes );
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkDescriptorPoolCreateInfo_getPPoolSizes0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDescriptorPoolCreateInfo_getPPoolSizes0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

