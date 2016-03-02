/**
 * Class wrapping Vulkan's VkSparseImageMemoryRequirements struct.
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
 *  Class for Java-Vulkan integration 
 *  This class is a Java front end for struct VkSparseImageMemoryRequirements. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkSparseImageMemoryRequirements {
 *     VkSparseImageFormatProperties    formatProperties;
 *     uint32_t                         imageMipTailFirstLod;
 *     VkDeviceSize                     imageMipTailSize;
 *     VkDeviceSize                     imageMipTailOffset;
 *     VkDeviceSize                     imageMipTailStride;
 * } VkSparseImageMemoryRequirements;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.01 (beta) 
 */
public class VkSparseImageMemoryRequirements extends VkStruct {
	/** TAG of this structure [148]  */
	 private static final String TAG = "VkSparseImageMemoryRequirements";

	/** ID of this structure [148]  */
	 public static final int TAG_ID = VKSPARSEIMAGEMEMORYREQUIREMENTS_ID;

	 // fields //
	/**
	 *  VkSparseImageFormatProperties 	formatProperties	[vkstruct]	 */ 
	VkSparseImageFormatProperties 	formatProperties;

	/**
	 *  uint32_t 	imageMipTailFirstLod		 */ 
	int 	imageMipTailFirstLod;

	/**
	 *  VkDeviceSize 	imageMipTailSize		 */ 
	long 	imageMipTailSize;

	/**
	 *  VkDeviceSize 	imageMipTailOffset		 */ 
	long 	imageMipTailOffset;

	/**
	 *  VkDeviceSize 	imageMipTailStride		 */ 
	long 	imageMipTailStride;

	/**
	 * Ctor
	 */
	public VkSparseImageMemoryRequirements(){ 
		 super(sizeOf()); 
	 }

	/** 
	 * Method to get native size of this structure 
	 */
	 public static int sizeOf(){ 
		 return sizeOf(TAG_ID); 
	}


	 ////////////////////////
	 //  SETTERS & GETTERS //
	 ////////////////////////

	/**
	 * Set method for field formatProperties	[vkstruct]
	 * Prototype: VkSparseImageFormatProperties  formatProperties
	 */ 
	 public void formatProperties(VkSparseImageFormatProperties formatProperties){
		 this.formatProperties = formatProperties;
		formatProperties0(super.ptr, formatProperties);
	 }

	/**
	 * get method for field formatProperties	[vkstruct]
	 * Prototype: VkSparseImageFormatProperties  formatProperties
	 */ 
	 public VkSparseImageFormatProperties formatProperties(){
		 // return  this.formatProperties;
		 return formatProperties0(super.ptr);
	 }

	/**
	 * Set method for field imageMipTailFirstLod	
	 * Prototype: uint32_t  imageMipTailFirstLod
	 */ 
	 public void imageMipTailFirstLod(int imageMipTailFirstLod){
		 this.imageMipTailFirstLod = imageMipTailFirstLod;
		imageMipTailFirstLod0(super.ptr, imageMipTailFirstLod);
	 }

	/**
	 * get method for field imageMipTailFirstLod	
	 * Prototype: uint32_t  imageMipTailFirstLod
	 */ 
	 public int imageMipTailFirstLod(){
		 // return  this.imageMipTailFirstLod;
		 return imageMipTailFirstLod0(super.ptr);
	 }

	/**
	 * Set method for field imageMipTailSize	
	 * Prototype: VkDeviceSize  imageMipTailSize
	 */ 
	 public void imageMipTailSize(long imageMipTailSize){
		 this.imageMipTailSize = imageMipTailSize;
		imageMipTailSize0(super.ptr, imageMipTailSize);
	 }

	/**
	 * get method for field imageMipTailSize	
	 * Prototype: VkDeviceSize  imageMipTailSize
	 */ 
	 public long imageMipTailSize(){
		 // return  this.imageMipTailSize;
		 return imageMipTailSize0(super.ptr);
	 }

	/**
	 * Set method for field imageMipTailOffset	
	 * Prototype: VkDeviceSize  imageMipTailOffset
	 */ 
	 public void imageMipTailOffset(long imageMipTailOffset){
		 this.imageMipTailOffset = imageMipTailOffset;
		imageMipTailOffset0(super.ptr, imageMipTailOffset);
	 }

	/**
	 * get method for field imageMipTailOffset	
	 * Prototype: VkDeviceSize  imageMipTailOffset
	 */ 
	 public long imageMipTailOffset(){
		 // return  this.imageMipTailOffset;
		 return imageMipTailOffset0(super.ptr);
	 }

	/**
	 * Set method for field imageMipTailStride	
	 * Prototype: VkDeviceSize  imageMipTailStride
	 */ 
	 public void imageMipTailStride(long imageMipTailStride){
		 this.imageMipTailStride = imageMipTailStride;
		imageMipTailStride0(super.ptr, imageMipTailStride);
	 }

