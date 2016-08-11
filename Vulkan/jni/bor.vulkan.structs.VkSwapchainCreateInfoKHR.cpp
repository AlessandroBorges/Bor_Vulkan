#include <bor.vulkan.structs.VkSwapchainCreateInfoKHR.h>

//@line:55

    #include <BorVulkan.hpp>
    JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkSwapchainCreateInfoKHR_setSType0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _sType) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:724

		  VkSwapchainCreateInfoKHR* vkObj = (VkSwapchainCreateInfoKHR*)(ptr);
		 // code for simple past value 
		  vkObj->sType = (VkStructureType) (_sType);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkSwapchainCreateInfoKHR_getSType0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:734

		  VkSwapchainCreateInfoKHR* vkObj = (VkSwapchainCreateInfoKHR*)(ptr);
		  return (VkStructureType) (vkObj->sType);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkSwapchainCreateInfoKHR_getSType0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkSwapchainCreateInfoKHR_getSType0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkSwapchainCreateInfoKHR_setPNext0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__pNext) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _pNext = (char*)(obj__pNext?env->GetDirectBufferAddress(obj__pNext) : NULL);


//@line:743

		  VkSwapchainCreateInfoKHR* vkObj = (VkSwapchainCreateInfoKHR*)(ptr);
		 // code for Buffer - referenced by ptr
		  vkObj->pNext = (const void*) (_pNext);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkSwapchainCreateInfoKHR_getPNext0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:753

		  VkSwapchainCreateInfoKHR* vkObj = (VkSwapchainCreateInfoKHR*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->pNext);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkSwapchainCreateInfoKHR_getPNext0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkSwapchainCreateInfoKHR_getPNext0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkSwapchainCreateInfoKHR_setFlags0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _flags) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:763

		  VkSwapchainCreateInfoKHR* vkObj = (VkSwapchainCreateInfoKHR*)(ptr);
		 // code for simple past value 
		  vkObj->flags = (VkSwapchainCreateFlagsKHR) (_flags);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkSwapchainCreateInfoKHR_getFlags0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:773

		  VkSwapchainCreateInfoKHR* vkObj = (VkSwapchainCreateInfoKHR*)(ptr);
		  return (jint) (vkObj->flags);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkSwapchainCreateInfoKHR_getFlags0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkSwapchainCreateInfoKHR_getFlags0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkSwapchainCreateInfoKHR_setSurface0(JNIEnv* env, jclass clazz, jobject obj_ptr, jlong _surface) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:782

		  VkSwapchainCreateInfoKHR* vkObj = (VkSwapchainCreateInfoKHR*)(ptr);
		 // code for simple past value 
		  vkObj->surface = (VkSurfaceKHR) (_surface);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkSwapchainCreateInfoKHR_getSurface0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:792

		  VkSwapchainCreateInfoKHR* vkObj = (VkSwapchainCreateInfoKHR*)(ptr);
		  // generic get for struct field of type  VkHandle or VkStruct 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->surface);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkSwapchainCreateInfoKHR_getSurface0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkSwapchainCreateInfoKHR_getSurface0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkSwapchainCreateInfoKHR_setMinImageCount0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _minImageCount) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:802

		  VkSwapchainCreateInfoKHR* vkObj = (VkSwapchainCreateInfoKHR*)(ptr);
		 // code for simple past value 
		  vkObj->minImageCount = (uint32_t) (_minImageCount);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkSwapchainCreateInfoKHR_getMinImageCount0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:812

		  VkSwapchainCreateInfoKHR* vkObj = (VkSwapchainCreateInfoKHR*)(ptr);
		  return (jint) (vkObj->minImageCount);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkSwapchainCreateInfoKHR_getMinImageCount0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkSwapchainCreateInfoKHR_getMinImageCount0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkSwapchainCreateInfoKHR_setImageFormat0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _imageFormat) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:821

		  VkSwapchainCreateInfoKHR* vkObj = (VkSwapchainCreateInfoKHR*)(ptr);
		 // code for simple past value 
		  vkObj->imageFormat = (VkFormat) (_imageFormat);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkSwapchainCreateInfoKHR_getImageFormat0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:831

		  VkSwapchainCreateInfoKHR* vkObj = (VkSwapchainCreateInfoKHR*)(ptr);
		  return (VkFormat) (vkObj->imageFormat);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkSwapchainCreateInfoKHR_getImageFormat0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkSwapchainCreateInfoKHR_getImageFormat0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkSwapchainCreateInfoKHR_setImageColorSpace0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _imageColorSpace) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:840

		  VkSwapchainCreateInfoKHR* vkObj = (VkSwapchainCreateInfoKHR*)(ptr);
		 // code for simple past value 
		  vkObj->imageColorSpace = (VkColorSpaceKHR) (_imageColorSpace);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkSwapchainCreateInfoKHR_getImageColorSpace0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:850

		  VkSwapchainCreateInfoKHR* vkObj = (VkSwapchainCreateInfoKHR*)(ptr);
		  return (VkColorSpaceKHR) (vkObj->imageColorSpace);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkSwapchainCreateInfoKHR_getImageColorSpace0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkSwapchainCreateInfoKHR_getImageColorSpace0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkSwapchainCreateInfoKHR_setImageExtent0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__imageExtent) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _imageExtent = (char*)(obj__imageExtent?env->GetDirectBufferAddress(obj__imageExtent) : NULL);


