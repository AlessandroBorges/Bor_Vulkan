/**
 * Class wrapping Vulkan's VkSparseImageMemoryBind struct.
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
 *  This class is a Java front end for struct VkSparseImageMemoryBind. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkSparseImageMemoryBind {
 *     VkImageSubresource         subresource;
 *     VkOffset3D                 offset;
 *     VkExtent3D                 extent;
 *     VkDeviceMemory             memory;
 *     VkDeviceSize               memoryOffset;
 *     VkSparseMemoryBindFlags    flags;
 * } VkSparseImageMemoryBind;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.01 (beta) 
 */
public class VkSparseImageMemoryBind extends VkStruct {
	/** TAG of this structure [154]  */
	 private static final String TAG = "VkSparseImageMemoryBind";

	/** ID of this structure [154]  */
	 public static final int TAG_ID = VKSPARSEIMAGEMEMORYBIND_ID;

	 // fields //
	/**
	 *  VkImageSubresource 	subresource	[vkstruct]	 */ 
	VkImageSubresource 	subresource;

	/**
	 *  VkOffset3D 	offset	[vkstruct]	 */ 
	VkOffset3D 	offset;

	/**
	 *  VkExtent3D 	extent	[vkstruct]	 */ 
	VkExtent3D 	extent;

	/**
	 *  VkDeviceMemory 	memory	[vkhandle]	 */ 
	VkDeviceMemory 	memory;

	/**
	 *  VkDeviceSize 	memoryOffset		 */ 
	long 	memoryOffset;

	/**
	 *  VkSparseMemoryBindFlags 	flags		 */ 
	int 	flags;

