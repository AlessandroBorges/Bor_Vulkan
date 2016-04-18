#include <bor.vulkan.structs.VkDeviceCreateInfo.h>

//@line:46

    #include <BorVulkan.hpp>
    JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDeviceCreateInfo_setSType0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _sType) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr):0);


//@line:454

		  VkDeviceCreateInfo* vkObj = (VkDeviceCreateInfo*)(ptr);
		  vkObj->sType = (VkStructureType) (_sType);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkDeviceCreateInfo_getSType0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:463

		  VkDeviceCreateInfo* vkObj = (VkDeviceCreateInfo*)(ptr);
		  return (VkStructureType) (vkObj->sType);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkDeviceCreateInfo_getSType0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr):0);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDeviceCreateInfo_getSType0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDeviceCreateInfo_setPNext0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__pNext) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr):0);
	char* _pNext = (char*)(obj__pNext?env->GetDirectBufferAddress(obj__pNext):0);


//@line:472

		  VkDeviceCreateInfo* vkObj = (VkDeviceCreateInfo*)(ptr);
		  vkObj->pNext = (const void*) (_pNext);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkDeviceCreateInfo_getPNext0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:481

		  VkDeviceCreateInfo* vkObj = (VkDeviceCreateInfo*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->pNext);	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkDeviceCreateInfo_getPNext0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr):0);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDeviceCreateInfo_getPNext0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDeviceCreateInfo_setFlags0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _flags) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr):0);


//@line:489

		  VkDeviceCreateInfo* vkObj = (VkDeviceCreateInfo*)(ptr);
		  vkObj->flags = (VkDeviceCreateFlags) (_flags);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkDeviceCreateInfo_getFlags0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:498

		  VkDeviceCreateInfo* vkObj = (VkDeviceCreateInfo*)(ptr);
		  return (jint) (vkObj->flags);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkDeviceCreateInfo_getFlags0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr):0);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDeviceCreateInfo_getFlags0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDeviceCreateInfo_setQueueCreateInfoCount0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _queueCreateInfoCount) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr):0);


//@line:507

		  VkDeviceCreateInfo* vkObj = (VkDeviceCreateInfo*)(ptr);
		  vkObj->queueCreateInfoCount = (uint32_t) (_queueCreateInfoCount);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkDeviceCreateInfo_getQueueCreateInfoCount0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:516

		  VkDeviceCreateInfo* vkObj = (VkDeviceCreateInfo*)(ptr);
		  return (jint) (vkObj->queueCreateInfoCount);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkDeviceCreateInfo_getQueueCreateInfoCount0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr):0);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDeviceCreateInfo_getQueueCreateInfoCount0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDeviceCreateInfo_setPQueueCreateInfos0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__pQueueCreateInfos) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr):0);
	char* _pQueueCreateInfos = (char*)(obj__pQueueCreateInfos?env->GetDirectBufferAddress(obj__pQueueCreateInfos):0);


//@line:525

		  VkDeviceCreateInfo* vkObj = (VkDeviceCreateInfo*)(ptr);
		  vkObj->pQueueCreateInfos = (const VkDeviceQueueCreateInfo*) (_pQueueCreateInfos);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkDeviceCreateInfo_getPQueueCreateInfos0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:534

		  VkDeviceCreateInfo* vkObj = (VkDeviceCreateInfo*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->pQueueCreateInfos);	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkDeviceCreateInfo_getPQueueCreateInfos0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr):0);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDeviceCreateInfo_getPQueueCreateInfos0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDeviceCreateInfo_setEnabledLayerCount0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _enabledLayerCount) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr):0);


//@line:542

		  VkDeviceCreateInfo* vkObj = (VkDeviceCreateInfo*)(ptr);
		  vkObj->enabledLayerCount = (uint32_t) (_enabledLayerCount);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkDeviceCreateInfo_getEnabledLayerCount0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:551

		  VkDeviceCreateInfo* vkObj = (VkDeviceCreateInfo*)(ptr);
		  return (jint) (vkObj->enabledLayerCount);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkDeviceCreateInfo_getEnabledLayerCount0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr):0);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDeviceCreateInfo_getEnabledLayerCount0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDeviceCreateInfo_setPpEnabledLayerNames0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobjectArray _ppEnabledLayerNames) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr):0);


//@line:560

		  VkDeviceCreateInfo* vkObj = (VkDeviceCreateInfo*)(ptr);
		  vkObj->ppEnabledLayerNames = (const char* const*) (_ppEnabledLayerNames);
	  

}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDeviceCreateInfo_setEnabledExtensionCount0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _enabledExtensionCount) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr):0);


//@line:578

		  VkDeviceCreateInfo* vkObj = (VkDeviceCreateInfo*)(ptr);
		  vkObj->enabledExtensionCount = (uint32_t) (_enabledExtensionCount);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkDeviceCreateInfo_getEnabledExtensionCount0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:587

		  VkDeviceCreateInfo* vkObj = (VkDeviceCreateInfo*)(ptr);
		  return (jint) (vkObj->enabledExtensionCount);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkDeviceCreateInfo_getEnabledExtensionCount0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr):0);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDeviceCreateInfo_getEnabledExtensionCount0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDeviceCreateInfo_setPpEnabledExtensionNames0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobjectArray _ppEnabledExtensionNames) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr):0);


//@line:596

		  VkDeviceCreateInfo* vkObj = (VkDeviceCreateInfo*)(ptr);
		  vkObj->ppEnabledExtensionNames = (const char* const*) (_ppEnabledExtensionNames);
	  

}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDeviceCreateInfo_setPEnabledFeatures0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__pEnabledFeatures) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr):0);
	char* _pEnabledFeatures = (char*)(obj__pEnabledFeatures?env->GetDirectBufferAddress(obj__pEnabledFeatures):0);


//@line:614

		  VkDeviceCreateInfo* vkObj = (VkDeviceCreateInfo*)(ptr);
		  vkObj->pEnabledFeatures = (const VkPhysicalDeviceFeatures*) (_pEnabledFeatures);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkDeviceCreateInfo_getPEnabledFeatures0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:623

		  VkDeviceCreateInfo* vkObj = (VkDeviceCreateInfo*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->pEnabledFeatures);	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkDeviceCreateInfo_getPEnabledFeatures0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr):0);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDeviceCreateInfo_getPEnabledFeatures0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

