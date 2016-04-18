#include <bor.vulkan.structs.VkPhysicalDeviceProperties.h>

//@line:45

    #include <BorVulkan.hpp>
    JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceProperties_setApiVersion0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _apiVersion) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr):0);


//@line:405

		  VkPhysicalDeviceProperties* vkObj = (VkPhysicalDeviceProperties*)(ptr);
		  vkObj->apiVersion = (uint32_t) (_apiVersion);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceProperties_getApiVersion0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:414

		  VkPhysicalDeviceProperties* vkObj = (VkPhysicalDeviceProperties*)(ptr);
		  return (jint) (vkObj->apiVersion);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceProperties_getApiVersion0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr):0);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceProperties_getApiVersion0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceProperties_setDriverVersion0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _driverVersion) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr):0);


//@line:423

		  VkPhysicalDeviceProperties* vkObj = (VkPhysicalDeviceProperties*)(ptr);
		  vkObj->driverVersion = (uint32_t) (_driverVersion);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceProperties_getDriverVersion0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:432

		  VkPhysicalDeviceProperties* vkObj = (VkPhysicalDeviceProperties*)(ptr);
		  return (jint) (vkObj->driverVersion);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceProperties_getDriverVersion0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr):0);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceProperties_getDriverVersion0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceProperties_setVendorID0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _vendorID) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr):0);


//@line:441

		  VkPhysicalDeviceProperties* vkObj = (VkPhysicalDeviceProperties*)(ptr);
		  vkObj->vendorID = (uint32_t) (_vendorID);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceProperties_getVendorID0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:450

		  VkPhysicalDeviceProperties* vkObj = (VkPhysicalDeviceProperties*)(ptr);
		  return (jint) (vkObj->vendorID);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceProperties_getVendorID0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr):0);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceProperties_getVendorID0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceProperties_setDeviceID0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _deviceID) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr):0);


//@line:459

		  VkPhysicalDeviceProperties* vkObj = (VkPhysicalDeviceProperties*)(ptr);
		  vkObj->deviceID = (uint32_t) (_deviceID);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceProperties_getDeviceID0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:468

		  VkPhysicalDeviceProperties* vkObj = (VkPhysicalDeviceProperties*)(ptr);
		  return (jint) (vkObj->deviceID);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceProperties_getDeviceID0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr):0);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceProperties_getDeviceID0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceProperties_setDeviceType0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _deviceType) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr):0);


//@line:477

		  VkPhysicalDeviceProperties* vkObj = (VkPhysicalDeviceProperties*)(ptr);
		  vkObj->deviceType = (VkPhysicalDeviceType) (_deviceType);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceProperties_getDeviceType0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:486

		  VkPhysicalDeviceProperties* vkObj = (VkPhysicalDeviceProperties*)(ptr);
		  return (VkPhysicalDeviceType) (vkObj->deviceType);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceProperties_getDeviceType0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr):0);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceProperties_getDeviceType0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceProperties_setDeviceName0(JNIEnv* env, jclass clazz, jobject obj_ptr, jstring obj__deviceName) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr):0);
	char* _deviceName = (char*)env->GetStringUTFChars(obj__deviceName, 0);


//@line:496

		 // VkPhysicalDeviceProperties* vkObj = (VkPhysicalDeviceProperties*)(ptr);		  
		 // vkObj->deviceName = _deviceName;
	  
	env->ReleaseStringUTFChars(obj__deviceName, _deviceName);

}

static inline jstring wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceProperties_getDeviceName0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:505

		  VkPhysicalDeviceProperties* vkObj = (VkPhysicalDeviceProperties*)(ptr);
		  return (jstring)(env->NewStringUTF(vkObj->deviceName));	 
}

JNIEXPORT jstring JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceProperties_getDeviceName0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr):0);

	jstring JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceProperties_getDeviceName0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceProperties_setPipelineCacheUUID0(JNIEnv* env, jclass clazz, jobject obj_ptr, jbyteArray obj__pipelineCacheUUID) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr):0);
	char* _pipelineCacheUUID = (char*)env->GetPrimitiveArrayCritical(obj__pipelineCacheUUID, 0);


//@line:514

		//  VkPhysicalDeviceProperties* vkObj = (VkPhysicalDeviceProperties*)(ptr);
		//  vkObj->pipelineCacheUUID = (uint8_t[]) (_pipelineCacheUUID);
	  
	env->ReleasePrimitiveArrayCritical(obj__pipelineCacheUUID, _pipelineCacheUUID, 0);

}

static inline jbyteArray wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceProperties_getPipelineCacheUUID0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:523

		//  VkPhysicalDeviceProperties* vkObj = (VkPhysicalDeviceProperties*)(ptr);
		//  return (byte[]) (vkObj->pipelineCacheUUID);
	 
}

JNIEXPORT jbyteArray JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceProperties_getPipelineCacheUUID0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr):0);

	jbyteArray JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceProperties_getPipelineCacheUUID0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceProperties_setLimits0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__limits) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr):0);
	char* _limits = (char*)(obj__limits?env->GetDirectBufferAddress(obj__limits):0);


//@line:532

		//  VkPhysicalDeviceProperties* vkObj = (VkPhysicalDeviceProperties*)(ptr);
		//  vkObj->limits = (VkPhysicalDeviceLimits) (_limits);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceProperties_getLimits0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:541

		  VkPhysicalDeviceProperties* vkObj = (VkPhysicalDeviceProperties*)(ptr);		  
		  VkPhysicalDeviceLimits* pLimits = &(vkObj->limits);
		  return (jlong) reinterpret_cast<jlong>(pLimits);
        
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceProperties_getLimits0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr):0);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceProperties_getLimits0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceProperties_setSparseProperties0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__sparseProperties) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr):0);
	char* _sparseProperties = (char*)(obj__sparseProperties?env->GetDirectBufferAddress(obj__sparseProperties):0);


//@line:551

		  VkPhysicalDeviceProperties* vkObj = (VkPhysicalDeviceProperties*)(ptr);
		  VkPhysicalDeviceSparseProperties* sparseProperties = (VkPhysicalDeviceSparseProperties*)_sparseProperties;
		  vkObj->sparseProperties = (VkPhysicalDeviceSparseProperties) (*sparseProperties);
		  
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceProperties_getSparseProperties0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:562

		  VkPhysicalDeviceProperties* vkObj = (VkPhysicalDeviceProperties*)(ptr);
		  VkPhysicalDeviceSparseProperties* pSparse = &(vkObj->sparseProperties);		  
		  return (jlong) reinterpret_cast<jlong>(pSparse);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceProperties_getSparseProperties0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr):0);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceProperties_getSparseProperties0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

