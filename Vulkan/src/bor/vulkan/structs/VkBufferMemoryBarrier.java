/**
 * Class wrapping Vulkan's VkBufferMemoryBarrier struct.
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
 *  This class is a Java front end for struct VkBufferMemoryBarrier. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkBufferMemoryBarrier {
 *     VkStructureType    sType;
 *     const void*        pNext;
 *     VkAccessFlags      srcAccessMask;
 *     VkAccessFlags      dstAccessMask;
 *     uint32_t           srcQueueFamilyIndex;
 *     uint32_t           dstQueueFamilyIndex;
 *     VkBuffer           buffer;
 *     VkDeviceSize       offset;
 *     VkDeviceSize       size;
 * } VkBufferMemoryBarrier;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.01 (beta) 
 */
public class VkBufferMemoryBarrier extends VkStruct {
	/** TAG of this structure [100]  */
	 private static final String TAG = "VkBufferMemoryBarrier";

	/** ID of this structure [100]  */
	 public static final int TAG_ID = VKBUFFERMEMORYBARRIER_ID;

	/** P wrapper for THIS object */
	 private  P<VkBufferMemoryBarrier> p;

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
	 *  VkAccessFlags 	srcAccessMask	[int]
	 */ 
	 int 	srcAccessMask;

	/**
	 *  VkAccessFlags 	dstAccessMask	[int]
	 */ 
	 int 	dstAccessMask;

	/**
	 *  uint32_t 	srcQueueFamilyIndex	[int]
	 */ 
	 int 	srcQueueFamilyIndex;

	/**
	 *  uint32_t 	dstQueueFamilyIndex	[int]
	 */ 
	 int 	dstQueueFamilyIndex;

	/**
	 *  VkBuffer 	buffer	[vkhandle]
	 */ 
	 VkBuffer 	buffer;

	/**
	 *  VkDeviceSize 	offset	[long]
	 */ 
	 long 	offset;

	/**
	 *  VkDeviceSize 	size	[long]
	 */ 
	 long 	size;

