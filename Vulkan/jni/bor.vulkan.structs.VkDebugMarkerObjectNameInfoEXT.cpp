#include <bor.vulkan.structs.VkDebugMarkerObjectNameInfoEXT.h>

//@line:42

    #include <BorVulkan.hpp>
    JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDebugMarkerObjectNameInfoEXT_setSType0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _sType) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:295

		  VkDebugMarkerObjectNameInfoEXT* vkObj = (VkDebugMarkerObjectNameInfoEXT*)(ptr);
		 // code for simple past value 
		  vkObj->sType = (VkStructureType) (_sType);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkDebugMarkerObjectNameInfoEXT_getSType0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:305

		  VkDebugMarkerObjectNameInfoEXT* vkObj = (VkDebugMarkerObjectNameInfoEXT*)(ptr);
		  // generic get for Vk enums
		  return (jint) (vkObj->sType);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkDebugMarkerObjectNameInfoEXT_getSType0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDebugMarkerObjectNameInfoEXT_getSType0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDebugMarkerObjectNameInfoEXT_setPNext0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__pNext) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _pNext = (char*)(obj__pNext?env->GetDirectBufferAddress(obj__pNext) : NULL);


//@line:315

		  VkDebugMarkerObjectNameInfoEXT* vkObj = (VkDebugMarkerObjectNameInfoEXT*)(ptr);
		 // code for Buffer - ptr to ptr 
		 const void* p_pNext = ( void*) _pNext; 
		 vkObj->pNext = p_pNext; 
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkDebugMarkerObjectNameInfoEXT_getPNext0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:326

		  VkDebugMarkerObjectNameInfoEXT* vkObj = (VkDebugMarkerObjectNameInfoEXT*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->pNext);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkDebugMarkerObjectNameInfoEXT_getPNext0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDebugMarkerObjectNameInfoEXT_getPNext0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDebugMarkerObjectNameInfoEXT_setObjectType0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _objectType) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:336

		  VkDebugMarkerObjectNameInfoEXT* vkObj = (VkDebugMarkerObjectNameInfoEXT*)(ptr);
		 // code for simple past value 
		  vkObj->objectType = (VkDebugReportObjectTypeEXT) (_objectType);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkDebugMarkerObjectNameInfoEXT_getObjectType0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:346

		  VkDebugMarkerObjectNameInfoEXT* vkObj = (VkDebugMarkerObjectNameInfoEXT*)(ptr);
		  // generic get for Vk enums
		  return (jint) (vkObj->objectType);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkDebugMarkerObjectNameInfoEXT_getObjectType0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDebugMarkerObjectNameInfoEXT_getObjectType0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDebugMarkerObjectNameInfoEXT_setObject0(JNIEnv* env, jclass clazz, jobject obj_ptr, jlong _object) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:356

		  VkDebugMarkerObjectNameInfoEXT* vkObj = (VkDebugMarkerObjectNameInfoEXT*)(ptr);
		 // code for simple past value 
		  vkObj->object = (uint64_t) (_object);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkDebugMarkerObjectNameInfoEXT_getObject0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:366

		  VkDebugMarkerObjectNameInfoEXT* vkObj = (VkDebugMarkerObjectNameInfoEXT*)(ptr);
		  return (jlong) (vkObj->object);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkDebugMarkerObjectNameInfoEXT_getObject0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDebugMarkerObjectNameInfoEXT_getObject0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDebugMarkerObjectNameInfoEXT_setPObjectName0(JNIEnv* env, jclass clazz, jobject obj_ptr, jstring obj__pObjectName) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _pObjectName = (char*)(obj__pObjectName ? env->GetStringUTFChars(obj__pObjectName, 0) : NULL);


//@line:375

		  VkDebugMarkerObjectNameInfoEXT* vkObj = (VkDebugMarkerObjectNameInfoEXT*)(ptr);
		  vkObj->pObjectName = cloneStr(_pObjectName);
	  
	 if(obj__pObjectName != NULL){
		 env->ReleaseStringUTFChars(obj__pObjectName, _pObjectName);
	 }

}

static inline jstring wrapped_Java_bor_vulkan_structs_VkDebugMarkerObjectNameInfoEXT_getPObjectName0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:384

		  VkDebugMarkerObjectNameInfoEXT* vkObj = (VkDebugMarkerObjectNameInfoEXT*)(ptr);
		  return (jstring)(env->NewStringUTF(vkObj->pObjectName));
	 
}

JNIEXPORT jstring JNICALL Java_bor_vulkan_structs_VkDebugMarkerObjectNameInfoEXT_getPObjectName0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jstring JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDebugMarkerObjectNameInfoEXT_getPObjectName0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

