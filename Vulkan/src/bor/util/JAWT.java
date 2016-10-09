/**
 * 
 */
package bor.util;

import java.awt.Component;
import java.awt.Rectangle;
import java.util.HashMap;
import java.util.Map;


/**
 * Utility class to handle Native AWT stuff
 * @author Alessandro Borges
 *
 */
public class JAWT {
   //@off
   /*JNI   
     
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
    */
    
    private Component          c;
    /** AWT Handle */
    private long   awtHandle  = 0;

    /** JAWT_DrawingSurface handle */
    private DrawingSurface  m_ds = null;
    // private long dsHandle=0;

    /** JAWT_DrawingSurfaceInfo handle */
    private DrawingSurfaceInfo m_dsi = null;
    // private long dsiHandle=0;

    /**
     * status of DrawingSurface locking
     */
    private boolean    gotDsiLock = false;

    /**
     * Ctor.<br>
     * Creates a JAWT interface to componentAWT.
     * @param componentAWT - a Canvas instance
     */
    public JAWT(Component componentAWT) {
        this.c = componentAWT;
    }
	
     /**
     * get native AWT handler
     * @return native handler
     */	
    public long getAwtHandler() {
        if (awtHandle == 0) {
            awtHandle = getAWT0();
        }
        return awtHandle;
    }

    /**
     * get native AWT handler
     * 
     * @return native handler
     */
    private static native long getAWT0();/*	
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
	 */
	
	
    /**
     * Get the drawing surface info. The value returned may be cached, but the
     * values may change if additional calls to Lock() or Unlock() are made.
     * Lock() must be called before this can return a valid value. Returns NULL
     * if an error has occurred. When finished with the returned value,
     * FreeDrawingSurfaceInfo must be called.
     * 
     * 
     * @param drawingSurface
     * @return dsi instance
     */
     public DrawingSurfaceInfo getDrawingSurfaceInfo(){
	    final DrawingSurface drawingSurface = getDrawingSurface();
	    long handle = getDrawingSurfaceInfo0(drawingSurface.getNativeHandle());
	    if(m_dsi==null){
		m_dsi = new DrawingSurfaceInfo(handle, this, drawingSurface);
	    }	    
	    return m_dsi;	    
	}
	
	/**
	 * Releases DrawingSurfaceInfo.<br>
	 * Same as {@link DrawingSurface#freeDrawingSurfaceInfo(DrawingSurfaceInfo)}
	 * @param dsi DrawingSurfaceInfo to release
	 * @return true if dsi was freed.false if dsi was null or failed to release
	 */
	public boolean freeDrawingSurfaceInfo(DrawingSurfaceInfo dsi){
	    if(dsi == null) return false;
	    final DrawingSurface ds = dsi.getDrawingSurface();
	    //ds.freeDrawingSurfaceInfo(dsi);
	    boolean ok =  freeDrawingSurfaceInfo0(ds.getNativeHandle(), dsi.getNativeHandle());
	    if(ok){
	        dsi.release();
	        // releasing local m_dsi
	        if(this.m_dsi != null && dsi.getNativeHandle() == m_dsi.getNativeHandle()){
	            this.m_dsi = null;
	        }
	    }	        
	    return ok;
	}
	
	/**
	 * Get DrawingSurfaceInfo handler
	 * @param dsObj
	 * @return
	 */
	protected static native long getDrawingSurfaceInfo0(long dsObj);/*
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
      
      */
	
	
    /**
     * get Component's DrawingSurface
     * 
     * @return drawing surface
     */
    public DrawingSurface getDrawingSurface() {
        if (null == this.c) { throw new RuntimeException("AWT Component is null."); }
        if (m_ds == null) {
            long handle = getDrawingSurfaceAWT0(this.c, getAwtHandler());
            m_ds = new DrawingSurface(handle, this);
        }
        return m_ds;
    }

