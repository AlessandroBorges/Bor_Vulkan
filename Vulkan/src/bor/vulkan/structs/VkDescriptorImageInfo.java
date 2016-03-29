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

import java.nio.Buffer;


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

	/** P wrapper for THIS object */
	 private  P<VkDescriptorImageInfo> p;

	 ///////////////////
	 // Struct fields //
	 ///////////////////
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


	/** 
	 * Return this VkObject instance wrapped in pointer P<br>
	 *
	 *  P&lt;? extends VkObject &gt;
	 *
	 * @return  a P container wrapping this object.
	 */
	 public P<VkDescriptorImageInfo> getP() {
	       if(p == null ){
	           p = new P<VkDescriptorImageInfo> (this);
	       }
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
		 ByteBuffer buff = (sampler==null) ? null : sampler.getHandle();
		 sampler0(this.ptr, buff);
	 }

	/**
	 * Get method for field sampler	[vkhandle]<br>
	 * Prototype: VkSampler  sampler
	 */ 
	 public VkSampler sampler(){

		 ByteBuffer handle = sampler0(super.ptr);
		 if(handle == null){
		    this.sampler = null;
		    return null;
		  } else 
 		 if(this.sampler == null){
		    this.sampler = new VkHandle(handle);
		 }else{
		    ((VkHandle)this.sampler).setHandle(handle);
		  }
		 return this.sampler;
	 }

	/**
	 * Set method for field imageView	[vkhandle]<br>
	 * Prototype: VkImageView  imageView
	 */ 
	 public void imageView(VkImageView imageView){
		 this.imageView = imageView;
		 ByteBuffer buff = (imageView==null) ? null : imageView.getHandle();
		 imageView0(this.ptr, buff);
	 }

	/**
	 * Get method for field imageView	[vkhandle]<br>
	 * Prototype: VkImageView  imageView
	 */ 
	 public VkImageView imageView(){

		 ByteBuffer handle = imageView0(super.ptr);
		 if(handle == null){
		    this.imageView = null;
		    return null;
		  } else 
 		 if(this.imageView == null){
		    this.imageView = new VkHandle(handle);
		 }else{
		    ((VkHandle)this.imageView).setHandle(handle);
		  }
		 return this.imageView;
	 }

	/**
	 * Set method for field imageLayout	[vkenum]<br>
	 * Prototype: VkImageLayout  imageLayout
	 */ 
	 public void imageLayout(VkImageLayout imageLayout){
		 this.imageLayout = imageLayout;
		 int enumVal = imageLayout.getValue();
		 imageLayout0(this.ptr, enumVal );
	 }

	/**
	 * Get method for field imageLayout	[vkenum]<br>
	 * Prototype: VkImageLayout  imageLayout
	 */ 
	 public VkImageLayout imageLayout(){
		 int nativeVal = imageLayout0(super.ptr);
		 this.imageLayout = VkImageLayout.fromValue(nativeVal); 
		 return this.imageLayout;
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field sampler	[vkhandle]<br>
	 * Prototype: VkSampler  sampler
	 */ 
	 private static native void sampler0(Buffer ptr, java.nio.ByteBuffer  _sampler);/*
		  VkDescriptorImageInfo* vkObj = (VkDescriptorImageInfo*)(ptr);
		  vkObj->sampler = (VkSampler) (_sampler);
	  */

	/**
	 * native GET method for field sampler	[vkhandle]<br>
	 * Prototype: VkSampler  sampler
	 */ 
	 private static native java.nio.ByteBuffer  sampler0(Buffer ptr);/*
		  VkDescriptorImageInfo vkObj = (VkDescriptorImageInfo*)(ptr);
		  return (VkSampler) (vkObj->sampler);
	 */

	/**
	 * native SET method for field imageView	[vkhandle]<br>
	 * Prototype: VkImageView  imageView
	 */ 
	 private static native void imageView0(Buffer ptr, java.nio.ByteBuffer  _imageView);/*
		  VkDescriptorImageInfo* vkObj = (VkDescriptorImageInfo*)(ptr);
		  vkObj->imageView = (VkImageView) (_imageView);
	  */

	/**
	 * native GET method for field imageView	[vkhandle]<br>
	 * Prototype: VkImageView  imageView
	 */ 
	 private static native java.nio.ByteBuffer  imageView0(Buffer ptr);/*
		  VkDescriptorImageInfo vkObj = (VkDescriptorImageInfo*)(ptr);
		  return (VkImageView) (vkObj->imageView);
	 */

	/**
	 * native SET method for field imageLayout	[vkenum]<br>
	 * Prototype: VkImageLayout  imageLayout
	 */ 
	 private static native void imageLayout0(Buffer ptr, int  _imageLayout);/*
		  VkDescriptorImageInfo* vkObj = (VkDescriptorImageInfo*)(ptr);
		  vkObj->imageLayout = (VkImageLayout) (_imageLayout);
	  */

	/**
	 * native GET method for field imageLayout	[vkenum]<br>
	 * Prototype: VkImageLayout  imageLayout
	 */ 
	 private static native int  imageLayout0(Buffer ptr);/*
		  VkDescriptorImageInfo vkObj = (VkDescriptorImageInfo*)(ptr);
		  return (VkImageLayout) (vkObj->imageLayout);
	 */



} // end of class VkDescriptorImageInfo
