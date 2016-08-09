/**
 * Class wrapping Vulkan's VkImageSubresourceRange struct.
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
 * @version Ver. 0.8.65 (beta) 
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
		 super(TAG_ID);
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkImageSubresourceRange(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
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
	 * Get ID of this structure 
	 */
	 public static int getID(){ 
		 return TAG_ID; 
	}

	 ////////////////////////
	 //  SETTERS & GETTERS //
	 ////////////////////////

	/**
	 * Set method for field aspectMask	[int]<br>
	 * Prototype: VkImageAspectFlags  aspectMask
	 * 
	 * @param aspectMask - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkImageSubresourceRange aspectMask(int aspectMask){
		 this.aspectMask = aspectMask;
		 setAspectMask0(this.ptr,  aspectMask);
		 return this;
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
	 * 
	 * @param baseMipLevel - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkImageSubresourceRange baseMipLevel(int baseMipLevel){
		 this.baseMipLevel = baseMipLevel;
		 setBaseMipLevel0(this.ptr,  baseMipLevel);
		 return this;
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
	 * 
	 * @param levelCount - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkImageSubresourceRange levelCount(int levelCount){
		 this.levelCount = levelCount;
		 setLevelCount0(this.ptr,  levelCount);
		 return this;
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
	 * 
	 * @param baseArrayLayer - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkImageSubresourceRange baseArrayLayer(int baseArrayLayer){
		 this.baseArrayLayer = baseArrayLayer;
		 setBaseArrayLayer0(this.ptr,  baseArrayLayer);
		 return this;
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
	 * 
	 * @param layerCount - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkImageSubresourceRange layerCount(int layerCount){
		 this.layerCount = layerCount;
		 setLayerCount0(this.ptr,  layerCount);
		 return this;
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


   /* (non-Javadoc)
    * @see java.lang.Object#toString()
    */
    @Override
    public String toString() {
         StringBuilder builder = new StringBuilder();
         builder.append("VkImageSubresourceRange [ ")
				.append("aspectMask: ").append(aspectMask() )
				.append(",\n baseMipLevel: ")
				.append(baseMipLevel() )
				.append(",\n levelCount: ")
				.append(levelCount() )
				.append(",\n baseArrayLayer: ")
				.append(baseArrayLayer() )
				.append(",\n layerCount: ")
				.append(layerCount() )
				.append("]");
		 return builder.toString();
    }


	 //////////////////////////////////
	 // Native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * Native SET method for field aspectMask	[int]<br>
	 * Prototype: VkImageAspectFlags  aspectMask
	 */ 
	 private static native void setAspectMask0(Buffer ptr, int _aspectMask);/*
		  VkImageSubresourceRange* vkObj = (VkImageSubresourceRange*)(ptr);
		  vkObj->aspectMask = (VkImageAspectFlags) (_aspectMask);
	  */

	/**
	 * Native GET method for field aspectMask	[int]<br>
	 * Prototype: VkImageAspectFlags  aspectMask
	 */ 
	 private static native int getAspectMask0(Buffer ptr);/*
		  VkImageSubresourceRange* vkObj = (VkImageSubresourceRange*)(ptr);
		  return (jint) (vkObj->aspectMask);
	 */

	/**
	 * Native SET method for field baseMipLevel	[int]<br>
	 * Prototype: uint32_t  baseMipLevel
	 */ 
	 private static native void setBaseMipLevel0(Buffer ptr, int _baseMipLevel);/*
		  VkImageSubresourceRange* vkObj = (VkImageSubresourceRange*)(ptr);
		  vkObj->baseMipLevel = (uint32_t) (_baseMipLevel);
	  */

	/**
	 * Native GET method for field baseMipLevel	[int]<br>
	 * Prototype: uint32_t  baseMipLevel
	 */ 
	 private static native int getBaseMipLevel0(Buffer ptr);/*
		  VkImageSubresourceRange* vkObj = (VkImageSubresourceRange*)(ptr);
		  return (jint) (vkObj->baseMipLevel);
	 */

	/**
	 * Native SET method for field levelCount	[int]<br>
	 * Prototype: uint32_t  levelCount
	 */ 
	 private static native void setLevelCount0(Buffer ptr, int _levelCount);/*
		  VkImageSubresourceRange* vkObj = (VkImageSubresourceRange*)(ptr);
		  vkObj->levelCount = (uint32_t) (_levelCount);
	  */

	/**
	 * Native GET method for field levelCount	[int]<br>
	 * Prototype: uint32_t  levelCount
	 */ 
	 private static native int getLevelCount0(Buffer ptr);/*
		  VkImageSubresourceRange* vkObj = (VkImageSubresourceRange*)(ptr);
		  return (jint) (vkObj->levelCount);
	 */

	/**
	 * Native SET method for field baseArrayLayer	[int]<br>
	 * Prototype: uint32_t  baseArrayLayer
	 */ 
	 private static native void setBaseArrayLayer0(Buffer ptr, int _baseArrayLayer);/*
		  VkImageSubresourceRange* vkObj = (VkImageSubresourceRange*)(ptr);
		  vkObj->baseArrayLayer = (uint32_t) (_baseArrayLayer);
	  */

	/**
	 * Native GET method for field baseArrayLayer	[int]<br>
	 * Prototype: uint32_t  baseArrayLayer
	 */ 
	 private static native int getBaseArrayLayer0(Buffer ptr);/*
		  VkImageSubresourceRange* vkObj = (VkImageSubresourceRange*)(ptr);
		  return (jint) (vkObj->baseArrayLayer);
	 */

	/**
	 * Native SET method for field layerCount	[int]<br>
	 * Prototype: uint32_t  layerCount
	 */ 
	 private static native void setLayerCount0(Buffer ptr, int _layerCount);/*
		  VkImageSubresourceRange* vkObj = (VkImageSubresourceRange*)(ptr);
		  vkObj->layerCount = (uint32_t) (_layerCount);
	  */

	/**
	 * Native GET method for field layerCount	[int]<br>
	 * Prototype: uint32_t  layerCount
	 */ 
	 private static native int getLayerCount0(Buffer ptr);/*
		  VkImageSubresourceRange* vkObj = (VkImageSubresourceRange*)(ptr);
		  return (jint) (vkObj->layerCount);
	 */



} // end of class VkImageSubresourceRange
