/**
 * Class wrapping Vulkan's VkOffset2D struct.
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
 *  This class is a Java front end for struct VkOffset2D. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkOffset2D {
 *     int32_t    x;
 *     int32_t    y;
 * } VkOffset2D;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.01 (beta) 
 */
public class VkOffset2D extends VkStruct {
	/** TAG of this structure [55]  */
	 private static final String TAG = "VkOffset2D";

	/** ID of this structure [55]  */
	 public static final int TAG_ID = VKOFFSET2D_ID;

	/** P wrapper for THIS object */
	 private  P<VkOffset2D> p;

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
	 * Ctor
	 */
	public VkOffset2D(){ 
		 super(sizeOf()); 
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkOffset2D(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address and memSize
	 * @param address - native address 
	 * @param memSize - buffer size 
	 */
	 public VkOffset2D(long address , int memSize){ 
		 super(address, memSize); 
	 }

	/**
	 * Ctor with Address only. Size guessed by #sizeof()
	 * @param address - native address 
	 */
	 public VkOffset2D(long address){ 
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
	 public static P<VkOffset2D> createNullPointer(){
	        P<VkOffset2D> p = new  P<VkOffset2D>(new VkOffset2D());
	        return p;
	    }


	/** 
	 * Return this VkObject instance wrapped in pointer P<br>
	 *
	 *  P&lt;? extends VkObject &gt;
	 *
	 * @return  a P container wrapping this object.
	 */
	 public P<VkOffset2D> getP() {
	       if(p == null ){
	           p = new P<VkOffset2D> (this);
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


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field x	[int]<br>
	 * Prototype: int32_t  x
	 */ 
	 private static native void setX0(Buffer ptr, int _x);/*
		  VkOffset2D* vkObj = (VkOffset2D*)(ptr);
		  vkObj->x = (int32_t) (_x);
	  */

	/**
	 * native GET method for field x	[int]<br>
	 * Prototype: int32_t  x
	 */ 
	 private static native int getX0(Buffer ptr);/*
		  VkOffset2D vkObj = (VkOffset2D*)(ptr);
		  return (jint) (vkObj->x);
	 */

	/**
	 * native SET method for field y	[int]<br>
	 * Prototype: int32_t  y
	 */ 
	 private static native void setY0(Buffer ptr, int _y);/*
		  VkOffset2D* vkObj = (VkOffset2D*)(ptr);
		  vkObj->y = (int32_t) (_y);
	  */

	/**
	 * native GET method for field y	[int]<br>
	 * Prototype: int32_t  y
	 */ 
	 private static native int getY0(Buffer ptr);/*
		  VkOffset2D vkObj = (VkOffset2D*)(ptr);
		  return (jint) (vkObj->y);
	 */



} // end of class VkOffset2D
