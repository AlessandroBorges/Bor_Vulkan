#include <bor.vulkan.structs.VkLayerProperties.h>

//@line:41

    #include <BorVulkan.hpp>
    JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkLayerProperties_setLayerName0(JNIEnv* env, jclass clazz, jobject obj_ptr, jstring obj__layerName) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _layerName = (char*)(obj__layerName ? env->GetStringUTFChars(obj__layerName, 0) : NULL);


//@line:259

		  VkLayerProperties* vkObj = (VkLayerProperties*)(ptr);
		  strncpy(vkObj->layerName, _layerName, strlen(_layerName)+1);
	  
	 if(obj__layerName != NULL){
		 env->ReleaseStringUTFChars(obj__layerName, _layerName);
	 }

}

static inline jstring wrapped_Java_bor_vulkan_structs_VkLayerProperties_getLayerName0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:268

		  VkLayerProperties* vkObj = (VkLayerProperties*)(ptr);
		  return (jstring)(env->NewStringUTF(vkObj->layerName));
	 
}

JNIEXPORT jstring JNICALL Java_bor_vulkan_structs_VkLayerProperties_getLayerName0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jstring JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkLayerProperties_getLayerName0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkLayerProperties_setSpecVersion0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _specVersion) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:277

		  VkLayerProperties* vkObj = (VkLayerProperties*)(ptr);
		 // code for simple past value 
		  vkObj->specVersion = (uint32_t) (_specVersion);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkLayerProperties_getSpecVersion0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:287

		  VkLayerProperties* vkObj = (VkLayerProperties*)(ptr);
		  return (jint) (vkObj->specVersion);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkLayerProperties_getSpecVersion0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkLayerProperties_getSpecVersion0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkLayerProperties_setImplementationVersion0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _implementationVersion) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:296

		  VkLayerProperties* vkObj = (VkLayerProperties*)(ptr);
		 // code for simple past value 
		  vkObj->implementationVersion = (uint32_t) (_implementationVersion);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkLayerProperties_getImplementationVersion0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:306

		  VkLayerProperties* vkObj = (VkLayerProperties*)(ptr);
		  return (jint) (vkObj->implementationVersion);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkLayerProperties_getImplementationVersion0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkLayerProperties_getImplementationVersion0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkLayerProperties_setDescription0(JNIEnv* env, jclass clazz, jobject obj_ptr, jstring obj__description) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _description = (char*)(obj__description ? env->GetStringUTFChars(obj__description, 0) : NULL);


//@line:315

		  VkLayerProperties* vkObj = (VkLayerProperties*)(ptr);
		  strncpy(vkObj->description, _description, strlen(_description)+1);
	  
	 if(obj__description != NULL){
		 env->ReleaseStringUTFChars(obj__description, _description);
	 }

}

static inline jstring wrapped_Java_bor_vulkan_structs_VkLayerProperties_getDescription0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:324

		  VkLayerProperties* vkObj = (VkLayerProperties*)(ptr);
		  return (jstring)(env->NewStringUTF(vkObj->description));
	 
}

JNIEXPORT jstring JNICALL Java_bor_vulkan_structs_VkLayerProperties_getDescription0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jstring JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkLayerProperties_getDescription0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

