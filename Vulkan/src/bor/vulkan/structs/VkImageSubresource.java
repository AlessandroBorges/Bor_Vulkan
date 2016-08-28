/**
 * Class wrapping Vulkan's VkImageSubresource struct.
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
 * @version Ver. 0.8.65 (beta) 
 */
 public class VkImageSubresource extends VkStruct {

    //@formatter:off
    /*JNI
    #include <BorVulkan.hpp>
    */  

	/** TAG of this structure [28]  */
	 private static final String TAG = "VkImageSubresource";

	/** ID of this structure [28]  */
	 public static final int TAG_ID = VKIMAGESUBRESOURCE_ID;

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
		 super(TAG_ID);
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkImageSubresource(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
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
	 * Get ID of this structure 
	 */
	 public static int getID(){ 
		 return TAG_ID; 
	}

	/** 
	 * Static method to create a VkArray for this VkStruct subclass.
	 * @param size - number of elements
	 */
	 public static VkArray<VkImageSubresource> createVkArray(int size){ 
		 VkImageSubresource[] array = new VkImageSubresource[size]; 
		 VkArrayStruct<VkImageSubresource> vkArray = new VkArrayStruct<VkImageSubresource> (array, TAG_ID);
		 return vkArray; 
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
	 public VkImageSubresource aspectMask(int aspectMask){
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
	 public VkImageSubresource mipLevel(int mipLevel){
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
	 * Set method for field arrayLayer	[int]<br>
	 * Prototype: uint32_t  arrayLayer
	 * 
	 * @param arrayLayer - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkImageSubresource arrayLayer(int arrayLayer){
		 this.arrayLayer = arrayLayer;
		 setArrayLayer0(this.ptr,  arrayLayer);
		 return this;
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


   /* (non-Javadoc)
    * @see java.lang.Object#toString()
    */
    @Override
    public String toString() {
         StringBuilder builder = new StringBuilder();
         builder.append("VkImageSubresource [ ")
				.append("aspectMask: ").append(aspectMask() )
				.append(",\n mipLevel: ")
				.append(mipLevel() )
				.append(",\n arrayLayer: ")
				.append(arrayLayer() )
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
		  VkImageSubresource* vkObj = (VkImageSubresource*)(ptr);
		 // code for simple past value 
		  vkObj->aspectMask = (VkImageAspectFlags) (_aspectMask);
	  */

	/**
	 * Native GET method for field aspectMask	[int]<br>
	 * Prototype: VkImageAspectFlags  aspectMask
	 */ 
	 private static native int getAspectMask0(Buffer ptr);/*
		  VkImageSubresource* vkObj = (VkImageSubresource*)(ptr);
		  return (jint) (vkObj->aspectMask);
	 */

	/**
	 * Native SET method for field mipLevel	[int]<br>
	 * Prototype: uint32_t  mipLevel
	 */ 
	 private static native void setMipLevel0(Buffer ptr, int _mipLevel);/*
		  VkImageSubresource* vkObj = (VkImageSubresource*)(ptr);
		 // code for simple past value 
		  vkObj->mipLevel = (uint32_t) (_mipLevel);
	  */

	/**
	 * Native GET method for field mipLevel	[int]<br>
	 * Prototype: uint32_t  mipLevel
	 */ 
	 private static native int getMipLevel0(Buffer ptr);/*
		  VkImageSubresource* vkObj = (VkImageSubresource*)(ptr);
		  return (jint) (vkObj->mipLevel);
	 */

	/**
	 * Native SET method for field arrayLayer	[int]<br>
	 * Prototype: uint32_t  arrayLayer
	 */ 
	 private static native void setArrayLayer0(Buffer ptr, int _arrayLayer);/*
		  VkImageSubresource* vkObj = (VkImageSubresource*)(ptr);
		 // code for simple past value 
		  vkObj->arrayLayer = (uint32_t) (_arrayLayer);
	  */

	/**
	 * Native GET method for field arrayLayer	[int]<br>
	 * Prototype: uint32_t  arrayLayer
	 */ 
	 private static native int getArrayLayer0(Buffer ptr);/*
		  VkImageSubresource* vkObj = (VkImageSubresource*)(ptr);
		  return (jint) (vkObj->arrayLayer);
	 */



} // end of class VkImageSubresource
