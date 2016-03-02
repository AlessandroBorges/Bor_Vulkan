/**
 * Class wrapping Vulkan's VkQueueFamilyProperties struct.
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
 *  This class is a Java front end for struct VkQueueFamilyProperties. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkQueueFamilyProperties {
 *     VkQueueFlags    queueFlags;
 *     uint32_t        queueCount;
 *     uint32_t        timestampValidBits;
 *     VkExtent3D      minImageTransferGranularity;
 * } VkQueueFamilyProperties;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.01 (beta) 
 */
public class VkQueueFamilyProperties extends VkStruct {
	/** TAG of this structure [135]  */
	 private static final String TAG = "VkQueueFamilyProperties";

	/** ID of this structure [135]  */
	 public static final int TAG_ID = VKQUEUEFAMILYPROPERTIES_ID;

	 // fields //
	/**
	 *  VkQueueFlags 	queueFlags		 */ 
	int 	queueFlags;

	/**
	 *  uint32_t 	queueCount		 */ 
	int 	queueCount;

	/**
	 *  uint32_t 	timestampValidBits		 */ 
	int 	timestampValidBits;

	/**
	 *  VkExtent3D 	minImageTransferGranularity	[vkstruct]	 */ 
	VkExtent3D 	minImageTransferGranularity;

	/**
	 * Ctor
	 */
	public VkQueueFamilyProperties(){ 
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
	 * Set method for field queueFlags	
	 * Prototype: VkQueueFlags  queueFlags
	 */ 
	 public void queueFlags(int queueFlags){
		 this.queueFlags = queueFlags;
		queueFlags0(super.ptr, queueFlags);
	 }

	/**
	 * get method for field queueFlags	
	 * Prototype: VkQueueFlags  queueFlags
	 */ 
	 public int queueFlags(){
		 // return  this.queueFlags;
		 return queueFlags0(super.ptr);
	 }

	/**
	 * Set method for field queueCount	
	 * Prototype: uint32_t  queueCount
	 */ 
	 public void queueCount(int queueCount){
		 this.queueCount = queueCount;
		queueCount0(super.ptr, queueCount);
	 }

	/**
	 * get method for field queueCount	
	 * Prototype: uint32_t  queueCount
	 */ 
	 public int queueCount(){
		 // return  this.queueCount;
		 return queueCount0(super.ptr);
	 }

	/**
	 * Set method for field timestampValidBits	
	 * Prototype: uint32_t  timestampValidBits
	 */ 
	 public void timestampValidBits(int timestampValidBits){
		 this.timestampValidBits = timestampValidBits;
		timestampValidBits0(super.ptr, timestampValidBits);
	 }

	/**
	 * get method for field timestampValidBits	
	 * Prototype: uint32_t  timestampValidBits
	 */ 
	 public int timestampValidBits(){
		 // return  this.timestampValidBits;
		 return timestampValidBits0(super.ptr);
	 }

	/**
	 * Set method for field minImageTransferGranularity	[vkstruct]
	 * Prototype: VkExtent3D  minImageTransferGranularity
	 */ 
	 public void minImageTransferGranularity(VkExtent3D minImageTransferGranularity){
		 this.minImageTransferGranularity = minImageTransferGranularity;
		minImageTransferGranularity0(super.ptr, minImageTransferGranularity);
	 }

	/**
	 * get method for field minImageTransferGranularity	[vkstruct]
	 * Prototype: VkExtent3D  minImageTransferGranularity
	 */ 
	 public VkExtent3D minImageTransferGranularity(){
		 // return  this.minImageTransferGranularity;
		 return minImageTransferGranularity0(super.ptr);
	 }


	 // ////////////////////////////////
	 // native SETTERS & GETTERS //
	 // ////////////////////////////////
	/**
	 * native Set method for field queueFlags	
	 * Prototype: VkQueueFlags  queueFlags
	 */ 
	 private static native void queueFlags0(ByteBuffer ptr, int _queueFlags);/*
		  VkQueueFamilyProperties _obj = (VkQueueFamilyProperties)(*ptr);
		  _obj.queueFlags = (VkQueueFlags) (_queueFlags);
	  */

	/**
	 * get method for field queueFlags	
	 * Prototype: VkQueueFlags  queueFlags
	 */ 
	 private static native int queueFlags0(ByteBuffer ptr);/*
		  VkQueueFamilyProperties _obj = (VkQueueFamilyProperties)(ptr);
		  return (jint) (_obj.VkQueueFlags);
	 */

	/**
	 * native Set method for field queueCount	
	 * Prototype: uint32_t  queueCount
	 */ 
	 private static native void queueCount0(ByteBuffer ptr, int _queueCount);/*
		  VkQueueFamilyProperties _obj = (VkQueueFamilyProperties)(*ptr);
		  _obj.queueCount = (uint32_t) (_queueCount);
	  */

	/**
	 * get method for field queueCount	
	 * Prototype: uint32_t  queueCount
	 */ 
	 private static native int queueCount0(ByteBuffer ptr);/*
		  VkQueueFamilyProperties _obj = (VkQueueFamilyProperties)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native Set method for field timestampValidBits	
	 * Prototype: uint32_t  timestampValidBits
	 */ 
	 private static native void timestampValidBits0(ByteBuffer ptr, int _timestampValidBits);/*
		  VkQueueFamilyProperties _obj = (VkQueueFamilyProperties)(*ptr);
		  _obj.timestampValidBits = (uint32_t) (_timestampValidBits);
	  */

	/**
	 * get method for field timestampValidBits	
	 * Prototype: uint32_t  timestampValidBits
	 */ 
	 private static native int timestampValidBits0(ByteBuffer ptr);/*
		  VkQueueFamilyProperties _obj = (VkQueueFamilyProperties)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native Set method for field minImageTransferGranularity	[vkstruct]
	 * Prototype: VkExtent3D  minImageTransferGranularity
	 */ 
	 private static native void minImageTransferGranularity0(ByteBuffer ptr, VkExtent3D _minImageTransferGranularity);/*
		  VkQueueFamilyProperties _obj = (VkQueueFamilyProperties)(*ptr);
		  _obj.minImageTransferGranularity = (VkExtent3D) (_minImageTransferGranularity);
	  */

	/**
	 * get method for field minImageTransferGranularity	[vkstruct]
	 * Prototype: VkExtent3D  minImageTransferGranularity
	 */ 
	 private static native VkExtent3D minImageTransferGranularity0(ByteBuffer ptr);/*
		  VkQueueFamilyProperties _obj = (VkQueueFamilyProperties)(ptr);
		  return (VkExtent3D) (_obj.VkExtent3D);
	 */



} // end of class VkQueueFamilyProperties
