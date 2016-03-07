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
		 super(sizeOf()); 
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
	 public VkFormatProperties(long address, int memSize){ 
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
		linearTilingFeatures0(super.ptr, linearTilingFeatures);
	 }

	/**
	 * get method for field linearTilingFeatures	[int]<br>
	 * Prototype: VkFormatFeatureFlags  linearTilingFeatures
	 */ 
	 public int linearTilingFeatures(){
		 // return  this.linearTilingFeatures;
		 return linearTilingFeatures0(super.ptr);
	 }

	/**
	 * Set method for field optimalTilingFeatures	[int]<br>
	 * Prototype: VkFormatFeatureFlags  optimalTilingFeatures
	 */ 
	 public void optimalTilingFeatures(int optimalTilingFeatures){
		 this.optimalTilingFeatures = optimalTilingFeatures;
		optimalTilingFeatures0(super.ptr, optimalTilingFeatures);
	 }

	/**
	 * get method for field optimalTilingFeatures	[int]<br>
	 * Prototype: VkFormatFeatureFlags  optimalTilingFeatures
	 */ 
	 public int optimalTilingFeatures(){
		 // return  this.optimalTilingFeatures;
		 return optimalTilingFeatures0(super.ptr);
	 }

	/**
	 * Set method for field bufferFeatures	[int]<br>
	 * Prototype: VkFormatFeatureFlags  bufferFeatures
	 */ 
	 public void bufferFeatures(int bufferFeatures){
		 this.bufferFeatures = bufferFeatures;
		bufferFeatures0(super.ptr, bufferFeatures);
	 }

	/**
	 * get method for field bufferFeatures	[int]<br>
	 * Prototype: VkFormatFeatureFlags  bufferFeatures
	 */ 
	 public int bufferFeatures(){
		 // return  this.bufferFeatures;
		 return bufferFeatures0(super.ptr);
	 }


	 //////////////////////////////////
	 // native SETTERS & GETTERS    //
	 /////////////////////////////////
	/**
	 * native SET method for field linearTilingFeatures	[int]<br>
	 * Prototype: VkFormatFeatureFlags  linearTilingFeatures
	 */ 
	 private static native void linearTilingFeatures0(ByteBuffer ptr, int _linearTilingFeatures);/*
		  VkFormatProperties _obj = (VkFormatProperties)(*ptr);
		  _obj.linearTilingFeatures = (VkFormatFeatureFlags) (_linearTilingFeatures);
	  */

	/**
	 * native GET method for field linearTilingFeatures	[int]<br>
	 * Prototype: VkFormatFeatureFlags  linearTilingFeatures
	 */ 
	 private static native int linearTilingFeatures0(ByteBuffer ptr);/*
		  VkFormatProperties _obj = (VkFormatProperties)(ptr);
		  return (jint) (_obj.VkFormatFeatureFlags);
	 */

	/**
	 * native SET method for field optimalTilingFeatures	[int]<br>
	 * Prototype: VkFormatFeatureFlags  optimalTilingFeatures
	 */ 
	 private static native void optimalTilingFeatures0(ByteBuffer ptr, int _optimalTilingFeatures);/*
		  VkFormatProperties _obj = (VkFormatProperties)(*ptr);
		  _obj.optimalTilingFeatures = (VkFormatFeatureFlags) (_optimalTilingFeatures);
	  */

	/**
	 * native GET method for field optimalTilingFeatures	[int]<br>
	 * Prototype: VkFormatFeatureFlags  optimalTilingFeatures
	 */ 
	 private static native int optimalTilingFeatures0(ByteBuffer ptr);/*
		  VkFormatProperties _obj = (VkFormatProperties)(ptr);
		  return (jint) (_obj.VkFormatFeatureFlags);
	 */

	/**
	 * native SET method for field bufferFeatures	[int]<br>
	 * Prototype: VkFormatFeatureFlags  bufferFeatures
	 */ 
	 private static native void bufferFeatures0(ByteBuffer ptr, int _bufferFeatures);/*
		  VkFormatProperties _obj = (VkFormatProperties)(*ptr);
		  _obj.bufferFeatures = (VkFormatFeatureFlags) (_bufferFeatures);
	  */

	/**
	 * native GET method for field bufferFeatures	[int]<br>
	 * Prototype: VkFormatFeatureFlags  bufferFeatures
	 */ 
	 private static native int bufferFeatures0(ByteBuffer ptr);/*
		  VkFormatProperties _obj = (VkFormatProperties)(ptr);
		  return (jint) (_obj.VkFormatFeatureFlags);
	 */



} // end of class VkFormatProperties
