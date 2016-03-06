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
 *  Project Bor-Vulkan 
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
	/** TAG of this structure [11]  */
	 private static final String TAG = "VkQueueFamilyProperties";

	/** ID of this structure [11]  */
	 public static final int TAG_ID = VKQUEUEFAMILYPROPERTIES_ID;

	 // fields //
	/**
	 *  VkQueueFlags 	queueFlags	[int]
	 */ 
	int 	queueFlags;

	/**
	 *  uint32_t 	queueCount	[int]
	 */ 
	int 	queueCount;

	/**
	 *  uint32_t 	timestampValidBits	[int]
	 */ 
	int 	timestampValidBits;

	/**
	 *  VkExtent3D 	minImageTransferGranularity	[vkstruct]
	 */ 
	VkExtent3D 	minImageTransferGranularity;

	/**
	 * Ctor
	 */
	public VkQueueFamilyProperties(){ 
		 super(sizeOf()); 
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkQueueFamilyProperties(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address and memSize
	 * @param address - native address 
	 * @param memSize - buffer size 
	 */
	 public VkQueueFamilyProperties(long address, int memSize){ 
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
	 public static P<VkQueueFamilyProperties> createNullPointer(){
	        P<VkQueueFamilyProperties> p = new  P<VkQueueFamilyProperties>(new VkQueueFamilyProperties());
	        return p;
	    }

	 ////////////////////////
	 //  SETTERS & GETTERS //
	 ////////////////////////

	/**
	 * Set method for field queueFlags	[int]<br>
	 * Prototype: VkQueueFlags  queueFlags
	 */ 
	 public void queueFlags(int queueFlags){
		 this.queueFlags = queueFlags;
		queueFlags0(super.ptr, queueFlags);
	 }

	/**
	 * get method for field queueFlags	[int]<br>
	 * Prototype: VkQueueFlags  queueFlags
	 */ 
	 public int queueFlags(){
		 // return  this.queueFlags;
		 return queueFlags0(super.ptr);
	 }

	/**
	 * Set method for field queueCount	[int]<br>
	 * Prototype: uint32_t  queueCount
	 */ 
	 public void queueCount(int queueCount){
		 this.queueCount = queueCount;
		queueCount0(super.ptr, queueCount);
	 }

	/**
	 * get method for field queueCount	[int]<br>
	 * Prototype: uint32_t  queueCount
	 */ 
	 public int queueCount(){
		 // return  this.queueCount;
		 return queueCount0(super.ptr);
	 }

	/**
	 * Set method for field timestampValidBits	[int]<br>
	 * Prototype: uint32_t  timestampValidBits
	 */ 
	 public void timestampValidBits(int timestampValidBits){
		 this.timestampValidBits = timestampValidBits;
		timestampValidBits0(super.ptr, timestampValidBits);
	 }

	/**
	 * get method for field timestampValidBits	[int]<br>
	 * Prototype: uint32_t  timestampValidBits
	 */ 
	 public int timestampValidBits(){
		 // return  this.timestampValidBits;
		 return timestampValidBits0(super.ptr);
	 }

	/**
	 * Set method for field minImageTransferGranularity	[vkstruct]<br>
	 * Prototype: VkExtent3D  minImageTransferGranularity
	 */ 
	 public void minImageTransferGranularity(VkExtent3D minImageTransferGranularity){
		 this.minImageTransferGranularity = minImageTransferGranularity;
		minImageTransferGranularity0(super.ptr, minImageTransferGranularity);
	 }

	/**
	 * get method for field minImageTransferGranularity	[vkstruct]<br>
	 * Prototype: VkExtent3D  minImageTransferGranularity
	 */ 
	 public VkExtent3D minImageTransferGranularity(){
		 // return  this.minImageTransferGranularity;
		 return minImageTransferGranularity0(super.ptr);
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field queueFlags	[int]<br>
	 * Prototype: VkQueueFlags  queueFlags
	 */ 
	 private static native void queueFlags0(ByteBuffer ptr, int _queueFlags);/*
		  VkQueueFamilyProperties _obj = (VkQueueFamilyProperties)(*ptr);
		  _obj.queueFlags = (VkQueueFlags) (_queueFlags);
	  */

	/**
	 * native GET method for field queueFlags	[int]<br>
	 * Prototype: VkQueueFlags  queueFlags
	 */ 
	 private static native int queueFlags0(ByteBuffer ptr);/*
		  VkQueueFamilyProperties _obj = (VkQueueFamilyProperties)(ptr);
		  return (jint) (_obj.VkQueueFlags);
	 */

	/**
	 * native SET method for field queueCount	[int]<br>
	 * Prototype: uint32_t  queueCount
	 */ 
	 private static native void queueCount0(ByteBuffer ptr, int _queueCount);/*
		  VkQueueFamilyProperties _obj = (VkQueueFamilyProperties)(*ptr);
		  _obj.queueCount = (uint32_t) (_queueCount);
	  */

	/**
	 * native GET method for field queueCount	[int]<br>
	 * Prototype: uint32_t  queueCount
	 */ 
	 private static native int queueCount0(ByteBuffer ptr);/*
		  VkQueueFamilyProperties _obj = (VkQueueFamilyProperties)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native SET method for field timestampValidBits	[int]<br>
	 * Prototype: uint32_t  timestampValidBits
	 */ 
	 private static native void timestampValidBits0(ByteBuffer ptr, int _timestampValidBits);/*
		  VkQueueFamilyProperties _obj = (VkQueueFamilyProperties)(*ptr);
		  _obj.timestampValidBits = (uint32_t) (_timestampValidBits);
	  */

	/**
	 * native GET method for field timestampValidBits	[int]<br>
	 * Prototype: uint32_t  timestampValidBits
	 */ 
	 private static native int timestampValidBits0(ByteBuffer ptr);/*
		  VkQueueFamilyProperties _obj = (VkQueueFamilyProperties)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native SET method for field minImageTransferGranularity	[vkstruct]<br>
	 * Prototype: VkExtent3D  minImageTransferGranularity
	 */ 
	 private static native void minImageTransferGranularity0(ByteBuffer ptr, VkExtent3D _minImageTransferGranularity);/*
		  VkQueueFamilyProperties _obj = (VkQueueFamilyProperties)(*ptr);
		  _obj.minImageTransferGranularity = (VkExtent3D) (_minImageTransferGranularity);
	  */

	/**
	 * native GET method for field minImageTransferGranularity	[vkstruct]<br>
	 * Prototype: VkExtent3D  minImageTransferGranularity
	 */ 
	 private static native VkExtent3D minImageTransferGranularity0(ByteBuffer ptr);/*
		  VkQueueFamilyProperties _obj = (VkQueueFamilyProperties)(ptr);
		  return (VkExtent3D) (_obj.VkExtent3D);
	 */



} // end of class VkQueueFamilyProperties
