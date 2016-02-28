/**
 * Class wrapping Vulkan's VkSparseMemoryBind struct.
 * 
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
 *  This class is a Java front end for struct VkSparseMemoryBind 
 *  <h3>ProtoType:</h3>
 * <pre>
 * typedef struct VkSparseMemoryBind {
 *     VkDeviceSize               resourceOffset;
 *     VkDeviceSize               size;
 *     VkDeviceMemory             memory;
 *     VkDeviceSize               memoryOffset;
 *     VkSparseMemoryBindFlags    flags;
 * } VkSparseMemoryBind;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version 0.8.01
 */
public class VkSparseMemoryBind extends VkStruct {
	/** TAG of this structure [149]  */
	 private static final String TAG = "VkSparseMemoryBind";

	/** ID of this structure [149]  */
	 public static final int TAG_ID = VKSPARSEMEMORYBIND_ID;

	 // fields //
	/**
	 *  VkDeviceSize 	resourceOffset 
	 */ 
	long 	resourceOffset;

	/**
	 *  VkDeviceSize 	size 
	 */ 
	long 	size;

	/**
	 *  VkDeviceMemory 	memory 
	 */ 
	VkDeviceMemory 	memory;

	/**
	 *  VkDeviceSize 	memoryOffset 
	 */ 
	long 	memoryOffset;

	/**
	 *  VkSparseMemoryBindFlags 	flags 
	 */ 
	int 	flags;

	/**
	 * Ctor
	 */
	public VkSparseMemoryBind(){ 
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
	 * Set method for field resourceOffset
	 * Prototype: VkDeviceSize  resourceOffset
	 */ 
	 public void resourceOffset(long resourceOffset){
		 this.resourceOffset = resourceOffset;
		resourceOffset0(super.ptr, resourceOffset);
	 }

	/**
	 * get method for field resourceOffset
	 * Prototype: VkDeviceSize  resourceOffset
	 */ 
	 public long resourceOffset(){
		 // return  this.resourceOffset;
		 return resourceOffset0(super.ptr);
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
	 * Set method for field memoryOffset
	 * Prototype: VkDeviceSize  memoryOffset
	 */ 
	 public void memoryOffset(long memoryOffset){
		 this.memoryOffset = memoryOffset;
		memoryOffset0(super.ptr, memoryOffset);
	 }

	/**
	 * get method for field memoryOffset
	 * Prototype: VkDeviceSize  memoryOffset
	 */ 
	 public long memoryOffset(){
		 // return  this.memoryOffset;
		 return memoryOffset0(super.ptr);
	 }

	/**
	 * Set method for field flags
	 * Prototype: VkSparseMemoryBindFlags  flags
	 */ 
	 public void flags(int flags){
		 this.flags = flags;
		flags0(super.ptr, flags);
	 }

	/**
	 * get method for field flags
	 * Prototype: VkSparseMemoryBindFlags  flags
	 */ 
	 public int flags(){
		 // return  this.flags;
		 return flags0(super.ptr);
	 }


	 // ////////////////////////////////
	 // native SETTERS & GETTERS //
	 // ////////////////////////////////
	/**
	 * native Set method for field resourceOffset
	 * Prototype: VkDeviceSize  resourceOffset
	 */ 
	 private static native void resourceOffset0(ByteBuffer ptr, long _resourceOffset);/*
		  VkSparseMemoryBind _obj = (VkSparseMemoryBind)(*ptr);
		  _obj.resourceOffset = (VkDeviceSize) (_resourceOffset);
	  */

	/**
	 * get method for field resourceOffset
	 * Prototype: VkDeviceSize  resourceOffset
	 */ 
	 private static native long resourceOffset0(ByteBuffer ptr);/*
		  VkSparseMemoryBind _obj = (VkSparseMemoryBind)(ptr);
		  return (jlong) (_obj.VkDeviceSize);
	 */

	/**
	 * native Set method for field size
	 * Prototype: VkDeviceSize  size
	 */ 
	 private static native void size0(ByteBuffer ptr, long _size);/*
		  VkSparseMemoryBind _obj = (VkSparseMemoryBind)(*ptr);
		  _obj.size = (VkDeviceSize) (_size);
	  */

	/**
	 * get method for field size
	 * Prototype: VkDeviceSize  size
	 */ 
	 private static native long size0(ByteBuffer ptr);/*
		  VkSparseMemoryBind _obj = (VkSparseMemoryBind)(ptr);
		  return (jlong) (_obj.VkDeviceSize);
	 */

	/**
	 * native Set method for field memory
	 * Prototype: VkDeviceMemory  memory
	 */ 
	 private static native void memory0(ByteBuffer ptr, VkDeviceMemory _memory);/*
		  VkSparseMemoryBind _obj = (VkSparseMemoryBind)(*ptr);
		  _obj.memory = (VkDeviceMemory) (_memory);
	  */

	/**
	 * get method for field memory
	 * Prototype: VkDeviceMemory  memory
	 */ 
	 private static native VkDeviceMemory memory0(ByteBuffer ptr);/*
		  VkSparseMemoryBind _obj = (VkSparseMemoryBind)(ptr);
		  return (VkDeviceMemory) (_obj.VkDeviceMemory);
	 */

	/**
	 * native Set method for field memoryOffset
	 * Prototype: VkDeviceSize  memoryOffset
	 */ 
	 private static native void memoryOffset0(ByteBuffer ptr, long _memoryOffset);/*
		  VkSparseMemoryBind _obj = (VkSparseMemoryBind)(*ptr);
		  _obj.memoryOffset = (VkDeviceSize) (_memoryOffset);
	  */

	/**
	 * get method for field memoryOffset
	 * Prototype: VkDeviceSize  memoryOffset
	 */ 
	 private static native long memoryOffset0(ByteBuffer ptr);/*
		  VkSparseMemoryBind _obj = (VkSparseMemoryBind)(ptr);
		  return (jlong) (_obj.VkDeviceSize);
	 */

	/**
	 * native Set method for field flags
	 * Prototype: VkSparseMemoryBindFlags  flags
	 */ 
	 private static native void flags0(ByteBuffer ptr, int _flags);/*
		  VkSparseMemoryBind _obj = (VkSparseMemoryBind)(*ptr);
		  _obj.flags = (VkSparseMemoryBindFlags) (_flags);
	  */

	/**
	 * get method for field flags
	 * Prototype: VkSparseMemoryBindFlags  flags
	 */ 
	 private static native int flags0(ByteBuffer ptr);/*
		  VkSparseMemoryBind _obj = (VkSparseMemoryBind)(ptr);
		  return (jint) (_obj.VkSparseMemoryBindFlags);
	 */



} // end of class VkSparseMemoryBind
