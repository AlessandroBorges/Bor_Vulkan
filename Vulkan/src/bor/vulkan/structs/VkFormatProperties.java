/**
 * Class wrapping Vulkan's VkFormatProperties struct.
 * 
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
 *  Class for Java-Vulkan integration 
 *  This class is a Java front end for struct VkFormatProperties 
 *  <h3>ProtoType:</h3>
 * <pre>
 * typedef struct VkFormatProperties {
 *     VkFormatFeatureFlags    linearTilingFeatures;
 *     VkFormatFeatureFlags    optimalTilingFeatures;
 *     VkFormatFeatureFlags    bufferFeatures;
 * } VkFormatProperties;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version 0.8.01
 */
public class VkFormatProperties extends VkStruct {
	/** TAG of this structure [129]  */
	 private static final String TAG = "VkFormatProperties";

	/** ID of this structure [129]  */
	 public static final int TAG_ID = VKFORMATPROPERTIES_ID;

	 // fields //
	/**
	 *  VkFormatFeatureFlags 	linearTilingFeatures 
	 */ 
	int 	linearTilingFeatures;

	/**
	 *  VkFormatFeatureFlags 	optimalTilingFeatures 
	 */ 
	int 	optimalTilingFeatures;

	/**
	 *  VkFormatFeatureFlags 	bufferFeatures 
	 */ 
	int 	bufferFeatures;

	/**
	 * Ctor
	 */
	public VkFormatProperties(){ 
		 super(sizeOf()); 
	 }

	/** 
	 * Method to get native size of this structure 
	 */
	 public static int sizeOf(){ 
		 return sizeOf(TAG_ID); 
	}


	 // /////////////////////
	 //  SETTERS & GETTERS //
	 // /////////////////////

	/**
	 * Set method for field linearTilingFeatures
	 * Prototype: VkFormatFeatureFlags  linearTilingFeatures
	 */ 
	 public void linearTilingFeatures(int linearTilingFeatures){
		 this.linearTilingFeatures = linearTilingFeatures;
		linearTilingFeatures0(super.ptr, linearTilingFeatures);
	 }

	/**
	 * get method for field linearTilingFeatures
	 * Prototype: VkFormatFeatureFlags  linearTilingFeatures
	 */ 
	 public int linearTilingFeatures(){
		 // return  this.linearTilingFeatures;
		 return linearTilingFeatures0(super.ptr);
	 }

	/**
	 * Set method for field optimalTilingFeatures
	 * Prototype: VkFormatFeatureFlags  optimalTilingFeatures
	 */ 
	 public void optimalTilingFeatures(int optimalTilingFeatures){
		 this.optimalTilingFeatures = optimalTilingFeatures;
		optimalTilingFeatures0(super.ptr, optimalTilingFeatures);
	 }

	/**
	 * get method for field optimalTilingFeatures
	 * Prototype: VkFormatFeatureFlags  optimalTilingFeatures
	 */ 
	 public int optimalTilingFeatures(){
		 // return  this.optimalTilingFeatures;
		 return optimalTilingFeatures0(super.ptr);
	 }

	/**
	 * Set method for field bufferFeatures
	 * Prototype: VkFormatFeatureFlags  bufferFeatures
	 */ 
	 public void bufferFeatures(int bufferFeatures){
		 this.bufferFeatures = bufferFeatures;
		bufferFeatures0(super.ptr, bufferFeatures);
	 }

	/**
	 * get method for field bufferFeatures
	 * Prototype: VkFormatFeatureFlags  bufferFeatures
	 */ 
	 public int bufferFeatures(){
		 // return  this.bufferFeatures;
		 return bufferFeatures0(super.ptr);
	 }


	 // ////////////////////////////////
	 // native SETTERS & GETTERS //
	 // ////////////////////////////////
	/**
	 * native Set method for field linearTilingFeatures
	 * Prototype: VkFormatFeatureFlags  linearTilingFeatures
	 */ 
	 private static native void linearTilingFeatures0(ByteBuffer ptr, int _linearTilingFeatures);/*
		  VkFormatProperties _obj = (VkFormatProperties)(*ptr);
		  _obj.linearTilingFeatures = (VkFormatFeatureFlags) (_linearTilingFeatures);
	  */

	/**
	 * get method for field linearTilingFeatures
	 * Prototype: VkFormatFeatureFlags  linearTilingFeatures
	 */ 
	 private static native int linearTilingFeatures0(ByteBuffer ptr);/*
		  VkFormatProperties _obj = (VkFormatProperties)(ptr);
		  return (jint) (_obj.VkFormatFeatureFlags);
	 */

	/**
	 * native Set method for field optimalTilingFeatures
	 * Prototype: VkFormatFeatureFlags  optimalTilingFeatures
	 */ 
	 private static native void optimalTilingFeatures0(ByteBuffer ptr, int _optimalTilingFeatures);/*
		  VkFormatProperties _obj = (VkFormatProperties)(*ptr);
		  _obj.optimalTilingFeatures = (VkFormatFeatureFlags) (_optimalTilingFeatures);
	  */

	/**
	 * get method for field optimalTilingFeatures
	 * Prototype: VkFormatFeatureFlags  optimalTilingFeatures
	 */ 
	 private static native int optimalTilingFeatures0(ByteBuffer ptr);/*
		  VkFormatProperties _obj = (VkFormatProperties)(ptr);
		  return (jint) (_obj.VkFormatFeatureFlags);
	 */

	/**
	 * native Set method for field bufferFeatures
	 * Prototype: VkFormatFeatureFlags  bufferFeatures
	 */ 
	 private static native void bufferFeatures0(ByteBuffer ptr, int _bufferFeatures);/*
		  VkFormatProperties _obj = (VkFormatProperties)(*ptr);
		  _obj.bufferFeatures = (VkFormatFeatureFlags) (_bufferFeatures);
	  */

	/**
	 * get method for field bufferFeatures
	 * Prototype: VkFormatFeatureFlags  bufferFeatures
	 */ 
	 private static native int bufferFeatures0(ByteBuffer ptr);/*
		  VkFormatProperties _obj = (VkFormatProperties)(ptr);
		  return (jint) (_obj.VkFormatFeatureFlags);
	 */



} // end of class VkFormatProperties
