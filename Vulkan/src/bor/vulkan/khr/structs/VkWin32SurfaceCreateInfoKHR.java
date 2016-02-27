// class wrapping Vulkan's VkWin32SurfaceCreateInfoKHR struct.
package bor.vulkan.khr.structs;

import bor.vulkan.*;
import bor.vulkan.enumerations.*;
import bor.vulkan.structs.VkStruct;

import java.nio.ByteBuffer;


/**
 *  Class for Java-Vulkan integration 
 *  This class is a Java front end for struct VkWin32SurfaceCreateInfoKHR 
 * @Author Alessandro Borges 
 */
public class VkWin32SurfaceCreateInfoKHR extends VkStruct {
	/** ID of this structure [123]  */
	 public static final int TAG = VKWIN32SURFACECREATEINFOKHR_ID;

	 // fields //
	/**
	 *  VkStructureType 	sType 
	 */ 
	VkStructureType 	sType;

	/**
	 *  const void* 	pNext 
	 */ 
	VkObject 	pNext;

	/**
	 *  VkWin32SurfaceCreateFlagsKHR 	flags 
	 */ 
	int 	flags;

	/**
	 *  HINSTANCE 	hinstance 
	 */ 
	HINSTANCE 	hinstance;

	/**
	 *  HWND 	hwnd 
	 */ 
	HWND 	hwnd;

	/**
	 * Ctor
	 */
	public VkWin32SurfaceCreateInfoKHR(){ 
		 super(sizeOf()); 
	 }

	/** 
	 * Method to get native size of this structure 
	 */
	 public static int sizeOf(){ 
		 return sizeOf(TAG); 
	}


	 // /////////////////////
	 //  SETTERS & GETTERS //
	 // /////////////////////

	/**
	 * Set method for field sType
	 * Prototype: VkStructureType  sType
	 */ 
	 public void sType(VkStructureType sType){
		 this.sType = sType;
		sType0(super.ptr, sType);
	 }

	/**
	 * get method for field sType
	 * Prototype: VkStructureType  sType
	 */ 
	 public VkStructureType sType(){
		 // return  this.sType;
		 return sType0(super.ptr);
	 }

	/**
	 * Set method for field pNext
	 * Prototype: const void*  pNext
	 */ 
	 public void pNext(VkObject pNext){
		 this.pNext = pNext;
		pNext0(super.ptr, pNext);
	 }

	/**
	 * get method for field pNext
	 * Prototype: const void*  pNext
	 */ 
	 public VkObject pNext(){
		 // return  this.pNext;
		 return pNext0(super.ptr);
	 }

	/**
	 * Set method for field flags
	 * Prototype: VkWin32SurfaceCreateFlagsKHR  flags
	 */ 
	 public void flags(int flags){
		 this.flags = flags;
		flags0(super.ptr, flags);
	 }

	/**
	 * get method for field flags
	 * Prototype: VkWin32SurfaceCreateFlagsKHR  flags
	 */ 
	 public int flags(){
		 // return  this.flags;
		 return flags0(super.ptr);
	 }

	/**
	 * Set method for field hinstance
	 * Prototype: HINSTANCE  hinstance
	 */ 
	 public void hinstance(HINSTANCE hinstance){
		 this.hinstance = hinstance;
		hinstance0(super.ptr, hinstance);
	 }

	/**
	 * get method for field hinstance
	 * Prototype: HINSTANCE  hinstance
	 */ 
	 public HINSTANCE hinstance(){
		 // return  this.hinstance;
		 return hinstance0(super.ptr);
	 }

	/**
	 * Set method for field hwnd
	 * Prototype: HWND  hwnd
	 */ 
	 public void hwnd(HWND hwnd){
		 this.hwnd = hwnd;
		hwnd0(super.ptr, hwnd);
	 }

	/**
	 * get method for field hwnd
	 * Prototype: HWND  hwnd
	 */ 
	 public HWND hwnd(){
		 // return  this.hwnd;
		 return hwnd0(super.ptr);
	 }


