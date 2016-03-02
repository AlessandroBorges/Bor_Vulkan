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


/**
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
	/** TAG of this structure [192]  */
	 private static final String TAG = "VkPushConstantRange";

	/** ID of this structure [192]  */
	 public static final int TAG_ID = VKPUSHCONSTANTRANGE_ID;

	 // fields //
	/**
	 *  VkShaderStageFlags 	stageFlags		 */ 
	int 	stageFlags;

	/**
	 *  uint32_t 	offset		 */ 
	int 	offset;

	/**
	 *  uint32_t 	size		 */ 
	int 	size;

	/**
	 * Ctor
	 */
	public VkPushConstantRange(){ 
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
	 * Set method for field stageFlags	
	 * Prototype: VkShaderStageFlags  stageFlags
	 */ 
	 public void stageFlags(int stageFlags){
		 this.stageFlags = stageFlags;
		stageFlags0(super.ptr, stageFlags);
	 }

	/**
	 * get method for field stageFlags	
	 * Prototype: VkShaderStageFlags  stageFlags
	 */ 
	 public int stageFlags(){
		 // return  this.stageFlags;
		 return stageFlags0(super.ptr);
	 }

	/**
	 * Set method for field offset	
	 * Prototype: uint32_t  offset
	 */ 
	 public void offset(int offset){
		 this.offset = offset;
		offset0(super.ptr, offset);
	 }

	/**
	 * get method for field offset	
	 * Prototype: uint32_t  offset
	 */ 
	 public int offset(){
		 // return  this.offset;
		 return offset0(super.ptr);
	 }

	/**
	 * Set method for field size	
	 * Prototype: uint32_t  size
	 */ 
	 public void size(int size){
		 this.size = size;
		size0(super.ptr, size);
	 }

	/**
	 * get method for field size	
	 * Prototype: uint32_t  size
	 */ 
	 public int size(){
		 // return  this.size;
		 return size0(super.ptr);
	 }


	 // ////////////////////////////////
	 // native SETTERS & GETTERS //
	 // ////////////////////////////////
	/**
	 * native Set method for field stageFlags	
	 * Prototype: VkShaderStageFlags  stageFlags
	 */ 
	 private static native void stageFlags0(ByteBuffer ptr, int _stageFlags);/*
		  VkPushConstantRange _obj = (VkPushConstantRange)(*ptr);
		  _obj.stageFlags = (VkShaderStageFlags) (_stageFlags);
	  */

	/**
	 * get method for field stageFlags	
	 * Prototype: VkShaderStageFlags  stageFlags
	 */ 
	 private static native int stageFlags0(ByteBuffer ptr);/*
		  VkPushConstantRange _obj = (VkPushConstantRange)(ptr);
		  return (jint) (_obj.VkShaderStageFlags);
	 */

	/**
	 * native Set method for field offset	
	 * Prototype: uint32_t  offset
	 */ 
	 private static native void offset0(ByteBuffer ptr, int _offset);/*
		  VkPushConstantRange _obj = (VkPushConstantRange)(*ptr);
		  _obj.offset = (uint32_t) (_offset);
	  */

	/**
	 * get method for field offset	
	 * Prototype: uint32_t  offset
	 */ 
	 private static native int offset0(ByteBuffer ptr);/*
		  VkPushConstantRange _obj = (VkPushConstantRange)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native Set method for field size	
	 * Prototype: uint32_t  size
	 */ 
	 private static native void size0(ByteBuffer ptr, int _size);/*
		  VkPushConstantRange _obj = (VkPushConstantRange)(*ptr);
		  _obj.size = (uint32_t) (_size);
	  */

	/**
	 * get method for field size	
	 * Prototype: uint32_t  size
	 */ 
	 private static native int size0(ByteBuffer ptr);/*
		  VkPushConstantRange _obj = (VkPushConstantRange)(ptr);
		  return (jint) (_obj.uint32_t);
	 */



} // end of class VkPushConstantRange
