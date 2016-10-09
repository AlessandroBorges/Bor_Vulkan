#include <bor.util.JAWT.h>

//@line:19
   
     
    #include <BorVulkan.hpp>
    #include <assert.h>
    #include <stdlib.h> 
    #include <iostream>
    #include <jni.h>
    
    #ifndef VK_USE_PLATFORM_ANDROID_KHR 
      #include <jawt.h>  
      #include "jawt_md.h"  
    #endif 
    using namespace std;
   
 /////////////////////////////////////////   
    JNIEXPORT jlong JNICALL Java_bor_util_JAWT_getAWT0(JNIEnv* env, jclass clazz) {


//@line:78
	
    #ifndef VK_USE_PLATFORM_ANDROID_KHR 
	    JAWT *awt = nullptr;
	    awt = (JAWT*) malloc(sizeof(JAWT));
	    if (awt == nullptr) {
		 fprintf(stderr, "malloc failed\n");
		 return 0;
	    }
	    awt->version = JAWT_VERSION_1_4;
	    if (JAWT_GetAWT(env, awt) == JNI_FALSE) {
		fprintf(stderr, "AWT not found\n");
		return 0;
	    }
	    return reinterpret_cast<jlong>(awt);
     #elif
	return (jlong)0;
     #endif  	    
	 

}

JNIEXPORT jlong JNICALL Java_bor_util_JAWT_getDrawingSurfaceInfo0(JNIEnv* env, jclass clazz, jlong dsObj) {


//@line:144

   #ifndef VK_USE_PLATFORM_ANDROID_KHR 
	
	JAWT_DrawingSurface *ds = reinterpret_cast<JAWT_DrawingSurface*>(dsObj);
      	JAWT_DrawingSurfaceInfo *dsi;
       	jint lock;

        ds->env = env;
        lock = ds->Lock(ds);
        if ((lock & JAWT_LOCK_ERROR) != 0) {
	     fprintf(stderr, "Error locking surface. Try again...\n");
	     //try again
	     ds->Unlock(ds);
	     lock = ds->Lock(ds);
	     // check 
	     if ((lock & JAWT_LOCK_ERROR) != 0) {
	        fprintf(stderr, "Error locking surface #2. Give up!\n");
	        return 0;
	     }
        }

       dsi = ds->GetDrawingSurfaceInfo(ds);

       if (dsi == NULL) {
	     fprintf(stderr, "Error GetDrawingSurfaceInfo\n");
	     ds->Unlock(ds);
	     return 0;
       }
       //unlock
       ds->Unlock(ds);
      return reinterpret_cast<jlong>(dsi);
     
  #elif
    return (jlong)0;
  #endif 
      
      

}

JNIEXPORT jlong JNICALL Java_bor_util_JAWT_getDrawingSurfaceAWT0(JNIEnv* env, jclass clazz, jobject canvas, jlong awtHandle) {


//@line:203

    #ifndef VK_USE_PLATFORM_ANDROID_KHR 
	JAWT* p_awt = reinterpret_cast<JAWT*>(awtHandle); 
      	JAWT_DrawingSurface *ds;
      	ds = p_awt->GetDrawingSurface(env, canvas);
      	if (ds == NULL) {
	    fprintf(stderr, "NULL drawing surface\n");
	    return 0;
      	}
      	return reinterpret_cast<jlong>(ds);
      	
    #elif
        return (jlong)0;
    #endif          
	

}

JNIEXPORT jlong JNICALL Java_bor_util_JAWT_getDrawingSurfaceWindowIdAWT(JNIEnv* env, jclass clazz, jobject canvas, jlong dsHandle, jlong dsiHandle, jlong display, jint screen) {


//@line:233

   #ifndef VK_USE_PLATFORM_ANDROID_KHR 		
      JAWT_DrawingSurface *ds = reinterpret_cast<JAWT_DrawingSurface*>(dsHandle);
      JAWT_DrawingSurfaceInfo *dsi = reinterpret_cast<JAWT_DrawingSurfaceInfo *>(dsiHandle);
      jint lock;
      jlong window;
      
      ds->env = env;      
      lock = ds->Lock(ds);
      if ( (lock & JAWT_LOCK_ERROR) != 0 ) {
          printf("Error locking surface \n");
          ds->Unlock(ds);
          lock = ds->Lock(ds);
      }
      
      #ifdef VK_USE_PLATFORM_WIN32_KHR   
          JAWT_Win32DrawingSurfaceInfo *dsi_win = (JAWT_Win32DrawingSurfaceInfo*) dsi->platformInfo;
          window = (jlong)dsi_win->hwnd;
      #else 
          JAWT_X11DrawingSurfaceInfo *dsi_x11 = (JAWT_X11DrawingSurfaceInfo*) dsi->platformInfo;
          window = (jint)dsi_x11->drawable;
      #endif    
      ds->Unlock(ds);
      return reinterpret_cast<jlong>(window); 
  #elif
     return (jlong)0;
  #endif  
     

}

