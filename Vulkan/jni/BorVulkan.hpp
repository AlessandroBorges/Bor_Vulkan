#ifndef BORVULKAN_H
#define BORVULKAN_H

//#pragma once

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
 #include <vulkan_wrapper.h>
 #include <jni.h>

 #define MIN(a,b) (((a)<(b))?(a):(b))
 #define MAX(a,b) (((a)>(b))?(a):(b))
 #define CALLOC(COUNT,TYPE) ((TYPE*)(calloc(COUNT,sizeof(TYPE))));
 
inline char* cloneStr(const char* src){
	 if(src==NULL) return NULL;
	 int len = strlen(src)+1;
	 char* dst = CALLOC(len, char);
	 strcpy(dst, src);
	 return dst;
 }

 
#ifdef __cplusplus
}
#endif 
	
 #endif