// class wrapping Vulkan's VkImageSubresourceLayers struct.
package bor.vulkan.structs;

import bor.vulkan.*;
import bor.vulkan.enumerations.*;
import java.nio.ByteBuffer;


/**
 *  Class for Java-Vulkan integration 
 *  This class is a Java front end for struct VkImageSubresourceLayers 
 * @Author Alessandro Borges 
 */
public class VkImageSubresourceLayers extends VkStruct {
	/** ID of this structure [91]  */
	 public static final int TAG = VKIMAGESUBRESOURCELAYERS_ID;

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
	 *  uint32_t 	baseArrayLayer 
	 */ 
	int 	baseArrayLayer;

	/**
	 *  uint32_t 	layerCount 
	 */ 
	int 	layerCount;

	/**
	 * Ctor
	 */
	public VkImageSubresourceLayers(){ 
		 super(sizeOf()); 
	 }

	/** 
	 * Method to get native size of this structure 
	 */
	 public static int sizeOf(){ 
		 return sizeOf(TAG); 
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
	 * Set method for field baseArrayLayer
	 * Prototype: uint32_t  baseArrayLayer
	 */ 
	 public void baseArrayLayer(int baseArrayLayer){
		 this.baseArrayLayer = baseArrayLayer;
		baseArrayLayer0(super.ptr, baseArrayLayer);
	 }

	/**
	 * get method for field baseArrayLayer
	 * Prototype: uint32_t  baseArrayLayer
	 */ 
	 public int baseArrayLayer(){
		 // return  this.baseArrayLayer;
		 return baseArrayLayer0(super.ptr);
	 }

	/**
	 * Set method for field layerCount
	 * Prototype: uint32_t  layerCount
	 */ 
	 public void layerCount(int layerCount){
		 this.layerCount = layerCount;
		layerCount0(super.ptr, layerCount);
	 }

	/**
	 * get method for field layerCount
	 * Prototype: uint32_t  layerCount
	 */ 
	 public int layerCount(){
		 // return  this.layerCount;
		 return layerCount0(super.ptr);
	 }


	 // ////////////////////////////////
	 // native SETTERS & GETTERS //
	 // ////////////////////////////////
	/**
	 * native Set method for field aspectMask
	 * Prototype: VkImageAspectFlags  aspectMask
	 */ 
	 private static native void aspectMask0(ByteBuffer ptr, int _aspectMask);/*
		  VkImageSubresourceLayers _obj = (VkImageSubresourceLayers)(*ptr);
		  _obj.aspectMask = (VkImageAspectFlags) (_aspectMask);
	  */

	/**
	 * get method for field aspectMask
	 * Prototype: VkImageAspectFlags  aspectMask
	 */ 
	 private static native int aspectMask0(ByteBuffer ptr);/*
		  VkImageSubresourceLayers _obj = (VkImageSubresourceLayers)(ptr);
		  return (jint) (_obj.VkImageAspectFlags);
	 */

	/**
	 * native Set method for field mipLevel
	 * Prototype: uint32_t  mipLevel
	 */ 
	 private static native void mipLevel0(ByteBuffer ptr, int _mipLevel);/*
		  VkImageSubresourceLayers _obj = (VkImageSubresourceLayers)(*ptr);
		  _obj.mipLevel = (uint32_t) (_mipLevel);
	  */

	/**
	 * get method for field mipLevel
	 * Prototype: uint32_t  mipLevel
	 */ 
	 private static native int mipLevel0(ByteBuffer ptr);/*
		  VkImageSubresourceLayers _obj = (VkImageSubresourceLayers)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native Set method for field baseArrayLayer
	 * Prototype: uint32_t  baseArrayLayer
	 */ 
	 private static native void baseArrayLayer0(ByteBuffer ptr, int _baseArrayLayer);/*
		  VkImageSubresourceLayers _obj = (VkImageSubresourceLayers)(*ptr);
		  _obj.baseArrayLayer = (uint32_t) (_baseArrayLayer);
	  */

	/**
	 * get method for field baseArrayLayer
	 * Prototype: uint32_t  baseArrayLayer
	 */ 
	 private static native int baseArrayLayer0(ByteBuffer ptr);/*
		  VkImageSubresourceLayers _obj = (VkImageSubresourceLayers)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native Set method for field layerCount
	 * Prototype: uint32_t  layerCount
	 */ 
	 private static native void layerCount0(ByteBuffer ptr, int _layerCount);/*
		  VkImageSubresourceLayers _obj = (VkImageSubresourceLayers)(*ptr);
		  _obj.layerCount = (uint32_t) (_layerCount);
	  */

	/**
	 * get method for field layerCount
	 * Prototype: uint32_t  layerCount
	 */ 
	 private static native int layerCount0(ByteBuffer ptr);/*
		  VkImageSubresourceLayers _obj = (VkImageSubresourceLayers)(ptr);
		  return (jint) (_obj.uint32_t);
	 */



} // end of class VkImageSubresourceLayers
