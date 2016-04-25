#include <bor.vulkan.structs.VkDeviceQueueCreateInfo.h>

//@line:42

    #include <BorVulkan.hpp>
    JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDeviceQueueCreateInfo_setSType0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _sType) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr):0);


//@line:326

		  VkDeviceQueueCreateInfo* vkObj = (VkDeviceQueueCreateInfo*)(ptr);
		  vkObj->sType = (VkStructureType) (_sType);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkDeviceQueueCreateInfo_getSType0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:335

		  VkDeviceQueueCreateInfo* vkObj = (VkDeviceQueueCreateInfo*)(ptr);
		  return (VkStructureType) (vkObj->sType);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkDeviceQueueCreateInfo_getSType0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr):0);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDeviceQueueCreateInfo_getSType0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDeviceQueueCreateInfo_setPNext0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__pNext) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr):0);
	char* _pNext = (char*)(obj__pNext?env->GetDirectBufferAddress(obj__pNext):0);


//@line:344

		  VkDeviceQueueCreateInfo* vkObj = (VkDeviceQueueCreateInfo*)(ptr);
		  vkObj->pNext = (const void*) (_pNext);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkDeviceQueueCreateInfo_getPNext0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:353

		  VkDeviceQueueCreateInfo* vkObj = (VkDeviceQueueCreateInfo*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->pNext);	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkDeviceQueueCreateInfo_getPNext0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr):0);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDeviceQueueCreateInfo_getPNext0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDeviceQueueCreateInfo_setFlags0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _flags) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr):0);


//@line:361

		  VkDeviceQueueCreateInfo* vkObj = (VkDeviceQueueCreateInfo*)(ptr);
		  vkObj->flags = (VkDeviceQueueCreateFlags) (_flags);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkDeviceQueueCreateInfo_getFlags0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:370

		  VkDeviceQueueCreateInfo* vkObj = (VkDeviceQueueCreateInfo*)(ptr);
		  return (jint) (vkObj->flags);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkDeviceQueueCreateInfo_getFlags0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr):0);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDeviceQueueCreateInfo_getFlags0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDeviceQueueCreateInfo_setQueueFamilyIndex0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _queueFamilyIndex) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr):0);


//@line:379

		  VkDeviceQueueCreateInfo* vkObj = (VkDeviceQueueCreateInfo*)(ptr);
		  vkObj->queueFamilyIndex = (uint32_t) (_queueFamilyIndex);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkDeviceQueueCreateInfo_getQueueFamilyIndex0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:388

		  VkDeviceQueueCreateInfo* vkObj = (VkDeviceQueueCreateInfo*)(ptr);
		  return (jint) (vkObj->queueFamilyIndex);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkDeviceQueueCreateInfo_getQueueFamilyIndex0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr):0);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDeviceQueueCreateInfo_getQueueFamilyIndex0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDeviceQueueCreateInfo_setQueueCount0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _queueCount) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr):0);


//@line:397

		  VkDeviceQueueCreateInfo* vkObj = (VkDeviceQueueCreateInfo*)(ptr);
		  vkObj->queueCount = (uint32_t) (_queueCount);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkDeviceQueueCreateInfo_getQueueCount0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:406

		  VkDeviceQueueCreateInfo* vkObj = (VkDeviceQueueCreateInfo*)(ptr);
		  return (jint) (vkObj->queueCount);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkDeviceQueueCreateInfo_getQueueCount0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr):0);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDeviceQueueCreateInfo_getQueueCount0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDeviceQueueCreateInfo_setPQueuePriorities0(JNIEnv* env, jclass clazz, jobject obj_ptr, jfloatArray obj__pQueuePriorities, jint len) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr):0);
	float* _pQueuePriorities = (float*)env->GetPrimitiveArrayCritical(obj__pQueuePriorities, 0);


//@line:415

		  VkDeviceQueueCreateInfo* vkObj = (VkDeviceQueueCreateInfo*)(ptr);
		 
		  if(vkObj->pQueuePriorities)
		          delete vkObj->pQueuePriorities;
		  		  
		  float* fArray = new float[len];
		  for(int i=0; i<len; i++){
		     fArray[i] = (float) (_pQueuePriorities[i]);
		  }
		  vkObj->pQueuePriorities = fArray;
		  vkObj->queueCount = (uint32_t)len;
	  
	env->ReleasePrimitiveArrayCritical(obj__pQueuePriorities, _pQueuePriorities, 0);

}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDeviceQueueCreateInfo_getPQueuePriorities0(JNIEnv* env, jclass clazz, jobject obj_ptr, jfloatArray obj_array) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr):0);
	float* array = (float*)env->GetPrimitiveArrayCritical(obj_array, 0);


//@line:433

		  VkDeviceQueueCreateInfo* vkObj = (VkDeviceQueueCreateInfo*)(ptr);
		  uint32_t queueCount = vkObj->queueCount;
		  for(uint32_t i=0; i<queueCount; i++){
		      array[i] = (jfloat)(vkObj->pQueuePriorities[i]);
		  }
	 
	env->ReleasePrimitiveArrayCritical(obj_array, array, 0);

}

