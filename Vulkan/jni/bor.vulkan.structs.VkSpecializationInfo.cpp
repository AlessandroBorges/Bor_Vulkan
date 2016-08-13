#include <bor.vulkan.structs.VkSpecializationInfo.h>

//@line:41

    #include <BorVulkan.hpp>
    JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkSpecializationInfo_setMapEntryCount0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _mapEntryCount) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:255

		  VkSpecializationInfo* vkObj = (VkSpecializationInfo*)(ptr);
		 // code for simple past value 
		  vkObj->mapEntryCount = (uint32_t) (_mapEntryCount);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkSpecializationInfo_getMapEntryCount0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:265

		  VkSpecializationInfo* vkObj = (VkSpecializationInfo*)(ptr);
		  return (jint) (vkObj->mapEntryCount);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkSpecializationInfo_getMapEntryCount0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkSpecializationInfo_getMapEntryCount0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkSpecializationInfo_setPMapEntries0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__pMapEntries) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _pMapEntries = (char*)(obj__pMapEntries?env->GetDirectBufferAddress(obj__pMapEntries) : NULL);


//@line:274

		  VkSpecializationInfo* vkObj = (VkSpecializationInfo*)(ptr);
		 // code for Buffer - ptr to ptr 
		 const VkSpecializationMapEntry* p_pMapEntries = ( VkSpecializationMapEntry*) _pMapEntries; 
		 vkObj->pMapEntries = p_pMapEntries; 
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkSpecializationInfo_getPMapEntries0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:285

		  VkSpecializationInfo* vkObj = (VkSpecializationInfo*)(ptr);
		  // generic get for array of VkHandle and VkStruct 
		  return (jlong) reinterpret_cast<jlong>( &vkObj->pMapEntries );
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkSpecializationInfo_getPMapEntries0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkSpecializationInfo_getPMapEntries0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkSpecializationInfo_setDataSize0(JNIEnv* env, jclass clazz, jobject obj_ptr, jlong _dataSize) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:295

		  VkSpecializationInfo* vkObj = (VkSpecializationInfo*)(ptr);
		 // code for simple past value 
		  vkObj->dataSize = (size_t) (_dataSize);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkSpecializationInfo_getDataSize0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:305

		  VkSpecializationInfo* vkObj = (VkSpecializationInfo*)(ptr);
		  return (jlong) (vkObj->dataSize);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkSpecializationInfo_getDataSize0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkSpecializationInfo_getDataSize0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkSpecializationInfo_setPData0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__pData) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	unsigned char* _pData = (unsigned char*)(obj__pData?env->GetDirectBufferAddress(obj__pData) : NULL);


//@line:314

		  VkSpecializationInfo* vkObj = (VkSpecializationInfo*)(ptr);
		 // code for Buffer - ptr to ptr 
		 const void* p_pData = ( void*) _pData; 
		 vkObj->pData = p_pData; 
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkSpecializationInfo_getPData0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:325

		  VkSpecializationInfo* vkObj = (VkSpecializationInfo*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->pData);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkSpecializationInfo_getPData0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkSpecializationInfo_getPData0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

