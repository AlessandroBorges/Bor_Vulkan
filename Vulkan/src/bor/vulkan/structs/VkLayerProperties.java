/**
 * Class wrapping Vulkan's VkLayerProperties struct.
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
 *  Class for Java-Vulkan integration 
 *  This class is a Java front end for struct VkLayerProperties. 
 *  <h3>Prototype:</h3>
 * <pre>
 * typedef struct VkLayerProperties {
 *     char        layerName[VK_MAX_EXTENSION_NAME_SIZE];
 *     uint32_t    specVersion;
 *     uint32_t    implementationVersion;
 *     char        description[VK_MAX_DESCRIPTION_SIZE];
 * } VkLayerProperties;
 * </pre>
 * 
 * @author Alessandro Borges 
 * @version Ver. 0.8.01 (beta) 
 */
public class VkLayerProperties extends VkStruct {
	/** TAG of this structure [142]  */
	 private static final String TAG = "VkLayerProperties";

	/** ID of this structure [142]  */
	 public static final int TAG_ID = VKLAYERPROPERTIES_ID;

	 // fields //
	/**
	 *  char[] 	layerName		 */ 
	String 	layerName;

	/**
	 *  uint32_t 	specVersion		 */ 
	int 	specVersion;

	/**
	 *  uint32_t 	implementationVersion		 */ 
	int 	implementationVersion;

	/**
	 *  char[] 	description		 */ 
	String 	description;

	/**
	 * Ctor
	 */
	public VkLayerProperties(){ 
		 super(sizeOf()); 
	 }

	/** 
	 * Method to get native size of this structure 
	 */
	 public static int sizeOf(){ 
		 return sizeOf(TAG_ID); 
	}


	 ////////////////////////
	 //  SETTERS & GETTERS //
	 ////////////////////////

	/**
	 * Set method for field layerName	
	 * Prototype: char[]  layerName
	 */ 
	 public void layerName(String layerName){
		 this.layerName = layerName;
		layerName0(super.ptr, layerName);
	 }

	/**
	 * get method for field layerName	
	 * Prototype: char[]  layerName
	 */ 
	 public String layerName(){
		 // return  this.layerName;
		 return layerName0(super.ptr);
	 }

	/**
	 * Set method for field specVersion	
	 * Prototype: uint32_t  specVersion
	 */ 
	 public void specVersion(int specVersion){
		 this.specVersion = specVersion;
		specVersion0(super.ptr, specVersion);
	 }

	/**
	 * get method for field specVersion	
	 * Prototype: uint32_t  specVersion
	 */ 
	 public int specVersion(){
		 // return  this.specVersion;
		 return specVersion0(super.ptr);
	 }

	/**
	 * Set method for field implementationVersion	
	 * Prototype: uint32_t  implementationVersion
	 */ 
	 public void implementationVersion(int implementationVersion){
		 this.implementationVersion = implementationVersion;
		implementationVersion0(super.ptr, implementationVersion);
	 }

	/**
	 * get method for field implementationVersion	
	 * Prototype: uint32_t  implementationVersion
	 */ 
	 public int implementationVersion(){
		 // return  this.implementationVersion;
		 return implementationVersion0(super.ptr);
	 }

	/**
	 * Set method for field description	
	 * Prototype: char[]  description
	 */ 
	 public void description(String description){
		 this.description = description;
		description0(super.ptr, description);
	 }

	/**
	 * get method for field description	
	 * Prototype: char[]  description
	 */ 
	 public String description(){
		 // return  this.description;
		 return description0(super.ptr);
	 }


	 // ////////////////////////////////
	 // native SETTERS & GETTERS //
	 // ////////////////////////////////
	/**
	 * native Set method for field layerName	
	 * Prototype: char[]  layerName
	 */ 
	 private static native void layerName0(ByteBuffer ptr, String _layerName);/*
		  VkLayerProperties _obj = (VkLayerProperties)(*ptr);
		  _obj.layerName = (char[]) (_layerName);
	  */

	/**
	 * get method for field layerName	
	 * Prototype: char[]  layerName
	 */ 
	 private static native String layerName0(ByteBuffer ptr);/*
		  VkLayerProperties _obj = (VkLayerProperties)(ptr);
		  return (jstring)(env->NewStringUTF(_obj.char[]);	 */

	/**
	 * native Set method for field specVersion	
	 * Prototype: uint32_t  specVersion
	 */ 
	 private static native void specVersion0(ByteBuffer ptr, int _specVersion);/*
		  VkLayerProperties _obj = (VkLayerProperties)(*ptr);
		  _obj.specVersion = (uint32_t) (_specVersion);
	  */

	/**
	 * get method for field specVersion	
	 * Prototype: uint32_t  specVersion
	 */ 
	 private static native int specVersion0(ByteBuffer ptr);/*
		  VkLayerProperties _obj = (VkLayerProperties)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native Set method for field implementationVersion	
	 * Prototype: uint32_t  implementationVersion
	 */ 
	 private static native void implementationVersion0(ByteBuffer ptr, int _implementationVersion);/*
		  VkLayerProperties _obj = (VkLayerProperties)(*ptr);
		  _obj.implementationVersion = (uint32_t) (_implementationVersion);
	  */

	/**
	 * get method for field implementationVersion	
	 * Prototype: uint32_t  implementationVersion
	 */ 
	 private static native int implementationVersion0(ByteBuffer ptr);/*
		  VkLayerProperties _obj = (VkLayerProperties)(ptr);
		  return (jint) (_obj.uint32_t);
	 */

	/**
	 * native Set method for field description	
	 * Prototype: char[]  description
	 */ 
	 private static native void description0(ByteBuffer ptr, String _description);/*
		  VkLayerProperties _obj = (VkLayerProperties)(*ptr);
		  _obj.description = (char[]) (_description);
	  */

	/**
	 * get method for field description	
	 * Prototype: char[]  description
	 */ 
	 private static native String description0(ByteBuffer ptr);/*
		  VkLayerProperties _obj = (VkLayerProperties)(ptr);
		  return (jstring)(env->NewStringUTF(_obj.char[]);	 */



} // end of class VkLayerProperties
