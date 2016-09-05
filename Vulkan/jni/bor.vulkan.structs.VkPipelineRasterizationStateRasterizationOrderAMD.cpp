#include <bor.vulkan.structs.VkPipelineRasterizationStateRasterizationOrderAMD.h>

//@line:40

    #include <BorVulkan.hpp>
    JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPipelineRasterizationStateRasterizationOrderAMD_setSType0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _sType) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:233

		  VkPipelineRasterizationStateRasterizationOrderAMD* vkObj = (VkPipelineRasterizationStateRasterizationOrderAMD*)(ptr);
		 // code for simple past value 
		  vkObj->sType = (VkStructureType) (_sType);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkPipelineRasterizationStateRasterizationOrderAMD_getSType0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:243

		  VkPipelineRasterizationStateRasterizationOrderAMD* vkObj = (VkPipelineRasterizationStateRasterizationOrderAMD*)(ptr);
		  // generic get for Vk enums
		  return (jint) (vkObj->sType);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkPipelineRasterizationStateRasterizationOrderAMD_getSType0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPipelineRasterizationStateRasterizationOrderAMD_getSType0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPipelineRasterizationStateRasterizationOrderAMD_setPNext0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__pNext) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _pNext = (char*)(obj__pNext?env->GetDirectBufferAddress(obj__pNext) : NULL);


//@line:253

		  VkPipelineRasterizationStateRasterizationOrderAMD* vkObj = (VkPipelineRasterizationStateRasterizationOrderAMD*)(ptr);
		 // code for Buffer - ptr to ptr 
		 const void* p_pNext = ( void*) _pNext; 
		 vkObj->pNext = p_pNext; 
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkPipelineRasterizationStateRasterizationOrderAMD_getPNext0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:264

		  VkPipelineRasterizationStateRasterizationOrderAMD* vkObj = (VkPipelineRasterizationStateRasterizationOrderAMD*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->pNext);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkPipelineRasterizationStateRasterizationOrderAMD_getPNext0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPipelineRasterizationStateRasterizationOrderAMD_getPNext0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPipelineRasterizationStateRasterizationOrderAMD_setRasterizationOrder0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _rasterizationOrder) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:274

		  VkPipelineRasterizationStateRasterizationOrderAMD* vkObj = (VkPipelineRasterizationStateRasterizationOrderAMD*)(ptr);
		 // code for simple past value 
		  vkObj->rasterizationOrder = (VkRasterizationOrderAMD) (_rasterizationOrder);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkPipelineRasterizationStateRasterizationOrderAMD_getRasterizationOrder0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:284

		  VkPipelineRasterizationStateRasterizationOrderAMD* vkObj = (VkPipelineRasterizationStateRasterizationOrderAMD*)(ptr);
		  // generic get for Vk enums
		  return (jint) (vkObj->rasterizationOrder);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkPipelineRasterizationStateRasterizationOrderAMD_getRasterizationOrder0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPipelineRasterizationStateRasterizationOrderAMD_getRasterizationOrder0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

