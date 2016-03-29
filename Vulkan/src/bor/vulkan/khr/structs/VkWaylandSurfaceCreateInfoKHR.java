/**
 * Class wrapping Vulkan's VkWaylandSurfaceCreateInfoKHR struct.
 * 
 * Bor_Vulkan Project Ver. 0.8.01 (beta)
 * Licence terms: 
 * The MIT License (MIT)
 * Copyright (c) 2016 Alessandro Borges
 * See https://opensource.org/licenses/MIT 
 */
package bor.vulkan.khr.structs;

import bor.vulkan.*;
import bor.vulkan.enumerations.*;
import bor.vulkan.structs.*;
import bor.vulkan.khr.*;
import java.nio.ByteBuffer;

import java.nio.Buffer;


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
 * @version Ver. 0.8.01 (beta) 
 */
public class VkWaylandSurfaceCreateInfoKHR extends VkStruct {
	/** TAG of this structure [120]  */
	 private static final String TAG = "VkWaylandSurfaceCreateInfoKHR";

	/** ID of this structure [120]  */
	 public static final int TAG_ID = VKWAYLANDSURFACECREATEINFOKHR_ID;

	/** P wrapper for THIS object */
	 private  P<VkWaylandSurfaceCreateInfoKHR> p;

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
		 super(sizeOf()); 
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkWaylandSurfaceCreateInfoKHR(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address and memSize
	 * @param address - native address 
	 * @param memSize - buffer size 
	 */
	 public VkWaylandSurfaceCreateInfoKHR(long address, int memSize){ 
		 super(address, memSize); 
	 }

	/** 
	 * Method to get native size of this structure 
	 */
	 public static int sizeOf(){ 
		 return sizeOf(TAG_ID); 
	}


	/**
	 * Create a pointer P to contain a instance of this,
	 * with clean native pointer.<br>
	 * You can use {@link VkStruct#setPointer(ByteBuffer)} to set a new 
	 * native pointer.
	 * @return An instance of P for this VkStruct with null pointer
	 */
	 public static P<VkWaylandSurfaceCreateInfoKHR> createNullPointer(){
	        P<VkWaylandSurfaceCreateInfoKHR> p = new  P<VkWaylandSurfaceCreateInfoKHR>(new VkWaylandSurfaceCreateInfoKHR());
	        return p;
	    }


	/** 
	 * Return this VkObject instance wrapped in pointer P<br>
	 *
	 *  P&lt;? extends VkObject &gt;
	 *
	 * @return  a P container wrapping this object.
	 */
	 public P<VkWaylandSurfaceCreateInfoKHR> getP() {
	       if(p == null ){
	           p = new P<VkWaylandSurfaceCreateInfoKHR> (this);
	       }
	        return p;
	    }


	 ////////////////////////
	 //  SETTERS & GETTERS //
	 ////////////////////////

	/**
	 * Set method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 public void sType(VkStructureType sType){
		 this.sType = sType;
		 int enumVal = sType.getValue();
		 sType0(this.ptr, enumVal );
	 }

	/**
	 * Get method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 public VkStructureType sType(){
		 int nativeVal = sType0(super.ptr);
		 this.sType = VkStructureType.fromValue(nativeVal); 
		 return this.sType;
	 }

	/**
	 * Set method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 public void pNext(VkObject pNext){
		 this.pNext = pNext;
		 ByteBuffer buff = (pNext==null) ? null : pNext.getPointer();
		 pNext0(this.ptr, buff);
	 }

	/**
	 * Get method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 public VkObject pNext(){
		 ByteBuffer pointer = pNext0(super.ptr);
		 if(pointer == null){
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
	 */ 
	 public void flags(int flags){
		 this.flags = flags;
		 flags0(this.ptr,  flags);
	 }

	/**
	 * Get method for field flags	[int]<br>
	 * Prototype: VkWaylandSurfaceCreateFlagsKHR  flags
	 */ 
	 public int flags(){
		 int var = flags0(super.ptr);
		 this.flags = var;
		 return this.flags;
	 }

	/**
	 * Set method for field display	[vkhandle]<br>
	 * Prototype: struct wl_display*  display
	 */ 
	 public void display(WlDisplay display){
		 this.display = display;
		 ByteBuffer buff = (display==null) ? null : display.getHandle();
		 display0(this.ptr, buff);
	 }

	/**
	 * Get method for field display	[vkhandle]<br>
	 * Prototype: struct wl_display*  display
	 */ 
	 public WlDisplay display(){

		 ByteBuffer handle = display0(super.ptr);
		 if(handle == null){
		    this.display = null;
		    return null;
		  } else 
 		 if(this.display == null){
		    this.display = new VkHandle(handle);
		 }else{
		    ((VkHandle)this.display).setHandle(handle);
		  }
		 return this.display;
	 }

	/**
	 * Set method for field surface	[vkhandle]<br>
	 * Prototype: struct wl_surface*  surface
	 */ 
	 public void surface(WlSurface surface){
		 this.surface = surface;
		 ByteBuffer buff = (surface==null) ? null : surface.getHandle();
		 surface0(this.ptr, buff);
	 }

	/**
	 * Get method for field surface	[vkhandle]<br>
	 * Prototype: struct wl_surface*  surface
	 */ 
	 public WlSurface surface(){

		 ByteBuffer handle = surface0(super.ptr);
		 if(handle == null){
		    this.surface = null;
		    return null;
		  } else 
 		 if(this.surface == null){
		    this.surface = new VkHandle(handle);
		 }else{
		    ((VkHandle)this.surface).setHandle(handle);
		  }
		 return this.surface;
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native void sType0(Buffer ptr, int  _sType);/*
		  VkWaylandSurfaceCreateInfoKHR* vkObj = (VkWaylandSurfaceCreateInfoKHR*)(ptr);
		  vkObj->sType = (VkStructureType) (_sType);
	  */

	/**
	 * native GET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native int  sType0(Buffer ptr);/*
		  VkWaylandSurfaceCreateInfoKHR vkObj = (VkWaylandSurfaceCreateInfoKHR*)(ptr);
		  return (VkStructureType) (vkObj->sType);
	 */

	/**
	 * native SET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native void pNext0(Buffer ptr, java.nio.ByteBuffer  _pNext);/*
		  VkWaylandSurfaceCreateInfoKHR* vkObj = (VkWaylandSurfaceCreateInfoKHR*)(ptr);
		  vkObj->pNext = (const void*) (_pNext);
	  */

	/**
	 * native GET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native java.nio.ByteBuffer  pNext0(Buffer ptr);/*
		  VkWaylandSurfaceCreateInfoKHR vkObj = (VkWaylandSurfaceCreateInfoKHR*)(ptr);
		  return (VkObject) (vkObj->pNext);
	 */

	/**
	 * native SET method for field flags	[int]<br>
	 * Prototype: VkWaylandSurfaceCreateFlagsKHR  flags
	 */ 
	 private static native void flags0(Buffer ptr, int _flags);/*
		  VkWaylandSurfaceCreateInfoKHR* vkObj = (VkWaylandSurfaceCreateInfoKHR*)(ptr);
		  vkObj->flags = (VkWaylandSurfaceCreateFlagsKHR) (_flags);
	  */

	/**
	 * native GET method for field flags	[int]<br>
	 * Prototype: VkWaylandSurfaceCreateFlagsKHR  flags
	 */ 
	 private static native int flags0(Buffer ptr);/*
		  VkWaylandSurfaceCreateInfoKHR vkObj = (VkWaylandSurfaceCreateInfoKHR*)(ptr);
		  return (jint) (vkObj->flags);
	 */

	/**
	 * native SET method for field display	[vkhandle]<br>
	 * Prototype: struct wl_display*  display
	 */ 
	 private static native void display0(Buffer ptr, java.nio.ByteBuffer  _display);/*
		  VkWaylandSurfaceCreateInfoKHR* vkObj = (VkWaylandSurfaceCreateInfoKHR*)(ptr);
		  vkObj->display = (struct wl_display*) (_display);
	  */

	/**
	 * native GET method for field display	[vkhandle]<br>
	 * Prototype: struct wl_display*  display
	 */ 
	 private static native java.nio.ByteBuffer  display0(Buffer ptr);/*
		  VkWaylandSurfaceCreateInfoKHR vkObj = (VkWaylandSurfaceCreateInfoKHR*)(ptr);
		  return (WlDisplay) (vkObj->display);
	 */

	/**
	 * native SET method for field surface	[vkhandle]<br>
	 * Prototype: struct wl_surface*  surface
	 */ 
	 private static native void surface0(Buffer ptr, java.nio.ByteBuffer  _surface);/*
		  VkWaylandSurfaceCreateInfoKHR* vkObj = (VkWaylandSurfaceCreateInfoKHR*)(ptr);
		  vkObj->surface = (struct wl_surface*) (_surface);
	  */

	/**
	 * native GET method for field surface	[vkhandle]<br>
	 * Prototype: struct wl_surface*  surface
	 */ 
	 private static native java.nio.ByteBuffer  surface0(Buffer ptr);/*
		  VkWaylandSurfaceCreateInfoKHR vkObj = (VkWaylandSurfaceCreateInfoKHR*)(ptr);
		  return (WlSurface) (vkObj->surface);
	 */



} // end of class VkWaylandSurfaceCreateInfoKHR
