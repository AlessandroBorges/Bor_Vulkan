#include <bor.vulkan.structs.VkBufferCreateInfo.h>

//@line:45

    #include <BorVulkan.hpp>
    JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkBufferCreateInfo_setSType0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _sType) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:394

		  VkBufferCreateInfo* vkObj = (VkBufferCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->sType = (VkStructureType) (_sType);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkBufferCreateInfo_getSType0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:404

		  VkBufferCreateInfo* vkObj = (VkBufferCreateInfo*)(ptr);
		  return (VkStructureType) (vkObj->sType);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkBufferCreateInfo_getSType0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkBufferCreateInfo_getSType0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkBufferCreateInfo_setPNext0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__pNext) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _pNext = (char*)(obj__pNext?env->GetDirectBufferAddress(obj__pNext) : NULL);


//@line:413

		  VkBufferCreateInfo* vkObj = (VkBufferCreateInfo*)(ptr);
		 // code for Buffer - referenced by ptr
		  vkObj->pNext = (const void*) (_pNext);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkBufferCreateInfo_getPNext0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:423

		  VkBufferCreateInfo* vkObj = (VkBufferCreateInfo*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->pNext);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkBufferCreateInfo_getPNext0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkBufferCreateInfo_getPNext0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkBufferCreateInfo_setFlags0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _flags) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:433

		  VkBufferCreateInfo* vkObj = (VkBufferCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->flags = (VkBufferCreateFlags) (_flags);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkBufferCreateInfo_getFlags0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:443

		  VkBufferCreateInfo* vkObj = (VkBufferCreateInfo*)(ptr);
		  return (jint) (vkObj->flags);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkBufferCreateInfo_getFlags0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkBufferCreateInfo_getFlags0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkBufferCreateInfo_setSize0(JNIEnv* env, jclass clazz, jobject obj_ptr, jlong _size) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:452

		  VkBufferCreateInfo* vkObj = (VkBufferCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->size = (VkDeviceSize) (_size);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkBufferCreateInfo_getSize0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:462

		  VkBufferCreateInfo* vkObj = (VkBufferCreateInfo*)(ptr);
		  return (jlong) (vkObj->size);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkBufferCreateInfo_getSize0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkBufferCreateInfo_getSize0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkBufferCreateInfo_setUsage0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _usage) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:471

		  VkBufferCreateInfo* vkObj = (VkBufferCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->usage = (VkBufferUsageFlags) (_usage);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkBufferCreateInfo_getUsage0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:481

		  VkBufferCreateInfo* vkObj = (VkBufferCreateInfo*)(ptr);
		  return (jint) (vkObj->usage);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkBufferCreateInfo_getUsage0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkBufferCreateInfo_getUsage0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkBufferCreateInfo_setSharingMode0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _sharingMode) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:490

		  VkBufferCreateInfo* vkObj = (VkBufferCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->sharingMode = (VkSharingMode) (_sharingMode);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkBufferCreateInfo_getSharingMode0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:500

		  VkBufferCreateInfo* vkObj = (VkBufferCreateInfo*)(ptr);
		  return (VkSharingMode) (vkObj->sharingMode);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkBufferCreateInfo_getSharingMode0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkBufferCreateInfo_getSharingMode0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkBufferCreateInfo_setQueueFamilyIndexCount0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _queueFamilyIndexCount) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:509

		  VkBufferCreateInfo* vkObj = (VkBufferCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->queueFamilyIndexCount = (uint32_t) (_queueFamilyIndexCount);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkBufferCreateInfo_getQueueFamilyIndexCount0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:519

		  VkBufferCreateInfo* vkObj = (VkBufferCreateInfo*)(ptr);
		  return (jint) (vkObj->queueFamilyIndexCount);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkBufferCreateInfo_getQueueFamilyIndexCount0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkBufferCreateInfo_getQueueFamilyIndexCount0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkBufferCreateInfo_setPQueueFamilyIndices0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__pQueueFamilyIndices, jint len) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	int* _pQueueFamilyIndices = (int*)(obj__pQueueFamilyIndices?env->GetDirectBufferAddress(obj__pQueueFamilyIndices) : NULL);


//@line:530

		  VkBufferCreateInfo* vkObj = (VkBufferCreateInfo*)(ptr);
		 // code for generic array 
		  uint32_t count = (uint32_t) len;		  
		  vkObj->queueFamilyIndexCount = count;
		  vkObj->pQueueFamilyIndices = (uint32_t*)_pQueueFamilyIndices ;		  
	  

}

static inline jintArray wrapped_Java_bor_vulkan_structs_VkBufferCreateInfo_getPQueueFamilyIndices0
(JNIEnv* env, jclass clazz, jobject obj_ptr, jintArray obj__pQueueFamilyIndices, unsigned char* ptr, int* _pQueueFamilyIndices) {

//@line:542

		  VkBufferCreateInfo* vkObj = (VkBufferCreateInfo*)(ptr);
		  // generic get for C type array, with content copy 
		  if( 0 == vkObj->queueFamilyIndexCount){ 
		     return NULL;
		   }
		  uint32_t count = (uint32_t)env->GetArrayLength( obj__pQueueFamilyIndices);
		  if(vkObj->pQueueFamilyIndices == NULL){
		    return NULL;
		   }
 		  memcpy(_pQueueFamilyIndices, vkObj->pQueueFamilyIndices, count * sizeof(uint32_t));
		  return obj__pQueueFamilyIndices;
	 
}

JNIEXPORT jintArray JNICALL Java_bor_vulkan_structs_VkBufferCreateInfo_getPQueueFamilyIndices0(JNIEnv* env, jclass clazz, jobject obj_ptr, jintArray obj__pQueueFamilyIndices) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	int* _pQueueFamilyIndices = (int*)(obj__pQueueFamilyIndices ? env->GetIntArrayElements(obj__pQueueFamilyIndices, 0) : NULL);

	jintArray JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkBufferCreateInfo_getPQueueFamilyIndices0(env, clazz, obj_ptr, obj__pQueueFamilyIndices, ptr, _pQueueFamilyIndices);

	if(obj__pQueueFamilyIndices != NULL){
		 env->ReleaseIntArrayElements(obj__pQueueFamilyIndices, (jint*)_pQueueFamilyIndices, 0);
	}

	return JNI_returnValue;
}

