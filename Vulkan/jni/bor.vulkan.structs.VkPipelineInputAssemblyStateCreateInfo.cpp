#include <bor.vulkan.structs.VkPipelineInputAssemblyStateCreateInfo.h>

//@line:42

    #include <BorVulkan.hpp>
    JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPipelineInputAssemblyStateCreateInfo_setSType0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _sType) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:284

		  VkPipelineInputAssemblyStateCreateInfo* vkObj = (VkPipelineInputAssemblyStateCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->sType = (VkStructureType) (_sType);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkPipelineInputAssemblyStateCreateInfo_getSType0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:294

		  VkPipelineInputAssemblyStateCreateInfo* vkObj = (VkPipelineInputAssemblyStateCreateInfo*)(ptr);
		  return (VkStructureType) (vkObj->sType);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkPipelineInputAssemblyStateCreateInfo_getSType0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPipelineInputAssemblyStateCreateInfo_getSType0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPipelineInputAssemblyStateCreateInfo_setPNext0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__pNext) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _pNext = (char*)(obj__pNext?env->GetDirectBufferAddress(obj__pNext) : NULL);


//@line:303

		  VkPipelineInputAssemblyStateCreateInfo* vkObj = (VkPipelineInputAssemblyStateCreateInfo*)(ptr);
		 // code for Buffer - referenced by ptr
		  vkObj->pNext = (const void*) (_pNext);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkPipelineInputAssemblyStateCreateInfo_getPNext0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:313

		  VkPipelineInputAssemblyStateCreateInfo* vkObj = (VkPipelineInputAssemblyStateCreateInfo*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->pNext);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkPipelineInputAssemblyStateCreateInfo_getPNext0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPipelineInputAssemblyStateCreateInfo_getPNext0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPipelineInputAssemblyStateCreateInfo_setFlags0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _flags) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:323

		  VkPipelineInputAssemblyStateCreateInfo* vkObj = (VkPipelineInputAssemblyStateCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->flags = (VkPipelineInputAssemblyStateCreateFlags) (_flags);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkPipelineInputAssemblyStateCreateInfo_getFlags0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:333

		  VkPipelineInputAssemblyStateCreateInfo* vkObj = (VkPipelineInputAssemblyStateCreateInfo*)(ptr);
		  return (jint) (vkObj->flags);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkPipelineInputAssemblyStateCreateInfo_getFlags0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPipelineInputAssemblyStateCreateInfo_getFlags0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPipelineInputAssemblyStateCreateInfo_setTopology0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _topology) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:342

		  VkPipelineInputAssemblyStateCreateInfo* vkObj = (VkPipelineInputAssemblyStateCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->topology = (VkPrimitiveTopology) (_topology);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkPipelineInputAssemblyStateCreateInfo_getTopology0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:352

		  VkPipelineInputAssemblyStateCreateInfo* vkObj = (VkPipelineInputAssemblyStateCreateInfo*)(ptr);
		  return (VkPrimitiveTopology) (vkObj->topology);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkPipelineInputAssemblyStateCreateInfo_getTopology0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPipelineInputAssemblyStateCreateInfo_getTopology0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPipelineInputAssemblyStateCreateInfo_setPrimitiveRestartEnable0(JNIEnv* env, jclass clazz, jobject obj_ptr, jboolean _primitiveRestartEnable) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:361

		  VkPipelineInputAssemblyStateCreateInfo* vkObj = (VkPipelineInputAssemblyStateCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->primitiveRestartEnable = (VkBool32) (_primitiveRestartEnable);
	  

}

static inline jboolean wrapped_Java_bor_vulkan_structs_VkPipelineInputAssemblyStateCreateInfo_getPrimitiveRestartEnable0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:371

		  VkPipelineInputAssemblyStateCreateInfo* vkObj = (VkPipelineInputAssemblyStateCreateInfo*)(ptr);
		  return (jboolean) (vkObj->primitiveRestartEnable);
	 
}

JNIEXPORT jboolean JNICALL Java_bor_vulkan_structs_VkPipelineInputAssemblyStateCreateInfo_getPrimitiveRestartEnable0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jboolean JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPipelineInputAssemblyStateCreateInfo_getPrimitiveRestartEnable0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

