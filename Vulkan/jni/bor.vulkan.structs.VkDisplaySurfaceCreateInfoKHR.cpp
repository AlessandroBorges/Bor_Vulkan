#include <bor.vulkan.structs.VkDisplaySurfaceCreateInfoKHR.h>

//@line:47

    #include <BorVulkan.hpp>
    JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDisplaySurfaceCreateInfoKHR_setSType0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _sType) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:472

		  VkDisplaySurfaceCreateInfoKHR* vkObj = (VkDisplaySurfaceCreateInfoKHR*)(ptr);
		 // code for simple past value 
		  vkObj->sType = (VkStructureType) (_sType);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkDisplaySurfaceCreateInfoKHR_getSType0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:482

		  VkDisplaySurfaceCreateInfoKHR* vkObj = (VkDisplaySurfaceCreateInfoKHR*)(ptr);
		  // generic get for Vk enums
		  return (jint) (vkObj->sType);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkDisplaySurfaceCreateInfoKHR_getSType0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDisplaySurfaceCreateInfoKHR_getSType0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDisplaySurfaceCreateInfoKHR_setPNext0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__pNext) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _pNext = (char*)(obj__pNext?env->GetDirectBufferAddress(obj__pNext) : NULL);


//@line:492

		  VkDisplaySurfaceCreateInfoKHR* vkObj = (VkDisplaySurfaceCreateInfoKHR*)(ptr);
		 // code for Buffer - ptr to ptr 
		 const void* p_pNext = ( void*) _pNext; 
		 vkObj->pNext = p_pNext; 
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkDisplaySurfaceCreateInfoKHR_getPNext0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:503

		  VkDisplaySurfaceCreateInfoKHR* vkObj = (VkDisplaySurfaceCreateInfoKHR*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->pNext);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkDisplaySurfaceCreateInfoKHR_getPNext0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDisplaySurfaceCreateInfoKHR_getPNext0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDisplaySurfaceCreateInfoKHR_setFlags0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _flags) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:513

		  VkDisplaySurfaceCreateInfoKHR* vkObj = (VkDisplaySurfaceCreateInfoKHR*)(ptr);
		 // code for simple past value 
		  vkObj->flags = (VkDisplaySurfaceCreateFlagsKHR) (_flags);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkDisplaySurfaceCreateInfoKHR_getFlags0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:523

		  VkDisplaySurfaceCreateInfoKHR* vkObj = (VkDisplaySurfaceCreateInfoKHR*)(ptr);
		  return (jint) (vkObj->flags);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkDisplaySurfaceCreateInfoKHR_getFlags0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDisplaySurfaceCreateInfoKHR_getFlags0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDisplaySurfaceCreateInfoKHR_setDisplayMode0(JNIEnv* env, jclass clazz, jobject obj_ptr, jlong _displayMode) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:532

		  VkDisplaySurfaceCreateInfoKHR* vkObj = (VkDisplaySurfaceCreateInfoKHR*)(ptr);
		 // code for simple past value 
		  vkObj->displayMode = (VkDisplayModeKHR) (_displayMode);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkDisplaySurfaceCreateInfoKHR_getDisplayMode0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:542

		  VkDisplaySurfaceCreateInfoKHR* vkObj = (VkDisplaySurfaceCreateInfoKHR*)(ptr);
		  // generic get for struct field of type  VkHandle or VkStruct 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->displayMode);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkDisplaySurfaceCreateInfoKHR_getDisplayMode0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDisplaySurfaceCreateInfoKHR_getDisplayMode0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDisplaySurfaceCreateInfoKHR_setPlaneIndex0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _planeIndex) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:552

		  VkDisplaySurfaceCreateInfoKHR* vkObj = (VkDisplaySurfaceCreateInfoKHR*)(ptr);
		 // code for simple past value 
		  vkObj->planeIndex = (uint32_t) (_planeIndex);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkDisplaySurfaceCreateInfoKHR_getPlaneIndex0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:562

		  VkDisplaySurfaceCreateInfoKHR* vkObj = (VkDisplaySurfaceCreateInfoKHR*)(ptr);
		  return (jint) (vkObj->planeIndex);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkDisplaySurfaceCreateInfoKHR_getPlaneIndex0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDisplaySurfaceCreateInfoKHR_getPlaneIndex0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDisplaySurfaceCreateInfoKHR_setPlaneStackIndex0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _planeStackIndex) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:571

		  VkDisplaySurfaceCreateInfoKHR* vkObj = (VkDisplaySurfaceCreateInfoKHR*)(ptr);
		 // code for simple past value 
		  vkObj->planeStackIndex = (uint32_t) (_planeStackIndex);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkDisplaySurfaceCreateInfoKHR_getPlaneStackIndex0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:581

		  VkDisplaySurfaceCreateInfoKHR* vkObj = (VkDisplaySurfaceCreateInfoKHR*)(ptr);
		  return (jint) (vkObj->planeStackIndex);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkDisplaySurfaceCreateInfoKHR_getPlaneStackIndex0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDisplaySurfaceCreateInfoKHR_getPlaneStackIndex0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDisplaySurfaceCreateInfoKHR_setTransform0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _transform) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:590

		  VkDisplaySurfaceCreateInfoKHR* vkObj = (VkDisplaySurfaceCreateInfoKHR*)(ptr);
		 // code for simple past value 
		  vkObj->transform = (VkSurfaceTransformFlagBitsKHR) (_transform);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkDisplaySurfaceCreateInfoKHR_getTransform0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:600

		  VkDisplaySurfaceCreateInfoKHR* vkObj = (VkDisplaySurfaceCreateInfoKHR*)(ptr);
		  // generic get for Vk enums
		  return (jint) (vkObj->transform);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkDisplaySurfaceCreateInfoKHR_getTransform0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDisplaySurfaceCreateInfoKHR_getTransform0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDisplaySurfaceCreateInfoKHR_setGlobalAlpha0(JNIEnv* env, jclass clazz, jobject obj_ptr, jfloat _globalAlpha) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:610

		  VkDisplaySurfaceCreateInfoKHR* vkObj = (VkDisplaySurfaceCreateInfoKHR*)(ptr);
		 // code for simple past value 
		  vkObj->globalAlpha = (float) (_globalAlpha);
	  

}

