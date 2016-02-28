/**
 * Class wrapping Vulkan's VkPhysicalDeviceMemoryProperties struct.
 * 
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
 *  This class is a Java front end for struct VkPhysicalDeviceMemoryProperties 
 *  <h3>ProtoType:</h3>
 * <pre>
 * typedef struct VkPhysicalDeviceMemoryProperties {
 *     uint32_t        memoryTypeCount;
 *     VkMemoryType    memoryTypes[VK_MAX_MEMORY_TYPES];
 *     uint32_t        memoryHeapCount;
 *     VkMemoryHeap    memoryHeaps[VK_MAX_MEMORY_HEAPS];
 * } VkPhysicalDeviceMemoryProperties;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version 0.8.01
 */
public class VkPhysicalDeviceMemoryProperties extends VkStruct {
	/** TAG of this structure [138]  */
	 private static final String TAG = "VkPhysicalDeviceMemoryProperties";

	/** ID of this structure [138]  */
	 public static final int TAG_ID = VKPHYSICALDEVICEMEMORYPROPERTIES_ID;

	 // fields //
	/**
	 *  uint32_t 	memoryTypeCount 
	 */ 
	int 	memoryTypeCount;

	/**
	 *  VkMemoryType[] 	memoryTypes 
	 */ 
	VkMemoryType[] 	memoryTypes;

	/**
	 *  uint32_t 	memoryHeapCount 
	 */ 
	int 	memoryHeapCount;

	/**
	 *  VkMemoryHeap[] 	memoryHeaps 
	 */ 
	VkMemoryHeap[] 	memoryHeaps;

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
		 return sizeOf(TAG_ID); 
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
	 * Set method for field memoryTypes
	 * Prototype: VkMemoryType[]  memoryTypes
	 */ 
	 public void memoryTypes(VkMemoryType[] memoryTypes){
		 this.memoryTypes = memoryTypes;
		memoryTypes0(super.ptr, memoryTypes);
	 }

	/**
	 * get method for field memoryTypes
	 * Prototype: VkMemoryType[]  memoryTypes
	 */ 
	 public VkMemoryType[] memoryTypes(){
		 // return  this.memoryTypes;
		 return memoryTypes0(super.ptr);
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
	 * Set method for field memoryHeaps
	 * Prototype: VkMemoryHeap[]  memoryHeaps
	 */ 
	 public void memoryHeaps(VkMemoryHeap[] memoryHeaps){
		 this.memoryHeaps = memoryHeaps;
		memoryHeaps0(super.ptr, memoryHeaps);
	 }

	/**
	 * get method for field memoryHeaps
	 * Prototype: VkMemoryHeap[]  memoryHeaps
	 */ 
	 public VkMemoryHeap[] memoryHeaps(){
		 // return  this.memoryHeaps;
		 return memoryHeaps0(super.ptr);
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
	 * native Set method for field memoryTypes
	 * Prototype: VkMemoryType[]  memoryTypes
	 */ 
	 private static native void memoryTypes0(ByteBuffer ptr, VkMemoryType[] _memoryTypes);/*
		  VkPhysicalDeviceMemoryProperties _obj = (VkPhysicalDeviceMemoryProperties)(*ptr);
		  _obj.memoryTypes = (VkMemoryType[]) (_memoryTypes);
	  */

	/**
	 * get method for field memoryTypes
	 * Prototype: VkMemoryType[]  memoryTypes
	 */ 
	 private static native VkMemoryType[] memoryTypes0(ByteBuffer ptr);/*
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
	 * native Set method for field memoryHeaps
	 * Prototype: VkMemoryHeap[]  memoryHeaps
	 */ 
	 private static native void memoryHeaps0(ByteBuffer ptr, VkMemoryHeap[] _memoryHeaps);/*
		  VkPhysicalDeviceMemoryProperties _obj = (VkPhysicalDeviceMemoryProperties)(*ptr);
		  _obj.memoryHeaps = (VkMemoryHeap[]) (_memoryHeaps);
	  */

	/**
	 * get method for field memoryHeaps
	 * Prototype: VkMemoryHeap[]  memoryHeaps
	 */ 
	 private static native VkMemoryHeap[] memoryHeaps0(ByteBuffer ptr);/*
		  VkPhysicalDeviceMemoryProperties _obj = (VkPhysicalDeviceMemoryProperties)(ptr);
		  return (VkMemoryHeap[]) (_obj.VkMemoryHeap[]);
	 */



} // end of class VkPhysicalDeviceMemoryProperties
