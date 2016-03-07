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
	 public VkImageSubresource(long address, int memSize){ 
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
	 * Set method for field mipLevel	[int]<br>
	 * Prototype: uint32_t  mipLevel
	 */ 
	 public void mipLevel(int mipLevel){
		 this.mipLevel = mipLevel;
		mipLevel0(super.ptr, mipLevel);
	 }

	/**
	 * get method for field mipLevel	[int]<br>
	 * Prototype: uint32_t  mipLevel
	 */ 
	 public int mipLevel(){
		 // return  this.mipLevel;
		 return mipLevel0(super.ptr);
	 }

	/**
	 * Set method for field arrayLayer	[int]<br>
	 * Prototype: uint32_t  arrayLayer
	 */ 
	 public void arrayLayer(int arrayLayer){
		 this.arrayLayer = arrayLayer;
		arrayLayer0(super.ptr, arrayLayer);
	 }

	/**
	 * get method for field arrayLayer	[int]<br>
	 * Prototype: uint32_t  arrayLayer
	 */ 
	 public int arrayLayer(){
		 // return  this.arrayLayer;
		 return arrayLayer0(super.ptr);
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field aspectMask	[int]<br>
	 * Prototype: VkImageAspectFlags  aspectMask
	 */ 
	 private static native void aspectMask0(ByteBuffer ptr, int _aspectMask);/*
		  VkImageSubresource _obj = (VkImageSubresource)(*ptr);
		  _obj.aspectMask = (VkImageAspectFlags) (_aspectMask);
	  */

	/**
	 * native GET method for field aspectMask	[int]<br>
	 * Prototype: VkImageAspectFlags  aspectMask
	 */ 
	 private static native int aspectMask0(ByteBuffer ptr);/*
		  VkImageSubresource _obj = (VkImageSubresource)(ptr);
		  return (jint) (_obj.VkImageAspectFlags);
	 */

	/**
	 * native SET method for field mipLevel	[int]<br>
	 * Prototype: uint32_t  mipLevel
	 */ 
	 private static native void mipLevel0(ByteBuffer ptr, int _mipLevel);/*
		  VkImageSubresource _obj = (VkImageSubresource)(*ptr);
		  _obj.mipLevel = (uint32_t) (_mipLevel);
	  */

	/**
	 * native GET method for field mipLevel	[int]<br>
	 * Prototype: uint32_t  mipLevel
	 */ 
	 private static native int mipLevel0(ByteBuffer ptr);/*
		  VkImageSubresource _obj = (VkImageSubresource)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native SET method for field arrayLayer	[int]<br>
	 * Prototype: uint32_t  arrayLayer
	 */ 
	 private static native void arrayLayer0(ByteBuffer ptr, int _arrayLayer);/*
		  VkImageSubresource _obj = (VkImageSubresource)(*ptr);
		  _obj.arrayLayer = (uint32_t) (_arrayLayer);
	  */

	/**
	 * native GET method for field arrayLayer	[int]<br>
	 * Prototype: uint32_t  arrayLayer
	 */ 
	 private static native int arrayLayer0(ByteBuffer ptr);/*
		  VkImageSubresource _obj = (VkImageSubresource)(ptr);
		  return (jint) (_obj.uint32_t);
	 */



} // end of class VkImageSubresource
