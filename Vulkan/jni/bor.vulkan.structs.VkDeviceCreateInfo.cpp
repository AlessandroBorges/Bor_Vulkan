#include <bor.vulkan.structs.VkDeviceCreateInfo.h>

//@line:46

     
    #include <BorVulkan.hpp>
    #include <vector>
    #include <string>
    #include <iostream>
    #include <JBufferArray.h>
    
    using namespace std;
    static jclass stringClass;
    JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDeviceCreateInfo_initNative(JNIEnv* env, jclass clazz) {


//@line:126

	               jclass stringClassLocal = env->FindClass("java/lang/String");
	               stringClass = (jclass) env->NewGlobalRef(stringClassLocal);
	   

}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDeviceCreateInfo_setSType0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _sType) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:512

		  VkDeviceCreateInfo* vkObj = (VkDeviceCreateInfo*)(ptr);
		  vkObj->sType = (VkStructureType) (_sType);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkDeviceCreateInfo_getSType0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:521

		  VkDeviceCreateInfo* vkObj = (VkDeviceCreateInfo*)(ptr);
		  return (VkStructureType) (vkObj->sType);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkDeviceCreateInfo_getSType0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDeviceCreateInfo_getSType0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDeviceCreateInfo_setPNext0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__pNext) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _pNext = (char*)(obj__pNext?env->GetDirectBufferAddress(obj__pNext) : NULL);


//@line:530

		  VkDeviceCreateInfo* vkObj = (VkDeviceCreateInfo*)(ptr);
		  vkObj->pNext = (const void*) (_pNext);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkDeviceCreateInfo_getPNext0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:539

		  VkDeviceCreateInfo* vkObj = (VkDeviceCreateInfo*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->pNext);	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkDeviceCreateInfo_getPNext0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDeviceCreateInfo_getPNext0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDeviceCreateInfo_setFlags0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _flags) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:547

		  VkDeviceCreateInfo* vkObj = (VkDeviceCreateInfo*)(ptr);
		  vkObj->flags = (VkDeviceCreateFlags) (_flags);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkDeviceCreateInfo_getFlags0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:556

		  VkDeviceCreateInfo* vkObj = (VkDeviceCreateInfo*)(ptr);
		  return (jint) (vkObj->flags);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkDeviceCreateInfo_getFlags0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDeviceCreateInfo_getFlags0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDeviceCreateInfo_setQueueCreateInfoCount0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _queueCreateInfoCount) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:565

		  VkDeviceCreateInfo* vkObj = (VkDeviceCreateInfo*)(ptr);
		  vkObj->queueCreateInfoCount = (uint32_t) (_queueCreateInfoCount);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkDeviceCreateInfo_getQueueCreateInfoCount0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:574

		  VkDeviceCreateInfo* vkObj = (VkDeviceCreateInfo*)(ptr);
		  return (jint) (vkObj->queueCreateInfoCount);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkDeviceCreateInfo_getQueueCreateInfoCount0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDeviceCreateInfo_getQueueCreateInfoCount0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDeviceCreateInfo_setPQueueCreateInfos0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobjectArray pQueueCreateInfos, jint len) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:583

		  VkDeviceQueueCreateInfo* array = NULL;		  
		  if(len>0 && pQueueCreateInfos ){
		    array = new VkDeviceQueueCreateInfo[len];
		    for(jint i = 0; i<len; i++){
		      jobject obj = (pQueueCreateInfos) ?(jobject) env->GetObjectArrayElement(pQueueCreateInfos, i):NULL;
                       if(obj){
                          VkDeviceQueueCreateInfo* pInfo = (VkDeviceQueueCreateInfo*)(env->GetDirectBufferAddress(obj));
                          VkDeviceQueueCreateInfo info = *pInfo; 
                          array[i] = info;
                         }else{
                          VkDeviceQueueCreateInfo info; // blank info
                          array[i] = info;
                         }
		    }
		   // JBufferArray jba (env, pQueueCreateInfos);
		   // jba.copyPointers((PointerToAnythingArray) array, (int)len);
		  }		  
		  VkDeviceCreateInfo* vkObj = (VkDeviceCreateInfo*)(ptr);
		  vkObj->queueCreateInfoCount = len;
		  vkObj->pQueueCreateInfos = (const VkDeviceQueueCreateInfo*) (array);
	  

}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDeviceCreateInfo_getPQueueCreateInfos0(JNIEnv* env, jclass clazz, jobject obj_ptr, jlongArray obj_pointers, jint len) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	long long* pointers = (long long*)(obj_pointers ? env->GetLongArrayElements(obj_pointers, 0) : NULL);


