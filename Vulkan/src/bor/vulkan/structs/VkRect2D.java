/**
 * Class wrapping Vulkan's VkRect2D struct.
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
 *  This class is a Java front end for struct VkRect2D. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkRect2D {
 *     VkOffset2D    offset;
 *     VkExtent2D    extent;
 * } VkRect2D;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.01 (beta) 
 */
public class VkRect2D extends VkStruct {
	/** TAG of this structure [181]  */
	 private static final String TAG = "VkRect2D";

	/** ID of this structure [181]  */
	 public static final int TAG_ID = VKRECT2D_ID;

	 // fields //
	/**
	 *  VkOffset2D 	offset	[vkstruct]	 */ 
	VkOffset2D 	offset;

	/**
	 *  VkExtent2D 	extent	[vkstruct]	 */ 
	VkExtent2D 	extent;

	/**
	 * Ctor
	 */
	public VkRect2D(){ 
		 super(sizeOf()); 
	 }

	/** 
	 * Method to get native size of this structure 
	 */
	 public static int sizeOf(){ 
		 return sizeOf(TAG_ID); 
	}


	 ////////////////////////
	 //  SETTERS & GETTERS //
	 ////////////////////////

	/**
	 * Set method for field offset	[vkstruct]
	 * Prototype: VkOffset2D  offset
	 */ 
	 public void offset(VkOffset2D offset){
		 this.offset = offset;
		offset0(super.ptr, offset);
	 }

	/**
	 * get method for field offset	[vkstruct]
	 * Prototype: VkOffset2D  offset
	 */ 
	 public VkOffset2D offset(){
		 // return  this.offset;
		 return offset0(super.ptr);
	 }

	/**
	 * Set method for field extent	[vkstruct]
	 * Prototype: VkExtent2D  extent
	 */ 
	 public void extent(VkExtent2D extent){
		 this.extent = extent;
		extent0(super.ptr, extent);
	 }

	/**
	 * get method for field extent	[vkstruct]
	 * Prototype: VkExtent2D  extent
	 */ 
	 public VkExtent2D extent(){
		 // return  this.extent;
		 return extent0(super.ptr);
	 }


	 // ////////////////////////////////
	 // native SETTERS & GETTERS //
	 // ////////////////////////////////
	/**
	 * native Set method for field offset	[vkstruct]
	 * Prototype: VkOffset2D  offset
	 */ 
	 private static native void offset0(ByteBuffer ptr, VkOffset2D _offset);/*
		  VkRect2D _obj = (VkRect2D)(*ptr);
		  _obj.offset = (VkOffset2D) (_offset);
	  */

	/**
	 * get method for field offset	[vkstruct]
	 * Prototype: VkOffset2D  offset
	 */ 
	 private static native VkOffset2D offset0(ByteBuffer ptr);/*
		  VkRect2D _obj = (VkRect2D)(ptr);
		  return (VkOffset2D) (_obj.VkOffset2D);
	 */

	/**
	 * native Set method for field extent	[vkstruct]
	 * Prototype: VkExtent2D  extent
	 */ 
	 private static native void extent0(ByteBuffer ptr, VkExtent2D _extent);/*
		  VkRect2D _obj = (VkRect2D)(*ptr);
		  _obj.extent = (VkExtent2D) (_extent);
	  */

	/**
	 * get method for field extent	[vkstruct]
	 * Prototype: VkExtent2D  extent
	 */ 
	 private static native VkExtent2D extent0(ByteBuffer ptr);/*
		  VkRect2D _obj = (VkRect2D)(ptr);
		  return (VkExtent2D) (_obj.VkExtent2D);
	 */



} // end of class VkRect2D
