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


//@line:125

	               jclass stringClassLocal = env->FindClass("java/lang/String");
	               stringClass = (jclass) env->NewGlobalRef(stringClassLocal);
	   

}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDeviceCreateInfo_setSType0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _sType) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr):0);


//@line:504

		  VkDeviceCreateInfo* vkObj = (VkDeviceCreateInfo*)(ptr);
		  vkObj->sType = (VkStructureType) (_sType);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkDeviceCreateInfo_getSType0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:513

		  VkDeviceCreateInfo* vkObj = (VkDeviceCreateInfo*)(ptr);
		  return (VkStructureType) (vkObj->sType);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkDeviceCreateInfo_getSType0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr):0);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDeviceCreateInfo_getSType0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDeviceCreateInfo_setPNext0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__pNext) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr):0);
	char* _pNext = (char*)(obj__pNext?env->GetDirectBufferAddress(obj__pNext):0);


//@line:522

		  VkDeviceCreateInfo* vkObj = (VkDeviceCreateInfo*)(ptr);
		  vkObj->pNext = (const void*) (_pNext);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkDeviceCreateInfo_getPNext0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:531

		  VkDeviceCreateInfo* vkObj = (VkDeviceCreateInfo*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->pNext);	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkDeviceCreateInfo_getPNext0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr):0);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDeviceCreateInfo_getPNext0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDeviceCreateInfo_setFlags0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _flags) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr):0);


//@line:539

		  VkDeviceCreateInfo* vkObj = (VkDeviceCreateInfo*)(ptr);
		  vkObj->flags = (VkDeviceCreateFlags) (_flags);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkDeviceCreateInfo_getFlags0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:548

		  VkDeviceCreateInfo* vkObj = (VkDeviceCreateInfo*)(ptr);
		  return (jint) (vkObj->flags);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkDeviceCreateInfo_getFlags0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr):0);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDeviceCreateInfo_getFlags0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDeviceCreateInfo_setQueueCreateInfoCount0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _queueCreateInfoCount) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr):0);


//@line:557

		  VkDeviceCreateInfo* vkObj = (VkDeviceCreateInfo*)(ptr);
		  vkObj->queueCreateInfoCount = (uint32_t) (_queueCreateInfoCount);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkDeviceCreateInfo_getQueueCreateInfoCount0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:566

		  VkDeviceCreateInfo* vkObj = (VkDeviceCreateInfo*)(ptr);
		  return (jint) (vkObj->queueCreateInfoCount);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkDeviceCreateInfo_getQueueCreateInfoCount0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr):0);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDeviceCreateInfo_getQueueCreateInfoCount0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDeviceCreateInfo_setPQueueCreateInfos0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobjectArray pQueueCreateInfos, jint len) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr):0);


//@line:575

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
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr):0);
	long long* pointers = (long long*)env->GetPrimitiveArrayCritical(obj_pointers, 0);


//@line:605

		  VkDeviceCreateInfo* vkObj = (VkDeviceCreateInfo*)(ptr);		  
		  uint32_t count = vkObj->queueCreateInfoCount;
		  if(vkObj->pQueueCreateInfos)
		   for(uint32_t i=0; i<count && i<(uint32_t)len; i++){		            
		     pointers[i] = reinterpret_cast<jlong>(&vkObj->pQueueCreateInfos[i]);
		   }
          
	env->ReleasePrimitiveArrayCritical(obj_pointers, pointers, 0);

}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDeviceCreateInfo_setEnabledLayerCount0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _enabledLayerCount) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr):0);


//@line:618

		  VkDeviceCreateInfo* vkObj = (VkDeviceCreateInfo*)(ptr);
		  vkObj->enabledLayerCount = (uint32_t) (_enabledLayerCount);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkDeviceCreateInfo_getEnabledLayerCount0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:627

		  VkDeviceCreateInfo* vkObj = (VkDeviceCreateInfo*)(ptr);
		  return (jint) (vkObj->enabledLayerCount);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkDeviceCreateInfo_getEnabledLayerCount0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr):0);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDeviceCreateInfo_getEnabledLayerCount0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDeviceCreateInfo_setPpEnabledLayerNames0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobjectArray ppEnabledLayerNames) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr):0);


//@line:636

		  VkDeviceCreateInfo* vkObj = (VkDeviceCreateInfo*)(ptr);
		  int stringCount = ppEnabledLayerNames ? env->GetArrayLength(ppEnabledLayerNames) : 0;
                  std::vector<const char*> enabledLayers;
                  
                  for (int i=0; i<stringCount; i++) {
                          jstring string = (jstring) env->GetObjectArrayElement(ppEnabledLayerNames, i);
                          const char *rawString = env->GetStringUTFChars(string, 0);
                          enabledLayers.push_back(rawString);
                        // MUST keep strings and don't `ReleaseStringUTFChars` when you're done.
                        //  env->ReleaseStringUTFChars(string, rawString);
                   }
                  vkObj->enabledLayerCount = stringCount;
                  vkObj->ppEnabledLayerNames = (const char* const*) enabledLayers.data();
	  

}

