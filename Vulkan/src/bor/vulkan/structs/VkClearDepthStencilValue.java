/**
 * Class wrapping Vulkan's VkClearDepthStencilValue struct.
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
 *  This class is a Java front end for struct VkClearDepthStencilValue. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkClearDepthStencilValue {
 *     float       depth;
 *     uint32_t    stencil;
 * } VkClearDepthStencilValue;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.01 (beta) 
 */
public class VkClearDepthStencilValue extends VkStruct {
	/** TAG of this structure [219]  */
	 private static final String TAG = "VkClearDepthStencilValue";

	/** ID of this structure [219]  */
	 public static final int TAG_ID = VKCLEARDEPTHSTENCILVALUE_ID;

	 // fields //
	/**
	 *  float 	depth 
	 */ 
	float 	depth;

	/**
	 *  uint32_t 	stencil 
	 */ 
	int 	stencil;

	/**
	 * Ctor
	 */
	public VkClearDepthStencilValue(){ 
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
	 * Set method for field depth
	 * Prototype: float  depth
	 */ 
	 public void depth(float depth){
		 this.depth = depth;
		depth0(super.ptr, depth);
	 }

	/**
	 * get method for field depth
	 * Prototype: float  depth
	 */ 
	 public float depth(){
		 // return  this.depth;
		 return depth0(super.ptr);
	 }

	/**
	 * Set method for field stencil
	 * Prototype: uint32_t  stencil
	 */ 
	 public void stencil(int stencil){
		 this.stencil = stencil;
		stencil0(super.ptr, stencil);
	 }

	/**
	 * get method for field stencil
	 * Prototype: uint32_t  stencil
	 */ 
	 public int stencil(){
		 // return  this.stencil;
		 return stencil0(super.ptr);
	 }


	 // ////////////////////////////////
	 // native SETTERS & GETTERS //
	 // ////////////////////////////////
	/**
	 * native Set method for field depth
	 * Prototype: float  depth
	 */ 
	 private static native void depth0(ByteBuffer ptr, float _depth);/*
		  VkClearDepthStencilValue _obj = (VkClearDepthStencilValue)(*ptr);
		  _obj.depth = (float) (_depth);
	  */

	/**
	 * get method for field depth
	 * Prototype: float  depth
	 */ 
	 private static native float depth0(ByteBuffer ptr);/*
		  VkClearDepthStencilValue _obj = (VkClearDepthStencilValue)(ptr);
		  return (jfloat) (_obj.float);
	 */

	/**
	 * native Set method for field stencil
	 * Prototype: uint32_t  stencil
	 */ 
	 private static native void stencil0(ByteBuffer ptr, int _stencil);/*
		  VkClearDepthStencilValue _obj = (VkClearDepthStencilValue)(*ptr);
		  _obj.stencil = (uint32_t) (_stencil);
	  */

	/**
	 * get method for field stencil
	 * Prototype: uint32_t  stencil
	 */ 
	 private static native int stencil0(ByteBuffer ptr);/*
		  VkClearDepthStencilValue _obj = (VkClearDepthStencilValue)(ptr);
		  return (jint) (_obj.uint32_t);
	 */



} // end of class VkClearDepthStencilValue
