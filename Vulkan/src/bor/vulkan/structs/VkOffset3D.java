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

import java.nio.Buffer;


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

    //@formatter:off
    /*JNI
    #include <BorVulkan.hpp>
    */  

	/** TAG of this structure [29]  */
	 private static final String TAG = "VkOffset3D";

	/** ID of this structure [29]  */
	 public static final int TAG_ID = VKOFFSET3D_ID;

	/** P wrapper for THIS object */
	 private  P<VkOffset3D> p;

	 ///////////////////
	 // Struct fields //
	 ///////////////////
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
	 public VkOffset3D(long address , int memSize){ 
		 super(address, memSize); 
	 }

	/**
	 * Ctor with Address only. Size guessed by #sizeof()
	 * @param address - native address 
	 */
	 public VkOffset3D(long address){ 
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
	 public static P<VkOffset3D> createNullPointer(){
	        P<VkOffset3D> p = new  P<VkOffset3D>(new VkOffset3D());
	        return p;
	    }


	/** 
	 * Return this VkObject instance wrapped in pointer P<br>
	 *
	 *  P&lt;? extends VkObject &gt;
	 *
	 * @return  a P container wrapping this object.
	 */
	 public P<VkOffset3D> getP() {
	       if(p == null ){
	           p = new P<VkOffset3D> (this);
	       }
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
		 setX0(this.ptr,  x);
	 }

	/**
	 * Get method for field x	[int]<br>
	 * Prototype: int32_t  x
	 */ 
	 public int x(){
		 int var = getX0(super.ptr);
		 this.x = var;
		 return this.x;
	 }

	/**
	 * Set method for field y	[int]<br>
	 * Prototype: int32_t  y
	 */ 
	 public void y(int y){
		 this.y = y;
		 setY0(this.ptr,  y);
	 }

	/**
	 * Get method for field y	[int]<br>
	 * Prototype: int32_t  y
	 */ 
	 public int y(){
		 int var = getY0(super.ptr);
		 this.y = var;
		 return this.y;
	 }

	/**
	 * Set method for field z	[int]<br>
	 * Prototype: int32_t  z
	 */ 
	 public void z(int z){
		 this.z = z;
		 setZ0(this.ptr,  z);
	 }

	/**
	 * Get method for field z	[int]<br>
	 * Prototype: int32_t  z
	 */ 
	 public int z(){
		 int var = getZ0(super.ptr);
		 this.z = var;
		 return this.z;
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field x	[int]<br>
	 * Prototype: int32_t  x
	 */ 
	 private static native void setX0(Buffer ptr, int _x);/*
		  VkOffset3D* vkObj = (VkOffset3D*)(ptr);
		  vkObj->x = (int32_t) (_x);
	  */

	/**
	 * native GET method for field x	[int]<br>
	 * Prototype: int32_t  x
	 */ 
	 private static native int getX0(Buffer ptr);/*
		  VkOffset3D* vkObj = (VkOffset3D*)(ptr);
		  return (jint) (vkObj->x);
	 */

	/**
	 * native SET method for field y	[int]<br>
	 * Prototype: int32_t  y
	 */ 
	 private static native void setY0(Buffer ptr, int _y);/*
		  VkOffset3D* vkObj = (VkOffset3D*)(ptr);
		  vkObj->y = (int32_t) (_y);
	  */

	/**
	 * native GET method for field y	[int]<br>
	 * Prototype: int32_t  y
	 */ 
	 private static native int getY0(Buffer ptr);/*
		  VkOffset3D* vkObj = (VkOffset3D*)(ptr);
		  return (jint) (vkObj->y);
	 */

	/**
	 * native SET method for field z	[int]<br>
	 * Prototype: int32_t  z
	 */ 
	 private static native void setZ0(Buffer ptr, int _z);/*
		  VkOffset3D* vkObj = (VkOffset3D*)(ptr);
		  vkObj->z = (int32_t) (_z);
	  */

	/**
	 * native GET method for field z	[int]<br>
	 * Prototype: int32_t  z
	 */ 
	 private static native int getZ0(Buffer ptr);/*
		  VkOffset3D* vkObj = (VkOffset3D*)(ptr);
		  return (jint) (vkObj->z);
	 */



} // end of class VkOffset3D
