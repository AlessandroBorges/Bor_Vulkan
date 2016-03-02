/**
 * Class wrapping Vulkan's VkDescriptorBufferInfo struct.
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
 *  This class is a Java front end for struct VkDescriptorBufferInfo. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkDescriptorBufferInfo {
 *     VkBuffer        buffer;
 *     VkDeviceSize    offset;
 *     VkDeviceSize    range;
 * } VkDescriptorBufferInfo;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.01 (beta) 
 */
public class VkDescriptorBufferInfo extends VkStruct {
	/** TAG of this structure [201]  */
	 private static final String TAG = "VkDescriptorBufferInfo";

	/** ID of this structure [201]  */
	 public static final int TAG_ID = VKDESCRIPTORBUFFERINFO_ID;

	 // fields //
	/**
	 *  VkBuffer 	buffer	[vkhandle]	 */ 
	VkBuffer 	buffer;

	/**
	 *  VkDeviceSize 	offset		 */ 
	long 	offset;

	/**
	 *  VkDeviceSize 	range		 */ 
	long 	range;

	/**
	 * Ctor
	 */
	public VkDescriptorBufferInfo(){ 
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
	 * Set method for field buffer	[vkhandle]
	 * Prototype: VkBuffer  buffer
	 */ 
	 public void buffer(VkBuffer buffer){
		 this.buffer = buffer;
		buffer0(super.ptr, buffer);
	 }

	/**
	 * get method for field buffer	[vkhandle]
	 * Prototype: VkBuffer  buffer
	 */ 
	 public VkBuffer buffer(){
		 // return  this.buffer;
		 return buffer0(super.ptr);
	 }

	/**
	 * Set method for field offset	
	 * Prototype: VkDeviceSize  offset
	 */ 
	 public void offset(long offset){
		 this.offset = offset;
		offset0(super.ptr, offset);
	 }

	/**
	 * get method for field offset	
	 * Prototype: VkDeviceSize  offset
	 */ 
	 public long offset(){
		 // return  this.offset;
		 return offset0(super.ptr);
	 }

	/**
	 * Set method for field range	
	 * Prototype: VkDeviceSize  range
	 */ 
	 public void range(long range){
		 this.range = range;
		range0(super.ptr, range);
	 }

	/**
	 * get method for field range	
	 * Prototype: VkDeviceSize  range
	 */ 
	 public long range(){
		 // return  this.range;
		 return range0(super.ptr);
	 }


	 // ////////////////////////////////
	 // native SETTERS & GETTERS //
	 // ////////////////////////////////
	/**
	 * native Set method for field buffer	[vkhandle]
	 * Prototype: VkBuffer  buffer
	 */ 
	 private static native void buffer0(ByteBuffer ptr, VkBuffer _buffer);/*
		  VkDescriptorBufferInfo _obj = (VkDescriptorBufferInfo)(*ptr);
		  _obj.buffer = (VkBuffer) (_buffer);
	  */

	/**
	 * get method for field buffer	[vkhandle]
	 * Prototype: VkBuffer  buffer
	 */ 
	 private static native VkBuffer buffer0(ByteBuffer ptr);/*
		  VkDescriptorBufferInfo _obj = (VkDescriptorBufferInfo)(ptr);
		  return (VkBuffer) (_obj.VkBuffer);
	 */

	/**
	 * native Set method for field offset	
	 * Prototype: VkDeviceSize  offset
	 */ 
	 private static native void offset0(ByteBuffer ptr, long _offset);/*
		  VkDescriptorBufferInfo _obj = (VkDescriptorBufferInfo)(*ptr);
		  _obj.offset = (VkDeviceSize) (_offset);
	  */

	/**
	 * get method for field offset	
	 * Prototype: VkDeviceSize  offset
	 */ 
	 private static native long offset0(ByteBuffer ptr);/*
		  VkDescriptorBufferInfo _obj = (VkDescriptorBufferInfo)(ptr);
		  return (jlong) (_obj.VkDeviceSize);
	 */

	/**
	 * native Set method for field range	
	 * Prototype: VkDeviceSize  range
	 */ 
	 private static native void range0(ByteBuffer ptr, long _range);/*
		  VkDescriptorBufferInfo _obj = (VkDescriptorBufferInfo)(*ptr);
		  _obj.range = (VkDeviceSize) (_range);
	  */

	/**
	 * get method for field range	
	 * Prototype: VkDeviceSize  range
	 */ 
	 private static native long range0(ByteBuffer ptr);/*
		  VkDescriptorBufferInfo _obj = (VkDescriptorBufferInfo)(ptr);
		  return (jlong) (_obj.VkDeviceSize);
	 */



} // end of class VkDescriptorBufferInfo
