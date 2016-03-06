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
 *  Project Bor-Vulkan 
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
	/** TAG of this structure [29]  */
	 private static final String TAG = "VkOffset3D";

	/** ID of this structure [29]  */
	 public static final int TAG_ID = VKOFFSET3D_ID;

	 // fields //
	/**
	 *  int32_t 	x	[int]
	 */ 
	int 	x;

	/**
	 *  int32_t 	y	[int]
	 */ 
	int 	y;

	/**
	 *  int32_t 	z	[int]
	 */ 
	int 	z;

	/**
	 * Ctor
	 */
	public VkOffset3D(){ 
		 super(sizeOf()); 
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkOffset3D(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address and memSize
	 * @param address - native address 
	 * @param memSize - buffer size 
	 */
	 public VkOffset3D(long address, int memSize){ 
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
	 public static P<VkOffset3D> createNullPointer(){
	        P<VkOffset3D> p = new  P<VkOffset3D>(new VkOffset3D());
	        return p;
	    }

	 ////////////////////////
	 //  SETTERS & GETTERS //
	 ////////////////////////

	/**
	 * Set method for field x	[int]<br>
	 * Prototype: int32_t  x
	 */ 
	 public void x(int x){
		 this.x = x;
		x0(super.ptr, x);
	 }

	/**
	 * get method for field x	[int]<br>
	 * Prototype: int32_t  x
	 */ 
	 public int x(){
		 // return  this.x;
		 return x0(super.ptr);
	 }

	/**
	 * Set method for field y	[int]<br>
	 * Prototype: int32_t  y
	 */ 
	 public void y(int y){
		 this.y = y;
		y0(super.ptr, y);
	 }

	/**
	 * get method for field y	[int]<br>
	 * Prototype: int32_t  y
	 */ 
	 public int y(){
		 // return  this.y;
		 return y0(super.ptr);
	 }

	/**
	 * Set method for field z	[int]<br>
	 * Prototype: int32_t  z
	 */ 
	 public void z(int z){
		 this.z = z;
		z0(super.ptr, z);
	 }

	/**
	 * get method for field z	[int]<br>
	 * Prototype: int32_t  z
	 */ 
	 public int z(){
		 // return  this.z;
		 return z0(super.ptr);
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field x	[int]<br>
	 * Prototype: int32_t  x
	 */ 
	 private static native void x0(ByteBuffer ptr, int _x);/*
		  VkOffset3D _obj = (VkOffset3D)(*ptr);
		  _obj.x = (int32_t) (_x);
	  */

	/**
	 * native GET method for field x	[int]<br>
	 * Prototype: int32_t  x
	 */ 
	 private static native int x0(ByteBuffer ptr);/*
		  VkOffset3D _obj = (VkOffset3D)(ptr);
		  return (jint) (_obj.int32_t);
	 */

	/**
	 * native SET method for field y	[int]<br>
	 * Prototype: int32_t  y
	 */ 
	 private static native void y0(ByteBuffer ptr, int _y);/*
		  VkOffset3D _obj = (VkOffset3D)(*ptr);
		  _obj.y = (int32_t) (_y);
	  */

	/**
	 * native GET method for field y	[int]<br>
	 * Prototype: int32_t  y
	 */ 
	 private static native int y0(ByteBuffer ptr);/*
		  VkOffset3D _obj = (VkOffset3D)(ptr);
		  return (jint) (_obj.int32_t);
	 */

	/**
	 * native SET method for field z	[int]<br>
	 * Prototype: int32_t  z
	 */ 
	 private static native void z0(ByteBuffer ptr, int _z);/*
		  VkOffset3D _obj = (VkOffset3D)(*ptr);
		  _obj.z = (int32_t) (_z);
	  */

	/**
	 * native GET method for field z	[int]<br>
	 * Prototype: int32_t  z
	 */ 
	 private static native int z0(ByteBuffer ptr);/*
		  VkOffset3D _obj = (VkOffset3D)(ptr);
		  return (jint) (_obj.int32_t);
	 */



} // end of class VkOffset3D
