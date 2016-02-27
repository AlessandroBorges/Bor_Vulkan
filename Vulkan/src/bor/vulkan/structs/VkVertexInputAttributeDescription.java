// class wrapping Vulkan's VkVertexInputAttributeDescription struct.
package bor.vulkan.structs;

import bor.vulkan.*;
import bor.vulkan.enumerations.*;
import java.nio.ByteBuffer;


/**
 *  Class for Java-Vulkan integration 
 *  This class is a Java front end for struct VkVertexInputAttributeDescription 
 * @Author Alessandro Borges 
 */
public class VkVertexInputAttributeDescription extends VkStruct {
	/** ID of this structure [50]  */
	 public static final int TAG = VKVERTEXINPUTATTRIBUTEDESCRIPTION_ID;

	 // fields //
	/**
	 *  uint32_t 	location 
	 */ 
	int 	location;

	/**
	 *  uint32_t 	binding 
	 */ 
	int 	binding;

	/**
	 *  VkFormat 	format 
	 */ 
	VkFormat 	format;

	/**
	 *  uint32_t 	offset 
	 */ 
	int 	offset;

	/**
	 * Ctor
	 */
	public VkVertexInputAttributeDescription(){ 
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
	 * Set method for field location
	 * Prototype: uint32_t  location
	 */ 
	 public void location(int location){
		 this.location = location;
		location0(super.ptr, location);
	 }

	/**
	 * get method for field location
	 * Prototype: uint32_t  location
	 */ 
	 public int location(){
		 // return  this.location;
		 return location0(super.ptr);
	 }

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
	 * Set method for field format
	 * Prototype: VkFormat  format
	 */ 
	 public void format(VkFormat format){
		 this.format = format;
		format0(super.ptr, format);
	 }

	/**
	 * get method for field format
	 * Prototype: VkFormat  format
	 */ 
	 public VkFormat format(){
		 // return  this.format;
		 return format0(super.ptr);
	 }

	/**
	 * Set method for field offset
	 * Prototype: uint32_t  offset
	 */ 
	 public void offset(int offset){
		 this.offset = offset;
		offset0(super.ptr, offset);
	 }

	/**
	 * get method for field offset
	 * Prototype: uint32_t  offset
	 */ 
	 public int offset(){
		 // return  this.offset;
		 return offset0(super.ptr);
	 }


	 // ////////////////////////////////
	 // native SETTERS & GETTERS //
	 // ////////////////////////////////
	/**
	 * native Set method for field location
	 * Prototype: uint32_t  location
	 */ 
	 private static native void location0(ByteBuffer ptr, int _location);/*
		  VkVertexInputAttributeDescription _obj = (VkVertexInputAttributeDescription)(*ptr);
		  _obj.location = (uint32_t) (_location);
	  */

	/**
	 * get method for field location
	 * Prototype: uint32_t  location
	 */ 
	 private static native int location0(ByteBuffer ptr);/*
		  VkVertexInputAttributeDescription _obj = (VkVertexInputAttributeDescription)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native Set method for field binding
	 * Prototype: uint32_t  binding
	 */ 
	 private static native void binding0(ByteBuffer ptr, int _binding);/*
		  VkVertexInputAttributeDescription _obj = (VkVertexInputAttributeDescription)(*ptr);
		  _obj.binding = (uint32_t) (_binding);
	  */

	/**
	 * get method for field binding
	 * Prototype: uint32_t  binding
	 */ 
	 private static native int binding0(ByteBuffer ptr);/*
		  VkVertexInputAttributeDescription _obj = (VkVertexInputAttributeDescription)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native Set method for field format
	 * Prototype: VkFormat  format
	 */ 
	 private static native void format0(ByteBuffer ptr, VkFormat _format);/*
		  VkVertexInputAttributeDescription _obj = (VkVertexInputAttributeDescription)(*ptr);
		  _obj.format = (VkFormat) (_format);
	  */

	/**
	 * get method for field format
	 * Prototype: VkFormat  format
	 */ 
	 private static native VkFormat format0(ByteBuffer ptr);/*
		  VkVertexInputAttributeDescription _obj = (VkVertexInputAttributeDescription)(ptr);
		  return (VkFormat) (_obj.VkFormat);
	 */

	/**
	 * native Set method for field offset
	 * Prototype: uint32_t  offset
	 */ 
	 private static native void offset0(ByteBuffer ptr, int _offset);/*
		  VkVertexInputAttributeDescription _obj = (VkVertexInputAttributeDescription)(*ptr);
		  _obj.offset = (uint32_t) (_offset);
	  */

	/**
	 * get method for field offset
	 * Prototype: uint32_t  offset
	 */ 
	 private static native int offset0(ByteBuffer ptr);/*
		  VkVertexInputAttributeDescription _obj = (VkVertexInputAttributeDescription)(ptr);
		  return (jint) (_obj.uint32_t);
	 */



} // end of class VkVertexInputAttributeDescription
