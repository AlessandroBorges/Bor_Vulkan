#include <bor.vulkan.structs.VkSamplerCreateInfo.h>

//@line:55

    #include <BorVulkan.hpp>
    JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkSamplerCreateInfo_setSType0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _sType) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:705

		  VkSamplerCreateInfo* vkObj = (VkSamplerCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->sType = (VkStructureType) (_sType);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkSamplerCreateInfo_getSType0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:715

		  VkSamplerCreateInfo* vkObj = (VkSamplerCreateInfo*)(ptr);
		  // generic get for Vk enums
		  return (jint) (vkObj->sType);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkSamplerCreateInfo_getSType0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkSamplerCreateInfo_getSType0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkSamplerCreateInfo_setPNext0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__pNext) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _pNext = (char*)(obj__pNext?env->GetDirectBufferAddress(obj__pNext) : NULL);


//@line:725

		  VkSamplerCreateInfo* vkObj = (VkSamplerCreateInfo*)(ptr);
		 // code for Buffer - ptr to ptr 
		 const void* p_pNext = ( void*) _pNext; 
		 vkObj->pNext = p_pNext; 
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkSamplerCreateInfo_getPNext0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:736

		  VkSamplerCreateInfo* vkObj = (VkSamplerCreateInfo*)(ptr);
		  // generic get for Buffer - field must be pointer! 
		  return (jlong) reinterpret_cast<jlong>(vkObj->pNext);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkSamplerCreateInfo_getPNext0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkSamplerCreateInfo_getPNext0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkSamplerCreateInfo_setFlags0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _flags) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:746

		  VkSamplerCreateInfo* vkObj = (VkSamplerCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->flags = (VkSamplerCreateFlags) (_flags);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkSamplerCreateInfo_getFlags0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:756

		  VkSamplerCreateInfo* vkObj = (VkSamplerCreateInfo*)(ptr);
		  return (jint) (vkObj->flags);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkSamplerCreateInfo_getFlags0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkSamplerCreateInfo_getFlags0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkSamplerCreateInfo_setMagFilter0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _magFilter) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:765

		  VkSamplerCreateInfo* vkObj = (VkSamplerCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->magFilter = (VkFilter) (_magFilter);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkSamplerCreateInfo_getMagFilter0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:775

		  VkSamplerCreateInfo* vkObj = (VkSamplerCreateInfo*)(ptr);
		  // generic get for Vk enums
		  return (jint) (vkObj->magFilter);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkSamplerCreateInfo_getMagFilter0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkSamplerCreateInfo_getMagFilter0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkSamplerCreateInfo_setMinFilter0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _minFilter) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:785

		  VkSamplerCreateInfo* vkObj = (VkSamplerCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->minFilter = (VkFilter) (_minFilter);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkSamplerCreateInfo_getMinFilter0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:795

		  VkSamplerCreateInfo* vkObj = (VkSamplerCreateInfo*)(ptr);
		  // generic get for Vk enums
		  return (jint) (vkObj->minFilter);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkSamplerCreateInfo_getMinFilter0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkSamplerCreateInfo_getMinFilter0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkSamplerCreateInfo_setMipmapMode0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _mipmapMode) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:805

		  VkSamplerCreateInfo* vkObj = (VkSamplerCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->mipmapMode = (VkSamplerMipmapMode) (_mipmapMode);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkSamplerCreateInfo_getMipmapMode0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:815

		  VkSamplerCreateInfo* vkObj = (VkSamplerCreateInfo*)(ptr);
		  // generic get for Vk enums
		  return (jint) (vkObj->mipmapMode);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkSamplerCreateInfo_getMipmapMode0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkSamplerCreateInfo_getMipmapMode0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkSamplerCreateInfo_setAddressModeU0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _addressModeU) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:825

		  VkSamplerCreateInfo* vkObj = (VkSamplerCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->addressModeU = (VkSamplerAddressMode) (_addressModeU);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkSamplerCreateInfo_getAddressModeU0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:835

		  VkSamplerCreateInfo* vkObj = (VkSamplerCreateInfo*)(ptr);
		  // generic get for Vk enums
		  return (jint) (vkObj->addressModeU);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkSamplerCreateInfo_getAddressModeU0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkSamplerCreateInfo_getAddressModeU0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkSamplerCreateInfo_setAddressModeV0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _addressModeV) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:845

		  VkSamplerCreateInfo* vkObj = (VkSamplerCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->addressModeV = (VkSamplerAddressMode) (_addressModeV);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkSamplerCreateInfo_getAddressModeV0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:855

		  VkSamplerCreateInfo* vkObj = (VkSamplerCreateInfo*)(ptr);
		  // generic get for Vk enums
		  return (jint) (vkObj->addressModeV);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkSamplerCreateInfo_getAddressModeV0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkSamplerCreateInfo_getAddressModeV0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkSamplerCreateInfo_setAddressModeW0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _addressModeW) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:865

		  VkSamplerCreateInfo* vkObj = (VkSamplerCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->addressModeW = (VkSamplerAddressMode) (_addressModeW);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkSamplerCreateInfo_getAddressModeW0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:875

		  VkSamplerCreateInfo* vkObj = (VkSamplerCreateInfo*)(ptr);
		  // generic get for Vk enums
		  return (jint) (vkObj->addressModeW);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkSamplerCreateInfo_getAddressModeW0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkSamplerCreateInfo_getAddressModeW0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkSamplerCreateInfo_setMipLodBias0(JNIEnv* env, jclass clazz, jobject obj_ptr, jfloat _mipLodBias) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:885

		  VkSamplerCreateInfo* vkObj = (VkSamplerCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->mipLodBias = (float) (_mipLodBias);
	  

}

static inline jfloat wrapped_Java_bor_vulkan_structs_VkSamplerCreateInfo_getMipLodBias0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:895

		  VkSamplerCreateInfo* vkObj = (VkSamplerCreateInfo*)(ptr);
		  return (jfloat) (vkObj->mipLodBias);
	 
}

