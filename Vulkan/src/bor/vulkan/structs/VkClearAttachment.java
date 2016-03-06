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

	 // fields //
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
	 public VkClearAttachment(long address, int memSize){ 
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
	 public static P<VkClearAttachment> createNullPointer(){
	        P<VkClearAttachment> p = new  P<VkClearAttachment>(new VkClearAttachment());
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
	 * Set method for field colorAttachment	[int]<br>
	 * Prototype: uint32_t  colorAttachment
	 */ 
	 public void colorAttachment(int colorAttachment){
		 this.colorAttachment = colorAttachment;
		colorAttachment0(super.ptr, colorAttachment);
	 }

	/**
	 * get method for field colorAttachment	[int]<br>
	 * Prototype: uint32_t  colorAttachment
	 */ 
	 public int colorAttachment(){
		 // return  this.colorAttachment;
		 return colorAttachment0(super.ptr);
	 }

	/**
	 * Set method for field clearValue	[vkstruct]<br>
	 * Prototype: VkClearValue  clearValue
	 */ 
	 public void clearValue(VkClearValue clearValue){
		 this.clearValue = clearValue;
		clearValue0(super.ptr, clearValue);
	 }

	/**
	 * get method for field clearValue	[vkstruct]<br>
	 * Prototype: VkClearValue  clearValue
	 */ 
	 public VkClearValue clearValue(){
		 // return  this.clearValue;
		 return clearValue0(super.ptr);
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field aspectMask	[int]<br>
	 * Prototype: VkImageAspectFlags  aspectMask
	 */ 
	 private static native void aspectMask0(ByteBuffer ptr, int _aspectMask);/*
		  VkClearAttachment _obj = (VkClearAttachment)(*ptr);
		  _obj.aspectMask = (VkImageAspectFlags) (_aspectMask);
	  */

	/**
	 * native GET method for field aspectMask	[int]<br>
	 * Prototype: VkImageAspectFlags  aspectMask
	 */ 
	 private static native int aspectMask0(ByteBuffer ptr);/*
		  VkClearAttachment _obj = (VkClearAttachment)(ptr);
		  return (jint) (_obj.VkImageAspectFlags);
	 */

	/**
	 * native SET method for field colorAttachment	[int]<br>
	 * Prototype: uint32_t  colorAttachment
	 */ 
	 private static native void colorAttachment0(ByteBuffer ptr, int _colorAttachment);/*
		  VkClearAttachment _obj = (VkClearAttachment)(*ptr);
		  _obj.colorAttachment = (uint32_t) (_colorAttachment);
	  */

	/**
	 * native GET method for field colorAttachment	[int]<br>
	 * Prototype: uint32_t  colorAttachment
	 */ 
	 private static native int colorAttachment0(ByteBuffer ptr);/*
		  VkClearAttachment _obj = (VkClearAttachment)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native SET method for field clearValue	[vkstruct]<br>
	 * Prototype: VkClearValue  clearValue
	 */ 
	 private static native void clearValue0(ByteBuffer ptr, VkClearValue _clearValue);/*
		  VkClearAttachment _obj = (VkClearAttachment)(*ptr);
		  _obj.clearValue = (VkClearValue) (_clearValue);
	  */

	/**
	 * native GET method for field clearValue	[vkstruct]<br>
	 * Prototype: VkClearValue  clearValue
	 */ 
	 private static native VkClearValue clearValue0(ByteBuffer ptr);/*
		  VkClearAttachment _obj = (VkClearAttachment)(ptr);
		  return (VkClearValue) (_obj.VkClearValue);
	 */



} // end of class VkClearAttachment
