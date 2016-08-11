#include <bor.vulkan.structs.VkImageBlit.h>

//@line:41

    #include <BorVulkan.hpp>
    JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkImageBlit_setSrcSubresource0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__srcSubresource) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _srcSubresource = (char*)(obj__srcSubresource?env->GetDirectBufferAddress(obj__srcSubresource) : NULL);


//@line:280

		  VkImageBlit* vkObj = (VkImageBlit*)(ptr);
		 // code for Buffer - referenced by ptr
		  vkObj->srcSubresource = (VkImageSubresourceLayers) (_srcSubresource);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkImageBlit_getSrcSubresource0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:290

		  VkImageBlit* vkObj = (VkImageBlit*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->srcSubresource);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkImageBlit_getSrcSubresource0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkImageBlit_getSrcSubresource0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkImageBlit_setSrcOffsets0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__srcOffsets) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _srcOffsets = (char*)(obj__srcOffsets?env->GetDirectBufferAddress(obj__srcOffsets) : NULL);


//@line:300

		  VkImageBlit* vkObj = (VkImageBlit*)(ptr);
		 // code for Buffer - referenced by ptr
		  vkObj->srcOffsets = (VkOffset3D[]) (_srcOffsets);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkImageBlit_getSrcOffsets0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:310

		  VkImageBlit* vkObj = (VkImageBlit*)(ptr);
		  // generic get for array of VkHandle and VkStruct 
		  return (jlong) reinterpret_cast<jlong>( &vkObj->srcOffsets );
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkImageBlit_getSrcOffsets0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkImageBlit_getSrcOffsets0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkImageBlit_setDstSubresource0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__dstSubresource) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _dstSubresource = (char*)(obj__dstSubresource?env->GetDirectBufferAddress(obj__dstSubresource) : NULL);


//@line:320

		  VkImageBlit* vkObj = (VkImageBlit*)(ptr);
		 // code for Buffer - referenced by ptr
		  vkObj->dstSubresource = (VkImageSubresourceLayers) (_dstSubresource);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkImageBlit_getDstSubresource0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:330

		  VkImageBlit* vkObj = (VkImageBlit*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->dstSubresource);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkImageBlit_getDstSubresource0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkImageBlit_getDstSubresource0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkImageBlit_setDstOffsets0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__dstOffsets) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _dstOffsets = (char*)(obj__dstOffsets?env->GetDirectBufferAddress(obj__dstOffsets) : NULL);


//@line:340

		  VkImageBlit* vkObj = (VkImageBlit*)(ptr);
		 // code for Buffer - referenced by ptr
		  vkObj->dstOffsets = (VkOffset3D[]) (_dstOffsets);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkImageBlit_getDstOffsets0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:350

		  VkImageBlit* vkObj = (VkImageBlit*)(ptr);
		  // generic get for array of VkHandle and VkStruct 
		  return (jlong) reinterpret_cast<jlong>( &vkObj->dstOffsets );
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkImageBlit_getDstOffsets0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkImageBlit_getDstOffsets0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

