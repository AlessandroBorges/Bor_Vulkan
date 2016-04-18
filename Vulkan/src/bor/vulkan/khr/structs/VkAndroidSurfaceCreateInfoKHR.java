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

import java.nio.Buffer;


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

    //@formatter:off
    /*JNI
    #include <BorVulkan.hpp>
    */  

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
	 *  const void* 	pNext	[vkobject]
	 */ 
	 VkObject 	pNext;

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
	 public VkAndroidSurfaceCreateInfoKHR(long address , int memSize){ 
		 super(address, memSize); 
	 }

	/**
	 * Ctor with Address only. Size guessed by #sizeof()
	 * @param address - native address 
	 */
	 public VkAndroidSurfaceCreateInfoKHR(long address){ 
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
	 * Prototype: VkAndroidSurfaceCreateFlagsKHR  flags
	 */ 
	 public void flags(int flags){
		 this.flags = flags;
		 setFlags0(this.ptr,  flags);
	 }

	/**
	 * Get method for field flags	[int]<br>
	 * Prototype: VkAndroidSurfaceCreateFlagsKHR  flags
	 */ 
	 public int flags(){
		 int var = getFlags0(super.ptr);
		 this.flags = var;
		 return this.flags;
	 }

	/**
	 * Set method for field window	[vkhandle]<br>
	 * Prototype: ANativeWindow*  window
	 */ 
	 public void window(ANativeWindow window){
		 this.window = window;
		 ByteBuffer buff = (window==null) ? null : window.getPointer();
		 setWindow0(this.ptr, buff);
	 }

	/**
	 * Get method for field window	[vkhandle]<br>
	 * Prototype: ANativeWindow*  window
	 */ 
	 public ANativeWindow window(){

		 long handle = getWindow0(super.ptr);
		 if(handle == 0){
		    this.window = null;
		    return null;
		  }  

		 if(this.window == null){
		    this.window = new VkHandle(handle);
		 }else{
		    ((VkHandle)this.window).setPointer(handle);
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
	 private static native void setSType0(Buffer ptr, int  _sType);/*
		  VkAndroidSurfaceCreateInfoKHR* vkObj = (VkAndroidSurfaceCreateInfoKHR*)(ptr);
		  vkObj->sType = (VkStructureType) (_sType);
	  */

	/**
	 * native GET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native int  getSType0(Buffer ptr);/*
		  VkAndroidSurfaceCreateInfoKHR* vkObj = (VkAndroidSurfaceCreateInfoKHR*)(ptr);
		  return (VkStructureType) (vkObj->sType);
	 */

	/**
	 * native SET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native void setPNext0(Buffer ptr, java.nio.ByteBuffer  _pNext);/*
		  VkAndroidSurfaceCreateInfoKHR* vkObj = (VkAndroidSurfaceCreateInfoKHR*)(ptr);
		  vkObj->pNext = (const void*) (_pNext);
	  */

	/**
	 * native GET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native long getPNext0(Buffer ptr);/*
		  VkAndroidSurfaceCreateInfoKHR* vkObj = (VkAndroidSurfaceCreateInfoKHR*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->pNext);	 */

	/**
	 * native SET method for field flags	[int]<br>
	 * Prototype: VkAndroidSurfaceCreateFlagsKHR  flags
	 */ 
	 private static native void setFlags0(Buffer ptr, int _flags);/*
		  VkAndroidSurfaceCreateInfoKHR* vkObj = (VkAndroidSurfaceCreateInfoKHR*)(ptr);
		  vkObj->flags = (VkAndroidSurfaceCreateFlagsKHR) (_flags);
	  */

	/**
	 * native GET method for field flags	[int]<br>
	 * Prototype: VkAndroidSurfaceCreateFlagsKHR  flags
	 */ 
	 private static native int getFlags0(Buffer ptr);/*
		  VkAndroidSurfaceCreateInfoKHR* vkObj = (VkAndroidSurfaceCreateInfoKHR*)(ptr);
		  return (jint) (vkObj->flags);
	 */

	/**
	 * native SET method for field window	[vkhandle]<br>
	 * Prototype: ANativeWindow*  window
	 */ 
	 private static native void setWindow0(Buffer ptr, java.nio.ByteBuffer  _window);/*
		  VkAndroidSurfaceCreateInfoKHR* vkObj = (VkAndroidSurfaceCreateInfoKHR*)(ptr);
		  vkObj->window = (ANativeWindow*) (_window);
	  */

	/**
	 * native GET method for field window	[vkhandle]<br>
	 * Prototype: ANativeWindow*  window
	 */ 
	 private static native long getWindow0(Buffer ptr);/*
		  VkAndroidSurfaceCreateInfoKHR* vkObj = (VkAndroidSurfaceCreateInfoKHR*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->window);	 */



} // end of class VkAndroidSurfaceCreateInfoKHR
