/**
 * Class wrapping Vulkan's VkAttachmentReference struct.
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
 * @version Ver. 0.8.65 (beta) 
 */
 public class VkAttachmentReference extends VkStruct {

    //@formatter:off
    /*JNI
    #include <BorVulkan.hpp>
    */  

	/** TAG of this structure [82]  */
	 private static final String TAG = "VkAttachmentReference";

	/** ID of this structure [82]  */
	 public static final int TAG_ID = VKATTACHMENTREFERENCE_ID;

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
		 super(TAG_ID);
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkAttachmentReference(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address only. Size guessed by #sizeof()
	 * @param address - native address 
	 */
	 public VkAttachmentReference(long address){ 
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
	 * Set method for field attachment	[int]<br>
	 * Prototype: uint32_t  attachment
	 * 
	 * @param attachment - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkAttachmentReference attachment(int attachment){
		 this.attachment = attachment;
		 setAttachment0(this.ptr,  attachment);
		 return this;
	 }

	/**
	 * Get method for field attachment	[int]<br>
	 * Prototype: uint32_t  attachment
	 */ 
	 public int attachment(){
		 int var = getAttachment0(super.ptr);
		 this.attachment = var;
		 return this.attachment;
	 }

	/**
	 * Set method for field layout	[vkenum]<br>
	 * Prototype: VkImageLayout  layout
	 * 
	 * @param layout - a instance of VkImageLayout.
	 * @return this VkStruct instance.
	 */ 
	 public VkAttachmentReference layout(VkImageLayout layout){
		 this.layout = layout;
		 int enumVal = layout.getValue();
		 setLayout0(this.ptr, enumVal );
		 return this;
	 }

	/**
	 * Get method for field layout	[vkenum]<br>
	 * Prototype: VkImageLayout  layout
	 */ 
	 public VkImageLayout layout(){
		 int nativeVal = getLayout0(super.ptr);
		 this.layout = VkImageLayout.fromValue(nativeVal); 
		 return this.layout;
	 }


   /* (non-Javadoc)
    * @see java.lang.Object#toString()
    */
    @Override
    public String toString() {
         StringBuilder builder = new StringBuilder();
         builder.append("VkAttachmentReference [ ")
				.append("attachment: ").append(attachment() )
				.append(",\n layout: ")
				.append(layout() )
				.append("]");
		 return builder.toString();
    }


	 //////////////////////////////////
	 // Native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * Native SET method for field attachment	[int]<br>
	 * Prototype: uint32_t  attachment
	 */ 
	 private static native void setAttachment0(Buffer ptr, int _attachment);/*
		  VkAttachmentReference* vkObj = (VkAttachmentReference*)(ptr);
		 // code for simple past value 
		  vkObj->attachment = (uint32_t) (_attachment);
	  */

	/**
	 * Native GET method for field attachment	[int]<br>
	 * Prototype: uint32_t  attachment
	 */ 
	 private static native int getAttachment0(Buffer ptr);/*
		  VkAttachmentReference* vkObj = (VkAttachmentReference*)(ptr);
		  return (jint) (vkObj->attachment);
	 */

	/**
	 * Native SET method for field layout	[vkenum]<br>
	 * Prototype: VkImageLayout  layout
	 */ 
	 private static native void setLayout0(Buffer ptr, int  _layout);/*
		  VkAttachmentReference* vkObj = (VkAttachmentReference*)(ptr);
		 // code for simple past value 
		  vkObj->layout = (VkImageLayout) (_layout);
	  */

	/**
	 * Native GET method for field layout	[vkenum]<br>
	 * Prototype: VkImageLayout  layout
	 */ 
	 private static native int  getLayout0(Buffer ptr);/*
		  VkAttachmentReference* vkObj = (VkAttachmentReference*)(ptr);
		  return (VkImageLayout) (vkObj->layout);
	 */



} // end of class VkAttachmentReference