	 // ////////////////////////////////
	 // native SETTERS & GETTERS //
	 // ////////////////////////////////
	/**
	 * native Set method for field sType
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native void sType0(ByteBuffer ptr, VkStructureType _sType);/*
		  VkWin32SurfaceCreateInfoKHR _obj = (VkWin32SurfaceCreateInfoKHR)(*ptr);
		  _obj.sType = (VkStructureType) (_sType);
	  */

	/**
	 * get method for field sType
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native VkStructureType sType0(ByteBuffer ptr);/*
		  VkWin32SurfaceCreateInfoKHR _obj = (VkWin32SurfaceCreateInfoKHR)(ptr);
		  return (VkStructureType) (_obj.VkStructureType);
	 */

	/**
	 * native Set method for field pNext
	 * Prototype: const void*  pNext
	 */ 
	 private static native void pNext0(ByteBuffer ptr, VkObject _pNext);/*
		  VkWin32SurfaceCreateInfoKHR _obj = (VkWin32SurfaceCreateInfoKHR)(*ptr);
		  _obj.pNext = (const void*) (_pNext);
	  */

	/**
	 * get method for field pNext
	 * Prototype: const void*  pNext
	 */ 
	 private static native VkObject pNext0(ByteBuffer ptr);/*
		  VkWin32SurfaceCreateInfoKHR _obj = (VkWin32SurfaceCreateInfoKHR)(ptr);
		  return (VkObject) (_obj.const void*);
	 */

	/**
	 * native Set method for field flags
	 * Prototype: VkWin32SurfaceCreateFlagsKHR  flags
	 */ 
	 private static native void flags0(ByteBuffer ptr, int _flags);/*
		  VkWin32SurfaceCreateInfoKHR _obj = (VkWin32SurfaceCreateInfoKHR)(*ptr);
		  _obj.flags = (VkWin32SurfaceCreateFlagsKHR) (_flags);
	  */

	/**
	 * get method for field flags
	 * Prototype: VkWin32SurfaceCreateFlagsKHR  flags
	 */ 
	 private static native int flags0(ByteBuffer ptr);/*
		  VkWin32SurfaceCreateInfoKHR _obj = (VkWin32SurfaceCreateInfoKHR)(ptr);
		  return (jint) (_obj.VkWin32SurfaceCreateFlagsKHR);
	 */

	/**
	 * native Set method for field hinstance
	 * Prototype: HINSTANCE  hinstance
	 */ 
	 private static native void hinstance0(ByteBuffer ptr, HINSTANCE _hinstance);/*
		  VkWin32SurfaceCreateInfoKHR _obj = (VkWin32SurfaceCreateInfoKHR)(*ptr);
		  _obj.hinstance = (HINSTANCE) (_hinstance);
	  */

	/**
	 * get method for field hinstance
	 * Prototype: HINSTANCE  hinstance
	 */ 
	 private static native HINSTANCE hinstance0(ByteBuffer ptr);/*
		  VkWin32SurfaceCreateInfoKHR _obj = (VkWin32SurfaceCreateInfoKHR)(ptr);
		  return (HINSTANCE) (_obj.HINSTANCE);
	 */

	/**
	 * native Set method for field hwnd
	 * Prototype: HWND  hwnd
	 */ 
	 private static native void hwnd0(ByteBuffer ptr, HWND _hwnd);/*
		  VkWin32SurfaceCreateInfoKHR _obj = (VkWin32SurfaceCreateInfoKHR)(*ptr);
		  _obj.hwnd = (HWND) (_hwnd);
	  */

	/**
	 * get method for field hwnd
	 * Prototype: HWND  hwnd
	 */ 
	 private static native HWND hwnd0(ByteBuffer ptr);/*
		  VkWin32SurfaceCreateInfoKHR _obj = (VkWin32SurfaceCreateInfoKHR)(ptr);
		  return (HWND) (_obj.HWND);
	 */



} // end of class VkWin32SurfaceCreateInfoKHR
