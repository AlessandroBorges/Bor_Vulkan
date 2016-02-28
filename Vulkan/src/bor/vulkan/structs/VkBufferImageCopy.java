/**
 * Class wrapping Vulkan's VkBufferImageCopy struct.
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
 *  This class is a Java front end for struct VkBufferImageCopy 
 *  <h3>ProtoType:</h3>
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
 * @version 0.8.01
 */
public class VkBufferImageCopy extends VkStruct {
	/** TAG of this structure [218]  */
	 private static final String TAG = "VkBufferImageCopy";

	/** ID of this structure [218]  */
	 public static final int TAG_ID = VKBUFFERIMAGECOPY_ID;

	 // fields //
	/**
	 *  VkDeviceSize 	bufferOffset 
	 */ 
	long 	bufferOffset;

	/**
	 *  uint32_t 	bufferRowLength 
	 */ 
	int 	bufferRowLength;

	/**
	 *  uint32_t 	bufferImageHeight 
	 */ 
	int 	bufferImageHeight;

	/**
	 *  VkImageSubresourceLayers 	imageSubresource 
	 */ 
	VkImageSubresourceLayers 	imageSubresource;

	/**
	 *  VkOffset3D 	imageOffset 
	 */ 
	VkOffset3D 	imageOffset;

	/**
	 *  VkExtent3D 	imageExtent 
	 */ 
	VkExtent3D 	imageExtent;

