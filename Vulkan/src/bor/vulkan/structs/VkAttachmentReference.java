/**
 * Class wrapping Vulkan's VkAttachmentReference struct.
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
 *  This class is a Java front end for struct VkAttachmentReference. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkAttachmentReference {
 *     uint32_t         attachment;
 *     VkImageLayout    layout;
 * } VkAttachmentReference;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.01 (beta) 
 */
public class VkAttachmentReference extends VkStruct {
	/** TAG of this structure [82]  */
	 private static final String TAG = "VkAttachmentReference";

	/** ID of this structure [82]  */
	 public static final int TAG_ID = VKATTACHMENTREFERENCE_ID;

	/** P wrapper for THIS object */
	 private  P<VkAttachmentReference> p;

	 ///////////////////
	 // Struct fields //
	 ///////////////////
	/**
	 *  uint32_t 	attachment	[int]
	 */ 
	 int 	attachment;

	/**
	 *  VkImageLayout 	layout	[vkenum]
	 */ 
	 VkImageLayout 	layout;

	/**
	 * Ctor
	 */
	public VkAttachmentReference(){ 
		 super(sizeOf()); 
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkAttachmentReference(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address and memSize
	 * @param address - native address 
	 * @param memSize - buffer size 
	 */
	 public VkAttachmentReference(long address, int memSize){ 
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
	 public static P<VkAttachmentReference> createNullPointer(){
	        P<VkAttachmentReference> p = new  P<VkAttachmentReference>(new VkAttachmentReference());
	        return p;
	    }


	/** 
	 * Return this VkObject instance wrapped in pointer P<br>
	 *
	 *  P&lt;? extends VkObject &gt;
	 *
	 * @return  a P container wrapping this object.
	 */
	 public P<VkAttachmentReference> getP() {
	       if(p == null ){
	           p = new P<VkAttachmentReference> (this);
	       }
	        return p;
	    }


	 ////////////////////////
	 //  SETTERS & GETTERS //
	 ////////////////////////

	/**
	 * Set method for field attachment	[int]<br>
	 * Prototype: uint32_t  attachment
	 */ 
	 public void attachment(int attachment){
		 this.attachment = attachment;
		attachment0(super.ptr, attachment);
	 }

	/**
	 * get method for field attachment	[int]<br>
	 * Prototype: uint32_t  attachment
	 */ 
	 public int attachment(){
		 // return  this.attachment;
		 return attachment0(super.ptr);
	 }

	/**
	 * Set method for field layout	[vkenum]<br>
	 * Prototype: VkImageLayout  layout
	 */ 
	 public void layout(VkImageLayout layout){
		 this.layout = layout;
		layout0(super.ptr, layout);
	 }

	/**
	 * get method for field layout	[vkenum]<br>
	 * Prototype: VkImageLayout  layout
	 */ 
	 public VkImageLayout layout(){
		 // return  this.layout;
		 return layout0(super.ptr);
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field attachment	[int]<br>
	 * Prototype: uint32_t  attachment
	 */ 
	 private static native void attachment0(ByteBuffer ptr, int _attachment);/*
		  VkAttachmentReference _obj = (VkAttachmentReference)(*ptr);
		  _obj.attachment = (uint32_t) (_attachment);
	  */

	/**
	 * native GET method for field attachment	[int]<br>
	 * Prototype: uint32_t  attachment
	 */ 
	 private static native int attachment0(ByteBuffer ptr);/*
		  VkAttachmentReference _obj = (VkAttachmentReference)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native SET method for field layout	[vkenum]<br>
	 * Prototype: VkImageLayout  layout
	 */ 
	 private static native void layout0(ByteBuffer ptr, VkImageLayout _layout);/*
		  VkAttachmentReference _obj = (VkAttachmentReference)(*ptr);
		  _obj.layout = (VkImageLayout) (_layout);
	  */

	/**
	 * native GET method for field layout	[vkenum]<br>
	 * Prototype: VkImageLayout  layout
	 */ 
	 private static native VkImageLayout layout0(ByteBuffer ptr);/*
		  VkAttachmentReference _obj = (VkAttachmentReference)(ptr);
		  return (VkImageLayout) (_obj.VkImageLayout);
	 */



} // end of class VkAttachmentReference
