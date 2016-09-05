#include <bor.vulkan.structs.VkImageMemoryBarrier.h>

//@line:47

    #include <BorVulkan.hpp>
    JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkImageMemoryBarrier_setSType0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _sType) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:472

		  VkImageMemoryBarrier* vkObj = (VkImageMemoryBarrier*)(ptr);
		 // code for simple past value 
		  vkObj->sType = (VkStructureType) (_sType);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkImageMemoryBarrier_getSType0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:482

		  VkImageMemoryBarrier* vkObj = (VkImageMemoryBarrier*)(ptr);
		  // generic get for Vk enums
		  return (jint) (vkObj->sType);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkImageMemoryBarrier_getSType0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkImageMemoryBarrier_getSType0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkImageMemoryBarrier_setPNext0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__pNext) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _pNext = (char*)(obj__pNext?env->GetDirectBufferAddress(obj__pNext) : NULL);


//@line:492

		  VkImageMemoryBarrier* vkObj = (VkImageMemoryBarrier*)(ptr);
		 // code for Buffer - ptr to ptr 
		 const void* p_pNext = ( void*) _pNext; 
		 vkObj->pNext = p_pNext; 
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkImageMemoryBarrier_getPNext0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:503

		  VkImageMemoryBarrier* vkObj = (VkImageMemoryBarrier*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->pNext);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkImageMemoryBarrier_getPNext0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkImageMemoryBarrier_getPNext0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkImageMemoryBarrier_setSrcAccessMask0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _srcAccessMask) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:513

		  VkImageMemoryBarrier* vkObj = (VkImageMemoryBarrier*)(ptr);
		 // code for simple past value 
		  vkObj->srcAccessMask = (VkAccessFlags) (_srcAccessMask);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkImageMemoryBarrier_getSrcAccessMask0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:523

		  VkImageMemoryBarrier* vkObj = (VkImageMemoryBarrier*)(ptr);
		  return (jint) (vkObj->srcAccessMask);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkImageMemoryBarrier_getSrcAccessMask0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkImageMemoryBarrier_getSrcAccessMask0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkImageMemoryBarrier_setDstAccessMask0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _dstAccessMask) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:532

		  VkImageMemoryBarrier* vkObj = (VkImageMemoryBarrier*)(ptr);
		 // code for simple past value 
		  vkObj->dstAccessMask = (VkAccessFlags) (_dstAccessMask);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkImageMemoryBarrier_getDstAccessMask0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:542

		  VkImageMemoryBarrier* vkObj = (VkImageMemoryBarrier*)(ptr);
		  return (jint) (vkObj->dstAccessMask);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkImageMemoryBarrier_getDstAccessMask0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkImageMemoryBarrier_getDstAccessMask0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkImageMemoryBarrier_setOldLayout0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _oldLayout) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:551

		  VkImageMemoryBarrier* vkObj = (VkImageMemoryBarrier*)(ptr);
		 // code for simple past value 
		  vkObj->oldLayout = (VkImageLayout) (_oldLayout);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkImageMemoryBarrier_getOldLayout0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:561

		  VkImageMemoryBarrier* vkObj = (VkImageMemoryBarrier*)(ptr);
		  // generic get for Vk enums
		  return (jint) (vkObj->oldLayout);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkImageMemoryBarrier_getOldLayout0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkImageMemoryBarrier_getOldLayout0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkImageMemoryBarrier_setNewLayout0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _newLayout) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:571

		  VkImageMemoryBarrier* vkObj = (VkImageMemoryBarrier*)(ptr);
		 // code for simple past value 
		  vkObj->newLayout = (VkImageLayout) (_newLayout);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkImageMemoryBarrier_getNewLayout0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:581

		  VkImageMemoryBarrier* vkObj = (VkImageMemoryBarrier*)(ptr);
		  // generic get for Vk enums
		  return (jint) (vkObj->newLayout);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkImageMemoryBarrier_getNewLayout0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkImageMemoryBarrier_getNewLayout0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkImageMemoryBarrier_setSrcQueueFamilyIndex0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _srcQueueFamilyIndex) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:591

		  VkImageMemoryBarrier* vkObj = (VkImageMemoryBarrier*)(ptr);
		 // code for simple past value 
		  vkObj->srcQueueFamilyIndex = (uint32_t) (_srcQueueFamilyIndex);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkImageMemoryBarrier_getSrcQueueFamilyIndex0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:601

		  VkImageMemoryBarrier* vkObj = (VkImageMemoryBarrier*)(ptr);
		  return (jint) (vkObj->srcQueueFamilyIndex);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkImageMemoryBarrier_getSrcQueueFamilyIndex0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkImageMemoryBarrier_getSrcQueueFamilyIndex0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkImageMemoryBarrier_setDstQueueFamilyIndex0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _dstQueueFamilyIndex) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:610

		  VkImageMemoryBarrier* vkObj = (VkImageMemoryBarrier*)(ptr);
		 // code for simple past value 
		  vkObj->dstQueueFamilyIndex = (uint32_t) (_dstQueueFamilyIndex);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkImageMemoryBarrier_getDstQueueFamilyIndex0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:620

		  VkImageMemoryBarrier* vkObj = (VkImageMemoryBarrier*)(ptr);
		  return (jint) (vkObj->dstQueueFamilyIndex);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkImageMemoryBarrier_getDstQueueFamilyIndex0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkImageMemoryBarrier_getDstQueueFamilyIndex0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkImageMemoryBarrier_setImage0(JNIEnv* env, jclass clazz, jobject obj_ptr, jlong _image) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:629

		  VkImageMemoryBarrier* vkObj = (VkImageMemoryBarrier*)(ptr);
		 // code for simple past value 
		  vkObj->image = (VkImage) (_image);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkImageMemoryBarrier_getImage0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:639

		  VkImageMemoryBarrier* vkObj = (VkImageMemoryBarrier*)(ptr);
		  // generic get for struct field of type  VkHandle or VkStruct 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->image);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkImageMemoryBarrier_getImage0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkImageMemoryBarrier_getImage0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkImageMemoryBarrier_setSubresourceRange0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__subresourceRange) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _subresourceRange = (char*)(obj__subresourceRange?env->GetDirectBufferAddress(obj__subresourceRange) : NULL);


//@line:649

		  VkImageMemoryBarrier* vkObj = (VkImageMemoryBarrier*)(ptr);
		 // code for Buffer - ptr to struct 
		 VkImageSubresourceRange* p_subresourceRange = (VkImageSubresourceRange*) _subresourceRange; 
		 vkObj->subresourceRange = (*p_subresourceRange); 
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkImageMemoryBarrier_getSubresourceRange0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:660

		  VkImageMemoryBarrier* vkObj = (VkImageMemoryBarrier*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->subresourceRange);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkImageMemoryBarrier_getSubresourceRange0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkImageMemoryBarrier_getSubresourceRange0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