	/**
	 * Ctor
	 */
	public VkSparseImageMemoryBind(){ 
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
	 * Set method for field subresource	[vkstruct]
	 * Prototype: VkImageSubresource  subresource
	 */ 
	 public void subresource(VkImageSubresource subresource){
		 this.subresource = subresource;
		subresource0(super.ptr, subresource);
	 }

	/**
	 * get method for field subresource	[vkstruct]
	 * Prototype: VkImageSubresource  subresource
	 */ 
	 public VkImageSubresource subresource(){
		 // return  this.subresource;
		 return subresource0(super.ptr);
	 }

	/**
	 * Set method for field offset	[vkstruct]
	 * Prototype: VkOffset3D  offset
	 */ 
	 public void offset(VkOffset3D offset){
		 this.offset = offset;
		offset0(super.ptr, offset);
	 }

	/**
	 * get method for field offset	[vkstruct]
	 * Prototype: VkOffset3D  offset
	 */ 
	 public VkOffset3D offset(){
		 // return  this.offset;
		 return offset0(super.ptr);
	 }

	/**
	 * Set method for field extent	[vkstruct]
	 * Prototype: VkExtent3D  extent
	 */ 
	 public void extent(VkExtent3D extent){
		 this.extent = extent;
		extent0(super.ptr, extent);
	 }

	/**
	 * get method for field extent	[vkstruct]
	 * Prototype: VkExtent3D  extent
	 */ 
	 public VkExtent3D extent(){
		 // return  this.extent;
		 return extent0(super.ptr);
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
	 * native Set method for field subresource	[vkstruct]
	 * Prototype: VkImageSubresource  subresource
	 */ 
	 private static native void subresource0(ByteBuffer ptr, VkImageSubresource _subresource);/*
		  VkSparseImageMemoryBind _obj = (VkSparseImageMemoryBind)(*ptr);
		  _obj.subresource = (VkImageSubresource) (_subresource);
	  */

	/**
	 * get method for field subresource	[vkstruct]
	 * Prototype: VkImageSubresource  subresource
	 */ 
	 private static native VkImageSubresource subresource0(ByteBuffer ptr);/*
		  VkSparseImageMemoryBind _obj = (VkSparseImageMemoryBind)(ptr);
		  return (VkImageSubresource) (_obj.VkImageSubresource);
	 */

	/**
	 * native Set method for field offset	[vkstruct]
	 * Prototype: VkOffset3D  offset
	 */ 
	 private static native void offset0(ByteBuffer ptr, VkOffset3D _offset);/*
		  VkSparseImageMemoryBind _obj = (VkSparseImageMemoryBind)(*ptr);
		  _obj.offset = (VkOffset3D) (_offset);
	  */

	/**
	 * get method for field offset	[vkstruct]
	 * Prototype: VkOffset3D  offset
	 */ 
	 private static native VkOffset3D offset0(ByteBuffer ptr);/*
		  VkSparseImageMemoryBind _obj = (VkSparseImageMemoryBind)(ptr);
		  return (VkOffset3D) (_obj.VkOffset3D);
	 */

	/**
	 * native Set method for field extent	[vkstruct]
	 * Prototype: VkExtent3D  extent
	 */ 
	 private static native void extent0(ByteBuffer ptr, VkExtent3D _extent);/*
		  VkSparseImageMemoryBind _obj = (VkSparseImageMemoryBind)(*ptr);
		  _obj.extent = (VkExtent3D) (_extent);
	  */

	/**
	 * get method for field extent	[vkstruct]
	 * Prototype: VkExtent3D  extent
	 */ 
	 private static native VkExtent3D extent0(ByteBuffer ptr);/*
		  VkSparseImageMemoryBind _obj = (VkSparseImageMemoryBind)(ptr);
		  return (VkExtent3D) (_obj.VkExtent3D);
	 */

	/**
	 * native Set method for field memory	[vkhandle]
	 * Prototype: VkDeviceMemory  memory
	 */ 
	 private static native void memory0(ByteBuffer ptr, VkDeviceMemory _memory);/*
		  VkSparseImageMemoryBind _obj = (VkSparseImageMemoryBind)(*ptr);
		  _obj.memory = (VkDeviceMemory) (_memory);
	  */

	/**
	 * get method for field memory	[vkhandle]
	 * Prototype: VkDeviceMemory  memory
	 */ 
	 private static native VkDeviceMemory memory0(ByteBuffer ptr);/*
		  VkSparseImageMemoryBind _obj = (VkSparseImageMemoryBind)(ptr);
		  return (VkDeviceMemory) (_obj.VkDeviceMemory);
	 */

	/**
	 * native Set method for field memoryOffset	
	 * Prototype: VkDeviceSize  memoryOffset
	 */ 
	 private static native void memoryOffset0(ByteBuffer ptr, long _memoryOffset);/*
		  VkSparseImageMemoryBind _obj = (VkSparseImageMemoryBind)(*ptr);
		  _obj.memoryOffset = (VkDeviceSize) (_memoryOffset);
	  */

	/**
	 * get method for field memoryOffset	
	 * Prototype: VkDeviceSize  memoryOffset
	 */ 
	 private static native long memoryOffset0(ByteBuffer ptr);/*
		  VkSparseImageMemoryBind _obj = (VkSparseImageMemoryBind)(ptr);
		  return (jlong) (_obj.VkDeviceSize);
	 */

	/**
	 * native Set method for field flags	
	 * Prototype: VkSparseMemoryBindFlags  flags
	 */ 
	 private static native void flags0(ByteBuffer ptr, int _flags);/*
		  VkSparseImageMemoryBind _obj = (VkSparseImageMemoryBind)(*ptr);
		  _obj.flags = (VkSparseMemoryBindFlags) (_flags);
	  */

	/**
	 * get method for field flags	
	 * Prototype: VkSparseMemoryBindFlags  flags
	 */ 
	 private static native int flags0(ByteBuffer ptr);/*
		  VkSparseImageMemoryBind _obj = (VkSparseImageMemoryBind)(ptr);
		  return (jint) (_obj.VkSparseMemoryBindFlags);
	 */



} // end of class VkSparseImageMemoryBind
