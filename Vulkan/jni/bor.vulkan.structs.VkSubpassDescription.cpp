#include <bor.vulkan.structs.VkSubpassDescription.h>

//@line:47

    #include <BorVulkan.hpp>
    JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkSubpassDescription_setFlags0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _flags) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:496

		  VkSubpassDescription* vkObj = (VkSubpassDescription*)(ptr);
		 // code for simple past value 
		  vkObj->flags = (VkSubpassDescriptionFlags) (_flags);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkSubpassDescription_getFlags0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:506

		  VkSubpassDescription* vkObj = (VkSubpassDescription*)(ptr);
		  return (jint) (vkObj->flags);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkSubpassDescription_getFlags0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkSubpassDescription_getFlags0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkSubpassDescription_setPipelineBindPoint0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _pipelineBindPoint) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:515

		  VkSubpassDescription* vkObj = (VkSubpassDescription*)(ptr);
		 // code for simple past value 
		  vkObj->pipelineBindPoint = (VkPipelineBindPoint) (_pipelineBindPoint);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkSubpassDescription_getPipelineBindPoint0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:525

		  VkSubpassDescription* vkObj = (VkSubpassDescription*)(ptr);
		  // generic get for Vk enums
		  return (jint) (vkObj->pipelineBindPoint);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkSubpassDescription_getPipelineBindPoint0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkSubpassDescription_getPipelineBindPoint0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkSubpassDescription_setInputAttachmentCount0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _inputAttachmentCount) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:535

		  VkSubpassDescription* vkObj = (VkSubpassDescription*)(ptr);
		 // code for simple past value 
		  vkObj->inputAttachmentCount = (uint32_t) (_inputAttachmentCount);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkSubpassDescription_getInputAttachmentCount0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:545

		  VkSubpassDescription* vkObj = (VkSubpassDescription*)(ptr);
		  return (jint) (vkObj->inputAttachmentCount);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkSubpassDescription_getInputAttachmentCount0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkSubpassDescription_getInputAttachmentCount0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkSubpassDescription_setPInputAttachments0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__pInputAttachments) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _pInputAttachments = (char*)(obj__pInputAttachments?env->GetDirectBufferAddress(obj__pInputAttachments) : NULL);


//@line:554

		  VkSubpassDescription* vkObj = (VkSubpassDescription*)(ptr);
		 // code for Buffer - ptr to ptr 
		 const VkAttachmentReference* p_pInputAttachments = ( VkAttachmentReference*) _pInputAttachments; 
		 vkObj->pInputAttachments = p_pInputAttachments; 
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkSubpassDescription_getPInputAttachments0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:565

		  VkSubpassDescription* vkObj = (VkSubpassDescription*)(ptr);
		  // generic get for array of VkHandle and VkStruct 
		  return (jlong) reinterpret_cast<jlong>( vkObj->pInputAttachments );
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkSubpassDescription_getPInputAttachments0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkSubpassDescription_getPInputAttachments0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkSubpassDescription_setColorAttachmentCount0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _colorAttachmentCount) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:575

		  VkSubpassDescription* vkObj = (VkSubpassDescription*)(ptr);
		 // code for simple past value 
		  vkObj->colorAttachmentCount = (uint32_t) (_colorAttachmentCount);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkSubpassDescription_getColorAttachmentCount0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:585

		  VkSubpassDescription* vkObj = (VkSubpassDescription*)(ptr);
		  return (jint) (vkObj->colorAttachmentCount);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkSubpassDescription_getColorAttachmentCount0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkSubpassDescription_getColorAttachmentCount0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkSubpassDescription_setPColorAttachments0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__pColorAttachments) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _pColorAttachments = (char*)(obj__pColorAttachments?env->GetDirectBufferAddress(obj__pColorAttachments) : NULL);


//@line:594

		  VkSubpassDescription* vkObj = (VkSubpassDescription*)(ptr);
		 // code for Buffer - ptr to ptr 
		 const VkAttachmentReference* p_pColorAttachments = ( VkAttachmentReference*) _pColorAttachments; 
		 vkObj->pColorAttachments = p_pColorAttachments; 
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkSubpassDescription_getPColorAttachments0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:605

		  VkSubpassDescription* vkObj = (VkSubpassDescription*)(ptr);
		  // generic get for array of VkHandle and VkStruct 
		  return (jlong) reinterpret_cast<jlong>( vkObj->pColorAttachments );
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkSubpassDescription_getPColorAttachments0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkSubpassDescription_getPColorAttachments0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkSubpassDescription_setPResolveAttachments0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__pResolveAttachments) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _pResolveAttachments = (char*)(obj__pResolveAttachments?env->GetDirectBufferAddress(obj__pResolveAttachments) : NULL);


//@line:615

		  VkSubpassDescription* vkObj = (VkSubpassDescription*)(ptr);
		 // code for Buffer - ptr to ptr 
		 const VkAttachmentReference* p_pResolveAttachments = ( VkAttachmentReference*) _pResolveAttachments; 
		 vkObj->pResolveAttachments = p_pResolveAttachments; 
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkSubpassDescription_getPResolveAttachments0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:626

		  VkSubpassDescription* vkObj = (VkSubpassDescription*)(ptr);
		  // generic get for array of VkHandle and VkStruct 
		  return (jlong) reinterpret_cast<jlong>( vkObj->pResolveAttachments );
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkSubpassDescription_getPResolveAttachments0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkSubpassDescription_getPResolveAttachments0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkSubpassDescription_setPDepthStencilAttachment0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__pDepthStencilAttachment) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _pDepthStencilAttachment = (char*)(obj__pDepthStencilAttachment?env->GetDirectBufferAddress(obj__pDepthStencilAttachment) : NULL);


