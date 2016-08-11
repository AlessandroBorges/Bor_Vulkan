#include <bor.vulkan.structs.VkBindSparseInfo.h>

//@line:49

    #include <BorVulkan.hpp>
    JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkBindSparseInfo_setSType0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _sType) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:550

		  VkBindSparseInfo* vkObj = (VkBindSparseInfo*)(ptr);
		 // code for simple past value 
		  vkObj->sType = (VkStructureType) (_sType);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkBindSparseInfo_getSType0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:560

		  VkBindSparseInfo* vkObj = (VkBindSparseInfo*)(ptr);
		  return (VkStructureType) (vkObj->sType);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkBindSparseInfo_getSType0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkBindSparseInfo_getSType0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkBindSparseInfo_setPNext0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__pNext) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _pNext = (char*)(obj__pNext?env->GetDirectBufferAddress(obj__pNext) : NULL);


//@line:569

		  VkBindSparseInfo* vkObj = (VkBindSparseInfo*)(ptr);
		 // code for Buffer - referenced by ptr
		  vkObj->pNext = (const void*) (_pNext);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkBindSparseInfo_getPNext0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:579

		  VkBindSparseInfo* vkObj = (VkBindSparseInfo*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->pNext);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkBindSparseInfo_getPNext0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkBindSparseInfo_getPNext0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkBindSparseInfo_setWaitSemaphoreCount0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _waitSemaphoreCount) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:589

		  VkBindSparseInfo* vkObj = (VkBindSparseInfo*)(ptr);
		 // code for simple past value 
		  vkObj->waitSemaphoreCount = (uint32_t) (_waitSemaphoreCount);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkBindSparseInfo_getWaitSemaphoreCount0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:599

		  VkBindSparseInfo* vkObj = (VkBindSparseInfo*)(ptr);
		  return (jint) (vkObj->waitSemaphoreCount);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkBindSparseInfo_getWaitSemaphoreCount0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkBindSparseInfo_getWaitSemaphoreCount0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkBindSparseInfo_setPWaitSemaphores0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__pWaitSemaphores) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _pWaitSemaphores = (char*)(obj__pWaitSemaphores?env->GetDirectBufferAddress(obj__pWaitSemaphores) : NULL);


//@line:608

		  VkBindSparseInfo* vkObj = (VkBindSparseInfo*)(ptr);
		 // code for Buffer - referenced by ptr
		  vkObj->pWaitSemaphores = (const VkSemaphore*) (_pWaitSemaphores);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkBindSparseInfo_getPWaitSemaphores0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:618

		  VkBindSparseInfo* vkObj = (VkBindSparseInfo*)(ptr);
		  // generic get for array of VkHandle and VkStruct 
		  return (jlong) reinterpret_cast<jlong>( &vkObj->pWaitSemaphores );
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkBindSparseInfo_getPWaitSemaphores0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkBindSparseInfo_getPWaitSemaphores0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkBindSparseInfo_setBufferBindCount0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _bufferBindCount) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:628

		  VkBindSparseInfo* vkObj = (VkBindSparseInfo*)(ptr);
		 // code for simple past value 
		  vkObj->bufferBindCount = (uint32_t) (_bufferBindCount);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkBindSparseInfo_getBufferBindCount0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:638

		  VkBindSparseInfo* vkObj = (VkBindSparseInfo*)(ptr);
		  return (jint) (vkObj->bufferBindCount);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkBindSparseInfo_getBufferBindCount0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkBindSparseInfo_getBufferBindCount0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkBindSparseInfo_setPBufferBinds0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__pBufferBinds) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _pBufferBinds = (char*)(obj__pBufferBinds?env->GetDirectBufferAddress(obj__pBufferBinds) : NULL);


//@line:647

		  VkBindSparseInfo* vkObj = (VkBindSparseInfo*)(ptr);
		 // code for Buffer - referenced by ptr
		  vkObj->pBufferBinds = (const VkSparseBufferMemoryBindInfo*) (_pBufferBinds);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkBindSparseInfo_getPBufferBinds0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:657

		  VkBindSparseInfo* vkObj = (VkBindSparseInfo*)(ptr);
		  // generic get for array of VkHandle and VkStruct 
		  return (jlong) reinterpret_cast<jlong>( &vkObj->pBufferBinds );
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkBindSparseInfo_getPBufferBinds0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkBindSparseInfo_getPBufferBinds0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkBindSparseInfo_setImageOpaqueBindCount0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _imageOpaqueBindCount) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:667

		  VkBindSparseInfo* vkObj = (VkBindSparseInfo*)(ptr);
		 // code for simple past value 
		  vkObj->imageOpaqueBindCount = (uint32_t) (_imageOpaqueBindCount);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkBindSparseInfo_getImageOpaqueBindCount0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:677

		  VkBindSparseInfo* vkObj = (VkBindSparseInfo*)(ptr);
		  return (jint) (vkObj->imageOpaqueBindCount);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkBindSparseInfo_getImageOpaqueBindCount0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkBindSparseInfo_getImageOpaqueBindCount0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkBindSparseInfo_setPImageOpaqueBinds0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__pImageOpaqueBinds) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _pImageOpaqueBinds = (char*)(obj__pImageOpaqueBinds?env->GetDirectBufferAddress(obj__pImageOpaqueBinds) : NULL);


