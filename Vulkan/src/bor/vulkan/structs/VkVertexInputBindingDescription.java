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

import java.nio.Buffer;


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
 * @version Ver. 0.8.01 (beta) 
 */
public class VkVertexInputBindingDescription extends VkStruct {
	/** TAG of this structure [49]  */
	 private static final String TAG = "VkVertexInputBindingDescription";

	/** ID of this structure [49]  */
	 public static final int TAG_ID = VKVERTEXINPUTBINDINGDESCRIPTION_ID;

	/** P wrapper for THIS object */
	 private  P<VkVertexInputBindingDescription> p;

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
		 super(sizeOf()); 
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkVertexInputBindingDescription(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address and memSize
	 * @param address - native address 
	 * @param memSize - buffer size 
	 */
	 public VkVertexInputBindingDescription(long address, int memSize){ 
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
	 public static P<VkVertexInputBindingDescription> createNullPointer(){
	        P<VkVertexInputBindingDescription> p = new  P<VkVertexInputBindingDescription>(new VkVertexInputBindingDescription());
	        return p;
	    }


	/** 
	 * Return this VkObject instance wrapped in pointer P<br>
	 *
	 *  P&lt;? extends VkObject &gt;
	 *
	 * @return  a P container wrapping this object.
	 */
	 public P<VkVertexInputBindingDescription> getP() {
	       if(p == null ){
	           p = new P<VkVertexInputBindingDescription> (this);
	       }
	        return p;
	    }


	 ////////////////////////
	 //  SETTERS & GETTERS //
	 ////////////////////////

	/**
	 * Set method for field binding	[int]<br>
	 * Prototype: uint32_t  binding
	 */ 
	 public void binding(int binding){
		 this.binding = binding;
		 binding0(this.ptr,  binding);
	 }

	/**
	 * Get method for field binding	[int]<br>
	 * Prototype: uint32_t  binding
	 */ 
	 public int binding(){
		 int var = binding0(super.ptr);
		 this.binding = var;
		 return this.binding;
	 }

	/**
	 * Set method for field stride	[int]<br>
	 * Prototype: uint32_t  stride
	 */ 
	 public void stride(int stride){
		 this.stride = stride;
		 stride0(this.ptr,  stride);
	 }

	/**
	 * Get method for field stride	[int]<br>
	 * Prototype: uint32_t  stride
	 */ 
	 public int stride(){
		 int var = stride0(super.ptr);
		 this.stride = var;
		 return this.stride;
	 }

	/**
	 * Set method for field inputRate	[vkenum]<br>
	 * Prototype: VkVertexInputRate  inputRate
	 */ 
	 public void inputRate(VkVertexInputRate inputRate){
		 this.inputRate = inputRate;
		 int enumVal = inputRate.getValue();
		 inputRate0(this.ptr, enumVal );
	 }

	/**
	 * Get method for field inputRate	[vkenum]<br>
	 * Prototype: VkVertexInputRate  inputRate
	 */ 
	 public VkVertexInputRate inputRate(){
		 int nativeVal = inputRate0(super.ptr);
		 this.inputRate = VkVertexInputRate.fromValue(nativeVal); 
		 return this.inputRate;
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field binding	[int]<br>
	 * Prototype: uint32_t  binding
	 */ 
	 private static native void binding0(Buffer ptr, int _binding);/*
		  VkVertexInputBindingDescription* vkObj = (VkVertexInputBindingDescription*)(ptr);
		  vkObj->binding = (uint32_t) (_binding);
	  */

	/**
	 * native GET method for field binding	[int]<br>
	 * Prototype: uint32_t  binding
	 */ 
	 private static native int binding0(Buffer ptr);/*
		  VkVertexInputBindingDescription vkObj = (VkVertexInputBindingDescription*)(ptr);
		  return (jint) (vkObj->binding);
	 */

	/**
	 * native SET method for field stride	[int]<br>
	 * Prototype: uint32_t  stride
	 */ 
	 private static native void stride0(Buffer ptr, int _stride);/*
		  VkVertexInputBindingDescription* vkObj = (VkVertexInputBindingDescription*)(ptr);
		  vkObj->stride = (uint32_t) (_stride);
	  */

	/**
	 * native GET method for field stride	[int]<br>
	 * Prototype: uint32_t  stride
	 */ 
	 private static native int stride0(Buffer ptr);/*
		  VkVertexInputBindingDescription vkObj = (VkVertexInputBindingDescription*)(ptr);
		  return (jint) (vkObj->stride);
	 */

	/**
	 * native SET method for field inputRate	[vkenum]<br>
	 * Prototype: VkVertexInputRate  inputRate
	 */ 
	 private static native void inputRate0(Buffer ptr, int  _inputRate);/*
		  VkVertexInputBindingDescription* vkObj = (VkVertexInputBindingDescription*)(ptr);
		  vkObj->inputRate = (VkVertexInputRate) (_inputRate);
	  */

	/**
	 * native GET method for field inputRate	[vkenum]<br>
	 * Prototype: VkVertexInputRate  inputRate
	 */ 
	 private static native int  inputRate0(Buffer ptr);/*
		  VkVertexInputBindingDescription vkObj = (VkVertexInputBindingDescription*)(ptr);
		  return (VkVertexInputRate) (vkObj->inputRate);
	 */



} // end of class VkVertexInputBindingDescription
