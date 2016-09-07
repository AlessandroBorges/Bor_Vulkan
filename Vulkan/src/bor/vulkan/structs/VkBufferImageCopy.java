/**
 * Class wrapping Vulkan's VkBufferImageCopy struct.
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
 * @version Ver. 0.8.65 (beta) 
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
	 * Get ID of this structure 
	 */
	 public static int getID(){ 
		 return TAG_ID; 
	}

	/** 
	 * Static method to create a VkArray for this VkStruct subclass.
	 * @param size - number of elements
	 */
	 public static VkArray<VkBufferImageCopy> createVkArray(int size){ 
		 VkBufferImageCopy[] array = new VkBufferImageCopy[size]; 
		 VkArrayStruct<VkBufferImageCopy> vkArray = new VkArrayStruct<VkBufferImageCopy>(array, TAG_ID);
		 return vkArray; 
	 } 


	 ////////////////////////
	 //  SETTERS & GETTERS //
	 ////////////////////////

	/**
	 * Set method for field bufferOffset	[long]<br>
	 * Prototype: VkDeviceSize  bufferOffset
	 * 
	 * @param bufferOffset - a instance of long.
	 * @return this VkStruct instance.
	 */ 
	 public VkBufferImageCopy bufferOffset(long bufferOffset){
		 this.bufferOffset = bufferOffset;
		 setBufferOffset0(this.ptr,  bufferOffset);
		 return this;
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
	 * 
	 * @param bufferRowLength - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkBufferImageCopy bufferRowLength(int bufferRowLength){
		 this.bufferRowLength = bufferRowLength;
		 setBufferRowLength0(this.ptr,  bufferRowLength);
		 return this;
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
	 * 
	 * @param bufferImageHeight - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkBufferImageCopy bufferImageHeight(int bufferImageHeight){
		 this.bufferImageHeight = bufferImageHeight;
		 setBufferImageHeight0(this.ptr,  bufferImageHeight);
		 return this;
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
	 * 
	 * @param imageSubresource - a instance of VkImageSubresourceLayers.
	 * @return this VkStruct instance.
	 */ 
	 public VkBufferImageCopy imageSubresource(VkImageSubresourceLayers imageSubresource){
		 this.imageSubresource = imageSubresource;
		 ByteBuffer buff = (imageSubresource==null) ? null : imageSubresource.getPointer();
		 setImageSubresource0(this.ptr, buff);
		 return this;
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
	 * 
	 * @param imageOffset - a instance of VkOffset3D.
	 * @return this VkStruct instance.
	 */ 
	 public VkBufferImageCopy imageOffset(VkOffset3D imageOffset){
		 this.imageOffset = imageOffset;
		 ByteBuffer buff = (imageOffset==null) ? null : imageOffset.getPointer();
		 setImageOffset0(this.ptr, buff);
		 return this;
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
	 * 
	 * @param imageExtent - a instance of VkExtent3D.
	 * @return this VkStruct instance.
	 */ 
	 public VkBufferImageCopy imageExtent(VkExtent3D imageExtent){
		 this.imageExtent = imageExtent;
		 ByteBuffer buff = (imageExtent==null) ? null : imageExtent.getPointer();
		 setImageExtent0(this.ptr, buff);
		 return this;
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


   /* (non-Javadoc)
    * @see java.lang.Object#toString()
    */
    @Override
    public String toString() {
         StringBuilder builder = new StringBuilder();
         builder.append("VkBufferImageCopy [ ")
				.append("bufferOffset: ").append(bufferOffset() )
				.append(",\n bufferRowLength: ")
				.append(bufferRowLength() )
				.append(",\n bufferImageHeight: ")
				.append(bufferImageHeight() )
				.append(",\n imageSubresource: ")
				.append(imageSubresource() )
				.append(",\n imageOffset: ")
				.append(imageOffset() )
				.append(",\n imageExtent: ")
				.append(imageExtent() )
				.append("]");
		 return builder.toString();
    }


	 //////////////////////////////////
	 // Native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * Native SET method for field bufferOffset	[long]<br>
	 * Prototype: VkDeviceSize  bufferOffset
	 */ 
	 private static native void setBufferOffset0(Buffer ptr, long _bufferOffset);/*
		  VkBufferImageCopy* vkObj = (VkBufferImageCopy*)(ptr);
		 // code for simple past value 
		  vkObj->bufferOffset = (VkDeviceSize) (_bufferOffset);
	  */

	/**
	 * Native GET method for field bufferOffset	[long]<br>
	 * Prototype: VkDeviceSize  bufferOffset
	 */ 
	 private static native long getBufferOffset0(Buffer ptr);/*
		  VkBufferImageCopy* vkObj = (VkBufferImageCopy*)(ptr);
		  return (jlong) (vkObj->bufferOffset);
	 */

	/**
	 * Native SET method for field bufferRowLength	[int]<br>
	 * Prototype: uint32_t  bufferRowLength
	 */ 
	 private static native void setBufferRowLength0(Buffer ptr, int _bufferRowLength);/*
		  VkBufferImageCopy* vkObj = (VkBufferImageCopy*)(ptr);
		 // code for simple past value 
		  vkObj->bufferRowLength = (uint32_t) (_bufferRowLength);
	  */

	/**
	 * Native GET method for field bufferRowLength	[int]<br>
	 * Prototype: uint32_t  bufferRowLength
	 */ 
	 private static native int getBufferRowLength0(Buffer ptr);/*
		  VkBufferImageCopy* vkObj = (VkBufferImageCopy*)(ptr);
		  return (jint) (vkObj->bufferRowLength);
	 */

	/**
	 * Native SET method for field bufferImageHeight	[int]<br>
	 * Prototype: uint32_t  bufferImageHeight
	 */ 
	 private static native void setBufferImageHeight0(Buffer ptr, int _bufferImageHeight);/*
		  VkBufferImageCopy* vkObj = (VkBufferImageCopy*)(ptr);
		 // code for simple past value 
		  vkObj->bufferImageHeight = (uint32_t) (_bufferImageHeight);
	  */

	/**
	 * Native GET method for field bufferImageHeight	[int]<br>
	 * Prototype: uint32_t  bufferImageHeight
	 */ 
	 private static native int getBufferImageHeight0(Buffer ptr);/*
		  VkBufferImageCopy* vkObj = (VkBufferImageCopy*)(ptr);
		  return (jint) (vkObj->bufferImageHeight);
	 */

	/**
	 * Native SET method for field imageSubresource	[vkstruct]<br>
	 * Prototype: VkImageSubresourceLayers  imageSubresource
	 */ 
	 private static native void setImageSubresource0(Buffer ptr, java.nio.ByteBuffer  _imageSubresource);/*
		  VkBufferImageCopy* vkObj = (VkBufferImageCopy*)(ptr);
		 // code for Buffer - ptr to struct 
		 VkImageSubresourceLayers* p_imageSubresource = (VkImageSubresourceLayers*) _imageSubresource; 
		 vkObj->imageSubresource = (*p_imageSubresource); 
	  */

	/**
	 * Native GET method for field imageSubresource	[vkstruct]<br>
	 * Prototype: VkImageSubresourceLayers  imageSubresource
	 */ 
	 private static native long getImageSubresource0(Buffer ptr);/*
		  VkBufferImageCopy* vkObj = (VkBufferImageCopy*)(ptr);
		  // generic get for Buffer - field must be pointer! 
		  return (jlong) reinterpret_cast<jlong>(vkObj->imageSubresource);
	 */

	/**
	 * Native SET method for field imageOffset	[vkstruct]<br>
	 * Prototype: VkOffset3D  imageOffset
	 */ 
	 private static native void setImageOffset0(Buffer ptr, java.nio.ByteBuffer  _imageOffset);/*
		  VkBufferImageCopy* vkObj = (VkBufferImageCopy*)(ptr);
		 // code for Buffer - ptr to struct 
		 VkOffset3D* p_imageOffset = (VkOffset3D*) _imageOffset; 
		 vkObj->imageOffset = (*p_imageOffset); 
	  */

	/**
	 * Native GET method for field imageOffset	[vkstruct]<br>
	 * Prototype: VkOffset3D  imageOffset
	 */ 
	 private static native long getImageOffset0(Buffer ptr);/*
		  VkBufferImageCopy* vkObj = (VkBufferImageCopy*)(ptr);
		  // generic get for Buffer - field must be pointer! 
		  return (jlong) reinterpret_cast<jlong>(vkObj->imageOffset);
	 */

	/**
	 * Native SET method for field imageExtent	[vkstruct]<br>
	 * Prototype: VkExtent3D  imageExtent
	 */ 
	 private static native void setImageExtent0(Buffer ptr, java.nio.ByteBuffer  _imageExtent);/*
		  VkBufferImageCopy* vkObj = (VkBufferImageCopy*)(ptr);
		 // code for Buffer - ptr to struct 
		 VkExtent3D* p_imageExtent = (VkExtent3D*) _imageExtent; 
		 vkObj->imageExtent = (*p_imageExtent); 
	  */

	/**
	 * Native GET method for field imageExtent	[vkstruct]<br>
	 * Prototype: VkExtent3D  imageExtent
	 */ 
	 private static native long getImageExtent0(Buffer ptr);/*
		  VkBufferImageCopy* vkObj = (VkBufferImageCopy*)(ptr);
		  // generic get for Buffer - field must be pointer! 
		  return (jlong) reinterpret_cast<jlong>(vkObj->imageExtent);
	 */



} // end of class VkBufferImageCopy
