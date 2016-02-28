/**
 * Class wrapping Vulkan's VkMemoryType struct.
 * 
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
 *  This class is a Java front end for struct VkMemoryType 
 *  <h3>ProtoType:</h3>
 * <pre>
 * typedef struct VkMemoryType {
 *     VkMemoryPropertyFlags    propertyFlags;
 *     uint32_t                 heapIndex;
 * } VkMemoryType;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version 0.8.01
 */
public class VkMemoryType extends VkStruct {
	/** TAG of this structure [136]  */
	 private static final String TAG = "VkMemoryType";

	/** ID of this structure [136]  */
	 public static final int TAG_ID = VKMEMORYTYPE_ID;

	 // fields //
	/**
	 *  VkMemoryPropertyFlags 	propertyFlags 
	 */ 
	int 	propertyFlags;

	/**
	 *  uint32_t 	heapIndex 
	 */ 
	int 	heapIndex;

	/**
	 * Ctor
	 */
	public VkMemoryType(){ 
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
	 * Set method for field propertyFlags
	 * Prototype: VkMemoryPropertyFlags  propertyFlags
	 */ 
	 public void propertyFlags(int propertyFlags){
		 this.propertyFlags = propertyFlags;
		propertyFlags0(super.ptr, propertyFlags);
	 }

	/**
	 * get method for field propertyFlags
	 * Prototype: VkMemoryPropertyFlags  propertyFlags
	 */ 
	 public int propertyFlags(){
		 // return  this.propertyFlags;
		 return propertyFlags0(super.ptr);
	 }

	/**
	 * Set method for field heapIndex
	 * Prototype: uint32_t  heapIndex
	 */ 
	 public void heapIndex(int heapIndex){
		 this.heapIndex = heapIndex;
		heapIndex0(super.ptr, heapIndex);
	 }

	/**
	 * get method for field heapIndex
	 * Prototype: uint32_t  heapIndex
	 */ 
	 public int heapIndex(){
		 // return  this.heapIndex;
		 return heapIndex0(super.ptr);
	 }


	 // ////////////////////////////////
	 // native SETTERS & GETTERS //
	 // ////////////////////////////////
	/**
	 * native Set method for field propertyFlags
	 * Prototype: VkMemoryPropertyFlags  propertyFlags
	 */ 
	 private static native void propertyFlags0(ByteBuffer ptr, int _propertyFlags);/*
		  VkMemoryType _obj = (VkMemoryType)(*ptr);
		  _obj.propertyFlags = (VkMemoryPropertyFlags) (_propertyFlags);
	  */

	/**
	 * get method for field propertyFlags
	 * Prototype: VkMemoryPropertyFlags  propertyFlags
	 */ 
	 private static native int propertyFlags0(ByteBuffer ptr);/*
		  VkMemoryType _obj = (VkMemoryType)(ptr);
		  return (jint) (_obj.VkMemoryPropertyFlags);
	 */

	/**
	 * native Set method for field heapIndex
	 * Prototype: uint32_t  heapIndex
	 */ 
	 private static native void heapIndex0(ByteBuffer ptr, int _heapIndex);/*
		  VkMemoryType _obj = (VkMemoryType)(*ptr);
		  _obj.heapIndex = (uint32_t) (_heapIndex);
	  */

	/**
	 * get method for field heapIndex
	 * Prototype: uint32_t  heapIndex
	 */ 
	 private static native int heapIndex0(ByteBuffer ptr);/*
		  VkMemoryType _obj = (VkMemoryType)(ptr);
		  return (jint) (_obj.uint32_t);
	 */



} // end of class VkMemoryType
