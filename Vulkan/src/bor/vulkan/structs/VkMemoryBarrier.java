// class wrapping Vulkan's VkMemoryBarrier struct.
package bor.vulkan.structs;

import bor.vulkan.*;
import bor.vulkan.enumerations.*;
import java.nio.ByteBuffer;


/**
 *  Class for Java-Vulkan integration 
 *  This class is a Java front end for struct VkMemoryBarrier 
 * @Author Alessandro Borges 
 */
public class VkMemoryBarrier extends VkStruct {
	/** ID of this structure [99]  */
	 public static final int TAG = VKMEMORYBARRIER_ID;

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
	 *  VkAccessFlags 	srcAccessMask 
	 */ 
	int 	srcAccessMask;

	/**
	 *  VkAccessFlags 	dstAccessMask 
	 */ 
	int 	dstAccessMask;

	/**
	 * Ctor
	 */
	public VkMemoryBarrier(){ 
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
	 * Set method for field srcAccessMask
	 * Prototype: VkAccessFlags  srcAccessMask
	 */ 
	 public void srcAccessMask(int srcAccessMask){
		 this.srcAccessMask = srcAccessMask;
		srcAccessMask0(super.ptr, srcAccessMask);
	 }

	/**
	 * get method for field srcAccessMask
	 * Prototype: VkAccessFlags  srcAccessMask
	 */ 
	 public int srcAccessMask(){
		 // return  this.srcAccessMask;
		 return srcAccessMask0(super.ptr);
	 }

	/**
	 * Set method for field dstAccessMask
	 * Prototype: VkAccessFlags  dstAccessMask
	 */ 
	 public void dstAccessMask(int dstAccessMask){
		 this.dstAccessMask = dstAccessMask;
		dstAccessMask0(super.ptr, dstAccessMask);
	 }

	/**
	 * get method for field dstAccessMask
	 * Prototype: VkAccessFlags  dstAccessMask
	 */ 
	 public int dstAccessMask(){
		 // return  this.dstAccessMask;
		 return dstAccessMask0(super.ptr);
	 }


	 // ////////////////////////////////
	 // native SETTERS & GETTERS //
	 // ////////////////////////////////
	/**
	 * native Set method for field sType
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native void sType0(ByteBuffer ptr, VkStructureType _sType);/*
		  VkMemoryBarrier _obj = (VkMemoryBarrier)(*ptr);
		  _obj.sType = (VkStructureType) (_sType);
	  */

	/**
	 * get method for field sType
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native VkStructureType sType0(ByteBuffer ptr);/*
		  VkMemoryBarrier _obj = (VkMemoryBarrier)(ptr);
		  return (VkStructureType) (_obj.VkStructureType);
	 */

	/**
	 * native Set method for field pNext
	 * Prototype: const void*  pNext
	 */ 
	 private static native void pNext0(ByteBuffer ptr, VkObject _pNext);/*
		  VkMemoryBarrier _obj = (VkMemoryBarrier)(*ptr);
		  _obj.pNext = (const void*) (_pNext);
	  */

	/**
	 * get method for field pNext
	 * Prototype: const void*  pNext
	 */ 
	 private static native VkObject pNext0(ByteBuffer ptr);/*
		  VkMemoryBarrier _obj = (VkMemoryBarrier)(ptr);
		  return (VkObject) (_obj.const void*);
	 */

	/**
	 * native Set method for field srcAccessMask
	 * Prototype: VkAccessFlags  srcAccessMask
	 */ 
	 private static native void srcAccessMask0(ByteBuffer ptr, int _srcAccessMask);/*
		  VkMemoryBarrier _obj = (VkMemoryBarrier)(*ptr);
		  _obj.srcAccessMask = (VkAccessFlags) (_srcAccessMask);
	  */

	/**
	 * get method for field srcAccessMask
	 * Prototype: VkAccessFlags  srcAccessMask
	 */ 
	 private static native int srcAccessMask0(ByteBuffer ptr);/*
		  VkMemoryBarrier _obj = (VkMemoryBarrier)(ptr);
		  return (jint) (_obj.VkAccessFlags);
	 */

	/**
	 * native Set method for field dstAccessMask
	 * Prototype: VkAccessFlags  dstAccessMask
	 */ 
	 private static native void dstAccessMask0(ByteBuffer ptr, int _dstAccessMask);/*
		  VkMemoryBarrier _obj = (VkMemoryBarrier)(*ptr);
		  _obj.dstAccessMask = (VkAccessFlags) (_dstAccessMask);
	  */

	/**
	 * get method for field dstAccessMask
	 * Prototype: VkAccessFlags  dstAccessMask
	 */ 
	 private static native int dstAccessMask0(ByteBuffer ptr);/*
		  VkMemoryBarrier _obj = (VkMemoryBarrier)(ptr);
		  return (jint) (_obj.VkAccessFlags);
	 */



} // end of class VkMemoryBarrier
