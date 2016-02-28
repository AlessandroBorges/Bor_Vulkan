/**
 * Class wrapping Vulkan's VkBufferViewCreateInfo struct.
 * 
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
 *  This class is a Java front end for struct VkBufferViewCreateInfo 
 *  <h3>ProtoType:</h3>
 * <pre>
 * typedef struct VkBufferViewCreateInfo {
 *     VkStructureType            sType;
 *     const void*                pNext;
 *     VkBufferViewCreateFlags    flags;
 *     VkBuffer                   buffer;
 *     VkFormat                   format;
 *     VkDeviceSize               offset;
 *     VkDeviceSize               range;
 * } VkBufferViewCreateInfo;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version 0.8.01
 */
public class VkBufferViewCreateInfo extends VkStruct {
	/** TAG of this structure [162]  */
	 private static final String TAG = "VkBufferViewCreateInfo";

	/** ID of this structure [162]  */
	 public static final int TAG_ID = VKBUFFERVIEWCREATEINFO_ID;

	 // fields //
	/**
	 *  VkStructureType 	sType 
	 */ 
	VkStructureType 	sType;

	/**
	 *  const void* 	pNext 
	 */ 
	P<VkObject> 	pNext;

	/**
	 *  VkBufferViewCreateFlags 	flags 
	 */ 
	int 	flags;

	/**
	 *  VkBuffer 	buffer 
	 */ 
	VkBuffer 	buffer;

	/**
	 *  VkFormat 	format 
	 */ 
	VkFormat 	format;

	/**
	 *  VkDeviceSize 	offset 
	 */ 
	long 	offset;

	/**
	 *  VkDeviceSize 	range 
	 */ 
	long 	range;

