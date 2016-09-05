#include <bor.vulkan.structs.VkDedicatedAllocationBufferCreateInfoNV.h>

//@line:40

    #include <BorVulkan.hpp>
    JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDedicatedAllocationBufferCreateInfoNV_setSType0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _sType) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:232

		  VkDedicatedAllocationBufferCreateInfoNV* vkObj = (VkDedicatedAllocationBufferCreateInfoNV*)(ptr);
		 // code for simple past value 
		  vkObj->sType = (VkStructureType) (_sType);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkDedicatedAllocationBufferCreateInfoNV_getSType0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:242

		  VkDedicatedAllocationBufferCreateInfoNV* vkObj = (VkDedicatedAllocationBufferCreateInfoNV*)(ptr);
		  // generic get for Vk enums
		  return (jint) (vkObj->sType);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkDedicatedAllocationBufferCreateInfoNV_getSType0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDedicatedAllocationBufferCreateInfoNV_getSType0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDedicatedAllocationBufferCreateInfoNV_setPNext0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__pNext) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _pNext = (char*)(obj__pNext?env->GetDirectBufferAddress(obj__pNext) : NULL);


//@line:252

		  VkDedicatedAllocationBufferCreateInfoNV* vkObj = (VkDedicatedAllocationBufferCreateInfoNV*)(ptr);
		 // code for Buffer - ptr to ptr 
		 const void* p_pNext = ( void*) _pNext; 
		 vkObj->pNext = p_pNext; 
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkDedicatedAllocationBufferCreateInfoNV_getPNext0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:263

		  VkDedicatedAllocationBufferCreateInfoNV* vkObj = (VkDedicatedAllocationBufferCreateInfoNV*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->pNext);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkDedicatedAllocationBufferCreateInfoNV_getPNext0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDedicatedAllocationBufferCreateInfoNV_getPNext0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDedicatedAllocationBufferCreateInfoNV_setDedicatedAllocation0(JNIEnv* env, jclass clazz, jobject obj_ptr, jboolean _dedicatedAllocation) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:273

		  VkDedicatedAllocationBufferCreateInfoNV* vkObj = (VkDedicatedAllocationBufferCreateInfoNV*)(ptr);
		 // code for simple past value 
		  vkObj->dedicatedAllocation = (VkBool32) (_dedicatedAllocation);
	  

}

static inline jboolean wrapped_Java_bor_vulkan_structs_VkDedicatedAllocationBufferCreateInfoNV_getDedicatedAllocation0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:283

		  VkDedicatedAllocationBufferCreateInfoNV* vkObj = (VkDedicatedAllocationBufferCreateInfoNV*)(ptr);
		  return (jboolean) (vkObj->dedicatedAllocation);
	 
}

JNIEXPORT jboolean JNICALL Java_bor_vulkan_structs_VkDedicatedAllocationBufferCreateInfoNV_getDedicatedAllocation0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jboolean JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDedicatedAllocationBufferCreateInfoNV_getDedicatedAllocation0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

