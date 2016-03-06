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
 *  Project Bor-Vulkan 
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
	/** TAG of this structure [54]  */
	 private static final String TAG = "VkViewport";

	/** ID of this structure [54]  */
	 public static final int TAG_ID = VKVIEWPORT_ID;

	 // fields //
	/**
	 *  float 	x	[float]
	 */ 
	float 	x;

	/**
	 *  float 	y	[float]
	 */ 
	float 	y;

	/**
	 *  float 	width	[float]
	 */ 
	float 	width;

	/**
	 *  float 	height	[float]
	 */ 
	float 	height;

	/**
	 *  float 	minDepth	[float]
	 */ 
	float 	minDepth;

	/**
	 *  float 	maxDepth	[float]
	 */ 
	float 	maxDepth;

	/**
	 * Ctor
	 */
	public VkViewport(){ 
		 super(sizeOf()); 
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkViewport(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address and memSize
	 * @param address - native address 
	 * @param memSize - buffer size 
	 */
	 public VkViewport(long address, int memSize){ 
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
	 public static P<VkViewport> createNullPointer(){
	        P<VkViewport> p = new  P<VkViewport>(new VkViewport());
	        return p;
	    }

	 ////////////////////////
	 //  SETTERS & GETTERS //
	 ////////////////////////

	/**
	 * Set method for field x	[float]<br>
	 * Prototype: float  x
	 */ 
	 public void x(float x){
		 this.x = x;
		x0(super.ptr, x);
	 }

	/**
	 * get method for field x	[float]<br>
	 * Prototype: float  x
	 */ 
	 public float x(){
		 // return  this.x;
		 return x0(super.ptr);
	 }

	/**
	 * Set method for field y	[float]<br>
	 * Prototype: float  y
	 */ 
	 public void y(float y){
		 this.y = y;
		y0(super.ptr, y);
	 }

	/**
	 * get method for field y	[float]<br>
	 * Prototype: float  y
	 */ 
	 public float y(){
		 // return  this.y;
		 return y0(super.ptr);
	 }

	/**
	 * Set method for field width	[float]<br>
	 * Prototype: float  width
	 */ 
	 public void width(float width){
		 this.width = width;
		width0(super.ptr, width);
	 }

	/**
	 * get method for field width	[float]<br>
	 * Prototype: float  width
	 */ 
	 public float width(){
		 // return  this.width;
		 return width0(super.ptr);
	 }

	/**
	 * Set method for field height	[float]<br>
	 * Prototype: float  height
	 */ 
	 public void height(float height){
		 this.height = height;
		height0(super.ptr, height);
	 }

	/**
	 * get method for field height	[float]<br>
	 * Prototype: float  height
	 */ 
	 public float height(){
		 // return  this.height;
		 return height0(super.ptr);
	 }

	/**
	 * Set method for field minDepth	[float]<br>
	 * Prototype: float  minDepth
	 */ 
	 public void minDepth(float minDepth){
		 this.minDepth = minDepth;
		minDepth0(super.ptr, minDepth);
	 }

	/**
	 * get method for field minDepth	[float]<br>
	 * Prototype: float  minDepth
	 */ 
	 public float minDepth(){
		 // return  this.minDepth;
		 return minDepth0(super.ptr);
	 }

	/**
	 * Set method for field maxDepth	[float]<br>
	 * Prototype: float  maxDepth
	 */ 
	 public void maxDepth(float maxDepth){
		 this.maxDepth = maxDepth;
		maxDepth0(super.ptr, maxDepth);
	 }

	/**
	 * get method for field maxDepth	[float]<br>
	 * Prototype: float  maxDepth
	 */ 
	 public float maxDepth(){
		 // return  this.maxDepth;
		 return maxDepth0(super.ptr);
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field x	[float]<br>
	 * Prototype: float  x
	 */ 
	 private static native void x0(ByteBuffer ptr, float _x);/*
		  VkViewport _obj = (VkViewport)(*ptr);
		  _obj.x = (float) (_x);
	  */

	/**
	 * native GET method for field x	[float]<br>
	 * Prototype: float  x
	 */ 
	 private static native float x0(ByteBuffer ptr);/*
		  VkViewport _obj = (VkViewport)(ptr);
		  return (jfloat) (_obj.float);
	 */

	/**
	 * native SET method for field y	[float]<br>
	 * Prototype: float  y
	 */ 
	 private static native void y0(ByteBuffer ptr, float _y);/*
		  VkViewport _obj = (VkViewport)(*ptr);
		  _obj.y = (float) (_y);
	  */

	/**
	 * native GET method for field y	[float]<br>
	 * Prototype: float  y
	 */ 
	 private static native float y0(ByteBuffer ptr);/*
		  VkViewport _obj = (VkViewport)(ptr);
		  return (jfloat) (_obj.float);
	 */

	/**
	 * native SET method for field width	[float]<br>
	 * Prototype: float  width
	 */ 
	 private static native void width0(ByteBuffer ptr, float _width);/*
		  VkViewport _obj = (VkViewport)(*ptr);
		  _obj.width = (float) (_width);
	  */

	/**
	 * native GET method for field width	[float]<br>
	 * Prototype: float  width
	 */ 
	 private static native float width0(ByteBuffer ptr);/*
		  VkViewport _obj = (VkViewport)(ptr);
		  return (jfloat) (_obj.float);
	 */

	/**
	 * native SET method for field height	[float]<br>
	 * Prototype: float  height
	 */ 
	 private static native void height0(ByteBuffer ptr, float _height);/*
		  VkViewport _obj = (VkViewport)(*ptr);
		  _obj.height = (float) (_height);
	  */

	/**
	 * native GET method for field height	[float]<br>
	 * Prototype: float  height
	 */ 
	 private static native float height0(ByteBuffer ptr);/*
		  VkViewport _obj = (VkViewport)(ptr);
		  return (jfloat) (_obj.float);
	 */

	/**
	 * native SET method for field minDepth	[float]<br>
	 * Prototype: float  minDepth
	 */ 
	 private static native void minDepth0(ByteBuffer ptr, float _minDepth);/*
		  VkViewport _obj = (VkViewport)(*ptr);
		  _obj.minDepth = (float) (_minDepth);
	  */

	/**
	 * native GET method for field minDepth	[float]<br>
	 * Prototype: float  minDepth
	 */ 
	 private static native float minDepth0(ByteBuffer ptr);/*
		  VkViewport _obj = (VkViewport)(ptr);
		  return (jfloat) (_obj.float);
	 */

	/**
	 * native SET method for field maxDepth	[float]<br>
	 * Prototype: float  maxDepth
	 */ 
	 private static native void maxDepth0(ByteBuffer ptr, float _maxDepth);/*
		  VkViewport _obj = (VkViewport)(*ptr);
		  _obj.maxDepth = (float) (_maxDepth);
	  */

	/**
	 * native GET method for field maxDepth	[float]<br>
	 * Prototype: float  maxDepth
	 */ 
	 private static native float maxDepth0(ByteBuffer ptr);/*
		  VkViewport _obj = (VkViewport)(ptr);
		  return (jfloat) (_obj.float);
	 */



} // end of class VkViewport
