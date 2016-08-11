#include <bor.vulkan.structs.VkMirSurfaceCreateInfoKHR.h>

//@line:42

    #include <BorVulkan.hpp>
    JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkMirSurfaceCreateInfoKHR_setSType0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _sType) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:305

	 #ifdef VK_USE_PLATFORM_MIR_KHR 
		  VkMirSurfaceCreateInfoKHR* vkObj = (VkMirSurfaceCreateInfoKHR*)(ptr);
		 // code for simple past value 
		  vkObj->sType = (VkStructureType) (_sType);
	 #endif 
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkMirSurfaceCreateInfoKHR_getSType0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:317

	 #ifdef VK_USE_PLATFORM_MIR_KHR 
		  VkMirSurfaceCreateInfoKHR* vkObj = (VkMirSurfaceCreateInfoKHR*)(ptr);
		  return (VkStructureType) (vkObj->sType);
	 #else 
	   return 0; 
	 #endif 
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkMirSurfaceCreateInfoKHR_getSType0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkMirSurfaceCreateInfoKHR_getSType0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkMirSurfaceCreateInfoKHR_setPNext0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__pNext) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _pNext = (char*)(obj__pNext?env->GetDirectBufferAddress(obj__pNext) : NULL);


//@line:330

	 #ifdef VK_USE_PLATFORM_MIR_KHR 
		  VkMirSurfaceCreateInfoKHR* vkObj = (VkMirSurfaceCreateInfoKHR*)(ptr);
		 // code for Buffer - referenced by ptr
		  vkObj->pNext = (const void*) (_pNext);
	 #endif 
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkMirSurfaceCreateInfoKHR_getPNext0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:342

	 #ifdef VK_USE_PLATFORM_MIR_KHR 
		  VkMirSurfaceCreateInfoKHR* vkObj = (VkMirSurfaceCreateInfoKHR*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->pNext);
	 #else 
	   return 0; 
	 #endif 
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkMirSurfaceCreateInfoKHR_getPNext0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkMirSurfaceCreateInfoKHR_getPNext0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkMirSurfaceCreateInfoKHR_setFlags0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _flags) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:356

	 #ifdef VK_USE_PLATFORM_MIR_KHR 
		  VkMirSurfaceCreateInfoKHR* vkObj = (VkMirSurfaceCreateInfoKHR*)(ptr);
		 // code for simple past value 
		  vkObj->flags = (VkMirSurfaceCreateFlagsKHR) (_flags);
	 #endif 
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkMirSurfaceCreateInfoKHR_getFlags0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:368

	 #ifdef VK_USE_PLATFORM_MIR_KHR 
		  VkMirSurfaceCreateInfoKHR* vkObj = (VkMirSurfaceCreateInfoKHR*)(ptr);
		  return (jint) (vkObj->flags);
	 #else 
	   return 0; 
	 #endif 
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkMirSurfaceCreateInfoKHR_getFlags0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkMirSurfaceCreateInfoKHR_getFlags0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkMirSurfaceCreateInfoKHR_setConnection0(JNIEnv* env, jclass clazz, jobject obj_ptr, jlong _connection) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:381

	 #ifdef VK_USE_PLATFORM_MIR_KHR 
		  VkMirSurfaceCreateInfoKHR* vkObj = (VkMirSurfaceCreateInfoKHR*)(ptr);
		 // code for simple past value 
		  vkObj->connection = (MirConnection*) (_connection);
	 #endif 
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkMirSurfaceCreateInfoKHR_getConnection0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:393

	 #ifdef VK_USE_PLATFORM_MIR_KHR 
		  VkMirSurfaceCreateInfoKHR* vkObj = (VkMirSurfaceCreateInfoKHR*)(ptr);
		  // generic get for struct field of type  VkHandle or VkStruct 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->connection);
	 #else 
	   return 0; 
	 #endif 
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkMirSurfaceCreateInfoKHR_getConnection0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkMirSurfaceCreateInfoKHR_getConnection0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkMirSurfaceCreateInfoKHR_setMirSurface0(JNIEnv* env, jclass clazz, jobject obj_ptr, jlong _mirSurface) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:407

	 #ifdef VK_USE_PLATFORM_MIR_KHR 
		  VkMirSurfaceCreateInfoKHR* vkObj = (VkMirSurfaceCreateInfoKHR*)(ptr);
		 // code for simple past value 
		  vkObj->mirSurface = (MirSurface*) (_mirSurface);
	 #endif 
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkMirSurfaceCreateInfoKHR_getMirSurface0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:419

	 #ifdef VK_USE_PLATFORM_MIR_KHR 
		  VkMirSurfaceCreateInfoKHR* vkObj = (VkMirSurfaceCreateInfoKHR*)(ptr);
		  // generic get for struct field of type  VkHandle or VkStruct 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->mirSurface);
	 #else 
	   return 0; 
	 #endif 
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkMirSurfaceCreateInfoKHR_getMirSurface0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkMirSurfaceCreateInfoKHR_getMirSurface0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

