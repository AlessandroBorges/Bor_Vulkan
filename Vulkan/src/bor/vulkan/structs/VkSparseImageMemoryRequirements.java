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

import java.nio.Buffer;


/**
 *  Project Bor-Vulkan 
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

    //@formatter:off
    /*JNI
    #include <BorVulkan.hpp>
    */  

	/** TAG of this structure [24]  */
	 private static final String TAG = "VkSparseImageMemoryRequirements";

	/** ID of this structure [24]  */
	 public static final int TAG_ID = VKSPARSEIMAGEMEMORYREQUIREMENTS_ID;

	/** P wrapper for THIS object */
	 private  P<VkSparseImageMemoryRequirements> p;

	 ///////////////////
	 // Struct fields //
	 ///////////////////
	/**
	 *  VkSparseImageFormatProperties 	formatProperties	[vkstruct]
	 */ 
	 VkSparseImageFormatProperties 	formatProperties;

	/**
	 *  uint32_t 	imageMipTailFirstLod	[int]
	 */ 
	 int 	imageMipTailFirstLod;

	/**
	 *  VkDeviceSize 	imageMipTailSize	[long]
	 */ 
	 long 	imageMipTailSize;

	/**
	 *  VkDeviceSize 	imageMipTailOffset	[long]
	 */ 
	 long 	imageMipTailOffset;

	/**
	 *  VkDeviceSize 	imageMipTailStride	[long]
	 */ 
	 long 	imageMipTailStride;

	/**
	 * Ctor
	 */
	public VkSparseImageMemoryRequirements(){ 
		 super(TAG_ID);
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkSparseImageMemoryRequirements(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address and memSize
	 * @param address - native address 
	 * @param memSize - buffer size 
	 */
	 public VkSparseImageMemoryRequirements(long address , int memSize){ 
		 super(address, memSize); 
	 }

	/**
	 * Ctor with Address only. Size guessed by #sizeof()
	 * @param address - native address 
	 */
	 public VkSparseImageMemoryRequirements(long address){ 
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
	 public static P<VkSparseImageMemoryRequirements> createNullPointer(){
	        P<VkSparseImageMemoryRequirements> p = new  P<VkSparseImageMemoryRequirements>(new VkSparseImageMemoryRequirements());
	        return p;
	    }


	/** 
	 * Return this VkObject instance wrapped in pointer P<br>
	 *
	 *  P&lt;? extends VkObject &gt;
	 *
	 * @return  a P container wrapping this object.
	 */
	 public P<VkSparseImageMemoryRequirements> getP() {
	       if(p == null ){
	           p = new P<VkSparseImageMemoryRequirements> (this);
	       }
	        return p;
	    }


	 ////////////////////////
	 //  SETTERS & GETTERS //
	 ////////////////////////

	/**
	 * Set method for field formatProperties	[vkstruct]<br>
	 * Prototype: VkSparseImageFormatProperties  formatProperties
	 */ 
	 public void formatProperties(VkSparseImageFormatProperties formatProperties){
		 this.formatProperties = formatProperties;
		 ByteBuffer buff = (formatProperties==null) ? null : formatProperties.getPointer();
		 setFormatProperties0(this.ptr, buff);
	 }

	/**
	 * Get method for field formatProperties	[vkstruct]<br>
	 * Prototype: VkSparseImageFormatProperties  formatProperties
	 */ 
	 public VkSparseImageFormatProperties formatProperties(){
		 long pointer = getFormatProperties0(super.ptr);
		 if(pointer == 0){
		    this.formatProperties = null;
		    return null;
		  } 

		 if(this.formatProperties == null){
		    this.formatProperties = new VkSparseImageFormatProperties(pointer);
		 }else{
		    this.formatProperties.setPointer(pointer);
		  }
		 return this.formatProperties;
	 }

	/**
	 * Set method for field imageMipTailFirstLod	[int]<br>
	 * Prototype: uint32_t  imageMipTailFirstLod
	 */ 
	 public void imageMipTailFirstLod(int imageMipTailFirstLod){
		 this.imageMipTailFirstLod = imageMipTailFirstLod;
		 setImageMipTailFirstLod0(this.ptr,  imageMipTailFirstLod);
	 }

	/**
	 * Get method for field imageMipTailFirstLod	[int]<br>
	 * Prototype: uint32_t  imageMipTailFirstLod
	 */ 
	 public int imageMipTailFirstLod(){
		 int var = getImageMipTailFirstLod0(super.ptr);
		 this.imageMipTailFirstLod = var;
		 return this.imageMipTailFirstLod;
	 }

	/**
	 * Set method for field imageMipTailSize	[long]<br>
	 * Prototype: VkDeviceSize  imageMipTailSize
	 */ 
	 public void imageMipTailSize(long imageMipTailSize){
		 this.imageMipTailSize = imageMipTailSize;
		 setImageMipTailSize0(this.ptr,  imageMipTailSize);
	 }

	/**
	 * Get method for field imageMipTailSize	[long]<br>
	 * Prototype: VkDeviceSize  imageMipTailSize
	 */ 
	 public long imageMipTailSize(){
		 long var = getImageMipTailSize0(super.ptr);
		 this.imageMipTailSize = var;
		 return this.imageMipTailSize;
	 }

	/**
	 * Set method for field imageMipTailOffset	[long]<br>
	 * Prototype: VkDeviceSize  imageMipTailOffset
	 */ 
	 public void imageMipTailOffset(long imageMipTailOffset){
		 this.imageMipTailOffset = imageMipTailOffset;
		 setImageMipTailOffset0(this.ptr,  imageMipTailOffset);
	 }

	/**
	 * Get method for field imageMipTailOffset	[long]<br>
	 * Prototype: VkDeviceSize  imageMipTailOffset
	 */ 
	 public long imageMipTailOffset(){
		 long var = getImageMipTailOffset0(super.ptr);
		 this.imageMipTailOffset = var;
		 return this.imageMipTailOffset;
	 }

	/**
	 * Set method for field imageMipTailStride	[long]<br>
	 * Prototype: VkDeviceSize  imageMipTailStride
	 */ 
	 public void imageMipTailStride(long imageMipTailStride){
		 this.imageMipTailStride = imageMipTailStride;
		 setImageMipTailStride0(this.ptr,  imageMipTailStride);
	 }

	/**
	 * Get method for field imageMipTailStride	[long]<br>
	 * Prototype: VkDeviceSize  imageMipTailStride
	 */ 
	 public long imageMipTailStride(){
		 long var = getImageMipTailStride0(super.ptr);
		 this.imageMipTailStride = var;
		 return this.imageMipTailStride;
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field formatProperties	[vkstruct]<br>
	 * Prototype: VkSparseImageFormatProperties  formatProperties
	 */ 
	 private static native void setFormatProperties0(Buffer ptr, java.nio.ByteBuffer  _formatProperties);/*
		  VkSparseImageMemoryRequirements* vkObj = (VkSparseImageMemoryRequirements*)(ptr);
		  vkObj->formatProperties = (VkSparseImageFormatProperties) (_formatProperties);
	  */

	/**
	 * native GET method for field formatProperties	[vkstruct]<br>
	 * Prototype: VkSparseImageFormatProperties  formatProperties
	 */ 
	 private static native long getFormatProperties0(Buffer ptr);/*
		  VkSparseImageMemoryRequirements* vkObj = (VkSparseImageMemoryRequirements*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->formatProperties);	 */

	/**
	 * native SET method for field imageMipTailFirstLod	[int]<br>
	 * Prototype: uint32_t  imageMipTailFirstLod
	 */ 
	 private static native void setImageMipTailFirstLod0(Buffer ptr, int _imageMipTailFirstLod);/*
		  VkSparseImageMemoryRequirements* vkObj = (VkSparseImageMemoryRequirements*)(ptr);
		  vkObj->imageMipTailFirstLod = (uint32_t) (_imageMipTailFirstLod);
	  */

	/**
	 * native GET method for field imageMipTailFirstLod	[int]<br>
	 * Prototype: uint32_t  imageMipTailFirstLod
	 */ 
	 private static native int getImageMipTailFirstLod0(Buffer ptr);/*
		  VkSparseImageMemoryRequirements* vkObj = (VkSparseImageMemoryRequirements*)(ptr);
		  return (jint) (vkObj->imageMipTailFirstLod);
	 */

	/**
	 * native SET method for field imageMipTailSize	[long]<br>
	 * Prototype: VkDeviceSize  imageMipTailSize
	 */ 
	 private static native void setImageMipTailSize0(Buffer ptr, long _imageMipTailSize);/*
		  VkSparseImageMemoryRequirements* vkObj = (VkSparseImageMemoryRequirements*)(ptr);
		  vkObj->imageMipTailSize = (VkDeviceSize) (_imageMipTailSize);
	  */

	/**
	 * native GET method for field imageMipTailSize	[long]<br>
	 * Prototype: VkDeviceSize  imageMipTailSize
	 */ 
	 private static native long getImageMipTailSize0(Buffer ptr);/*
		  VkSparseImageMemoryRequirements* vkObj = (VkSparseImageMemoryRequirements*)(ptr);
		  return (jlong) (vkObj->imageMipTailSize);
	 */

	/**
	 * native SET method for field imageMipTailOffset	[long]<br>
	 * Prototype: VkDeviceSize  imageMipTailOffset
	 */ 
	 private static native void setImageMipTailOffset0(Buffer ptr, long _imageMipTailOffset);/*
		  VkSparseImageMemoryRequirements* vkObj = (VkSparseImageMemoryRequirements*)(ptr);
		  vkObj->imageMipTailOffset = (VkDeviceSize) (_imageMipTailOffset);
	  */

	/**
	 * native GET method for field imageMipTailOffset	[long]<br>
	 * Prototype: VkDeviceSize  imageMipTailOffset
	 */ 
	 private static native long getImageMipTailOffset0(Buffer ptr);/*
		  VkSparseImageMemoryRequirements* vkObj = (VkSparseImageMemoryRequirements*)(ptr);
		  return (jlong) (vkObj->imageMipTailOffset);
	 */

	/**
	 * native SET method for field imageMipTailStride	[long]<br>
	 * Prototype: VkDeviceSize  imageMipTailStride
	 */ 
	 private static native void setImageMipTailStride0(Buffer ptr, long _imageMipTailStride);/*
		  VkSparseImageMemoryRequirements* vkObj = (VkSparseImageMemoryRequirements*)(ptr);
		  vkObj->imageMipTailStride = (VkDeviceSize) (_imageMipTailStride);
	  */

	/**
	 * native GET method for field imageMipTailStride	[long]<br>
	 * Prototype: VkDeviceSize  imageMipTailStride
	 */ 
	 private static native long getImageMipTailStride0(Buffer ptr);/*
		  VkSparseImageMemoryRequirements* vkObj = (VkSparseImageMemoryRequirements*)(ptr);
		  return (jlong) (vkObj->imageMipTailStride);
	 */



} // end of class VkSparseImageMemoryRequirements
