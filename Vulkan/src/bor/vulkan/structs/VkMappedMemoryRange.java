// class wrapping Vulkan's VkMappedMemoryRange struct.
package bor.vulkan.structs;

import bor.vulkan.*;
import bor.vulkan.enumerations.*;
import java.nio.ByteBuffer;


/**
 *  Class for Java-Vulkan integration 
 *  This class is a Java front end for struct VkMappedMemoryRange 
 * @Author Alessandro Borges 
 */
public class VkMappedMemoryRange extends VkStruct {
	/** ID of this structure [21]  */
	 public static final int TAG = VKMAPPEDMEMORYRANGE_ID;

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
	 *  VkDeviceMemory 	memory 
	 */ 
	VkDeviceMemory 	memory;

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
	public VkMappedMemoryRange(){ 
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
	 * Set method for field memory
	 * Prototype: VkDeviceMemory  memory
	 */ 
	 public void memory(VkDeviceMemory memory){
		 this.memory = memory;
		memory0(super.ptr, memory);
	 }

	/**
	 * get method for field memory
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
	 * native Set method for field sType
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native void sType0(ByteBuffer ptr, VkStructureType _sType);/*
		  VkMappedMemoryRange _obj = (VkMappedMemoryRange)(*ptr);
		  _obj.sType = (VkStructureType) (_sType);
	  */

	/**
	 * get method for field sType
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
	 private static native void pNext0(ByteBuffer ptr, VkObject _pNext);/*
		  VkMappedMemoryRange _obj = (VkMappedMemoryRange)(*ptr);
		  _obj.pNext = (const void*) (_pNext);
	  */

	/**
	 * get method for field pNext
	 * Prototype: const void*  pNext
	 */ 
	 private static native VkObject pNext0(ByteBuffer ptr);/*
		  VkMappedMemoryRange _obj = (VkMappedMemoryRange)(ptr);
		  return (VkObject) (_obj.const void*);
	 */

	/**
	 * native Set method for field memory
	 * Prototype: VkDeviceMemory  memory
	 */ 
	 private static native void memory0(ByteBuffer ptr, VkDeviceMemory _memory);/*
		  VkMappedMemoryRange _obj = (VkMappedMemoryRange)(*ptr);
		  _obj.memory = (VkDeviceMemory) (_memory);
	  */

	/**
	 * get method for field memory
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
