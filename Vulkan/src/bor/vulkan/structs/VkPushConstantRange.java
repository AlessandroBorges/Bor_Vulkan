/**
 * Class wrapping Vulkan's VkPushConstantRange struct.
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
 *  This class is a Java front end for struct VkPushConstantRange. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkPushConstantRange {
 *     VkShaderStageFlags    stageFlags;
 *     uint32_t              offset;
 *     uint32_t              size;
 * } VkPushConstantRange;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.01 (beta) 
 */
public class VkPushConstantRange extends VkStruct {
	/** TAG of this structure [68]  */
	 private static final String TAG = "VkPushConstantRange";

	/** ID of this structure [68]  */
	 public static final int TAG_ID = VKPUSHCONSTANTRANGE_ID;

	/** P wrapper for THIS object */
	 private  P<VkPushConstantRange> p;

	 ///////////////////
	 // Struct fields //
	 ///////////////////
	/**
	 *  VkShaderStageFlags 	stageFlags	[int]
	 */ 
	 int 	stageFlags;

	/**
	 *  uint32_t 	offset	[int]
	 */ 
	 int 	offset;

	/**
	 *  uint32_t 	size	[int]
	 */ 
	 int 	size;

	/**
	 * Ctor
	 */
	public VkPushConstantRange(){ 
		 super(sizeOf()); 
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkPushConstantRange(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address and memSize
	 * @param address - native address 
	 * @param memSize - buffer size 
	 */
	 public VkPushConstantRange(long address, int memSize){ 
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
	 public static P<VkPushConstantRange> createNullPointer(){
	        P<VkPushConstantRange> p = new  P<VkPushConstantRange>(new VkPushConstantRange());
	        return p;
	    }


	/** 
	 * Return this VkObject instance wrapped in pointer P<br>
	 *
	 *  P&lt;? extends VkObject &gt;
	 *
	 * @return  a P container wrapping this object.
	 */
	 public P<VkPushConstantRange> getP() {
	       if(p == null ){
	           p = new P<VkPushConstantRange> (this);
	       }
	        return p;
	    }


	 ////////////////////////
	 //  SETTERS & GETTERS //
	 ////////////////////////

	/**
	 * Set method for field stageFlags	[int]<br>
	 * Prototype: VkShaderStageFlags  stageFlags
	 */ 
	 public void stageFlags(int stageFlags){
		 this.stageFlags = stageFlags;
		 stageFlags0(this.ptr,  stageFlags);
	 }

	/**
	 * Get method for field stageFlags	[int]<br>
	 * Prototype: VkShaderStageFlags  stageFlags
	 */ 
	 public int stageFlags(){
		 int var = stageFlags0(super.ptr);
		 this.stageFlags = var;
		 return this.stageFlags;
	 }

	/**
	 * Set method for field offset	[int]<br>
	 * Prototype: uint32_t  offset
	 */ 
	 public void offset(int offset){
		 this.offset = offset;
		 offset0(this.ptr,  offset);
	 }

	/**
	 * Get method for field offset	[int]<br>
	 * Prototype: uint32_t  offset
	 */ 
	 public int offset(){
		 int var = offset0(super.ptr);
		 this.offset = var;
		 return this.offset;
	 }

	/**
	 * Set method for field size	[int]<br>
	 * Prototype: uint32_t  size
	 */ 
	 public void size(int size){
		 this.size = size;
		 size0(this.ptr,  size);
	 }

	/**
	 * Get method for field size	[int]<br>
	 * Prototype: uint32_t  size
	 */ 
	 public int size(){
		 int var = size0(super.ptr);
		 this.size = var;
		 return this.size;
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field stageFlags	[int]<br>
	 * Prototype: VkShaderStageFlags  stageFlags
	 */ 
	 private static native void stageFlags0(Buffer ptr, int _stageFlags);/*
		  VkPushConstantRange* vkObj = (VkPushConstantRange*)(ptr);
		  vkObj->stageFlags = (VkShaderStageFlags) (_stageFlags);
	  */

	/**
	 * native GET method for field stageFlags	[int]<br>
	 * Prototype: VkShaderStageFlags  stageFlags
	 */ 
	 private static native int stageFlags0(Buffer ptr);/*
		  VkPushConstantRange vkObj = (VkPushConstantRange*)(ptr);
		  return (jint) (vkObj->stageFlags);
	 */

	/**
	 * native SET method for field offset	[int]<br>
	 * Prototype: uint32_t  offset
	 */ 
	 private static native void offset0(Buffer ptr, int _offset);/*
		  VkPushConstantRange* vkObj = (VkPushConstantRange*)(ptr);
		  vkObj->offset = (uint32_t) (_offset);
	  */

	/**
	 * native GET method for field offset	[int]<br>
	 * Prototype: uint32_t  offset
	 */ 
	 private static native int offset0(Buffer ptr);/*
		  VkPushConstantRange vkObj = (VkPushConstantRange*)(ptr);
		  return (jint) (vkObj->offset);
	 */

	/**
	 * native SET method for field size	[int]<br>
	 * Prototype: uint32_t  size
	 */ 
	 private static native void size0(Buffer ptr, int _size);/*
		  VkPushConstantRange* vkObj = (VkPushConstantRange*)(ptr);
		  vkObj->size = (uint32_t) (_size);
	  */

	/**
	 * native GET method for field size	[int]<br>
	 * Prototype: uint32_t  size
	 */ 
	 private static native int size0(Buffer ptr);/*
		  VkPushConstantRange vkObj = (VkPushConstantRange*)(ptr);
		  return (jint) (vkObj->size);
	 */



} // end of class VkPushConstantRange
