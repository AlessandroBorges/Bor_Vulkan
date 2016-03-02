/**
 * Class wrapping Vulkan's VkMappedMemoryRange struct.
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
 *  This class is a Java front end for struct VkMappedMemoryRange. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkMappedMemoryRange {
 *     VkStructureType    sType;
 *     const void*        pNext;
 *     VkDeviceMemory     memory;
 *     VkDeviceSize       offset;
 *     VkDeviceSize       size;
 * } VkMappedMemoryRange;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.01 (beta) 
 */
public class VkMappedMemoryRange extends VkStruct {
	/** TAG of this structure [145]  */
	 private static final String TAG = "VkMappedMemoryRange";

	/** ID of this structure [145]  */
	 public static final int TAG_ID = VKMAPPEDMEMORYRANGE_ID;

	 // fields //
	/**
	 *  VkStructureType 	sType	[vkenum]	 */ 
	VkStructureType 	sType;

	/**
	 *  const void* 	pNext		 */ 
	P<VkObject> 	pNext;

	/**
	 *  VkDeviceMemory 	memory	[vkhandle]	 */ 
	VkDeviceMemory 	memory;

	/**
	 *  VkDeviceSize 	offset		 */ 
	long 	offset;

	/**
	 *  VkDeviceSize 	size		 */ 
	long 	size;

	/**
	 * Ctor
	 */
	public VkMappedMemoryRange(){ 
		 super(sizeOf()); 
	 }

	/** 
	 * Method to get native size of this structure 
	 */
	 public static int sizeOf(){ 
		 return sizeOf(TAG_ID); 
	}


	 ////////////////////////
	 //  SETTERS & GETTERS //
	 ////////////////////////

	/**
	 * Set method for field sType	[vkenum]
	 * Prototype: VkStructureType  sType
	 */ 
	 public void sType(VkStructureType sType){
		 this.sType = sType;
		sType0(super.ptr, sType);
	 }

	/**
	 * get method for field sType	[vkenum]
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
	 * Set method for field memory	[vkhandle]
	 * Prototype: VkDeviceMemory  memory
	 */ 
	 public void memory(VkDeviceMemory memory){
		 this.memory = memory;
		memory0(super.ptr, memory);
	 }

	/**
	 * get method for field memory	[vkhandle]
	 * Prototype: VkDeviceMemory  memory
	 */ 
	 public VkDeviceMemory memory(){
		 // return  this.memory;
		 return memory0(super.ptr);
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
	 * native Set method for field sType	[vkenum]
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native void sType0(ByteBuffer ptr, VkStructureType _sType);/*
		  VkMappedMemoryRange _obj = (VkMappedMemoryRange)(*ptr);
		  _obj.sType = (VkStructureType) (_sType);
	  */

	/**
	 * get method for field sType	[vkenum]
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native VkStructureType sType0(ByteBuffer ptr);/*
		  VkMappedMemoryRange _obj = (VkMappedMemoryRange)(ptr);
		  return (VkStructureType) (_obj.VkStructureType);
	 */

	/**
	 * native Set method for field pNext	
	 * Prototype: const void*  pNext
	 */ 
	 private static native void pNext0(ByteBuffer ptr, P<VkObject> _pNext);/*
		  VkMappedMemoryRange _obj = (VkMappedMemoryRange)(*ptr);
		  _obj.pNext = (const void*) (_pNext);
	  */

	/**
	 * get method for field pNext	
	 * Prototype: const void*  pNext
	 */ 
	 private static native P<VkObject> pNext0(ByteBuffer ptr);/*
		  VkMappedMemoryRange _obj = (VkMappedMemoryRange)(ptr);
		  return (P<VkObject>) (_obj.const void*);
	 */

	/**
	 * native Set method for field memory	[vkhandle]
	 * Prototype: VkDeviceMemory  memory
	 */ 
	 private static native void memory0(ByteBuffer ptr, VkDeviceMemory _memory);/*
		  VkMappedMemoryRange _obj = (VkMappedMemoryRange)(*ptr);
		  _obj.memory = (VkDeviceMemory) (_memory);
	  */

	/**
	 * get method for field memory	[vkhandle]
	 * Prototype: VkDeviceMemory  memory
	 */ 
	 private static native VkDeviceMemory memory0(ByteBuffer ptr);/*
		  VkMappedMemoryRange _obj = (VkMappedMemoryRange)(ptr);
		  return (VkDeviceMemory) (_obj.VkDeviceMemory);
	 */

	/**
	 * native Set method for field offset	
	 * Prototype: VkDeviceSize  offset
	 */ 
	 private static native void offset0(ByteBuffer ptr, long _offset);/*
		  VkMappedMemoryRange _obj = (VkMappedMemoryRange)(*ptr);
		  _obj.offset = (VkDeviceSize) (_offset);
	  */

	/**
	 * get method for field offset	
	 * Prototype: VkDeviceSize  offset
	 */ 
	 private static native long offset0(ByteBuffer ptr);/*
		  VkMappedMemoryRange _obj = (VkMappedMemoryRange)(ptr);
		  return (jlong) (_obj.VkDeviceSize);
	 */

	/**
	 * native Set method for field size	
	 * Prototype: VkDeviceSize  size
	 */ 
	 private static native void size0(ByteBuffer ptr, long _size);/*
		  VkMappedMemoryRange _obj = (VkMappedMemoryRange)(*ptr);
		  _obj.size = (VkDeviceSize) (_size);
	  */

	/**
	 * get method for field size	
	 * Prototype: VkDeviceSize  size
	 */ 
	 private static native long size0(ByteBuffer ptr);/*
		  VkMappedMemoryRange _obj = (VkMappedMemoryRange)(ptr);
		  return (jlong) (_obj.VkDeviceSize);
	 */



} // end of class VkMappedMemoryRange