	/**
	 * Ctor
	 */
	public VkBufferMemoryBarrier(){ 
		 super(sizeOf()); 
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkBufferMemoryBarrier(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address and memSize
	 * @param address - native address 
	 * @param memSize - buffer size 
	 */
	 public VkBufferMemoryBarrier(long address , int memSize){ 
		 super(address, memSize); 
	 }

	/**
	 * Ctor with Address only. Size guessed by #sizeof()
	 * @param address - native address 
	 */
	 public VkBufferMemoryBarrier(long address){ 
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
	 public static P<VkBufferMemoryBarrier> createNullPointer(){
	        P<VkBufferMemoryBarrier> p = new  P<VkBufferMemoryBarrier>(new VkBufferMemoryBarrier());
	        return p;
	    }


	/** 
	 * Return this VkObject instance wrapped in pointer P<br>
	 *
	 *  P&lt;? extends VkObject &gt;
	 *
	 * @return  a P container wrapping this object.
	 */
	 public P<VkBufferMemoryBarrier> getP() {
	       if(p == null ){
	           p = new P<VkBufferMemoryBarrier> (this);
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
		 setSType0(this.ptr, enumVal );
	 }

	/**
	 * Get method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 public VkStructureType sType(){
		 int nativeVal = getSType0(super.ptr);
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
		 setPNext0(this.ptr, buff);
	 }

	/**
	 * Get method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 public VkObject pNext(){
		 long pointer = getPNext0(super.ptr);
		 if(pointer == 0){
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
	 * Set method for field srcAccessMask	[int]<br>
	 * Prototype: VkAccessFlags  srcAccessMask
	 */ 
	 public void srcAccessMask(int srcAccessMask){
		 this.srcAccessMask = srcAccessMask;
		 setSrcAccessMask0(this.ptr,  srcAccessMask);
	 }

	/**
	 * Get method for field srcAccessMask	[int]<br>
	 * Prototype: VkAccessFlags  srcAccessMask
	 */ 
	 public int srcAccessMask(){
		 int var = getSrcAccessMask0(super.ptr);
		 this.srcAccessMask = var;
		 return this.srcAccessMask;
	 }

	/**
	 * Set method for field dstAccessMask	[int]<br>
	 * Prototype: VkAccessFlags  dstAccessMask
	 */ 
	 public void dstAccessMask(int dstAccessMask){
		 this.dstAccessMask = dstAccessMask;
		 setDstAccessMask0(this.ptr,  dstAccessMask);
	 }

	/**
	 * Get method for field dstAccessMask	[int]<br>
	 * Prototype: VkAccessFlags  dstAccessMask
	 */ 
	 public int dstAccessMask(){
		 int var = getDstAccessMask0(super.ptr);
		 this.dstAccessMask = var;
		 return this.dstAccessMask;
	 }

	/**
	 * Set method for field srcQueueFamilyIndex	[int]<br>
	 * Prototype: uint32_t  srcQueueFamilyIndex
	 */ 
	 public void srcQueueFamilyIndex(int srcQueueFamilyIndex){
		 this.srcQueueFamilyIndex = srcQueueFamilyIndex;
		 setSrcQueueFamilyIndex0(this.ptr,  srcQueueFamilyIndex);
	 }

	/**
	 * Get method for field srcQueueFamilyIndex	[int]<br>
	 * Prototype: uint32_t  srcQueueFamilyIndex
	 */ 
	 public int srcQueueFamilyIndex(){
		 int var = getSrcQueueFamilyIndex0(super.ptr);
		 this.srcQueueFamilyIndex = var;
		 return this.srcQueueFamilyIndex;
	 }

	/**
	 * Set method for field dstQueueFamilyIndex	[int]<br>
	 * Prototype: uint32_t  dstQueueFamilyIndex
	 */ 
	 public void dstQueueFamilyIndex(int dstQueueFamilyIndex){
		 this.dstQueueFamilyIndex = dstQueueFamilyIndex;
		 setDstQueueFamilyIndex0(this.ptr,  dstQueueFamilyIndex);
	 }

	/**
	 * Get method for field dstQueueFamilyIndex	[int]<br>
	 * Prototype: uint32_t  dstQueueFamilyIndex
	 */ 
	 public int dstQueueFamilyIndex(){
		 int var = getDstQueueFamilyIndex0(super.ptr);
		 this.dstQueueFamilyIndex = var;
		 return this.dstQueueFamilyIndex;
	 }

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
	 * native SET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native void setSType0(Buffer ptr, int  _sType);/*
		  VkBufferMemoryBarrier* vkObj = (VkBufferMemoryBarrier*)(ptr);
		  vkObj->sType = (VkStructureType) (_sType);
	  */

	/**
	 * native GET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native int  getSType0(Buffer ptr);/*
		  VkBufferMemoryBarrier vkObj = (VkBufferMemoryBarrier*)(ptr);
		  return (VkStructureType) (vkObj->sType);
	 */

	/**
	 * native SET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native void setPNext0(Buffer ptr, java.nio.ByteBuffer  _pNext);/*
		  VkBufferMemoryBarrier* vkObj = (VkBufferMemoryBarrier*)(ptr);
		  vkObj->pNext = (const void*) (_pNext);
	  */

	/**
	 * native GET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native long getPNext0(Buffer ptr);/*
		  VkBufferMemoryBarrier vkObj = (VkBufferMemoryBarrier*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->pNext);	 */

	/**
	 * native SET method for field srcAccessMask	[int]<br>
	 * Prototype: VkAccessFlags  srcAccessMask
	 */ 
	 private static native void setSrcAccessMask0(Buffer ptr, int _srcAccessMask);/*
		  VkBufferMemoryBarrier* vkObj = (VkBufferMemoryBarrier*)(ptr);
		  vkObj->srcAccessMask = (VkAccessFlags) (_srcAccessMask);
	  */

	/**
	 * native GET method for field srcAccessMask	[int]<br>
	 * Prototype: VkAccessFlags  srcAccessMask
	 */ 
	 private static native int getSrcAccessMask0(Buffer ptr);/*
		  VkBufferMemoryBarrier vkObj = (VkBufferMemoryBarrier*)(ptr);
		  return (jint) (vkObj->srcAccessMask);
	 */

	/**
	 * native SET method for field dstAccessMask	[int]<br>
	 * Prototype: VkAccessFlags  dstAccessMask
	 */ 
	 private static native void setDstAccessMask0(Buffer ptr, int _dstAccessMask);/*
		  VkBufferMemoryBarrier* vkObj = (VkBufferMemoryBarrier*)(ptr);
		  vkObj->dstAccessMask = (VkAccessFlags) (_dstAccessMask);
	  */

	/**
	 * native GET method for field dstAccessMask	[int]<br>
	 * Prototype: VkAccessFlags  dstAccessMask
	 */ 
	 private static native int getDstAccessMask0(Buffer ptr);/*
		  VkBufferMemoryBarrier vkObj = (VkBufferMemoryBarrier*)(ptr);
		  return (jint) (vkObj->dstAccessMask);
	 */

	/**
	 * native SET method for field srcQueueFamilyIndex	[int]<br>
	 * Prototype: uint32_t  srcQueueFamilyIndex
	 */ 
	 private static native void setSrcQueueFamilyIndex0(Buffer ptr, int _srcQueueFamilyIndex);/*
		  VkBufferMemoryBarrier* vkObj = (VkBufferMemoryBarrier*)(ptr);
		  vkObj->srcQueueFamilyIndex = (uint32_t) (_srcQueueFamilyIndex);
	  */

	/**
	 * native GET method for field srcQueueFamilyIndex	[int]<br>
	 * Prototype: uint32_t  srcQueueFamilyIndex
	 */ 
	 private static native int getSrcQueueFamilyIndex0(Buffer ptr);/*
		  VkBufferMemoryBarrier vkObj = (VkBufferMemoryBarrier*)(ptr);
		  return (jint) (vkObj->srcQueueFamilyIndex);
	 */

	/**
	 * native SET method for field dstQueueFamilyIndex	[int]<br>
	 * Prototype: uint32_t  dstQueueFamilyIndex
	 */ 
	 private static native void setDstQueueFamilyIndex0(Buffer ptr, int _dstQueueFamilyIndex);/*
		  VkBufferMemoryBarrier* vkObj = (VkBufferMemoryBarrier*)(ptr);
		  vkObj->dstQueueFamilyIndex = (uint32_t) (_dstQueueFamilyIndex);
	  */

	/**
	 * native GET method for field dstQueueFamilyIndex	[int]<br>
	 * Prototype: uint32_t  dstQueueFamilyIndex
	 */ 
	 private static native int getDstQueueFamilyIndex0(Buffer ptr);/*
		  VkBufferMemoryBarrier vkObj = (VkBufferMemoryBarrier*)(ptr);
		  return (jint) (vkObj->dstQueueFamilyIndex);
	 */

	/**
	 * native SET method for field buffer	[vkhandle]<br>
	 * Prototype: VkBuffer  buffer
	 */ 
	 private static native void setBuffer0(Buffer ptr, java.nio.ByteBuffer  _buffer);/*
		  VkBufferMemoryBarrier* vkObj = (VkBufferMemoryBarrier*)(ptr);
		  vkObj->buffer = (VkBuffer) (_buffer);
	  */

	/**
	 * native GET method for field buffer	[vkhandle]<br>
	 * Prototype: VkBuffer  buffer
	 */ 
	 private static native long getBuffer0(Buffer ptr);/*
		  VkBufferMemoryBarrier vkObj = (VkBufferMemoryBarrier*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->buffer);	 */

	/**
	 * native SET method for field offset	[long]<br>
	 * Prototype: VkDeviceSize  offset
	 */ 
	 private static native void setOffset0(Buffer ptr, long _offset);/*
		  VkBufferMemoryBarrier* vkObj = (VkBufferMemoryBarrier*)(ptr);
		  vkObj->offset = (VkDeviceSize) (_offset);
	  */

	/**
	 * native GET method for field offset	[long]<br>
	 * Prototype: VkDeviceSize  offset
	 */ 
	 private static native long getOffset0(Buffer ptr);/*
		  VkBufferMemoryBarrier vkObj = (VkBufferMemoryBarrier*)(ptr);
		  return (jlong) (vkObj->offset);
	 */

	/**
	 * native SET method for field size	[long]<br>
	 * Prototype: VkDeviceSize  size
	 */ 
	 private static native void setSize0(Buffer ptr, long _size);/*
		  VkBufferMemoryBarrier* vkObj = (VkBufferMemoryBarrier*)(ptr);
		  vkObj->size = (VkDeviceSize) (_size);
	  */

	/**
	 * native GET method for field size	[long]<br>
	 * Prototype: VkDeviceSize  size
	 */ 
	 private static native long getSize0(Buffer ptr);/*
		  VkBufferMemoryBarrier vkObj = (VkBufferMemoryBarrier*)(ptr);
		  return (jlong) (vkObj->size);
	 */



} // end of class VkBufferMemoryBarrier
