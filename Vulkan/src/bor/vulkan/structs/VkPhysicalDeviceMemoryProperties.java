// class wrapping Vulkan's VkPhysicalDeviceMemoryProperties struct.
package bor.vulkan.structs;

import bor.vulkan.*;
import bor.vulkan.enumerations.*;
import java.nio.ByteBuffer;


/**
 *  Class for Java-Vulkan integration 
 *  This class is a Java front end for struct VkPhysicalDeviceMemoryProperties 
 * @Author Alessandro Borges 
 */
public class VkPhysicalDeviceMemoryProperties extends VkStruct {
	/** ID of this structure [14]  */
	 public static final int TAG = VKPHYSICALDEVICEMEMORYPROPERTIES_ID;

	 // fields //
	/**
	 *  uint32_t 	memoryTypeCount 
	 */ 
	int 	memoryTypeCount;

	/**
	 *  VkMemoryType[] 	memoryTypes /* length=VK_MAX_MEMORY_TYPES */ 
	 */ 
	VkMemoryType[] 	memoryTypes /* length=VK_MAX_MEMORY_TYPES */;

	/**
	 *  uint32_t 	memoryHeapCount 
	 */ 
	int 	memoryHeapCount;

	/**
	 *  VkMemoryHeap[] 	memoryHeaps /* length=VK_MAX_MEMORY_HEAPS */ 
	 */ 
	VkMemoryHeap[] 	memoryHeaps /* length=VK_MAX_MEMORY_HEAPS */;