JNIEXPORT jboolean JNICALL Java_bor_util_JAWT_lockGlobal0(JNIEnv* env, jclass clazz, jlong awt) {


//@line:280

    #ifndef VK_USE_PLATFORM_ANDROID_KHR
	  if(awt != NULL){
	     JAWT* p_awt = reinterpret_cast<JAWT*>(awt); 
	     p_awt->Lock(env);
	     return JNI_TRUE;
	  }else
	   return JNI_FALSE;
    #elif
      return JNI_FALSE;
    #endif  
   

}

JNIEXPORT jboolean JNICALL Java_bor_util_JAWT_unlockGlobal0(JNIEnv* env, jclass clazz, jlong awt) {


//@line:312

    #ifndef VK_USE_PLATFORM_ANDROID_KHR 
          JAWT* p_awt = reinterpret_cast<JAWT*>(awt); 
          p_awt->Unlock(env);          
          return JNI_TRUE;         
    #elif
          return JNI_FALSE;
    #endif 
    

}

JNIEXPORT void JNICALL Java_bor_util_JAWT_freeResource(JNIEnv* env, jclass clazz, jlong awtObj, jlong drawingSurface, jlong drawingSurfaceInfo) {


//@line:328

    #ifndef VK_USE_PLATFORM_ANDROID_KHR 
	    JAWT *p_awt = reinterpret_cast<JAWT*>(awtObj);
	    JAWT_DrawingSurface *ds = reinterpret_cast<JAWT_DrawingSurface*>(drawingSurface);
    	    JAWT_DrawingSurfaceInfo *dsi = reinterpret_cast<JAWT_DrawingSurfaceInfo *>(drawingSurfaceInfo);
            
            if(ds != NULL){
               ds->env = env;
               if(dsi != NULL)
                  ds->FreeDrawingSurfaceInfo(dsi);
               if(p_awt != NULL){
                 p_awt->FreeDrawingSurface(ds);    
                 free(p_awt);
               }
            }
    #endif 	    	
	

}

JNIEXPORT jboolean JNICALL Java_bor_util_JAWT_lock0(JNIEnv* env, jclass clazz, jlong drawingSurface) {


//@line:409
 
   #ifndef VK_USE_PLATFORM_ANDROID_KHR
        JAWT_DrawingSurface *ds = reinterpret_cast<JAWT_DrawingSurface*>(drawingSurface);
        jint lock = 0;
        ds->env = env;
        lock = ds->Lock(ds);
        if ((lock & JAWT_LOCK_ERROR) == 0) {
            return JNI_TRUE;
        } 
        else{ 
           cout<< "Failed lock AWT DrawingSurface!" <<endl;
           if ((lock & JAWT_LOCK_SURFACE_CHANGED) != 0) {
               // try again
               ds->Unlock(ds);
               lock = ds->Lock(ds);            
               if ((lock & JAWT_LOCK_ERROR) == 0) {
                 cout<< "Success on 2nd attempt to lock AWT DrawingSurface!" <<endl;
                  return JNI_TRUE;
               }else{ 
                   cout<< "Failed second attempt to lock AWT!" <<endl;
                   return JNI_FALSE;            
                 }
            } else{
                  return JNI_TRUE;
               }
        } //else
    #elif
      return JNI_FALSE;
    #endif     
     

}

JNIEXPORT jboolean JNICALL Java_bor_util_JAWT_unlock0(JNIEnv* env, jclass clazz, jlong drawingSurface) {


//@line:448
 
    #ifndef VK_USE_PLATFORM_ANDROID_KHR
        JAWT_DrawingSurface *ds = reinterpret_cast<JAWT_DrawingSurface*>(drawingSurface);                
        ds->env = env;
        ds->Unlock(ds);                                
        return JNI_TRUE;
    #elif
      return JNI_FALSE;
    #endif 
    

}

