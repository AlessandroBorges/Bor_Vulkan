/**
 * Class wrapping Vulkan's VkBufferCopy struct.
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
 *  Project Bor-Vulkan 
 *  Class for Java-Vulkan integration 
 *  This class is a Java front end for struct VkBufferCopy. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkBufferCopy {
 *     VkDeviceSize    srcOffset;
 *     VkDeviceSize    dstOffset;
 *     VkDeviceSize    size;
 * } VkBufferCopy;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.01 (beta) 
 */
public class VkBufferCopy extends VkStruct {
	/** TAG of this structure [90]  */
	 private static final String TAG = "VkBufferCopy";

	/** ID of this structure [90]  */
	 public static final int TAG_ID = VKBUFFERCOPY_ID;

	/** P wrapper for THIS object */
	 private  P<VkBufferCopy> p;

	 ///////////////////
	 // Struct fields //
	 ///////////////////
	/**
	 *  VkDeviceSize 	srcOffset	[long]
	 */ 
	 long 	srcOffset;

	/**
	 *  VkDeviceSize 	dstOffset	[long]
	 */ 
	 long 	dstOffset;

	/**
	 *  VkDeviceSize 	size	[long]
	 */ 
	 long 	size;

	/**
	 * Ctor
	 */
	public VkBufferCopy(){ 
		 super(sizeOf()); 
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkBufferCopy(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address and memSize
	 * @param address - native address 
	 * @param memSize - buffer size 
	 */
	 public VkBufferCopy(long address, int memSize){ 
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
	 public static P<VkBufferCopy> createNullPointer(){
	        P<VkBufferCopy> p = new  P<VkBufferCopy>(new VkBufferCopy());
	        return p;
	    }


	/** 
	 * Return this VkObject instance wrapped in pointer P<br>
	 *
	 *  P&lt;? extends VkObject &gt;
	 *
	 * @return  a P container wrapping this object.
	 */
	 public P<VkBufferCopy> getP() {
	       if(p == null ){
	           p = new P<VkBufferCopy> (this);
	       }
	        return p;
	    }


	 ////////////////////////
	 //  SETTERS & GETTERS //
	 ////////////////////////

	/**
	 * Set method for field srcOffset	[long]<br>
	 * Prototype: VkDeviceSize  srcOffset
	 */ 
	 public void srcOffset(long srcOffset){
		 this.srcOffset = srcOffset;
		srcOffset0(super.ptr, srcOffset);
	 }

	/**
	 * get method for field srcOffset	[long]<br>
	 * Prototype: VkDeviceSize  srcOffset
	 */ 
	 public long srcOffset(){
		 // return  this.srcOffset;
		 return srcOffset0(super.ptr);
	 }

	/**
	 * Set method for field dstOffset	[long]<br>
	 * Prototype: VkDeviceSize  dstOffset
	 */ 
	 public void dstOffset(long dstOffset){
		 this.dstOffset = dstOffset;
		dstOffset0(super.ptr, dstOffset);
	 }

	/**
	 * get method for field dstOffset	[long]<br>
	 * Prototype: VkDeviceSize  dstOffset
	 */ 
	 public long dstOffset(){
		 // return  this.dstOffset;
		 return dstOffset0(super.ptr);
	 }

	/**
	 * Set method for field size	[long]<br>
	 * Prototype: VkDeviceSize  size
	 */ 
	 public void size(long size){
		 this.size = size;
		size0(super.ptr, size);
	 }

	/**
	 * get method for field size	[long]<br>
	 * Prototype: VkDeviceSize  size
	 */ 
	 public long size(){
		 // return  this.size;
		 return size0(super.ptr);
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field srcOffset	[long]<br>
	 * Prototype: VkDeviceSize  srcOffset
	 */ 
	 private static native void srcOffset0(ByteBuffer ptr, long _srcOffset);/*
		  VkBufferCopy _obj = (VkBufferCopy)(*ptr);
		  _obj.srcOffset = (VkDeviceSize) (_srcOffset);
	  */

	/**
	 * native GET method for field srcOffset	[long]<br>
	 * Prototype: VkDeviceSize  srcOffset
	 */ 
	 private static native long srcOffset0(ByteBuffer ptr);/*
		  VkBufferCopy _obj = (VkBufferCopy)(ptr);
		  return (jlong) (_obj.VkDeviceSize);
	 */

	/**
	 * native SET method for field dstOffset	[long]<br>
	 * Prototype: VkDeviceSize  dstOffset
	 */ 
	 private static native void dstOffset0(ByteBuffer ptr, long _dstOffset);/*
		  VkBufferCopy _obj = (VkBufferCopy)(*ptr);
		  _obj.dstOffset = (VkDeviceSize) (_dstOffset);
	  */

	/**
	 * native GET method for field dstOffset	[long]<br>
	 * Prototype: VkDeviceSize  dstOffset
	 */ 
	 private static native long dstOffset0(ByteBuffer ptr);/*
		  VkBufferCopy _obj = (VkBufferCopy)(ptr);
		  return (jlong) (_obj.VkDeviceSize);
	 */

	/**
	 * native SET method for field size	[long]<br>
	 * Prototype: VkDeviceSize  size
	 */ 
	 private static native void size0(ByteBuffer ptr, long _size);/*
		  VkBufferCopy _obj = (VkBufferCopy)(*ptr);
		  _obj.size = (VkDeviceSize) (_size);
	  */

	/**
	 * native GET method for field size	[long]<br>
	 * Prototype: VkDeviceSize  size
	 */ 
	 private static native long size0(ByteBuffer ptr);/*
		  VkBufferCopy _obj = (VkBufferCopy)(ptr);
		  return (jlong) (_obj.VkDeviceSize);
	 */



} // end of class VkBufferCopy
