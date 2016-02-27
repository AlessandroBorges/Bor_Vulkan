// class wrapping Vulkan's VkXlibSurfaceCreateInfoKHR struct.
package bor.vulkan.khr.structs;

import bor.vulkan.*;
import bor.vulkan.enumerations.*;
import bor.vulkan.structs.VkStruct;

import java.nio.ByteBuffer;


/**
 *  Class for Java-Vulkan integration 
 *  This class is a Java front end for struct VkXlibSurfaceCreateInfoKHR 
 * @Author Alessandro Borges 
 */
public class VkXlibSurfaceCreateInfoKHR extends VkStruct {
	/** ID of this structure [118]  */
	 public static final int TAG = VKXLIBSURFACECREATEINFOKHR_ID;

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
	 *  VkXlibSurfaceCreateFlagsKHR 	flags 
	 */ 
	int 	flags;

	/**
	 *  Display* 	dpy 
	 */ 
	Display* 	dpy;

	/**
	 *  Window 	window 
	 */ 
	Window 	window;

	/**
	 * Ctor
	 */
	public VkXlibSurfaceCreateInfoKHR(){ 
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
	 * Prototype: VkXlibSurfaceCreateFlagsKHR  flags
	 */ 
	 public void flags(int flags){
		 this.flags = flags;
		flags0(super.ptr, flags);
	 }

	/**
	 * get method for field flags
	 * Prototype: VkXlibSurfaceCreateFlagsKHR  flags
	 */ 
	 public int flags(){
		 // return  this.flags;
		 return flags0(super.ptr);
	 }

	/**
	 * Set method for field dpy
	 * Prototype: Display*  dpy
	 */ 
	 public void dpy(Display* dpy){
		 this.dpy = dpy;
		dpy0(super.ptr, dpy);
	 }

	/**
	 * get method for field dpy
	 * Prototype: Display*  dpy
	 */ 
	 public Display* dpy(){
		 // return  this.dpy;
		 return dpy0(super.ptr);
	 }

	/**
	 * Set method for field window
	 * Prototype: Window  window
	 */ 
	 public void window(Window window){
		 this.window = window;
		window0(super.ptr, window);
	 }

	/**
	 * get method for field window
	 * Prototype: Window  window
	 */ 
	 public Window window(){
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
		  VkXlibSurfaceCreateInfoKHR _obj = (VkXlibSurfaceCreateInfoKHR)(*ptr);
		  _obj.sType = (VkStructureType) (_sType);
	  */

	/**
	 * get method for field sType
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native VkStructureType sType0(ByteBuffer ptr);/*
		  VkXlibSurfaceCreateInfoKHR _obj = (VkXlibSurfaceCreateInfoKHR)(ptr);
		  return (VkStructureType) (_obj.VkStructureType);
	 */

	/**
	 * native Set method for field pNext
	 * Prototype: const void*  pNext
	 */ 
	 private static native void pNext0(ByteBuffer ptr, VkObject _pNext);/*
		  VkXlibSurfaceCreateInfoKHR _obj = (VkXlibSurfaceCreateInfoKHR)(*ptr);
		  _obj.pNext = (const void*) (_pNext);
	  */

	/**
	 * get method for field pNext
	 * Prototype: const void*  pNext
	 */ 
	 private static native VkObject pNext0(ByteBuffer ptr);/*
		  VkXlibSurfaceCreateInfoKHR _obj = (VkXlibSurfaceCreateInfoKHR)(ptr);
		  return (VkObject) (_obj.const void*);
	 */

	/**
	 * native Set method for field flags
	 * Prototype: VkXlibSurfaceCreateFlagsKHR  flags
	 */ 
	 private static native void flags0(ByteBuffer ptr, int _flags);/*
		  VkXlibSurfaceCreateInfoKHR _obj = (VkXlibSurfaceCreateInfoKHR)(*ptr);
		  _obj.flags = (VkXlibSurfaceCreateFlagsKHR) (_flags);
	  */

	/**
	 * get method for field flags
	 * Prototype: VkXlibSurfaceCreateFlagsKHR  flags
	 */ 
	 private static native int flags0(ByteBuffer ptr);/*
		  VkXlibSurfaceCreateInfoKHR _obj = (VkXlibSurfaceCreateInfoKHR)(ptr);
		  return (jint) (_obj.VkXlibSurfaceCreateFlagsKHR);
	 */

	/**
	 * native Set method for field dpy
	 * Prototype: Display*  dpy
	 */ 
	 private static native void dpy0(ByteBuffer ptr, Display* _dpy);/*
		  VkXlibSurfaceCreateInfoKHR _obj = (VkXlibSurfaceCreateInfoKHR)(*ptr);
		  _obj.dpy = (Display*) (_dpy);
	  */

	/**
	 * get method for field dpy
	 * Prototype: Display*  dpy
	 */ 
	 private static native Display* dpy0(ByteBuffer ptr);/*
		  VkXlibSurfaceCreateInfoKHR _obj = (VkXlibSurfaceCreateInfoKHR)(ptr);
		  return (Display*) (_obj.Display*);
	 */

	/**
	 * native Set method for field window
	 * Prototype: Window  window
	 */ 
	 private static native void window0(ByteBuffer ptr, Window _window);/*
		  VkXlibSurfaceCreateInfoKHR _obj = (VkXlibSurfaceCreateInfoKHR)(*ptr);
		  _obj.window = (Window) (_window);
	  */

	/**
	 * get method for field window
	 * Prototype: Window  window
	 */ 
	 private static native Window window0(ByteBuffer ptr);/*
		  VkXlibSurfaceCreateInfoKHR _obj = (VkXlibSurfaceCreateInfoKHR)(ptr);
		  return (Window) (_obj.Window);
	 */



} // end of class VkXlibSurfaceCreateInfoKHR
