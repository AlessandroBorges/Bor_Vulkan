/**
 * Class wrapping Vulkan's VkBufferImageCopy struct.
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
 *  This class is a Java front end for struct VkBufferImageCopy. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkBufferImageCopy {
 *     VkDeviceSize                bufferOffset;
 *     uint32_t                    bufferRowLength;
 *     uint32_t                    bufferImageHeight;
 *     VkImageSubresourceLayers    imageSubresource;
 *     VkOffset3D                  imageOffset;
 *     VkExtent3D                  imageExtent;
 * } VkBufferImageCopy;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.01 (beta) 
 */
public class VkBufferImageCopy extends VkStruct {

    //@formatter:off
    /*JNI
    #include <BorVulkan.hpp>
    */  

	/** TAG of this structure [94]  */
	 private static final String TAG = "VkBufferImageCopy";

	/** ID of this structure [94]  */
	 public static final int TAG_ID = VKBUFFERIMAGECOPY_ID;

	/** P wrapper for THIS object */
	 private  P<VkBufferImageCopy> p;

	 ///////////////////
	 // Struct fields //
	 ///////////////////
	/**
	 *  VkDeviceSize 	bufferOffset	[long]
	 */ 
	 long 	bufferOffset;

	/**
	 *  uint32_t 	bufferRowLength	[int]
	 */ 
	 int 	bufferRowLength;

	/**
	 *  uint32_t 	bufferImageHeight	[int]
	 */ 
	 int 	bufferImageHeight;

	/**
	 *  VkImageSubresourceLayers 	imageSubresource	[vkstruct]
	 */ 
	 VkImageSubresourceLayers 	imageSubresource;

	/**
	 *  VkOffset3D 	imageOffset	[vkstruct]
	 */ 
	 VkOffset3D 	imageOffset;

	/**
	 *  VkExtent3D 	imageExtent	[vkstruct]
	 */ 
	 VkExtent3D 	imageExtent;

