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

import bor.vulkan.*;
import bor.vulkan.enumerations.*;
import bor.vulkan.structs.*;
import java.nio.ByteBuffer;


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
		 super(sizeOf()); 
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
	 public VkClearDepthStencilValue(long address, int memSize){ 
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
		depth0(super.ptr, depth);
	 }

	/**
	 * get method for field depth	[float]<br>
	 * Prototype: float  depth
	 */ 
	 public float depth(){
		 // return  this.depth;
		 return depth0(super.ptr);
	 }

	/**
	 * Set method for field stencil	[int]<br>
	 * Prototype: uint32_t  stencil
	 */ 
	 public void stencil(int stencil){
		 this.stencil = stencil;
		stencil0(super.ptr, stencil);
	 }

	/**
	 * get method for field stencil	[int]<br>
	 * Prototype: uint32_t  stencil
	 */ 
	 public int stencil(){
		 // return  this.stencil;
		 return stencil0(super.ptr);
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field depth	[float]<br>
	 * Prototype: float  depth
	 */ 
	 private static native void depth0(ByteBuffer ptr, float _depth);/*
		  VkClearDepthStencilValue _obj = (VkClearDepthStencilValue)(*ptr);
		  _obj.depth = (float) (_depth);
	  */

	/**
	 * native GET method for field depth	[float]<br>
	 * Prototype: float  depth
	 */ 
	 private static native float depth0(ByteBuffer ptr);/*
		  VkClearDepthStencilValue _obj = (VkClearDepthStencilValue)(ptr);
		  return (jfloat) (_obj.float);
	 */

	/**
	 * native SET method for field stencil	[int]<br>
	 * Prototype: uint32_t  stencil
	 */ 
	 private static native void stencil0(ByteBuffer ptr, int _stencil);/*
		  VkClearDepthStencilValue _obj = (VkClearDepthStencilValue)(*ptr);
		  _obj.stencil = (uint32_t) (_stencil);
	  */

	/**
	 * native GET method for field stencil	[int]<br>
	 * Prototype: uint32_t  stencil
	 */ 
	 private static native int stencil0(ByteBuffer ptr);/*
		  VkClearDepthStencilValue _obj = (VkClearDepthStencilValue)(ptr);
		  return (jint) (_obj.uint32_t);
	 */



} // end of class VkClearDepthStencilValue
