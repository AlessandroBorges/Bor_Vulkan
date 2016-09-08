#include <bor.vulkan.structs.VkDebugMarkerObjectTagInfoEXT.h>

//@line:44

    #include <BorVulkan.hpp>
    JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDebugMarkerObjectTagInfoEXT_setSType0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _sType) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:360

		  VkDebugMarkerObjectTagInfoEXT* vkObj = (VkDebugMarkerObjectTagInfoEXT*)(ptr);
		 // code for simple past value 
		  vkObj->sType = (VkStructureType) (_sType);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkDebugMarkerObjectTagInfoEXT_getSType0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:370

		  VkDebugMarkerObjectTagInfoEXT* vkObj = (VkDebugMarkerObjectTagInfoEXT*)(ptr);
		  // generic get for Vk enums
		  return (jint) (vkObj->sType);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkDebugMarkerObjectTagInfoEXT_getSType0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDebugMarkerObjectTagInfoEXT_getSType0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDebugMarkerObjectTagInfoEXT_setPNext0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__pNext) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _pNext = (char*)(obj__pNext?env->GetDirectBufferAddress(obj__pNext) : NULL);


//@line:380

		  VkDebugMarkerObjectTagInfoEXT* vkObj = (VkDebugMarkerObjectTagInfoEXT*)(ptr);
		 // code for Buffer - ptr to ptr 
		 const void* p_pNext = ( void*) _pNext; 
		 vkObj->pNext = p_pNext; 
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkDebugMarkerObjectTagInfoEXT_getPNext0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:391

		  VkDebugMarkerObjectTagInfoEXT* vkObj = (VkDebugMarkerObjectTagInfoEXT*)(ptr);
		  // generic get for Buffer - field must be pointer! 
		  return (jlong) reinterpret_cast<jlong>(vkObj->pNext);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkDebugMarkerObjectTagInfoEXT_getPNext0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDebugMarkerObjectTagInfoEXT_getPNext0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDebugMarkerObjectTagInfoEXT_setObjectType0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _objectType) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:401

		  VkDebugMarkerObjectTagInfoEXT* vkObj = (VkDebugMarkerObjectTagInfoEXT*)(ptr);
		 // code for simple past value 
		  vkObj->objectType = (VkDebugReportObjectTypeEXT) (_objectType);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkDebugMarkerObjectTagInfoEXT_getObjectType0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:411

		  VkDebugMarkerObjectTagInfoEXT* vkObj = (VkDebugMarkerObjectTagInfoEXT*)(ptr);
		  // generic get for Vk enums
		  return (jint) (vkObj->objectType);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkDebugMarkerObjectTagInfoEXT_getObjectType0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDebugMarkerObjectTagInfoEXT_getObjectType0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDebugMarkerObjectTagInfoEXT_setObject0(JNIEnv* env, jclass clazz, jobject obj_ptr, jlong _object) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:421

		  VkDebugMarkerObjectTagInfoEXT* vkObj = (VkDebugMarkerObjectTagInfoEXT*)(ptr);
		 // code for simple past value 
		  vkObj->object = (uint64_t) (_object);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkDebugMarkerObjectTagInfoEXT_getObject0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:431

		  VkDebugMarkerObjectTagInfoEXT* vkObj = (VkDebugMarkerObjectTagInfoEXT*)(ptr);
		  return (jlong) (vkObj->object);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkDebugMarkerObjectTagInfoEXT_getObject0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDebugMarkerObjectTagInfoEXT_getObject0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDebugMarkerObjectTagInfoEXT_setTagName0(JNIEnv* env, jclass clazz, jobject obj_ptr, jlong _tagName) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:440

		  VkDebugMarkerObjectTagInfoEXT* vkObj = (VkDebugMarkerObjectTagInfoEXT*)(ptr);
		 // code for simple past value 
		  vkObj->tagName = (uint64_t) (_tagName);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkDebugMarkerObjectTagInfoEXT_getTagName0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:450

		  VkDebugMarkerObjectTagInfoEXT* vkObj = (VkDebugMarkerObjectTagInfoEXT*)(ptr);
		  return (jlong) (vkObj->tagName);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkDebugMarkerObjectTagInfoEXT_getTagName0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDebugMarkerObjectTagInfoEXT_getTagName0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDebugMarkerObjectTagInfoEXT_setTagSize0(JNIEnv* env, jclass clazz, jobject obj_ptr, jlong _tagSize) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:459

		  VkDebugMarkerObjectTagInfoEXT* vkObj = (VkDebugMarkerObjectTagInfoEXT*)(ptr);
		 // code for simple past value 
		  vkObj->tagSize = (size_t) (_tagSize);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkDebugMarkerObjectTagInfoEXT_getTagSize0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:469

		  VkDebugMarkerObjectTagInfoEXT* vkObj = (VkDebugMarkerObjectTagInfoEXT*)(ptr);
		  return (jlong) (vkObj->tagSize);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkDebugMarkerObjectTagInfoEXT_getTagSize0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDebugMarkerObjectTagInfoEXT_getTagSize0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDebugMarkerObjectTagInfoEXT_setPTag0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__pTag) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	unsigned char* _pTag = (unsigned char*)(obj__pTag?env->GetDirectBufferAddress(obj__pTag) : NULL);


//@line:478

		  VkDebugMarkerObjectTagInfoEXT* vkObj = (VkDebugMarkerObjectTagInfoEXT*)(ptr);
		 // code for Buffer - ptr to ptr 
		 const void* p_pTag = ( void*) _pTag; 
		 vkObj->pTag = p_pTag; 
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkDebugMarkerObjectTagInfoEXT_getPTag0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:489

		  VkDebugMarkerObjectTagInfoEXT* vkObj = (VkDebugMarkerObjectTagInfoEXT*)(ptr);
		  // generic get for Buffer - field must be pointer! 
		  return (jlong) reinterpret_cast<jlong>(vkObj->pTag);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkDebugMarkerObjectTagInfoEXT_getPTag0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDebugMarkerObjectTagInfoEXT_getPTag0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

