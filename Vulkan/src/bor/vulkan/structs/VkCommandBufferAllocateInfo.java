/**
 * Class wrapping Vulkan's VkCommandBufferAllocateInfo struct.
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
 *  This class is a Java front end for struct VkCommandBufferAllocateInfo. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkCommandBufferAllocateInfo {
 *     VkStructureType         sType;
 *     const void*             pNext;
 *     VkCommandPool           commandPool;
 *     VkCommandBufferLevel    level;
 *     uint32_t                commandBufferCount;
 * } VkCommandBufferAllocateInfo;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.65 (beta) 
 */
 public class VkCommandBufferAllocateInfo extends VkStruct {

    //@formatter:off
    /*JNI
    #include <BorVulkan.hpp>
    */  

	/** TAG of this structure [87]  */
	 private static final String TAG = "VkCommandBufferAllocateInfo";

	/** ID of this structure [87]  */
	 public static final int TAG_ID = VKCOMMANDBUFFERALLOCATEINFO_ID;

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
	 *  VkCommandPool 	commandPool	[vkhandle]
	 */ 
	VkCommandPool 	commandPool;
	
	/**
	 *  VkCommandBufferLevel 	level	[vkenum]
	 */ 
	VkCommandBufferLevel 	level;
	
	/**
	 *  uint32_t 	commandBufferCount	[int]
	 */ 
	int 	commandBufferCount;
	/**
	 * Ctor
	 */
	public VkCommandBufferAllocateInfo(){ 
		 super(TAG_ID);
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkCommandBufferAllocateInfo(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address only. Size guessed by #sizeof()
	 * @param address - native address 
	 */
	 public VkCommandBufferAllocateInfo(long address){ 
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
	 public VkCommandBufferAllocateInfo sType(VkStructureType sType){
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
	 public VkCommandBufferAllocateInfo pNext(VkObject pNext){
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
	 * Set method for field commandPool	[vkhandle]<br>
	 * Prototype: VkCommandPool  commandPool
	 * 
	 * @param commandPool - a instance of VkCommandPool.
	 * @return this VkStruct instance.
	 */ 
	 public VkCommandBufferAllocateInfo commandPool(VkCommandPool commandPool){
		 this.commandPool = commandPool;
		 long handle = (commandPool==null) ? 0L : commandPool.getNativeHandle();
		 setCommandPool0(this.ptr, handle);
		 return this;
	 }

	/**
	 * Get method for field commandPool	[vkhandle]<br>
	 * Prototype: VkCommandPool  commandPool
	 */ 
	 public VkCommandPool commandPool(){

		 long handle = getCommandPool0(super.ptr);
		 if(handle == 0){
		    this.commandPool = null;
		    return null;
		  }  

		 if(this.commandPool == null){
		    this.commandPool = new VkHandle(handle);
		 }else{
		    ((VkHandle)this.commandPool).setNativeHandle(handle);
		  }
		 return this.commandPool;
	 }

	/**
	 * Set method for field level	[vkenum]<br>
	 * Prototype: VkCommandBufferLevel  level
	 * 
	 * @param level - a instance of VkCommandBufferLevel.
	 * @return this VkStruct instance.
	 */ 
	 public VkCommandBufferAllocateInfo level(VkCommandBufferLevel level){
		 this.level = level;
		 int enumVal = level.getValue();
		 setLevel0(this.ptr, enumVal );
		 return this;
	 }

	/**
	 * Get method for field level	[vkenum]<br>
	 * Prototype: VkCommandBufferLevel  level
	 */ 
	 public VkCommandBufferLevel level(){
		 int nativeVal = getLevel0(super.ptr);
		 this.level = VkCommandBufferLevel.fromValue(nativeVal); 
		 return this.level;
	 }

	/**
	 * Set method for field commandBufferCount	[int]<br>
	 * Prototype: uint32_t  commandBufferCount
	 * 
	 * @param commandBufferCount - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkCommandBufferAllocateInfo commandBufferCount(int commandBufferCount){
		 this.commandBufferCount = commandBufferCount;
		 setCommandBufferCount0(this.ptr,  commandBufferCount);
		 return this;
	 }

	/**
	 * Get method for field commandBufferCount	[int]<br>
	 * Prototype: uint32_t  commandBufferCount
	 */ 
	 public int commandBufferCount(){
		 int var = getCommandBufferCount0(super.ptr);
		 this.commandBufferCount = var;
		 return this.commandBufferCount;
	 }


   /* (non-Javadoc)
    * @see java.lang.Object#toString()
    */
    @Override
    public String toString() {
         StringBuilder builder = new StringBuilder();
         builder.append("VkCommandBufferAllocateInfo [ ")
				.append("sType: ").append(sType() )
				.append(",\n pNext: ")
				.append(pNext() )
				.append(",\n commandPool: ")
				.append(commandPool() )
				.append(",\n level: ")
				.append(level() )
				.append(",\n commandBufferCount: ")
				.append(commandBufferCount() )
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
		  VkCommandBufferAllocateInfo* vkObj = (VkCommandBufferAllocateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->sType = (VkStructureType) (_sType);
	  */

	/**
	 * Native GET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native int  getSType0(Buffer ptr);/*
		  VkCommandBufferAllocateInfo* vkObj = (VkCommandBufferAllocateInfo*)(ptr);
		  return (VkStructureType) (vkObj->sType);
	 */

	/**
	 * Native SET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native void setPNext0(Buffer ptr, java.nio.ByteBuffer  _pNext);/*
		  VkCommandBufferAllocateInfo* vkObj = (VkCommandBufferAllocateInfo*)(ptr);
		 // code for Buffer - referenced by ptr
		  vkObj->pNext = (const void*) (_pNext);
	  */

	/**
	 * Native GET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native long getPNext0(Buffer ptr);/*
		  VkCommandBufferAllocateInfo* vkObj = (VkCommandBufferAllocateInfo*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->pNext);
	 */

	/**
	 * Native SET method for field commandPool	[vkhandle]<br>
	 * Prototype: VkCommandPool  commandPool
	 */ 
	 private static native void setCommandPool0(Buffer ptr, long  _commandPool);/*
		  VkCommandBufferAllocateInfo* vkObj = (VkCommandBufferAllocateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->commandPool = (VkCommandPool) (_commandPool);
	  */

	/**
	 * Native GET method for field commandPool	[vkhandle]<br>
	 * Prototype: VkCommandPool  commandPool
	 */ 
	 private static native long getCommandPool0(Buffer ptr);/*
		  VkCommandBufferAllocateInfo* vkObj = (VkCommandBufferAllocateInfo*)(ptr);
		  // generic get for struct field of type  VkHandle or VkStruct 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->commandPool);
	 */

	/**
	 * Native SET method for field level	[vkenum]<br>
	 * Prototype: VkCommandBufferLevel  level
	 */ 
	 private static native void setLevel0(Buffer ptr, int  _level);/*
		  VkCommandBufferAllocateInfo* vkObj = (VkCommandBufferAllocateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->level = (VkCommandBufferLevel) (_level);
	  */

	/**
	 * Native GET method for field level	[vkenum]<br>
	 * Prototype: VkCommandBufferLevel  level
	 */ 
	 private static native int  getLevel0(Buffer ptr);/*
		  VkCommandBufferAllocateInfo* vkObj = (VkCommandBufferAllocateInfo*)(ptr);
		  return (jobject) (vkObj->level);
	 */

	/**
	 * Native SET method for field commandBufferCount	[int]<br>
	 * Prototype: uint32_t  commandBufferCount
	 */ 
	 private static native void setCommandBufferCount0(Buffer ptr, int _commandBufferCount);/*
		  VkCommandBufferAllocateInfo* vkObj = (VkCommandBufferAllocateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->commandBufferCount = (uint32_t) (_commandBufferCount);
	  */

	/**
	 * Native GET method for field commandBufferCount	[int]<br>
	 * Prototype: uint32_t  commandBufferCount
	 */ 
	 private static native int getCommandBufferCount0(Buffer ptr);/*
		  VkCommandBufferAllocateInfo* vkObj = (VkCommandBufferAllocateInfo*)(ptr);
		  return (jint) (vkObj->commandBufferCount);
	 */



} // end of class VkCommandBufferAllocateInfo
