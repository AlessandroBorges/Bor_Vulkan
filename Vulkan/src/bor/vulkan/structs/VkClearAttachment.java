/**
 * Class wrapping Vulkan's VkClearAttachment struct.
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
 *  This class is a Java front end for struct VkClearAttachment. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkClearAttachment {
 *     VkImageAspectFlags    aspectMask;
 *     uint32_t              colorAttachment;
 *     VkClearValue          clearValue;
 * } VkClearAttachment;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.01 (beta) 
 */
public class VkClearAttachment extends VkStruct {
	/** TAG of this structure [96]  */
	 private static final String TAG = "VkClearAttachment";

	/** ID of this structure [96]  */
	 public static final int TAG_ID = VKCLEARATTACHMENT_ID;

	/** P wrapper for THIS object */
	 private  P<VkClearAttachment> p;

	 ///////////////////
	 // Struct fields //
	 ///////////////////
	/**
	 *  VkImageAspectFlags 	aspectMask	[int]
	 */ 
	 int 	aspectMask;

	/**
	 *  uint32_t 	colorAttachment	[int]
	 */ 
	 int 	colorAttachment;

	/**
	 *  VkClearValue 	clearValue	[vkstruct]
	 */ 
	 VkClearValue 	clearValue;

	/**
	 * Ctor
	 */
	public VkClearAttachment(){ 
		 super(sizeOf()); 
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkClearAttachment(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address and memSize
	 * @param address - native address 
	 * @param memSize - buffer size 
	 */
	 public VkClearAttachment(long address , int memSize){ 
		 super(address, memSize); 
	 }

	/**
	 * Ctor with Address only. Size guessed by #sizeof()
	 * @param address - native address 
	 */
	 public VkClearAttachment(long address){ 
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
	 public static P<VkClearAttachment> createNullPointer(){
	        P<VkClearAttachment> p = new  P<VkClearAttachment>(new VkClearAttachment());
	        return p;
	    }


	/** 
	 * Return this VkObject instance wrapped in pointer P<br>
	 *
	 *  P&lt;? extends VkObject &gt;
	 *
	 * @return  a P container wrapping this object.
	 */
	 public P<VkClearAttachment> getP() {
	       if(p == null ){
	           p = new P<VkClearAttachment> (this);
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
	 * Set method for field colorAttachment	[int]<br>
	 * Prototype: uint32_t  colorAttachment
	 */ 
	 public void colorAttachment(int colorAttachment){
		 this.colorAttachment = colorAttachment;
		 setColorAttachment0(this.ptr,  colorAttachment);
	 }

	/**
	 * Get method for field colorAttachment	[int]<br>
	 * Prototype: uint32_t  colorAttachment
	 */ 
	 public int colorAttachment(){
		 int var = getColorAttachment0(super.ptr);
		 this.colorAttachment = var;
		 return this.colorAttachment;
	 }

	/**
	 * Set method for field clearValue	[vkstruct]<br>
	 * Prototype: VkClearValue  clearValue
	 */ 
	 public void clearValue(VkClearValue clearValue){
		 this.clearValue = clearValue;
		 ByteBuffer buff = (clearValue==null) ? null : clearValue.getPointer();
		 setClearValue0(this.ptr, buff);
	 }

	/**
	 * Get method for field clearValue	[vkstruct]<br>
	 * Prototype: VkClearValue  clearValue
	 */ 
	 public VkClearValue clearValue(){
		 long pointer = getClearValue0(super.ptr);
		 if(pointer == 0){
		    this.clearValue = null;
		    return null;
		  } 

		 if(this.clearValue == null){
		    this.clearValue = new VkClearValue(pointer);
		 }else{
		    this.clearValue.setPointer(pointer);
		  }
		 return this.clearValue;
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field aspectMask	[int]<br>
	 * Prototype: VkImageAspectFlags  aspectMask
	 */ 
	 private static native void setAspectMask0(Buffer ptr, int _aspectMask);/*
		  VkClearAttachment* vkObj = (VkClearAttachment*)(ptr);
		  vkObj->aspectMask = (VkImageAspectFlags) (_aspectMask);
	  */

	/**
	 * native GET method for field aspectMask	[int]<br>
	 * Prototype: VkImageAspectFlags  aspectMask
	 */ 
	 private static native int getAspectMask0(Buffer ptr);/*
		  VkClearAttachment vkObj = (VkClearAttachment*)(ptr);
		  return (jint) (vkObj->aspectMask);
	 */

	/**
	 * native SET method for field colorAttachment	[int]<br>
	 * Prototype: uint32_t  colorAttachment
	 */ 
	 private static native void setColorAttachment0(Buffer ptr, int _colorAttachment);/*
		  VkClearAttachment* vkObj = (VkClearAttachment*)(ptr);
		  vkObj->colorAttachment = (uint32_t) (_colorAttachment);
	  */

	/**
	 * native GET method for field colorAttachment	[int]<br>
	 * Prototype: uint32_t  colorAttachment
	 */ 
	 private static native int getColorAttachment0(Buffer ptr);/*
		  VkClearAttachment vkObj = (VkClearAttachment*)(ptr);
		  return (jint) (vkObj->colorAttachment);
	 */

	/**
	 * native SET method for field clearValue	[vkstruct]<br>
	 * Prototype: VkClearValue  clearValue
	 */ 
	 private static native void setClearValue0(Buffer ptr, java.nio.ByteBuffer  _clearValue);/*
		  VkClearAttachment* vkObj = (VkClearAttachment*)(ptr);
		  vkObj->clearValue = (VkClearValue) (_clearValue);
	  */

	/**
	 * native GET method for field clearValue	[vkstruct]<br>
	 * Prototype: VkClearValue  clearValue
	 */ 
	 private static native long getClearValue0(Buffer ptr);/*
		  VkClearAttachment vkObj = (VkClearAttachment*)(ptr);
		  return (jlong) reinterpret_cast<jlong>(vkObj->clearValue);	 */



} // end of class VkClearAttachment
