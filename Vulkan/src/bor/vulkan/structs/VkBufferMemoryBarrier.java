/**
 * Class wrapping Vulkan's VkBufferMemoryBarrier struct.
 * 
 * Bor_Vulkan Project Ver. 0.8.01 (beta)
 * Licence terms: 
 * The MIT License (MIT)
 * Copyright (c) 2016 Alessandro Borges
 * See https://opensource.org/licenses/MIT 
 */
package bor.vulkan.structs;

import bor.vulkan.*;
import bor.vulkan.enumerations.*;
import bor.vulkan.structs.*;
import java.nio.ByteBuffer;


/**
 *  Class for Java-Vulkan integration 
 *  This class is a Java front end for struct VkBufferMemoryBarrier. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkBufferMemoryBarrier {
 *     VkStructureType    sType;
 *     const void*        pNext;
 *     VkAccessFlags      srcAccessMask;
 *     VkAccessFlags      dstAccessMask;
 *     uint32_t           srcQueueFamilyIndex;
 *     uint32_t           dstQueueFamilyIndex;
 *     VkBuffer           buffer;
 *     VkDeviceSize       offset;
 *     VkDeviceSize       size;
 * } VkBufferMemoryBarrier;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.01 (beta) 
 */
public class VkBufferMemoryBarrier extends VkStruct {
	/** TAG of this structure [224]  */
	 private static final String TAG = "VkBufferMemoryBarrier";

	/** ID of this structure [224]  */
	 public static final int TAG_ID = VKBUFFERMEMORYBARRIER_ID;

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
	 *  VkAccessFlags 	srcAccessMask 
	 */ 
	int 	srcAccessMask;

	/**
	 *  VkAccessFlags 	dstAccessMask 
	 */ 
	int 	dstAccessMask;

	/**
	 *  uint32_t 	srcQueueFamilyIndex 
	 */ 
	int 	srcQueueFamilyIndex;

	/**
	 *  uint32_t 	dstQueueFamilyIndex 
	 */ 
	int 	dstQueueFamilyIndex;

	/**
	 *  VkBuffer 	buffer 
	 */ 
	VkBuffer 	buffer;

	/**
	 *  VkDeviceSize 	offset 
	 */ 
	long 	offset;

	/**
	 *  VkDeviceSize 	size 
	 */ 
	long 	size;