//@line:859

		  VkSwapchainCreateInfoKHR* vkObj = (VkSwapchainCreateInfoKHR*)(ptr);
		 // code for Buffer - referenced by ptr
		  vkObj->imageExtent = (VkExtent2D) (_imageExtent);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkSwapchainCreateInfoKHR_getImageExtent0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:869

		  VkSwapchainCreateInfoKHR* vkObj = (VkSwapchainCreateInfoKHR*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->imageExtent);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkSwapchainCreateInfoKHR_getImageExtent0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkSwapchainCreateInfoKHR_getImageExtent0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkSwapchainCreateInfoKHR_setImageArrayLayers0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _imageArrayLayers) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:879

		  VkSwapchainCreateInfoKHR* vkObj = (VkSwapchainCreateInfoKHR*)(ptr);
		 // code for simple past value 
		  vkObj->imageArrayLayers = (uint32_t) (_imageArrayLayers);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkSwapchainCreateInfoKHR_getImageArrayLayers0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:889

		  VkSwapchainCreateInfoKHR* vkObj = (VkSwapchainCreateInfoKHR*)(ptr);
		  return (jint) (vkObj->imageArrayLayers);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkSwapchainCreateInfoKHR_getImageArrayLayers0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkSwapchainCreateInfoKHR_getImageArrayLayers0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkSwapchainCreateInfoKHR_setImageUsage0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _imageUsage) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:898

		  VkSwapchainCreateInfoKHR* vkObj = (VkSwapchainCreateInfoKHR*)(ptr);
		 // code for simple past value 
		  vkObj->imageUsage = (VkImageUsageFlags) (_imageUsage);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkSwapchainCreateInfoKHR_getImageUsage0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:908

		  VkSwapchainCreateInfoKHR* vkObj = (VkSwapchainCreateInfoKHR*)(ptr);
		  return (jint) (vkObj->imageUsage);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkSwapchainCreateInfoKHR_getImageUsage0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkSwapchainCreateInfoKHR_getImageUsage0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkSwapchainCreateInfoKHR_setImageSharingMode0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _imageSharingMode) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:917

		  VkSwapchainCreateInfoKHR* vkObj = (VkSwapchainCreateInfoKHR*)(ptr);
		 // code for simple past value 
		  vkObj->imageSharingMode = (VkSharingMode) (_imageSharingMode);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkSwapchainCreateInfoKHR_getImageSharingMode0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:927

		  VkSwapchainCreateInfoKHR* vkObj = (VkSwapchainCreateInfoKHR*)(ptr);
		  return (VkSharingMode) (vkObj->imageSharingMode);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkSwapchainCreateInfoKHR_getImageSharingMode0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkSwapchainCreateInfoKHR_getImageSharingMode0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkSwapchainCreateInfoKHR_setQueueFamilyIndexCount0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _queueFamilyIndexCount) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:936

		  VkSwapchainCreateInfoKHR* vkObj = (VkSwapchainCreateInfoKHR*)(ptr);
		 // code for simple past value 
		  vkObj->queueFamilyIndexCount = (uint32_t) (_queueFamilyIndexCount);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkSwapchainCreateInfoKHR_getQueueFamilyIndexCount0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:946

		  VkSwapchainCreateInfoKHR* vkObj = (VkSwapchainCreateInfoKHR*)(ptr);
		  return (jint) (vkObj->queueFamilyIndexCount);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkSwapchainCreateInfoKHR_getQueueFamilyIndexCount0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkSwapchainCreateInfoKHR_getQueueFamilyIndexCount0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

