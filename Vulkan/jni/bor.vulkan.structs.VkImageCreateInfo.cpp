#include <bor.vulkan.structs.VkImageCreateInfo.h>

//@line:52

    #include <BorVulkan.hpp>
    JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkImageCreateInfo_setSType0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _sType) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:609

		  VkImageCreateInfo* vkObj = (VkImageCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->sType = (VkStructureType) (_sType);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkImageCreateInfo_getSType0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:619

		  VkImageCreateInfo* vkObj = (VkImageCreateInfo*)(ptr);
		  return (VkStructureType) (vkObj->sType);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkImageCreateInfo_getSType0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkImageCreateInfo_getSType0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkImageCreateInfo_setPNext0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__pNext) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _pNext = (char*)(obj__pNext?env->GetDirectBufferAddress(obj__pNext) : NULL);


//@line:628

		  VkImageCreateInfo* vkObj = (VkImageCreateInfo*)(ptr);
		 // code for Buffer - referenced by ptr
		  vkObj->pNext = (const void*) (_pNext);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkImageCreateInfo_getPNext0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:638

		  VkImageCreateInfo* vkObj = (VkImageCreateInfo*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->pNext);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkImageCreateInfo_getPNext0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkImageCreateInfo_getPNext0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkImageCreateInfo_setFlags0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _flags) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:648

		  VkImageCreateInfo* vkObj = (VkImageCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->flags = (VkImageCreateFlags) (_flags);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkImageCreateInfo_getFlags0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:658

		  VkImageCreateInfo* vkObj = (VkImageCreateInfo*)(ptr);
		  return (jint) (vkObj->flags);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkImageCreateInfo_getFlags0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkImageCreateInfo_getFlags0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkImageCreateInfo_setImageType0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _imageType) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:667

		  VkImageCreateInfo* vkObj = (VkImageCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->imageType = (VkImageType) (_imageType);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkImageCreateInfo_getImageType0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:677

		  VkImageCreateInfo* vkObj = (VkImageCreateInfo*)(ptr);
		  return (VkImageType) (vkObj->imageType);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkImageCreateInfo_getImageType0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkImageCreateInfo_getImageType0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkImageCreateInfo_setFormat0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _format) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:686

		  VkImageCreateInfo* vkObj = (VkImageCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->format = (VkFormat) (_format);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkImageCreateInfo_getFormat0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:696

		  VkImageCreateInfo* vkObj = (VkImageCreateInfo*)(ptr);
		  return (VkFormat) (vkObj->format);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkImageCreateInfo_getFormat0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkImageCreateInfo_getFormat0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkImageCreateInfo_setExtent0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__extent) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _extent = (char*)(obj__extent?env->GetDirectBufferAddress(obj__extent) : NULL);


