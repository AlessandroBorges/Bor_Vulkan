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

import java.nio.Buffer;
import java.nio.ByteBuffer;

import bor.vulkan.P;


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

    //@formatter:off
    /*JNI
    #include <BorVulkan.hpp>
    */  

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
		 super(TAG_ID);
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
	 public VkBufferCopy(long address , int memSize){ 
		 super(address, memSize); 
	 }

	/**
	 * Ctor with Address only. Size guessed by #sizeof()
	 * @param address - native address 
	 */
	 public VkBufferCopy(long address){ 
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
		 setSrcOffset0(this.ptr,  srcOffset);
	 }

	/**
	 * Get method for field srcOffset	[long]<br>
	 * Prototype: VkDeviceSize  srcOffset
	 */ 
	 public long srcOffset(){
		 long var = getSrcOffset0(super.ptr);
		 this.srcOffset = var;
		 return this.srcOffset;
	 }

	/**
	 * Set method for field dstOffset	[long]<br>
	 * Prototype: VkDeviceSize  dstOffset
	 */ 
	 public void dstOffset(long dstOffset){
		 this.dstOffset = dstOffset;
		 setDstOffset0(this.ptr,  dstOffset);
	 }

	/**
	 * Get method for field dstOffset	[long]<br>
	 * Prototype: VkDeviceSize  dstOffset
	 */ 
	 public long dstOffset(){
		 long var = getDstOffset0(super.ptr);
		 this.dstOffset = var;
		 return this.dstOffset;
	 }

	/**
	 * Set method for field size	[long]<br>
	 * Prototype: VkDeviceSize  size
	 */ 
	 public void size(long size){
		 this.size = size;
		 setSize0(this.ptr,  size);
	 }

	/**
	 * Get method for field size	[long]<br>
	 * Prototype: VkDeviceSize  size
	 */ 
	 public long size(){
		 long var = getSize0(super.ptr);
		 this.size = var;
		 return this.size;
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field srcOffset	[long]<br>
	 * Prototype: VkDeviceSize  srcOffset
	 */ 
	 private static native void setSrcOffset0(Buffer ptr, long _srcOffset);/*
		  VkBufferCopy* vkObj = (VkBufferCopy*)(ptr);
		  vkObj->srcOffset = (VkDeviceSize) (_srcOffset);
	  */

	/**
	 * native GET method for field srcOffset	[long]<br>
	 * Prototype: VkDeviceSize  srcOffset
	 */ 
	 private static native long getSrcOffset0(Buffer ptr);/*
		  VkBufferCopy* vkObj = (VkBufferCopy*)(ptr);
		  return (jlong) (vkObj->srcOffset);
	 */

	/**
	 * native SET method for field dstOffset	[long]<br>
	 * Prototype: VkDeviceSize  dstOffset
	 */ 
	 private static native void setDstOffset0(Buffer ptr, long _dstOffset);/*
		  VkBufferCopy* vkObj = (VkBufferCopy*)(ptr);
		  vkObj->dstOffset = (VkDeviceSize) (_dstOffset);
	  */

	/**
	 * native GET method for field dstOffset	[long]<br>
	 * Prototype: VkDeviceSize  dstOffset
	 */ 
	 private static native long getDstOffset0(Buffer ptr);/*
		  VkBufferCopy* vkObj = (VkBufferCopy*)(ptr);
		  return (jlong) (vkObj->dstOffset);
	 */

	/**
	 * native SET method for field size	[long]<br>
	 * Prototype: VkDeviceSize  size
	 */ 
	 private static native void setSize0(Buffer ptr, long _size);/*
		  VkBufferCopy* vkObj = (VkBufferCopy*)(ptr);
		  vkObj->size = (VkDeviceSize) (_size);
	  */

	/**
	 * native GET method for field size	[long]<br>
	 * Prototype: VkDeviceSize  size
	 */ 
	 private static native long getSize0(Buffer ptr);/*
		  VkBufferCopy* vkObj = (VkBufferCopy*)(ptr);
		  return (jlong) (vkObj->size);
	 */



} // end of class VkBufferCopy
