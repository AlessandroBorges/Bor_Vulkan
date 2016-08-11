/**
 * Class wrapping Vulkan's VkWaylandSurfaceCreateInfoKHR struct.
 * 
 * Bor_Vulkan Project Ver. 0.8.65 (beta)
 * Licence terms: 
 * The MIT License (MIT)
 * Copyright (c) 2016 Alessandro Borges
 * See https://opensource.org/licenses/MIT 
 */
 package bor.vulkan.structs;

 import bor.util.*;
 import bor.vulkan.*;
 import static bor.vulkan.Vulkan.*; 
 import bor.vulkan.enumerations.*;

 import java.util.*;
 import java.nio.*;


/**
 *  Project Bor-Vulkan 
 *  Class for Java-Vulkan integration 
 *  This class is a Java front end for struct VkWaylandSurfaceCreateInfoKHR. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkWaylandSurfaceCreateInfoKHR {
 *     VkStructureType                   sType;
 *     const void*                       pNext;
 *     VkWaylandSurfaceCreateFlagsKHR    flags;
 *     struct wl_display*                display;
 *     struct wl_surface*                surface;
 * } VkWaylandSurfaceCreateInfoKHR;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.65 (beta) 
 */
 public class VkWaylandSurfaceCreateInfoKHR extends VkStruct {

    //@formatter:off
    /*JNI
    #include <BorVulkan.hpp>
    */  

	/** TAG of this structure [120]  */
	 private static final String TAG = "VkWaylandSurfaceCreateInfoKHR";

	/** ID of this structure [120]  */
	 public static final int TAG_ID = VKWAYLANDSURFACECREATEINFOKHR_ID;

	 ///////////////////
	 // Struct fields //
	 ///////////////////
	
	/**
	 *  VkStructureType 	sType	[vkenum]
	 */ 
	VkStructureType 	sType;
	
	/**
	 *  const void* 	pNext	[vkobject]
	 */ 
	VkObject 	pNext;
	
	/**
	 *  VkWaylandSurfaceCreateFlagsKHR 	flags	[int]
	 */ 
	int 	flags;
	
	/**
	 *  struct wl_display* 	display	[vkhandle]
	 */ 
	WlDisplay 	display;
	
	/**
	 *  struct wl_surface* 	surface	[vkhandle]
	 */ 
	WlSurface 	surface;
	/**
	 * Ctor
	 */
	public VkWaylandSurfaceCreateInfoKHR(){ 
		 super(TAG_ID);
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkWaylandSurfaceCreateInfoKHR(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address only. Size guessed by #sizeof()
	 * @param address - native address 
	 */
	 public VkWaylandSurfaceCreateInfoKHR(long address){ 
		 super(address); 
	 }

	/** 
	 * Static Method to get native size of this structure 
	 */
	 public static int sizeOf(){ 
		 return sizeOf(TAG_ID); 
	}

	/** 
	 * Method to get native size of this structure 
	 */
	 @Override
	 public int getSizeBytes(){ 
		 return sizeOf(); 
	}

	/** 
	 * Get ID of this structure 
	 */
	 public static int getID(){ 
		 return TAG_ID; 
	}

	 ////////////////////////
	 //  SETTERS & GETTERS //
	 ////////////////////////

	/**
	 * Set method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 * 
	 * @param sType - a instance of VkStructureType.
	 * @return this VkStruct instance.
	 */ 
	 public VkWaylandSurfaceCreateInfoKHR sType(VkStructureType sType){
		 this.sType = sType;
		 int enumVal = sType.getValue();
		 setSType0(this.ptr, enumVal );
		 return this;
	 }

	/**
	 * Get method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 public VkStructureType sType(){
		 int nativeVal = getSType0(super.ptr);
		 this.sType = VkStructureType.fromValue(nativeVal); 
		 return this.sType;
	 }

	/**
	 * Set method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 * 
	 * @param pNext - a instance of VkObject.
	 * @return this VkStruct instance.
	 */ 
	 public VkWaylandSurfaceCreateInfoKHR pNext(VkObject pNext){
		 this.pNext = pNext;
		 ByteBuffer buff = (pNext==null) ? null : pNext.getPointer();
		 setPNext0(this.ptr, buff);
		 return this;
	 }

	/**
	 * Get method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 public VkObject pNext(){
		 long pointer = getPNext0(super.ptr);
		 if(pointer == 0){
		    this.pNext = null;
		    return null;
		  } else 
		 if(this.pNext == null){
		    this.pNext = (VkObject)(new VkHandle(pointer));
		 }else{
		    this.pNext.setPointer(pointer);
		  }
		 return this.pNext;
	 }

	/**
	 * Set method for field flags	[int]<br>
	 * Prototype: VkWaylandSurfaceCreateFlagsKHR  flags
	 * 
	 * @param flags - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkWaylandSurfaceCreateInfoKHR flags(int flags){
		 this.flags = flags;
		 setFlags0(this.ptr,  flags);
		 return this;
	 }

	/**
	 * Get method for field flags	[int]<br>
	 * Prototype: VkWaylandSurfaceCreateFlagsKHR  flags
	 */ 
	 public int flags(){
		 int var = getFlags0(super.ptr);
		 this.flags = var;
		 return this.flags;
	 }

	/**
	 * Set method for field display	[vkhandle]<br>
	 * Prototype: struct wl_display*  display
	 * 
	 * @param display - a instance of WlDisplay.
	 * @return this VkStruct instance.
	 */ 
	 public VkWaylandSurfaceCreateInfoKHR display(WlDisplay display){
		 this.display = display;
		 long handle = (display==null) ? 0L : display.getNativeHandle();
		 setDisplay0(this.ptr, handle);
		 return this;
	 }

	/**
	 * Get method for field display	[vkhandle]<br>
	 * Prototype: struct wl_display*  display
	 */ 
	 public WlDisplay display(){

		 long handle = getDisplay0(super.ptr);
		 if(handle == 0){
		    this.display = null;
		    return null;
		  }  

		 if(this.display == null){
		    this.display = new VkHandle(handle);
		 }else{
		    ((VkHandle)this.display).setNativeHandle(handle);
		  }
		 return this.display;
	 }

	/**
	 * Set method for field surface	[vkhandle]<br>
	 * Prototype: struct wl_surface*  surface
	 * 
	 * @param surface - a instance of WlSurface.
	 * @return this VkStruct instance.
	 */ 
	 public VkWaylandSurfaceCreateInfoKHR surface(WlSurface surface){
		 this.surface = surface;
		 long handle = (surface==null) ? 0L : surface.getNativeHandle();
		 setSurface0(this.ptr, handle);
		 return this;
	 }

	/**
	 * Get method for field surface	[vkhandle]<br>
	 * Prototype: struct wl_surface*  surface
	 */ 
	 public WlSurface surface(){

		 long handle = getSurface0(super.ptr);
		 if(handle == 0){
		    this.surface = null;
		    return null;
		  }  

		 if(this.surface == null){
		    this.surface = new VkHandle(handle);
		 }else{
		    ((VkHandle)this.surface).setNativeHandle(handle);
		  }
		 return this.surface;
	 }


   /* (non-Javadoc)
    * @see java.lang.Object#toString()
    */
    @Override
    public String toString() {
         StringBuilder builder = new StringBuilder();
         builder.append("VkWaylandSurfaceCreateInfoKHR [ ")
				.append("sType: ").append(sType() )
				.append(",\n pNext: ")
				.append(pNext() )
				.append(",\n flags: ")
				.append(flags() )
				.append(",\n display: ")
				.append(display() )
				.append(",\n surface: ")
				.append(surface() )
				.append("]");
		 return builder.toString();
    }


	 //////////////////////////////////
	 // Native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * Native SET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native void setSType0(Buffer ptr, int  _sType);/*
	 #ifdef VK_USE_PLATFORM_WAYLAND_KHR 
		  VkWaylandSurfaceCreateInfoKHR* vkObj = (VkWaylandSurfaceCreateInfoKHR*)(ptr);
		 // code for simple past value 
		  vkObj->sType = (VkStructureType) (_sType);
	 #endif 
	  */

	/**
	 * Native GET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native int  getSType0(Buffer ptr);/*
	 #ifdef VK_USE_PLATFORM_WAYLAND_KHR 
		  VkWaylandSurfaceCreateInfoKHR* vkObj = (VkWaylandSurfaceCreateInfoKHR*)(ptr);
		  return (VkStructureType) (vkObj->sType);
	 #else 
	   return 0; 
	 #endif 
	 */

	/**
	 * Native SET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native void setPNext0(Buffer ptr, java.nio.ByteBuffer  _pNext);/*
	 #ifdef VK_USE_PLATFORM_WAYLAND_KHR 
		  VkWaylandSurfaceCreateInfoKHR* vkObj = (VkWaylandSurfaceCreateInfoKHR*)(ptr);
		 // code for Buffer - referenced by ptr
		  vkObj->pNext = (const void*) (_pNext);
	 #endif 
	  */

	/**
	 * Native GET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native long getPNext0(Buffer ptr);/*
	 #ifdef VK_USE_PLATFORM_WAYLAND_KHR 
		  VkWaylandSurfaceCreateInfoKHR* vkObj = (VkWaylandSurfaceCreateInfoKHR*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->pNext);
	 #else 
	   return 0; 
	 #endif 
	 */

	/**
	 * Native SET method for field flags	[int]<br>
	 * Prototype: VkWaylandSurfaceCreateFlagsKHR  flags
	 */ 
	 private static native void setFlags0(Buffer ptr, int _flags);/*
	 #ifdef VK_USE_PLATFORM_WAYLAND_KHR 
		  VkWaylandSurfaceCreateInfoKHR* vkObj = (VkWaylandSurfaceCreateInfoKHR*)(ptr);
		 // code for simple past value 
		  vkObj->flags = (VkWaylandSurfaceCreateFlagsKHR) (_flags);
	 #endif 
	  */

	/**
	 * Native GET method for field flags	[int]<br>
	 * Prototype: VkWaylandSurfaceCreateFlagsKHR  flags
	 */ 
	 private static native int getFlags0(Buffer ptr);/*
	 #ifdef VK_USE_PLATFORM_WAYLAND_KHR 
		  VkWaylandSurfaceCreateInfoKHR* vkObj = (VkWaylandSurfaceCreateInfoKHR*)(ptr);
		  return (jint) (vkObj->flags);
	 #else 
	   return 0; 
	 #endif 
	 */

	/**
	 * Native SET method for field display	[vkhandle]<br>
	 * Prototype: struct wl_display*  display
	 */ 
	 private static native void setDisplay0(Buffer ptr, long  _display);/*
	 #ifdef VK_USE_PLATFORM_WAYLAND_KHR 
		  VkWaylandSurfaceCreateInfoKHR* vkObj = (VkWaylandSurfaceCreateInfoKHR*)(ptr);
		 // code for simple past value 
		  vkObj->display = (struct wl_display*) (_display);
	 #endif 
	  */

	/**
	 * Native GET method for field display	[vkhandle]<br>
	 * Prototype: struct wl_display*  display
	 */ 
	 private static native long getDisplay0(Buffer ptr);/*
	 #ifdef VK_USE_PLATFORM_WAYLAND_KHR 
		  VkWaylandSurfaceCreateInfoKHR* vkObj = (VkWaylandSurfaceCreateInfoKHR*)(ptr);
		  // generic get for struct field of type  VkHandle or VkStruct 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->display);
	 #else 
	   return 0; 
	 #endif 
	 */

	/**
	 * Native SET method for field surface	[vkhandle]<br>
	 * Prototype: struct wl_surface*  surface
	 */ 
	 private static native void setSurface0(Buffer ptr, long  _surface);/*
	 #ifdef VK_USE_PLATFORM_WAYLAND_KHR 
		  VkWaylandSurfaceCreateInfoKHR* vkObj = (VkWaylandSurfaceCreateInfoKHR*)(ptr);
		 // code for simple past value 
		  vkObj->surface = (struct wl_surface*) (_surface);
	 #endif 
	  */

	/**
	 * Native GET method for field surface	[vkhandle]<br>
	 * Prototype: struct wl_surface*  surface
	 */ 
	 private static native long getSurface0(Buffer ptr);/*
	 #ifdef VK_USE_PLATFORM_WAYLAND_KHR 
		  VkWaylandSurfaceCreateInfoKHR* vkObj = (VkWaylandSurfaceCreateInfoKHR*)(ptr);
		  // generic get for struct field of type  VkHandle or VkStruct 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->surface);
	 #else 
	   return 0; 
	 #endif 
	 */



} // end of class VkWaylandSurfaceCreateInfoKHR
