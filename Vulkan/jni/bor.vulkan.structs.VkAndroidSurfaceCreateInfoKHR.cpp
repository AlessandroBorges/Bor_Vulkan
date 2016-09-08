#include <bor.vulkan.structs.VkAndroidSurfaceCreateInfoKHR.h>

//@line:41

    #include <BorVulkan.hpp>
    JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkAndroidSurfaceCreateInfoKHR_setSType0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _sType) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:274

	 #ifdef VK_USE_PLATFORM_ANDROID_KHR 
		  VkAndroidSurfaceCreateInfoKHR* vkObj = (VkAndroidSurfaceCreateInfoKHR*)(ptr);
		 // code for simple past value 
		  vkObj->sType = (VkStructureType) (_sType);
	 #endif 
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkAndroidSurfaceCreateInfoKHR_getSType0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:286

	 #ifdef VK_USE_PLATFORM_ANDROID_KHR 
		  VkAndroidSurfaceCreateInfoKHR* vkObj = (VkAndroidSurfaceCreateInfoKHR*)(ptr);
		  // generic get for Vk enums
		  return (jint) (vkObj->sType);
	 #else 
	   return 0; 
	 #endif 
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkAndroidSurfaceCreateInfoKHR_getSType0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkAndroidSurfaceCreateInfoKHR_getSType0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkAndroidSurfaceCreateInfoKHR_setPNext0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__pNext) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _pNext = (char*)(obj__pNext?env->GetDirectBufferAddress(obj__pNext) : NULL);


//@line:300

	 #ifdef VK_USE_PLATFORM_ANDROID_KHR 
		  VkAndroidSurfaceCreateInfoKHR* vkObj = (VkAndroidSurfaceCreateInfoKHR*)(ptr);
		 // code for Buffer - ptr to ptr 
		 const void* p_pNext = ( void*) _pNext; 
		 vkObj->pNext = p_pNext; 
	 #endif 
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkAndroidSurfaceCreateInfoKHR_getPNext0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:313

	 #ifdef VK_USE_PLATFORM_ANDROID_KHR 
		  VkAndroidSurfaceCreateInfoKHR* vkObj = (VkAndroidSurfaceCreateInfoKHR*)(ptr);
		  // generic get for Buffer - field must be pointer! 
		  return (jlong) reinterpret_cast<jlong>(vkObj->pNext);
	 #else 
	   return 0; 
	 #endif 
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkAndroidSurfaceCreateInfoKHR_getPNext0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkAndroidSurfaceCreateInfoKHR_getPNext0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkAndroidSurfaceCreateInfoKHR_setFlags0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _flags) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:327

	 #ifdef VK_USE_PLATFORM_ANDROID_KHR 
		  VkAndroidSurfaceCreateInfoKHR* vkObj = (VkAndroidSurfaceCreateInfoKHR*)(ptr);
		 // code for simple past value 
		  vkObj->flags = (VkAndroidSurfaceCreateFlagsKHR) (_flags);
	 #endif 
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkAndroidSurfaceCreateInfoKHR_getFlags0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:339

	 #ifdef VK_USE_PLATFORM_ANDROID_KHR 
		  VkAndroidSurfaceCreateInfoKHR* vkObj = (VkAndroidSurfaceCreateInfoKHR*)(ptr);
		  return (jint) (vkObj->flags);
	 #else 
	   return 0; 
	 #endif 
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkAndroidSurfaceCreateInfoKHR_getFlags0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkAndroidSurfaceCreateInfoKHR_getFlags0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkAndroidSurfaceCreateInfoKHR_setWindow0(JNIEnv* env, jclass clazz, jobject obj_ptr, jlong _window) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:352

	 #ifdef VK_USE_PLATFORM_ANDROID_KHR 
		  VkAndroidSurfaceCreateInfoKHR* vkObj = (VkAndroidSurfaceCreateInfoKHR*)(ptr);
		 // code for simple past value 
		  vkObj->window = (ANativeWindow*) (_window);
	 #endif 
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkAndroidSurfaceCreateInfoKHR_getWindow0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:364

	 #ifdef VK_USE_PLATFORM_ANDROID_KHR 
		  VkAndroidSurfaceCreateInfoKHR* vkObj = (VkAndroidSurfaceCreateInfoKHR*)(ptr);
		  // generic get for struct field of type  VkHandle or VkStruct 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->window);
	 #else 
	   return 0; 
	 #endif 
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkAndroidSurfaceCreateInfoKHR_getWindow0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkAndroidSurfaceCreateInfoKHR_getWindow0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

