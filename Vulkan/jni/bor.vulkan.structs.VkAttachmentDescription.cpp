#include <bor.vulkan.structs.VkAttachmentDescription.h>

//@line:46

    #include <BorVulkan.hpp>
    JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkAttachmentDescription_setFlags0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _flags) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:405

		  VkAttachmentDescription* vkObj = (VkAttachmentDescription*)(ptr);
		 // code for simple past value 
		  vkObj->flags = (VkAttachmentDescriptionFlags) (_flags);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkAttachmentDescription_getFlags0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:415

		  VkAttachmentDescription* vkObj = (VkAttachmentDescription*)(ptr);
		  return (jint) (vkObj->flags);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkAttachmentDescription_getFlags0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkAttachmentDescription_getFlags0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkAttachmentDescription_setFormat0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _format) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:424

		  VkAttachmentDescription* vkObj = (VkAttachmentDescription*)(ptr);
		 // code for simple past value 
		  vkObj->format = (VkFormat) (_format);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkAttachmentDescription_getFormat0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:434

		  VkAttachmentDescription* vkObj = (VkAttachmentDescription*)(ptr);
		  // generic get for Vk enums
		  return (jint) (vkObj->format);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkAttachmentDescription_getFormat0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkAttachmentDescription_getFormat0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkAttachmentDescription_setSamples0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _samples) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:444

		  VkAttachmentDescription* vkObj = (VkAttachmentDescription*)(ptr);
		 // code for simple past value 
		  vkObj->samples = (VkSampleCountFlagBits) (_samples);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkAttachmentDescription_getSamples0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:454

		  VkAttachmentDescription* vkObj = (VkAttachmentDescription*)(ptr);
		  // generic get for Vk enums
		  return (jint) (vkObj->samples);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkAttachmentDescription_getSamples0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkAttachmentDescription_getSamples0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkAttachmentDescription_setLoadOp0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _loadOp) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:464

		  VkAttachmentDescription* vkObj = (VkAttachmentDescription*)(ptr);
		 // code for simple past value 
		  vkObj->loadOp = (VkAttachmentLoadOp) (_loadOp);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkAttachmentDescription_getLoadOp0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:474

		  VkAttachmentDescription* vkObj = (VkAttachmentDescription*)(ptr);
		  // generic get for Vk enums
		  return (jint) (vkObj->loadOp);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkAttachmentDescription_getLoadOp0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkAttachmentDescription_getLoadOp0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkAttachmentDescription_setStoreOp0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _storeOp) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:484

		  VkAttachmentDescription* vkObj = (VkAttachmentDescription*)(ptr);
		 // code for simple past value 
		  vkObj->storeOp = (VkAttachmentStoreOp) (_storeOp);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkAttachmentDescription_getStoreOp0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:494

		  VkAttachmentDescription* vkObj = (VkAttachmentDescription*)(ptr);
		  // generic get for Vk enums
		  return (jint) (vkObj->storeOp);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkAttachmentDescription_getStoreOp0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkAttachmentDescription_getStoreOp0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkAttachmentDescription_setStencilLoadOp0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _stencilLoadOp) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:504

		  VkAttachmentDescription* vkObj = (VkAttachmentDescription*)(ptr);
		 // code for simple past value 
		  vkObj->stencilLoadOp = (VkAttachmentLoadOp) (_stencilLoadOp);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkAttachmentDescription_getStencilLoadOp0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:514

		  VkAttachmentDescription* vkObj = (VkAttachmentDescription*)(ptr);
		  // generic get for Vk enums
		  return (jint) (vkObj->stencilLoadOp);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkAttachmentDescription_getStencilLoadOp0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkAttachmentDescription_getStencilLoadOp0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkAttachmentDescription_setStencilStoreOp0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _stencilStoreOp) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:524

		  VkAttachmentDescription* vkObj = (VkAttachmentDescription*)(ptr);
		 // code for simple past value 
		  vkObj->stencilStoreOp = (VkAttachmentStoreOp) (_stencilStoreOp);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkAttachmentDescription_getStencilStoreOp0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:534

		  VkAttachmentDescription* vkObj = (VkAttachmentDescription*)(ptr);
		  // generic get for Vk enums
		  return (jint) (vkObj->stencilStoreOp);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkAttachmentDescription_getStencilStoreOp0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkAttachmentDescription_getStencilStoreOp0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkAttachmentDescription_setInitialLayout0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _initialLayout) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:544

		  VkAttachmentDescription* vkObj = (VkAttachmentDescription*)(ptr);
		 // code for simple past value 
		  vkObj->initialLayout = (VkImageLayout) (_initialLayout);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkAttachmentDescription_getInitialLayout0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:554

		  VkAttachmentDescription* vkObj = (VkAttachmentDescription*)(ptr);
		  // generic get for Vk enums
		  return (jint) (vkObj->initialLayout);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkAttachmentDescription_getInitialLayout0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkAttachmentDescription_getInitialLayout0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkAttachmentDescription_setFinalLayout0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _finalLayout) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:564

		  VkAttachmentDescription* vkObj = (VkAttachmentDescription*)(ptr);
		 // code for simple past value 
		  vkObj->finalLayout = (VkImageLayout) (_finalLayout);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkAttachmentDescription_getFinalLayout0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:574

		  VkAttachmentDescription* vkObj = (VkAttachmentDescription*)(ptr);
		  // generic get for Vk enums
		  return (jint) (vkObj->finalLayout);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkAttachmentDescription_getFinalLayout0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkAttachmentDescription_getFinalLayout0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

