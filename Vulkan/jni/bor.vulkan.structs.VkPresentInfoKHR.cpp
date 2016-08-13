#include <bor.vulkan.structs.VkPresentInfoKHR.h>

//@line:45

    #include <BorVulkan.hpp>
    JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPresentInfoKHR_setSType0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _sType) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:400

		  VkPresentInfoKHR* vkObj = (VkPresentInfoKHR*)(ptr);
		 // code for simple past value 
		  vkObj->sType = (VkStructureType) (_sType);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkPresentInfoKHR_getSType0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:410

		  VkPresentInfoKHR* vkObj = (VkPresentInfoKHR*)(ptr);
		  // generic get for Vk enums
		  return (jint) (vkObj->sType);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkPresentInfoKHR_getSType0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPresentInfoKHR_getSType0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPresentInfoKHR_setPNext0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__pNext) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _pNext = (char*)(obj__pNext?env->GetDirectBufferAddress(obj__pNext) : NULL);


//@line:420

		  VkPresentInfoKHR* vkObj = (VkPresentInfoKHR*)(ptr);
		 // code for Buffer - ptr to ptr 
		 const void* p_pNext = ( void*) _pNext; 
		 vkObj->pNext = p_pNext; 
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkPresentInfoKHR_getPNext0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:431

		  VkPresentInfoKHR* vkObj = (VkPresentInfoKHR*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->pNext);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkPresentInfoKHR_getPNext0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPresentInfoKHR_getPNext0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPresentInfoKHR_setWaitSemaphoreCount0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _waitSemaphoreCount) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:441

		  VkPresentInfoKHR* vkObj = (VkPresentInfoKHR*)(ptr);
		 // code for simple past value 
		  vkObj->waitSemaphoreCount = (uint32_t) (_waitSemaphoreCount);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkPresentInfoKHR_getWaitSemaphoreCount0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:451

		  VkPresentInfoKHR* vkObj = (VkPresentInfoKHR*)(ptr);
		  return (jint) (vkObj->waitSemaphoreCount);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkPresentInfoKHR_getWaitSemaphoreCount0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPresentInfoKHR_getWaitSemaphoreCount0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPresentInfoKHR_setPWaitSemaphores0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__pWaitSemaphores) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _pWaitSemaphores = (char*)(obj__pWaitSemaphores?env->GetDirectBufferAddress(obj__pWaitSemaphores) : NULL);


//@line:460

		  VkPresentInfoKHR* vkObj = (VkPresentInfoKHR*)(ptr);
		 // code for Buffer - ptr to ptr 
		 const VkSemaphore* p_pWaitSemaphores = ( VkSemaphore*) _pWaitSemaphores; 
		 vkObj->pWaitSemaphores = p_pWaitSemaphores; 
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkPresentInfoKHR_getPWaitSemaphores0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:471

		  VkPresentInfoKHR* vkObj = (VkPresentInfoKHR*)(ptr);
		  // generic get for array of VkHandle and VkStruct 
		  return (jlong) reinterpret_cast<jlong>( &vkObj->pWaitSemaphores );
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkPresentInfoKHR_getPWaitSemaphores0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPresentInfoKHR_getPWaitSemaphores0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPresentInfoKHR_setSwapchainCount0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _swapchainCount) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:481

		  VkPresentInfoKHR* vkObj = (VkPresentInfoKHR*)(ptr);
		 // code for simple past value 
		  vkObj->swapchainCount = (uint32_t) (_swapchainCount);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkPresentInfoKHR_getSwapchainCount0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:491

		  VkPresentInfoKHR* vkObj = (VkPresentInfoKHR*)(ptr);
		  return (jint) (vkObj->swapchainCount);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkPresentInfoKHR_getSwapchainCount0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPresentInfoKHR_getSwapchainCount0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPresentInfoKHR_setPSwapchains0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__pSwapchains) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _pSwapchains = (char*)(obj__pSwapchains?env->GetDirectBufferAddress(obj__pSwapchains) : NULL);


//@line:500

		  VkPresentInfoKHR* vkObj = (VkPresentInfoKHR*)(ptr);
		 // code for Buffer - ptr to ptr 
		 const VkSwapchainKHR* p_pSwapchains = ( VkSwapchainKHR*) _pSwapchains; 
		 vkObj->pSwapchains = p_pSwapchains; 
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkPresentInfoKHR_getPSwapchains0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:511

		  VkPresentInfoKHR* vkObj = (VkPresentInfoKHR*)(ptr);
		  // generic get for array of VkHandle and VkStruct 
		  return (jlong) reinterpret_cast<jlong>( &vkObj->pSwapchains );
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkPresentInfoKHR_getPSwapchains0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPresentInfoKHR_getPSwapchains0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

