/**
 * Class wrapping Vulkan's VkClearAttachment struct.
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
 * @version Ver. 0.8.65 (beta) 
 */
 public class VkClearAttachment extends VkStruct {

    //@formatter:off
    /*JNI
    #include <BorVulkan.hpp>
    */  

	/** TAG of this structure [96]  */
	 private static final String TAG = "VkClearAttachment";

	/** ID of this structure [96]  */
	 public static final int TAG_ID = VKCLEARATTACHMENT_ID;

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
		 super(TAG_ID);
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkClearAttachment(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
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
	 * Get ID of this structure 
	 */
	 public static int getID(){ 
		 return TAG_ID; 
	}

	/** 
	 * Static method to create a VkArray for this VkStruct subclass.
	 * @param size - number of elements
	 */
	 public static VkArray<VkClearAttachment> createVkArray(int size){ 
		 VkClearAttachment[] array = new VkClearAttachment[size]; 
		 VkArrayStruct<VkClearAttachment> vkArray = new VkArrayStruct<VkClearAttachment> (array, TAG_ID);
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
	 public VkClearAttachment aspectMask(int aspectMask){
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
	 * Set method for field colorAttachment	[int]<br>
	 * Prototype: uint32_t  colorAttachment
	 * 
	 * @param colorAttachment - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkClearAttachment colorAttachment(int colorAttachment){
		 this.colorAttachment = colorAttachment;
		 setColorAttachment0(this.ptr,  colorAttachment);
		 return this;
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
	 * 
	 * @param clearValue - a instance of VkClearValue.
	 * @return this VkStruct instance.
	 */ 
	 public VkClearAttachment clearValue(VkClearValue clearValue){
		 this.clearValue = clearValue;
		 ByteBuffer buff = (clearValue==null) ? null : clearValue.getPointer();
		 setClearValue0(this.ptr, buff);
		 return this;
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


   /* (non-Javadoc)
    * @see java.lang.Object#toString()
    */
    @Override
    public String toString() {
         StringBuilder builder = new StringBuilder();
         builder.append("VkClearAttachment [ ")
				.append("aspectMask: ").append(aspectMask() )
				.append(",\n colorAttachment: ")
				.append(colorAttachment() )
				.append(",\n clearValue: ")
				.append(clearValue() )
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
		  VkClearAttachment* vkObj = (VkClearAttachment*)(ptr);
		 // code for simple past value 
		  vkObj->aspectMask = (VkImageAspectFlags) (_aspectMask);
	  */

	/**
	 * Native GET method for field aspectMask	[int]<br>
	 * Prototype: VkImageAspectFlags  aspectMask
	 */ 
	 private static native int getAspectMask0(Buffer ptr);/*
		  VkClearAttachment* vkObj = (VkClearAttachment*)(ptr);
		  return (jint) (vkObj->aspectMask);
	 */

	/**
	 * Native SET method for field colorAttachment	[int]<br>
	 * Prototype: uint32_t  colorAttachment
	 */ 
	 private static native void setColorAttachment0(Buffer ptr, int _colorAttachment);/*
		  VkClearAttachment* vkObj = (VkClearAttachment*)(ptr);
		 // code for simple past value 
		  vkObj->colorAttachment = (uint32_t) (_colorAttachment);
	  */

	/**
	 * Native GET method for field colorAttachment	[int]<br>
	 * Prototype: uint32_t  colorAttachment
	 */ 
	 private static native int getColorAttachment0(Buffer ptr);/*
		  VkClearAttachment* vkObj = (VkClearAttachment*)(ptr);
		  return (jint) (vkObj->colorAttachment);
	 */

	/**
	 * Native SET method for field clearValue	[vkstruct]<br>
	 * Prototype: VkClearValue  clearValue
	 */ 
	 private static native void setClearValue0(Buffer ptr, java.nio.ByteBuffer  _clearValue);/*
		  VkClearAttachment* vkObj = (VkClearAttachment*)(ptr);
		 // code for Buffer - ptr to struct 
		 VkClearValue* p_clearValue = (VkClearValue*) _clearValue; 
		 vkObj->clearValue = (*p_clearValue); 
	  */

	/**
	 * Native GET method for field clearValue	[vkstruct]<br>
	 * Prototype: VkClearValue  clearValue
	 */ 
	 private static native long getClearValue0(Buffer ptr);/*
		  VkClearAttachment* vkObj = (VkClearAttachment*)(ptr);
		  // generic get for Buffer 
		  return (jlong) reinterpret_cast<jlong>(&vkObj->clearValue);
	 */



} // end of class VkClearAttachment
