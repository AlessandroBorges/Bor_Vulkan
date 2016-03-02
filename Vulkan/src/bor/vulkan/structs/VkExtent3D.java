/**
 * Class wrapping Vulkan's VkExtent3D struct.
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
 *  This class is a Java front end for struct VkExtent3D. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkExtent3D {
 *     uint32_t    width;
 *     uint32_t    height;
 *     uint32_t    depth;
 * } VkExtent3D;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.01 (beta) 
 */
public class VkExtent3D extends VkStruct {
	/** TAG of this structure [130]  */
	 private static final String TAG = "VkExtent3D";

	/** ID of this structure [130]  */
	 public static final int TAG_ID = VKEXTENT3D_ID;

	 // fields //
	/**
	 *  uint32_t 	width 
	 */ 
	int 	width;

	/**
	 *  uint32_t 	height 
	 */ 
	int 	height;

	/**
	 *  uint32_t 	depth 
	 */ 
	int 	depth;

	/**
	 * Ctor
	 */
	public VkExtent3D(){ 
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
	 * Set method for field width
	 * Prototype: uint32_t  width
	 */ 
	 public void width(int width){
		 this.width = width;
		width0(super.ptr, width);
	 }

	/**
	 * get method for field width
	 * Prototype: uint32_t  width
	 */ 
	 public int width(){
		 // return  this.width;
		 return width0(super.ptr);
	 }

	/**
	 * Set method for field height
	 * Prototype: uint32_t  height
	 */ 
	 public void height(int height){
		 this.height = height;
		height0(super.ptr, height);
	 }

	/**
	 * get method for field height
	 * Prototype: uint32_t  height
	 */ 
	 public int height(){
		 // return  this.height;
		 return height0(super.ptr);
	 }

	/**
	 * Set method for field depth
	 * Prototype: uint32_t  depth
	 */ 
	 public void depth(int depth){
		 this.depth = depth;
		depth0(super.ptr, depth);
	 }

	/**
	 * get method for field depth
	 * Prototype: uint32_t  depth
	 */ 
	 public int depth(){
		 // return  this.depth;
		 return depth0(super.ptr);
	 }


	 // ////////////////////////////////
	 // native SETTERS & GETTERS //
	 // ////////////////////////////////
	/**
	 * native Set method for field width
	 * Prototype: uint32_t  width
	 */ 
	 private static native void width0(ByteBuffer ptr, int _width);/*
		  VkExtent3D _obj = (VkExtent3D)(*ptr);
		  _obj.width = (uint32_t) (_width);
	  */

	/**
	 * get method for field width
	 * Prototype: uint32_t  width
	 */ 
	 private static native int width0(ByteBuffer ptr);/*
		  VkExtent3D _obj = (VkExtent3D)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native Set method for field height
	 * Prototype: uint32_t  height
	 */ 
	 private static native void height0(ByteBuffer ptr, int _height);/*
		  VkExtent3D _obj = (VkExtent3D)(*ptr);
		  _obj.height = (uint32_t) (_height);
	  */

	/**
	 * get method for field height
	 * Prototype: uint32_t  height
	 */ 
	 private static native int height0(ByteBuffer ptr);/*
		  VkExtent3D _obj = (VkExtent3D)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native Set method for field depth
	 * Prototype: uint32_t  depth
	 */ 
	 private static native void depth0(ByteBuffer ptr, int _depth);/*
		  VkExtent3D _obj = (VkExtent3D)(*ptr);
		  _obj.depth = (uint32_t) (_depth);
	  */

	/**
	 * get method for field depth
	 * Prototype: uint32_t  depth
	 */ 
	 private static native int depth0(ByteBuffer ptr);/*
		  VkExtent3D _obj = (VkExtent3D)(ptr);
		  return (jint) (_obj.uint32_t);
	 */



} // end of class VkExtent3D
