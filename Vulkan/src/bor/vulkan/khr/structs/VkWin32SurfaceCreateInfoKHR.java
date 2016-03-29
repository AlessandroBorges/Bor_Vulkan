/**
 * Class wrapping Vulkan's VkWin32SurfaceCreateInfoKHR struct.
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
 *  This class is a Java front end for struct VkWin32SurfaceCreateInfoKHR. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkWin32SurfaceCreateInfoKHR {
 *     VkStructureType                 sType;
 *     const void*                     pNext;
 *     VkWin32SurfaceCreateFlagsKHR    flags;
 *     HINSTANCE                       hinstance;
 *     HWND                            hwnd;
 * } VkWin32SurfaceCreateInfoKHR;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.01 (beta) 
 */
public class VkWin32SurfaceCreateInfoKHR extends VkStruct {
	/** TAG of this structure [123]  */
	 private static final String TAG = "VkWin32SurfaceCreateInfoKHR";

	/** ID of this structure [123]  */
	 public static final int TAG_ID = VKWIN32SURFACECREATEINFOKHR_ID;

	/** P wrapper for THIS object */
	 private  P<VkWin32SurfaceCreateInfoKHR> p;

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
	 *  VkWin32SurfaceCreateFlagsKHR 	flags	[int]
	 */ 
	 int 	flags;

	/**
	 *  HINSTANCE 	hinstance	[vkhandle]
	 */ 
	 Win32HINSTANCE 	hinstance;

	/**
	 *  HWND 	hwnd	[vkhandle]
	 */ 
	 Win32HWND 	hwnd;

