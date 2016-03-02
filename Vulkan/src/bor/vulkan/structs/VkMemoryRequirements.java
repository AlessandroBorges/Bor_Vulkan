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


/**
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
	/** TAG of this structure [146]  */
	 private static final String TAG = "VkMemoryRequirements";

	/** ID of this structure [146]  */
	 public static final int TAG_ID = VKMEMORYREQUIREMENTS_ID;

	 // fields //
	/**
	 *  VkDeviceSize 	size 
	 */ 
	long 	size;

	/**
	 *  VkDeviceSize 	alignment 
	 */ 
	long 	alignment;

	/**
	 *  uint32_t 	memoryTypeBits 
	 */ 
	int 	memoryTypeBits;

	/**
	 * Ctor
	 */
	public VkMemoryRequirements(){ 
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
	 * Set method for field size
	 * Prototype: VkDeviceSize  size
	 */ 
	 public void size(long size){
		 this.size = size;
		size0(super.ptr, size);
	 }

	/**
	 * get method for field size
	 * Prototype: VkDeviceSize  size
	 */ 
	 public long size(){
		 // return  this.size;
		 return size0(super.ptr);
	 }

	/**
	 * Set method for field alignment
	 * Prototype: VkDeviceSize  alignment
	 */ 
	 public void alignment(long alignment){
		 this.alignment = alignment;
		alignment0(super.ptr, alignment);
	 }

	/**
	 * get method for field alignment
	 * Prototype: VkDeviceSize  alignment
	 */ 
	 public long alignment(){
		 // return  this.alignment;
		 return alignment0(super.ptr);
	 }

	/**
	 * Set method for field memoryTypeBits
	 * Prototype: uint32_t  memoryTypeBits
	 */ 
	 public void memoryTypeBits(int memoryTypeBits){
		 this.memoryTypeBits = memoryTypeBits;
		memoryTypeBits0(super.ptr, memoryTypeBits);
	 }

	/**
	 * get method for field memoryTypeBits
	 * Prototype: uint32_t  memoryTypeBits
	 */ 
	 public int memoryTypeBits(){
		 // return  this.memoryTypeBits;
		 return memoryTypeBits0(super.ptr);
	 }


	 // ////////////////////////////////
	 // native SETTERS & GETTERS //
	 // ////////////////////////////////
	/**
	 * native Set method for field size
	 * Prototype: VkDeviceSize  size
	 */ 
	 private static native void size0(ByteBuffer ptr, long _size);/*
		  VkMemoryRequirements _obj = (VkMemoryRequirements)(*ptr);
		  _obj.size = (VkDeviceSize) (_size);
	  */

	/**
	 * get method for field size
	 * Prototype: VkDeviceSize  size
	 */ 
	 private static native long size0(ByteBuffer ptr);/*
		  VkMemoryRequirements _obj = (VkMemoryRequirements)(ptr);
		  return (jlong) (_obj.VkDeviceSize);
	 */

	/**
	 * native Set method for field alignment
	 * Prototype: VkDeviceSize  alignment
	 */ 
	 private static native void alignment0(ByteBuffer ptr, long _alignment);/*
		  VkMemoryRequirements _obj = (VkMemoryRequirements)(*ptr);
		  _obj.alignment = (VkDeviceSize) (_alignment);
	  */

	/**
	 * get method for field alignment
	 * Prototype: VkDeviceSize  alignment
	 */ 
	 private static native long alignment0(ByteBuffer ptr);/*
		  VkMemoryRequirements _obj = (VkMemoryRequirements)(ptr);
		  return (jlong) (_obj.VkDeviceSize);
	 */

	/**
	 * native Set method for field memoryTypeBits
	 * Prototype: uint32_t  memoryTypeBits
	 */ 
	 private static native void memoryTypeBits0(ByteBuffer ptr, int _memoryTypeBits);/*
		  VkMemoryRequirements _obj = (VkMemoryRequirements)(*ptr);
		  _obj.memoryTypeBits = (uint32_t) (_memoryTypeBits);
	  */

	/**
	 * get method for field memoryTypeBits
	 * Prototype: uint32_t  memoryTypeBits
	 */ 
	 private static native int memoryTypeBits0(ByteBuffer ptr);/*
		  VkMemoryRequirements _obj = (VkMemoryRequirements)(ptr);
		  return (jint) (_obj.uint32_t);
	 */



} // end of class VkMemoryRequirements
