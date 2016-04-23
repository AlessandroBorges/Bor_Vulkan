/**
 * Class wrapping Vulkan's VkFormatProperties struct.
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
 *  This class is a Java front end for struct VkFormatProperties. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkFormatProperties {
 *     VkFormatFeatureFlags    linearTilingFeatures;
 *     VkFormatFeatureFlags    optimalTilingFeatures;
 *     VkFormatFeatureFlags    bufferFeatures;
 * } VkFormatProperties;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.01 (beta) 
 */
public class VkFormatProperties extends VkStruct {

    //@formatter:off
    /*JNI
    #include <BorVulkan.hpp>
    */  

	/** TAG of this structure [5]  */
	 private static final String TAG = "VkFormatProperties";

	/** ID of this structure [5]  */
	 public static final int TAG_ID = VKFORMATPROPERTIES_ID;

	/** P wrapper for THIS object */
	 private  P<VkFormatProperties> p;

	 ///////////////////
	 // Struct fields //
	 ///////////////////
	/**
	 *  VkFormatFeatureFlags 	linearTilingFeatures	[int]
	 */ 
	 int 	linearTilingFeatures;

	/**
	 *  VkFormatFeatureFlags 	optimalTilingFeatures	[int]
	 */ 
	 int 	optimalTilingFeatures;

	/**
	 *  VkFormatFeatureFlags 	bufferFeatures	[int]
	 */ 
	 int 	bufferFeatures;

	/**
	 * Ctor
	 */
	public VkFormatProperties(){ 
		 super(TAG_ID);
	 }

	/**
	 * Ctor with ByteBuffer
	 * @param nativeBuffer - Direct bytebuffer for this struct 
	 */
	public VkFormatProperties(ByteBuffer nativeBuffer){ 
		 super(nativeBuffer); 
	 }

	/**
	 * Ctor with Address and memSize
	 * @param address - native address 
	 * @param memSize - buffer size 
	 */
	 public VkFormatProperties(long address , int memSize){ 
		 super(address, memSize); 
	 }

	/**
	 * Ctor with Address only. Size guessed by #sizeof()
	 * @param address - native address 
	 */
	 public VkFormatProperties(long address){ 
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
	 public static P<VkFormatProperties> createNullPointer(){
	        P<VkFormatProperties> p = new  P<VkFormatProperties>(new VkFormatProperties());
	        return p;
	    }


	/** 
	 * Return this VkObject instance wrapped in pointer P<br>
	 *
	 *  P&lt;? extends VkObject &gt;
	 *
	 * @return  a P container wrapping this object.
	 */
	 public P<VkFormatProperties> getP() {
	       if(p == null ){
	           p = new P<VkFormatProperties> (this);
	       }
	        return p;
	    }


	 ////////////////////////
	 //  SETTERS & GETTERS //
	 ////////////////////////

	/**
	 * Set method for field linearTilingFeatures	[int]<br>
	 * Prototype: VkFormatFeatureFlags  linearTilingFeatures
	 */ 
	 public void linearTilingFeatures(int linearTilingFeatures){
		 this.linearTilingFeatures = linearTilingFeatures;
		 setLinearTilingFeatures0(this.ptr,  linearTilingFeatures);
	 }

	/**
	 * Get method for field linearTilingFeatures	[int]<br>
	 * Prototype: VkFormatFeatureFlags  linearTilingFeatures
	 */ 
	 public int linearTilingFeatures(){
		 int var = getLinearTilingFeatures0(super.ptr);
		 this.linearTilingFeatures = var;
		 return this.linearTilingFeatures;
	 }

	/**
	 * Set method for field optimalTilingFeatures	[int]<br>
	 * Prototype: VkFormatFeatureFlags  optimalTilingFeatures
	 */ 
	 public void optimalTilingFeatures(int optimalTilingFeatures){
		 this.optimalTilingFeatures = optimalTilingFeatures;
		 setOptimalTilingFeatures0(this.ptr,  optimalTilingFeatures);
	 }

	/**
	 * Get method for field optimalTilingFeatures	[int]<br>
	 * Prototype: VkFormatFeatureFlags  optimalTilingFeatures
	 */ 
	 public int optimalTilingFeatures(){
		 int var = getOptimalTilingFeatures0(super.ptr);
		 this.optimalTilingFeatures = var;
		 return this.optimalTilingFeatures;
	 }

	/**
	 * Set method for field bufferFeatures	[int]<br>
	 * Prototype: VkFormatFeatureFlags  bufferFeatures
	 */ 
	 public void bufferFeatures(int bufferFeatures){
		 this.bufferFeatures = bufferFeatures;
		 setBufferFeatures0(this.ptr,  bufferFeatures);
	 }

	/**
	 * Get method for field bufferFeatures	[int]<br>
	 * Prototype: VkFormatFeatureFlags  bufferFeatures
	 */ 
	 public int bufferFeatures(){
		 int var = getBufferFeatures0(super.ptr);
		 this.bufferFeatures = var;
		 return this.bufferFeatures;
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field linearTilingFeatures	[int]<br>
	 * Prototype: VkFormatFeatureFlags  linearTilingFeatures
	 */ 
	 private static native void setLinearTilingFeatures0(Buffer ptr, int _linearTilingFeatures);/*
		  VkFormatProperties* vkObj = (VkFormatProperties*)(ptr);
		  vkObj->linearTilingFeatures = (VkFormatFeatureFlags) (_linearTilingFeatures);
	  */

	/**
	 * native GET method for field linearTilingFeatures	[int]<br>
	 * Prototype: VkFormatFeatureFlags  linearTilingFeatures
	 */ 
	 private static native int getLinearTilingFeatures0(Buffer ptr);/*
		  VkFormatProperties* vkObj = (VkFormatProperties*)(ptr);
		  return (jint) (vkObj->linearTilingFeatures);
	 */

	/**
	 * native SET method for field optimalTilingFeatures	[int]<br>
	 * Prototype: VkFormatFeatureFlags  optimalTilingFeatures
	 */ 
	 private static native void setOptimalTilingFeatures0(Buffer ptr, int _optimalTilingFeatures);/*
		  VkFormatProperties* vkObj = (VkFormatProperties*)(ptr);
		  vkObj->optimalTilingFeatures = (VkFormatFeatureFlags) (_optimalTilingFeatures);
	  */

	/**
	 * native GET method for field optimalTilingFeatures	[int]<br>
	 * Prototype: VkFormatFeatureFlags  optimalTilingFeatures
	 */ 
	 private static native int getOptimalTilingFeatures0(Buffer ptr);/*
		  VkFormatProperties* vkObj = (VkFormatProperties*)(ptr);
		  return (jint) (vkObj->optimalTilingFeatures);
	 */

	/**
	 * native SET method for field bufferFeatures	[int]<br>
	 * Prototype: VkFormatFeatureFlags  bufferFeatures
	 */ 
	 private static native void setBufferFeatures0(Buffer ptr, int _bufferFeatures);/*
		  VkFormatProperties* vkObj = (VkFormatProperties*)(ptr);
		  vkObj->bufferFeatures = (VkFormatFeatureFlags) (_bufferFeatures);
	  */

	/**
	 * native GET method for field bufferFeatures	[int]<br>
	 * Prototype: VkFormatFeatureFlags  bufferFeatures
	 */ 
	 private static native int getBufferFeatures0(Buffer ptr);/*
		  VkFormatProperties* vkObj = (VkFormatProperties*)(ptr);
		  return (jint) (vkObj->bufferFeatures);
	 */



} // end of class VkFormatProperties
