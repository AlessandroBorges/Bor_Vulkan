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
 *  Project Bor-Vulkan 
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
	/** TAG of this structure [21]  */
	 private static final String TAG = "VkMappedMemoryRange";

	/** ID of this structure [21]  */
	 public static final int TAG_ID = VKMAPPEDMEMORYRANGE_ID;

	/** P wrapper for THIS object */
	 private  P<VkMappedMemoryRange> p;

	 ///////////////////
	 // Struct fields //
	 ///////////////////
	/**
	 *  VkStructureType 	sType	[vkenum]
	 */ 
	 VkStructureType 	sType;

	/**
	 *  const void* 	pNext	[p]
	 */ 
	 P<VkObject> 	pNext;

	/**
	 *  VkDeviceMemory 	memory	[vkhandle]
	 */ 
	 VkDeviceMemory 	memory;

	/**
	 *  VkDeviceSize 	offset	[long]
	 */ 
	 long 	offset;

	/**
	 *  VkDeviceSize 	size	[long]
	 */ 
	 long 	size;

	/**
	 * Ctor
	 */
	public VkMappedMemoryRange(){ 
		 super(sizeOf()); 
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkMappedMemoryRange(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address and memSize
	 * @param address - native address 
	 * @param memSize - buffer size 
	 */
	 public VkMappedMemoryRange(long address, int memSize){ 
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
	 public static P<VkMappedMemoryRange> createNullPointer(){
	        P<VkMappedMemoryRange> p = new  P<VkMappedMemoryRange>(new VkMappedMemoryRange());
	        return p;
	    }


	/** 
	 * Return this VkObject instance wrapped in pointer P<br>
	 *
	 *  P&lt;? extends VkObject &gt;
	 *
	 * @return  a P container wrapping this object.
	 */
	 public P<VkMappedMemoryRange> getP() {
	       if(p == null ){
	           p = new P<VkMappedMemoryRange> (this);
	       }
	        return p;
	    }


	 ////////////////////////
	 //  SETTERS & GETTERS //
	 ////////////////////////

	/**
	 * Set method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 public void sType(VkStructureType sType){
		 this.sType = sType;
		sType0(super.ptr, sType);
	 }

	/**
	 * get method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 public VkStructureType sType(){
		 // return  this.sType;
		 return sType0(super.ptr);
	 }

	/**
	 * Set method for field pNext	[p]<br>
	 * Prototype: const void*  pNext
	 */ 
	 public void pNext(P<VkObject> pNext){
		 this.pNext = pNext;
		pNext0(super.ptr, pNext);
	 }

	/**
	 * get method for field pNext	[p]<br>
	 * Prototype: const void*  pNext
	 */ 
	 public P<VkObject> pNext(){
		 // return  this.pNext;
		 return pNext0(super.ptr);
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
	 * Set method for field offset	[long]<br>
	 * Prototype: VkDeviceSize  offset
	 */ 
	 public void offset(long offset){
		 this.offset = offset;
		offset0(super.ptr, offset);
	 }

	/**
	 * get method for field offset	[long]<br>
	 * Prototype: VkDeviceSize  offset
	 */ 
	 public long offset(){
		 // return  this.offset;
		 return offset0(super.ptr);
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


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native void sType0(ByteBuffer ptr, VkStructureType _sType);/*
		  VkMappedMemoryRange _obj = (VkMappedMemoryRange)(*ptr);
		  _obj.sType = (VkStructureType) (_sType);
	  */

	/**
	 * native GET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native VkStructureType sType0(ByteBuffer ptr);/*
		  VkMappedMemoryRange _obj = (VkMappedMemoryRange)(ptr);
		  return (VkStructureType) (_obj.VkStructureType);
	 */

	/**
	 * native SET method for field pNext	[p]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native void pNext0(ByteBuffer ptr, P<VkObject> _pNext);/*
		  VkMappedMemoryRange _obj = (VkMappedMemoryRange)(*ptr);
		  _obj.pNext = (const void*) (_pNext);
	  */

	/**
	 * native GET method for field pNext	[p]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native P<VkObject> pNext0(ByteBuffer ptr);/*
		  VkMappedMemoryRange _obj = (VkMappedMemoryRange)(ptr);
		  return (P<VkObject>) (_obj.const void*);
	 */

	/**
	 * native SET method for field memory	[vkhandle]<br>
	 * Prototype: VkDeviceMemory  memory
	 */ 
	 private static native void memory0(ByteBuffer ptr, VkDeviceMemory _memory);/*
		  VkMappedMemoryRange _obj = (VkMappedMemoryRange)(*ptr);
		  _obj.memory = (VkDeviceMemory) (_memory);
	  */

	/**
	 * native GET method for field memory	[vkhandle]<br>
	 * Prototype: VkDeviceMemory  memory
	 */ 
	 private static native VkDeviceMemory memory0(ByteBuffer ptr);/*
		  VkMappedMemoryRange _obj = (VkMappedMemoryRange)(ptr);
		  return (VkDeviceMemory) (_obj.VkDeviceMemory);
	 */

	/**
	 * native SET method for field offset	[long]<br>
	 * Prototype: VkDeviceSize  offset
	 */ 
	 private static native void offset0(ByteBuffer ptr, long _offset);/*
		  VkMappedMemoryRange _obj = (VkMappedMemoryRange)(*ptr);
		  _obj.offset = (VkDeviceSize) (_offset);
	  */

	/**
	 * native GET method for field offset	[long]<br>
	 * Prototype: VkDeviceSize  offset
	 */ 
	 private static native long offset0(ByteBuffer ptr);/*
		  VkMappedMemoryRange _obj = (VkMappedMemoryRange)(ptr);
		  return (jlong) (_obj.VkDeviceSize);
	 */

	/**
	 * native SET method for field size	[long]<br>
	 * Prototype: VkDeviceSize  size
	 */ 
	 private static native void size0(ByteBuffer ptr, long _size);/*
		  VkMappedMemoryRange _obj = (VkMappedMemoryRange)(*ptr);
		  _obj.size = (VkDeviceSize) (_size);
	  */

	/**
	 * native GET method for field size	[long]<br>
	 * Prototype: VkDeviceSize  size
	 */ 
	 private static native long size0(ByteBuffer ptr);/*
		  VkMappedMemoryRange _obj = (VkMappedMemoryRange)(ptr);
		  return (jlong) (_obj.VkDeviceSize);
	 */



} // end of class VkMappedMemoryRange
