/**
 * Class wrapping Vulkan's VkSubresourceLayout struct.
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
 *  This class is a Java front end for struct VkSubresourceLayout. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkSubresourceLayout {
 *     VkDeviceSize    offset;
 *     VkDeviceSize    size;
 *     VkDeviceSize    rowPitch;
 *     VkDeviceSize    arrayPitch;
 *     VkDeviceSize    depthPitch;
 * } VkSubresourceLayout;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.01 (beta) 
 */
public class VkSubresourceLayout extends VkStruct {
	/** TAG of this structure [40]  */
	 private static final String TAG = "VkSubresourceLayout";

	/** ID of this structure [40]  */
	 public static final int TAG_ID = VKSUBRESOURCELAYOUT_ID;

	/** P wrapper for THIS object */
	 private  P<VkSubresourceLayout> p;

	 ///////////////////
	 // Struct fields //
	 ///////////////////
	/**
	 *  VkDeviceSize 	offset	[long]
	 */ 
	 long 	offset;

	/**
	 *  VkDeviceSize 	size	[long]
	 */ 
	 long 	size;

	/**
	 *  VkDeviceSize 	rowPitch	[long]
	 */ 
	 long 	rowPitch;

	/**
	 *  VkDeviceSize 	arrayPitch	[long]
	 */ 
	 long 	arrayPitch;

	/**
	 *  VkDeviceSize 	depthPitch	[long]
	 */ 
	 long 	depthPitch;

