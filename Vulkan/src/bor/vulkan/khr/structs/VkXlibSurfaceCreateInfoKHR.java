/**
 * Class wrapping Vulkan's VkXlibSurfaceCreateInfoKHR struct.
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
 *  This class is a Java front end for struct VkXlibSurfaceCreateInfoKHR. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkXlibSurfaceCreateInfoKHR {
 *     VkStructureType                sType;
 *     const void*                    pNext;
 *     VkXlibSurfaceCreateFlagsKHR    flags;
 *     Display*                       dpy;
 *     Window                         window;
 * } VkXlibSurfaceCreateInfoKHR;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.01 (beta) 
 */
public class VkXlibSurfaceCreateInfoKHR extends VkStruct {
	/** TAG of this structure [118]  */
	 private static final String TAG = "VkXlibSurfaceCreateInfoKHR";

	/** ID of this structure [118]  */
	 public static final int TAG_ID = VKXLIBSURFACECREATEINFOKHR_ID;

	/** P wrapper for THIS object */
	 private  P<VkXlibSurfaceCreateInfoKHR> p;

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
	 *  VkXlibSurfaceCreateFlagsKHR 	flags	[int]
	 */ 
	 int 	flags;

	/**
	 *  Display* 	dpy	[vkhandle]
	 */ 
	 XlibDisplay 	dpy;

	/**
	 *  Window 	window	[vkhandle]
	 */ 
	 XlibWindow 	window;

