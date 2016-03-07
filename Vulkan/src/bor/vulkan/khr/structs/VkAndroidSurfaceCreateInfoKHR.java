/**
 * Class wrapping Vulkan's VkAndroidSurfaceCreateInfoKHR struct.
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
 *  This class is a Java front end for struct VkAndroidSurfaceCreateInfoKHR. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkAndroidSurfaceCreateInfoKHR {
 *     VkStructureType                   sType;
 *     const void*                       pNext;
 *     VkAndroidSurfaceCreateFlagsKHR    flags;
 *     ANativeWindow*                    window;
 * } VkAndroidSurfaceCreateInfoKHR;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.01 (beta) 
 */
public class VkAndroidSurfaceCreateInfoKHR extends VkStruct {
	/** TAG of this structure [122]  */
	 private static final String TAG = "VkAndroidSurfaceCreateInfoKHR";

	/** ID of this structure [122]  */
	 public static final int TAG_ID = VKANDROIDSURFACECREATEINFOKHR_ID;

	/** P wrapper for THIS object */
	 private  P<VkAndroidSurfaceCreateInfoKHR> p;

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
	 *  VkAndroidSurfaceCreateFlagsKHR 	flags	[int]
	 */ 
	 int 	flags;

	/**
	 *  ANativeWindow* 	window	[vkhandle]
	 */ 
	 ANativeWindow 	window;

	/**
	 * Ctor
	 */
	public VkAndroidSurfaceCreateInfoKHR(){ 
		 super(sizeOf()); 
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkAndroidSurfaceCreateInfoKHR(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address and memSize
	 * @param address - native address 
	 * @param memSize - buffer size 
	 */
	 public VkAndroidSurfaceCreateInfoKHR(long address, int memSize){ 
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
	 public static P<VkAndroidSurfaceCreateInfoKHR> createNullPointer(){
	        P<VkAndroidSurfaceCreateInfoKHR> p = new  P<VkAndroidSurfaceCreateInfoKHR>(new VkAndroidSurfaceCreateInfoKHR());
	        return p;
	    }


	/** 
	 * Return this VkObject instance wrapped in pointer P<br>
	 *
	 *  P&lt;? extends VkObject &gt;
	 *
	 * @return  a P container wrapping this object.
	 */
	 public P<VkAndroidSurfaceCreateInfoKHR> getP() {
	       if(p == null ){
	           p = new P<VkAndroidSurfaceCreateInfoKHR> (this);
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
	 * Prototype: VkAndroidSurfaceCreateFlagsKHR  flags
	 */ 
	 public void flags(int flags){
		 this.flags = flags;
		flags0(super.ptr, flags);
	 }

	/**
	 * get method for field flags	[int]<br>
	 * Prototype: VkAndroidSurfaceCreateFlagsKHR  flags
	 */ 
	 public int flags(){
		 // return  this.flags;
		 return flags0(super.ptr);
	 }

	/**
	 * Set method for field window	[vkhandle]<br>
	 * Prototype: ANativeWindow*  window
	 */ 
	 public void window(ANativeWindow window){
		 this.window = window;
		window0(super.ptr, window);
	 }

	/**
	 * get method for field window	[vkhandle]<br>
	 * Prototype: ANativeWindow*  window
	 */ 
	 public ANativeWindow window(){
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
		  VkAndroidSurfaceCreateInfoKHR _obj = (VkAndroidSurfaceCreateInfoKHR)(*ptr);
		  _obj.sType = (VkStructureType) (_sType);
	  */

	/**
	 * native GET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native VkStructureType sType0(ByteBuffer ptr);/*
		  VkAndroidSurfaceCreateInfoKHR _obj = (VkAndroidSurfaceCreateInfoKHR)(ptr);
		  return (VkStructureType) (_obj.VkStructureType);
	 */

	/**
	 * native SET method for field pNext	[p]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native void pNext0(ByteBuffer ptr, P<VkObject> _pNext);/*
		  VkAndroidSurfaceCreateInfoKHR _obj = (VkAndroidSurfaceCreateInfoKHR)(*ptr);
		  _obj.pNext = (const void*) (_pNext);
	  */

	/**
	 * native GET method for field pNext	[p]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native P<VkObject> pNext0(ByteBuffer ptr);/*
		  VkAndroidSurfaceCreateInfoKHR _obj = (VkAndroidSurfaceCreateInfoKHR)(ptr);
		  return (P<VkObject>) (_obj.const void*);
	 */

	/**
	 * native SET method for field flags	[int]<br>
	 * Prototype: VkAndroidSurfaceCreateFlagsKHR  flags
	 */ 
	 private static native void flags0(ByteBuffer ptr, int _flags);/*
		  VkAndroidSurfaceCreateInfoKHR _obj = (VkAndroidSurfaceCreateInfoKHR)(*ptr);
		  _obj.flags = (VkAndroidSurfaceCreateFlagsKHR) (_flags);
	  */

	/**
	 * native GET method for field flags	[int]<br>
	 * Prototype: VkAndroidSurfaceCreateFlagsKHR  flags
	 */ 
	 private static native int flags0(ByteBuffer ptr);/*
		  VkAndroidSurfaceCreateInfoKHR _obj = (VkAndroidSurfaceCreateInfoKHR)(ptr);
		  return (jint) (_obj.VkAndroidSurfaceCreateFlagsKHR);
	 */

	/**
	 * native SET method for field window	[vkhandle]<br>
	 * Prototype: ANativeWindow*  window
	 */ 
	 private static native void window0(ByteBuffer ptr, ANativeWindow _window);/*
		  VkAndroidSurfaceCreateInfoKHR _obj = (VkAndroidSurfaceCreateInfoKHR)(*ptr);
		  _obj.window = (ANativeWindow*) (_window);
	  */

	/**
	 * native GET method for field window	[vkhandle]<br>
	 * Prototype: ANativeWindow*  window
	 */ 
	 private static native ANativeWindow window0(ByteBuffer ptr);/*
		  VkAndroidSurfaceCreateInfoKHR _obj = (VkAndroidSurfaceCreateInfoKHR)(ptr);
		  return (ANativeWindow) (_obj.ANativeWindow*);
	 */



} // end of class VkAndroidSurfaceCreateInfoKHR
