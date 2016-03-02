/**
 * Class wrapping Vulkan's VkVertexInputBindingDescription struct.
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
 * @version Ver. 0.8.01 (beta) 
 */
public class VkVertexInputBindingDescription extends VkStruct {
	/** TAG of this structure [173]  */
	 private static final String TAG = "VkVertexInputBindingDescription";

	/** ID of this structure [173]  */
	 public static final int TAG_ID = VKVERTEXINPUTBINDINGDESCRIPTION_ID;

	 // fields //
	/**
	 *  uint32_t 	binding 
	 */ 
	int 	binding;

	/**
	 *  uint32_t 	stride 
	 */ 
	int 	stride;

	/**
	 *  VkVertexInputRate 	inputRate 
	 */ 
	VkVertexInputRate 	inputRate;

	/**
	 * Ctor
	 */
	public VkVertexInputBindingDescription(){ 
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
	 * Set method for field binding
	 * Prototype: uint32_t  binding
	 */ 
	 public void binding(int binding){
		 this.binding = binding;
		binding0(super.ptr, binding);
	 }

	/**
	 * get method for field binding
	 * Prototype: uint32_t  binding
	 */ 
	 public int binding(){
		 // return  this.binding;
		 return binding0(super.ptr);
	 }

	/**
	 * Set method for field stride
	 * Prototype: uint32_t  stride
	 */ 
	 public void stride(int stride){
		 this.stride = stride;
		stride0(super.ptr, stride);
	 }

	/**
	 * get method for field stride
	 * Prototype: uint32_t  stride
	 */ 
	 public int stride(){
		 // return  this.stride;
		 return stride0(super.ptr);
	 }

	/**
	 * Set method for field inputRate
	 * Prototype: VkVertexInputRate  inputRate
	 */ 
	 public void inputRate(VkVertexInputRate inputRate){
		 this.inputRate = inputRate;
		inputRate0(super.ptr, inputRate);
	 }

	/**
	 * get method for field inputRate
	 * Prototype: VkVertexInputRate  inputRate
	 */ 
	 public VkVertexInputRate inputRate(){
		 // return  this.inputRate;
		 return inputRate0(super.ptr);
	 }


	 // ////////////////////////////////
	 // native SETTERS & GETTERS //
	 // ////////////////////////////////
	/**
	 * native Set method for field binding
	 * Prototype: uint32_t  binding
	 */ 
	 private static native void binding0(ByteBuffer ptr, int _binding);/*
		  VkVertexInputBindingDescription _obj = (VkVertexInputBindingDescription)(*ptr);
		  _obj.binding = (uint32_t) (_binding);
	  */

	/**
	 * get method for field binding
	 * Prototype: uint32_t  binding
	 */ 
	 private static native int binding0(ByteBuffer ptr);/*
		  VkVertexInputBindingDescription _obj = (VkVertexInputBindingDescription)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native Set method for field stride
	 * Prototype: uint32_t  stride
	 */ 
	 private static native void stride0(ByteBuffer ptr, int _stride);/*
		  VkVertexInputBindingDescription _obj = (VkVertexInputBindingDescription)(*ptr);
		  _obj.stride = (uint32_t) (_stride);
	  */

	/**
	 * get method for field stride
	 * Prototype: uint32_t  stride
	 */ 
	 private static native int stride0(ByteBuffer ptr);/*
		  VkVertexInputBindingDescription _obj = (VkVertexInputBindingDescription)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native Set method for field inputRate
	 * Prototype: VkVertexInputRate  inputRate
	 */ 
	 private static native void inputRate0(ByteBuffer ptr, VkVertexInputRate _inputRate);/*
		  VkVertexInputBindingDescription _obj = (VkVertexInputBindingDescription)(*ptr);
		  _obj.inputRate = (VkVertexInputRate) (_inputRate);
	  */

	/**
	 * get method for field inputRate
	 * Prototype: VkVertexInputRate  inputRate
	 */ 
	 private static native VkVertexInputRate inputRate0(ByteBuffer ptr);/*
		  VkVertexInputBindingDescription _obj = (VkVertexInputBindingDescription)(ptr);
		  return (VkVertexInputRate) (_obj.VkVertexInputRate);
	 */



} // end of class VkVertexInputBindingDescription
