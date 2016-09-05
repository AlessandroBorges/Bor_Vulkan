#ifndef BORVULKAN_H
#define BORVULKAN_H

#pragma once

#ifdef __cplusplus
extern "C" {
#endif

 #if defined(_WIN32)
        #define VK_USE_PLATFORM_WIN32_KHR 1
        #define WIN32_LEAN_AND_MEAN 1
        #define VC_EXTRALEAN 1
 #elif defined(__ANDROID__)
       #define VK_USE_PLATFORM_ANDROID_KHR 1
 #else
       #define VK_USE_PLATFORM_XCB_KHR 1
       #define VK_USE_PLATFORM_XLIB_KHR 1
 #endif

    // include other platform here

 #include <stdio.h>
 #include <stdlib.h>
 #include <cstring>

 #define VK_NO_PROTOTYPES 1
 #define USE_DEBUG_EXTENSIONS 1
 #define VULKAN_WRAPPER_ENABLE_ALL_EXTENSIONS_DEFAULT 1
 #include <vulkan_wrapper.h>
 #include <jni.h>
 
 #define MIN(a,b) (((a)<(b))?(a):(b))
 #define MAX(a,b) (((a)>(b))?(a):(b))
 #define CALLOC(COUNT,TYPE) ((TYPE*)(calloc(COUNT,sizeof(TYPE))));
 #define JLONG2HANDLE(COUNT, TYPE, JAVA_ARRAY, C_ARRAY) \
       TYPE* C_ARRAY =  (COUNT == 0) ? NULL : (TYPE*)(calloc(COUNT,(sizeof(TYPE)* COUNT)));\
	   for(int i=0; i < COUNT ; i++){\
	      TYPE s = reinterpret_cast<TYPE>(JAVA_ARRAY[i]);\
		  C_ARRAY[i] = s; \
	   }\

#define FREE_IT(OBJ) \
    { if(OBJ != NULL) {free(OBJ); OBJ = NULL;}}\

inline char* cloneStr(const char* src){
	 if(src==NULL) return NULL;
	 int len = strlen(src)+1;
	 char* dst = (char*)malloc(len * sizeof(char));
     memset(dst, 0, len * sizeof(char));
	 strcpy(dst, src);
	 return dst;
 }


#ifdef __cplusplus
}
#endif

 #endif
