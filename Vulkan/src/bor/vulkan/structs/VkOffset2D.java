// class wrapping Vulkan's VkOffset2D struct.
package bor.vulkan.structs;

import bor.vulkan.*;
import bor.vulkan.enumerations.*;
import java.nio.ByteBuffer;


/**
 *  Class for Java-Vulkan integration 
 *  This class is a Java front end for struct VkOffset2D 
 * @Author Alessandro Borges 
 */
public class VkOffset2D extends VkStruct {
	/** ID of this structure [55]  */
	 public static final int TAG = VKOFFSET2D_ID;

	 // fields //
	/**
	 *  int32_t 	x 
	 */ 
	int 	x;

	/**
	 *  int32_t 	y 
	 */ 
	int 	y;

	/**
	 * Ctor
	 */
	public VkOffset2D(){ 
		 super(sizeOf()); 
	 }

	/** 
	 * Method to get native size of this structure 
	 */
	 public static int sizeOf(){ 
		 return sizeOf(TAG); 
	}


	 // /////////////////////
	 //  SETTERS & GETTERS //
	 // /////////////////////

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


	 // ////////////////////////////////
	 // native SETTERS & GETTERS //
	 // ////////////////////////////////
	/**
	 * native Set method for field x
	 * Prototype: int32_t  x
	 */ 
	 private static native void x0(ByteBuffer ptr, int _x);/*
		  VkOffset2D _obj = (VkOffset2D)(*ptr);
		  _obj.x = (int32_t) (_x);
	  */

	/**
	 * get method for field x
	 * Prototype: int32_t  x
	 */ 
	 private static native int x0(ByteBuffer ptr);/*
		  VkOffset2D _obj = (VkOffset2D)(ptr);
		  return (jint) (_obj.int32_t);
	 */

	/**
	 * native Set method for field y
	 * Prototype: int32_t  y
	 */ 
	 private static native void y0(ByteBuffer ptr, int _y);/*
		  VkOffset2D _obj = (VkOffset2D)(*ptr);
		  _obj.y = (int32_t) (_y);
	  */

	/**
	 * get method for field y
	 * Prototype: int32_t  y
	 */ 
	 private static native int y0(ByteBuffer ptr);/*
		  VkOffset2D _obj = (VkOffset2D)(ptr);
		  return (jint) (_obj.int32_t);
	 */



} // end of class VkOffset2D
