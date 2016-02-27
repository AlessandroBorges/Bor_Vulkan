// class wrapping Vulkan's VkSparseImageFormatProperties struct.
package bor.vulkan.structs;

import bor.vulkan.*;
import bor.vulkan.enumerations.*;
import java.nio.ByteBuffer;


/**
 *  Class for Java-Vulkan integration 
 *  This class is a Java front end for struct VkSparseImageFormatProperties 
 * @Author Alessandro Borges 
 */
public class VkSparseImageFormatProperties extends VkStruct {
	/** ID of this structure [23]  */
	 public static final int TAG = VKSPARSEIMAGEFORMATPROPERTIES_ID;

	 // fields //
	/**
	 *  VkImageAspectFlags 	aspectMask 
	 */ 
	int 	aspectMask;

	/**
	 *  VkExtent3D 	imageGranularity 
	 */ 
	VkExtent3D 	imageGranularity;

	/**
	 *  VkSparseImageFormatFlags 	flags 
	 */ 
	int 	flags;

	/**
	 * Ctor
	 */
	public VkSparseImageFormatProperties(){ 
		 super(sizeOf()); 
	 }

	/** 
	 * Method to get native size of this structure 
	 */
	 public static int sizeOf(){ 
		 return sizeOf(TAG); 
	}


	 // /////////////////////
	 //  SETTERS & GETTERS //
	 // /////////////////////

	/**
	 * Set method for field aspectMask
	 * Prototype: VkImageAspectFlags  aspectMask
	 */ 
	 public void aspectMask(int aspectMask){
		 this.aspectMask = aspectMask;
		aspectMask0(super.ptr, aspectMask);
	 }

	/**
	 * get method for field aspectMask
	 * Prototype: VkImageAspectFlags  aspectMask
	 */ 
	 public int aspectMask(){
		 // return  this.aspectMask;
		 return aspectMask0(super.ptr);
	 }

	/**
	 * Set method for field imageGranularity
	 * Prototype: VkExtent3D  imageGranularity
	 */ 
	 public void imageGranularity(VkExtent3D imageGranularity){
		 this.imageGranularity = imageGranularity;
		imageGranularity0(super.ptr, imageGranularity);
	 }

	/**
	 * get method for field imageGranularity
	 * Prototype: VkExtent3D  imageGranularity
	 */ 
	 public VkExtent3D imageGranularity(){
		 // return  this.imageGranularity;
		 return imageGranularity0(super.ptr);
	 }

	/**
	 * Set method for field flags
	 * Prototype: VkSparseImageFormatFlags  flags
	 */ 
	 public void flags(int flags){
		 this.flags = flags;
		flags0(super.ptr, flags);
	 }

	/**
	 * get method for field flags
	 * Prototype: VkSparseImageFormatFlags  flags
	 */ 
	 public int flags(){
		 // return  this.flags;
		 return flags0(super.ptr);
	 }


	 // ////////////////////////////////
	 // native SETTERS & GETTERS //
	 // ////////////////////////////////
	/**
	 * native Set method for field aspectMask
	 * Prototype: VkImageAspectFlags  aspectMask
	 */ 
	 private static native void aspectMask0(ByteBuffer ptr, int _aspectMask);/*
		  VkSparseImageFormatProperties _obj = (VkSparseImageFormatProperties)(*ptr);
		  _obj.aspectMask = (VkImageAspectFlags) (_aspectMask);
	  */

	/**
	 * get method for field aspectMask
	 * Prototype: VkImageAspectFlags  aspectMask
	 */ 
	 private static native int aspectMask0(ByteBuffer ptr);/*
		  VkSparseImageFormatProperties _obj = (VkSparseImageFormatProperties)(ptr);
		  return (jint) (_obj.VkImageAspectFlags);
	 */

	/**
	 * native Set method for field imageGranularity
	 * Prototype: VkExtent3D  imageGranularity
	 */ 
	 private static native void imageGranularity0(ByteBuffer ptr, VkExtent3D _imageGranularity);/*
		  VkSparseImageFormatProperties _obj = (VkSparseImageFormatProperties)(*ptr);
		  _obj.imageGranularity = (VkExtent3D) (_imageGranularity);
	  */

	/**
	 * get method for field imageGranularity
	 * Prototype: VkExtent3D  imageGranularity
	 */ 
	 private static native VkExtent3D imageGranularity0(ByteBuffer ptr);/*
		  VkSparseImageFormatProperties _obj = (VkSparseImageFormatProperties)(ptr);
		  return (VkExtent3D) (_obj.VkExtent3D);
	 */

	/**
	 * native Set method for field flags
	 * Prototype: VkSparseImageFormatFlags  flags
	 */ 
	 private static native void flags0(ByteBuffer ptr, int _flags);/*
		  VkSparseImageFormatProperties _obj = (VkSparseImageFormatProperties)(*ptr);
		  _obj.flags = (VkSparseImageFormatFlags) (_flags);
	  */

	/**
	 * get method for field flags
	 * Prototype: VkSparseImageFormatFlags  flags
	 */ 
	 private static native int flags0(ByteBuffer ptr);/*
		  VkSparseImageFormatProperties _obj = (VkSparseImageFormatProperties)(ptr);
		  return (jint) (_obj.VkSparseImageFormatFlags);
	 */



} // end of class VkSparseImageFormatProperties
