// class wrapping Vulkan's VkImageFormatProperties struct.
package bor.vulkan.structs;

import bor.vulkan.*;
import bor.vulkan.enumerations.*;
import java.nio.ByteBuffer;


/**
 *  Class for Java-Vulkan integration 
 *  This class is a Java front end for struct VkImageFormatProperties 
 * @Author Alessandro Borges 
 */
public class VkImageFormatProperties extends VkStruct {
	/** ID of this structure [7]  */
	 public static final int TAG = VKIMAGEFORMATPROPERTIES_ID;

	 // fields //
	/**
	 *  VkExtent3D 	maxExtent 
	 */ 
	VkExtent3D 	maxExtent;

	/**
	 *  uint32_t 	maxMipLevels 
	 */ 
	int 	maxMipLevels;

	/**
	 *  uint32_t 	maxArrayLayers 
	 */ 
	int 	maxArrayLayers;

	/**
	 *  VkSampleCountFlags 	sampleCounts 
	 */ 
	int 	sampleCounts;

	/**
	 *  VkDeviceSize 	maxResourceSize 
	 */ 
	long 	maxResourceSize;

	/**
	 * Ctor
	 */
	public VkImageFormatProperties(){ 
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
	 * Set method for field maxExtent
	 * Prototype: VkExtent3D  maxExtent
	 */ 
	 public void maxExtent(VkExtent3D maxExtent){
		 this.maxExtent = maxExtent;
		maxExtent0(super.ptr, maxExtent);
	 }

	/**
	 * get method for field maxExtent
	 * Prototype: VkExtent3D  maxExtent
	 */ 
	 public VkExtent3D maxExtent(){
		 // return  this.maxExtent;
		 return maxExtent0(super.ptr);
	 }

	/**
	 * Set method for field maxMipLevels
	 * Prototype: uint32_t  maxMipLevels
	 */ 
	 public void maxMipLevels(int maxMipLevels){
		 this.maxMipLevels = maxMipLevels;
		maxMipLevels0(super.ptr, maxMipLevels);
	 }

	/**
	 * get method for field maxMipLevels
	 * Prototype: uint32_t  maxMipLevels
	 */ 
	 public int maxMipLevels(){
		 // return  this.maxMipLevels;
		 return maxMipLevels0(super.ptr);
	 }

	/**
	 * Set method for field maxArrayLayers
	 * Prototype: uint32_t  maxArrayLayers
	 */ 
	 public void maxArrayLayers(int maxArrayLayers){
		 this.maxArrayLayers = maxArrayLayers;
		maxArrayLayers0(super.ptr, maxArrayLayers);
	 }

	/**
	 * get method for field maxArrayLayers
	 * Prototype: uint32_t  maxArrayLayers
	 */ 
	 public int maxArrayLayers(){
		 // return  this.maxArrayLayers;
		 return maxArrayLayers0(super.ptr);
	 }

	/**
	 * Set method for field sampleCounts
	 * Prototype: VkSampleCountFlags  sampleCounts
	 */ 
	 public void sampleCounts(int sampleCounts){
		 this.sampleCounts = sampleCounts;
		sampleCounts0(super.ptr, sampleCounts);
	 }

	/**
	 * get method for field sampleCounts
	 * Prototype: VkSampleCountFlags  sampleCounts
	 */ 
	 public int sampleCounts(){
		 // return  this.sampleCounts;
		 return sampleCounts0(super.ptr);
	 }

	/**
	 * Set method for field maxResourceSize
	 * Prototype: VkDeviceSize  maxResourceSize
	 */ 
	 public void maxResourceSize(long maxResourceSize){
		 this.maxResourceSize = maxResourceSize;
		maxResourceSize0(super.ptr, maxResourceSize);
	 }

	/**
	 * get method for field maxResourceSize
	 * Prototype: VkDeviceSize  maxResourceSize
	 */ 
	 public long maxResourceSize(){
		 // return  this.maxResourceSize;
		 return maxResourceSize0(super.ptr);
	 }


	 // ////////////////////////////////
	 // native SETTERS & GETTERS //
	 // ////////////////////////////////
	/**
	 * native Set method for field maxExtent
	 * Prototype: VkExtent3D  maxExtent
	 */ 
	 private static native void maxExtent0(ByteBuffer ptr, VkExtent3D _maxExtent);/*
		  VkImageFormatProperties _obj = (VkImageFormatProperties)(*ptr);
		  _obj.maxExtent = (VkExtent3D) (_maxExtent);
	  */

	/**
	 * get method for field maxExtent
	 * Prototype: VkExtent3D  maxExtent
	 */ 
	 private static native VkExtent3D maxExtent0(ByteBuffer ptr);/*
		  VkImageFormatProperties _obj = (VkImageFormatProperties)(ptr);
		  return (VkExtent3D) (_obj.VkExtent3D);
	 */

	/**
	 * native Set method for field maxMipLevels
	 * Prototype: uint32_t  maxMipLevels
	 */ 
	 private static native void maxMipLevels0(ByteBuffer ptr, int _maxMipLevels);/*
		  VkImageFormatProperties _obj = (VkImageFormatProperties)(*ptr);
		  _obj.maxMipLevels = (uint32_t) (_maxMipLevels);
	  */

	/**
	 * get method for field maxMipLevels
	 * Prototype: uint32_t  maxMipLevels
	 */ 
	 private static native int maxMipLevels0(ByteBuffer ptr);/*
		  VkImageFormatProperties _obj = (VkImageFormatProperties)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native Set method for field maxArrayLayers
	 * Prototype: uint32_t  maxArrayLayers
	 */ 
	 private static native void maxArrayLayers0(ByteBuffer ptr, int _maxArrayLayers);/*
		  VkImageFormatProperties _obj = (VkImageFormatProperties)(*ptr);
		  _obj.maxArrayLayers = (uint32_t) (_maxArrayLayers);
	  */

	/**
	 * get method for field maxArrayLayers
	 * Prototype: uint32_t  maxArrayLayers
	 */ 
	 private static native int maxArrayLayers0(ByteBuffer ptr);/*
		  VkImageFormatProperties _obj = (VkImageFormatProperties)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native Set method for field sampleCounts
	 * Prototype: VkSampleCountFlags  sampleCounts
	 */ 
	 private static native void sampleCounts0(ByteBuffer ptr, int _sampleCounts);/*
		  VkImageFormatProperties _obj = (VkImageFormatProperties)(*ptr);
		  _obj.sampleCounts = (VkSampleCountFlags) (_sampleCounts);
	  */

	/**
	 * get method for field sampleCounts
	 * Prototype: VkSampleCountFlags  sampleCounts
	 */ 
	 private static native int sampleCounts0(ByteBuffer ptr);/*
		  VkImageFormatProperties _obj = (VkImageFormatProperties)(ptr);
		  return (jint) (_obj.VkSampleCountFlags);
	 */

	/**
	 * native Set method for field maxResourceSize
	 * Prototype: VkDeviceSize  maxResourceSize
	 */ 
	 private static native void maxResourceSize0(ByteBuffer ptr, long _maxResourceSize);/*
		  VkImageFormatProperties _obj = (VkImageFormatProperties)(*ptr);
		  _obj.maxResourceSize = (VkDeviceSize) (_maxResourceSize);
	  */

	/**
	 * get method for field maxResourceSize
	 * Prototype: VkDeviceSize  maxResourceSize
	 */ 
	 private static native long maxResourceSize0(ByteBuffer ptr);/*
		  VkImageFormatProperties _obj = (VkImageFormatProperties)(ptr);
		  return (jlong) (_obj.VkDeviceSize);
	 */



} // end of class VkImageFormatProperties