	/**
	 * Ctor
	 */
	public VkBufferMemoryBarrier(){ 
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

	/**
	 * Set method for field srcQueueFamilyIndex
	 * Prototype: uint32_t  srcQueueFamilyIndex
	 */ 
	 public void srcQueueFamilyIndex(int srcQueueFamilyIndex){
		 this.srcQueueFamilyIndex = srcQueueFamilyIndex;
		srcQueueFamilyIndex0(super.ptr, srcQueueFamilyIndex);
	 }

	/**
	 * get method for field srcQueueFamilyIndex
	 * Prototype: uint32_t  srcQueueFamilyIndex
	 */ 
	 public int srcQueueFamilyIndex(){
		 // return  this.srcQueueFamilyIndex;
		 return srcQueueFamilyIndex0(super.ptr);
	 }

	/**
	 * Set method for field dstQueueFamilyIndex
	 * Prototype: uint32_t  dstQueueFamilyIndex
	 */ 
	 public void dstQueueFamilyIndex(int dstQueueFamilyIndex){
		 this.dstQueueFamilyIndex = dstQueueFamilyIndex;
		dstQueueFamilyIndex0(super.ptr, dstQueueFamilyIndex);
	 }

	/**
	 * get method for field dstQueueFamilyIndex
	 * Prototype: uint32_t  dstQueueFamilyIndex
	 */ 
	 public int dstQueueFamilyIndex(){
		 // return  this.dstQueueFamilyIndex;
		 return dstQueueFamilyIndex0(super.ptr);
	 }

	/**
	 * Set method for field buffer
	 * Prototype: VkBuffer  buffer
	 */ 
	 public void buffer(VkBuffer buffer){
		 this.buffer = buffer;
		buffer0(super.ptr, buffer);
	 }

	/**
	 * get method for field buffer
	 * Prototype: VkBuffer  buffer
	 */ 
	 public VkBuffer buffer(){
		 // return  this.buffer;
		 return buffer0(super.ptr);
	 }

	/**
	 * Set method for field offset
	 * Prototype: VkDeviceSize  offset
	 */ 
	 public void offset(long offset){
		 this.offset = offset;
		offset0(super.ptr, offset);
	 }

	/**
	 * get method for field offset
	 * Prototype: VkDeviceSize  offset
	 */ 
	 public long offset(){
		 // return  this.offset;
		 return offset0(super.ptr);
	 }

	/**
	 * Set method for field size
	 * Prototype: VkDeviceSize  size
	 */ 
	 public void size(long size){
		 this.size = size;
		size0(super.ptr, size);
	 }

	/**
	 * get method for field size
	 * Prototype: VkDeviceSize  size
	 */ 
	 public long size(){
		 // return  this.size;
		 return size0(super.ptr);
	 }


	 // ////////////////////////////////
	 // native SETTERS & GETTERS //
	 // ////////////////////////////////
	/**
	 * native Set method for field sType
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native void sType0(ByteBuffer ptr, VkStructureType _sType);/*
		  VkBufferMemoryBarrier _obj = (VkBufferMemoryBarrier)(*ptr);
		  _obj.sType = (VkStructureType) (_sType);
	  */

	/**
	 * get method for field sType
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native VkStructureType sType0(ByteBuffer ptr);/*
		  VkBufferMemoryBarrier _obj = (VkBufferMemoryBarrier)(ptr);
		  return (VkStructureType) (_obj.VkStructureType);
	 */

	/**
	 * native Set method for field pNext
	 * Prototype: const void*  pNext
	 */ 
	 private static native void pNext0(ByteBuffer ptr, P<VkObject> _pNext);/*
		  VkBufferMemoryBarrier _obj = (VkBufferMemoryBarrier)(*ptr);
		  _obj.pNext = (const void*) (_pNext);
	  */

	/**
	 * get method for field pNext
	 * Prototype: const void*  pNext
	 */ 
	 private static native P<VkObject> pNext0(ByteBuffer ptr);/*
		  VkBufferMemoryBarrier _obj = (VkBufferMemoryBarrier)(ptr);
		  return (P<VkObject>) (_obj.const void*);
	 */

	/**
	 * native Set method for field srcAccessMask
	 * Prototype: VkAccessFlags  srcAccessMask
	 */ 
	 private static native void srcAccessMask0(ByteBuffer ptr, int _srcAccessMask);/*
		  VkBufferMemoryBarrier _obj = (VkBufferMemoryBarrier)(*ptr);
		  _obj.srcAccessMask = (VkAccessFlags) (_srcAccessMask);
	  */

	/**
	 * get method for field srcAccessMask
	 * Prototype: VkAccessFlags  srcAccessMask
	 */ 
	 private static native int srcAccessMask0(ByteBuffer ptr);/*
		  VkBufferMemoryBarrier _obj = (VkBufferMemoryBarrier)(ptr);
		  return (jint) (_obj.VkAccessFlags);
	 */

	/**
	 * native Set method for field dstAccessMask
	 * Prototype: VkAccessFlags  dstAccessMask
	 */ 
	 private static native void dstAccessMask0(ByteBuffer ptr, int _dstAccessMask);/*
		  VkBufferMemoryBarrier _obj = (VkBufferMemoryBarrier)(*ptr);
		  _obj.dstAccessMask = (VkAccessFlags) (_dstAccessMask);
	  */

	/**
	 * get method for field dstAccessMask
	 * Prototype: VkAccessFlags  dstAccessMask
	 */ 
	 private static native int dstAccessMask0(ByteBuffer ptr);/*
		  VkBufferMemoryBarrier _obj = (VkBufferMemoryBarrier)(ptr);
		  return (jint) (_obj.VkAccessFlags);
	 */

	/**
	 * native Set method for field srcQueueFamilyIndex
	 * Prototype: uint32_t  srcQueueFamilyIndex
	 */ 
	 private static native void srcQueueFamilyIndex0(ByteBuffer ptr, int _srcQueueFamilyIndex);/*
		  VkBufferMemoryBarrier _obj = (VkBufferMemoryBarrier)(*ptr);
		  _obj.srcQueueFamilyIndex = (uint32_t) (_srcQueueFamilyIndex);
	  */

	/**
	 * get method for field srcQueueFamilyIndex
	 * Prototype: uint32_t  srcQueueFamilyIndex
	 */ 
	 private static native int srcQueueFamilyIndex0(ByteBuffer ptr);/*
		  VkBufferMemoryBarrier _obj = (VkBufferMemoryBarrier)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native Set method for field dstQueueFamilyIndex
	 * Prototype: uint32_t  dstQueueFamilyIndex
	 */ 
	 private static native void dstQueueFamilyIndex0(ByteBuffer ptr, int _dstQueueFamilyIndex);/*
		  VkBufferMemoryBarrier _obj = (VkBufferMemoryBarrier)(*ptr);
		  _obj.dstQueueFamilyIndex = (uint32_t) (_dstQueueFamilyIndex);
	  */

	/**
	 * get method for field dstQueueFamilyIndex
	 * Prototype: uint32_t  dstQueueFamilyIndex
	 */ 
	 private static native int dstQueueFamilyIndex0(ByteBuffer ptr);/*
		  VkBufferMemoryBarrier _obj = (VkBufferMemoryBarrier)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native Set method for field buffer
	 * Prototype: VkBuffer  buffer
	 */ 
	 private static native void buffer0(ByteBuffer ptr, VkBuffer _buffer);/*
		  VkBufferMemoryBarrier _obj = (VkBufferMemoryBarrier)(*ptr);
		  _obj.buffer = (VkBuffer) (_buffer);
	  */

	/**
	 * get method for field buffer
	 * Prototype: VkBuffer  buffer
	 */ 
	 private static native VkBuffer buffer0(ByteBuffer ptr);/*
		  VkBufferMemoryBarrier _obj = (VkBufferMemoryBarrier)(ptr);
		  return (VkBuffer) (_obj.VkBuffer);
	 */

	/**
	 * native Set method for field offset
	 * Prototype: VkDeviceSize  offset
	 */ 
	 private static native void offset0(ByteBuffer ptr, long _offset);/*
		  VkBufferMemoryBarrier _obj = (VkBufferMemoryBarrier)(*ptr);
		  _obj.offset = (VkDeviceSize) (_offset);
	  */

	/**
	 * get method for field offset
	 * Prototype: VkDeviceSize  offset
	 */ 
	 private static native long offset0(ByteBuffer ptr);/*
		  VkBufferMemoryBarrier _obj = (VkBufferMemoryBarrier)(ptr);
		  return (jlong) (_obj.VkDeviceSize);
	 */

	/**
	 * native Set method for field size
	 * Prototype: VkDeviceSize  size
	 */ 
	 private static native void size0(ByteBuffer ptr, long _size);/*
		  VkBufferMemoryBarrier _obj = (VkBufferMemoryBarrier)(*ptr);
		  _obj.size = (VkDeviceSize) (_size);
	  */

	/**
	 * get method for field size
	 * Prototype: VkDeviceSize  size
	 */ 
	 private static native long size0(ByteBuffer ptr);/*
		  VkBufferMemoryBarrier _obj = (VkBufferMemoryBarrier)(ptr);
		  return (jlong) (_obj.VkDeviceSize);
	 */



} // end of class VkBufferMemoryBarrier
