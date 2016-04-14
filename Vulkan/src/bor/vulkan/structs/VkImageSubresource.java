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

import java.nio.Buffer;


/**
 *  Project Bor-Vulkan 
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
	/** TAG of this structure [28]  */
	 private static final String TAG = "VkImageSubresource";

	/** ID of this structure [28]  */
	 public static final int TAG_ID = VKIMAGESUBRESOURCE_ID;

	/** P wrapper for THIS object */
	 private  P<VkImageSubresource> p;

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
	 *  uint32_t 	arrayLayer	[int]
	 */ 
	 int 	arrayLayer;

	/**
	 * Ctor
	 */
	public VkImageSubresource(){ 
		 super(sizeOf()); 
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkImageSubresource(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address and memSize
	 * @param address - native address 
	 * @param memSize - buffer size 
	 */
	 public VkImageSubresource(long address , int memSize){ 
		 super(address, memSize); 
	 }

	/**
	 * Ctor with Address only. Size guessed by #sizeof()
	 * @param address - native address 
	 */
	 public VkImageSubresource(long address){ 
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
	 public static P<VkImageSubresource> createNullPointer(){
	        P<VkImageSubresource> p = new  P<VkImageSubresource>(new VkImageSubresource());
	        return p;
	    }


	/** 
	 * Return this VkObject instance wrapped in pointer P<br>
	 *
	 *  P&lt;? extends VkObject &gt;
	 *
	 * @return  a P container wrapping this object.
	 */
	 public P<VkImageSubresource> getP() {
	       if(p == null ){
	           p = new P<VkImageSubresource> (this);
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
	 * Set method for field arrayLayer	[int]<br>
	 * Prototype: uint32_t  arrayLayer
	 */ 
	 public void arrayLayer(int arrayLayer){
		 this.arrayLayer = arrayLayer;
		 setArrayLayer0(this.ptr,  arrayLayer);
	 }

	/**
	 * Get method for field arrayLayer	[int]<br>
	 * Prototype: uint32_t  arrayLayer
	 */ 
	 public int arrayLayer(){
		 int var = getArrayLayer0(super.ptr);
		 this.arrayLayer = var;
		 return this.arrayLayer;
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field aspectMask	[int]<br>
	 * Prototype: VkImageAspectFlags  aspectMask
	 */ 
	 private static native void setAspectMask0(Buffer ptr, int _aspectMask);/*
		  VkImageSubresource* vkObj = (VkImageSubresource*)(ptr);
		  vkObj->aspectMask = (VkImageAspectFlags) (_aspectMask);
	  */

	/**
	 * native GET method for field aspectMask	[int]<br>
	 * Prototype: VkImageAspectFlags  aspectMask
	 */ 
	 private static native int getAspectMask0(Buffer ptr);/*
		  VkImageSubresource vkObj = (VkImageSubresource*)(ptr);
		  return (jint) (vkObj->aspectMask);
	 */

	/**
	 * native SET method for field mipLevel	[int]<br>
	 * Prototype: uint32_t  mipLevel
	 */ 
	 private static native void setMipLevel0(Buffer ptr, int _mipLevel);/*
		  VkImageSubresource* vkObj = (VkImageSubresource*)(ptr);
		  vkObj->mipLevel = (uint32_t) (_mipLevel);
	  */

	/**
	 * native GET method for field mipLevel	[int]<br>
	 * Prototype: uint32_t  mipLevel
	 */ 
	 private static native int getMipLevel0(Buffer ptr);/*
		  VkImageSubresource vkObj = (VkImageSubresource*)(ptr);
		  return (jint) (vkObj->mipLevel);
	 */

	/**
	 * native SET method for field arrayLayer	[int]<br>
	 * Prototype: uint32_t  arrayLayer
	 */ 
	 private static native void setArrayLayer0(Buffer ptr, int _arrayLayer);/*
		  VkImageSubresource* vkObj = (VkImageSubresource*)(ptr);
		  vkObj->arrayLayer = (uint32_t) (_arrayLayer);
	  */

	/**
	 * native GET method for field arrayLayer	[int]<br>
	 * Prototype: uint32_t  arrayLayer
	 */ 
	 private static native int getArrayLayer0(Buffer ptr);/*
		  VkImageSubresource vkObj = (VkImageSubresource*)(ptr);
		  return (jint) (vkObj->arrayLayer);
	 */



} // end of class VkImageSubresource
