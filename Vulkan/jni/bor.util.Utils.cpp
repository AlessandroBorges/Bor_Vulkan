#include <bor.util.Utils.h>

//@line:23

     
         
      #include <stdio.h>
      #include <stdlib.h>      
      #include <vulkan/vulkan.h>
     
     JNIEXPORT jint JNICALL Java_bor_util_Utils_sizeOfPtr(JNIEnv* env, jclass clazz) {


//@line:43
      
      return (jint) sizeof(void*);      
    

}

static inline jboolean wrapped_Java_bor_util_Utils_equals
(JNIEnv* env, jclass clazz, jobject obj_buffer, jlong address, unsigned char* buffer) {

//@line:53

      
      void* a = (void*) buffer;
      void* b = (void*) reinterpret_cast<void*>(address);      
      return (jboolean) (a==b);    
    
}

JNIEXPORT jboolean JNICALL Java_bor_util_Utils_equals(JNIEnv* env, jclass clazz, jobject obj_buffer, jlong address) {
	unsigned char* buffer = (unsigned char*)(obj_buffer?env->GetDirectBufferAddress(obj_buffer) : NULL);

	jboolean JNI_returnValue = wrapped_Java_bor_util_Utils_equals(env, clazz, obj_buffer, address, buffer);


	return JNI_returnValue;
}

static inline jlong wrapped_Java_bor_util_Utils_getNativeAddress
(JNIEnv* env, jclass clazz, jobject obj_buffer, unsigned char* buffer) {

//@line:80
      
      return (jlong) reinterpret_cast<jlong>(buffer);
    
}

JNIEXPORT jlong JNICALL Java_bor_util_Utils_getNativeAddress(JNIEnv* env, jclass clazz, jobject obj_buffer) {
	unsigned char* buffer = (unsigned char*)(obj_buffer?env->GetDirectBufferAddress(obj_buffer) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_util_Utils_getNativeAddress(env, clazz, obj_buffer, buffer);


	return JNI_returnValue;
}

JNIEXPORT jobject JNICALL Java_bor_util_Utils_wrapPointer(JNIEnv* env, jclass clazz, jlong address, jint size) {


//@line:91

     void* buffer =  reinterpret_cast<void*>(address);
     jobject directBuffer = env->NewDirectByteBuffer(buffer, size);
     return directBuffer;
    

}

JNIEXPORT jobject JNICALL Java_bor_util_Utils_createNativeDirectBuffer(JNIEnv* env, jclass clazz, jint size) {


//@line:105

     void* pbuffer = calloc((size_t) 1, (size_t)size);
     jobject directBuffer = env->NewDirectByteBuffer(pbuffer, size);
     return directBuffer;
    

}

static inline jboolean wrapped_Java_bor_util_Utils_deleteDirectBuffer
(JNIEnv* env, jclass clazz, jobject obj_ptr, char* ptr) {

//@line:116

       void* pbuffer = (void*)ptr;
       if(pbuffer)
              free(pbuffer);
       return JNI_TRUE;
    
}

JNIEXPORT jboolean JNICALL Java_bor_util_Utils_deleteDirectBuffer(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	char* ptr = (char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jboolean JNI_returnValue = wrapped_Java_bor_util_Utils_deleteDirectBuffer(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

