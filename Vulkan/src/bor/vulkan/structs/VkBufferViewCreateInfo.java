/**
 * Class wrapping Vulkan's VkBufferViewCreateInfo struct.
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
 * @version Ver. 0.8.65 (beta) 
 */
 public class VkBufferViewCreateInfo extends VkStruct {

    //@formatter:off
    /*JNI
    #include <BorVulkan.hpp>
    */  

	/** TAG of this structure [38]  */
	 private static final String TAG = "VkBufferViewCreateInfo";

	/** ID of this structure [38]  */
	 public static final int TAG_ID = VKBUFFERVIEWCREATEINFO_ID;

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
		 super(TAG_ID);
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkBufferViewCreateInfo(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address only. Size guessed by #sizeof()
	 * @param address - native address 
	 */
	 public VkBufferViewCreateInfo(long address){ 
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
	 public VkBufferViewCreateInfo sType(VkStructureType sType){
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
	 public VkBufferViewCreateInfo pNext(VkObject pNext){
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
	 * Set method for field flags	[int]<br>
	 * Prototype: VkBufferViewCreateFlags  flags
	 * 
	 * @param flags - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkBufferViewCreateInfo flags(int flags){
		 this.flags = flags;
		 setFlags0(this.ptr,  flags);
		 return this;
	 }

	/**
	 * Get method for field flags	[int]<br>
	 * Prototype: VkBufferViewCreateFlags  flags
	 */ 
	 public int flags(){
		 int var = getFlags0(super.ptr);
		 this.flags = var;
		 return this.flags;
	 }

	/**
	 * Set method for field buffer	[vkhandle]<br>
	 * Prototype: VkBuffer  buffer
	 * 
	 * @param buffer - a instance of VkBuffer.
	 * @return this VkStruct instance.
	 */ 
	 public VkBufferViewCreateInfo buffer(VkBuffer buffer){
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
	 * Set method for field format	[vkenum]<br>
	 * Prototype: VkFormat  format
	 * 
	 * @param format - a instance of VkFormat.
	 * @return this VkStruct instance.
	 */ 
	 public VkBufferViewCreateInfo format(VkFormat format){
		 this.format = format;
		 int enumVal = format.getValue();
		 setFormat0(this.ptr, enumVal );
		 return this;
	 }

	/**
	 * Get method for field format	[vkenum]<br>
	 * Prototype: VkFormat  format
	 */ 
	 public VkFormat format(){
		 int nativeVal = getFormat0(super.ptr);
		 this.format = VkFormat.fromValue(nativeVal); 
		 return this.format;
	 }

	/**
	 * Set method for field offset	[long]<br>
	 * Prototype: VkDeviceSize  offset
	 * 
	 * @param offset - a instance of long.
	 * @return this VkStruct instance.
	 */ 
	 public VkBufferViewCreateInfo offset(long offset){
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
	 * Set method for field range	[long]<br>
	 * Prototype: VkDeviceSize  range
	 * 
	 * @param range - a instance of long.
	 * @return this VkStruct instance.
	 */ 
	 public VkBufferViewCreateInfo range(long range){
		 this.range = range;
		 setRange0(this.ptr,  range);
		 return this;
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


   /* (non-Javadoc)
    * @see java.lang.Object#toString()
    */
    @Override
    public String toString() {
         StringBuilder builder = new StringBuilder();
         builder.append("VkBufferViewCreateInfo [ ")
				.append("sType: ").append(sType() )
				.append(",\n pNext: ")
				.append(pNext() )
				.append(",\n flags: ")
				.append(flags() )
				.append(",\n buffer: ")
				.append(buffer() )
				.append(",\n format: ")
				.append(format() )
				.append(",\n offset: ")
				.append(offset() )
				.append(",\n range: ")
				.append(range() )
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
		  VkBufferViewCreateInfo* vkObj = (VkBufferViewCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->sType = (VkStructureType) (_sType);
	  */

	/**
	 * Native GET method for field sType	[vkenum]<br>
	 * Prototype: VkStructureType  sType
	 */ 
	 private static native int getSType0(Buffer ptr);/*
		  VkBufferViewCreateInfo* vkObj = (VkBufferViewCreateInfo*)(ptr);
		  // generic get for Vk enums
		  return (jint) (vkObj->sType);
	 */

	/**
	 * Native SET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native void setPNext0(Buffer ptr, java.nio.ByteBuffer  _pNext);/*
		  VkBufferViewCreateInfo* vkObj = (VkBufferViewCreateInfo*)(ptr);
		 // code for Buffer - ptr to ptr 
		 const void* p_pNext = ( void*) _pNext; 
		 vkObj->pNext = p_pNext; 
	  */

	/**
	 * Native GET method for field pNext	[vkobject]<br>
	 * Prototype: const void*  pNext
	 */ 
	 private static native long getPNext0(Buffer ptr);/*
		  VkBufferViewCreateInfo* vkObj = (VkBufferViewCreateInfo*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->pNext);
	 */

	/**
	 * Native SET method for field flags	[int]<br>
	 * Prototype: VkBufferViewCreateFlags  flags
	 */ 
	 private static native void setFlags0(Buffer ptr, int _flags);/*
		  VkBufferViewCreateInfo* vkObj = (VkBufferViewCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->flags = (VkBufferViewCreateFlags) (_flags);
	  */

	/**
	 * Native GET method for field flags	[int]<br>
	 * Prototype: VkBufferViewCreateFlags  flags
	 */ 
	 private static native int getFlags0(Buffer ptr);/*
		  VkBufferViewCreateInfo* vkObj = (VkBufferViewCreateInfo*)(ptr);
		  return (jint) (vkObj->flags);
	 */

	/**
	 * Native SET method for field buffer	[vkhandle]<br>
	 * Prototype: VkBuffer  buffer
	 */ 
	 private static native void setBuffer0(Buffer ptr, long  _buffer);/*
		  VkBufferViewCreateInfo* vkObj = (VkBufferViewCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->buffer = (VkBuffer) (_buffer);
	  */

	/**
	 * Native GET method for field buffer	[vkhandle]<br>
	 * Prototype: VkBuffer  buffer
	 */ 
	 private static native long getBuffer0(Buffer ptr);/*
		  VkBufferViewCreateInfo* vkObj = (VkBufferViewCreateInfo*)(ptr);
		  // generic get for struct field of type  VkHandle or VkStruct 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->buffer);
	 */

	/**
	 * Native SET method for field format	[vkenum]<br>
	 * Prototype: VkFormat  format
	 */ 
	 private static native void setFormat0(Buffer ptr, int  _format);/*
		  VkBufferViewCreateInfo* vkObj = (VkBufferViewCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->format = (VkFormat) (_format);
	  */

	/**
	 * Native GET method for field format	[vkenum]<br>
	 * Prototype: VkFormat  format
	 */ 
	 private static native int getFormat0(Buffer ptr);/*
		  VkBufferViewCreateInfo* vkObj = (VkBufferViewCreateInfo*)(ptr);
		  // generic get for Vk enums
		  return (jint) (vkObj->format);
	 */

	/**
	 * Native SET method for field offset	[long]<br>
	 * Prototype: VkDeviceSize  offset
	 */ 
	 private static native void setOffset0(Buffer ptr, long _offset);/*
		  VkBufferViewCreateInfo* vkObj = (VkBufferViewCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->offset = (VkDeviceSize) (_offset);
	  */

	/**
	 * Native GET method for field offset	[long]<br>
	 * Prototype: VkDeviceSize  offset
	 */ 
	 private static native long getOffset0(Buffer ptr);/*
		  VkBufferViewCreateInfo* vkObj = (VkBufferViewCreateInfo*)(ptr);
		  return (jlong) (vkObj->offset);
	 */

	/**
	 * Native SET method for field range	[long]<br>
	 * Prototype: VkDeviceSize  range
	 */ 
	 private static native void setRange0(Buffer ptr, long _range);/*
		  VkBufferViewCreateInfo* vkObj = (VkBufferViewCreateInfo*)(ptr);
		 // code for simple past value 
		  vkObj->range = (VkDeviceSize) (_range);
	  */

	/**
	 * Native GET method for field range	[long]<br>
	 * Prototype: VkDeviceSize  range
	 */ 
	 private static native long getRange0(Buffer ptr);/*
		  VkBufferViewCreateInfo* vkObj = (VkBufferViewCreateInfo*)(ptr);
		  return (jlong) (vkObj->range);
	 */



} // end of class VkBufferViewCreateInfo
