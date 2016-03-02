/**
 * Class wrapping Vulkan's VkMemoryAllocateInfo struct.
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
 *  This class is a Java front end for struct VkMemoryAllocateInfo. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkMemoryAllocateInfo {
 *     VkStructureType    sType;
 *     const void*        pNext;
 *     VkDeviceSize       allocationSize;
 *     uint32_t           memoryTypeIndex;
 * } VkMemoryAllocateInfo;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.01 (beta) 
 */
public class VkMemoryAllocateInfo extends VkStruct {
	/** TAG of this structure [144]  */
	 private static final String TAG = "VkMemoryAllocateInfo";

	/** ID of this structure [144]  */
	 public static final int TAG_ID = VKMEMORYALLOCATEINFO_ID;

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
	 *  VkDeviceSize 	allocationSize 
	 */ 
	long 	allocationSize;

	/**
	 *  uint32_t 	memoryTypeIndex 
	 */ 
	int 	memoryTypeIndex;

	/**
	 * Ctor
	 */
	public VkMemoryAllocateInfo(){ 
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
	 * Set method for field allocationSize
	 * Prototype: VkDeviceSize  allocationSize
	 */ 
	 public void allocationSize(long allocationSize){
		 this.allocationSize = allocationSize;
		allocationSize0(super.ptr, allocationSize);
	 }

	/**
	 * get method for field allocationSize
	 * Prototype: VkDeviceSize  allocationSize
	 */ 
	 public long allocationSize(){
		 // return  this.allocationSize;
		 return allocationSize0(super.ptr);
	 }

	/**
	 * Set method for field memoryTypeIndex
	 * Prototype: uint32_t  memoryTypeIndex
	 */ 
	 public void memoryTypeIndex(int memoryTypeIndex){
		 this.memoryTypeIndex = memoryTypeIndex;
		memoryTypeIndex0(super.ptr, memoryTypeIndex);
	 }

	/**
	 * get method for field memoryTypeIndex
	 * Prototype: uint32_t  memoryTypeIndex
	 */ 
	 public int memoryTypeIndex(){
		 // return  this.memoryTypeIndex;
		 return memoryTypeIndex0(super.ptr);
	 }


	 // ////////////////////////////////
	 // native SETTERS & GETTERS //
	 // ////////////////////////////////
	/**
	 * native Set method for field sType
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native void sType0(ByteBuffer ptr, VkStructureType _sType);/*
		  VkMemoryAllocateInfo _obj = (VkMemoryAllocateInfo)(*ptr);
		  _obj.sType = (VkStructureType) (_sType);
	  */

	/**
	 * get method for field sType
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native VkStructureType sType0(ByteBuffer ptr);/*
		  VkMemoryAllocateInfo _obj = (VkMemoryAllocateInfo)(ptr);
		  return (VkStructureType) (_obj.VkStructureType);
	 */

	/**
	 * native Set method for field pNext
	 * Prototype: const void*  pNext
	 */ 
	 private static native void pNext0(ByteBuffer ptr, P<VkObject> _pNext);/*
		  VkMemoryAllocateInfo _obj = (VkMemoryAllocateInfo)(*ptr);
		  _obj.pNext = (const void*) (_pNext);
	  */

	/**
	 * get method for field pNext
	 * Prototype: const void*  pNext
	 */ 
	 private static native P<VkObject> pNext0(ByteBuffer ptr);/*
		  VkMemoryAllocateInfo _obj = (VkMemoryAllocateInfo)(ptr);
		  return (P<VkObject>) (_obj.const void*);
	 */

	/**
	 * native Set method for field allocationSize
	 * Prototype: VkDeviceSize  allocationSize
	 */ 
	 private static native void allocationSize0(ByteBuffer ptr, long _allocationSize);/*
		  VkMemoryAllocateInfo _obj = (VkMemoryAllocateInfo)(*ptr);
		  _obj.allocationSize = (VkDeviceSize) (_allocationSize);
	  */

	/**
	 * get method for field allocationSize
	 * Prototype: VkDeviceSize  allocationSize
	 */ 
	 private static native long allocationSize0(ByteBuffer ptr);/*
		  VkMemoryAllocateInfo _obj = (VkMemoryAllocateInfo)(ptr);
		  return (jlong) (_obj.VkDeviceSize);
	 */

	/**
	 * native Set method for field memoryTypeIndex
	 * Prototype: uint32_t  memoryTypeIndex
	 */ 
	 private static native void memoryTypeIndex0(ByteBuffer ptr, int _memoryTypeIndex);/*
		  VkMemoryAllocateInfo _obj = (VkMemoryAllocateInfo)(*ptr);
		  _obj.memoryTypeIndex = (uint32_t) (_memoryTypeIndex);
	  */

	/**
	 * get method for field memoryTypeIndex
	 * Prototype: uint32_t  memoryTypeIndex
	 */ 
	 private static native int memoryTypeIndex0(ByteBuffer ptr);/*
		  VkMemoryAllocateInfo _obj = (VkMemoryAllocateInfo)(ptr);
		  return (jint) (_obj.uint32_t);
	 */



} // end of class VkMemoryAllocateInfo
