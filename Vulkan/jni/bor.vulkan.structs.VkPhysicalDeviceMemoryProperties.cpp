#include <bor.vulkan.structs.VkPhysicalDeviceMemoryProperties.h>

//@line:41

    #include <BorVulkan.hpp>
    JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceMemoryProperties_setMemoryTypeCount0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _memoryTypeCount) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:260

		  VkPhysicalDeviceMemoryProperties* vkObj = (VkPhysicalDeviceMemoryProperties*)(ptr);
		 // code for simple past value 
		  vkObj->memoryTypeCount = (uint32_t) (_memoryTypeCount);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceMemoryProperties_getMemoryTypeCount0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:270

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


//@line:279

		  VkPhysicalDeviceMemoryProperties* vkObj = (VkPhysicalDeviceMemoryProperties*)(ptr);
		 // code for Buffer - referenced by ptr
		  vkObj->memoryTypes = (VkMemoryType[]) (_memoryTypes);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceMemoryProperties_getMemoryTypes0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:289

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


//@line:299

		  VkPhysicalDeviceMemoryProperties* vkObj = (VkPhysicalDeviceMemoryProperties*)(ptr);
		 // code for simple past value 
		  vkObj->memoryHeapCount = (uint32_t) (_memoryHeapCount);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceMemoryProperties_getMemoryHeapCount0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:309

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


//@line:318

		  VkPhysicalDeviceMemoryProperties* vkObj = (VkPhysicalDeviceMemoryProperties*)(ptr);
		 // code for Buffer - referenced by ptr
		  vkObj->memoryHeaps = (VkMemoryHeap[]) (_memoryHeaps);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceMemoryProperties_getMemoryHeaps0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:328

		  VkPhysicalDeviceMemoryProperties* vkObj = (VkPhysicalDeviceMemoryProperties*)(ptr);
		  // generic get for array of VkHandle and VkStruct 
		  return (jlong) reinterpret_cast<jlong>( &vkObj->memoryHeaps );
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkPhysicalDeviceMemoryProperties_getMemoryHeaps0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPhysicalDeviceMemoryProperties_getMemoryHeaps0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

