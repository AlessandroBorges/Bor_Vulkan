/**
 * Class wrapping Vulkan's VkCommandBufferAllocateInfo struct.
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
 * @version Ver. 0.8.01 (beta) 
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

	/** P wrapper for THIS object */
	 private  P<VkCommandBufferAllocateInfo> p;

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
	 * Ctor with Address and memSize
	 * @param address - native address 
	 * @param memSize - buffer size 
	 */
	 public VkCommandBufferAllocateInfo(long address , int memSize){ 
		 super(address, memSize); 
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
	 * Create a pointer P to contain a instance of this,
	 * with clean native pointer.<br>
	 * You can use {@link VkStruct#setPointer(ByteBuffer)} to set a new 
	 * native pointer.
	 * @return An instance of P for this VkStruct with null pointer
	 */
	 public static P<VkCommandBufferAllocateInfo> createNullPointer(){
	        P<VkCommandBufferAllocateInfo> p = new  P<VkCommandBufferAllocateInfo>(new VkCommandBufferAllocateInfo());
	        return p;
	    }


	/** 
	 * Return this VkObject instance wrapped in pointer P<br>
	 *
	 *  P&lt;? extends VkObject &gt;
	 *
	 * @return  a P container wrapping this object.
	 */
	 public P<VkCommandBufferAllocateInfo> getP() {
	       if(p == null ){
	           p = new P<VkCommandBufferAllocateInfo> (this);
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
	 * Set method for field commandPool	[vkhandle]<br>
	 * Prototype: VkCommandPool  commandPool
	 */ 
	 public void commandPool(VkCommandPool commandPool){
		 this.commandPool = commandPool;
		 ByteBuffer buff = (commandPool==null) ? null : commandPool.getPointer();
		 setCommandPool0(this.ptr, buff);
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
		    ((VkHandle)this.commandPool).setPointer(handle);
		  }
		 return this.commandPool;
	 }

	/**
	 * Set method for field level	[vkenum]<br>
	 * Prototype: VkCommandBufferLevel  level
	 */ 
	 public void level(VkCommandBufferLevel level){
		 this.level = level;
		 int enumVal = level.getValue();
		 setLevel0(this.ptr, enumVal );
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
	 */ 
	 public void commandBufferCount(int commandBufferCount){
		 this.commandBufferCount = commandBufferCount;
		 setCommandBufferCount0(this.ptr,  commandBufferCount);
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


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native void setSType0(Buffer ptr, int  _sType);/*
		  VkCommandBufferAllocateInfo* vkObj = (VkCommandBufferAllocateInfo*)(ptr);
		  vkObj->sType = (VkStructureType) (_sType);
	  */

	/**
	 * native GET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native int  getSType0(Buffer ptr);/*
		  VkCommandBufferAllocateInfo* vkObj = (VkCommandBufferAllocateInfo*)(ptr);
		  return (VkStructureType) (vkObj->sType);
	 */

	/**
	 * native SET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native void setPNext0(Buffer ptr, java.nio.ByteBuffer  _pNext);/*
		  VkCommandBufferAllocateInfo* vkObj = (VkCommandBufferAllocateInfo*)(ptr);
		  vkObj->pNext = (const void*) (_pNext);
	  */

	/**
	 * native GET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native long getPNext0(Buffer ptr);/*
		  VkCommandBufferAllocateInfo* vkObj = (VkCommandBufferAllocateInfo*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->pNext);	 */

	/**
	 * native SET method for field commandPool	[vkhandle]<br>
	 * Prototype: VkCommandPool  commandPool
	 */ 
	 private static native void setCommandPool0(Buffer ptr, java.nio.ByteBuffer  _commandPool);/*
		  VkCommandBufferAllocateInfo* vkObj = (VkCommandBufferAllocateInfo*)(ptr);
		  vkObj->commandPool = (VkCommandPool) (_commandPool);
	  */

	/**
	 * native GET method for field commandPool	[vkhandle]<br>
	 * Prototype: VkCommandPool  commandPool
	 */ 
	 private static native long getCommandPool0(Buffer ptr);/*
		  VkCommandBufferAllocateInfo* vkObj = (VkCommandBufferAllocateInfo*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->commandPool);	 */

	/**
	 * native SET method for field level	[vkenum]<br>
	 * Prototype: VkCommandBufferLevel  level
	 */ 
	 private static native void setLevel0(Buffer ptr, int  _level);/*
		  VkCommandBufferAllocateInfo* vkObj = (VkCommandBufferAllocateInfo*)(ptr);
		  vkObj->level = (VkCommandBufferLevel) (_level);
	  */

	/**
	 * native GET method for field level	[vkenum]<br>
	 * Prototype: VkCommandBufferLevel  level
	 */ 
	 private static native int  getLevel0(Buffer ptr);/*
		  VkCommandBufferAllocateInfo* vkObj = (VkCommandBufferAllocateInfo*)(ptr);
		  return (jobject) (vkObj->level);
	 */

	/**
	 * native SET method for field commandBufferCount	[int]<br>
	 * Prototype: uint32_t  commandBufferCount
	 */ 
	 private static native void setCommandBufferCount0(Buffer ptr, int _commandBufferCount);/*
		  VkCommandBufferAllocateInfo* vkObj = (VkCommandBufferAllocateInfo*)(ptr);
		  vkObj->commandBufferCount = (uint32_t) (_commandBufferCount);
	  */

	/**
	 * native GET method for field commandBufferCount	[int]<br>
	 * Prototype: uint32_t  commandBufferCount
	 */ 
	 private static native int getCommandBufferCount0(Buffer ptr);/*
		  VkCommandBufferAllocateInfo* vkObj = (VkCommandBufferAllocateInfo*)(ptr);
		  return (jint) (vkObj->commandBufferCount);
	 */



} // end of class VkCommandBufferAllocateInfo
