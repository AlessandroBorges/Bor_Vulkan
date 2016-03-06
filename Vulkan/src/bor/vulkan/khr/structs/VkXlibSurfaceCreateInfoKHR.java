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

	 // fields //
	/**
	 *  VkStructureType 	sType	[vkenum]
	 */ 
	VkStructureType 	sType;

	/**
	 *  const void* 	pNext	[p]
	 */ 
	P<VkObject> 	pNext;

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
	 * Prototype: VkXlibSurfaceCreateFlagsKHR  flags
	 */ 
	 public void flags(int flags){
		 this.flags = flags;
		flags0(super.ptr, flags);
	 }

	/**
	 * get method for field flags	[int]<br>
	 * Prototype: VkXlibSurfaceCreateFlagsKHR  flags
	 */ 
	 public int flags(){
		 // return  this.flags;
		 return flags0(super.ptr);
	 }

	/**
	 * Set method for field dpy	[vkhandle]<br>
	 * Prototype: Display*  dpy
	 */ 
	 public void dpy(XlibDisplay dpy){
		 this.dpy = dpy;
		dpy0(super.ptr, dpy);
	 }

	/**
	 * get method for field dpy	[vkhandle]<br>
	 * Prototype: Display*  dpy
	 */ 
	 public XlibDisplay dpy(){
		 // return  this.dpy;
		 return dpy0(super.ptr);
	 }

	/**
	 * Set method for field window	[vkhandle]<br>
	 * Prototype: Window  window
	 */ 
	 public void window(XlibWindow window){
		 this.window = window;
		window0(super.ptr, window);
	 }

	/**
	 * get method for field window	[vkhandle]<br>
	 * Prototype: Window  window
	 */ 
	 public XlibWindow window(){
		 // return  this.window;
		 return window0(super.ptr);
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native void sType0(ByteBuffer ptr, VkStructureType _sType);/*
		  VkXlibSurfaceCreateInfoKHR _obj = (VkXlibSurfaceCreateInfoKHR)(*ptr);
		  _obj.sType = (VkStructureType) (_sType);
	  */

	/**
	 * native GET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native VkStructureType sType0(ByteBuffer ptr);/*
		  VkXlibSurfaceCreateInfoKHR _obj = (VkXlibSurfaceCreateInfoKHR)(ptr);
		  return (VkStructureType) (_obj.VkStructureType);
	 */

	/**
	 * native SET method for field pNext	[p]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native void pNext0(ByteBuffer ptr, P<VkObject> _pNext);/*
		  VkXlibSurfaceCreateInfoKHR _obj = (VkXlibSurfaceCreateInfoKHR)(*ptr);
		  _obj.pNext = (const void*) (_pNext);
	  */

	/**
	 * native GET method for field pNext	[p]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native P<VkObject> pNext0(ByteBuffer ptr);/*
		  VkXlibSurfaceCreateInfoKHR _obj = (VkXlibSurfaceCreateInfoKHR)(ptr);
		  return (P<VkObject>) (_obj.const void*);
	 */

	/**
	 * native SET method for field flags	[int]<br>
	 * Prototype: VkXlibSurfaceCreateFlagsKHR  flags
	 */ 
	 private static native void flags0(ByteBuffer ptr, int _flags);/*
		  VkXlibSurfaceCreateInfoKHR _obj = (VkXlibSurfaceCreateInfoKHR)(*ptr);
		  _obj.flags = (VkXlibSurfaceCreateFlagsKHR) (_flags);
	  */

	/**
	 * native GET method for field flags	[int]<br>
	 * Prototype: VkXlibSurfaceCreateFlagsKHR  flags
	 */ 
	 private static native int flags0(ByteBuffer ptr);/*
		  VkXlibSurfaceCreateInfoKHR _obj = (VkXlibSurfaceCreateInfoKHR)(ptr);
		  return (jint) (_obj.VkXlibSurfaceCreateFlagsKHR);
	 */

	/**
	 * native SET method for field dpy	[vkhandle]<br>
	 * Prototype: Display*  dpy
	 */ 
	 private static native void dpy0(ByteBuffer ptr, XlibDisplay _dpy);/*
		  VkXlibSurfaceCreateInfoKHR _obj = (VkXlibSurfaceCreateInfoKHR)(*ptr);
		  _obj.dpy = (Display*) (_dpy);
	  */

	/**
	 * native GET method for field dpy	[vkhandle]<br>
	 * Prototype: Display*  dpy
	 */ 
	 private static native XlibDisplay dpy0(ByteBuffer ptr);/*
		  VkXlibSurfaceCreateInfoKHR _obj = (VkXlibSurfaceCreateInfoKHR)(ptr);
		  return (XlibDisplay) (_obj.Display*);
	 */

	/**
	 * native SET method for field window	[vkhandle]<br>
	 * Prototype: Window  window
	 */ 
	 private static native void window0(ByteBuffer ptr, XlibWindow _window);/*
		  VkXlibSurfaceCreateInfoKHR _obj = (VkXlibSurfaceCreateInfoKHR)(*ptr);
		  _obj.window = (Window) (_window);
	  */

	/**
	 * native GET method for field window	[vkhandle]<br>
	 * Prototype: Window  window
	 */ 
	 private static native XlibWindow window0(ByteBuffer ptr);/*
		  VkXlibSurfaceCreateInfoKHR _obj = (VkXlibSurfaceCreateInfoKHR)(ptr);
		  return (XlibWindow) (_obj.Window);
	 */



} // end of class VkXlibSurfaceCreateInfoKHR
