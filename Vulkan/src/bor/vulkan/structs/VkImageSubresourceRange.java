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
	 public VkImageSubresourceRange(long address, int memSize){ 
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
	 * Set method for field baseMipLevel	[int]<br>
	 * Prototype: uint32_t  baseMipLevel
	 */ 
	 public void baseMipLevel(int baseMipLevel){
		 this.baseMipLevel = baseMipLevel;
		baseMipLevel0(super.ptr, baseMipLevel);
	 }

	/**
	 * get method for field baseMipLevel	[int]<br>
	 * Prototype: uint32_t  baseMipLevel
	 */ 
	 public int baseMipLevel(){
		 // return  this.baseMipLevel;
		 return baseMipLevel0(super.ptr);
	 }

	/**
	 * Set method for field levelCount	[int]<br>
	 * Prototype: uint32_t  levelCount
	 */ 
	 public void levelCount(int levelCount){
		 this.levelCount = levelCount;
		levelCount0(super.ptr, levelCount);
	 }

	/**
	 * get method for field levelCount	[int]<br>
	 * Prototype: uint32_t  levelCount
	 */ 
	 public int levelCount(){
		 // return  this.levelCount;
		 return levelCount0(super.ptr);
	 }

	/**
	 * Set method for field baseArrayLayer	[int]<br>
	 * Prototype: uint32_t  baseArrayLayer
	 */ 
	 public void baseArrayLayer(int baseArrayLayer){
		 this.baseArrayLayer = baseArrayLayer;
		baseArrayLayer0(super.ptr, baseArrayLayer);
	 }

	/**
	 * get method for field baseArrayLayer	[int]<br>
	 * Prototype: uint32_t  baseArrayLayer
	 */ 
	 public int baseArrayLayer(){
		 // return  this.baseArrayLayer;
		 return baseArrayLayer0(super.ptr);
	 }

	/**
	 * Set method for field layerCount	[int]<br>
	 * Prototype: uint32_t  layerCount
	 */ 
	 public void layerCount(int layerCount){
		 this.layerCount = layerCount;
		layerCount0(super.ptr, layerCount);
	 }

	/**
	 * get method for field layerCount	[int]<br>
	 * Prototype: uint32_t  layerCount
	 */ 
	 public int layerCount(){
		 // return  this.layerCount;
		 return layerCount0(super.ptr);
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field aspectMask	[int]<br>
	 * Prototype: VkImageAspectFlags  aspectMask
	 */ 
	 private static native void aspectMask0(ByteBuffer ptr, int _aspectMask);/*
		  VkImageSubresourceRange _obj = (VkImageSubresourceRange)(*ptr);
		  _obj.aspectMask = (VkImageAspectFlags) (_aspectMask);
	  */

	/**
	 * native GET method for field aspectMask	[int]<br>
	 * Prototype: VkImageAspectFlags  aspectMask
	 */ 
	 private static native int aspectMask0(ByteBuffer ptr);/*
		  VkImageSubresourceRange _obj = (VkImageSubresourceRange)(ptr);
		  return (jint) (_obj.VkImageAspectFlags);
	 */

	/**
	 * native SET method for field baseMipLevel	[int]<br>
	 * Prototype: uint32_t  baseMipLevel
	 */ 
	 private static native void baseMipLevel0(ByteBuffer ptr, int _baseMipLevel);/*
		  VkImageSubresourceRange _obj = (VkImageSubresourceRange)(*ptr);
		  _obj.baseMipLevel = (uint32_t) (_baseMipLevel);
	  */

	/**
	 * native GET method for field baseMipLevel	[int]<br>
	 * Prototype: uint32_t  baseMipLevel
	 */ 
	 private static native int baseMipLevel0(ByteBuffer ptr);/*
		  VkImageSubresourceRange _obj = (VkImageSubresourceRange)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native SET method for field levelCount	[int]<br>
	 * Prototype: uint32_t  levelCount
	 */ 
	 private static native void levelCount0(ByteBuffer ptr, int _levelCount);/*
		  VkImageSubresourceRange _obj = (VkImageSubresourceRange)(*ptr);
		  _obj.levelCount = (uint32_t) (_levelCount);
	  */

	/**
	 * native GET method for field levelCount	[int]<br>
	 * Prototype: uint32_t  levelCount
	 */ 
	 private static native int levelCount0(ByteBuffer ptr);/*
		  VkImageSubresourceRange _obj = (VkImageSubresourceRange)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native SET method for field baseArrayLayer	[int]<br>
	 * Prototype: uint32_t  baseArrayLayer
	 */ 
	 private static native void baseArrayLayer0(ByteBuffer ptr, int _baseArrayLayer);/*
		  VkImageSubresourceRange _obj = (VkImageSubresourceRange)(*ptr);
		  _obj.baseArrayLayer = (uint32_t) (_baseArrayLayer);
	  */

	/**
	 * native GET method for field baseArrayLayer	[int]<br>
	 * Prototype: uint32_t  baseArrayLayer
	 */ 
	 private static native int baseArrayLayer0(ByteBuffer ptr);/*
		  VkImageSubresourceRange _obj = (VkImageSubresourceRange)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native SET method for field layerCount	[int]<br>
	 * Prototype: uint32_t  layerCount
	 */ 
	 private static native void layerCount0(ByteBuffer ptr, int _layerCount);/*
		  VkImageSubresourceRange _obj = (VkImageSubresourceRange)(*ptr);
		  _obj.layerCount = (uint32_t) (_layerCount);
	  */

	/**
	 * native GET method for field layerCount	[int]<br>
	 * Prototype: uint32_t  layerCount
	 */ 
	 private static native int layerCount0(ByteBuffer ptr);/*
		  VkImageSubresourceRange _obj = (VkImageSubresourceRange)(ptr);
		  return (jint) (_obj.uint32_t);
	 */



} // end of class VkImageSubresourceRange
