/**
 * Class wrapping Vulkan's VkViewport struct.
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
 *  This class is a Java front end for struct VkViewport. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkViewport {
 *     float    x;
 *     float    y;
 *     float    width;
 *     float    height;
 *     float    minDepth;
 *     float    maxDepth;
 * } VkViewport;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.01 (beta) 
 */
public class VkViewport extends VkStruct {
	/** TAG of this structure [178]  */
	 private static final String TAG = "VkViewport";

	/** ID of this structure [178]  */
	 public static final int TAG_ID = VKVIEWPORT_ID;

	 // fields //
	/**
	 *  float 	x		 */ 
	float 	x;

	/**
	 *  float 	y		 */ 
	float 	y;

	/**
	 *  float 	width		 */ 
	float 	width;

	/**
	 *  float 	height		 */ 
	float 	height;

	/**
	 *  float 	minDepth		 */ 
	float 	minDepth;

	/**
	 *  float 	maxDepth		 */ 
	float 	maxDepth;

	/**
	 * Ctor
	 */
	public VkViewport(){ 
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
	 * Set method for field x	
	 * Prototype: float  x
	 */ 
	 public void x(float x){
		 this.x = x;
		x0(super.ptr, x);
	 }

	/**
	 * get method for field x	
	 * Prototype: float  x
	 */ 
	 public float x(){
		 // return  this.x;
		 return x0(super.ptr);
	 }

	/**
	 * Set method for field y	
	 * Prototype: float  y
	 */ 
	 public void y(float y){
		 this.y = y;
		y0(super.ptr, y);
	 }

	/**
	 * get method for field y	
	 * Prototype: float  y
	 */ 
	 public float y(){
		 // return  this.y;
		 return y0(super.ptr);
	 }

	/**
	 * Set method for field width	
	 * Prototype: float  width
	 */ 
	 public void width(float width){
		 this.width = width;
		width0(super.ptr, width);
	 }

	/**
	 * get method for field width	
	 * Prototype: float  width
	 */ 
	 public float width(){
		 // return  this.width;
		 return width0(super.ptr);
	 }

	/**
	 * Set method for field height	
	 * Prototype: float  height
	 */ 
	 public void height(float height){
		 this.height = height;
		height0(super.ptr, height);
	 }

	/**
	 * get method for field height	
	 * Prototype: float  height
	 */ 
	 public float height(){
		 // return  this.height;
		 return height0(super.ptr);
	 }

	/**
	 * Set method for field minDepth	
	 * Prototype: float  minDepth
	 */ 
	 public void minDepth(float minDepth){
		 this.minDepth = minDepth;
		minDepth0(super.ptr, minDepth);
	 }

	/**
	 * get method for field minDepth	
	 * Prototype: float  minDepth
	 */ 
	 public float minDepth(){
		 // return  this.minDepth;
		 return minDepth0(super.ptr);
	 }

	/**
	 * Set method for field maxDepth	
	 * Prototype: float  maxDepth
	 */ 
	 public void maxDepth(float maxDepth){
		 this.maxDepth = maxDepth;
		maxDepth0(super.ptr, maxDepth);
	 }

	/**
	 * get method for field maxDepth	
	 * Prototype: float  maxDepth
	 */ 
	 public float maxDepth(){
		 // return  this.maxDepth;
		 return maxDepth0(super.ptr);
	 }


	 // ////////////////////////////////
	 // native SETTERS & GETTERS //
	 // ////////////////////////////////
	/**
	 * native Set method for field x	
	 * Prototype: float  x
	 */ 
	 private static native void x0(ByteBuffer ptr, float _x);/*
		  VkViewport _obj = (VkViewport)(*ptr);
		  _obj.x = (float) (_x);
	  */

	/**
	 * get method for field x	
	 * Prototype: float  x
	 */ 
	 private static native float x0(ByteBuffer ptr);/*
		  VkViewport _obj = (VkViewport)(ptr);
		  return (jfloat) (_obj.float);
	 */

	/**
	 * native Set method for field y	
	 * Prototype: float  y
	 */ 
	 private static native void y0(ByteBuffer ptr, float _y);/*
		  VkViewport _obj = (VkViewport)(*ptr);
		  _obj.y = (float) (_y);
	  */

	/**
	 * get method for field y	
	 * Prototype: float  y
	 */ 
	 private static native float y0(ByteBuffer ptr);/*
		  VkViewport _obj = (VkViewport)(ptr);
		  return (jfloat) (_obj.float);
	 */

	/**
	 * native Set method for field width	
	 * Prototype: float  width
	 */ 
	 private static native void width0(ByteBuffer ptr, float _width);/*
		  VkViewport _obj = (VkViewport)(*ptr);
		  _obj.width = (float) (_width);
	  */

	/**
	 * get method for field width	
	 * Prototype: float  width
	 */ 
	 private static native float width0(ByteBuffer ptr);/*
		  VkViewport _obj = (VkViewport)(ptr);
		  return (jfloat) (_obj.float);
	 */

	/**
	 * native Set method for field height	
	 * Prototype: float  height
	 */ 
	 private static native void height0(ByteBuffer ptr, float _height);/*
		  VkViewport _obj = (VkViewport)(*ptr);
		  _obj.height = (float) (_height);
	  */

	/**
	 * get method for field height	
	 * Prototype: float  height
	 */ 
	 private static native float height0(ByteBuffer ptr);/*
		  VkViewport _obj = (VkViewport)(ptr);
		  return (jfloat) (_obj.float);
	 */

	/**
	 * native Set method for field minDepth	
	 * Prototype: float  minDepth
	 */ 
	 private static native void minDepth0(ByteBuffer ptr, float _minDepth);/*
		  VkViewport _obj = (VkViewport)(*ptr);
		  _obj.minDepth = (float) (_minDepth);
	  */

	/**
	 * get method for field minDepth	
	 * Prototype: float  minDepth
	 */ 
	 private static native float minDepth0(ByteBuffer ptr);/*
		  VkViewport _obj = (VkViewport)(ptr);
		  return (jfloat) (_obj.float);
	 */

	/**
	 * native Set method for field maxDepth	
	 * Prototype: float  maxDepth
	 */ 
	 private static native void maxDepth0(ByteBuffer ptr, float _maxDepth);/*
		  VkViewport _obj = (VkViewport)(*ptr);
		  _obj.maxDepth = (float) (_maxDepth);
	  */

	/**
	 * get method for field maxDepth	
	 * Prototype: float  maxDepth
	 */ 
	 private static native float maxDepth0(ByteBuffer ptr);/*
		  VkViewport _obj = (VkViewport)(ptr);
		  return (jfloat) (_obj.float);
	 */



} // end of class VkViewport
