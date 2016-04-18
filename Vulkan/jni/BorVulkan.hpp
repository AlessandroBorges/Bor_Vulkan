#ifndef BORVULKAN_H
#define BORVULKAN_H

#ifdef __cplusplus
extern "C" {
#endif

 #if defined(_WIN32)
        #define VK_USE_PLATFORM_WIN32_KHR 1
        #define WIN32_LEAN_AND_MEAN 1
        #define VC_EXTRALEAN 1
 #elif defined(__ANDROID__) && defined(__ARM_EABI__) && !defined(__ARM_ARCH_7A__)
       #define VK_USE_PLATFORM_ANDROID_KHR 1
 #elif defined(__ANDROID__) && defined(__ARM_ARCH_7A__)
       #define VK_USE_PLATFORM_ANDROID_KHR 1
 #else
     #define VK_USE_PLATFORM_XLIB_KHR 1
 #endif    
      
    // include other platform here
      
 #include <stdio.h>
 #include <stdlib.h>  

 #include <vulkan/vulkan.h>
 #include <jni.h>
 

#ifdef __cplusplus
}
#endif 
	
 #endif