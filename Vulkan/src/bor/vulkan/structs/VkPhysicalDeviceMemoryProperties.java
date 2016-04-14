/**
 * Class wrapping Vulkan's VkPhysicalDeviceMemoryProperties struct.
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
 *  This class is a Java front end for struct VkPhysicalDeviceMemoryProperties. 
 *  <h3>Prototype:</h3>
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
 * @version Ver. 0.8.01 (beta) 
 */
public class VkPhysicalDeviceMemoryProperties extends VkStruct {
	/** TAG of this structure [14]  */
	 private static final String TAG = "VkPhysicalDeviceMemoryProperties";

	/** ID of this structure [14]  */
	 public static final int TAG_ID = VKPHYSICALDEVICEMEMORYPROPERTIES_ID;

	/** P wrapper for THIS object */
	 private  P<VkPhysicalDeviceMemoryProperties> p;

	 ///////////////////
	 // Struct fields //
	 ///////////////////
	/**
	 *  uint32_t 	memoryTypeCount	[int]
	 */ 
	 int 	memoryTypeCount;

	/**
	 *  VkMemoryType[] 	memoryTypes	
	 */ 
	 VkMemoryType[] 	memoryTypes;

	/**
	 *  uint32_t 	memoryHeapCount	[int]
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
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkPhysicalDeviceMemoryProperties(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address and memSize
	 * @param address - native address 
	 * @param memSize - buffer size 
	 */
	 public VkPhysicalDeviceMemoryProperties(long address , int memSize){ 
		 super(address, memSize); 
	 }