	/**
	 * Ctor
	 */
	public VkBufferImageCopy(){ 
		 super(TAG_ID);
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkBufferImageCopy(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address and memSize
	 * @param address - native address 
	 * @param memSize - buffer size 
	 */
	 public VkBufferImageCopy(long address , int memSize){ 
		 super(address, memSize); 
	 }

	/**
	 * Ctor with Address only. Size guessed by #sizeof()
	 * @param address - native address 
	 */
	 public VkBufferImageCopy(long address){ 
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
	 public static P<VkBufferImageCopy> createNullPointer(){
	        P<VkBufferImageCopy> p = new  P<VkBufferImageCopy>(new VkBufferImageCopy());
	        return p;
	    }


	/** 
	 * Return this VkObject instance wrapped in pointer P<br>
	 *
	 *  P&lt;? extends VkObject &gt;
	 *
	 * @return  a P container wrapping this object.
	 */
	 public P<VkBufferImageCopy> getP() {
	       if(p == null ){
	           p = new P<VkBufferImageCopy> (this);
	       }
	        return p;
	    }


	 ////////////////////////
	 //  SETTERS & GETTERS //
	 ////////////////////////

	/**
	 * Set method for field bufferOffset	[long]<br>
	 * Prototype: VkDeviceSize  bufferOffset
	 */ 
	 public void bufferOffset(long bufferOffset){
		 this.bufferOffset = bufferOffset;
		 setBufferOffset0(this.ptr,  bufferOffset);
	 }

	/**
	 * Get method for field bufferOffset	[long]<br>
	 * Prototype: VkDeviceSize  bufferOffset
	 */ 
	 public long bufferOffset(){
		 long var = getBufferOffset0(super.ptr);
		 this.bufferOffset = var;
		 return this.bufferOffset;
	 }

	/**
	 * Set method for field bufferRowLength	[int]<br>
	 * Prototype: uint32_t  bufferRowLength
	 */ 
	 public void bufferRowLength(int bufferRowLength){
		 this.bufferRowLength = bufferRowLength;
		 setBufferRowLength0(this.ptr,  bufferRowLength);
	 }

	/**
	 * Get method for field bufferRowLength	[int]<br>
	 * Prototype: uint32_t  bufferRowLength
	 */ 
	 public int bufferRowLength(){
		 int var = getBufferRowLength0(super.ptr);
		 this.bufferRowLength = var;
		 return this.bufferRowLength;
	 }

	/**
	 * Set method for field bufferImageHeight	[int]<br>
	 * Prototype: uint32_t  bufferImageHeight
	 */ 
	 public void bufferImageHeight(int bufferImageHeight){
		 this.bufferImageHeight = bufferImageHeight;
		 setBufferImageHeight0(this.ptr,  bufferImageHeight);
	 }

	/**
	 * Get method for field bufferImageHeight	[int]<br>
	 * Prototype: uint32_t  bufferImageHeight
	 */ 
	 public int bufferImageHeight(){
		 int var = getBufferImageHeight0(super.ptr);
		 this.bufferImageHeight = var;
		 return this.bufferImageHeight;
	 }

	/**
	 * Set method for field imageSubresource	[vkstruct]<br>
	 * Prototype: VkImageSubresourceLayers  imageSubresource
	 */ 
	 public void imageSubresource(VkImageSubresourceLayers imageSubresource){
		 this.imageSubresource = imageSubresource;
		 ByteBuffer buff = (imageSubresource==null) ? null : imageSubresource.getPointer();
		 setImageSubresource0(this.ptr, buff);
	 }

	/**
	 * Get method for field imageSubresource	[vkstruct]<br>
	 * Prototype: VkImageSubresourceLayers  imageSubresource
	 */ 
	 public VkImageSubresourceLayers imageSubresource(){
		 long pointer = getImageSubresource0(super.ptr);
		 if(pointer == 0){
		    this.imageSubresource = null;
		    return null;
		  } 

		 if(this.imageSubresource == null){
		    this.imageSubresource = new VkImageSubresourceLayers(pointer);
		 }else{
		    this.imageSubresource.setPointer(pointer);
		  }
		 return this.imageSubresource;
	 }

	/**
	 * Set method for field imageOffset	[vkstruct]<br>
	 * Prototype: VkOffset3D  imageOffset
	 */ 
	 public void imageOffset(VkOffset3D imageOffset){
		 this.imageOffset = imageOffset;
		 ByteBuffer buff = (imageOffset==null) ? null : imageOffset.getPointer();
		 setImageOffset0(this.ptr, buff);
	 }

	/**
	 * Get method for field imageOffset	[vkstruct]<br>
	 * Prototype: VkOffset3D  imageOffset
	 */ 
	 public VkOffset3D imageOffset(){
		 long pointer = getImageOffset0(super.ptr);
		 if(pointer == 0){
		    this.imageOffset = null;
		    return null;
		  } 

		 if(this.imageOffset == null){
		    this.imageOffset = new VkOffset3D(pointer);
		 }else{
		    this.imageOffset.setPointer(pointer);
		  }
		 return this.imageOffset;
	 }

	/**
	 * Set method for field imageExtent	[vkstruct]<br>
	 * Prototype: VkExtent3D  imageExtent
	 */ 
	 public void imageExtent(VkExtent3D imageExtent){
		 this.imageExtent = imageExtent;
		 ByteBuffer buff = (imageExtent==null) ? null : imageExtent.getPointer();
		 setImageExtent0(this.ptr, buff);
	 }

	/**
	 * Get method for field imageExtent	[vkstruct]<br>
	 * Prototype: VkExtent3D  imageExtent
	 */ 
	 public VkExtent3D imageExtent(){
		 long pointer = getImageExtent0(super.ptr);
		 if(pointer == 0){
		    this.imageExtent = null;
		    return null;
		  } 

		 if(this.imageExtent == null){
		    this.imageExtent = new VkExtent3D(pointer);
		 }else{
		    this.imageExtent.setPointer(pointer);
		  }
		 return this.imageExtent;
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field bufferOffset	[long]<br>
	 * Prototype: VkDeviceSize  bufferOffset
	 */ 
	 private static native void setBufferOffset0(Buffer ptr, long _bufferOffset);/*
		  VkBufferImageCopy* vkObj = (VkBufferImageCopy*)(ptr);
		  vkObj->bufferOffset = (VkDeviceSize) (_bufferOffset);
	  */

	/**
	 * native GET method for field bufferOffset	[long]<br>
	 * Prototype: VkDeviceSize  bufferOffset
	 */ 
	 private static native long getBufferOffset0(Buffer ptr);/*
		  VkBufferImageCopy* vkObj = (VkBufferImageCopy*)(ptr);
		  return (jlong) (vkObj->bufferOffset);
	 */

	/**
	 * native SET method for field bufferRowLength	[int]<br>
	 * Prototype: uint32_t  bufferRowLength
	 */ 
	 private static native void setBufferRowLength0(Buffer ptr, int _bufferRowLength);/*
		  VkBufferImageCopy* vkObj = (VkBufferImageCopy*)(ptr);
		  vkObj->bufferRowLength = (uint32_t) (_bufferRowLength);
	  */

	/**
	 * native GET method for field bufferRowLength	[int]<br>
	 * Prototype: uint32_t  bufferRowLength
	 */ 
	 private static native int getBufferRowLength0(Buffer ptr);/*
		  VkBufferImageCopy* vkObj = (VkBufferImageCopy*)(ptr);
		  return (jint) (vkObj->bufferRowLength);
	 */

	/**
	 * native SET method for field bufferImageHeight	[int]<br>
	 * Prototype: uint32_t  bufferImageHeight
	 */ 
	 private static native void setBufferImageHeight0(Buffer ptr, int _bufferImageHeight);/*
		  VkBufferImageCopy* vkObj = (VkBufferImageCopy*)(ptr);
		  vkObj->bufferImageHeight = (uint32_t) (_bufferImageHeight);
	  */

	/**
	 * native GET method for field bufferImageHeight	[int]<br>
	 * Prototype: uint32_t  bufferImageHeight
	 */ 
	 private static native int getBufferImageHeight0(Buffer ptr);/*
		  VkBufferImageCopy* vkObj = (VkBufferImageCopy*)(ptr);
		  return (jint) (vkObj->bufferImageHeight);
	 */

	/**
	 * native SET method for field imageSubresource	[vkstruct]<br>
	 * Prototype: VkImageSubresourceLayers  imageSubresource
	 */ 
	 private static native void setImageSubresource0(Buffer ptr, java.nio.ByteBuffer  _imageSubresource);/*
		  VkBufferImageCopy* vkObj = (VkBufferImageCopy*)(ptr);
		  vkObj->imageSubresource = (VkImageSubresourceLayers) (_imageSubresource);
	  */

	/**
	 * native GET method for field imageSubresource	[vkstruct]<br>
	 * Prototype: VkImageSubresourceLayers  imageSubresource
	 */ 
	 private static native long getImageSubresource0(Buffer ptr);/*
		  VkBufferImageCopy* vkObj = (VkBufferImageCopy*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->imageSubresource);	 */

	/**
	 * native SET method for field imageOffset	[vkstruct]<br>
	 * Prototype: VkOffset3D  imageOffset
	 */ 
	 private static native void setImageOffset0(Buffer ptr, java.nio.ByteBuffer  _imageOffset);/*
		  VkBufferImageCopy* vkObj = (VkBufferImageCopy*)(ptr);
		  vkObj->imageOffset = (VkOffset3D) (_imageOffset);
	  */

	/**
	 * native GET method for field imageOffset	[vkstruct]<br>
	 * Prototype: VkOffset3D  imageOffset
	 */ 
	 private static native long getImageOffset0(Buffer ptr);/*
		  VkBufferImageCopy* vkObj = (VkBufferImageCopy*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->imageOffset);	 */

	/**
	 * native SET method for field imageExtent	[vkstruct]<br>
	 * Prototype: VkExtent3D  imageExtent
	 */ 
	 private static native void setImageExtent0(Buffer ptr, java.nio.ByteBuffer  _imageExtent);/*
		  VkBufferImageCopy* vkObj = (VkBufferImageCopy*)(ptr);
		  vkObj->imageExtent = (VkExtent3D) (_imageExtent);
	  */

	/**
	 * native GET method for field imageExtent	[vkstruct]<br>
	 * Prototype: VkExtent3D  imageExtent
	 */ 
	 private static native long getImageExtent0(Buffer ptr);/*
		  VkBufferImageCopy* vkObj = (VkBufferImageCopy*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->imageExtent);	 */



} // end of class VkBufferImageCopy