//@line:636

		  VkSubpassDescription* vkObj = (VkSubpassDescription*)(ptr);
		 // code for Buffer - ptr to ptr 
		 const VkAttachmentReference* p_pDepthStencilAttachment = ( VkAttachmentReference*) _pDepthStencilAttachment; 
		 vkObj->pDepthStencilAttachment = p_pDepthStencilAttachment; 
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkSubpassDescription_getPDepthStencilAttachment0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:647

		  VkSubpassDescription* vkObj = (VkSubpassDescription*)(ptr);
		  // generic get for Buffer - field must be pointer! 
		  return (jlong) reinterpret_cast<jlong>(vkObj->pDepthStencilAttachment);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkSubpassDescription_getPDepthStencilAttachment0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkSubpassDescription_getPDepthStencilAttachment0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkSubpassDescription_setPreserveAttachmentCount0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _preserveAttachmentCount) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:657

		  VkSubpassDescription* vkObj = (VkSubpassDescription*)(ptr);
		 // code for simple past value 
		  vkObj->preserveAttachmentCount = (uint32_t) (_preserveAttachmentCount);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkSubpassDescription_getPreserveAttachmentCount0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:667

		  VkSubpassDescription* vkObj = (VkSubpassDescription*)(ptr);
		  return (jint) (vkObj->preserveAttachmentCount);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkSubpassDescription_getPreserveAttachmentCount0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkSubpassDescription_getPreserveAttachmentCount0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

static inline void wrapped_Java_bor_vulkan_structs_VkSubpassDescription_setPPreserveAttachments0
(JNIEnv* env, jclass clazz, jobject obj_ptr, jintArray obj__pPreserveAttachments, unsigned char* ptr, int* _pPreserveAttachments) {

//@line:676

		  VkSubpassDescription* vkObj = (VkSubpassDescription*)(ptr);
		 // code for generic array assignment 
		 uint32_t* temp = const_cast<uint32_t*>(vkObj->pPreserveAttachments);
		 if(temp) { free(temp); } 
		 vkObj->pPreserveAttachments = NULL; 
		 if( _pPreserveAttachments == NULL){ 
		    vkObj->preserveAttachmentCount = 0; 
		     return;
		  }
		  uint32_t count = (uint32_t)env->GetArrayLength( obj__pPreserveAttachments); 
		  temp = CALLOC(count, uint32_t); 
		  memcpy( temp, _pPreserveAttachments, count * sizeof(uint32_t)); 
		  vkObj->pPreserveAttachments = temp; 
		  vkObj->preserveAttachmentCount = count;
	  
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkSubpassDescription_setPPreserveAttachments0(JNIEnv* env, jclass clazz, jobject obj_ptr, jintArray obj__pPreserveAttachments) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	int* _pPreserveAttachments = (int*)(obj__pPreserveAttachments ? env->GetIntArrayElements(obj__pPreserveAttachments, 0) : NULL);

	wrapped_Java_bor_vulkan_structs_VkSubpassDescription_setPPreserveAttachments0(env, clazz, obj_ptr, obj__pPreserveAttachments, ptr, _pPreserveAttachments);

	if(obj__pPreserveAttachments != NULL){
		 env->ReleaseIntArrayElements(obj__pPreserveAttachments, (jint*)_pPreserveAttachments, 0);
	}

	return;
}

static inline jintArray wrapped_Java_bor_vulkan_structs_VkSubpassDescription_getPPreserveAttachments0
(JNIEnv* env, jclass clazz, jobject obj_ptr, jintArray obj__pPreserveAttachments, unsigned char* ptr, int* _pPreserveAttachments) {

//@line:697

		  VkSubpassDescription* vkObj = (VkSubpassDescription*)(ptr);
		  // generic get for C type array, with content copy 
		  if( 0 == vkObj->preserveAttachmentCount){ 
		     return NULL;
		   }
		  uint32_t count = (uint32_t)env->GetArrayLength( obj__pPreserveAttachments);
		  if(vkObj->pPreserveAttachments == NULL){
		    return NULL;
		   }
 		  memcpy(_pPreserveAttachments, vkObj->pPreserveAttachments, count * sizeof(uint32_t));
		  return obj__pPreserveAttachments;
	 
}

JNIEXPORT jintArray JNICALL Java_bor_vulkan_structs_VkSubpassDescription_getPPreserveAttachments0(JNIEnv* env, jclass clazz, jobject obj_ptr, jintArray obj__pPreserveAttachments) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	int* _pPreserveAttachments = (int*)(obj__pPreserveAttachments ? env->GetIntArrayElements(obj__pPreserveAttachments, 0) : NULL);

	jintArray JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkSubpassDescription_getPPreserveAttachments0(env, clazz, obj_ptr, obj__pPreserveAttachments, ptr, _pPreserveAttachments);

	if(obj__pPreserveAttachments != NULL){
		 env->ReleaseIntArrayElements(obj__pPreserveAttachments, (jint*)_pPreserveAttachments, 0);
	}

	return JNI_returnValue;
}

