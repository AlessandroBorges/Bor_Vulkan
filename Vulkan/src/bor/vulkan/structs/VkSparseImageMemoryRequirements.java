/**
 * Class wrapping Vulkan's VkSparseImageMemoryRequirements struct.
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
 * @version Ver. 0.8.65 (beta) 
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
	 * Get ID of this structure 
	 */
	 public static int getID(){ 
		 return TAG_ID; 
	}

	 ////////////////////////
	 //  SETTERS & GETTERS //
	 ////////////////////////

	/**
	 * Set method for field formatProperties	[vkstruct]<br>
	 * Prototype: VkSparseImageFormatProperties  formatProperties
	 * 
	 * @param formatProperties - a instance of VkSparseImageFormatProperties.
	 * @return this VkStruct instance.
	 */ 
	 public VkSparseImageMemoryRequirements formatProperties(VkSparseImageFormatProperties formatProperties){
		 this.formatProperties = formatProperties;
		 ByteBuffer buff = (formatProperties==null) ? null : formatProperties.getPointer();
		 setFormatProperties0(this.ptr, buff);
		 return this;
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
	 * 
	 * @param imageMipTailFirstLod - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkSparseImageMemoryRequirements imageMipTailFirstLod(int imageMipTailFirstLod){
		 this.imageMipTailFirstLod = imageMipTailFirstLod;
		 setImageMipTailFirstLod0(this.ptr,  imageMipTailFirstLod);
		 return this;
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
	 * 
	 * @param imageMipTailSize - a instance of long.
	 * @return this VkStruct instance.
	 */ 
	 public VkSparseImageMemoryRequirements imageMipTailSize(long imageMipTailSize){
		 this.imageMipTailSize = imageMipTailSize;
		 setImageMipTailSize0(this.ptr,  imageMipTailSize);
		 return this;
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
	 * 
	 * @param imageMipTailOffset - a instance of long.
	 * @return this VkStruct instance.
	 */ 
	 public VkSparseImageMemoryRequirements imageMipTailOffset(long imageMipTailOffset){
		 this.imageMipTailOffset = imageMipTailOffset;
		 setImageMipTailOffset0(this.ptr,  imageMipTailOffset);
		 return this;
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
	 * 
	 * @param imageMipTailStride - a instance of long.
	 * @return this VkStruct instance.
	 */ 
	 public VkSparseImageMemoryRequirements imageMipTailStride(long imageMipTailStride){
		 this.imageMipTailStride = imageMipTailStride;
		 setImageMipTailStride0(this.ptr,  imageMipTailStride);
		 return this;
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


   /* (non-Javadoc)
    * @see java.lang.Object#toString()
    */
    @Override
    public String toString() {
         StringBuilder builder = new StringBuilder();
         builder.append("VkSparseImageMemoryRequirements [ ")
				.append("formatProperties: ").append(formatProperties() )
				.append(",\n imageMipTailFirstLod: ")
				.append(imageMipTailFirstLod() )
				.append(",\n imageMipTailSize: ")
				.append(imageMipTailSize() )
				.append(",\n imageMipTailOffset: ")
				.append(imageMipTailOffset() )
				.append(",\n imageMipTailStride: ")
				.append(imageMipTailStride() )
				.append("]");
		 return builder.toString();
    }


	 //////////////////////////////////
	 // Native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * Native SET method for field formatProperties	[vkstruct]<br>
	 * Prototype: VkSparseImageFormatProperties  formatProperties
	 */ 
	 private static native void setFormatProperties0(Buffer ptr, java.nio.ByteBuffer  _formatProperties);/*
		  VkSparseImageMemoryRequirements* vkObj = (VkSparseImageMemoryRequirements*)(ptr);
		 // code for Buffer - referenced by ptr
		  vkObj->formatProperties = (VkSparseImageFormatProperties) (_formatProperties);
	  */

	/**
	 * Native GET method for field formatProperties	[vkstruct]<br>
	 * Prototype: VkSparseImageFormatProperties  formatProperties
	 */ 
	 private static native long getFormatProperties0(Buffer ptr);/*
		  VkSparseImageMemoryRequirements* vkObj = (VkSparseImageMemoryRequirements*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->formatProperties);
	 */

	/**
	 * Native SET method for field imageMipTailFirstLod	[int]<br>
	 * Prototype: uint32_t  imageMipTailFirstLod
	 */ 
	 private static native void setImageMipTailFirstLod0(Buffer ptr, int _imageMipTailFirstLod);/*
		  VkSparseImageMemoryRequirements* vkObj = (VkSparseImageMemoryRequirements*)(ptr);
		 // code for simple past value 
		  vkObj->imageMipTailFirstLod = (uint32_t) (_imageMipTailFirstLod);
	  */

	/**
	 * Native GET method for field imageMipTailFirstLod	[int]<br>
	 * Prototype: uint32_t  imageMipTailFirstLod
	 */ 
	 private static native int getImageMipTailFirstLod0(Buffer ptr);/*
		  VkSparseImageMemoryRequirements* vkObj = (VkSparseImageMemoryRequirements*)(ptr);
		  return (jint) (vkObj->imageMipTailFirstLod);
	 */

	/**
	 * Native SET method for field imageMipTailSize	[long]<br>
	 * Prototype: VkDeviceSize  imageMipTailSize
	 */ 
	 private static native void setImageMipTailSize0(Buffer ptr, long _imageMipTailSize);/*
		  VkSparseImageMemoryRequirements* vkObj = (VkSparseImageMemoryRequirements*)(ptr);
		 // code for simple past value 
		  vkObj->imageMipTailSize = (VkDeviceSize) (_imageMipTailSize);
	  */

	/**
	 * Native GET method for field imageMipTailSize	[long]<br>
	 * Prototype: VkDeviceSize  imageMipTailSize
	 */ 
	 private static native long getImageMipTailSize0(Buffer ptr);/*
		  VkSparseImageMemoryRequirements* vkObj = (VkSparseImageMemoryRequirements*)(ptr);
		  return (jlong) (vkObj->imageMipTailSize);
	 */

	/**
	 * Native SET method for field imageMipTailOffset	[long]<br>
	 * Prototype: VkDeviceSize  imageMipTailOffset
	 */ 
	 private static native void setImageMipTailOffset0(Buffer ptr, long _imageMipTailOffset);/*
		  VkSparseImageMemoryRequirements* vkObj = (VkSparseImageMemoryRequirements*)(ptr);
		 // code for simple past value 
		  vkObj->imageMipTailOffset = (VkDeviceSize) (_imageMipTailOffset);
	  */

	/**
	 * Native GET method for field imageMipTailOffset	[long]<br>
	 * Prototype: VkDeviceSize  imageMipTailOffset
	 */ 
	 private static native long getImageMipTailOffset0(Buffer ptr);/*
		  VkSparseImageMemoryRequirements* vkObj = (VkSparseImageMemoryRequirements*)(ptr);
		  return (jlong) (vkObj->imageMipTailOffset);
	 */

	/**
	 * Native SET method for field imageMipTailStride	[long]<br>
	 * Prototype: VkDeviceSize  imageMipTailStride
	 */ 
	 private static native void setImageMipTailStride0(Buffer ptr, long _imageMipTailStride);/*
		  VkSparseImageMemoryRequirements* vkObj = (VkSparseImageMemoryRequirements*)(ptr);
		 // code for simple past value 
		  vkObj->imageMipTailStride = (VkDeviceSize) (_imageMipTailStride);
	  */

	/**
	 * Native GET method for field imageMipTailStride	[long]<br>
	 * Prototype: VkDeviceSize  imageMipTailStride
	 */ 
	 private static native long getImageMipTailStride0(Buffer ptr);/*
		  VkSparseImageMemoryRequirements* vkObj = (VkSparseImageMemoryRequirements*)(ptr);
		  return (jlong) (vkObj->imageMipTailStride);
	 */



} // end of class VkSparseImageMemoryRequirements
