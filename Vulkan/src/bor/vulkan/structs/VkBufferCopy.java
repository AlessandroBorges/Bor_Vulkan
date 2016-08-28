/**
 * Class wrapping Vulkan's VkBufferCopy struct.
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
 * @version Ver. 0.8.65 (beta) 
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
	 * Get ID of this structure 
	 */
	 public static int getID(){ 
		 return TAG_ID; 
	}

	/** 
	 * Static method to create a VkArray for this VkStruct subclass.
	 * @param size - number of elements
	 */
	 public static VkArray<VkBufferCopy> createVkArray(int size){ 
		 VkBufferCopy[] array = new VkBufferCopy[size]; 
		 VkArrayStruct<VkBufferCopy> vkArray = new VkArrayStruct<VkBufferCopy> (array, TAG_ID);
		 return vkArray; 
	 } 


	 ////////////////////////
	 //  SETTERS & GETTERS //
	 ////////////////////////

	/**
	 * Set method for field srcOffset	[long]<br>
	 * Prototype: VkDeviceSize  srcOffset
	 * 
	 * @param srcOffset - a instance of long.
	 * @return this VkStruct instance.
	 */ 
	 public VkBufferCopy srcOffset(long srcOffset){
		 this.srcOffset = srcOffset;
		 setSrcOffset0(this.ptr,  srcOffset);
		 return this;
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
	 * 
	 * @param dstOffset - a instance of long.
	 * @return this VkStruct instance.
	 */ 
	 public VkBufferCopy dstOffset(long dstOffset){
		 this.dstOffset = dstOffset;
		 setDstOffset0(this.ptr,  dstOffset);
		 return this;
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
	 * 
	 * @param size - a instance of long.
	 * @return this VkStruct instance.
	 */ 
	 public VkBufferCopy size(long size){
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
         builder.append("VkBufferCopy [ ")
				.append("srcOffset: ").append(srcOffset() )
				.append(",\n dstOffset: ")
				.append(dstOffset() )
				.append(",\n size: ")
				.append(size() )
				.append("]");
		 return builder.toString();
    }


	 //////////////////////////////////
	 // Native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * Native SET method for field srcOffset	[long]<br>
	 * Prototype: VkDeviceSize  srcOffset
	 */ 
	 private static native void setSrcOffset0(Buffer ptr, long _srcOffset);/*
		  VkBufferCopy* vkObj = (VkBufferCopy*)(ptr);
		 // code for simple past value 
		  vkObj->srcOffset = (VkDeviceSize) (_srcOffset);
	  */

	/**
	 * Native GET method for field srcOffset	[long]<br>
	 * Prototype: VkDeviceSize  srcOffset
	 */ 
	 private static native long getSrcOffset0(Buffer ptr);/*
		  VkBufferCopy* vkObj = (VkBufferCopy*)(ptr);
		  return (jlong) (vkObj->srcOffset);
	 */

	/**
	 * Native SET method for field dstOffset	[long]<br>
	 * Prototype: VkDeviceSize  dstOffset
	 */ 
	 private static native void setDstOffset0(Buffer ptr, long _dstOffset);/*
		  VkBufferCopy* vkObj = (VkBufferCopy*)(ptr);
		 // code for simple past value 
		  vkObj->dstOffset = (VkDeviceSize) (_dstOffset);
	  */

	/**
	 * Native GET method for field dstOffset	[long]<br>
	 * Prototype: VkDeviceSize  dstOffset
	 */ 
	 private static native long getDstOffset0(Buffer ptr);/*
		  VkBufferCopy* vkObj = (VkBufferCopy*)(ptr);
		  return (jlong) (vkObj->dstOffset);
	 */

	/**
	 * Native SET method for field size	[long]<br>
	 * Prototype: VkDeviceSize  size
	 */ 
	 private static native void setSize0(Buffer ptr, long _size);/*
		  VkBufferCopy* vkObj = (VkBufferCopy*)(ptr);
		 // code for simple past value 
		  vkObj->size = (VkDeviceSize) (_size);
	  */

	/**
	 * Native GET method for field size	[long]<br>
	 * Prototype: VkDeviceSize  size
	 */ 
	 private static native long getSize0(Buffer ptr);/*
		  VkBufferCopy* vkObj = (VkBufferCopy*)(ptr);
		  return (jlong) (vkObj->size);
	 */



} // end of class VkBufferCopy
