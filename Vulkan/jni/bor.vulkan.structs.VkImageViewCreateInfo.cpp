#include <bor.vulkan.structs.VkImageViewCreateInfo.h>

//@line:45

    #include <BorVulkan.hpp>
    JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkImageViewCreateInfo_setSType0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _sType) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:420

		  VkImageViewCreateInfo* vkObj = (VkImageViewCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->sType = (VkStructureType) (_sType);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkImageViewCreateInfo_getSType0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:430

		  VkImageViewCreateInfo* vkObj = (VkImageViewCreateInfo*)(ptr);
		  // generic get for Vk enums
		  return (jint) (vkObj->sType);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkImageViewCreateInfo_getSType0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkImageViewCreateInfo_getSType0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkImageViewCreateInfo_setPNext0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__pNext) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _pNext = (char*)(obj__pNext?env->GetDirectBufferAddress(obj__pNext) : NULL);


//@line:440

		  VkImageViewCreateInfo* vkObj = (VkImageViewCreateInfo*)(ptr);
		 // code for Buffer - ptr to ptr 
		 const void* p_pNext = ( void*) _pNext; 
		 vkObj->pNext = p_pNext; 
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkImageViewCreateInfo_getPNext0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:451

		  VkImageViewCreateInfo* vkObj = (VkImageViewCreateInfo*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->pNext);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkImageViewCreateInfo_getPNext0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkImageViewCreateInfo_getPNext0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkImageViewCreateInfo_setFlags0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _flags) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:461

		  VkImageViewCreateInfo* vkObj = (VkImageViewCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->flags = (VkImageViewCreateFlags) (_flags);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkImageViewCreateInfo_getFlags0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:471

		  VkImageViewCreateInfo* vkObj = (VkImageViewCreateInfo*)(ptr);
		  return (jint) (vkObj->flags);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkImageViewCreateInfo_getFlags0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkImageViewCreateInfo_getFlags0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkImageViewCreateInfo_setImage0(JNIEnv* env, jclass clazz, jobject obj_ptr, jlong _image) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:480

		  VkImageViewCreateInfo* vkObj = (VkImageViewCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->image = (VkImage) (_image);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkImageViewCreateInfo_getImage0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:490

		  VkImageViewCreateInfo* vkObj = (VkImageViewCreateInfo*)(ptr);
		  // generic get for struct field of type  VkHandle or VkStruct 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->image);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkImageViewCreateInfo_getImage0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkImageViewCreateInfo_getImage0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkImageViewCreateInfo_setViewType0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _viewType) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:500

		  VkImageViewCreateInfo* vkObj = (VkImageViewCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->viewType = (VkImageViewType) (_viewType);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkImageViewCreateInfo_getViewType0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:510

		  VkImageViewCreateInfo* vkObj = (VkImageViewCreateInfo*)(ptr);
		  // generic get for Vk enums
		  return (jint) (vkObj->viewType);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkImageViewCreateInfo_getViewType0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkImageViewCreateInfo_getViewType0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkImageViewCreateInfo_setFormat0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _format) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:520

		  VkImageViewCreateInfo* vkObj = (VkImageViewCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->format = (VkFormat) (_format);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkImageViewCreateInfo_getFormat0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:530

		  VkImageViewCreateInfo* vkObj = (VkImageViewCreateInfo*)(ptr);
		  // generic get for Vk enums
		  return (jint) (vkObj->format);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkImageViewCreateInfo_getFormat0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkImageViewCreateInfo_getFormat0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkImageViewCreateInfo_setComponents0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__components) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _components = (char*)(obj__components?env->GetDirectBufferAddress(obj__components) : NULL);


//@line:540

		  VkImageViewCreateInfo* vkObj = (VkImageViewCreateInfo*)(ptr);
		 // code for Buffer - ptr to struct 
		 VkComponentMapping* p_components = (VkComponentMapping*) _components; 
		 vkObj->components = (*p_components); 
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkImageViewCreateInfo_getComponents0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:551

		  VkImageViewCreateInfo* vkObj = (VkImageViewCreateInfo*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->components);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkImageViewCreateInfo_getComponents0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkImageViewCreateInfo_getComponents0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkImageViewCreateInfo_setSubresourceRange0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__subresourceRange) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _subresourceRange = (char*)(obj__subresourceRange?env->GetDirectBufferAddress(obj__subresourceRange) : NULL);


//@line:561

		  VkImageViewCreateInfo* vkObj = (VkImageViewCreateInfo*)(ptr);
		 // code for Buffer - ptr to struct 
		 VkImageSubresourceRange* p_subresourceRange = (VkImageSubresourceRange*) _subresourceRange; 
		 vkObj->subresourceRange = (*p_subresourceRange); 
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkImageViewCreateInfo_getSubresourceRange0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:572

		  VkImageViewCreateInfo* vkObj = (VkImageViewCreateInfo*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->subresourceRange);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkImageViewCreateInfo_getSubresourceRange0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkImageViewCreateInfo_getSubresourceRange0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

