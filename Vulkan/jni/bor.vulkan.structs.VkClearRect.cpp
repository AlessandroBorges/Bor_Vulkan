#include <bor.vulkan.structs.VkClearRect.h>

//@line:40

    #include <BorVulkan.hpp>
    JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkClearRect_setRect0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__rect) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _rect = (char*)(obj__rect?env->GetDirectBufferAddress(obj__rect) : NULL);


//@line:232

		  VkClearRect* vkObj = (VkClearRect*)(ptr);
		 // code for Buffer - ptr to struct 
		 VkRect2D* p_rect = (VkRect2D*) _rect; 
		 vkObj->rect = (*p_rect); 
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkClearRect_getRect0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:243

		  VkClearRect* vkObj = (VkClearRect*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->rect);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkClearRect_getRect0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkClearRect_getRect0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkClearRect_setBaseArrayLayer0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _baseArrayLayer) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:253

		  VkClearRect* vkObj = (VkClearRect*)(ptr);
		 // code for simple past value 
		  vkObj->baseArrayLayer = (uint32_t) (_baseArrayLayer);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkClearRect_getBaseArrayLayer0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:263

		  VkClearRect* vkObj = (VkClearRect*)(ptr);
		  return (jint) (vkObj->baseArrayLayer);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkClearRect_getBaseArrayLayer0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkClearRect_getBaseArrayLayer0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkClearRect_setLayerCount0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _layerCount) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:272

		  VkClearRect* vkObj = (VkClearRect*)(ptr);
		 // code for simple past value 
		  vkObj->layerCount = (uint32_t) (_layerCount);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkClearRect_getLayerCount0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:282

		  VkClearRect* vkObj = (VkClearRect*)(ptr);
		  return (jint) (vkObj->layerCount);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkClearRect_getLayerCount0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkClearRect_getLayerCount0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