//@line:613

		  VkDeviceCreateInfo* vkObj = (VkDeviceCreateInfo*)(ptr);		  
		  uint32_t count = vkObj->queueCreateInfoCount;
		  if(vkObj->pQueueCreateInfos)
		   for(uint32_t i=0; i<count && i<(uint32_t)len; i++){		            
		     pointers[i] = reinterpret_cast<jlong>(&vkObj->pQueueCreateInfos[i]);
		   }
          
	if(obj_pointers != NULL){
		 env->ReleaseLongArrayElements(obj_pointers, (jlong*)pointers, 0);
	}

}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDeviceCreateInfo_setEnabledLayerCount0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _enabledLayerCount) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:626

		  VkDeviceCreateInfo* vkObj = (VkDeviceCreateInfo*)(ptr);
		  vkObj->enabledLayerCount = (uint32_t) (_enabledLayerCount);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkDeviceCreateInfo_getEnabledLayerCount0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:635

		  VkDeviceCreateInfo* vkObj = (VkDeviceCreateInfo*)(ptr);
		  return (jint) (vkObj->enabledLayerCount);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkDeviceCreateInfo_getEnabledLayerCount0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDeviceCreateInfo_getEnabledLayerCount0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

static inline void wrapped_Java_bor_vulkan_structs_VkDeviceCreateInfo_setPpEnabledLayerNames0
(JNIEnv* env, jclass clazz, jobject obj_ptr, jobjectArray ppEnabledLayerNames, unsigned char* ptr) {

//@line:644

		  VkDeviceCreateInfo* vkObj = (VkDeviceCreateInfo*)(ptr);
		  int stringCount = ppEnabledLayerNames ? env->GetArrayLength(ppEnabledLayerNames) : 0;
		  if(stringCount==0)
		      return;
		      
                  const char** enabledLayers = CALLOC(stringCount,const char*) ;
                  
                  for (int i=0; i<stringCount; i++) {
                          jstring string = (jstring) env->GetObjectArrayElement(ppEnabledLayerNames, i);
                          const char *rawString = env->GetStringUTFChars(string, 0);
                          enabledLayers[i] = cloneStr(rawString);
                          env->ReleaseStringUTFChars(string, rawString);
                   }
                  vkObj->enabledLayerCount = stringCount;
                  vkObj->ppEnabledLayerNames = enabledLayers;
	  
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDeviceCreateInfo_setPpEnabledLayerNames0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobjectArray ppEnabledLayerNames) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	wrapped_Java_bor_vulkan_structs_VkDeviceCreateInfo_setPpEnabledLayerNames0(env, clazz, obj_ptr, ppEnabledLayerNames, ptr);


	return;
}

static inline jobjectArray wrapped_Java_bor_vulkan_structs_VkDeviceCreateInfo_getPpEnabledLayerNames0
(JNIEnv* env, jclass clazz, jobject obj_ptr, jobjectArray names, unsigned char* ptr) {

//@line:666

	          if(names == NULL) return NULL;
		  VkDeviceCreateInfo* vkObj = (VkDeviceCreateInfo*)(ptr);
		  int count = (int) vkObj->enabledLayerCount;
                  if(count > 0){
                    for(int i = 0; i<count; i++){
                         env->SetObjectArrayElement(names, 
                                                    i,
                                                    env->NewStringUTF(vkObj->ppEnabledLayerNames[i]));
                      }//for                      
                  }//if count                  
		 return names;
	 
}

