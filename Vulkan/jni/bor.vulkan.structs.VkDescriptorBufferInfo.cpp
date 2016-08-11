#include <bor.vulkan.structs.VkDescriptorBufferInfo.h>

//@line:40

    #include <BorVulkan.hpp>
    JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDescriptorBufferInfo_setBuffer0(JNIEnv* env, jclass clazz, jobject obj_ptr, jlong _buffer) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:222

		  VkDescriptorBufferInfo* vkObj = (VkDescriptorBufferInfo*)(ptr);
		 // code for simple past value 
		  vkObj->buffer = (VkBuffer) (_buffer);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkDescriptorBufferInfo_getBuffer0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:232

		  VkDescriptorBufferInfo* vkObj = (VkDescriptorBufferInfo*)(ptr);
		  // generic get for struct field of type  VkHandle or VkStruct 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->buffer);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkDescriptorBufferInfo_getBuffer0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDescriptorBufferInfo_getBuffer0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDescriptorBufferInfo_setOffset0(JNIEnv* env, jclass clazz, jobject obj_ptr, jlong _offset) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:242

		  VkDescriptorBufferInfo* vkObj = (VkDescriptorBufferInfo*)(ptr);
		 // code for simple past value 
		  vkObj->offset = (VkDeviceSize) (_offset);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkDescriptorBufferInfo_getOffset0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:252

		  VkDescriptorBufferInfo* vkObj = (VkDescriptorBufferInfo*)(ptr);
		  return (jlong) (vkObj->offset);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkDescriptorBufferInfo_getOffset0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDescriptorBufferInfo_getOffset0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDescriptorBufferInfo_setRange0(JNIEnv* env, jclass clazz, jobject obj_ptr, jlong _range) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:261

		  VkDescriptorBufferInfo* vkObj = (VkDescriptorBufferInfo*)(ptr);
		 // code for simple past value 
		  vkObj->range = (VkDeviceSize) (_range);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkDescriptorBufferInfo_getRange0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:271

		  VkDescriptorBufferInfo* vkObj = (VkDescriptorBufferInfo*)(ptr);
		  return (jlong) (vkObj->range);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkDescriptorBufferInfo_getRange0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDescriptorBufferInfo_getRange0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

