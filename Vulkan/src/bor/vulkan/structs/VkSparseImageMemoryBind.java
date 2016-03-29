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

import java.nio.Buffer;


/**
 *  Project Bor-Vulkan 
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
	/** TAG of this structure [30]  */
	 private static final String TAG = "VkSparseImageMemoryBind";

	/** ID of this structure [30]  */
	 public static final int TAG_ID = VKSPARSEIMAGEMEMORYBIND_ID;

	/** P wrapper for THIS object */
	 private  P<VkSparseImageMemoryBind> p;

	 ///////////////////
	 // Struct fields //
	 ///////////////////
	/**
	 *  VkImageSubresource 	subresource	[vkstruct]
	 */ 
	 VkImageSubresource 	subresource;

	/**
	 *  VkOffset3D 	offset	[vkstruct]
	 */ 
	 VkOffset3D 	offset;

	/**
	 *  VkExtent3D 	extent	[vkstruct]
	 */ 
	 VkExtent3D 	extent;

	/**
	 *  VkDeviceMemory 	memory	[vkhandle]
	 */ 
	 VkDeviceMemory 	memory;

	/**
	 *  VkDeviceSize 	memoryOffset	[long]
	 */ 
	 long 	memoryOffset;

	/**
	 *  VkSparseMemoryBindFlags 	flags	[int]
	 */ 
	 int 	flags;

	/**
	 * Ctor
	 */
	public VkSparseImageMemoryBind(){ 
		 super(sizeOf()); 
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkSparseImageMemoryBind(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address and memSize
	 * @param address - native address 
	 * @param memSize - buffer size 
	 */
	 public VkSparseImageMemoryBind(long address, int memSize){ 
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
	 public static P<VkSparseImageMemoryBind> createNullPointer(){
	        P<VkSparseImageMemoryBind> p = new  P<VkSparseImageMemoryBind>(new VkSparseImageMemoryBind());
	        return p;
	    }


	/** 
	 * Return this VkObject instance wrapped in pointer P<br>
	 *
	 *  P&lt;? extends VkObject &gt;
	 *
	 * @return  a P container wrapping this object.
	 */
	 public P<VkSparseImageMemoryBind> getP() {
	       if(p == null ){
	           p = new P<VkSparseImageMemoryBind> (this);
	       }
	        return p;
	    }


	 ////////////////////////
	 //  SETTERS & GETTERS //
	 ////////////////////////

	/**
	 * Set method for field subresource	[vkstruct]<br>
	 * Prototype: VkImageSubresource  subresource
	 */ 
	 public void subresource(VkImageSubresource subresource){
		 this.subresource = subresource;
		 ByteBuffer buff = (subresource==null) ? null : subresource.getPointerStruct();
		 subresource0(this.ptr, buff);
	 }

	/**
	 * Get method for field subresource	[vkstruct]<br>
	 * Prototype: VkImageSubresource  subresource
	 */ 
	 public VkImageSubresource subresource(){
		 ByteBuffer pointer = subresource0(super.ptr);
		 if(pointer == null){
		    this.subresource = null;
		    return null;
		  } else 
 		 if(this.subresource == null){
		    this.subresource = new VkImageSubresource(pointer);
		 }else{
		    this.subresource.setPointer(pointer);
		  }
		 return this.subresource;
	 }

	/**
	 * Set method for field offset	[vkstruct]<br>
	 * Prototype: VkOffset3D  offset
	 */ 
	 public void offset(VkOffset3D offset){
		 this.offset = offset;
		 ByteBuffer buff = (offset==null) ? null : offset.getPointerStruct();
		 offset0(this.ptr, buff);
	 }

	/**
	 * Get method for field offset	[vkstruct]<br>
	 * Prototype: VkOffset3D  offset
	 */ 
	 public VkOffset3D offset(){
		 ByteBuffer pointer = offset0(super.ptr);
		 if(pointer == null){
		    this.offset = null;
		    return null;
		  } else 
 		 if(this.offset == null){
		    this.offset = new VkOffset3D(pointer);
		 }else{
		    this.offset.setPointer(pointer);
		  }
		 return this.offset;
	 }

	/**
	 * Set method for field extent	[vkstruct]<br>
	 * Prototype: VkExtent3D  extent
	 */ 
	 public void extent(VkExtent3D extent){
		 this.extent = extent;
		 ByteBuffer buff = (extent==null) ? null : extent.getPointerStruct();
		 extent0(this.ptr, buff);
	 }

	/**
	 * Get method for field extent	[vkstruct]<br>
	 * Prototype: VkExtent3D  extent
	 */ 
	 public VkExtent3D extent(){
		 ByteBuffer pointer = extent0(super.ptr);
		 if(pointer == null){
		    this.extent = null;
		    return null;
		  } else 
 		 if(this.extent == null){
		    this.extent = new VkExtent3D(pointer);
		 }else{
		    this.extent.setPointer(pointer);
		  }
		 return this.extent;
	 }

	/**
	 * Set method for field memory	[vkhandle]<br>
	 * Prototype: VkDeviceMemory  memory
	 */ 
	 public void memory(VkDeviceMemory memory){
		 this.memory = memory;
		 ByteBuffer buff = (memory==null) ? null : memory.getHandle();
		 memory0(this.ptr, buff);
	 }

	/**
	 * Get method for field memory	[vkhandle]<br>
	 * Prototype: VkDeviceMemory  memory
	 */ 
	 public VkDeviceMemory memory(){

		 ByteBuffer handle = memory0(super.ptr);
		 if(handle == null){
		    this.memory = null;
		    return null;
		  } else 
 		 if(this.memory == null){
		    this.memory = new VkHandle(handle);
		 }else{
		    ((VkHandle)this.memory).setHandle(handle);
		  }
		 return this.memory;
	 }

	/**
	 * Set method for field memoryOffset	[long]<br>
	 * Prototype: VkDeviceSize  memoryOffset
	 */ 
	 public void memoryOffset(long memoryOffset){
		 this.memoryOffset = memoryOffset;
		 memoryOffset0(this.ptr,  memoryOffset);
	 }

	/**
	 * Get method for field memoryOffset	[long]<br>
	 * Prototype: VkDeviceSize  memoryOffset
	 */ 
	 public long memoryOffset(){
		 long var = memoryOffset0(super.ptr);
		 this.memoryOffset = var;
		 return this.memoryOffset;
	 }

	/**
	 * Set method for field flags	[int]<br>
	 * Prototype: VkSparseMemoryBindFlags  flags
	 */ 
	 public void flags(int flags){
		 this.flags = flags;
		 flags0(this.ptr,  flags);
	 }

	/**
	 * Get method for field flags	[int]<br>
	 * Prototype: VkSparseMemoryBindFlags  flags
	 */ 
	 public int flags(){
		 int var = flags0(super.ptr);
		 this.flags = var;
		 return this.flags;
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field subresource	[vkstruct]<br>
	 * Prototype: VkImageSubresource  subresource
	 */ 
	 private static native void subresource0(Buffer ptr, java.nio.ByteBuffer  _subresource);/*
		  VkSparseImageMemoryBind* vkObj = (VkSparseImageMemoryBind*)(ptr);
		  vkObj->subresource = (VkImageSubresource) (_subresource);
	  */

	/**
	 * native GET method for field subresource	[vkstruct]<br>
	 * Prototype: VkImageSubresource  subresource
	 */ 
	 private static native java.nio.ByteBuffer  subresource0(Buffer ptr);/*
		  VkSparseImageMemoryBind vkObj = (VkSparseImageMemoryBind*)(ptr);
		  return (VkImageSubresource) (vkObj->subresource);
	 */

	/**
	 * native SET method for field offset	[vkstruct]<br>
	 * Prototype: VkOffset3D  offset
	 */ 
	 private static native void offset0(Buffer ptr, java.nio.ByteBuffer  _offset);/*
		  VkSparseImageMemoryBind* vkObj = (VkSparseImageMemoryBind*)(ptr);
		  vkObj->offset = (VkOffset3D) (_offset);
	  */

	/**
	 * native GET method for field offset	[vkstruct]<br>
	 * Prototype: VkOffset3D  offset
	 */ 
	 private static native java.nio.ByteBuffer  offset0(Buffer ptr);/*
		  VkSparseImageMemoryBind vkObj = (VkSparseImageMemoryBind*)(ptr);
		  return (VkOffset3D) (vkObj->offset);
	 */

	/**
	 * native SET method for field extent	[vkstruct]<br>
	 * Prototype: VkExtent3D  extent
	 */ 
	 private static native void extent0(Buffer ptr, java.nio.ByteBuffer  _extent);/*
		  VkSparseImageMemoryBind* vkObj = (VkSparseImageMemoryBind*)(ptr);
		  vkObj->extent = (VkExtent3D) (_extent);
	  */

	/**
	 * native GET method for field extent	[vkstruct]<br>
	 * Prototype: VkExtent3D  extent
	 */ 
	 private static native java.nio.ByteBuffer  extent0(Buffer ptr);/*
		  VkSparseImageMemoryBind vkObj = (VkSparseImageMemoryBind*)(ptr);
		  return (VkExtent3D) (vkObj->extent);
	 */

	/**
	 * native SET method for field memory	[vkhandle]<br>
	 * Prototype: VkDeviceMemory  memory
	 */ 
	 private static native void memory0(Buffer ptr, java.nio.ByteBuffer  _memory);/*
		  VkSparseImageMemoryBind* vkObj = (VkSparseImageMemoryBind*)(ptr);
		  vkObj->memory = (VkDeviceMemory) (_memory);
	  */

	/**
	 * native GET method for field memory	[vkhandle]<br>
	 * Prototype: VkDeviceMemory  memory
	 */ 
	 private static native java.nio.ByteBuffer  memory0(Buffer ptr);/*
		  VkSparseImageMemoryBind vkObj = (VkSparseImageMemoryBind*)(ptr);
		  return (VkDeviceMemory) (vkObj->memory);
	 */

	/**
	 * native SET method for field memoryOffset	[long]<br>
	 * Prototype: VkDeviceSize  memoryOffset
	 */ 
	 private static native void memoryOffset0(Buffer ptr, long _memoryOffset);/*
		  VkSparseImageMemoryBind* vkObj = (VkSparseImageMemoryBind*)(ptr);
		  vkObj->memoryOffset = (VkDeviceSize) (_memoryOffset);
	  */

	/**
	 * native GET method for field memoryOffset	[long]<br>
	 * Prototype: VkDeviceSize  memoryOffset
	 */ 
	 private static native long memoryOffset0(Buffer ptr);/*
		  VkSparseImageMemoryBind vkObj = (VkSparseImageMemoryBind*)(ptr);
		  return (jlong) (vkObj->memoryOffset);
	 */

	/**
	 * native SET method for field flags	[int]<br>
	 * Prototype: VkSparseMemoryBindFlags  flags
	 */ 
	 private static native void flags0(Buffer ptr, int _flags);/*
		  VkSparseImageMemoryBind* vkObj = (VkSparseImageMemoryBind*)(ptr);
		  vkObj->flags = (VkSparseMemoryBindFlags) (_flags);
	  */

	/**
	 * native GET method for field flags	[int]<br>
	 * Prototype: VkSparseMemoryBindFlags  flags
	 */ 
	 private static native int flags0(Buffer ptr);/*
		  VkSparseImageMemoryBind vkObj = (VkSparseImageMemoryBind*)(ptr);
		  return (jint) (vkObj->flags);
	 */



} // end of class VkSparseImageMemoryBind