//@line:686

		  VkBindSparseInfo* vkObj = (VkBindSparseInfo*)(ptr);
		 // code for Buffer - referenced by ptr
		  vkObj->pImageOpaqueBinds = (const VkSparseImageOpaqueMemoryBindInfo*) (_pImageOpaqueBinds);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkBindSparseInfo_getPImageOpaqueBinds0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:696

		  VkBindSparseInfo* vkObj = (VkBindSparseInfo*)(ptr);
		  // generic get for array of VkHandle and VkStruct 
		  return (jlong) reinterpret_cast<jlong>( &vkObj->pImageOpaqueBinds );
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkBindSparseInfo_getPImageOpaqueBinds0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkBindSparseInfo_getPImageOpaqueBinds0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkBindSparseInfo_setImageBindCount0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _imageBindCount) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:706

		  VkBindSparseInfo* vkObj = (VkBindSparseInfo*)(ptr);
		 // code for simple past value 
		  vkObj->imageBindCount = (uint32_t) (_imageBindCount);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkBindSparseInfo_getImageBindCount0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:716

		  VkBindSparseInfo* vkObj = (VkBindSparseInfo*)(ptr);
		  return (jint) (vkObj->imageBindCount);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkBindSparseInfo_getImageBindCount0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkBindSparseInfo_getImageBindCount0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkBindSparseInfo_setPImageBinds0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__pImageBinds) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _pImageBinds = (char*)(obj__pImageBinds?env->GetDirectBufferAddress(obj__pImageBinds) : NULL);


//@line:725

		  VkBindSparseInfo* vkObj = (VkBindSparseInfo*)(ptr);
		 // code for Buffer - referenced by ptr
		  vkObj->pImageBinds = (const VkSparseImageMemoryBindInfo*) (_pImageBinds);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkBindSparseInfo_getPImageBinds0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:735

		  VkBindSparseInfo* vkObj = (VkBindSparseInfo*)(ptr);
		  // generic get for array of VkHandle and VkStruct 
		  return (jlong) reinterpret_cast<jlong>( &vkObj->pImageBinds );
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkBindSparseInfo_getPImageBinds0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkBindSparseInfo_getPImageBinds0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkBindSparseInfo_setSignalSemaphoreCount0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _signalSemaphoreCount) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:745

		  VkBindSparseInfo* vkObj = (VkBindSparseInfo*)(ptr);
		 // code for simple past value 
		  vkObj->signalSemaphoreCount = (uint32_t) (_signalSemaphoreCount);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkBindSparseInfo_getSignalSemaphoreCount0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:755

		  VkBindSparseInfo* vkObj = (VkBindSparseInfo*)(ptr);
		  return (jint) (vkObj->signalSemaphoreCount);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkBindSparseInfo_getSignalSemaphoreCount0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkBindSparseInfo_getSignalSemaphoreCount0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkBindSparseInfo_setPSignalSemaphores0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__pSignalSemaphores) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _pSignalSemaphores = (char*)(obj__pSignalSemaphores?env->GetDirectBufferAddress(obj__pSignalSemaphores) : NULL);


//@line:764

		  VkBindSparseInfo* vkObj = (VkBindSparseInfo*)(ptr);
		 // code for Buffer - referenced by ptr
		  vkObj->pSignalSemaphores = (const VkSemaphore*) (_pSignalSemaphores);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkBindSparseInfo_getPSignalSemaphores0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:774

		  VkBindSparseInfo* vkObj = (VkBindSparseInfo*)(ptr);
		  // generic get for array of VkHandle and VkStruct 
		  return (jlong) reinterpret_cast<jlong>( &vkObj->pSignalSemaphores );
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkBindSparseInfo_getPSignalSemaphores0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkBindSparseInfo_getPSignalSemaphores0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