	/**
	 * get method for field imageMipTailStride	
	 * Prototype: VkDeviceSize  imageMipTailStride
	 */ 
	 public long imageMipTailStride(){
		 // return  this.imageMipTailStride;
		 return imageMipTailStride0(super.ptr);
	 }


	 // ////////////////////////////////
	 // native SETTERS & GETTERS //
	 // ////////////////////////////////
	/**
	 * native Set method for field formatProperties	[vkstruct]
	 * Prototype: VkSparseImageFormatProperties  formatProperties
	 */ 
	 private static native void formatProperties0(ByteBuffer ptr, VkSparseImageFormatProperties _formatProperties);/*
		  VkSparseImageMemoryRequirements _obj = (VkSparseImageMemoryRequirements)(*ptr);
		  _obj.formatProperties = (VkSparseImageFormatProperties) (_formatProperties);
	  */

	/**
	 * get method for field formatProperties	[vkstruct]
	 * Prototype: VkSparseImageFormatProperties  formatProperties
	 */ 
	 private static native VkSparseImageFormatProperties formatProperties0(ByteBuffer ptr);/*
		  VkSparseImageMemoryRequirements _obj = (VkSparseImageMemoryRequirements)(ptr);
		  return (VkSparseImageFormatProperties) (_obj.VkSparseImageFormatProperties);
	 */

	/**
	 * native Set method for field imageMipTailFirstLod	
	 * Prototype: uint32_t  imageMipTailFirstLod
	 */ 
	 private static native void imageMipTailFirstLod0(ByteBuffer ptr, int _imageMipTailFirstLod);/*
		  VkSparseImageMemoryRequirements _obj = (VkSparseImageMemoryRequirements)(*ptr);
		  _obj.imageMipTailFirstLod = (uint32_t) (_imageMipTailFirstLod);
	  */

	/**
	 * get method for field imageMipTailFirstLod	
	 * Prototype: uint32_t  imageMipTailFirstLod
	 */ 
	 private static native int imageMipTailFirstLod0(ByteBuffer ptr);/*
		  VkSparseImageMemoryRequirements _obj = (VkSparseImageMemoryRequirements)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native Set method for field imageMipTailSize	
	 * Prototype: VkDeviceSize  imageMipTailSize
	 */ 
	 private static native void imageMipTailSize0(ByteBuffer ptr, long _imageMipTailSize);/*
		  VkSparseImageMemoryRequirements _obj = (VkSparseImageMemoryRequirements)(*ptr);
		  _obj.imageMipTailSize = (VkDeviceSize) (_imageMipTailSize);
	  */

	/**
	 * get method for field imageMipTailSize	
	 * Prototype: VkDeviceSize  imageMipTailSize
	 */ 
	 private static native long imageMipTailSize0(ByteBuffer ptr);/*
		  VkSparseImageMemoryRequirements _obj = (VkSparseImageMemoryRequirements)(ptr);
		  return (jlong) (_obj.VkDeviceSize);
	 */

	/**
	 * native Set method for field imageMipTailOffset	
	 * Prototype: VkDeviceSize  imageMipTailOffset
	 */ 
	 private static native void imageMipTailOffset0(ByteBuffer ptr, long _imageMipTailOffset);/*
		  VkSparseImageMemoryRequirements _obj = (VkSparseImageMemoryRequirements)(*ptr);
		  _obj.imageMipTailOffset = (VkDeviceSize) (_imageMipTailOffset);
	  */

	/**
	 * get method for field imageMipTailOffset	
	 * Prototype: VkDeviceSize  imageMipTailOffset
	 */ 
	 private static native long imageMipTailOffset0(ByteBuffer ptr);/*
		  VkSparseImageMemoryRequirements _obj = (VkSparseImageMemoryRequirements)(ptr);
		  return (jlong) (_obj.VkDeviceSize);
	 */

	/**
	 * native Set method for field imageMipTailStride	
	 * Prototype: VkDeviceSize  imageMipTailStride
	 */ 
	 private static native void imageMipTailStride0(ByteBuffer ptr, long _imageMipTailStride);/*
		  VkSparseImageMemoryRequirements _obj = (VkSparseImageMemoryRequirements)(*ptr);
		  _obj.imageMipTailStride = (VkDeviceSize) (_imageMipTailStride);
	  */

	/**
	 * get method for field imageMipTailStride	
	 * Prototype: VkDeviceSize  imageMipTailStride
	 */ 
	 private static native long imageMipTailStride0(ByteBuffer ptr);/*
		  VkSparseImageMemoryRequirements _obj = (VkSparseImageMemoryRequirements)(ptr);
		  return (jlong) (_obj.VkDeviceSize);
	 */



} // end of class VkSparseImageMemoryRequirements
