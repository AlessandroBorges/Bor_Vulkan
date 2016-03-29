/**
 * Class wrapping Vulkan's VkBufferViewCreateInfo struct.
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
 *  This class is a Java front end for struct VkBufferViewCreateInfo. 
 *  <h3>Prototype:</h3>
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
 * @version Ver. 0.8.01 (beta) 
 */
public class VkBufferViewCreateInfo extends VkStruct {
	/** TAG of this structure [38]  */
	 private static final String TAG = "VkBufferViewCreateInfo";

	/** ID of this structure [38]  */
	 public static final int TAG_ID = VKBUFFERVIEWCREATEINFO_ID;

	/** P wrapper for THIS object */
	 private  P<VkBufferViewCreateInfo> p;

	 ///////////////////
	 // Struct fields //
	 ///////////////////
	/**
	 *  VkStructureType 	sType	[vkenum]
	 */ 
	 VkStructureType 	sType;

	/**
	 *  const void* 	pNext	[vkobject]
	 */ 
	 VkObject 	pNext;

	/**
	 *  VkBufferViewCreateFlags 	flags	[int]
	 */ 
	 int 	flags;

	/**
	 *  VkBuffer 	buffer	[vkhandle]
	 */ 
	 VkBuffer 	buffer;

	/**
	 *  VkFormat 	format	[vkenum]
	 */ 
	 VkFormat 	format;

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
	public VkBufferViewCreateInfo(){ 
		 super(sizeOf()); 
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkBufferViewCreateInfo(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address and memSize
	 * @param address - native address 
	 * @param memSize - buffer size 
	 */
	 public VkBufferViewCreateInfo(long address, int memSize){ 
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
	 public static P<VkBufferViewCreateInfo> createNullPointer(){
	        P<VkBufferViewCreateInfo> p = new  P<VkBufferViewCreateInfo>(new VkBufferViewCreateInfo());
	        return p;
	    }


	/** 
	 * Return this VkObject instance wrapped in pointer P<br>
	 *
	 *  P&lt;? extends VkObject &gt;
	 *
	 * @return  a P container wrapping this object.
	 */
	 public P<VkBufferViewCreateInfo> getP() {
	       if(p == null ){
	           p = new P<VkBufferViewCreateInfo> (this);
	       }
	        return p;
	    }


	 ////////////////////////
	 //  SETTERS & GETTERS //
	 ////////////////////////

	/**
	 * Set method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 public void sType(VkStructureType sType){
		 this.sType = sType;
		 int enumVal = sType.getValue();
		 sType0(this.ptr, enumVal );
	 }

	/**
	 * Get method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 public VkStructureType sType(){
		 int nativeVal = sType0(super.ptr);
		 this.sType = VkStructureType.fromValue(nativeVal); 
		 return this.sType;
	 }

	/**
	 * Set method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 public void pNext(VkObject pNext){
		 this.pNext = pNext;
		 ByteBuffer buff = (pNext==null) ? null : pNext.getPointer();
		 pNext0(this.ptr, buff);
	 }

	/**
	 * Get method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 public VkObject pNext(){
		 ByteBuffer pointer = pNext0(super.ptr);
		 if(pointer == null){
		    this.pNext = null;
		    return null;
		  } else 
 		 if(this.pNext == null){
		    this.pNext = (VkObject)(new VkHandle(pointer));
		 }else{
		    this.pNext.setPointer(pointer);
		  }
		 return this.pNext;
	 }

	/**
	 * Set method for field flags	[int]<br>
	 * Prototype: VkBufferViewCreateFlags  flags
	 */ 
	 public void flags(int flags){
		 this.flags = flags;
		 flags0(this.ptr,  flags);
	 }

	/**
	 * Get method for field flags	[int]<br>
	 * Prototype: VkBufferViewCreateFlags  flags
	 */ 
	 public int flags(){
		 int var = flags0(super.ptr);
		 this.flags = var;
		 return this.flags;
	 }

	/**
	 * Set method for field buffer	[vkhandle]<br>
	 * Prototype: VkBuffer  buffer
	 */ 
	 public void buffer(VkBuffer buffer){
		 this.buffer = buffer;
		 ByteBuffer buff = (buffer==null) ? null : buffer.getHandle();
		 buffer0(this.ptr, buff);
	 }

	/**
	 * Get method for field buffer	[vkhandle]<br>
	 * Prototype: VkBuffer  buffer
	 */ 
	 public VkBuffer buffer(){

		 ByteBuffer handle = buffer0(super.ptr);
		 if(handle == null){
		    this.buffer = null;
		    return null;
		  } else 
 		 if(this.buffer == null){
		    this.buffer = new VkHandle(handle);
		 }else{
		    ((VkHandle)this.buffer).setHandle(handle);
		  }
		 return this.buffer;
	 }

	/**
	 * Set method for field format	[vkenum]<br>
	 * Prototype: VkFormat  format
	 */ 
	 public void format(VkFormat format){
		 this.format = format;
		 int enumVal = format.getValue();
		 format0(this.ptr, enumVal );
	 }

	/**
	 * Get method for field format	[vkenum]<br>
	 * Prototype: VkFormat  format
	 */ 
	 public VkFormat format(){
		 int nativeVal = format0(super.ptr);
		 this.format = VkFormat.fromValue(nativeVal); 
		 return this.format;
	 }

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
	 * Set method for field range	[long]<br>
	 * Prototype: VkDeviceSize  range
	 */ 
	 public void range(long range){
		 this.range = range;
		 range0(this.ptr,  range);
	 }

	/**
	 * Get method for field range	[long]<br>
	 * Prototype: VkDeviceSize  range
	 */ 
	 public long range(){
		 long var = range0(super.ptr);
		 this.range = var;
		 return this.range;
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native void sType0(Buffer ptr, int  _sType);/*
		  VkBufferViewCreateInfo* vkObj = (VkBufferViewCreateInfo*)(ptr);
		  vkObj->sType = (VkStructureType) (_sType);
	  */

	/**
	 * native GET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native int  sType0(Buffer ptr);/*
		  VkBufferViewCreateInfo vkObj = (VkBufferViewCreateInfo*)(ptr);
		  return (VkStructureType) (vkObj->sType);
	 */

	/**
	 * native SET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native void pNext0(Buffer ptr, java.nio.ByteBuffer  _pNext);/*
		  VkBufferViewCreateInfo* vkObj = (VkBufferViewCreateInfo*)(ptr);
		  vkObj->pNext = (const void*) (_pNext);
	  */

	/**
	 * native GET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native java.nio.ByteBuffer  pNext0(Buffer ptr);/*
		  VkBufferViewCreateInfo vkObj = (VkBufferViewCreateInfo*)(ptr);
		  return (VkObject) (vkObj->pNext);
	 */

	/**
	 * native SET method for field flags	[int]<br>
	 * Prototype: VkBufferViewCreateFlags  flags
	 */ 
	 private static native void flags0(Buffer ptr, int _flags);/*
		  VkBufferViewCreateInfo* vkObj = (VkBufferViewCreateInfo*)(ptr);
		  vkObj->flags = (VkBufferViewCreateFlags) (_flags);
	  */

	/**
	 * native GET method for field flags	[int]<br>
	 * Prototype: VkBufferViewCreateFlags  flags
	 */ 
	 private static native int flags0(Buffer ptr);/*
		  VkBufferViewCreateInfo vkObj = (VkBufferViewCreateInfo*)(ptr);
		  return (jint) (vkObj->flags);
	 */

	/**
	 * native SET method for field buffer	[vkhandle]<br>
	 * Prototype: VkBuffer  buffer
	 */ 
	 private static native void buffer0(Buffer ptr, java.nio.ByteBuffer  _buffer);/*
		  VkBufferViewCreateInfo* vkObj = (VkBufferViewCreateInfo*)(ptr);
		  vkObj->buffer = (VkBuffer) (_buffer);
	  */

	/**
	 * native GET method for field buffer	[vkhandle]<br>
	 * Prototype: VkBuffer  buffer
	 */ 
	 private static native java.nio.ByteBuffer  buffer0(Buffer ptr);/*
		  VkBufferViewCreateInfo vkObj = (VkBufferViewCreateInfo*)(ptr);
		  return (jobject) (vkObj->buffer);
	 */

	/**
	 * native SET method for field format	[vkenum]<br>
	 * Prototype: VkFormat  format
	 */ 
	 private static native void format0(Buffer ptr, int  _format);/*
		  VkBufferViewCreateInfo* vkObj = (VkBufferViewCreateInfo*)(ptr);
		  vkObj->format = (VkFormat) (_format);
	  */

	/**
	 * native GET method for field format	[vkenum]<br>
	 * Prototype: VkFormat  format
	 */ 
	 private static native int  format0(Buffer ptr);/*
		  VkBufferViewCreateInfo vkObj = (VkBufferViewCreateInfo*)(ptr);
		  return (VkFormat) (vkObj->format);
	 */

	/**
	 * native SET method for field offset	[long]<br>
	 * Prototype: VkDeviceSize  offset
	 */ 
	 private static native void offset0(Buffer ptr, long _offset);/*
		  VkBufferViewCreateInfo* vkObj = (VkBufferViewCreateInfo*)(ptr);
		  vkObj->offset = (VkDeviceSize) (_offset);
	  */

	/**
	 * native GET method for field offset	[long]<br>
	 * Prototype: VkDeviceSize  offset
	 */ 
	 private static native long offset0(Buffer ptr);/*
		  VkBufferViewCreateInfo vkObj = (VkBufferViewCreateInfo*)(ptr);
		  return (jlong) (vkObj->offset);
	 */

	/**
	 * native SET method for field range	[long]<br>
	 * Prototype: VkDeviceSize  range
	 */ 
	 private static native void range0(Buffer ptr, long _range);/*
		  VkBufferViewCreateInfo* vkObj = (VkBufferViewCreateInfo*)(ptr);
		  vkObj->range = (VkDeviceSize) (_range);
	  */

	/**
	 * native GET method for field range	[long]<br>
	 * Prototype: VkDeviceSize  range
	 */ 
	 private static native long range0(Buffer ptr);/*
		  VkBufferViewCreateInfo vkObj = (VkBufferViewCreateInfo*)(ptr);
		  return (jlong) (vkObj->range);
	 */



} // end of class VkBufferViewCreateInfo
