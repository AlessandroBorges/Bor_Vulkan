/**
 * Class wrapping Vulkan's VkImageSubresourceLayers struct.
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
 *  This class is a Java front end for struct VkImageSubresourceLayers. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkImageSubresourceLayers {
 *     VkImageAspectFlags    aspectMask;
 *     uint32_t              mipLevel;
 *     uint32_t              baseArrayLayer;
 *     uint32_t              layerCount;
 * } VkImageSubresourceLayers;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.01 (beta) 
 */
public class VkImageSubresourceLayers extends VkStruct {
	/** TAG of this structure [91]  */
	 private static final String TAG = "VkImageSubresourceLayers";

	/** ID of this structure [91]  */
	 public static final int TAG_ID = VKIMAGESUBRESOURCELAYERS_ID;

	/** P wrapper for THIS object */
	 private  P<VkImageSubresourceLayers> p;

	 ///////////////////
	 // Struct fields //
	 ///////////////////
	/**
	 *  VkImageAspectFlags 	aspectMask	[int]
	 */ 
	 int 	aspectMask;

	/**
	 *  uint32_t 	mipLevel	[int]
	 */ 
	 int 	mipLevel;

	/**
	 *  uint32_t 	baseArrayLayer	[int]
	 */ 
	 int 	baseArrayLayer;

	/**
	 *  uint32_t 	layerCount	[int]
	 */ 
	 int 	layerCount;

	/**
	 * Ctor
	 */
	public VkImageSubresourceLayers(){ 
		 super(sizeOf()); 
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkImageSubresourceLayers(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address and memSize
	 * @param address - native address 
	 * @param memSize - buffer size 
	 */
	 public VkImageSubresourceLayers(long address , int memSize){ 
		 super(address, memSize); 
	 }

	/**
	 * Ctor with Address only. Size guessed by #sizeof()
	 * @param address - native address 
	 */
	 public VkImageSubresourceLayers(long address){ 
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
	 public static P<VkImageSubresourceLayers> createNullPointer(){
	        P<VkImageSubresourceLayers> p = new  P<VkImageSubresourceLayers>(new VkImageSubresourceLayers());
	        return p;
	    }


	/** 
	 * Return this VkObject instance wrapped in pointer P<br>
	 *
	 *  P&lt;? extends VkObject &gt;
	 *
	 * @return  a P container wrapping this object.
	 */
	 public P<VkImageSubresourceLayers> getP() {
	       if(p == null ){
	           p = new P<VkImageSubresourceLayers> (this);
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
		 setAspectMask0(this.ptr,  aspectMask);
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
	 * Set method for field mipLevel	[int]<br>
	 * Prototype: uint32_t  mipLevel
	 */ 
	 public void mipLevel(int mipLevel){
		 this.mipLevel = mipLevel;
		 setMipLevel0(this.ptr,  mipLevel);
	 }

	/**
	 * Get method for field mipLevel	[int]<br>
	 * Prototype: uint32_t  mipLevel
	 */ 
	 public int mipLevel(){
		 int var = getMipLevel0(super.ptr);
		 this.mipLevel = var;
		 return this.mipLevel;
	 }

	/**
	 * Set method for field baseArrayLayer	[int]<br>
	 * Prototype: uint32_t  baseArrayLayer
	 */ 
	 public void baseArrayLayer(int baseArrayLayer){
		 this.baseArrayLayer = baseArrayLayer;
		 setBaseArrayLayer0(this.ptr,  baseArrayLayer);
	 }

	/**
	 * Get method for field baseArrayLayer	[int]<br>
	 * Prototype: uint32_t  baseArrayLayer
	 */ 
	 public int baseArrayLayer(){
		 int var = getBaseArrayLayer0(super.ptr);
		 this.baseArrayLayer = var;
		 return this.baseArrayLayer;
	 }

	/**
	 * Set method for field layerCount	[int]<br>
	 * Prototype: uint32_t  layerCount
	 */ 
	 public void layerCount(int layerCount){
		 this.layerCount = layerCount;
		 setLayerCount0(this.ptr,  layerCount);
	 }

	/**
	 * Get method for field layerCount	[int]<br>
	 * Prototype: uint32_t  layerCount
	 */ 
	 public int layerCount(){
		 int var = getLayerCount0(super.ptr);
		 this.layerCount = var;
		 return this.layerCount;
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field aspectMask	[int]<br>
	 * Prototype: VkImageAspectFlags  aspectMask
	 */ 
	 private static native void setAspectMask0(Buffer ptr, int _aspectMask);/*
		  VkImageSubresourceLayers* vkObj = (VkImageSubresourceLayers*)(ptr);
		  vkObj->aspectMask = (VkImageAspectFlags) (_aspectMask);
	  */

	/**
	 * native GET method for field aspectMask	[int]<br>
	 * Prototype: VkImageAspectFlags  aspectMask
	 */ 
	 private static native int getAspectMask0(Buffer ptr);/*
		  VkImageSubresourceLayers vkObj = (VkImageSubresourceLayers*)(ptr);
		  return (jint) (vkObj->aspectMask);
	 */

	/**
	 * native SET method for field mipLevel	[int]<br>
	 * Prototype: uint32_t  mipLevel
	 */ 
	 private static native void setMipLevel0(Buffer ptr, int _mipLevel);/*
		  VkImageSubresourceLayers* vkObj = (VkImageSubresourceLayers*)(ptr);
		  vkObj->mipLevel = (uint32_t) (_mipLevel);
	  */

	/**
	 * native GET method for field mipLevel	[int]<br>
	 * Prototype: uint32_t  mipLevel
	 */ 
	 private static native int getMipLevel0(Buffer ptr);/*
		  VkImageSubresourceLayers vkObj = (VkImageSubresourceLayers*)(ptr);
		  return (jint) (vkObj->mipLevel);
	 */

	/**
	 * native SET method for field baseArrayLayer	[int]<br>
	 * Prototype: uint32_t  baseArrayLayer
	 */ 
	 private static native void setBaseArrayLayer0(Buffer ptr, int _baseArrayLayer);/*
		  VkImageSubresourceLayers* vkObj = (VkImageSubresourceLayers*)(ptr);
		  vkObj->baseArrayLayer = (uint32_t) (_baseArrayLayer);
	  */

	/**
	 * native GET method for field baseArrayLayer	[int]<br>
	 * Prototype: uint32_t  baseArrayLayer
	 */ 
	 private static native int getBaseArrayLayer0(Buffer ptr);/*
		  VkImageSubresourceLayers vkObj = (VkImageSubresourceLayers*)(ptr);
		  return (jint) (vkObj->baseArrayLayer);
	 */

	/**
	 * native SET method for field layerCount	[int]<br>
	 * Prototype: uint32_t  layerCount
	 */ 
	 private static native void setLayerCount0(Buffer ptr, int _layerCount);/*
		  VkImageSubresourceLayers* vkObj = (VkImageSubresourceLayers*)(ptr);
		  vkObj->layerCount = (uint32_t) (_layerCount);
	  */

	/**
	 * native GET method for field layerCount	[int]<br>
	 * Prototype: uint32_t  layerCount
	 */ 
	 private static native int getLayerCount0(Buffer ptr);/*
		  VkImageSubresourceLayers vkObj = (VkImageSubresourceLayers*)(ptr);
		  return (jint) (vkObj->layerCount);
	 */



} // end of class VkImageSubresourceLayers
