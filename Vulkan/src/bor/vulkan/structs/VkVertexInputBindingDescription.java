/**
 * Class wrapping Vulkan's VkVertexInputBindingDescription struct.
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
 *  This class is a Java front end for struct VkVertexInputBindingDescription. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkVertexInputBindingDescription {
 *     uint32_t             binding;
 *     uint32_t             stride;
 *     VkVertexInputRate    inputRate;
 * } VkVertexInputBindingDescription;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.65 (beta) 
 */
 public class VkVertexInputBindingDescription extends VkStruct {

    //@formatter:off
    /*JNI
    #include <BorVulkan.hpp>
    */  

	/** TAG of this structure [49]  */
	 private static final String TAG = "VkVertexInputBindingDescription";

	/** ID of this structure [49]  */
	 public static final int TAG_ID = VKVERTEXINPUTBINDINGDESCRIPTION_ID;

	 ///////////////////
	 // Struct fields //
	 ///////////////////
	
	/**
	 *  uint32_t 	binding	[int]
	 */ 
	int 	binding;
	
	/**
	 *  uint32_t 	stride	[int]
	 */ 
	int 	stride;
	
	/**
	 *  VkVertexInputRate 	inputRate	[vkenum]
	 */ 
	VkVertexInputRate 	inputRate;
	/**
	 * Ctor
	 */
	public VkVertexInputBindingDescription(){ 
		 super(TAG_ID);
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkVertexInputBindingDescription(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address only. Size guessed by #sizeof()
	 * @param address - native address 
	 */
	 public VkVertexInputBindingDescription(long address){ 
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
	 public static VkArray<VkVertexInputBindingDescription> createVkArray(int size){ 
		 VkVertexInputBindingDescription[] array = new VkVertexInputBindingDescription[size]; 
		 VkArrayStruct<VkVertexInputBindingDescription> vkArray = new VkArrayStruct<VkVertexInputBindingDescription> (array, TAG_ID);
		 return vkArray; 
	 } 


	 ////////////////////////
	 //  SETTERS & GETTERS //
	 ////////////////////////

	/**
	 * Set method for field binding	[int]<br>
	 * Prototype: uint32_t  binding
	 * 
	 * @param binding - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkVertexInputBindingDescription binding(int binding){
		 this.binding = binding;
		 setBinding0(this.ptr,  binding);
		 return this;
	 }

	/**
	 * Get method for field binding	[int]<br>
	 * Prototype: uint32_t  binding
	 */ 
	 public int binding(){
		 int var = getBinding0(super.ptr);
		 this.binding = var;
		 return this.binding;
	 }

	/**
	 * Set method for field stride	[int]<br>
	 * Prototype: uint32_t  stride
	 * 
	 * @param stride - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkVertexInputBindingDescription stride(int stride){
		 this.stride = stride;
		 setStride0(this.ptr,  stride);
		 return this;
	 }

	/**
	 * Get method for field stride	[int]<br>
	 * Prototype: uint32_t  stride
	 */ 
	 public int stride(){
		 int var = getStride0(super.ptr);
		 this.stride = var;
		 return this.stride;
	 }

	/**
	 * Set method for field inputRate	[vkenum]<br>
	 * Prototype: VkVertexInputRate  inputRate
	 * 
	 * @param inputRate - a instance of VkVertexInputRate.
	 * @return this VkStruct instance.
	 */ 
	 public VkVertexInputBindingDescription inputRate(VkVertexInputRate inputRate){
		 this.inputRate = inputRate;
		 int enumVal = inputRate.getValue();
		 setInputRate0(this.ptr, enumVal );
		 return this;
	 }

	/**
	 * Get method for field inputRate	[vkenum]<br>
	 * Prototype: VkVertexInputRate  inputRate
	 */ 
	 public VkVertexInputRate inputRate(){
		 int nativeVal = getInputRate0(super.ptr);
		 this.inputRate = VkVertexInputRate.fromValue(nativeVal); 
		 return this.inputRate;
	 }


   /* (non-Javadoc)
    * @see java.lang.Object#toString()
    */
    @Override
    public String toString() {
         StringBuilder builder = new StringBuilder();
         builder.append("VkVertexInputBindingDescription [ ")
				.append("binding: ").append(binding() )
				.append(",\n stride: ")
				.append(stride() )
				.append(",\n inputRate: ")
				.append(inputRate() )
				.append("]");
		 return builder.toString();
    }


	 //////////////////////////////////
	 // Native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * Native SET method for field binding	[int]<br>
	 * Prototype: uint32_t  binding
	 */ 
	 private static native void setBinding0(Buffer ptr, int _binding);/*
		  VkVertexInputBindingDescription* vkObj = (VkVertexInputBindingDescription*)(ptr);
		 // code for simple past value 
		  vkObj->binding = (uint32_t) (_binding);
	  */

	/**
	 * Native GET method for field binding	[int]<br>
	 * Prototype: uint32_t  binding
	 */ 
	 private static native int getBinding0(Buffer ptr);/*
		  VkVertexInputBindingDescription* vkObj = (VkVertexInputBindingDescription*)(ptr);
		  return (jint) (vkObj->binding);
	 */

	/**
	 * Native SET method for field stride	[int]<br>
	 * Prototype: uint32_t  stride
	 */ 
	 private static native void setStride0(Buffer ptr, int _stride);/*
		  VkVertexInputBindingDescription* vkObj = (VkVertexInputBindingDescription*)(ptr);
		 // code for simple past value 
		  vkObj->stride = (uint32_t) (_stride);
	  */

	/**
	 * Native GET method for field stride	[int]<br>
	 * Prototype: uint32_t  stride
	 */ 
	 private static native int getStride0(Buffer ptr);/*
		  VkVertexInputBindingDescription* vkObj = (VkVertexInputBindingDescription*)(ptr);
		  return (jint) (vkObj->stride);
	 */

	/**
	 * Native SET method for field inputRate	[vkenum]<br>
	 * Prototype: VkVertexInputRate  inputRate
	 */ 
	 private static native void setInputRate0(Buffer ptr, int  _inputRate);/*
		  VkVertexInputBindingDescription* vkObj = (VkVertexInputBindingDescription*)(ptr);
		 // code for simple past value 
		  vkObj->inputRate = (VkVertexInputRate) (_inputRate);
	  */

	/**
	 * Native GET method for field inputRate	[vkenum]<br>
	 * Prototype: VkVertexInputRate  inputRate
	 */ 
	 private static native int getInputRate0(Buffer ptr);/*
		  VkVertexInputBindingDescription* vkObj = (VkVertexInputBindingDescription*)(ptr);
		  // generic get for Vk enums
		  return (jint) (vkObj->inputRate);
	 */



} // end of class VkVertexInputBindingDescription
