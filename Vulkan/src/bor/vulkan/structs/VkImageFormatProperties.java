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

import java.nio.Buffer;


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

    //@formatter:off
    /*JNI
    #include <BorVulkan.hpp>
    */  

	/** TAG of this structure [7]  */
	 private static final String TAG = "VkImageFormatProperties";

	/** ID of this structure [7]  */
	 public static final int TAG_ID = VKIMAGEFORMATPROPERTIES_ID;

	/** P wrapper for THIS object */
	 private  P<VkImageFormatProperties> p;

	 ///////////////////
	 // Struct fields //
	 ///////////////////
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
	 public VkImageFormatProperties(long address , int memSize){ 
		 super(address, memSize); 
	 }

	/**
	 * Ctor with Address only. Size guessed by #sizeof()
	 * @param address - native address 
	 */
	 public VkImageFormatProperties(long address){ 
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
	 public static P<VkImageFormatProperties> createNullPointer(){
	        P<VkImageFormatProperties> p = new  P<VkImageFormatProperties>(new VkImageFormatProperties());
	        return p;
	    }


	/** 
	 * Return this VkObject instance wrapped in pointer P<br>
	 *
	 *  P&lt;? extends VkObject &gt;
	 *
	 * @return  a P container wrapping this object.
	 */
	 public P<VkImageFormatProperties> getP() {
	       if(p == null ){
	           p = new P<VkImageFormatProperties> (this);
	       }
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
		 ByteBuffer buff = (maxExtent==null) ? null : maxExtent.getPointer();
		 setMaxExtent0(this.ptr, buff);
	 }

	/**
	 * Get method for field maxExtent	[vkstruct]<br>
	 * Prototype: VkExtent3D  maxExtent
	 */ 
	 public VkExtent3D maxExtent(){
		 long pointer = getMaxExtent0(super.ptr);
		 if(pointer == 0){
		    this.maxExtent = null;
		    return null;
		  } 

		 if(this.maxExtent == null){
		    this.maxExtent = new VkExtent3D(pointer);
		 }else{
		    this.maxExtent.setPointer(pointer);
		  }
		 return this.maxExtent;
	 }

	/**
	 * Set method for field maxMipLevels	[int]<br>
	 * Prototype: uint32_t  maxMipLevels
	 */ 
	 public void maxMipLevels(int maxMipLevels){
		 this.maxMipLevels = maxMipLevels;
		 setMaxMipLevels0(this.ptr,  maxMipLevels);
	 }

	/**
	 * Get method for field maxMipLevels	[int]<br>
	 * Prototype: uint32_t  maxMipLevels
	 */ 
	 public int maxMipLevels(){
		 int var = getMaxMipLevels0(super.ptr);
		 this.maxMipLevels = var;
		 return this.maxMipLevels;
	 }

	/**
	 * Set method for field maxArrayLayers	[int]<br>
	 * Prototype: uint32_t  maxArrayLayers
	 */ 
	 public void maxArrayLayers(int maxArrayLayers){
		 this.maxArrayLayers = maxArrayLayers;
		 setMaxArrayLayers0(this.ptr,  maxArrayLayers);
	 }

	/**
	 * Get method for field maxArrayLayers	[int]<br>
	 * Prototype: uint32_t  maxArrayLayers
	 */ 
	 public int maxArrayLayers(){
		 int var = getMaxArrayLayers0(super.ptr);
		 this.maxArrayLayers = var;
		 return this.maxArrayLayers;
	 }

	/**
	 * Set method for field sampleCounts	[int]<br>
	 * Prototype: VkSampleCountFlags  sampleCounts
	 */ 
	 public void sampleCounts(int sampleCounts){
		 this.sampleCounts = sampleCounts;
		 setSampleCounts0(this.ptr,  sampleCounts);
	 }

	/**
	 * Get method for field sampleCounts	[int]<br>
	 * Prototype: VkSampleCountFlags  sampleCounts
	 */ 
	 public int sampleCounts(){
		 int var = getSampleCounts0(super.ptr);
		 this.sampleCounts = var;
		 return this.sampleCounts;
	 }

	/**
	 * Set method for field maxResourceSize	[long]<br>
	 * Prototype: VkDeviceSize  maxResourceSize
	 */ 
	 public void maxResourceSize(long maxResourceSize){
		 this.maxResourceSize = maxResourceSize;
		 setMaxResourceSize0(this.ptr,  maxResourceSize);
	 }

	/**
	 * Get method for field maxResourceSize	[long]<br>
	 * Prototype: VkDeviceSize  maxResourceSize
	 */ 
	 public long maxResourceSize(){
		 long var = getMaxResourceSize0(super.ptr);
		 this.maxResourceSize = var;
		 return this.maxResourceSize;
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field maxExtent	[vkstruct]<br>
	 * Prototype: VkExtent3D  maxExtent
	 */ 
	 private static native void setMaxExtent0(Buffer ptr, java.nio.ByteBuffer  _maxExtent);/*
		  VkImageFormatProperties* vkObj = (VkImageFormatProperties*)(ptr);
		  vkObj->maxExtent = (VkExtent3D) (_maxExtent);
	  */

	/**
	 * native GET method for field maxExtent	[vkstruct]<br>
	 * Prototype: VkExtent3D  maxExtent
	 */ 
	 private static native long getMaxExtent0(Buffer ptr);/*
		  VkImageFormatProperties* vkObj = (VkImageFormatProperties*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->maxExtent);	 */

	/**
	 * native SET method for field maxMipLevels	[int]<br>
	 * Prototype: uint32_t  maxMipLevels
	 */ 
	 private static native void setMaxMipLevels0(Buffer ptr, int _maxMipLevels);/*
		  VkImageFormatProperties* vkObj = (VkImageFormatProperties*)(ptr);
		  vkObj->maxMipLevels = (uint32_t) (_maxMipLevels);
	  */

	/**
	 * native GET method for field maxMipLevels	[int]<br>
	 * Prototype: uint32_t  maxMipLevels
	 */ 
	 private static native int getMaxMipLevels0(Buffer ptr);/*
		  VkImageFormatProperties* vkObj = (VkImageFormatProperties*)(ptr);
		  return (jint) (vkObj->maxMipLevels);
	 */

	/**
	 * native SET method for field maxArrayLayers	[int]<br>
	 * Prototype: uint32_t  maxArrayLayers
	 */ 
	 private static native void setMaxArrayLayers0(Buffer ptr, int _maxArrayLayers);/*
		  VkImageFormatProperties* vkObj = (VkImageFormatProperties*)(ptr);
		  vkObj->maxArrayLayers = (uint32_t) (_maxArrayLayers);
	  */

	/**
	 * native GET method for field maxArrayLayers	[int]<br>
	 * Prototype: uint32_t  maxArrayLayers
	 */ 
	 private static native int getMaxArrayLayers0(Buffer ptr);/*
		  VkImageFormatProperties* vkObj = (VkImageFormatProperties*)(ptr);
		  return (jint) (vkObj->maxArrayLayers);
	 */

	/**
	 * native SET method for field sampleCounts	[int]<br>
	 * Prototype: VkSampleCountFlags  sampleCounts
	 */ 
	 private static native void setSampleCounts0(Buffer ptr, int _sampleCounts);/*
		  VkImageFormatProperties* vkObj = (VkImageFormatProperties*)(ptr);
		  vkObj->sampleCounts = (VkSampleCountFlags) (_sampleCounts);
	  */

	/**
	 * native GET method for field sampleCounts	[int]<br>
	 * Prototype: VkSampleCountFlags  sampleCounts
	 */ 
	 private static native int getSampleCounts0(Buffer ptr);/*
		  VkImageFormatProperties* vkObj = (VkImageFormatProperties*)(ptr);
		  return (jint) (vkObj->sampleCounts);
	 */

	/**
	 * native SET method for field maxResourceSize	[long]<br>
	 * Prototype: VkDeviceSize  maxResourceSize
	 */ 
	 private static native void setMaxResourceSize0(Buffer ptr, long _maxResourceSize);/*
		  VkImageFormatProperties* vkObj = (VkImageFormatProperties*)(ptr);
		  vkObj->maxResourceSize = (VkDeviceSize) (_maxResourceSize);
	  */

	/**
	 * native GET method for field maxResourceSize	[long]<br>
	 * Prototype: VkDeviceSize  maxResourceSize
	 */ 
	 private static native long getMaxResourceSize0(Buffer ptr);/*
		  VkImageFormatProperties* vkObj = (VkImageFormatProperties*)(ptr);
		  return (jlong) (vkObj->maxResourceSize);
	 */



} // end of class VkImageFormatProperties
