#include <bor.vulkan.structs.VkDrawIndexedIndirectCommand.h>

//@line:42

    #include <BorVulkan.hpp>
    JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDrawIndexedIndirectCommand_setIndexCount0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _indexCount) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:284

		  VkDrawIndexedIndirectCommand* vkObj = (VkDrawIndexedIndirectCommand*)(ptr);
		 // code for simple past value 
		  vkObj->indexCount = (uint32_t) (_indexCount);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkDrawIndexedIndirectCommand_getIndexCount0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:294

		  VkDrawIndexedIndirectCommand* vkObj = (VkDrawIndexedIndirectCommand*)(ptr);
		  return (jint) (vkObj->indexCount);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkDrawIndexedIndirectCommand_getIndexCount0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDrawIndexedIndirectCommand_getIndexCount0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDrawIndexedIndirectCommand_setInstanceCount0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _instanceCount) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:303

		  VkDrawIndexedIndirectCommand* vkObj = (VkDrawIndexedIndirectCommand*)(ptr);
		 // code for simple past value 
		  vkObj->instanceCount = (uint32_t) (_instanceCount);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkDrawIndexedIndirectCommand_getInstanceCount0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:313

		  VkDrawIndexedIndirectCommand* vkObj = (VkDrawIndexedIndirectCommand*)(ptr);
		  return (jint) (vkObj->instanceCount);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkDrawIndexedIndirectCommand_getInstanceCount0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDrawIndexedIndirectCommand_getInstanceCount0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDrawIndexedIndirectCommand_setFirstIndex0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _firstIndex) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:322

		  VkDrawIndexedIndirectCommand* vkObj = (VkDrawIndexedIndirectCommand*)(ptr);
		 // code for simple past value 
		  vkObj->firstIndex = (uint32_t) (_firstIndex);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkDrawIndexedIndirectCommand_getFirstIndex0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:332

		  VkDrawIndexedIndirectCommand* vkObj = (VkDrawIndexedIndirectCommand*)(ptr);
		  return (jint) (vkObj->firstIndex);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkDrawIndexedIndirectCommand_getFirstIndex0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDrawIndexedIndirectCommand_getFirstIndex0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDrawIndexedIndirectCommand_setVertexOffset0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _vertexOffset) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:341

		  VkDrawIndexedIndirectCommand* vkObj = (VkDrawIndexedIndirectCommand*)(ptr);
		 // code for simple past value 
		  vkObj->vertexOffset = (int32_t) (_vertexOffset);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkDrawIndexedIndirectCommand_getVertexOffset0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:351

		  VkDrawIndexedIndirectCommand* vkObj = (VkDrawIndexedIndirectCommand*)(ptr);
		  return (jint) (vkObj->vertexOffset);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkDrawIndexedIndirectCommand_getVertexOffset0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDrawIndexedIndirectCommand_getVertexOffset0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDrawIndexedIndirectCommand_setFirstInstance0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _firstInstance) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:360

		  VkDrawIndexedIndirectCommand* vkObj = (VkDrawIndexedIndirectCommand*)(ptr);
		 // code for simple past value 
		  vkObj->firstInstance = (uint32_t) (_firstInstance);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkDrawIndexedIndirectCommand_getFirstInstance0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:370

		  VkDrawIndexedIndirectCommand* vkObj = (VkDrawIndexedIndirectCommand*)(ptr);
		  return (jint) (vkObj->firstInstance);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkDrawIndexedIndirectCommand_getFirstInstance0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDrawIndexedIndirectCommand_getFirstInstance0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