	/**
	 * Ctor
	 */
	public VkPhysicalDeviceMemoryProperties(){ 
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
	 * Set method for field memoryTypeCount
	 * Prototype: uint32_t  memoryTypeCount
	 */ 
	 public void memoryTypeCount(int memoryTypeCount){
		 this.memoryTypeCount = memoryTypeCount;
		memoryTypeCount0(super.ptr, memoryTypeCount);
	 }

	/**
	 * get method for field memoryTypeCount
	 * Prototype: uint32_t  memoryTypeCount
	 */ 
	 public int memoryTypeCount(){
		 // return  this.memoryTypeCount;
		 return memoryTypeCount0(super.ptr);
	 }

	/**
	 * Set method for field memoryTypes /* length=VK_MAX_MEMORY_TYPES */
	 * Prototype: VkMemoryType[]  memoryTypes /* length=VK_MAX_MEMORY_TYPES */
	 */ 
	 public void memoryTypes /* length=VK_MAX_MEMORY_TYPES */(VkMemoryType[] memoryTypes /* length=VK_MAX_MEMORY_TYPES */){
		 this.memoryTypes /* length=VK_MAX_MEMORY_TYPES */ = memoryTypes /* length=VK_MAX_MEMORY_TYPES */;
		memoryTypes /* length=VK_MAX_MEMORY_TYPES */0(super.ptr, memoryTypes /* length=VK_MAX_MEMORY_TYPES */);
	 }

	/**
	 * get method for field memoryTypes /* length=VK_MAX_MEMORY_TYPES */
	 * Prototype: VkMemoryType[]  memoryTypes /* length=VK_MAX_MEMORY_TYPES */
	 */ 
	 public VkMemoryType[] memoryTypes /* length=VK_MAX_MEMORY_TYPES */(){
		 // return  this.memoryTypes /* length=VK_MAX_MEMORY_TYPES */;
		 return memoryTypes /* length=VK_MAX_MEMORY_TYPES */0(super.ptr);
	 }

	/**
	 * Set method for field memoryHeapCount
	 * Prototype: uint32_t  memoryHeapCount
	 */ 
	 public void memoryHeapCount(int memoryHeapCount){
		 this.memoryHeapCount = memoryHeapCount;
		memoryHeapCount0(super.ptr, memoryHeapCount);
	 }

	/**
	 * get method for field memoryHeapCount
	 * Prototype: uint32_t  memoryHeapCount
	 */ 
	 public int memoryHeapCount(){
		 // return  this.memoryHeapCount;
		 return memoryHeapCount0(super.ptr);
	 }

	/**
	 * Set method for field memoryHeaps /* length=VK_MAX_MEMORY_HEAPS */
	 * Prototype: VkMemoryHeap[]  memoryHeaps /* length=VK_MAX_MEMORY_HEAPS */
	 */ 
	 public void memoryHeaps /* length=VK_MAX_MEMORY_HEAPS */(VkMemoryHeap[] memoryHeaps /* length=VK_MAX_MEMORY_HEAPS */){
		 this.memoryHeaps /* length=VK_MAX_MEMORY_HEAPS */ = memoryHeaps /* length=VK_MAX_MEMORY_HEAPS */;
		memoryHeaps /* length=VK_MAX_MEMORY_HEAPS */0(super.ptr, memoryHeaps /* length=VK_MAX_MEMORY_HEAPS */);
	 }

	/**
	 * get method for field memoryHeaps /* length=VK_MAX_MEMORY_HEAPS */
	 * Prototype: VkMemoryHeap[]  memoryHeaps /* length=VK_MAX_MEMORY_HEAPS */
	 */ 
	 public VkMemoryHeap[] memoryHeaps /* length=VK_MAX_MEMORY_HEAPS */(){
		 // return  this.memoryHeaps /* length=VK_MAX_MEMORY_HEAPS */;
		 return memoryHeaps /* length=VK_MAX_MEMORY_HEAPS */0(super.ptr);
	 }


	 // ////////////////////////////////
	 // native SETTERS & GETTERS //
	 // ////////////////////////////////
	/**
	 * native Set method for field memoryTypeCount
	 * Prototype: uint32_t  memoryTypeCount
	 */ 
	 private static native void memoryTypeCount0(ByteBuffer ptr, int _memoryTypeCount);/*
		  VkPhysicalDeviceMemoryProperties _obj = (VkPhysicalDeviceMemoryProperties)(*ptr);
		  _obj.memoryTypeCount = (uint32_t) (_memoryTypeCount);
	  */

	/**
	 * get method for field memoryTypeCount
	 * Prototype: uint32_t  memoryTypeCount
	 */ 
	 private static native int memoryTypeCount0(ByteBuffer ptr);/*
		  VkPhysicalDeviceMemoryProperties _obj = (VkPhysicalDeviceMemoryProperties)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native Set method for field memoryTypes /* length=VK_MAX_MEMORY_TYPES */
	 * Prototype: VkMemoryType[]  memoryTypes /* length=VK_MAX_MEMORY_TYPES */
	 */ 
	 private static native void memoryTypes /* length=VK_MAX_MEMORY_TYPES */0(ByteBuffer ptr, VkMemoryType[] _memoryTypes /* length=VK_MAX_MEMORY_TYPES */);/*
		  VkPhysicalDeviceMemoryProperties _obj = (VkPhysicalDeviceMemoryProperties)(*ptr);
		  _obj.memoryTypes /* length=VK_MAX_MEMORY_TYPES */ = (VkMemoryType[]) (_memoryTypes /* length=VK_MAX_MEMORY_TYPES */);
	  */

	/**
	 * get method for field memoryTypes /* length=VK_MAX_MEMORY_TYPES */
	 * Prototype: VkMemoryType[]  memoryTypes /* length=VK_MAX_MEMORY_TYPES */
	 */ 
	 private static native VkMemoryType[] memoryTypes /* length=VK_MAX_MEMORY_TYPES */0(ByteBuffer ptr);/*
		  VkPhysicalDeviceMemoryProperties _obj = (VkPhysicalDeviceMemoryProperties)(ptr);
		  return (VkMemoryType[]) (_obj.VkMemoryType[]);
	 */

	/**
	 * native Set method for field memoryHeapCount
	 * Prototype: uint32_t  memoryHeapCount
	 */ 
	 private static native void memoryHeapCount0(ByteBuffer ptr, int _memoryHeapCount);/*
		  VkPhysicalDeviceMemoryProperties _obj = (VkPhysicalDeviceMemoryProperties)(*ptr);
		  _obj.memoryHeapCount = (uint32_t) (_memoryHeapCount);
	  */

	/**
	 * get method for field memoryHeapCount
	 * Prototype: uint32_t  memoryHeapCount
	 */ 
	 private static native int memoryHeapCount0(ByteBuffer ptr);/*
		  VkPhysicalDeviceMemoryProperties _obj = (VkPhysicalDeviceMemoryProperties)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native Set method for field memoryHeaps /* length=VK_MAX_MEMORY_HEAPS */
	 * Prototype: VkMemoryHeap[]  memoryHeaps /* length=VK_MAX_MEMORY_HEAPS */
	 */ 
	 private static native void memoryHeaps /* length=VK_MAX_MEMORY_HEAPS */0(ByteBuffer ptr, VkMemoryHeap[] _memoryHeaps /* length=VK_MAX_MEMORY_HEAPS */);/*
		  VkPhysicalDeviceMemoryProperties _obj = (VkPhysicalDeviceMemoryProperties)(*ptr);
		  _obj.memoryHeaps /* length=VK_MAX_MEMORY_HEAPS */ = (VkMemoryHeap[]) (_memoryHeaps /* length=VK_MAX_MEMORY_HEAPS */);
	  */

	/**
	 * get method for field memoryHeaps /* length=VK_MAX_MEMORY_HEAPS */
	 * Prototype: VkMemoryHeap[]  memoryHeaps /* length=VK_MAX_MEMORY_HEAPS */
	 */ 
	 private static native VkMemoryHeap[] memoryHeaps /* length=VK_MAX_MEMORY_HEAPS */0(ByteBuffer ptr);/*
		  VkPhysicalDeviceMemoryProperties _obj = (VkPhysicalDeviceMemoryProperties)(ptr);
		  return (VkMemoryHeap[]) (_obj.VkMemoryHeap[]);
	 */



} // end of class VkPhysicalDeviceMemoryProperties
