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


/**
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
	/** TAG of this structure [220]  */
	 private static final String TAG = "VkClearAttachment";

	/** ID of this structure [220]  */
	 public static final int TAG_ID = VKCLEARATTACHMENT_ID;

	 // fields //
	/**
	 *  VkImageAspectFlags 	aspectMask 
	 */ 
	int 	aspectMask;

	/**
	 *  uint32_t 	colorAttachment 
	 */ 
	int 	colorAttachment;

	/**
	 *  VkClearValue 	clearValue 
	 */ 
	VkClearValue 	clearValue;

	/**
	 * Ctor
	 */
	public VkClearAttachment(){ 
		 super(sizeOf()); 
	 }

	/** 
	 * Method to get native size of this structure 
	 */
	 public static int sizeOf(){ 
		 return sizeOf(TAG_ID); 
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
	 * Set method for field colorAttachment
	 * Prototype: uint32_t  colorAttachment
	 */ 
	 public void colorAttachment(int colorAttachment){
		 this.colorAttachment = colorAttachment;
		colorAttachment0(super.ptr, colorAttachment);
	 }

	/**
	 * get method for field colorAttachment
	 * Prototype: uint32_t  colorAttachment
	 */ 
	 public int colorAttachment(){
		 // return  this.colorAttachment;
		 return colorAttachment0(super.ptr);
	 }

	/**
	 * Set method for field clearValue
	 * Prototype: VkClearValue  clearValue
	 */ 
	 public void clearValue(VkClearValue clearValue){
		 this.clearValue = clearValue;
		clearValue0(super.ptr, clearValue);
	 }

	/**
	 * get method for field clearValue
	 * Prototype: VkClearValue  clearValue
	 */ 
	 public VkClearValue clearValue(){
		 // return  this.clearValue;
		 return clearValue0(super.ptr);
	 }


	 // ////////////////////////////////
	 // native SETTERS & GETTERS //
	 // ////////////////////////////////
	/**
	 * native Set method for field aspectMask
	 * Prototype: VkImageAspectFlags  aspectMask
	 */ 
	 private static native void aspectMask0(ByteBuffer ptr, int _aspectMask);/*
		  VkClearAttachment _obj = (VkClearAttachment)(*ptr);
		  _obj.aspectMask = (VkImageAspectFlags) (_aspectMask);
	  */

	/**
	 * get method for field aspectMask
	 * Prototype: VkImageAspectFlags  aspectMask
	 */ 
	 private static native int aspectMask0(ByteBuffer ptr);/*
		  VkClearAttachment _obj = (VkClearAttachment)(ptr);
		  return (jint) (_obj.VkImageAspectFlags);
	 */

	/**
	 * native Set method for field colorAttachment
	 * Prototype: uint32_t  colorAttachment
	 */ 
	 private static native void colorAttachment0(ByteBuffer ptr, int _colorAttachment);/*
		  VkClearAttachment _obj = (VkClearAttachment)(*ptr);
		  _obj.colorAttachment = (uint32_t) (_colorAttachment);
	  */

	/**
	 * get method for field colorAttachment
	 * Prototype: uint32_t  colorAttachment
	 */ 
	 private static native int colorAttachment0(ByteBuffer ptr);/*
		  VkClearAttachment _obj = (VkClearAttachment)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native Set method for field clearValue
	 * Prototype: VkClearValue  clearValue
	 */ 
	 private static native void clearValue0(ByteBuffer ptr, VkClearValue _clearValue);/*
		  VkClearAttachment _obj = (VkClearAttachment)(*ptr);
		  _obj.clearValue = (VkClearValue) (_clearValue);
	  */

	/**
	 * get method for field clearValue
	 * Prototype: VkClearValue  clearValue
	 */ 
	 private static native VkClearValue clearValue0(ByteBuffer ptr);/*
		  VkClearAttachment _obj = (VkClearAttachment)(ptr);
		  return (VkClearValue) (_obj.VkClearValue);
	 */



} // end of class VkClearAttachment
