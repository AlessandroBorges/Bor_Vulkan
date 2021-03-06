#include <bor.vulkan.structs.VkDebugMarkerMarkerInfoEXT.h>

//@line:41

    #include <BorVulkan.hpp>
    JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDebugMarkerMarkerInfoEXT_setSType0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _sType) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:267

		  VkDebugMarkerMarkerInfoEXT* vkObj = (VkDebugMarkerMarkerInfoEXT*)(ptr);
		 // code for simple past value 
		  vkObj->sType = (VkStructureType) (_sType);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkDebugMarkerMarkerInfoEXT_getSType0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:277

		  VkDebugMarkerMarkerInfoEXT* vkObj = (VkDebugMarkerMarkerInfoEXT*)(ptr);
		  // generic get for Vk enums
		  return (jint) (vkObj->sType);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkDebugMarkerMarkerInfoEXT_getSType0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDebugMarkerMarkerInfoEXT_getSType0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDebugMarkerMarkerInfoEXT_setPNext0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__pNext) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _pNext = (char*)(obj__pNext?env->GetDirectBufferAddress(obj__pNext) : NULL);


//@line:287

		  VkDebugMarkerMarkerInfoEXT* vkObj = (VkDebugMarkerMarkerInfoEXT*)(ptr);
		 // code for Buffer - ptr to ptr 
		 const void* p_pNext = ( void*) _pNext; 
		 vkObj->pNext = p_pNext; 
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkDebugMarkerMarkerInfoEXT_getPNext0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:298

		  VkDebugMarkerMarkerInfoEXT* vkObj = (VkDebugMarkerMarkerInfoEXT*)(ptr);
		  // generic get for Buffer - field must be pointer! 
		  return (jlong) reinterpret_cast<jlong>(vkObj->pNext);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkDebugMarkerMarkerInfoEXT_getPNext0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDebugMarkerMarkerInfoEXT_getPNext0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDebugMarkerMarkerInfoEXT_setPMarkerName0(JNIEnv* env, jclass clazz, jobject obj_ptr, jstring obj__pMarkerName) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _pMarkerName = (char*)(obj__pMarkerName ? env->GetStringUTFChars(obj__pMarkerName, 0) : NULL);


//@line:308

		  VkDebugMarkerMarkerInfoEXT* vkObj = (VkDebugMarkerMarkerInfoEXT*)(ptr);
		  vkObj->pMarkerName = cloneStr(_pMarkerName);
	  
	 if(obj__pMarkerName != NULL){
		 env->ReleaseStringUTFChars(obj__pMarkerName, _pMarkerName);
	 }

}

static inline jstring wrapped_Java_bor_vulkan_structs_VkDebugMarkerMarkerInfoEXT_getPMarkerName0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:317

		  VkDebugMarkerMarkerInfoEXT* vkObj = (VkDebugMarkerMarkerInfoEXT*)(ptr);
		  return (jstring)(env->NewStringUTF(cloneStr(vkObj->pMarkerName)));
	 
}

JNIEXPORT jstring JNICALL Java_bor_vulkan_structs_VkDebugMarkerMarkerInfoEXT_getPMarkerName0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jstring JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDebugMarkerMarkerInfoEXT_getPMarkerName0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDebugMarkerMarkerInfoEXT_setColor0(JNIEnv* env, jclass clazz, jobject obj_ptr, jfloatArray obj__color) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	float* _color = (float*)(obj__color ? env->GetFloatArrayElements(obj__color, 0) : NULL);


//@line:326

		  VkDebugMarkerMarkerInfoEXT* vkObj = (VkDebugMarkerMarkerInfoEXT*)(ptr);
		 // code for fixed size array 
		  memcpy(vkObj->color, _color, 4 * sizeof(float));
	  
	if(obj__color != NULL){
		 env->ReleaseFloatArrayElements(obj__color, (jfloat*)_color, 0);
	}

}

static inline jfloatArray wrapped_Java_bor_vulkan_structs_VkDebugMarkerMarkerInfoEXT_getColor0
(JNIEnv* env, jclass clazz, jobject obj_ptr, jfloatArray obj__color, unsigned char* ptr, float* _color) {

//@line:336

		  VkDebugMarkerMarkerInfoEXT* vkObj = (VkDebugMarkerMarkerInfoEXT*)(ptr);
		  // fixed length array  
		  memcpy(_color, vkObj->color, 4 * sizeof(float));
		  return obj__color;
	 
}

JNIEXPORT jfloatArray JNICALL Java_bor_vulkan_structs_VkDebugMarkerMarkerInfoEXT_getColor0(JNIEnv* env, jclass clazz, jobject obj_ptr, jfloatArray obj__color) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	float* _color = (float*)(obj__color ? env->GetFloatArrayElements(obj__color, 0) : NULL);

	jfloatArray JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDebugMarkerMarkerInfoEXT_getColor0(env, clazz, obj_ptr, obj__color, ptr, _color);

	if(obj__color != NULL){
		 env->ReleaseFloatArrayElements(obj__color, (jfloat*)_color, 0);
	}

	return JNI_returnValue;
}

