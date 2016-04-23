#include <bor.vulkan.structs.VkInstanceCreateInfo.h>

//@line:44

    #include <BorVulkan.hpp>
    #include <vector>
    #include <string>
    #include <iostream>
    
    using namespace std;
    static jclass stringClass;
      
     
      ////////////////////////////////////////
     JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkInstanceCreateInfo_initNative(JNIEnv* env, jclass clazz) {


//@line:116

	       jclass stringClassLocal = env->FindClass("java/lang/String");
	       stringClass = (jclass) env->NewGlobalRef(stringClassLocal);
	    

}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkInstanceCreateInfo_setSType0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _sType) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr):0);


//@line:416

		  VkInstanceCreateInfo* vkObj = (VkInstanceCreateInfo*)(ptr);
		  vkObj->sType = (VkStructureType) (_sType);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkInstanceCreateInfo_getSType0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:425

		  VkInstanceCreateInfo* vkObj = (VkInstanceCreateInfo*)(ptr);
		  return (VkStructureType) (vkObj->sType);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkInstanceCreateInfo_getSType0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr):0);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkInstanceCreateInfo_getSType0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkInstanceCreateInfo_setPNext0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__pNext) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr):0);
	char* _pNext = (char*)(obj__pNext?env->GetDirectBufferAddress(obj__pNext):0);


//@line:434

		  VkInstanceCreateInfo* vkObj = (VkInstanceCreateInfo*)(ptr);
		  vkObj->pNext = (const void*) (_pNext);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkInstanceCreateInfo_getPNext0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:443

		  VkInstanceCreateInfo* vkObj = (VkInstanceCreateInfo*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->pNext);	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkInstanceCreateInfo_getPNext0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr):0);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkInstanceCreateInfo_getPNext0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkInstanceCreateInfo_setFlags0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _flags) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr):0);


//@line:451

		  VkInstanceCreateInfo* vkObj = (VkInstanceCreateInfo*)(ptr);
		  vkObj->flags = (VkInstanceCreateFlags) (_flags);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkInstanceCreateInfo_getFlags0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:460

		  VkInstanceCreateInfo* vkObj = (VkInstanceCreateInfo*)(ptr);
		  return (jint) (vkObj->flags);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkInstanceCreateInfo_getFlags0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr):0);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkInstanceCreateInfo_getFlags0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkInstanceCreateInfo_setPApplicationInfo0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__pApplicationInfo) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr):0);
	char* _pApplicationInfo = (char*)(obj__pApplicationInfo?env->GetDirectBufferAddress(obj__pApplicationInfo):0);


//@line:469

		  VkInstanceCreateInfo* vkObj = (VkInstanceCreateInfo*)(ptr);
		  vkObj->pApplicationInfo = (const VkApplicationInfo*) (_pApplicationInfo);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkInstanceCreateInfo_getPApplicationInfo0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:478

		  VkInstanceCreateInfo* vkObj = (VkInstanceCreateInfo*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->pApplicationInfo);	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkInstanceCreateInfo_getPApplicationInfo0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr):0);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkInstanceCreateInfo_getPApplicationInfo0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkInstanceCreateInfo_setEnabledLayerCount0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _enabledLayerCount) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr):0);


//@line:486

		  VkInstanceCreateInfo* vkObj = (VkInstanceCreateInfo*)(ptr);
		  vkObj->enabledLayerCount = (uint32_t) (_enabledLayerCount);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkInstanceCreateInfo_getEnabledLayerCount0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:495

		  VkInstanceCreateInfo* vkObj = (VkInstanceCreateInfo*)(ptr);
		  return (jint) (vkObj->enabledLayerCount);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkInstanceCreateInfo_getEnabledLayerCount0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr):0);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkInstanceCreateInfo_getEnabledLayerCount0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkInstanceCreateInfo_setPpEnabledLayerNames0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobjectArray enabledLayerNames) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr):0);


//@line:504

	          VkInstanceCreateInfo* vkObj = (VkInstanceCreateInfo*)(ptr);
                  
                  int stringCount = enabledLayerNames ? env->GetArrayLength(enabledLayerNames) : 0;
                  std::vector<const char*> enabledLayers;
                  
                  for (int i=0; i<stringCount; i++) {
                          jstring string = (jstring) env->GetObjectArrayElement(enabledLayerNames, i);
                          const char *rawString = env->GetStringUTFChars(string, 0);
                          enabledLayers.push_back(rawString);
                        // Don't call `ReleaseStringUTFChars` when you're done.
                        //  env->ReleaseStringUTFChars(string, rawString);
                   }
                   
                  vkObj->enabledLayerCount = enabledLayers.size();
                  vkObj->ppEnabledLayerNames = (const char* const*) enabledLayers.data();
                  
		  //vkObj->ppEnabledLayerNames = (const char* const*) (_ppEnabledLayerNames);
	  

}

