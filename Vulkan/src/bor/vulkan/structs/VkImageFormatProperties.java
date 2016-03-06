/**
 * Class wrapping Vulkan's VkImageFormatProperties struct.
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
 *  This class is a Java front end for struct VkImageFormatProperties. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkImageFormatProperties {
 *     VkExtent3D            maxExtent;
 *     uint32_t              maxMipLevels;
 *     uint32_t              maxArrayLayers;
 *     VkSampleCountFlags    sampleCounts;
 *     VkDeviceSize          maxResourceSize;
 * } VkImageFormatProperties;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.01 (beta) 
 */
public class VkImageFormatProperties extends VkStruct {
	/** TAG of this structure [7]  */
	 private static final String TAG = "VkImageFormatProperties";

	/** ID of this structure [7]  */
	 public static final int TAG_ID = VKIMAGEFORMATPROPERTIES_ID;

	 // fields //
	/**
	 *  VkExtent3D 	maxExtent	[vkstruct]
	 */ 
	VkExtent3D 	maxExtent;

	/**
	 *  uint32_t 	maxMipLevels	[int]
	 */ 
	int 	maxMipLevels;

	/**
	 *  uint32_t 	maxArrayLayers	[int]
	 */ 
	int 	maxArrayLayers;

	/**
	 *  VkSampleCountFlags 	sampleCounts	[int]
	 */ 
	int 	sampleCounts;

	/**
	 *  VkDeviceSize 	maxResourceSize	[long]
	 */ 
	long 	maxResourceSize;

