/**
 * Class wrapping Vulkan's VkBufferMemoryBarrier struct.
 * 
 * Bor_Vulkan Project Ver. 0.8.65 (beta)
 * Licence terms: 
 * The MIT License (MIT)
 * Copyright (c) 2016 Alessandro Borges
 * See https://opensource.org/licenses/MIT 
 */
 package bor.vulkan.structs;

 import bor.util.*;
 import bor.vulkan.*;
 import static bor.vulkan.Vulkan.*; 
 import bor.vulkan.enumerations.*;

 import java.util.*;
 import java.nio.*;


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
 * @version Ver. 0.8.65 (beta) 
 */
 public class VkBufferMemoryBarrier extends VkStruct {

    //@formatter:off
    /*JNI
    #include <BorVulkan.hpp>
    */  

	/** TAG of this structure [100]  */
	 private static final String TAG = "VkBufferMemoryBarrier";

	/** ID of this structure [100]  */
	 public static final int TAG_ID = VKBUFFERMEMORYBARRIER_ID;

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
		 super(TAG_ID);
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkBufferMemoryBarrier(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
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
	 * Get ID of this structure 
	 */
	 public static int getID(){ 
		 return TAG_ID; 
	}

	/** 
	 * Static method to create a VkArray for this VkStruct subclass.
	 * @param size - number of elements
	 */
	 public static VkArray<VkBufferMemoryBarrier> createVkArray(int size){ 
		 VkBufferMemoryBarrier[] array = new VkBufferMemoryBarrier[size]; 
		 VkArrayStruct<VkBufferMemoryBarrier> vkArray = new VkArrayStruct<VkBufferMemoryBarrier>(array, TAG_ID);
		 return vkArray; 
	 } 


	 ////////////////////////
	 //  SETTERS & GETTERS //
	 ////////////////////////

	/**
	 * Set method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 * 
	 * @param sType - a instance of VkStructureType.
	 * @return this VkStruct instance.
	 */ 
	 public VkBufferMemoryBarrier sType(VkStructureType sType){
		 this.sType = sType;
		 int enumVal = sType.getValue();
		 setSType0(this.ptr, enumVal );
		 return this;
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
	 * 
	 * @param pNext - a instance of VkObject.
	 * @return this VkStruct instance.
	 */ 
	 public VkBufferMemoryBarrier pNext(VkObject pNext){
		 this.pNext = pNext;
		 ByteBuffer buff = (pNext==null) ? null : pNext.getPointer();
		 setPNext0(this.ptr, buff);
		 return this;
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
	 * 
	 * @param srcAccessMask - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkBufferMemoryBarrier srcAccessMask(int srcAccessMask){
		 this.srcAccessMask = srcAccessMask;
		 setSrcAccessMask0(this.ptr,  srcAccessMask);
		 return this;
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
	 * 
	 * @param dstAccessMask - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkBufferMemoryBarrier dstAccessMask(int dstAccessMask){
		 this.dstAccessMask = dstAccessMask;
		 setDstAccessMask0(this.ptr,  dstAccessMask);
		 return this;
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
	 * 
	 * @param srcQueueFamilyIndex - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkBufferMemoryBarrier srcQueueFamilyIndex(int srcQueueFamilyIndex){
		 this.srcQueueFamilyIndex = srcQueueFamilyIndex;
		 setSrcQueueFamilyIndex0(this.ptr,  srcQueueFamilyIndex);
		 return this;
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
	 * 
	 * @param dstQueueFamilyIndex - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkBufferMemoryBarrier dstQueueFamilyIndex(int dstQueueFamilyIndex){
		 this.dstQueueFamilyIndex = dstQueueFamilyIndex;
		 setDstQueueFamilyIndex0(this.ptr,  dstQueueFamilyIndex);
		 return this;
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
	 * 
	 * @param buffer - a instance of VkBuffer.
	 * @return this VkStruct instance.
	 */ 
	 public VkBufferMemoryBarrier buffer(VkBuffer buffer){
		 this.buffer = buffer;
		 long handle = (buffer==null) ? 0L : buffer.getNativeHandle();
		 setBuffer0(this.ptr, handle);
		 return this;
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
		    ((VkHandle)this.buffer).setNativeHandle(handle);
		  }
		 return this.buffer;
	 }

	/**
	 * Set method for field offset	[long]<br>
	 * Prototype: VkDeviceSize  offset
	 * 
	 * @param offset - a instance of long.
	 * @return this VkStruct instance.
	 */ 
	 public VkBufferMemoryBarrier offset(long offset){
		 this.offset = offset;
		 setOffset0(this.ptr,  offset);
		 return this;
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
	 * 
	 * @param size - a instance of long.
	 * @return this VkStruct instance.
	 */ 
	 public VkBufferMemoryBarrier size(long size){
		 this.size = size;
		 setSize0(this.ptr,  size);
		 return this;
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


   /* (non-Javadoc)
    * @see java.lang.Object#toString()
    */
    @Override
    public String toString() {
         StringBuilder builder = new StringBuilder();
         builder.append("VkBufferMemoryBarrier [ ")
				.append("sType: ").append(sType() )
				.append(",\n pNext: ")
				.append(pNext() )
				.append(",\n srcAccessMask: ")
				.append(srcAccessMask() )
				.append(",\n dstAccessMask: ")
				.append(dstAccessMask() )
				.append(",\n srcQueueFamilyIndex: ")
				.append(srcQueueFamilyIndex() )
				.append(",\n dstQueueFamilyIndex: ")
				.append(dstQueueFamilyIndex() )
				.append(",\n buffer: ")
				.append(buffer() )
				.append(",\n offset: ")
				.append(offset() )
				.append(",\n size: ")
				.append(size() )
				.append("]");
		 return builder.toString();
    }


	 //////////////////////////////////
	 // Native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * Native SET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native void setSType0(Buffer ptr, int  _sType);/*
		  VkBufferMemoryBarrier* vkObj = (VkBufferMemoryBarrier*)(ptr);
		 // code for simple past value 
		  vkObj->sType = (VkStructureType) (_sType);
	  */

	/**
	 * Native GET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native int getSType0(Buffer ptr);/*
		  VkBufferMemoryBarrier* vkObj = (VkBufferMemoryBarrier*)(ptr);
		  // generic get for Vk enums
		  return (jint) (vkObj->sType);
	 */

	/**
	 * Native SET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native void setPNext0(Buffer ptr, java.nio.ByteBuffer  _pNext);/*
		  VkBufferMemoryBarrier* vkObj = (VkBufferMemoryBarrier*)(ptr);
		 // code for Buffer - ptr to ptr 
		 const void* p_pNext = ( void*) _pNext; 
		 vkObj->pNext = p_pNext; 
	  */

	/**
	 * Native GET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native long getPNext0(Buffer ptr);/*
		  VkBufferMemoryBarrier* vkObj = (VkBufferMemoryBarrier*)(ptr);
		  // generic get for Buffer - field must be pointer! 
		  return (jlong) reinterpret_cast<jlong>(vkObj->pNext);
	 */

	/**
	 * Native SET method for field srcAccessMask	[int]<br>
	 * Prototype: VkAccessFlags  srcAccessMask
	 */ 
	 private static native void setSrcAccessMask0(Buffer ptr, int _srcAccessMask);/*
		  VkBufferMemoryBarrier* vkObj = (VkBufferMemoryBarrier*)(ptr);
		 // code for simple past value 
		  vkObj->srcAccessMask = (VkAccessFlags) (_srcAccessMask);
	  */

	/**
	 * Native GET method for field srcAccessMask	[int]<br>
	 * Prototype: VkAccessFlags  srcAccessMask
	 */ 
	 private static native int getSrcAccessMask0(Buffer ptr);/*
		  VkBufferMemoryBarrier* vkObj = (VkBufferMemoryBarrier*)(ptr);
		  return (jint) (vkObj->srcAccessMask);
	 */

	/**
	 * Native SET method for field dstAccessMask	[int]<br>
	 * Prototype: VkAccessFlags  dstAccessMask
	 */ 
	 private static native void setDstAccessMask0(Buffer ptr, int _dstAccessMask);/*
		  VkBufferMemoryBarrier* vkObj = (VkBufferMemoryBarrier*)(ptr);
		 // code for simple past value 
		  vkObj->dstAccessMask = (VkAccessFlags) (_dstAccessMask);
	  */

	/**
	 * Native GET method for field dstAccessMask	[int]<br>
	 * Prototype: VkAccessFlags  dstAccessMask
	 */ 
	 private static native int getDstAccessMask0(Buffer ptr);/*
		  VkBufferMemoryBarrier* vkObj = (VkBufferMemoryBarrier*)(ptr);
		  return (jint) (vkObj->dstAccessMask);
	 */

	/**
	 * Native SET method for field srcQueueFamilyIndex	[int]<br>
	 * Prototype: uint32_t  srcQueueFamilyIndex
	 */ 
	 private static native void setSrcQueueFamilyIndex0(Buffer ptr, int _srcQueueFamilyIndex);/*
		  VkBufferMemoryBarrier* vkObj = (VkBufferMemoryBarrier*)(ptr);
		 // code for simple past value 
		  vkObj->srcQueueFamilyIndex = (uint32_t) (_srcQueueFamilyIndex);
	  */

	/**
	 * Native GET method for field srcQueueFamilyIndex	[int]<br>
	 * Prototype: uint32_t  srcQueueFamilyIndex
	 */ 
	 private static native int getSrcQueueFamilyIndex0(Buffer ptr);/*
		  VkBufferMemoryBarrier* vkObj = (VkBufferMemoryBarrier*)(ptr);
		  return (jint) (vkObj->srcQueueFamilyIndex);
	 */

	/**
	 * Native SET method for field dstQueueFamilyIndex	[int]<br>
	 * Prototype: uint32_t  dstQueueFamilyIndex
	 */ 
	 private static native void setDstQueueFamilyIndex0(Buffer ptr, int _dstQueueFamilyIndex);/*
		  VkBufferMemoryBarrier* vkObj = (VkBufferMemoryBarrier*)(ptr);
		 // code for simple past value 
		  vkObj->dstQueueFamilyIndex = (uint32_t) (_dstQueueFamilyIndex);
	  */

	/**
	 * Native GET method for field dstQueueFamilyIndex	[int]<br>
	 * Prototype: uint32_t  dstQueueFamilyIndex
	 */ 
	 private static native int getDstQueueFamilyIndex0(Buffer ptr);/*
		  VkBufferMemoryBarrier* vkObj = (VkBufferMemoryBarrier*)(ptr);
		  return (jint) (vkObj->dstQueueFamilyIndex);
	 */

	/**
	 * Native SET method for field buffer	[vkhandle]<br>
	 * Prototype: VkBuffer  buffer
	 */ 
	 private static native void setBuffer0(Buffer ptr, long  _buffer);/*
		  VkBufferMemoryBarrier* vkObj = (VkBufferMemoryBarrier*)(ptr);
		 // code for simple past value 
		  vkObj->buffer = (VkBuffer) (_buffer);
	  */

	/**
	 * Native GET method for field buffer	[vkhandle]<br>
	 * Prototype: VkBuffer  buffer
	 */ 
	 private static native long getBuffer0(Buffer ptr);/*
		  VkBufferMemoryBarrier* vkObj = (VkBufferMemoryBarrier*)(ptr);
		  // generic get for struct field of type  VkHandle or VkStruct 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->buffer);
	 */

	/**
	 * Native SET method for field offset	[long]<br>
	 * Prototype: VkDeviceSize  offset
	 */ 
	 private static native void setOffset0(Buffer ptr, long _offset);/*
		  VkBufferMemoryBarrier* vkObj = (VkBufferMemoryBarrier*)(ptr);
		 // code for simple past value 
		  vkObj->offset = (VkDeviceSize) (_offset);
	  */

	/**
	 * Native GET method for field offset	[long]<br>
	 * Prototype: VkDeviceSize  offset
	 */ 
	 private static native long getOffset0(Buffer ptr);/*
		  VkBufferMemoryBarrier* vkObj = (VkBufferMemoryBarrier*)(ptr);
		  return (jlong) (vkObj->offset);
	 */

	/**
	 * Native SET method for field size	[long]<br>
	 * Prototype: VkDeviceSize  size
	 */ 
	 private static native void setSize0(Buffer ptr, long _size);/*
		  VkBufferMemoryBarrier* vkObj = (VkBufferMemoryBarrier*)(ptr);
		 // code for simple past value 
		  vkObj->size = (VkDeviceSize) (_size);
	  */

	/**
	 * Native GET method for field size	[long]<br>
	 * Prototype: VkDeviceSize  size
	 */ 
	 private static native long getSize0(Buffer ptr);/*
		  VkBufferMemoryBarrier* vkObj = (VkBufferMemoryBarrier*)(ptr);
		  return (jlong) (vkObj->size);
	 */



} // end of class VkBufferMemoryBarrier