static inline void wrapped_Java_bor_vulkan_structs_VkSwapchainCreateInfoKHR_setPQueueFamilyIndices0
(JNIEnv* env, jclass clazz, jobject obj_ptr, jintArray obj__pQueueFamilyIndices, unsigned char* ptr, int* _pQueueFamilyIndices) {

//@line:955

		  VkSwapchainCreateInfoKHR* vkObj = (VkSwapchainCreateInfoKHR*)(ptr);
		 // code for generic array 
		  if( NULL == _pQueueFamilyIndices ){
		    vkObj->queueFamilyIndexCount = 0;
		    FREE_IT(vkObj->pQueueFamilyIndices);
		     return;
		   }
		  uint32_t count = (uint32_t)env->GetArrayLength( obj__pQueueFamilyIndices);
		  if( vkObj->queueFamilyIndexCount != count){ 
		    FREE_IT(vkObj->pQueueFamilyIndices); 
		    vkObj->pQueueFamilyIndices = CALLOC(count, uint32_t);
		   }
		  memcpy( vkObj->pQueueFamilyIndices, _pQueueFamilyIndices, count * sizeof(uint32_t));
		  vkObj->queueFamilyIndexCount = count;
	  
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkSwapchainCreateInfoKHR_setPQueueFamilyIndices0(JNIEnv* env, jclass clazz, jobject obj_ptr, jintArray obj__pQueueFamilyIndices) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	int* _pQueueFamilyIndices = (int*)(obj__pQueueFamilyIndices ? env->GetIntArrayElements(obj__pQueueFamilyIndices, 0) : NULL);

	wrapped_Java_bor_vulkan_structs_VkSwapchainCreateInfoKHR_setPQueueFamilyIndices0(env, clazz, obj_ptr, obj__pQueueFamilyIndices, ptr, _pQueueFamilyIndices);

	if(obj__pQueueFamilyIndices != NULL){
		 env->ReleaseIntArrayElements(obj__pQueueFamilyIndices, (jint*)_pQueueFamilyIndices, 0);
	}

	return;
}

static inline jintArray wrapped_Java_bor_vulkan_structs_VkSwapchainCreateInfoKHR_getPQueueFamilyIndices0
(JNIEnv* env, jclass clazz, jobject obj_ptr, jintArray obj__pQueueFamilyIndices, unsigned char* ptr, int* _pQueueFamilyIndices) {

//@line:976

		  VkSwapchainCreateInfoKHR* vkObj = (VkSwapchainCreateInfoKHR*)(ptr);
		  // generic get for C type array, with content copy 
		  if( 0 == vkObj->queueFamilyIndexCount){ 
		     return NULL;
		   }
		  uint32_t count = (uint32_t)env->GetArrayLength( obj__pQueueFamilyIndices);
		  if(vkObj->pQueueFamilyIndices == NULL){
		    return NULL;
		   }
 		  memcpy(_pQueueFamilyIndices, vkObj->pQueueFamilyIndices, count * sizeof(uint32_t));
		  return obj__pQueueFamilyIndices;
	 
}

