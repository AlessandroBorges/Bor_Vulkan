#include <bor.vulkan.structs.VkCopyDescriptorSet.h>

//@line:46

    #include <BorVulkan.hpp>
    JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkCopyDescriptorSet_setSType0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _sType) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:440

		  VkCopyDescriptorSet* vkObj = (VkCopyDescriptorSet*)(ptr);
		 // code for simple past value 
		  vkObj->sType = (VkStructureType) (_sType);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkCopyDescriptorSet_getSType0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:450

		  VkCopyDescriptorSet* vkObj = (VkCopyDescriptorSet*)(ptr);
		  // generic get for Vk enums
		  return (jint) (vkObj->sType);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkCopyDescriptorSet_getSType0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkCopyDescriptorSet_getSType0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkCopyDescriptorSet_setPNext0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__pNext) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _pNext = (char*)(obj__pNext?env->GetDirectBufferAddress(obj__pNext) : NULL);


//@line:460

		  VkCopyDescriptorSet* vkObj = (VkCopyDescriptorSet*)(ptr);
		 // code for Buffer - ptr to ptr 
		 const void* p_pNext = ( void*) _pNext; 
		 vkObj->pNext = p_pNext; 
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkCopyDescriptorSet_getPNext0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:471

		  VkCopyDescriptorSet* vkObj = (VkCopyDescriptorSet*)(ptr);
		  // generic get for Buffer - field must be pointer! 
		  return (jlong) reinterpret_cast<jlong>(vkObj->pNext);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkCopyDescriptorSet_getPNext0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkCopyDescriptorSet_getPNext0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkCopyDescriptorSet_setSrcSet0(JNIEnv* env, jclass clazz, jobject obj_ptr, jlong _srcSet) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:481

		  VkCopyDescriptorSet* vkObj = (VkCopyDescriptorSet*)(ptr);
		 // code for simple past value 
		  vkObj->srcSet = (VkDescriptorSet) (_srcSet);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkCopyDescriptorSet_getSrcSet0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:491

		  VkCopyDescriptorSet* vkObj = (VkCopyDescriptorSet*)(ptr);
		  // generic get for struct field of type  VkHandle or VkStruct 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->srcSet);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkCopyDescriptorSet_getSrcSet0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkCopyDescriptorSet_getSrcSet0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkCopyDescriptorSet_setSrcBinding0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _srcBinding) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:501

		  VkCopyDescriptorSet* vkObj = (VkCopyDescriptorSet*)(ptr);
		 // code for simple past value 
		  vkObj->srcBinding = (uint32_t) (_srcBinding);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkCopyDescriptorSet_getSrcBinding0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:511

		  VkCopyDescriptorSet* vkObj = (VkCopyDescriptorSet*)(ptr);
		  return (jint) (vkObj->srcBinding);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkCopyDescriptorSet_getSrcBinding0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkCopyDescriptorSet_getSrcBinding0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkCopyDescriptorSet_setSrcArrayElement0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _srcArrayElement) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:520

		  VkCopyDescriptorSet* vkObj = (VkCopyDescriptorSet*)(ptr);
		 // code for simple past value 
		  vkObj->srcArrayElement = (uint32_t) (_srcArrayElement);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkCopyDescriptorSet_getSrcArrayElement0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:530

		  VkCopyDescriptorSet* vkObj = (VkCopyDescriptorSet*)(ptr);
		  return (jint) (vkObj->srcArrayElement);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkCopyDescriptorSet_getSrcArrayElement0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkCopyDescriptorSet_getSrcArrayElement0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkCopyDescriptorSet_setDstSet0(JNIEnv* env, jclass clazz, jobject obj_ptr, jlong _dstSet) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:539

		  VkCopyDescriptorSet* vkObj = (VkCopyDescriptorSet*)(ptr);
		 // code for simple past value 
		  vkObj->dstSet = (VkDescriptorSet) (_dstSet);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkCopyDescriptorSet_getDstSet0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:549

		  VkCopyDescriptorSet* vkObj = (VkCopyDescriptorSet*)(ptr);
		  // generic get for struct field of type  VkHandle or VkStruct 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->dstSet);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkCopyDescriptorSet_getDstSet0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkCopyDescriptorSet_getDstSet0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkCopyDescriptorSet_setDstBinding0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _dstBinding) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:559

		  VkCopyDescriptorSet* vkObj = (VkCopyDescriptorSet*)(ptr);
		 // code for simple past value 
		  vkObj->dstBinding = (uint32_t) (_dstBinding);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkCopyDescriptorSet_getDstBinding0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:569

		  VkCopyDescriptorSet* vkObj = (VkCopyDescriptorSet*)(ptr);
		  return (jint) (vkObj->dstBinding);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkCopyDescriptorSet_getDstBinding0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkCopyDescriptorSet_getDstBinding0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkCopyDescriptorSet_setDstArrayElement0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _dstArrayElement) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:578

		  VkCopyDescriptorSet* vkObj = (VkCopyDescriptorSet*)(ptr);
		 // code for simple past value 
		  vkObj->dstArrayElement = (uint32_t) (_dstArrayElement);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkCopyDescriptorSet_getDstArrayElement0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:588

		  VkCopyDescriptorSet* vkObj = (VkCopyDescriptorSet*)(ptr);
		  return (jint) (vkObj->dstArrayElement);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkCopyDescriptorSet_getDstArrayElement0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkCopyDescriptorSet_getDstArrayElement0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkCopyDescriptorSet_setDescriptorCount0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _descriptorCount) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:597

		  VkCopyDescriptorSet* vkObj = (VkCopyDescriptorSet*)(ptr);
		 // code for simple past value 
		  vkObj->descriptorCount = (uint32_t) (_descriptorCount);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkCopyDescriptorSet_getDescriptorCount0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:607

		  VkCopyDescriptorSet* vkObj = (VkCopyDescriptorSet*)(ptr);
		  return (jint) (vkObj->descriptorCount);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkCopyDescriptorSet_getDescriptorCount0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkCopyDescriptorSet_getDescriptorCount0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

