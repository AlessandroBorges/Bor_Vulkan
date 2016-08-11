#include <bor.vulkan.structs.VkRenderPassCreateInfo.h>

//@line:46

    #include <BorVulkan.hpp>
    JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkRenderPassCreateInfo_setSType0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _sType) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:437

		  VkRenderPassCreateInfo* vkObj = (VkRenderPassCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->sType = (VkStructureType) (_sType);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkRenderPassCreateInfo_getSType0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:447

		  VkRenderPassCreateInfo* vkObj = (VkRenderPassCreateInfo*)(ptr);
		  return (VkStructureType) (vkObj->sType);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkRenderPassCreateInfo_getSType0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkRenderPassCreateInfo_getSType0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkRenderPassCreateInfo_setPNext0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__pNext) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _pNext = (char*)(obj__pNext?env->GetDirectBufferAddress(obj__pNext) : NULL);


//@line:456

		  VkRenderPassCreateInfo* vkObj = (VkRenderPassCreateInfo*)(ptr);
		 // code for Buffer - referenced by ptr
		  vkObj->pNext = (const void*) (_pNext);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkRenderPassCreateInfo_getPNext0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:466

		  VkRenderPassCreateInfo* vkObj = (VkRenderPassCreateInfo*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->pNext);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkRenderPassCreateInfo_getPNext0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkRenderPassCreateInfo_getPNext0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkRenderPassCreateInfo_setFlags0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _flags) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:476

		  VkRenderPassCreateInfo* vkObj = (VkRenderPassCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->flags = (VkRenderPassCreateFlags) (_flags);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkRenderPassCreateInfo_getFlags0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:486

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


//@line:495

		  VkRenderPassCreateInfo* vkObj = (VkRenderPassCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->attachmentCount = (uint32_t) (_attachmentCount);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkRenderPassCreateInfo_getAttachmentCount0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:505

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


//@line:514

		  VkRenderPassCreateInfo* vkObj = (VkRenderPassCreateInfo*)(ptr);
		 // code for Buffer - referenced by ptr
		  vkObj->pAttachments = (const VkAttachmentDescription*) (_pAttachments);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkRenderPassCreateInfo_getPAttachments0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:524

		  VkRenderPassCreateInfo* vkObj = (VkRenderPassCreateInfo*)(ptr);
		  // generic get for array of VkHandle and VkStruct 
		  return (jlong) reinterpret_cast<jlong>( &vkObj->pAttachments );
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkRenderPassCreateInfo_getPAttachments0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkRenderPassCreateInfo_getPAttachments0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkRenderPassCreateInfo_setSubpassCount0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _subpassCount) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:534

		  VkRenderPassCreateInfo* vkObj = (VkRenderPassCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->subpassCount = (uint32_t) (_subpassCount);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkRenderPassCreateInfo_getSubpassCount0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:544

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


//@line:553

		  VkRenderPassCreateInfo* vkObj = (VkRenderPassCreateInfo*)(ptr);
		 // code for Buffer - referenced by ptr
		  vkObj->pSubpasses = (const VkSubpassDescription*) (_pSubpasses);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkRenderPassCreateInfo_getPSubpasses0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:563

		  VkRenderPassCreateInfo* vkObj = (VkRenderPassCreateInfo*)(ptr);
		  // generic get for array of VkHandle and VkStruct 
		  return (jlong) reinterpret_cast<jlong>( &vkObj->pSubpasses );
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkRenderPassCreateInfo_getPSubpasses0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkRenderPassCreateInfo_getPSubpasses0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkRenderPassCreateInfo_setDependencyCount0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _dependencyCount) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:573

		  VkRenderPassCreateInfo* vkObj = (VkRenderPassCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->dependencyCount = (uint32_t) (_dependencyCount);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkRenderPassCreateInfo_getDependencyCount0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:583

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


//@line:592

		  VkRenderPassCreateInfo* vkObj = (VkRenderPassCreateInfo*)(ptr);
		 // code for Buffer - referenced by ptr
		  vkObj->pDependencies = (const VkSubpassDependency*) (_pDependencies);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkRenderPassCreateInfo_getPDependencies0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:602

		  VkRenderPassCreateInfo* vkObj = (VkRenderPassCreateInfo*)(ptr);
		  // generic get for array of VkHandle and VkStruct 
		  return (jlong) reinterpret_cast<jlong>( &vkObj->pDependencies );
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkRenderPassCreateInfo_getPDependencies0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkRenderPassCreateInfo_getPDependencies0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