JNIEXPORT jintArray JNICALL Java_bor_vulkan_structs_VkSwapchainCreateInfoKHR_getPQueueFamilyIndices0(JNIEnv* env, jclass clazz, jobject obj_ptr, jintArray obj__pQueueFamilyIndices) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	int* _pQueueFamilyIndices = (int*)(obj__pQueueFamilyIndices ? env->GetIntArrayElements(obj__pQueueFamilyIndices, 0) : NULL);

	jintArray JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkSwapchainCreateInfoKHR_getPQueueFamilyIndices0(env, clazz, obj_ptr, obj__pQueueFamilyIndices, ptr, _pQueueFamilyIndices);

	if(obj__pQueueFamilyIndices != NULL){
		 env->ReleaseIntArrayElements(obj__pQueueFamilyIndices, (jint*)_pQueueFamilyIndices, 0);
	}

	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkSwapchainCreateInfoKHR_setPreTransform0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _preTransform) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:994

		  VkSwapchainCreateInfoKHR* vkObj = (VkSwapchainCreateInfoKHR*)(ptr);
		 // code for simple past value 
		  vkObj->preTransform = (VkSurfaceTransformFlagBitsKHR) (_preTransform);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkSwapchainCreateInfoKHR_getPreTransform0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:1004

		  VkSwapchainCreateInfoKHR* vkObj = (VkSwapchainCreateInfoKHR*)(ptr);
		  return (VkSurfaceTransformFlagBitsKHR) (vkObj->preTransform);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkSwapchainCreateInfoKHR_getPreTransform0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkSwapchainCreateInfoKHR_getPreTransform0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkSwapchainCreateInfoKHR_setCompositeAlpha0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _compositeAlpha) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:1013

		  VkSwapchainCreateInfoKHR* vkObj = (VkSwapchainCreateInfoKHR*)(ptr);
		 // code for simple past value 
		  vkObj->compositeAlpha = (VkCompositeAlphaFlagBitsKHR) (_compositeAlpha);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkSwapchainCreateInfoKHR_getCompositeAlpha0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:1023

		  VkSwapchainCreateInfoKHR* vkObj = (VkSwapchainCreateInfoKHR*)(ptr);
		  return (VkCompositeAlphaFlagBitsKHR) (vkObj->compositeAlpha);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkSwapchainCreateInfoKHR_getCompositeAlpha0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkSwapchainCreateInfoKHR_getCompositeAlpha0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkSwapchainCreateInfoKHR_setPresentMode0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _presentMode) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:1032

		  VkSwapchainCreateInfoKHR* vkObj = (VkSwapchainCreateInfoKHR*)(ptr);
		 // code for simple past value 
		  vkObj->presentMode = (VkPresentModeKHR) (_presentMode);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkSwapchainCreateInfoKHR_getPresentMode0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:1042

		  VkSwapchainCreateInfoKHR* vkObj = (VkSwapchainCreateInfoKHR*)(ptr);
		  return (VkPresentModeKHR) (vkObj->presentMode);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkSwapchainCreateInfoKHR_getPresentMode0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkSwapchainCreateInfoKHR_getPresentMode0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkSwapchainCreateInfoKHR_setClipped0(JNIEnv* env, jclass clazz, jobject obj_ptr, jboolean _clipped) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:1051

		  VkSwapchainCreateInfoKHR* vkObj = (VkSwapchainCreateInfoKHR*)(ptr);
		 // code for simple past value 
		  vkObj->clipped = (VkBool32) (_clipped);
	  

}

static inline jboolean wrapped_Java_bor_vulkan_structs_VkSwapchainCreateInfoKHR_getClipped0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:1061

		  VkSwapchainCreateInfoKHR* vkObj = (VkSwapchainCreateInfoKHR*)(ptr);
		  return (jboolean) (vkObj->clipped);
	 
}

JNIEXPORT jboolean JNICALL Java_bor_vulkan_structs_VkSwapchainCreateInfoKHR_getClipped0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jboolean JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkSwapchainCreateInfoKHR_getClipped0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkSwapchainCreateInfoKHR_setOldSwapchain0(JNIEnv* env, jclass clazz, jobject obj_ptr, jlong _oldSwapchain) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:1070

		  VkSwapchainCreateInfoKHR* vkObj = (VkSwapchainCreateInfoKHR*)(ptr);
		 // code for simple past value 
		  vkObj->oldSwapchain = (VkSwapchainKHR) (_oldSwapchain);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkSwapchainCreateInfoKHR_getOldSwapchain0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:1080

		  VkSwapchainCreateInfoKHR* vkObj = (VkSwapchainCreateInfoKHR*)(ptr);
		  // generic get for struct field of type  VkHandle or VkStruct 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->oldSwapchain);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkSwapchainCreateInfoKHR_getOldSwapchain0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkSwapchainCreateInfoKHR_getOldSwapchain0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

