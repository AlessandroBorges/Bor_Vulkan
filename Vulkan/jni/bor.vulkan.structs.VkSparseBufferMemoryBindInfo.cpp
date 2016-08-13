#include <bor.vulkan.structs.VkSparseBufferMemoryBindInfo.h>

//@line:40

    #include <BorVulkan.hpp>
    JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkSparseBufferMemoryBindInfo_setBuffer0(JNIEnv* env, jclass clazz, jobject obj_ptr, jlong _buffer) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:232

		  VkSparseBufferMemoryBindInfo* vkObj = (VkSparseBufferMemoryBindInfo*)(ptr);
		 // code for simple past value 
		  vkObj->buffer = (VkBuffer) (_buffer);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkSparseBufferMemoryBindInfo_getBuffer0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:242

		  VkSparseBufferMemoryBindInfo* vkObj = (VkSparseBufferMemoryBindInfo*)(ptr);
		  // generic get for struct field of type  VkHandle or VkStruct 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->buffer);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkSparseBufferMemoryBindInfo_getBuffer0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkSparseBufferMemoryBindInfo_getBuffer0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkSparseBufferMemoryBindInfo_setBindCount0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _bindCount) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:252

		  VkSparseBufferMemoryBindInfo* vkObj = (VkSparseBufferMemoryBindInfo*)(ptr);
		 // code for simple past value 
		  vkObj->bindCount = (uint32_t) (_bindCount);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkSparseBufferMemoryBindInfo_getBindCount0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:262

		  VkSparseBufferMemoryBindInfo* vkObj = (VkSparseBufferMemoryBindInfo*)(ptr);
		  return (jint) (vkObj->bindCount);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkSparseBufferMemoryBindInfo_getBindCount0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkSparseBufferMemoryBindInfo_getBindCount0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkSparseBufferMemoryBindInfo_setPBinds0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__pBinds) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _pBinds = (char*)(obj__pBinds?env->GetDirectBufferAddress(obj__pBinds) : NULL);


//@line:271

		  VkSparseBufferMemoryBindInfo* vkObj = (VkSparseBufferMemoryBindInfo*)(ptr);
		 // code for Buffer - ptr to ptr 
		 const VkSparseMemoryBind* p_pBinds = ( VkSparseMemoryBind*) _pBinds; 
		 vkObj->pBinds = p_pBinds; 
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkSparseBufferMemoryBindInfo_getPBinds0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:282

		  VkSparseBufferMemoryBindInfo* vkObj = (VkSparseBufferMemoryBindInfo*)(ptr);
		  // generic get for array of VkHandle and VkStruct 
		  return (jlong) reinterpret_cast<jlong>( &vkObj->pBinds );
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkSparseBufferMemoryBindInfo_getPBinds0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkSparseBufferMemoryBindInfo_getPBinds0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

