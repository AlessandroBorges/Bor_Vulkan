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

import java.nio.Buffer;


/**
 *  Project Bor-Vulkan 
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
	/** TAG of this structure [77]  */
	 private static final String TAG = "VkDescriptorBufferInfo";

	/** ID of this structure [77]  */
	 public static final int TAG_ID = VKDESCRIPTORBUFFERINFO_ID;

	/** P wrapper for THIS object */
	 private  P<VkDescriptorBufferInfo> p;

	 ///////////////////
	 // Struct fields //
	 ///////////////////
	/**
	 *  VkBuffer 	buffer	[vkhandle]
	 */ 
	 VkBuffer 	buffer;

	/**
	 *  VkDeviceSize 	offset	[long]
	 */ 
	 long 	offset;

	/**
	 *  VkDeviceSize 	range	[long]
	 */ 
	 long 	range;

	/**
	 * Ctor
	 */
	public VkDescriptorBufferInfo(){ 
		 super(sizeOf()); 
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkDescriptorBufferInfo(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address and memSize
	 * @param address - native address 
	 * @param memSize - buffer size 
	 */
	 public VkDescriptorBufferInfo(long address , int memSize){ 
		 super(address, memSize); 
	 }

	/**
	 * Ctor with Address only. Size guessed by #sizeof()
	 * @param address - native address 
	 */
	 public VkDescriptorBufferInfo(long address){ 
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
	 public static P<VkDescriptorBufferInfo> createNullPointer(){
	        P<VkDescriptorBufferInfo> p = new  P<VkDescriptorBufferInfo>(new VkDescriptorBufferInfo());
	        return p;
	    }


	/** 
	 * Return this VkObject instance wrapped in pointer P<br>
	 *
	 *  P&lt;? extends VkObject &gt;
	 *
	 * @return  a P container wrapping this object.
	 */
	 public P<VkDescriptorBufferInfo> getP() {
	       if(p == null ){
	           p = new P<VkDescriptorBufferInfo> (this);
	       }
	        return p;
	    }


	 ////////////////////////
	 //  SETTERS & GETTERS //
	 ////////////////////////

	/**
	 * Set method for field buffer	[vkhandle]<br>
	 * Prototype: VkBuffer  buffer
	 */ 
	 public void buffer(VkBuffer buffer){
		 this.buffer = buffer;
		 ByteBuffer buff = (buffer==null) ? null : buffer.getPointer();
		 setBuffer0(this.ptr, buff);
	 }

	/**
	 * Get method for field buffer	[vkhandle]<br>
	 * Prototype: VkBuffer  buffer
	 */ 
	 public VkBuffer buffer(){

		 long handle = getBuffer0(super.ptr);
		 if(handle == 0){
		    this.buffer = null;
		    return null;
		  }  

		 if(this.buffer == null){
		    this.buffer = new VkHandle(handle);
		 }else{
		    ((VkHandle)this.buffer).setPointer(handle);
		  }
		 return this.buffer;
	 }

	/**
	 * Set method for field offset	[long]<br>
	 * Prototype: VkDeviceSize  offset
	 */ 
	 public void offset(long offset){
		 this.offset = offset;
		 setOffset0(this.ptr,  offset);
	 }

	/**
	 * Get method for field offset	[long]<br>
	 * Prototype: VkDeviceSize  offset
	 */ 
	 public long offset(){
		 long var = getOffset0(super.ptr);
		 this.offset = var;
		 return this.offset;
	 }

	/**
	 * Set method for field range	[long]<br>
	 * Prototype: VkDeviceSize  range
	 */ 
	 public void range(long range){
		 this.range = range;
		 setRange0(this.ptr,  range);
	 }

	/**
	 * Get method for field range	[long]<br>
	 * Prototype: VkDeviceSize  range
	 */ 
	 public long range(){
		 long var = getRange0(super.ptr);
		 this.range = var;
		 return this.range;
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field buffer	[vkhandle]<br>
	 * Prototype: VkBuffer  buffer
	 */ 
	 private static native void setBuffer0(Buffer ptr, java.nio.ByteBuffer  _buffer);/*
		  VkDescriptorBufferInfo* vkObj = (VkDescriptorBufferInfo*)(ptr);
		  vkObj->buffer = (VkBuffer) (_buffer);
	  */

	/**
	 * native GET method for field buffer	[vkhandle]<br>
	 * Prototype: VkBuffer  buffer
	 */ 
	 private static native long getBuffer0(Buffer ptr);/*
		  VkDescriptorBufferInfo vkObj = (VkDescriptorBufferInfo*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->buffer);	 */

	/**
	 * native SET method for field offset	[long]<br>
	 * Prototype: VkDeviceSize  offset
	 */ 
	 private static native void setOffset0(Buffer ptr, long _offset);/*
		  VkDescriptorBufferInfo* vkObj = (VkDescriptorBufferInfo*)(ptr);
		  vkObj->offset = (VkDeviceSize) (_offset);
	  */

	/**
	 * native GET method for field offset	[long]<br>
	 * Prototype: VkDeviceSize  offset
	 */ 
	 private static native long getOffset0(Buffer ptr);/*
		  VkDescriptorBufferInfo vkObj = (VkDescriptorBufferInfo*)(ptr);
		  return (jlong) (vkObj->offset);
	 */

	/**
	 * native SET method for field range	[long]<br>
	 * Prototype: VkDeviceSize  range
	 */ 
	 private static native void setRange0(Buffer ptr, long _range);/*
		  VkDescriptorBufferInfo* vkObj = (VkDescriptorBufferInfo*)(ptr);
		  vkObj->range = (VkDeviceSize) (_range);
	  */

	/**
	 * native GET method for field range	[long]<br>
	 * Prototype: VkDeviceSize  range
	 */ 
	 private static native long getRange0(Buffer ptr);/*
		  VkDescriptorBufferInfo vkObj = (VkDescriptorBufferInfo*)(ptr);
		  return (jlong) (vkObj->range);
	 */



} // end of class VkDescriptorBufferInfo
