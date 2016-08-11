#include <bor.vulkan.structs.VkMemoryType.h>

//@line:39

    #include <BorVulkan.hpp>
    JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkMemoryType_setPropertyFlags0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _propertyFlags) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:180

		  VkMemoryType* vkObj = (VkMemoryType*)(ptr);
		 // code for simple past value 
		  vkObj->propertyFlags = (VkMemoryPropertyFlags) (_propertyFlags);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkMemoryType_getPropertyFlags0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:190

		  VkMemoryType* vkObj = (VkMemoryType*)(ptr);
		  return (jint) (vkObj->propertyFlags);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkMemoryType_getPropertyFlags0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkMemoryType_getPropertyFlags0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkMemoryType_setHeapIndex0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _heapIndex) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:199

		  VkMemoryType* vkObj = (VkMemoryType*)(ptr);
		 // code for simple past value 
		  vkObj->heapIndex = (uint32_t) (_heapIndex);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkMemoryType_getHeapIndex0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:209

		  VkMemoryType* vkObj = (VkMemoryType*)(ptr);
		  return (jint) (vkObj->heapIndex);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkMemoryType_getHeapIndex0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkMemoryType_getHeapIndex0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

