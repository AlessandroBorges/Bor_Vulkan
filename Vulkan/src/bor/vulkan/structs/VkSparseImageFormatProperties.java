/**
 * Class wrapping Vulkan's VkSparseImageFormatProperties struct.
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
 * @version Ver. 0.8.01 (beta) 
 */
public class VkSparseImageFormatProperties extends VkStruct {
	/** TAG of this structure [23]  */
	 private static final String TAG = "VkSparseImageFormatProperties";

	/** ID of this structure [23]  */
	 public static final int TAG_ID = VKSPARSEIMAGEFORMATPROPERTIES_ID;

	/** P wrapper for THIS object */
	 private  P<VkSparseImageFormatProperties> p;

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
		 super(sizeOf()); 
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkSparseImageFormatProperties(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address and memSize
	 * @param address - native address 
	 * @param memSize - buffer size 
	 */
	 public VkSparseImageFormatProperties(long address, int memSize){ 
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
	 public static P<VkSparseImageFormatProperties> createNullPointer(){
	        P<VkSparseImageFormatProperties> p = new  P<VkSparseImageFormatProperties>(new VkSparseImageFormatProperties());
	        return p;
	    }


	/** 
	 * Return this VkObject instance wrapped in pointer P<br>
	 *
	 *  P&lt;? extends VkObject &gt;
	 *
	 * @return  a P container wrapping this object.
	 */
	 public P<VkSparseImageFormatProperties> getP() {
	       if(p == null ){
	           p = new P<VkSparseImageFormatProperties> (this);
	       }
	        return p;
	    }


	 ////////////////////////
	 //  SETTERS & GETTERS //
	 ////////////////////////

	/**
	 * Set method for field aspectMask	[int]<br>
	 * Prototype: VkImageAspectFlags  aspectMask
	 */ 
	 public void aspectMask(int aspectMask){
		 this.aspectMask = aspectMask;
		aspectMask0(super.ptr, aspectMask);
	 }

	/**
	 * get method for field aspectMask	[int]<br>
	 * Prototype: VkImageAspectFlags  aspectMask
	 */ 
	 public int aspectMask(){
		 // return  this.aspectMask;
		 return aspectMask0(super.ptr);
	 }

	/**
	 * Set method for field imageGranularity	[vkstruct]<br>
	 * Prototype: VkExtent3D  imageGranularity
	 */ 
	 public void imageGranularity(VkExtent3D imageGranularity){
		 this.imageGranularity = imageGranularity;
		imageGranularity0(super.ptr, imageGranularity);
	 }

	/**
	 * get method for field imageGranularity	[vkstruct]<br>
	 * Prototype: VkExtent3D  imageGranularity
	 */ 
	 public VkExtent3D imageGranularity(){
		 // return  this.imageGranularity;
		 return imageGranularity0(super.ptr);
	 }

	/**
	 * Set method for field flags	[int]<br>
	 * Prototype: VkSparseImageFormatFlags  flags
	 */ 
	 public void flags(int flags){
		 this.flags = flags;
		flags0(super.ptr, flags);
	 }

	/**
	 * get method for field flags	[int]<br>
	 * Prototype: VkSparseImageFormatFlags  flags
	 */ 
	 public int flags(){
		 // return  this.flags;
		 return flags0(super.ptr);
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field aspectMask	[int]<br>
	 * Prototype: VkImageAspectFlags  aspectMask
	 */ 
	 private static native void aspectMask0(ByteBuffer ptr, int _aspectMask);/*
		  VkSparseImageFormatProperties _obj = (VkSparseImageFormatProperties)(*ptr);
		  _obj.aspectMask = (VkImageAspectFlags) (_aspectMask);
	  */

	/**
	 * native GET method for field aspectMask	[int]<br>
	 * Prototype: VkImageAspectFlags  aspectMask
	 */ 
	 private static native int aspectMask0(ByteBuffer ptr);/*
		  VkSparseImageFormatProperties _obj = (VkSparseImageFormatProperties)(ptr);
		  return (jint) (_obj.VkImageAspectFlags);
	 */

	/**
	 * native SET method for field imageGranularity	[vkstruct]<br>
	 * Prototype: VkExtent3D  imageGranularity
	 */ 
	 private static native void imageGranularity0(ByteBuffer ptr, VkExtent3D _imageGranularity);/*
		  VkSparseImageFormatProperties _obj = (VkSparseImageFormatProperties)(*ptr);
		  _obj.imageGranularity = (VkExtent3D) (_imageGranularity);
	  */

	/**
	 * native GET method for field imageGranularity	[vkstruct]<br>
	 * Prototype: VkExtent3D  imageGranularity
	 */ 
	 private static native VkExtent3D imageGranularity0(ByteBuffer ptr);/*
		  VkSparseImageFormatProperties _obj = (VkSparseImageFormatProperties)(ptr);
		  return (VkExtent3D) (_obj.VkExtent3D);
	 */

	/**
	 * native SET method for field flags	[int]<br>
	 * Prototype: VkSparseImageFormatFlags  flags
	 */ 
	 private static native void flags0(ByteBuffer ptr, int _flags);/*
		  VkSparseImageFormatProperties _obj = (VkSparseImageFormatProperties)(*ptr);
		  _obj.flags = (VkSparseImageFormatFlags) (_flags);
	  */

	/**
	 * native GET method for field flags	[int]<br>
	 * Prototype: VkSparseImageFormatFlags  flags
	 */ 
	 private static native int flags0(ByteBuffer ptr);/*
		  VkSparseImageFormatProperties _obj = (VkSparseImageFormatProperties)(ptr);
		  return (jint) (_obj.VkSparseImageFormatFlags);
	 */



} // end of class VkSparseImageFormatProperties
