#include <bor.vulkan.structs.VkPhysicalDeviceProperties.h>

//@line:46

    #include <BorVulkan.hpp>
    JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceProperties_setApiVersion0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _apiVersion) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:425

		  VkPhysicalDeviceProperties* vkObj = (VkPhysicalDeviceProperties*)(ptr);
		 // code for simple past value 
		  vkObj->apiVersion = (uint32_t) (_apiVersion);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceProperties_getApiVersion0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:435

		  VkPhysicalDeviceProperties* vkObj = (VkPhysicalDeviceProperties*)(ptr);
		  return (jint) (vkObj->apiVersion);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceProperties_getApiVersion0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceProperties_getApiVersion0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceProperties_setDriverVersion0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _driverVersion) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:444

		  VkPhysicalDeviceProperties* vkObj = (VkPhysicalDeviceProperties*)(ptr);
		 // code for simple past value 
		  vkObj->driverVersion = (uint32_t) (_driverVersion);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceProperties_getDriverVersion0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:454

		  VkPhysicalDeviceProperties* vkObj = (VkPhysicalDeviceProperties*)(ptr);
		  return (jint) (vkObj->driverVersion);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceProperties_getDriverVersion0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceProperties_getDriverVersion0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceProperties_setVendorID0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _vendorID) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:463

		  VkPhysicalDeviceProperties* vkObj = (VkPhysicalDeviceProperties*)(ptr);
		 // code for simple past value 
		  vkObj->vendorID = (uint32_t) (_vendorID);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceProperties_getVendorID0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:473

		  VkPhysicalDeviceProperties* vkObj = (VkPhysicalDeviceProperties*)(ptr);
		  return (jint) (vkObj->vendorID);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceProperties_getVendorID0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceProperties_getVendorID0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceProperties_setDeviceID0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _deviceID) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:482

		  VkPhysicalDeviceProperties* vkObj = (VkPhysicalDeviceProperties*)(ptr);
		 // code for simple past value 
		  vkObj->deviceID = (uint32_t) (_deviceID);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceProperties_getDeviceID0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:492

		  VkPhysicalDeviceProperties* vkObj = (VkPhysicalDeviceProperties*)(ptr);
		  return (jint) (vkObj->deviceID);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceProperties_getDeviceID0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceProperties_getDeviceID0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceProperties_setDeviceType0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _deviceType) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:501

		  VkPhysicalDeviceProperties* vkObj = (VkPhysicalDeviceProperties*)(ptr);
		 // code for simple past value 
		  vkObj->deviceType = (VkPhysicalDeviceType) (_deviceType);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceProperties_getDeviceType0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:511

		  VkPhysicalDeviceProperties* vkObj = (VkPhysicalDeviceProperties*)(ptr);
		  // generic get for Vk enums
		  return (jint) (vkObj->deviceType);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceProperties_getDeviceType0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceProperties_getDeviceType0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceProperties_setDeviceName0(JNIEnv* env, jclass clazz, jobject obj_ptr, jstring obj__deviceName) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _deviceName = (char*)(obj__deviceName ? env->GetStringUTFChars(obj__deviceName, 0) : NULL);


//@line:521

		  VkPhysicalDeviceProperties* vkObj = (VkPhysicalDeviceProperties*)(ptr);
		  strncpy(vkObj->deviceName, _deviceName, strlen(_deviceName)+1);
	  
	 if(obj__deviceName != NULL){
		 env->ReleaseStringUTFChars(obj__deviceName, _deviceName);
	 }

}

static inline jstring wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceProperties_getDeviceName0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:530

		  VkPhysicalDeviceProperties* vkObj = (VkPhysicalDeviceProperties*)(ptr);
		  return (jstring)(env->NewStringUTF(vkObj->deviceName));
	 
}

JNIEXPORT jstring JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceProperties_getDeviceName0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jstring JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceProperties_getDeviceName0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceProperties_setPipelineCacheUUID0(JNIEnv* env, jclass clazz, jobject obj_ptr, jbyteArray obj__pipelineCacheUUID) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _pipelineCacheUUID = (char*)(obj__pipelineCacheUUID ? env->GetByteArrayElements(obj__pipelineCacheUUID, 0) : NULL);


//@line:539

		  VkPhysicalDeviceProperties* vkObj = (VkPhysicalDeviceProperties*)(ptr);
		 // code for fixed size array 
		  memcpy(vkObj->pipelineCacheUUID, _pipelineCacheUUID, VK_UUID_SIZE * sizeof(uint8_t));
	  
	if(obj__pipelineCacheUUID != NULL){
		 env->ReleaseByteArrayElements(obj__pipelineCacheUUID, (jbyte*)_pipelineCacheUUID, 0);
	}

}

static inline jbyteArray wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceProperties_getPipelineCacheUUID0
(JNIEnv* env, jclass clazz, jobject obj_ptr, jbyteArray obj__pipelineCacheUUID, unsigned char* ptr, char* _pipelineCacheUUID) {

//@line:549

		  VkPhysicalDeviceProperties* vkObj = (VkPhysicalDeviceProperties*)(ptr);
		  // fixed length array  
		  memcpy(&_pipelineCacheUUID, &(vkObj->pipelineCacheUUID), VK_UUID_SIZE * sizeof(uint8_t));
		  return obj__pipelineCacheUUID;
	 
}

JNIEXPORT jbyteArray JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceProperties_getPipelineCacheUUID0(JNIEnv* env, jclass clazz, jobject obj_ptr, jbyteArray obj__pipelineCacheUUID) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _pipelineCacheUUID = (char*)(obj__pipelineCacheUUID ? env->GetByteArrayElements(obj__pipelineCacheUUID, 0) : NULL);

	jbyteArray JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceProperties_getPipelineCacheUUID0(env, clazz, obj_ptr, obj__pipelineCacheUUID, ptr, _pipelineCacheUUID);

	if(obj__pipelineCacheUUID != NULL){
		 env->ReleaseByteArrayElements(obj__pipelineCacheUUID, (jbyte*)_pipelineCacheUUID, 0);
	}

	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceProperties_setLimits0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__limits) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _limits = (char*)(obj__limits?env->GetDirectBufferAddress(obj__limits) : NULL);


//@line:560

		  VkPhysicalDeviceProperties* vkObj = (VkPhysicalDeviceProperties*)(ptr);
		 // code for Buffer - ptr to struct 
		 VkPhysicalDeviceLimits* p_limits = (VkPhysicalDeviceLimits*) _limits; 
		 vkObj->limits = (*p_limits); 
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceProperties_getLimits0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:571

		  VkPhysicalDeviceProperties* vkObj = (VkPhysicalDeviceProperties*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->limits);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceProperties_getLimits0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceProperties_getLimits0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceProperties_setSparseProperties0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__sparseProperties) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _sparseProperties = (char*)(obj__sparseProperties?env->GetDirectBufferAddress(obj__sparseProperties) : NULL);


//@line:581

		  VkPhysicalDeviceProperties* vkObj = (VkPhysicalDeviceProperties*)(ptr);
		 // code for Buffer - ptr to struct 
		 VkPhysicalDeviceSparseProperties* p_sparseProperties = (VkPhysicalDeviceSparseProperties*) _sparseProperties; 
		 vkObj->sparseProperties = (*p_sparseProperties); 
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceProperties_getSparseProperties0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:592

		  VkPhysicalDeviceProperties* vkObj = (VkPhysicalDeviceProperties*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->sparseProperties);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceProperties_getSparseProperties0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceProperties_getSparseProperties0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