	/**
	 * Ctor
	 */
	public VkBufferViewCreateInfo(){ 
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
	 * Set method for field sType
	 * Prototype: VkStructureType  sType
	 */ 
	 public void sType(VkStructureType sType){
		 this.sType = sType;
		sType0(super.ptr, sType);
	 }

	/**
	 * get method for field sType
	 * Prototype: VkStructureType  sType
	 */ 
	 public VkStructureType sType(){
		 // return  this.sType;
		 return sType0(super.ptr);
	 }

	/**
	 * Set method for field pNext
	 * Prototype: const void*  pNext
	 */ 
	 public void pNext(P<VkObject> pNext){
		 this.pNext = pNext;
		pNext0(super.ptr, pNext);
	 }

	/**
	 * get method for field pNext
	 * Prototype: const void*  pNext
	 */ 
	 public P<VkObject> pNext(){
		 // return  this.pNext;
		 return pNext0(super.ptr);
	 }

	/**
	 * Set method for field flags
	 * Prototype: VkBufferViewCreateFlags  flags
	 */ 
	 public void flags(int flags){
		 this.flags = flags;
		flags0(super.ptr, flags);
	 }

	/**
	 * get method for field flags
	 * Prototype: VkBufferViewCreateFlags  flags
	 */ 
	 public int flags(){
		 // return  this.flags;
		 return flags0(super.ptr);
	 }

	/**
	 * Set method for field buffer
	 * Prototype: VkBuffer  buffer
	 */ 
	 public void buffer(VkBuffer buffer){
		 this.buffer = buffer;
		buffer0(super.ptr, buffer);
	 }

	/**
	 * get method for field buffer
	 * Prototype: VkBuffer  buffer
	 */ 
	 public VkBuffer buffer(){
		 // return  this.buffer;
		 return buffer0(super.ptr);
	 }

	/**
	 * Set method for field format
	 * Prototype: VkFormat  format
	 */ 
	 public void format(VkFormat format){
		 this.format = format;
		format0(super.ptr, format);
	 }

	/**
	 * get method for field format
	 * Prototype: VkFormat  format
	 */ 
	 public VkFormat format(){
		 // return  this.format;
		 return format0(super.ptr);
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
	 * native Set method for field sType
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native void sType0(ByteBuffer ptr, VkStructureType _sType);/*
		  VkBufferViewCreateInfo _obj = (VkBufferViewCreateInfo)(*ptr);
		  _obj.sType = (VkStructureType) (_sType);
	  */

	/**
	 * get method for field sType
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native VkStructureType sType0(ByteBuffer ptr);/*
		  VkBufferViewCreateInfo _obj = (VkBufferViewCreateInfo)(ptr);
		  return (VkStructureType) (_obj.VkStructureType);
	 */

	/**
	 * native Set method for field pNext
	 * Prototype: const void*  pNext
	 */ 
	 private static native void pNext0(ByteBuffer ptr, P<VkObject> _pNext);/*
		  VkBufferViewCreateInfo _obj = (VkBufferViewCreateInfo)(*ptr);
		  _obj.pNext = (const void*) (_pNext);
	  */

	/**
	 * get method for field pNext
	 * Prototype: const void*  pNext
	 */ 
	 private static native P<VkObject> pNext0(ByteBuffer ptr);/*
		  VkBufferViewCreateInfo _obj = (VkBufferViewCreateInfo)(ptr);
		  return (P<VkObject>) (_obj.const void*);
	 */

	/**
	 * native Set method for field flags
	 * Prototype: VkBufferViewCreateFlags  flags
	 */ 
	 private static native void flags0(ByteBuffer ptr, int _flags);/*
		  VkBufferViewCreateInfo _obj = (VkBufferViewCreateInfo)(*ptr);
		  _obj.flags = (VkBufferViewCreateFlags) (_flags);
	  */

	/**
	 * get method for field flags
	 * Prototype: VkBufferViewCreateFlags  flags
	 */ 
	 private static native int flags0(ByteBuffer ptr);/*
		  VkBufferViewCreateInfo _obj = (VkBufferViewCreateInfo)(ptr);
		  return (jint) (_obj.VkBufferViewCreateFlags);
	 */

	/**
	 * native Set method for field buffer
	 * Prototype: VkBuffer  buffer
	 */ 
	 private static native void buffer0(ByteBuffer ptr, VkBuffer _buffer);/*
		  VkBufferViewCreateInfo _obj = (VkBufferViewCreateInfo)(*ptr);
		  _obj.buffer = (VkBuffer) (_buffer);
	  */

	/**
	 * get method for field buffer
	 * Prototype: VkBuffer  buffer
	 */ 
	 private static native VkBuffer buffer0(ByteBuffer ptr);/*
		  VkBufferViewCreateInfo _obj = (VkBufferViewCreateInfo)(ptr);
		  return (VkBuffer) (_obj.VkBuffer);
	 */

	/**
	 * native Set method for field format
	 * Prototype: VkFormat  format
	 */ 
	 private static native void format0(ByteBuffer ptr, VkFormat _format);/*
		  VkBufferViewCreateInfo _obj = (VkBufferViewCreateInfo)(*ptr);
		  _obj.format = (VkFormat) (_format);
	  */

	/**
	 * get method for field format
	 * Prototype: VkFormat  format
	 */ 
	 private static native VkFormat format0(ByteBuffer ptr);/*
		  VkBufferViewCreateInfo _obj = (VkBufferViewCreateInfo)(ptr);
		  return (VkFormat) (_obj.VkFormat);
	 */

	/**
	 * native Set method for field offset
	 * Prototype: VkDeviceSize  offset
	 */ 
	 private static native void offset0(ByteBuffer ptr, long _offset);/*
		  VkBufferViewCreateInfo _obj = (VkBufferViewCreateInfo)(*ptr);
		  _obj.offset = (VkDeviceSize) (_offset);
	  */

	/**
	 * get method for field offset
	 * Prototype: VkDeviceSize  offset
	 */ 
	 private static native long offset0(ByteBuffer ptr);/*
		  VkBufferViewCreateInfo _obj = (VkBufferViewCreateInfo)(ptr);
		  return (jlong) (_obj.VkDeviceSize);
	 */

	/**
	 * native Set method for field range
	 * Prototype: VkDeviceSize  range
	 */ 
	 private static native void range0(ByteBuffer ptr, long _range);/*
		  VkBufferViewCreateInfo _obj = (VkBufferViewCreateInfo)(*ptr);
		  _obj.range = (VkDeviceSize) (_range);
	  */

	/**
	 * get method for field range
	 * Prototype: VkDeviceSize  range
	 */ 
	 private static native long range0(ByteBuffer ptr);/*
		  VkBufferViewCreateInfo _obj = (VkBufferViewCreateInfo)(ptr);
		  return (jlong) (_obj.VkDeviceSize);
	 */



} // end of class VkBufferViewCreateInfo
