// class wrapping Vulkan's VkCommandBufferAllocateInfo struct.
package bor.vulkan.structs;

import bor.vulkan.*;
import bor.vulkan.enumerations.*;
import java.nio.ByteBuffer;


/**
 *  Class for Java-Vulkan integration 
 *  This class is a Java front end for struct VkCommandBufferAllocateInfo 
 * @Author Alessandro Borges 
 */
public class VkCommandBufferAllocateInfo extends VkStruct {
	/** ID of this structure [87]  */
	 public static final int TAG = VKCOMMANDBUFFERALLOCATEINFO_ID;

	 // fields //
	/**
	 *  VkStructureType 	sType 
	 */ 
	VkStructureType 	sType;

	/**
	 *  const void* 	pNext 
	 */ 
	VkObject 	pNext;

	/**
	 *  VkCommandPool 	commandPool 
	 */ 
	VkCommandPool 	commandPool;

	/**
	 *  VkCommandBufferLevel 	level 
	 */ 
	VkCommandBufferLevel 	level;

	/**
	 *  uint32_t 	commandBufferCount 
	 */ 
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
		 return sizeOf(TAG); 
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
	 public void pNext(VkObject pNext){
		 this.pNext = pNext;
		pNext0(super.ptr, pNext);
	 }

	/**
	 * get method for field pNext
	 * Prototype: const void*  pNext
	 */ 
	 public VkObject pNext(){
		 // return  this.pNext;
		 return pNext0(super.ptr);
	 }

	/**
	 * Set method for field commandPool
	 * Prototype: VkCommandPool  commandPool
	 */ 
	 public void commandPool(VkCommandPool commandPool){
		 this.commandPool = commandPool;
		commandPool0(super.ptr, commandPool);
	 }

	/**
	 * get method for field commandPool
	 * Prototype: VkCommandPool  commandPool
	 */ 
	 public VkCommandPool commandPool(){
		 // return  this.commandPool;
		 return commandPool0(super.ptr);
	 }

	/**
	 * Set method for field level
	 * Prototype: VkCommandBufferLevel  level
	 */ 
	 public void level(VkCommandBufferLevel level){
		 this.level = level;
		level0(super.ptr, level);
	 }

	/**
	 * get method for field level
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
	 * native Set method for field sType
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native void sType0(ByteBuffer ptr, VkStructureType _sType);/*
		  VkCommandBufferAllocateInfo _obj = (VkCommandBufferAllocateInfo)(*ptr);
		  _obj.sType = (VkStructureType) (_sType);
	  */

	/**
	 * get method for field sType
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
	 private static native void pNext0(ByteBuffer ptr, VkObject _pNext);/*
		  VkCommandBufferAllocateInfo _obj = (VkCommandBufferAllocateInfo)(*ptr);
		  _obj.pNext = (const void*) (_pNext);
	  */

	/**
	 * get method for field pNext
	 * Prototype: const void*  pNext
	 */ 
	 private static native VkObject pNext0(ByteBuffer ptr);/*
		  VkCommandBufferAllocateInfo _obj = (VkCommandBufferAllocateInfo)(ptr);
		  return (VkObject) (_obj.const void*);
	 */

	/**
	 * native Set method for field commandPool
	 * Prototype: VkCommandPool  commandPool
	 */ 
	 private static native void commandPool0(ByteBuffer ptr, VkCommandPool _commandPool);/*
		  VkCommandBufferAllocateInfo _obj = (VkCommandBufferAllocateInfo)(*ptr);
		  _obj.commandPool = (VkCommandPool) (_commandPool);
	  */

	/**
	 * get method for field commandPool
	 * Prototype: VkCommandPool  commandPool
	 */ 
	 private static native VkCommandPool commandPool0(ByteBuffer ptr);/*
		  VkCommandBufferAllocateInfo _obj = (VkCommandBufferAllocateInfo)(ptr);
		  return (VkCommandPool) (_obj.VkCommandPool);
	 */

	/**
	 * native Set method for field level
	 * Prototype: VkCommandBufferLevel  level
	 */ 
	 private static native void level0(ByteBuffer ptr, VkCommandBufferLevel _level);/*
		  VkCommandBufferAllocateInfo _obj = (VkCommandBufferAllocateInfo)(*ptr);
		  _obj.level = (VkCommandBufferLevel) (_level);
	  */

	/**
	 * get method for field level
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