JNIEXPORT jfloat JNICALL Java_bor_vulkan_structs_VkSamplerCreateInfo_getMipLodBias0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jfloat JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkSamplerCreateInfo_getMipLodBias0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkSamplerCreateInfo_setAnisotropyEnable0(JNIEnv* env, jclass clazz, jobject obj_ptr, jboolean _anisotropyEnable) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:904

		  VkSamplerCreateInfo* vkObj = (VkSamplerCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->anisotropyEnable = (VkBool32) (_anisotropyEnable);
	  

}

static inline jboolean wrapped_Java_bor_vulkan_structs_VkSamplerCreateInfo_getAnisotropyEnable0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:914

		  VkSamplerCreateInfo* vkObj = (VkSamplerCreateInfo*)(ptr);
		  return (jboolean) (vkObj->anisotropyEnable);
	 
}

JNIEXPORT jboolean JNICALL Java_bor_vulkan_structs_VkSamplerCreateInfo_getAnisotropyEnable0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jboolean JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkSamplerCreateInfo_getAnisotropyEnable0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkSamplerCreateInfo_setMaxAnisotropy0(JNIEnv* env, jclass clazz, jobject obj_ptr, jfloat _maxAnisotropy) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:923

		  VkSamplerCreateInfo* vkObj = (VkSamplerCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->maxAnisotropy = (float) (_maxAnisotropy);
	  

}

static inline jfloat wrapped_Java_bor_vulkan_structs_VkSamplerCreateInfo_getMaxAnisotropy0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:933

		  VkSamplerCreateInfo* vkObj = (VkSamplerCreateInfo*)(ptr);
		  return (jfloat) (vkObj->maxAnisotropy);
	 
}

JNIEXPORT jfloat JNICALL Java_bor_vulkan_structs_VkSamplerCreateInfo_getMaxAnisotropy0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jfloat JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkSamplerCreateInfo_getMaxAnisotropy0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkSamplerCreateInfo_setCompareEnable0(JNIEnv* env, jclass clazz, jobject obj_ptr, jboolean _compareEnable) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:942

		  VkSamplerCreateInfo* vkObj = (VkSamplerCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->compareEnable = (VkBool32) (_compareEnable);
	  

}

