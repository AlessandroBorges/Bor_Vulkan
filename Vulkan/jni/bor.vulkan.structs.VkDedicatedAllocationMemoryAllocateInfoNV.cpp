#include <bor.vulkan.structs.VkDedicatedAllocationMemoryAllocateInfoNV.h>

//@line:41

    #include <BorVulkan.hpp>
    JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDedicatedAllocationMemoryAllocateInfoNV_setSType0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _sType) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:274

		  VkDedicatedAllocationMemoryAllocateInfoNV* vkObj = (VkDedicatedAllocationMemoryAllocateInfoNV*)(ptr);
		 // code for simple past value 
		  vkObj->sType = (VkStructureType) (_sType);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkDedicatedAllocationMemoryAllocateInfoNV_getSType0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:284

		  VkDedicatedAllocationMemoryAllocateInfoNV* vkObj = (VkDedicatedAllocationMemoryAllocateInfoNV*)(ptr);
		  // generic get for Vk enums
		  return (jint) (vkObj->sType);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkDedicatedAllocationMemoryAllocateInfoNV_getSType0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDedicatedAllocationMemoryAllocateInfoNV_getSType0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDedicatedAllocationMemoryAllocateInfoNV_setPNext0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__pNext) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _pNext = (char*)(obj__pNext?env->GetDirectBufferAddress(obj__pNext) : NULL);


//@line:294

		  VkDedicatedAllocationMemoryAllocateInfoNV* vkObj = (VkDedicatedAllocationMemoryAllocateInfoNV*)(ptr);
		 // code for Buffer - ptr to ptr 
		 const void* p_pNext = ( void*) _pNext; 
		 vkObj->pNext = p_pNext; 
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkDedicatedAllocationMemoryAllocateInfoNV_getPNext0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:305

		  VkDedicatedAllocationMemoryAllocateInfoNV* vkObj = (VkDedicatedAllocationMemoryAllocateInfoNV*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->pNext);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkDedicatedAllocationMemoryAllocateInfoNV_getPNext0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDedicatedAllocationMemoryAllocateInfoNV_getPNext0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDedicatedAllocationMemoryAllocateInfoNV_setImage0(JNIEnv* env, jclass clazz, jobject obj_ptr, jlong _image) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:315

		  VkDedicatedAllocationMemoryAllocateInfoNV* vkObj = (VkDedicatedAllocationMemoryAllocateInfoNV*)(ptr);
		 // code for simple past value 
		  vkObj->image = (VkImage) (_image);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkDedicatedAllocationMemoryAllocateInfoNV_getImage0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:325

		  VkDedicatedAllocationMemoryAllocateInfoNV* vkObj = (VkDedicatedAllocationMemoryAllocateInfoNV*)(ptr);
		  // generic get for struct field of type  VkHandle or VkStruct 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->image);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkDedicatedAllocationMemoryAllocateInfoNV_getImage0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDedicatedAllocationMemoryAllocateInfoNV_getImage0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDedicatedAllocationMemoryAllocateInfoNV_setBuffer0(JNIEnv* env, jclass clazz, jobject obj_ptr, jlong _buffer) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:335

		  VkDedicatedAllocationMemoryAllocateInfoNV* vkObj = (VkDedicatedAllocationMemoryAllocateInfoNV*)(ptr);
		 // code for simple past value 
		  vkObj->buffer = (VkBuffer) (_buffer);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkDedicatedAllocationMemoryAllocateInfoNV_getBuffer0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:345

		  VkDedicatedAllocationMemoryAllocateInfoNV* vkObj = (VkDedicatedAllocationMemoryAllocateInfoNV*)(ptr);
		  // generic get for struct field of type  VkHandle or VkStruct 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->buffer);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkDedicatedAllocationMemoryAllocateInfoNV_getBuffer0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDedicatedAllocationMemoryAllocateInfoNV_getBuffer0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

