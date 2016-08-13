#include <bor.vulkan.structs.VkRect2D.h>

//@line:39

    #include <BorVulkan.hpp>
    JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkRect2D_setOffset0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__offset) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _offset = (char*)(obj__offset?env->GetDirectBufferAddress(obj__offset) : NULL);


//@line:200

		  VkRect2D* vkObj = (VkRect2D*)(ptr);
		 // code for Buffer - ptr to struct 
		 VkOffset2D* p_offset = (VkOffset2D*) _offset; 
		 vkObj->offset = (*p_offset); 
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkRect2D_getOffset0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:211

		  VkRect2D* vkObj = (VkRect2D*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->offset);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkRect2D_getOffset0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkRect2D_getOffset0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkRect2D_setExtent0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__extent) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _extent = (char*)(obj__extent?env->GetDirectBufferAddress(obj__extent) : NULL);


//@line:221

		  VkRect2D* vkObj = (VkRect2D*)(ptr);
		 // code for Buffer - ptr to struct 
		 VkExtent2D* p_extent = (VkExtent2D*) _extent; 
		 vkObj->extent = (*p_extent); 
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkRect2D_getExtent0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:232

		  VkRect2D* vkObj = (VkRect2D*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->extent);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkRect2D_getExtent0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkRect2D_getExtent0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

