#include <bor.vulkan.structs.VkDrawIndirectCommand.h>

//@line:41

    #include <BorVulkan.hpp>
    JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDrawIndirectCommand_setVertexCount0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _vertexCount) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:253

		  VkDrawIndirectCommand* vkObj = (VkDrawIndirectCommand*)(ptr);
		 // code for simple past value 
		  vkObj->vertexCount = (uint32_t) (_vertexCount);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkDrawIndirectCommand_getVertexCount0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:263

		  VkDrawIndirectCommand* vkObj = (VkDrawIndirectCommand*)(ptr);
		  return (jint) (vkObj->vertexCount);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkDrawIndirectCommand_getVertexCount0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDrawIndirectCommand_getVertexCount0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDrawIndirectCommand_setInstanceCount0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _instanceCount) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:272

		  VkDrawIndirectCommand* vkObj = (VkDrawIndirectCommand*)(ptr);
		 // code for simple past value 
		  vkObj->instanceCount = (uint32_t) (_instanceCount);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkDrawIndirectCommand_getInstanceCount0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:282

		  VkDrawIndirectCommand* vkObj = (VkDrawIndirectCommand*)(ptr);
		  return (jint) (vkObj->instanceCount);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkDrawIndirectCommand_getInstanceCount0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDrawIndirectCommand_getInstanceCount0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDrawIndirectCommand_setFirstVertex0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _firstVertex) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:291

		  VkDrawIndirectCommand* vkObj = (VkDrawIndirectCommand*)(ptr);
		 // code for simple past value 
		  vkObj->firstVertex = (uint32_t) (_firstVertex);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkDrawIndirectCommand_getFirstVertex0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:301

		  VkDrawIndirectCommand* vkObj = (VkDrawIndirectCommand*)(ptr);
		  return (jint) (vkObj->firstVertex);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkDrawIndirectCommand_getFirstVertex0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDrawIndirectCommand_getFirstVertex0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDrawIndirectCommand_setFirstInstance0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _firstInstance) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:310

		  VkDrawIndirectCommand* vkObj = (VkDrawIndirectCommand*)(ptr);
		 // code for simple past value 
		  vkObj->firstInstance = (uint32_t) (_firstInstance);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkDrawIndirectCommand_getFirstInstance0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:320

		  VkDrawIndirectCommand* vkObj = (VkDrawIndirectCommand*)(ptr);
		  return (jint) (vkObj->firstInstance);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkDrawIndirectCommand_getFirstInstance0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDrawIndirectCommand_getFirstInstance0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

