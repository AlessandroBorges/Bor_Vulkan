#include <bor.vulkan.structs.VkAllocationCallbacks.h>

//@line:43

    #include <BorVulkan.hpp>
    JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkAllocationCallbacks_setPUserData0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__pUserData) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	unsigned char* _pUserData = (unsigned char*)(obj__pUserData?env->GetDirectBufferAddress(obj__pUserData) : NULL);


//@line:362

		  VkAllocationCallbacks* vkObj = (VkAllocationCallbacks*)(ptr);
		 // code for Buffer - referenced by ptr
		  vkObj->pUserData = (void*) (_pUserData);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkAllocationCallbacks_getPUserData0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:372

		  VkAllocationCallbacks* vkObj = (VkAllocationCallbacks*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->pUserData);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkAllocationCallbacks_getPUserData0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkAllocationCallbacks_getPUserData0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkAllocationCallbacks_setPfnAllocation0(JNIEnv* env, jclass clazz, jobject obj_ptr, jlong _pfnAllocation) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:382

		  VkAllocationCallbacks* vkObj = (VkAllocationCallbacks*)(ptr);
		 // code for simple past value 
		  vkObj->pfnAllocation = (PFN_vkAllocationFunction) (_pfnAllocation);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkAllocationCallbacks_getPfnAllocation0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:392

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


//@line:402

		  VkAllocationCallbacks* vkObj = (VkAllocationCallbacks*)(ptr);
		 // code for simple past value 
		  vkObj->pfnReallocation = (PFN_vkReallocationFunction) (_pfnReallocation);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkAllocationCallbacks_getPfnReallocation0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:412

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


//@line:422

		  VkAllocationCallbacks* vkObj = (VkAllocationCallbacks*)(ptr);
		 // code for simple past value 
		  vkObj->pfnFree = (PFN_vkFreeFunction) (_pfnFree);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkAllocationCallbacks_getPfnFree0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:432

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


//@line:442

		  VkAllocationCallbacks* vkObj = (VkAllocationCallbacks*)(ptr);
		 // code for simple past value 
		  vkObj->pfnInternalAllocation = (PFN_vkInternalAllocationNotification) (_pfnInternalAllocation);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkAllocationCallbacks_getPfnInternalAllocation0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:452

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


//@line:462

		  VkAllocationCallbacks* vkObj = (VkAllocationCallbacks*)(ptr);
		 // code for simple past value 
		  vkObj->pfnInternalFree = (PFN_vkInternalFreeNotification) (_pfnInternalFree);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkAllocationCallbacks_getPfnInternalFree0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:472

		  VkAllocationCallbacks* vkObj = (VkAllocationCallbacks*)(ptr);
		  // generic get for struct field of type  VkHandle or VkStruct 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->pfnInternalFree);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkAllocationCallbacks_getPfnInternalFree0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkAllocationCallbacks_getPfnInternalFree0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}
