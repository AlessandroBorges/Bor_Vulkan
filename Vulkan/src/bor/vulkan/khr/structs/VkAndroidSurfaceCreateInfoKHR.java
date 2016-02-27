// class wrapping Vulkan's VkAndroidSurfaceCreateInfoKHR struct.
package bor.vulkan.khr.structs;

import bor.vulkan.*;
import bor.vulkan.enumerations.*;
import bor.vulkan.khr.ANativeWindow;
import bor.vulkan.structs.VkStruct;

import java.nio.ByteBuffer;


/**
 *  Class for Java-Vulkan integration 
 *  This class is a Java front end for struct VkAndroidSurfaceCreateInfoKHR 
 * @Author Alessandro Borges 
 */
public class VkAndroidSurfaceCreateInfoKHR extends VkStruct {
	/** ID of this structure [122]  */
	 public static final int TAG = VKANDROIDSURFACECREATEINFOKHR_ID;

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
	 *  VkAndroidSurfaceCreateFlagsKHR 	flags 
	 */ 
	int 	flags;

	/**
	 *  ANativeWindow* 	window 
	 */ 
	ANativeWindow 	window;

	/**
	 * Ctor
	 */
	public VkAndroidSurfaceCreateInfoKHR(){ 
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
	 * Prototype: VkAndroidSurfaceCreateFlagsKHR  flags
	 */ 
	 public void flags(int flags){
		 this.flags = flags;
		flags0(super.ptr, flags);
	 }

	/**
	 * get method for field flags
	 * Prototype: VkAndroidSurfaceCreateFlagsKHR  flags
	 */ 
	 public int flags(){
		 // return  this.flags;
		 return flags0(super.ptr);
	 }

	/**
	 * Set method for field window
	 * Prototype: ANativeWindow*  window
	 */ 
	 public void window(ANativeWindow window){
		 this.window = window;
		window0(super.ptr, window);
	 }

	/**
	 * get method for field window
	 * Prototype: ANativeWindow*  window
	 */ 
	 public ANativeWindow window(){
		 // return  this.window;
		 return window0(super.ptr);
	 }


	 // ////////////////////////////////
	 // native SETTERS & GETTERS //
	 // ////////////////////////////////
	/**
	 * native Set method for field sType
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native void sType0(ByteBuffer ptr, VkStructureType _sType);/*
		  VkAndroidSurfaceCreateInfoKHR _obj = (VkAndroidSurfaceCreateInfoKHR)(*ptr);
		  _obj.sType = (VkStructureType) (_sType);
	  */

	/**
	 * get method for field sType
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native VkStructureType sType0(ByteBuffer ptr);/*
		  VkAndroidSurfaceCreateInfoKHR _obj = (VkAndroidSurfaceCreateInfoKHR)(ptr);
		  return (VkStructureType) (_obj.VkStructureType);
	 */

	/**
	 * native Set method for field pNext
	 * Prototype: const void*  pNext
	 */ 
	 private static native void pNext0(ByteBuffer ptr, VkObject _pNext);/*
		  VkAndroidSurfaceCreateInfoKHR _obj = (VkAndroidSurfaceCreateInfoKHR)(*ptr);
		  _obj.pNext = (const void*) (_pNext);
	  */

	/**
	 * get method for field pNext
	 * Prototype: const void*  pNext
	 */ 
	 private static native VkObject pNext0(ByteBuffer ptr);/*
		  VkAndroidSurfaceCreateInfoKHR _obj = (VkAndroidSurfaceCreateInfoKHR)(ptr);
		  return (VkObject) (_obj.const void*);
	 */

	/**
	 * native Set method for field flags
	 * Prototype: VkAndroidSurfaceCreateFlagsKHR  flags
	 */ 
	 private static native void flags0(ByteBuffer ptr, int _flags);/*
		  VkAndroidSurfaceCreateInfoKHR _obj = (VkAndroidSurfaceCreateInfoKHR)(*ptr);
		  _obj.flags = (VkAndroidSurfaceCreateFlagsKHR) (_flags);
	  */

	/**
	 * get method for field flags
	 * Prototype: VkAndroidSurfaceCreateFlagsKHR  flags
	 */ 
	 private static native int flags0(ByteBuffer ptr);/*
		  VkAndroidSurfaceCreateInfoKHR _obj = (VkAndroidSurfaceCreateInfoKHR)(ptr);
		  return (jint) (_obj.VkAndroidSurfaceCreateFlagsKHR);
	 */

	/**
	 * native Set method for field window
	 * Prototype: ANativeWindow*  window
	 */ 
	 private static native void window0(ByteBuffer ptr, ANativeWindow _window);/*
		  VkAndroidSurfaceCreateInfoKHR _obj = (VkAndroidSurfaceCreateInfoKHR)(*ptr);
		  _obj.window = (ANativeWindow*) (_window);
	  */

	/**
	 * get method for field window
	 * Prototype: ANativeWindow*  window
	 */ 
	 private static native ANativeWindow window0(ByteBuffer ptr);/*
		  VkAndroidSurfaceCreateInfoKHR _obj = (VkAndroidSurfaceCreateInfoKHR)(ptr);
		  return (ANativeWindow*) (_obj.ANativeWindow*);
	 */



} // end of class VkAndroidSurfaceCreateInfoKHR
