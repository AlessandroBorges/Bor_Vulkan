// class wrapping Vulkan's VkBufferCopy struct.
package bor.vulkan.structs;

import bor.vulkan.*;
import bor.vulkan.enumerations.*;
import java.nio.ByteBuffer;


/**
 *  Class for Java-Vulkan integration 
 *  This class is a Java front end for struct VkBufferCopy 
 * @Author Alessandro Borges 
 */
public class VkBufferCopy extends VkStruct {
	/** ID of this structure [90]  */
	 public static final int TAG = VKBUFFERCOPY_ID;

	 // fields //
	/**
	 *  VkDeviceSize 	srcOffset 
	 */ 
	long 	srcOffset;

	/**
	 *  VkDeviceSize 	dstOffset 
	 */ 
	long 	dstOffset;

	/**
	 *  VkDeviceSize 	size 
	 */ 
	long 	size;

	/**
	 * Ctor
	 */
	public VkBufferCopy(){ 
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
	 * Set method for field srcOffset
	 * Prototype: VkDeviceSize  srcOffset
	 */ 
	 public void srcOffset(long srcOffset){
		 this.srcOffset = srcOffset;
		srcOffset0(super.ptr, srcOffset);
	 }

	/**
	 * get method for field srcOffset
	 * Prototype: VkDeviceSize  srcOffset
	 */ 
	 public long srcOffset(){
		 // return  this.srcOffset;
		 return srcOffset0(super.ptr);
	 }

	/**
	 * Set method for field dstOffset
	 * Prototype: VkDeviceSize  dstOffset
	 */ 
	 public void dstOffset(long dstOffset){
		 this.dstOffset = dstOffset;
		dstOffset0(super.ptr, dstOffset);
	 }

	/**
	 * get method for field dstOffset
	 * Prototype: VkDeviceSize  dstOffset
	 */ 
	 public long dstOffset(){
		 // return  this.dstOffset;
		 return dstOffset0(super.ptr);
	 }

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


	 // ////////////////////////////////
	 // native SETTERS & GETTERS //
	 // ////////////////////////////////
	/**
	 * native Set method for field srcOffset
	 * Prototype: VkDeviceSize  srcOffset
	 */ 
	 private static native void srcOffset0(ByteBuffer ptr, long _srcOffset);/*
		  VkBufferCopy _obj = (VkBufferCopy)(*ptr);
		  _obj.srcOffset = (VkDeviceSize) (_srcOffset);
	  */

	/**
	 * get method for field srcOffset
	 * Prototype: VkDeviceSize  srcOffset
	 */ 
	 private static native long srcOffset0(ByteBuffer ptr);/*
		  VkBufferCopy _obj = (VkBufferCopy)(ptr);
		  return (jlong) (_obj.VkDeviceSize);
	 */

	/**
	 * native Set method for field dstOffset
	 * Prototype: VkDeviceSize  dstOffset
	 */ 
	 private static native void dstOffset0(ByteBuffer ptr, long _dstOffset);/*
		  VkBufferCopy _obj = (VkBufferCopy)(*ptr);
		  _obj.dstOffset = (VkDeviceSize) (_dstOffset);
	  */

	/**
	 * get method for field dstOffset
	 * Prototype: VkDeviceSize  dstOffset
	 */ 
	 private static native long dstOffset0(ByteBuffer ptr);/*
		  VkBufferCopy _obj = (VkBufferCopy)(ptr);
		  return (jlong) (_obj.VkDeviceSize);
	 */

	/**
	 * native Set method for field size
	 * Prototype: VkDeviceSize  size
	 */ 
	 private static native void size0(ByteBuffer ptr, long _size);/*
		  VkBufferCopy _obj = (VkBufferCopy)(*ptr);
		  _obj.size = (VkDeviceSize) (_size);
	  */

	/**
	 * get method for field size
	 * Prototype: VkDeviceSize  size
	 */ 
	 private static native long size0(ByteBuffer ptr);/*
		  VkBufferCopy _obj = (VkBufferCopy)(ptr);
		  return (jlong) (_obj.VkDeviceSize);
	 */



} // end of class VkBufferCopy