	/**
	 * Ctor
	 */
	public VkBufferImageCopy(){ 
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
	 * Set method for field bufferOffset
	 * Prototype: VkDeviceSize  bufferOffset
	 */ 
	 public void bufferOffset(long bufferOffset){
		 this.bufferOffset = bufferOffset;
		bufferOffset0(super.ptr, bufferOffset);
	 }

	/**
	 * get method for field bufferOffset
	 * Prototype: VkDeviceSize  bufferOffset
	 */ 
	 public long bufferOffset(){
		 // return  this.bufferOffset;
		 return bufferOffset0(super.ptr);
	 }

	/**
	 * Set method for field bufferRowLength
	 * Prototype: uint32_t  bufferRowLength
	 */ 
	 public void bufferRowLength(int bufferRowLength){
		 this.bufferRowLength = bufferRowLength;
		bufferRowLength0(super.ptr, bufferRowLength);
	 }

	/**
	 * get method for field bufferRowLength
	 * Prototype: uint32_t  bufferRowLength
	 */ 
	 public int bufferRowLength(){
		 // return  this.bufferRowLength;
		 return bufferRowLength0(super.ptr);
	 }

	/**
	 * Set method for field bufferImageHeight
	 * Prototype: uint32_t  bufferImageHeight
	 */ 
	 public void bufferImageHeight(int bufferImageHeight){
		 this.bufferImageHeight = bufferImageHeight;
		bufferImageHeight0(super.ptr, bufferImageHeight);
	 }

	/**
	 * get method for field bufferImageHeight
	 * Prototype: uint32_t  bufferImageHeight
	 */ 
	 public int bufferImageHeight(){
		 // return  this.bufferImageHeight;
		 return bufferImageHeight0(super.ptr);
	 }

	/**
	 * Set method for field imageSubresource
	 * Prototype: VkImageSubresourceLayers  imageSubresource
	 */ 
	 public void imageSubresource(VkImageSubresourceLayers imageSubresource){
		 this.imageSubresource = imageSubresource;
		imageSubresource0(super.ptr, imageSubresource);
	 }

	/**
	 * get method for field imageSubresource
	 * Prototype: VkImageSubresourceLayers  imageSubresource
	 */ 
	 public VkImageSubresourceLayers imageSubresource(){
		 // return  this.imageSubresource;
		 return imageSubresource0(super.ptr);
	 }

	/**
	 * Set method for field imageOffset
	 * Prototype: VkOffset3D  imageOffset
	 */ 
	 public void imageOffset(VkOffset3D imageOffset){
		 this.imageOffset = imageOffset;
		imageOffset0(super.ptr, imageOffset);
	 }

	/**
	 * get method for field imageOffset
	 * Prototype: VkOffset3D  imageOffset
	 */ 
	 public VkOffset3D imageOffset(){
		 // return  this.imageOffset;
		 return imageOffset0(super.ptr);
	 }

	/**
	 * Set method for field imageExtent
	 * Prototype: VkExtent3D  imageExtent
	 */ 
	 public void imageExtent(VkExtent3D imageExtent){
		 this.imageExtent = imageExtent;
		imageExtent0(super.ptr, imageExtent);
	 }

	/**
	 * get method for field imageExtent
	 * Prototype: VkExtent3D  imageExtent
	 */ 
	 public VkExtent3D imageExtent(){
		 // return  this.imageExtent;
		 return imageExtent0(super.ptr);
	 }


	 // ////////////////////////////////
	 // native SETTERS & GETTERS //
	 // ////////////////////////////////
	/**
	 * native Set method for field bufferOffset
	 * Prototype: VkDeviceSize  bufferOffset
	 */ 
	 private static native void bufferOffset0(ByteBuffer ptr, long _bufferOffset);/*
		  VkBufferImageCopy _obj = (VkBufferImageCopy)(*ptr);
		  _obj.bufferOffset = (VkDeviceSize) (_bufferOffset);
	  */

	/**
	 * get method for field bufferOffset
	 * Prototype: VkDeviceSize  bufferOffset
	 */ 
	 private static native long bufferOffset0(ByteBuffer ptr);/*
		  VkBufferImageCopy _obj = (VkBufferImageCopy)(ptr);
		  return (jlong) (_obj.VkDeviceSize);
	 */

	/**
	 * native Set method for field bufferRowLength
	 * Prototype: uint32_t  bufferRowLength
	 */ 
	 private static native void bufferRowLength0(ByteBuffer ptr, int _bufferRowLength);/*
		  VkBufferImageCopy _obj = (VkBufferImageCopy)(*ptr);
		  _obj.bufferRowLength = (uint32_t) (_bufferRowLength);
	  */

	/**
	 * get method for field bufferRowLength
	 * Prototype: uint32_t  bufferRowLength
	 */ 
	 private static native int bufferRowLength0(ByteBuffer ptr);/*
		  VkBufferImageCopy _obj = (VkBufferImageCopy)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native Set method for field bufferImageHeight
	 * Prototype: uint32_t  bufferImageHeight
	 */ 
	 private static native void bufferImageHeight0(ByteBuffer ptr, int _bufferImageHeight);/*
		  VkBufferImageCopy _obj = (VkBufferImageCopy)(*ptr);
		  _obj.bufferImageHeight = (uint32_t) (_bufferImageHeight);
	  */

	/**
	 * get method for field bufferImageHeight
	 * Prototype: uint32_t  bufferImageHeight
	 */ 
	 private static native int bufferImageHeight0(ByteBuffer ptr);/*
		  VkBufferImageCopy _obj = (VkBufferImageCopy)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native Set method for field imageSubresource
	 * Prototype: VkImageSubresourceLayers  imageSubresource
	 */ 
	 private static native void imageSubresource0(ByteBuffer ptr, VkImageSubresourceLayers _imageSubresource);/*
		  VkBufferImageCopy _obj = (VkBufferImageCopy)(*ptr);
		  _obj.imageSubresource = (VkImageSubresourceLayers) (_imageSubresource);
	  */

	/**
	 * get method for field imageSubresource
	 * Prototype: VkImageSubresourceLayers  imageSubresource
	 */ 
	 private static native VkImageSubresourceLayers imageSubresource0(ByteBuffer ptr);/*
		  VkBufferImageCopy _obj = (VkBufferImageCopy)(ptr);
		  return (VkImageSubresourceLayers) (_obj.VkImageSubresourceLayers);
	 */

	/**
	 * native Set method for field imageOffset
	 * Prototype: VkOffset3D  imageOffset
	 */ 
	 private static native void imageOffset0(ByteBuffer ptr, VkOffset3D _imageOffset);/*
		  VkBufferImageCopy _obj = (VkBufferImageCopy)(*ptr);
		  _obj.imageOffset = (VkOffset3D) (_imageOffset);
	  */

	/**
	 * get method for field imageOffset
	 * Prototype: VkOffset3D  imageOffset
	 */ 
	 private static native VkOffset3D imageOffset0(ByteBuffer ptr);/*
		  VkBufferImageCopy _obj = (VkBufferImageCopy)(ptr);
		  return (VkOffset3D) (_obj.VkOffset3D);
	 */

	/**
	 * native Set method for field imageExtent
	 * Prototype: VkExtent3D  imageExtent
	 */ 
	 private static native void imageExtent0(ByteBuffer ptr, VkExtent3D _imageExtent);/*
		  VkBufferImageCopy _obj = (VkBufferImageCopy)(*ptr);
		  _obj.imageExtent = (VkExtent3D) (_imageExtent);
	  */

	/**
	 * get method for field imageExtent
	 * Prototype: VkExtent3D  imageExtent
	 */ 
	 private static native VkExtent3D imageExtent0(ByteBuffer ptr);/*
		  VkBufferImageCopy _obj = (VkBufferImageCopy)(ptr);
		  return (VkExtent3D) (_obj.VkExtent3D);
	 */



} // end of class VkBufferImageCopy