    /**
     * Get Canvas's DrawingSurface handle
     * @param canvas - Canvas instance
     * @param awtObj - awt handle
     * @return
     */
	private static  native long getDrawingSurfaceAWT0(Component canvas, long awtHandle);/*
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
	*/
	
	/**
	 * Get windows HWND handler ( nice !) 
	 * @param canvas AWT Component 
	 * @param dsHandle DrawingSurface handler
	 * @param dsiHandle DrawingSurfaceInfo handler
	 * @param display display handle
	 * @param screen screen id
	 * 
	 * @return HWND handler
	 */
	private static native long getDrawingSurfaceWindowIdAWT(Component canvas, 
			long dsHandle, 
			long dsiHandle, 
			long display, 
			int screen);/*
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
     */
	
    /**
     * performs a AWT lock
     * 
     * @return true - if lock was successfull
     */
    public boolean awtLock() {
        long handler = getAwtHandler();
        if (handler != 0) 
            return lockGlobal0(handler);
        else 
            return false;
    }

    /**
     * Lock AWT
     * 
     * @param awt AWT handler
     */
    private static native boolean lockGlobal0(long awt);/*
    #ifndef VK_USE_PLATFORM_ANDROID_KHR
	  if(awt != 0L){
	     JAWT* p_awt = reinterpret_cast<JAWT*>(awt); 
	     p_awt->Lock(env);
	     return JNI_TRUE;
	  }else
	   return JNI_FALSE;
    #elif
      return JNI_FALSE;
    #endif  
   */

	
    /**
     * performs a AWT lock
     * 
     * @return
     */
    public boolean awtUnlock() {
	long handler = getAwtHandler();
	if (handler != 0)
            return unlockGlobal0(handler);
	else
	    return false;
    }
    /**
     * unlock AWT
     * 
     * @param awt - AWT handler
     * @return true, if unLock was successful
     */
    private static native boolean  unlockGlobal0(long awt);/*
    #ifndef VK_USE_PLATFORM_ANDROID_KHR 
          JAWT* p_awt = reinterpret_cast<JAWT*>(awt); 
          p_awt->Unlock(env);          
          return JNI_TRUE;         
    #elif
          return JNI_FALSE;
    #endif 
    */
	
    /**
     * Free all resources
     * @param awtObj the AWT component handler
     * @param drawingSurface the DrawingSurface handler
     * @param drawingSurfaceInfo the DrawingSurfaceInfo handler
     */
    private static native void freeResource(long awtObj, long drawingSurface, long drawingSurfaceInfo);/*
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
	*/
	
    /**
     * check Drawing Surface lock status
     * 
     * @return
     */
    public synchronized boolean isLocked() {
        return gotDsiLock;
    }

    public synchronized void contextValidated() {
        // canvas.validCtx = true;
    }

    /**
     * release all native resources.
     */
    public void release(){
        freeResource(awtHandle, m_ds.getNativeHandle(), m_dsi.getNativeHandle());
        awtHandle = 0;
        m_ds.release();
    }

    /**
     * Request a lock for DrawingSurface.Lock();
     * 
     * @return true if lock was ok
     */
    public synchronized boolean dsLock() {
        if (m_ds == null) {
            m_ds = getDrawingSurface();
        }
        if (m_ds.lock()) {
            gotDsiLock = true;
            return true;
        } else return false;
    }
    
    /**
     * Request a DrawingSurface.Unlock()
     * @return true if unlock was ok
     */
    public synchronized boolean dsUnlock() {
        if (m_ds == null) {
            m_ds = getDrawingSurface();
        }
        if (m_ds.unlock()) {
            gotDsiLock = true;
            return true;
        } else 
            return false;
    }
    
    //////////////////////////////////////////////////////////////
    // Native Methods of Drawing Surface 
    //////////////////////////////////////////////////////////////

    /**
     * Lock AWT before OpenGL Draw. <br>
     * Native call:  ds->Lock(ds);
     * 
     * @param drawingSurface - DrawingSurface handle 
     * @return true if ok.
     */
   protected static native boolean lock0(long drawingSurface);/* 
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
     */


