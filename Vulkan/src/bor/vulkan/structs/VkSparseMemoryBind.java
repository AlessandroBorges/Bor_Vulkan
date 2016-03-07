/**
 * Class wrapping Vulkan's VkSparseMemoryBind struct.
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
 *  Project Bor-Vulkan 
 *  Class for Java-Vulkan integration 
 *  This class is a Java front end for struct VkSparseMemoryBind. 
 *  <h3>Prototype:</h3>
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
 * @version Ver. 0.8.01 (beta) 
 */
public class VkSparseMemoryBind extends VkStruct {
	/** TAG of this structure [25]  */
	 private static final String TAG = "VkSparseMemoryBind";

	/** ID of this structure [25]  */
	 public static final int TAG_ID = VKSPARSEMEMORYBIND_ID;

	/** P wrapper for THIS object */
	 private  P<VkSparseMemoryBind> p;

	 ///////////////////
	 // Struct fields //
	 ///////////////////
	/**
	 *  VkDeviceSize 	resourceOffset	[long]
	 */ 
	 long 	resourceOffset;

	/**
	 *  VkDeviceSize 	size	[long]
	 */ 
	 long 	size;

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
	public VkSparseMemoryBind(){ 
		 super(sizeOf()); 
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkSparseMemoryBind(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address and memSize
	 * @param address - native address 
	 * @param memSize - buffer size 
	 */
	 public VkSparseMemoryBind(long address, int memSize){ 
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
	 public static P<VkSparseMemoryBind> createNullPointer(){
	        P<VkSparseMemoryBind> p = new  P<VkSparseMemoryBind>(new VkSparseMemoryBind());
	        return p;
	    }


	/** 
	 * Return this VkObject instance wrapped in pointer P<br>
	 *
	 *  P&lt;? extends VkObject &gt;
	 *
	 * @return  a P container wrapping this object.
	 */
	 public P<VkSparseMemoryBind> getP() {
	       if(p == null ){
	           p = new P<VkSparseMemoryBind> (this);
	       }
	        return p;
	    }


	 ////////////////////////
	 //  SETTERS & GETTERS //
	 ////////////////////////

	/**
	 * Set method for field resourceOffset	[long]<br>
	 * Prototype: VkDeviceSize  resourceOffset
	 */ 
	 public void resourceOffset(long resourceOffset){
		 this.resourceOffset = resourceOffset;
		resourceOffset0(super.ptr, resourceOffset);
	 }

	/**
	 * get method for field resourceOffset	[long]<br>
	 * Prototype: VkDeviceSize  resourceOffset
	 */ 
	 public long resourceOffset(){
		 // return  this.resourceOffset;
		 return resourceOffset0(super.ptr);
	 }

	/**
	 * Set method for field size	[long]<br>
	 * Prototype: VkDeviceSize  size
	 */ 
	 public void size(long size){
		 this.size = size;
		size0(super.ptr, size);
	 }

	/**
	 * get method for field size	[long]<br>
	 * Prototype: VkDeviceSize  size
	 */ 
	 public long size(){
		 // return  this.size;
		 return size0(super.ptr);
	 }

	/**
	 * Set method for field memory	[vkhandle]<br>
	 * Prototype: VkDeviceMemory  memory
	 */ 
	 public void memory(VkDeviceMemory memory){
		 this.memory = memory;
		memory0(super.ptr, memory);
	 }

	/**
	 * get method for field memory	[vkhandle]<br>
	 * Prototype: VkDeviceMemory  memory
	 */ 
	 public VkDeviceMemory memory(){
		 // return  this.memory;
		 return memory0(super.ptr);
	 }

	/**
	 * Set method for field memoryOffset	[long]<br>
	 * Prototype: VkDeviceSize  memoryOffset
	 */ 
	 public void memoryOffset(long memoryOffset){
		 this.memoryOffset = memoryOffset;
		memoryOffset0(super.ptr, memoryOffset);
	 }

	/**
	 * get method for field memoryOffset	[long]<br>
	 * Prototype: VkDeviceSize  memoryOffset
	 */ 
	 public long memoryOffset(){
		 // return  this.memoryOffset;
		 return memoryOffset0(super.ptr);
	 }

	/**
	 * Set method for field flags	[int]<br>
	 * Prototype: VkSparseMemoryBindFlags  flags
	 */ 
	 public void flags(int flags){
		 this.flags = flags;
		flags0(super.ptr, flags);
	 }

	/**
	 * get method for field flags	[int]<br>
	 * Prototype: VkSparseMemoryBindFlags  flags
	 */ 
	 public int flags(){
		 // return  this.flags;
		 return flags0(super.ptr);
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field resourceOffset	[long]<br>
	 * Prototype: VkDeviceSize  resourceOffset
	 */ 
	 private static native void resourceOffset0(ByteBuffer ptr, long _resourceOffset);/*
		  VkSparseMemoryBind _obj = (VkSparseMemoryBind)(*ptr);
		  _obj.resourceOffset = (VkDeviceSize) (_resourceOffset);
	  */

	/**
	 * native GET method for field resourceOffset	[long]<br>
	 * Prototype: VkDeviceSize  resourceOffset
	 */ 
	 private static native long resourceOffset0(ByteBuffer ptr);/*
		  VkSparseMemoryBind _obj = (VkSparseMemoryBind)(ptr);
		  return (jlong) (_obj.VkDeviceSize);
	 */

	/**
	 * native SET method for field size	[long]<br>
	 * Prototype: VkDeviceSize  size
	 */ 
	 private static native void size0(ByteBuffer ptr, long _size);/*
		  VkSparseMemoryBind _obj = (VkSparseMemoryBind)(*ptr);
		  _obj.size = (VkDeviceSize) (_size);
	  */

	/**
	 * native GET method for field size	[long]<br>
	 * Prototype: VkDeviceSize  size
	 */ 
	 private static native long size0(ByteBuffer ptr);/*
		  VkSparseMemoryBind _obj = (VkSparseMemoryBind)(ptr);
		  return (jlong) (_obj.VkDeviceSize);
	 */

	/**
	 * native SET method for field memory	[vkhandle]<br>
	 * Prototype: VkDeviceMemory  memory
	 */ 
	 private static native void memory0(ByteBuffer ptr, VkDeviceMemory _memory);/*
		  VkSparseMemoryBind _obj = (VkSparseMemoryBind)(*ptr);
		  _obj.memory = (VkDeviceMemory) (_memory);
	  */

	/**
	 * native GET method for field memory	[vkhandle]<br>
	 * Prototype: VkDeviceMemory  memory
	 */ 
	 private static native VkDeviceMemory memory0(ByteBuffer ptr);/*
		  VkSparseMemoryBind _obj = (VkSparseMemoryBind)(ptr);
		  return (VkDeviceMemory) (_obj.VkDeviceMemory);
	 */

	/**
	 * native SET method for field memoryOffset	[long]<br>
	 * Prototype: VkDeviceSize  memoryOffset
	 */ 
	 private static native void memoryOffset0(ByteBuffer ptr, long _memoryOffset);/*
		  VkSparseMemoryBind _obj = (VkSparseMemoryBind)(*ptr);
		  _obj.memoryOffset = (VkDeviceSize) (_memoryOffset);
	  */

	/**
	 * native GET method for field memoryOffset	[long]<br>
	 * Prototype: VkDeviceSize  memoryOffset
	 */ 
	 private static native long memoryOffset0(ByteBuffer ptr);/*
		  VkSparseMemoryBind _obj = (VkSparseMemoryBind)(ptr);
		  return (jlong) (_obj.VkDeviceSize);
	 */

	/**
	 * native SET method for field flags	[int]<br>
	 * Prototype: VkSparseMemoryBindFlags  flags
	 */ 
	 private static native void flags0(ByteBuffer ptr, int _flags);/*
		  VkSparseMemoryBind _obj = (VkSparseMemoryBind)(*ptr);
		  _obj.flags = (VkSparseMemoryBindFlags) (_flags);
	  */

	/**
	 * native GET method for field flags	[int]<br>
	 * Prototype: VkSparseMemoryBindFlags  flags
	 */ 
	 private static native int flags0(ByteBuffer ptr);/*
		  VkSparseMemoryBind _obj = (VkSparseMemoryBind)(ptr);
		  return (jint) (_obj.VkSparseMemoryBindFlags);
	 */



} // end of class VkSparseMemoryBind
