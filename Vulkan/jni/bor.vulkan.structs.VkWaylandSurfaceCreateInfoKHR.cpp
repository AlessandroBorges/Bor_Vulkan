#include <bor.vulkan.structs.VkWaylandSurfaceCreateInfoKHR.h>

//@line:42

    #include <BorVulkan.hpp>
    JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkWaylandSurfaceCreateInfoKHR_setSType0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _sType) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:316

	 #ifdef VK_USE_PLATFORM_WAYLAND_KHR 
		  VkWaylandSurfaceCreateInfoKHR* vkObj = (VkWaylandSurfaceCreateInfoKHR*)(ptr);
		 // code for simple past value 
		  vkObj->sType = (VkStructureType) (_sType);
	 #endif 
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkWaylandSurfaceCreateInfoKHR_getSType0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:328

	 #ifdef VK_USE_PLATFORM_WAYLAND_KHR 
		  VkWaylandSurfaceCreateInfoKHR* vkObj = (VkWaylandSurfaceCreateInfoKHR*)(ptr);
		  // generic get for Vk enums
		  return (jint) (vkObj->sType);
	 #else 
	   return 0; 
	 #endif 
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkWaylandSurfaceCreateInfoKHR_getSType0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkWaylandSurfaceCreateInfoKHR_getSType0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkWaylandSurfaceCreateInfoKHR_setPNext0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__pNext) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _pNext = (char*)(obj__pNext?env->GetDirectBufferAddress(obj__pNext) : NULL);


//@line:342

	 #ifdef VK_USE_PLATFORM_WAYLAND_KHR 
		  VkWaylandSurfaceCreateInfoKHR* vkObj = (VkWaylandSurfaceCreateInfoKHR*)(ptr);
		 // code for Buffer - ptr to ptr 
		 const void* p_pNext = ( void*) _pNext; 
		 vkObj->pNext = p_pNext; 
	 #endif 
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkWaylandSurfaceCreateInfoKHR_getPNext0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:355

	 #ifdef VK_USE_PLATFORM_WAYLAND_KHR 
		  VkWaylandSurfaceCreateInfoKHR* vkObj = (VkWaylandSurfaceCreateInfoKHR*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->pNext);
	 #else 
	   return 0; 
	 #endif 
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkWaylandSurfaceCreateInfoKHR_getPNext0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkWaylandSurfaceCreateInfoKHR_getPNext0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkWaylandSurfaceCreateInfoKHR_setFlags0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _flags) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:369

	 #ifdef VK_USE_PLATFORM_WAYLAND_KHR 
		  VkWaylandSurfaceCreateInfoKHR* vkObj = (VkWaylandSurfaceCreateInfoKHR*)(ptr);
		 // code for simple past value 
		  vkObj->flags = (VkWaylandSurfaceCreateFlagsKHR) (_flags);
	 #endif 
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkWaylandSurfaceCreateInfoKHR_getFlags0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:381

	 #ifdef VK_USE_PLATFORM_WAYLAND_KHR 
		  VkWaylandSurfaceCreateInfoKHR* vkObj = (VkWaylandSurfaceCreateInfoKHR*)(ptr);
		  return (jint) (vkObj->flags);
	 #else 
	   return 0; 
	 #endif 
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkWaylandSurfaceCreateInfoKHR_getFlags0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkWaylandSurfaceCreateInfoKHR_getFlags0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkWaylandSurfaceCreateInfoKHR_setDisplay0(JNIEnv* env, jclass clazz, jobject obj_ptr, jlong _display) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:394

	 #ifdef VK_USE_PLATFORM_WAYLAND_KHR 
		  VkWaylandSurfaceCreateInfoKHR* vkObj = (VkWaylandSurfaceCreateInfoKHR*)(ptr);
		 // code for simple past value 
		  vkObj->display = (struct wl_display*) (_display);
	 #endif 
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkWaylandSurfaceCreateInfoKHR_getDisplay0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:406

	 #ifdef VK_USE_PLATFORM_WAYLAND_KHR 
		  VkWaylandSurfaceCreateInfoKHR* vkObj = (VkWaylandSurfaceCreateInfoKHR*)(ptr);
		  // generic get for struct field of type  VkHandle or VkStruct 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->display);
	 #else 
	   return 0; 
	 #endif 
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkWaylandSurfaceCreateInfoKHR_getDisplay0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkWaylandSurfaceCreateInfoKHR_getDisplay0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkWaylandSurfaceCreateInfoKHR_setSurface0(JNIEnv* env, jclass clazz, jobject obj_ptr, jlong _surface) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:420

	 #ifdef VK_USE_PLATFORM_WAYLAND_KHR 
		  VkWaylandSurfaceCreateInfoKHR* vkObj = (VkWaylandSurfaceCreateInfoKHR*)(ptr);
		 // code for simple past value 
		  vkObj->surface = (struct wl_surface*) (_surface);
	 #endif 
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkWaylandSurfaceCreateInfoKHR_getSurface0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:432

	 #ifdef VK_USE_PLATFORM_WAYLAND_KHR 
		  VkWaylandSurfaceCreateInfoKHR* vkObj = (VkWaylandSurfaceCreateInfoKHR*)(ptr);
		  // generic get for struct field of type  VkHandle or VkStruct 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->surface);
	 #else 
	   return 0; 
	 #endif 
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkWaylandSurfaceCreateInfoKHR_getSurface0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkWaylandSurfaceCreateInfoKHR_getSurface0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