JNIEXPORT jobjectArray JNICALL Java_bor_vulkan_structs_VkDeviceCreateInfo_getPpEnabledLayerNames0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobjectArray names) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jobjectArray JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDeviceCreateInfo_getPpEnabledLayerNames0(env, clazz, obj_ptr, names, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDeviceCreateInfo_setEnabledExtensionCount0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _enabledExtensionCount) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:684

		  VkDeviceCreateInfo* vkObj = (VkDeviceCreateInfo*)(ptr);
		  vkObj->enabledExtensionCount = (uint32_t) (_enabledExtensionCount);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkDeviceCreateInfo_getEnabledExtensionCount0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:693

		  VkDeviceCreateInfo* vkObj = (VkDeviceCreateInfo*)(ptr);
		  return (jint) (vkObj->enabledExtensionCount);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkDeviceCreateInfo_getEnabledExtensionCount0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDeviceCreateInfo_getEnabledExtensionCount0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDeviceCreateInfo_setPpEnabledExtensionNames0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobjectArray _ppEnabledExtensionNames) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);


//@line:702

		  VkDeviceCreateInfo* vkObj = (VkDeviceCreateInfo*)(ptr);		  
		  int stringCount = _ppEnabledExtensionNames ? env->GetArrayLength(_ppEnabledExtensionNames) : 0;
		  
                  const char** names = CALLOC(stringCount,const char*);  
                                  
                  for (int i=0; i<stringCount; i++) {
                          jstring string = (jstring) env->GetObjectArrayElement(_ppEnabledExtensionNames, i);
                          const char *rawString = env->GetStringUTFChars(string, 0);
                          names[i] = cloneStr(rawString);                          
                          env->ReleaseStringUTFChars(string, rawString);
                   }                   
                  vkObj->enabledExtensionCount = stringCount;
                  vkObj->ppEnabledExtensionNames = names; 
		    
	  

}

static inline jobjectArray wrapped_Java_bor_vulkan_structs_VkDeviceCreateInfo_getPpEnabledExtensionNames0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:723

		  VkDeviceCreateInfo* vkObj = (VkDeviceCreateInfo*)(ptr);
		  int count = (int) vkObj->enabledExtensionCount;
		  
                  jobjectArray ret = NULL;                  
                  if(count>0){                   
                   // thanks to code ranch 
                   // http://www.coderanch.com/t/326467/java/java/Returning-String-array-program-Java
                   ret = (jobjectArray)env->NewObjectArray(count,
                                                           env->FindClass("java/lang/String"),
                                                           NULL);//env->NewStringUTF(""));                  
                    for(int i = 0; i<count; i++){
                         env->SetObjectArrayElement(ret, 
                                                    i,
                                                    env->NewStringUTF(vkObj->ppEnabledExtensionNames[i]));
                      }//for
                  }//if count
                  
		return ret;
	 
}

JNIEXPORT jobjectArray JNICALL Java_bor_vulkan_structs_VkDeviceCreateInfo_getPpEnabledExtensionNames0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jobjectArray JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDeviceCreateInfo_getPpEnabledExtensionNames0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDeviceCreateInfo_setPEnabledFeatures0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__pEnabledFeatures) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);
	char* _pEnabledFeatures = (char*)(obj__pEnabledFeatures?env->GetDirectBufferAddress(obj__pEnabledFeatures) : NULL);


//@line:748

		  VkDeviceCreateInfo* vkObj = (VkDeviceCreateInfo*)(ptr);
		  vkObj->pEnabledFeatures = (const VkPhysicalDeviceFeatures*) (_pEnabledFeatures);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkDeviceCreateInfo_getPEnabledFeatures0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:757

		  VkDeviceCreateInfo* vkObj = (VkDeviceCreateInfo*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->pEnabledFeatures);	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkDeviceCreateInfo_getPEnabledFeatures0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr) : NULL);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDeviceCreateInfo_getPEnabledFeatures0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

