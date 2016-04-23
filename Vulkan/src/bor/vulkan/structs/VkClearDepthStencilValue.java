/**
 * Class wrapping Vulkan's VkClearDepthStencilValue struct.
 * 
 * Bor_Vulkan Project Ver. 0.8.01 (beta)
 * Licence terms: 
 * The MIT License (MIT)
 * Copyright (c) 2016 Alessandro Borges
 * See https://opensource.org/licenses/MIT 
 */
package bor.vulkan.structs;

import java.nio.Buffer;
import java.nio.ByteBuffer;

import bor.vulkan.P;


/**
 *  Project Bor-Vulkan 
 *  Class for Java-Vulkan integration 
 *  This class is a Java front end for struct VkClearDepthStencilValue. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkClearDepthStencilValue {
 *     float       depth;
 *     uint32_t    stencil;
 * } VkClearDepthStencilValue;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.01 (beta) 
 */
public class VkClearDepthStencilValue extends VkStruct {

    //@formatter:off
    /*JNI
    #include <BorVulkan.hpp>
    */  

	/** TAG of this structure [95]  */
	 private static final String TAG = "VkClearDepthStencilValue";

	/** ID of this structure [95]  */
	 public static final int TAG_ID = VKCLEARDEPTHSTENCILVALUE_ID;

	/** P wrapper for THIS object */
	 private  P<VkClearDepthStencilValue> p;

	 ///////////////////
	 // Struct fields //
	 ///////////////////
	/**
	 *  float 	depth	[float]
	 */ 
	 float 	depth;

	/**
	 *  uint32_t 	stencil	[int]
	 */ 
	 int 	stencil;

	/**
	 * Ctor
	 */
	public VkClearDepthStencilValue(){ 
		 super(TAG_ID);
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkClearDepthStencilValue(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address and memSize
	 * @param address - native address 
	 * @param memSize - buffer size 
	 */
	 public VkClearDepthStencilValue(long address , int memSize){ 
		 super(address, memSize); 
	 }

	/**
	 * Ctor with Address only. Size guessed by #sizeof()
	 * @param address - native address 
	 */
	 public VkClearDepthStencilValue(long address){ 
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
	 public static P<VkClearDepthStencilValue> createNullPointer(){
	        P<VkClearDepthStencilValue> p = new  P<VkClearDepthStencilValue>(new VkClearDepthStencilValue());
	        return p;
	    }


	/** 
	 * Return this VkObject instance wrapped in pointer P<br>
	 *
	 *  P&lt;? extends VkObject &gt;
	 *
	 * @return  a P container wrapping this object.
	 */
	 public P<VkClearDepthStencilValue> getP() {
	       if(p == null ){
	           p = new P<VkClearDepthStencilValue> (this);
	       }
	        return p;
	    }


	 ////////////////////////
	 //  SETTERS & GETTERS //
	 ////////////////////////

	/**
	 * Set method for field depth	[float]<br>
	 * Prototype: float  depth
	 */ 
	 public void depth(float depth){
		 this.depth = depth;
		 setDepth0(this.ptr,  depth);
	 }

	/**
	 * Get method for field depth	[float]<br>
	 * Prototype: float  depth
	 */ 
	 public float depth(){
		 float var = getDepth0(super.ptr);
		 this.depth = var;
		 return this.depth;
	 }

	/**
	 * Set method for field stencil	[int]<br>
	 * Prototype: uint32_t  stencil
	 */ 
	 public void stencil(int stencil){
		 this.stencil = stencil;
		 setStencil0(this.ptr,  stencil);
	 }

	/**
	 * Get method for field stencil	[int]<br>
	 * Prototype: uint32_t  stencil
	 */ 
	 public int stencil(){
		 int var = getStencil0(super.ptr);
		 this.stencil = var;
		 return this.stencil;
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field depth	[float]<br>
	 * Prototype: float  depth
	 */ 
	 private static native void setDepth0(Buffer ptr, float _depth);/*
		  VkClearDepthStencilValue* vkObj = (VkClearDepthStencilValue*)(ptr);
		  vkObj->depth = (float) (_depth);
	  */

	/**
	 * native GET method for field depth	[float]<br>
	 * Prototype: float  depth
	 */ 
	 private static native float getDepth0(Buffer ptr);/*
		  VkClearDepthStencilValue* vkObj = (VkClearDepthStencilValue*)(ptr);
		  return (jfloat) (vkObj->depth);
	 */

	/**
	 * native SET method for field stencil	[int]<br>
	 * Prototype: uint32_t  stencil
	 */ 
	 private static native void setStencil0(Buffer ptr, int _stencil);/*
		  VkClearDepthStencilValue* vkObj = (VkClearDepthStencilValue*)(ptr);
		  vkObj->stencil = (uint32_t) (_stencil);
	  */

	/**
	 * native GET method for field stencil	[int]<br>
	 * Prototype: uint32_t  stencil
	 */ 
	 private static native int getStencil0(Buffer ptr);/*
		  VkClearDepthStencilValue* vkObj = (VkClearDepthStencilValue*)(ptr);
		  return (jint) (vkObj->stencil);
	 */



} // end of class VkClearDepthStencilValue
