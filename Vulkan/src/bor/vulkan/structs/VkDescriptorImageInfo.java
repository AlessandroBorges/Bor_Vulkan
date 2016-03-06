/**
 * Class wrapping Vulkan's VkDescriptorImageInfo struct.
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
 *  This class is a Java front end for struct VkDescriptorImageInfo. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkDescriptorImageInfo {
 *     VkSampler        sampler;
 *     VkImageView      imageView;
 *     VkImageLayout    imageLayout;
 * } VkDescriptorImageInfo;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.01 (beta) 
 */
public class VkDescriptorImageInfo extends VkStruct {
	/** TAG of this structure [76]  */
	 private static final String TAG = "VkDescriptorImageInfo";

	/** ID of this structure [76]  */
	 public static final int TAG_ID = VKDESCRIPTORIMAGEINFO_ID;

	 // fields //
	/**
	 *  VkSampler 	sampler	[vkhandle]
	 */ 
	VkSampler 	sampler;

	/**
	 *  VkImageView 	imageView	[vkhandle]
	 */ 
	VkImageView 	imageView;

	/**
	 *  VkImageLayout 	imageLayout	[vkenum]
	 */ 
	VkImageLayout 	imageLayout;

	/**
	 * Ctor
	 */
	public VkDescriptorImageInfo(){ 
		 super(sizeOf()); 
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkDescriptorImageInfo(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address and memSize
	 * @param address - native address 
	 * @param memSize - buffer size 
	 */
	 public VkDescriptorImageInfo(long address, int memSize){ 
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
	 public static P<VkDescriptorImageInfo> createNullPointer(){
	        P<VkDescriptorImageInfo> p = new  P<VkDescriptorImageInfo>(new VkDescriptorImageInfo());
	        return p;
	    }

	 ////////////////////////
	 //  SETTERS & GETTERS //
	 ////////////////////////

	/**
	 * Set method for field sampler	[vkhandle]<br>
	 * Prototype: VkSampler  sampler
	 */ 
	 public void sampler(VkSampler sampler){
		 this.sampler = sampler;
		sampler0(super.ptr, sampler);
	 }

	/**
	 * get method for field sampler	[vkhandle]<br>
	 * Prototype: VkSampler  sampler
	 */ 
	 public VkSampler sampler(){
		 // return  this.sampler;
		 return sampler0(super.ptr);
	 }

	/**
	 * Set method for field imageView	[vkhandle]<br>
	 * Prototype: VkImageView  imageView
	 */ 
	 public void imageView(VkImageView imageView){
		 this.imageView = imageView;
		imageView0(super.ptr, imageView);
	 }

	/**
	 * get method for field imageView	[vkhandle]<br>
	 * Prototype: VkImageView  imageView
	 */ 
	 public VkImageView imageView(){
		 // return  this.imageView;
		 return imageView0(super.ptr);
	 }

	/**
	 * Set method for field imageLayout	[vkenum]<br>
	 * Prototype: VkImageLayout  imageLayout
	 */ 
	 public void imageLayout(VkImageLayout imageLayout){
		 this.imageLayout = imageLayout;
		imageLayout0(super.ptr, imageLayout);
	 }

	/**
	 * get method for field imageLayout	[vkenum]<br>
	 * Prototype: VkImageLayout  imageLayout
	 */ 
	 public VkImageLayout imageLayout(){
		 // return  this.imageLayout;
		 return imageLayout0(super.ptr);
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field sampler	[vkhandle]<br>
	 * Prototype: VkSampler  sampler
	 */ 
	 private static native void sampler0(ByteBuffer ptr, VkSampler _sampler);/*
		  VkDescriptorImageInfo _obj = (VkDescriptorImageInfo)(*ptr);
		  _obj.sampler = (VkSampler) (_sampler);
	  */

	/**
	 * native GET method for field sampler	[vkhandle]<br>
	 * Prototype: VkSampler  sampler
	 */ 
	 private static native VkSampler sampler0(ByteBuffer ptr);/*
		  VkDescriptorImageInfo _obj = (VkDescriptorImageInfo)(ptr);
		  return (VkSampler) (_obj.VkSampler);
	 */

	/**
	 * native SET method for field imageView	[vkhandle]<br>
	 * Prototype: VkImageView  imageView
	 */ 
	 private static native void imageView0(ByteBuffer ptr, VkImageView _imageView);/*
		  VkDescriptorImageInfo _obj = (VkDescriptorImageInfo)(*ptr);
		  _obj.imageView = (VkImageView) (_imageView);
	  */

	/**
	 * native GET method for field imageView	[vkhandle]<br>
	 * Prototype: VkImageView  imageView
	 */ 
	 private static native VkImageView imageView0(ByteBuffer ptr);/*
		  VkDescriptorImageInfo _obj = (VkDescriptorImageInfo)(ptr);
		  return (VkImageView) (_obj.VkImageView);
	 */

	/**
	 * native SET method for field imageLayout	[vkenum]<br>
	 * Prototype: VkImageLayout  imageLayout
	 */ 
	 private static native void imageLayout0(ByteBuffer ptr, VkImageLayout _imageLayout);/*
		  VkDescriptorImageInfo _obj = (VkDescriptorImageInfo)(*ptr);
		  _obj.imageLayout = (VkImageLayout) (_imageLayout);
	  */

	/**
	 * native GET method for field imageLayout	[vkenum]<br>
	 * Prototype: VkImageLayout  imageLayout
	 */ 
	 private static native VkImageLayout imageLayout0(ByteBuffer ptr);/*
		  VkDescriptorImageInfo _obj = (VkDescriptorImageInfo)(ptr);
		  return (VkImageLayout) (_obj.VkImageLayout);
	 */



} // end of class VkDescriptorImageInfo