static inline void wrapped_Java_bor_vulkan_structs_VkPresentInfoKHR_setPImageIndices0
(JNIEnv* env, jclass clazz, jobject obj_ptr, jintArray obj__pImageIndices, unsigned char* ptr, int* _pImageIndices) {

//@line:521

		  VkPresentInfoKHR* vkObj = (VkPresentInfoKHR*)(ptr);
		 // code for generic array assignment 
		 uint32_t* temp = const_cast<uint32_t*>(vkObj->pImageIndices);
		 if(temp) { free(temp); } 
		 vkObj->pImageIndices = NULL; 
		 if( _pImageIndices == NULL){ 
		    vkObj->swapchainCount = 0; 
		     return;
		  }
		  uint32_t count = (uint32_t)env->GetArrayLength( obj__pImageIndices); 
		  temp = CALLOC(count, uint32_t); 
		  memcpy( temp, _pImageIndices, count * sizeof(uint32_t)); 
		  vkObj->pImageIndices = temp; 
		  vkObj->swapchainCount = count;
	  
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPresentInfoKHR_setPImageIndices0(JNIEnv* env, jclass clazz, jobject obj_ptr, jintArray obj__pImageIndices) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	int* _pImageIndices = (int*)(obj__pImageIndices ? env->GetIntArrayElements(obj__pImageIndices, 0) : NULL);

	wrapped_Java_bor_vulkan_structs_VkPresentInfoKHR_setPImageIndices0(env, clazz, obj_ptr, obj__pImageIndices, ptr, _pImageIndices);

	if(obj__pImageIndices != NULL){
		 env->ReleaseIntArrayElements(obj__pImageIndices, (jint*)_pImageIndices, 0);
	}

	return;
}

static inline jintArray wrapped_Java_bor_vulkan_structs_VkPresentInfoKHR_getPImageIndices0
(JNIEnv* env, jclass clazz, jobject obj_ptr, jintArray obj__pImageIndices, unsigned char* ptr, int* _pImageIndices) {

//@line:542

		  VkPresentInfoKHR* vkObj = (VkPresentInfoKHR*)(ptr);
		  // generic get for C type array, with content copy 
		  if( 0 == vkObj->swapchainCount){ 
		     return NULL;
		   }
		  uint32_t count = (uint32_t)env->GetArrayLength( obj__pImageIndices);
		  if(vkObj->pImageIndices == NULL){
		    return NULL;
		   }
 		  memcpy(_pImageIndices, vkObj->pImageIndices, count * sizeof(uint32_t));
		  return obj__pImageIndices;
	 
}

JNIEXPORT jintArray JNICALL Java_bor_vulkan_structs_VkPresentInfoKHR_getPImageIndices0(JNIEnv* env, jclass clazz, jobject obj_ptr, jintArray obj__pImageIndices) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	int* _pImageIndices = (int*)(obj__pImageIndices ? env->GetIntArrayElements(obj__pImageIndices, 0) : NULL);

	jintArray JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPresentInfoKHR_getPImageIndices0(env, clazz, obj_ptr, obj__pImageIndices, ptr, _pImageIndices);

	if(obj__pImageIndices != NULL){
		 env->ReleaseIntArrayElements(obj__pImageIndices, (jint*)_pImageIndices, 0);
	}

	return JNI_returnValue;
}

static inline void wrapped_Java_bor_vulkan_structs_VkPresentInfoKHR_setPResults0
(JNIEnv* env, jclass clazz, jobject obj_ptr, jintArray obj__pResults, unsigned char* ptr, int* _pResults) {

//@line:560

		  VkPresentInfoKHR* vkObj = (VkPresentInfoKHR*)(ptr);
		 // code for generic array assignment 
		 VkResult* temp = const_cast<VkResult*>(vkObj->pResults);
		 if(temp) { free(temp); } 
		 vkObj->pResults = NULL; 
		 if( _pResults == NULL){ 
		    vkObj->swapchainCount = 0; 
		     return;
		  }
		  uint32_t count = (uint32_t)env->GetArrayLength( obj__pResults); 
		  temp = CALLOC(count, VkResult); 
		  memcpy( temp, _pResults, count * sizeof(VkResult)); 
		  vkObj->pResults = temp; 
		  vkObj->swapchainCount = count;
	  
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkPresentInfoKHR_setPResults0(JNIEnv* env, jclass clazz, jobject obj_ptr, jintArray obj__pResults) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	int* _pResults = (int*)(obj__pResults ? env->GetIntArrayElements(obj__pResults, 0) : NULL);

	wrapped_Java_bor_vulkan_structs_VkPresentInfoKHR_setPResults0(env, clazz, obj_ptr, obj__pResults, ptr, _pResults);

	if(obj__pResults != NULL){
		 env->ReleaseIntArrayElements(obj__pResults, (jint*)_pResults, 0);
	}

	return;
}

static inline jintArray wrapped_Java_bor_vulkan_structs_VkPresentInfoKHR_getPResults0
(JNIEnv* env, jclass clazz, jobject obj_ptr, jintArray obj__pResults, unsigned char* ptr, int* _pResults) {

//@line:581

		  VkPresentInfoKHR* vkObj = (VkPresentInfoKHR*)(ptr);
		  // generic get for C type array, with content copy 
		  if( 0 == vkObj->swapchainCount){ 
		     return NULL;
		   }
		  uint32_t count = (uint32_t)env->GetArrayLength( obj__pResults);
		  if(vkObj->pResults == NULL){
		    return NULL;
		   }
 		  memcpy(_pResults, vkObj->pResults, count * sizeof(VkResult));
		  return obj__pResults;
	 
}

JNIEXPORT jintArray JNICALL Java_bor_vulkan_structs_VkPresentInfoKHR_getPResults0(JNIEnv* env, jclass clazz, jobject obj_ptr, jintArray obj__pResults) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	int* _pResults = (int*)(obj__pResults ? env->GetIntArrayElements(obj__pResults, 0) : NULL);

	jintArray JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkPresentInfoKHR_getPResults0(env, clazz, obj_ptr, obj__pResults, ptr, _pResults);

	if(obj__pResults != NULL){
		 env->ReleaseIntArrayElements(obj__pResults, (jint*)_pResults, 0);
	}

	return JNI_returnValue;
}

