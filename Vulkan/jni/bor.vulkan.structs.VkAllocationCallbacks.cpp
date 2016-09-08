#include <bor.vulkan.structs.VkAllocationCallbacks.h>

//@line:43

    #include <BorVulkan.hpp>
    JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkAllocationCallbacks_setPUserData0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__pUserData) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	unsigned char* _pUserData = (unsigned char*)(obj__pUserData?env->GetDirectBufferAddress(obj__pUserData) : NULL);


//@line:373

		  VkAllocationCallbacks* vkObj = (VkAllocationCallbacks*)(ptr);
		 // code for Buffer - ptr to ptr 
		 void* p_pUserData = (void*) _pUserData; 
		 vkObj->pUserData = p_pUserData; 
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkAllocationCallbacks_getPUserData0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:384

		  VkAllocationCallbacks* vkObj = (VkAllocationCallbacks*)(ptr);
		  // generic get for Buffer - field must be pointer! 
		  return (jlong) reinterpret_cast<jlong>(vkObj->pUserData);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkAllocationCallbacks_getPUserData0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkAllocationCallbacks_getPUserData0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkAllocationCallbacks_setPfnAllocation0(JNIEnv* env, jclass clazz, jobject obj_ptr, jlong _pfnAllocation) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:394

		  VkAllocationCallbacks* vkObj = (VkAllocationCallbacks*)(ptr);
		 // code for simple past value 
		  vkObj->pfnAllocation = (PFN_vkAllocationFunction) (_pfnAllocation);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkAllocationCallbacks_getPfnAllocation0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:404

		  VkAllocationCallbacks* vkObj = (VkAllocationCallbacks*)(ptr);
		  // generic get for struct field of type  VkHandle or VkStruct 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->pfnAllocation);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkAllocationCallbacks_getPfnAllocation0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkAllocationCallbacks_getPfnAllocation0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkAllocationCallbacks_setPfnReallocation0(JNIEnv* env, jclass clazz, jobject obj_ptr, jlong _pfnReallocation) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:414

		  VkAllocationCallbacks* vkObj = (VkAllocationCallbacks*)(ptr);
		 // code for simple past value 
		  vkObj->pfnReallocation = (PFN_vkReallocationFunction) (_pfnReallocation);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkAllocationCallbacks_getPfnReallocation0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:424

		  VkAllocationCallbacks* vkObj = (VkAllocationCallbacks*)(ptr);
		  // generic get for struct field of type  VkHandle or VkStruct 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->pfnReallocation);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkAllocationCallbacks_getPfnReallocation0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkAllocationCallbacks_getPfnReallocation0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkAllocationCallbacks_setPfnFree0(JNIEnv* env, jclass clazz, jobject obj_ptr, jlong _pfnFree) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:434

		  VkAllocationCallbacks* vkObj = (VkAllocationCallbacks*)(ptr);
		 // code for simple past value 
		  vkObj->pfnFree = (PFN_vkFreeFunction) (_pfnFree);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkAllocationCallbacks_getPfnFree0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:444

		  VkAllocationCallbacks* vkObj = (VkAllocationCallbacks*)(ptr);
		  // generic get for struct field of type  VkHandle or VkStruct 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->pfnFree);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkAllocationCallbacks_getPfnFree0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkAllocationCallbacks_getPfnFree0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkAllocationCallbacks_setPfnInternalAllocation0(JNIEnv* env, jclass clazz, jobject obj_ptr, jlong _pfnInternalAllocation) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:454

		  VkAllocationCallbacks* vkObj = (VkAllocationCallbacks*)(ptr);
		 // code for simple past value 
		  vkObj->pfnInternalAllocation = (PFN_vkInternalAllocationNotification) (_pfnInternalAllocation);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkAllocationCallbacks_getPfnInternalAllocation0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:464

		  VkAllocationCallbacks* vkObj = (VkAllocationCallbacks*)(ptr);
		  // generic get for struct field of type  VkHandle or VkStruct 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->pfnInternalAllocation);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkAllocationCallbacks_getPfnInternalAllocation0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkAllocationCallbacks_getPfnInternalAllocation0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkAllocationCallbacks_setPfnInternalFree0(JNIEnv* env, jclass clazz, jobject obj_ptr, jlong _pfnInternalFree) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:474

		  VkAllocationCallbacks* vkObj = (VkAllocationCallbacks*)(ptr);
		 // code for simple past value 
		  vkObj->pfnInternalFree = (PFN_vkInternalFreeNotification) (_pfnInternalFree);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkAllocationCallbacks_getPfnInternalFree0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:484

		  VkAllocationCallbacks* vkObj = (VkAllocationCallbacks*)(ptr);
		  // generic get for struct field of type  VkHandle or VkStruct 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->pfnInternalFree);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkAllocationCallbacks_getPfnInternalFree0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkAllocationCallbacks_getPfnInternalFree0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

