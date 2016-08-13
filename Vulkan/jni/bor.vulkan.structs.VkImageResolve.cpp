#include <bor.vulkan.structs.VkImageResolve.h>

//@line:42

    #include <BorVulkan.hpp>
    JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkImageResolve_setSrcSubresource0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__srcSubresource) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _srcSubresource = (char*)(obj__srcSubresource?env->GetDirectBufferAddress(obj__srcSubresource) : NULL);


//@line:323

		  VkImageResolve* vkObj = (VkImageResolve*)(ptr);
		 // code for Buffer - ptr to struct 
		 VkImageSubresourceLayers* p_srcSubresource = (VkImageSubresourceLayers*) _srcSubresource; 
		 vkObj->srcSubresource = (*p_srcSubresource); 
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkImageResolve_getSrcSubresource0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:334

		  VkImageResolve* vkObj = (VkImageResolve*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->srcSubresource);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkImageResolve_getSrcSubresource0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkImageResolve_getSrcSubresource0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkImageResolve_setSrcOffset0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__srcOffset) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _srcOffset = (char*)(obj__srcOffset?env->GetDirectBufferAddress(obj__srcOffset) : NULL);


//@line:344

		  VkImageResolve* vkObj = (VkImageResolve*)(ptr);
		 // code for Buffer - ptr to struct 
		 VkOffset3D* p_srcOffset = (VkOffset3D*) _srcOffset; 
		 vkObj->srcOffset = (*p_srcOffset); 
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkImageResolve_getSrcOffset0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:355

		  VkImageResolve* vkObj = (VkImageResolve*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->srcOffset);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkImageResolve_getSrcOffset0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkImageResolve_getSrcOffset0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkImageResolve_setDstSubresource0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__dstSubresource) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _dstSubresource = (char*)(obj__dstSubresource?env->GetDirectBufferAddress(obj__dstSubresource) : NULL);


//@line:365

		  VkImageResolve* vkObj = (VkImageResolve*)(ptr);
		 // code for Buffer - ptr to struct 
		 VkImageSubresourceLayers* p_dstSubresource = (VkImageSubresourceLayers*) _dstSubresource; 
		 vkObj->dstSubresource = (*p_dstSubresource); 
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkImageResolve_getDstSubresource0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:376

		  VkImageResolve* vkObj = (VkImageResolve*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->dstSubresource);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkImageResolve_getDstSubresource0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkImageResolve_getDstSubresource0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkImageResolve_setDstOffset0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__dstOffset) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _dstOffset = (char*)(obj__dstOffset?env->GetDirectBufferAddress(obj__dstOffset) : NULL);


//@line:386

		  VkImageResolve* vkObj = (VkImageResolve*)(ptr);
		 // code for Buffer - ptr to struct 
		 VkOffset3D* p_dstOffset = (VkOffset3D*) _dstOffset; 
		 vkObj->dstOffset = (*p_dstOffset); 
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkImageResolve_getDstOffset0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:397

		  VkImageResolve* vkObj = (VkImageResolve*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->dstOffset);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkImageResolve_getDstOffset0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkImageResolve_getDstOffset0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkImageResolve_setExtent0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__extent) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _extent = (char*)(obj__extent?env->GetDirectBufferAddress(obj__extent) : NULL);


//@line:407

		  VkImageResolve* vkObj = (VkImageResolve*)(ptr);
		 // code for Buffer - ptr to struct 
		 VkExtent3D* p_extent = (VkExtent3D*) _extent; 
		 vkObj->extent = (*p_extent); 
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkImageResolve_getExtent0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:418

		  VkImageResolve* vkObj = (VkImageResolve*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->extent);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkImageResolve_getExtent0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkImageResolve_getExtent0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