    /**
     * Unlock AWT after OpenGL Draw. <br>
     * Native call:  ds->Unlock(ds);
     * 
     * @param drawingSurface - the unlocking DrawingSurface handler 
     *
     */
    protected static native boolean unlock0(long drawingSurface);/* 
    #ifndef VK_USE_PLATFORM_ANDROID_KHR
        JAWT_DrawingSurface *ds = reinterpret_cast<JAWT_DrawingSurface*>(drawingSurface);                
        ds->env = env;
        ds->Unlock(ds);                                
        return JNI_TRUE;
    #elif
      return JNI_FALSE;
    #endif 
    */
    
    //////////////////////////////////////////////////////////////
    // Native Methods of DrawingSurfaceInfo 
    //////////////////////////////////////////////////////////////

    /**
     * Get HWND and HDC from DrawingSurfaceInfo
     * @param dsiHandler
     * @param val
     * @return array with val[0] = HWND and val[1] = HDC 
     */
    protected static native boolean getHwndHdc(long dsHandle,                                              
                                               long[] val);/* 
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
    */
    
    protected static native boolean getRectangle0(long dsHandle,                                                  
                                                   int[] val);/*
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
          
       */
    
    /**
     * update EGL native handlers. 
     * @param dsiHandler
     * @param handlers
     */
    protected static native boolean updateDSIEGLhandlers00(//long awtHandle, 
                                                           long dsHandle,
                                                           long dsiHandler, 
                                                           long[] EGLhandlers);/*
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
    */

    protected static native boolean freeDrawingSurfaceInfo0(long dsHandle, long dsiHandle);/*
    #ifndef VK_USE_PLATFORM_ANDROID_KHR       
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
      
    */
    
   
    /**
     * Get the Canvas EGLDisplay.<br>
     * On Windows, it returns HDC
     * @return HDC / Display* pointer
     */
    public long getEGLNativeDisplayType() {
        DrawingSurface ds = this.getDrawingSurface();
        DrawingSurfaceInfo dsi = ds.getDrawingSurfaceInfo();
        long eglNativeDisplayType = dsi.getEGLNativeDisplayType();
        
        return eglNativeDisplayType;
    }
    
    /**
     * Get the Canvas' EGLSurface 
     * @return
     */
    public long getEGLNativeWindowType() {
        DrawingSurface ds = this.getDrawingSurface();
        DrawingSurfaceInfo dsi = ds.getDrawingSurfaceInfo();
        long eglNativeWindowType = dsi.getEGLNativeWindowType();
      
        return eglNativeWindowType;
    }
    
   /**
    *  
    * @author Alessandro Borges
    *
    */
  public static class DrawingSurface extends ObjectHandler{
       
       /**
        * AWT reference
        */
       private JAWT awt;
       
       /**
        * status of locking
        */
       private boolean isLocked = false;
       
       /**
        * Ctor
        * @param handle - native DrawingSurface handle
        * @param awt - JAWT instance
        */
       protected DrawingSurface(long handle, JAWT awt) {
           super(handle);  
           this.awt = awt;
       }
      
       /**
        * Lock AWT DrawingSurface. Call it before OpenGL call.
        * 
        * @return true if it is locked , false otherwise
        */
       public boolean lock() {
           isLocked = JAWT.lock0(this.getNativeHandle()); 
           return  isLocked;
       }

       /**
        * Unlock this drawing surface after OpenGL Draw
        *
        */
       public boolean unlock() {
           isLocked = !JAWT.unlock0(getNativeHandle()); 
           return isLocked;
       }
       
       public boolean isLocked(){
           return isLocked;
       }

       /**
        * Release DrawingSurfaceInfo dsi.
        * Call it before release()
        * @see #getDrawingSurfaceInfo()
        * @see #release()
        * 
        * @param dsi
        * @return true if freeing dsi was success
        * 
        */
       public boolean freeDrawingSurfaceInfo(DrawingSurfaceInfo dsi) {
           boolean ret = JAWT.freeDrawingSurfaceInfo0(this.getNativeHandle(), dsi.getNativeHandle());
           dsi.release();
           return ret;
       }
       
