#include <bor.vulkan.structs.VkExtensionProperties.h>

//@line:39

    #include <BorVulkan.hpp>
    JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkExtensionProperties_setExtensionName0(JNIEnv* env, jclass clazz, jobject obj_ptr, jstring obj__extensionName) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _extensionName = (char*)(obj__extensionName ? env->GetStringUTFChars(obj__extensionName, 0) : NULL);


//@line:194

		  VkExtensionProperties* vkObj = (VkExtensionProperties*)(ptr);
		  strncpy(vkObj->extensionName, _extensionName, strlen(_extensionName)+1);
	  
	 if(obj__extensionName != NULL){
		 env->ReleaseStringUTFChars(obj__extensionName, _extensionName);
	 }

}

static inline jstring wrapped_Java_bor_vulkan_structs_VkExtensionProperties_getExtensionName0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:203

		  VkExtensionProperties* vkObj = (VkExtensionProperties*)(ptr);
		  return (jstring)(env->NewStringUTF(cloneStr(vkObj->extensionName)));
	 
}

JNIEXPORT jstring JNICALL Java_bor_vulkan_structs_VkExtensionProperties_getExtensionName0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jstring JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkExtensionProperties_getExtensionName0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkExtensionProperties_setSpecVersion0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _specVersion) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:212

		  VkExtensionProperties* vkObj = (VkExtensionProperties*)(ptr);
		 // code for simple past value 
		  vkObj->specVersion = (uint32_t) (_specVersion);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkExtensionProperties_getSpecVersion0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:222

		  VkExtensionProperties* vkObj = (VkExtensionProperties*)(ptr);
		  return (jint) (vkObj->specVersion);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkExtensionProperties_getSpecVersion0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkExtensionProperties_getSpecVersion0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

