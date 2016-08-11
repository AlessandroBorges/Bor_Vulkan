#include <bor.vulkan.structs.VkDisplayPresentInfoKHR.h>

//@line:42

    #include <BorVulkan.hpp>
    JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDisplayPresentInfoKHR_setSType0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _sType) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:303

		  VkDisplayPresentInfoKHR* vkObj = (VkDisplayPresentInfoKHR*)(ptr);
		 // code for simple past value 
		  vkObj->sType = (VkStructureType) (_sType);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkDisplayPresentInfoKHR_getSType0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:313

		  VkDisplayPresentInfoKHR* vkObj = (VkDisplayPresentInfoKHR*)(ptr);
		  return (VkStructureType) (vkObj->sType);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkDisplayPresentInfoKHR_getSType0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDisplayPresentInfoKHR_getSType0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDisplayPresentInfoKHR_setPNext0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__pNext) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _pNext = (char*)(obj__pNext?env->GetDirectBufferAddress(obj__pNext) : NULL);


//@line:322

		  VkDisplayPresentInfoKHR* vkObj = (VkDisplayPresentInfoKHR*)(ptr);
		 // code for Buffer - referenced by ptr
		  vkObj->pNext = (const void*) (_pNext);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkDisplayPresentInfoKHR_getPNext0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:332

		  VkDisplayPresentInfoKHR* vkObj = (VkDisplayPresentInfoKHR*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->pNext);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkDisplayPresentInfoKHR_getPNext0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDisplayPresentInfoKHR_getPNext0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDisplayPresentInfoKHR_setSrcRect0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__srcRect) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _srcRect = (char*)(obj__srcRect?env->GetDirectBufferAddress(obj__srcRect) : NULL);


//@line:342

		  VkDisplayPresentInfoKHR* vkObj = (VkDisplayPresentInfoKHR*)(ptr);
		 // code for Buffer - referenced by ptr
		  vkObj->srcRect = (VkRect2D) (_srcRect);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkDisplayPresentInfoKHR_getSrcRect0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:352

		  VkDisplayPresentInfoKHR* vkObj = (VkDisplayPresentInfoKHR*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->srcRect);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkDisplayPresentInfoKHR_getSrcRect0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDisplayPresentInfoKHR_getSrcRect0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDisplayPresentInfoKHR_setDstRect0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__dstRect) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _dstRect = (char*)(obj__dstRect?env->GetDirectBufferAddress(obj__dstRect) : NULL);


//@line:362

		  VkDisplayPresentInfoKHR* vkObj = (VkDisplayPresentInfoKHR*)(ptr);
		 // code for Buffer - referenced by ptr
		  vkObj->dstRect = (VkRect2D) (_dstRect);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkDisplayPresentInfoKHR_getDstRect0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:372

		  VkDisplayPresentInfoKHR* vkObj = (VkDisplayPresentInfoKHR*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->dstRect);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkDisplayPresentInfoKHR_getDstRect0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDisplayPresentInfoKHR_getDstRect0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDisplayPresentInfoKHR_setPersistent0(JNIEnv* env, jclass clazz, jobject obj_ptr, jboolean _persistent) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:382

		  VkDisplayPresentInfoKHR* vkObj = (VkDisplayPresentInfoKHR*)(ptr);
		 // code for simple past value 
		  vkObj->persistent = (VkBool32) (_persistent);
	  

}

static inline jboolean wrapped_Java_bor_vulkan_structs_VkDisplayPresentInfoKHR_getPersistent0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:392

		  VkDisplayPresentInfoKHR* vkObj = (VkDisplayPresentInfoKHR*)(ptr);
		  return (jboolean) (vkObj->persistent);
	 
}

JNIEXPORT jboolean JNICALL Java_bor_vulkan_structs_VkDisplayPresentInfoKHR_getPersistent0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jboolean JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDisplayPresentInfoKHR_getPersistent0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

