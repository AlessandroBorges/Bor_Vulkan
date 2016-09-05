#include <bor.vulkan.structs.VkDisplayPropertiesKHR.h>

//@line:44

    #include <BorVulkan.hpp>
    JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDisplayPropertiesKHR_setDisplay0(JNIEnv* env, jclass clazz, jobject obj_ptr, jlong _display) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:377

		  VkDisplayPropertiesKHR* vkObj = (VkDisplayPropertiesKHR*)(ptr);
		 // code for simple past value 
		  vkObj->display = (VkDisplayKHR) (_display);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkDisplayPropertiesKHR_getDisplay0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:387

		  VkDisplayPropertiesKHR* vkObj = (VkDisplayPropertiesKHR*)(ptr);
		  // generic get for struct field of type  VkHandle or VkStruct 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->display);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkDisplayPropertiesKHR_getDisplay0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDisplayPropertiesKHR_getDisplay0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDisplayPropertiesKHR_setDisplayName0(JNIEnv* env, jclass clazz, jobject obj_ptr, jstring obj__displayName) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _displayName = (char*)(obj__displayName ? env->GetStringUTFChars(obj__displayName, 0) : NULL);


//@line:397

		  VkDisplayPropertiesKHR* vkObj = (VkDisplayPropertiesKHR*)(ptr);
		  vkObj->displayName = cloneStr(_displayName);
	  
	 if(obj__displayName != NULL){
		 env->ReleaseStringUTFChars(obj__displayName, _displayName);
	 }

}

static inline jstring wrapped_Java_bor_vulkan_structs_VkDisplayPropertiesKHR_getDisplayName0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:406

		  VkDisplayPropertiesKHR* vkObj = (VkDisplayPropertiesKHR*)(ptr);
		  return (jstring)(env->NewStringUTF(vkObj->displayName));
	 
}

JNIEXPORT jstring JNICALL Java_bor_vulkan_structs_VkDisplayPropertiesKHR_getDisplayName0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jstring JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDisplayPropertiesKHR_getDisplayName0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDisplayPropertiesKHR_setPhysicalDimensions0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__physicalDimensions) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _physicalDimensions = (char*)(obj__physicalDimensions?env->GetDirectBufferAddress(obj__physicalDimensions) : NULL);


//@line:415

		  VkDisplayPropertiesKHR* vkObj = (VkDisplayPropertiesKHR*)(ptr);
		 // code for Buffer - ptr to struct 
		 VkExtent2D* p_physicalDimensions = (VkExtent2D*) _physicalDimensions; 
		 vkObj->physicalDimensions = (*p_physicalDimensions); 
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkDisplayPropertiesKHR_getPhysicalDimensions0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:426

		  VkDisplayPropertiesKHR* vkObj = (VkDisplayPropertiesKHR*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->physicalDimensions);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkDisplayPropertiesKHR_getPhysicalDimensions0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDisplayPropertiesKHR_getPhysicalDimensions0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDisplayPropertiesKHR_setPhysicalResolution0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__physicalResolution) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _physicalResolution = (char*)(obj__physicalResolution?env->GetDirectBufferAddress(obj__physicalResolution) : NULL);


//@line:436

		  VkDisplayPropertiesKHR* vkObj = (VkDisplayPropertiesKHR*)(ptr);
		 // code for Buffer - ptr to struct 
		 VkExtent2D* p_physicalResolution = (VkExtent2D*) _physicalResolution; 
		 vkObj->physicalResolution = (*p_physicalResolution); 
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkDisplayPropertiesKHR_getPhysicalResolution0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:447

		  VkDisplayPropertiesKHR* vkObj = (VkDisplayPropertiesKHR*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->physicalResolution);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkDisplayPropertiesKHR_getPhysicalResolution0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDisplayPropertiesKHR_getPhysicalResolution0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDisplayPropertiesKHR_setSupportedTransforms0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _supportedTransforms) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:457

		  VkDisplayPropertiesKHR* vkObj = (VkDisplayPropertiesKHR*)(ptr);
		 // code for simple past value 
		  vkObj->supportedTransforms = (VkSurfaceTransformFlagsKHR) (_supportedTransforms);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkDisplayPropertiesKHR_getSupportedTransforms0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:467

		  VkDisplayPropertiesKHR* vkObj = (VkDisplayPropertiesKHR*)(ptr);
		  return (jint) (vkObj->supportedTransforms);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkDisplayPropertiesKHR_getSupportedTransforms0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDisplayPropertiesKHR_getSupportedTransforms0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDisplayPropertiesKHR_setPlaneReorderPossible0(JNIEnv* env, jclass clazz, jobject obj_ptr, jboolean _planeReorderPossible) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:476

		  VkDisplayPropertiesKHR* vkObj = (VkDisplayPropertiesKHR*)(ptr);
		 // code for simple past value 
		  vkObj->planeReorderPossible = (VkBool32) (_planeReorderPossible);
	  

}

static inline jboolean wrapped_Java_bor_vulkan_structs_VkDisplayPropertiesKHR_getPlaneReorderPossible0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:486

		  VkDisplayPropertiesKHR* vkObj = (VkDisplayPropertiesKHR*)(ptr);
		  return (jboolean) (vkObj->planeReorderPossible);
	 
}

JNIEXPORT jboolean JNICALL Java_bor_vulkan_structs_VkDisplayPropertiesKHR_getPlaneReorderPossible0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jboolean JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDisplayPropertiesKHR_getPlaneReorderPossible0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDisplayPropertiesKHR_setPersistentContent0(JNIEnv* env, jclass clazz, jobject obj_ptr, jboolean _persistentContent) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:495

		  VkDisplayPropertiesKHR* vkObj = (VkDisplayPropertiesKHR*)(ptr);
		 // code for simple past value 
		  vkObj->persistentContent = (VkBool32) (_persistentContent);
	  

}

static inline jboolean wrapped_Java_bor_vulkan_structs_VkDisplayPropertiesKHR_getPersistentContent0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:505

		  VkDisplayPropertiesKHR* vkObj = (VkDisplayPropertiesKHR*)(ptr);
		  return (jboolean) (vkObj->persistentContent);
	 
}

JNIEXPORT jboolean JNICALL Java_bor_vulkan_structs_VkDisplayPropertiesKHR_getPersistentContent0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jboolean JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDisplayPropertiesKHR_getPersistentContent0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