	/**
	 * Ctor
	 */
	public VkXlibSurfaceCreateInfoKHR(){ 
		 super(sizeOf()); 
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkXlibSurfaceCreateInfoKHR(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address and memSize
	 * @param address - native address 
	 * @param memSize - buffer size 
	 */
	 public VkXlibSurfaceCreateInfoKHR(long address, int memSize){ 
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
	 public static P<VkXlibSurfaceCreateInfoKHR> createNullPointer(){
	        P<VkXlibSurfaceCreateInfoKHR> p = new  P<VkXlibSurfaceCreateInfoKHR>(new VkXlibSurfaceCreateInfoKHR());
	        return p;
	    }


	/** 
	 * Return this VkObject instance wrapped in pointer P<br>
	 *
	 *  P&lt;? extends VkObject &gt;
	 *
	 * @return  a P container wrapping this object.
	 */
	 public P<VkXlibSurfaceCreateInfoKHR> getP() {
	       if(p == null ){
	           p = new P<VkXlibSurfaceCreateInfoKHR> (this);
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
	 * Prototype: VkXlibSurfaceCreateFlagsKHR  flags
	 */ 
	 public void flags(int flags){
		 this.flags = flags;
		 flags0(this.ptr,  flags);
	 }

	/**
	 * Get method for field flags	[int]<br>
	 * Prototype: VkXlibSurfaceCreateFlagsKHR  flags
	 */ 
	 public int flags(){
		 int var = flags0(super.ptr);
		 this.flags = var;
		 return this.flags;
	 }

	/**
	 * Set method for field dpy	[vkhandle]<br>
	 * Prototype: Display*  dpy
	 */ 
	 public void dpy(XlibDisplay dpy){
		 this.dpy = dpy;
		 ByteBuffer buff = (dpy==null) ? null : dpy.getHandle();
		 dpy0(this.ptr, buff);
	 }

	/**
	 * Get method for field dpy	[vkhandle]<br>
	 * Prototype: Display*  dpy
	 */ 
	 public XlibDisplay dpy(){

		 ByteBuffer handle = dpy0(super.ptr);
		 if(handle == null){
		    this.dpy = null;
		    return null;
		  } else 
 		 if(this.dpy == null){
		    this.dpy = new VkHandle(handle);
		 }else{
		    ((VkHandle)this.dpy).setHandle(handle);
		  }
		 return this.dpy;
	 }

	/**
	 * Set method for field window	[vkhandle]<br>
	 * Prototype: Window  window
	 */ 
	 public void window(XlibWindow window){
		 this.window = window;
		 ByteBuffer buff = (window==null) ? null : window.getHandle();
		 window0(this.ptr, buff);
	 }

	/**
	 * Get method for field window	[vkhandle]<br>
	 * Prototype: Window  window
	 */ 
	 public XlibWindow window(){

		 ByteBuffer handle = window0(super.ptr);
		 if(handle == null){
		    this.window = null;
		    return null;
		  } else 
 		 if(this.window == null){
		    this.window = new VkHandle(handle);
		 }else{
		    ((VkHandle)this.window).setHandle(handle);
		  }
		 return this.window;
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native void sType0(Buffer ptr, int  _sType);/*
		  VkXlibSurfaceCreateInfoKHR* vkObj = (VkXlibSurfaceCreateInfoKHR*)(ptr);
		  vkObj->sType = (VkStructureType) (_sType);
	  */

	/**
	 * native GET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native int  sType0(Buffer ptr);/*
		  VkXlibSurfaceCreateInfoKHR vkObj = (VkXlibSurfaceCreateInfoKHR*)(ptr);
		  return (VkStructureType) (vkObj->sType);
	 */

	/**
	 * native SET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native void pNext0(Buffer ptr, java.nio.ByteBuffer  _pNext);/*
		  VkXlibSurfaceCreateInfoKHR* vkObj = (VkXlibSurfaceCreateInfoKHR*)(ptr);
		  vkObj->pNext = (const void*) (_pNext);
	  */

	/**
	 * native GET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native java.nio.ByteBuffer  pNext0(Buffer ptr);/*
		  VkXlibSurfaceCreateInfoKHR vkObj = (VkXlibSurfaceCreateInfoKHR*)(ptr);
		  return (VkObject) (vkObj->pNext);
	 */

	/**
	 * native SET method for field flags	[int]<br>
	 * Prototype: VkXlibSurfaceCreateFlagsKHR  flags
	 */ 
	 private static native void flags0(Buffer ptr, int _flags);/*
		  VkXlibSurfaceCreateInfoKHR* vkObj = (VkXlibSurfaceCreateInfoKHR*)(ptr);
		  vkObj->flags = (VkXlibSurfaceCreateFlagsKHR) (_flags);
	  */

	/**
	 * native GET method for field flags	[int]<br>
	 * Prototype: VkXlibSurfaceCreateFlagsKHR  flags
	 */ 
	 private static native int flags0(Buffer ptr);/*
		  VkXlibSurfaceCreateInfoKHR vkObj = (VkXlibSurfaceCreateInfoKHR*)(ptr);
		  return (jint) (vkObj->flags);
	 */

	/**
	 * native SET method for field dpy	[vkhandle]<br>
	 * Prototype: Display*  dpy
	 */ 
	 private static native void dpy0(Buffer ptr, java.nio.ByteBuffer  _dpy);/*
		  VkXlibSurfaceCreateInfoKHR* vkObj = (VkXlibSurfaceCreateInfoKHR*)(ptr);
		  vkObj->dpy = (Display*) (_dpy);
	  */

	/**
	 * native GET method for field dpy	[vkhandle]<br>
	 * Prototype: Display*  dpy
	 */ 
	 private static native java.nio.ByteBuffer  dpy0(Buffer ptr);/*
		  VkXlibSurfaceCreateInfoKHR vkObj = (VkXlibSurfaceCreateInfoKHR*)(ptr);
		  return (XlibDisplay) (vkObj->dpy);
	 */

	/**
	 * native SET method for field window	[vkhandle]<br>
	 * Prototype: Window  window
	 */ 
	 private static native void window0(Buffer ptr, java.nio.ByteBuffer  _window);/*
		  VkXlibSurfaceCreateInfoKHR* vkObj = (VkXlibSurfaceCreateInfoKHR*)(ptr);
		  vkObj->window = (Window) (_window);
	  */

	/**
	 * native GET method for field window	[vkhandle]<br>
	 * Prototype: Window  window
	 */ 
	 private static native java.nio.ByteBuffer  window0(Buffer ptr);/*
		  VkXlibSurfaceCreateInfoKHR vkObj = (VkXlibSurfaceCreateInfoKHR*)(ptr);
		  return (XlibWindow) (vkObj->window);
	 */



} // end of class VkXlibSurfaceCreateInfoKHR
