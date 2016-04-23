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

import java.nio.Buffer;


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

    //@formatter:off
    /*JNI
    #include <BorVulkan.hpp>
    */  

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
		 super(TAG_ID);
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
	 public VkComponentMapping(long address , int memSize){ 
		 super(address, memSize); 
	 }

	/**
	 * Ctor with Address only. Size guessed by #sizeof()
	 * @param address - native address 
	 */
	 public VkComponentMapping(long address){ 
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
		 int enumVal = r.getValue();
		 setR0(this.ptr, enumVal );
	 }

	/**
	 * Get method for field r	[vkenum]<br>
	 * Prototype: VkComponentSwizzle  r
	 */ 
	 public VkComponentSwizzle r(){
		 int nativeVal = getR0(super.ptr);
		 this.r = VkComponentSwizzle.fromValue(nativeVal); 
		 return this.r;
	 }

	/**
	 * Set method for field g	[vkenum]<br>
	 * Prototype: VkComponentSwizzle  g
	 */ 
	 public void g(VkComponentSwizzle g){
		 this.g = g;
		 int enumVal = g.getValue();
		 setG0(this.ptr, enumVal );
	 }

	/**
	 * Get method for field g	[vkenum]<br>
	 * Prototype: VkComponentSwizzle  g
	 */ 
	 public VkComponentSwizzle g(){
		 int nativeVal = getG0(super.ptr);
		 this.g = VkComponentSwizzle.fromValue(nativeVal); 
		 return this.g;
	 }

	/**
	 * Set method for field b	[vkenum]<br>
	 * Prototype: VkComponentSwizzle  b
	 */ 
	 public void b(VkComponentSwizzle b){
		 this.b = b;
		 int enumVal = b.getValue();
		 setB0(this.ptr, enumVal );
	 }

	/**
	 * Get method for field b	[vkenum]<br>
	 * Prototype: VkComponentSwizzle  b
	 */ 
	 public VkComponentSwizzle b(){
		 int nativeVal = getB0(super.ptr);
		 this.b = VkComponentSwizzle.fromValue(nativeVal); 
		 return this.b;
	 }

	/**
	 * Set method for field a	[vkenum]<br>
	 * Prototype: VkComponentSwizzle  a
	 */ 
	 public void a(VkComponentSwizzle a){
		 this.a = a;
		 int enumVal = a.getValue();
		 setA0(this.ptr, enumVal );
	 }

	/**
	 * Get method for field a	[vkenum]<br>
	 * Prototype: VkComponentSwizzle  a
	 */ 
	 public VkComponentSwizzle a(){
		 int nativeVal = getA0(super.ptr);
		 this.a = VkComponentSwizzle.fromValue(nativeVal); 
		 return this.a;
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field r	[vkenum]<br>
	 * Prototype: VkComponentSwizzle  r
	 */ 
	 private static native void setR0(Buffer ptr, int  _r);/*
		  VkComponentMapping* vkObj = (VkComponentMapping*)(ptr);
		  vkObj->r = (VkComponentSwizzle) (_r);
	  */

	/**
	 * native GET method for field r	[vkenum]<br>
	 * Prototype: VkComponentSwizzle  r
	 */ 
	 private static native int  getR0(Buffer ptr);/*
		  VkComponentMapping* vkObj = (VkComponentMapping*)(ptr);
		  return (VkComponentSwizzle) (vkObj->r);
	 */

	/**
	 * native SET method for field g	[vkenum]<br>
	 * Prototype: VkComponentSwizzle  g
	 */ 
	 private static native void setG0(Buffer ptr, int  _g);/*
		  VkComponentMapping* vkObj = (VkComponentMapping*)(ptr);
		  vkObj->g = (VkComponentSwizzle) (_g);
	  */

	/**
	 * native GET method for field g	[vkenum]<br>
	 * Prototype: VkComponentSwizzle  g
	 */ 
	 private static native int  getG0(Buffer ptr);/*
		  VkComponentMapping* vkObj = (VkComponentMapping*)(ptr);
		  return (VkComponentSwizzle) (vkObj->g);
	 */

	/**
	 * native SET method for field b	[vkenum]<br>
	 * Prototype: VkComponentSwizzle  b
	 */ 
	 private static native void setB0(Buffer ptr, int  _b);/*
		  VkComponentMapping* vkObj = (VkComponentMapping*)(ptr);
		  vkObj->b = (VkComponentSwizzle) (_b);
	  */

	/**
	 * native GET method for field b	[vkenum]<br>
	 * Prototype: VkComponentSwizzle  b
	 */ 
	 private static native int  getB0(Buffer ptr);/*
		  VkComponentMapping* vkObj = (VkComponentMapping*)(ptr);
		  return (VkComponentSwizzle) (vkObj->b);
	 */

	/**
	 * native SET method for field a	[vkenum]<br>
	 * Prototype: VkComponentSwizzle  a
	 */ 
	 private static native void setA0(Buffer ptr, int  _a);/*
		  VkComponentMapping* vkObj = (VkComponentMapping*)(ptr);
		  vkObj->a = (VkComponentSwizzle) (_a);
	  */

	/**
	 * native GET method for field a	[vkenum]<br>
	 * Prototype: VkComponentSwizzle  a
	 */ 
	 private static native int  getA0(Buffer ptr);/*
		  VkComponentMapping* vkObj = (VkComponentMapping*)(ptr);
		  return (VkComponentSwizzle) (vkObj->a);
	 */



} // end of class VkComponentMapping
