/**
 * Class wrapping Vulkan's VkSparseImageFormatProperties struct.
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
 *  This class is a Java front end for struct VkSparseImageFormatProperties. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkSparseImageFormatProperties {
 *     VkImageAspectFlags          aspectMask;
 *     VkExtent3D                  imageGranularity;
 *     VkSparseImageFormatFlags    flags;
 * } VkSparseImageFormatProperties;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.65 (beta) 
 */
 public class VkSparseImageFormatProperties extends VkStruct {

    //@formatter:off
    /*JNI
    #include <BorVulkan.hpp>
    */  

	/** TAG of this structure [23]  */
	 private static final String TAG = "VkSparseImageFormatProperties";

	/** ID of this structure [23]  */
	 public static final int TAG_ID = VKSPARSEIMAGEFORMATPROPERTIES_ID;

	 ///////////////////
	 // Struct fields //
	 ///////////////////
	
	/**
	 *  VkImageAspectFlags 	aspectMask	[int]
	 */ 
	int 	aspectMask;
	
	/**
	 *  VkExtent3D 	imageGranularity	[vkstruct]
	 */ 
	VkExtent3D 	imageGranularity;
	
	/**
	 *  VkSparseImageFormatFlags 	flags	[int]
	 */ 
	int 	flags;
	/**
	 * Ctor
	 */
	public VkSparseImageFormatProperties(){ 
		 super(TAG_ID);
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkSparseImageFormatProperties(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address only. Size guessed by #sizeof()
	 * @param address - native address 
	 */
	 public VkSparseImageFormatProperties(long address){ 
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
	 * Set method for field aspectMask	[int]<br>
	 * Prototype: VkImageAspectFlags  aspectMask
	 * 
	 * @param aspectMask - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkSparseImageFormatProperties aspectMask(int aspectMask){
		 this.aspectMask = aspectMask;
		 setAspectMask0(this.ptr,  aspectMask);
		 return this;
	 }

	/**
	 * Get method for field aspectMask	[int]<br>
	 * Prototype: VkImageAspectFlags  aspectMask
	 */ 
	 public int aspectMask(){
		 int var = getAspectMask0(super.ptr);
		 this.aspectMask = var;
		 return this.aspectMask;
	 }

	/**
	 * Set method for field imageGranularity	[vkstruct]<br>
	 * Prototype: VkExtent3D  imageGranularity
	 * 
	 * @param imageGranularity - a instance of VkExtent3D.
	 * @return this VkStruct instance.
	 */ 
	 public VkSparseImageFormatProperties imageGranularity(VkExtent3D imageGranularity){
		 this.imageGranularity = imageGranularity;
		 ByteBuffer buff = (imageGranularity==null) ? null : imageGranularity.getPointer();
		 setImageGranularity0(this.ptr, buff);
		 return this;
	 }

	/**
	 * Get method for field imageGranularity	[vkstruct]<br>
	 * Prototype: VkExtent3D  imageGranularity
	 */ 
	 public VkExtent3D imageGranularity(){
		 long pointer = getImageGranularity0(super.ptr);
		 if(pointer == 0){
		    this.imageGranularity = null;
		    return null;
		  } 

		 if(this.imageGranularity == null){
		    this.imageGranularity = new VkExtent3D(pointer);
		 }else{
		    this.imageGranularity.setPointer(pointer);
		  }
		 return this.imageGranularity;
	 }

	/**
	 * Set method for field flags	[int]<br>
	 * Prototype: VkSparseImageFormatFlags  flags
	 * 
	 * @param flags - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkSparseImageFormatProperties flags(int flags){
		 this.flags = flags;
		 setFlags0(this.ptr,  flags);
		 return this;
	 }

	/**
	 * Get method for field flags	[int]<br>
	 * Prototype: VkSparseImageFormatFlags  flags
	 */ 
	 public int flags(){
		 int var = getFlags0(super.ptr);
		 this.flags = var;
		 return this.flags;
	 }


   /* (non-Javadoc)
    * @see java.lang.Object#toString()
    */
    @Override
    public String toString() {
         StringBuilder builder = new StringBuilder();
         builder.append("VkSparseImageFormatProperties [ ")
				.append("aspectMask: ").append(aspectMask() )
				.append(",\n imageGranularity: ")
				.append(imageGranularity() )
				.append(",\n flags: ")
				.append(flags() )
				.append("]");
		 return builder.toString();
    }


	 //////////////////////////////////
	 // Native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * Native SET method for field aspectMask	[int]<br>
	 * Prototype: VkImageAspectFlags  aspectMask
	 */ 
	 private static native void setAspectMask0(Buffer ptr, int _aspectMask);/*
		  VkSparseImageFormatProperties* vkObj = (VkSparseImageFormatProperties*)(ptr);
		  vkObj->aspectMask = (VkImageAspectFlags) (_aspectMask);
	  */

	/**
	 * Native GET method for field aspectMask	[int]<br>
	 * Prototype: VkImageAspectFlags  aspectMask
	 */ 
	 private static native int getAspectMask0(Buffer ptr);/*
		  VkSparseImageFormatProperties* vkObj = (VkSparseImageFormatProperties*)(ptr);
		  return (jint) (vkObj->aspectMask);
	 */

	/**
	 * Native SET method for field imageGranularity	[vkstruct]<br>
	 * Prototype: VkExtent3D  imageGranularity
	 */ 
	 private static native void setImageGranularity0(Buffer ptr, java.nio.ByteBuffer  _imageGranularity);/*
		  VkSparseImageFormatProperties* vkObj = (VkSparseImageFormatProperties*)(ptr);
		  vkObj->imageGranularity = (VkExtent3D) (_imageGranularity);
	  */

	/**
	 * Native GET method for field imageGranularity	[vkstruct]<br>
	 * Prototype: VkExtent3D  imageGranularity
	 */ 
	 private static native long getImageGranularity0(Buffer ptr);/*
		  VkSparseImageFormatProperties* vkObj = (VkSparseImageFormatProperties*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->imageGranularity);
	 */

	/**
	 * Native SET method for field flags	[int]<br>
	 * Prototype: VkSparseImageFormatFlags  flags
	 */ 
	 private static native void setFlags0(Buffer ptr, int _flags);/*
		  VkSparseImageFormatProperties* vkObj = (VkSparseImageFormatProperties*)(ptr);
		  vkObj->flags = (VkSparseImageFormatFlags) (_flags);
	  */

	/**
	 * Native GET method for field flags	[int]<br>
	 * Prototype: VkSparseImageFormatFlags  flags
	 */ 
	 private static native int getFlags0(Buffer ptr);/*
		  VkSparseImageFormatProperties* vkObj = (VkSparseImageFormatProperties*)(ptr);
		  return (jint) (vkObj->flags);
	 */



} // end of class VkSparseImageFormatProperties
