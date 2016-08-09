/**
 * Class wrapping Vulkan's VkMappedMemoryRange struct.
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
 * @version Ver. 0.8.65 (beta) 
 */
 public class VkMappedMemoryRange extends VkStruct {

    //@formatter:off
    /*JNI
    #include <BorVulkan.hpp>
    */  

	/** TAG of this structure [21]  */
	 private static final String TAG = "VkMappedMemoryRange";

	/** ID of this structure [21]  */
	 public static final int TAG_ID = VKMAPPEDMEMORYRANGE_ID;

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
		 super(TAG_ID);
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkMappedMemoryRange(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address only. Size guessed by #sizeof()
	 * @param address - native address 
	 */
	 public VkMappedMemoryRange(long address){ 
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
	 public VkMappedMemoryRange sType(VkStructureType sType){
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
	 public VkMappedMemoryRange pNext(VkObject pNext){
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
	 * Set method for field memory	[vkhandle]<br>
	 * Prototype: VkDeviceMemory  memory
	 * 
	 * @param memory - a instance of VkDeviceMemory.
	 * @return this VkStruct instance.
	 */ 
	 public VkMappedMemoryRange memory(VkDeviceMemory memory){
		 this.memory = memory;
		 long handle = (memory==null) ? 0L : memory.getNativeHandle();
		 setMemory0(this.ptr, handle);
		 return this;
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
		    ((VkHandle)this.memory).setNativeHandle(handle);
		  }
		 return this.memory;
	 }

	/**
	 * Set method for field offset	[long]<br>
	 * Prototype: VkDeviceSize  offset
	 * 
	 * @param offset - a instance of long.
	 * @return this VkStruct instance.
	 */ 
	 public VkMappedMemoryRange offset(long offset){
		 this.offset = offset;
		 setOffset0(this.ptr,  offset);
		 return this;
	 }

	/**
	 * Get method for field offset	[long]<br>
	 * Prototype: VkDeviceSize  offset
	 */ 
	 public long offset(){
		 long var = getOffset0(super.ptr);
		 this.offset = var;
		 return this.offset;
	 }

	/**
	 * Set method for field size	[long]<br>
	 * Prototype: VkDeviceSize  size
	 * 
	 * @param size - a instance of long.
	 * @return this VkStruct instance.
	 */ 
	 public VkMappedMemoryRange size(long size){
		 this.size = size;
		 setSize0(this.ptr,  size);
		 return this;
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


   /* (non-Javadoc)
    * @see java.lang.Object#toString()
    */
    @Override
    public String toString() {
         StringBuilder builder = new StringBuilder();
         builder.append("VkMappedMemoryRange [ ")
				.append("sType: ").append(sType() )
				.append(",\n pNext: ")
				.append(pNext() )
				.append(",\n memory: ")
				.append(memory() )
				.append(",\n offset: ")
				.append(offset() )
				.append(",\n size: ")
				.append(size() )
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
		  VkMappedMemoryRange* vkObj = (VkMappedMemoryRange*)(ptr);
		  vkObj->sType = (VkStructureType) (_sType);
	  */

	/**
	 * Native GET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native int  getSType0(Buffer ptr);/*
		  VkMappedMemoryRange* vkObj = (VkMappedMemoryRange*)(ptr);
		  return (VkStructureType) (vkObj->sType);
	 */

	/**
	 * Native SET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native void setPNext0(Buffer ptr, java.nio.ByteBuffer  _pNext);/*
		  VkMappedMemoryRange* vkObj = (VkMappedMemoryRange*)(ptr);
		  vkObj->pNext = (const void*) (_pNext);
	  */

	/**
	 * Native GET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native long getPNext0(Buffer ptr);/*
		  VkMappedMemoryRange* vkObj = (VkMappedMemoryRange*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->pNext);
	 */

	/**
	 * Native SET method for field memory	[vkhandle]<br>
	 * Prototype: VkDeviceMemory  memory
	 */ 
	 private static native void setMemory0(Buffer ptr, long  _memory);/*
		  VkMappedMemoryRange* vkObj = (VkMappedMemoryRange*)(ptr);
		  vkObj->memory = (VkDeviceMemory) (_memory);
	  */

	/**
	 * Native GET method for field memory	[vkhandle]<br>
	 * Prototype: VkDeviceMemory  memory
	 */ 
	 private static native long getMemory0(Buffer ptr);/*
		  VkMappedMemoryRange* vkObj = (VkMappedMemoryRange*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->memory);
	 */

	/**
	 * Native SET method for field offset	[long]<br>
	 * Prototype: VkDeviceSize  offset
	 */ 
	 private static native void setOffset0(Buffer ptr, long _offset);/*
		  VkMappedMemoryRange* vkObj = (VkMappedMemoryRange*)(ptr);
		  vkObj->offset = (VkDeviceSize) (_offset);
	  */

	/**
	 * Native GET method for field offset	[long]<br>
	 * Prototype: VkDeviceSize  offset
	 */ 
	 private static native long getOffset0(Buffer ptr);/*
		  VkMappedMemoryRange* vkObj = (VkMappedMemoryRange*)(ptr);
		  return (jlong) (vkObj->offset);
	 */

	/**
	 * Native SET method for field size	[long]<br>
	 * Prototype: VkDeviceSize  size
	 */ 
	 private static native void setSize0(Buffer ptr, long _size);/*
		  VkMappedMemoryRange* vkObj = (VkMappedMemoryRange*)(ptr);
		  vkObj->size = (VkDeviceSize) (_size);
	  */

	/**
	 * Native GET method for field size	[long]<br>
	 * Prototype: VkDeviceSize  size
	 */ 
	 private static native long getSize0(Buffer ptr);/*
		  VkMappedMemoryRange* vkObj = (VkMappedMemoryRange*)(ptr);
		  return (jlong) (vkObj->size);
	 */



} // end of class VkMappedMemoryRange
