/**
 * Class wrapping Vulkan's VkDisplayPresentInfoKHR struct.
 * 
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
 *  This class is a Java front end for struct VkDisplayPresentInfoKHR 
 *  <h3>ProtoType:</h3>
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
 * @version 0.8.01
 */
public class VkDisplayPresentInfoKHR extends VkStruct {
	/** TAG of this structure [241]  */
	 private static final String TAG = "VkDisplayPresentInfoKHR";

	/** ID of this structure [241]  */
	 public static final int TAG_ID = VKDISPLAYPRESENTINFOKHR_ID;

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
	 *  VkRect2D 	srcRect 
	 */ 
	VkRect2D 	srcRect;

	/**
	 *  VkRect2D 	dstRect 
	 */ 
	VkRect2D 	dstRect;

	/**
	 *  VkBool32 	persistent 
	 */ 
	boolean 	persistent;

	/**
	 * Ctor
	 */
	public VkDisplayPresentInfoKHR(){ 
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
	 * Set method for field srcRect
	 * Prototype: VkRect2D  srcRect
	 */ 
	 public void srcRect(VkRect2D srcRect){
		 this.srcRect = srcRect;
		srcRect0(super.ptr, srcRect);
	 }

	/**
	 * get method for field srcRect
	 * Prototype: VkRect2D  srcRect
	 */ 
	 public VkRect2D srcRect(){
		 // return  this.srcRect;
		 return srcRect0(super.ptr);
	 }

	/**
	 * Set method for field dstRect
	 * Prototype: VkRect2D  dstRect
	 */ 
	 public void dstRect(VkRect2D dstRect){
		 this.dstRect = dstRect;
		dstRect0(super.ptr, dstRect);
	 }

	/**
	 * get method for field dstRect
	 * Prototype: VkRect2D  dstRect
	 */ 
	 public VkRect2D dstRect(){
		 // return  this.dstRect;
		 return dstRect0(super.ptr);
	 }

	/**
	 * Set method for field persistent
	 * Prototype: VkBool32  persistent
	 */ 
	 public void persistent(boolean persistent){
		 this.persistent = persistent;
		persistent0(super.ptr, persistent);
	 }

	/**
	 * get method for field persistent
	 * Prototype: VkBool32  persistent
	 */ 
	 public boolean persistent(){
		 // return  this.persistent;
		 return persistent0(super.ptr);
	 }


	 // ////////////////////////////////
	 // native SETTERS & GETTERS //
	 // ////////////////////////////////
	/**
	 * native Set method for field sType
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native void sType0(ByteBuffer ptr, VkStructureType _sType);/*
		  VkDisplayPresentInfoKHR _obj = (VkDisplayPresentInfoKHR)(*ptr);
		  _obj.sType = (VkStructureType) (_sType);
	  */

	/**
	 * get method for field sType
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native VkStructureType sType0(ByteBuffer ptr);/*
		  VkDisplayPresentInfoKHR _obj = (VkDisplayPresentInfoKHR)(ptr);
		  return (VkStructureType) (_obj.VkStructureType);
	 */

	/**
	 * native Set method for field pNext
	 * Prototype: const void*  pNext
	 */ 
	 private static native void pNext0(ByteBuffer ptr, P<VkObject> _pNext);/*
		  VkDisplayPresentInfoKHR _obj = (VkDisplayPresentInfoKHR)(*ptr);
		  _obj.pNext = (const void*) (_pNext);
	  */

	/**
	 * get method for field pNext
	 * Prototype: const void*  pNext
	 */ 
	 private static native P<VkObject> pNext0(ByteBuffer ptr);/*
		  VkDisplayPresentInfoKHR _obj = (VkDisplayPresentInfoKHR)(ptr);
		  return (P<VkObject>) (_obj.const void*);
	 */

	/**
	 * native Set method for field srcRect
	 * Prototype: VkRect2D  srcRect
	 */ 
	 private static native void srcRect0(ByteBuffer ptr, VkRect2D _srcRect);/*
		  VkDisplayPresentInfoKHR _obj = (VkDisplayPresentInfoKHR)(*ptr);
		  _obj.srcRect = (VkRect2D) (_srcRect);
	  */

	/**
	 * get method for field srcRect
	 * Prototype: VkRect2D  srcRect
	 */ 
	 private static native VkRect2D srcRect0(ByteBuffer ptr);/*
		  VkDisplayPresentInfoKHR _obj = (VkDisplayPresentInfoKHR)(ptr);
		  return (VkRect2D) (_obj.VkRect2D);
	 */

	/**
	 * native Set method for field dstRect
	 * Prototype: VkRect2D  dstRect
	 */ 
	 private static native void dstRect0(ByteBuffer ptr, VkRect2D _dstRect);/*
		  VkDisplayPresentInfoKHR _obj = (VkDisplayPresentInfoKHR)(*ptr);
		  _obj.dstRect = (VkRect2D) (_dstRect);
	  */

	/**
	 * get method for field dstRect
	 * Prototype: VkRect2D  dstRect
	 */ 
	 private static native VkRect2D dstRect0(ByteBuffer ptr);/*
		  VkDisplayPresentInfoKHR _obj = (VkDisplayPresentInfoKHR)(ptr);
		  return (VkRect2D) (_obj.VkRect2D);
	 */

	/**
	 * native Set method for field persistent
	 * Prototype: VkBool32  persistent
	 */ 
	 private static native void persistent0(ByteBuffer ptr, boolean _persistent);/*
		  VkDisplayPresentInfoKHR _obj = (VkDisplayPresentInfoKHR)(*ptr);
		  _obj.persistent = (VkBool32) (_persistent);
	  */

	/**
	 * get method for field persistent
	 * Prototype: VkBool32  persistent
	 */ 
	 private static native boolean persistent0(ByteBuffer ptr);/*
		  VkDisplayPresentInfoKHR _obj = (VkDisplayPresentInfoKHR)(ptr);
		  return (jboolean) (_obj.VkBool32);
	 */



} // end of class VkDisplayPresentInfoKHR