	/**
	 * Ctor with Address only. Size guessed by #sizeof()
	 * @param address - native address 
	 */
	 public VkPhysicalDeviceMemoryProperties(long address){ 
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
	 public static P<VkPhysicalDeviceMemoryProperties> createNullPointer(){
	        P<VkPhysicalDeviceMemoryProperties> p = new  P<VkPhysicalDeviceMemoryProperties>(new VkPhysicalDeviceMemoryProperties());
	        return p;
	    }


	/** 
	 * Return this VkObject instance wrapped in pointer P<br>
	 *
	 *  P&lt;? extends VkObject &gt;
	 *
	 * @return  a P container wrapping this object.
	 */
	 public P<VkPhysicalDeviceMemoryProperties> getP() {
	       if(p == null ){
	           p = new P<VkPhysicalDeviceMemoryProperties> (this);
	       }
	        return p;
	    }


	 ////////////////////////
	 //  SETTERS & GETTERS //
	 ////////////////////////

	/**
	 * Set method for field memoryTypeCount	[int]<br>
	 * Prototype: uint32_t  memoryTypeCount
	 */ 
	 public void memoryTypeCount(int memoryTypeCount){
		 this.memoryTypeCount = memoryTypeCount;
		 setMemoryTypeCount0(this.ptr,  memoryTypeCount);
	 }

	/**
	 * Get method for field memoryTypeCount	[int]<br>
	 * Prototype: uint32_t  memoryTypeCount
	 */ 
	 public int memoryTypeCount(){
		 int var = getMemoryTypeCount0(super.ptr);
		 this.memoryTypeCount = var;
		 return this.memoryTypeCount;
	 }

	/**
	 * Set method for field memoryTypes	<br>
	 * Prototype: VkMemoryType[]  memoryTypes
	 */ 
	 public void memoryTypes(VkMemoryType[] memoryTypes){
		 this.memoryTypes = memoryTypes;
		 setMemoryTypes0(this.ptr,  memoryTypes);
	 }

	/**
	 * Get method for field memoryTypes	<br>
	 * Prototype: VkMemoryType[]  memoryTypes
	 */ 
	 public VkMemoryType[] memoryTypes(){
		 VkMemoryType[] var = getMemoryTypes0(super.ptr);
		 this.memoryTypes = var;
		 return this.memoryTypes;
	 }

	/**
	 * Set method for field memoryHeapCount	[int]<br>
	 * Prototype: uint32_t  memoryHeapCount
	 */ 
	 public void memoryHeapCount(int memoryHeapCount){
		 this.memoryHeapCount = memoryHeapCount;
		 setMemoryHeapCount0(this.ptr,  memoryHeapCount);
	 }

	/**
	 * Get method for field memoryHeapCount	[int]<br>
	 * Prototype: uint32_t  memoryHeapCount
	 */ 
	 public int memoryHeapCount(){
		 int var = getMemoryHeapCount0(super.ptr);
		 this.memoryHeapCount = var;
		 return this.memoryHeapCount;
	 }

	/**
	 * Set method for field memoryHeaps	<br>
	 * Prototype: VkMemoryHeap[]  memoryHeaps
	 */ 
	 public void memoryHeaps(VkMemoryHeap[] memoryHeaps){
		 this.memoryHeaps = memoryHeaps;
		 setMemoryHeaps0(this.ptr,  memoryHeaps);
	 }

	/**
	 * Get method for field memoryHeaps	<br>
	 * Prototype: VkMemoryHeap[]  memoryHeaps
	 */ 
	 public VkMemoryHeap[] memoryHeaps(){
		 VkMemoryHeap[] var = getMemoryHeaps0(super.ptr);
		 this.memoryHeaps = var;
		 return this.memoryHeaps;
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field memoryTypeCount	[int]<br>
	 * Prototype: uint32_t  memoryTypeCount
	 */ 
	 private static native void setMemoryTypeCount0(Buffer ptr, int _memoryTypeCount);/*
		  VkPhysicalDeviceMemoryProperties* vkObj = (VkPhysicalDeviceMemoryProperties*)(ptr);
		  vkObj->memoryTypeCount = (uint32_t) (_memoryTypeCount);
	  */

	/**
	 * native GET method for field memoryTypeCount	[int]<br>
	 * Prototype: uint32_t  memoryTypeCount
	 */ 
	 private static native int getMemoryTypeCount0(Buffer ptr);/*
		  VkPhysicalDeviceMemoryProperties vkObj = (VkPhysicalDeviceMemoryProperties*)(ptr);
		  return (jint) (vkObj->memoryTypeCount);
	 */

	/**
	 * native SET method for field memoryTypes	<br>
	 * Prototype: VkMemoryType[]  memoryTypes
	 */ 
	 private static native void setMemoryTypes0(Buffer ptr, VkMemoryType[] _memoryTypes);/*
		  VkPhysicalDeviceMemoryProperties* vkObj = (VkPhysicalDeviceMemoryProperties*)(ptr);
		  vkObj->memoryTypes = (VkMemoryType[]) (_memoryTypes);
	  */

	/**
	 * native GET method for field memoryTypes	<br>
	 * Prototype: VkMemoryType[]  memoryTypes
	 */ 
	 private static native VkMemoryType[] getMemoryTypes0(Buffer ptr);/*
		  VkPhysicalDeviceMemoryProperties vkObj = (VkPhysicalDeviceMemoryProperties*)(ptr);
		  return (VkMemoryType[]) (vkObj->memoryTypes);
	 */

	/**
	 * native SET method for field memoryHeapCount	[int]<br>
	 * Prototype: uint32_t  memoryHeapCount
	 */ 
	 private static native void setMemoryHeapCount0(Buffer ptr, int _memoryHeapCount);/*
		  VkPhysicalDeviceMemoryProperties* vkObj = (VkPhysicalDeviceMemoryProperties*)(ptr);
		  vkObj->memoryHeapCount = (uint32_t) (_memoryHeapCount);
	  */

	/**
	 * native GET method for field memoryHeapCount	[int]<br>
	 * Prototype: uint32_t  memoryHeapCount
	 */ 
	 private static native int getMemoryHeapCount0(Buffer ptr);/*
		  VkPhysicalDeviceMemoryProperties vkObj = (VkPhysicalDeviceMemoryProperties*)(ptr);
		  return (jint) (vkObj->memoryHeapCount);
	 */

	/**
	 * native SET method for field memoryHeaps	<br>
	 * Prototype: VkMemoryHeap[]  memoryHeaps
	 */ 
	 private static native void setMemoryHeaps0(Buffer ptr, VkMemoryHeap[] _memoryHeaps);/*
		  VkPhysicalDeviceMemoryProperties* vkObj = (VkPhysicalDeviceMemoryProperties*)(ptr);
		  vkObj->memoryHeaps = (VkMemoryHeap[]) (_memoryHeaps);
	  */

	/**
	 * native GET method for field memoryHeaps	<br>
	 * Prototype: VkMemoryHeap[]  memoryHeaps
	 */ 
	 private static native VkMemoryHeap[] getMemoryHeaps0(Buffer ptr);/*
		  VkPhysicalDeviceMemoryProperties vkObj = (VkPhysicalDeviceMemoryProperties*)(ptr);
		  return (VkMemoryHeap[]) (vkObj->memoryHeaps);
	 */



} // end of class VkPhysicalDeviceMemoryProperties
