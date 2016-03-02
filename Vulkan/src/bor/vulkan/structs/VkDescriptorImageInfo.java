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
	/** TAG of this structure [200]  */
	 private static final String TAG = "VkDescriptorImageInfo";

	/** ID of this structure [200]  */
	 public static final int TAG_ID = VKDESCRIPTORIMAGEINFO_ID;

	 // fields //
	/**
	 *  VkSampler 	sampler 
	 */ 
	VkSampler 	sampler;

	/**
	 *  VkImageView 	imageView 
	 */ 
	VkImageView 	imageView;

	/**
	 *  VkImageLayout 	imageLayout 
	 */ 
	VkImageLayout 	imageLayout;

	/**
	 * Ctor
	 */
	public VkDescriptorImageInfo(){ 
		 super(sizeOf()); 
	 }

	/** 
	 * Method to get native size of this structure 
	 */
	 public static int sizeOf(){ 
		 return sizeOf(TAG_ID); 
	}


	 // /////////////////////
	 //  SETTERS & GETTERS //
	 // /////////////////////

	/**
	 * Set method for field sampler
	 * Prototype: VkSampler  sampler
	 */ 
	 public void sampler(VkSampler sampler){
		 this.sampler = sampler;
		sampler0(super.ptr, sampler);
	 }

	/**
	 * get method for field sampler
	 * Prototype: VkSampler  sampler
	 */ 
	 public VkSampler sampler(){
		 // return  this.sampler;
		 return sampler0(super.ptr);
	 }

	/**
	 * Set method for field imageView
	 * Prototype: VkImageView  imageView
	 */ 
	 public void imageView(VkImageView imageView){
		 this.imageView = imageView;
		imageView0(super.ptr, imageView);
	 }

	/**
	 * get method for field imageView
	 * Prototype: VkImageView  imageView
	 */ 
	 public VkImageView imageView(){
		 // return  this.imageView;
		 return imageView0(super.ptr);
	 }

	/**
	 * Set method for field imageLayout
	 * Prototype: VkImageLayout  imageLayout
	 */ 
	 public void imageLayout(VkImageLayout imageLayout){
		 this.imageLayout = imageLayout;
		imageLayout0(super.ptr, imageLayout);
	 }

	/**
	 * get method for field imageLayout
	 * Prototype: VkImageLayout  imageLayout
	 */ 
	 public VkImageLayout imageLayout(){
		 // return  this.imageLayout;
		 return imageLayout0(super.ptr);
	 }


	 // ////////////////////////////////
	 // native SETTERS & GETTERS //
	 // ////////////////////////////////
	/**
	 * native Set method for field sampler
	 * Prototype: VkSampler  sampler
	 */ 
	 private static native void sampler0(ByteBuffer ptr, VkSampler _sampler);/*
		  VkDescriptorImageInfo _obj = (VkDescriptorImageInfo)(*ptr);
		  _obj.sampler = (VkSampler) (_sampler);
	  */

	/**
	 * get method for field sampler
	 * Prototype: VkSampler  sampler
	 */ 
	 private static native VkSampler sampler0(ByteBuffer ptr);/*
		  VkDescriptorImageInfo _obj = (VkDescriptorImageInfo)(ptr);
		  return (VkSampler) (_obj.VkSampler);
	 */

	/**
	 * native Set method for field imageView
	 * Prototype: VkImageView  imageView
	 */ 
	 private static native void imageView0(ByteBuffer ptr, VkImageView _imageView);/*
		  VkDescriptorImageInfo _obj = (VkDescriptorImageInfo)(*ptr);
		  _obj.imageView = (VkImageView) (_imageView);
	  */

	/**
	 * get method for field imageView
	 * Prototype: VkImageView  imageView
	 */ 
	 private static native VkImageView imageView0(ByteBuffer ptr);/*
		  VkDescriptorImageInfo _obj = (VkDescriptorImageInfo)(ptr);
		  return (VkImageView) (_obj.VkImageView);
	 */

	/**
	 * native Set method for field imageLayout
	 * Prototype: VkImageLayout  imageLayout
	 */ 
	 private static native void imageLayout0(ByteBuffer ptr, VkImageLayout _imageLayout);/*
		  VkDescriptorImageInfo _obj = (VkDescriptorImageInfo)(*ptr);
		  _obj.imageLayout = (VkImageLayout) (_imageLayout);
	  */

	/**
	 * get method for field imageLayout
	 * Prototype: VkImageLayout  imageLayout
	 */ 
	 private static native VkImageLayout imageLayout0(ByteBuffer ptr);/*
		  VkDescriptorImageInfo _obj = (VkDescriptorImageInfo)(ptr);
		  return (VkImageLayout) (_obj.VkImageLayout);
	 */



} // end of class VkDescriptorImageInfo
