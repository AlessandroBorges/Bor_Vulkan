#include <bor.vulkan.structs.VkSparseImageMemoryBindInfo.h>

//@line:40

    #include <BorVulkan.hpp>
    JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkSparseImageMemoryBindInfo_setImage0(JNIEnv* env, jclass clazz, jobject obj_ptr, jlong _image) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:232

		  VkSparseImageMemoryBindInfo* vkObj = (VkSparseImageMemoryBindInfo*)(ptr);
		 // code for simple past value 
		  vkObj->image = (VkImage) (_image);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkSparseImageMemoryBindInfo_getImage0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:242

		  VkSparseImageMemoryBindInfo* vkObj = (VkSparseImageMemoryBindInfo*)(ptr);
		  // generic get for struct field of type  VkHandle or VkStruct 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->image);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkSparseImageMemoryBindInfo_getImage0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkSparseImageMemoryBindInfo_getImage0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkSparseImageMemoryBindInfo_setBindCount0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _bindCount) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:252

		  VkSparseImageMemoryBindInfo* vkObj = (VkSparseImageMemoryBindInfo*)(ptr);
		 // code for simple past value 
		  vkObj->bindCount = (uint32_t) (_bindCount);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkSparseImageMemoryBindInfo_getBindCount0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:262

		  VkSparseImageMemoryBindInfo* vkObj = (VkSparseImageMemoryBindInfo*)(ptr);
		  return (jint) (vkObj->bindCount);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkSparseImageMemoryBindInfo_getBindCount0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkSparseImageMemoryBindInfo_getBindCount0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkSparseImageMemoryBindInfo_setPBinds0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__pBinds) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _pBinds = (char*)(obj__pBinds?env->GetDirectBufferAddress(obj__pBinds) : NULL);


//@line:271

		  VkSparseImageMemoryBindInfo* vkObj = (VkSparseImageMemoryBindInfo*)(ptr);
		 // code for Buffer - ptr to ptr 
		 const VkSparseImageMemoryBind* p_pBinds = ( VkSparseImageMemoryBind*) _pBinds; 
		 vkObj->pBinds = p_pBinds; 
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkSparseImageMemoryBindInfo_getPBinds0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:282

		  VkSparseImageMemoryBindInfo* vkObj = (VkSparseImageMemoryBindInfo*)(ptr);
		  // generic get for array of VkHandle and VkStruct 
		  return (jlong) reinterpret_cast<jlong>( &vkObj->pBinds );
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkSparseImageMemoryBindInfo_getPBinds0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkSparseImageMemoryBindInfo_getPBinds0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

