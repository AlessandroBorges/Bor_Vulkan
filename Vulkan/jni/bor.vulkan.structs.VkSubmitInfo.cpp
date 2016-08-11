#include <bor.vulkan.structs.VkSubmitInfo.h>

//@line:46

    #include <BorVulkan.hpp>
    JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkSubmitInfo_setSType0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _sType) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:437

		  VkSubmitInfo* vkObj = (VkSubmitInfo*)(ptr);
		 // code for simple past value 
		  vkObj->sType = (VkStructureType) (_sType);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkSubmitInfo_getSType0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:447

		  VkSubmitInfo* vkObj = (VkSubmitInfo*)(ptr);
		  return (VkStructureType) (vkObj->sType);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkSubmitInfo_getSType0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkSubmitInfo_getSType0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkSubmitInfo_setPNext0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__pNext) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _pNext = (char*)(obj__pNext?env->GetDirectBufferAddress(obj__pNext) : NULL);


//@line:456

		  VkSubmitInfo* vkObj = (VkSubmitInfo*)(ptr);
		 // code for Buffer - referenced by ptr
		  vkObj->pNext = (const void*) (_pNext);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkSubmitInfo_getPNext0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:466

		  VkSubmitInfo* vkObj = (VkSubmitInfo*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->pNext);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkSubmitInfo_getPNext0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkSubmitInfo_getPNext0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkSubmitInfo_setWaitSemaphoreCount0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _waitSemaphoreCount) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:476

		  VkSubmitInfo* vkObj = (VkSubmitInfo*)(ptr);
		 // code for simple past value 
		  vkObj->waitSemaphoreCount = (uint32_t) (_waitSemaphoreCount);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkSubmitInfo_getWaitSemaphoreCount0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:486

		  VkSubmitInfo* vkObj = (VkSubmitInfo*)(ptr);
		  return (jint) (vkObj->waitSemaphoreCount);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkSubmitInfo_getWaitSemaphoreCount0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkSubmitInfo_getWaitSemaphoreCount0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkSubmitInfo_setPWaitSemaphores0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__pWaitSemaphores) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _pWaitSemaphores = (char*)(obj__pWaitSemaphores?env->GetDirectBufferAddress(obj__pWaitSemaphores) : NULL);


//@line:495

		  VkSubmitInfo* vkObj = (VkSubmitInfo*)(ptr);
		 // code for Buffer - referenced by ptr
		  vkObj->pWaitSemaphores = (const VkSemaphore*) (_pWaitSemaphores);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkSubmitInfo_getPWaitSemaphores0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:505

		  VkSubmitInfo* vkObj = (VkSubmitInfo*)(ptr);
		  // generic get for array of VkHandle and VkStruct 
		  return (jlong) reinterpret_cast<jlong>( &vkObj->pWaitSemaphores );
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkSubmitInfo_getPWaitSemaphores0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkSubmitInfo_getPWaitSemaphores0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

static inline void wrapped_Java_bor_vulkan_structs_VkSubmitInfo_setPWaitDstStageMask0
(JNIEnv* env, jclass clazz, jobject obj_ptr, jintArray obj__pWaitDstStageMask, unsigned char* ptr, int* _pWaitDstStageMask) {

//@line:515

		  VkSubmitInfo* vkObj = (VkSubmitInfo*)(ptr);
		 // code for generic array 
		  if( NULL == _pWaitDstStageMask ){
		    vkObj->waitSemaphoreCount = 0;
		    FREE_IT(vkObj->pWaitDstStageMask);
		     return;
		   }
		  uint32_t count = (uint32_t)env->GetArrayLength( obj__pWaitDstStageMask);
		  if( vkObj->waitSemaphoreCount != count){ 
		    FREE_IT(vkObj->pWaitDstStageMask); 
		    vkObj->pWaitDstStageMask = CALLOC(count, VkPipelineStageFlags);
		   }
		  memcpy( vkObj->pWaitDstStageMask, _pWaitDstStageMask, count * sizeof(VkPipelineStageFlags));
		  vkObj->waitSemaphoreCount = count;
	  
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkSubmitInfo_setPWaitDstStageMask0(JNIEnv* env, jclass clazz, jobject obj_ptr, jintArray obj__pWaitDstStageMask) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	int* _pWaitDstStageMask = (int*)(obj__pWaitDstStageMask ? env->GetIntArrayElements(obj__pWaitDstStageMask, 0) : NULL);

	wrapped_Java_bor_vulkan_structs_VkSubmitInfo_setPWaitDstStageMask0(env, clazz, obj_ptr, obj__pWaitDstStageMask, ptr, _pWaitDstStageMask);

	if(obj__pWaitDstStageMask != NULL){
		 env->ReleaseIntArrayElements(obj__pWaitDstStageMask, (jint*)_pWaitDstStageMask, 0);
	}

	return;
}