static inline jboolean wrapped_Java_bor_util_JAWT_getHwndHdc
(JNIEnv* env, jclass clazz, jlong dsHandle, jlongArray obj_val, long long* val) {

//@line:470
 
    #ifndef VK_USE_PLATFORM_ANDROID_KHR       
          JAWT_DrawingSurface *ds;
          JAWT_DrawingSurfaceInfo* dsi;                
          jint lock = 0; 
          
          ds = reinterpret_cast<JAWT_DrawingSurface *>(dsHandle);               
          ds->env = env;          
          lock = ds->Lock(ds);          
          if((lock & JAWT_LOCK_ERROR) != 0){
               printf("getHWND() - Error locking surface. Try again...\n");
               ds->Unlock(ds);
               lock = ds->Lock(ds);               
               if((lock & JAWT_LOCK_ERROR) != 0){
                   printf("getHWND() - Error #2 locking surface. Give up. \n");
                   return JNI_FALSE;
               }
           }          
           // update dsi
           dsi = ds->GetDrawingSurfaceInfo(ds);
                                 
       // Get the platform-specific drawing info       
       #ifdef VK_USE_PLATFORM_WIN32_KHR  
                JAWT_Win32DrawingSurfaceInfo *dsi_win;      
                dsi_win = (JAWT_Win32DrawingSurfaceInfo *)dsi->platformInfo;
                if(dsi_win == NULL) return JNI_FALSE;                
                val[0] = (jlong) dsi_win->hwnd;    
                val[1] = (jlong) dsi_win->hdc;               
        #else
                 JAWT_X11DrawingSurfaceInfo *dsi_x11;
                 dsi_x11 = (JAWT_X11DrawingSurfaceInfo *)dsi->platformInfo;
                 if(dsi_x11 == NULL) return JNI_FALSE;                 
                 val[0] = (jlong) dsi_x11->drawable;   
                 val[1] = (jlong) dsi_x11->display;    
        #endif   
        
        // release dsi       
        ds->FreeDrawingSurfaceInfo(dsi); 
        return JNI_TRUE;          
    #elif
      return JNI_FALSE;
    #endif               
    
}

JNIEXPORT jboolean JNICALL Java_bor_util_JAWT_getHwndHdc(JNIEnv* env, jclass clazz, jlong dsHandle, jlongArray obj_val) {
	long long* val = (long long*)(obj_val ? env->GetLongArrayElements(obj_val, 0) : NULL);

	jboolean JNI_returnValue = wrapped_Java_bor_util_JAWT_getHwndHdc(env, clazz, dsHandle, obj_val, val);

	if(obj_val != NULL){
		 env->ReleaseLongArrayElements(obj_val, (jlong*)val, 0);
	}

	return JNI_returnValue;
}

static inline jboolean wrapped_Java_bor_util_JAWT_getRectangle0
(JNIEnv* env, jclass clazz, jlong dsHandle, jintArray obj_val, int* val) {

//@line:515

    #ifndef VK_USE_PLATFORM_ANDROID_KHR                                                      
         JAWT_DrawingSurface *ds;
         JAWT_DrawingSurfaceInfo* dsi;
         jint lock;
                           
         ds  = reinterpret_cast<JAWT_DrawingSurface *>(dsHandle);          
         ds->env = env;
         lock = ds->Lock(ds);
         if ( (lock & JAWT_LOCK_ERROR) != 0 ) {
                  printf("Error locking surface \n");
                  return JNI_FALSE;
          }             
         // update dsi
         dsi = ds->GetDrawingSurfaceInfo(ds);                                     
          val[0] = dsi->bounds.x;
          val[1] = dsi->bounds.y;
          val[2] = dsi->bounds.width;
          val[3] = dsi->bounds.height;          
         // Free the drawing surface info
         ds->FreeDrawingSurfaceInfo(dsi);        
         // unlock  the drawing surface
         ds->Unlock(ds);               
         return JNI_TRUE;
    #elif
      return JNI_FALSE;
    #endif 
          
       
}

JNIEXPORT jboolean JNICALL Java_bor_util_JAWT_getRectangle0(JNIEnv* env, jclass clazz, jlong dsHandle, jintArray obj_val) {
	int* val = (int*)(obj_val ? env->GetIntArrayElements(obj_val, 0) : NULL);

	jboolean JNI_returnValue = wrapped_Java_bor_util_JAWT_getRectangle0(env, clazz, dsHandle, obj_val, val);

	if(obj_val != NULL){
		 env->ReleaseIntArrayElements(obj_val, (jint*)val, 0);
	}

	return JNI_returnValue;
}

