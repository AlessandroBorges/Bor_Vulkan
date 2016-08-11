/**
 * Class wrapping Vulkan's VkImageSubresourceLayers struct.
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
 * @version Ver. 0.8.65 (beta) 
 */
 public class VkImageSubresourceLayers extends VkStruct {

    //@formatter:off
    /*JNI
    #include <BorVulkan.hpp>
    */  

	/** TAG of this structure [91]  */
	 private static final String TAG = "VkImageSubresourceLayers";

	/** ID of this structure [91]  */
	 public static final int TAG_ID = VKIMAGESUBRESOURCELAYERS_ID;

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
		 super(TAG_ID);
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkImageSubresourceLayers(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
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
	 public VkImageSubresourceLayers aspectMask(int aspectMask){
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
	 * Set method for field mipLevel	[int]<br>
	 * Prototype: uint32_t  mipLevel
	 * 
	 * @param mipLevel - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkImageSubresourceLayers mipLevel(int mipLevel){
		 this.mipLevel = mipLevel;
		 setMipLevel0(this.ptr,  mipLevel);
		 return this;
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
	 * 
	 * @param baseArrayLayer - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkImageSubresourceLayers baseArrayLayer(int baseArrayLayer){
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
	 public VkImageSubresourceLayers layerCount(int layerCount){
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
         builder.append("VkImageSubresourceLayers [ ")
				.append("aspectMask: ").append(aspectMask() )
				.append(",\n mipLevel: ")
				.append(mipLevel() )
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
		  VkImageSubresourceLayers* vkObj = (VkImageSubresourceLayers*)(ptr);
		 // code for simple past value 
		  vkObj->aspectMask = (VkImageAspectFlags) (_aspectMask);
	  */

	/**
	 * Native GET method for field aspectMask	[int]<br>
	 * Prototype: VkImageAspectFlags  aspectMask
	 */ 
	 private static native int getAspectMask0(Buffer ptr);/*
		  VkImageSubresourceLayers* vkObj = (VkImageSubresourceLayers*)(ptr);
		  return (jint) (vkObj->aspectMask);
	 */

	/**
	 * Native SET method for field mipLevel	[int]<br>
	 * Prototype: uint32_t  mipLevel
	 */ 
	 private static native void setMipLevel0(Buffer ptr, int _mipLevel);/*
		  VkImageSubresourceLayers* vkObj = (VkImageSubresourceLayers*)(ptr);
		 // code for simple past value 
		  vkObj->mipLevel = (uint32_t) (_mipLevel);
	  */

	/**
	 * Native GET method for field mipLevel	[int]<br>
	 * Prototype: uint32_t  mipLevel
	 */ 
	 private static native int getMipLevel0(Buffer ptr);/*
		  VkImageSubresourceLayers* vkObj = (VkImageSubresourceLayers*)(ptr);
		  return (jint) (vkObj->mipLevel);
	 */

	/**
	 * Native SET method for field baseArrayLayer	[int]<br>
	 * Prototype: uint32_t  baseArrayLayer
	 */ 
	 private static native void setBaseArrayLayer0(Buffer ptr, int _baseArrayLayer);/*
		  VkImageSubresourceLayers* vkObj = (VkImageSubresourceLayers*)(ptr);
		 // code for simple past value 
		  vkObj->baseArrayLayer = (uint32_t) (_baseArrayLayer);
	  */

	/**
	 * Native GET method for field baseArrayLayer	[int]<br>
	 * Prototype: uint32_t  baseArrayLayer
	 */ 
	 private static native int getBaseArrayLayer0(Buffer ptr);/*
		  VkImageSubresourceLayers* vkObj = (VkImageSubresourceLayers*)(ptr);
		  return (jint) (vkObj->baseArrayLayer);
	 */

	/**
	 * Native SET method for field layerCount	[int]<br>
	 * Prototype: uint32_t  layerCount
	 */ 
	 private static native void setLayerCount0(Buffer ptr, int _layerCount);/*
		  VkImageSubresourceLayers* vkObj = (VkImageSubresourceLayers*)(ptr);
		 // code for simple past value 
		  vkObj->layerCount = (uint32_t) (_layerCount);
	  */

	/**
	 * Native GET method for field layerCount	[int]<br>
	 * Prototype: uint32_t  layerCount
	 */ 
	 private static native int getLayerCount0(Buffer ptr);/*
		  VkImageSubresourceLayers* vkObj = (VkImageSubresourceLayers*)(ptr);
		  return (jint) (vkObj->layerCount);
	 */



} // end of class VkImageSubresourceLayers
