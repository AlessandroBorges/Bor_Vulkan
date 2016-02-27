// class wrapping Vulkan's VkDispatchIndirectCommand struct.
package bor.vulkan.structs;

import bor.vulkan.*;
import bor.vulkan.enumerations.*;
import java.nio.ByteBuffer;


/**
 *  Class for Java-Vulkan integration 
 *  This class is a Java front end for struct VkDispatchIndirectCommand 
 * @Author Alessandro Borges 
 */
public class VkDispatchIndirectCommand extends VkStruct {
	/** ID of this structure [103]  */
	 public static final int TAG = VKDISPATCHINDIRECTCOMMAND_ID;

	 // fields //
	/**
	 *  uint32_t 	x 
	 */ 
	int 	x;

	/**
	 *  uint32_t 	y 
	 */ 
	int 	y;

	/**
	 *  uint32_t 	z 
	 */ 
	int 	z;

	/**
	 * Ctor
	 */
	public VkDispatchIndirectCommand(){ 
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
	 * Prototype: uint32_t  x
	 */ 
	 public void x(int x){
		 this.x = x;
		x0(super.ptr, x);
	 }

	/**
	 * get method for field x
	 * Prototype: uint32_t  x
	 */ 
	 public int x(){
		 // return  this.x;
		 return x0(super.ptr);
	 }

	/**
	 * Set method for field y
	 * Prototype: uint32_t  y
	 */ 
	 public void y(int y){
		 this.y = y;
		y0(super.ptr, y);
	 }

	/**
	 * get method for field y
	 * Prototype: uint32_t  y
	 */ 
	 public int y(){
		 // return  this.y;
		 return y0(super.ptr);
	 }

	/**
	 * Set method for field z
	 * Prototype: uint32_t  z
	 */ 
	 public void z(int z){
		 this.z = z;
		z0(super.ptr, z);
	 }

	/**
	 * get method for field z
	 * Prototype: uint32_t  z
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
	 * Prototype: uint32_t  x
	 */ 
	 private static native void x0(ByteBuffer ptr, int _x);/*
		  VkDispatchIndirectCommand _obj = (VkDispatchIndirectCommand)(*ptr);
		  _obj.x = (uint32_t) (_x);
	  */

	/**
	 * get method for field x
	 * Prototype: uint32_t  x
	 */ 
	 private static native int x0(ByteBuffer ptr);/*
		  VkDispatchIndirectCommand _obj = (VkDispatchIndirectCommand)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native Set method for field y
	 * Prototype: uint32_t  y
	 */ 
	 private static native void y0(ByteBuffer ptr, int _y);/*
		  VkDispatchIndirectCommand _obj = (VkDispatchIndirectCommand)(*ptr);
		  _obj.y = (uint32_t) (_y);
	  */

	/**
	 * get method for field y
	 * Prototype: uint32_t  y
	 */ 
	 private static native int y0(ByteBuffer ptr);/*
		  VkDispatchIndirectCommand _obj = (VkDispatchIndirectCommand)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native Set method for field z
	 * Prototype: uint32_t  z
	 */ 
	 private static native void z0(ByteBuffer ptr, int _z);/*
		  VkDispatchIndirectCommand _obj = (VkDispatchIndirectCommand)(*ptr);
		  _obj.z = (uint32_t) (_z);
	  */

	/**
	 * get method for field z
	 * Prototype: uint32_t  z
	 */ 
	 private static native int z0(ByteBuffer ptr);/*
		  VkDispatchIndirectCommand _obj = (VkDispatchIndirectCommand)(ptr);
		  return (jint) (_obj.uint32_t);
	 */



} // end of class VkDispatchIndirectCommand