static inline jboolean wrapped_Java_bor_vulkan_structs_VkSamplerCreateInfo_getCompareEnable0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:952

		  VkSamplerCreateInfo* vkObj = (VkSamplerCreateInfo*)(ptr);
		  return (jboolean) (vkObj->compareEnable);
	 
}

JNIEXPORT jboolean JNICALL Java_bor_vulkan_structs_VkSamplerCreateInfo_getCompareEnable0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jboolean JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkSamplerCreateInfo_getCompareEnable0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkSamplerCreateInfo_setCompareOp0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _compareOp) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:961

		  VkSamplerCreateInfo* vkObj = (VkSamplerCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->compareOp = (VkCompareOp) (_compareOp);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkSamplerCreateInfo_getCompareOp0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:971

		  VkSamplerCreateInfo* vkObj = (VkSamplerCreateInfo*)(ptr);
		  // generic get for Vk enums
		  return (jint) (vkObj->compareOp);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkSamplerCreateInfo_getCompareOp0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkSamplerCreateInfo_getCompareOp0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkSamplerCreateInfo_setMinLod0(JNIEnv* env, jclass clazz, jobject obj_ptr, jfloat _minLod) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:981

		  VkSamplerCreateInfo* vkObj = (VkSamplerCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->minLod = (float) (_minLod);
	  

}

static inline jfloat wrapped_Java_bor_vulkan_structs_VkSamplerCreateInfo_getMinLod0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:991

		  VkSamplerCreateInfo* vkObj = (VkSamplerCreateInfo*)(ptr);
		  return (jfloat) (vkObj->minLod);
	 
}

JNIEXPORT jfloat JNICALL Java_bor_vulkan_structs_VkSamplerCreateInfo_getMinLod0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jfloat JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkSamplerCreateInfo_getMinLod0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkSamplerCreateInfo_setMaxLod0(JNIEnv* env, jclass clazz, jobject obj_ptr, jfloat _maxLod) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:1000

		  VkSamplerCreateInfo* vkObj = (VkSamplerCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->maxLod = (float) (_maxLod);
	  

}

static inline jfloat wrapped_Java_bor_vulkan_structs_VkSamplerCreateInfo_getMaxLod0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:1010

		  VkSamplerCreateInfo* vkObj = (VkSamplerCreateInfo*)(ptr);
		  return (jfloat) (vkObj->maxLod);
	 
}

JNIEXPORT jfloat JNICALL Java_bor_vulkan_structs_VkSamplerCreateInfo_getMaxLod0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jfloat JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkSamplerCreateInfo_getMaxLod0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkSamplerCreateInfo_setBorderColor0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _borderColor) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:1019

		  VkSamplerCreateInfo* vkObj = (VkSamplerCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->borderColor = (VkBorderColor) (_borderColor);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkSamplerCreateInfo_getBorderColor0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:1029

		  VkSamplerCreateInfo* vkObj = (VkSamplerCreateInfo*)(ptr);
		  // generic get for Vk enums
		  return (jint) (vkObj->borderColor);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkSamplerCreateInfo_getBorderColor0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkSamplerCreateInfo_getBorderColor0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkSamplerCreateInfo_setUnnormalizedCoordinates0(JNIEnv* env, jclass clazz, jobject obj_ptr, jboolean _unnormalizedCoordinates) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:1039

		  VkSamplerCreateInfo* vkObj = (VkSamplerCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->unnormalizedCoordinates = (VkBool32) (_unnormalizedCoordinates);
	  

}

static inline jboolean wrapped_Java_bor_vulkan_structs_VkSamplerCreateInfo_getUnnormalizedCoordinates0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:1049

		  VkSamplerCreateInfo* vkObj = (VkSamplerCreateInfo*)(ptr);
		  return (jboolean) (vkObj->unnormalizedCoordinates);
	 
}

JNIEXPORT jboolean JNICALL Java_bor_vulkan_structs_VkSamplerCreateInfo_getUnnormalizedCoordinates0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jboolean JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkSamplerCreateInfo_getUnnormalizedCoordinates0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

