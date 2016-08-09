/**
 * Class wrapping Vulkan's VkClearDepthStencilValue struct.
 * 
 * Bor_Vulkan Project Ver. 0.8.65 (beta)
 * Licence terms: 
 * The MIT License (MIT)
 * Copyright (c) 2016 Alessandro Borges
 * See https://opensource.org/licenses/MIT 
 */
 package bor.vulkan.structs;

 import bor.util.*;
 import bor.vulkan.*;
 import static bor.vulkan.Vulkan.*; 
 import bor.vulkan.enumerations.*;

 import java.util.*;
 import java.nio.*;


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
 * @version Ver. 0.8.65 (beta) 
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
	 * Get ID of this structure 
	 */
	 public static int getID(){ 
		 return TAG_ID; 
	}

	 ////////////////////////
	 //  SETTERS & GETTERS //
	 ////////////////////////

	/**
	 * Set method for field depth	[float]<br>
	 * Prototype: float  depth
	 * 
	 * @param depth - a instance of float.
	 * @return this VkStruct instance.
	 */ 
	 public VkClearDepthStencilValue depth(float depth){
		 this.depth = depth;
		 setDepth0(this.ptr,  depth);
		 return this;
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
	 * 
	 * @param stencil - a instance of int.
	 * @return this VkStruct instance.
	 */ 
	 public VkClearDepthStencilValue stencil(int stencil){
		 this.stencil = stencil;
		 setStencil0(this.ptr,  stencil);
		 return this;
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


   /* (non-Javadoc)
    * @see java.lang.Object#toString()
    */
    @Override
    public String toString() {
         StringBuilder builder = new StringBuilder();
         builder.append("VkClearDepthStencilValue [ ")
				.append("depth: ").append(depth() )
				.append(",\n stencil: ")
				.append(stencil() )
				.append("]");
		 return builder.toString();
    }


	 //////////////////////////////////
	 // Native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * Native SET method for field depth	[float]<br>
	 * Prototype: float  depth
	 */ 
	 private static native void setDepth0(Buffer ptr, float _depth);/*
		  VkClearDepthStencilValue* vkObj = (VkClearDepthStencilValue*)(ptr);
		  vkObj->depth = (float) (_depth);
	  */

	/**
	 * Native GET method for field depth	[float]<br>
	 * Prototype: float  depth
	 */ 
	 private static native float getDepth0(Buffer ptr);/*
		  VkClearDepthStencilValue* vkObj = (VkClearDepthStencilValue*)(ptr);
		  return (jfloat) (vkObj->depth);
	 */

	/**
	 * Native SET method for field stencil	[int]<br>
	 * Prototype: uint32_t  stencil
	 */ 
	 private static native void setStencil0(Buffer ptr, int _stencil);/*
		  VkClearDepthStencilValue* vkObj = (VkClearDepthStencilValue*)(ptr);
		  vkObj->stencil = (uint32_t) (_stencil);
	  */

	/**
	 * Native GET method for field stencil	[int]<br>
	 * Prototype: uint32_t  stencil
	 */ 
	 private static native int getStencil0(Buffer ptr);/*
		  VkClearDepthStencilValue* vkObj = (VkClearDepthStencilValue*)(ptr);
		  return (jint) (vkObj->stencil);
	 */



} // end of class VkClearDepthStencilValue
