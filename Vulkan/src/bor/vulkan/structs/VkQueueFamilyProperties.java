/**
 * Class wrapping Vulkan's VkQueueFamilyProperties struct.
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
 * @version Ver. 0.8.65 (beta) 
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
		 super(TAG_ID);
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkQueueFamilyProperties(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
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
	 * Get ID of this structure 
	 */
	 public static int getID(){ 
		 return TAG_ID; 
	}

	 ////////////////////////
	 //  SETTERS & GETTERS //
	 ////////////////////////

	/**
	 * Set method for field queueFlags	[int]<br>
	 * Prototype: VkQueueFlags  queueFlags
	 * 
	 * @param queueFlags - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkQueueFamilyProperties queueFlags(int queueFlags){
		 this.queueFlags = queueFlags;
		 setQueueFlags0(this.ptr,  queueFlags);
		 return this;
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
	 * 
	 * @param queueCount - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkQueueFamilyProperties queueCount(int queueCount){
		 this.queueCount = queueCount;
		 setQueueCount0(this.ptr,  queueCount);
		 return this;
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
	 * 
	 * @param timestampValidBits - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkQueueFamilyProperties timestampValidBits(int timestampValidBits){
		 this.timestampValidBits = timestampValidBits;
		 setTimestampValidBits0(this.ptr,  timestampValidBits);
		 return this;
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
	 * 
	 * @param minImageTransferGranularity - a instance of VkExtent3D.
	 * @return this VkStruct instance.
	 */ 
	 public VkQueueFamilyProperties minImageTransferGranularity(VkExtent3D minImageTransferGranularity){
		 this.minImageTransferGranularity = minImageTransferGranularity;
		 ByteBuffer buff = (minImageTransferGranularity==null) ? null : minImageTransferGranularity.getPointer();
		 setMinImageTransferGranularity0(this.ptr, buff);
		 return this;
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


   /* (non-Javadoc)
    * @see java.lang.Object#toString()
    */
    @Override
    public String toString() {
         StringBuilder builder = new StringBuilder();
         builder.append("VkQueueFamilyProperties [ ")
				.append("queueFlags: ").append(queueFlags() )
				.append(",\n queueCount: ")
				.append(queueCount() )
				.append(",\n timestampValidBits: ")
				.append(timestampValidBits() )
				.append(",\n minImageTransferGranularity: ")
				.append(minImageTransferGranularity() )
				.append("]");
		 return builder.toString();
    }


	 //////////////////////////////////
	 // Native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * Native SET method for field queueFlags	[int]<br>
	 * Prototype: VkQueueFlags  queueFlags
	 */ 
	 private static native void setQueueFlags0(Buffer ptr, int _queueFlags);/*
		  VkQueueFamilyProperties* vkObj = (VkQueueFamilyProperties*)(ptr);
		 // code for simple past value 
		  vkObj->queueFlags = (VkQueueFlags) (_queueFlags);
	  */

	/**
	 * Native GET method for field queueFlags	[int]<br>
	 * Prototype: VkQueueFlags  queueFlags
	 */ 
	 private static native int getQueueFlags0(Buffer ptr);/*
		  VkQueueFamilyProperties* vkObj = (VkQueueFamilyProperties*)(ptr);
		  return (jint) (vkObj->queueFlags);
	 */

	/**
	 * Native SET method for field queueCount	[int]<br>
	 * Prototype: uint32_t  queueCount
	 */ 
	 private static native void setQueueCount0(Buffer ptr, int _queueCount);/*
		  VkQueueFamilyProperties* vkObj = (VkQueueFamilyProperties*)(ptr);
		 // code for simple past value 
		  vkObj->queueCount = (uint32_t) (_queueCount);
	  */

	/**
	 * Native GET method for field queueCount	[int]<br>
	 * Prototype: uint32_t  queueCount
	 */ 
	 private static native int getQueueCount0(Buffer ptr);/*
		  VkQueueFamilyProperties* vkObj = (VkQueueFamilyProperties*)(ptr);
		  return (jint) (vkObj->queueCount);
	 */

	/**
	 * Native SET method for field timestampValidBits	[int]<br>
	 * Prototype: uint32_t  timestampValidBits
	 */ 
	 private static native void setTimestampValidBits0(Buffer ptr, int _timestampValidBits);/*
		  VkQueueFamilyProperties* vkObj = (VkQueueFamilyProperties*)(ptr);
		 // code for simple past value 
		  vkObj->timestampValidBits = (uint32_t) (_timestampValidBits);
	  */

	/**
	 * Native GET method for field timestampValidBits	[int]<br>
	 * Prototype: uint32_t  timestampValidBits
	 */ 
	 private static native int getTimestampValidBits0(Buffer ptr);/*
		  VkQueueFamilyProperties* vkObj = (VkQueueFamilyProperties*)(ptr);
		  return (jint) (vkObj->timestampValidBits);
	 */

	/**
	 * Native SET method for field minImageTransferGranularity	[vkstruct]<br>
	 * Prototype: VkExtent3D  minImageTransferGranularity
	 */ 
	 private static native void setMinImageTransferGranularity0(Buffer ptr, java.nio.ByteBuffer  _minImageTransferGranularity);/*
		  VkQueueFamilyProperties* vkObj = (VkQueueFamilyProperties*)(ptr);
		 // code for Buffer - ptr to struct 
		 VkExtent3D* p_minImageTransferGranularity = (VkExtent3D*) _minImageTransferGranularity; 
		 vkObj->minImageTransferGranularity = (*p_minImageTransferGranularity); 
	  */

	/**
	 * Native GET method for field minImageTransferGranularity	[vkstruct]<br>
	 * Prototype: VkExtent3D  minImageTransferGranularity
	 */ 
	 private static native long getMinImageTransferGranularity0(Buffer ptr);/*
		  VkQueueFamilyProperties* vkObj = (VkQueueFamilyProperties*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->minImageTransferGranularity);
	 */



} // end of class VkQueueFamilyProperties
