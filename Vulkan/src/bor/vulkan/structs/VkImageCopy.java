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

	 // fields //
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

	 ////////////////////////
	 //  SETTERS & GETTERS //
	 ////////////////////////

	/**
	 * Set method for field srcSubresource	[vkstruct]<br>
	 * Prototype: VkImageSubresourceLayers  srcSubresource
	 */ 
	 public void srcSubresource(VkImageSubresourceLayers srcSubresource){
		 this.srcSubresource = srcSubresource;
		srcSubresource0(super.ptr, srcSubresource);
	 }

	/**
	 * get method for field srcSubresource	[vkstruct]<br>
	 * Prototype: VkImageSubresourceLayers  srcSubresource
	 */ 
	 public VkImageSubresourceLayers srcSubresource(){
		 // return  this.srcSubresource;
		 return srcSubresource0(super.ptr);
	 }

	/**
	 * Set method for field srcOffset	[vkstruct]<br>
	 * Prototype: VkOffset3D  srcOffset
	 */ 
	 public void srcOffset(VkOffset3D srcOffset){
		 this.srcOffset = srcOffset;
		srcOffset0(super.ptr, srcOffset);
	 }

	/**
	 * get method for field srcOffset	[vkstruct]<br>
	 * Prototype: VkOffset3D  srcOffset
	 */ 
	 public VkOffset3D srcOffset(){
		 // return  this.srcOffset;
		 return srcOffset0(super.ptr);
	 }

	/**
	 * Set method for field dstSubresource	[vkstruct]<br>
	 * Prototype: VkImageSubresourceLayers  dstSubresource
	 */ 
	 public void dstSubresource(VkImageSubresourceLayers dstSubresource){
		 this.dstSubresource = dstSubresource;
		dstSubresource0(super.ptr, dstSubresource);
	 }

	/**
	 * get method for field dstSubresource	[vkstruct]<br>
	 * Prototype: VkImageSubresourceLayers  dstSubresource
	 */ 
	 public VkImageSubresourceLayers dstSubresource(){
		 // return  this.dstSubresource;
		 return dstSubresource0(super.ptr);
	 }

	/**
	 * Set method for field dstOffset	[vkstruct]<br>
	 * Prototype: VkOffset3D  dstOffset
	 */ 
	 public void dstOffset(VkOffset3D dstOffset){
		 this.dstOffset = dstOffset;
		dstOffset0(super.ptr, dstOffset);
	 }

	/**
	 * get method for field dstOffset	[vkstruct]<br>
	 * Prototype: VkOffset3D  dstOffset
	 */ 
	 public VkOffset3D dstOffset(){
		 // return  this.dstOffset;
		 return dstOffset0(super.ptr);
	 }

	/**
	 * Set method for field extent	[vkstruct]<br>
	 * Prototype: VkExtent3D  extent
	 */ 
	 public void extent(VkExtent3D extent){
		 this.extent = extent;
		extent0(super.ptr, extent);
	 }

	/**
	 * get method for field extent	[vkstruct]<br>
	 * Prototype: VkExtent3D  extent
	 */ 
	 public VkExtent3D extent(){
		 // return  this.extent;
		 return extent0(super.ptr);
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field srcSubresource	[vkstruct]<br>
	 * Prototype: VkImageSubresourceLayers  srcSubresource
	 */ 
	 private static native void srcSubresource0(ByteBuffer ptr, VkImageSubresourceLayers _srcSubresource);/*
		  VkImageCopy _obj = (VkImageCopy)(*ptr);
		  _obj.srcSubresource = (VkImageSubresourceLayers) (_srcSubresource);
	  */

	/**
	 * native GET method for field srcSubresource	[vkstruct]<br>
	 * Prototype: VkImageSubresourceLayers  srcSubresource
	 */ 
	 private static native VkImageSubresourceLayers srcSubresource0(ByteBuffer ptr);/*
		  VkImageCopy _obj = (VkImageCopy)(ptr);
		  return (VkImageSubresourceLayers) (_obj.VkImageSubresourceLayers);
	 */

	/**
	 * native SET method for field srcOffset	[vkstruct]<br>
	 * Prototype: VkOffset3D  srcOffset
	 */ 
	 private static native void srcOffset0(ByteBuffer ptr, VkOffset3D _srcOffset);/*
		  VkImageCopy _obj = (VkImageCopy)(*ptr);
		  _obj.srcOffset = (VkOffset3D) (_srcOffset);
	  */

	/**
	 * native GET method for field srcOffset	[vkstruct]<br>
	 * Prototype: VkOffset3D  srcOffset
	 */ 
	 private static native VkOffset3D srcOffset0(ByteBuffer ptr);/*
		  VkImageCopy _obj = (VkImageCopy)(ptr);
		  return (VkOffset3D) (_obj.VkOffset3D);
	 */

	/**
	 * native SET method for field dstSubresource	[vkstruct]<br>
	 * Prototype: VkImageSubresourceLayers  dstSubresource
	 */ 
	 private static native void dstSubresource0(ByteBuffer ptr, VkImageSubresourceLayers _dstSubresource);/*
		  VkImageCopy _obj = (VkImageCopy)(*ptr);
		  _obj.dstSubresource = (VkImageSubresourceLayers) (_dstSubresource);
	  */

	/**
	 * native GET method for field dstSubresource	[vkstruct]<br>
	 * Prototype: VkImageSubresourceLayers  dstSubresource
	 */ 
	 private static native VkImageSubresourceLayers dstSubresource0(ByteBuffer ptr);/*
		  VkImageCopy _obj = (VkImageCopy)(ptr);
		  return (VkImageSubresourceLayers) (_obj.VkImageSubresourceLayers);
	 */

	/**
	 * native SET method for field dstOffset	[vkstruct]<br>
	 * Prototype: VkOffset3D  dstOffset
	 */ 
	 private static native void dstOffset0(ByteBuffer ptr, VkOffset3D _dstOffset);/*
		  VkImageCopy _obj = (VkImageCopy)(*ptr);
		  _obj.dstOffset = (VkOffset3D) (_dstOffset);
	  */

	/**
	 * native GET method for field dstOffset	[vkstruct]<br>
	 * Prototype: VkOffset3D  dstOffset
	 */ 
	 private static native VkOffset3D dstOffset0(ByteBuffer ptr);/*
		  VkImageCopy _obj = (VkImageCopy)(ptr);
		  return (VkOffset3D) (_obj.VkOffset3D);
	 */

	/**
	 * native SET method for field extent	[vkstruct]<br>
	 * Prototype: VkExtent3D  extent
	 */ 
	 private static native void extent0(ByteBuffer ptr, VkExtent3D _extent);/*
		  VkImageCopy _obj = (VkImageCopy)(*ptr);
		  _obj.extent = (VkExtent3D) (_extent);
	  */

	/**
	 * native GET method for field extent	[vkstruct]<br>
	 * Prototype: VkExtent3D  extent
	 */ 
	 private static native VkExtent3D extent0(ByteBuffer ptr);/*
		  VkImageCopy _obj = (VkImageCopy)(ptr);
		  return (VkExtent3D) (_obj.VkExtent3D);
	 */



} // end of class VkImageCopy
