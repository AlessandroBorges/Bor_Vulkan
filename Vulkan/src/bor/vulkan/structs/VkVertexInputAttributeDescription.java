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

import java.nio.Buffer;


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

    //@formatter:off
    /*JNI
    #include <BorVulkan.hpp>
    */  

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
		 super(TAG_ID);
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
	 public VkVertexInputAttributeDescription(long address , int memSize){ 
		 super(address, memSize); 
	 }

	/**
	 * Ctor with Address only. Size guessed by #sizeof()
	 * @param address - native address 
	 */
	 public VkVertexInputAttributeDescription(long address){ 
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
		 setLocation0(this.ptr,  location);
	 }

	/**
	 * Get method for field location	[int]<br>
	 * Prototype: uint32_t  location
	 */ 
	 public int location(){
		 int var = getLocation0(super.ptr);
		 this.location = var;
		 return this.location;
	 }

	/**
	 * Set method for field binding	[int]<br>
	 * Prototype: uint32_t  binding
	 */ 
	 public void binding(int binding){
		 this.binding = binding;
		 setBinding0(this.ptr,  binding);
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
	 * Set method for field format	[vkenum]<br>
	 * Prototype: VkFormat  format
	 */ 
	 public void format(VkFormat format){
		 this.format = format;
		 int enumVal = format.getValue();
		 setFormat0(this.ptr, enumVal );
	 }

	/**
	 * Get method for field format	[vkenum]<br>
	 * Prototype: VkFormat  format
	 */ 
	 public VkFormat format(){
		 int nativeVal = getFormat0(super.ptr);
		 this.format = VkFormat.fromValue(nativeVal); 
		 return this.format;
	 }

	/**
	 * Set method for field offset	[int]<br>
	 * Prototype: uint32_t  offset
	 */ 
	 public void offset(int offset){
		 this.offset = offset;
		 setOffset0(this.ptr,  offset);
	 }

	/**
	 * Get method for field offset	[int]<br>
	 * Prototype: uint32_t  offset
	 */ 
	 public int offset(){
		 int var = getOffset0(super.ptr);
		 this.offset = var;
		 return this.offset;
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field location	[int]<br>
	 * Prototype: uint32_t  location
	 */ 
	 private static native void setLocation0(Buffer ptr, int _location);/*
		  VkVertexInputAttributeDescription* vkObj = (VkVertexInputAttributeDescription*)(ptr);
		  vkObj->location = (uint32_t) (_location);
	  */

	/**
	 * native GET method for field location	[int]<br>
	 * Prototype: uint32_t  location
	 */ 
	 private static native int getLocation0(Buffer ptr);/*
		  VkVertexInputAttributeDescription* vkObj = (VkVertexInputAttributeDescription*)(ptr);
		  return (jint) (vkObj->location);
	 */

	/**
	 * native SET method for field binding	[int]<br>
	 * Prototype: uint32_t  binding
	 */ 
	 private static native void setBinding0(Buffer ptr, int _binding);/*
		  VkVertexInputAttributeDescription* vkObj = (VkVertexInputAttributeDescription*)(ptr);
		  vkObj->binding = (uint32_t) (_binding);
	  */

	/**
	 * native GET method for field binding	[int]<br>
	 * Prototype: uint32_t  binding
	 */ 
	 private static native int getBinding0(Buffer ptr);/*
		  VkVertexInputAttributeDescription* vkObj = (VkVertexInputAttributeDescription*)(ptr);
		  return (jint) (vkObj->binding);
	 */

	/**
	 * native SET method for field format	[vkenum]<br>
	 * Prototype: VkFormat  format
	 */ 
	 private static native void setFormat0(Buffer ptr, int  _format);/*
		  VkVertexInputAttributeDescription* vkObj = (VkVertexInputAttributeDescription*)(ptr);
		  vkObj->format = (VkFormat) (_format);
	  */

	/**
	 * native GET method for field format	[vkenum]<br>
	 * Prototype: VkFormat  format
	 */ 
	 private static native int  getFormat0(Buffer ptr);/*
		  VkVertexInputAttributeDescription* vkObj = (VkVertexInputAttributeDescription*)(ptr);
		  return (VkFormat) (vkObj->format);
	 */

	/**
	 * native SET method for field offset	[int]<br>
	 * Prototype: uint32_t  offset
	 */ 
	 private static native void setOffset0(Buffer ptr, int _offset);/*
		  VkVertexInputAttributeDescription* vkObj = (VkVertexInputAttributeDescription*)(ptr);
		  vkObj->offset = (uint32_t) (_offset);
	  */

	/**
	 * native GET method for field offset	[int]<br>
	 * Prototype: uint32_t  offset
	 */ 
	 private static native int getOffset0(Buffer ptr);/*
		  VkVertexInputAttributeDescription* vkObj = (VkVertexInputAttributeDescription*)(ptr);
		  return (jint) (vkObj->offset);
	 */



} // end of class VkVertexInputAttributeDescription