	/**
	 * Ctor
	 */
	public VkWin32SurfaceCreateInfoKHR(){ 
		 super(sizeOf()); 
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkWin32SurfaceCreateInfoKHR(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address and memSize
	 * @param address - native address 
	 * @param memSize - buffer size 
	 */
	 public VkWin32SurfaceCreateInfoKHR(long address, int memSize){ 
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
	 public static P<VkWin32SurfaceCreateInfoKHR> createNullPointer(){
	        P<VkWin32SurfaceCreateInfoKHR> p = new  P<VkWin32SurfaceCreateInfoKHR>(new VkWin32SurfaceCreateInfoKHR());
	        return p;
	    }


	/** 
	 * Return this VkObject instance wrapped in pointer P<br>
	 *
	 *  P&lt;? extends VkObject &gt;
	 *
	 * @return  a P container wrapping this object.
	 */
	 public P<VkWin32SurfaceCreateInfoKHR> getP() {
	       if(p == null ){
	           p = new P<VkWin32SurfaceCreateInfoKHR> (this);
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
	 * Prototype: VkWin32SurfaceCreateFlagsKHR  flags
	 */ 
	 public void flags(int flags){
		 this.flags = flags;
		 flags0(this.ptr,  flags);
	 }

	/**
	 * Get method for field flags	[int]<br>
	 * Prototype: VkWin32SurfaceCreateFlagsKHR  flags
	 */ 
	 public int flags(){
		 int var = flags0(super.ptr);
		 this.flags = var;
		 return this.flags;
	 }

	/**
	 * Set method for field hinstance	[vkhandle]<br>
	 * Prototype: HINSTANCE  hinstance
	 */ 
	 public void hinstance(Win32HINSTANCE hinstance){
		 this.hinstance = hinstance;
		 ByteBuffer buff = (hinstance==null) ? null : hinstance.getHandle();
		 hinstance0(this.ptr, buff);
	 }

	/**
	 * Get method for field hinstance	[vkhandle]<br>
	 * Prototype: HINSTANCE  hinstance
	 */ 
	 public Win32HINSTANCE hinstance(){

		 ByteBuffer handle = hinstance0(super.ptr);
		 if(handle == null){
		    this.hinstance = null;
		    return null;
		  } else 
 		 if(this.hinstance == null){
		    this.hinstance = new VkHandle(handle);
		 }else{
		    ((VkHandle)this.hinstance).setHandle(handle);
		  }
		 return this.hinstance;
	 }

	/**
	 * Set method for field hwnd	[vkhandle]<br>
	 * Prototype: HWND  hwnd
	 */ 
	 public void hwnd(Win32HWND hwnd){
		 this.hwnd = hwnd;
		 ByteBuffer buff = (hwnd==null) ? null : hwnd.getHandle();
		 hwnd0(this.ptr, buff);
	 }

	/**
	 * Get method for field hwnd	[vkhandle]<br>
	 * Prototype: HWND  hwnd
	 */ 
	 public Win32HWND hwnd(){

		 ByteBuffer handle = hwnd0(super.ptr);
		 if(handle == null){
		    this.hwnd = null;
		    return null;
		  } else 
 		 if(this.hwnd == null){
		    this.hwnd = new VkHandle(handle);
		 }else{
		    ((VkHandle)this.hwnd).setHandle(handle);
		  }
		 return this.hwnd;
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native void sType0(Buffer ptr, int  _sType);/*
		  VkWin32SurfaceCreateInfoKHR* vkObj = (VkWin32SurfaceCreateInfoKHR*)(ptr);
		  vkObj->sType = (VkStructureType) (_sType);
	  */

	/**
	 * native GET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native int  sType0(Buffer ptr);/*
		  VkWin32SurfaceCreateInfoKHR vkObj = (VkWin32SurfaceCreateInfoKHR*)(ptr);
		  return (VkStructureType) (vkObj->sType);
	 */

	/**
	 * native SET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native void pNext0(Buffer ptr, java.nio.ByteBuffer  _pNext);/*
		  VkWin32SurfaceCreateInfoKHR* vkObj = (VkWin32SurfaceCreateInfoKHR*)(ptr);
		  vkObj->pNext = (const void*) (_pNext);
	  */

	/**
	 * native GET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native java.nio.ByteBuffer  pNext0(Buffer ptr);/*
		  VkWin32SurfaceCreateInfoKHR vkObj = (VkWin32SurfaceCreateInfoKHR*)(ptr);
		  return (VkObject) (vkObj->pNext);
	 */

	/**
	 * native SET method for field flags	[int]<br>
	 * Prototype: VkWin32SurfaceCreateFlagsKHR  flags
	 */ 
	 private static native void flags0(Buffer ptr, int _flags);/*
		  VkWin32SurfaceCreateInfoKHR* vkObj = (VkWin32SurfaceCreateInfoKHR*)(ptr);
		  vkObj->flags = (VkWin32SurfaceCreateFlagsKHR) (_flags);
	  */

	/**
	 * native GET method for field flags	[int]<br>
	 * Prototype: VkWin32SurfaceCreateFlagsKHR  flags
	 */ 
	 private static native int flags0(Buffer ptr);/*
		  VkWin32SurfaceCreateInfoKHR vkObj = (VkWin32SurfaceCreateInfoKHR*)(ptr);
		  return (jint) (vkObj->flags);
	 */

	/**
	 * native SET method for field hinstance	[vkhandle]<br>
	 * Prototype: HINSTANCE  hinstance
	 */ 
	 private static native void hinstance0(Buffer ptr, java.nio.ByteBuffer  _hinstance);/*
		  VkWin32SurfaceCreateInfoKHR* vkObj = (VkWin32SurfaceCreateInfoKHR*)(ptr);
		  vkObj->hinstance = (HINSTANCE) (_hinstance);
	  */

	/**
	 * native GET method for field hinstance	[vkhandle]<br>
	 * Prototype: HINSTANCE  hinstance
	 */ 
	 private static native java.nio.ByteBuffer  hinstance0(Buffer ptr);/*
		  VkWin32SurfaceCreateInfoKHR vkObj = (VkWin32SurfaceCreateInfoKHR*)(ptr);
		  return (Win32HINSTANCE) (vkObj->hinstance);
	 */

	/**
	 * native SET method for field hwnd	[vkhandle]<br>
	 * Prototype: HWND  hwnd
	 */ 
	 private static native void hwnd0(Buffer ptr, java.nio.ByteBuffer  _hwnd);/*
		  VkWin32SurfaceCreateInfoKHR* vkObj = (VkWin32SurfaceCreateInfoKHR*)(ptr);
		  vkObj->hwnd = (HWND) (_hwnd);
	  */

	/**
	 * native GET method for field hwnd	[vkhandle]<br>
	 * Prototype: HWND  hwnd
	 */ 
	 private static native java.nio.ByteBuffer  hwnd0(Buffer ptr);/*
		  VkWin32SurfaceCreateInfoKHR vkObj = (VkWin32SurfaceCreateInfoKHR*)(ptr);
		  return (Win32HWND) (vkObj->hwnd);
	 */



} // end of class VkWin32SurfaceCreateInfoKHR