static inline jfloat wrapped_Java_bor_vulkan_structs_VkDisplaySurfaceCreateInfoKHR_getGlobalAlpha0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:620

		  VkDisplaySurfaceCreateInfoKHR* vkObj = (VkDisplaySurfaceCreateInfoKHR*)(ptr);
		  return (jfloat) (vkObj->globalAlpha);
	 
}

JNIEXPORT jfloat JNICALL Java_bor_vulkan_structs_VkDisplaySurfaceCreateInfoKHR_getGlobalAlpha0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jfloat JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDisplaySurfaceCreateInfoKHR_getGlobalAlpha0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDisplaySurfaceCreateInfoKHR_setAlphaMode0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _alphaMode) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:629

		  VkDisplaySurfaceCreateInfoKHR* vkObj = (VkDisplaySurfaceCreateInfoKHR*)(ptr);
		 // code for simple past value 
		  vkObj->alphaMode = (VkDisplayPlaneAlphaFlagBitsKHR) (_alphaMode);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkDisplaySurfaceCreateInfoKHR_getAlphaMode0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:639

		  VkDisplaySurfaceCreateInfoKHR* vkObj = (VkDisplaySurfaceCreateInfoKHR*)(ptr);
		  // generic get for Vk enums
		  return (jint) (vkObj->alphaMode);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkDisplaySurfaceCreateInfoKHR_getAlphaMode0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDisplaySurfaceCreateInfoKHR_getAlphaMode0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDisplaySurfaceCreateInfoKHR_setImageExtent0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__imageExtent) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _imageExtent = (char*)(obj__imageExtent?env->GetDirectBufferAddress(obj__imageExtent) : NULL);


//@line:649

		  VkDisplaySurfaceCreateInfoKHR* vkObj = (VkDisplaySurfaceCreateInfoKHR*)(ptr);
		 // code for Buffer - ptr to struct 
		 VkExtent2D* p_imageExtent = (VkExtent2D*) _imageExtent; 
		 vkObj->imageExtent = (*p_imageExtent); 
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkDisplaySurfaceCreateInfoKHR_getImageExtent0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:660

		  VkDisplaySurfaceCreateInfoKHR* vkObj = (VkDisplaySurfaceCreateInfoKHR*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->imageExtent);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkDisplaySurfaceCreateInfoKHR_getImageExtent0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDisplaySurfaceCreateInfoKHR_getImageExtent0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

