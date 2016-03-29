/**
 * Class wrapping Vulkan's VkImageCopy struct.
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
 *  This class is a Java front end for struct VkImageCopy. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkImageCopy {
 *     VkImageSubresourceLayers    srcSubresource;
 *     VkOffset3D                  srcOffset;
 *     VkImageSubresourceLayers    dstSubresource;
 *     VkOffset3D                  dstOffset;
 *     VkExtent3D                  extent;
 * } VkImageCopy;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.01 (beta) 
 */
public class VkImageCopy extends VkStruct {
	/** TAG of this structure [92]  */
	 private static final String TAG = "VkImageCopy";

	/** ID of this structure [92]  */
	 public static final int TAG_ID = VKIMAGECOPY_ID;

	/** P wrapper for THIS object */
	 private  P<VkImageCopy> p;

	 ///////////////////
	 // Struct fields //
	 ///////////////////
	/**
	 *  VkImageSubresourceLayers 	srcSubresource	[vkstruct]
	 */ 
	 VkImageSubresourceLayers 	srcSubresource;

	/**
	 *  VkOffset3D 	srcOffset	[vkstruct]
	 */ 
	 VkOffset3D 	srcOffset;

	/**
	 *  VkImageSubresourceLayers 	dstSubresource	[vkstruct]
	 */ 
	 VkImageSubresourceLayers 	dstSubresource;

	/**
	 *  VkOffset3D 	dstOffset	[vkstruct]
	 */ 
	 VkOffset3D 	dstOffset;

	/**
	 *  VkExtent3D 	extent	[vkstruct]
	 */ 
	 VkExtent3D 	extent;

