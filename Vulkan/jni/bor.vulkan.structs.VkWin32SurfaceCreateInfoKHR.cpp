#include <bor.vulkan.structs.VkWin32SurfaceCreateInfoKHR.h>

//@line:42

    #include <BorVulkan.hpp>
    JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkWin32SurfaceCreateInfoKHR_setSType0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _sType) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:316

	 #ifdef VK_USE_PLATFORM_WIN32_KHR 
		  VkWin32SurfaceCreateInfoKHR* vkObj = (VkWin32SurfaceCreateInfoKHR*)(ptr);
		 // code for simple past value 
		  vkObj->sType = (VkStructureType) (_sType);
	 #endif 
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkWin32SurfaceCreateInfoKHR_getSType0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:328

	 #ifdef VK_USE_PLATFORM_WIN32_KHR 
		  VkWin32SurfaceCreateInfoKHR* vkObj = (VkWin32SurfaceCreateInfoKHR*)(ptr);
		  // generic get for Vk enums
		  return (jint) (vkObj->sType);
	 #else 
	   return 0; 
	 #endif 
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkWin32SurfaceCreateInfoKHR_getSType0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkWin32SurfaceCreateInfoKHR_getSType0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkWin32SurfaceCreateInfoKHR_setPNext0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__pNext) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _pNext = (char*)(obj__pNext?env->GetDirectBufferAddress(obj__pNext) : NULL);


//@line:342

	 #ifdef VK_USE_PLATFORM_WIN32_KHR 
		  VkWin32SurfaceCreateInfoKHR* vkObj = (VkWin32SurfaceCreateInfoKHR*)(ptr);
		 // code for Buffer - ptr to ptr 
		 const void* p_pNext = ( void*) _pNext; 
		 vkObj->pNext = p_pNext; 
	 #endif 
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkWin32SurfaceCreateInfoKHR_getPNext0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:355

	 #ifdef VK_USE_PLATFORM_WIN32_KHR 
		  VkWin32SurfaceCreateInfoKHR* vkObj = (VkWin32SurfaceCreateInfoKHR*)(ptr);
		  // generic get for Buffer - field must be pointer! 
		  return (jlong) reinterpret_cast<jlong>(vkObj->pNext);
	 #else 
	   return 0; 
	 #endif 
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkWin32SurfaceCreateInfoKHR_getPNext0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkWin32SurfaceCreateInfoKHR_getPNext0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkWin32SurfaceCreateInfoKHR_setFlags0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _flags) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:369

	 #ifdef VK_USE_PLATFORM_WIN32_KHR 
		  VkWin32SurfaceCreateInfoKHR* vkObj = (VkWin32SurfaceCreateInfoKHR*)(ptr);
		 // code for simple past value 
		  vkObj->flags = (VkWin32SurfaceCreateFlagsKHR) (_flags);
	 #endif 
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkWin32SurfaceCreateInfoKHR_getFlags0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:381

	 #ifdef VK_USE_PLATFORM_WIN32_KHR 
		  VkWin32SurfaceCreateInfoKHR* vkObj = (VkWin32SurfaceCreateInfoKHR*)(ptr);
		  return (jint) (vkObj->flags);
	 #else 
	   return 0; 
	 #endif 
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkWin32SurfaceCreateInfoKHR_getFlags0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkWin32SurfaceCreateInfoKHR_getFlags0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkWin32SurfaceCreateInfoKHR_setHinstance0(JNIEnv* env, jclass clazz, jobject obj_ptr, jlong _hinstance) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:394

	 #ifdef VK_USE_PLATFORM_WIN32_KHR 
		  VkWin32SurfaceCreateInfoKHR* vkObj = (VkWin32SurfaceCreateInfoKHR*)(ptr);
		 // code for simple past value 
		  vkObj->hinstance = (HINSTANCE) (_hinstance);
	 #endif 
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkWin32SurfaceCreateInfoKHR_getHinstance0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:406

	 #ifdef VK_USE_PLATFORM_WIN32_KHR 
		  VkWin32SurfaceCreateInfoKHR* vkObj = (VkWin32SurfaceCreateInfoKHR*)(ptr);
		  // generic get for struct field of type  VkHandle or VkStruct 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->hinstance);
	 #else 
	   return 0; 
	 #endif 
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkWin32SurfaceCreateInfoKHR_getHinstance0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkWin32SurfaceCreateInfoKHR_getHinstance0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkWin32SurfaceCreateInfoKHR_setHwnd0(JNIEnv* env, jclass clazz, jobject obj_ptr, jlong _hwnd) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:420

	 #ifdef VK_USE_PLATFORM_WIN32_KHR 
		  VkWin32SurfaceCreateInfoKHR* vkObj = (VkWin32SurfaceCreateInfoKHR*)(ptr);
		 // code for simple past value 
		  vkObj->hwnd = (HWND) (_hwnd);
	 #endif 
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkWin32SurfaceCreateInfoKHR_getHwnd0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:432

	 #ifdef VK_USE_PLATFORM_WIN32_KHR 
		  VkWin32SurfaceCreateInfoKHR* vkObj = (VkWin32SurfaceCreateInfoKHR*)(ptr);
		  // generic get for struct field of type  VkHandle or VkStruct 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->hwnd);
	 #else 
	   return 0; 
	 #endif 
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkWin32SurfaceCreateInfoKHR_getHwnd0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkWin32SurfaceCreateInfoKHR_getHwnd0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

