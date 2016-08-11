#include <bor.vulkan.structs.VkWriteDescriptorSet.h>

//@line:47

    #include <BorVulkan.hpp>
    JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkWriteDescriptorSet_setSType0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _sType) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:481

		  VkWriteDescriptorSet* vkObj = (VkWriteDescriptorSet*)(ptr);
		 // code for simple past value 
		  vkObj->sType = (VkStructureType) (_sType);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkWriteDescriptorSet_getSType0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:491

		  VkWriteDescriptorSet* vkObj = (VkWriteDescriptorSet*)(ptr);
		  return (VkStructureType) (vkObj->sType);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkWriteDescriptorSet_getSType0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkWriteDescriptorSet_getSType0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkWriteDescriptorSet_setPNext0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__pNext) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _pNext = (char*)(obj__pNext?env->GetDirectBufferAddress(obj__pNext) : NULL);


//@line:500

		  VkWriteDescriptorSet* vkObj = (VkWriteDescriptorSet*)(ptr);
		 // code for Buffer - referenced by ptr
		  vkObj->pNext = (const void*) (_pNext);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkWriteDescriptorSet_getPNext0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:510

		  VkWriteDescriptorSet* vkObj = (VkWriteDescriptorSet*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->pNext);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkWriteDescriptorSet_getPNext0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkWriteDescriptorSet_getPNext0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkWriteDescriptorSet_setDstSet0(JNIEnv* env, jclass clazz, jobject obj_ptr, jlong _dstSet) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:520

		  VkWriteDescriptorSet* vkObj = (VkWriteDescriptorSet*)(ptr);
		 // code for simple past value 
		  vkObj->dstSet = (VkDescriptorSet) (_dstSet);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkWriteDescriptorSet_getDstSet0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:530

		  VkWriteDescriptorSet* vkObj = (VkWriteDescriptorSet*)(ptr);
		  // generic get for struct field of type  VkHandle or VkStruct 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->dstSet);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkWriteDescriptorSet_getDstSet0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkWriteDescriptorSet_getDstSet0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkWriteDescriptorSet_setDstBinding0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _dstBinding) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:540

		  VkWriteDescriptorSet* vkObj = (VkWriteDescriptorSet*)(ptr);
		 // code for simple past value 
		  vkObj->dstBinding = (uint32_t) (_dstBinding);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkWriteDescriptorSet_getDstBinding0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:550

		  VkWriteDescriptorSet* vkObj = (VkWriteDescriptorSet*)(ptr);
		  return (jint) (vkObj->dstBinding);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkWriteDescriptorSet_getDstBinding0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkWriteDescriptorSet_getDstBinding0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkWriteDescriptorSet_setDstArrayElement0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _dstArrayElement) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:559

		  VkWriteDescriptorSet* vkObj = (VkWriteDescriptorSet*)(ptr);
		 // code for simple past value 
		  vkObj->dstArrayElement = (uint32_t) (_dstArrayElement);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkWriteDescriptorSet_getDstArrayElement0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:569

		  VkWriteDescriptorSet* vkObj = (VkWriteDescriptorSet*)(ptr);
		  return (jint) (vkObj->dstArrayElement);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkWriteDescriptorSet_getDstArrayElement0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkWriteDescriptorSet_getDstArrayElement0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkWriteDescriptorSet_setDescriptorCount0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _descriptorCount) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:578

		  VkWriteDescriptorSet* vkObj = (VkWriteDescriptorSet*)(ptr);
		 // code for simple past value 
		  vkObj->descriptorCount = (uint32_t) (_descriptorCount);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkWriteDescriptorSet_getDescriptorCount0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:588

		  VkWriteDescriptorSet* vkObj = (VkWriteDescriptorSet*)(ptr);
		  return (jint) (vkObj->descriptorCount);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkWriteDescriptorSet_getDescriptorCount0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkWriteDescriptorSet_getDescriptorCount0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkWriteDescriptorSet_setDescriptorType0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _descriptorType) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:597

		  VkWriteDescriptorSet* vkObj = (VkWriteDescriptorSet*)(ptr);
		 // code for simple past value 
		  vkObj->descriptorType = (VkDescriptorType) (_descriptorType);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkWriteDescriptorSet_getDescriptorType0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:607

		  VkWriteDescriptorSet* vkObj = (VkWriteDescriptorSet*)(ptr);
		  return (VkDescriptorType) (vkObj->descriptorType);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkWriteDescriptorSet_getDescriptorType0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkWriteDescriptorSet_getDescriptorType0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkWriteDescriptorSet_setPImageInfo0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__pImageInfo) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _pImageInfo = (char*)(obj__pImageInfo?env->GetDirectBufferAddress(obj__pImageInfo) : NULL);


//@line:616

		  VkWriteDescriptorSet* vkObj = (VkWriteDescriptorSet*)(ptr);
		 // code for Buffer - referenced by ptr
		  vkObj->pImageInfo = (const VkDescriptorImageInfo*) (_pImageInfo);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkWriteDescriptorSet_getPImageInfo0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:626

		  VkWriteDescriptorSet* vkObj = (VkWriteDescriptorSet*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->pImageInfo);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkWriteDescriptorSet_getPImageInfo0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkWriteDescriptorSet_getPImageInfo0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkWriteDescriptorSet_setPBufferInfo0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__pBufferInfo) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _pBufferInfo = (char*)(obj__pBufferInfo?env->GetDirectBufferAddress(obj__pBufferInfo) : NULL);


//@line:636

		  VkWriteDescriptorSet* vkObj = (VkWriteDescriptorSet*)(ptr);
		 // code for Buffer - referenced by ptr
		  vkObj->pBufferInfo = (const VkDescriptorBufferInfo*) (_pBufferInfo);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkWriteDescriptorSet_getPBufferInfo0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:646

		  VkWriteDescriptorSet* vkObj = (VkWriteDescriptorSet*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->pBufferInfo);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkWriteDescriptorSet_getPBufferInfo0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkWriteDescriptorSet_getPBufferInfo0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkWriteDescriptorSet_setPTexelBufferView0(JNIEnv* env, jclass clazz, jobject obj_ptr, jlong _pTexelBufferView) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:656

		  VkWriteDescriptorSet* vkObj = (VkWriteDescriptorSet*)(ptr);
		 // code for simple past value 
		  vkObj->pTexelBufferView = (const VkBufferView*) (_pTexelBufferView);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkWriteDescriptorSet_getPTexelBufferView0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:666

		  VkWriteDescriptorSet* vkObj = (VkWriteDescriptorSet*)(ptr);
		  // generic get for struct field of type  VkHandle or VkStruct 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->pTexelBufferView);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkWriteDescriptorSet_getPTexelBufferView0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkWriteDescriptorSet_getPTexelBufferView0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

