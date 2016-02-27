// class wrapping Vulkan's VkSubresourceLayout struct.
package bor.vulkan.structs;

import bor.vulkan.*;
import bor.vulkan.enumerations.*;
import java.nio.ByteBuffer;


/**
 *  Class for Java-Vulkan integration 
 *  This class is a Java front end for struct VkSubresourceLayout 
 * @Author Alessandro Borges 
 */
public class VkSubresourceLayout extends VkStruct {
	/** ID of this structure [40]  */
	 public static final int TAG = VKSUBRESOURCELAYOUT_ID;

	 // fields //
	/**
	 *  VkDeviceSize 	offset 
	 */ 
	long 	offset;

	/**
	 *  VkDeviceSize 	size 
	 */ 
	long 	size;

	/**
	 *  VkDeviceSize 	rowPitch 
	 */ 
	long 	rowPitch;

	/**
	 *  VkDeviceSize 	arrayPitch 
	 */ 
	long 	arrayPitch;

	/**
	 *  VkDeviceSize 	depthPitch 
	 */ 
	long 	depthPitch;

	/**
	 * Ctor
	 */
	public VkSubresourceLayout(){ 
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
	 * Set method for field rowPitch
	 * Prototype: VkDeviceSize  rowPitch
	 */ 
	 public void rowPitch(long rowPitch){
		 this.rowPitch = rowPitch;
		rowPitch0(super.ptr, rowPitch);
	 }

	/**
	 * get method for field rowPitch
	 * Prototype: VkDeviceSize  rowPitch
	 */ 
	 public long rowPitch(){
		 // return  this.rowPitch;
		 return rowPitch0(super.ptr);
	 }

	/**
	 * Set method for field arrayPitch
	 * Prototype: VkDeviceSize  arrayPitch
	 */ 
	 public void arrayPitch(long arrayPitch){
		 this.arrayPitch = arrayPitch;
		arrayPitch0(super.ptr, arrayPitch);
	 }

	/**
	 * get method for field arrayPitch
	 * Prototype: VkDeviceSize  arrayPitch
	 */ 
	 public long arrayPitch(){
		 // return  this.arrayPitch;
		 return arrayPitch0(super.ptr);
	 }

	/**
	 * Set method for field depthPitch
	 * Prototype: VkDeviceSize  depthPitch
	 */ 
	 public void depthPitch(long depthPitch){
		 this.depthPitch = depthPitch;
		depthPitch0(super.ptr, depthPitch);
	 }

	/**
	 * get method for field depthPitch
	 * Prototype: VkDeviceSize  depthPitch
	 */ 
	 public long depthPitch(){
		 // return  this.depthPitch;
		 return depthPitch0(super.ptr);
	 }


	 // ////////////////////////////////
	 // native SETTERS & GETTERS //
	 // ////////////////////////////////
	/**
	 * native Set method for field offset
	 * Prototype: VkDeviceSize  offset
	 */ 
	 private static native void offset0(ByteBuffer ptr, long _offset);/*
		  VkSubresourceLayout _obj = (VkSubresourceLayout)(*ptr);
		  _obj.offset = (VkDeviceSize) (_offset);
	  */

	/**
	 * get method for field offset
	 * Prototype: VkDeviceSize  offset
	 */ 
	 private static native long offset0(ByteBuffer ptr);/*
		  VkSubresourceLayout _obj = (VkSubresourceLayout)(ptr);
		  return (jlong) (_obj.VkDeviceSize);
	 */

	/**
	 * native Set method for field size
	 * Prototype: VkDeviceSize  size
	 */ 
	 private static native void size0(ByteBuffer ptr, long _size);/*
		  VkSubresourceLayout _obj = (VkSubresourceLayout)(*ptr);
		  _obj.size = (VkDeviceSize) (_size);
	  */

	/**
	 * get method for field size
	 * Prototype: VkDeviceSize  size
	 */ 
	 private static native long size0(ByteBuffer ptr);/*
		  VkSubresourceLayout _obj = (VkSubresourceLayout)(ptr);
		  return (jlong) (_obj.VkDeviceSize);
	 */

	/**
	 * native Set method for field rowPitch
	 * Prototype: VkDeviceSize  rowPitch
	 */ 
	 private static native void rowPitch0(ByteBuffer ptr, long _rowPitch);/*
		  VkSubresourceLayout _obj = (VkSubresourceLayout)(*ptr);
		  _obj.rowPitch = (VkDeviceSize) (_rowPitch);
	  */

	/**
	 * get method for field rowPitch
	 * Prototype: VkDeviceSize  rowPitch
	 */ 
	 private static native long rowPitch0(ByteBuffer ptr);/*
		  VkSubresourceLayout _obj = (VkSubresourceLayout)(ptr);
		  return (jlong) (_obj.VkDeviceSize);
	 */

	/**
	 * native Set method for field arrayPitch
	 * Prototype: VkDeviceSize  arrayPitch
	 */ 
	 private static native void arrayPitch0(ByteBuffer ptr, long _arrayPitch);/*
		  VkSubresourceLayout _obj = (VkSubresourceLayout)(*ptr);
		  _obj.arrayPitch = (VkDeviceSize) (_arrayPitch);
	  */

	/**
	 * get method for field arrayPitch
	 * Prototype: VkDeviceSize  arrayPitch
	 */ 
	 private static native long arrayPitch0(ByteBuffer ptr);/*
		  VkSubresourceLayout _obj = (VkSubresourceLayout)(ptr);
		  return (jlong) (_obj.VkDeviceSize);
	 */

	/**
	 * native Set method for field depthPitch
	 * Prototype: VkDeviceSize  depthPitch
	 */ 
	 private static native void depthPitch0(ByteBuffer ptr, long _depthPitch);/*
		  VkSubresourceLayout _obj = (VkSubresourceLayout)(*ptr);
		  _obj.depthPitch = (VkDeviceSize) (_depthPitch);
	  */

	/**
	 * get method for field depthPitch
	 * Prototype: VkDeviceSize  depthPitch
	 */ 
	 private static native long depthPitch0(ByteBuffer ptr);/*
		  VkSubresourceLayout _obj = (VkSubresourceLayout)(ptr);
		  return (jlong) (_obj.VkDeviceSize);
	 */



} // end of class VkSubresourceLayout
