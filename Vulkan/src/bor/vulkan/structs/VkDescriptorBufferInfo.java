/**
 * Class wrapping Vulkan's VkDescriptorBufferInfo struct.
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
 * @version Ver. 0.8.65 (beta) 
 */
 public class VkDescriptorBufferInfo extends VkStruct {

    //@formatter:off
    /*JNI
    #include <BorVulkan.hpp>
    */  

	/** TAG of this structure [77]  */
	 private static final String TAG = "VkDescriptorBufferInfo";

	/** ID of this structure [77]  */
	 public static final int TAG_ID = VKDESCRIPTORBUFFERINFO_ID;

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
		 super(TAG_ID);
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkDescriptorBufferInfo(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
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
	 * Get ID of this structure 
	 */
	 public static int getID(){ 
		 return TAG_ID; 
	}

	 ////////////////////////
	 //  SETTERS & GETTERS //
	 ////////////////////////

	/**
	 * Set method for field buffer	[vkhandle]<br>
	 * Prototype: VkBuffer  buffer
	 * 
	 * @param buffer - a instance of VkBuffer.
	 * @return this VkStruct instance.
	 */ 
	 public VkDescriptorBufferInfo buffer(VkBuffer buffer){
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
	 public VkDescriptorBufferInfo offset(long offset){
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
	 public VkDescriptorBufferInfo range(long range){
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
         builder.append("VkDescriptorBufferInfo [ ")
				.append("buffer: ").append(buffer() )
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
	 * Native SET method for field buffer	[vkhandle]<br>
	 * Prototype: VkBuffer  buffer
	 */ 
	 private static native void setBuffer0(Buffer ptr, long  _buffer);/*
		  VkDescriptorBufferInfo* vkObj = (VkDescriptorBufferInfo*)(ptr);
		  vkObj->buffer = (VkBuffer) (_buffer);
	  */

	/**
	 * Native GET method for field buffer	[vkhandle]<br>
	 * Prototype: VkBuffer  buffer
	 */ 
	 private static native long getBuffer0(Buffer ptr);/*
		  VkDescriptorBufferInfo* vkObj = (VkDescriptorBufferInfo*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->buffer);
	 */

	/**
	 * Native SET method for field offset	[long]<br>
	 * Prototype: VkDeviceSize  offset
	 */ 
	 private static native void setOffset0(Buffer ptr, long _offset);/*
		  VkDescriptorBufferInfo* vkObj = (VkDescriptorBufferInfo*)(ptr);
		  vkObj->offset = (VkDeviceSize) (_offset);
	  */

	/**
	 * Native GET method for field offset	[long]<br>
	 * Prototype: VkDeviceSize  offset
	 */ 
	 private static native long getOffset0(Buffer ptr);/*
		  VkDescriptorBufferInfo* vkObj = (VkDescriptorBufferInfo*)(ptr);
		  return (jlong) (vkObj->offset);
	 */

	/**
	 * Native SET method for field range	[long]<br>
	 * Prototype: VkDeviceSize  range
	 */ 
	 private static native void setRange0(Buffer ptr, long _range);/*
		  VkDescriptorBufferInfo* vkObj = (VkDescriptorBufferInfo*)(ptr);
		  vkObj->range = (VkDeviceSize) (_range);
	  */

	/**
	 * Native GET method for field range	[long]<br>
	 * Prototype: VkDeviceSize  range
	 */ 
	 private static native long getRange0(Buffer ptr);/*
		  VkDescriptorBufferInfo* vkObj = (VkDescriptorBufferInfo*)(ptr);
		  return (jlong) (vkObj->range);
	 */



} // end of class VkDescriptorBufferInfo