static inline jobjectArray wrapped_Java_bor_vulkan_structs_VkInstanceCreateInfo_getPpEnabledLayerNames0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:528

		  VkInstanceCreateInfo* vkObj = (VkInstanceCreateInfo*)(ptr);
				  
                  int count = (int) vkObj->enabledLayerCount;
                  
                  jobjectArray ret;
                  
                  if(count>0){                   
                   // thanks to code ranch 
                   // http://www.coderanch.com/t/326467/java/java/Returning-String-array-program-Java
                   ret= (jobjectArray)env->NewObjectArray(count,
                                                          stringClass,
                                                          NULL); //env->NewStringUTF(""));
                   // const char *ppLayerNames[] = (vkObj->ppEnabledLayerNames);
                    for(int i = 0; i<count; i++){
                         env->SetObjectArrayElement(ret, 
                                                    i,
                                                    env->NewStringUTF(vkObj->ppEnabledLayerNames[i]));
                      }//for
                      return ret;
                  }//if count
                   
                  return NULL; 
	 
}

JNIEXPORT jobjectArray JNICALL Java_bor_vulkan_structs_VkInstanceCreateInfo_getPpEnabledLayerNames0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr):0);

	jobjectArray JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkInstanceCreateInfo_getPpEnabledLayerNames0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkInstanceCreateInfo_setEnabledExtensionCount0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _enabledExtensionCount) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr):0);


//@line:557

		  VkInstanceCreateInfo* vkObj = (VkInstanceCreateInfo*)(ptr);
		  vkObj->enabledExtensionCount = (uint32_t) (_enabledExtensionCount);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkInstanceCreateInfo_getEnabledExtensionCount0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:566

		  VkInstanceCreateInfo* vkObj = (VkInstanceCreateInfo*)(ptr);
		  return (jint) (vkObj->enabledExtensionCount);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkInstanceCreateInfo_getEnabledExtensionCount0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr):0);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkInstanceCreateInfo_getEnabledExtensionCount0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkInstanceCreateInfo_setPpEnabledExtensionNames0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobjectArray enabledExtensionNames) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr):0);


//@line:575

		  VkInstanceCreateInfo* vkObj = (VkInstanceCreateInfo*)(ptr);
		  
		  int stringCount = enabledExtensionNames ? env->GetArrayLength(enabledExtensionNames) : 0;
                  std::vector<const char*> enabledExtensions;
                  
                  for (int i=0; i<stringCount; i++) {
                          jstring string = (jstring) env->GetObjectArrayElement(enabledExtensionNames, i);
                          const char *rawString = env->GetStringUTFChars(string, 0);
                          enabledExtensions.push_back(rawString);
                        // Don't call `ReleaseStringUTFChars` when you're done.
                        //   env->ReleaseStringUTFChars(string, rawString);
                   }
		   
		  vkObj->enabledExtensionCount = enabledExtensions.size();
                  vkObj->ppEnabledExtensionNames = (const char* const*) enabledExtensions.data();
		  
	  

}

static inline jobjectArray wrapped_Java_bor_vulkan_structs_VkInstanceCreateInfo_getPpEnabledExtensionNames0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:598

		  VkInstanceCreateInfo* vkObj = (VkInstanceCreateInfo*)(ptr);
		  int count = (int) vkObj->enabledExtensionCount;
		  
		  jobjectArray ret;
		  
		  if(count>0){
		  // const char *ppEnabledExtensionNames[] = (vkObj->ppEnabledExtensionNames);
		   // thanks to code ranch 
		   // http://www.coderanch.com/t/326467/java/java/Returning-String-array-program-Java
		   ret= (jobjectArray)env->NewObjectArray(count,
		                                          stringClass,//env->FindClass("java/lang/String"),
		                                          env->NewStringUTF(""));
		     for(int i = 0; i<count; i++){
		      env->SetObjectArrayElement(ret, 
		                                  i,
		                                  env->NewStringUTF(vkObj->ppEnabledExtensionNames[i]));
		      }
		      return ret;
		  }
		   
		  return NULL; //(String[]) (vkObj->ppEnabledExtensionNames);
	 
}

JNIEXPORT jobjectArray JNICALL Java_bor_vulkan_structs_VkInstanceCreateInfo_getPpEnabledExtensionNames0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr):0);

	jobjectArray JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkInstanceCreateInfo_getPpEnabledExtensionNames0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