//@line:705

		  VkImageCreateInfo* vkObj = (VkImageCreateInfo*)(ptr);
		 // code for Buffer - referenced by ptr
		  vkObj->extent = (VkExtent3D) (_extent);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkImageCreateInfo_getExtent0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:715

		  VkImageCreateInfo* vkObj = (VkImageCreateInfo*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->extent);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkImageCreateInfo_getExtent0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkImageCreateInfo_getExtent0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkImageCreateInfo_setMipLevels0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _mipLevels) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:725

		  VkImageCreateInfo* vkObj = (VkImageCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->mipLevels = (uint32_t) (_mipLevels);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkImageCreateInfo_getMipLevels0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:735

		  VkImageCreateInfo* vkObj = (VkImageCreateInfo*)(ptr);
		  return (jint) (vkObj->mipLevels);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkImageCreateInfo_getMipLevels0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkImageCreateInfo_getMipLevels0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkImageCreateInfo_setArrayLayers0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _arrayLayers) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:744

		  VkImageCreateInfo* vkObj = (VkImageCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->arrayLayers = (uint32_t) (_arrayLayers);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkImageCreateInfo_getArrayLayers0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:754

		  VkImageCreateInfo* vkObj = (VkImageCreateInfo*)(ptr);
		  return (jint) (vkObj->arrayLayers);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkImageCreateInfo_getArrayLayers0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkImageCreateInfo_getArrayLayers0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkImageCreateInfo_setSamples0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _samples) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:763

		  VkImageCreateInfo* vkObj = (VkImageCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->samples = (VkSampleCountFlagBits) (_samples);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkImageCreateInfo_getSamples0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:773

		  VkImageCreateInfo* vkObj = (VkImageCreateInfo*)(ptr);
		  return (VkSampleCountFlagBits) (vkObj->samples);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkImageCreateInfo_getSamples0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkImageCreateInfo_getSamples0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkImageCreateInfo_setTiling0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _tiling) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:782

		  VkImageCreateInfo* vkObj = (VkImageCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->tiling = (VkImageTiling) (_tiling);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkImageCreateInfo_getTiling0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:792

		  VkImageCreateInfo* vkObj = (VkImageCreateInfo*)(ptr);
		  return (VkImageTiling) (vkObj->tiling);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkImageCreateInfo_getTiling0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkImageCreateInfo_getTiling0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkImageCreateInfo_setUsage0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _usage) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:801

		  VkImageCreateInfo* vkObj = (VkImageCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->usage = (VkImageUsageFlags) (_usage);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkImageCreateInfo_getUsage0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:811

		  VkImageCreateInfo* vkObj = (VkImageCreateInfo*)(ptr);
		  return (jint) (vkObj->usage);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkImageCreateInfo_getUsage0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkImageCreateInfo_getUsage0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkImageCreateInfo_setSharingMode0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _sharingMode) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:820

		  VkImageCreateInfo* vkObj = (VkImageCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->sharingMode = (VkSharingMode) (_sharingMode);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkImageCreateInfo_getSharingMode0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:830

		  VkImageCreateInfo* vkObj = (VkImageCreateInfo*)(ptr);
		  return (VkSharingMode) (vkObj->sharingMode);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkImageCreateInfo_getSharingMode0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkImageCreateInfo_getSharingMode0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkImageCreateInfo_setQueueFamilyIndexCount0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _queueFamilyIndexCount) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:839

		  VkImageCreateInfo* vkObj = (VkImageCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->queueFamilyIndexCount = (uint32_t) (_queueFamilyIndexCount);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkImageCreateInfo_getQueueFamilyIndexCount0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:849

		  VkImageCreateInfo* vkObj = (VkImageCreateInfo*)(ptr);
		  return (jint) (vkObj->queueFamilyIndexCount);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkImageCreateInfo_getQueueFamilyIndexCount0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkImageCreateInfo_getQueueFamilyIndexCount0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

static inline void wrapped_Java_bor_vulkan_structs_VkImageCreateInfo_setPQueueFamilyIndices0
(JNIEnv* env, jclass clazz, jobject obj_ptr, jintArray obj__pQueueFamilyIndices, unsigned char* ptr, int* _pQueueFamilyIndices) {

//@line:858

		  VkImageCreateInfo* vkObj = (VkImageCreateInfo*)(ptr);
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

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkImageCreateInfo_setPQueueFamilyIndices0(JNIEnv* env, jclass clazz, jobject obj_ptr, jintArray obj__pQueueFamilyIndices) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	int* _pQueueFamilyIndices = (int*)(obj__pQueueFamilyIndices ? env->GetIntArrayElements(obj__pQueueFamilyIndices, 0) : NULL);

	wrapped_Java_bor_vulkan_structs_VkImageCreateInfo_setPQueueFamilyIndices0(env, clazz, obj_ptr, obj__pQueueFamilyIndices, ptr, _pQueueFamilyIndices);

	if(obj__pQueueFamilyIndices != NULL){
		 env->ReleaseIntArrayElements(obj__pQueueFamilyIndices, (jint*)_pQueueFamilyIndices, 0);
	}

	return;
}

static inline jintArray wrapped_Java_bor_vulkan_structs_VkImageCreateInfo_getPQueueFamilyIndices0
(JNIEnv* env, jclass clazz, jobject obj_ptr, jintArray obj__pQueueFamilyIndices, unsigned char* ptr, int* _pQueueFamilyIndices) {

//@line:879

		  VkImageCreateInfo* vkObj = (VkImageCreateInfo*)(ptr);
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

JNIEXPORT jintArray JNICALL Java_bor_vulkan_structs_VkImageCreateInfo_getPQueueFamilyIndices0(JNIEnv* env, jclass clazz, jobject obj_ptr, jintArray obj__pQueueFamilyIndices) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	int* _pQueueFamilyIndices = (int*)(obj__pQueueFamilyIndices ? env->GetIntArrayElements(obj__pQueueFamilyIndices, 0) : NULL);

	jintArray JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkImageCreateInfo_getPQueueFamilyIndices0(env, clazz, obj_ptr, obj__pQueueFamilyIndices, ptr, _pQueueFamilyIndices);

	if(obj__pQueueFamilyIndices != NULL){
		 env->ReleaseIntArrayElements(obj__pQueueFamilyIndices, (jint*)_pQueueFamilyIndices, 0);
	}

	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkImageCreateInfo_setInitialLayout0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _initialLayout) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:897

		  VkImageCreateInfo* vkObj = (VkImageCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->initialLayout = (VkImageLayout) (_initialLayout);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkImageCreateInfo_getInitialLayout0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:907

		  VkImageCreateInfo* vkObj = (VkImageCreateInfo*)(ptr);
		  return (VkImageLayout) (vkObj->initialLayout);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkImageCreateInfo_getInitialLayout0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkImageCreateInfo_getInitialLayout0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

