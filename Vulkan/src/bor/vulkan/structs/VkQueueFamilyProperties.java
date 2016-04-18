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

import java.nio.Buffer;


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

    //@formatter:off
    /*JNI
    #include <BorVulkan.hpp>
    */  

	/** TAG of this structure [11]  */
	 private static final String TAG = "VkQueueFamilyProperties";

	/** ID of this structure [11]  */
	 public static final int TAG_ID = VKQUEUEFAMILYPROPERTIES_ID;

	/** P wrapper for THIS object */
	 private  P<VkQueueFamilyProperties> p;

	 ///////////////////
	 // Struct fields //
	 ///////////////////
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
	 public VkQueueFamilyProperties(long address , int memSize){ 
		 super(address, memSize); 
	 }

	/**
	 * Ctor with Address only. Size guessed by #sizeof()
	 * @param address - native address 
	 */
	 public VkQueueFamilyProperties(long address){ 
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


	/** 
	 * Return this VkObject instance wrapped in pointer P<br>
	 *
	 *  P&lt;? extends VkObject &gt;
	 *
	 * @return  a P container wrapping this object.
	 */
	 public P<VkQueueFamilyProperties> getP() {
	       if(p == null ){
	           p = new P<VkQueueFamilyProperties> (this);
	       }
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
		 setQueueFlags0(this.ptr,  queueFlags);
	 }

	/**
	 * Get method for field queueFlags	[int]<br>
	 * Prototype: VkQueueFlags  queueFlags
	 */ 
	 public int queueFlags(){
		 int var = getQueueFlags0(super.ptr);
		 this.queueFlags = var;
		 return this.queueFlags;
	 }

	/**
	 * Set method for field queueCount	[int]<br>
	 * Prototype: uint32_t  queueCount
	 */ 
	 public void queueCount(int queueCount){
		 this.queueCount = queueCount;
		 setQueueCount0(this.ptr,  queueCount);
	 }

	/**
	 * Get method for field queueCount	[int]<br>
	 * Prototype: uint32_t  queueCount
	 */ 
	 public int queueCount(){
		 int var = getQueueCount0(super.ptr);
		 this.queueCount = var;
		 return this.queueCount;
	 }

	/**
	 * Set method for field timestampValidBits	[int]<br>
	 * Prototype: uint32_t  timestampValidBits
	 */ 
	 public void timestampValidBits(int timestampValidBits){
		 this.timestampValidBits = timestampValidBits;
		 setTimestampValidBits0(this.ptr,  timestampValidBits);
	 }

	/**
	 * Get method for field timestampValidBits	[int]<br>
	 * Prototype: uint32_t  timestampValidBits
	 */ 
	 public int timestampValidBits(){
		 int var = getTimestampValidBits0(super.ptr);
		 this.timestampValidBits = var;
		 return this.timestampValidBits;
	 }

	/**
	 * Set method for field minImageTransferGranularity	[vkstruct]<br>
	 * Prototype: VkExtent3D  minImageTransferGranularity
	 */ 
	 public void minImageTransferGranularity(VkExtent3D minImageTransferGranularity){
		 this.minImageTransferGranularity = minImageTransferGranularity;
		 ByteBuffer buff = (minImageTransferGranularity==null) ? null : minImageTransferGranularity.getPointer();
		 setMinImageTransferGranularity0(this.ptr, buff);
	 }

	/**
	 * Get method for field minImageTransferGranularity	[vkstruct]<br>
	 * Prototype: VkExtent3D  minImageTransferGranularity
	 */ 
	 public VkExtent3D minImageTransferGranularity(){
		 long pointer = getMinImageTransferGranularity0(super.ptr);
		 if(pointer == 0){
		    this.minImageTransferGranularity = null;
		    return null;
		  } 

		 if(this.minImageTransferGranularity == null){
		    this.minImageTransferGranularity = new VkExtent3D(pointer);
		 }else{
		    this.minImageTransferGranularity.setPointer(pointer);
		  }
		 return this.minImageTransferGranularity;
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field queueFlags	[int]<br>
	 * Prototype: VkQueueFlags  queueFlags
	 */ 
	 private static native void setQueueFlags0(Buffer ptr, int _queueFlags);/*
		  VkQueueFamilyProperties* vkObj = (VkQueueFamilyProperties*)(ptr);
		  vkObj->queueFlags = (VkQueueFlags) (_queueFlags);
	  */

	/**
	 * native GET method for field queueFlags	[int]<br>
	 * Prototype: VkQueueFlags  queueFlags
	 */ 
	 private static native int getQueueFlags0(Buffer ptr);/*
		  VkQueueFamilyProperties* vkObj = (VkQueueFamilyProperties*)(ptr);
		  return (jint) (vkObj->queueFlags);
	 */

	/**
	 * native SET method for field queueCount	[int]<br>
	 * Prototype: uint32_t  queueCount
	 */ 
	 private static native void setQueueCount0(Buffer ptr, int _queueCount);/*
		  VkQueueFamilyProperties* vkObj = (VkQueueFamilyProperties*)(ptr);
		  vkObj->queueCount = (uint32_t) (_queueCount);
	  */

	/**
	 * native GET method for field queueCount	[int]<br>
	 * Prototype: uint32_t  queueCount
	 */ 
	 private static native int getQueueCount0(Buffer ptr);/*
		  VkQueueFamilyProperties* vkObj = (VkQueueFamilyProperties*)(ptr);
		  return (jint) (vkObj->queueCount);
	 */

	/**
	 * native SET method for field timestampValidBits	[int]<br>
	 * Prototype: uint32_t  timestampValidBits
	 */ 
	 private static native void setTimestampValidBits0(Buffer ptr, int _timestampValidBits);/*
		  VkQueueFamilyProperties* vkObj = (VkQueueFamilyProperties*)(ptr);
		  vkObj->timestampValidBits = (uint32_t) (_timestampValidBits);
	  */

	/**
	 * native GET method for field timestampValidBits	[int]<br>
	 * Prototype: uint32_t  timestampValidBits
	 */ 
	 private static native int getTimestampValidBits0(Buffer ptr);/*
		  VkQueueFamilyProperties* vkObj = (VkQueueFamilyProperties*)(ptr);
		  return (jint) (vkObj->timestampValidBits);
	 */

	/**
	 * native SET method for field minImageTransferGranularity	[vkstruct]<br>
	 * Prototype: VkExtent3D  minImageTransferGranularity
	 */ 
	 private static native void setMinImageTransferGranularity0(Buffer ptr, java.nio.ByteBuffer  _minImageTransferGranularity);/*
		  VkQueueFamilyProperties* vkObj = (VkQueueFamilyProperties*)(ptr);
		  vkObj->minImageTransferGranularity = (VkExtent3D) (_minImageTransferGranularity);
	  */

	/**
	 * native GET method for field minImageTransferGranularity	[vkstruct]<br>
	 * Prototype: VkExtent3D  minImageTransferGranularity
	 */ 
	 private static native long getMinImageTransferGranularity0(Buffer ptr);/*
		  VkQueueFamilyProperties* vkObj = (VkQueueFamilyProperties*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->minImageTransferGranularity);	 */



} // end of class VkQueueFamilyProperties