	/**
	 * Ctor
	 */
	public VkImageFormatProperties(){ 
		 super(sizeOf()); 
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkImageFormatProperties(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address and memSize
	 * @param address - native address 
	 * @param memSize - buffer size 
	 */
	 public VkImageFormatProperties(long address, int memSize){ 
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
	 public static P<VkImageFormatProperties> createNullPointer(){
	        P<VkImageFormatProperties> p = new  P<VkImageFormatProperties>(new VkImageFormatProperties());
	        return p;
	    }

	 ////////////////////////
	 //  SETTERS & GETTERS //
	 ////////////////////////

	/**
	 * Set method for field maxExtent	[vkstruct]<br>
	 * Prototype: VkExtent3D  maxExtent
	 */ 
	 public void maxExtent(VkExtent3D maxExtent){
		 this.maxExtent = maxExtent;
		maxExtent0(super.ptr, maxExtent);
	 }

	/**
	 * get method for field maxExtent	[vkstruct]<br>
	 * Prototype: VkExtent3D  maxExtent
	 */ 
	 public VkExtent3D maxExtent(){
		 // return  this.maxExtent;
		 return maxExtent0(super.ptr);
	 }

	/**
	 * Set method for field maxMipLevels	[int]<br>
	 * Prototype: uint32_t  maxMipLevels
	 */ 
	 public void maxMipLevels(int maxMipLevels){
		 this.maxMipLevels = maxMipLevels;
		maxMipLevels0(super.ptr, maxMipLevels);
	 }

	/**
	 * get method for field maxMipLevels	[int]<br>
	 * Prototype: uint32_t  maxMipLevels
	 */ 
	 public int maxMipLevels(){
		 // return  this.maxMipLevels;
		 return maxMipLevels0(super.ptr);
	 }

	/**
	 * Set method for field maxArrayLayers	[int]<br>
	 * Prototype: uint32_t  maxArrayLayers
	 */ 
	 public void maxArrayLayers(int maxArrayLayers){
		 this.maxArrayLayers = maxArrayLayers;
		maxArrayLayers0(super.ptr, maxArrayLayers);
	 }

	/**
	 * get method for field maxArrayLayers	[int]<br>
	 * Prototype: uint32_t  maxArrayLayers
	 */ 
	 public int maxArrayLayers(){
		 // return  this.maxArrayLayers;
		 return maxArrayLayers0(super.ptr);
	 }

	/**
	 * Set method for field sampleCounts	[int]<br>
	 * Prototype: VkSampleCountFlags  sampleCounts
	 */ 
	 public void sampleCounts(int sampleCounts){
		 this.sampleCounts = sampleCounts;
		sampleCounts0(super.ptr, sampleCounts);
	 }

	/**
	 * get method for field sampleCounts	[int]<br>
	 * Prototype: VkSampleCountFlags  sampleCounts
	 */ 
	 public int sampleCounts(){
		 // return  this.sampleCounts;
		 return sampleCounts0(super.ptr);
	 }

	/**
	 * Set method for field maxResourceSize	[long]<br>
	 * Prototype: VkDeviceSize  maxResourceSize
	 */ 
	 public void maxResourceSize(long maxResourceSize){
		 this.maxResourceSize = maxResourceSize;
		maxResourceSize0(super.ptr, maxResourceSize);
	 }

	/**
	 * get method for field maxResourceSize	[long]<br>
	 * Prototype: VkDeviceSize  maxResourceSize
	 */ 
	 public long maxResourceSize(){
		 // return  this.maxResourceSize;
		 return maxResourceSize0(super.ptr);
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field maxExtent	[vkstruct]<br>
	 * Prototype: VkExtent3D  maxExtent
	 */ 
	 private static native void maxExtent0(ByteBuffer ptr, VkExtent3D _maxExtent);/*
		  VkImageFormatProperties _obj = (VkImageFormatProperties)(*ptr);
		  _obj.maxExtent = (VkExtent3D) (_maxExtent);
	  */

	/**
	 * native GET method for field maxExtent	[vkstruct]<br>
	 * Prototype: VkExtent3D  maxExtent
	 */ 
	 private static native VkExtent3D maxExtent0(ByteBuffer ptr);/*
		  VkImageFormatProperties _obj = (VkImageFormatProperties)(ptr);
		  return (VkExtent3D) (_obj.VkExtent3D);
	 */

	/**
	 * native SET method for field maxMipLevels	[int]<br>
	 * Prototype: uint32_t  maxMipLevels
	 */ 
	 private static native void maxMipLevels0(ByteBuffer ptr, int _maxMipLevels);/*
		  VkImageFormatProperties _obj = (VkImageFormatProperties)(*ptr);
		  _obj.maxMipLevels = (uint32_t) (_maxMipLevels);
	  */

	/**
	 * native GET method for field maxMipLevels	[int]<br>
	 * Prototype: uint32_t  maxMipLevels
	 */ 
	 private static native int maxMipLevels0(ByteBuffer ptr);/*
		  VkImageFormatProperties _obj = (VkImageFormatProperties)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native SET method for field maxArrayLayers	[int]<br>
	 * Prototype: uint32_t  maxArrayLayers
	 */ 
	 private static native void maxArrayLayers0(ByteBuffer ptr, int _maxArrayLayers);/*
		  VkImageFormatProperties _obj = (VkImageFormatProperties)(*ptr);
		  _obj.maxArrayLayers = (uint32_t) (_maxArrayLayers);
	  */

	/**
	 * native GET method for field maxArrayLayers	[int]<br>
	 * Prototype: uint32_t  maxArrayLayers
	 */ 
	 private static native int maxArrayLayers0(ByteBuffer ptr);/*
		  VkImageFormatProperties _obj = (VkImageFormatProperties)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native SET method for field sampleCounts	[int]<br>
	 * Prototype: VkSampleCountFlags  sampleCounts
	 */ 
	 private static native void sampleCounts0(ByteBuffer ptr, int _sampleCounts);/*
		  VkImageFormatProperties _obj = (VkImageFormatProperties)(*ptr);
		  _obj.sampleCounts = (VkSampleCountFlags) (_sampleCounts);
	  */

	/**
	 * native GET method for field sampleCounts	[int]<br>
	 * Prototype: VkSampleCountFlags  sampleCounts
	 */ 
	 private static native int sampleCounts0(ByteBuffer ptr);/*
		  VkImageFormatProperties _obj = (VkImageFormatProperties)(ptr);
		  return (jint) (_obj.VkSampleCountFlags);
	 */

	/**
	 * native SET method for field maxResourceSize	[long]<br>
	 * Prototype: VkDeviceSize  maxResourceSize
	 */ 
	 private static native void maxResourceSize0(ByteBuffer ptr, long _maxResourceSize);/*
		  VkImageFormatProperties _obj = (VkImageFormatProperties)(*ptr);
		  _obj.maxResourceSize = (VkDeviceSize) (_maxResourceSize);
	  */

	/**
	 * native GET method for field maxResourceSize	[long]<br>
	 * Prototype: VkDeviceSize  maxResourceSize
	 */ 
	 private static native long maxResourceSize0(ByteBuffer ptr);/*
		  VkImageFormatProperties _obj = (VkImageFormatProperties)(ptr);
		  return (jlong) (_obj.VkDeviceSize);
	 */



} // end of class VkImageFormatProperties
