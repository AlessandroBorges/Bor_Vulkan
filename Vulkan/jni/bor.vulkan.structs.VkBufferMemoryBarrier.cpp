#include <bor.vulkan.structs.VkBufferMemoryBarrier.h>

//@line:46

    #include <BorVulkan.hpp>
    JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkBufferMemoryBarrier_setSType0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _sType) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:429

		  VkBufferMemoryBarrier* vkObj = (VkBufferMemoryBarrier*)(ptr);
		 // code for simple past value 
		  vkObj->sType = (VkStructureType) (_sType);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkBufferMemoryBarrier_getSType0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:439

		  VkBufferMemoryBarrier* vkObj = (VkBufferMemoryBarrier*)(ptr);
		  // generic get for Vk enums
		  return (jint) (vkObj->sType);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkBufferMemoryBarrier_getSType0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkBufferMemoryBarrier_getSType0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkBufferMemoryBarrier_setPNext0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__pNext) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _pNext = (char*)(obj__pNext?env->GetDirectBufferAddress(obj__pNext) : NULL);


//@line:449

		  VkBufferMemoryBarrier* vkObj = (VkBufferMemoryBarrier*)(ptr);
		 // code for Buffer - ptr to ptr 
		 const void* p_pNext = ( void*) _pNext; 
		 vkObj->pNext = p_pNext; 
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkBufferMemoryBarrier_getPNext0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:460

		  VkBufferMemoryBarrier* vkObj = (VkBufferMemoryBarrier*)(ptr);
		  // generic get for Buffer - field must be pointer! 
		  return (jlong) reinterpret_cast<jlong>(vkObj->pNext);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkBufferMemoryBarrier_getPNext0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkBufferMemoryBarrier_getPNext0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkBufferMemoryBarrier_setSrcAccessMask0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _srcAccessMask) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:470

		  VkBufferMemoryBarrier* vkObj = (VkBufferMemoryBarrier*)(ptr);
		 // code for simple past value 
		  vkObj->srcAccessMask = (VkAccessFlags) (_srcAccessMask);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkBufferMemoryBarrier_getSrcAccessMask0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:480

		  VkBufferMemoryBarrier* vkObj = (VkBufferMemoryBarrier*)(ptr);
		  return (jint) (vkObj->srcAccessMask);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkBufferMemoryBarrier_getSrcAccessMask0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkBufferMemoryBarrier_getSrcAccessMask0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkBufferMemoryBarrier_setDstAccessMask0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _dstAccessMask) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:489

		  VkBufferMemoryBarrier* vkObj = (VkBufferMemoryBarrier*)(ptr);
		 // code for simple past value 
		  vkObj->dstAccessMask = (VkAccessFlags) (_dstAccessMask);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkBufferMemoryBarrier_getDstAccessMask0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:499

		  VkBufferMemoryBarrier* vkObj = (VkBufferMemoryBarrier*)(ptr);
		  return (jint) (vkObj->dstAccessMask);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkBufferMemoryBarrier_getDstAccessMask0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkBufferMemoryBarrier_getDstAccessMask0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkBufferMemoryBarrier_setSrcQueueFamilyIndex0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _srcQueueFamilyIndex) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:508

		  VkBufferMemoryBarrier* vkObj = (VkBufferMemoryBarrier*)(ptr);
		 // code for simple past value 
		  vkObj->srcQueueFamilyIndex = (uint32_t) (_srcQueueFamilyIndex);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkBufferMemoryBarrier_getSrcQueueFamilyIndex0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:518

		  VkBufferMemoryBarrier* vkObj = (VkBufferMemoryBarrier*)(ptr);
		  return (jint) (vkObj->srcQueueFamilyIndex);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkBufferMemoryBarrier_getSrcQueueFamilyIndex0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkBufferMemoryBarrier_getSrcQueueFamilyIndex0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkBufferMemoryBarrier_setDstQueueFamilyIndex0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _dstQueueFamilyIndex) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:527

		  VkBufferMemoryBarrier* vkObj = (VkBufferMemoryBarrier*)(ptr);
		 // code for simple past value 
		  vkObj->dstQueueFamilyIndex = (uint32_t) (_dstQueueFamilyIndex);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkBufferMemoryBarrier_getDstQueueFamilyIndex0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:537

		  VkBufferMemoryBarrier* vkObj = (VkBufferMemoryBarrier*)(ptr);
		  return (jint) (vkObj->dstQueueFamilyIndex);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkBufferMemoryBarrier_getDstQueueFamilyIndex0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkBufferMemoryBarrier_getDstQueueFamilyIndex0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkBufferMemoryBarrier_setBuffer0(JNIEnv* env, jclass clazz, jobject obj_ptr, jlong _buffer) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:546

		  VkBufferMemoryBarrier* vkObj = (VkBufferMemoryBarrier*)(ptr);
		 // code for simple past value 
		  vkObj->buffer = (VkBuffer) (_buffer);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkBufferMemoryBarrier_getBuffer0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:556

		  VkBufferMemoryBarrier* vkObj = (VkBufferMemoryBarrier*)(ptr);
		  // generic get for struct field of type  VkHandle or VkStruct 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->buffer);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkBufferMemoryBarrier_getBuffer0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkBufferMemoryBarrier_getBuffer0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkBufferMemoryBarrier_setOffset0(JNIEnv* env, jclass clazz, jobject obj_ptr, jlong _offset) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:566

		  VkBufferMemoryBarrier* vkObj = (VkBufferMemoryBarrier*)(ptr);
		 // code for simple past value 
		  vkObj->offset = (VkDeviceSize) (_offset);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkBufferMemoryBarrier_getOffset0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:576

		  VkBufferMemoryBarrier* vkObj = (VkBufferMemoryBarrier*)(ptr);
		  return (jlong) (vkObj->offset);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkBufferMemoryBarrier_getOffset0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkBufferMemoryBarrier_getOffset0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkBufferMemoryBarrier_setSize0(JNIEnv* env, jclass clazz, jobject obj_ptr, jlong _size) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:585

		  VkBufferMemoryBarrier* vkObj = (VkBufferMemoryBarrier*)(ptr);
		 // code for simple past value 
		  vkObj->size = (VkDeviceSize) (_size);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkBufferMemoryBarrier_getSize0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:595

		  VkBufferMemoryBarrier* vkObj = (VkBufferMemoryBarrier*)(ptr);
		  return (jlong) (vkObj->size);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkBufferMemoryBarrier_getSize0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkBufferMemoryBarrier_getSize0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

