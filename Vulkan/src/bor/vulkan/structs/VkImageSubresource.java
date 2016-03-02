/**
 * Class wrapping Vulkan's VkImageSubresource struct.
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
 *  This class is a Java front end for struct VkImageSubresource. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkImageSubresource {
 *     VkImageAspectFlags    aspectMask;
 *     uint32_t              mipLevel;
 *     uint32_t              arrayLayer;
 * } VkImageSubresource;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.01 (beta) 
 */
public class VkImageSubresource extends VkStruct {
	/** TAG of this structure [152]  */
	 private static final String TAG = "VkImageSubresource";

	/** ID of this structure [152]  */
	 public static final int TAG_ID = VKIMAGESUBRESOURCE_ID;

	 // fields //
	/**
	 *  VkImageAspectFlags 	aspectMask 
	 */ 
	int 	aspectMask;

	/**
	 *  uint32_t 	mipLevel 
	 */ 
	int 	mipLevel;

	/**
	 *  uint32_t 	arrayLayer 
	 */ 
	int 	arrayLayer;

	/**
	 * Ctor
	 */
	public VkImageSubresource(){ 
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
	 * Set method for field aspectMask
	 * Prototype: VkImageAspectFlags  aspectMask
	 */ 
	 public void aspectMask(int aspectMask){
		 this.aspectMask = aspectMask;
		aspectMask0(super.ptr, aspectMask);
	 }

	/**
	 * get method for field aspectMask
	 * Prototype: VkImageAspectFlags  aspectMask
	 */ 
	 public int aspectMask(){
		 // return  this.aspectMask;
		 return aspectMask0(super.ptr);
	 }

	/**
	 * Set method for field mipLevel
	 * Prototype: uint32_t  mipLevel
	 */ 
	 public void mipLevel(int mipLevel){
		 this.mipLevel = mipLevel;
		mipLevel0(super.ptr, mipLevel);
	 }

	/**
	 * get method for field mipLevel
	 * Prototype: uint32_t  mipLevel
	 */ 
	 public int mipLevel(){
		 // return  this.mipLevel;
		 return mipLevel0(super.ptr);
	 }

	/**
	 * Set method for field arrayLayer
	 * Prototype: uint32_t  arrayLayer
	 */ 
	 public void arrayLayer(int arrayLayer){
		 this.arrayLayer = arrayLayer;
		arrayLayer0(super.ptr, arrayLayer);
	 }

	/**
	 * get method for field arrayLayer
	 * Prototype: uint32_t  arrayLayer
	 */ 
	 public int arrayLayer(){
		 // return  this.arrayLayer;
		 return arrayLayer0(super.ptr);
	 }


	 // ////////////////////////////////
	 // native SETTERS & GETTERS //
	 // ////////////////////////////////
	/**
	 * native Set method for field aspectMask
	 * Prototype: VkImageAspectFlags  aspectMask
	 */ 
	 private static native void aspectMask0(ByteBuffer ptr, int _aspectMask);/*
		  VkImageSubresource _obj = (VkImageSubresource)(*ptr);
		  _obj.aspectMask = (VkImageAspectFlags) (_aspectMask);
	  */

	/**
	 * get method for field aspectMask
	 * Prototype: VkImageAspectFlags  aspectMask
	 */ 
	 private static native int aspectMask0(ByteBuffer ptr);/*
		  VkImageSubresource _obj = (VkImageSubresource)(ptr);
		  return (jint) (_obj.VkImageAspectFlags);
	 */

	/**
	 * native Set method for field mipLevel
	 * Prototype: uint32_t  mipLevel
	 */ 
	 private static native void mipLevel0(ByteBuffer ptr, int _mipLevel);/*
		  VkImageSubresource _obj = (VkImageSubresource)(*ptr);
		  _obj.mipLevel = (uint32_t) (_mipLevel);
	  */

	/**
	 * get method for field mipLevel
	 * Prototype: uint32_t  mipLevel
	 */ 
	 private static native int mipLevel0(ByteBuffer ptr);/*
		  VkImageSubresource _obj = (VkImageSubresource)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native Set method for field arrayLayer
	 * Prototype: uint32_t  arrayLayer
	 */ 
	 private static native void arrayLayer0(ByteBuffer ptr, int _arrayLayer);/*
		  VkImageSubresource _obj = (VkImageSubresource)(*ptr);
		  _obj.arrayLayer = (uint32_t) (_arrayLayer);
	  */

	/**
	 * get method for field arrayLayer
	 * Prototype: uint32_t  arrayLayer
	 */ 
	 private static native int arrayLayer0(ByteBuffer ptr);/*
		  VkImageSubresource _obj = (VkImageSubresource)(ptr);
		  return (jint) (_obj.uint32_t);
	 */



} // end of class VkImageSubresource