	/**
	 * Ctor
	 */
	public VkImageCopy(){ 
		 super(sizeOf()); 
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkImageCopy(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address and memSize
	 * @param address - native address 
	 * @param memSize - buffer size 
	 */
	 public VkImageCopy(long address, int memSize){ 
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
	 public static P<VkImageCopy> createNullPointer(){
	        P<VkImageCopy> p = new  P<VkImageCopy>(new VkImageCopy());
	        return p;
	    }


	/** 
	 * Return this VkObject instance wrapped in pointer P<br>
	 *
	 *  P&lt;? extends VkObject &gt;
	 *
	 * @return  a P container wrapping this object.
	 */
	 public P<VkImageCopy> getP() {
	       if(p == null ){
	           p = new P<VkImageCopy> (this);
	       }
	        return p;
	    }


	 ////////////////////////
	 //  SETTERS & GETTERS //
	 ////////////////////////

	/**
	 * Set method for field srcSubresource	[vkstruct]<br>
	 * Prototype: VkImageSubresourceLayers  srcSubresource
	 */ 
	 public void srcSubresource(VkImageSubresourceLayers srcSubresource){
		 this.srcSubresource = srcSubresource;
		 ByteBuffer buff = (srcSubresource==null) ? null : srcSubresource.getPointerStruct();
		 srcSubresource0(this.ptr, buff);
	 }

	/**
	 * Get method for field srcSubresource	[vkstruct]<br>
	 * Prototype: VkImageSubresourceLayers  srcSubresource
	 */ 
	 public VkImageSubresourceLayers srcSubresource(){
		 ByteBuffer pointer = srcSubresource0(super.ptr);
		 if(pointer == null){
		    this.srcSubresource = null;
		    return null;
		  } else 
 		 if(this.srcSubresource == null){
		    this.srcSubresource = new VkImageSubresourceLayers(pointer);
		 }else{
		    this.srcSubresource.setPointer(pointer);
		  }
		 return this.srcSubresource;
	 }

	/**
	 * Set method for field srcOffset	[vkstruct]<br>
	 * Prototype: VkOffset3D  srcOffset
	 */ 
	 public void srcOffset(VkOffset3D srcOffset){
		 this.srcOffset = srcOffset;
		 ByteBuffer buff = (srcOffset==null) ? null : srcOffset.getPointerStruct();
		 srcOffset0(this.ptr, buff);
	 }

	/**
	 * Get method for field srcOffset	[vkstruct]<br>
	 * Prototype: VkOffset3D  srcOffset
	 */ 
	 public VkOffset3D srcOffset(){
		 ByteBuffer pointer = srcOffset0(super.ptr);
		 if(pointer == null){
		    this.srcOffset = null;
		    return null;
		  } else 
 		 if(this.srcOffset == null){
		    this.srcOffset = new VkOffset3D(pointer);
		 }else{
		    this.srcOffset.setPointer(pointer);
		  }
		 return this.srcOffset;
	 }

	/**
	 * Set method for field dstSubresource	[vkstruct]<br>
	 * Prototype: VkImageSubresourceLayers  dstSubresource
	 */ 
	 public void dstSubresource(VkImageSubresourceLayers dstSubresource){
		 this.dstSubresource = dstSubresource;
		 ByteBuffer buff = (dstSubresource==null) ? null : dstSubresource.getPointerStruct();
		 dstSubresource0(this.ptr, buff);
	 }

	/**
	 * Get method for field dstSubresource	[vkstruct]<br>
	 * Prototype: VkImageSubresourceLayers  dstSubresource
	 */ 
	 public VkImageSubresourceLayers dstSubresource(){
		 ByteBuffer pointer = dstSubresource0(super.ptr);
		 if(pointer == null){
		    this.dstSubresource = null;
		    return null;
		  } else 
 		 if(this.dstSubresource == null){
		    this.dstSubresource = new VkImageSubresourceLayers(pointer);
		 }else{
		    this.dstSubresource.setPointer(pointer);
		  }
		 return this.dstSubresource;
	 }

	/**
	 * Set method for field dstOffset	[vkstruct]<br>
	 * Prototype: VkOffset3D  dstOffset
	 */ 
	 public void dstOffset(VkOffset3D dstOffset){
		 this.dstOffset = dstOffset;
		 ByteBuffer buff = (dstOffset==null) ? null : dstOffset.getPointerStruct();
		 dstOffset0(this.ptr, buff);
	 }

	/**
	 * Get method for field dstOffset	[vkstruct]<br>
	 * Prototype: VkOffset3D  dstOffset
	 */ 
	 public VkOffset3D dstOffset(){
		 ByteBuffer pointer = dstOffset0(super.ptr);
		 if(pointer == null){
		    this.dstOffset = null;
		    return null;
		  } else 
 		 if(this.dstOffset == null){
		    this.dstOffset = new VkOffset3D(pointer);
		 }else{
		    this.dstOffset.setPointer(pointer);
		  }
		 return this.dstOffset;
	 }

	/**
	 * Set method for field extent	[vkstruct]<br>
	 * Prototype: VkExtent3D  extent
	 */ 
	 public void extent(VkExtent3D extent){
		 this.extent = extent;
		 ByteBuffer buff = (extent==null) ? null : extent.getPointerStruct();
		 extent0(this.ptr, buff);
	 }

	/**
	 * Get method for field extent	[vkstruct]<br>
	 * Prototype: VkExtent3D  extent
	 */ 
	 public VkExtent3D extent(){
		 ByteBuffer pointer = extent0(super.ptr);
		 if(pointer == null){
		    this.extent = null;
		    return null;
		  } else 
 		 if(this.extent == null){
		    this.extent = new VkExtent3D(pointer);
		 }else{
		    this.extent.setPointer(pointer);
		  }
		 return this.extent;
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field srcSubresource	[vkstruct]<br>
	 * Prototype: VkImageSubresourceLayers  srcSubresource
	 */ 
	 private static native void srcSubresource0(Buffer ptr, java.nio.ByteBuffer  _srcSubresource);/*
		  VkImageCopy* vkObj = (VkImageCopy*)(ptr);
		  vkObj->srcSubresource = (VkImageSubresourceLayers) (_srcSubresource);
	  */

	/**
	 * native GET method for field srcSubresource	[vkstruct]<br>
	 * Prototype: VkImageSubresourceLayers  srcSubresource
	 */ 
	 private static native java.nio.ByteBuffer  srcSubresource0(Buffer ptr);/*
		  VkImageCopy vkObj = (VkImageCopy*)(ptr);
		  return (VkImageSubresourceLayers) (vkObj->srcSubresource);
	 */

	/**
	 * native SET method for field srcOffset	[vkstruct]<br>
	 * Prototype: VkOffset3D  srcOffset
	 */ 
	 private static native void srcOffset0(Buffer ptr, java.nio.ByteBuffer  _srcOffset);/*
		  VkImageCopy* vkObj = (VkImageCopy*)(ptr);
		  vkObj->srcOffset = (VkOffset3D) (_srcOffset);
	  */

	/**
	 * native GET method for field srcOffset	[vkstruct]<br>
	 * Prototype: VkOffset3D  srcOffset
	 */ 
	 private static native java.nio.ByteBuffer  srcOffset0(Buffer ptr);/*
		  VkImageCopy vkObj = (VkImageCopy*)(ptr);
		  return (VkOffset3D) (vkObj->srcOffset);
	 */

	/**
	 * native SET method for field dstSubresource	[vkstruct]<br>
	 * Prototype: VkImageSubresourceLayers  dstSubresource
	 */ 
	 private static native void dstSubresource0(Buffer ptr, java.nio.ByteBuffer  _dstSubresource);/*
		  VkImageCopy* vkObj = (VkImageCopy*)(ptr);
		  vkObj->dstSubresource = (VkImageSubresourceLayers) (_dstSubresource);
	  */

	/**
	 * native GET method for field dstSubresource	[vkstruct]<br>
	 * Prototype: VkImageSubresourceLayers  dstSubresource
	 */ 
	 private static native java.nio.ByteBuffer  dstSubresource0(Buffer ptr);/*
		  VkImageCopy vkObj = (VkImageCopy*)(ptr);
		  return (VkImageSubresourceLayers) (vkObj->dstSubresource);
	 */

	/**
	 * native SET method for field dstOffset	[vkstruct]<br>
	 * Prototype: VkOffset3D  dstOffset
	 */ 
	 private static native void dstOffset0(Buffer ptr, java.nio.ByteBuffer  _dstOffset);/*
		  VkImageCopy* vkObj = (VkImageCopy*)(ptr);
		  vkObj->dstOffset = (VkOffset3D) (_dstOffset);
	  */

	/**
	 * native GET method for field dstOffset	[vkstruct]<br>
	 * Prototype: VkOffset3D  dstOffset
	 */ 
	 private static native java.nio.ByteBuffer  dstOffset0(Buffer ptr);/*
		  VkImageCopy vkObj = (VkImageCopy*)(ptr);
		  return (VkOffset3D) (vkObj->dstOffset);
	 */

	/**
	 * native SET method for field extent	[vkstruct]<br>
	 * Prototype: VkExtent3D  extent
	 */ 
	 private static native void extent0(Buffer ptr, java.nio.ByteBuffer  _extent);/*
		  VkImageCopy* vkObj = (VkImageCopy*)(ptr);
		  vkObj->extent = (VkExtent3D) (_extent);
	  */

	/**
	 * native GET method for field extent	[vkstruct]<br>
	 * Prototype: VkExtent3D  extent
	 */ 
	 private static native java.nio.ByteBuffer  extent0(Buffer ptr);/*
		  VkImageCopy vkObj = (VkImageCopy*)(ptr);
		  return (VkExtent3D) (vkObj->extent);
	 */



} // end of class VkImageCopy
