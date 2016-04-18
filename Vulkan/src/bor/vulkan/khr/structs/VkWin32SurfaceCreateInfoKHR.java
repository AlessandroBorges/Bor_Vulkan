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

    //@formatter:off
    /*JNI
    #include <BorVulkan.hpp>
    */  

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
	 public VkWin32SurfaceCreateInfoKHR(long address , int memSize){ 
		 super(address, memSize); 
	 }

	/**
	 * Ctor with Address only. Size guessed by #sizeof()
	 * @param address - native address 
	 */
	 public VkWin32SurfaceCreateInfoKHR(long address){ 
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
		 setSType0(this.ptr, enumVal );
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
	 */ 
	 public void pNext(VkObject pNext){
		 this.pNext = pNext;
		 ByteBuffer buff = (pNext==null) ? null : pNext.getPointer();
		 setPNext0(this.ptr, buff);
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
	 * Prototype: VkWin32SurfaceCreateFlagsKHR  flags
	 */ 
	 public void flags(int flags){
		 this.flags = flags;
		 setFlags0(this.ptr,  flags);
	 }

	/**
	 * Get method for field flags	[int]<br>
	 * Prototype: VkWin32SurfaceCreateFlagsKHR  flags
	 */ 
	 public int flags(){
		 int var = getFlags0(super.ptr);
		 this.flags = var;
		 return this.flags;
	 }

	/**
	 * Set method for field hinstance	[vkhandle]<br>
	 * Prototype: HINSTANCE  hinstance
	 */ 
	 public void hinstance(Win32HINSTANCE hinstance){
		 this.hinstance = hinstance;
		 ByteBuffer buff = (hinstance==null) ? null : hinstance.getPointer();
		 setHinstance0(this.ptr, buff);
	 }

	/**
	 * Get method for field hinstance	[vkhandle]<br>
	 * Prototype: HINSTANCE  hinstance
	 */ 
	 public Win32HINSTANCE hinstance(){

		 long handle = getHinstance0(super.ptr);
		 if(handle == 0){
		    this.hinstance = null;
		    return null;
		  }  

		 if(this.hinstance == null){
		    this.hinstance = new VkHandle(handle);
		 }else{
		    ((VkHandle)this.hinstance).setPointer(handle);
		  }
		 return this.hinstance;
	 }

	/**
	 * Set method for field hwnd	[vkhandle]<br>
	 * Prototype: HWND  hwnd
	 */ 
	 public void hwnd(Win32HWND hwnd){
		 this.hwnd = hwnd;
		 ByteBuffer buff = (hwnd==null) ? null : hwnd.getPointer();
		 setHwnd0(this.ptr, buff);
	 }

	/**
	 * Get method for field hwnd	[vkhandle]<br>
	 * Prototype: HWND  hwnd
	 */ 
	 public Win32HWND hwnd(){

		 long handle = getHwnd0(super.ptr);
		 if(handle == 0){
		    this.hwnd = null;
		    return null;
		  }  

		 if(this.hwnd == null){
		    this.hwnd = new VkHandle(handle);
		 }else{
		    ((VkHandle)this.hwnd).setPointer(handle);
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
	 private static native void setSType0(Buffer ptr, int  _sType);/*
		  VkWin32SurfaceCreateInfoKHR* vkObj = (VkWin32SurfaceCreateInfoKHR*)(ptr);
		  vkObj->sType = (VkStructureType) (_sType);
	  */

	/**
	 * native GET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native int  getSType0(Buffer ptr);/*
		  VkWin32SurfaceCreateInfoKHR* vkObj = (VkWin32SurfaceCreateInfoKHR*)(ptr);
		  return (VkStructureType) (vkObj->sType);
	 */

	/**
	 * native SET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native void setPNext0(Buffer ptr, java.nio.ByteBuffer  _pNext);/*
		  VkWin32SurfaceCreateInfoKHR* vkObj = (VkWin32SurfaceCreateInfoKHR*)(ptr);
		  vkObj->pNext = (const void*) (_pNext);
	  */

	/**
	 * native GET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native long getPNext0(Buffer ptr);/*
		  VkWin32SurfaceCreateInfoKHR* vkObj = (VkWin32SurfaceCreateInfoKHR*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->pNext);	 */

	/**
	 * native SET method for field flags	[int]<br>
	 * Prototype: VkWin32SurfaceCreateFlagsKHR  flags
	 */ 
	 private static native void setFlags0(Buffer ptr, int _flags);/*
		  VkWin32SurfaceCreateInfoKHR* vkObj = (VkWin32SurfaceCreateInfoKHR*)(ptr);
		  vkObj->flags = (VkWin32SurfaceCreateFlagsKHR) (_flags);
	  */

	/**
	 * native GET method for field flags	[int]<br>
	 * Prototype: VkWin32SurfaceCreateFlagsKHR  flags
	 */ 
	 private static native int getFlags0(Buffer ptr);/*
		  VkWin32SurfaceCreateInfoKHR* vkObj = (VkWin32SurfaceCreateInfoKHR*)(ptr);
		  return (jint) (vkObj->flags);
	 */

	/**
	 * native SET method for field hinstance	[vkhandle]<br>
	 * Prototype: HINSTANCE  hinstance
	 */ 
	 private static native void setHinstance0(Buffer ptr, java.nio.ByteBuffer  _hinstance);/*
		  VkWin32SurfaceCreateInfoKHR* vkObj = (VkWin32SurfaceCreateInfoKHR*)(ptr);
		  vkObj->hinstance = (HINSTANCE) (_hinstance);
	  */

	/**
	 * native GET method for field hinstance	[vkhandle]<br>
	 * Prototype: HINSTANCE  hinstance
	 */ 
	 private static native long getHinstance0(Buffer ptr);/*
		  VkWin32SurfaceCreateInfoKHR* vkObj = (VkWin32SurfaceCreateInfoKHR*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->hinstance);	 */

	/**
	 * native SET method for field hwnd	[vkhandle]<br>
	 * Prototype: HWND  hwnd
	 */ 
	 private static native void setHwnd0(Buffer ptr, java.nio.ByteBuffer  _hwnd);/*
		  VkWin32SurfaceCreateInfoKHR* vkObj = (VkWin32SurfaceCreateInfoKHR*)(ptr);
		  vkObj->hwnd = (HWND) (_hwnd);
	  */

	/**
	 * native GET method for field hwnd	[vkhandle]<br>
	 * Prototype: HWND  hwnd
	 */ 
	 private static native long getHwnd0(Buffer ptr);/*
		  VkWin32SurfaceCreateInfoKHR* vkObj = (VkWin32SurfaceCreateInfoKHR*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->hwnd);	 */



} // end of class VkWin32SurfaceCreateInfoKHR