static inline jintArray wrapped_Java_bor_vulkan_structs_VkSubmitInfo_getPWaitDstStageMask0
(JNIEnv* env, jclass clazz, jobject obj_ptr, jintArray obj__pWaitDstStageMask, unsigned char* ptr, int* _pWaitDstStageMask) {

//@line:536

		  VkSubmitInfo* vkObj = (VkSubmitInfo*)(ptr);
		  // generic get for C type array, with content copy 
		  if( 0 == vkObj->waitSemaphoreCount){ 
		     return NULL;
		   }
		  uint32_t count = (uint32_t)env->GetArrayLength( obj__pWaitDstStageMask);
		  if(vkObj->pWaitDstStageMask == NULL){
		    return NULL;
		   }
 		  memcpy(_pWaitDstStageMask, vkObj->pWaitDstStageMask, count * sizeof(VkPipelineStageFlags));
		  return obj__pWaitDstStageMask;
	 
}

JNIEXPORT jintArray JNICALL Java_bor_vulkan_structs_VkSubmitInfo_getPWaitDstStageMask0(JNIEnv* env, jclass clazz, jobject obj_ptr, jintArray obj__pWaitDstStageMask) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	int* _pWaitDstStageMask = (int*)(obj__pWaitDstStageMask ? env->GetIntArrayElements(obj__pWaitDstStageMask, 0) : NULL);

	jintArray JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkSubmitInfo_getPWaitDstStageMask0(env, clazz, obj_ptr, obj__pWaitDstStageMask, ptr, _pWaitDstStageMask);

	if(obj__pWaitDstStageMask != NULL){
		 env->ReleaseIntArrayElements(obj__pWaitDstStageMask, (jint*)_pWaitDstStageMask, 0);
	}

	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkSubmitInfo_setCommandBufferCount0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _commandBufferCount) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:554

		  VkSubmitInfo* vkObj = (VkSubmitInfo*)(ptr);
		 // code for simple past value 
		  vkObj->commandBufferCount = (uint32_t) (_commandBufferCount);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkSubmitInfo_getCommandBufferCount0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:564

		  VkSubmitInfo* vkObj = (VkSubmitInfo*)(ptr);
		  return (jint) (vkObj->commandBufferCount);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkSubmitInfo_getCommandBufferCount0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkSubmitInfo_getCommandBufferCount0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkSubmitInfo_setPCommandBuffers0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__pCommandBuffers) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _pCommandBuffers = (char*)(obj__pCommandBuffers?env->GetDirectBufferAddress(obj__pCommandBuffers) : NULL);


//@line:573

		  VkSubmitInfo* vkObj = (VkSubmitInfo*)(ptr);
		 // code for Buffer - referenced by ptr
		  vkObj->pCommandBuffers = (const VkCommandBuffer*) (_pCommandBuffers);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkSubmitInfo_getPCommandBuffers0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:583

		  VkSubmitInfo* vkObj = (VkSubmitInfo*)(ptr);
		  // generic get for array of VkHandle and VkStruct 
		  return (jlong) reinterpret_cast<jlong>( &vkObj->pCommandBuffers );
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkSubmitInfo_getPCommandBuffers0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkSubmitInfo_getPCommandBuffers0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkSubmitInfo_setSignalSemaphoreCount0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _signalSemaphoreCount) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:593

		  VkSubmitInfo* vkObj = (VkSubmitInfo*)(ptr);
		 // code for simple past value 
		  vkObj->signalSemaphoreCount = (uint32_t) (_signalSemaphoreCount);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkSubmitInfo_getSignalSemaphoreCount0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:603

		  VkSubmitInfo* vkObj = (VkSubmitInfo*)(ptr);
		  return (jint) (vkObj->signalSemaphoreCount);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkSubmitInfo_getSignalSemaphoreCount0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkSubmitInfo_getSignalSemaphoreCount0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkSubmitInfo_setPSignalSemaphores0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__pSignalSemaphores) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _pSignalSemaphores = (char*)(obj__pSignalSemaphores?env->GetDirectBufferAddress(obj__pSignalSemaphores) : NULL);


//@line:612

		  VkSubmitInfo* vkObj = (VkSubmitInfo*)(ptr);
		 // code for Buffer - referenced by ptr
		  vkObj->pSignalSemaphores = (const VkSemaphore*) (_pSignalSemaphores);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkSubmitInfo_getPSignalSemaphores0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:622

		  VkSubmitInfo* vkObj = (VkSubmitInfo*)(ptr);
		  // generic get for array of VkHandle and VkStruct 
		  return (jlong) reinterpret_cast<jlong>( &vkObj->pSignalSemaphores );
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkSubmitInfo_getPSignalSemaphores0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkSubmitInfo_getPSignalSemaphores0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

