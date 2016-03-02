/**
 * Class wrapping Vulkan's VkComponentMapping struct.
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
 *  This class is a Java front end for struct VkComponentMapping. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkComponentMapping {
 *     VkComponentSwizzle    r;
 *     VkComponentSwizzle    g;
 *     VkComponentSwizzle    b;
 *     VkComponentSwizzle    a;
 * } VkComponentMapping;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.01 (beta) 
 */
public class VkComponentMapping extends VkStruct {
	/** TAG of this structure [165]  */
	 private static final String TAG = "VkComponentMapping";

	/** ID of this structure [165]  */
	 public static final int TAG_ID = VKCOMPONENTMAPPING_ID;

	 // fields //
	/**
	 *  VkComponentSwizzle 	r 
	 */ 
	VkComponentSwizzle 	r;

	/**
	 *  VkComponentSwizzle 	g 
	 */ 
	VkComponentSwizzle 	g;

	/**
	 *  VkComponentSwizzle 	b 
	 */ 
	VkComponentSwizzle 	b;

	/**
	 *  VkComponentSwizzle 	a 
	 */ 
	VkComponentSwizzle 	a;

	/**
	 * Ctor
	 */
	public VkComponentMapping(){ 
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
	 * Set method for field r
	 * Prototype: VkComponentSwizzle  r
	 */ 
	 public void r(VkComponentSwizzle r){
		 this.r = r;
		r0(super.ptr, r);
	 }

	/**
	 * get method for field r
	 * Prototype: VkComponentSwizzle  r
	 */ 
	 public VkComponentSwizzle r(){
		 // return  this.r;
		 return r0(super.ptr);
	 }

	/**
	 * Set method for field g
	 * Prototype: VkComponentSwizzle  g
	 */ 
	 public void g(VkComponentSwizzle g){
		 this.g = g;
		g0(super.ptr, g);
	 }

	/**
	 * get method for field g
	 * Prototype: VkComponentSwizzle  g
	 */ 
	 public VkComponentSwizzle g(){
		 // return  this.g;
		 return g0(super.ptr);
	 }

	/**
	 * Set method for field b
	 * Prototype: VkComponentSwizzle  b
	 */ 
	 public void b(VkComponentSwizzle b){
		 this.b = b;
		b0(super.ptr, b);
	 }

	/**
	 * get method for field b
	 * Prototype: VkComponentSwizzle  b
	 */ 
	 public VkComponentSwizzle b(){
		 // return  this.b;
		 return b0(super.ptr);
	 }

	/**
	 * Set method for field a
	 * Prototype: VkComponentSwizzle  a
	 */ 
	 public void a(VkComponentSwizzle a){
		 this.a = a;
		a0(super.ptr, a);
	 }

	/**
	 * get method for field a
	 * Prototype: VkComponentSwizzle  a
	 */ 
	 public VkComponentSwizzle a(){
		 // return  this.a;
		 return a0(super.ptr);
	 }


	 // ////////////////////////////////
	 // native SETTERS & GETTERS //
	 // ////////////////////////////////
	/**
	 * native Set method for field r
	 * Prototype: VkComponentSwizzle  r
	 */ 
	 private static native void r0(ByteBuffer ptr, VkComponentSwizzle _r);/*
		  VkComponentMapping _obj = (VkComponentMapping)(*ptr);
		  _obj.r = (VkComponentSwizzle) (_r);
	  */

	/**
	 * get method for field r
	 * Prototype: VkComponentSwizzle  r
	 */ 
	 private static native VkComponentSwizzle r0(ByteBuffer ptr);/*
		  VkComponentMapping _obj = (VkComponentMapping)(ptr);
		  return (VkComponentSwizzle) (_obj.VkComponentSwizzle);
	 */

	/**
	 * native Set method for field g
	 * Prototype: VkComponentSwizzle  g
	 */ 
	 private static native void g0(ByteBuffer ptr, VkComponentSwizzle _g);/*
		  VkComponentMapping _obj = (VkComponentMapping)(*ptr);
		  _obj.g = (VkComponentSwizzle) (_g);
	  */

	/**
	 * get method for field g
	 * Prototype: VkComponentSwizzle  g
	 */ 
	 private static native VkComponentSwizzle g0(ByteBuffer ptr);/*
		  VkComponentMapping _obj = (VkComponentMapping)(ptr);
		  return (VkComponentSwizzle) (_obj.VkComponentSwizzle);
	 */

	/**
	 * native Set method for field b
	 * Prototype: VkComponentSwizzle  b
	 */ 
	 private static native void b0(ByteBuffer ptr, VkComponentSwizzle _b);/*
		  VkComponentMapping _obj = (VkComponentMapping)(*ptr);
		  _obj.b = (VkComponentSwizzle) (_b);
	  */

	/**
	 * get method for field b
	 * Prototype: VkComponentSwizzle  b
	 */ 
	 private static native VkComponentSwizzle b0(ByteBuffer ptr);/*
		  VkComponentMapping _obj = (VkComponentMapping)(ptr);
		  return (VkComponentSwizzle) (_obj.VkComponentSwizzle);
	 */

	/**
	 * native Set method for field a
	 * Prototype: VkComponentSwizzle  a
	 */ 
	 private static native void a0(ByteBuffer ptr, VkComponentSwizzle _a);/*
		  VkComponentMapping _obj = (VkComponentMapping)(*ptr);
		  _obj.a = (VkComponentSwizzle) (_a);
	  */

	/**
	 * get method for field a
	 * Prototype: VkComponentSwizzle  a
	 */ 
	 private static native VkComponentSwizzle a0(ByteBuffer ptr);/*
		  VkComponentMapping _obj = (VkComponentMapping)(ptr);
		  return (VkComponentSwizzle) (_obj.VkComponentSwizzle);
	 */



} // end of class VkComponentMapping