       /**
        * Get DrawingSurfaceInfo related to this DS.<br> 
        * It calls lock() / unlock() before and after executing this method. 
        * 
        * @return
        */
       public DrawingSurfaceInfo getDrawingSurfaceInfo(){
           DrawingSurfaceInfo dsi=null;
           long dsiHandle = JAWT.getDrawingSurfaceInfo0(this.getNativeHandle());
           dsi = new DrawingSurfaceInfo(dsiHandle, awt, this);
           return  dsi;
       }
       
       /**
        * Release this DS.
        * DrawingSurfaceInfo related to this must be released *BEFORE* you call this method.
        * 
        */
       public void release(){
           freeDrawingSurfaceInfo(getDrawingSurfaceInfo());
           super.release();
           this.awt = null;
       }
       

   }//class
 
   /**
    * Our DrawingSurfaceInfo Wrapper
    * @author Alessandro Borges
    *
    */
   public static class DrawingSurfaceInfo extends ObjectHandler{
     
       private DrawingSurface ds;
       private JAWT awt;
       public boolean alwaysUpdate = true;
       
       /**
        * Index of EGLNativeDisplayType handler.
        */
       protected static final int EGLNativeDisplayType_index = 0;
       /**
        * Index of EGLNativePixmapType handler.
        */
       protected static final int EGLNativePixmapType_index = 1;
       /**
        * Index of EGLNativeWindowType handler.
        */
       protected static final int EGLNativeWindowType_index = 2;
       
       /**
        * <pre><font size="3">
        * This long array will store the handlers for some EGL types.
        *  Below are the corresponding native pointers:         
        *  #----------------------#------------#------------#  
        *  | EGL type             | Win32 type |  X11 unix  |
        *  |----------------------|------------|------------|    
        *  | EGLNativeDisplayType |   HDC      |  Display * |
        *  | EGLNativePixmapType  |   HBITMAP  |  Pixmap    |
        *  | EGLNativeWindowType  |   HWND     |  Window    |
        *  #----------------------#------------#------------# 
        *  
        *  #----------------------#---------------------#----------------------#  
        *  | EGL type             |     Android         |  Apple IOS MACOS     |
        *  |----------------------|---------------------|----------------------|    
        *  | EGLNativeDisplayType | ANativeWindow*      |  int                 |
        *  | EGLNativePixmapType  | egl_native_pixmap_t*|  void *              |
        *  | EGLNativeWindowType  | void*               |  appleEGLWindow *    |
        *  #----------------------#---------------------#----------------------#
        *   For IOS / Mac EGL handlers, 
        *   see https://github.com/alco/EGL_mac_ios/blob/master/include/EGL/eglplatform.h
        * </font> </pre>
        * 
        */
       private long[] egl_handlers = null;
       
       /**
        * the place holders for HWND and HDC
        */
       private long[] hwnd_hdc = new long[2];
       
       
       
       protected DrawingSurfaceInfo(int handle, JAWT awt, DrawingSurface ds) {
           super(handle);  
           this.awt = awt;
           this.ds = ds;
       }
       
       protected DrawingSurfaceInfo(long handle, JAWT awt, DrawingSurface ds) {
           super(handle);          
           this.awt = awt;
           this.ds = ds;
       }
       
      
       