static inline jobjectArray wrapped_Java_bor_vulkan_structs_VkDeviceCreateInfo_getPpEnabledLayerNames0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:656

		  VkDeviceCreateInfo* vkObj = (VkDeviceCreateInfo*)(ptr);
		  int count = (int) vkObj->enabledLayerCount;
                  printf("vkObj->enabledLayerCount %d \n ", count);
                  
                  jobjectArray ret = NULL;                  
                  if(count > 0){
                   ret= (jobjectArray)env->NewObjectArray(count,
                                                          env->FindClass("java/lang/String"),
                                                           env->NewStringUTF(""));   
                   printf("created jobjectArray ");                                                        
                    for(int i = 0; i<count; i++){
                         env->SetObjectArrayElement(ret, 
                                                    i,
                                                    env->NewStringUTF(vkObj->ppEnabledLayerNames[i]));
                      }//for                      
                  }//if count
                  
		 return ret;
	 
}

JNIEXPORT jobjectArray JNICALL Java_bor_vulkan_structs_VkDeviceCreateInfo_getPpEnabledLayerNames0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr):0);

	jobjectArray JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDeviceCreateInfo_getPpEnabledLayerNames0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDeviceCreateInfo_setEnabledExtensionCount0(JNIEnv* env, jclass clazz, jobject obj_ptr, jint _enabledExtensionCount) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr):0);


//@line:681

		  VkDeviceCreateInfo* vkObj = (VkDeviceCreateInfo*)(ptr);
		  vkObj->enabledExtensionCount = (uint32_t) (_enabledExtensionCount);
	  

}

static inline jint wrapped_Java_bor_vulkan_structs_VkDeviceCreateInfo_getEnabledExtensionCount0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:690

		  VkDeviceCreateInfo* vkObj = (VkDeviceCreateInfo*)(ptr);
		  return (jint) (vkObj->enabledExtensionCount);
	 
}

JNIEXPORT jint JNICALL Java_bor_vulkan_structs_VkDeviceCreateInfo_getEnabledExtensionCount0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr):0);

	jint JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDeviceCreateInfo_getEnabledExtensionCount0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDeviceCreateInfo_setPpEnabledExtensionNames0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobjectArray _ppEnabledExtensionNames) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr):0);


//@line:699

		  VkDeviceCreateInfo* vkObj = (VkDeviceCreateInfo*)(ptr);
		  //vkObj->ppEnabledExtensionNames = (const char* const*) (_ppEnabledExtensionNames);
		  int stringCount = _ppEnabledExtensionNames ? env->GetArrayLength(_ppEnabledExtensionNames) : 0;
                  std::vector<const char*> vecNames;  
                                  
                  for (int i=0; i<stringCount; i++) {
                          jstring string = (jstring) env->GetObjectArrayElement(_ppEnabledExtensionNames, i);
                          const char *rawString = env->GetStringUTFChars(string, 0);
                          vecNames.push_back(rawString);
                        //  env->ReleaseStringUTFChars(string, rawString);
                   }                   
                  vkObj->enabledExtensionCount = stringCount;
                  vkObj->ppEnabledExtensionNames = (const char* const*) vecNames.data(); 
		    
	  

}

static inline jobjectArray wrapped_Java_bor_vulkan_structs_VkDeviceCreateInfo_getPpEnabledExtensionNames0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:720

		  VkDeviceCreateInfo* vkObj = (VkDeviceCreateInfo*)(ptr);
		  int count = (int) vkObj->enabledExtensionCount;
		  
		                    
		                    
                  jobjectArray ret = NULL;                  
                  if(count>0){                   
                   // thanks to code ranch 
                   // http://www.coderanch.com/t/326467/java/java/Returning-String-array-program-Java
                   ret = (jobjectArray)env->NewObjectArray(count,
                                                           env->FindClass("java/lang/String"),
                                                           env->NewStringUTF(""));                  
                    for(int i = 0; i<count; i++){
                         env->SetObjectArrayElement(ret, 
                                                    i,
                                                    env->NewStringUTF(vkObj->ppEnabledExtensionNames[i]));
                      }//for
                  }//if count
                  
		return ret;
	 
}

JNIEXPORT jobjectArray JNICALL Java_bor_vulkan_structs_VkDeviceCreateInfo_getPpEnabledExtensionNames0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr):0);

	jobjectArray JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDeviceCreateInfo_getPpEnabledExtensionNames0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

JNIEXPORT void JNICALL Java_bor_vulkan_structs_VkDeviceCreateInfo_setPEnabledFeatures0(JNIEnv* env, jclass clazz, jobject obj_ptr, jobject obj__pEnabledFeatures) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr):0);
	char* _pEnabledFeatures = (char*)(obj__pEnabledFeatures?env->GetDirectBufferAddress(obj__pEnabledFeatures):0);


//@line:747

		  VkDeviceCreateInfo* vkObj = (VkDeviceCreateInfo*)(ptr);
		  vkObj->pEnabledFeatures = (const VkPhysicalDeviceFeatures*) (_pEnabledFeatures);
	  

}

static inline jlong wrapped_Java_bor_vulkan_structs_VkDeviceCreateInfo_getPEnabledFeatures0
(JNIEnv* env, jclass clazz, jobject obj_ptr, unsigned char* ptr) {

//@line:756

		  VkDeviceCreateInfo* vkObj = (VkDeviceCreateInfo*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->pEnabledFeatures);	 
}

JNIEXPORT jlong JNICALL Java_bor_vulkan_structs_VkDeviceCreateInfo_getPEnabledFeatures0(JNIEnv* env, jclass clazz, jobject obj_ptr) {
	unsigned char* ptr = (unsigned char*)(obj_ptr?env->GetDirectBufferAddress(obj_ptr):0);

	jlong JNI_returnValue = wrapped_Java_bor_vulkan_structs_VkDeviceCreateInfo_getPEnabledFeatures0(env, clazz, obj_ptr, ptr);


	return JNI_returnValue;
}

