#include <bor.vulkan.structs.VkPhysicalDeviceMemoryProperties.h>

//@line:41

    #include <BorVulkan.hpp>
    JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceMemoryProperties_setMemoryTypeCount0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _memoryTypeCount) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:295

		  VkPhysicalDeviceMemoryProperties* vkObj = (VkPhysicalDeviceMemoryProperties*)(ptr);
		 // code for simple past value 
		  vkObj->memoryTypeCount = (uint32_t) (_memoryTypeCount);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceMemoryProperties_getMemoryTypeCount0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:305

		  VkPhysicalDeviceMemoryProperties* vkObj = (VkPhysicalDeviceMemoryProperties*)(ptr);
		  return (jint) (vkObj->memoryTypeCount);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceMemoryProperties_getMemoryTypeCount0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceMemoryProperties_getMemoryTypeCount0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceMemoryProperties_setMemoryTypes0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__memoryTypes) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _memoryTypes = (char*)(obj__memoryTypes?env->GetDirectBufferAddress(obj__memoryTypes) : NULL);


//@line:314

		  VkPhysicalDeviceMemoryProperties* vkObj = (VkPhysicalDeviceMemoryProperties*)(ptr);
		 // code for Buffer - ptr to struct 
		 VkMemoryType* p_memoryTypes = (VkMemoryType*) _memoryTypes; 
		 for(uint32_t i = 0; (i < VK_MAX_MEMORY_TYPES && i < vkObj->memoryTypeCount) ; i++){
		    vkObj->memoryTypes[i] = p_memoryTypes[i];
		 } 
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceMemoryProperties_getMemoryTypes0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:327

		  VkPhysicalDeviceMemoryProperties* vkObj = (VkPhysicalDeviceMemoryProperties*)(ptr);
		  // generic get for array of VkHandle and VkStruct 
		  return (jlong) reinterpret_cast<jlong>( &vkObj->memoryTypes );
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceMemoryProperties_getMemoryTypes0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceMemoryProperties_getMemoryTypes0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceMemoryProperties_setMemoryHeapCount0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _memoryHeapCount) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:337

		  VkPhysicalDeviceMemoryProperties* vkObj = (VkPhysicalDeviceMemoryProperties*)(ptr);
		 // code for simple past value 
		  vkObj->memoryHeapCount = (uint32_t) (_memoryHeapCount);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceMemoryProperties_getMemoryHeapCount0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:347

		  VkPhysicalDeviceMemoryProperties* vkObj = (VkPhysicalDeviceMemoryProperties*)(ptr);
		  return (jint) (vkObj->memoryHeapCount);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceMemoryProperties_getMemoryHeapCount0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceMemoryProperties_getMemoryHeapCount0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceMemoryProperties_setMemoryHeaps0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__memoryHeaps) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _memoryHeaps = (char*)(obj__memoryHeaps?env->GetDirectBufferAddress(obj__memoryHeaps) : NULL);


//@line:356

		  VkPhysicalDeviceMemoryProperties* vkObj = (VkPhysicalDeviceMemoryProperties*)(ptr);
		 // code for Buffer - ptr to struct 
		 VkMemoryHeap* p_memoryHeaps = (VkMemoryHeap*) _memoryHeaps; 
		 for(uint32_t i=0; (i < VK_MAX_MEMORY_HEAPS && i < vkObj->memoryHeapCount) ; i++){
		   vkObj->memoryHeaps[i] = p_memoryHeaps[i];
		 } 
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceMemoryProperties_getMemoryHeaps0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:369

		  VkPhysicalDeviceMemoryProperties* vkObj = (VkPhysicalDeviceMemoryProperties*)(ptr);
		  // generic get for array of VkHandle and VkStruct 
		  return (jlong) reinterpret_cast<jlong>( &vkObj->memoryHeaps );
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceMemoryProperties_getMemoryHeaps0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceMemoryProperties_getMemoryHeaps0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

