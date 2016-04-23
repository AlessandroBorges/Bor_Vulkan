/**
 * Class wrapping Vulkan's VkExtent2D struct.
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
 *  This class is a Java front end for struct VkExtent2D. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkExtent2D {
 *     uint32_t    width;
 *     uint32_t    height;
 * } VkExtent2D;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.01 (beta) 
 */
public class VkExtent2D extends VkStruct {

    //@formatter:off
    /*JNI
    #include <BorVulkan.hpp>
    */  

	/** TAG of this structure [56]  */
	 private static final String TAG = "VkExtent2D";

	/** ID of this structure [56]  */
	 public static final int TAG_ID = VKEXTENT2D_ID;

	/** P wrapper for THIS object */
	 private  P<VkExtent2D> p;

	 ///////////////////
	 // Struct fields //
	 ///////////////////
	/**
	 *  uint32_t 	width	[int]
	 */ 
	 int 	width;

	/**
	 *  uint32_t 	height	[int]
	 */ 
	 int 	height;

	/**
	 * Ctor
	 */
	public VkExtent2D(){ 
		 super(TAG_ID);
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkExtent2D(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address and memSize
	 * @param address - native address 
	 * @param memSize - buffer size 
	 */
	 public VkExtent2D(long address , int memSize){ 
		 super(address, memSize); 
	 }

	/**
	 * Ctor with Address only. Size guessed by #sizeof()
	 * @param address - native address 
	 */
	 public VkExtent2D(long address){ 
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
	 public static P<VkExtent2D> createNullPointer(){
	        P<VkExtent2D> p = new  P<VkExtent2D>(new VkExtent2D());
	        return p;
	    }


	/** 
	 * Return this VkObject instance wrapped in pointer P<br>
	 *
	 *  P&lt;? extends VkObject &gt;
	 *
	 * @return  a P container wrapping this object.
	 */
	 public P<VkExtent2D> getP() {
	       if(p == null ){
	           p = new P<VkExtent2D> (this);
	       }
	        return p;
	    }


	 ////////////////////////
	 //  SETTERS & GETTERS //
	 ////////////////////////

	/**
	 * Set method for field width	[int]<br>
	 * Prototype: uint32_t  width
	 */ 
	 public void width(int width){
		 this.width = width;
		 setWidth0(this.ptr,  width);
	 }

	/**
	 * Get method for field width	[int]<br>
	 * Prototype: uint32_t  width
	 */ 
	 public int width(){
		 int var = getWidth0(super.ptr);
		 this.width = var;
		 return this.width;
	 }

	/**
	 * Set method for field height	[int]<br>
	 * Prototype: uint32_t  height
	 */ 
	 public void height(int height){
		 this.height = height;
		 setHeight0(this.ptr,  height);
	 }

	/**
	 * Get method for field height	[int]<br>
	 * Prototype: uint32_t  height
	 */ 
	 public int height(){
		 int var = getHeight0(super.ptr);
		 this.height = var;
		 return this.height;
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field width	[int]<br>
	 * Prototype: uint32_t  width
	 */ 
	 private static native void setWidth0(Buffer ptr, int _width);/*
		  VkExtent2D* vkObj = (VkExtent2D*)(ptr);
		  vkObj->width = (uint32_t) (_width);
	  */

	/**
	 * native GET method for field width	[int]<br>
	 * Prototype: uint32_t  width
	 */ 
	 private static native int getWidth0(Buffer ptr);/*
		  VkExtent2D* vkObj = (VkExtent2D*)(ptr);
		  return (jint) (vkObj->width);
	 */

	/**
	 * native SET method for field height	[int]<br>
	 * Prototype: uint32_t  height
	 */ 
	 private static native void setHeight0(Buffer ptr, int _height);/*
		  VkExtent2D* vkObj = (VkExtent2D*)(ptr);
		  vkObj->height = (uint32_t) (_height);
	  */

	/**
	 * native GET method for field height	[int]<br>
	 * Prototype: uint32_t  height
	 */ 
	 private static native int getHeight0(Buffer ptr);/*
		  VkExtent2D* vkObj = (VkExtent2D*)(ptr);
		  return (jint) (vkObj->height);
	 */



} // end of class VkExtent2D
