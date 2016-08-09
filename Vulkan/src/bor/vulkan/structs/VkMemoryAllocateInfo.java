/**
 * Class wrapping Vulkan's VkMemoryAllocateInfo struct.
 * 
 * Bor_Vulkan Project Ver. 0.8.65 (beta)
 * Licence terms: 
 * The MIT License (MIT)
 * Copyright (c) 2016 Alessandro Borges
 * See https://opensource.org/licenses/MIT 
 */
 package bor.vulkan.structs;

 import bor.util.*;
 import bor.vulkan.*;
 import static bor.vulkan.Vulkan.*; 
 import bor.vulkan.enumerations.*;

 import java.util.*;
 import java.nio.*;


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
 * @version Ver. 0.8.65 (beta) 
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
		 super(TAG_ID);
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkMemoryAllocateInfo(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
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
	 * Get ID of this structure 
	 */
	 public static int getID(){ 
		 return TAG_ID; 
	}

	 ////////////////////////
	 //  SETTERS & GETTERS //
	 ////////////////////////

	/**
	 * Set method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 * 
	 * @param sType - a instance of VkStructureType.
	 * @return this VkStruct instance.
	 */ 
	 public VkMemoryAllocateInfo sType(VkStructureType sType){
		 this.sType = sType;
		 int enumVal = sType.getValue();
		 setSType0(this.ptr, enumVal );
		 return this;
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
	 * 
	 * @param pNext - a instance of VkObject.
	 * @return this VkStruct instance.
	 */ 
	 public VkMemoryAllocateInfo pNext(VkObject pNext){
		 this.pNext = pNext;
		 ByteBuffer buff = (pNext==null) ? null : pNext.getPointer();
		 setPNext0(this.ptr, buff);
		 return this;
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
	 * 
	 * @param allocationSize - a instance of long.
	 * @return this VkStruct instance.
	 */ 
	 public VkMemoryAllocateInfo allocationSize(long allocationSize){
		 this.allocationSize = allocationSize;
		 setAllocationSize0(this.ptr,  allocationSize);
		 return this;
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
	 * 
	 * @param memoryTypeIndex - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkMemoryAllocateInfo memoryTypeIndex(int memoryTypeIndex){
		 this.memoryTypeIndex = memoryTypeIndex;
		 setMemoryTypeIndex0(this.ptr,  memoryTypeIndex);
		 return this;
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


   /* (non-Javadoc)
    * @see java.lang.Object#toString()
    */
    @Override
    public String toString() {
         StringBuilder builder = new StringBuilder();
         builder.append("VkMemoryAllocateInfo [ ")
				.append("sType: ").append(sType() )
				.append(",\n pNext: ")
				.append(pNext() )
				.append(",\n allocationSize: ")
				.append(allocationSize() )
				.append(",\n memoryTypeIndex: ")
				.append(memoryTypeIndex() )
				.append("]");
		 return builder.toString();
    }


	 //////////////////////////////////
	 // Native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * Native SET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native void setSType0(Buffer ptr, int  _sType);/*
		  VkMemoryAllocateInfo* vkObj = (VkMemoryAllocateInfo*)(ptr);
		  vkObj->sType = (VkStructureType) (_sType);
	  */

	/**
	 * Native GET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native int  getSType0(Buffer ptr);/*
		  VkMemoryAllocateInfo* vkObj = (VkMemoryAllocateInfo*)(ptr);
		  return (VkStructureType) (vkObj->sType);
	 */

	/**
	 * Native SET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native void setPNext0(Buffer ptr, java.nio.ByteBuffer  _pNext);/*
		  VkMemoryAllocateInfo* vkObj = (VkMemoryAllocateInfo*)(ptr);
		  vkObj->pNext = (const void*) (_pNext);
	  */

	/**
	 * Native GET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native long getPNext0(Buffer ptr);/*
		  VkMemoryAllocateInfo* vkObj = (VkMemoryAllocateInfo*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->pNext);
	 */

	/**
	 * Native SET method for field allocationSize	[long]<br>
	 * Prototype: VkDeviceSize  allocationSize
	 */ 
	 private static native void setAllocationSize0(Buffer ptr, long _allocationSize);/*
		  VkMemoryAllocateInfo* vkObj = (VkMemoryAllocateInfo*)(ptr);
		  vkObj->allocationSize = (VkDeviceSize) (_allocationSize);
	  */

	/**
	 * Native GET method for field allocationSize	[long]<br>
	 * Prototype: VkDeviceSize  allocationSize
	 */ 
	 private static native long getAllocationSize0(Buffer ptr);/*
		  VkMemoryAllocateInfo* vkObj = (VkMemoryAllocateInfo*)(ptr);
		  return (jlong) (vkObj->allocationSize);
	 */

	/**
	 * Native SET method for field memoryTypeIndex	[int]<br>
	 * Prototype: uint32_t  memoryTypeIndex
	 */ 
	 private static native void setMemoryTypeIndex0(Buffer ptr, int _memoryTypeIndex);/*
		  VkMemoryAllocateInfo* vkObj = (VkMemoryAllocateInfo*)(ptr);
		  vkObj->memoryTypeIndex = (uint32_t) (_memoryTypeIndex);
	  */

	/**
	 * Native GET method for field memoryTypeIndex	[int]<br>
	 * Prototype: uint32_t  memoryTypeIndex
	 */ 
	 private static native int getMemoryTypeIndex0(Buffer ptr);/*
		  VkMemoryAllocateInfo* vkObj = (VkMemoryAllocateInfo*)(ptr);
		  return (jint) (vkObj->memoryTypeIndex);
	 */



} // end of class VkMemoryAllocateInfo
