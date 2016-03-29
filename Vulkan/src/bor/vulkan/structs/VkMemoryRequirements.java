/**
 * Class wrapping Vulkan's VkMemoryRequirements struct.
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
 *  This class is a Java front end for struct VkMemoryRequirements. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkMemoryRequirements {
 *     VkDeviceSize    size;
 *     VkDeviceSize    alignment;
 *     uint32_t        memoryTypeBits;
 * } VkMemoryRequirements;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.01 (beta) 
 */
public class VkMemoryRequirements extends VkStruct {
	/** TAG of this structure [22]  */
	 private static final String TAG = "VkMemoryRequirements";

	/** ID of this structure [22]  */
	 public static final int TAG_ID = VKMEMORYREQUIREMENTS_ID;

	/** P wrapper for THIS object */
	 private  P<VkMemoryRequirements> p;

	 ///////////////////
	 // Struct fields //
	 ///////////////////
	/**
	 *  VkDeviceSize 	size	[long]
	 */ 
	 long 	size;

	/**
	 *  VkDeviceSize 	alignment	[long]
	 */ 
	 long 	alignment;

	/**
	 *  uint32_t 	memoryTypeBits	[int]
	 */ 
	 int 	memoryTypeBits;

	/**
	 * Ctor
	 */
	public VkMemoryRequirements(){ 
		 super(sizeOf()); 
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkMemoryRequirements(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address and memSize
	 * @param address - native address 
	 * @param memSize - buffer size 
	 */
	 public VkMemoryRequirements(long address, int memSize){ 
		 super(address, memSize); 
	 }

	/** 
	 * Method to get native size of this structure 
	 */
	 public static int sizeOf(){ 
		 return sizeOf(TAG_ID); 
	}


	/**
	 * Create a pointer P to contain a instance of this,
	 * with clean native pointer.<br>
	 * You can use {@link VkStruct#setPointer(ByteBuffer)} to set a new 
	 * native pointer.
	 * @return An instance of P for this VkStruct with null pointer
	 */
	 public static P<VkMemoryRequirements> createNullPointer(){
	        P<VkMemoryRequirements> p = new  P<VkMemoryRequirements>(new VkMemoryRequirements());
	        return p;
	    }


	/** 
	 * Return this VkObject instance wrapped in pointer P<br>
	 *
	 *  P&lt;? extends VkObject &gt;
	 *
	 * @return  a P container wrapping this object.
	 */
	 public P<VkMemoryRequirements> getP() {
	       if(p == null ){
	           p = new P<VkMemoryRequirements> (this);
	       }
	        return p;
	    }


	 ////////////////////////
	 //  SETTERS & GETTERS //
	 ////////////////////////

	/**
	 * Set method for field size	[long]<br>
	 * Prototype: VkDeviceSize  size
	 */ 
	 public void size(long size){
		 this.size = size;
		 size0(this.ptr,  size);
	 }

	/**
	 * Get method for field size	[long]<br>
	 * Prototype: VkDeviceSize  size
	 */ 
	 public long size(){
		 long var = size0(super.ptr);
		 this.size = var;
		 return this.size;
	 }

	/**
	 * Set method for field alignment	[long]<br>
	 * Prototype: VkDeviceSize  alignment
	 */ 
	 public void alignment(long alignment){
		 this.alignment = alignment;
		 alignment0(this.ptr,  alignment);
	 }

	/**
	 * Get method for field alignment	[long]<br>
	 * Prototype: VkDeviceSize  alignment
	 */ 
	 public long alignment(){
		 long var = alignment0(super.ptr);
		 this.alignment = var;
		 return this.alignment;
	 }

	/**
	 * Set method for field memoryTypeBits	[int]<br>
	 * Prototype: uint32_t  memoryTypeBits
	 */ 
	 public void memoryTypeBits(int memoryTypeBits){
		 this.memoryTypeBits = memoryTypeBits;
		 memoryTypeBits0(this.ptr,  memoryTypeBits);
	 }

	/**
	 * Get method for field memoryTypeBits	[int]<br>
	 * Prototype: uint32_t  memoryTypeBits
	 */ 
	 public int memoryTypeBits(){
		 int var = memoryTypeBits0(super.ptr);
		 this.memoryTypeBits = var;
		 return this.memoryTypeBits;
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field size	[long]<br>
	 * Prototype: VkDeviceSize  size
	 */ 
	 private static native void size0(Buffer ptr, long _size);/*
		  VkMemoryRequirements* vkObj = (VkMemoryRequirements*)(ptr);
		  vkObj->size = (VkDeviceSize) (_size);
	  */

	/**
	 * native GET method for field size	[long]<br>
	 * Prototype: VkDeviceSize  size
	 */ 
	 private static native long size0(Buffer ptr);/*
		  VkMemoryRequirements vkObj = (VkMemoryRequirements*)(ptr);
		  return (jlong) (vkObj->size);
	 */

	/**
	 * native SET method for field alignment	[long]<br>
	 * Prototype: VkDeviceSize  alignment
	 */ 
	 private static native void alignment0(Buffer ptr, long _alignment);/*
		  VkMemoryRequirements* vkObj = (VkMemoryRequirements*)(ptr);
		  vkObj->alignment = (VkDeviceSize) (_alignment);
	  */

	/**
	 * native GET method for field alignment	[long]<br>
	 * Prototype: VkDeviceSize  alignment
	 */ 
	 private static native long alignment0(Buffer ptr);/*
		  VkMemoryRequirements vkObj = (VkMemoryRequirements*)(ptr);
		  return (jlong) (vkObj->alignment);
	 */

	/**
	 * native SET method for field memoryTypeBits	[int]<br>
	 * Prototype: uint32_t  memoryTypeBits
	 */ 
	 private static native void memoryTypeBits0(Buffer ptr, int _memoryTypeBits);/*
		  VkMemoryRequirements* vkObj = (VkMemoryRequirements*)(ptr);
		  vkObj->memoryTypeBits = (uint32_t) (_memoryTypeBits);
	  */

	/**
	 * native GET method for field memoryTypeBits	[int]<br>
	 * Prototype: uint32_t  memoryTypeBits
	 */ 
	 private static native int memoryTypeBits0(Buffer ptr);/*
		  VkMemoryRequirements vkObj = (VkMemoryRequirements*)(ptr);
		  return (jint) (vkObj->memoryTypeBits);
	 */



} // end of class VkMemoryRequirements
