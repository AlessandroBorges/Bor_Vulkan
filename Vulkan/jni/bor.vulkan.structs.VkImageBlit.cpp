#include <bor.vulkan.structs.VkImageBlit.h>

//@line:41

    #include <BorVulkan.hpp>
    JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkImageBlit_setSrcSubresource0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__srcSubresource) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _srcSubresource = (char*)(obj__srcSubresource?env->GetDirectBufferAddress(obj__srcSubresource) : NULL);


//@line:335

		  VkImageBlit* vkObj = (VkImageBlit*)(ptr);
		 // code for Buffer - ptr to struct 
		 VkImageSubresourceLayers* p_srcSubresource = (VkImageSubresourceLayers*) _srcSubresource; 
		 vkObj->srcSubresource = (*p_srcSubresource); 
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkImageBlit_getSrcSubresource0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:346

		  VkImageBlit* vkObj = (VkImageBlit*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->srcSubresource);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkImageBlit_getSrcSubresource0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkImageBlit_getSrcSubresource0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkImageBlit_setSrcOffsets0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__off0, jobject obj__off1) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _off0 = (char*)(obj__off0?env->GetDirectBufferAddress(obj__off0) : NULL);
	char* _off1 = (char*)(obj__off1?env->GetDirectBufferAddress(obj__off1) : NULL);


//@line:356

		 VkImageBlit* vkObj = (VkImageBlit*)(ptr);		 
		 VkOffset3D* off0 = (VkOffset3D*) _off0;
		 VkOffset3D* off1 = (VkOffset3D*) _off1;		  
		 vkObj->srcOffsets[0] = (*off0);
		 vkObj->srcOffsets[1] = (*off1); 
	  

}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkImageBlit_getSrcOffsets0(JNIEnv* env, jclass clazz, jobject obj_ptr, jlongArray obj_offs) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	long long* offs = (long long*)(obj_offs ? env->GetLongArrayElements(obj_offs, 0) : NULL);


//@line:369

             VkImageBlit* vkObj = (VkImageBlit*)(ptr);               
             offs[0] = reinterpret_cast<jlong>(&vkObj->srcOffsets[0]);
             offs[1] = reinterpret_cast<jlong>(&vkObj->srcOffsets[1]);
         
	if(obj_offs != NULL){
		 env->ReleaseLongArrayElements(obj_offs, (jlong*)offs, 0);
	}

}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkImageBlit_setDstSubresource0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__dstSubresource) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _dstSubresource = (char*)(obj__dstSubresource?env->GetDirectBufferAddress(obj__dstSubresource) : NULL);


//@line:379

		  VkImageBlit* vkObj = (VkImageBlit*)(ptr);
		 // code for Buffer - ptr to struct 
		 VkImageSubresourceLayers* p_dstSubresource = (VkImageSubresourceLayers*) _dstSubresource; 
		 vkObj->dstSubresource = (*p_dstSubresource); 
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkImageBlit_getDstSubresource0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:390

		  VkImageBlit* vkObj = (VkImageBlit*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->dstSubresource);
	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkImageBlit_getDstSubresource0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkImageBlit_getDstSubresource0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkImageBlit_setDstOffsets0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__off0, jobject obj__off1) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _off0 = (char*)(obj__off0?env->GetDirectBufferAddress(obj__off0) : NULL);
	char* _off1 = (char*)(obj__off1?env->GetDirectBufferAddress(obj__off1) : NULL);


//@line:400

             VkImageBlit* vkObj = (VkImageBlit*)(ptr);               
             VkOffset3D* off0 = (VkOffset3D*) _off0;
             VkOffset3D* off1 = (VkOffset3D*) _off1;                  
             vkObj->dstOffsets[0] = (*off0);
             vkObj->dstOffsets[1] = (*off1); 
         

}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkImageBlit_getDstOffsets0(JNIEnv* env, jclass clazz, jobject obj_ptr, jlongArray obj_offs) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	long long* offs = (long long*)(obj_offs ? env->GetLongArrayElements(obj_offs, 0) : NULL);


//@line:413

             VkImageBlit* vkObj = (VkImageBlit*)(ptr);               
             offs[0] = reinterpret_cast<jlong>(&vkObj->dstOffsets[0]);
             offs[1] = reinterpret_cast<jlong>(&vkObj->dstOffsets[1]);
             
         
	if(obj_offs != NULL){
		 env->ReleaseLongArrayElements(obj_offs, (jlong*)offs, 0);
	}

}

