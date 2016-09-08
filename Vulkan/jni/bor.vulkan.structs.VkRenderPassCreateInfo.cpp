#include <bor.vulkan.structs.VkRenderPassCreateInfo.h>

//@line:46

    #include <BorVulkan.hpp>
    JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkRenderPassCreateInfo_setSType0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _sType) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:460

		  VkRenderPassCreateInfo* vkObj = (VkRenderPassCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->sType = (VkStructureType) (_sType);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkRenderPassCreateInfo_getSType0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:470

		  VkRenderPassCreateInfo* vkObj = (VkRenderPassCreateInfo*)(ptr);
		  // generic get for Vk enums
		  return (jint) (vkObj->sType);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkRenderPassCreateInfo_getSType0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkRenderPassCreateInfo_getSType0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkRenderPassCreateInfo_setPNext0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__pNext) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _pNext = (char*)(obj__pNext?env->GetDirectBufferAddress(obj__pNext) : NULL);


//@line:480

		  VkRenderPassCreateInfo* vkObj = (VkRenderPassCreateInfo*)(ptr);
		 // code for Buffer - ptr to ptr 
		 const void* p_pNext = ( void*) _pNext; 
		 vkObj->pNext = p_pNext; 
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkRenderPassCreateInfo_getPNext0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:491

		  VkRenderPassCreateInfo* vkObj = (VkRenderPassCreateInfo*)(ptr);
		  // generic get for Buffer - field must be pointer! 
		  return (jlong) reinterpret_cast<jlong>(vkObj->pNext);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkRenderPassCreateInfo_getPNext0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkRenderPassCreateInfo_getPNext0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkRenderPassCreateInfo_setFlags0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _flags) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:501

		  VkRenderPassCreateInfo* vkObj = (VkRenderPassCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->flags = (VkRenderPassCreateFlags) (_flags);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkRenderPassCreateInfo_getFlags0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:511

		  VkRenderPassCreateInfo* vkObj = (VkRenderPassCreateInfo*)(ptr);
		  return (jint) (vkObj->flags);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkRenderPassCreateInfo_getFlags0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkRenderPassCreateInfo_getFlags0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkRenderPassCreateInfo_setAttachmentCount0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _attachmentCount) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:520

		  VkRenderPassCreateInfo* vkObj = (VkRenderPassCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->attachmentCount = (uint32_t) (_attachmentCount);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkRenderPassCreateInfo_getAttachmentCount0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:530

		  VkRenderPassCreateInfo* vkObj = (VkRenderPassCreateInfo*)(ptr);
		  return (jint) (vkObj->attachmentCount);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkRenderPassCreateInfo_getAttachmentCount0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkRenderPassCreateInfo_getAttachmentCount0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkRenderPassCreateInfo_setPAttachments0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__pAttachments) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _pAttachments = (char*)(obj__pAttachments?env->GetDirectBufferAddress(obj__pAttachments) : NULL);


//@line:539

		  VkRenderPassCreateInfo* vkObj = (VkRenderPassCreateInfo*)(ptr);
		 // code for Buffer - ptr to ptr 
		 const VkAttachmentDescription* p_pAttachments = ( VkAttachmentDescription*) _pAttachments; 
		 vkObj->pAttachments = p_pAttachments; 
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkRenderPassCreateInfo_getPAttachments0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:550

		  VkRenderPassCreateInfo* vkObj = (VkRenderPassCreateInfo*)(ptr);
		  // generic get for array of VkHandle and VkStruct 
		  return (jlong) reinterpret_cast<jlong>( vkObj->pAttachments );
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkRenderPassCreateInfo_getPAttachments0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkRenderPassCreateInfo_getPAttachments0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkRenderPassCreateInfo_setSubpassCount0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _subpassCount) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:560

		  VkRenderPassCreateInfo* vkObj = (VkRenderPassCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->subpassCount = (uint32_t) (_subpassCount);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkRenderPassCreateInfo_getSubpassCount0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:570

		  VkRenderPassCreateInfo* vkObj = (VkRenderPassCreateInfo*)(ptr);
		  return (jint) (vkObj->subpassCount);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkRenderPassCreateInfo_getSubpassCount0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkRenderPassCreateInfo_getSubpassCount0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkRenderPassCreateInfo_setPSubpasses0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__pSubpasses) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _pSubpasses = (char*)(obj__pSubpasses?env->GetDirectBufferAddress(obj__pSubpasses) : NULL);


//@line:579

		  VkRenderPassCreateInfo* vkObj = (VkRenderPassCreateInfo*)(ptr);
		 // code for Buffer - ptr to ptr 
		 const VkSubpassDescription* p_pSubpasses = ( VkSubpassDescription*) _pSubpasses; 
		 vkObj->pSubpasses = p_pSubpasses; 
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkRenderPassCreateInfo_getPSubpasses0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:590

		  VkRenderPassCreateInfo* vkObj = (VkRenderPassCreateInfo*)(ptr);
		  // generic get for array of VkHandle and VkStruct 
		  return (jlong) reinterpret_cast<jlong>( vkObj->pSubpasses );
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkRenderPassCreateInfo_getPSubpasses0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkRenderPassCreateInfo_getPSubpasses0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkRenderPassCreateInfo_setDependencyCount0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _dependencyCount) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:600

		  VkRenderPassCreateInfo* vkObj = (VkRenderPassCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->dependencyCount = (uint32_t) (_dependencyCount);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkRenderPassCreateInfo_getDependencyCount0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:610

		  VkRenderPassCreateInfo* vkObj = (VkRenderPassCreateInfo*)(ptr);
		  return (jint) (vkObj->dependencyCount);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkRenderPassCreateInfo_getDependencyCount0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkRenderPassCreateInfo_getDependencyCount0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkRenderPassCreateInfo_setPDependencies0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__pDependencies) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _pDependencies = (char*)(obj__pDependencies?env->GetDirectBufferAddress(obj__pDependencies) : NULL);


//@line:619

		  VkRenderPassCreateInfo* vkObj = (VkRenderPassCreateInfo*)(ptr);
		 // code for Buffer - ptr to ptr 
		 const VkSubpassDependency* p_pDependencies = ( VkSubpassDependency*) _pDependencies; 
		 vkObj->pDependencies = p_pDependencies; 
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkRenderPassCreateInfo_getPDependencies0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:630

		  VkRenderPassCreateInfo* vkObj = (VkRenderPassCreateInfo*)(ptr);
		  // generic get for array of VkHandle and VkStruct 
		  return (jlong) reinterpret_cast<jlong>( vkObj->pDependencies );
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkRenderPassCreateInfo_getPDependencies0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkRenderPassCreateInfo_getPDependencies0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

