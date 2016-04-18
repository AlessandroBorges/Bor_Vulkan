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

import java.nio.Buffer;


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

    //@formatter:off
    /*JNI
    #include <BorVulkan.hpp>
    */  

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
	 *  const void* 	pNext	[vkobject]
	 */ 
	 VkObject 	pNext;

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
	 public VkMemoryAllocateInfo(long address , int memSize){ 
		 super(address, memSize); 
	 }

	/**
	 * Ctor with Address only. Size guessed by #sizeof()
	 * @param address - native address 
	 */
	 public VkMemoryAllocateInfo(long address){ 
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
		 int enumVal = sType.getValue();
		 setSType0(this.ptr, enumVal );
	 }

	/**
	 * Get method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 public VkStructureType sType(){
		 int nativeVal = getSType0(super.ptr);
		 this.sType = VkStructureType.fromValue(nativeVal); 
		 return this.sType;
	 }

	/**
	 * Set method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 public void pNext(VkObject pNext){
		 this.pNext = pNext;
		 ByteBuffer buff = (pNext==null) ? null : pNext.getPointer();
		 setPNext0(this.ptr, buff);
	 }

	/**
	 * Get method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 public VkObject pNext(){
		 long pointer = getPNext0(super.ptr);
		 if(pointer == 0){
		    this.pNext = null;
		    return null;
		  } else 
 		 if(this.pNext == null){
		    this.pNext = (VkObject)(new VkHandle(pointer));
		 }else{
		    this.pNext.setPointer(pointer);
		  }
		 return this.pNext;
	 }

	/**
	 * Set method for field allocationSize	[long]<br>
	 * Prototype: VkDeviceSize  allocationSize
	 */ 
	 public void allocationSize(long allocationSize){
		 this.allocationSize = allocationSize;
		 setAllocationSize0(this.ptr,  allocationSize);
	 }

	/**
	 * Get method for field allocationSize	[long]<br>
	 * Prototype: VkDeviceSize  allocationSize
	 */ 
	 public long allocationSize(){
		 long var = getAllocationSize0(super.ptr);
		 this.allocationSize = var;
		 return this.allocationSize;
	 }

	/**
	 * Set method for field memoryTypeIndex	[int]<br>
	 * Prototype: uint32_t  memoryTypeIndex
	 */ 
	 public void memoryTypeIndex(int memoryTypeIndex){
		 this.memoryTypeIndex = memoryTypeIndex;
		 setMemoryTypeIndex0(this.ptr,  memoryTypeIndex);
	 }

	/**
	 * Get method for field memoryTypeIndex	[int]<br>
	 * Prototype: uint32_t  memoryTypeIndex
	 */ 
	 public int memoryTypeIndex(){
		 int var = getMemoryTypeIndex0(super.ptr);
		 this.memoryTypeIndex = var;
		 return this.memoryTypeIndex;
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native void setSType0(Buffer ptr, int  _sType);/*
		  VkMemoryAllocateInfo* vkObj = (VkMemoryAllocateInfo*)(ptr);
		  vkObj->sType = (VkStructureType) (_sType);
	  */

	/**
	 * native GET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native int  getSType0(Buffer ptr);/*
		  VkMemoryAllocateInfo* vkObj = (VkMemoryAllocateInfo*)(ptr);
		  return (VkStructureType) (vkObj->sType);
	 */

	/**
	 * native SET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native void setPNext0(Buffer ptr, java.nio.ByteBuffer  _pNext);/*
		  VkMemoryAllocateInfo* vkObj = (VkMemoryAllocateInfo*)(ptr);
		  vkObj->pNext = (const void*) (_pNext);
	  */

	/**
	 * native GET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native long getPNext0(Buffer ptr);/*
		  VkMemoryAllocateInfo* vkObj = (VkMemoryAllocateInfo*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->pNext);	 */

	/**
	 * native SET method for field allocationSize	[long]<br>
	 * Prototype: VkDeviceSize  allocationSize
	 */ 
	 private static native void setAllocationSize0(Buffer ptr, long _allocationSize);/*
		  VkMemoryAllocateInfo* vkObj = (VkMemoryAllocateInfo*)(ptr);
		  vkObj->allocationSize = (VkDeviceSize) (_allocationSize);
	  */

	/**
	 * native GET method for field allocationSize	[long]<br>
	 * Prototype: VkDeviceSize  allocationSize
	 */ 
	 private static native long getAllocationSize0(Buffer ptr);/*
		  VkMemoryAllocateInfo* vkObj = (VkMemoryAllocateInfo*)(ptr);
		  return (jlong) (vkObj->allocationSize);
	 */

	/**
	 * native SET method for field memoryTypeIndex	[int]<br>
	 * Prototype: uint32_t  memoryTypeIndex
	 */ 
	 private static native void setMemoryTypeIndex0(Buffer ptr, int _memoryTypeIndex);/*
		  VkMemoryAllocateInfo* vkObj = (VkMemoryAllocateInfo*)(ptr);
		  vkObj->memoryTypeIndex = (uint32_t) (_memoryTypeIndex);
	  */

	/**
	 * native GET method for field memoryTypeIndex	[int]<br>
	 * Prototype: uint32_t  memoryTypeIndex
	 */ 
	 private static native int getMemoryTypeIndex0(Buffer ptr);/*
		  VkMemoryAllocateInfo* vkObj = (VkMemoryAllocateInfo*)(ptr);
		  return (jint) (vkObj->memoryTypeIndex);
	 */



} // end of class VkMemoryAllocateInfo
