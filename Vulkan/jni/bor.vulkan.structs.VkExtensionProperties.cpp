#include <bor.vulkan.structs.VkExtensionProperties.h>

//@line:38

    #include <BorVulkan.hpp>
        
    
    JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkExtensionProperties_setExtensionName0(JNIEnv* env, jclass clazz, jobject obj_ptr, jstring obj__extensionName) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _extensionName = (char*)(obj__extensionName ? env->GetStringUTFChars(obj__extensionName, 0) : NULL);


//@line:208

		  VkExtensionProperties* vkObj = (VkExtensionProperties*)(ptr);
		  strncpy(vkObj->extensionName, 
		          _extensionName, 
		          MIN(VK_MAX_EXTENSION_NAME_SIZE - 1, strlen(_extensionName)));
		 
	  
	 if(obj__extensionName != NULL){
		 env->ReleaseStringUTFChars(obj__extensionName, _extensionName);
	 }

}

static inline jstring wrapped_Java_bor_vulkan_structs_VkExtensionProperties_getExtensionName0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:220

		  VkExtensionProperties* vkObj = (VkExtensionProperties*)(ptr);
		  return (jstring)(env->NewStringUTF(vkObj->extensionName));	
             
}

JNIEXPORT jstring JNICALL Java_bor_vulkan_structs_VkExtensionProperties_getExtensionName0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jstring JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkExtensionProperties_getExtensionName0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkExtensionProperties_setSpecVersion0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _specVersion) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:229

		  VkExtensionProperties* vkObj = (VkExtensionProperties*)(ptr);
		  vkObj->specVersion = (uint32_t) (_specVersion);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkExtensionProperties_getSpecVersion0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:238

		  VkExtensionProperties* vkObj = (VkExtensionProperties*)(ptr);
		  return (jint) (vkObj->specVersion);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkExtensionProperties_getSpecVersion0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkExtensionProperties_getSpecVersion0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

