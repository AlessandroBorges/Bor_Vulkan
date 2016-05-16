#include <bor.vulkan.structs.VkLayerProperties.h>

//@line:40

    #include <BorVulkan.hpp>
    JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkLayerProperties_setLayerName0(JNIEnv* env, jclass clazz, jobject obj_ptr, jstring obj_layerName) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* layerName = (char*)(obj_layerName ? env->GetStringUTFChars(obj_layerName, 0) : NULL);


//@line:272

		  VkLayerProperties* vkObj = (VkLayerProperties*)(ptr);
		  memcpy ( vkObj->layerName, layerName, strlen(layerName)+1 );
		  //vkObj->layerName = (char[]) (_layerName);
	  
	 if(obj_layerName != NULL){
		 env->ReleaseStringUTFChars(obj_layerName, layerName);
	 }

}

static inline jstring wrapped_Java_bor_vulkan_structs_VkLayerProperties_getLayerName0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:282

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


//@line:290

		  VkLayerProperties* vkObj = (VkLayerProperties*)(ptr);
		  vkObj->specVersion = (uint32_t) (_specVersion);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkLayerProperties_getSpecVersion0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:299

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


//@line:308

		  VkLayerProperties* vkObj = (VkLayerProperties*)(ptr);
		  vkObj->implementationVersion = (uint32_t) (_implementationVersion);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkLayerProperties_getImplementationVersion0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:317

		  VkLayerProperties* vkObj = (VkLayerProperties*)(ptr);
		  return (jint) (vkObj->implementationVersion);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkLayerProperties_getImplementationVersion0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkLayerProperties_getImplementationVersion0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkLayerProperties_setDescription0(JNIEnv* env, jclass clazz, jobject obj_ptr, jstring obj_description, jint len) {

//@line:326

	        unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr):0);
                char* description = (char*)env->GetStringUTFChars(obj_description, 0);
                  
		  VkLayerProperties* vkObj = (VkLayerProperties*)(ptr);
		  strncpy(vkObj->description, description, len);                 
                  vkObj->description[len] = '\0';
		  
		//  vkObj->description = (char[]) (_description);
	  
}

static inline jstring wrapped_Java_bor_vulkan_structs_VkLayerProperties_getDescription0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:341

		  VkLayerProperties* vkObj = (VkLayerProperties*)(ptr);
		  return (jstring)(env->NewStringUTF(vkObj->description));	 
}

JNIEXPORT jstring JNICALL Java_bor_vulkan_structs_VkLayerProperties_getDescription0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jstring JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkLayerProperties_getDescription0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

