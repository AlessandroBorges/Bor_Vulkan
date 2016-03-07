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
 *  Project Bor-Vulkan 
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
	/** TAG of this structure [20]  */
	 private static final String TAG = "VkMemoryAllocateInfo";

	/** ID of this structure [20]  */
	 public static final int TAG_ID = VKMEMORYALLOCATEINFO_ID;

	/** P wrapper for THIS object */
	 private  P<VkMemoryAllocateInfo> p;

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
	 *  VkDeviceSize 	allocationSize	[long]
	 */ 
	 long 	allocationSize;

	/**
	 *  uint32_t 	memoryTypeIndex	[int]
	 */ 
	 int 	memoryTypeIndex;

	/**
	 * Ctor
	 */
	public VkMemoryAllocateInfo(){ 
		 super(sizeOf()); 
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkMemoryAllocateInfo(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address and memSize
	 * @param address - native address 
	 * @param memSize - buffer size 
	 */
	 public VkMemoryAllocateInfo(long address, int memSize){ 
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
	 public static P<VkMemoryAllocateInfo> createNullPointer(){
	        P<VkMemoryAllocateInfo> p = new  P<VkMemoryAllocateInfo>(new VkMemoryAllocateInfo());
	        return p;
	    }


	/** 
	 * Return this VkObject instance wrapped in pointer P<br>
	 *
	 *  P&lt;? extends VkObject &gt;
	 *
	 * @return  a P container wrapping this object.
	 */
	 public P<VkMemoryAllocateInfo> getP() {
	       if(p == null ){
	           p = new P<VkMemoryAllocateInfo> (this);
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
	 * Set method for field allocationSize	[long]<br>
	 * Prototype: VkDeviceSize  allocationSize
	 */ 
	 public void allocationSize(long allocationSize){
		 this.allocationSize = allocationSize;
		allocationSize0(super.ptr, allocationSize);
	 }

	/**
	 * get method for field allocationSize	[long]<br>
	 * Prototype: VkDeviceSize  allocationSize
	 */ 
	 public long allocationSize(){
		 // return  this.allocationSize;
		 return allocationSize0(super.ptr);
	 }

	/**
	 * Set method for field memoryTypeIndex	[int]<br>
	 * Prototype: uint32_t  memoryTypeIndex
	 */ 
	 public void memoryTypeIndex(int memoryTypeIndex){
		 this.memoryTypeIndex = memoryTypeIndex;
		memoryTypeIndex0(super.ptr, memoryTypeIndex);
	 }

	/**
	 * get method for field memoryTypeIndex	[int]<br>
	 * Prototype: uint32_t  memoryTypeIndex
	 */ 
	 public int memoryTypeIndex(){
		 // return  this.memoryTypeIndex;
		 return memoryTypeIndex0(super.ptr);
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native void sType0(ByteBuffer ptr, VkStructureType _sType);/*
		  VkMemoryAllocateInfo _obj = (VkMemoryAllocateInfo)(*ptr);
		  _obj.sType = (VkStructureType) (_sType);
	  */

	/**
	 * native GET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native VkStructureType sType0(ByteBuffer ptr);/*
		  VkMemoryAllocateInfo _obj = (VkMemoryAllocateInfo)(ptr);
		  return (VkStructureType) (_obj.VkStructureType);
	 */

	/**
	 * native SET method for field pNext	[p]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native void pNext0(ByteBuffer ptr, P<VkObject> _pNext);/*
		  VkMemoryAllocateInfo _obj = (VkMemoryAllocateInfo)(*ptr);
		  _obj.pNext = (const void*) (_pNext);
	  */

	/**
	 * native GET method for field pNext	[p]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native P<VkObject> pNext0(ByteBuffer ptr);/*
		  VkMemoryAllocateInfo _obj = (VkMemoryAllocateInfo)(ptr);
		  return (P<VkObject>) (_obj.const void*);
	 */

	/**
	 * native SET method for field allocationSize	[long]<br>
	 * Prototype: VkDeviceSize  allocationSize
	 */ 
	 private static native void allocationSize0(ByteBuffer ptr, long _allocationSize);/*
		  VkMemoryAllocateInfo _obj = (VkMemoryAllocateInfo)(*ptr);
		  _obj.allocationSize = (VkDeviceSize) (_allocationSize);
	  */

	/**
	 * native GET method for field allocationSize	[long]<br>
	 * Prototype: VkDeviceSize  allocationSize
	 */ 
	 private static native long allocationSize0(ByteBuffer ptr);/*
		  VkMemoryAllocateInfo _obj = (VkMemoryAllocateInfo)(ptr);
		  return (jlong) (_obj.VkDeviceSize);
	 */

	/**
	 * native SET method for field memoryTypeIndex	[int]<br>
	 * Prototype: uint32_t  memoryTypeIndex
	 */ 
	 private static native void memoryTypeIndex0(ByteBuffer ptr, int _memoryTypeIndex);/*
		  VkMemoryAllocateInfo _obj = (VkMemoryAllocateInfo)(*ptr);
		  _obj.memoryTypeIndex = (uint32_t) (_memoryTypeIndex);
	  */

	/**
	 * native GET method for field memoryTypeIndex	[int]<br>
	 * Prototype: uint32_t  memoryTypeIndex
	 */ 
	 private static native int memoryTypeIndex0(ByteBuffer ptr);/*
		  VkMemoryAllocateInfo _obj = (VkMemoryAllocateInfo)(ptr);
		  return (jint) (_obj.uint32_t);
	 */



} // end of class VkMemoryAllocateInfo
