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
 *  Project Bor-Vulkan 
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
	/** TAG of this structure [41]  */
	 private static final String TAG = "VkComponentMapping";

	/** ID of this structure [41]  */
	 public static final int TAG_ID = VKCOMPONENTMAPPING_ID;

	/** P wrapper for THIS object */
	 private  P<VkComponentMapping> p;

	 ///////////////////
	 // Struct fields //
	 ///////////////////
	/**
	 *  VkComponentSwizzle 	r	[vkenum]
	 */ 
	 VkComponentSwizzle 	r;

	/**
	 *  VkComponentSwizzle 	g	[vkenum]
	 */ 
	 VkComponentSwizzle 	g;

	/**
	 *  VkComponentSwizzle 	b	[vkenum]
	 */ 
	 VkComponentSwizzle 	b;

	/**
	 *  VkComponentSwizzle 	a	[vkenum]
	 */ 
	 VkComponentSwizzle 	a;

	/**
	 * Ctor
	 */
	public VkComponentMapping(){ 
		 super(sizeOf()); 
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkComponentMapping(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address and memSize
	 * @param address - native address 
	 * @param memSize - buffer size 
	 */
	 public VkComponentMapping(long address, int memSize){ 
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
	 public static P<VkComponentMapping> createNullPointer(){
	        P<VkComponentMapping> p = new  P<VkComponentMapping>(new VkComponentMapping());
	        return p;
	    }


	/** 
	 * Return this VkObject instance wrapped in pointer P<br>
	 *
	 *  P&lt;? extends VkObject &gt;
	 *
	 * @return  a P container wrapping this object.
	 */
	 public P<VkComponentMapping> getP() {
	       if(p == null ){
	           p = new P<VkComponentMapping> (this);
	       }
	        return p;
	    }


	 ////////////////////////
	 //  SETTERS & GETTERS //
	 ////////////////////////

	/**
	 * Set method for field r	[vkenum]<br>
	 * Prototype: VkComponentSwizzle  r
	 */ 
	 public void r(VkComponentSwizzle r){
		 this.r = r;
		r0(super.ptr, r);
	 }

	/**
	 * get method for field r	[vkenum]<br>
	 * Prototype: VkComponentSwizzle  r
	 */ 
	 public VkComponentSwizzle r(){
		 // return  this.r;
		 return r0(super.ptr);
	 }

	/**
	 * Set method for field g	[vkenum]<br>
	 * Prototype: VkComponentSwizzle  g
	 */ 
	 public void g(VkComponentSwizzle g){
		 this.g = g;
		g0(super.ptr, g);
	 }

	/**
	 * get method for field g	[vkenum]<br>
	 * Prototype: VkComponentSwizzle  g
	 */ 
	 public VkComponentSwizzle g(){
		 // return  this.g;
		 return g0(super.ptr);
	 }

	/**
	 * Set method for field b	[vkenum]<br>
	 * Prototype: VkComponentSwizzle  b
	 */ 
	 public void b(VkComponentSwizzle b){
		 this.b = b;
		b0(super.ptr, b);
	 }

	/**
	 * get method for field b	[vkenum]<br>
	 * Prototype: VkComponentSwizzle  b
	 */ 
	 public VkComponentSwizzle b(){
		 // return  this.b;
		 return b0(super.ptr);
	 }

	/**
	 * Set method for field a	[vkenum]<br>
	 * Prototype: VkComponentSwizzle  a
	 */ 
	 public void a(VkComponentSwizzle a){
		 this.a = a;
		a0(super.ptr, a);
	 }

	/**
	 * get method for field a	[vkenum]<br>
	 * Prototype: VkComponentSwizzle  a
	 */ 
	 public VkComponentSwizzle a(){
		 // return  this.a;
		 return a0(super.ptr);
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field r	[vkenum]<br>
	 * Prototype: VkComponentSwizzle  r
	 */ 
	 private static native void r0(ByteBuffer ptr, VkComponentSwizzle _r);/*
		  VkComponentMapping _obj = (VkComponentMapping)(*ptr);
		  _obj.r = (VkComponentSwizzle) (_r);
	  */

	/**
	 * native GET method for field r	[vkenum]<br>
	 * Prototype: VkComponentSwizzle  r
	 */ 
	 private static native VkComponentSwizzle r0(ByteBuffer ptr);/*
		  VkComponentMapping _obj = (VkComponentMapping)(ptr);
		  return (VkComponentSwizzle) (_obj.VkComponentSwizzle);
	 */

	/**
	 * native SET method for field g	[vkenum]<br>
	 * Prototype: VkComponentSwizzle  g
	 */ 
	 private static native void g0(ByteBuffer ptr, VkComponentSwizzle _g);/*
		  VkComponentMapping _obj = (VkComponentMapping)(*ptr);
		  _obj.g = (VkComponentSwizzle) (_g);
	  */

	/**
	 * native GET method for field g	[vkenum]<br>
	 * Prototype: VkComponentSwizzle  g
	 */ 
	 private static native VkComponentSwizzle g0(ByteBuffer ptr);/*
		  VkComponentMapping _obj = (VkComponentMapping)(ptr);
		  return (VkComponentSwizzle) (_obj.VkComponentSwizzle);
	 */

	/**
	 * native SET method for field b	[vkenum]<br>
	 * Prototype: VkComponentSwizzle  b
	 */ 
	 private static native void b0(ByteBuffer ptr, VkComponentSwizzle _b);/*
		  VkComponentMapping _obj = (VkComponentMapping)(*ptr);
		  _obj.b = (VkComponentSwizzle) (_b);
	  */

	/**
	 * native GET method for field b	[vkenum]<br>
	 * Prototype: VkComponentSwizzle  b
	 */ 
	 private static native VkComponentSwizzle b0(ByteBuffer ptr);/*
		  VkComponentMapping _obj = (VkComponentMapping)(ptr);
		  return (VkComponentSwizzle) (_obj.VkComponentSwizzle);
	 */

	/**
	 * native SET method for field a	[vkenum]<br>
	 * Prototype: VkComponentSwizzle  a
	 */ 
	 private static native void a0(ByteBuffer ptr, VkComponentSwizzle _a);/*
		  VkComponentMapping _obj = (VkComponentMapping)(*ptr);
		  _obj.a = (VkComponentSwizzle) (_a);
	  */

	/**
	 * native GET method for field a	[vkenum]<br>
	 * Prototype: VkComponentSwizzle  a
	 */ 
	 private static native VkComponentSwizzle a0(ByteBuffer ptr);/*
		  VkComponentMapping _obj = (VkComponentMapping)(ptr);
		  return (VkComponentSwizzle) (_obj.VkComponentSwizzle);
	 */



} // end of class VkComponentMapping
