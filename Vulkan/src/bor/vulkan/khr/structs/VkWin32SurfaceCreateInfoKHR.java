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
	 *  const void* 	pNext	[p]
	 */ 
	 P<VkObject> 	pNext;

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
		sType0(super.ptr, sType);
	 }

	/**
	 * get method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 public VkStructureType sType(){
		 // return  this.sType;
		 return sType0(super.ptr);
	 }

	/**
	 * Set method for field pNext	[p]<br>
	 * Prototype: const void*  pNext
	 */ 
	 public void pNext(P<VkObject> pNext){
		 this.pNext = pNext;
		pNext0(super.ptr, pNext);
	 }

	/**
	 * get method for field pNext	[p]<br>
	 * Prototype: const void*  pNext
	 */ 
	 public P<VkObject> pNext(){
		 // return  this.pNext;
		 return pNext0(super.ptr);
	 }

	/**
	 * Set method for field flags	[int]<br>
	 * Prototype: VkWin32SurfaceCreateFlagsKHR  flags
	 */ 
	 public void flags(int flags){
		 this.flags = flags;
		flags0(super.ptr, flags);
	 }

	/**
	 * get method for field flags	[int]<br>
	 * Prototype: VkWin32SurfaceCreateFlagsKHR  flags
	 */ 
	 public int flags(){
		 // return  this.flags;
		 return flags0(super.ptr);
	 }

	/**
	 * Set method for field hinstance	[vkhandle]<br>
	 * Prototype: HINSTANCE  hinstance
	 */ 
	 public void hinstance(Win32HINSTANCE hinstance){
		 this.hinstance = hinstance;
		hinstance0(super.ptr, hinstance);
	 }

	/**
	 * get method for field hinstance	[vkhandle]<br>
	 * Prototype: HINSTANCE  hinstance
	 */ 
	 public Win32HINSTANCE hinstance(){
		 // return  this.hinstance;
		 return hinstance0(super.ptr);
	 }

	/**
	 * Set method for field hwnd	[vkhandle]<br>
	 * Prototype: HWND  hwnd
	 */ 
	 public void hwnd(Win32HWND hwnd){
		 this.hwnd = hwnd;
		hwnd0(super.ptr, hwnd);
	 }

	/**
	 * get method for field hwnd	[vkhandle]<br>
	 * Prototype: HWND  hwnd
	 */ 
	 public Win32HWND hwnd(){
		 // return  this.hwnd;
		 return hwnd0(super.ptr);
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native void sType0(ByteBuffer ptr, VkStructureType _sType);/*
		  VkWin32SurfaceCreateInfoKHR _obj = (VkWin32SurfaceCreateInfoKHR)(*ptr);
		  _obj.sType = (VkStructureType) (_sType);
	  */

	/**
	 * native GET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native VkStructureType sType0(ByteBuffer ptr);/*
		  VkWin32SurfaceCreateInfoKHR _obj = (VkWin32SurfaceCreateInfoKHR)(ptr);
		  return (VkStructureType) (_obj.VkStructureType);
	 */

	/**
	 * native SET method for field pNext	[p]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native void pNext0(ByteBuffer ptr, P<VkObject> _pNext);/*
		  VkWin32SurfaceCreateInfoKHR _obj = (VkWin32SurfaceCreateInfoKHR)(*ptr);
		  _obj.pNext = (const void*) (_pNext);
	  */

	/**
	 * native GET method for field pNext	[p]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native P<VkObject> pNext0(ByteBuffer ptr);/*
		  VkWin32SurfaceCreateInfoKHR _obj = (VkWin32SurfaceCreateInfoKHR)(ptr);
		  return (P<VkObject>) (_obj.const void*);
	 */

	/**
	 * native SET method for field flags	[int]<br>
	 * Prototype: VkWin32SurfaceCreateFlagsKHR  flags
	 */ 
	 private static native void flags0(ByteBuffer ptr, int _flags);/*
		  VkWin32SurfaceCreateInfoKHR _obj = (VkWin32SurfaceCreateInfoKHR)(*ptr);
		  _obj.flags = (VkWin32SurfaceCreateFlagsKHR) (_flags);
	  */

	/**
	 * native GET method for field flags	[int]<br>
	 * Prototype: VkWin32SurfaceCreateFlagsKHR  flags
	 */ 
	 private static native int flags0(ByteBuffer ptr);/*
		  VkWin32SurfaceCreateInfoKHR _obj = (VkWin32SurfaceCreateInfoKHR)(ptr);
		  return (jint) (_obj.VkWin32SurfaceCreateFlagsKHR);
	 */

	/**
	 * native SET method for field hinstance	[vkhandle]<br>
	 * Prototype: HINSTANCE  hinstance
	 */ 
	 private static native void hinstance0(ByteBuffer ptr, Win32HINSTANCE _hinstance);/*
		  VkWin32SurfaceCreateInfoKHR _obj = (VkWin32SurfaceCreateInfoKHR)(*ptr);
		  _obj.hinstance = (HINSTANCE) (_hinstance);
	  */

	/**
	 * native GET method for field hinstance	[vkhandle]<br>
	 * Prototype: HINSTANCE  hinstance
	 */ 
	 private static native Win32HINSTANCE hinstance0(ByteBuffer ptr);/*
		  VkWin32SurfaceCreateInfoKHR _obj = (VkWin32SurfaceCreateInfoKHR)(ptr);
		  return (Win32HINSTANCE) (_obj.HINSTANCE);
	 */

	/**
	 * native SET method for field hwnd	[vkhandle]<br>
	 * Prototype: HWND  hwnd
	 */ 
	 private static native void hwnd0(ByteBuffer ptr, Win32HWND _hwnd);/*
		  VkWin32SurfaceCreateInfoKHR _obj = (VkWin32SurfaceCreateInfoKHR)(*ptr);
		  _obj.hwnd = (HWND) (_hwnd);
	  */

	/**
	 * native GET method for field hwnd	[vkhandle]<br>
	 * Prototype: HWND  hwnd
	 */ 
	 private static native Win32HWND hwnd0(ByteBuffer ptr);/*
		  VkWin32SurfaceCreateInfoKHR _obj = (VkWin32SurfaceCreateInfoKHR)(ptr);
		  return (Win32HWND) (_obj.HWND);
	 */



} // end of class VkWin32SurfaceCreateInfoKHR
