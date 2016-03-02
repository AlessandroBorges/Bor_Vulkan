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


/**
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
	/** TAG of this structure [242]  */
	 private static final String TAG = "VkXlibSurfaceCreateInfoKHR";

	/** ID of this structure [242]  */
	 public static final int TAG_ID = VKXLIBSURFACECREATEINFOKHR_ID;

	 // fields //
	/**
	 *  VkStructureType 	sType 
	 */ 
	VkStructureType 	sType;

	/**
	 *  const void* 	pNext 
	 */ 
	P<VkObject> 	pNext;

	/**
	 *  VkXlibSurfaceCreateFlagsKHR 	flags 
	 */ 
	int 	flags;

	/**
	 *  Display* 	dpy 
	 */ 
	XlibDisplay 	dpy;

	/**
	 *  Window 	window 
	 */ 
	XlibWindow 	window;

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
		 return sizeOf(TAG_ID); 
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
	 public void pNext(P<VkObject> pNext){
		 this.pNext = pNext;
		pNext0(super.ptr, pNext);
	 }

	/**
	 * get method for field pNext
	 * Prototype: const void*  pNext
	 */ 
	 public P<VkObject> pNext(){
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
	 public void dpy(XlibDisplay dpy){
		 this.dpy = dpy;
		dpy0(super.ptr, dpy);
	 }

	/**
	 * get method for field dpy
	 * Prototype: Display*  dpy
	 */ 
	 public XlibDisplay dpy(){
		 // return  this.dpy;
		 return dpy0(super.ptr);
	 }

	/**
	 * Set method for field window
	 * Prototype: Window  window
	 */ 
	 public void window(XlibWindow window){
		 this.window = window;
		window0(super.ptr, window);
	 }

	/**
	 * get method for field window
	 * Prototype: Window  window
	 */ 
	 public XlibWindow window(){
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
	 private static native void pNext0(ByteBuffer ptr, P<VkObject> _pNext);/*
		  VkXlibSurfaceCreateInfoKHR _obj = (VkXlibSurfaceCreateInfoKHR)(*ptr);
		  _obj.pNext = (const void*) (_pNext);
	  */

	/**
	 * get method for field pNext
	 * Prototype: const void*  pNext
	 */ 
	 private static native P<VkObject> pNext0(ByteBuffer ptr);/*
		  VkXlibSurfaceCreateInfoKHR _obj = (VkXlibSurfaceCreateInfoKHR)(ptr);
		  return (P<VkObject>) (_obj.const void*);
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
	 private static native void dpy0(ByteBuffer ptr, XlibDisplay _dpy);/*
		  VkXlibSurfaceCreateInfoKHR _obj = (VkXlibSurfaceCreateInfoKHR)(*ptr);
		  _obj.dpy = (Display*) (_dpy);
	  */

	/**
	 * get method for field dpy
	 * Prototype: Display*  dpy
	 */ 
	 private static native XlibDisplay dpy0(ByteBuffer ptr);/*
		  VkXlibSurfaceCreateInfoKHR _obj = (VkXlibSurfaceCreateInfoKHR)(ptr);
		  return (XlibDisplay) (_obj.Display*);
	 */

	/**
	 * native Set method for field window
	 * Prototype: Window  window
	 */ 
	 private static native void window0(ByteBuffer ptr, XlibWindow _window);/*
		  VkXlibSurfaceCreateInfoKHR _obj = (VkXlibSurfaceCreateInfoKHR)(*ptr);
		  _obj.window = (Window) (_window);
	  */

	/**
	 * get method for field window
	 * Prototype: Window  window
	 */ 
	 private static native XlibWindow window0(ByteBuffer ptr);/*
		  VkXlibSurfaceCreateInfoKHR _obj = (VkXlibSurfaceCreateInfoKHR)(ptr);
		  return (XlibWindow) (_obj.Window);
	 */



} // end of class VkXlibSurfaceCreateInfoKHR
