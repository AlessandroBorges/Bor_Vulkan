/**
 * Class wrapping Vulkan's VkDescriptorImageInfo struct.
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
 * @version Ver. 0.8.65 (beta) 
 */
 public class VkDescriptorImageInfo extends VkStruct {

    //@formatter:off
    /*JNI
    #include <BorVulkan.hpp>
    */  

	/** TAG of this structure [76]  */
	 private static final String TAG = "VkDescriptorImageInfo";

	/** ID of this structure [76]  */
	 public static final int TAG_ID = VKDESCRIPTORIMAGEINFO_ID;

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
		 super(TAG_ID);
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkDescriptorImageInfo(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address only. Size guessed by #sizeof()
	 * @param address - native address 
	 */
	 public VkDescriptorImageInfo(long address){ 
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
	 * Set method for field sampler	[vkhandle]<br>
	 * Prototype: VkSampler  sampler
	 * 
	 * @param sampler - a instance of VkSampler.
	 * @return this VkStruct instance.
	 */ 
	 public VkDescriptorImageInfo sampler(VkSampler sampler){
		 this.sampler = sampler;
		 long handle = (sampler==null) ? 0L : sampler.getNativeHandle();
		 setSampler0(this.ptr, handle);
		 return this;
	 }

	/**
	 * Get method for field sampler	[vkhandle]<br>
	 * Prototype: VkSampler  sampler
	 */ 
	 public VkSampler sampler(){

		 long handle = getSampler0(super.ptr);
		 if(handle == 0){
		    this.sampler = null;
		    return null;
		  }  

		 if(this.sampler == null){
		    this.sampler = new VkHandle(handle);
		 }else{
		    ((VkHandle)this.sampler).setNativeHandle(handle);
		  }
		 return this.sampler;
	 }

	/**
	 * Set method for field imageView	[vkhandle]<br>
	 * Prototype: VkImageView  imageView
	 * 
	 * @param imageView - a instance of VkImageView.
	 * @return this VkStruct instance.
	 */ 
	 public VkDescriptorImageInfo imageView(VkImageView imageView){
		 this.imageView = imageView;
		 long handle = (imageView==null) ? 0L : imageView.getNativeHandle();
		 setImageView0(this.ptr, handle);
		 return this;
	 }

	/**
	 * Get method for field imageView	[vkhandle]<br>
	 * Prototype: VkImageView  imageView
	 */ 
	 public VkImageView imageView(){

		 long handle = getImageView0(super.ptr);
		 if(handle == 0){
		    this.imageView = null;
		    return null;
		  }  

		 if(this.imageView == null){
		    this.imageView = new VkHandle(handle);
		 }else{
		    ((VkHandle)this.imageView).setNativeHandle(handle);
		  }
		 return this.imageView;
	 }

	/**
	 * Set method for field imageLayout	[vkenum]<br>
	 * Prototype: VkImageLayout  imageLayout
	 * 
	 * @param imageLayout - a instance of VkImageLayout.
	 * @return this VkStruct instance.
	 */ 
	 public VkDescriptorImageInfo imageLayout(VkImageLayout imageLayout){
		 this.imageLayout = imageLayout;
		 int enumVal = imageLayout.getValue();
		 setImageLayout0(this.ptr, enumVal );
		 return this;
	 }

	/**
	 * Get method for field imageLayout	[vkenum]<br>
	 * Prototype: VkImageLayout  imageLayout
	 */ 
	 public VkImageLayout imageLayout(){
		 int nativeVal = getImageLayout0(super.ptr);
		 this.imageLayout = VkImageLayout.fromValue(nativeVal); 
		 return this.imageLayout;
	 }


   /* (non-Javadoc)
    * @see java.lang.Object#toString()
    */
    @Override
    public String toString() {
         StringBuilder builder = new StringBuilder();
         builder.append("VkDescriptorImageInfo [ ")
				.append("sampler: ").append(sampler() )
				.append(",\n imageView: ")
				.append(imageView() )
				.append(",\n imageLayout: ")
				.append(imageLayout() )
				.append("]");
		 return builder.toString();
    }


	 //////////////////////////////////
	 // Native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * Native SET method for field sampler	[vkhandle]<br>
	 * Prototype: VkSampler  sampler
	 */ 
	 private static native void setSampler0(Buffer ptr, long  _sampler);/*
		  VkDescriptorImageInfo* vkObj = (VkDescriptorImageInfo*)(ptr);
		 // code for simple past value 
		  vkObj->sampler = (VkSampler) (_sampler);
	  */

	/**
	 * Native GET method for field sampler	[vkhandle]<br>
	 * Prototype: VkSampler  sampler
	 */ 
	 private static native long getSampler0(Buffer ptr);/*
		  VkDescriptorImageInfo* vkObj = (VkDescriptorImageInfo*)(ptr);
		  // generic get for struct field of type  VkHandle or VkStruct 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->sampler);
	 */

	/**
	 * Native SET method for field imageView	[vkhandle]<br>
	 * Prototype: VkImageView  imageView
	 */ 
	 private static native void setImageView0(Buffer ptr, long  _imageView);/*
		  VkDescriptorImageInfo* vkObj = (VkDescriptorImageInfo*)(ptr);
		 // code for simple past value 
		  vkObj->imageView = (VkImageView) (_imageView);
	  */

	/**
	 * Native GET method for field imageView	[vkhandle]<br>
	 * Prototype: VkImageView  imageView
	 */ 
	 private static native long getImageView0(Buffer ptr);/*
		  VkDescriptorImageInfo* vkObj = (VkDescriptorImageInfo*)(ptr);
		  // generic get for struct field of type  VkHandle or VkStruct 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->imageView);
	 */

	/**
	 * Native SET method for field imageLayout	[vkenum]<br>
	 * Prototype: VkImageLayout  imageLayout
	 */ 
	 private static native void setImageLayout0(Buffer ptr, int  _imageLayout);/*
		  VkDescriptorImageInfo* vkObj = (VkDescriptorImageInfo*)(ptr);
		 // code for simple past value 
		  vkObj->imageLayout = (VkImageLayout) (_imageLayout);
	  */

	/**
	 * Native GET method for field imageLayout	[vkenum]<br>
	 * Prototype: VkImageLayout  imageLayout
	 */ 
	 private static native int  getImageLayout0(Buffer ptr);/*
		  VkDescriptorImageInfo* vkObj = (VkDescriptorImageInfo*)(ptr);
		  return (VkImageLayout) (vkObj->imageLayout);
	 */



} // end of class VkDescriptorImageInfo