	/**
	 * Ctor
	 */
	public VkSubresourceLayout(){ 
		 super(sizeOf()); 
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkSubresourceLayout(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address and memSize
	 * @param address - native address 
	 * @param memSize - buffer size 
	 */
	 public VkSubresourceLayout(long address, int memSize){ 
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
	 public static P<VkSubresourceLayout> createNullPointer(){
	        P<VkSubresourceLayout> p = new  P<VkSubresourceLayout>(new VkSubresourceLayout());
	        return p;
	    }


	/** 
	 * Return this VkObject instance wrapped in pointer P<br>
	 *
	 *  P&lt;? extends VkObject &gt;
	 *
	 * @return  a P container wrapping this object.
	 */
	 public P<VkSubresourceLayout> getP() {
	       if(p == null ){
	           p = new P<VkSubresourceLayout> (this);
	       }
	        return p;
	    }


	 ////////////////////////
	 //  SETTERS & GETTERS //
	 ////////////////////////

	/**
	 * Set method for field offset	[long]<br>
	 * Prototype: VkDeviceSize  offset
	 */ 
	 public void offset(long offset){
		 this.offset = offset;
		 offset0(this.ptr,  offset);
	 }

	/**
	 * Get method for field offset	[long]<br>
	 * Prototype: VkDeviceSize  offset
	 */ 
	 public long offset(){
		 long var = offset0(super.ptr);
		 this.offset = var;
		 return this.offset;
	 }

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
	 * Set method for field rowPitch	[long]<br>
	 * Prototype: VkDeviceSize  rowPitch
	 */ 
	 public void rowPitch(long rowPitch){
		 this.rowPitch = rowPitch;
		 rowPitch0(this.ptr,  rowPitch);
	 }

	/**
	 * Get method for field rowPitch	[long]<br>
	 * Prototype: VkDeviceSize  rowPitch
	 */ 
	 public long rowPitch(){
		 long var = rowPitch0(super.ptr);
		 this.rowPitch = var;
		 return this.rowPitch;
	 }

	/**
	 * Set method for field arrayPitch	[long]<br>
	 * Prototype: VkDeviceSize  arrayPitch
	 */ 
	 public void arrayPitch(long arrayPitch){
		 this.arrayPitch = arrayPitch;
		 arrayPitch0(this.ptr,  arrayPitch);
	 }

	/**
	 * Get method for field arrayPitch	[long]<br>
	 * Prototype: VkDeviceSize  arrayPitch
	 */ 
	 public long arrayPitch(){
		 long var = arrayPitch0(super.ptr);
		 this.arrayPitch = var;
		 return this.arrayPitch;
	 }

	/**
	 * Set method for field depthPitch	[long]<br>
	 * Prototype: VkDeviceSize  depthPitch
	 */ 
	 public void depthPitch(long depthPitch){
		 this.depthPitch = depthPitch;
		 depthPitch0(this.ptr,  depthPitch);
	 }

	/**
	 * Get method for field depthPitch	[long]<br>
	 * Prototype: VkDeviceSize  depthPitch
	 */ 
	 public long depthPitch(){
		 long var = depthPitch0(super.ptr);
		 this.depthPitch = var;
		 return this.depthPitch;
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field offset	[long]<br>
	 * Prototype: VkDeviceSize  offset
	 */ 
	 private static native void offset0(Buffer ptr, long _offset);/*
		  VkSubresourceLayout* vkObj = (VkSubresourceLayout*)(ptr);
		  vkObj->offset = (VkDeviceSize) (_offset);
	  */

	/**
	 * native GET method for field offset	[long]<br>
	 * Prototype: VkDeviceSize  offset
	 */ 
	 private static native long offset0(Buffer ptr);/*
		  VkSubresourceLayout vkObj = (VkSubresourceLayout*)(ptr);
		  return (jlong) (vkObj->offset);
	 */

	/**
	 * native SET method for field size	[long]<br>
	 * Prototype: VkDeviceSize  size
	 */ 
	 private static native void size0(Buffer ptr, long _size);/*
		  VkSubresourceLayout* vkObj = (VkSubresourceLayout*)(ptr);
		  vkObj->size = (VkDeviceSize) (_size);
	  */

	/**
	 * native GET method for field size	[long]<br>
	 * Prototype: VkDeviceSize  size
	 */ 
	 private static native long size0(Buffer ptr);/*
		  VkSubresourceLayout vkObj = (VkSubresourceLayout*)(ptr);
		  return (jlong) (vkObj->size);
	 */

	/**
	 * native SET method for field rowPitch	[long]<br>
	 * Prototype: VkDeviceSize  rowPitch
	 */ 
	 private static native void rowPitch0(Buffer ptr, long _rowPitch);/*
		  VkSubresourceLayout* vkObj = (VkSubresourceLayout*)(ptr);
		  vkObj->rowPitch = (VkDeviceSize) (_rowPitch);
	  */

	/**
	 * native GET method for field rowPitch	[long]<br>
	 * Prototype: VkDeviceSize  rowPitch
	 */ 
	 private static native long rowPitch0(Buffer ptr);/*
		  VkSubresourceLayout vkObj = (VkSubresourceLayout*)(ptr);
		  return (jlong) (vkObj->rowPitch);
	 */

	/**
	 * native SET method for field arrayPitch	[long]<br>
	 * Prototype: VkDeviceSize  arrayPitch
	 */ 
	 private static native void arrayPitch0(Buffer ptr, long _arrayPitch);/*
		  VkSubresourceLayout* vkObj = (VkSubresourceLayout*)(ptr);
		  vkObj->arrayPitch = (VkDeviceSize) (_arrayPitch);
	  */

	/**
	 * native GET method for field arrayPitch	[long]<br>
	 * Prototype: VkDeviceSize  arrayPitch
	 */ 
	 private static native long arrayPitch0(Buffer ptr);/*
		  VkSubresourceLayout vkObj = (VkSubresourceLayout*)(ptr);
		  return (jlong) (vkObj->arrayPitch);
	 */

	/**
	 * native SET method for field depthPitch	[long]<br>
	 * Prototype: VkDeviceSize  depthPitch
	 */ 
	 private static native void depthPitch0(Buffer ptr, long _depthPitch);/*
		  VkSubresourceLayout* vkObj = (VkSubresourceLayout*)(ptr);
		  vkObj->depthPitch = (VkDeviceSize) (_depthPitch);
	  */

	/**
	 * native GET method for field depthPitch	[long]<br>
	 * Prototype: VkDeviceSize  depthPitch
	 */ 
	 private static native long depthPitch0(Buffer ptr);/*
		  VkSubresourceLayout vkObj = (VkSubresourceLayout*)(ptr);
		  return (jlong) (vkObj->depthPitch);
	 */



} // end of class VkSubresourceLayout
