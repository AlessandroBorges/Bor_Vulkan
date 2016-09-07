/**
 * Class wrapping Vulkan's VkImageFormatProperties struct.
 * 
 * Bor_Vulkan Project Ver. 0.8.65 (beta)
 * Licence terms: 
 * The MIT License (MIT)
 * Copyright (c) 2016 Alessandro Borges
 * See https://opensource.org/licenses/MIT 
 */
 package bor.vulkan.structs;

 import bor.util.*;
 import bor.vulkan.*;
 import static bor.vulkan.Vulkan.*; 
 import bor.vulkan.enumerations.*;

 import java.util.*;
 import java.nio.*;


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
 * @version Ver. 0.8.65 (beta) 
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
		 super(TAG_ID);
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkImageFormatProperties(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
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
	 * Get ID of this structure 
	 */
	 public static int getID(){ 
		 return TAG_ID; 
	}

	/** 
	 * Static method to create a VkArray for this VkStruct subclass.
	 * @param size - number of elements
	 */
	 public static VkArray<VkImageFormatProperties> createVkArray(int size){ 
		 VkImageFormatProperties[] array = new VkImageFormatProperties[size]; 
		 VkArrayStruct<VkImageFormatProperties> vkArray = new VkArrayStruct<VkImageFormatProperties>(array, TAG_ID);
		 return vkArray; 
	 } 


	 ////////////////////////
	 //  SETTERS & GETTERS //
	 ////////////////////////

	/**
	 * Set method for field maxExtent	[vkstruct]<br>
	 * Prototype: VkExtent3D  maxExtent
	 * 
	 * @param maxExtent - a instance of VkExtent3D.
	 * @return this VkStruct instance.
	 */ 
	 public VkImageFormatProperties maxExtent(VkExtent3D maxExtent){
		 this.maxExtent = maxExtent;
		 ByteBuffer buff = (maxExtent==null) ? null : maxExtent.getPointer();
		 setMaxExtent0(this.ptr, buff);
		 return this;
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
	 * 
	 * @param maxMipLevels - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkImageFormatProperties maxMipLevels(int maxMipLevels){
		 this.maxMipLevels = maxMipLevels;
		 setMaxMipLevels0(this.ptr,  maxMipLevels);
		 return this;
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
	 * 
	 * @param maxArrayLayers - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkImageFormatProperties maxArrayLayers(int maxArrayLayers){
		 this.maxArrayLayers = maxArrayLayers;
		 setMaxArrayLayers0(this.ptr,  maxArrayLayers);
		 return this;
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
	 * 
	 * @param sampleCounts - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkImageFormatProperties sampleCounts(int sampleCounts){
		 this.sampleCounts = sampleCounts;
		 setSampleCounts0(this.ptr,  sampleCounts);
		 return this;
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
	 * 
	 * @param maxResourceSize - a instance of long.
	 * @return this VkStruct instance.
	 */ 
	 public VkImageFormatProperties maxResourceSize(long maxResourceSize){
		 this.maxResourceSize = maxResourceSize;
		 setMaxResourceSize0(this.ptr,  maxResourceSize);
		 return this;
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


   /* (non-Javadoc)
    * @see java.lang.Object#toString()
    */
    @Override
    public String toString() {
         StringBuilder builder = new StringBuilder();
         builder.append("VkImageFormatProperties [ ")
				.append("maxExtent: ").append(maxExtent() )
				.append(",\n maxMipLevels: ")
				.append(maxMipLevels() )
				.append(",\n maxArrayLayers: ")
				.append(maxArrayLayers() )
				.append(",\n sampleCounts: ")
				.append(sampleCounts() )
				.append(",\n maxResourceSize: ")
				.append(maxResourceSize() )
				.append("]");
		 return builder.toString();
    }


	 //////////////////////////////////
	 // Native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * Native SET method for field maxExtent	[vkstruct]<br>
	 * Prototype: VkExtent3D  maxExtent
	 */ 
	 private static native void setMaxExtent0(Buffer ptr, java.nio.ByteBuffer  _maxExtent);/*
		  VkImageFormatProperties* vkObj = (VkImageFormatProperties*)(ptr);
		 // code for Buffer - ptr to struct 
		 VkExtent3D* p_maxExtent = (VkExtent3D*) _maxExtent; 
		 vkObj->maxExtent = (*p_maxExtent); 
	  */

	/**
	 * Native GET method for field maxExtent	[vkstruct]<br>
	 * Prototype: VkExtent3D  maxExtent
	 */ 
	 private static native long getMaxExtent0(Buffer ptr);/*
		  VkImageFormatProperties* vkObj = (VkImageFormatProperties*)(ptr);
		  // generic get for Buffer - field must be pointer! 
		  return (jlong) reinterpret_cast<jlong>(vkObj->maxExtent);
	 */

	/**
	 * Native SET method for field maxMipLevels	[int]<br>
	 * Prototype: uint32_t  maxMipLevels
	 */ 
	 private static native void setMaxMipLevels0(Buffer ptr, int _maxMipLevels);/*
		  VkImageFormatProperties* vkObj = (VkImageFormatProperties*)(ptr);
		 // code for simple past value 
		  vkObj->maxMipLevels = (uint32_t) (_maxMipLevels);
	  */

	/**
	 * Native GET method for field maxMipLevels	[int]<br>
	 * Prototype: uint32_t  maxMipLevels
	 */ 
	 private static native int getMaxMipLevels0(Buffer ptr);/*
		  VkImageFormatProperties* vkObj = (VkImageFormatProperties*)(ptr);
		  return (jint) (vkObj->maxMipLevels);
	 */

	/**
	 * Native SET method for field maxArrayLayers	[int]<br>
	 * Prototype: uint32_t  maxArrayLayers
	 */ 
	 private static native void setMaxArrayLayers0(Buffer ptr, int _maxArrayLayers);/*
		  VkImageFormatProperties* vkObj = (VkImageFormatProperties*)(ptr);
		 // code for simple past value 
		  vkObj->maxArrayLayers = (uint32_t) (_maxArrayLayers);
	  */

	/**
	 * Native GET method for field maxArrayLayers	[int]<br>
	 * Prototype: uint32_t  maxArrayLayers
	 */ 
	 private static native int getMaxArrayLayers0(Buffer ptr);/*
		  VkImageFormatProperties* vkObj = (VkImageFormatProperties*)(ptr);
		  return (jint) (vkObj->maxArrayLayers);
	 */

	/**
	 * Native SET method for field sampleCounts	[int]<br>
	 * Prototype: VkSampleCountFlags  sampleCounts
	 */ 
	 private static native void setSampleCounts0(Buffer ptr, int _sampleCounts);/*
		  VkImageFormatProperties* vkObj = (VkImageFormatProperties*)(ptr);
		 // code for simple past value 
		  vkObj->sampleCounts = (VkSampleCountFlags) (_sampleCounts);
	  */

	/**
	 * Native GET method for field sampleCounts	[int]<br>
	 * Prototype: VkSampleCountFlags  sampleCounts
	 */ 
	 private static native int getSampleCounts0(Buffer ptr);/*
		  VkImageFormatProperties* vkObj = (VkImageFormatProperties*)(ptr);
		  return (jint) (vkObj->sampleCounts);
	 */

	/**
	 * Native SET method for field maxResourceSize	[long]<br>
	 * Prototype: VkDeviceSize  maxResourceSize
	 */ 
	 private static native void setMaxResourceSize0(Buffer ptr, long _maxResourceSize);/*
		  VkImageFormatProperties* vkObj = (VkImageFormatProperties*)(ptr);
		 // code for simple past value 
		  vkObj->maxResourceSize = (VkDeviceSize) (_maxResourceSize);
	  */

	/**
	 * Native GET method for field maxResourceSize	[long]<br>
	 * Prototype: VkDeviceSize  maxResourceSize
	 */ 
	 private static native long getMaxResourceSize0(Buffer ptr);/*
		  VkImageFormatProperties* vkObj = (VkImageFormatProperties*)(ptr);
		  return (jlong) (vkObj->maxResourceSize);
	 */



} // end of class VkImageFormatProperties