       /**
        * <p> Get the native handler of <b>EGLNativeDisplayType.</p>
        * 
        * <pre><font size="3">
        * The EGL types varies for each paltform.
        *  Below are the corresponding native pointers:         
        *  #----------------------#------------#------------#  
        *  | EGL type             | Win32 type |  X11 unix  |
        *  |----------------------|------------|------------|    
        *  | EGLNativeDisplayType |   HDC      |  Display * |
        *  | EGLNativePixmapType  |   HBITMAP  |  Pixmap    |
        *  | EGLNativeWindowType  |   HWND     |  Window    |
        *  #----------------------#------------#------------# 
        *  
        *  #----------------------#---------------------#----------------------#  
        *  | EGL type             |     Android         |  Apple IOS MACOS     |
        *  |----------------------|---------------------|----------------------|    
        *  | EGLNativeDisplayType | ANativeWindow*      |  int                 |
        *  | EGLNativePixmapType  | egl_native_pixmap_t*|  void *              |
        *  | EGLNativeWindowType  | void*               |  appleEGLWindow *    |
        *  #----------------------#---------------------#----------------------#
        *   For IOS / Mac EGL handlers, 
        *   see https://github.com/alco/EGL_mac_ios/blob/master/include/EGL/eglplatform.h
        *   
        *  </font></pre>
        *      
        *   @return native handler of EGLNativeDisplayType
        */
       public long getEGLNativeDisplayType(){
           if(null == egl_handlers || alwaysUpdate){
               updateEGLhandlers();
           }
           return egl_handlers[EGLNativeDisplayType_index];
       }
       
       /**
        * Get the native handler of <b>EGLNativePixmapType</b>
        * <pre><font size="3">
        * The EGL types are the following.
        *  Below are the corresponding native pointers:         
        *  #----------------------#------------#------------#  
        *  | EGL type             | Win32 type |  X11 unix  |
        *  |----------------------|------------|------------|    
        *  | EGLNativeDisplayType |   HDC      |  Display * |
        *  | EGLNativePixmapType  |   HBITMAP  |  Pixmap    |
        *  | EGLNativeWindowType  |   HWND     |  Window    |
        *  #----------------------#------------#------------# 
        *  
        *  #----------------------#---------------------#----------------------#  
        *  | EGL type             |     Android         |  Apple IOS MACOS     |
        *  |----------------------|---------------------|----------------------|    
        *  | EGLNativeDisplayType | ANativeWindow*      |  int                 |
        *  | EGLNativePixmapType  | egl_native_pixmap_t*|  void *              |
        *  | EGLNativeWindowType  | void*               |  appleEGLWindow *    |
        *  #----------------------#---------------------#----------------------#
        *   For IOS / Mac EGL handlers, 
        *   see https://github.com/alco/EGL_mac_ios/blob/master/include/EGL/eglplatform.h
        * </font></pre>
        *      
        * @return nstive handler of EGLNativePixmapType
        */
       public long getEGLNativePixmapType(){
           if(null == egl_handlers|| alwaysUpdate){
               updateEGLhandlers();
           }
           return egl_handlers[EGLNativePixmapType_index];
       }
       
       /**
        * Get the native handler of <b>EGLNativeWindowType</b>
        * <pre><font size="3">
        * The EGL types are the following:      
        *  #----------------------#------------#------------#  
        *  | EGL type             | Win32 type |  X11 unix  |
        *  |----------------------|------------|------------|    
        *  | EGLNativeDisplayType |   HDC      |  Display * |
        *  | EGLNativePixmapType  |   HBITMAP  |  Pixmap    |
        *  | EGLNativeWindowType  |   HWND     |  Window    |
        *  #----------------------#------------#------------# 
        *  
        *  #----------------------#---------------------#----------------------#  
        *  | EGL type             |     Android         |  Apple IOS MACOS     |
        *  |----------------------|---------------------|----------------------|    
        *  | EGLNativeDisplayType | ANativeWindow*      |  int                 |
        *  | EGLNativePixmapType  | egl_native_pixmap_t*|  void *              |
        *  | EGLNativeWindowType  | void*               |  appleEGLWindow *    |
        *  #----------------------#---------------------#----------------------#
        *   For IOS / Mac EGL handlers, 
        *   see https://github.com/alco/EGL_mac_ios/blob/master/include/EGL/eglplatform.h
        * </font></pre>
        *      
        * @return nstive handler of EGLNativeWindowType
        */
       public long getEGLNativeWindowType(){
           if(null == egl_handlers || alwaysUpdate){
               updateEGLhandlers();
           }
           return egl_handlers[EGLNativeWindowType_index];
       }
       
