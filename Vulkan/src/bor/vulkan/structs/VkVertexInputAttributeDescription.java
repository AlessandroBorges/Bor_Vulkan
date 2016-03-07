/**
 * Class wrapping Vulkan's VkVertexInputAttributeDescription struct.
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
 *  This class is a Java front end for struct VkVertexInputAttributeDescription. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkVertexInputAttributeDescription {
 *     uint32_t    location;
 *     uint32_t    binding;
 *     VkFormat    format;
 *     uint32_t    offset;
 * } VkVertexInputAttributeDescription;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.01 (beta) 
 */
public class VkVertexInputAttributeDescription extends VkStruct {
	/** TAG of this structure [50]  */
	 private static final String TAG = "VkVertexInputAttributeDescription";

	/** ID of this structure [50]  */
	 public static final int TAG_ID = VKVERTEXINPUTATTRIBUTEDESCRIPTION_ID;

	/** P wrapper for THIS object */
	 private  P<VkVertexInputAttributeDescription> p;

	 ///////////////////
	 // Struct fields //
	 ///////////////////
	/**
	 *  uint32_t 	location	[int]
	 */ 
	 int 	location;

	/**
	 *  uint32_t 	binding	[int]
	 */ 
	 int 	binding;

	/**
	 *  VkFormat 	format	[vkenum]
	 */ 
	 VkFormat 	format;

	/**
	 *  uint32_t 	offset	[int]
	 */ 
	 int 	offset;

	/**
	 * Ctor
	 */
	public VkVertexInputAttributeDescription(){ 
		 super(sizeOf()); 
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkVertexInputAttributeDescription(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address and memSize
	 * @param address - native address 
	 * @param memSize - buffer size 
	 */
	 public VkVertexInputAttributeDescription(long address, int memSize){ 
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
	 public static P<VkVertexInputAttributeDescription> createNullPointer(){
	        P<VkVertexInputAttributeDescription> p = new  P<VkVertexInputAttributeDescription>(new VkVertexInputAttributeDescription());
	        return p;
	    }


	/** 
	 * Return this VkObject instance wrapped in pointer P<br>
	 *
	 *  P&lt;? extends VkObject &gt;
	 *
	 * @return  a P container wrapping this object.
	 */
	 public P<VkVertexInputAttributeDescription> getP() {
	       if(p == null ){
	           p = new P<VkVertexInputAttributeDescription> (this);
	       }
	        return p;
	    }


	 ////////////////////////
	 //  SETTERS & GETTERS //
	 ////////////////////////

	/**
	 * Set method for field location	[int]<br>
	 * Prototype: uint32_t  location
	 */ 
	 public void location(int location){
		 this.location = location;
		location0(super.ptr, location);
	 }

	/**
	 * get method for field location	[int]<br>
	 * Prototype: uint32_t  location
	 */ 
	 public int location(){
		 // return  this.location;
		 return location0(super.ptr);
	 }

	/**
	 * Set method for field binding	[int]<br>
	 * Prototype: uint32_t  binding
	 */ 
	 public void binding(int binding){
		 this.binding = binding;
		binding0(super.ptr, binding);
	 }

	/**
	 * get method for field binding	[int]<br>
	 * Prototype: uint32_t  binding
	 */ 
	 public int binding(){
		 // return  this.binding;
		 return binding0(super.ptr);
	 }

	/**
	 * Set method for field format	[vkenum]<br>
	 * Prototype: VkFormat  format
	 */ 
	 public void format(VkFormat format){
		 this.format = format;
		format0(super.ptr, format);
	 }

	/**
	 * get method for field format	[vkenum]<br>
	 * Prototype: VkFormat  format
	 */ 
	 public VkFormat format(){
		 // return  this.format;
		 return format0(super.ptr);
	 }

	/**
	 * Set method for field offset	[int]<br>
	 * Prototype: uint32_t  offset
	 */ 
	 public void offset(int offset){
		 this.offset = offset;
		offset0(super.ptr, offset);
	 }

	/**
	 * get method for field offset	[int]<br>
	 * Prototype: uint32_t  offset
	 */ 
	 public int offset(){
		 // return  this.offset;
		 return offset0(super.ptr);
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field location	[int]<br>
	 * Prototype: uint32_t  location
	 */ 
	 private static native void location0(ByteBuffer ptr, int _location);/*
		  VkVertexInputAttributeDescription _obj = (VkVertexInputAttributeDescription)(*ptr);
		  _obj.location = (uint32_t) (_location);
	  */

	/**
	 * native GET method for field location	[int]<br>
	 * Prototype: uint32_t  location
	 */ 
	 private static native int location0(ByteBuffer ptr);/*
		  VkVertexInputAttributeDescription _obj = (VkVertexInputAttributeDescription)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native SET method for field binding	[int]<br>
	 * Prototype: uint32_t  binding
	 */ 
	 private static native void binding0(ByteBuffer ptr, int _binding);/*
		  VkVertexInputAttributeDescription _obj = (VkVertexInputAttributeDescription)(*ptr);
		  _obj.binding = (uint32_t) (_binding);
	  */

	/**
	 * native GET method for field binding	[int]<br>
	 * Prototype: uint32_t  binding
	 */ 
	 private static native int binding0(ByteBuffer ptr);/*
		  VkVertexInputAttributeDescription _obj = (VkVertexInputAttributeDescription)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native SET method for field format	[vkenum]<br>
	 * Prototype: VkFormat  format
	 */ 
	 private static native void format0(ByteBuffer ptr, VkFormat _format);/*
		  VkVertexInputAttributeDescription _obj = (VkVertexInputAttributeDescription)(*ptr);
		  _obj.format = (VkFormat) (_format);
	  */

	/**
	 * native GET method for field format	[vkenum]<br>
	 * Prototype: VkFormat  format
	 */ 
	 private static native VkFormat format0(ByteBuffer ptr);/*
		  VkVertexInputAttributeDescription _obj = (VkVertexInputAttributeDescription)(ptr);
		  return (VkFormat) (_obj.VkFormat);
	 */

	/**
	 * native SET method for field offset	[int]<br>
	 * Prototype: uint32_t  offset
	 */ 
	 private static native void offset0(ByteBuffer ptr, int _offset);/*
		  VkVertexInputAttributeDescription _obj = (VkVertexInputAttributeDescription)(*ptr);
		  _obj.offset = (uint32_t) (_offset);
	  */

	/**
	 * native GET method for field offset	[int]<br>
	 * Prototype: uint32_t  offset
	 */ 
	 private static native int offset0(ByteBuffer ptr);/*
		  VkVertexInputAttributeDescription _obj = (VkVertexInputAttributeDescription)(ptr);
		  return (jint) (_obj.uint32_t);
	 */



} // end of class VkVertexInputAttributeDescription
