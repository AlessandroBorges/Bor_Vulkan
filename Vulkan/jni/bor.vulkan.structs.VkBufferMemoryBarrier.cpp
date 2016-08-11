#include <bor.vulkan.structs.VkBufferMemoryBarrier.h>

//@line:46

    #include <BorVulkan.hpp>
    JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkBufferMemoryBarrier_setSType0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _sType) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:418

		  VkBufferMemoryBarrier* vkObj = (VkBufferMemoryBarrier*)(ptr);
		 // code for simple past value 
		  vkObj->sType = (VkStructureType) (_sType);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkBufferMemoryBarrier_getSType0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:428

		  VkBufferMemoryBarrier* vkObj = (VkBufferMemoryBarrier*)(ptr);
		  return (VkStructureType) (vkObj->sType);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkBufferMemoryBarrier_getSType0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkBufferMemoryBarrier_getSType0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkBufferMemoryBarrier_setPNext0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__pNext) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _pNext = (char*)(obj__pNext?env->GetDirectBufferAddress(obj__pNext) : NULL);


//@line:437

		  VkBufferMemoryBarrier* vkObj = (VkBufferMemoryBarrier*)(ptr);
		 // code for Buffer - referenced by ptr
		  vkObj->pNext = (const void*) (_pNext);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkBufferMemoryBarrier_getPNext0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:447

		  VkBufferMemoryBarrier* vkObj = (VkBufferMemoryBarrier*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->pNext);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkBufferMemoryBarrier_getPNext0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkBufferMemoryBarrier_getPNext0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkBufferMemoryBarrier_setSrcAccessMask0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _srcAccessMask) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:457

		  VkBufferMemoryBarrier* vkObj = (VkBufferMemoryBarrier*)(ptr);
		 // code for simple past value 
		  vkObj->srcAccessMask = (VkAccessFlags) (_srcAccessMask);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkBufferMemoryBarrier_getSrcAccessMask0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:467

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


//@line:476

		  VkBufferMemoryBarrier* vkObj = (VkBufferMemoryBarrier*)(ptr);
		 // code for simple past value 
		  vkObj->dstAccessMask = (VkAccessFlags) (_dstAccessMask);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkBufferMemoryBarrier_getDstAccessMask0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:486

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


//@line:495

		  VkBufferMemoryBarrier* vkObj = (VkBufferMemoryBarrier*)(ptr);
		 // code for simple past value 
		  vkObj->srcQueueFamilyIndex = (uint32_t) (_srcQueueFamilyIndex);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkBufferMemoryBarrier_getSrcQueueFamilyIndex0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:505

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


//@line:514

		  VkBufferMemoryBarrier* vkObj = (VkBufferMemoryBarrier*)(ptr);
		 // code for simple past value 
		  vkObj->dstQueueFamilyIndex = (uint32_t) (_dstQueueFamilyIndex);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkBufferMemoryBarrier_getDstQueueFamilyIndex0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:524

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


//@line:533

		  VkBufferMemoryBarrier* vkObj = (VkBufferMemoryBarrier*)(ptr);
		 // code for simple past value 
		  vkObj->buffer = (VkBuffer) (_buffer);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkBufferMemoryBarrier_getBuffer0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:543

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


//@line:553

		  VkBufferMemoryBarrier* vkObj = (VkBufferMemoryBarrier*)(ptr);
		 // code for simple past value 
		  vkObj->offset = (VkDeviceSize) (_offset);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkBufferMemoryBarrier_getOffset0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:563

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


//@line:572

		  VkBufferMemoryBarrier* vkObj = (VkBufferMemoryBarrier*)(ptr);
		 // code for simple past value 
		  vkObj->size = (VkDeviceSize) (_size);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkBufferMemoryBarrier_getSize0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:582

		  VkBufferMemoryBarrier* vkObj = (VkBufferMemoryBarrier*)(ptr);
		  return (jlong) (vkObj->size);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkBufferMemoryBarrier_getSize0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkBufferMemoryBarrier_getSize0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

