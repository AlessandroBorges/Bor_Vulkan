#include <bor.vulkan.structs.VkBufferViewCreateInfo.h>

//@line:44

    #include <BorVulkan.hpp>
    JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkBufferViewCreateInfo_setSType0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _sType) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:357

		  VkBufferViewCreateInfo* vkObj = (VkBufferViewCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->sType = (VkStructureType) (_sType);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkBufferViewCreateInfo_getSType0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:367

		  VkBufferViewCreateInfo* vkObj = (VkBufferViewCreateInfo*)(ptr);
		  return (VkStructureType) (vkObj->sType);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkBufferViewCreateInfo_getSType0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkBufferViewCreateInfo_getSType0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkBufferViewCreateInfo_setPNext0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__pNext) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _pNext = (char*)(obj__pNext?env->GetDirectBufferAddress(obj__pNext) : NULL);


//@line:376

		  VkBufferViewCreateInfo* vkObj = (VkBufferViewCreateInfo*)(ptr);
		 // code for Buffer - referenced by ptr
		  vkObj->pNext = (const void*) (_pNext);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkBufferViewCreateInfo_getPNext0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:386

		  VkBufferViewCreateInfo* vkObj = (VkBufferViewCreateInfo*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->pNext);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkBufferViewCreateInfo_getPNext0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkBufferViewCreateInfo_getPNext0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkBufferViewCreateInfo_setFlags0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _flags) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:396

		  VkBufferViewCreateInfo* vkObj = (VkBufferViewCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->flags = (VkBufferViewCreateFlags) (_flags);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkBufferViewCreateInfo_getFlags0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:406

		  VkBufferViewCreateInfo* vkObj = (VkBufferViewCreateInfo*)(ptr);
		  return (jint) (vkObj->flags);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkBufferViewCreateInfo_getFlags0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkBufferViewCreateInfo_getFlags0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkBufferViewCreateInfo_setBuffer0(JNIEnv* env, jclass clazz, jobject obj_ptr, jlong _buffer) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:415

		  VkBufferViewCreateInfo* vkObj = (VkBufferViewCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->buffer = (VkBuffer) (_buffer);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkBufferViewCreateInfo_getBuffer0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:425

		  VkBufferViewCreateInfo* vkObj = (VkBufferViewCreateInfo*)(ptr);
		  // generic get for struct field of type  VkHandle or VkStruct 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->buffer);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkBufferViewCreateInfo_getBuffer0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkBufferViewCreateInfo_getBuffer0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkBufferViewCreateInfo_setFormat0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _format) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:435

		  VkBufferViewCreateInfo* vkObj = (VkBufferViewCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->format = (VkFormat) (_format);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkBufferViewCreateInfo_getFormat0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:445

		  VkBufferViewCreateInfo* vkObj = (VkBufferViewCreateInfo*)(ptr);
		  return (VkFormat) (vkObj->format);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkBufferViewCreateInfo_getFormat0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkBufferViewCreateInfo_getFormat0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkBufferViewCreateInfo_setOffset0(JNIEnv* env, jclass clazz, jobject obj_ptr, jlong _offset) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:454

		  VkBufferViewCreateInfo* vkObj = (VkBufferViewCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->offset = (VkDeviceSize) (_offset);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkBufferViewCreateInfo_getOffset0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:464

		  VkBufferViewCreateInfo* vkObj = (VkBufferViewCreateInfo*)(ptr);
		  return (jlong) (vkObj->offset);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkBufferViewCreateInfo_getOffset0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkBufferViewCreateInfo_getOffset0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkBufferViewCreateInfo_setRange0(JNIEnv* env, jclass clazz, jobject obj_ptr, jlong _range) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:473

		  VkBufferViewCreateInfo* vkObj = (VkBufferViewCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->range = (VkDeviceSize) (_range);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkBufferViewCreateInfo_getRange0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:483

		  VkBufferViewCreateInfo* vkObj = (VkBufferViewCreateInfo*)(ptr);
		  return (jlong) (vkObj->range);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkBufferViewCreateInfo_getRange0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkBufferViewCreateInfo_getRange0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

