/**
 * Class wrapping Vulkan's VkImageSubresourceRange struct.
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
 *  This class is a Java front end for struct VkImageSubresourceRange. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkImageSubresourceRange {
 *     VkImageAspectFlags    aspectMask;
 *     uint32_t              baseMipLevel;
 *     uint32_t              levelCount;
 *     uint32_t              baseArrayLayer;
 *     uint32_t              layerCount;
 * } VkImageSubresourceRange;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.01 (beta) 
 */
public class VkImageSubresourceRange extends VkStruct {

    //@formatter:off
    /*JNI
    #include <BorVulkan.hpp>
    */  

	/** TAG of this structure [42]  */
	 private static final String TAG = "VkImageSubresourceRange";

	/** ID of this structure [42]  */
	 public static final int TAG_ID = VKIMAGESUBRESOURCERANGE_ID;

	/** P wrapper for THIS object */
	 private  P<VkImageSubresourceRange> p;

	 ///////////////////
	 // Struct fields //
	 ///////////////////
	/**
	 *  VkImageAspectFlags 	aspectMask	[int]
	 */ 
	 int 	aspectMask;

	/**
	 *  uint32_t 	baseMipLevel	[int]
	 */ 
	 int 	baseMipLevel;

	/**
	 *  uint32_t 	levelCount	[int]
	 */ 
	 int 	levelCount;

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
	public VkImageSubresourceRange(){ 
		 super(sizeOf()); 
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkImageSubresourceRange(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address and memSize
	 * @param address - native address 
	 * @param memSize - buffer size 
	 */
	 public VkImageSubresourceRange(long address , int memSize){ 
		 super(address, memSize); 
	 }

	/**
	 * Ctor with Address only. Size guessed by #sizeof()
	 * @param address - native address 
	 */
	 public VkImageSubresourceRange(long address){ 
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
	 public static P<VkImageSubresourceRange> createNullPointer(){
	        P<VkImageSubresourceRange> p = new  P<VkImageSubresourceRange>(new VkImageSubresourceRange());
	        return p;
	    }


	/** 
	 * Return this VkObject instance wrapped in pointer P<br>
	 *
	 *  P&lt;? extends VkObject &gt;
	 *
	 * @return  a P container wrapping this object.
	 */
	 public P<VkImageSubresourceRange> getP() {
	       if(p == null ){
	           p = new P<VkImageSubresourceRange> (this);
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
	 * Set method for field baseMipLevel	[int]<br>
	 * Prototype: uint32_t  baseMipLevel
	 */ 
	 public void baseMipLevel(int baseMipLevel){
		 this.baseMipLevel = baseMipLevel;
		 setBaseMipLevel0(this.ptr,  baseMipLevel);
	 }

	/**
	 * Get method for field baseMipLevel	[int]<br>
	 * Prototype: uint32_t  baseMipLevel
	 */ 
	 public int baseMipLevel(){
		 int var = getBaseMipLevel0(super.ptr);
		 this.baseMipLevel = var;
		 return this.baseMipLevel;
	 }

	/**
	 * Set method for field levelCount	[int]<br>
	 * Prototype: uint32_t  levelCount
	 */ 
	 public void levelCount(int levelCount){
		 this.levelCount = levelCount;
		 setLevelCount0(this.ptr,  levelCount);
	 }

	/**
	 * Get method for field levelCount	[int]<br>
	 * Prototype: uint32_t  levelCount
	 */ 
	 public int levelCount(){
		 int var = getLevelCount0(super.ptr);
		 this.levelCount = var;
		 return this.levelCount;
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
		  VkImageSubresourceRange* vkObj = (VkImageSubresourceRange*)(ptr);
		  vkObj->aspectMask = (VkImageAspectFlags) (_aspectMask);
	  */

	/**
	 * native GET method for field aspectMask	[int]<br>
	 * Prototype: VkImageAspectFlags  aspectMask
	 */ 
	 private static native int getAspectMask0(Buffer ptr);/*
		  VkImageSubresourceRange* vkObj = (VkImageSubresourceRange*)(ptr);
		  return (jint) (vkObj->aspectMask);
	 */

	/**
	 * native SET method for field baseMipLevel	[int]<br>
	 * Prototype: uint32_t  baseMipLevel
	 */ 
	 private static native void setBaseMipLevel0(Buffer ptr, int _baseMipLevel);/*
		  VkImageSubresourceRange* vkObj = (VkImageSubresourceRange*)(ptr);
		  vkObj->baseMipLevel = (uint32_t) (_baseMipLevel);
	  */

	/**
	 * native GET method for field baseMipLevel	[int]<br>
	 * Prototype: uint32_t  baseMipLevel
	 */ 
	 private static native int getBaseMipLevel0(Buffer ptr);/*
		  VkImageSubresourceRange* vkObj = (VkImageSubresourceRange*)(ptr);
		  return (jint) (vkObj->baseMipLevel);
	 */

	/**
	 * native SET method for field levelCount	[int]<br>
	 * Prototype: uint32_t  levelCount
	 */ 
	 private static native void setLevelCount0(Buffer ptr, int _levelCount);/*
		  VkImageSubresourceRange* vkObj = (VkImageSubresourceRange*)(ptr);
		  vkObj->levelCount = (uint32_t) (_levelCount);
	  */

	/**
	 * native GET method for field levelCount	[int]<br>
	 * Prototype: uint32_t  levelCount
	 */ 
	 private static native int getLevelCount0(Buffer ptr);/*
		  VkImageSubresourceRange* vkObj = (VkImageSubresourceRange*)(ptr);
		  return (jint) (vkObj->levelCount);
	 */

	/**
	 * native SET method for field baseArrayLayer	[int]<br>
	 * Prototype: uint32_t  baseArrayLayer
	 */ 
	 private static native void setBaseArrayLayer0(Buffer ptr, int _baseArrayLayer);/*
		  VkImageSubresourceRange* vkObj = (VkImageSubresourceRange*)(ptr);
		  vkObj->baseArrayLayer = (uint32_t) (_baseArrayLayer);
	  */

	/**
	 * native GET method for field baseArrayLayer	[int]<br>
	 * Prototype: uint32_t  baseArrayLayer
	 */ 
	 private static native int getBaseArrayLayer0(Buffer ptr);/*
		  VkImageSubresourceRange* vkObj = (VkImageSubresourceRange*)(ptr);
		  return (jint) (vkObj->baseArrayLayer);
	 */

	/**
	 * native SET method for field layerCount	[int]<br>
	 * Prototype: uint32_t  layerCount
	 */ 
	 private static native void setLayerCount0(Buffer ptr, int _layerCount);/*
		  VkImageSubresourceRange* vkObj = (VkImageSubresourceRange*)(ptr);
		  vkObj->layerCount = (uint32_t) (_layerCount);
	  */

	/**
	 * native GET method for field layerCount	[int]<br>
	 * Prototype: uint32_t  layerCount
	 */ 
	 private static native int getLayerCount0(Buffer ptr);/*
		  VkImageSubresourceRange* vkObj = (VkImageSubresourceRange*)(ptr);
		  return (jint) (vkObj->layerCount);
	 */



} // end of class VkImageSubresourceRange