        /**
         * update EGL native handlers.
         */
        private void updateEGLhandlers() {
            if (this.egl_handlers == null) {
                egl_handlers = new long[3];
            }
            boolean ok = JAWT.updateDSIEGLhandlers00(// awt.getAwtHandler(),
                    ds.getNativeHandle(), 
                    this.getNativeHandle(), 
                    egl_handlers);
            if (!ok) { 
                throw new RuntimeException("Native AWT error: unable to update native handlers."); 
                }
        }

        /**
         * get HWND
         * 
         * @return Window handler
         */
        public long getHWND() {
            if (JAWT.getHwndHdc(ds.getNativeHandle(), hwnd_hdc)) {
                return hwnd_hdc[0];
            } else {
                return 0L;
            }
        }

        /**
         * get HDC
         * 
         * @return HDC handler
         */
        public long getHDC() {
            if (JAWT.getHwndHdc(ds.getNativeHandle(), hwnd_hdc)) {
                return hwnd_hdc[1];
            } else {
                return 0;
            }
        }

        /**
         * Get native dimensions
         * 
         * @return native dimensions
         */
        public JAWT_Rectangle getRectangle() {
            JAWT_Rectangle rect = new JAWT_Rectangle();
            int[] val = new int[4];
            if (JAWT.getRectangle0(ds.getNativeHandle(), val)) {
                rect.x = val[0];
                rect.y = val[1];
                rect.width = val[2];
                rect.height = val[3];
            }
            return rect;
        }

        /**
         * return the DrawingSurface owner of this instance
         * 
         * @return DrawingSurface owner of this DSI
         */
        public DrawingSurface getDrawingSurface() {
            return this.ds;
        }

        protected void release() {
            super.release();
            this.ds = null;
            this.awt = null;           
            this.egl_handlers = null;

        }

    } // class DrawningSurfaceInfo

 
   @SuppressWarnings("serial")
   public static class JAWT_Rectangle extends java.awt.Rectangle{
 
      
      /* (non-Javadoc)
       * @see java.lang.Object#toString()
       */
      @Override
      public String toString() {
          StringBuilder builder = new StringBuilder();
          builder.append("JAWT_Rectangle [x=");
          builder.append(x);
          builder.append(", y=");
          builder.append(y);
          builder.append(", width=");
          builder.append(width);
          builder.append(", height=");
          builder.append(height);
          builder.append("]");
          return builder.toString();
      }

      public JAWT_Rectangle() {
          super();
      }

      public JAWT_Rectangle(int x, int y, int width, int height) {
          super(x, y, width, height);       
      }

      public JAWT_Rectangle(int width, int height) {
          super(width, height);       
      }

      public JAWT_Rectangle(Rectangle r) {
          super(r);
      }
      
  }// JAWT_Rectangle
 
}// class JAWT
 
/**
 * Class to wrap native pointers
 * @author Alessandro Borges
 *
 */
   abstract class ObjectHandler {
    private long mHandle;
   
    protected ObjectHandler(long handle) {
        mHandle = handle;
    }    
    
    /**
     * Returns the native handle of the wrapped This handle can be
     * cast to the corresponding native type on the native side.
     *
     * @return the native handle of the wrapped EGL object.
     */
    public final long getNativeHandle() {
        return mHandle;
    }    
       
    /**
     * Check if this Object is a NULL pointer.<br>
     * Valid objects will return false, but released objects will return true;
     * @return true if this resource is already released, i.e. a NULL pointer.
     */
    public final boolean isNull(){
        return mHandle==0;
    }
    
    /**
     * release native pointer.
     * After call, this objects becomes virtually NULL, i.e, isNull() return true.
     */
    protected void release(){
        this.mHandle = 0L;
    }
  } // class ObjectHandler


