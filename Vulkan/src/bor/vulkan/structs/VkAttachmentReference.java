// class wrapping Vulkan's VkAttachmentReference struct.
package bor.vulkan.structs;

import bor.vulkan.*;
import bor.vulkan.enumerations.*;
import java.nio.ByteBuffer;


/**
 *  Class for Java-Vulkan integration 
 *  This class is a Java front end for struct VkAttachmentReference 
 * @Author Alessandro Borges 
 */
public class VkAttachmentReference extends VkStruct {
	/** ID of this structure [82]  */
	 public static final int TAG = VKATTACHMENTREFERENCE_ID;

	 // fields //
	/**
	 *  uint32_t 	attachment 
	 */ 
	int 	attachment;

	/**
	 *  VkImageLayout 	layout 
	 */ 
	VkImageLayout 	layout;

	/**
	 * Ctor
	 */
	public VkAttachmentReference(){ 
		 super(sizeOf()); 
	 }

	/** 
	 * Method to get native size of this structure 
	 */
	 public static int sizeOf(){ 
		 return sizeOf(TAG); 
	}


	 // /////////////////////
	 //  SETTERS & GETTERS //
	 // /////////////////////

	/**
	 * Set method for field attachment
	 * Prototype: uint32_t  attachment
	 */ 
	 public void attachment(int attachment){
		 this.attachment = attachment;
		attachment0(super.ptr, attachment);
	 }

	/**
	 * get method for field attachment
	 * Prototype: uint32_t  attachment
	 */ 
	 public int attachment(){
		 // return  this.attachment;
		 return attachment0(super.ptr);
	 }

	/**
	 * Set method for field layout
	 * Prototype: VkImageLayout  layout
	 */ 
	 public void layout(VkImageLayout layout){
		 this.layout = layout;
		layout0(super.ptr, layout);
	 }

	/**
	 * get method for field layout
	 * Prototype: VkImageLayout  layout
	 */ 
	 public VkImageLayout layout(){
		 // return  this.layout;
		 return layout0(super.ptr);
	 }


	 // ////////////////////////////////
	 // native SETTERS & GETTERS //
	 // ////////////////////////////////
	/**
	 * native Set method for field attachment
	 * Prototype: uint32_t  attachment
	 */ 
	 private static native void attachment0(ByteBuffer ptr, int _attachment);/*
		  VkAttachmentReference _obj = (VkAttachmentReference)(*ptr);
		  _obj.attachment = (uint32_t) (_attachment);
	  */

	/**
	 * get method for field attachment
	 * Prototype: uint32_t  attachment
	 */ 
	 private static native int attachment0(ByteBuffer ptr);/*
		  VkAttachmentReference _obj = (VkAttachmentReference)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native Set method for field layout
	 * Prototype: VkImageLayout  layout
	 */ 
	 private static native void layout0(ByteBuffer ptr, VkImageLayout _layout);/*
		  VkAttachmentReference _obj = (VkAttachmentReference)(*ptr);
		  _obj.layout = (VkImageLayout) (_layout);
	  */

	/**
	 * get method for field layout
	 * Prototype: VkImageLayout  layout
	 */ 
	 private static native VkImageLayout layout0(ByteBuffer ptr);/*
		  VkAttachmentReference _obj = (VkAttachmentReference)(ptr);
		  return (VkImageLayout) (_obj.VkImageLayout);
	 */



} // end of class VkAttachmentReference
