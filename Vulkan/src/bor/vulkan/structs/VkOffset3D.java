/**
 * Class wrapping Vulkan's VkOffset3D struct.
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
 *  This class is a Java front end for struct VkOffset3D. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkOffset3D {
 *     int32_t    x;
 *     int32_t    y;
 *     int32_t    z;
 * } VkOffset3D;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.01 (beta) 
 */
public class VkOffset3D extends VkStruct {
	/** TAG of this structure [153]  */
	 private static final String TAG = "VkOffset3D";

	/** ID of this structure [153]  */
	 public static final int TAG_ID = VKOFFSET3D_ID;

	 // fields //
	/**
	 *  int32_t 	x		 */ 
	int 	x;

	/**
	 *  int32_t 	y		 */ 
	int 	y;

	/**
	 *  int32_t 	z		 */ 
	int 	z;

	/**
	 * Ctor
	 */
	public VkOffset3D(){ 
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
	 * Prototype: int32_t  x
	 */ 
	 public void x(int x){
		 this.x = x;
		x0(super.ptr, x);
	 }

	/**
	 * get method for field x	
	 * Prototype: int32_t  x
	 */ 
	 public int x(){
		 // return  this.x;
		 return x0(super.ptr);
	 }

	/**
	 * Set method for field y	
	 * Prototype: int32_t  y
	 */ 
	 public void y(int y){
		 this.y = y;
		y0(super.ptr, y);
	 }

	/**
	 * get method for field y	
	 * Prototype: int32_t  y
	 */ 
	 public int y(){
		 // return  this.y;
		 return y0(super.ptr);
	 }

	/**
	 * Set method for field z	
	 * Prototype: int32_t  z
	 */ 
	 public void z(int z){
		 this.z = z;
		z0(super.ptr, z);
	 }

	/**
	 * get method for field z	
	 * Prototype: int32_t  z
	 */ 
	 public int z(){
		 // return  this.z;
		 return z0(super.ptr);
	 }


	 // ////////////////////////////////
	 // native SETTERS & GETTERS //
	 // ////////////////////////////////
	/**
	 * native Set method for field x	
	 * Prototype: int32_t  x
	 */ 
	 private static native void x0(ByteBuffer ptr, int _x);/*
		  VkOffset3D _obj = (VkOffset3D)(*ptr);
		  _obj.x = (int32_t) (_x);
	  */

	/**
	 * get method for field x	
	 * Prototype: int32_t  x
	 */ 
	 private static native int x0(ByteBuffer ptr);/*
		  VkOffset3D _obj = (VkOffset3D)(ptr);
		  return (jint) (_obj.int32_t);
	 */

	/**
	 * native Set method for field y	
	 * Prototype: int32_t  y
	 */ 
	 private static native void y0(ByteBuffer ptr, int _y);/*
		  VkOffset3D _obj = (VkOffset3D)(*ptr);
		  _obj.y = (int32_t) (_y);
	  */

	/**
	 * get method for field y	
	 * Prototype: int32_t  y
	 */ 
	 private static native int y0(ByteBuffer ptr);/*
		  VkOffset3D _obj = (VkOffset3D)(ptr);
		  return (jint) (_obj.int32_t);
	 */

	/**
	 * native Set method for field z	
	 * Prototype: int32_t  z
	 */ 
	 private static native void z0(ByteBuffer ptr, int _z);/*
		  VkOffset3D _obj = (VkOffset3D)(*ptr);
		  _obj.z = (int32_t) (_z);
	  */

	/**
	 * get method for field z	
	 * Prototype: int32_t  z
	 */ 
	 private static native int z0(ByteBuffer ptr);/*
		  VkOffset3D _obj = (VkOffset3D)(ptr);
		  return (jint) (_obj.int32_t);
	 */



} // end of class VkOffset3D
