/**
 * Class wrapping Vulkan's VkDisplayPresentInfoKHR struct.
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
 *  This class is a Java front end for struct VkDisplayPresentInfoKHR. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkDisplayPresentInfoKHR {
 *     VkStructureType    sType;
 *     const void*        pNext;
 *     VkRect2D           srcRect;
 *     VkRect2D           dstRect;
 *     VkBool32           persistent;
 * } VkDisplayPresentInfoKHR;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.01 (beta) 
 */
public class VkDisplayPresentInfoKHR extends VkStruct {
	/** TAG of this structure [117]  */
	 private static final String TAG = "VkDisplayPresentInfoKHR";

	/** ID of this structure [117]  */
	 public static final int TAG_ID = VKDISPLAYPRESENTINFOKHR_ID;

	/** P wrapper for THIS object */
	 private  P<VkDisplayPresentInfoKHR> p;

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
	 *  VkRect2D 	srcRect	[vkstruct]
	 */ 
	 VkRect2D 	srcRect;

	/**
	 *  VkRect2D 	dstRect	[vkstruct]
	 */ 
	 VkRect2D 	dstRect;

	/**
	 *  VkBool32 	persistent	[boolean]
	 */ 
	 boolean 	persistent;

	/**
	 * Ctor
	 */
	public VkDisplayPresentInfoKHR(){ 
		 super(sizeOf()); 
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkDisplayPresentInfoKHR(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address and memSize
	 * @param address - native address 
	 * @param memSize - buffer size 
	 */
	 public VkDisplayPresentInfoKHR(long address, int memSize){ 
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
	 public static P<VkDisplayPresentInfoKHR> createNullPointer(){
	        P<VkDisplayPresentInfoKHR> p = new  P<VkDisplayPresentInfoKHR>(new VkDisplayPresentInfoKHR());
	        return p;
	    }


	/** 
	 * Return this VkObject instance wrapped in pointer P<br>
	 *
	 *  P&lt;? extends VkObject &gt;
	 *
	 * @return  a P container wrapping this object.
	 */
	 public P<VkDisplayPresentInfoKHR> getP() {
	       if(p == null ){
	           p = new P<VkDisplayPresentInfoKHR> (this);
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
	 * Set method for field srcRect	[vkstruct]<br>
	 * Prototype: VkRect2D  srcRect
	 */ 
	 public void srcRect(VkRect2D srcRect){
		 this.srcRect = srcRect;
		 ByteBuffer buff = (srcRect==null) ? null : srcRect.getPointerStruct();
		 srcRect0(this.ptr, buff);
	 }

	/**
	 * Get method for field srcRect	[vkstruct]<br>
	 * Prototype: VkRect2D  srcRect
	 */ 
	 public VkRect2D srcRect(){
		 ByteBuffer pointer = srcRect0(super.ptr);
		 if(pointer == null){
		    this.srcRect = null;
		    return null;
		  } else 
 		 if(this.srcRect == null){
		    this.srcRect = new VkRect2D(pointer);
		 }else{
		    this.srcRect.setPointer(pointer);
		  }
		 return this.srcRect;
	 }

	/**
	 * Set method for field dstRect	[vkstruct]<br>
	 * Prototype: VkRect2D  dstRect
	 */ 
	 public void dstRect(VkRect2D dstRect){
		 this.dstRect = dstRect;
		 ByteBuffer buff = (dstRect==null) ? null : dstRect.getPointerStruct();
		 dstRect0(this.ptr, buff);
	 }

	/**
	 * Get method for field dstRect	[vkstruct]<br>
	 * Prototype: VkRect2D  dstRect
	 */ 
	 public VkRect2D dstRect(){
		 ByteBuffer pointer = dstRect0(super.ptr);
		 if(pointer == null){
		    this.dstRect = null;
		    return null;
		  } else 
 		 if(this.dstRect == null){
		    this.dstRect = new VkRect2D(pointer);
		 }else{
		    this.dstRect.setPointer(pointer);
		  }
		 return this.dstRect;
	 }

	/**
	 * Set method for field persistent	[boolean]<br>
	 * Prototype: VkBool32  persistent
	 */ 
	 public void persistent(boolean persistent){
		 this.persistent = persistent;
		 persistent0(this.ptr,  persistent);
	 }

	/**
	 * Get method for field persistent	[boolean]<br>
	 * Prototype: VkBool32  persistent
	 */ 
	 public boolean persistent(){
		 boolean var = persistent0(super.ptr);
		 this.persistent = var;
		 return this.persistent;
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native void sType0(Buffer ptr, int  _sType);/*
		  VkDisplayPresentInfoKHR* vkObj = (VkDisplayPresentInfoKHR*)(ptr);
		  vkObj->sType = (VkStructureType) (_sType);
	  */

	/**
	 * native GET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native int  sType0(Buffer ptr);/*
		  VkDisplayPresentInfoKHR vkObj = (VkDisplayPresentInfoKHR*)(ptr);
		  return (VkStructureType) (vkObj->sType);
	 */

	/**
	 * native SET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native void pNext0(Buffer ptr, java.nio.ByteBuffer  _pNext);/*
		  VkDisplayPresentInfoKHR* vkObj = (VkDisplayPresentInfoKHR*)(ptr);
		  vkObj->pNext = (const void*) (_pNext);
	  */

	/**
	 * native GET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native java.nio.ByteBuffer  pNext0(Buffer ptr);/*
		  VkDisplayPresentInfoKHR vkObj = (VkDisplayPresentInfoKHR*)(ptr);
		  return (VkObject) (vkObj->pNext);
	 */

	/**
	 * native SET method for field srcRect	[vkstruct]<br>
	 * Prototype: VkRect2D  srcRect
	 */ 
	 private static native void srcRect0(Buffer ptr, java.nio.ByteBuffer  _srcRect);/*
		  VkDisplayPresentInfoKHR* vkObj = (VkDisplayPresentInfoKHR*)(ptr);
		  vkObj->srcRect = (VkRect2D) (_srcRect);
	  */

	/**
	 * native GET method for field srcRect	[vkstruct]<br>
	 * Prototype: VkRect2D  srcRect
	 */ 
	 private static native java.nio.ByteBuffer  srcRect0(Buffer ptr);/*
		  VkDisplayPresentInfoKHR vkObj = (VkDisplayPresentInfoKHR*)(ptr);
		  return (VkRect2D) (vkObj->srcRect);
	 */

	/**
	 * native SET method for field dstRect	[vkstruct]<br>
	 * Prototype: VkRect2D  dstRect
	 */ 
	 private static native void dstRect0(Buffer ptr, java.nio.ByteBuffer  _dstRect);/*
		  VkDisplayPresentInfoKHR* vkObj = (VkDisplayPresentInfoKHR*)(ptr);
		  vkObj->dstRect = (VkRect2D) (_dstRect);
	  */

	/**
	 * native GET method for field dstRect	[vkstruct]<br>
	 * Prototype: VkRect2D  dstRect
	 */ 
	 private static native java.nio.ByteBuffer  dstRect0(Buffer ptr);/*
		  VkDisplayPresentInfoKHR vkObj = (VkDisplayPresentInfoKHR*)(ptr);
		  return (VkRect2D) (vkObj->dstRect);
	 */

	/**
	 * native SET method for field persistent	[boolean]<br>
	 * Prototype: VkBool32  persistent
	 */ 
	 private static native void persistent0(Buffer ptr, boolean _persistent);/*
		  VkDisplayPresentInfoKHR* vkObj = (VkDisplayPresentInfoKHR*)(ptr);
		  vkObj->persistent = (VkBool32) (_persistent);
	  */

	/**
	 * native GET method for field persistent	[boolean]<br>
	 * Prototype: VkBool32  persistent
	 */ 
	 private static native boolean persistent0(Buffer ptr);/*
		  VkDisplayPresentInfoKHR vkObj = (VkDisplayPresentInfoKHR*)(ptr);
		  return (jboolean) (vkObj->persistent);
	 */



} // end of class VkDisplayPresentInfoKHR