static inline jboolean wrapped_Java_bor_util_JAWT_updateDSIEGLhandlers00
(JNIEnv* env, jclass clazz, jlong dsHandle, jlong dsiHandler, jlongArray obj_EGLhandlers, long long* EGLhandlers) {

//@line:553

    #ifndef VK_USE_PLATFORM_ANDROID_KHR 
      jint lock;
       
      JAWT_DrawingSurface* ds;
      JAWT_DrawingSurfaceInfo* dsi;
      //JAWT p_awt = reinterpret_cast<JAWT_DrawingSurface *>(awtHandle);
      
      ds = reinterpret_cast<JAWT_DrawingSurface *>(dsHandle);      
      ds->env = env;
      lock = ds->Lock(ds);
     
      if ( (lock & JAWT_LOCK_ERROR) != 0 ) {
            printf("Error locking surface \n");
            return 0;
       }
          
       // update dsi
       dsi = ds->GetDrawingSurfaceInfo(ds);
       
       if (dsi == NULL) {
           printf("Error getting surface info\n");
           ds->Unlock(ds);
           //awt.FreeDrawingSurface(ds);
            return JNI_FALSE;
       }
       
       //ignore older  one         
       //dsi = (JAWT_DrawingSurfaceInfo*)dsiHandler;              
                       
       // Get the platform-specific drawing info
       
       #ifdef VK_USE_PLATFORM_WIN32_KHR  
            JAWT_Win32DrawingSurfaceInfo* dsi_win;      
            dsi_win = (JAWT_Win32DrawingSurfaceInfo *) dsi->platformInfo;
            if(dsi_win == NULL){
                return JNI_FALSE;
            }
            EGLhandlers[0] = (jlong) dsi_win->hdc;     // EGLNativeDisplayType_index 0L
            EGLhandlers[1] = (jlong) dsi_win->hbitmap; // EGLNativePixmapType_index  1L
            EGLhandlers[2] = (jlong) dsi_win->hwnd;    // EGLNativeWindowType_index  2L
        #else
            dsi_x11 = (JAWT_X11DrawingSurfaceInfo *)dsi->platformInfo;
            if(dsi_x11 == NULL){
                  return JNI_FALSE;
              }            
             EGLhandlers[0] = (jlong) dsi_x11->display;    // EGLNativeDisplayType_index 0L
             EGLhandlers[1] = (jlong) dsi_x11->colormapID; // EGLNativePixmapType_index  1L
             EGLhandlers[2] = (jlong) dsi_x11->drawable;   // EGLNativeWindowType_index  2L             
         #endif   
         
         // Free the drawing surface info 
         ds->FreeDrawingSurfaceInfo(dsi);
         
         // unlock the drawing surface
         ds->Unlock(ds);
         return JNI_TRUE;

    #elif
      return JNI_FALSE;
    #endif     
    
}

JNIEXPORT jboolean JNICALL Java_bor_util_JAWT_updateDSIEGLhandlers00(JNIEnv* env, jclass clazz, jlong dsHandle, jlong dsiHandler, jlongArray obj_EGLhandlers) {
	long long* EGLhandlers = (long long*)(obj_EGLhandlers ? env->GetLongArrayElements(obj_EGLhandlers, 0) : NULL);

	jboolean JNI_returnValue = wrapped_Java_bor_util_JAWT_updateDSIEGLhandlers00(env, clazz, dsHandle, dsiHandler, obj_EGLhandlers, EGLhandlers);

	if(obj_EGLhandlers != NULL){
		 env->ReleaseLongArrayElements(obj_EGLhandlers, (jlong*)EGLhandlers, 0);
	}

	return JNI_returnValue;
}

JNIEXPORT jboolean JNICALL Java_bor_util_JAWT_freeDrawingSurfaceInfo0(JNIEnv* env, jclass clazz, jlong dsHandle, jlong dsiHandle) {


//@line:616

    #ifndef VK_USE_PLATFORM_ANDROID_KHR    
      jint lock;
      JAWT_DrawingSurface* ds;
      JAWT_DrawingSurfaceInfo* dsi;
         
      ds = reinterpret_cast<JAWT_DrawingSurface *>(dsHandle);
      ds->env = env;      
      dsi =reinterpret_cast<JAWT_DrawingSurfaceInfo *>(dsiHandle);
      ds->FreeDrawingSurfaceInfo(dsi);       
      return JNI_TRUE; 
    #elif
      return JNI_FALSE;
    #endif     
      
    

}

