#include <bor.vulkan.structs.VkViewport.h>

//@line:43

    #include <BorVulkan.hpp>
    JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkViewport_setX0(JNIEnv* env, jclass clazz, jobject obj_ptr, jfloat _x) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:315

		  VkViewport* vkObj = (VkViewport*)(ptr);
		 // code for simple past value 
		  vkObj->x = (float) (_x);
	  

}

static inline jfloat wrapped_Java_bor_vulkan_structs_VkViewport_getX0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:325

		  VkViewport* vkObj = (VkViewport*)(ptr);
		  return (jfloat) (vkObj->x);
	 
}

JNIEXPORT jfloat JNICALL Java_bor_vulkan_structs_VkViewport_getX0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jfloat JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkViewport_getX0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkViewport_setY0(JNIEnv* env, jclass clazz, jobject obj_ptr, jfloat _y) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:334

		  VkViewport* vkObj = (VkViewport*)(ptr);
		 // code for simple past value 
		  vkObj->y = (float) (_y);
	  

}

static inline jfloat wrapped_Java_bor_vulkan_structs_VkViewport_getY0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:344

		  VkViewport* vkObj = (VkViewport*)(ptr);
		  return (jfloat) (vkObj->y);
	 
}

JNIEXPORT jfloat JNICALL Java_bor_vulkan_structs_VkViewport_getY0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jfloat JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkViewport_getY0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkViewport_setWidth0(JNIEnv* env, jclass clazz, jobject obj_ptr, jfloat _width) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:353

		  VkViewport* vkObj = (VkViewport*)(ptr);
		 // code for simple past value 
		  vkObj->width = (float) (_width);
	  

}

static inline jfloat wrapped_Java_bor_vulkan_structs_VkViewport_getWidth0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:363

		  VkViewport* vkObj = (VkViewport*)(ptr);
		  return (jfloat) (vkObj->width);
	 
}

JNIEXPORT jfloat JNICALL Java_bor_vulkan_structs_VkViewport_getWidth0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jfloat JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkViewport_getWidth0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkViewport_setHeight0(JNIEnv* env, jclass clazz, jobject obj_ptr, jfloat _height) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:372

		  VkViewport* vkObj = (VkViewport*)(ptr);
		 // code for simple past value 
		  vkObj->height = (float) (_height);
	  

}

static inline jfloat wrapped_Java_bor_vulkan_structs_VkViewport_getHeight0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:382

		  VkViewport* vkObj = (VkViewport*)(ptr);
		  return (jfloat) (vkObj->height);
	 
}

JNIEXPORT jfloat JNICALL Java_bor_vulkan_structs_VkViewport_getHeight0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jfloat JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkViewport_getHeight0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkViewport_setMinDepth0(JNIEnv* env, jclass clazz, jobject obj_ptr, jfloat _minDepth) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:391

		  VkViewport* vkObj = (VkViewport*)(ptr);
		 // code for simple past value 
		  vkObj->minDepth = (float) (_minDepth);
	  

}

static inline jfloat wrapped_Java_bor_vulkan_structs_VkViewport_getMinDepth0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:401

		  VkViewport* vkObj = (VkViewport*)(ptr);
		  return (jfloat) (vkObj->minDepth);
	 
}

JNIEXPORT jfloat JNICALL Java_bor_vulkan_structs_VkViewport_getMinDepth0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jfloat JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkViewport_getMinDepth0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkViewport_setMaxDepth0(JNIEnv* env, jclass clazz, jobject obj_ptr, jfloat _maxDepth) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:410

		  VkViewport* vkObj = (VkViewport*)(ptr);
		 // code for simple past value 
		  vkObj->maxDepth = (float) (_maxDepth);
	  

}

static inline jfloat wrapped_Java_bor_vulkan_structs_VkViewport_getMaxDepth0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:420

		  VkViewport* vkObj = (VkViewport*)(ptr);
		  return (jfloat) (vkObj->maxDepth);
	 
}

JNIEXPORT jfloat JNICALL Java_bor_vulkan_structs_VkViewport_getMaxDepth0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jfloat JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkViewport_getMaxDepth0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

