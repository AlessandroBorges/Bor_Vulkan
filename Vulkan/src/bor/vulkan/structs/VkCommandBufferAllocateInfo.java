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


/**
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
	/** TAG of this structure [211]  */
	 private static final String TAG = "VkCommandBufferAllocateInfo";

	/** ID of this structure [211]  */
	 public static final int TAG_ID = VKCOMMANDBUFFERALLOCATEINFO_ID;

	 // fields //
	/**
	 *  VkStructureType 	sType	[vkenum]	 */ 
	VkStructureType 	sType;

	/**
	 *  const void* 	pNext		 */ 
	P<VkObject> 	pNext;

	/**
	 *  VkCommandPool 	commandPool	[vkhandle]	 */ 
	VkCommandPool 	commandPool;

	/**
	 *  VkCommandBufferLevel 	level	[vkenum]	 */ 
	VkCommandBufferLevel 	level;

	/**
	 *  uint32_t 	commandBufferCount		 */ 
	int 	commandBufferCount;

	/**
	 * Ctor
	 */
	public VkCommandBufferAllocateInfo(){ 
		 super(sizeOf()); 
	 }

	/** 
	 * Method to get native size of this structure 
	 */
	 public static int sizeOf(){ 
		 return sizeOf(TAG_ID); 
	}


	 ////////////////////////
	 //  SETTERS & GETTERS //
	 ////////////////////////

	/**
	 * Set method for field sType	[vkenum]
	 * Prototype: VkStructureType  sType
	 */ 
	 public void sType(VkStructureType sType){
		 this.sType = sType;
		sType0(super.ptr, sType);
	 }

	/**
	 * get method for field sType	[vkenum]
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
	 * Set method for field commandPool	[vkhandle]
	 * Prototype: VkCommandPool  commandPool
	 */ 
	 public void commandPool(VkCommandPool commandPool){
		 this.commandPool = commandPool;
		commandPool0(super.ptr, commandPool);
	 }

	/**
	 * get method for field commandPool	[vkhandle]
	 * Prototype: VkCommandPool  commandPool
	 */ 
	 public VkCommandPool commandPool(){
		 // return  this.commandPool;
		 return commandPool0(super.ptr);
	 }

	/**
	 * Set method for field level	[vkenum]
	 * Prototype: VkCommandBufferLevel  level
	 */ 
	 public void level(VkCommandBufferLevel level){
		 this.level = level;
		level0(super.ptr, level);
	 }

	/**
	 * get method for field level	[vkenum]
	 * Prototype: VkCommandBufferLevel  level
	 */ 
	 public VkCommandBufferLevel level(){
		 // return  this.level;
		 return level0(super.ptr);
	 }

	/**
	 * Set method for field commandBufferCount	
	 * Prototype: uint32_t  commandBufferCount
	 */ 
	 public void commandBufferCount(int commandBufferCount){
		 this.commandBufferCount = commandBufferCount;
		commandBufferCount0(super.ptr, commandBufferCount);
	 }

	/**
	 * get method for field commandBufferCount	
	 * Prototype: uint32_t  commandBufferCount
	 */ 
	 public int commandBufferCount(){
		 // return  this.commandBufferCount;
		 return commandBufferCount0(super.ptr);
	 }


	 // ////////////////////////////////
	 // native SETTERS & GETTERS //
	 // ////////////////////////////////
	/**
	 * native Set method for field sType	[vkenum]
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native void sType0(ByteBuffer ptr, VkStructureType _sType);/*
		  VkCommandBufferAllocateInfo _obj = (VkCommandBufferAllocateInfo)(*ptr);
		  _obj.sType = (VkStructureType) (_sType);
	  */

	/**
	 * get method for field sType	[vkenum]
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native VkStructureType sType0(ByteBuffer ptr);/*
		  VkCommandBufferAllocateInfo _obj = (VkCommandBufferAllocateInfo)(ptr);
		  return (VkStructureType) (_obj.VkStructureType);
	 */

	/**
	 * native Set method for field pNext	
	 * Prototype: const void*  pNext
	 */ 
	 private static native void pNext0(ByteBuffer ptr, P<VkObject> _pNext);/*
		  VkCommandBufferAllocateInfo _obj = (VkCommandBufferAllocateInfo)(*ptr);
		  _obj.pNext = (const void*) (_pNext);
	  */

	/**
	 * get method for field pNext	
	 * Prototype: const void*  pNext
	 */ 
	 private static native P<VkObject> pNext0(ByteBuffer ptr);/*
		  VkCommandBufferAllocateInfo _obj = (VkCommandBufferAllocateInfo)(ptr);
		  return (P<VkObject>) (_obj.const void*);
	 */

	/**
	 * native Set method for field commandPool	[vkhandle]
	 * Prototype: VkCommandPool  commandPool
	 */ 
	 private static native void commandPool0(ByteBuffer ptr, VkCommandPool _commandPool);/*
		  VkCommandBufferAllocateInfo _obj = (VkCommandBufferAllocateInfo)(*ptr);
		  _obj.commandPool = (VkCommandPool) (_commandPool);
	  */

	/**
	 * get method for field commandPool	[vkhandle]
	 * Prototype: VkCommandPool  commandPool
	 */ 
	 private static native VkCommandPool commandPool0(ByteBuffer ptr);/*
		  VkCommandBufferAllocateInfo _obj = (VkCommandBufferAllocateInfo)(ptr);
		  return (VkCommandPool) (_obj.VkCommandPool);
	 */

	/**
	 * native Set method for field level	[vkenum]
	 * Prototype: VkCommandBufferLevel  level
	 */ 
	 private static native void level0(ByteBuffer ptr, VkCommandBufferLevel _level);/*
		  VkCommandBufferAllocateInfo _obj = (VkCommandBufferAllocateInfo)(*ptr);
		  _obj.level = (VkCommandBufferLevel) (_level);
	  */

	/**
	 * get method for field level	[vkenum]
	 * Prototype: VkCommandBufferLevel  level
	 */ 
	 private static native VkCommandBufferLevel level0(ByteBuffer ptr);/*
		  VkCommandBufferAllocateInfo _obj = (VkCommandBufferAllocateInfo)(ptr);
		  return (VkCommandBufferLevel) (_obj.VkCommandBufferLevel);
	 */

	/**
	 * native Set method for field commandBufferCount	
	 * Prototype: uint32_t  commandBufferCount
	 */ 
	 private static native void commandBufferCount0(ByteBuffer ptr, int _commandBufferCount);/*
		  VkCommandBufferAllocateInfo _obj = (VkCommandBufferAllocateInfo)(*ptr);
		  _obj.commandBufferCount = (uint32_t) (_commandBufferCount);
	  */

	/**
	 * get method for field commandBufferCount	
	 * Prototype: uint32_t  commandBufferCount
	 */ 
	 private static native int commandBufferCount0(ByteBuffer ptr);/*
		  VkCommandBufferAllocateInfo _obj = (VkCommandBufferAllocateInfo)(ptr);
		  return (jint) (_obj.uint32_t);
	 */



} // end of class VkCommandBufferAllocateInfo
