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

import java.nio.Buffer;


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

	/** P wrapper for THIS object */
	 private  P<VkViewport> p;

	 ///////////////////
	 // Struct fields //
	 ///////////////////
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


	/** 
	 * Return this VkObject instance wrapped in pointer P<br>
	 *
	 *  P&lt;? extends VkObject &gt;
	 *
	 * @return  a P container wrapping this object.
	 */
	 public P<VkViewport> getP() {
	       if(p == null ){
	           p = new P<VkViewport> (this);
	       }
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
		 x0(this.ptr,  x);
	 }

	/**
	 * Get method for field x	[float]<br>
	 * Prototype: float  x
	 */ 
	 public float x(){
		 float var = x0(super.ptr);
		 this.x = var;
		 return this.x;
	 }

	/**
	 * Set method for field y	[float]<br>
	 * Prototype: float  y
	 */ 
	 public void y(float y){
		 this.y = y;
		 y0(this.ptr,  y);
	 }

	/**
	 * Get method for field y	[float]<br>
	 * Prototype: float  y
	 */ 
	 public float y(){
		 float var = y0(super.ptr);
		 this.y = var;
		 return this.y;
	 }

	/**
	 * Set method for field width	[float]<br>
	 * Prototype: float  width
	 */ 
	 public void width(float width){
		 this.width = width;
		 width0(this.ptr,  width);
	 }

	/**
	 * Get method for field width	[float]<br>
	 * Prototype: float  width
	 */ 
	 public float width(){
		 float var = width0(super.ptr);
		 this.width = var;
		 return this.width;
	 }

	/**
	 * Set method for field height	[float]<br>
	 * Prototype: float  height
	 */ 
	 public void height(float height){
		 this.height = height;
		 height0(this.ptr,  height);
	 }

	/**
	 * Get method for field height	[float]<br>
	 * Prototype: float  height
	 */ 
	 public float height(){
		 float var = height0(super.ptr);
		 this.height = var;
		 return this.height;
	 }

	/**
	 * Set method for field minDepth	[float]<br>
	 * Prototype: float  minDepth
	 */ 
	 public void minDepth(float minDepth){
		 this.minDepth = minDepth;
		 minDepth0(this.ptr,  minDepth);
	 }

	/**
	 * Get method for field minDepth	[float]<br>
	 * Prototype: float  minDepth
	 */ 
	 public float minDepth(){
		 float var = minDepth0(super.ptr);
		 this.minDepth = var;
		 return this.minDepth;
	 }

	/**
	 * Set method for field maxDepth	[float]<br>
	 * Prototype: float  maxDepth
	 */ 
	 public void maxDepth(float maxDepth){
		 this.maxDepth = maxDepth;
		 maxDepth0(this.ptr,  maxDepth);
	 }

	/**
	 * Get method for field maxDepth	[float]<br>
	 * Prototype: float  maxDepth
	 */ 
	 public float maxDepth(){
		 float var = maxDepth0(super.ptr);
		 this.maxDepth = var;
		 return this.maxDepth;
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field x	[float]<br>
	 * Prototype: float  x
	 */ 
	 private static native void x0(Buffer ptr, float _x);/*
		  VkViewport* vkObj = (VkViewport*)(ptr);
		  vkObj->x = (float) (_x);
	  */

	/**
	 * native GET method for field x	[float]<br>
	 * Prototype: float  x
	 */ 
	 private static native float x0(Buffer ptr);/*
		  VkViewport vkObj = (VkViewport*)(ptr);
		  return (jfloat) (vkObj->x);
	 */

	/**
	 * native SET method for field y	[float]<br>
	 * Prototype: float  y
	 */ 
	 private static native void y0(Buffer ptr, float _y);/*
		  VkViewport* vkObj = (VkViewport*)(ptr);
		  vkObj->y = (float) (_y);
	  */

	/**
	 * native GET method for field y	[float]<br>
	 * Prototype: float  y
	 */ 
	 private static native float y0(Buffer ptr);/*
		  VkViewport vkObj = (VkViewport*)(ptr);
		  return (jfloat) (vkObj->y);
	 */

	/**
	 * native SET method for field width	[float]<br>
	 * Prototype: float  width
	 */ 
	 private static native void width0(Buffer ptr, float _width);/*
		  VkViewport* vkObj = (VkViewport*)(ptr);
		  vkObj->width = (float) (_width);
	  */

	/**
	 * native GET method for field width	[float]<br>
	 * Prototype: float  width
	 */ 
	 private static native float width0(Buffer ptr);/*
		  VkViewport vkObj = (VkViewport*)(ptr);
		  return (jfloat) (vkObj->width);
	 */

	/**
	 * native SET method for field height	[float]<br>
	 * Prototype: float  height
	 */ 
	 private static native void height0(Buffer ptr, float _height);/*
		  VkViewport* vkObj = (VkViewport*)(ptr);
		  vkObj->height = (float) (_height);
	  */

	/**
	 * native GET method for field height	[float]<br>
	 * Prototype: float  height
	 */ 
	 private static native float height0(Buffer ptr);/*
		  VkViewport vkObj = (VkViewport*)(ptr);
		  return (jfloat) (vkObj->height);
	 */

	/**
	 * native SET method for field minDepth	[float]<br>
	 * Prototype: float  minDepth
	 */ 
	 private static native void minDepth0(Buffer ptr, float _minDepth);/*
		  VkViewport* vkObj = (VkViewport*)(ptr);
		  vkObj->minDepth = (float) (_minDepth);
	  */

	/**
	 * native GET method for field minDepth	[float]<br>
	 * Prototype: float  minDepth
	 */ 
	 private static native float minDepth0(Buffer ptr);/*
		  VkViewport vkObj = (VkViewport*)(ptr);
		  return (jfloat) (vkObj->minDepth);
	 */

	/**
	 * native SET method for field maxDepth	[float]<br>
	 * Prototype: float  maxDepth
	 */ 
	 private static native void maxDepth0(Buffer ptr, float _maxDepth);/*
		  VkViewport* vkObj = (VkViewport*)(ptr);
		  vkObj->maxDepth = (float) (_maxDepth);
	  */

	/**
	 * native GET method for field maxDepth	[float]<br>
	 * Prototype: float  maxDepth
	 */ 
	 private static native float maxDepth0(Buffer ptr);/*
		  VkViewport vkObj = (VkViewport*)(ptr);
		  return (jfloat) (vkObj->maxDepth);
	 */



} // end of class VkViewport
