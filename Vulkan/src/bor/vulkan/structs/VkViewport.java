/**
 * Class wrapping Vulkan's VkViewport struct.
 * 
 * Bor_Vulkan Project Ver. 0.8.65 (beta)
 * Licence terms: 
 * The MIT License (MIT)
 * Copyright (c) 2016 Alessandro Borges
 * See https://opensource.org/licenses/MIT 
 */
 package bor.vulkan.structs;

 import bor.util.*;
 import bor.vulkan.*;
 import static bor.vulkan.Vulkan.*; 
 import bor.vulkan.enumerations.*;

 import java.util.*;
 import java.nio.*;


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
 * @version Ver. 0.8.65 (beta) 
 */
 public class VkViewport extends VkStruct {

    //@formatter:off
    /*JNI
    #include <BorVulkan.hpp>
    */  

	/** TAG of this structure [54]  */
	 private static final String TAG = "VkViewport";

	/** ID of this structure [54]  */
	 public static final int TAG_ID = VKVIEWPORT_ID;

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
		 super(TAG_ID);
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkViewport(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address only. Size guessed by #sizeof()
	 * @param address - native address 
	 */
	 public VkViewport(long address){ 
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
	 * Get ID of this structure 
	 */
	 public static int getID(){ 
		 return TAG_ID; 
	}

	 ////////////////////////
	 //  SETTERS & GETTERS //
	 ////////////////////////

	/**
	 * Set method for field x	[float]<br>
	 * Prototype: float  x
	 * 
	 * @param x - a instance of float.
	 * @return this VkStruct instance.
	 */ 
	 public VkViewport x(float x){
		 this.x = x;
		 setX0(this.ptr,  x);
		 return this;
	 }

	/**
	 * Get method for field x	[float]<br>
	 * Prototype: float  x
	 */ 
	 public float x(){
		 float var = getX0(super.ptr);
		 this.x = var;
		 return this.x;
	 }

	/**
	 * Set method for field y	[float]<br>
	 * Prototype: float  y
	 * 
	 * @param y - a instance of float.
	 * @return this VkStruct instance.
	 */ 
	 public VkViewport y(float y){
		 this.y = y;
		 setY0(this.ptr,  y);
		 return this;
	 }

	/**
	 * Get method for field y	[float]<br>
	 * Prototype: float  y
	 */ 
	 public float y(){
		 float var = getY0(super.ptr);
		 this.y = var;
		 return this.y;
	 }

	/**
	 * Set method for field width	[float]<br>
	 * Prototype: float  width
	 * 
	 * @param width - a instance of float.
	 * @return this VkStruct instance.
	 */ 
	 public VkViewport width(float width){
		 this.width = width;
		 setWidth0(this.ptr,  width);
		 return this;
	 }

	/**
	 * Get method for field width	[float]<br>
	 * Prototype: float  width
	 */ 
	 public float width(){
		 float var = getWidth0(super.ptr);
		 this.width = var;
		 return this.width;
	 }

	/**
	 * Set method for field height	[float]<br>
	 * Prototype: float  height
	 * 
	 * @param height - a instance of float.
	 * @return this VkStruct instance.
	 */ 
	 public VkViewport height(float height){
		 this.height = height;
		 setHeight0(this.ptr,  height);
		 return this;
	 }

	/**
	 * Get method for field height	[float]<br>
	 * Prototype: float  height
	 */ 
	 public float height(){
		 float var = getHeight0(super.ptr);
		 this.height = var;
		 return this.height;
	 }

	/**
	 * Set method for field minDepth	[float]<br>
	 * Prototype: float  minDepth
	 * 
	 * @param minDepth - a instance of float.
	 * @return this VkStruct instance.
	 */ 
	 public VkViewport minDepth(float minDepth){
		 this.minDepth = minDepth;
		 setMinDepth0(this.ptr,  minDepth);
		 return this;
	 }

	/**
	 * Get method for field minDepth	[float]<br>
	 * Prototype: float  minDepth
	 */ 
	 public float minDepth(){
		 float var = getMinDepth0(super.ptr);
		 this.minDepth = var;
		 return this.minDepth;
	 }

	/**
	 * Set method for field maxDepth	[float]<br>
	 * Prototype: float  maxDepth
	 * 
	 * @param maxDepth - a instance of float.
	 * @return this VkStruct instance.
	 */ 
	 public VkViewport maxDepth(float maxDepth){
		 this.maxDepth = maxDepth;
		 setMaxDepth0(this.ptr,  maxDepth);
		 return this;
	 }

	/**
	 * Get method for field maxDepth	[float]<br>
	 * Prototype: float  maxDepth
	 */ 
	 public float maxDepth(){
		 float var = getMaxDepth0(super.ptr);
		 this.maxDepth = var;
		 return this.maxDepth;
	 }


   /* (non-Javadoc)
    * @see java.lang.Object#toString()
    */
    @Override
    public String toString() {
         StringBuilder builder = new StringBuilder();
         builder.append("VkViewport [ ")
				.append("x: ").append(x() )
				.append(",\n y: ")
				.append(y() )
				.append(",\n width: ")
				.append(width() )
				.append(",\n height: ")
				.append(height() )
				.append(",\n minDepth: ")
				.append(minDepth() )
				.append(",\n maxDepth: ")
				.append(maxDepth() )
				.append("]");
		 return builder.toString();
    }


	 //////////////////////////////////
	 // Native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * Native SET method for field x	[float]<br>
	 * Prototype: float  x
	 */ 
	 private static native void setX0(Buffer ptr, float _x);/*
		  VkViewport* vkObj = (VkViewport*)(ptr);
		  vkObj->x = (float) (_x);
	  */

	/**
	 * Native GET method for field x	[float]<br>
	 * Prototype: float  x
	 */ 
	 private static native float getX0(Buffer ptr);/*
		  VkViewport* vkObj = (VkViewport*)(ptr);
		  return (jfloat) (vkObj->x);
	 */

	/**
	 * Native SET method for field y	[float]<br>
	 * Prototype: float  y
	 */ 
	 private static native void setY0(Buffer ptr, float _y);/*
		  VkViewport* vkObj = (VkViewport*)(ptr);
		  vkObj->y = (float) (_y);
	  */

	/**
	 * Native GET method for field y	[float]<br>
	 * Prototype: float  y
	 */ 
	 private static native float getY0(Buffer ptr);/*
		  VkViewport* vkObj = (VkViewport*)(ptr);
		  return (jfloat) (vkObj->y);
	 */

	/**
	 * Native SET method for field width	[float]<br>
	 * Prototype: float  width
	 */ 
	 private static native void setWidth0(Buffer ptr, float _width);/*
		  VkViewport* vkObj = (VkViewport*)(ptr);
		  vkObj->width = (float) (_width);
	  */

	/**
	 * Native GET method for field width	[float]<br>
	 * Prototype: float  width
	 */ 
	 private static native float getWidth0(Buffer ptr);/*
		  VkViewport* vkObj = (VkViewport*)(ptr);
		  return (jfloat) (vkObj->width);
	 */

	/**
	 * Native SET method for field height	[float]<br>
	 * Prototype: float  height
	 */ 
	 private static native void setHeight0(Buffer ptr, float _height);/*
		  VkViewport* vkObj = (VkViewport*)(ptr);
		  vkObj->height = (float) (_height);
	  */

	/**
	 * Native GET method for field height	[float]<br>
	 * Prototype: float  height
	 */ 
	 private static native float getHeight0(Buffer ptr);/*
		  VkViewport* vkObj = (VkViewport*)(ptr);
		  return (jfloat) (vkObj->height);
	 */

	/**
	 * Native SET method for field minDepth	[float]<br>
	 * Prototype: float  minDepth
	 */ 
	 private static native void setMinDepth0(Buffer ptr, float _minDepth);/*
		  VkViewport* vkObj = (VkViewport*)(ptr);
		  vkObj->minDepth = (float) (_minDepth);
	  */

	/**
	 * Native GET method for field minDepth	[float]<br>
	 * Prototype: float  minDepth
	 */ 
	 private static native float getMinDepth0(Buffer ptr);/*
		  VkViewport* vkObj = (VkViewport*)(ptr);
		  return (jfloat) (vkObj->minDepth);
	 */

	/**
	 * Native SET method for field maxDepth	[float]<br>
	 * Prototype: float  maxDepth
	 */ 
	 private static native void setMaxDepth0(Buffer ptr, float _maxDepth);/*
		  VkViewport* vkObj = (VkViewport*)(ptr);
		  vkObj->maxDepth = (float) (_maxDepth);
	  */

	/**
	 * Native GET method for field maxDepth	[float]<br>
	 * Prototype: float  maxDepth
	 */ 
	 private static native float getMaxDepth0(Buffer ptr);/*
		  VkViewport* vkObj = (VkViewport*)(ptr);
		  return (jfloat) (vkObj->maxDepth);
	 */



} // end of class VkViewport
