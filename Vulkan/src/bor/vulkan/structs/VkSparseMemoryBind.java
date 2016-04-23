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

import java.nio.Buffer;


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

    //@formatter:off
    /*JNI
    #include <BorVulkan.hpp>
    */  

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
		 super(TAG_ID);
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
	 public VkSparseMemoryBind(long address , int memSize){ 
		 super(address, memSize); 
	 }

	/**
	 * Ctor with Address only. Size guessed by #sizeof()
	 * @param address - native address 
	 */
	 public VkSparseMemoryBind(long address){ 
		 super(address); 
	 }

	/** 
	 * Static Method to get native size of this structure 
	 */
	 public static int sizeOf(){ 
		 return sizeOf(TAG_ID); 
	}

	/** 
	 * Method to get native size of this structure 
	 */
	 @Override
	 public int getSizeBytes(){ 
		 return sizeOf(); 
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
		 setResourceOffset0(this.ptr,  resourceOffset);
	 }

	/**
	 * Get method for field resourceOffset	[long]<br>
	 * Prototype: VkDeviceSize  resourceOffset
	 */ 
	 public long resourceOffset(){
		 long var = getResourceOffset0(super.ptr);
		 this.resourceOffset = var;
		 return this.resourceOffset;
	 }

	/**
	 * Set method for field size	[long]<br>
	 * Prototype: VkDeviceSize  size
	 */ 
	 public void size(long size){
		 this.size = size;
		 setSize0(this.ptr,  size);
	 }

	/**
	 * Get method for field size	[long]<br>
	 * Prototype: VkDeviceSize  size
	 */ 
	 public long size(){
		 long var = getSize0(super.ptr);
		 this.size = var;
		 return this.size;
	 }

	/**
	 * Set method for field memory	[vkhandle]<br>
	 * Prototype: VkDeviceMemory  memory
	 */ 
	 public void memory(VkDeviceMemory memory){
		 this.memory = memory;
		 ByteBuffer buff = (memory==null) ? null : memory.getPointer();
		 setMemory0(this.ptr, buff);
	 }

	/**
	 * Get method for field memory	[vkhandle]<br>
	 * Prototype: VkDeviceMemory  memory
	 */ 
	 public VkDeviceMemory memory(){

		 long handle = getMemory0(super.ptr);
		 if(handle == 0){
		    this.memory = null;
		    return null;
		  }  

		 if(this.memory == null){
		    this.memory = new VkHandle(handle);
		 }else{
		    ((VkHandle)this.memory).setPointer(handle);
		  }
		 return this.memory;
	 }

	/**
	 * Set method for field memoryOffset	[long]<br>
	 * Prototype: VkDeviceSize  memoryOffset
	 */ 
	 public void memoryOffset(long memoryOffset){
		 this.memoryOffset = memoryOffset;
		 setMemoryOffset0(this.ptr,  memoryOffset);
	 }

	/**
	 * Get method for field memoryOffset	[long]<br>
	 * Prototype: VkDeviceSize  memoryOffset
	 */ 
	 public long memoryOffset(){
		 long var = getMemoryOffset0(super.ptr);
		 this.memoryOffset = var;
		 return this.memoryOffset;
	 }

	/**
	 * Set method for field flags	[int]<br>
	 * Prototype: VkSparseMemoryBindFlags  flags
	 */ 
	 public void flags(int flags){
		 this.flags = flags;
		 setFlags0(this.ptr,  flags);
	 }

	/**
	 * Get method for field flags	[int]<br>
	 * Prototype: VkSparseMemoryBindFlags  flags
	 */ 
	 public int flags(){
		 int var = getFlags0(super.ptr);
		 this.flags = var;
		 return this.flags;
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field resourceOffset	[long]<br>
	 * Prototype: VkDeviceSize  resourceOffset
	 */ 
	 private static native void setResourceOffset0(Buffer ptr, long _resourceOffset);/*
		  VkSparseMemoryBind* vkObj = (VkSparseMemoryBind*)(ptr);
		  vkObj->resourceOffset = (VkDeviceSize) (_resourceOffset);
	  */

	/**
	 * native GET method for field resourceOffset	[long]<br>
	 * Prototype: VkDeviceSize  resourceOffset
	 */ 
	 private static native long getResourceOffset0(Buffer ptr);/*
		  VkSparseMemoryBind* vkObj = (VkSparseMemoryBind*)(ptr);
		  return (jlong) (vkObj->resourceOffset);
	 */

	/**
	 * native SET method for field size	[long]<br>
	 * Prototype: VkDeviceSize  size
	 */ 
	 private static native void setSize0(Buffer ptr, long _size);/*
		  VkSparseMemoryBind* vkObj = (VkSparseMemoryBind*)(ptr);
		  vkObj->size = (VkDeviceSize) (_size);
	  */

	/**
	 * native GET method for field size	[long]<br>
	 * Prototype: VkDeviceSize  size
	 */ 
	 private static native long getSize0(Buffer ptr);/*
		  VkSparseMemoryBind* vkObj = (VkSparseMemoryBind*)(ptr);
		  return (jlong) (vkObj->size);
	 */

	/**
	 * native SET method for field memory	[vkhandle]<br>
	 * Prototype: VkDeviceMemory  memory
	 */ 
	 private static native void setMemory0(Buffer ptr, java.nio.ByteBuffer  _memory);/*
		  VkSparseMemoryBind* vkObj = (VkSparseMemoryBind*)(ptr);
		  vkObj->memory = (VkDeviceMemory) (_memory);
	  */

	/**
	 * native GET method for field memory	[vkhandle]<br>
	 * Prototype: VkDeviceMemory  memory
	 */ 
	 private static native long getMemory0(Buffer ptr);/*
		  VkSparseMemoryBind* vkObj = (VkSparseMemoryBind*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->memory);	 */

	/**
	 * native SET method for field memoryOffset	[long]<br>
	 * Prototype: VkDeviceSize  memoryOffset
	 */ 
	 private static native void setMemoryOffset0(Buffer ptr, long _memoryOffset);/*
		  VkSparseMemoryBind* vkObj = (VkSparseMemoryBind*)(ptr);
		  vkObj->memoryOffset = (VkDeviceSize) (_memoryOffset);
	  */

	/**
	 * native GET method for field memoryOffset	[long]<br>
	 * Prototype: VkDeviceSize  memoryOffset
	 */ 
	 private static native long getMemoryOffset0(Buffer ptr);/*
		  VkSparseMemoryBind* vkObj = (VkSparseMemoryBind*)(ptr);
		  return (jlong) (vkObj->memoryOffset);
	 */

	/**
	 * native SET method for field flags	[int]<br>
	 * Prototype: VkSparseMemoryBindFlags  flags
	 */ 
	 private static native void setFlags0(Buffer ptr, int _flags);/*
		  VkSparseMemoryBind* vkObj = (VkSparseMemoryBind*)(ptr);
		  vkObj->flags = (VkSparseMemoryBindFlags) (_flags);
	  */

	/**
	 * native GET method for field flags	[int]<br>
	 * Prototype: VkSparseMemoryBindFlags  flags
	 */ 
	 private static native int getFlags0(Buffer ptr);/*
		  VkSparseMemoryBind* vkObj = (VkSparseMemoryBind*)(ptr);
		  return (jint) (vkObj->flags);
	 */



} // end of class VkSparseMemoryBind
